package kotlinx.serialization.internal;

import l83.C23472r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkotlinx/serialization/internal/UByteSerializer;", "Lwc3/c;", "Ll83/r;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize-EK-6454", "(Lzc3/e;B)V", "serialize", "Lzc3/d;", "decoder", "deserialize-Wa3L5BU", "(Lzc3/d;)B", "deserialize", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UByteSerializer implements InterfaceC37138c {
    public static final UByteSerializer INSTANCE = new UByteSerializer();
    private static final InterfaceC39443g descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UByte", ByteSerializer.INSTANCE);

    private UByteSerializer() {
    }

    @Override // wc3.InterfaceC37137b
    public /* synthetic */ Object deserialize(InterfaceC40541d interfaceC40541d) {
        return new C23472r(m134421deserializeWa3L5BU(interfaceC40541d));
    }

    /* JADX INFO: renamed from: deserialize-Wa3L5BU, reason: not valid java name */
    public byte m134421deserializeWa3L5BU(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return decoder.decodeInline(getDescriptor()).decodeByte();
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37145j
    public /* synthetic */ void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        m134422serializeEK6454(interfaceC40542e, ((C23472r) obj).f92950w);
    }

    /* JADX INFO: renamed from: serialize-EK-6454, reason: not valid java name */
    public void m134422serializeEK6454(InterfaceC40542e encoder, byte value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(value);
    }
}
