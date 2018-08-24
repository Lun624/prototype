package xyz.masaimara.prototype.data.redis;

public interface AbstractRedisRepository {

    void addLink(String userId, String url);

    void addToken(String key, String token);
}
