package com.whoop.design.models.items;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JD\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010%¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/DateStripItemModel;", "", "", HttpHeaders.DATE, "Lcom/whoop/design/models/items/DateStripDateDisplayModel;", "dateDisplay", "Lcom/whoop/design/models/items/DateStripEntryStatus;", "entryStatus", "", "isSelected", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DateStripItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/DateStripDateDisplayModel;", "component3", "()Lcom/whoop/design/models/items/DateStripEntryStatus;", "component4", "()Z", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DateStripItemModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "Lcom/whoop/design/models/items/DateStripDateDisplayModel;", "getDateDisplay", "Lcom/whoop/design/models/items/DateStripEntryStatus;", "getEntryStatus", "Z", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DateStripItemModel {
    private final String date;
    private final DateStripDateDisplayModel dateDisplay;
    private final DateStripEntryStatus entryStatus;
    private final GenericInteraction interaction;
    private final boolean isSelected;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36956c(11)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DateStripItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DateStripItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DateStripItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateStripItemModel(int i13, String str, DateStripDateDisplayModel dateStripDateDisplayModel, DateStripEntryStatus dateStripEntryStatus, boolean z4, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i13 & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 19, DateStripItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.date = str;
        this.dateDisplay = dateStripDateDisplayModel;
        if ((i13 & 4) == 0) {
            this.entryStatus = DateStripEntryStatus.NO;
        } else {
            this.entryStatus = dateStripEntryStatus;
        }
        if ((i13 & 8) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z4;
        }
        this.interaction = genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return DateStripEntryStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ DateStripItemModel copy$default(DateStripItemModel dateStripItemModel, String str, DateStripDateDisplayModel dateStripDateDisplayModel, DateStripEntryStatus dateStripEntryStatus, boolean z4, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dateStripItemModel.date;
        }
        if ((i13 & 2) != 0) {
            dateStripDateDisplayModel = dateStripItemModel.dateDisplay;
        }
        if ((i13 & 4) != 0) {
            dateStripEntryStatus = dateStripItemModel.entryStatus;
        }
        if ((i13 & 8) != 0) {
            z4 = dateStripItemModel.isSelected;
        }
        if ((i13 & 16) != 0) {
            genericInteraction = dateStripItemModel.interaction;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        DateStripEntryStatus dateStripEntryStatus2 = dateStripEntryStatus;
        return dateStripItemModel.copy(str, dateStripDateDisplayModel, dateStripEntryStatus2, z4, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DateStripItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.date);
        output.encodeSerializableElement(serialDesc, 1, DateStripDateDisplayModel$$serializer.INSTANCE, self.dateDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.entryStatus != DateStripEntryStatus.NO) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.entryStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 3, self.isSelected);
        }
        output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateStripDateDisplayModel getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateStripEntryStatus getEntryStatus() {
        return this.entryStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final DateStripItemModel copy(String date, DateStripDateDisplayModel dateDisplay, DateStripEntryStatus entryStatus, boolean isSelected, GenericInteraction interaction) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(entryStatus, "entryStatus");
        return new DateStripItemModel(date, dateDisplay, entryStatus, isSelected, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateStripItemModel)) {
            return false;
        }
        DateStripItemModel dateStripItemModel = (DateStripItemModel) other;
        return AbstractC22676k.m65745e(this.date, dateStripItemModel.date) && AbstractC22676k.m65745e(this.dateDisplay, dateStripItemModel.dateDisplay) && this.entryStatus == dateStripItemModel.entryStatus && this.isSelected == dateStripItemModel.isSelected && AbstractC22676k.m65745e(this.interaction, dateStripItemModel.interaction);
    }

    public final String getDate() {
        return this.date;
    }

    public final DateStripDateDisplayModel getDateDisplay() {
        return this.dateDisplay;
    }

    public final DateStripEntryStatus getEntryStatus() {
        return this.entryStatus;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.entryStatus.hashCode() + ((this.dateDisplay.hashCode() + (this.date.hashCode() * 31)) * 31)) * 31, 31, this.isSelected);
        GenericInteraction genericInteraction = this.interaction;
        return iM8289b + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.date;
        DateStripDateDisplayModel dateStripDateDisplayModel = this.dateDisplay;
        DateStripEntryStatus dateStripEntryStatus = this.entryStatus;
        boolean z4 = this.isSelected;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sb4 = new StringBuilder("DateStripItemModel(date=");
        sb4.append(str);
        sb4.append(", dateDisplay=");
        sb4.append(dateStripDateDisplayModel);
        sb4.append(", entryStatus=");
        sb4.append(dateStripEntryStatus);
        sb4.append(", isSelected=");
        sb4.append(z4);
        sb4.append(", interaction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }

    public DateStripItemModel(String date, DateStripDateDisplayModel dateDisplay, DateStripEntryStatus entryStatus, boolean z4, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(entryStatus, "entryStatus");
        this.date = date;
        this.dateDisplay = dateDisplay;
        this.entryStatus = entryStatus;
        this.isSelected = z4;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ DateStripItemModel(String str, DateStripDateDisplayModel dateStripDateDisplayModel, DateStripEntryStatus dateStripEntryStatus, boolean z4, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateStripDateDisplayModel, (i13 & 4) != 0 ? DateStripEntryStatus.NO : dateStripEntryStatus, (i13 & 8) != 0 ? false : z4, genericInteraction);
    }
}
