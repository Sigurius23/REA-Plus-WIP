package androidx.recyclerview.widget;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1701k2 {

    /* JADX INFO: renamed from: a */
    public int f6721a;

    /* JADX INFO: renamed from: b */
    public int f6722b;

    /* JADX INFO: renamed from: c */
    public int f6723c;

    /* JADX INFO: renamed from: d */
    public int f6724d;

    /* JADX INFO: renamed from: e */
    public int f6725e;

    /* JADX INFO: renamed from: f */
    public boolean f6726f;

    /* JADX INFO: renamed from: g */
    public boolean f6727g;

    /* JADX INFO: renamed from: h */
    public boolean f6728h;

    /* JADX INFO: renamed from: i */
    public boolean f6729i;

    /* JADX INFO: renamed from: j */
    public boolean f6730j;

    /* JADX INFO: renamed from: k */
    public boolean f6731k;

    /* JADX INFO: renamed from: l */
    public int f6732l;

    /* JADX INFO: renamed from: m */
    public long f6733m;

    /* JADX INFO: renamed from: n */
    public int f6734n;

    /* JADX INFO: renamed from: a */
    public final void m5275a(int i13) {
        if ((this.f6724d & i13) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i13) + " but it is " + Integer.toBinaryString(this.f6724d));
    }

    /* JADX INFO: renamed from: b */
    public final int m5276b() {
        return this.f6727g ? this.f6722b - this.f6723c : this.f6725e;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State{mTargetPosition=");
        sb4.append(this.f6721a);
        sb4.append(", mData=null, mItemCount=");
        sb4.append(this.f6725e);
        sb4.append(", mIsMeasuring=");
        sb4.append(this.f6729i);
        sb4.append(", mPreviousLayoutItemCount=");
        sb4.append(this.f6722b);
        sb4.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb4.append(this.f6723c);
        sb4.append(", mStructureChanged=");
        sb4.append(this.f6726f);
        sb4.append(", mInPreLayout=");
        sb4.append(this.f6727g);
        sb4.append(", mRunSimpleAnimations=");
        sb4.append(this.f6730j);
        sb4.append(", mRunPredictiveAnimations=");
        return AbstractC2875y.m8305r(sb4, this.f6731k, '}');
    }
}
