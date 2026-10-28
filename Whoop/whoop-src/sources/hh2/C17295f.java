package hh2;

import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hh2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lhh2/f;", "", "", "isEnabled", "toggleSuccess", "isToggleError", "", "Lhh2/b;", "hiddenMetrics", "<init>", "(ZZZLjava/util/List;)V", "a", "(ZZZLjava/util/List;)Lhh2/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "f", "Ljava/util/List;", "()Ljava/util/List;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17295f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean toggleSuccess;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isToggleError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C17291b> hiddenMetrics;

    public C17295f(boolean z4, boolean z13, boolean z14, List<C17291b> hiddenMetrics) {
        AbstractC22676k.m65750j(hiddenMetrics, "hiddenMetrics");
        this.isEnabled = z4;
        this.toggleSuccess = z13;
        this.isToggleError = z14;
        this.hiddenMetrics = hiddenMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17295f m48976b(C17295f c17295f, boolean z4, boolean z13, boolean z14, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c17295f.isEnabled;
        }
        if ((i13 & 2) != 0) {
            z13 = c17295f.toggleSuccess;
        }
        if ((i13 & 4) != 0) {
            z14 = c17295f.isToggleError;
        }
        if ((i13 & 8) != 0) {
            list = c17295f.hiddenMetrics;
        }
        return c17295f.m48977a(z4, z13, z14, list);
    }

    /* JADX INFO: renamed from: a */
    public final C17295f m48977a(boolean isEnabled, boolean toggleSuccess, boolean isToggleError, List<C17291b> hiddenMetrics) {
        AbstractC22676k.m65750j(hiddenMetrics, "hiddenMetrics");
        return new C17295f(isEnabled, toggleSuccess, isToggleError, hiddenMetrics);
    }

    /* JADX INFO: renamed from: c */
    public final List<C17291b> m48978c() {
        return this.hiddenMetrics;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getToggleSuccess() {
        return this.toggleSuccess;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17295f)) {
            return false;
        }
        C17295f c17295f = (C17295f) other;
        return this.isEnabled == c17295f.isEnabled && this.toggleSuccess == c17295f.toggleSuccess && this.isToggleError == c17295f.isToggleError && AbstractC22676k.m65745e(this.hiddenMetrics, c17295f.hiddenMetrics);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsToggleError() {
        return this.isToggleError;
    }

    public int hashCode() {
        return this.hiddenMetrics.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isEnabled) * 31, 31, this.toggleSuccess), 31, this.isToggleError);
    }

    public String toString() {
        boolean z4 = this.isEnabled;
        boolean z13 = this.toggleSuccess;
        boolean z14 = this.isToggleError;
        List<C17291b> list = this.hiddenMetrics;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StealthModeScreenViewState(isEnabled=", ", toggleSuccess=", ", isToggleError=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", hiddenMetrics=");
        sbM32002u.append(list);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C17295f(boolean z4, boolean z13, boolean z14, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
