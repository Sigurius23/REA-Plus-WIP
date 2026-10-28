package xk0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25265s;
import nl0.C26799a;
import nl0.C26801c;
import nl0.C26804f;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
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
import yb3.AbstractC39414r;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: xk0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lxk0/b;", "", "Lec3/l;", "Lnl0/f;", "viewState", "Lxk0/a;", "analyticsHelper", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "<init>", "(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;)V", "Lbc3/c0;", "scope", "Ll83/a0;", "i", "(Lbc3/c0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "a", "Lec3/l;", "b", "Lxk0/a;", "c", "Lzr2/a;", "d", "Ltr2/n;", "", "e", "Ljava/lang/Long;", "lastMessageSentTimestamp", "", "f", "Z", "isWaitingForResponse", "", "g", "Ljava/lang/String;", "currentConversationId", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38424b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Long lastMessageSentTimestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isWaitingForResponse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String currentConversationId;

    /* JADX INFO: renamed from: xk0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$1", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164529w;

        /* JADX INFO: renamed from: xk0.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42651a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C38424b f164531w;

            /* JADX INFO: renamed from: xk0.b$a$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* synthetic */ class C42652a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f164532a;

                static {
                    int[] iArr = new int[EnumC26811m.values().length];
                    try {
                        iArr[EnumC26811m.MESSAGE_LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC26811m.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC26811m.MESSAGE_ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC26811m.MESSAGE_FLAGGED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f164532a = iArr;
                }
            }

            public C42651a(C38424b c38424b) {
                this.f164531w = c38424b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC26811m enumC26811m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                int i13 = C42652a.f164532a[enumC26811m.ordinal()];
                if (i13 == 1) {
                    C38424b c38424b = this.f164531w;
                    c38424b.lastMessageSentTimestamp = new Long(c38424b.dateAndTimeProvider.mo133363b());
                    this.f164531w.isWaitingForResponse = true;
                    this.f164531w.logger.mo85228t("Message sent, waiting for response", new AbstractC30556a.a[0]);
                } else if (i13 == 2 || i13 == 3 || i13 == 4) {
                    this.f164531w.isWaitingForResponse = false;
                    this.f164531w.lastMessageSentTimestamp = null;
                    this.f164531w.logger.mo85228t("Response received or error occurred", new AbstractC30556a.a[0]);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: xk0.b$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f164533w;

            /* JADX INFO: renamed from: xk0.b$a$b$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42653a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f164534w;

                /* JADX INFO: renamed from: xk0.b$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$1$invokeSuspend$$inlined$map$1$2", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42654a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f164535E;

                    /* JADX INFO: renamed from: F */
                    Object f164536F;

                    /* JADX INFO: renamed from: G */
                    Object f164537G;

                    /* JADX INFO: renamed from: H */
                    int f164538H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f164539w;

                    /* JADX INFO: renamed from: x */
                    int f164540x;

                    /* JADX INFO: renamed from: y */
                    Object f164541y;

                    public C42654a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f164539w = obj;
                        this.f164540x |= Integer.MIN_VALUE;
                        return C42653a.this.emit(null, this);
                    }
                }

                public C42653a(InterfaceC13062m interfaceC13062m) {
                    this.f164534w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42654a c42654a;
                    if (interfaceC30057d instanceof C42654a) {
                        c42654a = (C42654a) interfaceC30057d;
                        int i13 = c42654a.f164540x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42654a.f164540x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42654a = new C42654a(interfaceC30057d);
                        }
                    } else {
                        c42654a = new C42654a(interfaceC30057d);
                    }
                    Object obj2 = c42654a.f164539w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42654a.f164540x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f164534w;
                        EnumC26811m loadingState = ((C26804f) obj).getLoadingState();
                        c42654a.f164541y = null;
                        c42654a.f164535E = null;
                        c42654a.f164536F = null;
                        c42654a.f164537G = null;
                        c42654a.f164538H = 0;
                        c42654a.f164540x = 1;
                        if (interfaceC13062m.emit(loadingState, c42654a) == enumC31071a) {
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
                this.f164533w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f164533w.collect(new C42653a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38424b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164529w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new b(C38424b.this.viewState));
                C42651a c42651a = new C42651a(C38424b.this);
                this.f164529w = 1;
                if (interfaceC13058lM36610t.collect(c42651a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: xk0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$2", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164543w;

        /* JADX INFO: renamed from: xk0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C38424b f164545w;

            public a(C38424b c38424b) {
                this.f164545w = c38424b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C26799a c26799a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C26801c c26801c = (C26801c) AbstractC25265s.m74114R0(c26799a.m79883f());
                if (c26801c != null) {
                    C38424b c38424b = this.f164545w;
                    if (c26801c.getIsComplete() && c26801c.getRole() == EnumC26800b.ASSISTANT && AbstractC39414r.m125890i0(c26801c.getContent())) {
                        c38424b.analyticsHelper.m123069g(c26799a.getId(), c26801c.getId());
                    }
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: xk0.b$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42655b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f164546w;

            /* JADX INFO: renamed from: xk0.b$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f164547w;

                /* JADX INFO: renamed from: xk0.b$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$2$invokeSuspend$$inlined$map$1$2", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42656a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f164548E;

                    /* JADX INFO: renamed from: F */
                    Object f164549F;

                    /* JADX INFO: renamed from: G */
                    Object f164550G;

                    /* JADX INFO: renamed from: H */
                    int f164551H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f164552w;

                    /* JADX INFO: renamed from: x */
                    int f164553x;

                    /* JADX INFO: renamed from: y */
                    Object f164554y;

                    public C42656a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f164552w = obj;
                        this.f164553x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f164547w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42656a c42656a;
                    if (interfaceC30057d instanceof C42656a) {
                        c42656a = (C42656a) interfaceC30057d;
                        int i13 = c42656a.f164553x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42656a.f164553x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42656a = new C42656a(interfaceC30057d);
                        }
                    } else {
                        c42656a = new C42656a(interfaceC30057d);
                    }
                    Object obj2 = c42656a.f164552w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42656a.f164553x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f164547w;
                        C26799a conversation = ((C26804f) obj).getConversation();
                        c42656a.f164554y = null;
                        c42656a.f164548E = null;
                        c42656a.f164549F = null;
                        c42656a.f164550G = null;
                        c42656a.f164551H = 0;
                        c42656a.f164553x = 1;
                        if (interfaceC13062m.emit(conversation, c42656a) == enumC31071a) {
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

            public C42655b(InterfaceC13058l interfaceC13058l) {
                this.f164546w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f164546w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38424b.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164543w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new C42655b(C38424b.this.viewState));
                a aVar = new a(C38424b.this);
                this.f164543w = 1;
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

    /* JADX INFO: renamed from: xk0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$3", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164556w;

        /* JADX INFO: renamed from: xk0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C38424b f164558w;

            public a(C38424b c38424b) {
                this.f164558w = c38424b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f164558w.currentConversationId = str;
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: xk0.b$c$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f164559w;

            /* JADX INFO: renamed from: xk0.b$c$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f164560w;

                /* JADX INFO: renamed from: xk0.b$c$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.analytics.AiConversationAnalyticsTracker$startTracking$3$invokeSuspend$$inlined$map$1$2", m100430f = "AiConversationAnalyticsTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42657a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f164561E;

                    /* JADX INFO: renamed from: F */
                    Object f164562F;

                    /* JADX INFO: renamed from: G */
                    Object f164563G;

                    /* JADX INFO: renamed from: H */
                    int f164564H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f164565w;

                    /* JADX INFO: renamed from: x */
                    int f164566x;

                    /* JADX INFO: renamed from: y */
                    Object f164567y;

                    public C42657a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f164565w = obj;
                        this.f164566x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f164560w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42657a c42657a;
                    if (interfaceC30057d instanceof C42657a) {
                        c42657a = (C42657a) interfaceC30057d;
                        int i13 = c42657a.f164566x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42657a.f164566x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42657a = new C42657a(interfaceC30057d);
                        }
                    } else {
                        c42657a = new C42657a(interfaceC30057d);
                    }
                    Object obj2 = c42657a.f164565w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42657a.f164566x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f164560w;
                        String id4 = ((C26804f) obj).getConversation().getId();
                        c42657a.f164567y = null;
                        c42657a.f164561E = null;
                        c42657a.f164562F = null;
                        c42657a.f164563G = null;
                        c42657a.f164564H = 0;
                        c42657a.f164566x = 1;
                        if (interfaceC13062m.emit(id4, c42657a) == enumC31071a) {
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
                this.f164559w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f164559w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38424b.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164556w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new b(C38424b.this.viewState));
                a aVar = new a(C38424b.this);
                this.f164556w = 1;
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

    public C38424b(InterfaceC13058l viewState, C38423a analyticsHelper, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.viewState = viewState;
        this.analyticsHelper = analyticsHelper;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.currentConversationId = "";
    }

    /* JADX INFO: renamed from: h */
    public final void m123095h() {
        Long l7;
        this.analyticsHelper.m123071i(this.currentConversationId);
        if (this.isWaitingForResponse && (l7 = this.lastMessageSentTimestamp) != null) {
            long jMo133363b = this.dateAndTimeProvider.mo133363b() - l7.longValue();
            this.analyticsHelper.m123052G(this.currentConversationId, jMo133363b);
            this.logger.mo85216g(AbstractC31061c.m95636l(jMo133363b, "User exited while waiting for response. Time waited: ", " ms"), new AbstractC30556a.a[0]);
        }
        this.lastMessageSentTimestamp = null;
        this.isWaitingForResponse = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m123096i(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC3006f0.m8732z(scope, null, null, new a(null), 3);
        AbstractC3006f0.m8732z(scope, null, null, new b(null), 3);
        AbstractC3006f0.m8732z(scope, null, null, new c(null), 3);
    }

    public /* synthetic */ C38424b(InterfaceC13058l interfaceC13058l, C38423a c38423a, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13058l, c38423a, interfaceC41070a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiConversationAnalyticsTracker") : interfaceC34116n);
    }
}
