package dl0;

import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.bot.domain.chatminiarchwidget.GetMiniArchWidgetRequest;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UnknownDesignModel;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import iy1.InterfaceC21030c;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import l83.C23465k;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dl0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Ldl0/d;", "Lod1/g;", "Ldl0/b;", "Ldl0/c;", "Lnm0/e;", "cachedApiSource", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Liy1/c;Ltr2/n;)V", "La12/a;", "parsedPath", "Lec3/l;", "i", "(La12/a;)Lec3/l;", "parsed", "m", "(La12/a;)Ldl0/c;", "Ldl0/e$b;", "reason", "Ll83/a0;", "l", "(La12/a;Ldl0/e$b;)V", "j", "", "httpStatusCode", "k", "(I)Ldl0/e$b;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Liy1/c;", "c", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12165d implements InterfaceC27844g<AbstractC12163b, C12164c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dl0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.chatminiarchwidget.ChatMiniArchWidgetInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "ChatMiniArchWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f40436w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f40437x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f40438y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f40439z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f40439z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f40439z);
            aVar.f40437x = interfaceC13062m;
            aVar.f40438y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f40436w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f40437x;
                C26832c c26832c = (C26832c) this.f40438y;
                InterfaceC26834e interfaceC26834e = this.f40439z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DesignSystemModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f40437x = null;
                this.f40438y = null;
                this.f40436w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dl0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f40440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12165d f40441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0141a f40442y;

        /* JADX INFO: renamed from: dl0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f40443w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12165d f40444x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C0141a f40445y;

            /* JADX INFO: renamed from: dl0.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.chatminiarchwidget.ChatMiniArchWidgetInteractor$fetchData$$inlined$mapNotNull$1$2", m100430f = "ChatMiniArchWidgetInteractor.kt", m100431l = {81}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41476a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f40446E;

                /* JADX INFO: renamed from: F */
                Object f40447F;

                /* JADX INFO: renamed from: G */
                Object f40448G;

                /* JADX INFO: renamed from: H */
                Object f40449H;

                /* JADX INFO: renamed from: I */
                int f40450I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f40451w;

                /* JADX INFO: renamed from: x */
                int f40452x;

                /* JADX INFO: renamed from: y */
                Object f40453y;

                public C41476a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f40451w = obj;
                    this.f40452x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12165d c12165d, C0141a c0141a) {
                this.f40443w = interfaceC13062m;
                this.f40444x = c12165d;
                this.f40445y = c0141a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41476a c41476a;
                C12164c c12164c;
                C12164c c12164c2;
                if (interfaceC30057d instanceof C41476a) {
                    c41476a = (C41476a) interfaceC30057d;
                    int i13 = c41476a.f40452x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41476a.f40452x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41476a = new C41476a(interfaceC30057d);
                    }
                } else {
                    c41476a = new C41476a(interfaceC30057d);
                }
                Object obj2 = c41476a.f40451w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41476a.f40452x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f40443w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c12164c = null;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        if (c42173a.getData() instanceof UnknownDesignModel) {
                            this.f40444x.m33638l(this.f40445y, C12166e.b.UNSUPPORTED);
                            c12164c = this.f40444x.m33639m(this.f40445y);
                        } else {
                            this.f40444x.metricWriter.mo58701b(C12166e.f40463a.m33646g(this.f40445y.getBasePath()));
                            c12164c2 = new C12164c(null, (DesignSystemModel) c42173a.getData(), 1, null);
                            c12164c = c12164c2;
                        }
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                        if (bVar.getData() instanceof UnknownDesignModel) {
                            c12164c = this.f40444x.m33639m(this.f40445y);
                        } else {
                            c12164c2 = new C12164c(null, (DesignSystemModel) bVar.getData(), 1, null);
                            c12164c = c12164c2;
                        }
                    } else if (interfaceC29354a instanceof InterfaceC29354a.c) {
                        C12165d c12165d = this.f40444x;
                        InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                        c12165d.m33638l(this.f40445y, c12165d.m33637k(cVar.getHttpStatusCode()));
                        if (cVar.getHttpStatusCode() != 0) {
                            InterfaceC34116n interfaceC34116n = this.f40444x.logger;
                            int httpStatusCode = cVar.getHttpStatusCode();
                            String strM355c = this.f40445y.getPath();
                            String errorMessage = cVar.getErrorMessage();
                            StringBuilder sbM53373n = AbstractC18489d0.m53373n(httpStatusCode, "Fetch failed with HTTP ", ". Path: ", strM355c, ". ");
                            sbM53373n.append(errorMessage);
                            interfaceC34116n.mo85214e("CMAW", sbM53373n.toString(), new AbstractC30556a.a[0]);
                            c12164c = new C12164c(new InterfaceC12162a.d(this.f40445y.getPath()), null, 2, null);
                        } else {
                            this.f40444x.logger.mo85214e("CMAW", AbstractC31061c.m95640p("Fetch failed with network error (no data). Path: ", this.f40445y.getPath(), ". ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                            c12164c = new C12164c(InterfaceC12162a.c.f40428a, null, 2, null);
                        }
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C12165d c12165d2 = this.f40444x;
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        c12165d2.m33638l(this.f40445y, c12165d2.m33637k(dVar.getHttpStatusCode()));
                        this.f40444x.logger.mo85214e("CMAW", AbstractC31061c.m95640p("Fetch failed with network error (stale data returned). Path: ", this.f40445y.getPath(), ". ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        c12164c = new C12164c(InterfaceC12162a.c.f40428a, null, 2, null);
                    }
                    if (c12164c != null) {
                        c41476a.f40453y = null;
                        c41476a.f40446E = null;
                        c41476a.f40447F = null;
                        c41476a.f40448G = null;
                        c41476a.f40449H = null;
                        c41476a.f40450I = 0;
                        c41476a.f40452x = 1;
                        if (interfaceC13062m.emit(c12164c, c41476a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C12165d c12165d, C0141a c0141a) {
            this.f40440w = interfaceC13058l;
            this.f40441x = c12165d;
            this.f40442y = c0141a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f40440w.collect(new a(interfaceC13062m, this.f40441x, this.f40442y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dl0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.chatminiarchwidget.ChatMiniArchWidgetInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ChatMiniArchWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f40455w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f40456x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f40457y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12165d f40458z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C12165d c12165d) {
            super(3, interfaceC30057d);
            this.f40458z = c12165d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC12163b abstractC12163b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f40458z);
            cVar.f40456x = interfaceC13062m;
            cVar.f40457y = abstractC12163b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f40455w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f40456x;
                AbstractC12163b abstractC12163b = (AbstractC12163b) this.f40457y;
                if (!(abstractC12163b instanceof AbstractC12163b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f40458z.new d(abstractC12163b, null));
                this.f40456x = null;
                this.f40457y = null;
                this.f40455w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC12163b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dl0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.chatminiarchwidget.ChatMiniArchWidgetInteractor$interact$1$1", m100430f = "ChatMiniArchWidgetInteractor.kt", m100431l = {34, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40459w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f40460x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC12163b f40462z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC12163b abstractC12163b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40462z = abstractC12163b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C12165d.this.new d(this.f40462z, interfaceC30057d);
            dVar.f40460x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f40460x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f40459w
                r3 = 1
                r4 = 0
                r5 = 2
                if (r2 == 0) goto L21
                if (r2 == r3) goto L1d
                if (r2 != r5) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L53
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L36
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                dl0.c r7 = new dl0.c
                dl0.a$a r2 = dl0.InterfaceC12162a.a.f40427a
                r7.<init>(r2, r4, r5, r4)
                r6.f40460x = r0
                r6.f40459w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L36
                goto L52
            L36:
                dl0.d r7 = dl0.C12165d.this
                dl0.b r2 = r6.f40462z
                dl0.b$a r2 = (dl0.AbstractC12163b.a) r2
                java.lang.String r2 = r2.getPath()
                a12.a r2 = a12.AbstractC0142b.m360e(r2)
                ec3.l r7 = dl0.C12165d.m33629c(r7, r2)
                r6.f40460x = r4
                r6.f40459w = r5
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L53
            L52:
                return r1
            L53:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dl0.C12165d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12165d(InterfaceC26834e cachedApiSource, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m33635i(C0141a parsedPath) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetMiniArchWidgetRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1), AbstractC12350b.m34570S("FormCompletionRefreshScope"), null, 2, null), new a(null, this.cachedApiSource)), this, parsedPath);
    }

    /* JADX INFO: renamed from: j */
    private final void m33636j(C0141a parsed, C12166e.b reason) {
        C12166e c12166e = C12166e.f40463a;
        if (c12166e.m33644d(parsed.getBasePath())) {
            C23465k c23465kM33643c = c12166e.m33643c(parsed);
            this.metricWriter.mo58701b(c12166e.m33642b(reason, (C12166e.a) c23465kM33643c.f92937w, (String) c23465kM33643c.f92938x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C12166e.b m33637k(int httpStatusCode) {
        if (httpStatusCode == 0) {
            return C12166e.b.NETWORK;
        }
        if (500 > httpStatusCode || httpStatusCode >= 600) {
            return (400 > httpStatusCode || httpStatusCode >= 500) ? C12166e.b.UNKNOWN : C12166e.b.BAD_REQUEST;
        }
        return C12166e.b.SERVER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m33638l(C0141a parsed, C12166e.b reason) {
        m33636j(parsed, reason);
        this.metricWriter.mo58701b(C12166e.f40463a.m33645f(parsed.getBasePath(), reason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C12164c m33639m(C0141a parsed) {
        this.logger.mo85214e("CMAW", AbstractC11266d.m30461o("Unsupported widget type. Path: ", parsed.getPath()), new AbstractC30556a.a[0]);
        return new C12164c(new InterfaceC12162a.d(parsed.getPath()), null, 2, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
