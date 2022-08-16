<h1>jlogger</h1>
<p> JLogger is a library for print colored log's in java</p>

<h2>How to use?</h2>
<div>
  <h3>1 - Create a JLogger Object</h4>
    JLogger logger = new JLogger();
  <h3>2-Call method's</h3>
  <h4>2_1 - Success log </h4>
    logger.success("Log");
  <h4>2_2 - Error log</h4>
    logger.error("Log");
  <h4>2_3 - Message log</h4>
    logger.message("Log");
  <h4>2_4 - Warning log</h4>
    logger.warning("Log");<br>
  <h4>2_5 - Log</h4>
    logger.log("Log");<br>
  <h4>2_6 - Exception log</h4>
    logger.exception("Log");<br>
</div>

<div>
  <h2>Saving log's into a file</h2>
    <p>
      for saving log's into a file,you have to pass a file into a JLogger constructor    
    </p>
  <h5>Example</h5>
    JLogger logger = new JLogger(new File("/home/user/jlogger.log"));
</div>
