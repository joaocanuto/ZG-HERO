"use strict";
lineReader.eachLine('file.txt', function (line) {
    console.log(line);
}, function (err) {
    if (err)
        throw err;
    console.log("I'm done!!");
});
