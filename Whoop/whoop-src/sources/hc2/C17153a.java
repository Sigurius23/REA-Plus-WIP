package hc2;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hc2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhc2/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "", "isCancelLayoutVisible", "isPauseLayoutVisible", "isResumeLayoutVisible", "", "a", "(ZZZ)Ljava/lang/String;", "isHeaderLoadingOrVisible", "isPauseInfoLoading", "source", "Ll83/a0;", "b", "(ZZZZZLjava/lang/String;)V", "Lfi0/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17153a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C17153a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m48406a(boolean isCancelLayoutVisible, boolean isPauseLayoutVisible, boolean isResumeLayoutVisible) {
        if (isCancelLayoutVisible && !isPauseLayoutVisible && !isResumeLayoutVisible) {
            return "Cancel Button Available";
        }
        if (!isCancelLayoutVisible && isPauseLayoutVisible && !isResumeLayoutVisible) {
            return "Pause Button Available";
        }
        if (!isCancelLayoutVisible && !isPauseLayoutVisible && isResumeLayoutVisible) {
            return "Unpause Button Available";
        }
        if (isCancelLayoutVisible && isPauseLayoutVisible && !isResumeLayoutVisible) {
            return "Cancel and Pause Button Available";
        }
        if (isCancelLayoutVisible && !isPauseLayoutVisible && isResumeLayoutVisible) {
            return "Cancel and Unpause Button Available";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48407b(boolean isHeaderLoadingOrVisible, boolean isPauseInfoLoading, boolean isCancelLayoutVisible, boolean isPauseLayoutVisible, boolean isResumeLayoutVisible, String source) {
        if (isHeaderLoadingOrVisible || isPauseInfoLoading) {
            return;
        }
        InterfaceC14515a.m41418i(this.baseAnalytics, m48406a(isCancelLayoutVisible, isPauseLayoutVisible, isResumeLayoutVisible), "Open", null, "Settings - My Account", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 20, null);
    }
}
