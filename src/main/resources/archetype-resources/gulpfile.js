const { src, dest, parallel } = require('gulp');
const pkg = require('./package');
function copyVueApps(){
    Object.keys(pkg.dependencies).forEach(function (dep) {
    	console.log(dep);
        src(`./node_modules/${dep}/dist/**/*`).pipe(dest("./src/main/webapp/apps/" + dep))
    });
}
exports.default = function (main){
    copyVueApps();
    main();
};
