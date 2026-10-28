package i21;

import ah0.C0885f;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18491e0;
import p490t0.C33252i;
import p736sz0.AbstractC33207p;
import p736sz0.EnumC33185h1;
import y11.C39065r;

/* JADX INFO: renamed from: i21.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17994d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f69846E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f69847F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f69848G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69849w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69850x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69851y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f69852z;

    public /* synthetic */ C17994d(Modifier modifier, InterfaceC4339a interfaceC4339a, TextResource textResource, long j7, InterfaceC18002l interfaceC18002l, C39065r c39065r, int i13) {
        this.f69849w = i13;
        this.f69850x = modifier;
        this.f69851y = interfaceC4339a;
        this.f69852z = textResource;
        this.f69846E = j7;
        this.f69848G = interfaceC18002l;
        this.f69847F = c39065r;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69849w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17995e.m51618g((Modifier) this.f69850x, (InterfaceC4339a) this.f69851y, (TextResource) this.f69852z, this.f69846E, (InterfaceC18002l.c) this.f69848G, (C39065r) this.f69847F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18005o.m51689g((Modifier) this.f69850x, (InterfaceC4339a) this.f69851y, (TextResource) this.f69852z, this.f69846E, (InterfaceC18002l.e) this.f69848G, (C39065r) this.f69847F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC18491e0.m53441S0((C33252i) this.f69851y, (Modifier) this.f69850x, (Modifier) this.f69852z, (C0885f) this.f69848G, this.f69846E, (InterfaceC4351m) this.f69847F, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC33207p.m105304h((TextResource) this.f69852z, this.f69846E, (C2886a) this.f69850x, (TextResource) this.f69851y, (EnumC33185h1) this.f69848G, (C2886a) this.f69847F, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C17994d(TextResource textResource, long j7, C2886a c2886a, TextResource textResource2, EnumC33185h1 enumC33185h1, C2886a c2886a2) {
        this.f69849w = 3;
        this.f69852z = textResource;
        this.f69846E = j7;
        this.f69850x = c2886a;
        this.f69851y = textResource2;
        this.f69848G = enumC33185h1;
        this.f69847F = c2886a2;
    }

    public /* synthetic */ C17994d(C33252i c33252i, Modifier modifier, Modifier modifier2, C0885f c0885f, long j7, InterfaceC4351m interfaceC4351m) {
        this.f69849w = 2;
        this.f69851y = c33252i;
        this.f69850x = modifier;
        this.f69852z = modifier2;
        this.f69848G = c0885f;
        this.f69846E = j7;
        this.f69847F = interfaceC4351m;
    }
}
