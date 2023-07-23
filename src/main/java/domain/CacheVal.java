package domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CacheVal<V> {
    private V value;
    int timeToLive;
}
