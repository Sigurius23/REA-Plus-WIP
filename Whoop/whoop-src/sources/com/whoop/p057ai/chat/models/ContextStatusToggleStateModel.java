package com.whoop.p057ai.chat.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
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
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "", "", "title", "subtitle", "icon", "Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "request", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "component5", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getIcon", "Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "getRequest", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContextStatusToggleStateModel {
    private final AnalyticEventModel analyticEvent;
    private final String icon;
    private final ContextStatusToggleRequestModel request;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.ContextStatusToggleStateModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContextStatusToggleStateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContextStatusToggleStateModel(int i13, String str, String str2, String str3, ContextStatusToggleRequestModel contextStatusToggleRequestModel, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i13 & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 9, ContextStatusToggleStateModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        this.request = contextStatusToggleRequestModel;
        if ((i13 & 16) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    public static /* synthetic */ ContextStatusToggleStateModel copy$default(ContextStatusToggleStateModel contextStatusToggleStateModel, String str, String str2, String str3, ContextStatusToggleRequestModel contextStatusToggleRequestModel, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextStatusToggleStateModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = contextStatusToggleStateModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = contextStatusToggleStateModel.icon;
        }
        if ((i13 & 8) != 0) {
            contextStatusToggleRequestModel = contextStatusToggleStateModel.request;
        }
        if ((i13 & 16) != 0) {
            analyticEventModel = contextStatusToggleStateModel.analyticEvent;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        String str4 = str3;
        return contextStatusToggleStateModel.copy(str, str2, str4, contextStatusToggleRequestModel, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$bot_release(ContextStatusToggleStateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        }
        output.encodeSerializableElement(serialDesc, 3, ContextStatusToggleRequestModel$$serializer.INSTANCE, self.request);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContextStatusToggleRequestModel getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final ContextStatusToggleStateModel copy(String title, String subtitle, String icon, ContextStatusToggleRequestModel request, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(request, "request");
        return new ContextStatusToggleStateModel(title, subtitle, icon, request, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextStatusToggleStateModel)) {
            return false;
        }
        ContextStatusToggleStateModel contextStatusToggleStateModel = (ContextStatusToggleStateModel) other;
        return AbstractC22676k.m65745e(this.title, contextStatusToggleStateModel.title) && AbstractC22676k.m65745e(this.subtitle, contextStatusToggleStateModel.subtitle) && AbstractC22676k.m65745e(this.icon, contextStatusToggleStateModel.icon) && AbstractC22676k.m65745e(this.request, contextStatusToggleStateModel.request) && AbstractC22676k.m65745e(this.analyticEvent, contextStatusToggleStateModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final ContextStatusToggleRequestModel getRequest() {
        return this.request;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (this.request.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode3 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        ContextStatusToggleRequestModel contextStatusToggleRequestModel = this.request;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextStatusToggleStateModel(title=", str, ", subtitle=", str2, ", icon=");
        sbM32001t.append(str3);
        sbM32001t.append(", request=");
        sbM32001t.append(contextStatusToggleRequestModel);
        sbM32001t.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sbM32001t, analyticEventModel, ")");
    }

    public ContextStatusToggleStateModel(String title, String str, String str2, ContextStatusToggleRequestModel request, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(request, "request");
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.request = request;
        this.analyticEvent = analyticEventModel;
    }

    public /* synthetic */ ContextStatusToggleStateModel(String str, String str2, String str3, ContextStatusToggleRequestModel contextStatusToggleRequestModel, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, contextStatusToggleRequestModel, (i13 & 16) != 0 ? null : analyticEventModel);
    }
}
