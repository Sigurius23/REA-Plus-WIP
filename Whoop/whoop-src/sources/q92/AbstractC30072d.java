package q92;

import android.os.Handler;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import lk0.AbstractC24489a;
import lt0.AbstractC24726c;
import nk0.InterfaceC26794a;
import oh3.AbstractC27946d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C29124b;
import vk0.InterfaceC36081g;
import xj0.AbstractC38334b;
import zj0.C40727h;

/* JADX INFO: renamed from: q92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lq92/d;", "Llk0/a;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Lnk0/a$a;", "packetRunnable", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lnk0/a$a;)V", "Lzj0/h;", "commandResponsePacket", "f", "(Lzj0/h;)V", "", "E", "Ljava/lang/String;", "TAG", "Loh3/d;", "F", "Lq92/b;", "y", "()Loh3/d;", "log", "G", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30072d extends AbstractC24489a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C30070b log;

    /* JADX INFO: renamed from: H */
    static final /* synthetic */ InterfaceC21493z[] f122716H = {AbstractC22671h0.f89337a.property1(new C22693x(AbstractC30072d.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0))};

    /* JADX INFO: renamed from: G */
    private static final a f122715G = new a(null);

    /* JADX INFO: renamed from: I */
    private static final InterfaceC26794a.a[] f122717I = new InterfaceC26794a.a[256];

    /* JADX INFO: renamed from: q92.d$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lq92/d$a;", "", "<init>", "()V", "Lq92/d;", "whoopStrapCommandCallback", "Lzj0/h;", "commandResponsePacket", "Loh3/d;", "log", "Ll83/a0;", "a", "(Lq92/d;Lzj0/h;Loh3/d;)V", "", "Lnk0/a$a;", "sequencedPacketRunnables", "[Lnk0/a$a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m92180a(AbstractC30072d whoopStrapCommandCallback, C40727h commandResponsePacket, AbstractC27946d log) {
            AbstractC22676k.m65750j(whoopStrapCommandCallback, "whoopStrapCommandCallback");
            AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
            AbstractC22676k.m65750j(log, "log");
            int iM132195T = commandResponsePacket.m132195T() & 255;
            InterfaceC26794a.a aVar = AbstractC30072d.f122717I[iM132195T];
            if (aVar != null) {
                AbstractC30072d.f122717I[iM132195T] = null;
                if (aVar.getBlePacket() instanceof AbstractC38334b) {
                    AbstractC24726c blePacket = aVar.getBlePacket();
                    AbstractC22676k.m65748h(blePacket, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.CommandPacket");
                    if (InterfaceC36081g.m114591B((AbstractC38334b) blePacket, null, 1, null) == commandResponsePacket.m132193Q()) {
                        AbstractC24489a.f95545z.m71273a(whoopStrapCommandCallback, commandResponsePacket);
                    }
                }
            }
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC30072d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m92177x(InterfaceC26794a.a aVar, byte b) {
        f122717I[b & 255] = aVar;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private final AbstractC27946d m92178y() {
        return this.log.getValue(this, f122716H[0]);
    }

    @Override // lk0.AbstractC24489a, en0.AbstractC13363a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo24775d(C40727h commandResponsePacket) {
        AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
        f122715G.m92180a(this, commandResponsePacket, m92178y());
    }

    /* JADX INFO: renamed from: w */
    public final void m92179w(InterfaceC26794a.a packetRunnable) {
        if (packetRunnable != null) {
            packetRunnable.m79833c(new C29124b(packetRunnable, 10));
        }
    }

    public AbstractC30072d(Handler handler) {
        super(handler);
        this.TAG = "SequencedWhoopStrapCommandResponseCallback";
        this.log = new C30070b("SequencedWhoopStrapCommandResponseCallback");
    }

    public /* synthetic */ AbstractC30072d(Handler handler, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : handler);
    }
}
