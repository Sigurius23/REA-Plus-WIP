package cd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;

/* JADX INFO: renamed from: cd1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4437a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17912w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicGalleryFragment f17913x;

    public /* synthetic */ C4437a(AtomicGalleryFragment atomicGalleryFragment, int i13) {
        this.f17912w = i13;
        this.f17913x = atomicGalleryFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f17912w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AtomicGalleryFragment.m21098A1(this.f17913x, composer, iIntValue);
            case 1:
                return AtomicGalleryFragment.m21186s1(this.f17913x, composer, iIntValue);
            case 2:
                return AtomicGalleryFragment.m21195x0(this.f17913x, composer, iIntValue);
            case 3:
                return AtomicGalleryFragment.m21178o1(this.f17913x, composer, iIntValue);
            case 4:
                return AtomicGalleryFragment.m21162g1(this.f17913x, composer, iIntValue);
            case 5:
                return AtomicGalleryFragment.m21170k1(this.f17913x, composer, iIntValue);
            case 6:
                return AtomicGalleryFragment.m21154c1(this.f17913x, composer, iIntValue);
            case 7:
                return AtomicGalleryFragment.m21187t0(this.f17913x, composer, iIntValue);
            default:
                return AtomicGalleryFragment.m21194w1(this.f17913x, composer, iIntValue);
        }
    }
}
