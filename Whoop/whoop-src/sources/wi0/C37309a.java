package wi0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.archv2.feature.view.playground.PlaygroundFragment;

/* JADX INFO: renamed from: wi0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37309a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159525w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PlaygroundFragment f159526x;

    public /* synthetic */ C37309a(PlaygroundFragment playgroundFragment, int i13) {
        this.f159525w = i13;
        this.f159526x = playgroundFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f159525w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return PlaygroundFragment.m18078F(this.f159526x, (Composer) obj, iIntValue);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return PlaygroundFragment.m18079G(this.f159526x, (String) obj, zBooleanValue);
        }
    }
}
