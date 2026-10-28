package ex1;

import ad3.AbstractC0757c;
import ad3.C0755b;
import ax1.C2120b;
import c93.InterfaceC4351m;
import com.whoop.membership.management.domain.api.MembershipManagementApi;
import com.whoop.membership.management.domain.models.MembershipManagementScreenResponse;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import od1.InterfaceC27844g;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import xc3.AbstractC38195a;

/* JADX INFO: renamed from: ex1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0015\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lex1/c;", "Lod1/g;", "Lex1/a;", "Lex1/b;", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "membershipManagementApi", "Lsr2/y;", "urlProvider", "Lax1/b;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;)V", "Lec3/m;", "g", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "", "path", "", "payload", "f", "(Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "b", "Lsr2/y;", "c", "Lax1/b;", "d", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13729c implements InterfaceC27844g<InterfaceC13727a, InterfaceC13728b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipManagementApi membershipManagementApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2120b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ex1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor", m100430f = "MembershipManagementInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 84}, m100432m = "checkout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f48754E;

        /* JADX INFO: renamed from: F */
        Object f48755F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f48756G;

        /* JADX INFO: renamed from: I */
        int f48758I;

        /* JADX INFO: renamed from: w */
        Object f48759w;

        /* JADX INFO: renamed from: x */
        Object f48760x;

        /* JADX INFO: renamed from: y */
        Object f48761y;

        /* JADX INFO: renamed from: z */
        Object f48762z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48756G = obj;
            this.f48758I |= Integer.MIN_VALUE;
            return C13729c.this.m38951f(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ex1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor$checkout$response$1", m100430f = "MembershipManagementInteractor.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48763w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f48765y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ JsonObject f48766z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, JsonObject jsonObject, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48765y = str;
            this.f48766z = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13729c.this.new b(this.f48765y, this.f48766z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48763w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C13729c.this.membershipManagementApi;
            String str = this.f48765y;
            JsonObject jsonObject = this.f48766z;
            this.f48763w = 1;
            Object objPlaceDynamicCheckout = membershipManagementApi.placeDynamicCheckout(str, jsonObject, this);
            return objPlaceDynamicCheckout == enumC31071a ? enumC31071a : objPlaceDynamicCheckout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor", m100430f = "MembershipManagementInteractor.kt", m100431l = {44, 45}, m100432m = "fetchMembershipManagementScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f48767w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48768x;

        /* JADX INFO: renamed from: z */
        int f48770z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48768x = obj;
            this.f48770z |= Integer.MIN_VALUE;
            return C13729c.this.m38952g(null, this);
        }
    }

    /* JADX INFO: renamed from: ex1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor$fetchMembershipManagementScreen$response$1", m100430f = "MembershipManagementInteractor.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48771w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13729c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48771w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C13729c.this.membershipManagementApi;
            this.f48771w = 1;
            Object objFetchMembershipManagementScreen = membershipManagementApi.fetchMembershipManagementScreen(this);
            return objFetchMembershipManagementScreen == enumC31071a ? enumC31071a : objFetchMembershipManagementScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MembershipManagementScreenResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor$interact$1", m100430f = "MembershipManagementInteractor.kt", m100431l = {31, 33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lex1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C13729c f48773E;

        /* JADX INFO: renamed from: w */
        Object f48774w;

        /* JADX INFO: renamed from: x */
        int f48775x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f48776y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f48777z;

        /* JADX INFO: renamed from: ex1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f48778w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13729c f48779x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f48780y;

            /* JADX INFO: renamed from: ex1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.management.MembershipManagementInteractor$interact$1$1", m100430f = "MembershipManagementInteractor.kt", m100431l = {35, 36, 39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41572a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f48781E;

                /* JADX INFO: renamed from: w */
                Object f48782w;

                /* JADX INFO: renamed from: x */
                Object f48783x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f48784y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f48785z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41572a(a<? super T> aVar, InterfaceC30057d<? super C41572a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f48785z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f48784y = obj;
                    this.f48781E |= Integer.MIN_VALUE;
                    return this.f48785z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C13729c c13729c, InterfaceC13062m interfaceC13062m) {
                this.f48778w = c22669g0;
                this.f48779x = c13729c;
                this.f48780y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
            
                if (r10.emit(r11, r0) == r1) goto L38;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(ex1.InterfaceC13727a r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof ex1.C13729c.e.a.C41572a
                    if (r0 == 0) goto L13
                    r0 = r11
                    ex1.c$e$a$a r0 = (ex1.C13729c.e.a.C41572a) r0
                    int r1 = r0.f48781E
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f48781E = r1
                    goto L18
                L13:
                    ex1.c$e$a$a r0 = new ex1.c$e$a$a
                    r0.<init>(r9, r11)
                L18:
                    java.lang.Object r11 = r0.f48784y
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f48781E
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L53
                    if (r2 == r5) goto L47
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r10 = r0.f48782w
                    ex1.a r10 = (ex1.InterfaceC13727a) r10
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto Lb6
                L33:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3b:
                    java.lang.Object r10 = r0.f48783x
                    kotlin.jvm.internal.g0 r10 = (p715kotlin.jvm.internal.C22669g0) r10
                    java.lang.Object r2 = r0.f48782w
                    ex1.a r2 = (ex1.InterfaceC13727a) r2
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L98
                L47:
                    java.lang.Object r10 = r0.f48783x
                    kotlin.jvm.internal.g0 r10 = (p715kotlin.jvm.internal.C22669g0) r10
                    java.lang.Object r2 = r0.f48782w
                    ex1.a r2 = (ex1.InterfaceC13727a) r2
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L70
                L53:
                    p505ts.AbstractC34132o.m107864I(r11)
                    kotlin.jvm.internal.g0 r11 = r9.f48778w
                    boolean r2 = r10 instanceof ex1.InterfaceC13727a.b
                    if (r2 == 0) goto L76
                    ex1.c r10 = r9.f48779x
                    ec3.m r2 = r9.f48780y
                    r0.f48782w = r6
                    r0.f48783x = r11
                    r0.f48781E = r5
                    java.lang.Object r10 = ex1.C13729c.m38949d(r10, r2, r0)
                    if (r10 != r1) goto L6d
                    goto Lb5
                L6d:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L70:
                    ex1.b r11 = (ex1.InterfaceC13728b) r11
                L72:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                    goto La1
                L76:
                    boolean r2 = r10 instanceof ex1.InterfaceC13727a.a
                    if (r2 == 0) goto L9b
                    ex1.c r2 = r9.f48779x
                    ec3.m r5 = r9.f48780y
                    ex1.a$a r10 = (ex1.InterfaceC13727a.a) r10
                    java.lang.String r7 = r10.getPath()
                    java.util.Map r10 = r10.m38944b()
                    r0.f48782w = r6
                    r0.f48783x = r11
                    r0.f48781E = r4
                    java.lang.Object r10 = ex1.C13729c.m38948c(r2, r5, r7, r10, r0)
                    if (r10 != r1) goto L95
                    goto Lb5
                L95:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L98:
                    ex1.b r11 = (ex1.InterfaceC13728b) r11
                    goto L72
                L9b:
                    boolean r10 = r10 instanceof ex1.InterfaceC13727a.c
                    if (r10 == 0) goto Lb9
                    ex1.b$e r10 = ex1.InterfaceC13728b.e.f48748a
                La1:
                    r11.f89336w = r10
                    ec3.m r10 = r9.f48780y
                    kotlin.jvm.internal.g0 r11 = r9.f48778w
                    java.lang.Object r11 = r11.f89336w
                    r0.f48782w = r6
                    r0.f48783x = r6
                    r0.f48781E = r3
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto Lb6
                Lb5:
                    return r1
                Lb6:
                    l83.a0 r10 = l83.C23454a0.f92919a
                    return r10
                Lb9:
                    kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                    r10.<init>()
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ex1.C13729c.e.a.emit(ex1.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, C13729c c13729c, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48777z = interfaceC13058l;
            this.f48773E = c13729c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f48777z, this.f48773E, interfaceC30057d);
            eVar.f48776y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r7.collect(r4, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f48776y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f48775x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r6.f48774w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L54
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r2 = r6.f48774w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r7)
                ex1.b$e r7 = ex1.InterfaceC13728b.e.f48748a
                r2.f89336w = r7
                r6.f48776y = r0
                r6.f48774w = r2
                r6.f48775x = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3d
                goto L53
            L3d:
                ec3.l r7 = r6.f48777z
                ex1.c$e$a r4 = new ex1.c$e$a
                ex1.c r5 = r6.f48773E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r6.f48776y = r0
                r6.f48774w = r0
                r6.f48775x = r3
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ex1.C13729c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13729c(MembershipManagementApi membershipManagementApi, AbstractC32943y urlProvider, C2120b analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipManagementApi, "membershipManagementApi");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipManagementApi = membershipManagementApi;
        this.urlProvider = urlProvider;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m38951f(InterfaceC13062m interfaceC13062m, String str, Map<String, String> map, InterfaceC30057d<? super InterfaceC13728b> interfaceC30057d) {
        a aVar;
        Map<String, String> map2;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f48758I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f48758I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f48756G;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f48758I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            Object obj2 = InterfaceC13728b.c.f48746a;
            aVar2.f48759w = null;
            aVar2.f48760x = str;
            aVar2.f48761y = map;
            aVar2.f48758I = 1;
            if (interfaceC13062m.emit(obj2, aVar2) != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            map = (Map) aVar2.f48761y;
            str = (String) aVar2.f48760x;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (Map) aVar2.f48761y;
            str = (String) aVar2.f48760x;
            AbstractC34132o.m107864I(objM108729b);
        }
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return InterfaceC13728b.f.f48749a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new InterfaceC13728b.b(str, map2);
        }
        throw new NoWhenBranchMatchedException();
        String strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str);
        C0755b c0755b = AbstractC0757c.f2762d;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(stringSerializer, stringSerializer);
        c0755b.getClass();
        JsonObject jsonObject = new JsonObject(AbstractC25247g0.m73993b0(new C23465k("payload", AbstractC12313p.m34290h0(c0755b, map, linkedHashMapSerializerM122335c))));
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        b bVar = new b(strM8299l, jsonObject, null);
        aVar2.f48759w = null;
        aVar2.f48760x = str;
        aVar2.f48761y = map;
        aVar2.f48762z = null;
        aVar2.f48754E = null;
        aVar2.f48755F = null;
        aVar2.f48758I = 2;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
        if (objM108729b != obj) {
            map2 = map;
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return InterfaceC13728b.f.f48749a;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC13728b.b(str, map2);
            }
            throw new NoWhenBranchMatchedException();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r14 == r0) goto L22;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m38952g(ec3.InterfaceC13062m r13, q83.InterfaceC30057d<? super ex1.InterfaceC13728b> r14) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C13729c.m38952g(ec3.m, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new e(upstream, this, null));
    }

    public /* synthetic */ C13729c(MembershipManagementApi membershipManagementApi, AbstractC32943y abstractC32943y, C2120b c2120b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(membershipManagementApi, abstractC32943y, c2120b, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MembershipManagementInteractor") : interfaceC34116n);
    }
}
