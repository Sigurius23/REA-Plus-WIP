package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lwc3/c;", "keySerializer", "valueSerializer", "<init>", "(Lwc3/c;Lwc3/c;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lzc3/e;", "encoder", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/lang/Object;", "Lwc3/c;", "getKeySerializer", "()Lwc3/c;", "getValueSerializer", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class KeyValueSerializer<K, V, R> implements InterfaceC37138c {
    private final InterfaceC37138c keySerializer;
    private final InterfaceC37138c valueSerializer;

    public /* synthetic */ KeyValueSerializer(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC37138c, interfaceC37138c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wc3.InterfaceC37137b
    public R deserialize(InterfaceC40541d decoder) {
        R r10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            r10 = (R) toResult(interfaceC40539bBeginStructure.decodeSerializableElement(getDescriptor(), 0, getKeySerializer(), null), interfaceC40539bBeginStructure.decodeSerializableElement(getDescriptor(), 1, getValueSerializer(), null));
        } else {
            Object objDecodeSerializableElement = TuplesKt.NULL;
            Object objDecodeSerializableElement2 = TuplesKt.NULL;
            while (true) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement == TuplesKt.NULL) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement2 == TuplesKt.NULL) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r10 = (R) toResult(objDecodeSerializableElement, objDecodeSerializableElement2);
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(getDescriptor(), 0, getKeySerializer(), null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationException(AbstractC2875y.m8295h(iDecodeElementIndex, "Invalid index: "));
                    }
                    objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(getDescriptor(), 1, getValueSerializer(), null);
                }
            }
        }
        interfaceC40539bBeginStructure.endStructure(descriptor);
        return r10;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public abstract /* synthetic */ InterfaceC39443g getDescriptor();

    public abstract K getKey(R r10);

    public final InterfaceC37138c getKeySerializer() {
        return this.keySerializer;
    }

    public abstract V getValue(R r10);

    public final InterfaceC37138c getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, R value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(value));
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(value));
        interfaceC40540cBeginStructure.endStructure(getDescriptor());
    }

    public abstract R toResult(K key, V value);

    private KeyValueSerializer(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2) {
        this.keySerializer = interfaceC37138c;
        this.valueSerializer = interfaceC37138c2;
    }
}
