package p390p1;

import android.os.Parcel;
import android.os.Parcelable;
import p668z1.AbstractC39948a0;
import p668z1.AbstractC39950b0;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39947a;
import p668z1.InterfaceC39965n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28617g1 extends AbstractC39948a0 implements Parcelable, InterfaceC28690z0, InterfaceC39965n {
    public static final Parcelable.Creator<C28617g1> CREATOR = new C28613f1(0);

    /* JADX INFO: renamed from: x */
    public C28634k2 f115773x;

    public C28617g1(float f13) {
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        C28634k2 c28634k2 = new C28634k2(abstractC39957fM128171k.mo128147g(), f13);
        if (!(abstractC39957fM128171k instanceof C39947a)) {
            c28634k2.f172420b = new C28634k2(1, f13);
        }
        this.f115773x = c28634k2;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f115773x;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: S */
    public final AbstractC39950b0 mo87020S(AbstractC39950b0 abstractC39950b0, AbstractC39950b0 abstractC39950b1, AbstractC39950b0 abstractC39950b2) {
        if (((C28634k2) abstractC39950b1).f115820c == ((C28634k2) abstractC39950b2).f115820c) {
            return abstractC39950b1;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: f */
    public final Function1 mo86980f() {
        return new C28630j2(this, 0);
    }

    @Override // p668z1.InterfaceC39965n
    /* JADX INFO: renamed from: h */
    public final InterfaceC28650o2 mo87021h() {
        return C28676v0.f115974F;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: i */
    public final Object mo86981i() {
        return Float.valueOf(m87022x());
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f115773x = (C28634k2) abstractC39950b0;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C28634k2) AbstractC39963l.m128169i(this.f115773x)).f115820c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeFloat(m87022x());
    }

    /* JADX INFO: renamed from: x */
    public final float m87022x() {
        return ((C28634k2) AbstractC39963l.m128180t(this.f115773x, this)).f115820c;
    }

    /* JADX INFO: renamed from: y */
    public final void m87023y(float f13) {
        AbstractC39957f abstractC39957fM128171k;
        C28634k2 c28634k2 = (C28634k2) AbstractC39963l.m128169i(this.f115773x);
        if (c28634k2.f115820c == f13) {
            return;
        }
        C28634k2 c28634k3 = this.f115773x;
        synchronized (AbstractC39963l.f172462c) {
            abstractC39957fM128171k = AbstractC39963l.m128171k();
            ((C28634k2) AbstractC39963l.m128175o(c28634k3, this, abstractC39957fM128171k, c28634k2)).f115820c = f13;
        }
        AbstractC39963l.m128174n(abstractC39957fM128171k, this);
    }
}
