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

/* JADX INFO: renamed from: p1.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28633k1 extends AbstractC39948a0 implements Parcelable, InterfaceC39965n {
    public static final Parcelable.Creator<C28633k1> CREATOR = new C28629j1();

    /* JADX INFO: renamed from: x */
    public final InterfaceC28650o2 f115818x;

    /* JADX INFO: renamed from: y */
    public C28646n2 f115819y;

    public C28633k1(Object obj, InterfaceC28650o2 interfaceC28650o2) {
        this.f115818x = interfaceC28650o2;
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        C28646n2 c28646n2 = new C28646n2(abstractC39957fM128171k.mo128147g(), obj);
        if (!(abstractC39957fM128171k instanceof C39947a)) {
            c28646n2.f172420b = new C28646n2(1, obj);
        }
        this.f115819y = c28646n2;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f115819y;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: S */
    public final AbstractC39950b0 mo87020S(AbstractC39950b0 abstractC39950b0, AbstractC39950b0 abstractC39950b1, AbstractC39950b0 abstractC39950b2) {
        if (this.f115818x.mo87112a(((C28646n2) abstractC39950b1).f115859c, ((C28646n2) abstractC39950b2).f115859c)) {
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
        return new C26944e0(this, 25);
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return ((C28646n2) AbstractC39963l.m128180t(this.f115819y, this)).f115859c;
    }

    @Override // p668z1.InterfaceC39965n
    /* JADX INFO: renamed from: h */
    public final InterfaceC28650o2 mo87021h() {
        return this.f115818x;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: i */
    public final Object mo86981i() {
        return getValue();
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f115819y = (C28646n2) abstractC39950b0;
    }

    @Override // p390p1.InterfaceC28601c1
    public final void setValue(Object obj) {
        AbstractC39957f abstractC39957fM128171k;
        C28646n2 c28646n2 = (C28646n2) AbstractC39963l.m128169i(this.f115819y);
        if (this.f115818x.mo87112a(c28646n2.f115859c, obj)) {
            return;
        }
        C28646n2 c28646n3 = this.f115819y;
        synchronized (AbstractC39963l.f172462c) {
            abstractC39957fM128171k = AbstractC39963l.m128171k();
            ((C28646n2) AbstractC39963l.m128175o(c28646n3, this, abstractC39957fM128171k, c28646n2)).f115859c = obj;
        }
        AbstractC39963l.m128174n(abstractC39957fM128171k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C28646n2) AbstractC39963l.m128169i(this.f115819y)).f115859c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int i14;
        parcel.writeValue(getValue());
        C28676v0 c28676v0 = C28676v0.f115976y;
        InterfaceC28650o2 interfaceC28650o2 = this.f115818x;
        if (AbstractC22676k.m65745e(interfaceC28650o2, c28676v0)) {
            i14 = 0;
        } else if (AbstractC22676k.m65745e(interfaceC28650o2, C28676v0.f115974F)) {
            i14 = 1;
        } else {
            if (!AbstractC22676k.m65745e(interfaceC28650o2, C28676v0.f115977z)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i14 = 2;
        }
        parcel.writeInt(i14);
    }
}
