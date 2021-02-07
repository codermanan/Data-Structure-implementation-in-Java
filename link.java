/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author paree
 */
class node {
    int data;
    node next;

}
class linkedlist{
   node head;
   
   public void insert(int data){
       node nd = new node();
       nd.data=data;
       nd.next=null;
       
       if(head==null){
           head = nd;
       }
       else{
           node n =head;
           while(n.next!=null){
              n = n.next;
           }
           n.next = nd;
       }
   }
   public void insertstart(int data){
    node nd = new node();
    nd.data = data;
    nd.next = null;
    nd.next=head;
    head = nd;
}
   public void insertat(int index,int data){
       node nd = new node();
       nd. data = data;
       nd.next= null;
       if(index==0){
           insertstart(data);
       }
       else{
           
       
       node n =head;
       for(int i=0;i<index-1;i++){
           n=n.next;
           
       }
       nd.next= n.next;
       n.next=nd;
   }
}
   public void delAt(int index){
       if(index==0){
           head = head.next;
       }
       else{
           node n =head;
           node n1 = null;
           for(int i=0;i<index-1;i++){
               n=n.next;
               
           }
           n1=n.next;
           n.next = n1.next;
           System.out.println("delete"+n1.data);
           n1 = null;
       }
}
   public void display(){
       node nd = head;
       while(nd.next!=null){
           System.out.println(nd.data);
           nd= nd.next;
       }
       System.out.println(nd.data);
   }
}
class link{
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        list.insert(18);
        list.insert(2);
        list.insert(33);
       // list.insertstart(232);
        list.insertat(0, 222);
        list.delAt(2);
        list.display();
        
    }
}

