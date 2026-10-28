package yi1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.health.monitor.medical.domain.model.HeartHealthProfileIneligibleModel;
import com.whoop.health.monitor.medical.domain.model.HeartScreenerIntroModel;
import com.whoop.health.monitor.medical.domain.model.HorizontalDividerModel;
import com.whoop.health.monitor.medical.domain.model.LabradorEnabledCardModel;
import com.whoop.health.monitor.medical.domain.model.LabradorResultModel;
import com.whoop.health.monitor.medical.domain.model.NewFeatureTagModel;
import com.whoop.health.monitor.medical.domain.model.OnboardingCardModel;
import com.whoop.health.monitor.medical.domain.model.SamdCardHeaderModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdDetectionModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdMenuItemModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdReadingModel;
import com.whoop.health.monitor.medical.domain.model.ShepherdTileModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import g61.C15529b;
import g61.C15534g;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h51.C16934f;
import hy0.C17736e;
import hy0.EnumC17727b2;
import j61.C21372f;
import j61.C21373g;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kx1.C22880a;
import l83.C23454a0;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23593a5;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import rk1.AbstractC31495b;
import sk1.C32573b;
import ti1.AbstractC33852d;
import vi1.EnumC36058a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import y71.C39274g;
import yb1.C39389a;

