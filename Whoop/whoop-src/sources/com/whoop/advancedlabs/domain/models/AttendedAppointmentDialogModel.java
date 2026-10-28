package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "", "", "title", "description", "Lcom/whoop/design/models/items/CardButtonModel;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/CardButtonModel;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/whoop/design/models/items/CardButtonModel;", "getPrimaryButton", "getSecondaryButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AttendedAppointmentDialogModel {
    private final String description;
    private final CardButtonModel primaryButton;
    private final CardButtonModel secondaryButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CardButtonModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AttendedAppointmentDialogModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AttendedAppointmentDialogModel(int i13, String str, String str2, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AttendedAppointmentDialogModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.primaryButton = cardButtonModel;
        this.secondaryButton = cardButtonModel2;
    }

    public static /* synthetic */ AttendedAppointmentDialogModel copy$default(AttendedAppointmentDialogModel attendedAppointmentDialogModel, String str, String str2, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = attendedAppointmentDialogModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = attendedAppointmentDialogModel.description;
        }
        if ((i13 & 4) != 0) {
            cardButtonModel = attendedAppointmentDialogModel.primaryButton;
        }
        if ((i13 & 8) != 0) {
            cardButtonModel2 = attendedAppointmentDialogModel.secondaryButton;
        }
        return attendedAppointmentDialogModel.copy(str, str2, cardButtonModel, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AttendedAppointmentDialogModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, cardButtonModel$$serializer, self.primaryButton);
        output.encodeSerializableElement(serialDesc, 3, cardButtonModel$$serializer, self.secondaryButton);
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
    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final AttendedAppointmentDialogModel copy(String title, String description, CardButtonModel primaryButton, CardButtonModel secondaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        return new AttendedAppointmentDialogModel(title, description, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttendedAppointmentDialogModel)) {
            return false;
        }
        AttendedAppointmentDialogModel attendedAppointmentDialogModel = (AttendedAppointmentDialogModel) other;
        return AbstractC22676k.m65745e(this.title, attendedAppointmentDialogModel.title) && AbstractC22676k.m65745e(this.description, attendedAppointmentDialogModel.description) && AbstractC22676k.m65745e(this.primaryButton, attendedAppointmentDialogModel.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, attendedAppointmentDialogModel.secondaryButton);
    }

    public final String getDescription() {
        return this.description;
    }

    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        CardButtonModel cardButtonModel = this.primaryButton;
        CardButtonModel cardButtonModel2 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AttendedAppointmentDialogModel(title=", str, ", description=", str2, ", primaryButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(cardButtonModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AttendedAppointmentDialogModel(String title, String description, CardButtonModel primaryButton, CardButtonModel secondaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.title = title;
        this.description = description;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
    }
}
