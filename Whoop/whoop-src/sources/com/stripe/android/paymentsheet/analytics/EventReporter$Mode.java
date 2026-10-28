package com.stripe.android.paymentsheet.analytics;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.paymentsheet.analytics.EventReporter$Mode[], still in use, count: 1, list:
  (r0v1 com.stripe.android.paymentsheet.analytics.EventReporter$Mode[]) from 0x002a: INVOKE (r0v1 com.stripe.android.paymentsheet.analytics.EventReporter$Mode[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"com/stripe/android/paymentsheet/analytics/EventReporter$Mode", "", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "toString", "()Ljava/lang/String;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class EventReporter$Mode {
    Complete("complete"),
    Custom("custom"),
    Embedded("embedded");


    /* JADX INFO: renamed from: w */
    public final String f22386w;

    static {
        AbstractC15751g.m44468u(eventReporter$ModeArr);
    }

    public EventReporter$Mode(String str) {
        super(str, i);
        this.f22386w = str;
    }

    public static EventReporter$Mode valueOf(String str) {
        return (EventReporter$Mode) Enum.valueOf(EventReporter$Mode.class, str);
    }

    public static EventReporter$Mode[] values() {
        return (EventReporter$Mode[]) f22382E.clone();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.f22386w;
    }
}
