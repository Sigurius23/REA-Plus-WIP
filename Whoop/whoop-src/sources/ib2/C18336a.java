package ib2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.AuthMaterial;
import dj0.C12066b;
import dj0.InterfaceC12069e;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import iy1.InterfaceC21030c;
import java.util.regex.Pattern;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y92.C39352a;

/* JADX INFO: renamed from: ib2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006\""}, m65681d2 = {"Lib2/a;", "", "Ly92/a;", "authManger", "Ldj0/b;", "cognitoAuthApi", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Ly92/a;Ldj0/b;Liy1/c;Ltr2/n;)V", "", NotificationCompat.CATEGORY_EMAIL, "", "f", "(Ljava/lang/String;)Z", "Lib2/c$d;", NotificationCompat.CATEGORY_EVENT, "Lib2/e;", "d", "(Lib2/c$d;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lib2/c;", "events", "e", "(Lec3/l;)Lec3/l;", "a", "Ly92/a;", "b", "Ldj0/b;", "c", "Liy1/c;", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18336a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ib2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.email.EditEmailInteractor$handleSubmit$$inlined$withMinimumDelayOf-KLykuaI$1", m100430f = "EditEmailInteractor.kt", m100431l = {44, 39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f71373E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C18336a f71374F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ AuthMaterial f71375G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC18338c.d f71376H;

        /* JADX INFO: renamed from: I */
        Object f71377I;

        /* JADX INFO: renamed from: J */
        int f71378J;

        /* JADX INFO: renamed from: w */
        Object f71379w;

        /* JADX INFO: renamed from: x */
        Object f71380x;

        /* JADX INFO: renamed from: y */
        int f71381y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f71382z;

        /* JADX INFO: renamed from: ib2.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.util.KotlinUtilsKt$withMinimumDelayOf$3$minimumDelay$1", m100430f = "KotlinUtils.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41737a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f71383w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ long f71384x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41737a(long j7, InterfaceC30057d interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f71384x = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41737a(this.f71384x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41737a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f71383w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long j7 = this.f71384x;
                    this.f71383w = 1;
                    if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, InterfaceC30057d interfaceC30057d, C18336a c18336a, AuthMaterial authMaterial, InterfaceC18338c.d dVar) {
            super(2, interfaceC30057d);
            this.f71373E = j7;
            this.f71374F = c18336a;
            this.f71375G = authMaterial;
            this.f71376H = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f71373E, interfaceC30057d, this.f71374F, this.f71375G, this.f71376H);
            aVar.f71382z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC12069e<? extends C23454a0>> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3018i0 interfaceC3018i0M8711e;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f71382z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71381y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C41737a(this.f71373E, null), 3);
                C12066b c12066b = this.f71374F.cognitoAuthApi;
                String accessToken = this.f71375G.getAccessToken();
                String str = this.f71376H.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String();
                this.f71382z = null;
                this.f71379w = interfaceC3018i0M8711e;
                this.f71380x = null;
                this.f71377I = null;
                this.f71378J = 0;
                this.f71381y = 1;
                obj = c12066b.m33307p(accessToken, str, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f71380x;
                AbstractC34132o.m107864I(obj);
                return obj2;
            }
            interfaceC3018i0M8711e = (InterfaceC3018i0) this.f71379w;
            AbstractC34132o.m107864I(obj);
            this.f71382z = null;
            this.f71379w = null;
            this.f71380x = obj;
            this.f71377I = null;
            this.f71381y = 2;
            return interfaceC3018i0M8711e.await(this) == enumC31071a ? enumC31071a : obj;
        }
    }

    /* JADX INFO: renamed from: ib2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.email.EditEmailInteractor", m100430f = "EditEmailInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 141, 120, 122, 125}, m100432m = "handleSubmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f71385E;

        /* JADX INFO: renamed from: F */
        long f71386F;

        /* JADX INFO: renamed from: G */
        int f71387G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f71388H;

        /* JADX INFO: renamed from: J */
        int f71390J;

        /* JADX INFO: renamed from: w */
        Object f71391w;

        /* JADX INFO: renamed from: x */
        Object f71392x;

        /* JADX INFO: renamed from: y */
        Object f71393y;

        /* JADX INFO: renamed from: z */
        Object f71394z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71388H = obj;
            this.f71390J |= Integer.MIN_VALUE;
            return C18336a.this.m52797d(null, this);
        }
    }

    /* JADX INFO: renamed from: ib2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.email.EditEmailInteractor$interact$$inlined$flatMapLatest$1", m100430f = "EditEmailInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f71395w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f71396x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f71397y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18336a f71398z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C18336a c18336a) {
            super(3, interfaceC30057d);
            this.f71398z = c18336a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C18341f c18341f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f71398z);
            cVar.f71396x = interfaceC13062m;
            cVar.f71397y = c18341f;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71395w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f71396x;
                C18341f c18341f = (C18341f) this.f71397y;
                InterfaceC18338c event = c18341f.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                if (AbstractC22676k.m65745e(event, InterfaceC18338c.c.f71413a) || AbstractC22676k.m65745e(event, InterfaceC18338c.a.f71411a)) {
                    c13084s1 = new C0456u(new InterfaceC18340e.a(c18341f.getInitialEmail(), c18341f.getInitialEmail(), null, false, 4, null), 1);
                } else if (event instanceof InterfaceC18338c.b) {
                    InterfaceC18338c.b bVar = (InterfaceC18338c.b) event;
                    c13084s1 = new C0456u(new InterfaceC18340e.a(c18341f.getInitialEmail(), bVar.getText(), null, (bVar.getText().length() <= 0 || AbstractC22676k.m65745e(bVar.getText(), c18341f.getInitialEmail()) || AbstractC22676k.m65745e(bVar.getText(), c18341f.getLastSubmittedEmail())) ? false : true, 4, null), 1);
                } else {
                    if (!(event instanceof InterfaceC18338c.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f71398z.new e(event, null));
                }
                this.f71396x = null;
                this.f71397y = null;
                this.f71395w = 1;
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
            return invoke((InterfaceC13062m) obj, (C18341f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ib2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.email.EditEmailInteractor$interact$1", m100430f = "EditEmailInteractor.kt", m100431l = {33, 43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lib2/f;", "previousState", "Lib2/c;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lib2/f;Lib2/c;)Lib2/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f71399w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71400x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f71401y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18341f c18341f, InterfaceC18338c interfaceC18338c, InterfaceC30057d<? super C18341f> interfaceC30057d) {
            d dVar = C18336a.this.new d(interfaceC30057d);
            dVar.f71400x = c18341f;
            dVar.f71401y = interfaceC18338c;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r8 == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r8 == r0) goto L31;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f71400x
                r1 = r0
                ib2.f r1 = (ib2.C18341f) r1
                java.lang.Object r0 = r7.f71401y
                r4 = r0
                ib2.c r4 = (ib2.InterfaceC18338c) r4
                r83.a r0 = r83.EnumC31071a.f128113w
                int r2 = r7.f71399w
                java.lang.String r3 = ""
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L28
                if (r2 == r6) goto L24
                if (r2 != r5) goto L1c
                p505ts.AbstractC34132o.m107864I(r8)
                goto L80
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L46
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                ib2.c$a r8 = ib2.InterfaceC18338c.a.f71411a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r4, r8)
                if (r8 == 0) goto L58
                ib2.a r8 = ib2.C18336a.this
                y92.a r8 = ib2.C18336a.m52794a(r8)
                r7.f71400x = r1
                r7.f71401y = r4
                r7.f71399w = r6
                java.lang.Object r8 = r8.m125479b(r7)
                if (r8 != r0) goto L46
                goto L7f
            L46:
                com.whoop.domain.model.User r8 = (com.whoop.domain.model.User) r8
                if (r8 == 0) goto L52
                java.lang.String r8 = r8.getEmailAddress()
                if (r8 != 0) goto L51
                goto L52
            L51:
                r3 = r8
            L52:
                r8 = 0
                ib2.f r8 = r1.m52845a(r8, r3, r4)
                return r8
            L58:
                boolean r8 = r4 instanceof ib2.InterfaceC18338c.b
                if (r8 == 0) goto L65
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                ib2.f r8 = ib2.C18341f.m52844b(r1, r2, r3, r4, r5, r6)
                return r8
            L65:
                ib2.c$c r8 = ib2.InterfaceC18338c.c.f71413a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r4, r8)
                if (r8 == 0) goto L94
                ib2.a r8 = ib2.C18336a.this
                y92.a r8 = ib2.C18336a.m52794a(r8)
                r7.f71400x = r1
                r7.f71401y = r4
                r7.f71399w = r5
                java.lang.Object r8 = r8.m125479b(r7)
                if (r8 != r0) goto L80
            L7f:
                return r0
            L80:
                com.whoop.domain.model.User r8 = (com.whoop.domain.model.User) r8
                if (r8 == 0) goto L8c
                java.lang.String r8 = r8.getEmailAddress()
                if (r8 != 0) goto L8b
                goto L8c
            L8b:
                r3 = r8
            L8c:
                r5 = 1
                r6 = 0
                r2 = 0
                ib2.f r8 = ib2.C18341f.m52844b(r1, r2, r3, r4, r5, r6)
                return r8
            L94:
                boolean r8 = r4 instanceof ib2.InterfaceC18338c.d
                if (r8 == 0) goto La7
                r8 = r4
                ib2.c$d r8 = (ib2.InterfaceC18338c.d) r8
                java.lang.String r2 = r8.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String()
                r5 = 2
                r6 = 0
                r3 = 0
                ib2.f r8 = ib2.C18341f.m52844b(r1, r2, r3, r4, r5, r6)
                return r8
            La7:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ib2.C18336a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ib2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.email.EditEmailInteractor$interact$2$1", m100430f = "EditEmailInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 76, 76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lib2/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC18338c f71403E;

        /* JADX INFO: renamed from: w */
        Object f71404w;

        /* JADX INFO: renamed from: x */
        int f71405x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f71406y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC18338c interfaceC18338c, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71403E = interfaceC18338c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C18336a.this.new e(this.f71403E, interfaceC30057d);
            eVar.f71406y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f71406y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f71405x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5c
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f71404w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4f
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                ib2.e$c r8 = ib2.InterfaceC18340e.c.f71431a
                r7.f71406y = r0
                r7.f71405x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L5b
            L3c:
                ib2.a r8 = ib2.C18336a.this
                ib2.c r2 = r7.f71403E
                ib2.c$d r2 = (ib2.InterfaceC18338c.d) r2
                r7.f71406y = r6
                r7.f71404w = r0
                r7.f71405x = r4
                java.lang.Object r8 = ib2.C18336a.m52796c(r8, r2, r7)
                if (r8 != r1) goto L4f
                goto L5b
            L4f:
                r7.f71406y = r6
                r7.f71404w = r6
                r7.f71405x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L5c
            L5b:
                return r1
            L5c:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ib2.C18336a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18336a(C39352a authManger, C12066b cognitoAuthApi, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authManger, "authManger");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.authManger = authManger;
        this.cognitoAuthApi = cognitoAuthApi;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c A[PHI: r0 r1
      0x012c: PHI (r0v22 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:56:0x0129, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r1v12 ib2.c$d) = (r1v10 ib2.c$d), (r1v26 ib2.c$d) binds: [B:56:0x0129, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x019a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r0.mo58700a(r16, r7) == r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0194, code lost:
    
        if (r1.m125482e(r0, r7) == r8) goto L65;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52797d(ib2.InterfaceC18338c.d r35, q83.InterfaceC30057d<? super ib2.InterfaceC18340e> r36) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ib2.C18336a.m52797d(ib2.c$d, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    private final boolean m52798f(String email) {
        if (email.length() >= 256) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        return patternCompile.matcher(email).matches();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m52799e(InterfaceC13058l events) {
        AbstractC22676k.m65750j(events, "events");
        return AbstractC13091v.m36590P(new C13060l1(new C18341f(null, null, InterfaceC18338c.c.f71413a, 3, null), events, new d(null)), new c(null, this));
    }

    public /* synthetic */ C18336a(C39352a c39352a, C12066b c12066b, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39352a, c12066b, interfaceC21030c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EditEmailInteractor") : interfaceC34116n);
    }
}
