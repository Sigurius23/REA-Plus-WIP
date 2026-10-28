package v10;

import com.stripe.android.payments.StripeBrowserLauncherActivity;
import p236j.C21062a;
import p236j.InterfaceC21063b;
import p599wz.AbstractC37747q;
import p599wz.C37751r0;
import p663yx.C39838b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: v10.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35540p implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151198w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f151199x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f151200y;

    public /* synthetic */ C35540p(int i13, Object obj, Object obj2) {
        this.f151198w = i13;
        this.f151199x = obj;
        this.f151200y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        int i13 = this.f151198w;
        Object obj2 = this.f151200y;
        Object obj3 = this.f151199x;
        switch (i13) {
            case 0:
                C21062a it = (C21062a) obj;
                int i14 = StripeBrowserLauncherActivity.f22350x;
                AbstractC22676k.m65750j(it, "it");
                ((StripeBrowserLauncherActivity) obj3).m16855o((C39838b) obj2);
                break;
            case 1:
                AbstractC37747q linkActivityResult = (AbstractC37747q) obj;
                AbstractC22676k.m65750j(linkActivityResult, "linkActivityResult");
                ((C37751r0) obj3).m121158a(linkActivityResult, (C22672i) obj2);
                break;
            default:
                AbstractC37747q linkActivityResult2 = (AbstractC37747q) obj;
                AbstractC22676k.m65750j(linkActivityResult2, "linkActivityResult");
                ((C37751r0) obj3).m121158a(linkActivityResult2, (Function1) obj2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C35540p(C37751r0 c37751r0, Function1 function1) {
        this.f151198w = 1;
        this.f151199x = c37751r0;
        this.f151200y = (C22672i) function1;
    }
}
