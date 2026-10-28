package nu1;

import com.whoop.lastnightsleep.domain.models.LastNightSleepModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nu1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lnu1/c;", "", "Lnu1/a;", "currentDialogType", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "response", "Lnu1/g;", "selectedHeartRateZoneType", "Lnu1/f;", "scrubbingHorizontalStatState", "<init>", "(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;)V", "a", "(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;)Lnu1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnu1/a;", "c", "()Lnu1/a;", "b", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "d", "()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "Lnu1/g;", "f", "()Lnu1/g;", "Lnu1/f;", "e", "()Lnu1/f;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27139c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC27137a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LastNightSleepModel response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27143g selectedHeartRateZoneType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27142f scrubbingHorizontalStatState;

    public C27139c(InterfaceC27137a interfaceC27137a, LastNightSleepModel lastNightSleepModel, C27143g c27143g, C27142f c27142f) {
        this.currentDialogType = interfaceC27137a;
        this.response = lastNightSleepModel;
        this.selectedHeartRateZoneType = c27143g;
        this.scrubbingHorizontalStatState = c27142f;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27139c m81609b(C27139c c27139c, InterfaceC27137a interfaceC27137a, LastNightSleepModel lastNightSleepModel, C27143g c27143g, C27142f c27142f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC27137a = c27139c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            lastNightSleepModel = c27139c.response;
        }
        if ((i13 & 4) != 0) {
            c27143g = c27139c.selectedHeartRateZoneType;
        }
        if ((i13 & 8) != 0) {
            c27142f = c27139c.scrubbingHorizontalStatState;
        }
        return c27139c.m81610a(interfaceC27137a, lastNightSleepModel, c27143g, c27142f);
    }

    /* JADX INFO: renamed from: a */
    public final C27139c m81610a(InterfaceC27137a currentDialogType, LastNightSleepModel response, C27143g selectedHeartRateZoneType, C27142f scrubbingHorizontalStatState) {
        return new C27139c(currentDialogType, response, selectedHeartRateZoneType, scrubbingHorizontalStatState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC27137a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LastNightSleepModel getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27142f getScrubbingHorizontalStatState() {
        return this.scrubbingHorizontalStatState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27139c)) {
            return false;
        }
        C27139c c27139c = (C27139c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c27139c.currentDialogType) && AbstractC22676k.m65745e(this.response, c27139c.response) && AbstractC22676k.m65745e(this.selectedHeartRateZoneType, c27139c.selectedHeartRateZoneType) && AbstractC22676k.m65745e(this.scrubbingHorizontalStatState, c27139c.scrubbingHorizontalStatState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27143g getSelectedHeartRateZoneType() {
        return this.selectedHeartRateZoneType;
    }

    public int hashCode() {
        InterfaceC27137a interfaceC27137a = this.currentDialogType;
        int iHashCode = (interfaceC27137a == null ? 0 : interfaceC27137a.hashCode()) * 31;
        LastNightSleepModel lastNightSleepModel = this.response;
        int iHashCode2 = (iHashCode + (lastNightSleepModel == null ? 0 : lastNightSleepModel.hashCode())) * 31;
        C27143g c27143g = this.selectedHeartRateZoneType;
        int iHashCode3 = (iHashCode2 + (c27143g == null ? 0 : c27143g.hashCode())) * 31;
        C27142f c27142f = this.scrubbingHorizontalStatState;
        return iHashCode3 + (c27142f != null ? c27142f.hashCode() : 0);
    }

    public String toString() {
        return "LastNightSleepDomainState(currentDialogType=" + this.currentDialogType + ", response=" + this.response + ", selectedHeartRateZoneType=" + this.selectedHeartRateZoneType + ", scrubbingHorizontalStatState=" + this.scrubbingHorizontalStatState + ")";
    }

    public /* synthetic */ C27139c(InterfaceC27137a interfaceC27137a, LastNightSleepModel lastNightSleepModel, C27143g c27143g, C27142f c27142f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC27137a, (i13 & 2) != 0 ? null : lastNightSleepModel, (i13 & 4) != 0 ? null : c27143g, (i13 & 8) != 0 ? null : c27142f);
    }
}
