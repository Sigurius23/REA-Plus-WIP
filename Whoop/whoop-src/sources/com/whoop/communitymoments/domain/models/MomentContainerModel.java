package com.whoop.communitymoments.domain.models;

import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.models.AchievementsBackgroundStyleSerializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.AbstractC35183d;
import ur0.C35180a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0003YZ[B®\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019B§\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010)J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J3\u00102\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b2\u00101J½\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bN\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bO\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u0010/R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u00101\"\u0004\bT\u0010URE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010R\u001a\u0004\bV\u00101\"\u0004\bW\u0010U¨\u0006\\"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "backgroundImageUrl", "", "photoRevealFraction", "", "items", "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "headerLeadingButton", "headerTrailingItems", "footerOverlayItems", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "achievementBackgroundStyle", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()F", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "component6", "component7", "component8", "()Lcom/whoop/design/models/AchievementsBackgroundStyle;", "component9", "()Ljava/util/Map;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getBackgroundImageUrl", "F", "getPhotoRevealFraction", "Ljava/util/List;", "getItems", "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "getHeaderLeadingButton", "getHeaderTrailingItems", "getFooterOverlayItems", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "getAchievementBackgroundStyle", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "HeaderLeadingButton", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MomentContainerModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final AchievementsBackgroundStyle achievementBackgroundStyle;
    private Map<String, AggregateBinding> aggregateBindings;
    private final String backgroundImageUrl;
    private Map<String, String> bindings;
    private final List<DesignSystemModel> footerOverlayItems;
    private final HeaderLeadingButton headerLeadingButton;
    private final List<DesignSystemModel> headerTrailingItems;
    private final String id;
    private final List<DesignSystemModel> items;
    private final float photoRevealFraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "", "", "icon", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "getAction", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class HeaderLeadingButton {
        private final GenericInteraction action;
        private final String icon;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = GenericInteraction.$stable;

        /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentContainerModel$HeaderLeadingButton$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentContainerModel$HeaderLeadingButton;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return MomentContainerModel$HeaderLeadingButton$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ HeaderLeadingButton(int i13, String str, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, MomentContainerModel$HeaderLeadingButton$$serializer.INSTANCE.getDescriptor());
            }
            this.icon = str;
            this.action = genericInteraction;
        }

        public static /* synthetic */ HeaderLeadingButton copy$default(HeaderLeadingButton headerLeadingButton, String str, GenericInteraction genericInteraction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = headerLeadingButton.icon;
            }
            if ((i13 & 2) != 0) {
                genericInteraction = headerLeadingButton.action;
            }
            return headerLeadingButton.copy(str, genericInteraction);
        }

        public static final /* synthetic */ void write$Self$community_moments_release(HeaderLeadingButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.icon);
            output.encodeSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.action);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GenericInteraction getAction() {
            return this.action;
        }

        public final HeaderLeadingButton copy(String icon, GenericInteraction action) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(action, "action");
            return new HeaderLeadingButton(icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderLeadingButton)) {
                return false;
            }
            HeaderLeadingButton headerLeadingButton = (HeaderLeadingButton) other;
            return AbstractC22676k.m65745e(this.icon, headerLeadingButton.icon) && AbstractC22676k.m65745e(this.action, headerLeadingButton.action);
        }

        public final GenericInteraction getAction() {
            return this.action;
        }

        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.icon.hashCode() * 31);
        }

        public String toString() {
            return "HeaderLeadingButton(icon=" + this.icon + ", action=" + this.action + ")";
        }

        public HeaderLeadingButton(String icon, GenericInteraction action) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(action, "action");
            this.icon = icon;
            this.action = action;
        }
    }

    /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentContainerModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentContainerModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentContainerModel;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MomentContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35180a(10)), null, AbstractC30060g.m92087G(enumC23463i, new C35180a(11)), AbstractC30060g.m92087G(enumC23463i, new C35180a(12)), null, AbstractC30060g.m92087G(enumC23463i, new C35180a(13)), null};
    }

    public /* synthetic */ MomentContainerModel(int i13, String str, String str2, float f13, List list, HeaderLeadingButton headerLeadingButton, List list2, List list3, AchievementsBackgroundStyle achievementsBackgroundStyle, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (131 != (i13 & 131)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131, MomentContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.backgroundImageUrl = str2;
        if ((i13 & 4) == 0) {
            this.photoRevealFraction = 0.0f;
        } else {
            this.photoRevealFraction = f13;
        }
        int i14 = i13 & 8;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.items = c25271y;
        } else {
            this.items = list;
        }
        if ((i13 & 16) == 0) {
            this.headerLeadingButton = null;
        } else {
            this.headerLeadingButton = headerLeadingButton;
        }
        if ((i13 & 32) == 0) {
            this.headerTrailingItems = c25271y;
        } else {
            this.headerTrailingItems = list2;
        }
        if ((i13 & 64) == 0) {
            this.footerOverlayItems = c25271y;
        } else {
            this.footerOverlayItems = list3;
        }
        this.achievementBackgroundStyle = achievementsBackgroundStyle;
        if ((i13 & 256) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 512) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MomentContainerModel copy$default(MomentContainerModel momentContainerModel, String str, String str2, float f13, List list, HeaderLeadingButton headerLeadingButton, List list2, List list3, AchievementsBackgroundStyle achievementsBackgroundStyle, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = momentContainerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = momentContainerModel.backgroundImageUrl;
        }
        if ((i13 & 4) != 0) {
            f13 = momentContainerModel.photoRevealFraction;
        }
        if ((i13 & 8) != 0) {
            list = momentContainerModel.items;
        }
        if ((i13 & 16) != 0) {
            headerLeadingButton = momentContainerModel.headerLeadingButton;
        }
        if ((i13 & 32) != 0) {
            list2 = momentContainerModel.headerTrailingItems;
        }
        if ((i13 & 64) != 0) {
            list3 = momentContainerModel.footerOverlayItems;
        }
        if ((i13 & 128) != 0) {
            achievementsBackgroundStyle = momentContainerModel.achievementBackgroundStyle;
        }
        if ((i13 & 256) != 0) {
            map = momentContainerModel.bindings;
        }
        if ((i13 & 512) != 0) {
            map2 = momentContainerModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        List list4 = list3;
        AchievementsBackgroundStyle achievementsBackgroundStyle2 = achievementsBackgroundStyle;
        HeaderLeadingButton headerLeadingButton2 = headerLeadingButton;
        List list5 = list2;
        return momentContainerModel.copy(str, str2, f13, list, headerLeadingButton2, list5, list4, achievementsBackgroundStyle2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$community_moments_release(MomentContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.backgroundImageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Float.compare(self.photoRevealFraction, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 2, self.photoRevealFraction);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 3);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.items, c25271y)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.headerLeadingButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MomentContainerModel$HeaderLeadingButton$$serializer.INSTANCE, self.headerLeadingButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.headerTrailingItems, c25271y)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.headerTrailingItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.footerOverlayItems, c25271y)) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.footerOverlayItems);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, AchievementsBackgroundStyleSerializer.INSTANCE, self.achievementBackgroundStyle);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, AggregateBinding> component10() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPhotoRevealFraction() {
        return this.photoRevealFraction;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HeaderLeadingButton getHeaderLeadingButton() {
        return this.headerLeadingButton;
    }

    public final List<DesignSystemModel> component6() {
        return this.headerTrailingItems;
    }

    public final List<DesignSystemModel> component7() {
        return this.footerOverlayItems;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AchievementsBackgroundStyle getAchievementBackgroundStyle() {
        return this.achievementBackgroundStyle;
    }

    public final Map<String, String> component9() {
        return this.bindings;
    }

    public final MomentContainerModel copy(String id4, String backgroundImageUrl, float photoRevealFraction, List<? extends DesignSystemModel> items, HeaderLeadingButton headerLeadingButton, List<? extends DesignSystemModel> headerTrailingItems, List<? extends DesignSystemModel> footerOverlayItems, AchievementsBackgroundStyle achievementBackgroundStyle, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(headerTrailingItems, "headerTrailingItems");
        AbstractC22676k.m65750j(footerOverlayItems, "footerOverlayItems");
        return new MomentContainerModel(id4, backgroundImageUrl, photoRevealFraction, items, headerLeadingButton, headerTrailingItems, footerOverlayItems, achievementBackgroundStyle, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentContainerModel)) {
            return false;
        }
        MomentContainerModel momentContainerModel = (MomentContainerModel) other;
        return AbstractC22676k.m65745e(this.id, momentContainerModel.id) && AbstractC22676k.m65745e(this.backgroundImageUrl, momentContainerModel.backgroundImageUrl) && Float.compare(this.photoRevealFraction, momentContainerModel.photoRevealFraction) == 0 && AbstractC22676k.m65745e(this.items, momentContainerModel.items) && AbstractC22676k.m65745e(this.headerLeadingButton, momentContainerModel.headerLeadingButton) && AbstractC22676k.m65745e(this.headerTrailingItems, momentContainerModel.headerTrailingItems) && AbstractC22676k.m65745e(this.footerOverlayItems, momentContainerModel.footerOverlayItems) && this.achievementBackgroundStyle == momentContainerModel.achievementBackgroundStyle && AbstractC22676k.m65745e(this.bindings, momentContainerModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, momentContainerModel.aggregateBindings);
    }

    public final AchievementsBackgroundStyle getAchievementBackgroundStyle() {
        return this.achievementBackgroundStyle;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getFooterOverlayItems() {
        return this.footerOverlayItems;
    }

    public final HeaderLeadingButton getHeaderLeadingButton() {
        return this.headerLeadingButton;
    }

    public final List<DesignSystemModel> getHeaderTrailingItems() {
        return this.headerTrailingItems;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final float getPhotoRevealFraction() {
        return this.photoRevealFraction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.backgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.photoRevealFraction, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.items);
        HeaderLeadingButton headerLeadingButton = this.headerLeadingButton;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM31983b + (headerLeadingButton == null ? 0 : headerLeadingButton.hashCode())) * 31, 31, this.headerTrailingItems), 31, this.footerOverlayItems);
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        int iHashCode2 = (iM31983b2 + (achievementsBackgroundStyle == null ? 0 : achievementsBackgroundStyle.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.backgroundImageUrl;
        float f13 = this.photoRevealFraction;
        List<DesignSystemModel> list = this.items;
        HeaderLeadingButton headerLeadingButton = this.headerLeadingButton;
        List<DesignSystemModel> list2 = this.headerTrailingItems;
        List<DesignSystemModel> list3 = this.footerOverlayItems;
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MomentContainerModel(id=", str, ", backgroundImageUrl=", str2, ", photoRevealFraction=");
        sbM32001t.append(f13);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", headerLeadingButton=");
        sbM32001t.append(headerLeadingButton);
        sbM32001t.append(", headerTrailingItems=");
        sbM32001t.append(list2);
        sbM32001t.append(", footerOverlayItems=");
        sbM32001t.append(list3);
        sbM32001t.append(", achievementBackgroundStyle=");
        sbM32001t.append(achievementsBackgroundStyle);
        sbM32001t.append(", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MomentContainerModel(String id4, String str, float f13, List<? extends DesignSystemModel> items, HeaderLeadingButton headerLeadingButton, List<? extends DesignSystemModel> headerTrailingItems, List<? extends DesignSystemModel> footerOverlayItems, AchievementsBackgroundStyle achievementsBackgroundStyle, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(headerTrailingItems, "headerTrailingItems");
        AbstractC22676k.m65750j(footerOverlayItems, "footerOverlayItems");
        this.id = id4;
        this.backgroundImageUrl = str;
        this.photoRevealFraction = f13;
        this.items = items;
        this.headerLeadingButton = headerLeadingButton;
        this.headerTrailingItems = headerTrailingItems;
        this.footerOverlayItems = footerOverlayItems;
        this.achievementBackgroundStyle = achievementsBackgroundStyle;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public MomentContainerModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        MomentContainerModel momentContainerModelM19581a = AbstractC6408a.m19581a(this, getBindings(), getAggregateBindings(), accumulatedState);
        List<DesignSystemModel> list = momentContainerModelM19581a.items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC35183d.m111384b((DesignSystemModel) it.next(), accumulatedState));
        }
        List<DesignSystemModel> list2 = momentContainerModelM19581a.headerTrailingItems;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(AbstractC35183d.m111384b((DesignSystemModel) it3.next(), accumulatedState));
        }
        List<DesignSystemModel> list3 = momentContainerModelM19581a.footerOverlayItems;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(AbstractC35183d.m111384b((DesignSystemModel) it4.next(), accumulatedState));
        }
        return copy$default(momentContainerModelM19581a, null, null, 0.0f, arrayList, null, arrayList2, arrayList3, null, null, null, 919, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MomentContainerModel(String str, String str2, float f13, List list, HeaderLeadingButton headerLeadingButton, List list2, List list3, AchievementsBackgroundStyle achievementsBackgroundStyle, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f14 = (i13 & 4) != 0 ? 0.0f : f13;
        int i14 = i13 & 8;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, f14, i14 != 0 ? c25271y : list, (i13 & 16) != 0 ? null : headerLeadingButton, (i13 & 32) != 0 ? c25271y : list2, (i13 & 64) != 0 ? c25271y : list3, achievementsBackgroundStyle, (i13 & 256) != 0 ? null : map, (i13 & 512) != 0 ? null : map2);
    }
}
