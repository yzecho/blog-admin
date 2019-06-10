import Vue from 'vue'
import Router from 'vue-router'
import CreateArticle from './views/CreateArticle'
import ListArticle from './views/ListArticle'
import EditArticle from './views/EdidArticle'


Vue.use(Router)

export default new Router({
  // mode: 'history',
  // base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      redirect: '/articles/index'
    },
    {
      path: '/articles/index',
      name: 'list-article',
      component: ListArticle
    },
    {
      path: '/articles/create',
      name: 'create-article',
      component: CreateArticle
    },
    {
      path: '/articles/:id/edit',
      name: 'edit-article',
      component: EditArticle
    }
  ]
})
