function solution(n, lost, reserve) {
   
    let answer = 0;
    let gymClothes = [];
    
    if(n >= 2 && n <=30){
        for(let i = 0; i < n; i++){
            gymClothes[i] = 1;
        }
        lost.forEach(function(e){
            gymClothes[e-1] = 0;
        });
        
        reserve.forEach(function(e){
            gymClothes[e-1] += 1;
        });
        
        for(let i = 0; i < n; i++){
            if(gymClothes[i] == 0 && gymClothes[i-1] == 2){ // 앞번호 빌리기
                gymClothes[i-1] = 1; 
                gymClothes[i] = 1;
            }
            if(gymClothes[i] == 0 && gymClothes[i+1] == 2){ // 뒷번호 빌리기
                gymClothes[i] = 1;
                gymClothes[i+1] = 1;
            }
        }
        gymClothes.forEach(function(e){
            if(e > 0){
              answer++;   
            }
        });
    }
    
    return answer;
}