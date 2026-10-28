package lf2;

import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, m65681d2 = {"Llf2/d;", "", "", "bottomSheetTitle", "repeatDaysDescriptionText", "nextActionLabel", "", "Llf2/e;", "scheduleDayList", "helpIconLink", "", "nextButtonEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Z", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24011d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String repeatDaysDescriptionText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String nextActionLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C24012e> scheduleDayList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String helpIconLink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean nextButtonEnabled;

    public C24011d(String bottomSheetTitle, String repeatDaysDescriptionText, String nextActionLabel, List<C24012e> scheduleDayList, String helpIconLink, boolean z4) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(repeatDaysDescriptionText, "repeatDaysDescriptionText");
        AbstractC22676k.m65750j(nextActionLabel, "nextActionLabel");
        AbstractC22676k.m65750j(scheduleDayList, "scheduleDayList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.bottomSheetTitle = bottomSheetTitle;
        this.repeatDaysDescriptionText = repeatDaysDescriptionText;
        this.nextActionLabel = nextActionLabel;
        this.scheduleDayList = scheduleDayList;
        this.helpIconLink = helpIconLink;
        this.nextButtonEnabled = z4;
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
    public final String getNextActionLabel() {
        return this.nextActionLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNextButtonEnabled() {
        return this.nextButtonEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRepeatDaysDescriptionText() {
        return this.repeatDaysDescriptionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24011d)) {
            return false;
        }
        C24011d c24011d = (C24011d) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c24011d.bottomSheetTitle) && AbstractC22676k.m65745e(this.repeatDaysDescriptionText, c24011d.repeatDaysDescriptionText) && AbstractC22676k.m65745e(this.nextActionLabel, c24011d.nextActionLabel) && AbstractC22676k.m65745e(this.scheduleDayList, c24011d.scheduleDayList) && AbstractC22676k.m65745e(this.helpIconLink, c24011d.helpIconLink) && this.nextButtonEnabled == c24011d.nextButtonEnabled;
    }

    /* JADX INFO: renamed from: f */
    public final List<C24012e> m70827f() {
        return this.scheduleDayList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.nextButtonEnabled) + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.bottomSheetTitle.hashCode() * 31, 31, this.repeatDaysDescriptionText), 31, this.nextActionLabel), 31, this.scheduleDayList), 31, this.helpIconLink);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        String str2 = this.repeatDaysDescriptionText;
        String str3 = this.nextActionLabel;
        List<C24012e> list = this.scheduleDayList;
        String str4 = this.helpIconLink;
        boolean z4 = this.nextButtonEnabled;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RepeatDaysViewState(bottomSheetTitle=", str, ", repeatDaysDescriptionText=", str2, ", nextActionLabel=");
        AbstractC36095b.m114694v(str3, ", scheduleDayList=", ", helpIconLink=", sbM32001t, list);
        return AbstractC21702c.m61137h(sbM32001t, str4, ", nextButtonEnabled=", z4, ")");
    }
}
