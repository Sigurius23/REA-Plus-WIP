package ie2;

import com.whoop.design.models.items.CtaTileModel;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ie2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lie2/b;", "", "Lie2/d;", "currentScreenType", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "settingsScreenResponse", "<init>", "(Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)V", "a", "(Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lie2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lie2/d;", "c", "()Lie2/d;", "b", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "d", "()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18447b {

    /* JADX INFO: renamed from: c */
    public static final int f71830c = CtaTileModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18449d currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShepherdToggleSettingsResponse settingsScreenResponse;

    public C18447b(InterfaceC18449d currentScreenType, ShepherdToggleSettingsResponse shepherdToggleSettingsResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.settingsScreenResponse = shepherdToggleSettingsResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18447b m53151b(C18447b c18447b, InterfaceC18449d interfaceC18449d, ShepherdToggleSettingsResponse shepherdToggleSettingsResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC18449d = c18447b.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            shepherdToggleSettingsResponse = c18447b.settingsScreenResponse;
        }
        return c18447b.m53152a(interfaceC18449d, shepherdToggleSettingsResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C18447b m53152a(InterfaceC18449d currentScreenType, ShepherdToggleSettingsResponse settingsScreenResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C18447b(currentScreenType, settingsScreenResponse);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC18449d getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShepherdToggleSettingsResponse getSettingsScreenResponse() {
        return this.settingsScreenResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18447b)) {
            return false;
        }
        C18447b c18447b = (C18447b) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c18447b.currentScreenType) && AbstractC22676k.m65745e(this.settingsScreenResponse, c18447b.settingsScreenResponse);
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        ShepherdToggleSettingsResponse shepherdToggleSettingsResponse = this.settingsScreenResponse;
        return iHashCode + (shepherdToggleSettingsResponse == null ? 0 : shepherdToggleSettingsResponse.hashCode());
    }

    public String toString() {
        return "ShepherdToggleSettingsDomainState(currentScreenType=" + this.currentScreenType + ", settingsScreenResponse=" + this.settingsScreenResponse + ")";
    }

    public /* synthetic */ C18447b(InterfaceC18449d interfaceC18449d, ShepherdToggleSettingsResponse shepherdToggleSettingsResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC18449d.d.f71864a : interfaceC18449d, (i13 & 2) != 0 ? null : shepherdToggleSettingsResponse);
    }
}
