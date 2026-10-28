package ok1;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ok1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lok1/a;", "Lm91/u;", "", "titleDisplay", "primaryDescriptionDisplay", "secondaryDescriptionDisplay", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lok1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "e", "c", "f", "d", "Ljava/util/List;", "()Ljava/util/List;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27994a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String primaryDescriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String secondaryDescriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C27994a(String str, String str2, String str3, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(items, "items");
        this.titleDisplay = str;
        this.primaryDescriptionDisplay = str2;
        this.secondaryDescriptionDisplay = str3;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27994a m84427b(C27994a c27994a, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c27994a.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c27994a.primaryDescriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = c27994a.secondaryDescriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            list = c27994a.items;
        }
        return c27994a.m84428a(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: a */
    public final C27994a m84428a(String titleDisplay, String primaryDescriptionDisplay, String secondaryDescriptionDisplay, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(items, "items");
        return new C27994a(titleDisplay, primaryDescriptionDisplay, secondaryDescriptionDisplay, items);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m84429c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrimaryDescriptionDisplay() {
        return this.primaryDescriptionDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27994a)) {
            return false;
        }
        C27994a c27994a = (C27994a) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c27994a.titleDisplay) && AbstractC22676k.m65745e(this.primaryDescriptionDisplay, c27994a.primaryDescriptionDisplay) && AbstractC22676k.m65745e(this.secondaryDescriptionDisplay, c27994a.secondaryDescriptionDisplay) && AbstractC22676k.m65745e(this.items, c27994a.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSecondaryDescriptionDisplay() {
        return this.secondaryDescriptionDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.titleDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryDescriptionDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryDescriptionDisplay;
        return this.items.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.primaryDescriptionDisplay;
        return AbstractC30007c.m91840j(this.secondaryDescriptionDisplay, ", items=", ")", AbstractC11895b.m32001t("TileSectionViewState(titleDisplay=", str, ", primaryDescriptionDisplay=", str2, ", secondaryDescriptionDisplay="), this.items);
    }
}
