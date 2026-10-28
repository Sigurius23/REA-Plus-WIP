package io.sentry.android.fragment;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.sentry.android.fragment.b, still in use, count: 1, list:
  (r0v0 io.sentry.android.fragment.b) from 0x0099: INVOKE (r11v5 java.util.HashSet), (r0v0 io.sentry.android.fragment.b) VIRTUAL call: java.util.HashSet.add(java.lang.Object):boolean A[MD:(E):boolean (c)]
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
/* JADX INFO: renamed from: io.sentry.android.fragment.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC20174b {
    ATTACHED("attached"),
    SAVE_INSTANCE_STATE("save instance state"),
    CREATED(AnalyticsRequestV2.PARAM_CREATED),
    VIEW_CREATED("view created"),
    STARTED("started"),
    RESUMED("resumed"),
    PAUSED("paused"),
    STOPPED("stopped"),
    VIEW_DESTROYED("view destroyed"),
    DESTROYED("destroyed"),
    DETACHED("detached");

    private static final Set<EnumC20174b> states;
    private final String breadcrumbName;
    public static final C20173a Companion = new C20173a();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new EnumC20174b("attached"));
        hashSet.add(new EnumC20174b("save instance state"));
        hashSet.add(new EnumC20174b(AnalyticsRequestV2.PARAM_CREATED));
        hashSet.add(new EnumC20174b("view created"));
        hashSet.add(new EnumC20174b("started"));
        hashSet.add(new EnumC20174b("resumed"));
        hashSet.add(new EnumC20174b("paused"));
        hashSet.add(new EnumC20174b("stopped"));
        hashSet.add(new EnumC20174b("view destroyed"));
        hashSet.add(new EnumC20174b("destroyed"));
        hashSet.add(new EnumC20174b("detached"));
        states = hashSet;
    }

    private EnumC20174b(String str) {
        super(str, i);
        this.breadcrumbName = str;
    }

    public static EnumC20174b valueOf(String str) {
        return (EnumC20174b) Enum.valueOf(EnumC20174b.class, str);
    }

    public static EnumC20174b[] values() {
        return (EnumC20174b[]) $VALUES.clone();
    }

    public final String getBreadcrumbName$sentry_android_fragment_release() {
        return this.breadcrumbName;
    }
}