/* JADX INFO: renamed from: yi1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "model", "Lyi1/l;", "I", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;)Lyi1/l;", "", "", "samples", "Lj71/c;", "H", "(Ljava/util/List;)Lj71/c;", "Ljb1/a;", "a", "Ljb1/a;", "labradorCardReducer", "b", "shepherdTileReducer", "c", "healthHealthReducer", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39572f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f170270a = AbstractC21537c.m60554d(new C39389a(11));

    /* JADX INFO: renamed from: b */
    private static final C21535a f170271b = AbstractC21537c.m60554d(new C39389a(20));

    /* JADX INFO: renamed from: c */
    private static final C21535a f170272c = AbstractC21537c.m60554d(new C39389a(21));

    /* JADX INFO: renamed from: yi1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, InterfaceC38321a.a.f164208a, null, null, null, null, null, false, false, null, null, null, null, false, 8190, null);
        }
    }

    /* JADX INFO: renamed from: yi1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C39577k c39577k = (C39577k) it;
            return C39577k.m126446b(c39577k, null, null, null, C11474i.m30808f(c39577k.getCta(), null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null, null, 469761919, null), 7, null);
        }
    }

    /* JADX INFO: renamed from: yi1.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170273w;

        public c(Function1 function1) {
            this.f170273w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170273w.invoke((HeartHealthProfileIneligibleModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170274w;

        public d(Function1 function1) {
            this.f170274w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170274w.invoke((OnboardingCardModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170275w;

        public e(Function1 function1) {
            this.f170275w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170275w.invoke((ShepherdDetectionModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170276w;

        public f(Function1 function1) {
            this.f170276w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170276w.invoke((LabradorEnabledCardModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170277w;

        public g(Function1 function1) {
            this.f170277w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170277w.invoke((HorizontalDividerModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170278w;

        public h(Function1 function1) {
            this.f170278w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170278w.invoke((HeartScreenerIntroModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170279w;

        public i(Function1 function1) {
            this.f170279w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170279w.invoke((NewFeatureTagModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170280w;

        public j(Function1 function1) {
            this.f170280w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170280w.invoke((ShepherdMenuItemModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C11474i c11474i = (C11474i) it;
            return new C11474i(C39583q.f170322a, null, null, c11474i.getTitle(), null, null, new C39274g(C38072d.f163053a.m121951d().getAction().getAdd(), null, 2, 0 == true ? 1 : 0), null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, c11474i.getNavigationAction(), 268435254, null);
        }
    }

    /* JADX INFO: renamed from: yi1.f$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170281w;

        public l(Function1 function1) {
            this.f170281w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170281w.invoke((LabradorResultModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170282w;

        public m(Function1 function1) {
            this.f170282w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170282w.invoke((ShepherdMenuItemModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170283w;

        public n(Function1 function1) {
            this.f170283w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170283w.invoke((ShepherdTileModel) it);
        }
    }

    /* JADX INFO: renamed from: yi1.f$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f170284w;

        public o(Function1 function1) {
            this.f170284w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f170284w.invoke((ShepherdMenuItemModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C39573g m126380A(HeartScreenerIntroModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39573g(m126388I(model.getHeader()), AbstractC8693b.m21278l(model.getBody()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C39576j m126381B(NewFeatureTagModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39576j(AbstractC8693b.m21278l(model.getTitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C39581o m126382C(ShepherdMenuItemModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(model.getSubtitle());
        String leftIcon = model.getLeftIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.SHEPHERD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            enumC16313m2 = enumC16313m0;
        }
        int whoopIcon = enumC16313m2.toWhoopIcon();
        String rightIcon = model.getRightIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        while (true) {
            if (i13 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), rightIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m1 != null) {
            enumC16313m3 = enumC16313m1;
        }
        int whoopIcon2 = enumC16313m3.toWhoopIcon();
        C9598e destination = model.getDestination();
        return new C39581o(title, c8691eM21279m, whoopIcon, whoopIcon2, !AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w) ? destination : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m126383D(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11474i.class), new k());
        designItemReducer.m60547b(new C39389a(22));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m126384E(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C39389a c39389a = new C39389a(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LabradorResultModel.class), new l(c39389a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShepherdMenuItemModel.class), new m(new C39389a(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C39575i m126385F(LabradorResultModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        EnumC17727b2 trendType = model.getTrendType();
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
        C9598e destination = model.getDestination();
        List<Double> samples = model.getSamples();
        C21395c c21395cM126387H = samples != null ? m126387H(samples) : null;
        List<ShepherdReadingModel> readings = model.getReadings();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(readings, 10));
        for (ShepherdReadingModel shepherdReadingModel : readings) {
            arrayList.add(new C32573b(shepherdReadingModel.getTitle(), shepherdReadingModel.getTrendType()));
        }
        return new C39575i(title, subtitle, trendType, enumC16313m2, destination, c21395cM126387H, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C39581o m126386G(ShepherdMenuItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(model.getSubtitle());
        Integer numM46376a = AbstractC16315n0.m46376a(model.getLeftIcon());
        int iIntValue = numM46376a != null ? numM46376a.intValue() : C38072d.f163053a.m121951d().getHealth().getShepherd();
        Integer numM46376a2 = AbstractC16315n0.m46376a(model.getRightIcon());
        int iIntValue2 = numM46376a2 != null ? numM46376a2.intValue() : AbstractC11895b.m31981D(C38072d.f163053a);
        C9598e destination = model.getDestination();
        return new C39581o(title, c8691eM21279m, iIntValue, iIntValue2, !AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w) ? destination : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static final C21395c m126387H(List<Double> samples) {
        AbstractC22676k.m65750j(samples, "samples");
        List listM118959K = AbstractC37056f.m118959K(Float.valueOf(0.2f), Float.valueOf(0.4f), Float.valueOf(0.6f), Float.valueOf(0.8f));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            arrayList.add(new C21372f(((Number) it.next()).floatValue(), null, null, null, null, null, null, 126, null));
        }
        C15529b c15529b = null;
        C15529b c15529b2 = null;
        C15529b c15529b3 = null;
        C15529b c15529b4 = null;
        List list = null;
        C21373g c21373g = null;
        boolean z4 = false;
        boolean z13 = false;
        C15534g c15534g = null;
        long j7 = 0;
        float f13 = 0.0f;
        Object obj = null;
        return new C21395c(new C21374h(c15529b, c15529b2, c15529b3, c15529b4, new C16618c(0.025f, 0.02f, 0.02f, 0.02f), arrayList, list, c21373g, z4, z13, c15534g, j7, f13, 8143, null), AbstractC37056f.m118958J(AbstractC31495b.m97034b(samples, null, null, 6, null)), 0 == true ? 1 : 0, obj, 12, null);
    }

    /* JADX INFO: renamed from: I */
    private static final C39578l m126388I(SamdCardHeaderModel samdCardHeaderModel) {
        int whoopIcon;
        TextResource title = samdCardHeaderModel.getTitle();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(samdCardHeaderModel.getSubtitle());
        C9598e destination = samdCardHeaderModel.getDestination();
        EnumC16313m0 enumC16313m0 = null;
        if (AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w)) {
            destination = null;
        }
        String icon = samdCardHeaderModel.getIcon();
        if (icon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.EDUCATION;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            whoopIcon = enumC16313m1.toWhoopIcon();
        } else {
            whoopIcon = EnumC16313m0.EDUCATION.toWhoopIcon();
        }
        return new C39578l(title, textResourceM21278l, destination, 1, whoopIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m126389J(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39389a(23));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m126390K(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C39389a c39389a = new C39389a(18);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShepherdTileModel.class), new n(c39389a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShepherdMenuItemModel.class), new o(new C39389a(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C39582p m126391L(ShepherdTileModel model) {
        EnumC16313m0 iconImage;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        EnumC39580n enumC39580nM126461a = EnumC39580n.INSTANCE.m126461a(model.getAfibState());
        TextResource title = model.getMenuItem().getTitle();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(model.getMenuItem().getSubtitle());
        String leftIcon = model.getMenuItem().getLeftIcon();
        if (enumC39580nM126461a == null || (iconImage = enumC39580nM126461a.getIconImage()) == null) {
            iconImage = EnumC16313m0.SHEPHERD;
        }
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            iconImage = enumC16313m0;
        }
        int whoopIcon = iconImage.toWhoopIcon();
        String rightIcon = model.getMenuItem().getRightIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        while (true) {
            if (i13 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), rightIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m1 != null) {
            enumC16313m2 = enumC16313m1;
        }
        int whoopIcon2 = enumC16313m2.toWhoopIcon();
        C9598e destination = model.getMenuItem().getDestination();
        return new C39582p(new C39581o(title, c8691eM21279m, whoopIcon, whoopIcon2, !AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w) ? destination : null), enumC39580nM126461a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C39581o m126392M(ShepherdMenuItemModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(model.getSubtitle());
        String leftIcon = model.getLeftIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.SHEPHERD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i14++;
        }
        if (enumC16313m0 != null) {
            enumC16313m2 = enumC16313m0;
        }
        int whoopIcon = enumC16313m2.toWhoopIcon();
        String rightIcon = model.getRightIcon();
        EnumC16313m0 enumC16313m3 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        while (true) {
            if (i13 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i13];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), rightIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m1 != null) {
            enumC16313m3 = enumC16313m1;
        }
        int whoopIcon2 = enumC16313m3.toWhoopIcon();
        C9598e destination = model.getDestination();
        return new C39581o(title, c8691eM21279m, whoopIcon, whoopIcon2, !AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9318g6.f27632w) ? destination : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m126412t(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16934f.class), new a());
        designItemReducer.m60547b(new C22880a(designItemReducer, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m126413u(C21536b c21536b, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C39389a c39389a = new C39389a(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeartHealthProfileIneligibleModel.class), new c(c39389a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(OnboardingCardModel.class), new d(new C39389a(27)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShepherdDetectionModel.class), new e(new C39389a(12)));
        c21536b.m60546a(c22673i0.getOrCreateKotlinClass(C39577k.class), new b());
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LabradorEnabledCardModel.class), new f(new C39389a(13)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalDividerModel.class), new g(new C39389a(14)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeartScreenerIntroModel.class), new h(new C39389a(15)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NewFeatureTagModel.class), new i(new C39389a(16)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ShepherdMenuItemModel.class), new j(new C39389a(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C39567a m126414v(HeartHealthProfileIneligibleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39567a(AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getBody()), new AbstractC22403o.c(model.getIconUrl(), 0, 0, 0, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C39577k m126415w(OnboardingCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C9598e destination = model.getCta().getDestination();
        return new C39577k(AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9341j5.f27702w) ? EnumC36058a.Shepherd : EnumC36058a.Labrador, m126388I(model.getHeader()), AbstractC8693b.m21278l(model.getBody()), AbstractC23593a5.m68356d0(model.getCta()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C39579m m126416x(ShepherdDetectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39579m(m126388I(model.getHeader()), AbstractC8693b.m21279m(model.getBody()), f170271b.m60540g(model.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C39574h m126417y(LabradorEnabledCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<InterfaceC25312u> listM60540g = f170270a.m60540g(model.getItems());
        C39578l c39578lM126388I = m126388I(model.getHeader());
        if (model.getError() && AbstractC22676k.m65745e(c39578lM126388I.getRightTitle(), AbstractC8693b.m21267a())) {
            c39578lM126388I = C39578l.m126451b(c39578lM126388I, null, AbstractC8693b.m21277k(AbstractC33852d.f141770c), null, 0, 0, 29, null);
        }
        return new C39574h(c39578lM126388I, model.getError(), listM60540g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C17736e m126418z(HorizontalDividerModel model) {
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(model, "model");
        String label = model.getLabel();
        if (label == null || (textResourceM21267a = AbstractC8693b.m21278l(label)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C17736e(null, null, textResourceM21267a, 3, null);
    }
}
