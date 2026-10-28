package lf2;

import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001f"}, m65681d2 = {"Llf2/g;", "", "", "bottomSheetTitle", "sleepGoalButtonText", "", "Llf2/f;", "sleepGoalTypeList", "", "initialSelection", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSleepGoalButtonText", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "I", "e", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24014g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sleepGoalButtonText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C24013f> sleepGoalTypeList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int initialSelection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String helpIconLink;

    public C24014g(String bottomSheetTitle, String sleepGoalButtonText, List<C24013f> sleepGoalTypeList, int i13, String helpIconLink) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(sleepGoalButtonText, "sleepGoalButtonText");
        AbstractC22676k.m65750j(sleepGoalTypeList, "sleepGoalTypeList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.bottomSheetTitle = bottomSheetTitle;
        this.sleepGoalButtonText = sleepGoalButtonText;
        this.sleepGoalTypeList = sleepGoalTypeList;
        this.initialSelection = i13;
        this.helpIconLink = helpIconLink;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInitialSelection() {
        return this.initialSelection;
    }

    /* JADX INFO: renamed from: d */
    public final List<C24013f> m70837d() {
        return this.sleepGoalTypeList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24014g)) {
            return false;
        }
        C24014g c24014g = (C24014g) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c24014g.bottomSheetTitle) && AbstractC22676k.m65745e(this.sleepGoalButtonText, c24014g.sleepGoalButtonText) && AbstractC22676k.m65745e(this.sleepGoalTypeList, c24014g.sleepGoalTypeList) && this.initialSelection == c24014g.initialSelection && AbstractC22676k.m65745e(this.helpIconLink, c24014g.helpIconLink);
    }

    public int hashCode() {
        return this.helpIconLink.hashCode() + AbstractC11266d.m30448b(this.initialSelection, AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.bottomSheetTitle.hashCode() * 31, 31, this.sleepGoalButtonText), 31, this.sleepGoalTypeList), 31);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        String str2 = this.sleepGoalButtonText;
        List<C24013f> list = this.sleepGoalTypeList;
        int i13 = this.initialSelection;
        String str3 = this.helpIconLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepGoalViewState(bottomSheetTitle=", str, ", sleepGoalButtonText=", str2, ", sleepGoalTypeList=");
        sbM32001t.append(list);
        sbM32001t.append(", initialSelection=");
        sbM32001t.append(i13);
        sbM32001t.append(", helpIconLink=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }
}
