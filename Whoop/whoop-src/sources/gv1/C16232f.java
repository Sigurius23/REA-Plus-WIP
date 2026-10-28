package gv1;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import c93.InterfaceC4339a;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.view.navigation.ProfileNavHostKt;
import p114eb.C12982q;
import p179h.C16351i;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: gv1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16232f implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f61675E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f61676F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f61677G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f61678H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f61679I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61680w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f61681x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f61682y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f61683z;

    public /* synthetic */ C16232f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i13) {
        this.f61680w = i13;
        this.f61681x = obj;
        this.f61682y = obj2;
        this.f61683z = obj3;
        this.f61675E = obj4;
        this.f61676F = obj5;
        this.f61677G = obj6;
        this.f61678H = obj7;
        this.f61679I = obj8;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f61680w) {
            case 0:
                return AbstractC16233g.m45952I((C16351i) this.f61681x, (Context) this.f61682y, (Function1) this.f61683z, (InterfaceC4339a) this.f61675E, (InterfaceC28601c1) this.f61676F, (InterfaceC28601c1) this.f61677G, (InterfaceC28601c1) this.f61678H, (InterfaceC28601c1) this.f61679I, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return ProfileNavHostKt.ProfileNavHost$lambda$0$0$0((ProfileNavigationRouter) this.f61681x, (ProfileActionRouter) this.f61682y, (InterfaceC34116n) this.f61683z, (String) this.f61675E, (Integer) this.f61676F, (Integer) this.f61677G, (String) this.f61678H, (AbstractActivityC1340r0) this.f61679I, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
