package com.xiami.linkedlist;

/**
 * Description：不按照顺序输出
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­04­15 21:44
 */
public class SingleLinkedListDemo02 {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode02 hero1 = new HeroNode02(1, "宋江", "及时雨");
        HeroNode02 hero2 = new HeroNode02(2, "卢俊义", "玉麒麟");
        HeroNode02 hero3 = new HeroNode02(3, "吴用", "智多星");
        HeroNode02 hero4 = new HeroNode02(4, "林冲", "豹子头");

        SingleLinkedList02 SingleLinkedList02=new SingleLinkedList02();
        SingleLinkedList02.add(hero1);
        SingleLinkedList02.add(hero2);
        SingleLinkedList02.add(hero3);
        SingleLinkedList02.add(hero4);
        SingleLinkedList02.list();
    }
}

class SingleLinkedList02 {
    //先初始化一个头节点, 头节点不要动, 不存放具体的数据
    private HeroNode02 head = new HeroNode02(0, "", "");


    //返回头节点
    public HeroNode02 getHead() {
        return head;
    }

    //添加节点到单向链表
    //思路，当不考虑编号顺序时
    //1. 找到当前链表的最后节点
    //2. 将最后这个节点的next 指向 新的节点
    public void add(HeroNode02 HeroNode02) {

        //因为head节点不能动，因此我们需要一个辅助遍历 temp
        HeroNode02 temp = head;
        //遍历链表，找到最后
        while(true) {
            //找到链表的最后
            if(temp.next == null) {//
                break;
            }
            //如果没有找到最后, 将将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        //将最后这个节点的next 指向 新的节点
        temp.next = HeroNode02;
    }

    //显示链表[遍历]
    public void list() {
        //判断链表是否为空
        if(head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNode02 temp = head.next;
        while(true) {
            //判断是否到链表最后
            if(temp == null) {
                break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将temp后移， 一定小心
            temp = temp.next;
        }
    }
}

//定义HeroNode02 ， 每个HeroNode02 对象就是一个节点
class HeroNode02 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode02 next; //指向下一个节点
    //构造器
    public HeroNode02(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
    //为了显示方法，我们重新toString
    @Override
    public String toString() {
        return "HeroNode02 [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
    }

}

