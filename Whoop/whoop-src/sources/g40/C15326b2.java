package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.model.ParagraphInsets;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p095dp.AbstractC12240d;
import p12.AbstractC28722l;
import p164g2.C15247s;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g40.b2 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15326b2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f57584E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f57585F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f57586G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f57587H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f57588I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC23459e f57589J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC23459e f57590K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f57591L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57592w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f57593x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f57594y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f57595z;

    public /* synthetic */ C15326b2(boolean z4, int i13, int i14, ParagraphInsets paragraphInsets, boolean z13, boolean z14, C3927k c3927k, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i15) {
        this.f57593x = z4;
        this.f57594y = i13;
        this.f57595z = i14;
        this.f57587H = paragraphInsets;
        this.f57584E = z13;
        this.f57585F = z14;
        this.f57588I = c3927k;
        this.f57589J = function1;
        this.f57590K = interfaceC4339a;
        this.f57591L = interfaceC4339a2;
        this.f57586G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57592w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC12240d.m34070g(this.f57593x, (C15454z1) this.f57587H, (Modifier) this.f57588I, (InterfaceC4351m) this.f57589J, this.f57584E, this.f57585F, (C15247s) this.f57591L, (InterfaceC4351m) this.f57590K, this.f57594y, (Composer) obj, AbstractC28683x.m87244L(this.f57595z | 1), this.f57586G);
                return C23454a0.f92919a;
            default:
                return AbstractC28722l.m87370g(this.f57593x, this.f57594y, this.f57595z, (ParagraphInsets) this.f57587H, this.f57584E, this.f57585F, (C3927k) this.f57588I, (Function1) this.f57589J, (InterfaceC4339a) this.f57590K, (InterfaceC4339a) this.f57591L, this.f57586G, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C15326b2(boolean z4, C15454z1 c15454z1, Modifier modifier, InterfaceC4351m interfaceC4351m, boolean z13, boolean z14, C15247s c15247s, InterfaceC4351m interfaceC4351m2, int i13, int i14, int i15) {
        this.f57593x = z4;
        this.f57587H = c15454z1;
        this.f57588I = modifier;
        this.f57589J = interfaceC4351m;
        this.f57584E = z13;
        this.f57585F = z14;
        this.f57591L = c15247s;
        this.f57590K = interfaceC4351m2;
        this.f57594y = i13;
        this.f57595z = i14;
        this.f57586G = i15;
    }
}
