package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.items.CustomGaugeEntryModel;
import com.whoop.design.models.items.DisplayStyle;
import com.whoop.design.models.items.ExplainerGaugeModel;
import com.whoop.design.models.items.OverviewGaugeModel;
import com.whoop.design.models.items.RecoveryGaugeModel;
import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.ScoreGaugeModel;
import com.whoop.design.models.items.ScoreGaugeRowModel;
import com.whoop.design.models.items.StrainGaugeModel;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.C21425i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import r11.C30855d;
import s51.C32212i;
import s51.C32216m;
import z51.C40090a;
import z51.C40101l;
import z51.C40107r;
import z51.EnumC40100k;
import z51.EnumC40108s;

/* JADX INFO: renamed from: lb1.u1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/design/models/items/OverviewGaugeModel;", "model", "Lz51/l;", "s", "(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;", "Lcom/whoop/design/models/items/CustomGaugeEntryModel;", "Lz51/a;", "q", "(Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lz51/a;", "Lcom/whoop/design/models/items/ExplainerGaugeModel;", "Lr11/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;", "Lcom/whoop/design/models/items/ScoreGaugeModel;", "Lj81/i;", "r", "(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;", "", "Li91/a;", "t", "(Ljava/lang/String;)Li91/a;", "Llb1/y0;", "a", "Llb1/y0;", "p", "()Llb1/y0;", "gaugeMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23720u1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93983a = Function1.m68251a(new C23617e1(24));

    /* JADX INFO: renamed from: lb1.u1$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93984a;

        static {
            int[] iArr = new int[DisplayStyle.values().length];
            try {
                iArr[DisplayStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayStyle.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93984a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.u1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93985w;

        public b(Function1 function1) {
            this.f93985w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93985w.invoke((OverviewGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93986w;

        public c(Function1 function1) {
            this.f93986w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93986w.invoke((RecoveryGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93987w;

        public d(Function1 function1) {
            this.f93987w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93987w.invoke((StrainGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93988w;

        public e(Function1 function1) {
            this.f93988w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93988w.invoke((ExplainerGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93989w;

        public f(Function1 function1) {
            this.f93989w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93989w.invoke((ScoreGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93990w;

        public g(Function1 function1) {
            this.f93990w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93990w.invoke((ScoreGaugeRowModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u1$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f93991w = new h();

        /* JADX INFO: renamed from: a */
        public final long m69487a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69487a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f93992w = new i();

        /* JADX INFO: renamed from: a */
        public final long m69488a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69488a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f93993w = new j();

        /* JADX INFO: renamed from: a */
        public final long m69489a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69489a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f93994w = new k();

        /* JADX INFO: renamed from: a */
        public final long m69490a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69490a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f93995w = new l();

        /* JADX INFO: renamed from: a */
        public final long m69491a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69491a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f93996w = new m();

        /* JADX INFO: renamed from: a */
        public final long m69492a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69492a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.u1$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f93997w = new n();

        /* JADX INFO: renamed from: a */
        public final long m69493a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69493a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h */
    private static final C30855d m69468h(ExplainerGaugeModel explainerGaugeModel) {
        return new C30855d(!(explainerGaugeModel.getOptimalStrainPercent() == 0.0f), explainerGaugeModel.getOptimalStrainPercent(), new C23465k(Float.valueOf(explainerGaugeModel.getLowerOptimalStrainFillValue()), Float.valueOf(explainerGaugeModel.getHigherOptimalStrainFillValue())), explainerGaugeModel.getRecoveryPercentage(), explainerGaugeModel.getRecoveryLevel(), explainerGaugeModel.getStrainScorePercentage(), explainerGaugeModel.getDescriptionSubText(), explainerGaugeModel.getDescriptionText(), explainerGaugeModel.getHasDivider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69469i(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23617e1 c23617e1 = new C23617e1(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(OverviewGaugeModel.class), new b(c23617e1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(RecoveryGaugeModel.class), new c(new C23617e1(26)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StrainGaugeModel.class), new d(new C23617e1(27)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ExplainerGaugeModel.class), new e(new C23617e1(28)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ScoreGaugeModel.class), new f(new C23617e1(29)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ScoreGaugeRowModel.class), new g(new C23714t1(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C40101l m69470j(OverviewGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69479s(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: k */
    public static final C40107r m69471k(RecoveryGaugeModel model) {
        EnumC40108s enumC40108s;
        AbstractC22676k.m65750j(model, "model");
        String recoveryLevel = model.getRecoveryLevel();
        int iHashCode = recoveryLevel.hashCode();
        if (iHashCode != -2024701067) {
            if (iHashCode != -720687708) {
                if (iHashCode == 75572 && recoveryLevel.equals("LOW")) {
                    enumC40108s = EnumC40108s.RECOVERY_LOW;
                } else {
                    enumC40108s = EnumC40108s.RECOVERY_HIGH;
                }
            } else if (recoveryLevel.equals("CALIBRATING")) {
                enumC40108s = EnumC40108s.CALIBRATING;
            } else {
                enumC40108s = EnumC40108s.RECOVERY_HIGH;
            }
        } else if (recoveryLevel.equals("MEDIUM")) {
            enumC40108s = EnumC40108s.RECOVERY_MEDIUM;
        } else {
            enumC40108s = EnumC40108s.RECOVERY_HIGH;
        }
        return new C40107r(enumC40108s, model.getGaugeFillPercentage(), model.getScoreDisplay(), false, 0.0f, null, null, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C40107r m69472l(StrainGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C40107r(EnumC40108s.STRAIN, model.getGaugeFillPercentage(), model.getScoreDisplay(), false, 0.0f, null, null, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C30855d m69473m(ExplainerGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69468h(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C21425i m69474n(ScoreGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69478r(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C32216m m69475o(ScoreGaugeRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        List<ScoreGaugeDialModel> gauges = model.getGauges();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gauges, 10));
        for (ScoreGaugeDialModel scoreGaugeDialModel : gauges) {
            String id5 = scoreGaugeDialModel.getId();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(scoreGaugeDialModel.getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(scoreGaugeDialModel.getScoreDisplay());
            String scoreDisplaySuffix = scoreGaugeDialModel.getScoreDisplaySuffix();
            EnumC16313m0 enumC16313m0ValueOf = null;
            TextResource textResourceM21278l3 = scoreDisplaySuffix != null ? AbstractC8693b.m21278l(scoreDisplaySuffix) : null;
            String titleEndIcon = scoreGaugeDialModel.getTitleEndIcon();
            if (titleEndIcon != null) {
                enumC16313m0ValueOf = EnumC16313m0.valueOf(titleEndIcon);
            }
            arrayList.add(new C32212i(id5, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, enumC16313m0ValueOf, m69480t(scoreGaugeDialModel.getProgressFillStyle()), scoreGaugeDialModel.getGaugeFillPercentage(), scoreGaugeDialModel.getScoreTarget(), scoreGaugeDialModel.getLowerOptimalPercentage(), scoreGaugeDialModel.getHigherOptimalPercentage(), scoreGaugeDialModel.getDestination()));
        }
        return new C32216m(id4, arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static final C23743y0 m69476p() {
        return f93983a;
    }

    /* JADX INFO: renamed from: q */
    private static final C40090a m69477q(CustomGaugeEntryModel customGaugeEntryModel) {
        return new C40090a(AbstractC8693b.m21278l(customGaugeEntryModel.getTitle()), AbstractC8693b.m21278l(customGaugeEntryModel.getDisplayValue()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX INFO: renamed from: r */
    public static final C21425i m69478r(ScoreGaugeModel scoreGaugeModel) {
        String strM21265c;
        EnumC39333f enumC39333f;
        AbstractC22676k.m65750j(scoreGaugeModel, "<this>");
        String id4 = scoreGaugeModel.getId();
        String id5 = scoreGaugeModel.getId();
        ArrayList arrayList = null;
        if (id5 == null) {
            strM21265c = null;
        } else {
            if (id5.length() <= 0) {
                id5 = null;
            }
            if (id5 != null) {
                strM21265c = AbstractC8692a.m21265c(id5);
            } else {
                strM21265c = null;
            }
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(scoreGaugeModel.getScoreDisplayTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(scoreGaugeModel.getScoreDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(scoreGaugeModel.getScoreDisplaySuffix());
        float gaugeFillPercentage = scoreGaugeModel.getGaugeFillPercentage();
        Float scoreTarget = scoreGaugeModel.getScoreTarget();
        Float lowerOptimalPercentage = scoreGaugeModel.getLowerOptimalPercentage();
        Float higherOptimalPercentage = scoreGaugeModel.getHigherOptimalPercentage();
        AbstractC18247a abstractC18247aM69480t = m69480t(scoreGaugeModel.getProgressFillStyle());
        List<LegendStyle> barStyles = scoreGaugeModel.getBarStyles();
        if (barStyles != null) {
            List<LegendStyle> list = barStyles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC23703r2.m69349a((LegendStyle) it.next()));
            }
        }
        ArrayList arrayList2 = arrayList;
        C9598e destination = scoreGaugeModel.getDestination();
        DisplayStyle scoreDisplayStyle = scoreGaugeModel.getScoreDisplayStyle();
        if (scoreDisplayStyle == null) {
            enumC39333f = EnumC39333f.BRAND_WHITE;
        } else {
            int i13 = a.f93984a[scoreDisplayStyle.ordinal()];
            if (i13 == 1) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC39333f = EnumC39333f.WHITE_20;
            }
            if (enumC39333f == null) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            }
        }
        return new C21425i(id4, strM21265c, textResourceM21278l2, textResourceM21278l3, textResourceM21278l, scoreTarget, gaugeFillPercentage, lowerOptimalPercentage, higherOptimalPercentage, abstractC18247aM69480t, arrayList2, 0.0f, 0.0f, 0.0f, false, destination, enumC39333f, null, null, 423936, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX INFO: renamed from: s */
    public static final C40101l m69479s(OverviewGaugeModel model) {
        EnumC40100k enumC40100k;
        AbstractC22676k.m65750j(model, "model");
        boolean hasSleepPerformance = model.getHasSleepPerformance();
        switch (model.getRecoveryLevel()) {
            case "MEDIUM":
                enumC40100k = EnumC40100k.MEDIUM;
                break;
            case "CALIBRATING":
                enumC40100k = EnumC40100k.CALIBRATING;
                break;
            case "LOW":
                enumC40100k = EnumC40100k.LOW;
                break;
            case "HIGH":
                enumC40100k = EnumC40100k.HIGH;
                break;
            case "NONE":
                enumC40100k = EnumC40100k.NONE;
                break;
            default:
                enumC40100k = EnumC40100k.CALIBRATING;
                break;
        }
        EnumC40100k enumC40100k2 = enumC40100k;
        float recoveryScoreGaugeFillPercentage = model.getRecoveryScoreGaugeFillPercentage();
        TextResource recoveryScoreDisplay = model.getRecoveryScoreDisplay();
        TextResource sleepPerformanceDisplay = model.getSleepPerformanceDisplay();
        TextResource dayStrainDisplay = model.getDayStrainDisplay();
        float dayStrainGaugeFillPercentage = model.getDayStrainGaugeFillPercentage();
        boolean z4 = !(model.getOptimalStrainGaugeFillPercentage() == 0.0f);
        float optimalStrainGaugeFillPercentage = model.getOptimalStrainGaugeFillPercentage();
        C23465k c23465k = new C23465k(Float.valueOf(model.getLowerOptimalStrainFillValue()), Float.valueOf(model.getHigherOptimalStrainFillValue()));
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getHrvDisplay());
        Float weeklyPlanGoalStrainGaugeFillPercentage = model.getWeeklyPlanGoalStrainGaugeFillPercentage();
        float fFloatValue = weeklyPlanGoalStrainGaugeFillPercentage != null ? weeklyPlanGoalStrainGaugeFillPercentage.floatValue() : 0.0f;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getWeeklyPlanDisplay());
        boolean z13 = (model.getWeeklyPlanGoalStrainGaugeFillPercentage() == null || AbstractC22676k.m65743c(model.getWeeklyPlanGoalStrainGaugeFillPercentage(), 0.0f)) ? false : true;
        CustomGaugeEntryModel firstCustomGaugeEntry = model.getFirstCustomGaugeEntry();
        C40090a c40090aM69477q = firstCustomGaugeEntry != null ? m69477q(firstCustomGaugeEntry) : null;
        CustomGaugeEntryModel secondCustomGaugeEntry = model.getSecondCustomGaugeEntry();
        return new C40101l(z4, z13, hasSleepPerformance, optimalStrainGaugeFillPercentage, c23465k, recoveryScoreGaugeFillPercentage, recoveryScoreDisplay, enumC40100k2, sleepPerformanceDisplay, dayStrainGaugeFillPercentage, dayStrainDisplay, textResourceM21278l, fFloatValue, textResourceM21278l2, false, null, null, c40090aM69477q, secondCustomGaugeEntry != null ? m69477q(secondCustomGaugeEntry) : null, 114688, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public static final AbstractC18247a m69480t(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1838664331:
                    if (str.equals("STRAIN")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(l.f93995w));
                    }
                    break;
                case -720687708:
                    if (str.equals("CALIBRATING")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(k.f93994w));
                    }
                    break;
                case 26538890:
                    if (str.equals("RECOVERY_LOW")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(j.f93993w));
                    }
                    break;
                case 78984887:
                    if (str.equals("SLEEP")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(m.f93996w));
                    }
                    break;
                case 364990303:
                    if (str.equals("RECOVERY_MEDIUM")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(i.f93992w));
                    }
                    break;
                case 822580236:
                    if (str.equals("RECOVERY_HIGH")) {
                        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(h.f93991w));
                    }
                    break;
            }
        }
        return AbstractC18249c.m52575m(p745y81.Function1.m125323a(n.f93997w));
    }
}
