package p390p1;

import android.os.Parcel;
import android.os.Parcelable;
import no0.C26944e0;
import p668z1.AbstractC39948a0;
import p668z1.AbstractC39950b0;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39947a;
import p668z1.InterfaceC39965n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28621h1 extends AbstractC39948a0 implements Parcelable, InterfaceC28593a1, InterfaceC39965n {
    public static final Parcelable.Creator<C28621h1> CREATOR = new C28613f1(1);

    /* JADX INFO: renamed from: x */
    public C28638l2 f115779x;

    public C28621h1(int i13) {
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        C28638l2 c28638l2 = new C28638l2(abstractC39957fM128171k.mo128147g(), i13);
        if (!(abstractC39957fM128171k instanceof C39947a)) {
            c28638l2.f172420b = new C28638l2(1, i13);
        }
        this.f115779x = c28638l2;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f115779x;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: S */
    public final AbstractC39950b0 mo87020S(AbstractC39950b0 abstractC39950b0, AbstractC39950b0 abstractC39950b1, AbstractC39950b0 abstractC39950b2) {
        if (((C28638l2) abstractC39950b1).f115829c == ((C28638l2) abstractC39950b2).f115829c) {
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
        return new C26944e0(this, 23);
    }

    @Override // p668z1.InterfaceC39965n
    /* JADX INFO: renamed from: h */
    public final InterfaceC28650o2 mo87021h() {
        return C28676v0.f115974F;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: i */
    public final Object mo86981i() {
        return Integer.valueOf(m87024x());
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f115779x = (C28638l2) abstractC39950b0;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C28638l2) AbstractC39963l.m128169i(this.f115779x)).f115829c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(m87024x());
    }

    /* JADX INFO: renamed from: x */
    public final int m87024x() {
        return ((C28638l2) AbstractC39963l.m128180t(this.f115779x, this)).f115829c;
    }

    /* JADX INFO: renamed from: y */
    public final void m87025y(int i13) {
        AbstractC39957f abstractC39957fM128171k;
        C28638l2 c28638l2 = (C28638l2) AbstractC39963l.m128169i(this.f115779x);
        if (c28638l2.f115829c != i13) {
            C28638l2 c28638l3 = this.f115779x;
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                ((C28638l2) AbstractC39963l.m128175o(c28638l3, this, abstractC39957fM128171k, c28638l2)).f115829c = i13;
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        }
    }
}
