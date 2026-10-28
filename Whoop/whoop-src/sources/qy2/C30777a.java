package qy2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: qy2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\n\u0010%R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u000fR\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006*"}, m65681d2 = {"Lqy2/a;", "", "", "bpReading", "min", "max", "", "tooLowText", "tooHighText", "", "isRequired", "requiredText", "<init>", "(Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getBpReading", "()Ljava/lang/Integer;", "b", "I", "getMin", "c", "getMax", "d", "Ljava/lang/String;", "getTooLowText", "e", "getTooHighText", "f", "Z", "()Z", "g", "getRequiredText", "hasMetRequirements", "bpReadingError", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C30777a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer bpReading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int max;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String tooLowText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String tooHighText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isRequired;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String requiredText;

    public C30777a(Integer num, int i13, int i14, String tooLowText, String tooHighText, boolean z4, String requiredText) {
        AbstractC22676k.m65750j(tooLowText, "tooLowText");
        AbstractC22676k.m65750j(tooHighText, "tooHighText");
        AbstractC22676k.m65750j(requiredText, "requiredText");
        this.bpReading = num;
        this.min = i13;
        this.max = i14;
        this.tooLowText = tooLowText;
        this.tooHighText = tooHighText;
        this.isRequired = z4;
        this.requiredText = requiredText;
    }

    /* JADX INFO: renamed from: a */
    public final String m94613a() {
        Integer num = this.bpReading;
        if (num == null && this.isRequired) {
            return this.requiredText;
        }
        if (num != null && num.intValue() < this.min) {
            return this.tooLowText;
        }
        Integer num2 = this.bpReading;
        if (num2 == null || num2.intValue() <= this.max) {
            return null;
        }
        return this.tooHighText;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94614b() {
        if (this.isRequired && this.bpReading != null && m94613a() == null) {
            return true;
        }
        return !this.isRequired && m94613a() == null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30777a)) {
            return false;
        }
        C30777a c30777a = (C30777a) other;
        return AbstractC22676k.m65745e(this.bpReading, c30777a.bpReading) && this.min == c30777a.min && this.max == c30777a.max && AbstractC22676k.m65745e(this.tooLowText, c30777a.tooLowText) && AbstractC22676k.m65745e(this.tooHighText, c30777a.tooHighText) && this.isRequired == c30777a.isRequired && AbstractC22676k.m65745e(this.requiredText, c30777a.requiredText);
    }

    public int hashCode() {
        Integer num = this.bpReading;
        return this.requiredText.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.max, AbstractC11266d.m30448b(this.min, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31, this.tooLowText), 31, this.tooHighText), 31, this.isRequired);
    }

    public String toString() {
        Integer num = this.bpReading;
        int i13 = this.min;
        int i14 = this.max;
        String str = this.tooLowText;
        String str2 = this.tooHighText;
        boolean z4 = this.isRequired;
        String str3 = this.requiredText;
        StringBuilder sb4 = new StringBuilder("BpReadingValidation(bpReading=");
        sb4.append(num);
        sb4.append(", min=");
        sb4.append(i13);
        sb4.append(", max=");
        AbstractC11895b.m31979B(i14, ", tooLowText=", str, ", tooHighText=", sb4);
        AbstractC38963t7.m124390t(sb4, str2, ", isRequired=", z4, ", requiredText=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }
}
