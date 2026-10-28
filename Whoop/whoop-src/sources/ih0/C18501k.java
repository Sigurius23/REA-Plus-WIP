package ih0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p390p1.AbstractC28683x;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ih0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18501k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f72062E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f72063F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f72064G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f72065H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f72066I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f72067J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC23459e f72068K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72069w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f72070x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f72071y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f72072z;

    public /* synthetic */ C18501k(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, int i14) {
        this.f72070x = str;
        this.f72067J = c29891y;
        this.f72068K = function1;
        this.f72065H = i13;
        this.f72071y = z4;
        this.f72062E = z13;
        this.f72063F = z14;
        this.f72064G = z15;
        this.f72072z = interfaceC4339a;
        this.f72066I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72069w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18502l.m53576W(this.f72070x, (C29891y) this.f72067J, (Function1) this.f72068K, this.f72065H, this.f72071y, this.f72062E, this.f72063F, this.f72064G, this.f72072z, this.f72066I, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                AbstractC20301a.m56341i(this.f72070x, this.f72071y, this.f72072z, (Modifier) this.f72067J, this.f72062E, this.f72063F, this.f72064G, (InterfaceC4339a) this.f72068K, (Composer) obj, AbstractC28683x.m87244L(this.f72065H | 1), this.f72066I);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C18501k(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f72070x = str;
        this.f72071y = z4;
        this.f72072z = interfaceC4339a;
        this.f72067J = modifier;
        this.f72062E = z13;
        this.f72063F = z14;
        this.f72064G = z15;
        this.f72068K = interfaceC4339a2;
        this.f72065H = i13;
        this.f72066I = i14;
    }
}
