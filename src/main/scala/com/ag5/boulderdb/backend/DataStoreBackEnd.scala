package com.ag5.boulderdb.backend

import scala.collection.mutable.HashMap

/**
 * Created by Wouter on 3/3/2016.
 */


trait DataStoreBackEnd {
  type HashKey = Array[Byte]
  type Payload = Array[Byte]

  def get(key: HashKey): Option[Payload]

  def put(key: HashKey, value: Payload)
}
