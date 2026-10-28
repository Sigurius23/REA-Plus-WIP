package e21;

import c13.AbstractC3855a;
import gz0.EnumC16313m0;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: e21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Le21/b;", "Lm91/u;", "Lgz0/m0;", "icon", "", "title", "", "Le21/b$a;", "zones", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12597b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<a> zones;

    /* JADX INFO: renamed from: e21.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Le21/b$a;", "", "", "label", "value", "Ly81/f;", "color", "", "weight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ly81/f;", "()Ly81/f;", "d", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC39333f color;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float weight;

        public a(String label, String value, EnumC39333f color, float f13) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(color, "color");
            this.label = label;
            this.value = value;
            this.color = color;
            this.weight = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC39333f getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.label, aVar.label) && AbstractC22676k.m65745e(this.value, aVar.value) && this.color == aVar.color && Float.compare(this.weight, aVar.weight) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.weight) + AbstractC21702c.m61132c(this.color, AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value), 31);
        }

        public String toString() {
            String str = this.label;
            String str2 = this.value;
            EnumC39333f enumC39333f = this.color;
            float f13 = this.weight;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ZoneState(label=", str, ", value=", str2, ", color=");
            sbM32001t.append(enumC39333f);
            sbM32001t.append(", weight=");
            sbM32001t.append(f13);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public C12597b(EnumC16313m0 enumC16313m0, String str, List<a> zones) {
        AbstractC22676k.m65750j(zones, "zones");
        this.icon = enumC16313m0;
        this.title = str;
        this.zones = zones;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c */
    public final List<a> m35298c() {
        return this.zones;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12597b)) {
            return false;
        }
        C12597b c12597b = (C12597b) other;
        return this.icon == c12597b.icon && AbstractC22676k.m65745e(this.title, c12597b.title) && AbstractC22676k.m65745e(this.zones, c12597b.zones);
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
        String str = this.title;
        return this.zones.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.title;
        List<a> list = this.zones;
        StringBuilder sb4 = new StringBuilder("HrZonesRowItemViewState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", zones=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
