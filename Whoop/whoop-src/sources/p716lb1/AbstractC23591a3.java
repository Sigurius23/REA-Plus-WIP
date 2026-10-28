package p716lb1;

import c41.AbstractC4155y2;
import c41.C4028g1;
import c41.C4113s2;
import c41.C4141w2;
import c41.C4148x2;
import c41.EnumC4035h1;
import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.items.ContributorTileMetricModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricTileModel;
import com.whoop.design.models.items.KeyMetricTileModelDialogContentModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.TrendBarModel;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16277f;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.EnumC17727b2;
import i41.C18084d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p736sz0.C33182g1;
import p736sz0.C33210q;
import p736sz0.EnumC33185h1;
import p745y81.EnumC39333f;
import v41.C35674k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.a3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/items/KeyMetricTileModel;", "Lc41/y2;", "n", "(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/y2;", "Lc41/x2;", "o", "(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/x2;", "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "Lhy0/b2;", "p", "(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Lhy0/b2;", "Llb1/y0;", "a", "Llb1/y0;", "g", "()Llb1/y0;", "metricMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23591a3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93571a = Function1.m68251a(new C23715t2(13));

    /* JADX INFO: renamed from: lb1.a3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93572a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93573b;

        static {
            int[] iArr = new int[EnumC4035h1.values().length];
            try {
                iArr[EnumC4035h1.NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4035h1.CALIBRATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93572a = iArr;
            int[] iArr2 = new int[TrendTypeEnum.values().length];
            try {
                iArr2[TrendTypeEnum.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TrendTypeEnum.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TrendTypeEnum.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TrendTypeEnum.POSITIVE_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TrendTypeEnum.CONCERN_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TrendTypeEnum.ALERT_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f93573b = iArr2;
        }
    }

    /* JADX INFO: renamed from: lb1.a3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93574w;

        public b(Function1 function1) {
            this.f93574w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93574w.invoke((ContributorTileMetricModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a3$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93575w;

        public c(Function1 function1) {
            this.f93575w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93575w.invoke((KeyMetricCarouselModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a3$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93576w;

        public d(Function1 function1) {
            this.f93576w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93576w.invoke((KeyMetricTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a3$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93577w;

        public e(Function1 function1) {
            this.f93577w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93577w.invoke((HorizontalStatModel) it);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m68265g() {
        return f93571a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68266h(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23715t2 c23715t2 = new C23715t2(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContributorTileMetricModel.class), new b(c23715t2));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(KeyMetricCarouselModel.class), new c(new C23715t2(15)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(KeyMetricTileModel.class), new d(new C23715t2(16)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalStatModel.class), new e(new C23715t2(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX INFO: renamed from: i */
    public static final C4028g1 m68267i(ContributorTileMetricModel model) {
        EnumC4035h1 enumC4035h1;
        TextResource status;
        EnumC4035h1 enumC4035h2;
        EnumC4035h1 enumC4035h3;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String strM21264b = AbstractC8692a.m21264b(model.getTitle());
        ArrayList arrayList = null;
        String strConcat = strM21264b != null ? "DeepDiveMetric_".concat(strM21264b) : null;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(model.getIcon());
        TextResource title = model.getTitle();
        int i13 = 0;
        if (model.getMetricStyle() != null) {
            String metricStyle = model.getMetricStyle();
            enumC4035h1 = EnumC4035h1.DATA;
            EnumC4035h1[] enumC4035h1ArrValues = EnumC4035h1.values();
            int length = enumC4035h1ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC4035h3 = null;
                    break;
                }
                enumC4035h3 = enumC4035h1ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC4035h3.name(), metricStyle)) {
                    break;
                }
                i14++;
            }
            if (enumC4035h3 != null) {
                enumC4035h1 = enumC4035h3;
            }
            if (enumC4035h1 == null) {
                enumC4035h1 = EnumC4035h1.DATA;
            }
        } else {
            enumC4035h1 = EnumC4035h1.DATA;
        }
        String metricStyle2 = model.getMetricStyle();
        if (metricStyle2 != null) {
            EnumC4035h1 enumC4035h4 = EnumC4035h1.DATA;
            EnumC4035h1[] enumC4035h1ArrValues2 = EnumC4035h1.values();
            int length2 = enumC4035h1ArrValues2.length;
            while (true) {
                if (i13 >= length2) {
                    enumC4035h2 = null;
                    break;
                }
                enumC4035h2 = enumC4035h1ArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC4035h2.name(), metricStyle2)) {
                    break;
                }
                i13++;
            }
            if (enumC4035h2 != null) {
                enumC4035h4 = enumC4035h2;
            }
            int i15 = a.f93572a[enumC4035h4.ordinal()];
            if (i15 != 1) {
                status = i15 != 2 ? model.getStatus() : AbstractC8693b.m21271e(model.getStatus(), enumC4035h4.getTextDefault());
            } else {
                status = enumC4035h4.getTextDefault();
            }
            if (status == null) {
                status = model.getStatus();
            }
        } else {
            status = model.getStatus();
        }
        TextResource statusSubtitle = model.getStatusSubtitle();
        String statusIcon = model.getStatusIcon();
        EnumC16313m0 enumC16313m0M46377b2 = statusIcon != null ? AbstractC16315n0.m46377b(statusIcon) : null;
        EnumC23701r0 statusType = model.getStatusType();
        EnumC39333f statusColor = statusType != null ? statusType.getStatusColor() : null;
        C9598e destination = model.getDestination();
        List<LegendStyle> barStyles = model.getBarStyles();
        if (barStyles != null) {
            List<LegendStyle> list = barStyles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC23703r2.m69349a((LegendStyle) it.next()));
            }
        }
        return new C4028g1(id4, strConcat, enumC16313m0M46377b, title, enumC4035h1, status, statusSubtitle, enumC16313m0M46377b2, statusColor, destination, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C35674k m68268j(KeyMetricCarouselModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(0));
        TextResource.C8691e c8691e = new TextResource.C8691e(model.getTitle());
        TextResource.C8691e c8691e2 = new TextResource.C8691e(model.getSubtitle());
        List<InterfaceC25312u> listM60540g = c21535aM60554d.m60540g(model.getKeyMetricTile());
        AbstractC22676k.m65748h(listM60540g, "null cannot be cast to non-null type kotlin.collections.List<com.whoop.design.atomic.molecule.tile.KeyMetricTileState>");
        return new C35674k(c8691e, c8691e2, listM60540g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m68269k(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C4141w2 m68270l(KeyMetricTileModel model) {
        int i13;
        C4113s2 c4113s2;
        EnumC17727b2 enumC17727b2;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        if (id4 == null) {
            id4 = "";
        }
        String str = id4;
        AbstractC4155y2 abstractC4155y2M68272n = m68272n(model);
        int iM46381f = AbstractC16315n0.m46381f(model.getKeyMetricTileIcon(), null, 1, null);
        C4148x2 c4148x2M68273o = m68273o(model);
        TextResource.C8691e c8691e = new TextResource.C8691e(model.getKeyMetricTileTitleDisplay());
        TextResource c8691e2 = model.getKeyMetricTileStatValueDisplay().length() > 0 ? new TextResource.C8691e(model.getKeyMetricTileStatValueDisplay()) : new TextResource.C8688b(AbstractC16277f.f62327g0, null, 2, null);
        EnumC39333f enumC39333f = EnumC39333f.WHITE_10;
        TrendBarModel keyMetricTileTrendBar = model.getKeyMetricTileTrendBar();
        C18084d c18084dM68722e = keyMetricTileTrendBar != null ? AbstractC23621e5.m68722e(keyMetricTileTrendBar) : null;
        String placeholderMessageDisplay = model.getPlaceholderMessageDisplay();
        int i14 = 0;
        boolean z4 = model.getKeyMetricTileStatValueDisplay().length() >= 6;
        KeyMetricTileModelDialogContentModel keyMetricTileDialogContent = model.getKeyMetricTileDialogContent();
        if (keyMetricTileDialogContent != null) {
            String titleDisplay = keyMetricTileDialogContent.getTitleDisplay();
            String trendTitleDisplay = keyMetricTileDialogContent.getTrendTitleDisplay();
            String trendType = keyMetricTileDialogContent.getTrendType();
            EnumC17727b2 enumC17727b3 = EnumC17727b2.NONE;
            EnumC17727b2[] enumC17727b2ArrValues = EnumC17727b2.values();
            int length = enumC17727b2ArrValues.length;
            while (true) {
                if (i14 >= length) {
                    i13 = iM46381f;
                    enumC17727b2 = null;
                    break;
                }
                enumC17727b2 = enumC17727b2ArrValues[i14];
                i13 = iM46381f;
                if (AbstractC22676k.m65745e(enumC17727b2.name(), trendType)) {
                    break;
                }
                i14++;
                iM46381f = i13;
            }
            if (enumC17727b2 == null) {
                enumC17727b2 = enumC17727b3;
            }
            String description = keyMetricTileDialogContent.getDescription();
            String disclaimer = keyMetricTileDialogContent.getDisclaimer();
            SecondaryButtonModel secondaryButton = keyMetricTileDialogContent.getSecondaryButton();
            c4113s2 = new C4113s2(titleDisplay, trendTitleDisplay, enumC17727b2, description, disclaimer, secondaryButton != null ? AbstractC23613d4.m68666p(secondaryButton) : null);
        } else {
            i13 = iM46381f;
            c4113s2 = null;
        }
        return new C4141w2(null, str, abstractC4155y2M68272n, i13, null, c4148x2M68273o, c8691e, null, c8691e2, enumC39333f, c18084dM68722e, placeholderMessageDisplay, c4113s2, z4, 145, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX INFO: renamed from: m */
    public static final C33210q m68271m(HorizontalStatModel model) {
        EnumC33185h1 enumC33185h1;
        AbstractC22676k.m65750j(model, "model");
        String statTitleSuffixDisplay = model.getStatTitleSuffixDisplay();
        if (statTitleSuffixDisplay == null) {
            enumC33185h1 = EnumC33185h1.TEXT;
        } else {
            if (statTitleSuffixDisplay.equals("%")) {
                enumC33185h1 = EnumC33185h1.NUMBER;
            } else {
                Pattern patternCompile = Pattern.compile("\\d");
                AbstractC22676k.m65749i(patternCompile, "compile(...)");
                if (patternCompile.matcher(statTitleSuffixDisplay).find()) {
                    enumC33185h1 = EnumC33185h1.NUMBER;
                } else {
                    enumC33185h1 = EnumC33185h1.TEXT;
                }
            }
            if (enumC33185h1 == null) {
                enumC33185h1 = EnumC33185h1.TEXT;
            }
        }
        EnumC33185h1 enumC33185h2 = enumC33185h1;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getStatMainValueDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getStatTitleDisplay());
        String statTitleSuffixDisplay2 = model.getStatTitleSuffixDisplay();
        C33182g1 c33182g1 = null;
        TextResource textResourceM21278l3 = statTitleSuffixDisplay2 != null ? AbstractC8693b.m21278l(statTitleSuffixDisplay2) : null;
        if (model.getStatTrendType() != null && model.getStatComparisonDisplay() != null) {
            c33182g1 = new C33182g1(AbstractC8693b.m21278l(model.getStatComparisonDisplay()), m68274p(model.getStatTrendType()));
        }
        return new C33210q(null, textResourceM21278l, AbstractC16315n0.m46376a(model.getStatIconDisplay()), textResourceM21278l3, enumC33185h2, c33182g1, textResourceM21278l2, false, null, null, null, false, 3969, null);
    }

    /* JADX INFO: renamed from: n */
    private static final AbstractC4155y2 m68272n(KeyMetricTileModel keyMetricTileModel) {
        String keyMetricTileSuffixDisplay = keyMetricTileModel.getKeyMetricTileSuffixDisplay();
        if (keyMetricTileSuffixDisplay != null) {
            AbstractC4155y2 cVar = AbstractC39414r.m125876U(keyMetricTileSuffixDisplay, "%", false) ? AbstractC4155y2.b.f16921a : new AbstractC4155y2.c(new TextResource.C8691e(keyMetricTileModel.getKeyMetricTileSuffixDisplay()));
            if (cVar != null) {
                return cVar;
            }
        }
        return AbstractC4155y2.a.f16920a;
    }

    /* JADX INFO: renamed from: o */
    private static final C4148x2 m68273o(KeyMetricTileModel keyMetricTileModel) {
        EnumC17727b2 enumC17727b2M68274p;
        TrendTypeEnum keyMetricTileTrendType = keyMetricTileModel.getKeyMetricTileTrendType();
        if (keyMetricTileTrendType == null || (enumC17727b2M68274p = m68274p(keyMetricTileTrendType)) == null) {
            enumC17727b2M68274p = EnumC17727b2.NEUTRAL;
        }
        String keyMetricTileTrendDisplay = keyMetricTileModel.getKeyMetricTileTrendDisplay();
        return new C4148x2(enumC17727b2M68274p, keyMetricTileTrendDisplay != null ? new TextResource.C8691e(keyMetricTileTrendDisplay) : AbstractC8693b.m21267a());
    }

    /* JADX INFO: renamed from: p */
    private static final EnumC17727b2 m68274p(TrendTypeEnum trendTypeEnum) {
        switch (a.f93573b[trendTypeEnum.ordinal()]) {
            case 1:
                return EnumC17727b2.POSITIVE;
            case 2:
                return EnumC17727b2.NEGATIVE;
            case 3:
                return EnumC17727b2.NEUTRAL;
            case 4:
                return EnumC17727b2.POSITIVE_RANGE;
            case 5:
                return EnumC17727b2.CONCERN_RANGE;
            case 6:
                return EnumC17727b2.ALERT_RANGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
