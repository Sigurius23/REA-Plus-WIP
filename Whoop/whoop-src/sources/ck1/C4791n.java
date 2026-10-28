package ck1;

import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ck1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001d\u0010&¨\u0006'"}, m65681d2 = {"Lck1/n;", "", "", "description", "disclaimer", "", "icon", "Lcom/whoop/design/util/TextResource;", "trendSubTitle", "trendTitle", "Lhy0/b2;", "trendType", "Lny0/p0;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Lny0/p0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "f", "Lhy0/b2;", "g", "()Lhy0/b2;", "Lny0/p0;", "()Lny0/p0;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4791n {

    /* JADX INFO: renamed from: h */
    public static final int f19702h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String disclaimer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource trendSubTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource trendTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC17727b2 trendType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27273p0 secondaryButton;

    static {
        int i13 = C27273p0.f109116o;
        int i14 = TextResource.$stable;
        f19702h = i13 | i14 | i14;
    }

    public C4791n(String description, String disclaimer, int i13, TextResource trendSubTitle, TextResource trendTitle, EnumC17727b2 trendType, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(trendSubTitle, "trendSubTitle");
        AbstractC22676k.m65750j(trendTitle, "trendTitle");
        AbstractC22676k.m65750j(trendType, "trendType");
        this.description = description;
        this.disclaimer = disclaimer;
        this.icon = i13;
        this.trendSubTitle = trendSubTitle;
        this.trendTitle = trendTitle;
        this.trendType = trendType;
        this.secondaryButton = c27273p0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C27273p0 getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTrendSubTitle() {
        return this.trendSubTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4791n)) {
            return false;
        }
        C4791n c4791n = (C4791n) other;
        return AbstractC22676k.m65745e(this.description, c4791n.description) && AbstractC22676k.m65745e(this.disclaimer, c4791n.disclaimer) && this.icon == c4791n.icon && AbstractC22676k.m65745e(this.trendSubTitle, c4791n.trendSubTitle) && AbstractC22676k.m65745e(this.trendTitle, c4791n.trendTitle) && this.trendType == c4791n.trendType && AbstractC22676k.m65745e(this.secondaryButton, c4791n.secondaryButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTrendTitle() {
        return this.trendTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC17727b2 getTrendType() {
        return this.trendType;
    }

    public int hashCode() {
        int iHashCode = (this.trendType.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.icon, AbstractC11266d.m30450d(this.description.hashCode() * 31, 31, this.disclaimer), 31), this.trendSubTitle, 31), this.trendTitle, 31)) * 31;
        C27273p0 c27273p0 = this.secondaryButton;
        return iHashCode + (c27273p0 == null ? 0 : c27273p0.hashCode());
    }

    public String toString() {
        String str = this.description;
        String str2 = this.disclaimer;
        int i13 = this.icon;
        TextResource textResource = this.trendSubTitle;
        TextResource textResource2 = this.trendTitle;
        EnumC17727b2 enumC17727b2 = this.trendType;
        C27273p0 c27273p0 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("KeyMetricDialogViewState(description=", str, ", disclaimer=", str2, ", icon=");
        sbM32001t.append(i13);
        sbM32001t.append(", trendSubTitle=");
        sbM32001t.append(textResource);
        sbM32001t.append(", trendTitle=");
        sbM32001t.append(textResource2);
        sbM32001t.append(", trendType=");
        sbM32001t.append(enumC17727b2);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(c27273p0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
