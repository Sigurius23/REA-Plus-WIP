package com.whoop.shepherd.feature.togglesettings.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "", "", "title", "description", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Z", "getEnabled", "Companion", "$serializer", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdToggleResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("description")
    private final String description;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdToggleResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShepherdToggleResponse() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShepherdToggleResponse copy$default(ShepherdToggleResponse shepherdToggleResponse, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdToggleResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdToggleResponse.description;
        }
        if ((i13 & 4) != 0) {
            z4 = shepherdToggleResponse.enabled;
        }
        return shepherdToggleResponse.copy(str, str2, z4);
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdToggleResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.description, "")) {
            output.encodeStringElement(serialDesc, 1, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.enabled) {
            output.encodeBooleanElement(serialDesc, 2, self.enabled);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ShepherdToggleResponse copy(String title, String description, boolean enabled) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new ShepherdToggleResponse(title, description, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdToggleResponse)) {
            return false;
        }
        ShepherdToggleResponse shepherdToggleResponse = (ShepherdToggleResponse) other;
        return AbstractC22676k.m65745e(this.title, shepherdToggleResponse.title) && AbstractC22676k.m65745e(this.description, shepherdToggleResponse.description) && this.enabled == shepherdToggleResponse.enabled;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("ShepherdToggleResponse(title=", str, ", description=", str2, ", enabled="), this.enabled, ")");
    }

    public /* synthetic */ ShepherdToggleResponse(int i13, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i13 & 4) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z4;
        }
    }

    public ShepherdToggleResponse(String title, String description, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
        this.enabled = z4;
    }

    public /* synthetic */ ShepherdToggleResponse(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z4);
    }
}
