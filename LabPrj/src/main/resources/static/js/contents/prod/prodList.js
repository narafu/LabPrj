
addEventListener("load", function () {

	var itemName = document.querySelectorAll("#list-item-name");

	for (var i = 0; i < itemName.length; i++) {

		if (itemName[i].innerText.includes("(")) {
			var index = itemName[i].innerText.indexOf("(");
			itemName[i].innerText = itemName[i].innerText.substring(0, index);
		}

		if (itemName[i].innerText.includes(" ")) {
			var temp = itemName[i].innerText.split(" ");
			itemName[i].innerHTML = `${temp[0]}<br/>${temp[1]}`;
		}
	}

})