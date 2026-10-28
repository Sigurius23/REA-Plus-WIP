package kotlinx.serialization.internal;

import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;
import zc3.AbstractC40538a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lkotlinx/serialization/internal/NoOpEncoder;", "Lzc3/a;", "<init>", "()V", "", "value", "Ll83/a0;", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "Lyc3/g;", "enumDescriptor", "index", "encodeEnum", "(Lyc3/g;I)V", "Lcd3/f;", "serializersModule", "Lcd3/f;", "getSerializersModule", "()Lcd3/f;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpEncoder extends AbstractC40538a {
    public static final NoOpEncoder INSTANCE = new NoOpEncoder();
    private static final AbstractC4454f serializersModule = AbstractC4457i.f17965a;

    private NoOpEncoder() {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeBoolean(boolean value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeByte(byte value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeChar(char value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeDouble(double value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeEnum(InterfaceC39443g enumDescriptor, int index) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeFloat(float value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeInt(int value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeLong(long value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeNull() {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeShort(short value) {
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeString(String value) {
        AbstractC22676k.m65750j(value, "value");
    }

    @Override // zc3.AbstractC40538a
    public void encodeValue(Object value) {
        AbstractC22676k.m65750j(value, "value");
    }

    @Override // zc3.InterfaceC40542e
    public AbstractC4454f getSerializersModule() {
        return serializersModule;
    }
}
