package wb2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y71.C39282o;

/* JADX INFO: renamed from: wb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lwb2/a;", "", "Ly71/o;", "advancedLabsItem", "shopMenuItem", "smsSettingsMenuItem", "<init>", "(Ly71/o;Ly71/o;Ly71/o;)V", "a", "(Ly71/o;Ly71/o;Ly71/o;)Lwb2/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly71/o;", "c", "()Ly71/o;", "b", "d", "e", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37050a {

    /* JADX INFO: renamed from: d */
    public static final int f158533d = C39282o.f168987q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39282o advancedLabsItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o shopMenuItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39282o smsSettingsMenuItem;

    public C37050a(C39282o c39282o, C39282o c39282o2, C39282o c39282o3) {
        this.advancedLabsItem = c39282o;
        this.shopMenuItem = c39282o2;
        this.smsSettingsMenuItem = c39282o3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37050a m118935b(C37050a c37050a, C39282o c39282o, C39282o c39282o2, C39282o c39282o3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c39282o = c37050a.advancedLabsItem;
        }
        if ((i13 & 2) != 0) {
            c39282o2 = c37050a.shopMenuItem;
        }
        if ((i13 & 4) != 0) {
            c39282o3 = c37050a.smsSettingsMenuItem;
        }
        return c37050a.m118936a(c39282o, c39282o2, c39282o3);
    }

    /* JADX INFO: renamed from: a */
    public final C37050a m118936a(C39282o advancedLabsItem, C39282o shopMenuItem, C39282o smsSettingsMenuItem) {
        return new C37050a(advancedLabsItem, shopMenuItem, smsSettingsMenuItem);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39282o getAdvancedLabsItem() {
        return this.advancedLabsItem;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C39282o getShopMenuItem() {
        return this.shopMenuItem;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C39282o getSmsSettingsMenuItem() {
        return this.smsSettingsMenuItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37050a)) {
            return false;
        }
        C37050a c37050a = (C37050a) other;
        return AbstractC22676k.m65745e(this.advancedLabsItem, c37050a.advancedLabsItem) && AbstractC22676k.m65745e(this.shopMenuItem, c37050a.shopMenuItem) && AbstractC22676k.m65745e(this.smsSettingsMenuItem, c37050a.smsSettingsMenuItem);
    }

    public int hashCode() {
        C39282o c39282o = this.advancedLabsItem;
        int iHashCode = (c39282o == null ? 0 : c39282o.hashCode()) * 31;
        C39282o c39282o2 = this.shopMenuItem;
        int iHashCode2 = (iHashCode + (c39282o2 == null ? 0 : c39282o2.hashCode())) * 31;
        C39282o c39282o3 = this.smsSettingsMenuItem;
        return iHashCode2 + (c39282o3 != null ? c39282o3.hashCode() : 0);
    }

    public String toString() {
        return "SettingsLandingState(advancedLabsItem=" + this.advancedLabsItem + ", shopMenuItem=" + this.shopMenuItem + ", smsSettingsMenuItem=" + this.smsSettingsMenuItem + ")";
    }

    public /* synthetic */ C37050a(C39282o c39282o, C39282o c39282o2, C39282o c39282o3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c39282o, (i13 & 2) != 0 ? null : c39282o2, (i13 & 4) != 0 ? null : c39282o3);
    }
}
