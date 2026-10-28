package com.whoop.design.models.items;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#JP\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/DateStripModel;", "", "", "Lcom/whoop/design/models/items/DateStripItemModel;", "items", "", "todayDate", "Lcom/whoop/navigation/models/GenericInteraction;", "calendarIconInteraction", "Lgz0/m0;", "leftCalendarIcon", "rightCalendarIcon", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DateStripModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/navigation/models/GenericInteraction;", "component4", "()Lgz0/m0;", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;Lgz0/m0;)Lcom/whoop/design/models/items/DateStripModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getTodayDate", "Lcom/whoop/navigation/models/GenericInteraction;", "getCalendarIconInteraction", "Lgz0/m0;", "getLeftCalendarIcon", "getRightCalendarIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DateStripModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final GenericInteraction calendarIconInteraction;
    private final List<DateStripItemModel> items;
    private final EnumC16313m0 leftCalendarIcon;
    private final EnumC16313m0 rightCalendarIcon;
    private final String todayDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DateStripModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DateStripModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DateStripModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36956c(12)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36956c(13)), AbstractC30060g.m92087G(enumC23463i, new C36956c(14))};
    }

    public /* synthetic */ DateStripModel(int i13, List list, String str, GenericInteraction genericInteraction, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, SerializationConstructorMarker serializationConstructorMarker) {
        if (30 != (i13 & 30)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 30, DateStripModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        this.todayDate = str;
        this.calendarIconInteraction = genericInteraction;
        this.leftCalendarIcon = enumC16313m0;
        this.rightCalendarIcon = enumC16313m1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DateStripItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DateStripModel copy$default(DateStripModel dateStripModel, List list, String str, GenericInteraction genericInteraction, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = dateStripModel.items;
        }
        if ((i13 & 2) != 0) {
            str = dateStripModel.todayDate;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = dateStripModel.calendarIconInteraction;
        }
        if ((i13 & 8) != 0) {
            enumC16313m0 = dateStripModel.leftCalendarIcon;
        }
        if ((i13 & 16) != 0) {
            enumC16313m1 = dateStripModel.rightCalendarIcon;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        GenericInteraction genericInteraction2 = genericInteraction;
        return dateStripModel.copy(list, str, genericInteraction2, enumC16313m0, enumC16313m2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DateStripModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.todayDate);
        output.encodeNullableSerializableElement(serialDesc, 2, GenericInteraction$$serializer.INSTANCE, self.calendarIconInteraction);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.leftCalendarIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.rightCalendarIcon);
    }

    public final List<DateStripItemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTodayDate() {
        return this.todayDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getCalendarIconInteraction() {
        return this.calendarIconInteraction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC16313m0 getLeftCalendarIcon() {
        return this.leftCalendarIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getRightCalendarIcon() {
        return this.rightCalendarIcon;
    }

    public final DateStripModel copy(List<DateStripItemModel> items, String todayDate, GenericInteraction calendarIconInteraction, EnumC16313m0 leftCalendarIcon, EnumC16313m0 rightCalendarIcon) {
        AbstractC22676k.m65750j(items, "items");
        return new DateStripModel(items, todayDate, calendarIconInteraction, leftCalendarIcon, rightCalendarIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateStripModel)) {
            return false;
        }
        DateStripModel dateStripModel = (DateStripModel) other;
        return AbstractC22676k.m65745e(this.items, dateStripModel.items) && AbstractC22676k.m65745e(this.todayDate, dateStripModel.todayDate) && AbstractC22676k.m65745e(this.calendarIconInteraction, dateStripModel.calendarIconInteraction) && this.leftCalendarIcon == dateStripModel.leftCalendarIcon && this.rightCalendarIcon == dateStripModel.rightCalendarIcon;
    }

    public final GenericInteraction getCalendarIconInteraction() {
        return this.calendarIconInteraction;
    }

    public final List<DateStripItemModel> getItems() {
        return this.items;
    }

    public final EnumC16313m0 getLeftCalendarIcon() {
        return this.leftCalendarIcon;
    }

    public final EnumC16313m0 getRightCalendarIcon() {
        return this.rightCalendarIcon;
    }

    public final String getTodayDate() {
        return this.todayDate;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.todayDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GenericInteraction genericInteraction = this.calendarIconInteraction;
        int iHashCode3 = (iHashCode2 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.leftCalendarIcon;
        int iHashCode4 = (iHashCode3 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightCalendarIcon;
        return iHashCode4 + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0);
    }

    public String toString() {
        List<DateStripItemModel> list = this.items;
        String str = this.todayDate;
        GenericInteraction genericInteraction = this.calendarIconInteraction;
        EnumC16313m0 enumC16313m0 = this.leftCalendarIcon;
        EnumC16313m0 enumC16313m1 = this.rightCalendarIcon;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("DateStripModel(items=", ", todayDate=", str, ", calendarIconInteraction=", list);
        sbM79507k.append(genericInteraction);
        sbM79507k.append(", leftCalendarIcon=");
        sbM79507k.append(enumC16313m0);
        sbM79507k.append(", rightCalendarIcon=");
        sbM79507k.append(enumC16313m1);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public DateStripModel(List<DateStripItemModel> items, String str, GenericInteraction genericInteraction, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.todayDate = str;
        this.calendarIconInteraction = genericInteraction;
        this.leftCalendarIcon = enumC16313m0;
        this.rightCalendarIcon = enumC16313m1;
    }

    public /* synthetic */ DateStripModel(List list, String str, GenericInteraction genericInteraction, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, str, genericInteraction, enumC16313m0, enumC16313m1);
    }
}
