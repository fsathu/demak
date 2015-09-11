/**
 * Created by fredrick on 8/20/15.
 */

function openInvoice(){

    alert("Invoice Called");
    $.ajax({
        type: "POST",
        url: "/pages/viewInvoice"

    });
}
