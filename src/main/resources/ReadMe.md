graphiql default endpoint : http://localhost:8080/graphiql
graphql server default endpoint : http://localhost:8080/graphql

Get all types:

{
  __schema {
    types {
      name
    }
  }
}

Get fields of a type
{
  __type(name: "Query") {
    name
    fields {
      name
  }
}
}

Query 
query {
  employees {
    personalDetails {
      fName
      lName
      email
    }
    department {
      manager
    }
  }
  employee(id: 1) {
      personalDetails {
      fName
      lName
      email
    }
    department {
      manager
    }
  }
}