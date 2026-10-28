package t30;

import android.os.Parcel;
import android.os.Parcelable;
import m30.C24992h;
import p000.AbstractC11266d;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29919n;
import q30.C29920n0;
import q30.C29928r0;
import r30.C30897b;
import r30.C30900e;

/* JADX INFO: renamed from: t30.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C33517s implements Parcelable {
    public static final Parcelable.Creator<C33517s> CREATOR = new C32854e(6);

    /* JADX INFO: renamed from: E */
    public final C29928r0 f139922E;

    /* JADX INFO: renamed from: F */
    public final int f139923F;

    /* JADX INFO: renamed from: G */
    public final C29920n0 f139924G;

    /* JADX INFO: renamed from: w */
    public final C30900e f139925w;

    /* JADX INFO: renamed from: x */
    public final C30897b f139926x;

    /* JADX INFO: renamed from: y */
    public final C24992h f139927y;

    /* JADX INFO: renamed from: z */
    public final C29919n f139928z;

    public C33517s(C30900e cresData, C30897b creqData, C24992h uiCustomization, C29919n creqExecutorConfig, C29928r0 creqExecutorFactory, int i13, C29920n0 intentData) {
        AbstractC22676k.m65750j(cresData, "cresData");
        AbstractC22676k.m65750j(creqData, "creqData");
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        AbstractC22676k.m65750j(creqExecutorConfig, "creqExecutorConfig");
        AbstractC22676k.m65750j(creqExecutorFactory, "creqExecutorFactory");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f139925w = cresData;
        this.f139926x = creqData;
        this.f139927y = uiCustomization;
        this.f139928z = creqExecutorConfig;
        this.f139922E = creqExecutorFactory;
        this.f139923F = i13;
        this.f139924G = intentData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33517s)) {
            return false;
        }
        C33517s c33517s = (C33517s) obj;
        return AbstractC22676k.m65745e(this.f139925w, c33517s.f139925w) && AbstractC22676k.m65745e(this.f139926x, c33517s.f139926x) && AbstractC22676k.m65745e(this.f139927y, c33517s.f139927y) && AbstractC22676k.m65745e(this.f139928z, c33517s.f139928z) && AbstractC22676k.m65745e(this.f139922E, c33517s.f139922E) && this.f139923F == c33517s.f139923F && AbstractC22676k.m65745e(this.f139924G, c33517s.f139924G);
    }

    public final int hashCode() {
        return this.f139924G.hashCode() + AbstractC11266d.m30448b(this.f139923F, (this.f139922E.hashCode() + ((this.f139928z.hashCode() + ((this.f139927y.hashCode() + ((this.f139926x.hashCode() + (this.f139925w.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ChallengeViewArgs(cresData=" + this.f139925w + ", creqData=" + this.f139926x + ", uiCustomization=" + this.f139927y + ", creqExecutorConfig=" + this.f139928z + ", creqExecutorFactory=" + this.f139922E + ", timeoutMins=" + this.f139923F + ", intentData=" + this.f139924G + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f139925w.writeToParcel(dest, i13);
        this.f139926x.writeToParcel(dest, i13);
        dest.writeParcelable(this.f139927y, i13);
        this.f139928z.writeToParcel(dest, i13);
        dest.writeSerializable(this.f139922E);
        dest.writeInt(this.f139923F);
        this.f139924G.writeToParcel(dest, i13);
    }
}
