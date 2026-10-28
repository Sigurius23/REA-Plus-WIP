package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;", "", "", "title", "subtitle", "averageStat", "", "Lcom/whoop/user/journey/model/yearinreview/StatStyle;", "statStyles", "averageStatStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/StatStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/StatStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/user/journey/model/yearinreview/StatStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/StatStyle;)Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getAverageStat", "Ljava/util/List;", "getStatStyles", "Lcom/whoop/user/journey/model/yearinreview/StatStyle;", "getAverageStatStyle", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecapStatistic {
    private static final InterfaceC23462h[] $childSerializers;
    private final String averageStat;
    private final StatStyle averageStatStyle;
    private final List<StatStyle> statStyles;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/RecapStatistic$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecapStatistic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(13)), AbstractC30060g.m92087G(enumC23463i, new C11062a(14))};
    }

    public /* synthetic */ RecapStatistic(int i13, String str, String str2, String str3, List list, StatStyle statStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, RecapStatistic$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.averageStat = str3;
        this.statStyles = list;
        this.averageStatStyle = statStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StatStyle.INSTANCE.serializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return StatStyle.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecapStatistic copy$default(RecapStatistic recapStatistic, String str, String str2, String str3, List list, StatStyle statStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recapStatistic.title;
        }
        if ((i13 & 2) != 0) {
            str2 = recapStatistic.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = recapStatistic.averageStat;
        }
        if ((i13 & 8) != 0) {
            list = recapStatistic.statStyles;
        }
        if ((i13 & 16) != 0) {
            statStyle = recapStatistic.averageStatStyle;
        }
        StatStyle statStyle2 = statStyle;
        String str4 = str3;
        return recapStatistic.copy(str, str2, str4, list, statStyle2);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(RecapStatistic self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.averageStat);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.statStyles);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.averageStatStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAverageStat() {
        return this.averageStat;
    }

    public final List<StatStyle> component4() {
        return this.statStyles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StatStyle getAverageStatStyle() {
        return this.averageStatStyle;
    }

    public final RecapStatistic copy(String title, String subtitle, String averageStat, List<? extends StatStyle> statStyles, StatStyle averageStatStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(averageStat, "averageStat");
        AbstractC22676k.m65750j(statStyles, "statStyles");
        AbstractC22676k.m65750j(averageStatStyle, "averageStatStyle");
        return new RecapStatistic(title, subtitle, averageStat, statStyles, averageStatStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecapStatistic)) {
            return false;
        }
        RecapStatistic recapStatistic = (RecapStatistic) other;
        return AbstractC22676k.m65745e(this.title, recapStatistic.title) && AbstractC22676k.m65745e(this.subtitle, recapStatistic.subtitle) && AbstractC22676k.m65745e(this.averageStat, recapStatistic.averageStat) && AbstractC22676k.m65745e(this.statStyles, recapStatistic.statStyles) && this.averageStatStyle == recapStatistic.averageStatStyle;
    }

    public final String getAverageStat() {
        return this.averageStat;
    }

    public final StatStyle getAverageStatStyle() {
        return this.averageStatStyle;
    }

    public final List<StatStyle> getStatStyles() {
        return this.statStyles;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.averageStatStyle.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.averageStat), 31, this.statStyles);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.averageStat;
        List<StatStyle> list = this.statStyles;
        StatStyle statStyle = this.averageStatStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecapStatistic(title=", str, ", subtitle=", str2, ", averageStat=");
        AbstractC36095b.m114694v(str3, ", statStyles=", ", averageStatStyle=", sbM32001t, list);
        sbM32001t.append(statStyle);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecapStatistic(String title, String subtitle, String averageStat, List<? extends StatStyle> statStyles, StatStyle averageStatStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(averageStat, "averageStat");
        AbstractC22676k.m65750j(statStyles, "statStyles");
        AbstractC22676k.m65750j(averageStatStyle, "averageStatStyle");
        this.title = title;
        this.subtitle = subtitle;
        this.averageStat = averageStat;
        this.statStyles = statStyles;
        this.averageStatStyle = averageStatStyle;
    }
}
