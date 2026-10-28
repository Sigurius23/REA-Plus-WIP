package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "dateDisplay", "", "Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;", "schedulingDatePickerItems", "nextDateTime", "prevDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getDateDisplay", "Ljava/util/List;", "getSchedulingDatePickerItems", "getNextDateTime", "getPrevDateTime", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulingDatePickerModel implements DesignSystemModel {
    private final String dateDisplay;
    private final String id;
    private final String nextDateTime;
    private final String prevDateTime;
    private final List<SchedulePillModel> schedulingDatePickerItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(24)), null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulingDatePickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulingDatePickerModel(int i13, String str, String str2, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SchedulingDatePickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.dateDisplay = str2;
        this.schedulingDatePickerItems = list;
        this.nextDateTime = str3;
        this.prevDateTime = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SchedulePillModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulingDatePickerModel copy$default(SchedulingDatePickerModel schedulingDatePickerModel, String str, String str2, List list, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = schedulingDatePickerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = schedulingDatePickerModel.dateDisplay;
        }
        if ((i13 & 4) != 0) {
            list = schedulingDatePickerModel.schedulingDatePickerItems;
        }
        if ((i13 & 8) != 0) {
            str3 = schedulingDatePickerModel.nextDateTime;
        }
        if ((i13 & 16) != 0) {
            str4 = schedulingDatePickerModel.prevDateTime;
        }
        String str5 = str4;
        List list2 = list;
        return schedulingDatePickerModel.copy(str, str2, list2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulingDatePickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.dateDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.schedulingDatePickerItems);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.nextDateTime);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.prevDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateDisplay() {
        return this.dateDisplay;
    }

    public final List<SchedulePillModel> component3() {
        return this.schedulingDatePickerItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrevDateTime() {
        return this.prevDateTime;
    }

    public final SchedulingDatePickerModel copy(String id4, String dateDisplay, List<SchedulePillModel> schedulingDatePickerItems, String nextDateTime, String prevDateTime) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(schedulingDatePickerItems, "schedulingDatePickerItems");
        return new SchedulingDatePickerModel(id4, dateDisplay, schedulingDatePickerItems, nextDateTime, prevDateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulingDatePickerModel)) {
            return false;
        }
        SchedulingDatePickerModel schedulingDatePickerModel = (SchedulingDatePickerModel) other;
        return AbstractC22676k.m65745e(this.id, schedulingDatePickerModel.id) && AbstractC22676k.m65745e(this.dateDisplay, schedulingDatePickerModel.dateDisplay) && AbstractC22676k.m65745e(this.schedulingDatePickerItems, schedulingDatePickerModel.schedulingDatePickerItems) && AbstractC22676k.m65745e(this.nextDateTime, schedulingDatePickerModel.nextDateTime) && AbstractC22676k.m65745e(this.prevDateTime, schedulingDatePickerModel.prevDateTime);
    }

    public final String getDateDisplay() {
        return this.dateDisplay;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    public final String getPrevDateTime() {
        return this.prevDateTime;
    }

    public final List<SchedulePillModel> getSchedulingDatePickerItems() {
        return this.schedulingDatePickerItems;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.dateDisplay), 31, this.schedulingDatePickerItems);
        String str = this.nextDateTime;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prevDateTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.dateDisplay;
        List<SchedulePillModel> list = this.schedulingDatePickerItems;
        String str3 = this.nextDateTime;
        String str4 = this.prevDateTime;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SchedulingDatePickerModel(id=", str, ", dateDisplay=", str2, ", schedulingDatePickerItems=");
        AbstractC17176i.m48511m(", nextDateTime=", str3, ", prevDateTime=", sbM32001t, list);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public SchedulingDatePickerModel(String id4, String dateDisplay, List<SchedulePillModel> schedulingDatePickerItems, String str, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(schedulingDatePickerItems, "schedulingDatePickerItems");
        this.id = id4;
        this.dateDisplay = dateDisplay;
        this.schedulingDatePickerItems = schedulingDatePickerItems;
        this.nextDateTime = str;
        this.prevDateTime = str2;
    }
}
