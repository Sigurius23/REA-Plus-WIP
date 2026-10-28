package kotlinx.serialization.internal;

import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\t\u001a\u00028\u0002H$¢\u0006\u0004\b\t\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00028\u0002H$¢\u0006\u0004\b\u0013\u0010\u000eJ\u0013\u0010\u0014\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\nH$¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0001H&¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010(\u001a\u00020'H$¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH$¢\u0006\u0004\b,\u0010-\u0082\u0001\u0002./¨\u00060"}, m65681d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lwc3/c;", "<init>", "()V", "Lzc3/b;", "decoder", "builder", "", "readSize", "(Lzc3/b;Ljava/lang/Object;)I", "collectionSize", "(Ljava/lang/Object;)I", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", "size", "Ll83/a0;", "checkCapacity", "(Ljava/lang/Object;I)V", "Lzc3/e;", "encoder", "value", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/d;", "previous", "merge", "(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lzc3/d;)Ljava/lang/Object;", "index", "", "checkIndex", "readElement", "(Lzc3/b;ILjava/lang/Object;Z)V", "startIndex", "readAll", "(Lzc3/b;Ljava/lang/Object;II)V", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements InterfaceC37138c {
    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, InterfaceC40539b interfaceC40539b, int i13, Object obj, boolean z4, int i14, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i14 & 8) != 0) {
            z4 = true;
        }
        abstractCollectionSerializer.readElement(interfaceC40539b, i13, obj, z4);
    }

    private final int readSize(InterfaceC40539b decoder, Builder builder) {
        int iDecodeCollectionSize = decoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i13);

    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    @Override // wc3.InterfaceC37137b
    public Collection deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return merge(decoder, null);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public abstract /* synthetic */ InterfaceC39443g getDescriptor();

    public final Collection merge(InterfaceC40541d decoder, Collection previous) {
        Builder builder;
        AbstractC22676k.m65750j(decoder, "decoder");
        if (previous == null || (builder = toBuilder(previous)) == null) {
            builder = builder();
        }
        Builder builder2 = builder;
        int iBuilderSize = builderSize(builder2);
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(getDescriptor());
        if (!interfaceC40539bBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, interfaceC40539bBeginStructure, iBuilderSize + iDecodeElementIndex, builder2, false, 8, null);
            }
        } else {
            readAll(interfaceC40539bBeginStructure, builder2, iBuilderSize, readSize(interfaceC40539bBeginStructure, builder2));
        }
        interfaceC40539bBeginStructure.endStructure(getDescriptor());
        return toResult(builder2);
    }

    public abstract void readAll(InterfaceC40539b decoder, Builder builder, int startIndex, int size);

    public abstract void readElement(InterfaceC40539b decoder, int index, Builder builder, boolean checkIndex);

    @Override // wc3.InterfaceC37145j
    public abstract void serialize(InterfaceC40542e encoder, Collection value);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);

    private AbstractCollectionSerializer() {
    }
}
