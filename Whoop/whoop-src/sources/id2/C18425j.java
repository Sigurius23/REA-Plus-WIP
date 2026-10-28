package id2;

import android.graphics.Bitmap;
import c93.InterfaceC4339a;
import i21.C18008r;
import kd1.C22401m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: id2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lid2/j;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "Lkotlin/Function0;", "a", "Lc93/a;", "getOnSnapshot$share_release", "()Lc93/a;", "e", "(Lc93/a;)V", "onSnapshot", "Lkd1/m;", "Lkd1/m;", "c", "()Lkd1/m;", "imageLoadTracker", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18425j {

    /* JADX INFO: renamed from: c */
    public static final int f71674c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC4339a onSnapshot = new C18008r(17);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22401m imageLoadTracker = new C22401m();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Bitmap m53043d() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m53044b() {
        return (Bitmap) this.onSnapshot.invoke();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22401m getImageLoadTracker() {
        return this.imageLoadTracker;
    }

    /* JADX INFO: renamed from: e */
    public final void m53046e(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.onSnapshot = interfaceC4339a;
    }
}
