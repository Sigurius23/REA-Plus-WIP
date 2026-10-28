package com.whoop.sms.common.data;

import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "", "", "showTextingSettings", "", "title", "icon", "Lcom/whoop/navigation/models/ApiRequest;", "destination", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sms_release", "(Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/navigation/models/ApiRequest;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowTextingSettings", "Ljava/lang/String;", "getTitle", "getIcon", "Lcom/whoop/navigation/models/ApiRequest;", "getDestination", "Companion", "$serializer", "a", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextingSettingsAvailabilityResponse {
    private final ApiRequest destination;
    private final String icon;
    private final boolean showTextingSettings;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ApiRequest.$stable;

    /* JADX INFO: renamed from: com.whoop.sms.common.data.TextingSettingsAvailabilityResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "serializer", "()Lwc3/c;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextingSettingsAvailabilityResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextingSettingsAvailabilityResponse(int i13, boolean z4, String str, String str2, ApiRequest apiRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, TextingSettingsAvailabilityResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.showTextingSettings = false;
        } else {
            this.showTextingSettings = z4;
        }
        this.title = str;
        this.icon = str2;
        this.destination = apiRequest;
    }

    public static /* synthetic */ TextingSettingsAvailabilityResponse copy$default(TextingSettingsAvailabilityResponse textingSettingsAvailabilityResponse, boolean z4, String str, String str2, ApiRequest apiRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = textingSettingsAvailabilityResponse.showTextingSettings;
        }
        if ((i13 & 2) != 0) {
            str = textingSettingsAvailabilityResponse.title;
        }
        if ((i13 & 4) != 0) {
            str2 = textingSettingsAvailabilityResponse.icon;
        }
        if ((i13 & 8) != 0) {
            apiRequest = textingSettingsAvailabilityResponse.destination;
        }
        return textingSettingsAvailabilityResponse.copy(z4, str, str2, apiRequest);
    }

    public static final /* synthetic */ void write$Self$sms_release(TextingSettingsAvailabilityResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showTextingSettings) {
            output.encodeBooleanElement(serialDesc, 0, self.showTextingSettings);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 3, ApiRequest$$serializer.INSTANCE, self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowTextingSettings() {
        return this.showTextingSettings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ApiRequest getDestination() {
        return this.destination;
    }

    public final TextingSettingsAvailabilityResponse copy(boolean showTextingSettings, String title, String icon, ApiRequest destination) {
        return new TextingSettingsAvailabilityResponse(showTextingSettings, title, icon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextingSettingsAvailabilityResponse)) {
            return false;
        }
        TextingSettingsAvailabilityResponse textingSettingsAvailabilityResponse = (TextingSettingsAvailabilityResponse) other;
        return this.showTextingSettings == textingSettingsAvailabilityResponse.showTextingSettings && AbstractC22676k.m65745e(this.title, textingSettingsAvailabilityResponse.title) && AbstractC22676k.m65745e(this.icon, textingSettingsAvailabilityResponse.icon) && AbstractC22676k.m65745e(this.destination, textingSettingsAvailabilityResponse.destination);
    }

    public final ApiRequest getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final boolean getShowTextingSettings() {
        return this.showTextingSettings;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showTextingSettings) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiRequest apiRequest = this.destination;
        return iHashCode3 + (apiRequest != null ? apiRequest.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.showTextingSettings;
        String str = this.title;
        String str2 = this.icon;
        ApiRequest apiRequest = this.destination;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("TextingSettingsAvailabilityResponse(showTextingSettings=", ", title=", str, ", icon=", z4);
        sbM38567n.append(str2);
        sbM38567n.append(", destination=");
        sbM38567n.append(apiRequest);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public TextingSettingsAvailabilityResponse(boolean z4, String str, String str2, ApiRequest apiRequest) {
        this.showTextingSettings = z4;
        this.title = str;
        this.icon = str2;
        this.destination = apiRequest;
    }

    public /* synthetic */ TextingSettingsAvailabilityResponse(boolean z4, String str, String str2, ApiRequest apiRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, str, str2, apiRequest);
    }
}
