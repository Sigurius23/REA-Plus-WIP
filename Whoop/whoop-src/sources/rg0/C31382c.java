package rg0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import nl0.EnumC26811m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zg0.C40626i;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: rg0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010/\u001a\u00020(2\u0006\u0010,\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lrg0/c;", "", "Lec3/l;", "Lzg0/i;", "viewState", "Lrg0/b;", "analyticsHelper", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "<init>", "(Lec3/l;Lrg0/b;Lzr2/a;Ltr2/n;)V", "Lbc3/c0;", "scope", "", "fireEntryEvent", "Ll83/a0;", "k", "(Lbc3/c0;Z)V", "l", "()V", "j", "a", "Lec3/l;", "b", "Lrg0/b;", "c", "Lzr2/a;", "d", "Ltr2/n;", "", "e", "Ljava/lang/Long;", "lastMessageSentTimestamp", "f", "Z", "isWaitingForResponse", "g", "trackingStartTimestamp", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "lastFailureType", "value", "i", "()Ljava/lang/String;", "currentFingerprint", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31382c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Long lastMessageSentTimestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isWaitingForResponse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Long trackingStartTimestamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String lastFailureType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String currentFingerprint;

    /* JADX INFO: renamed from: rg0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.analytics.AiChatAnalyticsTracker$startTracking$1", m100430f = "AiChatAnalyticsTracker.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129146w;

        /* JADX INFO: renamed from: rg0.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42258a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31382c f129148w;

            /* JADX INFO: renamed from: rg0.c$a$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* synthetic */ class C42259a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f129149a;

                static {
                    int[] iArr = new int[EnumC26811m.values().length];
                    try {
                        iArr[EnumC26811m.MESSAGE_LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC26811m.MESSAGE_ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC26811m.MESSAGE_FLAGGED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC26811m.NONE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC26811m.SCREEN_ERROR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[EnumC26811m.FEATURE_UNAVAILABLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[EnumC26811m.SCREEN_LOADING.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    f129149a = iArr;
                }
            }

            public C42258a(C31382c c31382c) {
                this.f129148w = c31382c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC26811m enumC26811m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                switch (C42259a.f129149a[enumC26811m.ordinal()]) {
                    case 1:
                        C31382c c31382c = this.f129148w;
                        c31382c.lastMessageSentTimestamp = new Long(c31382c.dateAndTimeProvider.mo133363b());
                        this.f129148w.isWaitingForResponse = true;
                        this.f129148w.logger.mo85228t("Message sent, waiting for response", new AbstractC30556a.a[0]);
                        break;
                    case 2:
                        this.f129148w.isWaitingForResponse = false;
                        this.f129148w.lastMessageSentTimestamp = null;
                        this.f129148w.lastFailureType = "retryable";
                        this.f129148w.analyticsHelper.m96620a(new AbstractC31380a.d0(this.f129148w.getCurrentFingerprint()));
                        this.f129148w.logger.mo85228t("Response error occurred", new AbstractC30556a.a[0]);
                        break;
                    case 3:
                        this.f129148w.isWaitingForResponse = false;
                        this.f129148w.lastMessageSentTimestamp = null;
                        this.f129148w.lastFailureType = "flagged";
                        this.f129148w.analyticsHelper.m96620a(new AbstractC31380a.d0(this.f129148w.getCurrentFingerprint()));
                        this.f129148w.logger.mo85228t("Message flagged, retry view shown", new AbstractC30556a.a[0]);
                        break;
                    case 4:
                        this.f129148w.isWaitingForResponse = false;
                        this.f129148w.lastMessageSentTimestamp = null;
                        this.f129148w.logger.mo85228t("Response received or error occurred", new AbstractC30556a.a[0]);
                        break;
                    case 5:
                        this.f129148w.isWaitingForResponse = false;
                        this.f129148w.lastMessageSentTimestamp = null;
                        this.f129148w.lastFailureType = "terminal";
                        this.f129148w.analyticsHelper.m96620a(new AbstractC31380a.d0(this.f129148w.getCurrentFingerprint()));
                        this.f129148w.logger.mo85228t("Terminal error occurred", new AbstractC30556a.a[0]);
                        break;
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: rg0.c$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f129150w;

            /* JADX INFO: renamed from: rg0.c$a$b$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42260a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f129151w;

                /* JADX INFO: renamed from: rg0.c$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ai.chat.analytics.AiChatAnalyticsTracker$startTracking$1$invokeSuspend$$inlined$map$1$2", m100430f = "AiChatAnalyticsTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42261a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f129152E;

                    /* JADX INFO: renamed from: F */
                    Object f129153F;

                    /* JADX INFO: renamed from: G */
                    Object f129154G;

                    /* JADX INFO: renamed from: H */
                    int f129155H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f129156w;

                    /* JADX INFO: renamed from: x */
                    int f129157x;

                    /* JADX INFO: renamed from: y */
                    Object f129158y;

                    public C42261a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f129156w = obj;
                        this.f129157x |= Integer.MIN_VALUE;
                        return C42260a.this.emit(null, this);
                    }
                }

                public C42260a(InterfaceC13062m interfaceC13062m) {
                    this.f129151w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42261a c42261a;
                    if (interfaceC30057d instanceof C42261a) {
                        c42261a = (C42261a) interfaceC30057d;
                        int i13 = c42261a.f129157x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42261a.f129157x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42261a = new C42261a(interfaceC30057d);
                        }
                    } else {
                        c42261a = new C42261a(interfaceC30057d);
                    }
                    Object obj2 = c42261a.f129156w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42261a.f129157x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f129151w;
                        EnumC26811m loadingState = ((C40626i) obj).getLoadingState();
                        c42261a.f129158y = null;
                        c42261a.f129152E = null;
                        c42261a.f129153F = null;
                        c42261a.f129154G = null;
                        c42261a.f129155H = 0;
                        c42261a.f129157x = 1;
                        if (interfaceC13062m.emit(loadingState, c42261a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f129150w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f129150w.collect(new C42260a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31382c.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129146w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new b(C31382c.this.viewState));
                C42258a c42258a = new C42258a(C31382c.this);
                this.f129146w = 1;
                if (interfaceC13058lM36610t.collect(c42258a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rg0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.analytics.AiChatAnalyticsTracker$startTracking$2", m100430f = "AiChatAnalyticsTracker.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129160w;

        /* JADX INFO: renamed from: rg0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31382c f129162w;

            public a(C31382c c31382c) {
                this.f129162w = c31382c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f129162w.currentFingerprint = str;
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: rg0.c$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42262b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f129163w;

            /* JADX INFO: renamed from: rg0.c$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f129164w;

                /* JADX INFO: renamed from: rg0.c$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ai.chat.analytics.AiChatAnalyticsTracker$startTracking$2$invokeSuspend$$inlined$map$1$2", m100430f = "AiChatAnalyticsTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42263a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f129165E;

                    /* JADX INFO: renamed from: F */
                    Object f129166F;

                    /* JADX INFO: renamed from: G */
                    Object f129167G;

                    /* JADX INFO: renamed from: H */
                    int f129168H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f129169w;

                    /* JADX INFO: renamed from: x */
                    int f129170x;

                    /* JADX INFO: renamed from: y */
                    Object f129171y;

                    public C42263a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f129169w = obj;
                        this.f129170x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f129164w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42263a c42263a;
                    if (interfaceC30057d instanceof C42263a) {
                        c42263a = (C42263a) interfaceC30057d;
                        int i13 = c42263a.f129170x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42263a.f129170x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42263a = new C42263a(interfaceC30057d);
                        }
                    } else {
                        c42263a = new C42263a(interfaceC30057d);
                    }
                    Object obj2 = c42263a.f129169w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42263a.f129170x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f129164w;
                        String fingerprint = ((C40626i) obj).getConversation().getFingerprint();
                        c42263a.f129171y = null;
                        c42263a.f129165E = null;
                        c42263a.f129166F = null;
                        c42263a.f129167G = null;
                        c42263a.f129168H = 0;
                        c42263a.f129170x = 1;
                        if (interfaceC13062m.emit(fingerprint, c42263a) == enumC31071a) {
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

            public C42262b(InterfaceC13058l interfaceC13058l) {
                this.f129163w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f129163w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31382c.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129160w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new C42262b(C31382c.this.viewState));
                a aVar = new a(C31382c.this);
                this.f129160w = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    public C31382c(InterfaceC13058l viewState, C31381b analyticsHelper, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.viewState = viewState;
        this.analyticsHelper = analyticsHelper;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.currentFingerprint = "";
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCurrentFingerprint() {
        return this.currentFingerprint;
    }

    /* JADX INFO: renamed from: j */
    public final void m96632j() {
        Long l7;
        this.analyticsHelper.m96620a(new AbstractC31380a.j(this.currentFingerprint, this.lastFailureType));
        if (this.isWaitingForResponse && (l7 = this.lastMessageSentTimestamp) != null) {
            long jMo133363b = this.dateAndTimeProvider.mo133363b() - l7.longValue();
            this.analyticsHelper.m96620a(new AbstractC31380a.k(this.currentFingerprint, jMo133363b));
            this.logger.mo85216g(AbstractC31061c.m95636l(jMo133363b, "User exited while waiting for response. Time waited: ", " ms"), new AbstractC30556a.a[0]);
        }
        Long l12 = this.trackingStartTimestamp;
        if (l12 != null) {
            this.analyticsHelper.m96620a(new AbstractC31380a.e(this.currentFingerprint, this.dateAndTimeProvider.mo133363b() - l12.longValue()));
        }
        this.lastMessageSentTimestamp = null;
        this.isWaitingForResponse = false;
        this.lastFailureType = null;
        this.trackingStartTimestamp = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m96633k(InterfaceC2994c0 scope, boolean fireEntryEvent) {
        AbstractC22676k.m65750j(scope, "scope");
        this.trackingStartTimestamp = Long.valueOf(this.dateAndTimeProvider.mo133363b());
        if (fireEntryEvent) {
            this.analyticsHelper.m96620a(AbstractC31380a.a0.f129043a);
        }
        AbstractC3006f0.m8732z(scope, null, null, new a(null), 3);
        AbstractC3006f0.m8732z(scope, null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m96634l() {
        this.analyticsHelper.m96620a(AbstractC31380a.a0.f129043a);
    }

    public /* synthetic */ C31382c(InterfaceC13058l interfaceC13058l, C31381b c31381b, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13058l, c31381b, interfaceC41070a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiConversationAnalyticsTracker") : interfaceC34116n);
    }
}
