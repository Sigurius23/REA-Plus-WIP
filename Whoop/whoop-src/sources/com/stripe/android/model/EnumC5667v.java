package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.model.v[], still in use, count: 1, list:
  (r0v1 com.stripe.android.model.v[]) from 0x0040: INVOKE (r0v1 com.stripe.android.model.v[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.stripe.android.model.v */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC5667v implements Parcelable {
    Unknown(""),
    LinkAuthToken("link_auth_token"),
    SignUp("signup"),
    /* JADX INFO: Fake field, exist only in values array */
    Email(NotificationCompat.CATEGORY_EMAIL),
    Sms("sms");


    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ C33617b f22269H;

    /* JADX INFO: renamed from: w */
    public final String f22273w;

    /* JADX INFO: renamed from: x */
    public static final C5665t f22270x = new C5665t();
    public static final Parcelable.Creator<EnumC5667v> CREATOR = new C5666u();

    static {
        f22269H = AbstractC15751g.m44468u(new EnumC5667v[]{r0, r1, r2, r3, r4});
    }

    public EnumC5667v(String str) {
        super(str, i);
        this.f22273w = str;
    }

    public static EnumC5667v valueOf(String str) {
        return (EnumC5667v) Enum.valueOf(EnumC5667v.class, str);
    }

    public static EnumC5667v[] values() {
        return (EnumC5667v[]) f22268G.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(name());
    }
}
