package y21;

import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: y21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003$\u001e\"Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b\u001e\u0010)R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b$\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b*\u00104R\u0016\u00106\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016¨\u00067"}, m65681d2 = {"Ly21/b;", "Lm91/n;", "", "", "upperBound", "lowerBound", "", "stepSize", "barThickness", "Ly81/f;", "barColor", "sliderValue", "Ly21/b$c;", "startLabel", "Ly21/b$a;", "endLabel", "stateUpdateKey", "Lm91/u;", "picker", "<init>", "(FFIILy81/f;FLy21/b$c;Ly21/b$a;Ljava/lang/String;Lm91/u;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "k", "()F", "b", "e", "c", "I", "j", "d", "Ly81/f;", "()Ly81/f;", "f", "g", "Ly21/b$c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly21/b$c;", "Ly21/b$a;", "()Ly21/b$a;", "i", "Ljava/lang/String;", "Lm91/u;", "()Lm91/u;", "getId", "id", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39155b implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float upperBound;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float lowerBound;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int stepSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int barThickness;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f barColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float sliderValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final c startLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final a endLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String stateUpdateKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC25312u picker;

    /* JADX INFO: renamed from: y21.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ly21/b$a;", "", "", "unit", "Ly21/b$b;", "format", "<init>", "(Ljava/lang/String;Ly21/b$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ly21/b$b;", "()Ly21/b$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String unit;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final b format;

        public a(String unit, b format) {
            AbstractC22676k.m65750j(unit, "unit");
            AbstractC22676k.m65750j(format, "format");
            this.unit = unit;
            this.format = format;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.unit, aVar.unit) && this.format == aVar.format;
        }

        public int hashCode() {
            return this.format.hashCode() + (this.unit.hashCode() * 31);
        }

        public String toString() {
            return "EndLabel(unit=" + this.unit + ", format=" + this.format + ")";
        }
    }

    /* JADX INFO: renamed from: y21.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Ly21/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "DISTANCE", "TIME", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        DISTANCE,
        TIME;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: y21.b$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ly21/b$c;", "", "", "title", "subtitle", "Ly81/f;", "bannerColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC39333f bannerColor;

        public c(String title, String str, EnumC39333f enumC39333f) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.subtitle = str;
            this.bannerColor = enumC39333f;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC39333f getBannerColor() {
            return this.bannerColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && this.bannerColor == cVar.bannerColor;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EnumC39333f enumC39333f = this.bannerColor;
            return iHashCode2 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return AbstractC21702c.m61138i(AbstractC11895b.m32001t("StartLabel(title=", str, ", subtitle=", str2, ", bannerColor="), this.bannerColor, ")");
        }
    }

    public C39155b(float f13, float f14, int i13, int i14, EnumC39333f barColor, float f15, c cVar, a aVar, String str, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(barColor, "barColor");
        this.upperBound = f13;
        this.lowerBound = f14;
        this.stepSize = i13;
        this.barThickness = i14;
        this.barColor = barColor;
        this.sliderValue = f15;
        this.startLabel = cVar;
        this.endLabel = aVar;
        this.stateUpdateKey = str;
        this.picker = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBarThickness() {
        return this.barThickness;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getEndLabel() {
        return this.endLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getLowerBound() {
        return this.lowerBound;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39155b)) {
            return false;
        }
        C39155b c39155b = (C39155b) other;
        return Float.compare(this.upperBound, c39155b.upperBound) == 0 && Float.compare(this.lowerBound, c39155b.lowerBound) == 0 && this.stepSize == c39155b.stepSize && this.barThickness == c39155b.barThickness && this.barColor == c39155b.barColor && Float.compare(this.sliderValue, c39155b.sliderValue) == 0 && AbstractC22676k.m65745e(this.startLabel, c39155b.startLabel) && AbstractC22676k.m65745e(this.endLabel, c39155b.endLabel) && AbstractC22676k.m65745e(this.stateUpdateKey, c39155b.stateUpdateKey) && AbstractC22676k.m65745e(this.picker, c39155b.picker);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC25312u getPicker() {
        return this.picker;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getSliderValue() {
        return this.sliderValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getStartLabel() {
        return this.startLabel;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.sliderValue, AbstractC21702c.m61132c(this.barColor, AbstractC11266d.m30448b(this.barThickness, AbstractC11266d.m30448b(this.stepSize, AbstractC11266d.m30447a(this.lowerBound, Float.hashCode(this.upperBound) * 31, 31), 31), 31), 31), 31);
        c cVar = this.startLabel;
        int iHashCode = (iM30447a + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.endLabel;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.stateUpdateKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.picker;
        return iHashCode3 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m124677i() {
        return this.stateUpdateKey;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStepSize() {
        return this.stepSize;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        float f13 = this.upperBound;
        float f14 = this.lowerBound;
        int i13 = this.stepSize;
        int i14 = this.barThickness;
        EnumC39333f enumC39333f = this.barColor;
        float f15 = this.sliderValue;
        c cVar = this.startLabel;
        a aVar = this.endLabel;
        String str = this.stateUpdateKey;
        InterfaceC25312u interfaceC25312u = this.picker;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("NumericInputSliderItemViewState(upperBound=", f13, ", lowerBound=", f14, ", stepSize=");
        AbstractC30802r.m94773v(sbM8307t, i13, ", barThickness=", i14, ", barColor=");
        sbM8307t.append(enumC39333f);
        sbM8307t.append(", sliderValue=");
        sbM8307t.append(f15);
        sbM8307t.append(", startLabel=");
        sbM8307t.append(cVar);
        sbM8307t.append(", endLabel=");
        sbM8307t.append(aVar);
        sbM8307t.append(", stateUpdateKey=");
        sbM8307t.append(str);
        sbM8307t.append(", picker=");
        sbM8307t.append(interfaceC25312u);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // p720m91.InterfaceC25305n
    /* JADX INFO: renamed from: getId, reason: avoid collision after fix types in other method and from getter */
    public String getStateUpdateKey() {
        return this.stateUpdateKey;
    }
}
