package zj0;

import ck0.C4777a;
import fk2.C14554a;
import java.nio.ByteBuffer;
import java.util.Set;
import kk0.C22538a;
import kk0.C22539b;
import m83.AbstractC25260n;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;
import ws0.C37605a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: zj0.k0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0014\u0010+\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u0014\u0010-\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b2\u0010\u0017R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, m65681d2 = {"Lzj0/k0;", "Lck0/a;", "Lzj0/t;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "G", "()Ljava/lang/String;", "toString", "k", "Ljava/lang/String;", "K", "packetName", "f0", "firmwareVersionString", "", "g0", "()S", "revision", "", "b0", "()J", "batteryLevelTenths", "Lws0/a;", "()Lws0/a;", "whoopBatteryLevel", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lkk0/b;", "r", "()Lkk0/b;", "chargingStatus", "Lfk2/a;", "getTime", "()Lfk2/a;", "time", "y", "serial", "i", "versionHash", "A", "strapSignature", "Loh2/c;", "a", "()Loh2/c;", "hardwareVersion", "c0", "boardId", "Loh2/b;", "d", "()Loh2/b;", "firmwareVersion", "Loh2/e;", "f", "()Loh2/e;", "sigProcVersion", "", "j", "()Z", "hrBroadcastState", "C", "isOnBody", "", "d0", "()I", "errorEnum", "", "Lzj0/j0;", "e0", "()Ljava/util/Set;", "errorStatuses", "l", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40737k0 extends C4777a implements InterfaceC40756t {

    /* JADX INFO: renamed from: m */
    private static final char f175649m = (char) 0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40737k0(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2HelloResponsePacket";
    }

    /* JADX INFO: renamed from: f0 */
    private final String m132209f0() {
        byte[] bArrArray = m15046X().array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC39414r.m125862H0(new String(bArrArray, m15046X().arrayOffset() + 131, 36, AbstractC39397a.f169546a), f175649m);
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: A */
    public String mo132210A() {
        byte[] bArrArray = m15046X().array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray, m15046X().arrayOffset() + 89, m15046X().arrayOffset() + 119));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: C */
    public boolean mo132211C() {
        return m15046X().get(171) == 1;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: G */
    public String mo132212G() {
        StringBuilder sb4 = new StringBuilder("Rev2HelloResponsePacket:");
        sb4.append("\nState: " + getState());
        sb4.append("\nResult: " + m132197V());
        sb4.append("\nRevision: " + ((int) m132221g0()));
        sb4.append("\nWhoop Device Battery Level: " + mo132224k().getLevel());
        sb4.append("\nCharging: " + mo132225r().m65149d());
        sb4.append("\nTime: " + getTime().m41582i());
        sb4.append("\nSerial: " + mo132226y());
        sb4.append("\nVersion Hash: " + mo132222i());
        sb4.append("\nStrap Signature: " + mo132210A());
        sb4.append("\nHardware Version: " + mo132213a().m84332d());
        sb4.append("\nBoard ID: " + m132216c0());
        sb4.append("\nFirmware Version: " + mo132217d().mo84319a());
        sb4.append("\nSigProc Version: " + mo132220f().m84360f());
        sb4.append("\nHR Broadcast: " + mo132223j());
        sb4.append("\nWrist Status (on-body): " + mo132211C());
        sb4.append("\nError Status: " + m132218d0() + " " + m132219e0());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // ck0.C4777a, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: a */
    public C27940c mo132213a() {
        return C27940c.INSTANCE.m84337a().m84334b(C35048b.m110783d(m15046X().getInt(119))).m84335c(C35048b.m110783d(m15046X().getInt(123))).m84336d(C35048b.m110783d(m15046X().getInt(127))).m84333a();
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: b */
    public C22538a mo132214b() {
        C22538a c22538a = new C22538a();
        c22538a.m65141m((byte) (m132215b0() / ((long) 10)));
        return c22538a;
    }

    /* JADX INFO: renamed from: b0 */
    public final long m132215b0() {
        return C35048b.m110783d(m15046X().getInt(33));
    }

    /* JADX INFO: renamed from: c0 */
    public final long m132216c0() {
        return C35048b.m110783d(m15046X().getInt(127));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: d */
    public InterfaceC27939b mo132217d() {
        return InterfaceC27939b.INSTANCE.m84324b(m132219e0().contains(EnumC40734j0.FIRMWARE_VERSION_NOT_ASSIGNED) ? "" : m132209f0());
    }

    /* JADX INFO: renamed from: d0 */
    public int m132218d0() {
        return m15046X().getInt(172);
    }

    /* JADX INFO: renamed from: e0 */
    public final Set<EnumC40734j0> m132219e0() {
        return EnumC40734j0.INSTANCE.m132208a(m132218d0());
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: f */
    public C27942e mo132220f() {
        C27942e c27942eM84361a = C27942e.m84355a().m84362b(C35048b.m110782b(m15046X().get(167))).m84363c(C35048b.m110782b(m15046X().get(DateTimeConstants.HOURS_PER_WEEK))).m84364d(C35048b.m110782b(m15046X().get(169))).m84361a();
        AbstractC22676k.m65749i(c27942eM84361a, "build(...)");
        return c27942eM84361a;
    }

    /* JADX INFO: renamed from: g0 */
    public short m132221g0() {
        return C35048b.m110782b(m15046X().get(32));
    }

    @Override // zj0.InterfaceC40756t
    public C14554a getTime() {
        return m15048Z();
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: i */
    public String mo132222i() {
        byte[] bArrArray = m15046X().array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray, m15046X().arrayOffset() + 49, m15046X().arrayOffset() + 89));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: j */
    public boolean mo132223j() {
        return m15046X().get(170) != 0;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: k */
    public C37605a mo132224k() {
        return new C37605a((int) (m132215b0() / ((long) 10)));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: r */
    public C22539b mo132225r() {
        C22539b c22539b = new C22539b();
        c22539b.m65155l(m15046X().get(37));
        return c22539b;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return mo132212G();
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: y */
    public String mo132226y() {
        byte[] bArrArray = m15046X().array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC39414r.m125862H0(new String(bArrArray, m15046X().arrayOffset() + 38, 11, AbstractC39397a.f169546a), f175649m);
    }
}
