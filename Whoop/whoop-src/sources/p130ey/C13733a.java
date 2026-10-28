package p130ey;

import com.whoop.healthconnect.view.HealthConnectFragment;
import java.util.Set;
import p159fy.C14859d;
import p236j.InterfaceC21063b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ey.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C13733a implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48995w;

    public /* synthetic */ C13733a(int i13) {
        this.f48995w = i13;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        switch (this.f48995w) {
            case 0:
                C14859d it = (C14859d) obj;
                AbstractC22676k.m65750j(it, "it");
                break;
            default:
                HealthConnectFragment.m21560N((Set) obj);
                break;
        }
    }
}
