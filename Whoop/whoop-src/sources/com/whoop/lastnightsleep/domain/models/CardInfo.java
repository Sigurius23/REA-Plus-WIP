package com.whoop.lastnightsleep.domain.models;

import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "", "", "infoIcon", "infoSheetDetails", "infoSheetTitle", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$last_night_sleep_release", "(Lcom/whoop/lastnightsleep/domain/models/CardInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInfoIcon", "getInfoSheetDetails", "getInfoSheetTitle", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getCta", "Companion", "$serializer", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardInfo {
    private final SecondaryButtonModel cta;
    private final String infoIcon;
    private final String infoSheetDetails;
    private final String infoSheetTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = SecondaryButtonModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/CardInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "serializer", "()Lwc3/c;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CardInfo(int i13, String str, String str2, String str3, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.infoIcon = str;
        this.infoSheetDetails = str2;
        this.infoSheetTitle = str3;
        this.cta = secondaryButtonModel;
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, String str3, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardInfo.infoIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = cardInfo.infoSheetDetails;
        }
        if ((i13 & 4) != 0) {
            str3 = cardInfo.infoSheetTitle;
        }
        if ((i13 & 8) != 0) {
            secondaryButtonModel = cardInfo.cta;
        }
        return cardInfo.copy(str, str2, str3, secondaryButtonModel);
    }

    public static final /* synthetic */ void write$Self$last_night_sleep_release(CardInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.infoIcon);
        output.encodeStringElement(serialDesc, 1, self.infoSheetDetails);
        output.encodeStringElement(serialDesc, 2, self.infoSheetTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, SecondaryButtonModel$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInfoIcon() {
        return this.infoIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfoSheetDetails() {
        return this.infoSheetDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInfoSheetTitle() {
        return this.infoSheetTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    public final CardInfo copy(String infoIcon, String infoSheetDetails, String infoSheetTitle, SecondaryButtonModel cta) {
        AbstractC22676k.m65750j(infoIcon, "infoIcon");
        AbstractC22676k.m65750j(infoSheetDetails, "infoSheetDetails");
        AbstractC22676k.m65750j(infoSheetTitle, "infoSheetTitle");
        return new CardInfo(infoIcon, infoSheetDetails, infoSheetTitle, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) other;
        return AbstractC22676k.m65745e(this.infoIcon, cardInfo.infoIcon) && AbstractC22676k.m65745e(this.infoSheetDetails, cardInfo.infoSheetDetails) && AbstractC22676k.m65745e(this.infoSheetTitle, cardInfo.infoSheetTitle) && AbstractC22676k.m65745e(this.cta, cardInfo.cta);
    }

    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    public final String getInfoIcon() {
        return this.infoIcon;
    }

    public final String getInfoSheetDetails() {
        return this.infoSheetDetails;
    }

    public final String getInfoSheetTitle() {
        return this.infoSheetTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.infoIcon.hashCode() * 31, 31, this.infoSheetDetails), 31, this.infoSheetTitle);
        SecondaryButtonModel secondaryButtonModel = this.cta;
        return iM30450d + (secondaryButtonModel == null ? 0 : secondaryButtonModel.hashCode());
    }

    public String toString() {
        String str = this.infoIcon;
        String str2 = this.infoSheetDetails;
        String str3 = this.infoSheetTitle;
        SecondaryButtonModel secondaryButtonModel = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CardInfo(infoIcon=", str, ", infoSheetDetails=", str2, ", infoSheetTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", cta=");
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CardInfo(String infoIcon, String infoSheetDetails, String infoSheetTitle, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(infoIcon, "infoIcon");
        AbstractC22676k.m65750j(infoSheetDetails, "infoSheetDetails");
        AbstractC22676k.m65750j(infoSheetTitle, "infoSheetTitle");
        this.infoIcon = infoIcon;
        this.infoSheetDetails = infoSheetDetails;
        this.infoSheetTitle = infoSheetTitle;
        this.cta = secondaryButtonModel;
    }
}
