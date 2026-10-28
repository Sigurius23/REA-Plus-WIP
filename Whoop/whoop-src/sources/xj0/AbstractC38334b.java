package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import vk0.InterfaceC36081g;

/* JADX INFO: renamed from: xj0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\t\b&\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eB!\b\u0012\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R$\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, m65681d2 = {"Lxj0/b;", "Llt0/c;", "Lvk0/g;", "Ljava/nio/ByteBuffer;", "payload", "Lxj0/a;", "codec", "<init>", "(Ljava/nio/ByteBuffer;Lxj0/a;)V", "Llt0/a;", "command", "dataPayload", "Lst0/v;", "whoopDeviceType", "(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V", "(Llt0/a;Ljava/nio/ByteBuffer;Lxj0/a;)V", "deviceType", "s", "(Lst0/v;)Llt0/a;", "", "toString", "()Ljava/lang/String;", "c", "Lxj0/a;", "", "d", "Z", "p", "()Z", "dualResponse", "e", "Ljava/lang/String;", "K", "packetName", "", "value", "N", "()B", "P", "(B)V", "sequenceNumber", "f", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38334b extends AbstractC24726c implements InterfaceC36081g {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static final ByteBuffer f164253g;

    /* JADX INFO: renamed from: h */
    private static final ByteBuffer f164254h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC38331a codec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean dualResponse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packetName;

    /* JADX INFO: renamed from: xj0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lxj0/b$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "payload", "", "a", "(Ljava/nio/ByteBuffer;)Ljava/lang/Byte;", "enable", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "disable", "b", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Byte m122893a(ByteBuffer payload) {
            if (payload == null || payload.limit() <= 2) {
                return null;
            }
            return Byte.valueOf(payload.get(2));
        }

        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122894b() {
            return AbstractC38334b.f164254h;
        }

        /* JADX INFO: renamed from: c */
        public final ByteBuffer m122895c() {
            return AbstractC38334b.f164253g;
        }

        private Companion() {
        }
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[]{1}).order(AbstractC24727d.m72403a());
        AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
        f164253g = byteBufferOrder;
        ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(new byte[]{0}).order(AbstractC24727d.m72403a());
        AbstractC22676k.m65749i(byteBufferOrder2, "order(...)");
        f164254h = byteBufferOrder2;
    }

    private AbstractC38334b(ByteBuffer byteBuffer, InterfaceC38331a interfaceC38331a) {
        super(byteBuffer);
        this.codec = interfaceC38331a;
        this.packetName = "CommandPacket";
    }

    @Override // vk0.InterfaceC36081g
    /* JADX INFO: renamed from: I */
    public /* bridge */ long mo114592I() {
        return super.mo114592I();
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: N */
    public byte mo72387N() {
        return this.codec.mo44941d(getPayload());
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: P */
    public void mo72388P(byte b) {
        this.codec.mo44940c(getPayload(), b);
    }

    @Override // vk0.InterfaceC36081g
    /* JADX INFO: renamed from: p, reason: from getter */
    public boolean getDualResponse() {
        return this.dualResponse;
    }

    @Override // vk0.InterfaceC36081g
    /* JADX INFO: renamed from: s */
    public InterfaceC24724a mo114594s(EnumC32978v deviceType) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        return this.codec.mo44938a(getPayload());
    }

    @Override // lt0.AbstractC24726c
    public String toString() {
        return getPacketName() + " (Cmd: " + this.codec.mo44938a(getPayload()) + " Seq#: " + (mo72387N() & 255) + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC38334b(InterfaceC24724a interfaceC24724a, ByteBuffer byteBuffer, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            byteBuffer = ByteBuffer.allocate(0).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBuffer, "order(...)");
        }
        this(interfaceC24724a, byteBuffer, (i13 & 4) != 0 ? EnumC32978v.GEN_4 : enumC32978v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC38334b(InterfaceC24724a command, ByteBuffer dataPayload, EnumC32978v whoopDeviceType) {
        this(command, dataPayload, InterfaceC38331a.INSTANCE.m122890a(whoopDeviceType));
        AbstractC22676k.m65750j(command, "command");
        AbstractC22676k.m65750j(dataPayload, "dataPayload");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
    }

    private AbstractC38334b(InterfaceC24724a interfaceC24724a, ByteBuffer byteBuffer, InterfaceC38331a interfaceC38331a) {
        this(interfaceC38331a.mo44939b(interfaceC24724a, byteBuffer), interfaceC38331a);
    }
}
