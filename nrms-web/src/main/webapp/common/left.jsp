<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>

<div class="sidebar">
	<nav class="sidenav">
		<ul class="nav_ul" id="accordion">
			<li><a class="no_link sidebtn" href="javascript:void(0);"> <span
					class="icon-menu"></span>
			</a></li> 
			<li><a class="bor-left-nav-btm" href="${basePath }"
				data-toggle="tooltip" data-container="#tooltip_box"
				data-placement="right" title="首页">
					<div class="up-pull-left">
						<span class="icon-shouye"></span> 首页
					</div>
			</a></li> 
			<li><a class="bor-left-nav-btm" href="#collapse_form"
				data-toggle="collapse" aria-expanded="false">
					<div class="up-pull-left">
						<span class="icon-th-large" data-toggle="tooltip"
							data-container="#tooltip_box" data-placement="right" title="系统管理"></span>
						系统管理
					</div>
					<div class="up-pull-right">
						<span class="icon-down-open"></span>
					</div>
			</a>
			<li><a class="bor-left-nav-btm" href="#collapse_table"
				data-toggle="collapse" aria-expanded="false">
					<div class="up-pull-left">
						<span class="icon-th-large" data-toggle="tooltip"
							data-container="#tooltip_box" data-placement="right"
							title="虚拟机申请"></span> 虚拟机申请
					</div>
					<div class="up-pull-right">
						<span class="icon-down-open"></span>
					</div>
				</a>
			</li>
		</ul>
	</nav>
</div>