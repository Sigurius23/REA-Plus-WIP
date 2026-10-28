package kotlinx.serialization.internal;

import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u0003$%&¨\u0006'"}, m65681d2 = {"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lwc3/c;", "elementSerializer", "<init>", "(Lwc3/c;)V", "", "index", "element", "Ll83/a0;", "insert", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lzc3/e;", "encoder", "value", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/b;", "decoder", "builder", "startIndex", "size", "readAll", "(Lzc3/b;Ljava/lang/Object;II)V", "", "checkIndex", "readElement", "(Lzc3/b;ILjava/lang/Object;Z)V", "Lwc3/c;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
    private final InterfaceC37138c elementSerializer;

    public /* synthetic */ CollectionLikeSerializer(InterfaceC37138c interfaceC37138c, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC37138c);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public abstract InterfaceC39443g getDescriptor();

    public abstract void insert(Builder builder, int i13, Element element);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(InterfaceC40539b decoder, Builder builder, int startIndex, int size) {
        AbstractC22676k.m65750j(decoder, "decoder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i13 = 0; i13 < size; i13++) {
            readElement(decoder, startIndex + i13, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(InterfaceC40539b decoder, int index, Builder builder, boolean checkIndex) {
        AbstractC22676k.m65750j(decoder, "decoder");
        insert(builder, index, decoder.decodeSerializableElement(getDescriptor(), index, this.elementSerializer, null));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, Collection value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        int iCollectionSize = collectionSize(value);
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginCollection = encoder.beginCollection(descriptor, iCollectionSize);
        Iterator<Element> itCollectionIterator = collectionIterator(value);
        for (int i13 = 0; i13 < iCollectionSize; i13++) {
            interfaceC40540cBeginCollection.encodeSerializableElement(getDescriptor(), i13, this.elementSerializer, itCollectionIterator.next());
        }
        interfaceC40540cBeginCollection.endStructure(descriptor);
    }

    private CollectionLikeSerializer(InterfaceC37138c interfaceC37138c) {
        super(null);
        this.elementSerializer = interfaceC37138c;
    }
}
