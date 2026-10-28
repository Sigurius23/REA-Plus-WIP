package kotlinx.serialization.internal;

import e93.AbstractC12889b;
import i93.C18282h;
import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import yc3.AbstractC39442f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011*\u00028\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0001\u0002+,¨\u0006-"}, m65681d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "Lwc3/c;", "keySerializer", "valueSerializer", "<init>", "(Lwc3/c;Lwc3/c;)V", "", "index", "key", "value", "Ll83/a0;", "insertKeyValuePair", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lzc3/b;", "decoder", "builder", "startIndex", "size", "readAll", "(Lzc3/b;Ljava/util/Map;II)V", "", "checkIndex", "readElement", "(Lzc3/b;ILjava/util/Map;Z)V", "Lzc3/e;", "encoder", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lwc3/c;", "getKeySerializer", "()Lwc3/c;", "getValueSerializer", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final InterfaceC37138c keySerializer;
    private final InterfaceC37138c valueSerializer;

    public /* synthetic */ MapLikeSerializer(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC37138c, interfaceC37138c2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public abstract InterfaceC39443g getDescriptor();

    public final InterfaceC37138c getKeySerializer() {
        return this.keySerializer;
    }

    public final InterfaceC37138c getValueSerializer() {
        return this.valueSerializer;
    }

    public abstract void insertKeyValuePair(Builder builder, int i13, Key key, Value value);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, Collection value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        int iCollectionSize = collectionSize(value);
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginCollection = encoder.beginCollection(descriptor, iCollectionSize);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itCollectionIterator = collectionIterator(value);
        int i13 = 0;
        while (itCollectionIterator.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itCollectionIterator.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i14 = i13 + 1;
            interfaceC40540cBeginCollection.encodeSerializableElement(getDescriptor(), i13, getKeySerializer(), key);
            i13 += 2;
            interfaceC40540cBeginCollection.encodeSerializableElement(getDescriptor(), i14, getValueSerializer(), value2);
        }
        interfaceC40540cBeginCollection.endStructure(descriptor);
    }

    private MapLikeSerializer(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2) {
        super(null);
        this.keySerializer = interfaceC37138c;
        this.valueSerializer = interfaceC37138c2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(InterfaceC40539b decoder, Builder builder, int startIndex, int size) {
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(builder, "builder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, size * 2));
        int i13 = c18282hM36268d0.f71133w;
        int i14 = c18282hM36268d0.f71134x;
        int i15 = c18282hM36268d0.f71135y;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return;
        }
        while (true) {
            readElement(decoder, startIndex + i13, (Map) builder, false);
            if (i13 == i14) {
                return;
            } else {
                i13 += i15;
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(InterfaceC40539b decoder, int index, Builder builder, boolean checkIndex) {
        int iDecodeElementIndex;
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(builder, "builder");
        Object objDecodeSerializableElement = decoder.decodeSerializableElement(getDescriptor(), index, this.keySerializer, null);
        if (checkIndex) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != index + 1) {
                throw new IllegalArgumentException(AbstractC2875y.m8294g(index, iDecodeElementIndex, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iDecodeElementIndex = index + 1;
        }
        builder.put(objDecodeSerializableElement, (!builder.containsKey(objDecodeSerializableElement) || (this.valueSerializer.getDescriptor().getKind() instanceof AbstractC39442f)) ? decoder.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, this.valueSerializer, null) : decoder.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, this.valueSerializer, AbstractC25247g0.m73986U(objDecodeSerializableElement, builder)));
    }
}
