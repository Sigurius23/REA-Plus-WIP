package u41;

import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: u41.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lu41/b;", "Lm91/u;", "", "title", "", "Lu41/b$a;", "zones", "", "indicatorPosition", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;)Lu41/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34534b implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f145154d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<a> zones;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Float indicatorPosition;

    /* JADX INFO: renamed from: u41.b$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lu41/b$a;", "", "", "title", "label", "Ly81/f;", "color", "", "weight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;F)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;F)Lu41/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "d", "c", "Ly81/f;", "()Ly81/f;", "F", "f", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC39333f color;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float weight;

        public a(String str, String str2, EnumC39333f color, float f13) {
            AbstractC22676k.m65750j(color, "color");
            this.title = str;
            this.label = str2;
            this.color = color;
            this.weight = f13;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m109118b(a aVar, String str, String str2, EnumC39333f enumC39333f, float f13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = aVar.title;
            }
            if ((i13 & 2) != 0) {
                str2 = aVar.label;
            }
            if ((i13 & 4) != 0) {
                enumC39333f = aVar.color;
            }
            if ((i13 & 8) != 0) {
                f13 = aVar.weight;
            }
            return aVar.m109119a(str, str2, enumC39333f, f13);
        }

        /* JADX INFO: renamed from: a */
        public final a m109119a(String title, String label, EnumC39333f color, float weight) {
            AbstractC22676k.m65750j(color, "color");
            return new a(title, label, color, weight);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC39333f getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.label, aVar.label) && this.color == aVar.color && Float.compare(this.weight, aVar.weight) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            return Float.hashCode(this.weight) + AbstractC21702c.m61132c(this.color, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.label;
            EnumC39333f enumC39333f = this.color;
            float f13 = this.weight;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ZoneState(title=", str, ", label=", str2, ", color=");
            sbM32001t.append(enumC39333f);
            sbM32001t.append(", weight=");
            sbM32001t.append(f13);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public C34534b(String str, List<a> zones, Float f13) {
        AbstractC22676k.m65750j(zones, "zones");
        this.title = str;
        this.zones = zones;
        this.indicatorPosition = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34534b m109113b(C34534b c34534b, String str, List list, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c34534b.title;
        }
        if ((i13 & 2) != 0) {
            list = c34534b.zones;
        }
        if ((i13 & 4) != 0) {
            f13 = c34534b.indicatorPosition;
        }
        return c34534b.m109114a(str, list, f13);
    }

    /* JADX INFO: renamed from: a */
    public final C34534b m109114a(String title, List<a> zones, Float indicatorPosition) {
        AbstractC22676k.m65750j(zones, "zones");
        return new C34534b(title, zones, indicatorPosition);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34534b)) {
            return false;
        }
        C34534b c34534b = (C34534b) other;
        return AbstractC22676k.m65745e(this.title, c34534b.title) && AbstractC22676k.m65745e(this.zones, c34534b.zones) && AbstractC22676k.m65745e(this.indicatorPosition, c34534b.indicatorPosition);
    }

    /* JADX INFO: renamed from: f */
    public final List<a> m109117f() {
        return this.zones;
    }

    public int hashCode() {
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.zones);
        Float f13 = this.indicatorPosition;
        return iM31983b + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<a> list = this.zones;
        Float f13 = this.indicatorPosition;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ZoneBarItemViewState(title=", str, ", zones=", ", indicatorPosition=", list);
        sbM94766o.append(f13);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
