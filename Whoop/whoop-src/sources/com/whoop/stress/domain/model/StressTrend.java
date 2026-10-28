package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002OPBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u001aR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\u001dR,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010 R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010I\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010\u001a¨\u0006Q"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrend;", "", "", "title", "suffix", "", "Lcom/whoop/stress/domain/model/StressTrendSegment;", "todaySegments", "previousSegments", "", "Lcom/whoop/stress/domain/model/StressTrendStatKey;", "Lcom/whoop/stress/domain/model/StressTrendStat;", "trendStats", "Lcom/whoop/stress/domain/model/StressCta;", "cta", "Lcom/whoop/stress/domain/model/StressTrendHeader;", "header", "vow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/util/Map;", "component6", "()Lcom/whoop/stress/domain/model/StressCta;", "component7", "()Lcom/whoop/stress/domain/model/StressTrendHeader;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrend;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressTrend;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSuffix", "getSuffix$annotations", "Ljava/util/List;", "getTodaySegments", "getTodaySegments$annotations", "getPreviousSegments", "getPreviousSegments$annotations", "Ljava/util/Map;", "getTrendStats", "getTrendStats$annotations", "Lcom/whoop/stress/domain/model/StressCta;", "getCta", "getCta$annotations", "Lcom/whoop/stress/domain/model/StressTrendHeader;", "getHeader", "getHeader$annotations", "getVow", "getVow$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressTrend {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("cta")
    private final StressCta cta;

    @SerializedName("header")
    private final StressTrendHeader header;

    @SerializedName("previous_bar_segments")
    private final List<StressTrendSegment> previousSegments;

    @SerializedName("title_suffix_display")
    private final String suffix;

    @SerializedName("title_display")
    private final String title;

    @SerializedName("today_bar_segments")
    private final List<StressTrendSegment> todaySegments;

    @SerializedName("trend_stats")
    private final Map<StressTrendStatKey, StressTrendStat> trendStats;

    @SerializedName("vow")
    private final String vow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressTrend$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrend$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressTrend;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressTrend$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C18518b(15)), AbstractC30060g.m92087G(enumC23463i, new C18518b(16)), AbstractC30060g.m92087G(enumC23463i, new C18518b(17)), null, null, null};
    }

    public /* synthetic */ StressTrend(int i13, String str, String str2, List list, List list2, Map map, StressCta stressCta, StressTrendHeader stressTrendHeader, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, StressTrend$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.suffix = str2;
        this.todaySegments = list;
        this.previousSegments = list2;
        this.trendStats = map;
        this.cta = stressCta;
        this.header = stressTrendHeader;
        this.vow = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StressTrendSegment$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StressTrendSegment$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new LinkedHashMapSerializer(StressTrendStatKey.INSTANCE.serializer(), StressTrendStat$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressTrend copy$default(StressTrend stressTrend, String str, String str2, List list, List list2, Map map, StressCta stressCta, StressTrendHeader stressTrendHeader, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stressTrend.title;
        }
        if ((i13 & 2) != 0) {
            str2 = stressTrend.suffix;
        }
        if ((i13 & 4) != 0) {
            list = stressTrend.todaySegments;
        }
        if ((i13 & 8) != 0) {
            list2 = stressTrend.previousSegments;
        }
        if ((i13 & 16) != 0) {
            map = stressTrend.trendStats;
        }
        if ((i13 & 32) != 0) {
            stressCta = stressTrend.cta;
        }
        if ((i13 & 64) != 0) {
            stressTrendHeader = stressTrend.header;
        }
        if ((i13 & 128) != 0) {
            str3 = stressTrend.vow;
        }
        StressTrendHeader stressTrendHeader2 = stressTrendHeader;
        String str4 = str3;
        Map map2 = map;
        StressCta stressCta2 = stressCta;
        return stressTrend.copy(str, str2, list, list2, map2, stressCta2, stressTrendHeader2, str4);
    }

    @InterfaceC37143h("cta")
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC37143h("header")
    public static /* synthetic */ void getHeader$annotations() {
    }

    @InterfaceC37143h("previous_bar_segments")
    public static /* synthetic */ void getPreviousSegments$annotations() {
    }

    @InterfaceC37143h("title_suffix_display")
    public static /* synthetic */ void getSuffix$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("today_bar_segments")
    public static /* synthetic */ void getTodaySegments$annotations() {
    }

    @InterfaceC37143h("trend_stats")
    public static /* synthetic */ void getTrendStats$annotations() {
    }

    @InterfaceC37143h("vow")
    public static /* synthetic */ void getVow$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressTrend self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.suffix);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.todaySegments);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.previousSegments);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.trendStats);
        output.encodeSerializableElement(serialDesc, 5, StressCta$$serializer.INSTANCE, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 6, StressTrendHeader$$serializer.INSTANCE, self.header);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.vow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    public final List<StressTrendSegment> component3() {
        return this.todaySegments;
    }

    public final List<StressTrendSegment> component4() {
        return this.previousSegments;
    }

    public final Map<StressTrendStatKey, StressTrendStat> component5() {
        return this.trendStats;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StressCta getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StressTrendHeader getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVow() {
        return this.vow;
    }

    public final StressTrend copy(String title, String suffix, List<StressTrendSegment> todaySegments, List<StressTrendSegment> previousSegments, Map<StressTrendStatKey, StressTrendStat> trendStats, StressCta cta, StressTrendHeader header, String vow) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(todaySegments, "todaySegments");
        AbstractC22676k.m65750j(trendStats, "trendStats");
        AbstractC22676k.m65750j(cta, "cta");
        return new StressTrend(title, suffix, todaySegments, previousSegments, trendStats, cta, header, vow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressTrend)) {
            return false;
        }
        StressTrend stressTrend = (StressTrend) other;
        return AbstractC22676k.m65745e(this.title, stressTrend.title) && AbstractC22676k.m65745e(this.suffix, stressTrend.suffix) && AbstractC22676k.m65745e(this.todaySegments, stressTrend.todaySegments) && AbstractC22676k.m65745e(this.previousSegments, stressTrend.previousSegments) && AbstractC22676k.m65745e(this.trendStats, stressTrend.trendStats) && AbstractC22676k.m65745e(this.cta, stressTrend.cta) && AbstractC22676k.m65745e(this.header, stressTrend.header) && AbstractC22676k.m65745e(this.vow, stressTrend.vow);
    }

    public final StressCta getCta() {
        return this.cta;
    }

    public final StressTrendHeader getHeader() {
        return this.header;
    }

    public final List<StressTrendSegment> getPreviousSegments() {
        return this.previousSegments;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<StressTrendSegment> getTodaySegments() {
        return this.todaySegments;
    }

    public final Map<StressTrendStatKey, StressTrendStat> getTrendStats() {
        return this.trendStats;
    }

    public final String getVow() {
        return this.vow;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.suffix;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.todaySegments);
        List<StressTrendSegment> list = this.previousSegments;
        int iHashCode2 = (this.cta.hashCode() + AbstractC3855a.m11821e(this.trendStats, (iM31983b + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31;
        StressTrendHeader stressTrendHeader = this.header;
        int iHashCode3 = (iHashCode2 + (stressTrendHeader == null ? 0 : stressTrendHeader.hashCode())) * 31;
        String str2 = this.vow;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.suffix;
        List<StressTrendSegment> list = this.todaySegments;
        List<StressTrendSegment> list2 = this.previousSegments;
        Map<StressTrendStatKey, StressTrendStat> map = this.trendStats;
        StressCta stressCta = this.cta;
        StressTrendHeader stressTrendHeader = this.header;
        String str3 = this.vow;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressTrend(title=", str, ", suffix=", str2, ", todaySegments=");
        AbstractC21702c.m61148s(sbM32001t, list, ", previousSegments=", list2, ", trendStats=");
        sbM32001t.append(map);
        sbM32001t.append(", cta=");
        sbM32001t.append(stressCta);
        sbM32001t.append(", header=");
        sbM32001t.append(stressTrendHeader);
        sbM32001t.append(", vow=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StressTrend(String title, String str, List<StressTrendSegment> todaySegments, List<StressTrendSegment> list, Map<StressTrendStatKey, StressTrendStat> trendStats, StressCta cta, StressTrendHeader stressTrendHeader, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(todaySegments, "todaySegments");
        AbstractC22676k.m65750j(trendStats, "trendStats");
        AbstractC22676k.m65750j(cta, "cta");
        this.title = title;
        this.suffix = str;
        this.todaySegments = todaySegments;
        this.previousSegments = list;
        this.trendStats = trendStats;
        this.cta = cta;
        this.header = stressTrendHeader;
        this.vow = str2;
    }
}
