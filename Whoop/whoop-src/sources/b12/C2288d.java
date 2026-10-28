package b12;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b12.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lb12/d;", "", "", "title", "body", "analyticsLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2288d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsLabel;

    public C2288d(String title, String body, String analyticsLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        this.title = title;
        this.body = body;
        this.analyticsLabel = analyticsLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2288d)) {
            return false;
        }
        C2288d c2288d = (C2288d) other;
        return AbstractC22676k.m65745e(this.title, c2288d.title) && AbstractC22676k.m65745e(this.body, c2288d.body) && AbstractC22676k.m65745e(this.analyticsLabel, c2288d.analyticsLabel);
    }

    public int hashCode() {
        return this.analyticsLabel.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.analyticsLabel, ")", AbstractC11895b.m32001t("NotificationContent(title=", this.title, ", body=", this.body, ", analyticsLabel="));
    }
}
