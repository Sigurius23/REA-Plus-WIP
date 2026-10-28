package p12;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p12.y */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"¨\u0006#"}, m65681d2 = {"Lp12/y;", "", "", "isLoading", "isError", "Lp12/d;", "displaying", "shouldShowSkip", "", "", "selectedCustomBehaviors", "<init>", "(ZZLp12/d;ZLjava/util/List;)V", "a", "(ZZLp12/d;ZLjava/util/List;)Lp12/y;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "f", "c", "Lp12/d;", "()Lp12/d;", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28735y {

    /* JADX INFO: renamed from: f */
    public static final int f116302f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28712d displaying;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldShowSkip;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> selectedCustomBehaviors;

    public C28735y(boolean z4, boolean z13, C28712d c28712d, boolean z14, List<String> selectedCustomBehaviors) {
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        this.isLoading = z4;
        this.isError = z13;
        this.displaying = c28712d;
        this.shouldShowSkip = z14;
        this.selectedCustomBehaviors = selectedCustomBehaviors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28735y m87469b(C28735y c28735y, boolean z4, boolean z13, C28712d c28712d, boolean z14, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c28735y.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c28735y.isError;
        }
        if ((i13 & 4) != 0) {
            c28712d = c28735y.displaying;
        }
        if ((i13 & 8) != 0) {
            z14 = c28735y.shouldShowSkip;
        }
        if ((i13 & 16) != 0) {
            list = c28735y.selectedCustomBehaviors;
        }
        List list2 = list;
        C28712d c28712d2 = c28712d;
        return c28735y.m87470a(z4, z13, c28712d2, z14, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C28735y m87470a(boolean isLoading, boolean isError, C28712d displaying, boolean shouldShowSkip, List<String> selectedCustomBehaviors) {
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        return new C28735y(isLoading, isError, displaying, shouldShowSkip, selectedCustomBehaviors);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C28712d getDisplaying() {
        return this.displaying;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m87472d() {
        return this.selectedCustomBehaviors;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldShowSkip() {
        return this.shouldShowSkip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28735y)) {
            return false;
        }
        C28735y c28735y = (C28735y) other;
        return this.isLoading == c28735y.isLoading && this.isError == c28735y.isError && AbstractC22676k.m65745e(this.displaying, c28735y.displaying) && this.shouldShowSkip == c28735y.shouldShowSkip && AbstractC22676k.m65745e(this.selectedCustomBehaviors, c28735y.selectedCustomBehaviors);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C28712d c28712d = this.displaying;
        return this.selectedCustomBehaviors.hashCode() + AbstractC2875y.m8289b((iM8289b + (c28712d == null ? 0 : c28712d.hashCode())) * 31, 31, this.shouldShowSkip);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C28712d c28712d = this.displaying;
        boolean z14 = this.shouldShowSkip;
        List<String> list = this.selectedCustomBehaviors;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("OnboardingStoryViewState(isLoading=", ", isError=", ", displaying=", z4, z13);
        sbM32002u.append(c28712d);
        sbM32002u.append(", shouldShowSkip=");
        sbM32002u.append(z14);
        sbM32002u.append(", selectedCustomBehaviors=");
        return AbstractC3855a.m11829m(sbM32002u, list, ")");
    }

    public /* synthetic */ C28735y(boolean z4, boolean z13, C28712d c28712d, boolean z14, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c28712d, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? C25271y.f99162w : list);
    }
}
