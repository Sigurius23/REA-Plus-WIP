package p389p0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import java.util.Map;
import no0.C26944e0;
import nq0.C27050m;
import nx1.C27225g;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p602x1.C37816b;
import p634y1.AbstractC39035h;
import p634y1.C39034g;
import p634y1.InterfaceC39030c;
import p634y1.InterfaceC39032e;
import p634y1.InterfaceC39033f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p0.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28559x0 implements InterfaceC39033f, InterfaceC39030c {

    /* JADX INFO: renamed from: w */
    public final C39034g f115543w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39030c f115544x;

    /* JADX INFO: renamed from: y */
    public final C0059w0 f115545y;

    public C28559x0(InterfaceC39033f interfaceC39033f, Map map, InterfaceC39030c interfaceC39030c) {
        C26944e0 c26944e0 = new C26944e0(interfaceC39033f, 22);
        C28674u2 c28674u2 = AbstractC39035h.f168004a;
        this.f115543w = new C39034g(map, c26944e0);
        this.f115544x = interfaceC39030c;
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        this.f115545y = new C0059w0();
    }

    @Override // p634y1.InterfaceC39030c
    /* JADX INFO: renamed from: a */
    public final void mo86874a(Object obj) {
        this.f115544x.mo86874a(obj);
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: b */
    public final InterfaceC39032e mo7445b(InterfaceC4339a interfaceC4339a, String str) {
        return this.f115543w.mo7445b(interfaceC4339a, str);
    }

    @Override // p634y1.InterfaceC39030c
    /* JADX INFO: renamed from: c */
    public final void mo86875c(Object obj, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-858296452);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            this.f115544x.mo86875c(obj, c37816b, c28655q, i14 & 126);
            boolean zM87157i = c28655q.m87157i(this) | c28655q.m87157i(obj);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C27050m(15, this, obj);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(obj, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(this, obj, c37816b, i13, 11);
        }
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: d */
    public final boolean mo7446d(Object obj) {
        return this.f115543w.mo7446d(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: e */
    public final Map mo7447e() {
        C0059w0 c0059w0 = this.f115545y;
        Object[] objArr = c0059w0.f178b;
        long[] jArr = c0059w0.f177a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            this.f115544x.mo86874a(objArr[(i13 << 3) + i15]);
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return this.f115543w.mo7447e();
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: f */
    public final Object mo7448f(String str) {
        return this.f115543w.mo7448f(str);
    }
}
