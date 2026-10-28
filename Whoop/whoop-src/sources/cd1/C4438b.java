package cd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;

/* JADX INFO: renamed from: cd1.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4438b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17914w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicGalleryFragment f17915x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f17916y;

    public /* synthetic */ C4438b(AtomicGalleryFragment atomicGalleryFragment, int i13, int i14) {
        this.f17914w = i14;
        this.f17915x = atomicGalleryFragment;
        this.f17916y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f17914w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AtomicGalleryFragment.m21199y1(this.f17915x, this.f17916y, composer, iIntValue);
            case 1:
                return AtomicGalleryFragment.m21128P0(this.f17915x, this.f17916y, composer, iIntValue);
            case 2:
                return AtomicGalleryFragment.m21190u1(this.f17915x, this.f17916y, composer, iIntValue);
            case 3:
                return AtomicGalleryFragment.m21201z0(this.f17915x, this.f17916y, composer, iIntValue);
            case 4:
                return AtomicGalleryFragment.m21150a1(this.f17915x, this.f17916y, composer, iIntValue);
            case 5:
                return AtomicGalleryFragment.m21166i1(this.f17915x, this.f17916y, composer, iIntValue);
            case 6:
                return AtomicGalleryFragment.m21120L0(this.f17915x, this.f17916y, composer, iIntValue);
            case 7:
                return AtomicGalleryFragment.m21182q1(this.f17915x, this.f17916y, composer, iIntValue);
            case 8:
                return AtomicGalleryFragment.m21174m1(this.f17915x, this.f17916y, composer, iIntValue);
            case 9:
                return AtomicGalleryFragment.m21158e1(this.f17915x, this.f17916y, composer, iIntValue);
            default:
                return AtomicGalleryFragment.m21191v0(this.f17915x, this.f17916y, composer, iIntValue);
        }
    }
}
