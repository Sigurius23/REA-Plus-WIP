package nj2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nj2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m65681d2 = {"Lnj2/c;", "", "", "fillPercent", "", "stressScore", "stressText", "meterMin", "meterMax", "", "isLoading", "loadingTitle", "loadingSubtitle", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Ljava/lang/String;", "e", "c", "f", "d", "Z", "g", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getLoadingSubtitle", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26756c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String stressScore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String stressText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String meterMin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String meterMax;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String loadingTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String loadingSubtitle;

    public C26756c(float f13, String stressScore, String stressText, String meterMin, String meterMax, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(stressScore, "stressScore");
        AbstractC22676k.m65750j(stressText, "stressText");
        AbstractC22676k.m65750j(meterMin, "meterMin");
        AbstractC22676k.m65750j(meterMax, "meterMax");
        this.fillPercent = f13;
        this.stressScore = stressScore;
        this.stressText = stressText;
        this.meterMin = meterMin;
        this.meterMax = meterMax;
        this.isLoading = z4;
        this.loadingTitle = str;
        this.loadingSubtitle = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getFillPercent() {
        return this.fillPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLoadingTitle() {
        return this.loadingTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMeterMax() {
        return this.meterMax;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMeterMin() {
        return this.meterMin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStressScore() {
        return this.stressScore;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26756c)) {
            return false;
        }
        C26756c c26756c = (C26756c) other;
        return Float.compare(this.fillPercent, c26756c.fillPercent) == 0 && AbstractC22676k.m65745e(this.stressScore, c26756c.stressScore) && AbstractC22676k.m65745e(this.stressText, c26756c.stressText) && AbstractC22676k.m65745e(this.meterMin, c26756c.meterMin) && AbstractC22676k.m65745e(this.meterMax, c26756c.meterMax) && this.isLoading == c26756c.isLoading && AbstractC22676k.m65745e(this.loadingTitle, c26756c.loadingTitle) && AbstractC22676k.m65745e(this.loadingSubtitle, c26756c.loadingSubtitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStressText() {
        return this.stressText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Float.hashCode(this.fillPercent) * 31, 31, this.stressScore), 31, this.stressText), 31, this.meterMin), 31, this.meterMax), 31, this.isLoading);
        String str = this.loadingTitle;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.loadingSubtitle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        float f13 = this.fillPercent;
        String str = this.stressScore;
        String str2 = this.stressText;
        String str3 = this.meterMin;
        String str4 = this.meterMax;
        boolean z4 = this.isLoading;
        String str5 = this.loadingTitle;
        String str6 = this.loadingSubtitle;
        StringBuilder sb4 = new StringBuilder("MeterDomainState(fillPercent=");
        sb4.append(f13);
        sb4.append(", stressScore=");
        sb4.append(str);
        sb4.append(", stressText=");
        AbstractC11266d.m30444B(sb4, str2, ", meterMin=", str3, ", meterMax=");
        AbstractC38963t7.m124390t(sb4, str4, ", isLoading=", z4, ", loadingTitle=");
        return AbstractC11266d.m30464r(sb4, str5, ", loadingSubtitle=", str6, ")");
    }
}
