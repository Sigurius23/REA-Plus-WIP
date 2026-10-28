package so1;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: so1.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lso1/q;", "", "", HttpHeaders.DATE, "Lcom/whoop/design/util/TextResource;", "titleDisplay", "buttonTitle", "secondaryButtonTitle", "", "Lso1/t;", "toggles", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "e", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32833q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryButtonTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C32836t> toggles;

    public C32833q(String str, TextResource titleDisplay, TextResource buttonTitle, TextResource secondaryButtonTitle, List<C32836t> toggles) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        AbstractC22676k.m65750j(toggles, "toggles");
        this.date = str;
        this.titleDisplay = titleDisplay;
        this.buttonTitle = buttonTitle;
        this.secondaryButtonTitle = secondaryButtonTitle;
        this.toggles = toggles;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: e */
    public final List<C32836t> m103042e() {
        return this.toggles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32833q)) {
            return false;
        }
        C32833q c32833q = (C32833q) other;
        return AbstractC22676k.m65745e(this.date, c32833q.date) && AbstractC22676k.m65745e(this.titleDisplay, c32833q.titleDisplay) && AbstractC22676k.m65745e(this.buttonTitle, c32833q.buttonTitle) && AbstractC22676k.m65745e(this.secondaryButtonTitle, c32833q.secondaryButtonTitle) && AbstractC22676k.m65745e(this.toggles, c32833q.toggles);
    }

    public int hashCode() {
        String str = this.date;
        return this.toggles.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.titleDisplay, 31), this.buttonTitle, 31), this.secondaryButtonTitle, 31);
    }

    public String toString() {
        String str = this.date;
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.buttonTitle;
        TextResource textResource3 = this.secondaryButtonTitle;
        List<C32836t> list = this.toggles;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("LogPeriodBottomSheetViewState(date=", str, ", titleDisplay=", textResource, ", buttonTitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", secondaryButtonTitle=", textResource3, ", toggles=");
        return AbstractC3855a.m11829m(sbM91847q, list, ")");
    }
}
