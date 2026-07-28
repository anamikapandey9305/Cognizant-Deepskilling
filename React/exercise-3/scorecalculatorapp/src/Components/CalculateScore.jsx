import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const percentage = (props.total /300)*100;

  return (
    <div className="container">
      <h2>Student Details</h2>

      <p><strong>Name:</strong> {props.name}</p>
      <p><strong>School:</strong> {props.school}</p>
      <p><strong>Total Marks:</strong> {props.total}</p>

      <p><strong> Score:</strong> {percentage.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;