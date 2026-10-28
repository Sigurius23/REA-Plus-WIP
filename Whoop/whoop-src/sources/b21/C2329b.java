package b21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import nz0.AbstractC27304c;
import nz0.C27303b;
import p077d0.C11421z1;
import p132f0.C13825t;
import p208i2.InterfaceC17869a1;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import se.AbstractC32410a;

/* JADX INFO: renamed from: b21.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2329b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9238E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f9239F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f9240G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f9241H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f9242I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9243w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f9244x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9245y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f9246z;

    public /* synthetic */ C2329b(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, boolean z4, long j7, C13825t c13825t, C37816b c37816b, int i13, int i14) {
        this.f9244x = modifier;
        this.f9240G = interfaceC17869a1;
        this.f9245y = z4;
        this.f9246z = j7;
        this.f9241H = c13825t;
        this.f9242I = c37816b;
        this.f9238E = i13;
        this.f9239F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9243w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2331d.m7187l((C11421z1) this.f9240G, this.f9244x, (List) this.f9241H, this.f9246z, this.f9245y, (C23465k) this.f9242I, this.f9238E, this.f9239F, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC32410a.m101046p(this.f9244x, (InterfaceC17869a1) this.f9240G, this.f9245y, this.f9246z, (C13825t) this.f9241H, (C37816b) this.f9242I, (Composer) obj, AbstractC28683x.m87244L(this.f9238E | 1), this.f9239F);
                return C23454a0.f92919a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27304c.m82404i(this.f9244x, (C27303b) this.f9240G, (TextResource) this.f9241H, this.f9246z, (InterfaceC4339a) this.f9242I, this.f9245y, this.f9238E, this.f9239F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C2329b(Modifier modifier, C27303b c27303b, TextResource textResource, long j7, InterfaceC4339a interfaceC4339a, boolean z4, int i13, int i14) {
        this.f9244x = modifier;
        this.f9240G = c27303b;
        this.f9241H = textResource;
        this.f9246z = j7;
        this.f9242I = interfaceC4339a;
        this.f9245y = z4;
        this.f9238E = i13;
        this.f9239F = i14;
    }

    public /* synthetic */ C2329b(C11421z1 c11421z1, Modifier modifier, List list, long j7, boolean z4, C23465k c23465k, int i13, int i14) {
        this.f9240G = c11421z1;
        this.f9244x = modifier;
        this.f9241H = list;
        this.f9246z = j7;
        this.f9245y = z4;
        this.f9242I = c23465k;
        this.f9238E = i13;
        this.f9239F = i14;
    }
}
