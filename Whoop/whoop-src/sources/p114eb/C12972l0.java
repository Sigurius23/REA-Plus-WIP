package p114eb;

import android.os.Bundle;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12972l0 implements Comparable {

    /* JADX INFO: renamed from: E */
    public final boolean f44802E;

    /* JADX INFO: renamed from: F */
    public final int f44803F;

    /* JADX INFO: renamed from: w */
    public final C12977n0 f44804w;

    /* JADX INFO: renamed from: x */
    public final Bundle f44805x;

    /* JADX INFO: renamed from: y */
    public final boolean f44806y;

    /* JADX INFO: renamed from: z */
    public final int f44807z;

    public C12972l0(C12977n0 c12977n0, Bundle bundle, boolean z4, int i13, boolean z13, int i14) {
        this.f44804w = c12977n0;
        this.f44805x = bundle;
        this.f44806y = z4;
        this.f44807z = i13;
        this.f44802E = z13;
        this.f44803F = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12972l0 other) {
        AbstractC22676k.m65750j(other, "other");
        boolean z4 = other.f44802E;
        boolean z13 = other.f44806y;
        Bundle bundle = other.f44805x;
        boolean z14 = this.f44806y;
        if (z14 && !z13) {
            return 1;
        }
        if (!z14 && z13) {
            return -1;
        }
        int i13 = this.f44807z - other.f44807z;
        if (i13 > 0) {
            return 1;
        }
        if (i13 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f44805x;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC22676k.m65747g(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z15 = this.f44802E;
        if (z15 && !z4) {
            return 1;
        }
        if (z15 || !z4) {
            return this.f44803F - other.f44803F;
        }
        return -1;
    }
}
