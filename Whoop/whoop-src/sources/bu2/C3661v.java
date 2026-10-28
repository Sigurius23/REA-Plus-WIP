package bu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import i21.AbstractC17993c;
import i21.AbstractC17995e;
import i21.AbstractC18004n;
import i21.AbstractC18005o;
import i21.InterfaceC18002l;
import p715kotlin.jvm.functions.Function1;
import y11.C39065r;

/* JADX INFO: renamed from: bu2.v */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3661v implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14895E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14896F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f14897G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f14898H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f14899I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14900w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f14901x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f14902y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f14903z;

    public /* synthetic */ C3661v(long j7, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Modifier modifier, int i13, int i14) {
        this.f14900w = 0;
        this.f14902y = j7;
        this.f14903z = function1;
        this.f14897G = function2;
        this.f14898H = function3;
        this.f14899I = interfaceC4351m;
        this.f14901x = modifier;
        this.f14895E = i13;
        this.f14896F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14900w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3663x.m11321y(this.f14902y, (Function1) this.f14903z, (Function1) this.f14897G, (Function1) this.f14898H, (InterfaceC4351m) this.f14899I, this.f14901x, this.f14895E, this.f14896F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17993c.m51607k(this.f14901x, (TextResource) this.f14897G, this.f14902y, (C39065r) this.f14898H, (InterfaceC18002l.a) this.f14899I, (Function1) this.f14903z, this.f14895E, this.f14896F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC17995e.m51620i(this.f14901x, (TextResource) this.f14903z, this.f14902y, (C39065r) this.f14897G, (InterfaceC18002l.c) this.f14898H, (InterfaceC4339a) this.f14899I, this.f14895E, this.f14896F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC18004n.m51678n(this.f14901x, (TextResource) this.f14897G, this.f14902y, (C39065r) this.f14898H, (InterfaceC18002l.d) this.f14899I, (Function1) this.f14903z, this.f14895E, this.f14896F, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC18005o.m51691i(this.f14901x, (TextResource) this.f14903z, this.f14902y, (C39065r) this.f14897G, (InterfaceC18002l.e) this.f14898H, (InterfaceC4339a) this.f14899I, this.f14895E, this.f14896F, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C3661v(Modifier modifier, TextResource textResource, long j7, C39065r c39065r, InterfaceC18002l interfaceC18002l, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f14900w = i15;
        this.f14901x = modifier;
        this.f14903z = textResource;
        this.f14902y = j7;
        this.f14897G = c39065r;
        this.f14898H = interfaceC18002l;
        this.f14899I = interfaceC4339a;
        this.f14895E = i13;
        this.f14896F = i14;
    }

    public /* synthetic */ C3661v(Modifier modifier, TextResource textResource, long j7, C39065r c39065r, InterfaceC18002l interfaceC18002l, Function1 function1, int i13, int i14, int i15) {
        this.f14900w = i15;
        this.f14901x = modifier;
        this.f14897G = textResource;
        this.f14902y = j7;
        this.f14898H = c39065r;
        this.f14899I = interfaceC18002l;
        this.f14903z = function1;
        this.f14895E = i13;
        this.f14896F = i14;
    }
}
