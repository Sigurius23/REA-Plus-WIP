package z23;

import a33.C0352d;
import androidx.room.AbstractC1772c1;
import b33.AbstractC2687h;
import b33.C2681b;
import b33.C2684e;
import b33.C2689j;
import b33.EnumC2682c;
import b33.EnumC2683d;
import b33.EnumC2686g;
import java.util.concurrent.ConcurrentHashMap;
import p508ty.C34249c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import s93.AbstractC32309k;
import w23.EnumC36762t;

/* JADX INFO: renamed from: z23.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C40033c {

    /* JADX INFO: renamed from: a */
    public final C0352d f172739a;

    /* JADX INFO: renamed from: b */
    public final C29205p f172740b;

    /* JADX INFO: renamed from: c */
    public final C40031a f172741c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f172742d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f172743e;

    /* JADX INFO: renamed from: f */
    public final C34249c f172744f;

    public C40033c(C0352d c0352d, C29205p c29205p) {
        this.f172739a = c0352d;
        this.f172740b = c29205p;
        AbstractC1772c1.m5382S(this, "ClientEventReporter");
        this.f172741c = new C40031a(c29205p);
        this.f172742d = new ConcurrentHashMap();
        this.f172743e = new ConcurrentHashMap();
        this.f172744f = new C34249c(28);
    }

    /* JADX INFO: renamed from: b */
    public static void m128363b(C40033c c40033c, String stageId, boolean z4, int i13, String str, String str2, String str3, int i14) {
        String str4 = (i14 & 8) != 0 ? null : str;
        String str5 = (i14 & 16) != 0 ? null : str2;
        String str6 = (i14 & 32) != 0 ? null : str3;
        c40033c.getClass();
        AbstractC22676k.m65750j(stageId, "stageId");
        AbstractC2687h abstractC2687h = (AbstractC2687h) c40033c.f172742d.remove(stageId);
        if (abstractC2687h != null && (abstractC2687h instanceof C2689j)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - abstractC2687h.mo7577a();
            C2689j c2689j = (C2689j) abstractC2687h;
            String str7 = str4;
            C40031a c40031a = c40033c.f172741c;
            String str8 = null;
            String str9 = c2689j.f10576a;
            String str10 = str5;
            String str11 = c2689j.f10577b;
            EnumC2683d enumC2683d = EnumC2683d.COORDINATOR_JOIN;
            String str12 = str7;
            EnumC2686g enumC2686g = EnumC2686g.COMPLETED;
            EnumC2682c enumC2682c = z4 ? EnumC2682c.SUCCESS : EnumC2682c.FAILURE;
            if (z4) {
                str12 = null;
            }
            if (!z4) {
                str8 = str10;
            }
            c40033c.f172739a.m927P(C40031a.m128361a(c40031a, str9, str11, enumC2683d, enumC2686g, stageId, c2689j.f10582g, c2689j.f10581f, Long.valueOf(jCurrentTimeMillis), enumC2682c, Integer.valueOf(i13), str12, str8, str6, null, null, null, null, null, null, 8380416));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m128364c(C40033c c40033c, String stageId, boolean z4, Integer num) {
        AbstractC22676k.m65750j(stageId, "stageId");
        AbstractC2687h abstractC2687h = (AbstractC2687h) c40033c.f172742d.remove(stageId);
        if (abstractC2687h != null && (abstractC2687h instanceof C2681b)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - abstractC2687h.mo7577a();
            c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, null, null, C2684e.f10567w, EnumC2686g.COMPLETED, stageId, null, null, Long.valueOf(jCurrentTimeMillis), z4 ? EnumC2682c.SUCCESS : EnumC2682c.FAILURE, num, null, null, null, null, null, null, null, null, null, 8384611));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m128365a(String str, String str2, String str3, String str4, String str5, String str6, AbstractC32309k abstractC32309k, boolean z4, EnumC36762t enumC36762t, String str7, String str8) {
        AbstractC2687h abstractC2687h = (AbstractC2687h) this.f172742d.remove(str3);
        if (abstractC2687h != null && (abstractC2687h instanceof C2689j)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - abstractC2687h.mo7577a();
            C2689j c2689j = (C2689j) abstractC2687h;
            EnumC2683d enumC2683d = EnumC2683d.PEER_CONNECTION_CONNECT;
            EnumC2686g enumC2686g = EnumC2686g.COMPLETED;
            EnumC2682c enumC2682c = z4 ? EnumC2682c.SUCCESS : EnumC2682c.FAILURE;
            String str9 = !z4 ? str7 : null;
            String str10 = !z4 ? str8 : null;
            this.f172739a.m927P(C40031a.m128361a(this.f172741c, str, str2, enumC2683d, enumC2686g, str3, abstractC32309k, str5, Long.valueOf(jCurrentTimeMillis), enumC2682c, 0, str9, str10, str6, str4, c2689j.f10585j, Boolean.valueOf(c2689j.f10586k), enumC36762t, null, null, 8126464));
        }
    }
}
