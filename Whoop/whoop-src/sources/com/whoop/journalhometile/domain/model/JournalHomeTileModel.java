package com.whoop.journalhometile.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15621b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "rightIcon", "Lcom/whoop/design/models/items/CardButtonModel;", "cardButton", "", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "datePickerItems", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$journal_home_tile_mini_arch_release", "(Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/CardButtonModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getRightIcon", "Lcom/whoop/design/models/items/CardButtonModel;", "getCardButton", "Ljava/util/List;", "getDatePickerItems", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalHomeTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CardButtonModel cardButton;
    private final List<JournalDatePickerEntry> datePickerItems;
    private final C9598e destination;
    private final String rightIcon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;", "serializer", "()Lwc3/c;", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalHomeTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15621b(3)), AbstractC30060g.m92087G(enumC23463i, new C15621b(4))};
    }

    public /* synthetic */ JournalHomeTileModel(int i13, String str, String str2, CardButtonModel cardButtonModel, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, JournalHomeTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.rightIcon = str2;
        this.cardButton = cardButtonModel;
        this.datePickerItems = list;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(JournalDatePickerEntry$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalHomeTileModel copy$default(JournalHomeTileModel journalHomeTileModel, String str, String str2, CardButtonModel cardButtonModel, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalHomeTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = journalHomeTileModel.rightIcon;
        }
        if ((i13 & 4) != 0) {
            cardButtonModel = journalHomeTileModel.cardButton;
        }
        if ((i13 & 8) != 0) {
            list = journalHomeTileModel.datePickerItems;
        }
        if ((i13 & 16) != 0) {
            c9598e = journalHomeTileModel.destination;
        }
        C9598e c9598e2 = c9598e;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return journalHomeTileModel.copy(str, str2, cardButtonModel2, list, c9598e2);
    }

    public static final /* synthetic */ void write$Self$journal_home_tile_mini_arch_release(JournalHomeTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 2, CardButtonModel$$serializer.INSTANCE, self.cardButton);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.datePickerItems);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final List<JournalDatePickerEntry> component4() {
        return this.datePickerItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final JournalHomeTileModel copy(String title, String rightIcon, CardButtonModel cardButton, List<JournalDatePickerEntry> datePickerItems, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePickerItems, "datePickerItems");
        return new JournalHomeTileModel(title, rightIcon, cardButton, datePickerItems, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalHomeTileModel)) {
            return false;
        }
        JournalHomeTileModel journalHomeTileModel = (JournalHomeTileModel) other;
        return AbstractC22676k.m65745e(this.title, journalHomeTileModel.title) && AbstractC22676k.m65745e(this.rightIcon, journalHomeTileModel.rightIcon) && AbstractC22676k.m65745e(this.cardButton, journalHomeTileModel.cardButton) && AbstractC22676k.m65745e(this.datePickerItems, journalHomeTileModel.datePickerItems) && AbstractC22676k.m65745e(this.destination, journalHomeTileModel.destination);
    }

    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final List<JournalDatePickerEntry> getDatePickerItems() {
        return this.datePickerItems;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.rightIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.cardButton;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31, 31, this.datePickerItems);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.rightIcon;
        CardButtonModel cardButtonModel = this.cardButton;
        List<JournalDatePickerEntry> list = this.datePickerItems;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalHomeTileModel(title=", str, ", rightIcon=", str2, ", cardButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", datePickerItems=");
        sbM32001t.append(list);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public JournalHomeTileModel(String title, String str, CardButtonModel cardButtonModel, List<JournalDatePickerEntry> datePickerItems, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePickerItems, "datePickerItems");
        this.title = title;
        this.rightIcon = str;
        this.cardButton = cardButtonModel;
        this.datePickerItems = datePickerItems;
        this.destination = c9598e;
    }
}
