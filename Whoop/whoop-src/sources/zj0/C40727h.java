package zj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24735l;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import wj0.EnumC37318b;

/* JADX INFO: renamed from: zj0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR.\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lzj0/h;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "payload", "Lzj0/f0;", "codec", "<init>", "(Ljava/nio/ByteBuffer;Lzj0/f0;)V", "Lst0/v;", "whoopDeviceType", "(Ljava/nio/ByteBuffer;Lst0/v;)V", "", "toString", "()Ljava/lang/String;", "c", "Lzj0/f0;", "data", "d", "Ljava/nio/ByteBuffer;", "S", "()Ljava/nio/ByteBuffer;", "setData", "(Ljava/nio/ByteBuffer;)V", "e", "Ljava/lang/String;", "K", "packetName", "", "R", "()B", "commandByte", "Llt0/e;", "Q", "()Llt0/e;", "command", "Llt0/l;", "U", "()Llt0/l;", "puffinCommand", "T", "originSequenceNumber", "Lwj0/b;", "V", "()Lwj0/b;", "result", "", "W", "()Z", "isResultSuccess", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C40727h extends AbstractC24726c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC40722f0 codec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ByteBuffer data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packetName;

    private C40727h(ByteBuffer byteBuffer, InterfaceC40722f0 interfaceC40722f0) {
        super(byteBuffer);
        this.codec = interfaceC40722f0;
        this.packetName = "CommandResponsePacket";
    }

    /* JADX INFO: renamed from: R */
    private final byte m132192R() {
        return getPayload().get(2);
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: Q */
    public EnumC24728e m132193Q() {
        InterfaceC24724a interfaceC24724aMo44950a = this.codec.mo44950a(getPayload());
        if (interfaceC24724aMo44950a instanceof EnumC24728e) {
            return (EnumC24728e) interfaceC24724aMo44950a;
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final ByteBuffer m132194S() {
        if (this.data == null) {
            getPayload().position(this.codec.mo44952c());
            this.data = getPayload().slice().order(AbstractC24727d.m72403a());
            getPayload().position(0);
        }
        return this.data;
    }

    /* JADX INFO: renamed from: T */
    public byte m132195T() {
        return this.codec.mo44953d(getPayload());
    }

    /* JADX INFO: renamed from: U */
    public final EnumC24735l m132196U() {
        return InterfaceC24724a.INSTANCE.m72385a(m132192R());
    }

    /* JADX INFO: renamed from: V */
    public EnumC37318b m132197V() {
        return this.codec.mo44951b(getPayload());
    }

    /* JADX INFO: renamed from: W */
    public final boolean m132198W() {
        return m132197V() == EnumC37318b.SUCCESS || m132197V() == EnumC37318b.PENDING;
    }

    @Override // lt0.AbstractC24726c
    public String toString() {
        return getPacketName() + " (Cmd:" + m132193Q() + " Origin Seq#:" + (m132195T() & 255) + ") Result:" + m132197V() + ")";
    }

    public /* synthetic */ C40727h(ByteBuffer byteBuffer, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, (i13 & 2) != 0 ? EnumC32978v.MAVERICK : enumC32978v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40727h(ByteBuffer payload, EnumC32978v whoopDeviceType) {
        this(payload, InterfaceC40722f0.INSTANCE.m132190a(whoopDeviceType));
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
    }
}
