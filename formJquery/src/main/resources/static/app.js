$(document).ready(function () {
    $.ajax({
        xhrFields: {withCredentials: false},
        //  problem with CROS
        url: "json.txt",
        headers: {"Access-Control-Allow-Origin": '*',
        "Access-Control-Allow-Methods": "GET, PUT, POST, DELETE, HEAD, OPTIONS"
       }
    }).then(function (rawData) {
        const data = JSON.parse(rawData).data;
        var form = $(`<form id="myForm" method="post"/>`);
        form.submit(onSubmit)
        var fieldSet = $(`<fieldset id="${data.name}"><legend>${data.header}</legend></fieldset>`);

        for (var i = 0; i < data.fields.length; i++) {
            var field = data.fields[i];

            var control;
            if (field.type === "sep") {
                var sep = $("<hr/>");
                fieldSet.append(sep);
                continue;
            }
            else if (field.type === "mselect" || field.type === "sselect") {
                control = (field.type === "mselect") ? $(`<select id="${field.name}" name="${field.name}" multiple>`) : $(`<select name="${field.name}"></select>`);

                for (var j = 0; j < field.options.length; j++) {
                    control.append($(`<option value="${field.options[j].name}" title="${field.instruction}">${field.options[j].name}</option>`));
                }
            }
            else if (field.type === "text") {
                control = $(`<input id="${field.name}" name="${field.name}"
                            title="${field.instruction !== null ? field.instruction : ""}"/>`);

                if (field.valueType === "mm/dd/yyyy") {
                    control.attr("type", "date");
                }
                else if (field.valueType === "hh:mm") {
                    control.attr("type", "time")
                }

                else {
                    control.attr("type", "text")
                }

                if (field.maxLength !== undefined)
                    control.attr("maxlength", field.maxLength);
            }
            else if (field.type === "textarea") {
                control = $(`<textarea id="${field.name}" name="${field.name}"
                           title="${field.instruction !== null ? field.instruction : ""}"/>`);
            }
            else if (field.type === "check") {
                control = $(`<input class="form-check-input" type="checkbox" value="">`);
            }

            if (field.required !== 0)
                control.attr("required", 1);

            control.addClass('form-control');

            const label = $(`<label for="${field.name}">${field.label} </label>`);
            const divFormGroup = $(`<div class="form-group">`);
            divFormGroup.append(label);
            divFormGroup.append(control);
            if (field.instruction!==null){
                const tip=$(`<small id="${field.name}" class="form-text text-muted">${field.instruction}</small>`);
                divFormGroup.append(tip);
            }
            fieldSet.append(divFormGroup);
        }
        var submit = $(`<input type="submit" value="Submit">`);
        fieldSet.append(submit);
        form.append(fieldSet);
        $("#formContent").append(form);
    });
});

function onSubmit(e) {
    e.preventDefault();
    e.stopPropagation();
    const values = $("#myForm").serializeArray();
    $.ajax(
        "https://web.testmatter.info/dm/rest/public/forms/909090/results",
        {
            method: "POST",
            data: values
        }
    ).then(results => {
        $("#resultContent").text(results.data)
    });
}

// 20171006115811
// https://web.testmatter.info/dm/rest/public/forms/909090
