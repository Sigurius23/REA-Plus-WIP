package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/StartTurnButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "icon", "Lcom/whoop/design/models/items/StartTurnButtonStyleModel;", "style", "Lcom/whoop/navigation/models/ApiRequest;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/StartTurnButtonStyleModel;Lcom/whoop/navigation/models/ApiRequest;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/StartTurnButtonStyleModel;Lcom/whoop/navigation/models/ApiRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StartTurnButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/StartTurnButtonStyleModel;", "component4", "()Lcom/whoop/navigation/models/ApiRequest;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/StartTurnButtonStyleModel;Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/design/models/items/StartTurnButtonModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon", "Lcom/whoop/design/models/items/StartTurnButtonStyleModel;", "getStyle", "Lcom/whoop/navigation/models/ApiRequest;", "getRequest", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StartTurnButtonModel implements DesignSystemModel {
    private final String icon;
    private final ApiRequest request;
    private final StartTurnButtonStyleModel style;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ApiRequest.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StartTurnButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StartTurnButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StartTurnButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StartTurnButtonModel(int i13, String str, String str2, StartTurnButtonStyleModel startTurnButtonStyleModel, ApiRequest apiRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StartTurnButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.icon = str2;
        this.style = startTurnButtonStyleModel;
        this.request = apiRequest;
    }

    public static /* synthetic */ StartTurnButtonModel copy$default(StartTurnButtonModel startTurnButtonModel, String str, String str2, StartTurnButtonStyleModel startTurnButtonStyleModel, ApiRequest apiRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = startTurnButtonModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = startTurnButtonModel.icon;
        }
        if ((i13 & 4) != 0) {
            startTurnButtonStyleModel = startTurnButtonModel.style;
        }
        if ((i13 & 8) != 0) {
            apiRequest = startTurnButtonModel.request;
        }
        return startTurnButtonModel.copy(str, str2, startTurnButtonStyleModel, apiRequest);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StartTurnButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.icon);
        output.encodeSerializableElement(serialDesc, 2, StartTurnButtonStyleModel$$serializer.INSTANCE, self.style);
        output.encodeSerializableElement(serialDesc, 3, ApiRequest$$serializer.INSTANCE, self.request);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StartTurnButtonStyleModel getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    public final StartTurnButtonModel copy(String title, String icon, StartTurnButtonStyleModel style, ApiRequest request) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(request, "request");
        return new StartTurnButtonModel(title, icon, style, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartTurnButtonModel)) {
            return false;
        }
        StartTurnButtonModel startTurnButtonModel = (StartTurnButtonModel) other;
        return AbstractC22676k.m65745e(this.title, startTurnButtonModel.title) && AbstractC22676k.m65745e(this.icon, startTurnButtonModel.icon) && AbstractC22676k.m65745e(this.style, startTurnButtonModel.style) && AbstractC22676k.m65745e(this.request, startTurnButtonModel.request);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final ApiRequest getRequest() {
        return this.request;
    }

    public final StartTurnButtonStyleModel getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.icon;
        return this.request.hashCode() + ((this.style.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.icon;
        StartTurnButtonStyleModel startTurnButtonStyleModel = this.style;
        ApiRequest apiRequest = this.request;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StartTurnButtonModel(title=", str, ", icon=", str2, ", style=");
        sbM32001t.append(startTurnButtonStyleModel);
        sbM32001t.append(", request=");
        sbM32001t.append(apiRequest);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StartTurnButtonModel(String title, String str, StartTurnButtonStyleModel style, ApiRequest request) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(request, "request");
        this.title = title;
        this.icon = str;
        this.style = style;
        this.request = request;
    }
}
