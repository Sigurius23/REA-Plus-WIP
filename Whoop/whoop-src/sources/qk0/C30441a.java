package qk0;

import java.nio.ByteBuffer;
import jk0.AbstractC21755i;
import lt0.AbstractC24726c;
import lt0.AbstractC24732i;
import lt0.C24736m;
import mt0.C25932b;
import mt0.C25933c;
import mt0.C25935e;
import mt0.C25938h;
import nj0.InterfaceC26750f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pk0.InterfaceC29333c;
import st0.EnumC32978v;
import ut0.InterfaceC35229a;
import xj0.AbstractC38334b;
import zj0.C40727h;

/* JADX INFO: renamed from: qk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lqk0/a;", "Lut0/a;", "Lnj0/f;", "protocol", "Lpk0/c;", "reader", "<init>", "(Lnj0/f;Lpk0/c;)V", "Ljava/nio/ByteBuffer;", "payload", "Llt0/i;", "c", "(Ljava/nio/ByteBuffer;)Llt0/i;", "Lxj0/b;", "packet", "", "a", "(Lxj0/b;)[B", "bytes", "Lzj0/h;", "b", "([B)Lzj0/h;", "Lnj0/f;", "Lpk0/c;", "Lst0/v;", "Lst0/v;", "deviceType", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30441a implements InterfaceC35229a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26750f protocol;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC29333c reader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC32978v deviceType;

    public C30441a(InterfaceC26750f protocol, InterfaceC29333c reader) {
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(reader, "reader");
        this.protocol = protocol;
        this.reader = reader;
        this.deviceType = AbstractC21755i.m61391a(protocol);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC24732i m93111c(ByteBuffer payload) {
        InterfaceC26750f interfaceC26750f = this.protocol;
        if (AbstractC22676k.m65745e(interfaceC26750f, InterfaceC26750f.b.C42056b.f106385b)) {
            return new C25933c(payload);
        }
        if (AbstractC22676k.m65745e(interfaceC26750f, InterfaceC26750f.b.c.f106390b)) {
            return new C25935e(payload);
        }
        if (interfaceC26750f instanceof InterfaceC26750f.b.a) {
            return new C25938h(payload);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ut0.InterfaceC35229a
    /* JADX INFO: renamed from: a */
    public byte[] mo93112a(AbstractC38334b packet) {
        AbstractC22676k.m65750j(packet, "packet");
        byte[] bArrArray = C25932b.INSTANCE.m76714a(m93111c(packet.getPayload())).m76710f().array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return bArrArray;
    }

    @Override // ut0.InterfaceC35229a
    /* JADX INFO: renamed from: b */
    public C40727h mo93113b(byte[] bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        C24736m c24736mMo89258a = this.reader.mo89258a(bytes, this.deviceType);
        AbstractC24726c packet = c24736mMo89258a != null ? c24736mMo89258a.getPacket() : null;
        if (packet instanceof C40727h) {
            return (C40727h) packet;
        }
        return null;
    }
}
