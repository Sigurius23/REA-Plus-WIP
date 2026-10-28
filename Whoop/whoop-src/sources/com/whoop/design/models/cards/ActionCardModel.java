package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/cards/ActionCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "body", "ctaText", "ctaIcon", "action", "imageUrl", "", "showHighlight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/ActionCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/cards/ActionCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getBody", "getCtaText", "getCtaIcon", "getAction", "getImageUrl", "Z", "getShowHighlight", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActionCardModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String action;
    private final String body;
    private final String ctaIcon;
    private final String ctaText;
    private final String id;
    private final String imageUrl;
    private final boolean showHighlight;
    private final String title;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/ActionCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/ActionCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActionCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActionCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, ActionCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.body = str3;
        this.ctaText = str4;
        this.ctaIcon = str5;
        this.action = str6;
        this.imageUrl = str7;
        this.showHighlight = z4;
    }

    public static /* synthetic */ ActionCardModel copy$default(ActionCardModel actionCardModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = actionCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = actionCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = actionCardModel.body;
        }
        if ((i13 & 8) != 0) {
            str4 = actionCardModel.ctaText;
        }
        if ((i13 & 16) != 0) {
            str5 = actionCardModel.ctaIcon;
        }
        if ((i13 & 32) != 0) {
            str6 = actionCardModel.action;
        }
        if ((i13 & 64) != 0) {
            str7 = actionCardModel.imageUrl;
        }
        if ((i13 & 128) != 0) {
            z4 = actionCardModel.showHighlight;
        }
        String str8 = str7;
        boolean z13 = z4;
        String str9 = str5;
        String str10 = str6;
        return actionCardModel.copy(str, str2, str3, str4, str9, str10, str8, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ActionCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.body);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.ctaIcon);
        output.encodeStringElement(serialDesc, 5, self.action);
        output.encodeStringElement(serialDesc, 6, self.imageUrl);
        output.encodeBooleanElement(serialDesc, 7, self.showHighlight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    public final ActionCardModel copy(String id4, String title, String body, String ctaText, String ctaIcon, String action, String imageUrl, boolean showHighlight) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new ActionCardModel(id4, title, body, ctaText, ctaIcon, action, imageUrl, showHighlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionCardModel)) {
            return false;
        }
        ActionCardModel actionCardModel = (ActionCardModel) other;
        return AbstractC22676k.m65745e(this.id, actionCardModel.id) && AbstractC22676k.m65745e(this.title, actionCardModel.title) && AbstractC22676k.m65745e(this.body, actionCardModel.body) && AbstractC22676k.m65745e(this.ctaText, actionCardModel.ctaText) && AbstractC22676k.m65745e(this.ctaIcon, actionCardModel.ctaIcon) && AbstractC22676k.m65745e(this.action, actionCardModel.action) && AbstractC22676k.m65745e(this.imageUrl, actionCardModel.imageUrl) && this.showHighlight == actionCardModel.showHighlight;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.body);
        String str = this.ctaText;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaIcon;
        return Boolean.hashCode(this.showHighlight) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.action), 31, this.imageUrl);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.body;
        String str4 = this.ctaText;
        String str5 = this.ctaIcon;
        String str6 = this.action;
        String str7 = this.imageUrl;
        boolean z4 = this.showHighlight;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActionCardModel(id=", str, ", title=", str2, ", body=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ctaText=", str4, ", ctaIcon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", action=", str6, ", imageUrl=");
        return AbstractC21702c.m61137h(sbM32001t, str7, ", showHighlight=", z4, ")");
    }

    public ActionCardModel(String id4, String title, String body, String str, String str2, String action, String imageUrl, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.id = id4;
        this.title = title;
        this.body = body;
        this.ctaText = str;
        this.ctaIcon = str2;
        this.action = action;
        this.imageUrl = imageUrl;
        this.showHighlight = z4;
    }
}
