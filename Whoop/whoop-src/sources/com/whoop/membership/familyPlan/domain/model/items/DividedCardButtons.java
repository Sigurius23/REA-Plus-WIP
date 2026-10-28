package com.whoop.membership.familyPlan.domain.model.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/CardButtonModel;", "topButton", "Lcom/whoop/design/models/items/DividerModel;", "divider", "bottomButton", "", "disclaimerText", "<init>", "(Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/CardButtonModel;", "component2", "()Lcom/whoop/design/models/items/DividerModel;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/CardButtonModel;", "getTopButton", "Lcom/whoop/design/models/items/DividerModel;", "getDivider", "getBottomButton", "Ljava/lang/String;", "getDisclaimerText", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DividedCardButtons implements DesignSystemModel {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CardButtonModel bottomButton;
    private final String disclaimerText;
    private final DividerModel divider;
    private final CardButtonModel topButton;

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.items.DividedCardButtons$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DividedCardButtons$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = CardButtonModel.$stable;
        $stable = i13 | DividerModel.$stable | i13;
    }

    public /* synthetic */ DividedCardButtons(int i13, CardButtonModel cardButtonModel, DividerModel dividerModel, CardButtonModel cardButtonModel2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, DividedCardButtons$$serializer.INSTANCE.getDescriptor());
        }
        this.topButton = cardButtonModel;
        this.divider = dividerModel;
        this.bottomButton = cardButtonModel2;
        this.disclaimerText = str;
    }

    public static /* synthetic */ DividedCardButtons copy$default(DividedCardButtons dividedCardButtons, CardButtonModel cardButtonModel, DividerModel dividerModel, CardButtonModel cardButtonModel2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cardButtonModel = dividedCardButtons.topButton;
        }
        if ((i13 & 2) != 0) {
            dividerModel = dividedCardButtons.divider;
        }
        if ((i13 & 4) != 0) {
            cardButtonModel2 = dividedCardButtons.bottomButton;
        }
        if ((i13 & 8) != 0) {
            str = dividedCardButtons.disclaimerText;
        }
        return dividedCardButtons.copy(cardButtonModel, dividerModel, cardButtonModel2, str);
    }

    public static final /* synthetic */ void write$Self$membership_release(DividedCardButtons self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, cardButtonModel$$serializer, self.topButton);
        output.encodeSerializableElement(serialDesc, 1, DividerModel$$serializer.INSTANCE, self.divider);
        output.encodeSerializableElement(serialDesc, 2, cardButtonModel$$serializer, self.bottomButton);
        output.encodeStringElement(serialDesc, 3, self.disclaimerText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardButtonModel getTopButton() {
        return this.topButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DividerModel getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardButtonModel getBottomButton() {
        return this.bottomButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final DividedCardButtons copy(CardButtonModel topButton, DividerModel divider, CardButtonModel bottomButton, String disclaimerText) {
        AbstractC22676k.m65750j(topButton, "topButton");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(bottomButton, "bottomButton");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        return new DividedCardButtons(topButton, divider, bottomButton, disclaimerText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DividedCardButtons)) {
            return false;
        }
        DividedCardButtons dividedCardButtons = (DividedCardButtons) other;
        return AbstractC22676k.m65745e(this.topButton, dividedCardButtons.topButton) && AbstractC22676k.m65745e(this.divider, dividedCardButtons.divider) && AbstractC22676k.m65745e(this.bottomButton, dividedCardButtons.bottomButton) && AbstractC22676k.m65745e(this.disclaimerText, dividedCardButtons.disclaimerText);
    }

    public final CardButtonModel getBottomButton() {
        return this.bottomButton;
    }

    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final DividerModel getDivider() {
        return this.divider;
    }

    public final CardButtonModel getTopButton() {
        return this.topButton;
    }

    public int hashCode() {
        return this.disclaimerText.hashCode() + ((this.bottomButton.hashCode() + ((this.divider.hashCode() + (this.topButton.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DividedCardButtons(topButton=" + this.topButton + ", divider=" + this.divider + ", bottomButton=" + this.bottomButton + ", disclaimerText=" + this.disclaimerText + ")";
    }

    public DividedCardButtons(CardButtonModel topButton, DividerModel divider, CardButtonModel bottomButton, String disclaimerText) {
        AbstractC22676k.m65750j(topButton, "topButton");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(bottomButton, "bottomButton");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        this.topButton = topButton;
        this.divider = divider;
        this.bottomButton = bottomButton;
        this.disclaimerText = disclaimerText;
    }
}
