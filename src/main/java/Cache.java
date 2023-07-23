
public abstract class Cache<K, V> {
    /*
     * TODO: 1) implement a cache where we can choose an eviction algorithim
     *     : 2) Have a cache TTL where we can set the eviction period of the Cache Entry
     * */

    int cacheSize;
    /*
    Function to get value of a key in the Cache
     */
    public abstract V getVal(K key);

    /*
    Function to put key value into the cache
     */
    public abstract Boolean put(K key, V val);
}
