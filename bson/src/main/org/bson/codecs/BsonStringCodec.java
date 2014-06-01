/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson.codecs;

import org.bson.BSONReader;
import org.bson.BSONWriter;
import org.bson.types.BsonString;

/**
 * A Codec for BsonString instances.
 *
 * @since 3.0
 */
public class BsonStringCodec implements Codec<BsonString> {
    @Override
    public BsonString decode(final BSONReader reader) {
        return new BsonString(reader.readString());
    }

    @Override
    public void encode(final BSONWriter writer, final BsonString value) {
        writer.writeString(value.getValue());
    }

    @Override
    public Class<BsonString> getEncoderClass() {
        return BsonString.class;
    }
}