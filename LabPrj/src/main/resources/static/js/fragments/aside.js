$(function () {

    var timer;
    var delay = 250;
    var hoverLi;

    $('#aside li').hover(function () {

        smallCategory = $(this).find('.small-category');
        $(this).find('.medium-category').css("background-color", "#292929");
        $(this).find('.medium-category a').css("color", "white");

        timer = setTimeout(function () {
            smallCategory.slideDown(500);
        }, delay);

    }, function () {

        clearTimeout(timer);
        smallCategory.slideUp(500);
        $(this).find('.medium-category').css("background-color", "white");
        $(this).find('.medium-category a').css("color", "#292929");

    });

});