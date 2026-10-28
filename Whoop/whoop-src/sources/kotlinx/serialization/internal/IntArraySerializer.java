package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkotlinx/serialization/internal/IntArraySerializer;", "Lwc3/c;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/IntArrayBuilder;", "<init>", "()V", "collectionSize", "([I)I", "toBuilder", "([I)Lkotlinx/serialization/internal/IntArrayBuilder;", "empty", "()[I", "Lzc3/b;", "decoder", "index", "builder", "", "checkIndex", "Ll83/a0;", "readElement", "(Lzc3/b;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V", "Lzc3/c;", "encoder", "content", "size", "writeContent", "(Lzc3/c;[II)V", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class IntArraySerializer extends PrimitiveArraySerializer<Integer, int[], IntArrayBuilder> {
    public static final IntArraySerializer INSTANCE = new IntArraySerializer();

    private IntArraySerializer() {
        super(IntSerializer.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<this>");
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public int[] empty() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public IntArrayBuilder toBuilder(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<this>");
        return new IntArrayBuilder(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(InterfaceC40540c encoder, int[] content, int size) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(content, "content");
        for (int i13 = 0; i13 < size; i13++) {
            encoder.encodeIntElement(getDescriptor(), i13, content[i13]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(InterfaceC40539b decoder, int index, IntArrayBuilder builder, boolean checkIndex) {
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeIntElement(getDescriptor(), index));
    }
}
