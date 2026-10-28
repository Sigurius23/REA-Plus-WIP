package z23;

import b33.EnumC2682c;
import b33.EnumC2686g;
import b33.EnumC2688i;
import b33.InterfaceC2685f;
import com.squareup.wire.AbstractC5583n;
import ec3.C13081r1;
import g73.C15553a;
import io.getstream.android.video.generated.models.ClientEvent;
import jg3.C21676c;
import jg3.C21682i;
import jg3.C21689p;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import pg3.C29205p;
import s93.AbstractC32309k;
import t23.C33366b4;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import w23.EnumC36762t;
import x33.C37949a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: z23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C40031a {

    /* JADX INFO: renamed from: a */
    public final C29205p f172736a;

    public C40031a(C29205p c29205p) {
        this.f172736a = c29205p;
    }

    /* JADX INFO: renamed from: a */
    public static ClientEvent m128361a(C40031a c40031a, String str, String str2, InterfaceC2685f interfaceC2685f, EnumC2686g enumC2686g, String str3, AbstractC32309k abstractC32309k, String str4, Long l7, EnumC2682c enumC2682c, Integer num, String str5, String str6, String str7, String str8, EnumC2688i enumC2688i, Boolean bool, EnumC36762t enumC36762t, Boolean bool2, Boolean bool3, int i13) {
        String str9 = (i13 & 1) != 0 ? null : str;
        String str10 = (i13 & 2) != 0 ? null : str2;
        String str11 = (i13 & 16) != 0 ? null : str3;
        AbstractC32309k abstractC32309k2 = (i13 & 32) != 0 ? null : abstractC32309k;
        String str12 = (i13 & 64) != 0 ? null : str4;
        Long l12 = (i13 & 128) != 0 ? null : l7;
        EnumC2682c enumC2682c2 = (i13 & 256) != 0 ? null : enumC2682c;
        Integer num2 = (i13 & 512) != 0 ? null : num;
        String str13 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str5;
        String str14 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str6;
        String str15 = (i13 & 4096) != 0 ? null : str7;
        String str16 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str8;
        EnumC2688i enumC2688i2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : enumC2688i;
        Boolean bool4 = (32768 & i13) != 0 ? null : bool;
        EnumC36762t enumC36762t2 = (65536 & i13) != 0 ? null : enumC36762t;
        Boolean bool5 = (1048576 & i13) != 0 ? null : bool2;
        Boolean bool6 = (i13 & 2097152) != 0 ? null : bool3;
        c40031a.getClass();
        String str17 = enumC2686g.f10571w;
        String value = interfaceC2685f.getValue();
        C21689p c21689p = C21689p.f83278F;
        C15553a c15553a = C21682i.f83261H;
        AbstractC5583n.m16762V(c21689p, "zone");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21676c c21676c = C21676c.f83234H;
        Long l13 = l12;
        C21676c c21676cM60990o0 = C21676c.m60990o0(AbstractC5583n.m16743B(1000, jCurrentTimeMillis) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jCurrentTimeMillis, 1000L));
        C21682i c21682iM61053q0 = C21682i.m61053q0(c21676cM60990o0, c21689p.mo61071k().mo84265a(c21676cM60990o0));
        String strM125866L0 = AbstractC39414r.m125866L0(512, C37949a.m121544a());
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        String strM105800r = interfaceC33408j3 != null ? ((C33366b4) interfaceC33408j3).m105800r() : null;
        Integer numValueOf = l13 != null ? Integer.valueOf((int) l13.longValue()) : null;
        String str18 = enumC36762t2 != null ? enumC36762t2.f157330w : null;
        String str19 = enumC2682c2 != null ? enumC2682c2.f10558w : null;
        String str20 = enumC2688i2 != null ? enumC2688i2.f10575w : null;
        String strM128362b = m128362b(null);
        return new ClientEvent(str15, m128362b(bool6), (String) ((C13081r1) c40031a.f172736a.f118205y).f45200w.getValue(), abstractC32309k2 != null ? abstractC32309k2.mo100580e() : null, numValueOf, str17, str18, str9, str12, m128362b(bool5), str19, str20, null, num2, str14, str13, strM128362b, "1.28.0", str16, value, str11, c21682iM61053q0, null, str10, strM125866L0, strM105800r, null, bool4);
    }

    /* JADX INFO: renamed from: b */
    public static String m128362b(Boolean bool) {
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            return "GRANTED";
        }
        if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
            return "FAILED";
        }
        return null;
    }
}
