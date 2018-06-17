<nav class="amado-nav">
	<ul>
		<c:forEach items="${categoriesPage}" var="category">
			<a href="${contextRoot}/show/category/${category.id}/products"
				class="list-group-item" id="a_${category.name}">${category.name}</a>
		</c:forEach>
	</ul>
</nav>