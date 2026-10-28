package lw2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p01.C28582b;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lw2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, m65681d2 = {"Llw2/d;", "", "Lp01/b;", "circularProgressIndicator", "Lcom/whoop/design/util/TextResource;", "subText", "", "completed", "", "completedStepsText", "totalStepsText", "<init>", "(Lp01/b;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lp01/b;", "()Lp01/b;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "Ljava/lang/String;", "e", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24779d {

    /* JADX INFO: renamed from: f */
    public static final int f96948f = TextResource.$stable | C28582b.f115652u;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28582b circularProgressIndicator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean completed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String completedStepsText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String totalStepsText;

    public C24779d(C28582b circularProgressIndicator, TextResource subText, boolean z4, String completedStepsText, String totalStepsText) {
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(completedStepsText, "completedStepsText");
        AbstractC22676k.m65750j(totalStepsText, "totalStepsText");
        this.circularProgressIndicator = circularProgressIndicator;
        this.subText = subText;
        this.completed = z4;
        this.completedStepsText = completedStepsText;
        this.totalStepsText = totalStepsText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28582b getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCompletedStepsText() {
        return this.completedStepsText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTotalStepsText() {
        return this.totalStepsText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24779d)) {
            return false;
        }
        C24779d c24779d = (C24779d) other;
        return AbstractC22676k.m65745e(this.circularProgressIndicator, c24779d.circularProgressIndicator) && AbstractC22676k.m65745e(this.subText, c24779d.subText) && this.completed == c24779d.completed && AbstractC22676k.m65745e(this.completedStepsText, c24779d.completedStepsText) && AbstractC22676k.m65745e(this.totalStepsText, c24779d.totalStepsText);
    }

    public int hashCode() {
        return this.totalStepsText.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.circularProgressIndicator.hashCode() * 31, this.subText, 31), 31, this.completed), 31, this.completedStepsText);
    }

    public String toString() {
        C28582b c28582b = this.circularProgressIndicator;
        TextResource textResource = this.subText;
        boolean z4 = this.completed;
        String str = this.completedStepsText;
        String str2 = this.totalStepsText;
        StringBuilder sb4 = new StringBuilder("WteProgressIndicator(circularProgressIndicator=");
        sb4.append(c28582b);
        sb4.append(", subText=");
        sb4.append(textResource);
        sb4.append(", completed=");
        AbstractC38963t7.m124391u(sb4, z4, ", completedStepsText=", str, ", totalStepsText=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
