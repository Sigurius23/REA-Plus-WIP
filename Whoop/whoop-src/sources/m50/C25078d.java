package m50;

import c13.AbstractC3855a;
import com.whoop.access.circumference.models.SegmentedControlDisplayModel;
import com.whoop.domain.model.UnitSystem;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k50.C22200c;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m50.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b#\u0010+R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b,\u00100R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b1\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b2\u0010\u0017R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b-\u0010\"¨\u00063"}, m65681d2 = {"Lm50/d;", "Lm91/u;", "", "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;", "segments", "", "label", "", "circumferenceInCentimeters", "Li93/j;", "inchesRange", "centimetersRange", "inchesLabel", "centimetersLabel", "Lcom/whoop/domain/model/UnitSystem;", "defaultUnitSystem", "stateUpdateCircumferenceKey", "stateUpdateUnitKey", "Lk50/c;", "foreignMeasurements", "<init>", "(Ljava/util/List;Ljava/lang/String;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "j", "()Ljava/util/List;", "b", "Ljava/lang/String;", "i", "c", "I", "d", "Li93/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Li93/j;", "e", "f", "g", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "k", "l", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25078d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<SegmentedControlDisplayModel> segments;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int circumferenceInCentimeters;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j inchesRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C18284j centimetersRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String inchesLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String centimetersLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final UnitSystem defaultUnitSystem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String stateUpdateCircumferenceKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String stateUpdateUnitKey;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C22200c> foreignMeasurements;

    public C25078d(List<SegmentedControlDisplayModel> segments, String label, int i13, C18284j inchesRange, C18284j centimetersRange, String inchesLabel, String centimetersLabel, UnitSystem defaultUnitSystem, String stateUpdateCircumferenceKey, String str, List<C22200c> foreignMeasurements) {
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(inchesRange, "inchesRange");
        AbstractC22676k.m65750j(centimetersRange, "centimetersRange");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(centimetersLabel, "centimetersLabel");
        AbstractC22676k.m65750j(defaultUnitSystem, "defaultUnitSystem");
        AbstractC22676k.m65750j(stateUpdateCircumferenceKey, "stateUpdateCircumferenceKey");
        AbstractC22676k.m65750j(foreignMeasurements, "foreignMeasurements");
        this.segments = segments;
        this.label = label;
        this.circumferenceInCentimeters = i13;
        this.inchesRange = inchesRange;
        this.centimetersRange = centimetersRange;
        this.inchesLabel = inchesLabel;
        this.centimetersLabel = centimetersLabel;
        this.defaultUnitSystem = defaultUnitSystem;
        this.stateUpdateCircumferenceKey = stateUpdateCircumferenceKey;
        this.stateUpdateUnitKey = str;
        this.foreignMeasurements = foreignMeasurements;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCentimetersLabel() {
        return this.centimetersLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18284j getCentimetersRange() {
        return this.centimetersRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCircumferenceInCentimeters() {
        return this.circumferenceInCentimeters;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final UnitSystem getDefaultUnitSystem() {
        return this.defaultUnitSystem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25078d)) {
            return false;
        }
        C25078d c25078d = (C25078d) other;
        return AbstractC22676k.m65745e(this.segments, c25078d.segments) && AbstractC22676k.m65745e(this.label, c25078d.label) && this.circumferenceInCentimeters == c25078d.circumferenceInCentimeters && AbstractC22676k.m65745e(this.inchesRange, c25078d.inchesRange) && AbstractC22676k.m65745e(this.centimetersRange, c25078d.centimetersRange) && AbstractC22676k.m65745e(this.inchesLabel, c25078d.inchesLabel) && AbstractC22676k.m65745e(this.centimetersLabel, c25078d.centimetersLabel) && this.defaultUnitSystem == c25078d.defaultUnitSystem && AbstractC22676k.m65745e(this.stateUpdateCircumferenceKey, c25078d.stateUpdateCircumferenceKey) && AbstractC22676k.m65745e(this.stateUpdateUnitKey, c25078d.stateUpdateUnitKey) && AbstractC22676k.m65745e(this.foreignMeasurements, c25078d.foreignMeasurements);
    }

    /* JADX INFO: renamed from: f */
    public final List<C22200c> m73564f() {
        return this.foreignMeasurements;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C18284j getInchesRange() {
        return this.inchesRange;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.defaultUnitSystem.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.centimetersRange.hashCode() + ((this.inchesRange.hashCode() + AbstractC11266d.m30448b(this.circumferenceInCentimeters, AbstractC11266d.m30450d(this.segments.hashCode() * 31, 31, this.label), 31)) * 31)) * 31, 31, this.inchesLabel), 31, this.centimetersLabel)) * 31, 31, this.stateUpdateCircumferenceKey);
        String str = this.stateUpdateUnitKey;
        return this.foreignMeasurements.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j */
    public final List<SegmentedControlDisplayModel> m73568j() {
        return this.segments;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStateUpdateCircumferenceKey() {
        return this.stateUpdateCircumferenceKey;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    public String toString() {
        List<SegmentedControlDisplayModel> list = this.segments;
        String str = this.label;
        int i13 = this.circumferenceInCentimeters;
        C18284j c18284j = this.inchesRange;
        C18284j c18284j2 = this.centimetersRange;
        String str2 = this.inchesLabel;
        String str3 = this.centimetersLabel;
        UnitSystem unitSystem = this.defaultUnitSystem;
        String str4 = this.stateUpdateCircumferenceKey;
        String str5 = this.stateUpdateUnitKey;
        List<C22200c> list2 = this.foreignMeasurements;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("CircumferenceViewState(segments=", ", label=", str, ", circumferenceInCentimeters=", list);
        sbM79507k.append(i13);
        sbM79507k.append(", inchesRange=");
        sbM79507k.append(c18284j);
        sbM79507k.append(", centimetersRange=");
        sbM79507k.append(c18284j2);
        sbM79507k.append(", inchesLabel=");
        sbM79507k.append(str2);
        sbM79507k.append(", centimetersLabel=");
        sbM79507k.append(str3);
        sbM79507k.append(", defaultUnitSystem=");
        sbM79507k.append(unitSystem);
        sbM79507k.append(", stateUpdateCircumferenceKey=");
        AbstractC11266d.m30444B(sbM79507k, str4, ", stateUpdateUnitKey=", str5, ", foreignMeasurements=");
        return AbstractC3855a.m11829m(sbM79507k, list2, ")");
    }
}
