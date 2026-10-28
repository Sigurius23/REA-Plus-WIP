package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1733s2 {

    /* JADX INFO: renamed from: a */
    public int f6848a;

    /* JADX INFO: renamed from: b */
    public int f6849b;

    /* JADX INFO: renamed from: c */
    public boolean f6850c;

    /* JADX INFO: renamed from: d */
    public boolean f6851d;

    /* JADX INFO: renamed from: e */
    public boolean f6852e;

    /* JADX INFO: renamed from: f */
    public int[] f6853f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f6854g;

    public C1733s2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f6854g = staggeredGridLayoutManager;
        m5325a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5325a() {
        this.f6848a = -1;
        this.f6849b = Integer.MIN_VALUE;
        this.f6850c = false;
        this.f6851d = false;
        this.f6852e = false;
        int[] iArr = this.f6853f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
