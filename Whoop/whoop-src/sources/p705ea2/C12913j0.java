package p705ea2;

import com.whoop.whattoexpect.domain.models.CtaLocation;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ea2.j0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lea2/j0;", "", "", "title", "body", "", "icon", "Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "ctaLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/whattoexpect/domain/models/CtaLocation;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "()Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12913j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CtaLocation ctaLocation;

    public C12913j0(String title, String str, Integer num, CtaLocation ctaLocation) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(ctaLocation, "ctaLocation");
        this.title = title;
        this.body = str;
        this.icon = num;
        this.ctaLocation = ctaLocation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CtaLocation getCtaLocation() {
        return this.ctaLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12913j0)) {
            return false;
        }
        C12913j0 c12913j0 = (C12913j0) other;
        return AbstractC22676k.m65745e(this.title, c12913j0.title) && AbstractC22676k.m65745e(this.body, c12913j0.body) && AbstractC22676k.m65745e(this.icon, c12913j0.icon) && this.ctaLocation == c12913j0.ctaLocation;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.body;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.icon;
        return this.ctaLocation.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        Integer num = this.icon;
        CtaLocation ctaLocation = this.ctaLocation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhatToExpectEntryPointViewState(title=", str, ", body=", str2, ", icon=");
        sbM32001t.append(num);
        sbM32001t.append(", ctaLocation=");
        sbM32001t.append(ctaLocation);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
