package yq0;

import com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotExerciseStatModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotExerciseTileModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotHeaderModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotMetricCardModel;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.TrendStateEnum;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorValueModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import e93.AbstractC12889b;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21369c;
import j61.C21374h;
import j61.EnumC21371e;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ly0.C24797a;
import m51.InterfaceC25079a;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23623f0;
import p716lb1.AbstractC23682o;
import p716lb1.AbstractC23690p1;
import p716lb1.AbstractC23703r2;
import p716lb1.C23596b1;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import vb1.C35868a;
import y71.C39274g;
import yb3.AbstractC39414r;
import yk2.C39611k;
import zq0.C40962d0;
import zq0.C40971l;
import zq0.C40980u;
import zq0.C40984y;

/* JADX INFO: renamed from: yq0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001c\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "Lzq0/l;", "t", "(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;", "Lzq0/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;", "Lzq0/d0;", "x", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;", "Lj71/c;", "y", "(Lj71/c;)Lj71/c;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;", "Lzq0/u;", "v", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;", "Ljb1/a;", "a", "Ll83/h;", "q", "()Ljb1/a;", "graphNestedReducer", "b", "Ljb1/a;", "p", "communityEverydayStatsDesignItemReducer", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39709b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f170941a = AbstractC30060g.m92088H(new C39708a(0));

    /* JADX INFO: renamed from: b */
    private static final C21535a f170942b = AbstractC21537c.m60554d(new C35868a(21));

    /* JADX INFO: renamed from: yq0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170943w;

        public a(Function1 function1) {
            this.f170943w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170943w.invoke((SnapshotMetricCardModel) it);
        }
    }

    /* JADX INFO: renamed from: yq0.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170944w;

        public b(Function1 function1) {
            this.f170944w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170944w.invoke((SnapshotExerciseTileModel) it);
        }
    }

    /* JADX INFO: renamed from: yq0.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170945w;

        public c(Function1 function1) {
            this.f170945w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170945w.invoke((SnapshotHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: yq0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170946w;

        public d(Function1 function1) {
            this.f170946w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170946w.invoke((CommunitySnapshotContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: yq0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C21395c c21395c = (C21395c) it;
            C21374h plane = c21395c.getPlane();
            return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : C16618c.f63938e, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127056j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C35868a(22));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m127057k(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C35868a c35868a = new C35868a(23);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SnapshotMetricCardModel.class), new a(c35868a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SnapshotExerciseTileModel.class), new b(new C35868a(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SnapshotHeaderModel.class), new c(new C35868a(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CommunitySnapshotContainerModel.class), new d(new C35868a(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C40962d0 m127058l(SnapshotMetricCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m127070x(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C40980u m127059m(SnapshotExerciseTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m127068v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C40984y m127060n(SnapshotHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m127069w(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C40971l m127061o(CommunitySnapshotContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m127066t(model);
    }

    /* JADX INFO: renamed from: p */
    public static final C21535a m127062p() {
        return f170942b;
    }

    /* JADX INFO: renamed from: q */
    private static final C21535a m127063q() {
        return (C21535a) f170941a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C21535a m127064r() {
        return AbstractC21537c.m60554d(new C39611k(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m127065s(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21395c.class), new e());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX INFO: renamed from: t */
    private static final C40971l m127066t(CommunitySnapshotContainerModel communitySnapshotContainerModel) {
        AbstractC22403o.c cVar;
        ColorValueModel accentColor;
        ColorBackgroundModel background;
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C39611k(8));
        String id4 = communitySnapshotContainerModel.getId();
        int progressSegmentCount = communitySnapshotContainerModel.getProgressSegmentCount();
        int activeSegmentIndex = communitySnapshotContainerModel.getActiveSegmentIndex();
        GenericInteraction nextAction = communitySnapshotContainerModel.getNextAction();
        GenericInteraction backAction = communitySnapshotContainerModel.getBackAction();
        String backgroundImageUrl = communitySnapshotContainerModel.getBackgroundImageUrl();
        InterfaceC39332e interfaceC39332eM68737b = null;
        if (backgroundImageUrl == null) {
            cVar = null;
        } else {
            String str = !AbstractC39414r.m125890i0(backgroundImageUrl) ? backgroundImageUrl : null;
            if (str != null) {
                cVar = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                cVar = null;
            }
        }
        float fM36283m = AbstractC12889b.m36283m(communitySnapshotContainerModel.getPhotoRevealFraction(), 0.0f, 1.0f);
        List<InterfaceC25312u> listM60545m = c21535aM60554d.m60545m(communitySnapshotContainerModel.getItems());
        List<InterfaceC25312u> listM60545m2 = c21535aM60554d.m60545m(communitySnapshotContainerModel.getHeaderOverlayItems());
        List<InterfaceC25312u> listM60545m3 = c21535aM60554d.m60545m(communitySnapshotContainerModel.getFooterOverlayItems());
        AchievementsBackgroundStyle achievementBackgroundStyle = communitySnapshotContainerModel.getAchievementBackgroundStyle();
        ColorThemeModel colors = communitySnapshotContainerModel.getColors();
        InterfaceC25079a interfaceC25079aM68736a = (colors == null || (background = colors.getBackground()) == null) ? null : AbstractC23623f0.m68736a(background);
        ColorThemeModel colors2 = communitySnapshotContainerModel.getColors();
        if (colors2 != null && (accentColor = colors2.getAccentColor()) != null) {
            interfaceC39332eM68737b = AbstractC23623f0.m68737b(accentColor);
        }
        return new C40971l(id4, progressSegmentCount, activeSegmentIndex, nextAction, backAction, cVar, fM36283m, listM60545m, listM60545m2, listM60545m3, achievementBackgroundStyle, interfaceC25079aM68736a, interfaceC39332eM68737b, communitySnapshotContainerModel.getSecurityPolicy(), communitySnapshotContainerModel.getBorderStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m127067u(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX INFO: renamed from: v */
    private static final C40980u m127068v(SnapshotExerciseTileModel snapshotExerciseTileModel) {
        String imageUrl;
        EnumC39333f enumC39333f;
        AbstractC22403o aVar;
        String subtitleStyle = snapshotExerciseTileModel.getSubtitleStyle();
        if (subtitleStyle != null) {
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length = enumC39333fArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC39333f = null;
                    break;
                }
                enumC39333f = enumC39333fArrValues[i13];
                if (AbstractC22676k.m65745e(enumC39333f.name(), subtitleStyle)) {
                    break;
                }
                i13++;
            }
            if (enumC39333f == null) {
                imageUrl = snapshotExerciseTileModel.getImageUrl();
                if (imageUrl != null || AbstractC39414r.m125890i0(imageUrl)) {
                    enumC39333f = EnumC39333f.STRAIN;
                } else {
                    enumC39333f = EnumC39333f.ACCENT_ACTION;
                }
            }
        } else {
            imageUrl = snapshotExerciseTileModel.getImageUrl();
            if (imageUrl != null) {
                enumC39333f = EnumC39333f.STRAIN;
            } else {
                enumC39333f = EnumC39333f.STRAIN;
            }
        }
        EnumC39333f enumC39333f2 = enumC39333f;
        String imageUrl2 = snapshotExerciseTileModel.getImageUrl();
        if (imageUrl2 == null || AbstractC39414r.m125890i0(imageUrl2)) {
            Integer numM46376a = AbstractC16315n0.m46376a(snapshotExerciseTileModel.getIconKey());
            aVar = new AbstractC22403o.a(numM46376a != null ? numM46376a.intValue() : EnumC16313m0.WEIGHTLIFTING.toWhoopIcon());
        } else {
            aVar = new AbstractC22403o.c(snapshotExerciseTileModel.getImageUrl(), 0, 0, 0, 14, null);
        }
        AbstractC22403o abstractC22403o = aVar;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(snapshotExerciseTileModel.getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(snapshotExerciseTileModel.getSubtitleDisplay());
        String imageUrl3 = snapshotExerciseTileModel.getImageUrl();
        EnumC39333f enumC39333f3 = (imageUrl3 == null || AbstractC39414r.m125890i0(imageUrl3)) ? EnumC39333f.WHITE_10 : EnumC39333f.TRANSPARENT;
        List<SnapshotExerciseStatModel> stats = snapshotExerciseTileModel.getStats();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(stats, 10));
        for (SnapshotExerciseStatModel snapshotExerciseStatModel : stats) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(snapshotExerciseStatModel.getValue());
            String valueSuffix = snapshotExerciseStatModel.getValueSuffix();
            arrayList.add(new C33210q(null, textResourceM21278l3, null, valueSuffix != null ? AbstractC8693b.m21278l(valueSuffix) : null, null, null, AbstractC8693b.m21278l(snapshotExerciseStatModel.getLabel()), false, null, null, null, false, 4021, null));
        }
        return new C40980u(textResourceM21278l, textResourceM21278l2, enumC39333f2, abstractC22403o, enumC39333f3, arrayList);
    }

    /* JADX INFO: renamed from: w */
    private static final C40984y m127069w(SnapshotHeaderModel snapshotHeaderModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(snapshotHeaderModel.getTitle());
        String subtitle = snapshotHeaderModel.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        String avatar = snapshotHeaderModel.getAvatar();
        AbstractC22403o abstractC22403oM64503l = avatar != null ? AbstractC22404p.m64503l(avatar) : null;
        GenericInteraction action = snapshotHeaderModel.getAction();
        List<SnapshotHeaderModel.TrailingButton> trailingButtons = snapshotHeaderModel.getTrailingButtons();
        if (trailingButtons == null) {
            trailingButtons = C25271y.f99162w;
        }
        List<SnapshotHeaderModel.TrailingButton> list = trailingButtons;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (SnapshotHeaderModel.TrailingButton trailingButton : list) {
            int iM46381f = AbstractC16315n0.m46381f(trailingButton.getIcon(), null, 1, null);
            GenericInteraction action2 = trailingButton.getAction();
            FabMenuModel menu = trailingButton.getMenu();
            arrayList.add(new C40984y.a(iM46381f, action2, menu != null ? AbstractC23690p1.m69224f(menu) : null));
        }
        return new C40984y(textResourceM21278l, textResourceM21278l2, abstractC22403oM64503l, action, arrayList);
    }

    /* JADX INFO: renamed from: x */
    private static final C40962d0 m127070x(SnapshotMetricCardModel snapshotMetricCardModel) {
        ArrayList arrayList;
        C21395c c21395cM127071y;
        TrendStateEnum trendState = snapshotMetricCardModel.getTrendState();
        if (trendState == null) {
            trendState = TrendStateEnum.UNKNOWN;
        }
        C24797a c24797aM69171a = AbstractC23682o.m69171a(trendState);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(snapshotMetricCardModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(snapshotMetricCardModel.getValue());
        String valueSuffix = snapshotMetricCardModel.getValueSuffix();
        InterfaceC25312u interfaceC25312u = null;
        interfaceC25312u = null;
        TextResource textResourceM21278l3 = valueSuffix != null ? AbstractC8693b.m21278l(valueSuffix) : null;
        String previousValue = snapshotMetricCardModel.getPreviousValue();
        TextResource textResourceM21278l4 = previousValue != null ? AbstractC8693b.m21278l(previousValue) : null;
        C39274g arrowIcon = c24797aM69171a.getArrowIcon();
        EnumC39333f arrowTint = c24797aM69171a.getArrowTint();
        List<LegendStyle> barStyles = snapshotMetricCardModel.getBarStyles();
        if (barStyles != null) {
            List<LegendStyle> list = barStyles;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC23703r2.m69349a((LegendStyle) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        GraphModel graph = snapshotMetricCardModel.getGraph();
        if (graph != null) {
            if (graph.getPlots().isEmpty()) {
                graph = null;
            }
            if (graph != null) {
                InterfaceC25312u interfaceC25312uM60544l = m127063q().m60544l(graph);
                C21395c c21395c = interfaceC25312uM60544l instanceof C21395c ? (C21395c) interfaceC25312uM60544l : null;
                interfaceC25312u = (c21395c == null || (c21395cM127071y = m127071y(c21395c)) == null) ? interfaceC25312uM60544l : c21395cM127071y;
            }
        }
        return new C40962d0(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, arrowIcon, arrowTint, arrayList, interfaceC25312u);
    }

    /* JADX INFO: renamed from: y */
    private static final C21395c m127071y(C21395c c21395c) {
        List<C21369c> listM59991h = c21395c.getPlane().m59991h();
        if ((listM59991h instanceof Collection) && listM59991h.isEmpty()) {
            return c21395c;
        }
        Iterator<T> it = listM59991h.iterator();
        while (it.hasNext()) {
            if (((C21369c) it.next()).getType() == EnumC21371e.REGION_HIGHLIGHT) {
                C21374h plane = c21395c.getPlane();
                List<C21369c> listM59991h2 = c21395c.getPlane().m59991h();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM59991h2, 10));
                for (C21369c c21369cM59959b : listM59991h2) {
                    if (c21369cM59959b.getType() == EnumC21371e.REGION_HIGHLIGHT) {
                        c21369cM59959b = C21369c.m59959b(c21369cM59959b, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, true, 1 * 4, 2047, null);
                    }
                    arrayList.add(c21369cM59959b);
                }
                return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : null, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : arrayList, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
            }
        }
        return c21395c;
    }
}
