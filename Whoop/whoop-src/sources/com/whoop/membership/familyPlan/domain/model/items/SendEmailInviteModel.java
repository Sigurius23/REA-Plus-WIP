package com.whoop.membership.familyPlan.domain.model.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "textFieldLabel", "Lcom/whoop/design/models/items/CardButtonModel;", "cardButton", "disclaimer", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/CardButtonModel;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextFieldLabel", "Lcom/whoop/design/models/items/CardButtonModel;", "getCardButton", "getDisclaimer", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SendEmailInviteModel implements DesignSystemModel {
    private final CardButtonModel cardButton;
    private final String disclaimer;
    private final String textFieldLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CardButtonModel.$stable;

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.items.SendEmailInviteModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SendEmailInviteModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SendEmailInviteModel(int i13, String str, CardButtonModel cardButtonModel, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SendEmailInviteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.textFieldLabel = str;
        this.cardButton = cardButtonModel;
        this.disclaimer = str2;
    }

    public static /* synthetic */ SendEmailInviteModel copy$default(SendEmailInviteModel sendEmailInviteModel, String str, CardButtonModel cardButtonModel, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendEmailInviteModel.textFieldLabel;
        }
        if ((i13 & 2) != 0) {
            cardButtonModel = sendEmailInviteModel.cardButton;
        }
        if ((i13 & 4) != 0) {
            str2 = sendEmailInviteModel.disclaimer;
        }
        return sendEmailInviteModel.copy(str, cardButtonModel, str2);
    }

    public static final /* synthetic */ void write$Self$membership_release(SendEmailInviteModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.textFieldLabel);
        output.encodeSerializableElement(serialDesc, 1, CardButtonModel$$serializer.INSTANCE, self.cardButton);
        output.encodeStringElement(serialDesc, 2, self.disclaimer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextFieldLabel() {
        return this.textFieldLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final SendEmailInviteModel copy(String textFieldLabel, CardButtonModel cardButton, String disclaimer) {
        AbstractC22676k.m65750j(textFieldLabel, "textFieldLabel");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        return new SendEmailInviteModel(textFieldLabel, cardButton, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEmailInviteModel)) {
            return false;
        }
        SendEmailInviteModel sendEmailInviteModel = (SendEmailInviteModel) other;
        return AbstractC22676k.m65745e(this.textFieldLabel, sendEmailInviteModel.textFieldLabel) && AbstractC22676k.m65745e(this.cardButton, sendEmailInviteModel.cardButton) && AbstractC22676k.m65745e(this.disclaimer, sendEmailInviteModel.disclaimer);
    }

    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getTextFieldLabel() {
        return this.textFieldLabel;
    }

    public int hashCode() {
        return this.disclaimer.hashCode() + ((this.cardButton.hashCode() + (this.textFieldLabel.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.textFieldLabel;
        CardButtonModel cardButtonModel = this.cardButton;
        String str2 = this.disclaimer;
        StringBuilder sb4 = new StringBuilder("SendEmailInviteModel(textFieldLabel=");
        sb4.append(str);
        sb4.append(", cardButton=");
        sb4.append(cardButtonModel);
        sb4.append(", disclaimer=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public SendEmailInviteModel(String textFieldLabel, CardButtonModel cardButton, String disclaimer) {
        AbstractC22676k.m65750j(textFieldLabel, "textFieldLabel");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        this.textFieldLabel = textFieldLabel;
        this.cardButton = cardButton;
        this.disclaimer = disclaimer;
    }
}
