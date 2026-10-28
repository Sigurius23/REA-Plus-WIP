package q41;

import com.whoop.design.atomic.molecule.trilabelslider.TriLabelSliderBarStyle;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;

/* JADX INFO: renamed from: q41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b\u001b\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b-\u0010\u0013R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0013¨\u00060"}, m65681d2 = {"Lq41/c;", "Lm91/n;", "", "", "lowerBound", "centerBound", "upperBound", "startLabel", "centerLabel", "endLabel", "sliderValue", "", "barThickness", "Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;", "barStyle", "stateUpdateKey", "<init>", "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "g", "()F", "b", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "k", "d", "Ljava/lang/String;", "i", "e", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;", "()Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;", "j", "getId", "id", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29970c implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float lowerBound;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Float centerBound;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float upperBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String startLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String centerLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String endLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float sliderValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int barThickness;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TriLabelSliderBarStyle barStyle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String stateUpdateKey;

    public C29970c(float f13, Float f14, float f15, String startLabel, String str, String endLabel, float f16, int i13, TriLabelSliderBarStyle barStyle, String str2) {
        AbstractC22676k.m65750j(startLabel, "startLabel");
        AbstractC22676k.m65750j(endLabel, "endLabel");
        AbstractC22676k.m65750j(barStyle, "barStyle");
        this.lowerBound = f13;
        this.centerBound = f14;
        this.upperBound = f15;
        this.startLabel = startLabel;
        this.centerLabel = str;
        this.endLabel = endLabel;
        this.sliderValue = f16;
        this.barThickness = i13;
        this.barStyle = barStyle;
        this.stateUpdateKey = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TriLabelSliderBarStyle getBarStyle() {
        return this.barStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBarThickness() {
        return this.barThickness;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getCenterBound() {
        return this.centerBound;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCenterLabel() {
        return this.centerLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29970c)) {
            return false;
        }
        C29970c c29970c = (C29970c) other;
        return Float.compare(this.lowerBound, c29970c.lowerBound) == 0 && AbstractC22676k.m65745e(this.centerBound, c29970c.centerBound) && Float.compare(this.upperBound, c29970c.upperBound) == 0 && AbstractC22676k.m65745e(this.startLabel, c29970c.startLabel) && AbstractC22676k.m65745e(this.centerLabel, c29970c.centerLabel) && AbstractC22676k.m65745e(this.endLabel, c29970c.endLabel) && Float.compare(this.sliderValue, c29970c.sliderValue) == 0 && this.barThickness == c29970c.barThickness && this.barStyle == c29970c.barStyle && AbstractC22676k.m65745e(this.stateUpdateKey, c29970c.stateUpdateKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEndLabel() {
        return this.endLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSliderValue() {
        return this.sliderValue;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.lowerBound) * 31;
        Float f13 = this.centerBound;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.upperBound, (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31, this.startLabel);
        String str = this.centerLabel;
        int iHashCode2 = (this.barStyle.hashCode() + AbstractC11266d.m30448b(this.barThickness, AbstractC11266d.m30447a(this.sliderValue, AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.endLabel), 31), 31)) * 31;
        String str2 = this.stateUpdateKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStartLabel() {
        return this.startLabel;
    }

    /* JADX INFO: renamed from: j */
    public final String m91668j() {
        return this.stateUpdateKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        float f13 = this.lowerBound;
        Float f14 = this.centerBound;
        float f15 = this.upperBound;
        String str = this.startLabel;
        String str2 = this.centerLabel;
        String str3 = this.endLabel;
        float f16 = this.sliderValue;
        int i13 = this.barThickness;
        TriLabelSliderBarStyle triLabelSliderBarStyle = this.barStyle;
        String str4 = this.stateUpdateKey;
        StringBuilder sb4 = new StringBuilder("TriLabelSliderItemViewState(lowerBound=");
        sb4.append(f13);
        sb4.append(", centerBound=");
        sb4.append(f14);
        sb4.append(", upperBound=");
        sb4.append(f15);
        sb4.append(", startLabel=");
        sb4.append(str);
        sb4.append(", centerLabel=");
        AbstractC11266d.m30444B(sb4, str2, ", endLabel=", str3, ", sliderValue=");
        sb4.append(f16);
        sb4.append(", barThickness=");
        sb4.append(i13);
        sb4.append(", barStyle=");
        sb4.append(triLabelSliderBarStyle);
        sb4.append(", stateUpdateKey=");
        sb4.append(str4);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // p720m91.InterfaceC25305n
    /* JADX INFO: renamed from: getId, reason: avoid collision after fix types in other method and from getter */
    public String getStateUpdateKey() {
        return this.stateUpdateKey;
    }
}
