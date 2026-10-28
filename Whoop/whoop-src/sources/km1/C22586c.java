package km1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: km1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkm1/c;", "", "", "currentValue", "totalValue", "label", "", "percentValue", "Li2/t;", "progressBarBrush", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILi2/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "I", "Li2/t;", "()Li2/t;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22586c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String currentValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String totalValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int percentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC17911t progressBarBrush;

    public C22586c(String currentValue, String totalValue, String label, int i13, AbstractC17911t progressBarBrush) {
        AbstractC22676k.m65750j(currentValue, "currentValue");
        AbstractC22676k.m65750j(totalValue, "totalValue");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(progressBarBrush, "progressBarBrush");
        this.currentValue = currentValue;
        this.totalValue = totalValue;
        this.label = label;
        this.percentValue = i13;
        this.progressBarBrush = progressBarBrush;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPercentValue() {
        return this.percentValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC17911t getProgressBarBrush() {
        return this.progressBarBrush;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTotalValue() {
        return this.totalValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22586c)) {
            return false;
        }
        C22586c c22586c = (C22586c) other;
        return AbstractC22676k.m65745e(this.currentValue, c22586c.currentValue) && AbstractC22676k.m65745e(this.totalValue, c22586c.totalValue) && AbstractC22676k.m65745e(this.label, c22586c.label) && this.percentValue == c22586c.percentValue && AbstractC22676k.m65745e(this.progressBarBrush, c22586c.progressBarBrush);
    }

    public int hashCode() {
        return this.progressBarBrush.hashCode() + AbstractC11266d.m30448b(this.percentValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.currentValue.hashCode() * 31, 31, this.totalValue), 31, this.label), 31);
    }

    public String toString() {
        String str = this.currentValue;
        String str2 = this.totalValue;
        String str3 = this.label;
        int i13 = this.percentValue;
        AbstractC17911t abstractC17911t = this.progressBarBrush;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeHomeTileProgressViewState(currentValue=", str, ", totalValue=", str2, ", label=");
        AbstractC11266d.m30470x(i13, str3, ", percentValue=", ", progressBarBrush=", sbM32001t);
        sbM32001t.append(abstractC17911t);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
