package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32417h;

/* JADX INFO: renamed from: b30.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2651x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f10355E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f10356w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2602q f10357x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10358y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f10359z;

    public C2651x(boolean z4, C2602q c2602q, List list, Function1 function1, int i13) {
        this.f10356w = z4;
        this.f10357x = c2602q;
        this.f10358y = list;
        this.f10359z = function1;
        this.f10355E = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else if (this.f10356w) {
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(560018665);
                AbstractC32417h.m101195d(this.f10357x, this.f10358y, this.f10359z, c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(560264433);
                AbstractC11894a.m31961j(this.f10355E, null, C2299e.f9102E, C2314t.f9131w, c28655q3, 3504);
                c28655q3.m87173q(false);
            }
        } else if (this.f10356w) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(560018665);
            AbstractC32417h.m101195d(this.f10357x, this.f10358y, this.f10359z, c28655q4, 0);
            c28655q4.m87173q(false);
        } else {
            C28655q c28655q5 = (C28655q) composer;
            c28655q5.m87150e0(560264433);
            AbstractC11894a.m31961j(this.f10355E, null, C2299e.f9102E, C2314t.f9131w, c28655q5, 3504);
            c28655q5.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
