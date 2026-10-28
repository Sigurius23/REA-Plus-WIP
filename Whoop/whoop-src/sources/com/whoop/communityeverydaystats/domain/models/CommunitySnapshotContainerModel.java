package com.whoop.communityeverydaystats.domain.models;

import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.models.AchievementsBackgroundStyleSerializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import xq0.EnumC38541a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB³\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J¸\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010 J\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010\"J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bL\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bO\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bP\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bU\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bV\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Y\u001a\u0004\bZ\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00103R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00105¨\u0006b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "progressSegmentCount", "activeSegmentIndex", "Lcom/whoop/navigation/models/GenericInteraction;", "nextAction", "backAction", "backgroundImageUrl", "", "photoRevealFraction", "", "items", "headerOverlayItems", "footerOverlayItems", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "achievementBackgroundStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "securityPolicy", "Lxq0/a;", "borderStyle", "<init>", "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "component6", "component7", "()F", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "()Lcom/whoop/design/models/AchievementsBackgroundStyle;", "component12", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "component13", "()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "component14", "()Lxq0/a;", "copy", "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_everyday_stats_release", "(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "I", "getProgressSegmentCount", "getActiveSegmentIndex", "Lcom/whoop/navigation/models/GenericInteraction;", "getNextAction", "getBackAction", "getBackgroundImageUrl", "F", "getPhotoRevealFraction", "Ljava/util/List;", "getItems", "getHeaderOverlayItems", "getFooterOverlayItems", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "getAchievementBackgroundStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "getSecurityPolicy", "Lxq0/a;", "getBorderStyle", "Companion", "$serializer", "a", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunitySnapshotContainerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AchievementsBackgroundStyle achievementBackgroundStyle;
    private final int activeSegmentIndex;
    private final GenericInteraction backAction;
    private final String backgroundImageUrl;
    private final EnumC38541a borderStyle;
    private final ColorThemeModel colors;
    private final List<DesignSystemModel> footerOverlayItems;
    private final List<DesignSystemModel> headerOverlayItems;
    private final String id;
    private final List<DesignSystemModel> items;
    private final GenericInteraction nextAction;
    private final float photoRevealFraction;
    private final int progressSegmentCount;
    private final SecurityPolicyModel securityPolicy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "serializer", "()Lwc3/c;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunitySnapshotContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C38492a(3)), AbstractC30060g.m92087G(enumC23463i, new C38492a(4)), AbstractC30060g.m92087G(enumC23463i, new C38492a(5)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C38492a(6))};
    }

    public /* synthetic */ CommunitySnapshotContainerModel(int i13, String str, int i14, int i15, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str2, float f13, List list, List list2, List list3, AchievementsBackgroundStyle achievementsBackgroundStyle, ColorThemeModel colorThemeModel, SecurityPolicyModel securityPolicyModel, EnumC38541a enumC38541a, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CommunitySnapshotContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.progressSegmentCount = i14;
        this.activeSegmentIndex = i15;
        this.nextAction = genericInteraction;
        this.backAction = genericInteraction2;
        this.backgroundImageUrl = str2;
        if ((i13 & 64) == 0) {
            this.photoRevealFraction = 0.0f;
        } else {
            this.photoRevealFraction = f13;
        }
        int i16 = i13 & 128;
        C25271y c25271y = C25271y.f99162w;
        if (i16 == 0) {
            this.items = c25271y;
        } else {
            this.items = list;
        }
        if ((i13 & 256) == 0) {
            this.headerOverlayItems = c25271y;
        } else {
            this.headerOverlayItems = list2;
        }
        if ((i13 & 512) == 0) {
            this.footerOverlayItems = c25271y;
        } else {
            this.footerOverlayItems = list3;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.achievementBackgroundStyle = null;
        } else {
            this.achievementBackgroundStyle = achievementsBackgroundStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
        if ((i13 & 4096) == 0) {
            this.securityPolicy = null;
        } else {
            this.securityPolicy = securityPolicyModel;
        }
        this.borderStyle = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? EnumC38541a.SOLID : enumC38541a;
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
        return EnumsKt.createSimpleEnumSerializer("com.whoop.communityeverydaystats.domain.models.SnapshotContainerBorderStyle", EnumC38541a.values());
    }

    public static final /* synthetic */ void write$Self$community_everyday_stats_release(CommunitySnapshotContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.progressSegmentCount);
        output.encodeIntElement(serialDesc, 2, self.activeSegmentIndex);
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, genericInteraction$$serializer, self.nextAction);
        output.encodeNullableSerializableElement(serialDesc, 4, genericInteraction$$serializer, self.backAction);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.backgroundImageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Float.compare(self.photoRevealFraction, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 6, self.photoRevealFraction);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 7);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.items, c25271y)) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.headerOverlayItems, c25271y)) {
            output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.headerOverlayItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.footerOverlayItems, c25271y)) {
            output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.footerOverlayItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.achievementBackgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, AchievementsBackgroundStyleSerializer.INSTANCE, self.achievementBackgroundStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.colors != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, ColorThemeModel$$serializer.INSTANCE, self.colors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.securityPolicy != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, SecurityPolicyModel$$serializer.INSTANCE, self.securityPolicy);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.borderStyle == EnumC38541a.SOLID) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.borderStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component10() {
        return this.footerOverlayItems;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AchievementsBackgroundStyle getAchievementBackgroundStyle() {
        return this.achievementBackgroundStyle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SecurityPolicyModel getSecurityPolicy() {
        return this.securityPolicy;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final EnumC38541a getBorderStyle() {
        return this.borderStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgressSegmentCount() {
        return this.progressSegmentCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActiveSegmentIndex() {
        return this.activeSegmentIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getNextAction() {
        return this.nextAction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getBackAction() {
        return this.backAction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getPhotoRevealFraction() {
        return this.photoRevealFraction;
    }

    public final List<DesignSystemModel> component8() {
        return this.items;
    }

    public final List<DesignSystemModel> component9() {
        return this.headerOverlayItems;
    }

    public final CommunitySnapshotContainerModel copy(String id4, int progressSegmentCount, int activeSegmentIndex, GenericInteraction nextAction, GenericInteraction backAction, String backgroundImageUrl, float photoRevealFraction, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> headerOverlayItems, List<? extends DesignSystemModel> footerOverlayItems, AchievementsBackgroundStyle achievementBackgroundStyle, ColorThemeModel colors, SecurityPolicyModel securityPolicy, EnumC38541a borderStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(nextAction, "nextAction");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(headerOverlayItems, "headerOverlayItems");
        AbstractC22676k.m65750j(footerOverlayItems, "footerOverlayItems");
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        return new CommunitySnapshotContainerModel(id4, progressSegmentCount, activeSegmentIndex, nextAction, backAction, backgroundImageUrl, photoRevealFraction, items, headerOverlayItems, footerOverlayItems, achievementBackgroundStyle, colors, securityPolicy, borderStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunitySnapshotContainerModel)) {
            return false;
        }
        CommunitySnapshotContainerModel communitySnapshotContainerModel = (CommunitySnapshotContainerModel) other;
        return AbstractC22676k.m65745e(this.id, communitySnapshotContainerModel.id) && this.progressSegmentCount == communitySnapshotContainerModel.progressSegmentCount && this.activeSegmentIndex == communitySnapshotContainerModel.activeSegmentIndex && AbstractC22676k.m65745e(this.nextAction, communitySnapshotContainerModel.nextAction) && AbstractC22676k.m65745e(this.backAction, communitySnapshotContainerModel.backAction) && AbstractC22676k.m65745e(this.backgroundImageUrl, communitySnapshotContainerModel.backgroundImageUrl) && Float.compare(this.photoRevealFraction, communitySnapshotContainerModel.photoRevealFraction) == 0 && AbstractC22676k.m65745e(this.items, communitySnapshotContainerModel.items) && AbstractC22676k.m65745e(this.headerOverlayItems, communitySnapshotContainerModel.headerOverlayItems) && AbstractC22676k.m65745e(this.footerOverlayItems, communitySnapshotContainerModel.footerOverlayItems) && this.achievementBackgroundStyle == communitySnapshotContainerModel.achievementBackgroundStyle && AbstractC22676k.m65745e(this.colors, communitySnapshotContainerModel.colors) && AbstractC22676k.m65745e(this.securityPolicy, communitySnapshotContainerModel.securityPolicy) && this.borderStyle == communitySnapshotContainerModel.borderStyle;
    }

    public final AchievementsBackgroundStyle getAchievementBackgroundStyle() {
        return this.achievementBackgroundStyle;
    }

    public final int getActiveSegmentIndex() {
        return this.activeSegmentIndex;
    }

    public final GenericInteraction getBackAction() {
        return this.backAction;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final EnumC38541a getBorderStyle() {
        return this.borderStyle;
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final List<DesignSystemModel> getFooterOverlayItems() {
        return this.footerOverlayItems;
    }

    public final List<DesignSystemModel> getHeaderOverlayItems() {
        return this.headerOverlayItems;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final GenericInteraction getNextAction() {
        return this.nextAction;
    }

    public final float getPhotoRevealFraction() {
        return this.photoRevealFraction;
    }

    public final int getProgressSegmentCount() {
        return this.progressSegmentCount;
    }

    public final SecurityPolicyModel getSecurityPolicy() {
        return this.securityPolicy;
    }

    public int hashCode() {
        int iHashCode = (this.nextAction.hashCode() + AbstractC11266d.m30448b(this.activeSegmentIndex, AbstractC11266d.m30448b(this.progressSegmentCount, this.id.hashCode() * 31, 31), 31)) * 31;
        GenericInteraction genericInteraction = this.backAction;
        int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        String str = this.backgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.photoRevealFraction, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.items), 31, this.headerOverlayItems), 31, this.footerOverlayItems);
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        int iHashCode3 = (iM31983b + (achievementsBackgroundStyle == null ? 0 : achievementsBackgroundStyle.hashCode())) * 31;
        ColorThemeModel colorThemeModel = this.colors;
        int iHashCode4 = (iHashCode3 + (colorThemeModel == null ? 0 : colorThemeModel.hashCode())) * 31;
        SecurityPolicyModel securityPolicyModel = this.securityPolicy;
        return this.borderStyle.hashCode() + ((iHashCode4 + (securityPolicyModel != null ? securityPolicyModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        int i13 = this.progressSegmentCount;
        int i14 = this.activeSegmentIndex;
        GenericInteraction genericInteraction = this.nextAction;
        GenericInteraction genericInteraction2 = this.backAction;
        String str2 = this.backgroundImageUrl;
        float f13 = this.photoRevealFraction;
        List<DesignSystemModel> list = this.items;
        List<DesignSystemModel> list2 = this.headerOverlayItems;
        List<DesignSystemModel> list3 = this.footerOverlayItems;
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        ColorThemeModel colorThemeModel = this.colors;
        SecurityPolicyModel securityPolicyModel = this.securityPolicy;
        EnumC38541a enumC38541a = this.borderStyle;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "CommunitySnapshotContainerModel(id=", str, ", progressSegmentCount=", ", activeSegmentIndex=");
        sbM30467u.append(i14);
        sbM30467u.append(", nextAction=");
        sbM30467u.append(genericInteraction);
        sbM30467u.append(", backAction=");
        sbM30467u.append(genericInteraction2);
        sbM30467u.append(", backgroundImageUrl=");
        sbM30467u.append(str2);
        sbM30467u.append(", photoRevealFraction=");
        sbM30467u.append(f13);
        sbM30467u.append(", items=");
        sbM30467u.append(list);
        sbM30467u.append(", headerOverlayItems=");
        AbstractC21702c.m61148s(sbM30467u, list2, ", footerOverlayItems=", list3, ", achievementBackgroundStyle=");
        sbM30467u.append(achievementsBackgroundStyle);
        sbM30467u.append(", colors=");
        sbM30467u.append(colorThemeModel);
        sbM30467u.append(", securityPolicy=");
        sbM30467u.append(securityPolicyModel);
        sbM30467u.append(", borderStyle=");
        sbM30467u.append(enumC38541a);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunitySnapshotContainerModel(String id4, int i13, int i14, GenericInteraction nextAction, GenericInteraction genericInteraction, String str, float f13, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> headerOverlayItems, List<? extends DesignSystemModel> footerOverlayItems, AchievementsBackgroundStyle achievementsBackgroundStyle, ColorThemeModel colorThemeModel, SecurityPolicyModel securityPolicyModel, EnumC38541a borderStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(nextAction, "nextAction");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(headerOverlayItems, "headerOverlayItems");
        AbstractC22676k.m65750j(footerOverlayItems, "footerOverlayItems");
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        this.id = id4;
        this.progressSegmentCount = i13;
        this.activeSegmentIndex = i14;
        this.nextAction = nextAction;
        this.backAction = genericInteraction;
        this.backgroundImageUrl = str;
        this.photoRevealFraction = f13;
        this.items = items;
        this.headerOverlayItems = headerOverlayItems;
        this.footerOverlayItems = footerOverlayItems;
        this.achievementBackgroundStyle = achievementsBackgroundStyle;
        this.colors = colorThemeModel;
        this.securityPolicy = securityPolicyModel;
        this.borderStyle = borderStyle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommunitySnapshotContainerModel(String str, int i13, int i14, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str2, float f13, List list, List list2, List list3, AchievementsBackgroundStyle achievementsBackgroundStyle, ColorThemeModel colorThemeModel, SecurityPolicyModel securityPolicyModel, EnumC38541a enumC38541a, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        float f14 = (i15 & 64) != 0 ? 0.0f : f13;
        int i16 = i15 & 128;
        C25271y c25271y = C25271y.f99162w;
        this(str, i13, i14, genericInteraction, genericInteraction2, str2, f14, i16 != 0 ? c25271y : list, (i15 & 256) != 0 ? c25271y : list2, (i15 & 512) != 0 ? c25271y : list3, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : achievementsBackgroundStyle, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : colorThemeModel, (i15 & 4096) != 0 ? null : securityPolicyModel, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC38541a.SOLID : enumC38541a);
    }
}
