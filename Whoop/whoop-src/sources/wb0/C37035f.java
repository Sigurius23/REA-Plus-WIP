package wb0;

import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: wb0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b&\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b-\u00103R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b1\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b/\u0010:R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b;\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b<\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\b)\u0010C¨\u0006I"}, m65681d2 = {"Lwb0/f;", "", "", "biomarkerName", "biomarkerId", "", "value", "valueText", "unit", "", "included", "minValue", "maxValue", "Lm91/u;", "infoCallout", "valueLabel", "unitLabel", "isCalculated", "subtitle", "warning", "Lgz0/m0;", "rightIcon", "", "dependentOnBiomarkers", "Lwb0/d;", "dependentOnBiomarkersWarning", "Lwb0/c;", "categoricalOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLm91/u;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Lwb0/d;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Double;", "l", "()Ljava/lang/Double;", "d", "n", "e", "j", "f", "Z", "()Z", "g", "D", "()D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lm91/u;", "()Lm91/u;", "m", "k", "p", "o", "Lgz0/m0;", "()Lgz0/m0;", "Ljava/util/List;", "getDependentOnBiomarkers", "()Ljava/util/List;", "q", "Lwb0/d;", "getDependentOnBiomarkersWarning", "()Lwb0/d;", "r", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37035f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String biomarkerName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String biomarkerId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String valueText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean included;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final double minValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final double maxValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC25312u infoCallout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String valueLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String unitLabel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isCalculated;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String warning;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<String> dependentOnBiomarkers;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C37033d dependentOnBiomarkersWarning;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<C37032c> categoricalOptions;

    public C37035f(String biomarkerName, String biomarkerId, Double d3, String str, String str2, boolean z4, double d14, double d15, InterfaceC25312u interfaceC25312u, String valueLabel, String unitLabel, boolean z13, String str3, String str4, EnumC16313m0 enumC16313m0, List<String> dependentOnBiomarkers, C37033d c37033d, List<C37032c> list) {
        AbstractC22676k.m65750j(biomarkerName, "biomarkerName");
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(valueLabel, "valueLabel");
        AbstractC22676k.m65750j(unitLabel, "unitLabel");
        AbstractC22676k.m65750j(dependentOnBiomarkers, "dependentOnBiomarkers");
        this.biomarkerName = biomarkerName;
        this.biomarkerId = biomarkerId;
        this.value = d3;
        this.valueText = str;
        this.unit = str2;
        this.included = z4;
        this.minValue = d14;
        this.maxValue = d15;
        this.infoCallout = interfaceC25312u;
        this.valueLabel = valueLabel;
        this.unitLabel = unitLabel;
        this.isCalculated = z13;
        this.subtitle = str3;
        this.warning = str4;
        this.rightIcon = enumC16313m0;
        this.dependentOnBiomarkers = dependentOnBiomarkers;
        this.dependentOnBiomarkersWarning = c37033d;
        this.categoricalOptions = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBiomarkerId() {
        return this.biomarkerId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBiomarkerName() {
        return this.biomarkerName;
    }

    /* JADX INFO: renamed from: c */
    public final List<C37032c> m118854c() {
        return this.categoricalOptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIncluded() {
        return this.included;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getInfoCallout() {
        return this.infoCallout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37035f)) {
            return false;
        }
        C37035f c37035f = (C37035f) other;
        return AbstractC22676k.m65745e(this.biomarkerName, c37035f.biomarkerName) && AbstractC22676k.m65745e(this.biomarkerId, c37035f.biomarkerId) && AbstractC22676k.m65745e(this.value, c37035f.value) && AbstractC22676k.m65745e(this.valueText, c37035f.valueText) && AbstractC22676k.m65745e(this.unit, c37035f.unit) && this.included == c37035f.included && Double.compare(this.minValue, c37035f.minValue) == 0 && Double.compare(this.maxValue, c37035f.maxValue) == 0 && AbstractC22676k.m65745e(this.infoCallout, c37035f.infoCallout) && AbstractC22676k.m65745e(this.valueLabel, c37035f.valueLabel) && AbstractC22676k.m65745e(this.unitLabel, c37035f.unitLabel) && this.isCalculated == c37035f.isCalculated && AbstractC22676k.m65745e(this.subtitle, c37035f.subtitle) && AbstractC22676k.m65745e(this.warning, c37035f.warning) && this.rightIcon == c37035f.rightIcon && AbstractC22676k.m65745e(this.dependentOnBiomarkers, c37035f.dependentOnBiomarkers) && AbstractC22676k.m65745e(this.dependentOnBiomarkersWarning, c37035f.dependentOnBiomarkersWarning) && AbstractC22676k.m65745e(this.categoricalOptions, c37035f.categoricalOptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.biomarkerName.hashCode() * 31, 31, this.biomarkerId);
        Double d3 = this.value;
        int iHashCode = (iM30450d + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.valueText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unit;
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC2875y.m8289b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.included), 31, this.minValue), 31, this.maxValue);
        InterfaceC25312u interfaceC25312u = this.infoCallout;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM48499a + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.valueLabel), 31, this.unitLabel), 31, this.isCalculated);
        String str3 = this.subtitle;
        int iHashCode3 = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.warning;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.dependentOnBiomarkers);
        C37033d c37033d = this.dependentOnBiomarkersWarning;
        int iHashCode5 = (iM31983b + (c37033d == null ? 0 : c37033d.hashCode())) * 31;
        List<C37032c> list = this.categoricalOptions;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getValueLabel() {
        return this.valueLabel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getValueText() {
        return this.valueText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsCalculated() {
        return this.isCalculated;
    }

    public String toString() {
        String str = this.biomarkerName;
        String str2 = this.biomarkerId;
        Double d3 = this.value;
        String str3 = this.valueText;
        String str4 = this.unit;
        boolean z4 = this.included;
        double d14 = this.minValue;
        double d15 = this.maxValue;
        InterfaceC25312u interfaceC25312u = this.infoCallout;
        String str5 = this.valueLabel;
        String str6 = this.unitLabel;
        boolean z13 = this.isCalculated;
        String str7 = this.subtitle;
        String str8 = this.warning;
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        List<String> list = this.dependentOnBiomarkers;
        C37033d c37033d = this.dependentOnBiomarkersWarning;
        List<C37032c> list2 = this.categoricalOptions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditBiomarkerItemState(biomarkerName=", str, ", biomarkerId=", str2, ", value=");
        sbM32001t.append(d3);
        sbM32001t.append(", valueText=");
        sbM32001t.append(str3);
        sbM32001t.append(", unit=");
        AbstractC38963t7.m124390t(sbM32001t, str4, ", included=", z4, ", minValue=");
        sbM32001t.append(d14);
        AbstractC31061c.m95622B(sbM32001t, ", maxValue=", d15, ", infoCallout=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", valueLabel=");
        sbM32001t.append(str5);
        sbM32001t.append(", unitLabel=");
        AbstractC38963t7.m124390t(sbM32001t, str6, ", isCalculated=", z13, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", warning=", str8, ", rightIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", dependentOnBiomarkers=");
        sbM32001t.append(list);
        sbM32001t.append(", dependentOnBiomarkersWarning=");
        sbM32001t.append(c37033d);
        sbM32001t.append(", categoricalOptions=");
        sbM32001t.append(list2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
