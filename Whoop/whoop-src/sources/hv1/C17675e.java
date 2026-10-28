package hv1;

import cm2.EnumC4821i;
import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hv1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lhv1/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "sheetTitle", "", "items", "Lcm2/i;", "measurementType", "", "measurementRecordId", "Lhv1/a;", "primaryButtonState", "secondaryButtonState", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcm2/i;Ljava/lang/String;Lhv1/a;Lhv1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcm2/i;", "()Lcm2/i;", "d", "Ljava/lang/String;", "getMeasurementRecordId", "e", "Lhv1/a;", "()Lhv1/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17675e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource sheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC4821i measurementType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String measurementRecordId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17671a primaryButtonState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17671a secondaryButtonState;

    /* JADX WARN: Multi-variable type inference failed */
    public C17675e(TextResource sheetTitle, List<? extends InterfaceC25312u> items, EnumC4821i measurementType, String str, C17671a primaryButtonState, C17671a c17671a) {
        AbstractC22676k.m65750j(sheetTitle, "sheetTitle");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(measurementType, "measurementType");
        AbstractC22676k.m65750j(primaryButtonState, "primaryButtonState");
        this.sheetTitle = sheetTitle;
        this.items = items;
        this.measurementType = measurementType;
        this.measurementRecordId = str;
        this.primaryButtonState = primaryButtonState;
        this.secondaryButtonState = c17671a;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m50431a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC4821i getMeasurementType() {
        return this.measurementType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17671a getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C17671a getSecondaryButtonState() {
        return this.secondaryButtonState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17675e)) {
            return false;
        }
        C17675e c17675e = (C17675e) other;
        return AbstractC22676k.m65745e(this.sheetTitle, c17675e.sheetTitle) && AbstractC22676k.m65745e(this.items, c17675e.items) && this.measurementType == c17675e.measurementType && AbstractC22676k.m65745e(this.measurementRecordId, c17675e.measurementRecordId) && AbstractC22676k.m65745e(this.primaryButtonState, c17675e.primaryButtonState) && AbstractC22676k.m65745e(this.secondaryButtonState, c17675e.secondaryButtonState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSheetTitle() {
        return this.sheetTitle;
    }

    public int hashCode() {
        int iHashCode = (this.measurementType.hashCode() + AbstractC11895b.m31983b(this.sheetTitle.hashCode() * 31, 31, this.items)) * 31;
        String str = this.measurementRecordId;
        int iHashCode2 = (this.primaryButtonState.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C17671a c17671a = this.secondaryButtonState;
        return iHashCode2 + (c17671a != null ? c17671a.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.sheetTitle;
        List<InterfaceC25312u> list = this.items;
        EnumC4821i enumC4821i = this.measurementType;
        String str = this.measurementRecordId;
        C17671a c17671a = this.primaryButtonState;
        C17671a c17671a2 = this.secondaryButtonState;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ManualMeasurementBottomSheetViewState(sheetTitle=", ", items=", ", measurementType=", list);
        sbM106657p.append(enumC4821i);
        sbM106657p.append(", measurementRecordId=");
        sbM106657p.append(str);
        sbM106657p.append(", primaryButtonState=");
        sbM106657p.append(c17671a);
        sbM106657p.append(", secondaryButtonState=");
        sbM106657p.append(c17671a2);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
