package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.DebugFragment;

/* JADX INFO: renamed from: ea2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12894a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44390w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DebugFragment f44391x;

    public /* synthetic */ C12894a(DebugFragment debugFragment, int i13) {
        this.f44390w = i13;
        this.f44391x = debugFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f44390w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return DebugFragment.m24942b4(this.f44391x, composer, iIntValue);
            default:
                return DebugFragment.m24947c4(this.f44391x, composer, iIntValue);
        }
    }
}
