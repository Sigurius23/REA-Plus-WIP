package o71;

import com.whoop.domain.model.UnitSystem;
import d21.C11505c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import s41.C32194b;

/* JADX INFO: renamed from: o71.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001b\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b)\u0010\u0012¨\u0006,"}, m65681d2 = {"Lo71/h;", "Lm91/u;", "", "Lo71/i;", "segments", "", "heightLabel", "Ld21/c;", "heightPickerState", "weightLabel", "Ls41/b;", "weightPickerState", "Lcom/whoop/domain/model/UnitSystem;", "defaultUnitSystem", "stateUpdateUnitKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ld21/c;Ljava/lang/String;Ls41/b;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Ld21/c;", "()Ld21/c;", "d", "g", "Ls41/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ls41/b;", "f", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27638h implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f111213h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C27639i> segments;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String heightLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11505c heightPickerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String weightLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32194b weightPickerState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final UnitSystem defaultUnitSystem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String stateUpdateUnitKey;

    public C27638h(List<C27639i> segments, String str, C11505c c11505c, String str2, C32194b c32194b, UnitSystem defaultUnitSystem, String str3) {
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(defaultUnitSystem, "defaultUnitSystem");
        this.segments = segments;
        this.heightLabel = str;
        this.heightPickerState = c11505c;
        this.weightLabel = str2;
        this.weightPickerState = c32194b;
        this.defaultUnitSystem = defaultUnitSystem;
        this.stateUpdateUnitKey = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UnitSystem getDefaultUnitSystem() {
        return this.defaultUnitSystem;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeightLabel() {
        return this.heightLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11505c getHeightPickerState() {
        return this.heightPickerState;
    }

    /* JADX INFO: renamed from: e */
    public final List<C27639i> m83451e() {
        return this.segments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27638h)) {
            return false;
        }
        C27638h c27638h = (C27638h) other;
        return AbstractC22676k.m65745e(this.segments, c27638h.segments) && AbstractC22676k.m65745e(this.heightLabel, c27638h.heightLabel) && AbstractC22676k.m65745e(this.heightPickerState, c27638h.heightPickerState) && AbstractC22676k.m65745e(this.weightLabel, c27638h.weightLabel) && AbstractC22676k.m65745e(this.weightPickerState, c27638h.weightPickerState) && this.defaultUnitSystem == c27638h.defaultUnitSystem && AbstractC22676k.m65745e(this.stateUpdateUnitKey, c27638h.stateUpdateUnitKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWeightLabel() {
        return this.weightLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C32194b getWeightPickerState() {
        return this.weightPickerState;
    }

    public int hashCode() {
        int iHashCode = this.segments.hashCode() * 31;
        String str = this.heightLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C11505c c11505c = this.heightPickerState;
        int iHashCode3 = (iHashCode2 + (c11505c == null ? 0 : c11505c.hashCode())) * 31;
        String str2 = this.weightLabel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C32194b c32194b = this.weightPickerState;
        int iHashCode5 = (this.defaultUnitSystem.hashCode() + ((iHashCode4 + (c32194b == null ? 0 : c32194b.hashCode())) * 31)) * 31;
        String str3 = this.stateUpdateUnitKey;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        List<C27639i> list = this.segments;
        String str = this.heightLabel;
        C11505c c11505c = this.heightPickerState;
        String str2 = this.weightLabel;
        C32194b c32194b = this.weightPickerState;
        UnitSystem unitSystem = this.defaultUnitSystem;
        String str3 = this.stateUpdateUnitKey;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("HeightWeightViewState(segments=", ", heightLabel=", str, ", heightPickerState=", list);
        sbM79507k.append(c11505c);
        sbM79507k.append(", weightLabel=");
        sbM79507k.append(str2);
        sbM79507k.append(", weightPickerState=");
        sbM79507k.append(c32194b);
        sbM79507k.append(", defaultUnitSystem=");
        sbM79507k.append(unitSystem);
        sbM79507k.append(", stateUpdateUnitKey=");
        return AbstractC25012a.m73376i(str3, ")", sbM79507k);
    }
}
