package q52;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import lh3.C24082e;
import p404pq.AbstractC29455c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xg3.C38280g;

/* JADX INFO: renamed from: q52.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lq52/b;", "Lpq/c;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "behavior", "<init>", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lxg3/g;", "", "d", "()Lxg3/g;", "bottomSheet", "", "slideOffset", "Ll83/a0;", "b", "(Landroid/view/View;F)V", "newState", "c", "(Landroid/view/View;I)V", "Llh3/e;", "a", "Llh3/e;", "state", "slide", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29984b extends AbstractC29455c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24082e state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24082e slide;

    public C29984b(BottomSheetBehavior<View> behavior) {
        AbstractC22676k.m65750j(behavior, "behavior");
        this.state = C24082e.m71000Y();
        this.slide = C24082e.m71000Y();
        behavior.m15690I(this);
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: b */
    public void mo5841b(View bottomSheet, float slideOffset) {
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.slide.onNext(Float.valueOf(slideOffset));
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: c */
    public void mo5842c(View bottomSheet, int newState) {
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.state.onNext(Integer.valueOf(newState));
    }

    /* JADX INFO: renamed from: d */
    public final C38280g<Integer> m91708d() {
        return this.state;
    }
}
