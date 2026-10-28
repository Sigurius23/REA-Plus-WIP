package com.whoop.helpcenter.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "", "", "title", "messageUsButtonTitle", "webFormUrl", "supportType", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$help_center_release", "(Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessageUsButtonTitle", "getWebFormUrl", "getSupportType", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NeedMoreHelpSection {

    @SerializedName("ai_action")
    private final AiAction aiAction;

    @SerializedName("message_us_button_title")
    private final String messageUsButtonTitle;

    @SerializedName("support_type")
    private final String supportType;

    @SerializedName("title")
    private final String title;

    @SerializedName("web_form_url")
    private final String webFormUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiAction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "serializer", "()Lwc3/c;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NeedMoreHelpSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NeedMoreHelpSection(int i13, String str, String str2, String str3, String str4, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, NeedMoreHelpSection$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.messageUsButtonTitle = str2;
        this.webFormUrl = str3;
        this.supportType = str4;
        if ((i13 & 16) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public static /* synthetic */ NeedMoreHelpSection copy$default(NeedMoreHelpSection needMoreHelpSection, String str, String str2, String str3, String str4, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = needMoreHelpSection.title;
        }
        if ((i13 & 2) != 0) {
            str2 = needMoreHelpSection.messageUsButtonTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = needMoreHelpSection.webFormUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = needMoreHelpSection.supportType;
        }
        if ((i13 & 16) != 0) {
            aiAction = needMoreHelpSection.aiAction;
        }
        AiAction aiAction2 = aiAction;
        String str5 = str3;
        return needMoreHelpSection.copy(str, str2, str5, str4, aiAction2);
    }

    public static final /* synthetic */ void write$Self$help_center_release(NeedMoreHelpSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.messageUsButtonTitle);
        output.encodeStringElement(serialDesc, 2, self.webFormUrl);
        output.encodeStringElement(serialDesc, 3, self.supportType);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageUsButtonTitle() {
        return this.messageUsButtonTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWebFormUrl() {
        return this.webFormUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSupportType() {
        return this.supportType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final NeedMoreHelpSection copy(String title, String messageUsButtonTitle, String webFormUrl, String supportType, AiAction aiAction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(messageUsButtonTitle, "messageUsButtonTitle");
        AbstractC22676k.m65750j(webFormUrl, "webFormUrl");
        AbstractC22676k.m65750j(supportType, "supportType");
        return new NeedMoreHelpSection(title, messageUsButtonTitle, webFormUrl, supportType, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeedMoreHelpSection)) {
            return false;
        }
        NeedMoreHelpSection needMoreHelpSection = (NeedMoreHelpSection) other;
        return AbstractC22676k.m65745e(this.title, needMoreHelpSection.title) && AbstractC22676k.m65745e(this.messageUsButtonTitle, needMoreHelpSection.messageUsButtonTitle) && AbstractC22676k.m65745e(this.webFormUrl, needMoreHelpSection.webFormUrl) && AbstractC22676k.m65745e(this.supportType, needMoreHelpSection.supportType) && AbstractC22676k.m65745e(this.aiAction, needMoreHelpSection.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getMessageUsButtonTitle() {
        return this.messageUsButtonTitle;
    }

    public final String getSupportType() {
        return this.supportType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWebFormUrl() {
        return this.webFormUrl;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.messageUsButtonTitle), 31, this.webFormUrl), 31, this.supportType);
        AiAction aiAction = this.aiAction;
        return iM30450d + (aiAction == null ? 0 : aiAction.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.messageUsButtonTitle;
        String str3 = this.webFormUrl;
        String str4 = this.supportType;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NeedMoreHelpSection(title=", str, ", messageUsButtonTitle=", str2, ", webFormUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", supportType=", str4, ", aiAction=");
        sbM32001t.append(aiAction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public NeedMoreHelpSection(String title, String messageUsButtonTitle, String webFormUrl, String supportType, AiAction aiAction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(messageUsButtonTitle, "messageUsButtonTitle");
        AbstractC22676k.m65750j(webFormUrl, "webFormUrl");
        AbstractC22676k.m65750j(supportType, "supportType");
        this.title = title;
        this.messageUsButtonTitle = messageUsButtonTitle;
        this.webFormUrl = webFormUrl;
        this.supportType = supportType;
        this.aiAction = aiAction;
    }

    public /* synthetic */ NeedMoreHelpSection(String str, String str2, String str3, String str4, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : aiAction);
    }
}
