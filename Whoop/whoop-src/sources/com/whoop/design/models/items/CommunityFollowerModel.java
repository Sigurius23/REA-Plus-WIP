package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hgB\u0085\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cBó\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b:\u00109J\u0090\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010#J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010N\u001a\u0004\bP\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bQ\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bR\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bS\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bT\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bU\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bV\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bW\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bX\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bY\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bZ\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\b[\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\b\\\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\b]\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\b^\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b_\u0010#R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\ba\u00105R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bc\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\be\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\bf\u00109¨\u0006i"}, m65681d2 = {"Lcom/whoop/design/models/items/CommunityFollowerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "noDataLabel", "avatarUrl", "streak", "streakImageUrl", "recoveryScore", "recoveryLabel", "dayStrain", "strainLabel", "sleepScore", "sleepLabel", "recoveryColor", "strainColor", "sleepColor", "backgroundStyle", "avatarRingColor", "", "iconUrls", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "titleInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Ljava/util/List;", "component19", "()Lcom/whoop/navigation/e;", "component20", "()Lcom/whoop/navigation/models/GenericInteraction;", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/CommunityFollowerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CommunityFollowerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getNoDataLabel", "getAvatarUrl", "getStreak", "getStreakImageUrl", "getRecoveryScore", "getRecoveryLabel", "getDayStrain", "getStrainLabel", "getSleepScore", "getSleepLabel", "getRecoveryColor", "getStrainColor", "getSleepColor", "getBackgroundStyle", "getAvatarRingColor", "Ljava/util/List;", "getIconUrls", "Lcom/whoop/navigation/e;", "getNavigation", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "getTitleInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityFollowerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String avatarRingColor;
    private final String avatarUrl;
    private final String backgroundStyle;
    private final String dayStrain;
    private final List<String> iconUrls;
    private final String id;
    private final GenericInteraction interaction;
    private final C9598e navigation;
    private final String noDataLabel;
    private final String recoveryColor;
    private final String recoveryLabel;
    private final String recoveryScore;
    private final String sleepColor;
    private final String sleepLabel;
    private final String sleepScore;
    private final String strainColor;
    private final String strainLabel;
    private final String streak;
    private final String streakImageUrl;
    private final String title;
    private final GenericInteraction titleInteraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CommunityFollowerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityFollowerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(4)), AbstractC30060g.m92087G(enumC23463i, new C36955b(5)), null, null};
    }

    public /* synthetic */ CommunityFollowerModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, C9598e c9598e, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CommunityFollowerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.noDataLabel = null;
        } else {
            this.noDataLabel = str3;
        }
        if ((i13 & 8) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str4;
        }
        if ((i13 & 16) == 0) {
            this.streak = null;
        } else {
            this.streak = str5;
        }
        if ((i13 & 32) == 0) {
            this.streakImageUrl = null;
        } else {
            this.streakImageUrl = str6;
        }
        if ((i13 & 64) == 0) {
            this.recoveryScore = null;
        } else {
            this.recoveryScore = str7;
        }
        if ((i13 & 128) == 0) {
            this.recoveryLabel = null;
        } else {
            this.recoveryLabel = str8;
        }
        if ((i13 & 256) == 0) {
            this.dayStrain = null;
        } else {
            this.dayStrain = str9;
        }
        if ((i13 & 512) == 0) {
            this.strainLabel = null;
        } else {
            this.strainLabel = str10;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.sleepScore = null;
        } else {
            this.sleepScore = str11;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.sleepLabel = null;
        } else {
            this.sleepLabel = str12;
        }
        if ((i13 & 4096) == 0) {
            this.recoveryColor = null;
        } else {
            this.recoveryColor = str13;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.strainColor = null;
        } else {
            this.strainColor = str14;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.sleepColor = null;
        } else {
            this.sleepColor = str15;
        }
        if ((32768 & i13) == 0) {
            this.backgroundStyle = null;
        } else {
            this.backgroundStyle = str16;
        }
        if ((65536 & i13) == 0) {
            this.avatarRingColor = null;
        } else {
            this.avatarRingColor = str17;
        }
        if ((131072 & i13) == 0) {
            this.iconUrls = null;
        } else {
            this.iconUrls = list;
        }
        if ((262144 & i13) == 0) {
            this.navigation = null;
        } else {
            this.navigation = c9598e;
        }
        if ((524288 & i13) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & 1048576) == 0) {
            this.titleInteraction = null;
        } else {
            this.titleInteraction = genericInteraction2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityFollowerModel copy$default(CommunityFollowerModel communityFollowerModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, C9598e c9598e, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, Object obj) {
        GenericInteraction genericInteraction3;
        GenericInteraction genericInteraction4;
        String str18 = (i13 & 1) != 0 ? communityFollowerModel.id : str;
        String str19 = (i13 & 2) != 0 ? communityFollowerModel.title : str2;
        String str20 = (i13 & 4) != 0 ? communityFollowerModel.noDataLabel : str3;
        String str21 = (i13 & 8) != 0 ? communityFollowerModel.avatarUrl : str4;
        String str22 = (i13 & 16) != 0 ? communityFollowerModel.streak : str5;
        String str23 = (i13 & 32) != 0 ? communityFollowerModel.streakImageUrl : str6;
        String str24 = (i13 & 64) != 0 ? communityFollowerModel.recoveryScore : str7;
        String str25 = (i13 & 128) != 0 ? communityFollowerModel.recoveryLabel : str8;
        String str26 = (i13 & 256) != 0 ? communityFollowerModel.dayStrain : str9;
        String str27 = (i13 & 512) != 0 ? communityFollowerModel.strainLabel : str10;
        String str28 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? communityFollowerModel.sleepScore : str11;
        String str29 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? communityFollowerModel.sleepLabel : str12;
        String str30 = (i13 & 4096) != 0 ? communityFollowerModel.recoveryColor : str13;
        String str31 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? communityFollowerModel.strainColor : str14;
        String str32 = str18;
        String str33 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? communityFollowerModel.sleepColor : str15;
        String str34 = (i13 & 32768) != 0 ? communityFollowerModel.backgroundStyle : str16;
        String str35 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? communityFollowerModel.avatarRingColor : str17;
        List list2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? communityFollowerModel.iconUrls : list;
        C9598e c9598e2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? communityFollowerModel.navigation : c9598e;
        GenericInteraction genericInteraction5 = (i13 & 524288) != 0 ? communityFollowerModel.interaction : genericInteraction;
        if ((i13 & 1048576) != 0) {
            genericInteraction4 = genericInteraction5;
            genericInteraction3 = communityFollowerModel.titleInteraction;
        } else {
            genericInteraction3 = genericInteraction2;
            genericInteraction4 = genericInteraction5;
        }
        return communityFollowerModel.copy(str32, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str33, str34, str35, list2, c9598e2, genericInteraction4, genericInteraction3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CommunityFollowerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.noDataLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.noDataLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.avatarUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.avatarUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.streak != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.streak);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.streakImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.streakImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.recoveryScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.recoveryScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.recoveryLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.recoveryLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.dayStrain != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.dayStrain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.strainLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.strainLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sleepScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.sleepScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.sleepLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.sleepLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.recoveryColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.recoveryColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.strainColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.strainColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sleepColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.sleepColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.backgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.backgroundStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.avatarRingColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.avatarRingColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.iconUrls != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.iconUrls);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.navigation != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, (InterfaceC37145j) interfaceC23462hArr[18].getValue(), self.navigation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 20) && self.titleInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 20, GenericInteraction$$serializer.INSTANCE, self.titleInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStrainLabel() {
        return this.strainLabel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSleepLabel() {
        return this.sleepLabel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRecoveryColor() {
        return this.recoveryColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStrainColor() {
        return this.strainColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSleepColor() {
        return this.sleepColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAvatarRingColor() {
        return this.avatarRingColor;
    }

    public final List<String> component18() {
        return this.iconUrls;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final GenericInteraction getTitleInteraction() {
        return this.titleInteraction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNoDataLabel() {
        return this.noDataLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStreak() {
        return this.streak;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStreakImageUrl() {
        return this.streakImageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRecoveryScore() {
        return this.recoveryScore;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRecoveryLabel() {
        return this.recoveryLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDayStrain() {
        return this.dayStrain;
    }

    public final CommunityFollowerModel copy(String id4, String title, String noDataLabel, String avatarUrl, String streak, String streakImageUrl, String recoveryScore, String recoveryLabel, String dayStrain, String strainLabel, String sleepScore, String sleepLabel, String recoveryColor, String strainColor, String sleepColor, String backgroundStyle, String avatarRingColor, List<String> iconUrls, C9598e navigation, GenericInteraction interaction, GenericInteraction titleInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        return new CommunityFollowerModel(id4, title, noDataLabel, avatarUrl, streak, streakImageUrl, recoveryScore, recoveryLabel, dayStrain, strainLabel, sleepScore, sleepLabel, recoveryColor, strainColor, sleepColor, backgroundStyle, avatarRingColor, iconUrls, navigation, interaction, titleInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityFollowerModel)) {
            return false;
        }
        CommunityFollowerModel communityFollowerModel = (CommunityFollowerModel) other;
        return AbstractC22676k.m65745e(this.id, communityFollowerModel.id) && AbstractC22676k.m65745e(this.title, communityFollowerModel.title) && AbstractC22676k.m65745e(this.noDataLabel, communityFollowerModel.noDataLabel) && AbstractC22676k.m65745e(this.avatarUrl, communityFollowerModel.avatarUrl) && AbstractC22676k.m65745e(this.streak, communityFollowerModel.streak) && AbstractC22676k.m65745e(this.streakImageUrl, communityFollowerModel.streakImageUrl) && AbstractC22676k.m65745e(this.recoveryScore, communityFollowerModel.recoveryScore) && AbstractC22676k.m65745e(this.recoveryLabel, communityFollowerModel.recoveryLabel) && AbstractC22676k.m65745e(this.dayStrain, communityFollowerModel.dayStrain) && AbstractC22676k.m65745e(this.strainLabel, communityFollowerModel.strainLabel) && AbstractC22676k.m65745e(this.sleepScore, communityFollowerModel.sleepScore) && AbstractC22676k.m65745e(this.sleepLabel, communityFollowerModel.sleepLabel) && AbstractC22676k.m65745e(this.recoveryColor, communityFollowerModel.recoveryColor) && AbstractC22676k.m65745e(this.strainColor, communityFollowerModel.strainColor) && AbstractC22676k.m65745e(this.sleepColor, communityFollowerModel.sleepColor) && AbstractC22676k.m65745e(this.backgroundStyle, communityFollowerModel.backgroundStyle) && AbstractC22676k.m65745e(this.avatarRingColor, communityFollowerModel.avatarRingColor) && AbstractC22676k.m65745e(this.iconUrls, communityFollowerModel.iconUrls) && AbstractC22676k.m65745e(this.navigation, communityFollowerModel.navigation) && AbstractC22676k.m65745e(this.interaction, communityFollowerModel.interaction) && AbstractC22676k.m65745e(this.titleInteraction, communityFollowerModel.titleInteraction);
    }

    public final String getAvatarRingColor() {
        return this.avatarRingColor;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final String getDayStrain() {
        return this.dayStrain;
    }

    public final List<String> getIconUrls() {
        return this.iconUrls;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final String getNoDataLabel() {
        return this.noDataLabel;
    }

    public final String getRecoveryColor() {
        return this.recoveryColor;
    }

    public final String getRecoveryLabel() {
        return this.recoveryLabel;
    }

    public final String getRecoveryScore() {
        return this.recoveryScore;
    }

    public final String getSleepColor() {
        return this.sleepColor;
    }

    public final String getSleepLabel() {
        return this.sleepLabel;
    }

    public final String getSleepScore() {
        return this.sleepScore;
    }

    public final String getStrainColor() {
        return this.strainColor;
    }

    public final String getStrainLabel() {
        return this.strainLabel;
    }

    public final String getStreak() {
        return this.streak;
    }

    public final String getStreakImageUrl() {
        return this.streakImageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final GenericInteraction getTitleInteraction() {
        return this.titleInteraction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.noDataLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streak;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.streakImageUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recoveryScore;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recoveryLabel;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dayStrain;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.strainLabel;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sleepScore;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sleepLabel;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.recoveryColor;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.strainColor;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sleepColor;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.backgroundStyle;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.avatarRingColor;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List<String> list = this.iconUrls;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iHashCode19 = (iHashCode18 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode20 = (iHashCode19 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.titleInteraction;
        return iHashCode20 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.noDataLabel;
        String str4 = this.avatarUrl;
        String str5 = this.streak;
        String str6 = this.streakImageUrl;
        String str7 = this.recoveryScore;
        String str8 = this.recoveryLabel;
        String str9 = this.dayStrain;
        String str10 = this.strainLabel;
        String str11 = this.sleepScore;
        String str12 = this.sleepLabel;
        String str13 = this.recoveryColor;
        String str14 = this.strainColor;
        String str15 = this.sleepColor;
        String str16 = this.backgroundStyle;
        String str17 = this.avatarRingColor;
        List<String> list = this.iconUrls;
        C9598e c9598e = this.navigation;
        GenericInteraction genericInteraction = this.interaction;
        GenericInteraction genericInteraction2 = this.titleInteraction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CommunityFollowerModel(id=", str, ", title=", str2, ", noDataLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", avatarUrl=", str4, ", streak=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", streakImageUrl=", str6, ", recoveryScore=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", recoveryLabel=", str8, ", dayStrain=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", strainLabel=", str10, ", sleepScore=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", sleepLabel=", str12, ", recoveryColor=");
        AbstractC11266d.m30444B(sbM32001t, str13, ", strainColor=", str14, ", sleepColor=");
        AbstractC11266d.m30444B(sbM32001t, str15, ", backgroundStyle=", str16, ", avatarRingColor=");
        AbstractC36095b.m114694v(str17, ", iconUrls=", ", navigation=", sbM32001t, list);
        sbM32001t.append(c9598e);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", titleInteraction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction2, ")");
    }

    public CommunityFollowerModel(String id4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<String> list, C9598e c9598e, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.title = str;
        this.noDataLabel = str2;
        this.avatarUrl = str3;
        this.streak = str4;
        this.streakImageUrl = str5;
        this.recoveryScore = str6;
        this.recoveryLabel = str7;
        this.dayStrain = str8;
        this.strainLabel = str9;
        this.sleepScore = str10;
        this.sleepLabel = str11;
        this.recoveryColor = str12;
        this.strainColor = str13;
        this.sleepColor = str14;
        this.backgroundStyle = str15;
        this.avatarRingColor = str16;
        this.iconUrls = list;
        this.navigation = c9598e;
        this.interaction = genericInteraction;
        this.titleInteraction = genericInteraction2;
    }

    public /* synthetic */ CommunityFollowerModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, C9598e c9598e, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : str9, (i13 & 512) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str12, (i13 & 4096) != 0 ? null : str13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str14, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str15, (i13 & 32768) != 0 ? null : str16, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str17, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : list, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : c9598e, (i13 & 524288) != 0 ? null : genericInteraction, (i13 & 1048576) != 0 ? null : genericInteraction2);
    }
}
