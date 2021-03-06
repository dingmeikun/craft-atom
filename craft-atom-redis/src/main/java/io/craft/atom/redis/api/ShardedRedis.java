package io.craft.atom.redis.api;

import java.util.List;

/**
 * The sharded redis client.
 * <p>
 * In <code>ShardedRedis</code>, use <tt>shardkey</tt> force certain keys to go to the same shard.<br>
 * In fact we use <tt>shardkey</tt> to select shard, so we can guarantee atomicity of command execution.
 * 
 * @author mindwind
 * @version 1.0, May 4, 2013
 */
public interface ShardedRedis extends ShardedRedisCommand {
	
	/**
	 * @return all shards
	 */
	List<Redis> shards();
	
	/**
	 * @param shardkey
	 * @return Redis instance by shardkey
	 */
	Redis shard(String shardkey);
	
	
}
