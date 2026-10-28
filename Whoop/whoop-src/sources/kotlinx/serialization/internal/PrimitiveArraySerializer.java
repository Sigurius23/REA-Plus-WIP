package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00028\u00022\u0006\u0010!\u001a\u00020 H$¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00102\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00028\u0001¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Element", "Array", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Builder", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lwc3/c;", "primitiveSerializer", "<init>", "(Lwc3/c;)V", "", "builderSize", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)I", "toResult", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)Ljava/lang/Object;", "size", "Ll83/a0;", "checkCapacity", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;I)V", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "insert", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;ILjava/lang/Object;)V", "builder", "()Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "empty", "()Ljava/lang/Object;", "Lzc3/b;", "decoder", "", "checkIndex", "readElement", "(Lzc3/b;ILkotlinx/serialization/internal/PrimitiveArrayBuilder;Z)V", "Lzc3/c;", "encoder", "content", "writeContent", "(Lzc3/c;Ljava/lang/Object;I)V", "Lzc3/e;", "value", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/d;", "deserialize", "(Lzc3/d;)Ljava/lang/Object;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
    private final InterfaceC39443g descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(InterfaceC37138c primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC22676k.m65750j(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new PrimitiveArrayDescriptor(primitiveSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator<Element> collectionIterator(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37137b
    public final Array deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return merge(decoder, null);
    }

    public abstract Array empty();

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    public abstract void readElement(InterfaceC40539b decoder, int index, Builder builder, boolean checkIndex);

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, Array value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        int iCollectionSize = collectionSize(value);
        InterfaceC39443g interfaceC39443g = this.descriptor;
        InterfaceC40540c interfaceC40540cBeginCollection = encoder.beginCollection(interfaceC39443g, iCollectionSize);
        writeContent(interfaceC40540cBeginCollection, value, iCollectionSize);
        interfaceC40540cBeginCollection.endStructure(interfaceC39443g);
    }

    public abstract void writeContent(InterfaceC40540c encoder, Array content, int size);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Builder builder() {
        return toBuilder(empty());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Builder builder) {
        AbstractC22676k.m65750j(builder, "<this>");
        return builder.getPosition();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(Builder builder, int i13) {
        AbstractC22676k.m65750j(builder, "<this>");
        builder.ensureCapacity$kotlinx_serialization_core(i13);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void insert(Builder builder, int i13, Element element) {
        AbstractC22676k.m65750j(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Array toResult(Builder builder) {
        AbstractC22676k.m65750j(builder, "<this>");
        return (Array) builder.build$kotlinx_serialization_core();
    }
}
