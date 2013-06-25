<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <form method="post" action="/item/save" id="itemForm">
        <div class="modal-header">
            <a href="javascript:void(0)" class="icon-remove pull-right" data-dismiss="modal" aria-hidden="true"></a>
            <h3 id="myModalLabel">test header</h3>
        </div>
        <div class="modal-body">
            <p>
            <div class="span9">
                <div class="hero-unit">
                    <table class="table table-striped" id="userForm">
                        <tr>
                            <td><label for="name">Name</label></td>
                            <td>:</td>
                            <td><input type="text" name="name" id="name" required /> </td>
                        </tr>
                        <tr>
                            <td><label>Category</label></td>
                            <td>:</td>
                            <td>
                                <p>
                                    <label class="pull-left" for="item-category-cattle">CATTLE&nbsp;<input type="radio" name="category" value="CATTLE" id="item-category-cattle" required />&nbsp;&nbsp;&nbsp;</label>
                                    <label class="pull-left" for="item-category-vegetables">VEGETABLES&nbsp;<input type="radio" name="category" value="VEGETABLES" id="item-category-vegetables" required />&nbsp;&nbsp;&nbsp;</label>
                                    <label class="pull-left" for="item-category-land">LAND&nbsp;<input type="radio" name="category" value="LAND" id="item-category-land" required /></label>
                                </p>
                            </td>
                        </tr>
                        <tr>
                            <td><label for="price">Price</label></td>
                            <td>:</td>
                            <td><input type="number" name="price" id="price" required /></td>
                        </tr>
                        <tr>
                            <td><label>Status</label></td>
                            <td>:</td>
                            <td>
                                <p>
                                    <label class="pull-left" for="status_active">ACTIVE &nbsp;<input type="radio" name="status" value="ACTIVE" id="status_active" required/>&nbsp;&nbsp;&nbsp;&nbsp;</label>
                                    <label class="pull-left" for="status_deactive">DEACTIVE &nbsp;<input type="radio" name="status" value="DEACTIVE" id="status_deactive" required /></label>
                                </p>
                            </td>
                        </tr>
                        <tr>
                            <td><label for="contactPerson">Contact Person</label></td>
                            <td>:</td>
                            <td><input type="text" name="contactPerson" id="contactPerson" required /></td>
                        </tr>
                        <tr>
                            <td><label for="contactPhone">Contact Phone</label></td>
                            <td>:</td>
                            <td><input type="number" name="contactPhone" id="contactPhone" required /></td>
                        </tr>
                        <tr>
                            <td><label for="details">Details</label></td>
                            <td>:</td>
                            <td><textarea name="details" id="details" rows="5" maxlength="150"></textarea></td>
                        </tr>
                    </table>
                </div>
            </div>
            </p>
        </div>
        <div class="modal-footer">
            <input type="reset" class="btn" data-dismiss="modal" aria-hidden="true" value="Close" />
            <input type="submit" class="btn btn-primary" value="Save changes" />
        </div>
    </form>
</div>
