package ik1;

import c51.EnumC4225b0;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ik1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006\""}, m65681d2 = {"Lik1/a;", "", "", "yearsDifferenceValueDisplay", "Lc51/b0;", "yearsDifferenceValueStyle", "yearsDifferenceSubtitleDisplay", "Ly81/f;", "yearsDifferenceValueColor", "paceOfAgingDisplay", "paceOfAgingSubtitleDisplay", "<init>", "(Ljava/lang/String;Lc51/b0;Ljava/lang/String;Ly81/f;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lc51/b0;", "getYearsDifferenceValueStyle", "()Lc51/b0;", "c", "d", "Ly81/f;", "()Ly81/f;", "f", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18604a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String yearsDifferenceValueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC4225b0 yearsDifferenceValueStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String yearsDifferenceSubtitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f yearsDifferenceValueColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String paceOfAgingDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String paceOfAgingSubtitleDisplay;

    public C18604a(String yearsDifferenceValueDisplay, EnumC4225b0 yearsDifferenceValueStyle, String yearsDifferenceSubtitleDisplay, EnumC39333f yearsDifferenceValueColor, String paceOfAgingDisplay, String paceOfAgingSubtitleDisplay) {
        AbstractC22676k.m65750j(yearsDifferenceValueDisplay, "yearsDifferenceValueDisplay");
        AbstractC22676k.m65750j(yearsDifferenceValueStyle, "yearsDifferenceValueStyle");
        AbstractC22676k.m65750j(yearsDifferenceSubtitleDisplay, "yearsDifferenceSubtitleDisplay");
        AbstractC22676k.m65750j(yearsDifferenceValueColor, "yearsDifferenceValueColor");
        AbstractC22676k.m65750j(paceOfAgingDisplay, "paceOfAgingDisplay");
        AbstractC22676k.m65750j(paceOfAgingSubtitleDisplay, "paceOfAgingSubtitleDisplay");
        this.yearsDifferenceValueDisplay = yearsDifferenceValueDisplay;
        this.yearsDifferenceValueStyle = yearsDifferenceValueStyle;
        this.yearsDifferenceSubtitleDisplay = yearsDifferenceSubtitleDisplay;
        this.yearsDifferenceValueColor = yearsDifferenceValueColor;
        this.paceOfAgingDisplay = paceOfAgingDisplay;
        this.paceOfAgingSubtitleDisplay = paceOfAgingSubtitleDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaceOfAgingDisplay() {
        return this.paceOfAgingDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaceOfAgingSubtitleDisplay() {
        return this.paceOfAgingSubtitleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getYearsDifferenceSubtitleDisplay() {
        return this.yearsDifferenceSubtitleDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getYearsDifferenceValueColor() {
        return this.yearsDifferenceValueColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getYearsDifferenceValueDisplay() {
        return this.yearsDifferenceValueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18604a)) {
            return false;
        }
        C18604a c18604a = (C18604a) other;
        return AbstractC22676k.m65745e(this.yearsDifferenceValueDisplay, c18604a.yearsDifferenceValueDisplay) && this.yearsDifferenceValueStyle == c18604a.yearsDifferenceValueStyle && AbstractC22676k.m65745e(this.yearsDifferenceSubtitleDisplay, c18604a.yearsDifferenceSubtitleDisplay) && this.yearsDifferenceValueColor == c18604a.yearsDifferenceValueColor && AbstractC22676k.m65745e(this.paceOfAgingDisplay, c18604a.paceOfAgingDisplay) && AbstractC22676k.m65745e(this.paceOfAgingSubtitleDisplay, c18604a.paceOfAgingSubtitleDisplay);
    }

    public int hashCode() {
        return this.paceOfAgingSubtitleDisplay.hashCode() + AbstractC11266d.m30450d(AbstractC21702c.m61132c(this.yearsDifferenceValueColor, AbstractC11266d.m30450d((this.yearsDifferenceValueStyle.hashCode() + (this.yearsDifferenceValueDisplay.hashCode() * 31)) * 31, 31, this.yearsDifferenceSubtitleDisplay), 31), 31, this.paceOfAgingDisplay);
    }

    public String toString() {
        String str = this.yearsDifferenceValueDisplay;
        EnumC4225b0 enumC4225b0 = this.yearsDifferenceValueStyle;
        String str2 = this.yearsDifferenceSubtitleDisplay;
        EnumC39333f enumC39333f = this.yearsDifferenceValueColor;
        String str3 = this.paceOfAgingDisplay;
        String str4 = this.paceOfAgingSubtitleDisplay;
        StringBuilder sb4 = new StringBuilder("AmoebaHeaderViewState(yearsDifferenceValueDisplay=");
        sb4.append(str);
        sb4.append(", yearsDifferenceValueStyle=");
        sb4.append(enumC4225b0);
        sb4.append(", yearsDifferenceSubtitleDisplay=");
        sb4.append(str2);
        sb4.append(", yearsDifferenceValueColor=");
        sb4.append(enumC39333f);
        sb4.append(", paceOfAgingDisplay=");
        return AbstractC11266d.m30464r(sb4, str3, ", paceOfAgingSubtitleDisplay=", str4, ")");
    }
}
