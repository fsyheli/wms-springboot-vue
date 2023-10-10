const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
  devServer: {
    port: 8181,
    proxy: {
      '^/api': {
        target: 'http://localhost:8989/',
        pathRewrite: {'^/api': ''}
      }
    }
  }
};