const path = require('path');
const CopyPlugin = require('copy-webpack-plugin');


module.exports = {
    mode: 'production',
    entry: './src/public/homepage/homepage.ts',
    devServer: {
        static: path.join(__dirname, '/src/dist'),
        port: 9000,
        hot: true
    },
    plugins: [
        new CopyPlugin({
            patterns : [{ from : 'src/public'}]
        }),
    ],
    output: {
        filename : 'app.min.js', 
        path: path.join(__dirname, '/src/dist')
    },
    resolve:{
        extensions : ['.js', '.ts']
    },
    module: {
        rules: [{
            test: /\.ts$/,
            use: 'ts-loader',
            exclude: /node_modules/
        }]
    }
}