package hk0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import xj0.InterfaceC38331a;

/* JADX INFO: renamed from: hk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhk0/a;", "Lxj0/a;", "<init>", "()V", "Llt0/a;", "command", "Ljava/nio/ByteBuffer;", "commandPayload", "b", "(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "payload", "a", "(Ljava/nio/ByteBuffer;)Llt0/a;", "", "d", "(Ljava/nio/ByteBuffer;)B", "value", "Ll83/a0;", "c", "(Ljava/nio/ByteBuffer;B)V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17366a implements InterfaceC38331a {

    /* JADX INFO: renamed from: b */
    public static final C17366a f67286b = new C17366a();

    private C17366a() {
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: a */
    public InterfaceC24724a mo44938a(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return InterfaceC24724a.INSTANCE.m72386b((byte) payload.getShort(20));
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo44939b(InterfaceC24724a command, ByteBuffer commandPayload) {
        AbstractC22676k.m65750j(command, "command");
        AbstractC22676k.m65750j(commandPayload, "commandPayload");
        int value = command.getValue();
        if (value < 0 || value >= 65536) {
            AbstractC35846d.m113779c(16);
            String string = Integer.toString(value, 16);
            AbstractC22676k.m65749i(string, "toString(...)");
            throw new IllegalArgumentException("commandId must fit in uint16, got 0x".concat(string).toString());
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(commandPayload.limit() + 23).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(0, (byte) 1);
        byteBufferOrder.put(1, (byte) EnumC17380o.BLE_COMMAND_FRAMEWORK.getValue());
        byteBufferOrder.put(2, (byte) 0);
        byteBufferOrder.putShort(17, (short) EnumC17381p.BLE_COMMAND.getValue());
        byteBufferOrder.put(19, (byte) 1);
        byteBufferOrder.putShort(20, (short) value);
        ByteBuffer byteBufferDuplicate = commandPayload.duplicate();
        byteBufferDuplicate.position(0);
        byteBufferOrder.position(23);
        byteBufferOrder.put(byteBufferDuplicate);
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: c */
    public void mo44940c(ByteBuffer payload, byte value) {
        AbstractC22676k.m65750j(payload, "payload");
        payload.putInt(9, value & 255);
    }

    @Override // xj0.InterfaceC38331a
    /* JADX INFO: renamed from: d */
    public byte mo44941d(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return (byte) payload.getInt(9);
    }
}
