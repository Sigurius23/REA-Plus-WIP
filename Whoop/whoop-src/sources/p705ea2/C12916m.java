package p705ea2;

import com.whoop.settings.SettingsLandingFragment;
import java.util.List;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import y71.C39282o;

/* JADX INFO: renamed from: ea2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12916m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44440w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f44441x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f44442y;

    public /* synthetic */ C12916m(int i13, Object obj, Object obj2) {
        this.f44440w = i13;
        this.f44441x = obj;
        this.f44442y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44440w) {
            case 0:
                return AbstractC42783n.a.m36364h((InterfaceC28601c1) this.f44441x, (InterfaceC28601c1) this.f44442y, (List) obj);
            default:
                return SettingsLandingFragment.m25098F2((C39282o) this.f44441x, (SettingsLandingFragment) this.f44442y, obj);
        }
    }
}
