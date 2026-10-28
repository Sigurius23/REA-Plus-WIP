package com.whoop.journal.interactors.p062v2.datepicker;

import androidx.annotation.Keep;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "", "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;", "todayCta", "", "todayDate", "Lgz0/m0;", "leftCalendarDisplayIcon", "rightCalendarDisplayIcon", "", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "items", "<init>", "(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$journal_release", "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;", "component2", "()Ljava/lang/String;", "component3", "()Lgz0/m0;", "component4", "component5", "()Ljava/util/List;", "copy", "(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;", "getTodayCta", "Ljava/lang/String;", "getTodayDate", "Lgz0/m0;", "getLeftCalendarDisplayIcon", "getRightCalendarDisplayIcon", "Ljava/util/List;", "getItems", "Companion", "$serializer", "a", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalDatePickerResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<JournalDatePickerEntry> items;
    private final EnumC16313m0 leftCalendarDisplayIcon;
    private final EnumC16313m0 rightCalendarDisplayIcon;
    private final TodayCta todayCta;
    private final String todayDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.journal.interactors.v2.datepicker.JournalDatePickerResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;", "serializer", "()Lwc3/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalDatePickerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C37572f(0)), AbstractC30060g.m92087G(enumC23463i, new C37572f(1)), AbstractC30060g.m92087G(enumC23463i, new C37572f(2))};
    }

    public /* synthetic */ JournalDatePickerResponse(int i13, TodayCta todayCta, String str, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, JournalDatePickerResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.todayCta = todayCta;
        this.todayDate = str;
        this.leftCalendarDisplayIcon = enumC16313m0;
        this.rightCalendarDisplayIcon = enumC16313m1;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(JournalDatePickerEntry$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalDatePickerResponse copy$default(JournalDatePickerResponse journalDatePickerResponse, TodayCta todayCta, String str, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            todayCta = journalDatePickerResponse.todayCta;
        }
        if ((i13 & 2) != 0) {
            str = journalDatePickerResponse.todayDate;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = journalDatePickerResponse.leftCalendarDisplayIcon;
        }
        if ((i13 & 8) != 0) {
            enumC16313m1 = journalDatePickerResponse.rightCalendarDisplayIcon;
        }
        if ((i13 & 16) != 0) {
            list = journalDatePickerResponse.items;
        }
        List list2 = list;
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        return journalDatePickerResponse.copy(todayCta, str, enumC16313m2, enumC16313m1, list2);
    }

    public static final /* synthetic */ void write$Self$journal_release(JournalDatePickerResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, TodayCta$$serializer.INSTANCE, self.todayCta);
        output.encodeStringElement(serialDesc, 1, self.todayDate);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.leftCalendarDisplayIcon);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.rightCalendarDisplayIcon);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TodayCta getTodayCta() {
        return this.todayCta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTodayDate() {
        return this.todayDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC16313m0 getLeftCalendarDisplayIcon() {
        return this.leftCalendarDisplayIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC16313m0 getRightCalendarDisplayIcon() {
        return this.rightCalendarDisplayIcon;
    }

    public final List<JournalDatePickerEntry> component5() {
        return this.items;
    }

    public final JournalDatePickerResponse copy(TodayCta todayCta, String todayDate, EnumC16313m0 leftCalendarDisplayIcon, EnumC16313m0 rightCalendarDisplayIcon, List<JournalDatePickerEntry> items) {
        AbstractC22676k.m65750j(todayDate, "todayDate");
        AbstractC22676k.m65750j(leftCalendarDisplayIcon, "leftCalendarDisplayIcon");
        AbstractC22676k.m65750j(items, "items");
        return new JournalDatePickerResponse(todayCta, todayDate, leftCalendarDisplayIcon, rightCalendarDisplayIcon, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalDatePickerResponse)) {
            return false;
        }
        JournalDatePickerResponse journalDatePickerResponse = (JournalDatePickerResponse) other;
        return AbstractC22676k.m65745e(this.todayCta, journalDatePickerResponse.todayCta) && AbstractC22676k.m65745e(this.todayDate, journalDatePickerResponse.todayDate) && this.leftCalendarDisplayIcon == journalDatePickerResponse.leftCalendarDisplayIcon && this.rightCalendarDisplayIcon == journalDatePickerResponse.rightCalendarDisplayIcon && AbstractC22676k.m65745e(this.items, journalDatePickerResponse.items);
    }

    public final List<JournalDatePickerEntry> getItems() {
        return this.items;
    }

    public final EnumC16313m0 getLeftCalendarDisplayIcon() {
        return this.leftCalendarDisplayIcon;
    }

    public final EnumC16313m0 getRightCalendarDisplayIcon() {
        return this.rightCalendarDisplayIcon;
    }

    public final TodayCta getTodayCta() {
        return this.todayCta;
    }

    public final String getTodayDate() {
        return this.todayDate;
    }

    public int hashCode() {
        TodayCta todayCta = this.todayCta;
        int iM48500b = AbstractC17176i.m48500b(this.leftCalendarDisplayIcon, AbstractC11266d.m30450d((todayCta == null ? 0 : todayCta.hashCode()) * 31, 31, this.todayDate), 31);
        EnumC16313m0 enumC16313m0 = this.rightCalendarDisplayIcon;
        return this.items.hashCode() + ((iM48500b + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31);
    }

    public String toString() {
        TodayCta todayCta = this.todayCta;
        String str = this.todayDate;
        EnumC16313m0 enumC16313m0 = this.leftCalendarDisplayIcon;
        EnumC16313m0 enumC16313m1 = this.rightCalendarDisplayIcon;
        List<JournalDatePickerEntry> list = this.items;
        StringBuilder sb4 = new StringBuilder("JournalDatePickerResponse(todayCta=");
        sb4.append(todayCta);
        sb4.append(", todayDate=");
        sb4.append(str);
        sb4.append(", leftCalendarDisplayIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", rightCalendarDisplayIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public JournalDatePickerResponse(TodayCta todayCta, String todayDate, EnumC16313m0 leftCalendarDisplayIcon, EnumC16313m0 enumC16313m0, List<JournalDatePickerEntry> items) {
        AbstractC22676k.m65750j(todayDate, "todayDate");
        AbstractC22676k.m65750j(leftCalendarDisplayIcon, "leftCalendarDisplayIcon");
        AbstractC22676k.m65750j(items, "items");
        this.todayCta = todayCta;
        this.todayDate = todayDate;
        this.leftCalendarDisplayIcon = leftCalendarDisplayIcon;
        this.rightCalendarDisplayIcon = enumC16313m0;
        this.items = items;
    }
}
