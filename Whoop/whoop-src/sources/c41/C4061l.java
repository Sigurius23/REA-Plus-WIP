package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import p715kotlin.jvm.functions.Function1;
import p741vn1.AbstractC36203g;
import un1.AbstractC35101g;

/* JADX INFO: renamed from: c41.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4061l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16493E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16494F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f16495G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f16496H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f16497I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f16498J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f16499K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16500w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f16501x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f16502y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16503z;

    public /* synthetic */ C4061l(TextResource textResource, C4082o c4082o, AbstractC4145x abstractC4145x, ActivityDetailType activityDetailType, boolean z4, EnumC4029g2 enumC4029g2, C9598e c9598e, Function1 function1, int i13, int i14) {
        this.f16494F = textResource;
        this.f16495G = c4082o;
        this.f16496H = abstractC4145x;
        this.f16497I = activityDetailType;
        this.f16501x = z4;
        this.f16498J = enumC4029g2;
        this.f16499K = c9598e;
        this.f16502y = function1;
        this.f16503z = i13;
        this.f16493E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16500w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4075n.m12508m((TextResource) this.f16494F, (C4082o) this.f16495G, (AbstractC4145x) this.f16496H, (ActivityDetailType) this.f16497I, this.f16501x, (EnumC4029g2) this.f16498J, (C9598e) this.f16499K, this.f16502y, this.f16503z, this.f16493E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35101g.m111020C((AbstractC36203g.c) this.f16494F, this.f16501x, (InterfaceC4339a) this.f16495G, this.f16502y, (InterfaceC4351m) this.f16496H, (Function1) this.f16497I, (InterfaceC4339a) this.f16498J, (Function1) this.f16499K, this.f16503z, this.f16493E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C4061l(AbstractC36203g.c cVar, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, int i13, int i14) {
        this.f16494F = cVar;
        this.f16501x = z4;
        this.f16495G = interfaceC4339a;
        this.f16502y = function1;
        this.f16496H = interfaceC4351m;
        this.f16497I = function2;
        this.f16498J = interfaceC4339a2;
        this.f16499K = function3;
        this.f16503z = i13;
        this.f16493E = i14;
    }
}
