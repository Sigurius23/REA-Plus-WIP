package td1;

import ak0.C0945g;
import android.bluetooth.BluetoothDevice;
import com.whoop.domain.model.WhoopStrapInfo;
import ec3.InterfaceC13058l;
import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kk0.C22538a;
import kk0.C22539b;
import l73.AbstractC23410a;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import tj0.InterfaceC33864a;
import xg3.C38280g;
import xj0.AbstractC38334b;
import xj0.AbstractC38356i0;
import zj0.C40726g1;
import zj0.C40727h;
import zj0.C40733j;
import zj0.C40742m;
import zj0.C40749p0;
import zj0.C40761v0;

/* JADX INFO: renamed from: td1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0010\u0010\tJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001c\u0010\tJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH&¢\u0006\u0004\b$\u0010%J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H¦@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020)H¦@¢\u0006\u0004\b,\u0010\tJ\"\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020&H¦@¢\u0006\u0004\b0\u0010+J$\u00105\u001a\u0004\u0018\u0001042\u0006\u00101\u001a\u00020)2\b\b\u0002\u00103\u001a\u000202H¦@¢\u0006\u0004\b5\u00106J$\u00109\u001a\u0004\u0018\u00010\u00112\u0006\u00108\u001a\u0002072\b\b\u0002\u00103\u001a\u000202H¦@¢\u0006\u0004\b9\u0010:J$\u0010;\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u00020)2\b\b\u0002\u00103\u001a\u000202H¦@¢\u0006\u0004\b;\u00106R\u0014\u0010>\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020W8&X§\u0004¢\u0006\f\u0012\u0004\bZ\u0010%\u001a\u0004\bX\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_À\u0006\u0003"}, m65681d2 = {"Ltd1/b;", "", "Lfk2/a;", "timeStamp", "Lzj0/v0;", "u", "(Lfk2/a;Lq83/d;)Ljava/lang/Object;", "Lzj0/m;", "g", "(Lq83/d;)Ljava/lang/Object;", "Lxj0/i0;", "params", "Lzj0/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lxj0/i0;Lq83/d;)Ljava/lang/Object;", "Lzj0/j;", "a", "Lzj0/h;", "c", "Ll73/c;", "Lot0/a;", "E", "()Ll73/c;", "Ll73/a;", "Lek0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ll73/a;", "Ll83/a0;", "B", "Lxg3/g;", "Ltd1/e;", "i", "()Lxg3/g;", "Lec3/l;", "r", "()Lec3/l;", "l", "()V", "", "intervalSeconds", "durationSeconds", "", "z", "(IILq83/d;)Ljava/lang/Object;", "x", "patternId", "numberOfLoops", "Lak0/g;", "D", "enable", "", "timeout", "Lzj0/g1;", "t", "(ZJLq83/d;)Ljava/lang/Object;", "Lxj0/b;", "any", "k", "(Lxj0/b;JLq83/d;)Ljava/lang/Object;", "o", "A", "()Ltd1/e;", "currentStatus", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lkk0/b;", "n", "()Lkk0/b;", "chargeStatus", "Lcom/whoop/domain/model/WhoopStrapInfo;", "f", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "Landroid/bluetooth/BluetoothDevice;", "m", "()Landroid/bluetooth/BluetoothDevice;", "device", "Ltj0/a;", "e", "()Ltj0/a;", "genericHrProfileController", "", "y", "()Ljava/lang/String;", "deviceName", "Ltd1/a;", "d", "()Ltd1/a;", "getStrapGeneration$annotations", "strapGeneration", "j", "()Ljava/lang/Boolean;", "batteryPackOn", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public interface InterfaceC33704b {
    /* JADX INFO: renamed from: p */
    static /* synthetic */ Object m106481p(InterfaceC33704b interfaceC33704b, AbstractC38334b abstractC38334b, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommandToStrapWithRetries");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC33704b.mo106498k(abstractC38334b, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: s */
    static /* synthetic */ Object m106482s(InterfaceC33704b interfaceC33704b, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleImuDataStream");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC33704b.mo106504t(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ Object m106483v(InterfaceC33704b interfaceC33704b, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendTurnOnOffRawDataRealtime");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC33704b.mo106502o(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: A */
    EnumC33707e mo106484A();

    /* JADX INFO: renamed from: B */
    Object mo106485B(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: D */
    Object mo106486D(int i13, int i14, InterfaceC30057d<? super C0945g> interfaceC30057d);

    /* JADX INFO: renamed from: E */
    AbstractC23412c mo106487E();

    /* JADX INFO: renamed from: a */
    Object mo106488a(InterfaceC30057d<? super C40733j> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    C22538a getBatteryLevel();

    /* JADX INFO: renamed from: c */
    Object mo106490c(InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    EnumC33703a mo106491d();

    /* JADX INFO: renamed from: e */
    InterfaceC33864a mo106492e();

    /* JADX INFO: renamed from: f */
    WhoopStrapInfo mo106493f();

    /* JADX INFO: renamed from: g */
    Object mo106494g(InterfaceC30057d<? super C40742m> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    AbstractC23410a mo106495h();

    /* JADX INFO: renamed from: i */
    C38280g<EnumC33707e> mo106496i();

    /* JADX INFO: renamed from: j */
    Boolean mo106497j();

    /* JADX INFO: renamed from: k */
    Object mo106498k(AbstractC38334b abstractC38334b, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: l */
    void mo106499l();

    /* JADX INFO: renamed from: m */
    BluetoothDevice mo106500m();

    /* JADX INFO: renamed from: n */
    C22539b getChargeStatus();

    /* JADX INFO: renamed from: o */
    Object mo106502o(boolean z4, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: r */
    InterfaceC13058l mo106503r();

    /* JADX INFO: renamed from: t */
    Object mo106504t(boolean z4, long j7, InterfaceC30057d<? super C40726g1> interfaceC30057d);

    /* JADX INFO: renamed from: u */
    Object mo106505u(C14554a c14554a, InterfaceC30057d<? super C40761v0> interfaceC30057d);

    /* JADX INFO: renamed from: w */
    Object mo106506w(AbstractC38356i0 abstractC38356i0, InterfaceC30057d<? super C40749p0> interfaceC30057d);

    /* JADX INFO: renamed from: x */
    Object mo106507x(InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: y */
    String mo106508y();

    /* JADX INFO: renamed from: z */
    Object mo106509z(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d);
}
