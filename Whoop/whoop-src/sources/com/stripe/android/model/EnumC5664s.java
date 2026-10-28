package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import io.getstream.chat.android.models.MessageType;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.model.s[], still in use, count: 1, list:
  (r0v1 com.stripe.android.model.s[]) from 0x0048: INVOKE (r0v1 com.stripe.android.model.s[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: com.stripe.android.model.s */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC5664s implements Parcelable {
    Unknown(""),
    Started("started"),
    /* JADX INFO: Fake field, exist only in values array */
    Failed(MessageType.FAILED),
    Verified("verified"),
    /* JADX INFO: Fake field, exist only in values array */
    Canceled("canceled"),
    /* JADX INFO: Fake field, exist only in values array */
    Expired("expired");


    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ C33617b f22261G;

    /* JADX INFO: renamed from: w */
    public final String f22265w;

    /* JADX INFO: renamed from: x */
    public static final C5662q f22262x = new C5662q();
    public static final Parcelable.Creator<EnumC5664s> CREATOR = new C5663r();

    static {
        f22261G = AbstractC15751g.m44468u(new EnumC5664s[]{r0, r1, r2, r3, new EnumC5664s("canceled"), new EnumC5664s("expired")});
    }

    public EnumC5664s(String str) {
        super(str, i);
        this.f22265w = str;
    }

    public static EnumC5664s valueOf(String str) {
        return (EnumC5664s) Enum.valueOf(EnumC5664s.class, str);
    }

    public static EnumC5664s[] values() {
        return (EnumC5664s[]) f22260F.clone();
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
