package xyz.masaimara.prototype.data.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepository implements AbstractRedisRepository {

    @Autowired
    private RedisTemplates redisTemplates;

    public void addLink(String userId, String url) {
        redisTemplates.getStringRedisTemplate().opsForList().leftPush(userId, url);
    }

    public void addToken(String key, String token) {
        redisTemplates.getStringRedisTemplate().opsForList().leftPush(key, token);
    }

//    public void test(String key, String value) {
//        redisTemplates.getRedisTemplate().execute(new RedisCallback() {
//            @Override
//            public Object doInRedis(RedisConnection connection) throws org.springframework.dao.DataAccessException {
//                Long size = connection.dbSize();
//                return ((StringRedisConnection) connection).set("key", "value");
//            }
//        });
//    }

    /**
     * Hash Mappers
     * Hash mappers are converters of map objects to a Map<K, V> and back. HashMapper is intended for using with Redis Hashes.
     * <p>
     * Multiple implementations are available:
     * <p>
     * BeanUtilsHashMapper using Spring’s BeanUtils.
     * <p>
     * ObjectHashMapper using Object-to-Hash Mapping.
     * <p>
     * Jackson2HashMapper using FasterXML Jackson.
     */
//    @Autowired
//    HashOperations<String, byte[], byte[]> hashOperations;

//    @Autowired
//    HashOperations<String,String,Object> stringHashOperations;

//    HashMapper<Object, byte[], byte[]> mapper = new ObjectHashMapper();
//    Jackson2HashMapper jackson2HashMapper=new Jackson2HashMapper(false);

//    public void writeHash(String key, Person person) {
//        Map<byte[], byte[]> mappedHash = mapper.toHash(person);
//        hashOperations.putAll(key, mappedHash);
//    }

//    public Person loadHash(String key) {
//        Map<byte[], byte[]> loadedHash = hashOperations.entries(key);
//        return (Person) mapper.fromHash(loadedHash);
//    }

//    public void wirteJack(String key,Person person){
//        Map<String,Object> mappedHash=jackson2HashMapper.toHash(person);
//        stringHashOperations.putAll(key,mappedHash);
//    }

//    public Person readJack(String key){
//        Map<String,Object> loadedHash=jackson2HashMapper.toHash(key);
//        return (Person) jackson2HashMapper.fromHash(loadedHash);
//    }

//    5.10. Redis Transactions
    //execute a transaction
//    List<Object> txResults = redisTemplate.execute(new SessionCallback<List<Object>>() {
//        public List<Object> execute(RedisOperations operations) throws DataAccessException {
//            operations.multi();
//            operations.opsForSet().add("key", "value1");
//
//            // This will contain the results of all operations in the transaction
//            return operations.exec();
//        }
//    });

//5.11. Pipelining
//    //pop a specified number of items from a queue
//    List<Object> results = stringRedisTemplate.executePipelined(
//            new RedisCallback<Object>() {
//                public Object doInRedis(RedisConnection connection) throws DataAccessException {
//                    StringRedisConnection stringRedisConn = (StringRedisConnection)connection;
//                    for(int i=0; i< batchSize; i++) {
//                        stringRedisConn.rPop("myqueue");
//                    }
//                    return null;
//                }
//            });

//    @Bean
//    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
//        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
//                .entryTtl(Duration.ofHours(1))
//                .disableCachingNullValues();
//        return RedisCacheManager.builder(connectionFactory)
//                .cacheDefaults(config)
//                .initialCacheConfigurations(singletonMap("predefined", defaultCacheConfig().disableCachingNullValues()))
//                .transactionAware()
//                .build();
//    }
}
