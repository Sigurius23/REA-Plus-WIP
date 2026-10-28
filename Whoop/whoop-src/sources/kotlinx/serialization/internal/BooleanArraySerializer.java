package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkotlinx/serialization/internal/BooleanArraySerializer;", "Lwc3/c;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/BooleanArrayBuilder;", "<init>", "()V", "", "collectionSize", "([Z)I", "toBuilder", "([Z)Lkotlinx/serialization/internal/BooleanArrayBuilder;", "empty", "()[Z", "Lzc3/b;", "decoder", "index", "builder", "checkIndex", "Ll83/a0;", "readElement", "(Lzc3/b;ILkotlinx/serialization/internal/BooleanArrayBuilder;Z)V", "Lzc3/c;", "encoder", "content", "size", "writeContent", "(Lzc3/c;[ZI)V", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder> {
    public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer();

    private BooleanArraySerializer() {
        super(BooleanSerializer.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(boolean[] zArr) {
        AbstractC22676k.m65750j(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public boolean[] empty() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public BooleanArrayBuilder toBuilder(boolean[] zArr) {
        AbstractC22676k.m65750j(zArr, "<this>");
        return new BooleanArrayBuilder(zArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(InterfaceC40540c encoder, boolean[] content, int size) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(content, "content");
        for (int i13 = 0; i13 < size; i13++) {
            encoder.encodeBooleanElement(getDescriptor(), i13, content[i13]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(InterfaceC40539b decoder, int index, BooleanArrayBuilder builder, boolean checkIndex) {
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeBooleanElement(getDescriptor(), index));
    }
}
