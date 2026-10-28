package d20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC11266d;
import p023ay.C2125b;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p537ux.C35354r;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;
import y00.C38981v7;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: d20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C11496l implements Parcelable {
    public static final Parcelable.Creator<C11496l> CREATOR = new C2125b(20);

    /* JADX INFO: renamed from: E */
    public final C39857f f36961E;

    /* JADX INFO: renamed from: F */
    public final boolean f36962F;

    /* JADX INFO: renamed from: G */
    public final Integer f36963G;

    /* JADX INFO: renamed from: H */
    public final String f36964H;

    /* JADX INFO: renamed from: I */
    public final Set f36965I;

    /* JADX INFO: renamed from: w */
    public final C29926q0 f36966w;

    /* JADX INFO: renamed from: x */
    public final C35354r f36967x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC38802c8 f36968y;

    /* JADX INFO: renamed from: z */
    public final C38981v7 f36969z;

    public C11496l(C29926q0 sdkTransactionId, C35354r config, InterfaceC38802c8 stripeIntent, C38981v7 nextActionData, C39857f requestOptions, boolean z4, Integer num, String publishableKey, Set productUsage) {
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(nextActionData, "nextActionData");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f36966w = sdkTransactionId;
        this.f36967x = config;
        this.f36968y = stripeIntent;
        this.f36969z = nextActionData;
        this.f36961E = requestOptions;
        this.f36962F = z4;
        this.f36963G = num;
        this.f36964H = publishableKey;
        this.f36965I = productUsage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11496l)) {
            return false;
        }
        C11496l c11496l = (C11496l) obj;
        return AbstractC22676k.m65745e(this.f36966w, c11496l.f36966w) && AbstractC22676k.m65745e(this.f36967x, c11496l.f36967x) && AbstractC22676k.m65745e(this.f36968y, c11496l.f36968y) && AbstractC22676k.m65745e(this.f36969z, c11496l.f36969z) && AbstractC22676k.m65745e(this.f36961E, c11496l.f36961E) && this.f36962F == c11496l.f36962F && AbstractC22676k.m65745e(this.f36963G, c11496l.f36963G) && AbstractC22676k.m65745e(this.f36964H, c11496l.f36964H) && AbstractC22676k.m65745e(this.f36965I, c11496l.f36965I);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f36961E.hashCode() + ((this.f36969z.hashCode() + ((this.f36968y.hashCode() + ((this.f36967x.hashCode() + (this.f36966w.f122226w.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f36962F);
        Integer num = this.f36963G;
        return this.f36965I.hashCode() + AbstractC11266d.m30450d((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f36964H);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(sdkTransactionId=");
        sb4.append(this.f36966w);
        sb4.append(", config=");
        sb4.append(this.f36967x);
        sb4.append(", stripeIntent=");
        sb4.append(this.f36968y);
        sb4.append(", nextActionData=");
        sb4.append(this.f36969z);
        sb4.append(", requestOptions=");
        sb4.append(this.f36961E);
        sb4.append(", enableLogging=");
        sb4.append(this.f36962F);
        sb4.append(", statusBarColor=");
        AbstractC13673n.m38577x(this.f36963G, ", publishableKey=", this.f36964H, ", productUsage=", sb4);
        sb4.append(this.f36965I);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f36966w, i13);
        this.f36967x.writeToParcel(dest, i13);
        dest.writeParcelable(this.f36968y, i13);
        this.f36969z.writeToParcel(dest, i13);
        dest.writeParcelable(this.f36961E, i13);
        dest.writeInt(this.f36962F ? 1 : 0);
        Integer num = this.f36963G;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f36964H);
        Set set = this.f36965I;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }
}
