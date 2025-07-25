class MyHashSet {
    boolean data[];
    public MyHashSet() {
        data = new boolean[1000001];
        Arrays.fill(data,false);
    }
    
    public void add(int key) {
        data[key]=true;
    }
    
    public void remove(int key) {
        data[key]=false;
    }
    
    public boolean contains(int key) {
        return data[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */