
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InHelloHelloManager from "./components/listers/InHelloHelloCards"
import InHelloHelloDetail from "./components/listers/InHelloHelloDetail"

import OutHelloHelloManager from "./components/listers/OutHelloHelloCards"
import OutHelloHelloDetail from "./components/listers/OutHelloHelloDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inHellos/hellos',
                name: 'InHelloHelloManager',
                component: InHelloHelloManager
            },
            {
                path: '/inHellos/hellos/:id',
                name: 'InHelloHelloDetail',
                component: InHelloHelloDetail
            },

            {
                path: '/outHellos/hellos',
                name: 'OutHelloHelloManager',
                component: OutHelloHelloManager
            },
            {
                path: '/outHellos/hellos/:id',
                name: 'OutHelloHelloDetail',
                component: OutHelloHelloDetail
            },



    ]
})
