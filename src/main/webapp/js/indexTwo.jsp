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
            var value1 = $('#fname').val();
            var value2 = $('#lname').val()
            if (value1 !== '' && value2 !== '') {
                alert(value1);
                alert(value2);
            } else {
                alert('Заполние оба поля: Имя и Фамилия');
            }
            return false;
        }
    </script>
</head>
<body>

<div class="container-fluid">
    <div class="card-body">
        <form>
            <div class="form-group">
                <label>Имя</label>
                <input type="text" class="form-control" placeholder="Введите ваше имя" id="fname">
            </div>
            <div class="form-group">
                <label>Фамилия</label>
                <input type="text" class="form-control" placeholder="Введите вашу фамилию" id="lname">
            </div>
            <div class="form-check form-check-inline">
                <label>Пол:</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1"
                       value="option1">
                <label class="form-check-label" for="inlineRadio1">мужской</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2"
                       value="option2">
                <label class="form-check-label" for="inlineRadio2">женский</label>
            </div>
            <div class="form-group">
                <label for="exampleFormControlTextarea1">Описание:</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="7"></textarea>
            </div>
            <button type="button" class="btn btn-default" onclick="return validate();">Submit</button>
        </form>
    </div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Имя</th>
            <th scope="col">Фамилия</th>
            <th scope="col">Пол</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>Том</td>
            <td>Томов</td>
            <td>мужской</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>Таня</td>
            <td>Танева</td>
            <td>женский</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>Боб</td>
            <td>Бобов</td>
            <td>мужской</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>