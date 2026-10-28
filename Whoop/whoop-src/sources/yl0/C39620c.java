package yl0;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: yl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b!\u0010\u000f¨\u0006#"}, m65681d2 = {"Lyl0/c;", "", "", "title", "question", "", "value", "min", "max", "", "decimalPlaces", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;DDILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "D", "()D", "f", "I", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39620c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String question;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double min;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double max;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int decimalPlaces;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String unit;

    public C39620c(String title, String question, Double d3, double d14, double d15, int i13, String unit) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(unit, "unit");
        this.title = title;
        this.question = question;
        this.value = d3;
        this.min = d14;
        this.max = d15;
        this.decimalPlaces = i13;
        this.unit = unit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDecimalPlaces() {
        return this.decimalPlaces;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39620c)) {
            return false;
        }
        C39620c c39620c = (C39620c) other;
        return AbstractC22676k.m65745e(this.title, c39620c.title) && AbstractC22676k.m65745e(this.question, c39620c.question) && AbstractC22676k.m65745e(this.value, c39620c.value) && Double.compare(this.min, c39620c.min) == 0 && Double.compare(this.max, c39620c.max) == 0 && this.decimalPlaces == c39620c.decimalPlaces && AbstractC22676k.m65745e(this.unit, c39620c.unit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.question);
        Double d3 = this.value;
        return this.unit.hashCode() + AbstractC11266d.m30448b(this.decimalPlaces, AbstractC17176i.m48499a(AbstractC17176i.m48499a((iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.min), 31, this.max), 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.question;
        Double d3 = this.value;
        double d14 = this.min;
        double d15 = this.max;
        int i13 = this.decimalPlaces;
        String str3 = this.unit;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalEntryMagnitudeSheetState(title=", str, ", question=", str2, ", value=");
        sbM32001t.append(d3);
        sbM32001t.append(", min=");
        sbM32001t.append(d14);
        AbstractC31061c.m95622B(sbM32001t, ", max=", d15, ", decimalPlaces=");
        return AbstractC38963t7.m124376f(i13, ", unit=", str3, ")", sbM32001t);
    }
}
