package el0;

import bl0.C3369a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fl0.AbstractC14556a;
import fl0.C14557b;
import fl0.C14558c;
import gl0.AbstractC15963b;
import gl0.C15962a;
import gl0.C15965d;
import hl0.C17392a;
import hl0.C17393b;
import hl0.C17394c;
import hl0.C17397f;
import il0.AbstractC18618a;
import il0.C18619b;
import il0.C18620c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import nl0.AbstractC26802d;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.AbstractC27845h;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: el0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\b\u0012\u0004\u0012\u00020%0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b&\u0010$J#\u0010(\u001a\b\u0012\u0004\u0012\u00020'0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b(\u0010$J#\u0010*\u001a\b\u0012\u0004\u0012\u00020)0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b*\u0010$J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0 H\u0002¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b.\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010AR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010BR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010C¨\u0006D"}, m65681d2 = {"Lel0/a;", "Lod1/g;", "Lnl0/d;", "Lbl0/a;", "Lfl0/b;", "aiConversationInteractor", "Lhl0/b;", "aiFeedbackInteractor", "Lhl0/f;", "feedbackToastTimerInteractor", "Lil0/b;", "aiChatHistoryInteractor", "Lgl0/a;", "educationHubInteractor", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Lel0/e;", "hubActionMapper", "Lel0/b;", "conversationActionMapper", "Lel0/d;", "feedbackActionMapper", "Lel0/c;", "conversationHistoryActionMapper", "<init>", "(Lfl0/b;Lhl0/b;Lhl0/f;Lil0/b;Lgl0/a;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Ltr2/n;Lel0/e;Lel0/b;Lel0/d;Lel0/c;)V", "Lec3/l;", "upstream", "Lgl0/d;", "k", "(Lec3/l;)Lec3/l;", "Lil0/c;", "i", "Lfl0/c;", "j", "Lhl0/c;", "l", "", "m", "()Lec3/l;", "interact", "a", "Lfl0/b;", "b", "Lhl0/b;", "c", "Lhl0/f;", "d", "Lil0/b;", "e", "Lgl0/a;", "f", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzr2/a;", "Ltr2/n;", "Lel0/e;", "Lel0/b;", "Lel0/d;", "Lel0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13313a implements InterfaceC27844g<AbstractC26802d, C3369a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14557b aiConversationInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17393b aiFeedbackInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17397f feedbackToastTimerInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18619b aiChatHistoryInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C15962a educationHubInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final OnboardingStatusDao onboardingStatusDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C13317e hubActionMapper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C13314b conversationActionMapper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C13316d feedbackActionMapper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C13315c conversationHistoryActionMapper;

    /* JADX INFO: renamed from: el0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46047w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13313a f46048x;

        /* JADX INFO: renamed from: el0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41528a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46049w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13313a f46050x;

            /* JADX INFO: renamed from: el0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$conversationHistoryInteractor$$inlined$mapNotNull$1$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41529a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46051E;

                /* JADX INFO: renamed from: F */
                Object f46052F;

                /* JADX INFO: renamed from: G */
                Object f46053G;

                /* JADX INFO: renamed from: H */
                Object f46054H;

                /* JADX INFO: renamed from: I */
                int f46055I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46056w;

                /* JADX INFO: renamed from: x */
                int f46057x;

                /* JADX INFO: renamed from: y */
                Object f46058y;

                public C41529a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46056w = obj;
                    this.f46057x |= Integer.MIN_VALUE;
                    return C41528a.this.emit(null, this);
                }
            }

            public C41528a(InterfaceC13062m interfaceC13062m, C13313a c13313a) {
                this.f46049w = interfaceC13062m;
                this.f46050x = c13313a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41529a c41529a;
                if (interfaceC30057d instanceof C41529a) {
                    c41529a = (C41529a) interfaceC30057d;
                    int i13 = c41529a.f46057x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41529a.f46057x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41529a = new C41529a(interfaceC30057d);
                    }
                } else {
                    c41529a = new C41529a(interfaceC30057d);
                }
                Object obj2 = c41529a.f46056w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41529a.f46057x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46049w;
                    AbstractC18618a abstractC18618aM37420a = this.f46050x.conversationHistoryActionMapper.m37420a((AbstractC26802d) obj);
                    if (abstractC18618aM37420a != null) {
                        c41529a.f46058y = null;
                        c41529a.f46051E = null;
                        c41529a.f46052F = null;
                        c41529a.f46053G = null;
                        c41529a.f46054H = null;
                        c41529a.f46055I = 0;
                        c41529a.f46057x = 1;
                        if (interfaceC13062m.emit(abstractC18618aM37420a, c41529a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public a(InterfaceC13058l interfaceC13058l, C13313a c13313a) {
            this.f46047w = interfaceC13058l;
            this.f46048x = c13313a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46047w.collect(new C41528a(interfaceC13062m, this.f46048x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46060w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13313a f46061x;

        /* JADX INFO: renamed from: el0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46062w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13313a f46063x;

            /* JADX INFO: renamed from: el0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$conversationInteractor$$inlined$mapNotNull$1$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41530a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46064E;

                /* JADX INFO: renamed from: F */
                Object f46065F;

                /* JADX INFO: renamed from: G */
                Object f46066G;

                /* JADX INFO: renamed from: H */
                Object f46067H;

                /* JADX INFO: renamed from: I */
                int f46068I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46069w;

                /* JADX INFO: renamed from: x */
                int f46070x;

                /* JADX INFO: renamed from: y */
                Object f46071y;

                public C41530a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46069w = obj;
                    this.f46070x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13313a c13313a) {
                this.f46062w = interfaceC13062m;
                this.f46063x = c13313a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41530a c41530a;
                if (interfaceC30057d instanceof C41530a) {
                    c41530a = (C41530a) interfaceC30057d;
                    int i13 = c41530a.f46070x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41530a.f46070x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41530a = new C41530a(interfaceC30057d);
                    }
                } else {
                    c41530a = new C41530a(interfaceC30057d);
                }
                Object obj2 = c41530a.f46069w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41530a.f46070x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46062w;
                    AbstractC14556a abstractC14556aM37419a = this.f46063x.conversationActionMapper.m37419a((AbstractC26802d) obj);
                    if (abstractC14556aM37419a != null) {
                        c41530a.f46071y = null;
                        c41530a.f46064E = null;
                        c41530a.f46065F = null;
                        c41530a.f46066G = null;
                        c41530a.f46067H = null;
                        c41530a.f46068I = 0;
                        c41530a.f46070x = 1;
                        if (interfaceC13062m.emit(abstractC14556aM37419a, c41530a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public b(InterfaceC13058l interfaceC13058l, C13313a c13313a) {
            this.f46060w = interfaceC13058l;
            this.f46061x = c13313a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46060w.collect(new a(interfaceC13062m, this.f46061x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46073w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13313a f46074x;

        /* JADX INFO: renamed from: el0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46075w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13313a f46076x;

            /* JADX INFO: renamed from: el0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$educationHubInteractor$$inlined$mapNotNull$1$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41531a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46077E;

                /* JADX INFO: renamed from: F */
                Object f46078F;

                /* JADX INFO: renamed from: G */
                Object f46079G;

                /* JADX INFO: renamed from: H */
                Object f46080H;

                /* JADX INFO: renamed from: I */
                int f46081I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46082w;

                /* JADX INFO: renamed from: x */
                int f46083x;

                /* JADX INFO: renamed from: y */
                Object f46084y;

                public C41531a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46082w = obj;
                    this.f46083x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13313a c13313a) {
                this.f46075w = interfaceC13062m;
                this.f46076x = c13313a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41531a c41531a;
                if (interfaceC30057d instanceof C41531a) {
                    c41531a = (C41531a) interfaceC30057d;
                    int i13 = c41531a.f46083x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41531a.f46083x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41531a = new C41531a(interfaceC30057d);
                    }
                } else {
                    c41531a = new C41531a(interfaceC30057d);
                }
                Object obj2 = c41531a.f46082w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41531a.f46083x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46075w;
                    AbstractC15963b abstractC15963bM37422a = this.f46076x.hubActionMapper.m37422a((AbstractC26802d) obj);
                    if (abstractC15963bM37422a != null) {
                        c41531a.f46084y = null;
                        c41531a.f46077E = null;
                        c41531a.f46078F = null;
                        c41531a.f46079G = null;
                        c41531a.f46080H = null;
                        c41531a.f46081I = 0;
                        c41531a.f46083x = 1;
                        if (interfaceC13062m.emit(abstractC15963bM37422a, c41531a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public c(InterfaceC13058l interfaceC13058l, C13313a c13313a) {
            this.f46073w = interfaceC13058l;
            this.f46074x = c13313a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46073w.collect(new a(interfaceC13062m, this.f46074x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46086w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13313a f46087x;

        /* JADX INFO: renamed from: el0.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46088w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13313a f46089x;

            /* JADX INFO: renamed from: el0.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$feedbackInteractor$$inlined$mapNotNull$1$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41532a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46090E;

                /* JADX INFO: renamed from: F */
                Object f46091F;

                /* JADX INFO: renamed from: G */
                Object f46092G;

                /* JADX INFO: renamed from: H */
                Object f46093H;

                /* JADX INFO: renamed from: I */
                int f46094I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46095w;

                /* JADX INFO: renamed from: x */
                int f46096x;

                /* JADX INFO: renamed from: y */
                Object f46097y;

                public C41532a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46095w = obj;
                    this.f46096x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13313a c13313a) {
                this.f46088w = interfaceC13062m;
                this.f46089x = c13313a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41532a c41532a;
                if (interfaceC30057d instanceof C41532a) {
                    c41532a = (C41532a) interfaceC30057d;
                    int i13 = c41532a.f46096x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41532a.f46096x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41532a = new C41532a(interfaceC30057d);
                    }
                } else {
                    c41532a = new C41532a(interfaceC30057d);
                }
                Object obj2 = c41532a.f46095w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41532a.f46096x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46088w;
                    C17392a c17392aM37421a = this.f46089x.feedbackActionMapper.m37421a((AbstractC26802d) obj);
                    if (c17392aM37421a != null) {
                        c41532a.f46097y = null;
                        c41532a.f46090E = null;
                        c41532a.f46091F = null;
                        c41532a.f46092G = null;
                        c41532a.f46093H = null;
                        c41532a.f46094I = 0;
                        c41532a.f46096x = 1;
                        if (interfaceC13062m.emit(c17392aM37421a, c41532a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public d(InterfaceC13058l interfaceC13058l, C13313a c13313a) {
            this.f46086w = interfaceC13058l;
            this.f46087x = c13313a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46086w.collect(new a(interfaceC13062m, this.f46087x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$feedbackInteractor$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46099w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46100x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f46100x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46100x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46099w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C17394c c17394c = new C17394c(null, false, null, 7, null);
                this.f46100x = null;
                this.f46099w = 1;
                if (interfaceC13062m.emit(c17394c, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$interact$1", m100430f = "AiConversationDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, m65681d2 = {"Lfl0/c;", "conversationResult", "Lhl0/c;", "feedbackResult", "Lil0/c;", "historyResult", "", "overlayResult", "Lgl0/d;", "hubResult", "Lbl0/a;", "<anonymous>", "(Lfl0/c;Lhl0/c;Lil0/c;ZLgl0/d;)Lbl0/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4354p {

        /* JADX INFO: renamed from: E */
        /* synthetic */ boolean f46101E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f46102F;

        /* JADX INFO: renamed from: w */
        int f46103w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46104x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46105y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f46106z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(6, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m37418f(C14558c c14558c, C17394c c17394c, C18620c c18620c, boolean z4, C15965d c15965d, InterfaceC30057d<? super C3369a> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f46104x = c14558c;
            fVar.f46105y = c17394c;
            fVar.f46106z = c18620c;
            fVar.f46101E = z4;
            fVar.f46102F = c15965d;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // c93.InterfaceC4354p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return m37418f((C14558c) obj, (C17394c) obj2, (C18620c) obj3, ((Boolean) obj4).booleanValue(), (C15965d) obj5, (InterfaceC30057d) obj6);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14558c c14558c = (C14558c) this.f46104x;
            C17394c c17394c = (C17394c) this.f46105y;
            C18620c c18620c = (C18620c) this.f46106z;
            boolean z4 = this.f46101E;
            C15965d c15965d = (C15965d) this.f46102F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46103w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C3369a(c14558c, c17394c, c18620c, c15965d, z4);
        }
    }

    /* JADX INFO: renamed from: el0.a$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46107w;

        /* JADX INFO: renamed from: el0.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46108w;

            /* JADX INFO: renamed from: el0.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$overlayFlow$$inlined$map$1$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41533a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46109E;

                /* JADX INFO: renamed from: F */
                Object f46110F;

                /* JADX INFO: renamed from: G */
                Object f46111G;

                /* JADX INFO: renamed from: H */
                int f46112H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46113w;

                /* JADX INFO: renamed from: x */
                int f46114x;

                /* JADX INFO: renamed from: y */
                Object f46115y;

                public C41533a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46113w = obj;
                    this.f46114x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f46108w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41533a c41533a;
                if (interfaceC30057d instanceof C41533a) {
                    c41533a = (C41533a) interfaceC30057d;
                    int i13 = c41533a.f46114x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41533a.f46114x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41533a = new C41533a(interfaceC30057d);
                    }
                } else {
                    c41533a = new C41533a(interfaceC30057d);
                }
                Object obj2 = c41533a.f46113w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41533a.f46114x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46108w;
                    Boolean bool = (Boolean) obj;
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    c41533a.f46115y = null;
                    c41533a.f46109E = null;
                    c41533a.f46110F = null;
                    c41533a.f46111G = null;
                    c41533a.f46112H = 0;
                    c41533a.f46114x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41533a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f46107w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46107w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$overlayFlow$1", m100430f = "AiConversationDomainCombiner.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46117w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46118x;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C13313a.this.new h(interfaceC30057d);
            hVar.f46118x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46118x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46117w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!C13313a.this.featureFlagChecker.isFeatureEnabled("whoop-coach-weather-gps-android")) {
                    Boolean bool = Boolean.FALSE;
                    this.f46118x = null;
                    this.f46117w = 1;
                    if (interfaceC13062m.emit(bool, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: el0.a$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$overlayFlow$2", m100430f = "AiConversationDomainCombiner.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46120w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46121x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46122y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = C13313a.this.new i(interfaceC30057d);
            iVar.f46121x = interfaceC13062m;
            iVar.f46122y = th3;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46121x;
            Throwable th3 = (Throwable) this.f46122y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46120w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13313a.this.logger.mo85230v("Couldn't check the local completion state for COACH_ONBOARDING", th3, new AbstractC30556a.a[0]);
                Boolean bool = Boolean.FALSE;
                this.f46121x = null;
                this.f46122y = null;
                this.f46120w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C13313a(C14557b aiConversationInteractor, C17393b aiFeedbackInteractor, C17397f feedbackToastTimerInteractor, C18619b aiChatHistoryInteractor, C15962a educationHubInteractor, OnboardingStatusDao onboardingStatusDao, FeatureFlagChecker featureFlagChecker, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, C13317e hubActionMapper, C13314b conversationActionMapper, C13316d feedbackActionMapper, C13315c conversationHistoryActionMapper) {
        AbstractC22676k.m65750j(aiConversationInteractor, "aiConversationInteractor");
        AbstractC22676k.m65750j(aiFeedbackInteractor, "aiFeedbackInteractor");
        AbstractC22676k.m65750j(feedbackToastTimerInteractor, "feedbackToastTimerInteractor");
        AbstractC22676k.m65750j(aiChatHistoryInteractor, "aiChatHistoryInteractor");
        AbstractC22676k.m65750j(educationHubInteractor, "educationHubInteractor");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(hubActionMapper, "hubActionMapper");
        AbstractC22676k.m65750j(conversationActionMapper, "conversationActionMapper");
        AbstractC22676k.m65750j(feedbackActionMapper, "feedbackActionMapper");
        AbstractC22676k.m65750j(conversationHistoryActionMapper, "conversationHistoryActionMapper");
        this.aiConversationInteractor = aiConversationInteractor;
        this.aiFeedbackInteractor = aiFeedbackInteractor;
        this.feedbackToastTimerInteractor = feedbackToastTimerInteractor;
        this.aiChatHistoryInteractor = aiChatHistoryInteractor;
        this.educationHubInteractor = educationHubInteractor;
        this.onboardingStatusDao = onboardingStatusDao;
        this.featureFlagChecker = featureFlagChecker;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.hubActionMapper = hubActionMapper;
        this.conversationActionMapper = conversationActionMapper;
        this.feedbackActionMapper = feedbackActionMapper;
        this.conversationHistoryActionMapper = conversationHistoryActionMapper;
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m37413i(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new a(upstream, this), this.aiChatHistoryInteractor);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m37414j(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new b(upstream, this), this.aiConversationInteractor);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m37415k(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new c(upstream, this), this.educationHubInteractor);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m37416l(InterfaceC13058l upstream) {
        return new C13015a0(new e(null), AbstractC27845h.m83945a(AbstractC27845h.m83945a(new d(upstream, this), this.aiFeedbackInteractor), this.feedbackToastTimerInteractor));
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC13058l m37417m() {
        return new g(new C13015a0(new C13015a0(new h(null), this.onboardingStatusDao.isCompletedFlow(FeatureEducationType.COACH_ONBOARDING)), new i(null)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13052j1(new InterfaceC13058l[]{m37414j(upstream), m37416l(upstream), m37413i(upstream), m37417m(), m37415k(upstream)}, new f(null), 2);
    }

    public /* synthetic */ C13313a(C14557b c14557b, C17393b c17393b, C17397f c17397f, C18619b c18619b, C15962a c15962a, OnboardingStatusDao onboardingStatusDao, FeatureFlagChecker featureFlagChecker, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, C13317e c13317e, C13314b c13314b, C13316d c13316d, C13315c c13315c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC41070a interfaceC41070a2;
        C13314b c13314b2;
        C13317e c13317e2 = (i13 & 512) != 0 ? new C13317e() : c13317e;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            interfaceC41070a2 = interfaceC41070a;
            c13314b2 = new C13314b(interfaceC41070a2);
        } else {
            interfaceC41070a2 = interfaceC41070a;
            c13314b2 = c13314b;
        }
        this(c14557b, c17393b, c17397f, c18619b, c15962a, onboardingStatusDao, featureFlagChecker, interfaceC41070a2, interfaceC34116n, c13317e2, c13314b2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C13316d() : c13316d, (i13 & 4096) != 0 ? new C13315c() : c13315c);
    }
}
