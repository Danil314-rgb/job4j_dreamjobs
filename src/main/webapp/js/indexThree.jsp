<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        function validate() {
            var res = true;
            if ($('#fname').val() === '' || $('#lname').val() === '' || $('#text').val() === '') {
                alert('Заполние все поля: Имя Фамилия Описание');
                res = false;
            }
            return res;
        }
    </script>
    <script>
        function addRow() {
            if (validate()) {
                const fname = $('#fname').val();
                const lname = $('#lname').val();
                const gender = $('#gender').val();
                $('#table tr:last').after(
                    '<tr><td>' + fname +
                    '</td><td>' + lname +
                    '</td><td>' + gender +
                    '</td><tr>');
            }
            return false;
        }
    </script>

</head>
<body>
<form>
    <div class="container px-4">
        <div class="form-group">
            <label>Имя</label>
            <input type="text" class="form-control" placeholder="Введите ваше имя" id="fname">
        </div>
        <div class="form-group">
            <label>Фамилия</label>
            <input type="text" class="form-control" placeholder="Введите вашу фамилию" id="lname">
        </div>
        <div class="form-group">
            <label for="gender">Пол</label>
            <select class="form-control" id="gender">
                <option>мужской</option>
                <option>женский</option>
            </select>
        </div>
        <div class="form-group">
            <label for="text">Описание:</label>
            <textarea class="form-control" id="text" rows="5"></textarea>
        </div>
        <button type="button" class="btn btn-default" onclick="addRow()">Добавить</button>
    </div>
</form>

<div class="container px-4">
    <table id='table' class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">Имя</th>
            <th scope="col">Фамилия</th>
            <th scope="col">Пол</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Том</td>
            <td>Томов</td>
            <td>мужской</td>
        </tr>
        <tr>
            <td>Таня</td>
            <td>Танева</td>
            <td>женский</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>