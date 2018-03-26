const add = document.getElementById('add');
const buttons = document.querySelectorAll('button');

buttons.forEach(function (button) {
	button.addEventListener('click', function (event) {
	const p = document.createElement("p");
	
	//const value = event.target.innerText;
	//console.log(value)
	
	const text = document.createTextNode("Item Added To Cart");
	p.appendChild(text);
	add.appendChild(p);
})
}); //thank you David.