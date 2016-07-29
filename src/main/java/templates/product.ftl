----------产品详细----------
产品名称：${name}
产品价格：${price}
设计作者：<#list users as user> ${user} </#list>
------------------------------

<#assign test="Tom & Jerry">
${test?html}
${test?upper_case?html}

${tom!"tom is missed"}
<#if !jack??>jack is missed</#if>

<#assign age=23>
<#if (age>60)>老年人
<#elseif (age>40)>中年人
<#elseif (age>20)>青年人
<#else> 少年人
</#if>


<#assign level=1>
<#switch level>
<#case 1>A级<#break>
<#case 2>B级<#break>
<#case 3>C级<#break>
<#default>未知级别
</#switch>

<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as week>
${week_index + 1}.${week}<#if week_has_next>,</#if>
<#if week="星期四"><#break></#if>
</#list>

<#assign weeks>
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n>
${n}
</#list>
</#assign>
${weeks}

<#macro book>   //定义一个自定义指令
j2ee
</#macro>
<@book />    //使用刚才定义的指令

<#macro book booklist>     //定义一个自定义指令booklist是参数
<#list booklist as book>
   ${book}
</#list>
</#macro>
<@book booklist=["spring","j2ee"] />   //使用刚刚定义的指令


<#macro book>
<#nested 1>      
<#nested 2>
<#nested 3>
</#macro>
<@book ;index> ${index} .图书</@book>


<#macro repeat count>
<#list 1..count as x>     
   <#nested x, x/2, x==count>
</#list>
</#macro>

<@repeat count=4 ;c,halfc,last>
${c}. ${halfc}<#if last> Last! </#if>
</@repeat>






