package lk0;

import ak0.C0941c;
import android.os.Handler;
import en0.AbstractC13363a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;
import zj0.C40708a1;
import zj0.C40710b0;
import zj0.C40713c0;
import zj0.C40717d1;
import zj0.C40719e0;
import zj0.C40727h;
import zj0.C40735j1;
import zj0.C40739l;
import zj0.C40744n;
import zj0.C40748p;
import zj0.C40750q;
import zj0.C40758u;
import zj0.InterfaceC40762w;

/* JADX INFO: renamed from: lk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001EB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, m65681d2 = {"Llk0/a;", "Len0/a;", "Lzj0/h;", "", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "blePacket", "Ll83/a0;", "f", "(Lzj0/h;)V", "Lzj0/e0;", "reportVersionInfoResponsePacket", "p", "(Lzj0/e0;)V", "Lzj0/n;", "getBatteryLevelResponsePacket", "i", "(Lzj0/n;)V", "Lzj0/p;", "getClockResponsePacket", "j", "(Lzj0/p;)V", "Lzj0/q;", "getDataRangeResponsePacket", "k", "(Lzj0/q;)V", "Lzj0/u;", "helloResponseHarvardPacket", "l", "(Lzj0/u;)V", "Lzj0/w;", "historyAbortResponse", "m", "(Lzj0/w;)V", "Lzj0/a1;", "startFirmwareLoadResponsePacket", "q", "(Lzj0/a1;)V", "Lzj0/b0;", "loadFirmwareDataResponsePacket", "n", "(Lzj0/b0;)V", "Lzj0/c0;", "processFirmwareImageResponsePacket", "o", "(Lzj0/c0;)V", "Lak0/c;", "getAdvertisingNameHarvardResponsePacket", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lak0/c;)V", "Lzj0/l;", "getAdvertisingNameResponsePacket", "g", "(Lzj0/l;)V", "Lzj0/d1;", "toggleGenericHrProfileResponsePacket", "r", "(Lzj0/d1;)V", "Lzj0/j1;", "toggleRealTimeHrResponsePacket", "s", "(Lzj0/j1;)V", "Ltr2/n;", "y", "Ltr2/n;", "log", "z", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24489a extends AbstractC13363a<C40727h> {

    /* JADX INFO: renamed from: z */
    protected static final a f95545z = new a(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: lk0.a$a */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llk0/a$a;", "", "<init>", "()V", "Llk0/a;", "whoopStrapCommandCallback", "Lzj0/h;", "commandResponsePacket", "Ll83/a0;", "a", "(Llk0/a;Lzj0/h;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m71273a(AbstractC24489a whoopStrapCommandCallback, C40727h commandResponsePacket) {
            AbstractC22676k.m65750j(whoopStrapCommandCallback, "whoopStrapCommandCallback");
            AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
            if (commandResponsePacket instanceof C40719e0) {
                whoopStrapCommandCallback.m71269p((C40719e0) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40744n) {
                whoopStrapCommandCallback.m71262i((C40744n) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40748p) {
                whoopStrapCommandCallback.m71263j((C40748p) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40750q) {
                whoopStrapCommandCallback.m71264k((C40750q) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40758u) {
                whoopStrapCommandCallback.m71265l((C40758u) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof InterfaceC40762w) {
                whoopStrapCommandCallback.mo71266m((InterfaceC40762w) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40708a1) {
                whoopStrapCommandCallback.mo71270q((C40708a1) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40710b0) {
                whoopStrapCommandCallback.mo71267n((C40710b0) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40713c0) {
                whoopStrapCommandCallback.mo71268o((C40713c0) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40717d1) {
                whoopStrapCommandCallback.m71271r((C40717d1) commandResponsePacket);
                return;
            }
            if (commandResponsePacket instanceof C40735j1) {
                whoopStrapCommandCallback.mo71272s((C40735j1) commandResponsePacket);
            } else if (commandResponsePacket instanceof C0941c) {
                whoopStrapCommandCallback.mo24771h((C0941c) commandResponsePacket);
            } else if (commandResponsePacket instanceof C40739l) {
                whoopStrapCommandCallback.mo24770g((C40739l) commandResponsePacket);
            }
        }

        private a() {
        }
    }

    public AbstractC24489a(Handler handler) {
        super(handler);
        this.log = InterfaceC34116n.INSTANCE.m107848a("WhoopStrapCommandResponseCallback");
    }

    @Override // en0.AbstractC13363a
    /* JADX INFO: renamed from: f */
    public void mo24775d(C40727h blePacket) {
        AbstractC22676k.m65750j(blePacket, "blePacket");
        f95545z.m71273a(this, blePacket);
    }

    /* JADX INFO: renamed from: g */
    public void mo24770g(C40739l getAdvertisingNameResponsePacket) {
        AbstractC22676k.m65750j(getAdvertisingNameResponsePacket, "getAdvertisingNameResponsePacket");
    }

    /* JADX INFO: renamed from: h */
    public void mo24771h(C0941c getAdvertisingNameHarvardResponsePacket) {
        AbstractC22676k.m65750j(getAdvertisingNameHarvardResponsePacket, "getAdvertisingNameHarvardResponsePacket");
    }

    /* JADX INFO: renamed from: i */
    public void m71262i(C40744n getBatteryLevelResponsePacket) {
        AbstractC22676k.m65750j(getBatteryLevelResponsePacket, "getBatteryLevelResponsePacket");
    }

    /* JADX INFO: renamed from: j */
    public void m71263j(C40748p getClockResponsePacket) {
        AbstractC22676k.m65750j(getClockResponsePacket, "getClockResponsePacket");
    }

    /* JADX INFO: renamed from: k */
    public void m71264k(C40750q getDataRangeResponsePacket) {
        AbstractC22676k.m65750j(getDataRangeResponsePacket, "getDataRangeResponsePacket");
    }

    /* JADX INFO: renamed from: l */
    public void m71265l(C40758u helloResponseHarvardPacket) {
        AbstractC22676k.m65750j(helloResponseHarvardPacket, "helloResponseHarvardPacket");
    }

    /* JADX INFO: renamed from: m */
    public void mo71266m(InterfaceC40762w historyAbortResponse) {
        AbstractC22676k.m65750j(historyAbortResponse, "historyAbortResponse");
    }

    /* JADX INFO: renamed from: n */
    public void mo71267n(C40710b0 loadFirmwareDataResponsePacket) {
        AbstractC22676k.m65750j(loadFirmwareDataResponsePacket, "loadFirmwareDataResponsePacket");
    }

    /* JADX INFO: renamed from: o */
    public void mo71268o(C40713c0 processFirmwareImageResponsePacket) {
        AbstractC22676k.m65750j(processFirmwareImageResponsePacket, "processFirmwareImageResponsePacket");
    }

    /* JADX INFO: renamed from: p */
    public void m71269p(C40719e0 reportVersionInfoResponsePacket) {
        AbstractC22676k.m65750j(reportVersionInfoResponsePacket, "reportVersionInfoResponsePacket");
    }

    /* JADX INFO: renamed from: q */
    public void mo71270q(C40708a1 startFirmwareLoadResponsePacket) {
        AbstractC22676k.m65750j(startFirmwareLoadResponsePacket, "startFirmwareLoadResponsePacket");
    }

    /* JADX INFO: renamed from: r */
    public void m71271r(C40717d1 toggleGenericHrProfileResponsePacket) {
        AbstractC22676k.m65750j(toggleGenericHrProfileResponsePacket, "toggleGenericHrProfileResponsePacket");
    }

    /* JADX INFO: renamed from: s */
    public void mo71272s(C40735j1 toggleRealTimeHrResponsePacket) {
        AbstractC22676k.m65750j(toggleRealTimeHrResponsePacket, "toggleRealTimeHrResponsePacket");
    }

    public /* synthetic */ AbstractC24489a(Handler handler, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : handler);
    }
}
