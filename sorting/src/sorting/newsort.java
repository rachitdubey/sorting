package sorting;

public class newsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={64,34,25,222,887};
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
        	int mini=i;
        	for(int j=0;j<n;j++){
        		if(arr[j]<arr[mini]){
        			mini=j;
        		}
        	}
        	int temp=arr[mini];
        	arr[mini]=arr[i];
        	arr[i]=temp;
        	
        }
        for(int i=0;i<n;++i){
        	System.out.println(arr[i]);
        }
	}

}
