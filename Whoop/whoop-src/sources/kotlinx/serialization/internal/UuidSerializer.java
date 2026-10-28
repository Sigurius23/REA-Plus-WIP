package kotlinx.serialization.internal;

import p477s2.AbstractC32069a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zb3.C40261a;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkotlinx/serialization/internal/UuidSerializer;", "Lwc3/c;", "Lzb3/a;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lzb3/a;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lzb3/a;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UuidSerializer implements InterfaceC37138c {
    public static final UuidSerializer INSTANCE = new UuidSerializer();
    private static final InterfaceC39443g descriptor = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", C39441e.f169698i);

    private UuidSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public C40261a deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        String uuidString = decoder.decodeString();
        AbstractC22676k.m65750j(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            return AbstractC32069a.m99660B(uuidString);
        }
        if (length == 36) {
            return AbstractC32069a.m99661C(uuidString);
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + AbstractC32069a.m99669g(uuidString) + "\" of length " + uuidString.length());
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, C40261a value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.encodeString(value.toString());
    }
}
