import Product from "../product/Product";


function ProductsList(props) {
  const { products } = props;

  return (
    <div className="mt-5 d-flex flex-wrap" style={{ gap: '10px' }}>
      {products.map(product => {
        return <Product product={product} />
      })}
    </div>
  )
}

export default ProductsList;