package ld2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ld2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lld2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "a", "()V", "Lld2/b;", "buttonType", "b", "(Lld2/b;)V", "Lfi0/a;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23866a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: ld2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94385a;

        static {
            int[] iArr = new int[EnumC23867b.values().length];
            try {
                iArr[EnumC23867b.IFU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23867b.LEARN_ABOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23867b.REG_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94385a = iArr;
        }
    }

    public C23866a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m70120a() {
        this.analytics.mo41424f("learn_more", ProfileAnalyticsKt.VIEW, "learn_more_page", "ANF");
    }

    /* JADX INFO: renamed from: b */
    public final void m70121b(EnumC23867b buttonType) {
        String str;
        AbstractC22676k.m65750j(buttonType, "buttonType");
        int i13 = a.f94385a[buttonType.ordinal()];
        if (i13 == 1) {
            str = "IFU";
        } else if (i13 == 2) {
            str = "Learn_about";
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Reg_details";
        }
        this.analytics.mo41424f("learn_more", ProfileAnalyticsKt.VIEW, str, "ANF");
    }
}
