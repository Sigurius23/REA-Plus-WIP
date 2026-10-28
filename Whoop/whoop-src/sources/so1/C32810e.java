package so1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternType;
import com.whoop.navigation.models.GenericInteraction;
import f11.C14005e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: so1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b#\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b.\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b2\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b\u001f\u0010:¨\u0006;"}, m65681d2 = {"Lso1/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;", "type", "", "Lf11/e;", "cycles", "", "todayIndex", "", "showDividers", "Lso1/d;", "button", "emptyState", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;Ljava/util/List;Ljava/lang/Integer;ZLso1/d;Lm91/u;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;", "j", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "e", "Z", "g", "()Z", "f", "Lso1/d;", "()Lso1/d;", "Lm91/u;", "()Lm91/u;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32810e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CyclePatternType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C14005e> cycles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer todayIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showDividers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C32808d button;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25312u emptyState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction genericInteraction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C32810e(TextResource titleDisplay, CyclePatternType type, List<C14005e> cycles, Integer num, boolean z4, C32808d c32808d, InterfaceC25312u interfaceC25312u, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cycles, "cycles");
        this.titleDisplay = titleDisplay;
        this.type = type;
        this.cycles = cycles;
        this.todayIndex = num;
        this.showDividers = z4;
        this.button = c32808d;
        this.emptyState = interfaceC25312u;
        this.genericInteraction = genericInteraction;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C32808d getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: c */
    public final List<C14005e> m102947c() {
        return this.cycles;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getEmptyState() {
        return this.emptyState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32810e)) {
            return false;
        }
        C32810e c32810e = (C32810e) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32810e.titleDisplay) && this.type == c32810e.type && AbstractC22676k.m65745e(this.cycles, c32810e.cycles) && AbstractC22676k.m65745e(this.todayIndex, c32810e.todayIndex) && this.showDividers == c32810e.showDividers && AbstractC22676k.m65745e(this.button, c32810e.button) && AbstractC22676k.m65745e(this.emptyState, c32810e.emptyState) && AbstractC22676k.m65745e(this.genericInteraction, c32810e.genericInteraction) && AbstractC22676k.m65745e(this.analyticEvent, c32810e.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowDividers() {
        return this.showDividers;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.type.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31, 31, this.cycles);
        Integer num = this.todayIndex;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (num == null ? 0 : num.hashCode())) * 31, 31, this.showDividers);
        C32808d c32808d = this.button;
        int iHashCode = (iM8289b + (c32808d == null ? 0 : c32808d.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.emptyState;
        int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode3 = (iHashCode2 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode3 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getTodayIndex() {
        return this.todayIndex;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final CyclePatternType getType() {
        return this.type;
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        CyclePatternType cyclePatternType = this.type;
        List<C14005e> list = this.cycles;
        Integer num = this.todayIndex;
        boolean z4 = this.showDividers;
        C32808d c32808d = this.button;
        InterfaceC25312u interfaceC25312u = this.emptyState;
        GenericInteraction genericInteraction = this.genericInteraction;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sb4 = new StringBuilder("CyclePatternTileViewState(titleDisplay=");
        sb4.append(textResource);
        sb4.append(", type=");
        sb4.append(cyclePatternType);
        sb4.append(", cycles=");
        sb4.append(list);
        sb4.append(", todayIndex=");
        sb4.append(num);
        sb4.append(", showDividers=");
        sb4.append(z4);
        sb4.append(", button=");
        sb4.append(c32808d);
        sb4.append(", emptyState=");
        sb4.append(interfaceC25312u);
        sb4.append(", genericInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
    }
}
