const productDeleteButton = document.querySelector('.delete-product button'),
	productDeleteInput = document.querySelector('.delete-product input'),
	productsList = document.querySelector('.products-list ul')
const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function() {
	if (xhr.readyState === 4 && xhr.status === 200) {
		const res = xhr.responseText
		productsList.innerHTML = res
	}
}

productDeleteButton.addEventListener('click', function() {
	deleteProducts(productDeleteInput.value)
})

function getProducts() {
	xhr.open('GET', '/api/products', true)
	xhr.send()
}
function deleteProducts(productName) {
	xhr.open('DELETE', '/products/' + productName, true)
	xhr.send()
}