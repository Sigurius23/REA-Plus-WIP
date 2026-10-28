package mj2;

import a11.C0140r;
import ca2.EnumC4363c;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.EducationDtoToModelMapperKt;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.stress.domain.model.MetaData;
import com.whoop.stress.domain.model.OnboardingDismissDialog;
import com.whoop.stress.domain.model.PendingActivityDialogue;
import com.whoop.stress.domain.model.StressDateSelector;
import com.whoop.stress.domain.model.StressTrend;
import d41.C11682h;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import gz0.AbstractC16319p0;
import h51.C16934f;
import h91.C17027b;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k51.C22204c;
import k71.C22245c0;
import kj2.C22523g;
import l83.C23454a0;
import m83.AbstractC25267u;
import nj2.AbstractC26765l;
import nj2.C26754a;
import nj2.C26756c;
import nj2.C26757d;
import nj2.C26758e;
import nj2.C26759f;
import nj2.C26767n;
import nj2.C26769p;
import nj2.C26778y;
import nj2.C26779z;
import nj2.EnumC26766m;
import no.nordicsemi.android.dfu.DfuBaseService;
import oj2.AbstractC27982c;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s01.C32048d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import v31.C35611g;
import z71.AbstractC40142a;

/* JADX INFO: renamed from: mj2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010!J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lmj2/c;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "stressGraphingCardModel", "Lnj2/p;", "e", "(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;", "Lnj2/l$e;", "domainState", "Lcom/whoop/educationModels/FeatureEducationDto;", "stressEducation", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "l", "(Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;", "Lnj2/n;", "i", "(Lnj2/l$e;)Lnj2/n;", "Lcom/whoop/design/models/items/graph/stress/StressState;", "stressState", "Ly81/e;", "j", "(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;", "", "isCalibrating", "Li91/a;", "g", "(Z)Li91/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/l;", "Lkj2/g;", "upstream", "k", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25622c {

    /* JADX INFO: renamed from: b */
    public static final int f100509b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: mj2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100511a;

        static {
            int[] iArr = new int[StressState.values().length];
            try {
                iArr[StressState.NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StressState.CALIBRATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StressState.RELAXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StressState.BALANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100511a = iArr;
        }
    }

    /* JADX INFO: renamed from: mj2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C22245c0 c22245c0 = (C22245c0) it;
            return c22245c0.m63790a((16383 & 1) != 0 ? c22245c0.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (16383 & 2) != 0 ? c22245c0.backgroundColor : null, (16383 & 4) != 0 ? c22245c0.title : null, (16383 & 8) != 0 ? c22245c0.label : null, (16383 & 16) != 0 ? c22245c0.labelColor : null, (16383 & 32) != 0 ? c22245c0.score : null, (16383 & 64) != 0 ? c22245c0.lastUpdatedText : null, (16383 & 128) != 0 ? c22245c0.graphAspectRatio : 0.0f, (16383 & 256) != 0 ? c22245c0.graphItem : null, (16383 & 512) != 0 ? c22245c0.body : null, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22245c0.isCompact : false, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22245c0.icon : null, (16383 & 4096) != 0 ? c22245c0.ctaType : null, (16383 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22245c0.subItems : null);
        }
    }

    /* JADX INFO: renamed from: mj2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f100512w = new c();

        /* JADX INFO: renamed from: a */
        public final long m75369a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75369a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f100513w = new d();

        /* JADX INFO: renamed from: a */
        public final long m75370a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75370a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f100514w = new e();

        /* JADX INFO: renamed from: a */
        public final long m75371a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75371a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f100515w = new f();

        /* JADX INFO: renamed from: a */
        public final long m75372a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75372a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f100516w = new g();

        /* JADX INFO: renamed from: a */
        public final long m75373a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75373a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f100517w = new h();

        /* JADX INFO: renamed from: a */
        public final long m75374a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75374a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.c$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100518w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25622c f100519x;

        /* JADX INFO: renamed from: mj2.c$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100520w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25622c f100521x;

            /* JADX INFO: renamed from: mj2.c$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressMonitorViewStateReducer$reduce$$inlined$map$1$2", m100430f = "StressMonitorViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41998a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100522E;

                /* JADX INFO: renamed from: F */
                Object f100523F;

                /* JADX INFO: renamed from: G */
                Object f100524G;

                /* JADX INFO: renamed from: H */
                int f100525H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100526w;

                /* JADX INFO: renamed from: x */
                int f100527x;

                /* JADX INFO: renamed from: y */
                Object f100528y;

                public C41998a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100526w = obj;
                    this.f100527x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25622c c25622c) {
                this.f100520w = interfaceC13062m;
                this.f100521x = c25622c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41998a c41998a;
                C26769p c26769pM75365l;
                if (interfaceC30057d instanceof C41998a) {
                    c41998a = (C41998a) interfaceC30057d;
                    int i13 = c41998a.f100527x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41998a.f100527x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41998a = new C41998a(interfaceC30057d);
                    }
                } else {
                    c41998a = new C41998a(interfaceC30057d);
                }
                Object obj2 = c41998a.f100526w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41998a.f100527x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100520w;
                    C22523g c22523g = (C22523g) obj;
                    AbstractC26765l abstractC26765lM65054a = c22523g.getMonitor();
                    C17027b<CalendarDateModel> c17027bM65055b = c22523g.m65055b();
                    if (AbstractC22676k.m65745e(abstractC26765lM65054a, AbstractC26765l.d.f106541a)) {
                        c26769pM75365l = new C26769p(true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194302, null);
                    } else if (abstractC26765lM65054a instanceof AbstractC26765l.a) {
                        c26769pM75365l = this.f100521x.m75359e(((AbstractC26765l.a) abstractC26765lM65054a).getStressGraphingCardModel());
                    } else if (AbstractC22676k.m65745e(abstractC26765lM65054a, AbstractC26765l.b.f106539a)) {
                        c26769pM75365l = new C26769p(false, EnumC26766m.NO_CONNECTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194301, null);
                    } else if (AbstractC22676k.m65745e(abstractC26765lM65054a, AbstractC26765l.c.f106540a)) {
                        c26769pM75365l = new C26769p(false, EnumC26766m.GENERIC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194301, null);
                    } else {
                        if (!(abstractC26765lM65054a instanceof AbstractC26765l.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC26765l.e eVar = (AbstractC26765l.e) abstractC26765lM65054a;
                        c26769pM75365l = this.f100521x.m75365l(eVar, eVar.getStressEducation(), c17027bM65055b);
                    }
                    c41998a.f100528y = null;
                    c41998a.f100522E = null;
                    c41998a.f100523F = null;
                    c41998a.f100524G = null;
                    c41998a.f100525H = 0;
                    c41998a.f100527x = 1;
                    if (interfaceC13062m.emit(c26769pM75365l, c41998a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public i(InterfaceC13058l interfaceC13058l, C25622c c25622c) {
            this.f100518w = interfaceC13058l;
            this.f100519x = c25622c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100518w.collect(new a(interfaceC13062m, this.f100519x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mj2.c$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C22245c0 c22245c0 = (C22245c0) it;
            return c22245c0.m63790a((16383 & 1) != 0 ? c22245c0.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (16383 & 2) != 0 ? c22245c0.backgroundColor : null, (16383 & 4) != 0 ? c22245c0.title : null, (16383 & 8) != 0 ? c22245c0.label : null, (16383 & 16) != 0 ? c22245c0.labelColor : null, (16383 & 32) != 0 ? c22245c0.score : null, (16383 & 64) != 0 ? c22245c0.lastUpdatedText : null, (16383 & 128) != 0 ? c22245c0.graphAspectRatio : 0.0f, (16383 & 256) != 0 ? c22245c0.graphItem : null, (16383 & 512) != 0 ? c22245c0.body : null, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22245c0.isCompact : false, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22245c0.icon : null, (16383 & 4096) != 0 ? c22245c0.ctaType : null, (16383 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22245c0.subItems : null);
        }
    }

    /* JADX INFO: renamed from: mj2.c$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 8191, null);
        }
    }

    /* JADX INFO: renamed from: mj2.c$l */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C11682h.m31135b((C11682h) it, null, null, null, null, false, 31, null);
        }
    }

    /* JADX INFO: renamed from: mj2.c$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C35611g.m112819b((C35611g) it, null, null, null, null, 15, null);
        }
    }

    /* JADX INFO: renamed from: mj2.c$n */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f100530w = new n();

        /* JADX INFO: renamed from: a */
        public final long m75379a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75379a((C39336i) obj));
        }
    }

    public C25622c(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C26769p m75359e(StressGraphingCardModel stressGraphingCardModel) {
        InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C25624e(1)).m60541h(stressGraphingCardModel);
        return new C26769p(false, null, null, null, null, null, interfaceC25312uM60541h instanceof C22245c0 ? (C22245c0) interfaceC25312uM60541h : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m75360f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22245c0.class), new b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC18247a m75361g(boolean isCalibrating) {
        return isCalibrating ? AbstractC18249c.m52574l(c.f100512w) : AbstractC40142a.m128719d();
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC18247a m75362h(boolean isCalibrating) {
        return isCalibrating ? AbstractC18249c.m52574l(d.f100513w) : AbstractC40142a.m128721f();
    }

    /* JADX INFO: renamed from: i */
    private final C26767n m75363i(AbstractC26765l.e domainState) {
        int i13 = a.f100511a[domainState.getStressState().ordinal()];
        if (i13 == 1) {
            return C26767n.INSTANCE.m79740a();
        }
        if (i13 == 2) {
            C26756c c26756cM79704k = domainState.getMeterContent();
            return new C26767n(false, false, m75361g(true), m75362h(true), AbstractC8693b.m21278l(c26756cM79704k.getStressScore()), AbstractC8693b.m21278l(c26756cM79704k.getStressText()), c26756cM79704k.getFillPercent(), p745y81.Function1.m125323a(e.f100514w), null, AbstractC8693b.m21278l(c26756cM79704k.getMeterMin()), AbstractC8693b.m21278l(c26756cM79704k.getMeterMax()), AbstractC8693b.m21278l(domainState.getLastUpdated()), null, 4355, null);
        }
        C26756c c26756cM79704k2 = domainState.getMeterContent();
        return new C26767n(false, false, null, null, AbstractC8693b.m21278l(c26756cM79704k2.getStressScore()), AbstractC8693b.m21278l(c26756cM79704k2.getStressText()), c26756cM79704k2.getFillPercent(), m75364j(domainState.getStressState()), null, AbstractC8693b.m21278l(c26756cM79704k2.getMeterMin()), AbstractC8693b.m21278l(c26756cM79704k2.getMeterMax()), AbstractC8693b.m21278l(domainState.getLastUpdated()), null, 4367, null);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC39332e m75364j(StressState stressState) {
        int i13 = a.f100511a[stressState.ordinal()];
        if (i13 != 3) {
            return i13 != 4 ? p745y81.Function1.m125323a(h.f100517w) : p745y81.Function1.m125323a(g.f100516w);
        }
        return p745y81.Function1.m125323a(f.f100515w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX INFO: renamed from: l */
    public final C26769p m75365l(AbstractC26765l.e domainState, FeatureEducationDto stressEducation, C17027b<CalendarDateModel> calendarDomainState) {
        C26767n c26767nM75363i;
        C32048d c32048d;
        C22245c0 c22245c0;
        C16934f c16934f;
        C16934f c16934f2;
        C16934f c16934f3;
        C35611g c35611g;
        C22245c0 c22245c1;
        C22245c0 c22245c2;
        C26759f c26759f;
        TextResource textResourceM21267a;
        C26778y c26778yM75396f;
        ArrayList arrayList;
        AiContextMetadata aiContextMetadata;
        TextResource textResourceM21267a2;
        TextResource textResourceM84414a = AbstractC27982c.m84414a(stressEducation);
        if (domainState.getMeterContent().getIsLoading()) {
            StressState stressStateM79715v = domainState.getStressState();
            StressState stressState = StressState.CALIBRATING;
            AbstractC18247a abstractC18247aM75361g = m75361g(stressStateM79715v == stressState);
            AbstractC18247a abstractC18247aM75362h = m75362h(domainState.getStressState() == stressState);
            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
            TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(n.f100530w);
            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
            TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
            String strM79648b = domainState.getMeterContent().getLoadingTitle();
            if (strM79648b == null || (textResourceM21267a2 = AbstractC8693b.m21278l(strM79648b)) == null) {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            }
            c26767nM75363i = new C26767n(true, false, abstractC18247aM75361g, abstractC18247aM75362h, textResourceM21267a3, textResourceM21267a4, 0.0f, interfaceC39332eM125323a, null, textResourceM21267a5, textResourceM21267a6, AbstractC8693b.m21278l(domainState.getLastUpdated()), textResourceM21267a2, 322, null);
        } else {
            c26767nM75363i = m75363i(domainState);
        }
        C26767n c26767n = c26767nM75363i;
        C26779z c26779zM79716w = domainState.getStressVow();
        C13404j c13404jM18523a = null;
        C22204c c22204c = c26779zM79716w != null ? new C22204c(Integer.valueOf(AbstractC16319p0.m46430a().getLogo().getWhoopRounded()), AbstractC8693b.m21278l(c26779zM79716w.getHeader()), AbstractC8693b.m21278l(c26779zM79716w.getText()), null, 8, null) : null;
        WhoopCoachVowModel whoopCoachVowModelM79719z = domainState.getWhoopCoachVowModel();
        if (whoopCoachVowModelM79719z != null) {
            InterfaceC25312u interfaceC25312uM60541h = this.designItemReducer.m60541h(whoopCoachVowModelM79719z);
            c32048d = interfaceC25312uM60541h instanceof C32048d ? (C32048d) interfaceC25312uM60541h : null;
        } else {
            c32048d = null;
        }
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C25624e(2));
        StressGraphingCardModel stressGraphingCardModelM79714u = domainState.getStressGraphingCardModel();
        if (stressGraphingCardModelM79714u != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = c21535aM60554d.m60541h(stressGraphingCardModelM79714u);
            c22245c0 = interfaceC25312uM60541h2 instanceof C22245c0 ? (C22245c0) interfaceC25312uM60541h2 : null;
        } else {
            c22245c0 = null;
        }
        ArticleTileCarouselModel articleTileCarouselModelM79705l = domainState.getOnboardingCarouselModel();
        if (articleTileCarouselModelM79705l != null) {
            InterfaceC25312u interfaceC25312uM60541h3 = c21535aM60554d.m60541h(articleTileCarouselModelM79705l);
            if (interfaceC25312uM60541h3 instanceof C16934f) {
                c16934f = (C16934f) interfaceC25312uM60541h3;
            } else {
                c16934f = null;
            }
        } else {
            c16934f = null;
        }
        C16934f c16934f4 = domainState.getShowStressEducation() ? c16934f : null;
        ArticleTileCarouselModel articleTileCarouselModelM79710q = domainState.getSessionsCarouselModel();
        if (articleTileCarouselModelM79710q != null) {
            InterfaceC25312u interfaceC25312uM60541h4 = c21535aM60554d.m60541h(articleTileCarouselModelM79710q);
            c16934f2 = interfaceC25312uM60541h4 instanceof C16934f ? (C16934f) interfaceC25312uM60541h4 : null;
        } else {
            c16934f2 = null;
        }
        ArticleTileCarouselModel articleTileCarouselModelM79700g = domainState.getEducationCarouselModel();
        if (articleTileCarouselModelM79700g != null) {
            InterfaceC25312u interfaceC25312uM60541h5 = c21535aM60554d.m60541h(articleTileCarouselModelM79700g);
            c16934f3 = interfaceC25312uM60541h5 instanceof C16934f ? (C16934f) interfaceC25312uM60541h5 : null;
        } else {
            c16934f3 = null;
        }
        StepperComponentModel stepperComponentModelM79709p = domainState.getProgressStepper();
        if (stepperComponentModelM79709p != null) {
            InterfaceC25312u interfaceC25312uM60541h6 = c21535aM60554d.m60541h(stepperComponentModelM79709p);
            c35611g = interfaceC25312uM60541h6 instanceof C35611g ? (C35611g) interfaceC25312uM60541h6 : null;
        } else {
            c35611g = null;
        }
        PendingActivityDialogue pendingActivityDialogueM79707n = domainState.getPendingActivityDialogue();
        C26758e c26758e = pendingActivityDialogueM79707n != null ? new C26758e(AbstractC8693b.m21278l(pendingActivityDialogueM79707n.getTitle()), AbstractC8693b.m21278l(pendingActivityDialogueM79707n.getDescription()), AbstractC8693b.m21278l(pendingActivityDialogueM79707n.getButton())) : null;
        OnboardingDismissDialog onboardingDismissDialogM79706m = domainState.getOnboardingDismissDialogue();
        C26757d c26757d = onboardingDismissDialogM79706m != null ? new C26757d(AbstractC8693b.m21278l(onboardingDismissDialogM79706m.getTitle()), AbstractC8693b.m21278l(onboardingDismissDialogM79706m.getBody()), AbstractC8693b.m21278l(onboardingDismissDialogM79706m.getButtonText()), AbstractC8693b.m21278l(onboardingDismissDialogM79706m.getDismissText())) : null;
        StressGraphingCardModel stressGraphingCardModelM79708o = domainState.getPreviousStressGraphState();
        if (stressGraphingCardModelM79708o != null) {
            InterfaceC25312u interfaceC25312uM60541h7 = c21535aM60554d.m60541h(stressGraphingCardModelM79708o);
            AbstractC22676k.m65748h(interfaceC25312uM60541h7, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graphingcard.StressGraphingCardState");
            c22245c1 = (C22245c0) interfaceC25312uM60541h7;
        } else {
            c22245c1 = null;
        }
        StressGraphingCardModel stressGraphingCardModelM79693A = domainState.getZoomedOutGraphState();
        if (stressGraphingCardModelM79693A != null) {
            InterfaceC25312u interfaceC25312uM60541h8 = c21535aM60554d.m60541h(stressGraphingCardModelM79693A);
            AbstractC22676k.m65748h(interfaceC25312uM60541h8, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graphingcard.StressGraphingCardState");
            c22245c2 = (C22245c0) interfaceC25312uM60541h8;
        } else {
            c22245c2 = null;
        }
        StressDateSelector stressDateSelectorM79698e = domainState.getDateSelector();
        if (stressDateSelectorM79698e != null) {
            boolean zM79699f = domainState.getDateSelectorLoading();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(stressDateSelectorM79698e.getDateText());
            boolean z4 = stressDateSelectorM79698e.getPreviousButtonDate() != null;
            boolean z13 = stressDateSelectorM79698e.getNextButtonDate() != null;
            String previousButtonDate = stressDateSelectorM79698e.getPreviousButtonDate();
            String str = previousButtonDate == null ? "" : previousButtonDate;
            String nextButtonDate = stressDateSelectorM79698e.getNextButtonDate();
            c26759f = new C26759f(zM79699f, textResourceM21278l, z4, z13, str, nextButtonDate == null ? "" : nextButtonDate);
        } else {
            c26759f = null;
        }
        C26754a c26754a = new C26754a(textResourceM84414a, EducationDtoToModelMapperKt.toStressEducationSections(stressEducation));
        String strM79696c = domainState.getCalibrationText();
        if (strM79696c == null || (textResourceM21267a = AbstractC8693b.m21278l(strM79696c)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        EnumC4363c enumC4363cM79697d = domainState.getConnectivityTile();
        C0140r c0140rM75354a = enumC4363cM79697d != null ? AbstractC25621b.m75354a(enumC4363cM79697d, domainState.getLastSyncTimestamp()) : null;
        StressTrend stressTrendM79717x = domainState.getTrend();
        if (stressTrendM79717x != null) {
            c26778yM75396f = AbstractC25625f.m75396f(stressTrendM79717x, calendarDomainState != null ? calendarDomainState.getSelectedDate() : null);
        } else {
            c26778yM75396f = null;
        }
        List<StressTrend> listM79718y = domainState.m79718y();
        if (listM79718y != null) {
            List<StressTrend> list = listM79718y;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC25625f.m75396f((StressTrend) it.next(), calendarDomainState != null ? calendarDomainState.getSelectedDate() : null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        MetaData metaDataM79703j = domainState.getMetadata();
        if (metaDataM79703j != null && (aiContextMetadata = metaDataM79703j.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new C26769p(false, null, c26754a, c26767n, c22204c, c32048d, c22245c0, c16934f4, c16934f2, c16934f3, textResource, c26758e, c26757d, c22245c1, c26778yM75396f, c0140rM75354a, c26759f, calendarDomainState, c22245c2, arrayList, c35611g, c13404jM18523a, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75366m(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C22245c0.class), new j());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C16934f.class), new k());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C11682h.class), new l());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C35611g.class), new m());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m75367k(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new i(upstream, this);
    }

    public /* synthetic */ C25622c(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
