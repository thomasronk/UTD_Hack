package utdhack;

import java.util.*;
public class Algorithm {
	
	 public static void main(String[] args) {

		 ArrayList<Domain> attractionList = new ArrayList<Domain>();
		 
		 // required Sorted List
		 
		 // two solution
		 // optimal solution : dynamic programming
		 ArrayList<Domain> Test = new ArrayList<Domain>();
		 Test.add(new Domain(1,1, 2));
		 Test.add(new Domain(2,3, 2));
		 Test.add(new Domain(3,4, 1));
		 Test.add(new Domain(4,1, 7));
		 Test.add(new Domain(5,7, 1));
		 Test.add(new Domain(6,9, 9));
		 Test.add(new Domain(7,9, 9));
		 Test.add(new Domain(8,9, 9));
		 Test.add(new Domain(9,9, 9));
		 ArrayList<attractionList> Result = Run(Test,1000,1000);
		 for(int i = 0 ; i <Result.size() ; i++ )
		 {
			 for(int j = 0 ; j < Result.get(i).size() ; j ++)
				 System.out.print(Result.get(i).get(j).getId() + "  ");
			 System.out.println();
		 }
				 
		 System.out.println(Result.size() + "   " + Result.get(0).size());
		 
		 // another one is approximate solusion : FPTAS
		 
	 }
	 public static ArrayList<attractionList> Run(ArrayList<Domain> attractions, float TimeConstraint, float CostConstraint){
		 // Array of solution
		 ArrayList<attractionList> CurrentList = new ArrayList<attractionList>();
		 // previous solution
		 ArrayList<attractionList> PreviousList = new ArrayList<attractionList>();
		 // initial case:
		 
		 float TotalCost = 0;
		 float TotalTime = 0;
		 for(int i = 0 ; i < attractions.size() ; i ++)
		 {
			 TotalCost += attractions.get(i).getCost();
			 TotalTime += attractions.get(i).getTimeSpent();
			 if(attractions.get(i).getCost() <= CostConstraint  && attractions.get(i).getTimeSpent() <= TimeConstraint)
				 CurrentList.add(new attractionList( attractions.get(i)));
		 }
		 
		 
		 // input list of Item
		 for(int i  = 2 ; i <= attractions.size() ; i ++ )
		 {
			 PreviousList = CurrentList;
			 CurrentList =  new ArrayList<attractionList>(); 
			 // is mean the size of array list now.
			 for(int j = 0 ; j < PreviousList.size(); j ++)
				 for(int k = 0 ; k < attractions.size() ; k ++)
				 {
					 if(!PreviousList.get(j).isInList(attractions.get(k)))
					 {
						 if(PreviousList.get(j).canAdd(attractions.get(k), TimeConstraint, CostConstraint)&&
								 PreviousList.get(j).MaxId < attractions.get(k).getId())
						 {
							 attractionList newList = new attractionList(PreviousList.get(j));
							 newList.add(attractions.get(k));
							 CurrentList.add(newList);
							 
						 }
					 }
				 }
			 if(CurrentList.size() == 0)
				 return PreviousList;
			 else
				 PreviousList.clear();
		 }
		 return CurrentList;
		 
		 
	 }

}
