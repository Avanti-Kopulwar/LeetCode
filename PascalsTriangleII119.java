class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new LinkedList<>();
        pre.add(1);
        for(int i =1; i<=rowIndex; i++){
            List<Integer> sub = new LinkedList<>();
            sub.add(1);
            for(int j = 1; j<i; j++){
                int val = pre.get(j)+pre.get(j-1);
                sub.add(val);
            }
            sub.add(1);
            pre = sub;
        }
        return pre;
    }
}
