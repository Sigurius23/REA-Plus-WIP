package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkotlinx/serialization/internal/DurationSerializer;", "Lwc3/c;", "Lkotlin/time/Duration;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize-HG0u8IE", "(Lzc3/e;J)V", "serialize", "Lzc3/d;", "decoder", "deserialize-5sfh64U", "(Lzc3/d;)J", "deserialize", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DurationSerializer implements InterfaceC37138c {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private static final InterfaceC39443g descriptor = new PrimitiveSerialDescriptor("kotlin.time.Duration", C39441e.f169698i);

    private DurationSerializer() {
    }

    @Override // wc3.InterfaceC37137b
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC40541d interfaceC40541d) {
        return Duration.m134260boximpl(m134410deserialize5sfh64U(interfaceC40541d));
    }

    /* JADX INFO: renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m134410deserialize5sfh64U(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return Duration.INSTANCE.m134359parseIsoStringUwyO8pc(decoder.decodeString());
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37145j
    public /* bridge */ /* synthetic */ void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        m134411serializeHG0u8IE(interfaceC40542e, ((Duration) obj).getRawValue());
    }

    /* JADX INFO: renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m134411serializeHG0u8IE(InterfaceC40542e encoder, long value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        encoder.encodeString(Duration.m134300toIsoStringimpl(value));
    }
}
