package com.whoop.design.models.calendar;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;", "", "", "month", "", "yesCount", "", "dayHeaders", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;", "weeks", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMonth", "I", "getYesCount", "Ljava/util/List;", "getDayHeaders", "getWeeks", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorsCalendarMonthModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> dayHeaders;
    private final String month;
    private final List<BehaviorsCalendarDaysListModel> weeks;
    private final int yesCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorsCalendarMonthModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(12)), AbstractC30060g.m92087G(enumC23463i, new C32219p(13))};
    }

    public BehaviorsCalendarMonthModel() {
        this((String) null, 0, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(BehaviorsCalendarDaysListModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorsCalendarMonthModel copy$default(BehaviorsCalendarMonthModel behaviorsCalendarMonthModel, String str, int i13, List list, List list2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = behaviorsCalendarMonthModel.month;
        }
        if ((i14 & 2) != 0) {
            i13 = behaviorsCalendarMonthModel.yesCount;
        }
        if ((i14 & 4) != 0) {
            list = behaviorsCalendarMonthModel.dayHeaders;
        }
        if ((i14 & 8) != 0) {
            list2 = behaviorsCalendarMonthModel.weeks;
        }
        return behaviorsCalendarMonthModel.copy(str, i13, list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorsCalendarMonthModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.month, "")) {
            output.encodeStringElement(serialDesc, 0, self.month);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.yesCount != 0) {
            output.encodeIntElement(serialDesc, 1, self.yesCount);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.dayHeaders, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.dayHeaders);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.weeks, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.weeks);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getYesCount() {
        return this.yesCount;
    }

    public final List<String> component3() {
        return this.dayHeaders;
    }

    public final List<BehaviorsCalendarDaysListModel> component4() {
        return this.weeks;
    }

    public final BehaviorsCalendarMonthModel copy(String month, int yesCount, List<String> dayHeaders, List<BehaviorsCalendarDaysListModel> weeks) {
        AbstractC22676k.m65750j(month, "month");
        AbstractC22676k.m65750j(dayHeaders, "dayHeaders");
        AbstractC22676k.m65750j(weeks, "weeks");
        return new BehaviorsCalendarMonthModel(month, yesCount, dayHeaders, weeks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorsCalendarMonthModel)) {
            return false;
        }
        BehaviorsCalendarMonthModel behaviorsCalendarMonthModel = (BehaviorsCalendarMonthModel) other;
        return AbstractC22676k.m65745e(this.month, behaviorsCalendarMonthModel.month) && this.yesCount == behaviorsCalendarMonthModel.yesCount && AbstractC22676k.m65745e(this.dayHeaders, behaviorsCalendarMonthModel.dayHeaders) && AbstractC22676k.m65745e(this.weeks, behaviorsCalendarMonthModel.weeks);
    }

    public final List<String> getDayHeaders() {
        return this.dayHeaders;
    }

    public final String getMonth() {
        return this.month;
    }

    public final List<BehaviorsCalendarDaysListModel> getWeeks() {
        return this.weeks;
    }

    public final int getYesCount() {
        return this.yesCount;
    }

    public int hashCode() {
        return this.weeks.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.yesCount, this.month.hashCode() * 31, 31), 31, this.dayHeaders);
    }

    public String toString() {
        String str = this.month;
        int i13 = this.yesCount;
        return AbstractC30007c.m91843m(AbstractC11266d.m30467u(i13, "BehaviorsCalendarMonthModel(month=", str, ", yesCount=", ", dayHeaders="), this.dayHeaders, ", weeks=", this.weeks, ")");
    }

    public /* synthetic */ BehaviorsCalendarMonthModel(int i13, String str, int i14, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.month = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.yesCount = 0;
        } else {
            this.yesCount = i14;
        }
        int i15 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        if (i15 == 0) {
            this.dayHeaders = c25271y;
        } else {
            this.dayHeaders = list;
        }
        if ((i13 & 8) == 0) {
            this.weeks = c25271y;
        } else {
            this.weeks = list2;
        }
    }

    public BehaviorsCalendarMonthModel(String month, int i13, List<String> dayHeaders, List<BehaviorsCalendarDaysListModel> weeks) {
        AbstractC22676k.m65750j(month, "month");
        AbstractC22676k.m65750j(dayHeaders, "dayHeaders");
        AbstractC22676k.m65750j(weeks, "weeks");
        this.month = month;
        this.yesCount = i13;
        this.dayHeaders = dayHeaders;
        this.weeks = weeks;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BehaviorsCalendarMonthModel(String str, int i13, List list, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i14 & 1) != 0 ? "" : str;
        i13 = (i14 & 2) != 0 ? 0 : i13;
        int i15 = i14 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(str, i13, i15 != 0 ? c25271y : list, (i14 & 8) != 0 ? c25271y : list2);
    }
}
