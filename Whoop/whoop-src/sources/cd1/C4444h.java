package cd1;

import c93.InterfaceC4339a;
import com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment;

/* JADX INFO: renamed from: cd1.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4444h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17929w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DesignShowcaseGalleryFragment f17930x;

    public /* synthetic */ C4444h(DesignShowcaseGalleryFragment designShowcaseGalleryFragment, int i13) {
        this.f17929w = i13;
        this.f17930x = designShowcaseGalleryFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f17929w) {
            case 0:
                return DesignShowcaseGalleryFragment.m21208F(this.f17930x);
            default:
                return DesignShowcaseGalleryFragment.m21211I(this.f17930x);
        }
    }
}
