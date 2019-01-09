 <h1 class="my-4">Shop Name</h1>
 
 
 <!--Dynamic category  -->
  <div class="list-group">
 <c:forEach items="${categories}" var="category">
            <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.name}</a>
 </c:forEach>
            </div>
 
 
        <!--static category  -->
        <!--   <div class="list-group">
            <a href="#" class="list-group-item">Category 1</a>
            <a href="#" class="list-group-item">Category 2</a>
            <a href="#" class="list-group-item">Category 3</a>
            </div> -->