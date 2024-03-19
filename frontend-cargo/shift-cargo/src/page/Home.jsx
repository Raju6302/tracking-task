import React, { useState } from "react";
import axios from "axios";
import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import Box from "@mui/material/Box";

const Home = () => {
  const [trackingNumber, setTrackingNumber] = useState("");
  const [trackData, setTrackData] = useState([]);
  const [error, setError] = useState(null);

  const handleChange = (event) => {
    setTrackingNumber(event.target.value);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.get(
        `http://localhost:8080/api/track/${trackingNumber}`
      );
      setTrackData(response.data);
      setError(null);
    } catch (error) {
      console.error("Error fetching data:", error);
      setError("Error fetching data. Please try again.");
    }
  };

  return (
    <Box
      display="flex"
      justifyContent="center"
      alignItems="center"
      height="100vh"
    >
      <Box width="300px" textAlign="center">
        <h1>Tracking-Details</h1>
        <form onSubmit={handleSubmit} style={{ marginBottom: "20px" }}>
          <TextField
            label="Tracking Number"
            variant="outlined"
            value={trackingNumber}
            onChange={handleChange}
            fullWidth
            style={{ marginBottom: "10px" }}
          />
          <Button variant="contained" type="submit" color="primary" fullWidth>
            Submit
          </Button>
        </form>
        {error && <Typography color="error">{error}</Typography>}
        {trackData.length > 0 && (
  <div>
    {trackData.map((details, index) => (
      <div key={index}>
        <Typography>
          <b>Tracking Number:</b> {details.trackingNumber}
        </Typography>
        <Typography>
          <b>From City:</b> {details.fromCity}
        </Typography>
        <Typography>
          <b>To City:</b> {details.toCity}
        </Typography>
        <Typography>
          <b>Number of Items:</b> {details.numberOfItems}
        </Typography>
        <Typography>
          <b>Actual Weight:</b> {details.actualWeight}
        </Typography><br />
        <Typography variant="h6"> 
          <b><u>Tracking Details:</u></b>
        </Typography>
        <Typography>
          <b>Date and Time:</b> {details.dateTime}
        </Typography>
        <Typography>
          <b>Status:</b> {details.status}
        </Typography>
        <Typography>
          <b>Remarks:</b> {details.remarks}
        </Typography> <br />
        <Typography>
          <b>In-Transit Date and Time:</b> {details.in_transit_datetime}
        </Typography>
        <Typography>
          <b>In-Transit Status:</b> {details.in_transit_status}
        </Typography>
        <Typography>
          <b>In-Transit Remarks:</b> {details.in_transit_remarks}
        </Typography> <br />
        <Typography>
          <b>Delivered Date and Time:</b> {details.delivered_datetime}
        </Typography>
        <Typography>
          <b>Delivered Status:</b> {details.delivered_status}
        </Typography>
        <Typography>
          <b>Delivered Remarks:</b> {details.delivered_remarks}
        </Typography>
      </div>
    ))}
  </div>
)}
      </Box>
    </Box>
  );
};

export default Home;
