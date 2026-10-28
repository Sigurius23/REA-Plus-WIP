package p112e9;

import a00.C0072g;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.iterable.iterableapi.C5327g1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import la.C23550d;
import na.C26495h;
import p141f9.AbstractC14271m;
import p141f9.C14259a;
import p141f9.C14260b;
import p141f9.C14261c;
import p249jc.C21567b;
import p324m9.C25275c;
import p361o9.InterfaceC27679s;
import p398p9.InterfaceC28988l;
import p499t9.InterfaceC33644n;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p674z8.InterfaceC40170f;
import pa.C29035a;
import qa.C30103h;

/* JADX INFO: renamed from: e9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C12873l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28988l f44297a;

    /* JADX INFO: renamed from: b */
    public final C0072g f44298b;

    /* JADX INFO: renamed from: c */
    public final int[] f44299c;

    /* JADX INFO: renamed from: d */
    public final int f44300d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC40170f f44301e;

    /* JADX INFO: renamed from: f */
    public final long f44302f;

    /* JADX INFO: renamed from: g */
    public final int f44303g;

    /* JADX INFO: renamed from: h */
    public final C12876o f44304h;

    /* JADX INFO: renamed from: i */
    public final C12871j[] f44305i;

    /* JADX INFO: renamed from: j */
    public InterfaceC27679s f44306j;

    /* JADX INFO: renamed from: k */
    public C14261c f44307k;

    /* JADX INFO: renamed from: l */
    public int f44308l;

    /* JADX INFO: renamed from: m */
    public BehindLiveWindowException f44309m;

    /* JADX INFO: renamed from: n */
    public boolean f44310n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e9.l, java.lang.Object] */
    public C12873l(C5327g1 c5327g1, InterfaceC28988l interfaceC28988l, C14261c c14261c, C0072g c0072g, int i13, int[] iArr, InterfaceC27679s interfaceC27679s, int i14, InterfaceC40170f interfaceC40170f, long j7, int i15, boolean z4, ArrayList arrayList, C12876o c12876o) {
        InterfaceC33644n c26495h;
        C25275c c25275c;
        ?? obj = new Object();
        obj.f44297a = interfaceC28988l;
        obj.f44307k = c14261c;
        obj.f44298b = c0072g;
        obj.f44299c = iArr;
        obj.f44306j = interfaceC27679s;
        obj.f44300d = i14;
        obj.f44301e = interfaceC40170f;
        obj.f44308l = i13;
        obj.f44302f = j7;
        obj.f44303g = i15;
        obj.f44304h = c12876o;
        long jM40730c = c14261c.m40730c(i13);
        ArrayList arrayListM36166a = obj.m36166a();
        obj.f44305i = new C12871j[interfaceC27679s.length()];
        int i16 = 0;
        int i17 = 0;
        C12873l c12873l = obj;
        while (i17 < c12873l.f44305i.length) {
            AbstractC14271m abstractC14271m = (AbstractC14271m) arrayListM36166a.get(interfaceC27679s.mo68073e(i17));
            C14260b c14260bM167C = c0072g.m167C(abstractC14271m.f52112x);
            C12871j[] c12871jArr = c12873l.f44305i;
            int i18 = i17;
            c14260bM167C = c14260bM167C == null ? (C14260b) abstractC14271m.f52112x.get(i16) : c14260bM167C;
            C34610p c34610p = abstractC14271m.f52111w;
            c5327g1.getClass();
            String str = c34610p.f145782m;
            if (AbstractC34587d0.m109380m(str)) {
                if (c5327g1.f21694w) {
                    c26495h = new C30103h(((C21567b) c5327g1.f21695x).mo60611h(c34610p), c34610p);
                } else {
                    c25275c = null;
                    arrayListM36166a = arrayListM36166a;
                    i18 = i18;
                }
                C25275c c25275c2 = c25275c;
                int i19 = i18;
                c12871jArr[i19] = new C12871j(jM40730c, abstractC14271m, c14260bM167C, c25275c2, 0L, abstractC14271m.mo40753c());
                i17 = i19 + 1;
                c12873l = this;
                arrayListM36166a = arrayListM36166a;
                i16 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    arrayListM36166a = arrayListM36166a;
                    c26495h = new C23550d((C21567b) c5327g1.f21695x, c5327g1.f21694w ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    c26495h = new C29035a(1);
                } else if (Objects.equals(str, "image/png")) {
                    c26495h = new C29035a(0, (byte) 0);
                } else {
                    arrayListM36166a = arrayListM36166a;
                    int i24 = z4 ? 4 : 0;
                    c26495h = new C26495h((C21567b) c5327g1.f21695x, c5327g1.f21694w ? i24 : i24 | 32, arrayList, c12876o);
                }
                c25275c = new C25275c(c26495h, i14, c34610p);
                C25275c c25275c3 = c25275c;
                int i110 = i18;
                c12871jArr[i110] = new C12871j(jM40730c, abstractC14271m, c14260bM167C, c25275c3, 0L, abstractC14271m.mo40753c());
                i17 = i110 + 1;
                c12873l = this;
                arrayListM36166a = arrayListM36166a;
                i16 = 0;
            }
            c25275c = new C25275c(c26495h, i14, c34610p);
            C25275c c25275c4 = c25275c;
            int i111 = i18;
            c12871jArr[i111] = new C12871j(jM40730c, abstractC14271m, c14260bM167C, c25275c4, 0L, abstractC14271m.mo40753c());
            i17 = i111 + 1;
            c12873l = this;
            arrayListM36166a = arrayListM36166a;
            i16 = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m36166a() {
        List list = this.f44307k.m40728a(this.f44308l).f52096c;
        ArrayList arrayList = new ArrayList();
        for (int i13 : this.f44299c) {
            arrayList.addAll(((C14259a) list.get(i13)).f52054c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final C12871j m36167b(int i13) {
        C12871j[] c12871jArr = this.f44305i;
        C12871j c12871j = c12871jArr[i13];
        C14260b c14260bM167C = this.f44298b.m167C(c12871j.f44287b.f52112x);
        if (c14260bM167C == null || c14260bM167C.equals(c12871j.f44288c)) {
            return c12871j;
        }
        C12871j c12871j2 = new C12871j(c12871j.f44290e, c12871j.f44287b, c14260bM167C, c12871j.f44286a, c12871j.f44291f, c12871j.f44289d);
        c12871jArr[i13] = c12871j2;
        return c12871j2;
    }
}
