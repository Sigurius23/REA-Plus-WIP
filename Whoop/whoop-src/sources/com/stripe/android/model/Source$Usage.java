package com.stripe.android.model;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p499t9.C33623c0;
import p715kotlin.Metadata;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.model.Source$Usage[], still in use, count: 1, list:
  (r0v1 com.stripe.android.model.Source$Usage[]) from 0x001a: INVOKE (r0v1 com.stripe.android.model.Source$Usage[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"com/stripe/android/model/Source$Usage", "", "Lcom/stripe/android/model/Source$Usage;", "", "toString", "()Ljava/lang/String;", "t9/c0", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class Source$Usage {
    /* JADX INFO: Fake field, exist only in values array */
    Reusable("reusable"),
    /* JADX INFO: Fake field, exist only in values array */
    SingleUse("single_use");


    /* JADX INFO: renamed from: x */
    public static final C33623c0 f22222x = new C33623c0();

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f22224z = AbstractC15751g.m44468u(new Source$Usage[]{new Source$Usage("reusable"), new Source$Usage("single_use")});

    /* JADX INFO: renamed from: w */
    public final String f22225w;

    static {
    }

    public Source$Usage(String str) {
        super(str, i);
        this.f22225w = str;
    }

    public static Source$Usage valueOf(String str) {
        return (Source$Usage) Enum.valueOf(Source$Usage.class, str);
    }

    public static Source$Usage[] values() {
        return (Source$Usage[]) f22223y.clone();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.f22225w;
    }
}
