function prepareUserForm(flag,id,el){
    clearForm();
    if(flag=='new'){
        $("#myModalLabel").text("Add New User");
        $("#user_password").text("Password");
    }else if(flag=='profile'){
        setFormData(getProfile(el));
        $("#userForm").append("<input type='hidden' name='id' value='"+id+"' />");
        $("#myModalLabel").text("Edit Your Profile");
        $("#user_password").text("Change Password");
    }else if(flag=='edit'){
        setFormData(getUserEdit(el));
        $("#userForm").append("<input type='hidden' name='id' value='"+id+"' />");
        $("#myModalLabel").text("Edit User");
        $("#user_password").text("Change Password");
    }
}

function clearForm(){
    $("input[type=hidden]").remove();
    $("input[type=text]").val("");
    $("input[type=radio]").removeProp("checked");

}

function getProfile(el){
    var e = $(el).next("table");
    var data=new Object();
    data.name= e.find("tr:eq(0)").find("td:eq(2)").text();
    data.address=e.find("tr:eq(1)").find("td:eq(2)").text();
    data.email=e.find("tr:eq(2)").find("td:eq(2)").text();
    data.phone=e.find("tr:eq(3)").find("td:eq(2)").text();
    data.type=e.find("tr:eq(4)").find("td:eq(2)").text();
    data.username=e.find("tr:eq(5)").find("td:eq(2)").text();
    return data;
}
function getUserEdit(el){
    var e = $(el).parent().parent();
    var data=new Object();
    data.name= e.find("td:eq(0)").text();
    data.address=e.find("td:eq(1)").text();
    data.email=e.find("td:eq(2)").text();
    data.phone=e.find("td:eq(3)").text();
    data.type=e.find("td:eq(4)").text();
    data.username=e.find("td:eq(5)").text();
    return data;

}
function setFormData(data){
    $("#name").val(data['name']);
    $("#address").val(data['address']);
    $("#email").val(data['email']);
    $("#phone").val(data['phone']);
    if(data['type'].trim()=="ADMIN"){
        $("#user_admin").attr("checked", "checked");
    }else if(data['type'].trim()=="NORMAL"){
        $("#user_normal").attr("checked", "checked");
    }
    $("#username").val(data['username']);
}
function adminTab(tab){
    if(tab!="profile" && !checkNull(tab)){
        $("#tab-"+tab).tab("show");
    }
}

function checkNull(st){
    return st=="" || st == null || st == "undefined";
}

function prepareItemForm(flag,id,el){
    clearForm();
    if(flag=='new'){
        $("#myModalLabel").text("Add New Item");
    }else if(flag=='edit'){
        setFormData(getUserEdit(el));
        $("#userForm").append("<input type='hidden' name='id' value='"+id+"' />");
        $("#myModalLabel").text("Edit User");
    }
}