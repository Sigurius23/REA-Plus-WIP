package kotlinx.serialization.internal;

import l83.C23474t;
import l83.C23475u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lkotlinx/serialization/internal/UIntArraySerializer;", "Lwc3/c;", "Ll83/u;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Ll83/t;", "Lkotlinx/serialization/internal/UIntArrayBuilder;", "<init>", "()V", "", "collectionSize--ajY-9A", "([I)I", "collectionSize", "toBuilder--ajY-9A", "([I)Lkotlinx/serialization/internal/UIntArrayBuilder;", "toBuilder", "empty--hP7Qyg", "()[I", "empty", "Lzc3/b;", "decoder", "index", "builder", "", "checkIndex", "Ll83/a0;", "readElement", "(Lzc3/b;ILkotlinx/serialization/internal/UIntArrayBuilder;Z)V", "Lzc3/c;", "encoder", "content", "size", "writeContent-CPlH8fI", "(Lzc3/c;[II)V", "writeContent", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UIntArraySerializer extends PrimitiveArraySerializer<C23474t, C23475u, UIntArrayBuilder> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(UIntSerializer.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m134425collectionSizeajY9A(((C23475u) obj).f92953w);
    }

    /* JADX INFO: renamed from: collectionSize--ajY-9A, reason: not valid java name */
    public int m134425collectionSizeajY9A(int[] collectionSize) {
        AbstractC22676k.m65750j(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ C23475u empty() {
        return new C23475u(m134426emptyhP7Qyg());
    }

    /* JADX INFO: renamed from: empty--hP7Qyg, reason: not valid java name */
    public int[] m134426emptyhP7Qyg() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m134427toBuilderajY9A(((C23475u) obj).f92953w);
    }

    /* JADX INFO: renamed from: toBuilder--ajY-9A, reason: not valid java name */
    public UIntArrayBuilder m134427toBuilderajY9A(int[] toBuilder) {
        AbstractC22676k.m65750j(toBuilder, "$this$toBuilder");
        return new UIntArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(InterfaceC40540c interfaceC40540c, C23475u c23475u, int i13) {
        m134428writeContentCPlH8fI(interfaceC40540c, c23475u.f92953w, i13);
    }

    /* JADX INFO: renamed from: writeContent-CPlH8fI, reason: not valid java name */
    public void m134428writeContentCPlH8fI(InterfaceC40540c encoder, int[] content, int size) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(content, "content");
        for (int i13 = 0; i13 < size; i13++) {
            encoder.encodeInlineElement(getDescriptor(), i13).encodeInt(content[i13]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(InterfaceC40539b decoder, int index, UIntArrayBuilder builder, boolean checkIndex) {
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(builder, "builder");
        builder.m134423appendWZ4Q5Ns$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeInt());
    }
}
