package z82;

import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import java.util.LinkedHashMap;
import jk0.EnumC21747a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z82.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lz82/k;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ljk0/a;", "strapBodyStatus", "", "experimentVariant", "experimentName", "Ll83/a0;", "c", "(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V", "b", "a", "()V", "Lfi0/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40197k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: z82.k$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f173498a;

        static {
            int[] iArr = new int[EnumC21747a.values().length];
            try {
                iArr[EnumC21747a.STRAP_ON_BODY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21747a.STRAP_OFF_BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21747a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173498a = iArr;
        }
    }

    public C40197k(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m129080a() {
        this.analytics.mo41424f("Arrhythmia Notification", "Send", "Arrhythmia", "Push Notification");
    }

    /* JADX INFO: renamed from: b */
    public final void m129081b(EnumC21747a strapBodyStatus, String experimentVariant, String experimentName) {
        LinkedHashMap linkedHashMapM73993b0;
        String str;
        AbstractC22676k.m65750j(experimentName, "experimentName");
        if (experimentVariant != null) {
            int i13 = strapBodyStatus == null ? -1 : a.f173498a[strapBodyStatus.ordinal()];
            if (i13 == -1) {
                str = "unknown";
            } else if (i13 == 1) {
                str = "on_body";
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "unknown";
            } else {
                str = "off_body";
            }
            linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("strap_body_status", str), new C23465k("variant_name", AbstractC18489d0.m53370k(experimentVariant, "_", experimentName)));
        } else {
            linkedHashMapM73993b0 = null;
        }
        this.analytics.mo41428k("Sleep Coach", "Send", "Sleep Need", "Push Notification", linkedHashMapM73993b0);
    }

    /* JADX INFO: renamed from: c */
    public final void m129082c(EnumC21747a strapBodyStatus, String experimentVariant, String experimentName) {
        LinkedHashMap linkedHashMapM73993b0;
        String str;
        AbstractC22676k.m65750j(experimentName, "experimentName");
        if (experimentVariant != null) {
            int i13 = strapBodyStatus == null ? -1 : a.f173498a[strapBodyStatus.ordinal()];
            if (i13 == -1) {
                str = "unknown";
            } else if (i13 == 1) {
                str = "on_body";
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "unknown";
            } else {
                str = "off_body";
            }
            linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("strap_body_status", str), new C23465k("variant_name", AbstractC18489d0.m53370k(experimentVariant, "_", experimentName)));
        } else {
            linkedHashMapM73993b0 = null;
        }
        this.analytics.mo41428k("Stress Monitor EoD Notifications", "Send", "Stress Monitor", "Push Notification", linkedHashMapM73993b0);
    }
}
