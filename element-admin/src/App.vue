<template>
  <el-container style="height: 100vh; border: 1px solid #eee">
  <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
    <el-menu router :default-openeds="['1']">
      <el-submenu index="1">
        <template slot="title"><i class="el-icon-tickets"></i>内容管理</template>
          <el-menu-item index="/articles/index">文章列表</el-menu-item>
          <el-menu-item index="/articles/create">新建文章</el-menu-item>
      </el-submenu>
    </el-menu>
  </el-aside>

  <el-container>
    <el-header style="text-align: right; font-size: 12px">
        <i class="el-icon-user-solid" style="margin-right: 15px"></i>
      <span>Yzecho</span>
    </el-header>

    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</el-container>
</template>


<style>
  body,html {
    margin: 0;
    padding: 0;
  }
  .el-header {
    background-color: rgb(128, 175, 236);
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: rgb(128, 175, 236);
  }
</style>
