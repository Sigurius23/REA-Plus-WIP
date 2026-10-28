package dw0;

import com.whoop.core.details.network.model.CoreDetailsModelState;
import com.whoop.design.util.TextResource;
import hw0.EnumC17696a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mc1.EnumC25417b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dw0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0086\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b'\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b:\u00109R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u0010;\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b<\u00109¨\u0006="}, m65681d2 = {"Ldw0/c;", "", "", "currentWorkoutId", "Lhw0/a;", "currentActivityType", "Lmc1/b;", "currentHeartZoneType", "Ldw0/j;", "currentHeartRateState", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "detailsModelState", "Ldw0/g;", "coreDetailsState", "Ldw0/f;", "popUpState", "", "showLinkWorkoutCtaTile", "showMomentEntryPointTile", "", "currentExerciseCardIndex", "isResetEditScreenAutoPopState", "<init>", "(Ljava/lang/String;Lhw0/a;Lmc1/b;Ldw0/j;Lcom/whoop/core/details/network/model/CoreDetailsModelState;Ldw0/g;Ldw0/f;ZZIZ)V", "a", "(Ljava/lang/String;Lhw0/a;Lmc1/b;Ldw0/j;Lcom/whoop/core/details/network/model/CoreDetailsModelState;Ldw0/g;Ldw0/f;ZZIZ)Ldw0/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Lhw0/a;", "d", "()Lhw0/a;", "c", "Lmc1/b;", "g", "()Lmc1/b;", "Ldw0/j;", "f", "()Ldw0/j;", "e", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "i", "()Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "Ldw0/g;", "()Ldw0/g;", "Ldw0/f;", "j", "()Ldw0/f;", "Z", "k", "()Z", "l", "I", "m", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12404c {

    /* JADX INFO: renamed from: l */
    public static final int f42026l = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String currentWorkoutId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC17696a currentActivityType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC25417b currentHeartZoneType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12411j currentHeartRateState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final CoreDetailsModelState detailsModelState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC12408g coreDetailsState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC12407f popUpState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showLinkWorkoutCtaTile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showMomentEntryPointTile;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int currentExerciseCardIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isResetEditScreenAutoPopState;

    public C12404c(String str, EnumC17696a currentActivityType, EnumC25417b currentHeartZoneType, C12411j c12411j, CoreDetailsModelState coreDetailsModelState, InterfaceC12408g coreDetailsState, InterfaceC12407f interfaceC12407f, boolean z4, boolean z13, int i13, boolean z14) {
        AbstractC22676k.m65750j(currentActivityType, "currentActivityType");
        AbstractC22676k.m65750j(currentHeartZoneType, "currentHeartZoneType");
        AbstractC22676k.m65750j(coreDetailsState, "coreDetailsState");
        this.currentWorkoutId = str;
        this.currentActivityType = currentActivityType;
        this.currentHeartZoneType = currentHeartZoneType;
        this.currentHeartRateState = c12411j;
        this.detailsModelState = coreDetailsModelState;
        this.coreDetailsState = coreDetailsState;
        this.popUpState = interfaceC12407f;
        this.showLinkWorkoutCtaTile = z4;
        this.showMomentEntryPointTile = z13;
        this.currentExerciseCardIndex = i13;
        this.isResetEditScreenAutoPopState = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12404c m34855b(C12404c c12404c, String str, EnumC17696a enumC17696a, EnumC25417b enumC25417b, C12411j c12411j, CoreDetailsModelState coreDetailsModelState, InterfaceC12408g interfaceC12408g, InterfaceC12407f interfaceC12407f, boolean z4, boolean z13, int i13, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c12404c.currentWorkoutId;
        }
        if ((i14 & 2) != 0) {
            enumC17696a = c12404c.currentActivityType;
        }
        if ((i14 & 4) != 0) {
            enumC25417b = c12404c.currentHeartZoneType;
        }
        if ((i14 & 8) != 0) {
            c12411j = c12404c.currentHeartRateState;
        }
        if ((i14 & 16) != 0) {
            coreDetailsModelState = c12404c.detailsModelState;
        }
        if ((i14 & 32) != 0) {
            interfaceC12408g = c12404c.coreDetailsState;
        }
        if ((i14 & 64) != 0) {
            interfaceC12407f = c12404c.popUpState;
        }
        if ((i14 & 128) != 0) {
            z4 = c12404c.showLinkWorkoutCtaTile;
        }
        if ((i14 & 256) != 0) {
            z13 = c12404c.showMomentEntryPointTile;
        }
        if ((i14 & 512) != 0) {
            i13 = c12404c.currentExerciseCardIndex;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z14 = c12404c.isResetEditScreenAutoPopState;
        }
        int i15 = i13;
        boolean z15 = z14;
        boolean z16 = z4;
        boolean z17 = z13;
        InterfaceC12408g interfaceC12408g2 = interfaceC12408g;
        InterfaceC12407f interfaceC12407f2 = interfaceC12407f;
        CoreDetailsModelState coreDetailsModelState2 = coreDetailsModelState;
        EnumC25417b enumC25417b2 = enumC25417b;
        return c12404c.m34856a(str, enumC17696a, enumC25417b2, c12411j, coreDetailsModelState2, interfaceC12408g2, interfaceC12407f2, z16, z17, i15, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C12404c m34856a(String currentWorkoutId, EnumC17696a currentActivityType, EnumC25417b currentHeartZoneType, C12411j currentHeartRateState, CoreDetailsModelState detailsModelState, InterfaceC12408g coreDetailsState, InterfaceC12407f popUpState, boolean showLinkWorkoutCtaTile, boolean showMomentEntryPointTile, int currentExerciseCardIndex, boolean isResetEditScreenAutoPopState) {
        AbstractC22676k.m65750j(currentActivityType, "currentActivityType");
        AbstractC22676k.m65750j(currentHeartZoneType, "currentHeartZoneType");
        AbstractC22676k.m65750j(coreDetailsState, "coreDetailsState");
        return new C12404c(currentWorkoutId, currentActivityType, currentHeartZoneType, currentHeartRateState, detailsModelState, coreDetailsState, popUpState, showLinkWorkoutCtaTile, showMomentEntryPointTile, currentExerciseCardIndex, isResetEditScreenAutoPopState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC12408g getCoreDetailsState() {
        return this.coreDetailsState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC17696a getCurrentActivityType() {
        return this.currentActivityType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCurrentExerciseCardIndex() {
        return this.currentExerciseCardIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12404c)) {
            return false;
        }
        C12404c c12404c = (C12404c) other;
        return AbstractC22676k.m65745e(this.currentWorkoutId, c12404c.currentWorkoutId) && this.currentActivityType == c12404c.currentActivityType && this.currentHeartZoneType == c12404c.currentHeartZoneType && AbstractC22676k.m65745e(this.currentHeartRateState, c12404c.currentHeartRateState) && AbstractC22676k.m65745e(this.detailsModelState, c12404c.detailsModelState) && AbstractC22676k.m65745e(this.coreDetailsState, c12404c.coreDetailsState) && AbstractC22676k.m65745e(this.popUpState, c12404c.popUpState) && this.showLinkWorkoutCtaTile == c12404c.showLinkWorkoutCtaTile && this.showMomentEntryPointTile == c12404c.showMomentEntryPointTile && this.currentExerciseCardIndex == c12404c.currentExerciseCardIndex && this.isResetEditScreenAutoPopState == c12404c.isResetEditScreenAutoPopState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C12411j getCurrentHeartRateState() {
        return this.currentHeartRateState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC25417b getCurrentHeartZoneType() {
        return this.currentHeartZoneType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCurrentWorkoutId() {
        return this.currentWorkoutId;
    }

    public int hashCode() {
        String str = this.currentWorkoutId;
        int iHashCode = (this.currentHeartZoneType.hashCode() + ((this.currentActivityType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        C12411j c12411j = this.currentHeartRateState;
        int iHashCode2 = (iHashCode + (c12411j == null ? 0 : c12411j.hashCode())) * 31;
        CoreDetailsModelState coreDetailsModelState = this.detailsModelState;
        int iHashCode3 = (this.coreDetailsState.hashCode() + ((iHashCode2 + (coreDetailsModelState == null ? 0 : coreDetailsModelState.hashCode())) * 31)) * 31;
        InterfaceC12407f interfaceC12407f = this.popUpState;
        return Boolean.hashCode(this.isResetEditScreenAutoPopState) + AbstractC11266d.m30448b(this.currentExerciseCardIndex, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (interfaceC12407f != null ? interfaceC12407f.hashCode() : 0)) * 31, 31, this.showLinkWorkoutCtaTile), 31, this.showMomentEntryPointTile), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final CoreDetailsModelState getDetailsModelState() {
        return this.detailsModelState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC12407f getPopUpState() {
        return this.popUpState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowLinkWorkoutCtaTile() {
        return this.showLinkWorkoutCtaTile;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowMomentEntryPointTile() {
        return this.showMomentEntryPointTile;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsResetEditScreenAutoPopState() {
        return this.isResetEditScreenAutoPopState;
    }

    public String toString() {
        String str = this.currentWorkoutId;
        EnumC17696a enumC17696a = this.currentActivityType;
        EnumC25417b enumC25417b = this.currentHeartZoneType;
        C12411j c12411j = this.currentHeartRateState;
        CoreDetailsModelState coreDetailsModelState = this.detailsModelState;
        InterfaceC12408g interfaceC12408g = this.coreDetailsState;
        InterfaceC12407f interfaceC12407f = this.popUpState;
        boolean z4 = this.showLinkWorkoutCtaTile;
        boolean z13 = this.showMomentEntryPointTile;
        int i13 = this.currentExerciseCardIndex;
        boolean z14 = this.isResetEditScreenAutoPopState;
        StringBuilder sb4 = new StringBuilder("CoreDetailsDomainState(currentWorkoutId=");
        sb4.append(str);
        sb4.append(", currentActivityType=");
        sb4.append(enumC17696a);
        sb4.append(", currentHeartZoneType=");
        sb4.append(enumC25417b);
        sb4.append(", currentHeartRateState=");
        sb4.append(c12411j);
        sb4.append(", detailsModelState=");
        sb4.append(coreDetailsModelState);
        sb4.append(", coreDetailsState=");
        sb4.append(interfaceC12408g);
        sb4.append(", popUpState=");
        sb4.append(interfaceC12407f);
        sb4.append(", showLinkWorkoutCtaTile=");
        sb4.append(z4);
        sb4.append(", showMomentEntryPointTile=");
        AbstractC30802r.m94769r(i13, ", currentExerciseCardIndex=", ", isResetEditScreenAutoPopState=", sb4, z13);
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C12404c(String str, EnumC17696a enumC17696a, EnumC25417b enumC25417b, C12411j c12411j, CoreDetailsModelState coreDetailsModelState, InterfaceC12408g interfaceC12408g, InterfaceC12407f interfaceC12407f, boolean z4, boolean z13, int i13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? EnumC17696a.CARDIO : enumC17696a, (i14 & 4) != 0 ? EnumC25417b.NONE : enumC25417b, (i14 & 8) != 0 ? null : c12411j, (i14 & 16) != 0 ? null : coreDetailsModelState, (i14 & 32) != 0 ? InterfaceC12408g.g.f42199a : interfaceC12408g, (i14 & 64) != 0 ? null : interfaceC12407f, (i14 & 128) != 0 ? true : z4, (i14 & 256) != 0 ? true : z13, (i14 & 512) != 0 ? 0 : i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14);
    }
}
