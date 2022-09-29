public static void calculateDogValues(){
    List<Double> dogWeightList = new ArrayList<>();
    double max = 0, min = 0, average = 0;
       for(Pet pet: mainList){
          if (pet instanceof Dog){    
              dogWeightList.add(pet.getWeight());
          }
       }

       Collections.sort(dogWeightList);   
       min = dogWeightList.get(0);   
       max = dogWeightList.get(dogWeightList.size()-1);   
       for (double weight : dogWeightList) {   
       }
       average = average/dogWeightList.size();   

       System.out.println("Minimum weight is " + min);
       System.out.println("Maximum weight is " + max);
       System.out.println("Average weight is " + average);

    }