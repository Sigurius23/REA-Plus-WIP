package fh0;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: fh0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lfh0/a;", "Lod1/g;", "Lfh0/f;", "Lfh0/e;", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14479a implements InterfaceC27844g<InterfaceC14484f, C14483e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fh0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lfh0/a$a;", "", "a", "c", "b", "Lfh0/a$a$a;", "Lfh0/a$a$b;", "Lfh0/a$a$c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fh0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lfh0/a$a$a;", "Lfh0/a$a;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41586a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isActive;

            public C41586a(boolean z4) {
                this.isActive = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsActive() {
                return this.isActive;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41586a) && this.isActive == ((C41586a) other).isActive;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isActive);
            }

            public String toString() {
                return AbstractC3855a.m11827k("Synced(isActive=", ")", this.isActive);
            }
        }

        /* JADX INFO: renamed from: fh0.a$a$b */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lfh0/a$a$b;", "Lfh0/a$a;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean success;

            public b(boolean z4) {
                this.success = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getSuccess() {
                return this.success;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && this.success == ((b) other).success;
            }

            public int hashCode() {
                return Boolean.hashCode(this.success);
            }

            public String toString() {
                return AbstractC3855a.m11827k("ToggleFinished(success=", ")", this.success);
            }
        }

        /* JADX INFO: renamed from: fh0.a$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lfh0/a$a$c;", "Lfh0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f52852a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -271925550;
            }

            public String toString() {
                return "ToggleStarted";
            }
        }
    }

    /* JADX INFO: renamed from: fh0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ContextStatusToggleInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f52853w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f52854x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52855y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14479a f52856z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C14479a c14479a) {
            super(3, interfaceC30057d);
            this.f52856z = c14479a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC14484f interfaceC14484f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f52856z);
            bVar.f52854x = interfaceC13062m;
            bVar.f52855y = interfaceC14484f;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52853w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f52854x;
                InterfaceC14484f interfaceC14484f = (InterfaceC14484f) this.f52855y;
                if (interfaceC14484f instanceof InterfaceC14484f.a) {
                    c13084s1 = new C0456u(new a.C41586a(((InterfaceC14484f.a) interfaceC14484f).getIsActive()), 1);
                } else {
                    if (!(interfaceC14484f instanceof InterfaceC14484f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f52856z.new c(interfaceC14484f, null));
                }
                this.f52854x = null;
                this.f52855y = null;
                this.f52853w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC14484f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fh0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$1$1", m100430f = "ContextStatusToggleInteractor.kt", m100431l = {31, 32, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfh0/a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC14484f f52857E;

        /* JADX INFO: renamed from: w */
        Object f52858w;

        /* JADX INFO: renamed from: x */
        int f52859x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f52860y;

        /* JADX INFO: renamed from: fh0.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$1$1$apiResult$1", m100430f = "ContextStatusToggleInteractor.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f52862w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14479a f52863x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC14484f f52864y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14479a c14479a, InterfaceC14484f interfaceC14484f, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f52863x = c14479a;
                this.f52864y = interfaceC14484f;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f52863x, this.f52864y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f52862w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C34387c c34387c = this.f52863x.apiClient;
                InterfaceC39944a actionApiRequest$default = RequestExtensionsKt.toActionApiRequest$default(((InterfaceC14484f.b) this.f52864y).getAction().getRequest(), null, 1, null);
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                this.f52862w = 1;
                Object objM108748d = c34387c.m108748d(actionApiRequest$default, c32236aM44445Y, this);
                return objM108748d == enumC31071a ? enumC31071a : objM108748d;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC14484f interfaceC14484f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52857E = interfaceC14484f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C14479a.this.new c(this.f52857E, interfaceC30057d);
            cVar.f52860y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            if (r8.emit(r1, r12) == r9) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f52860y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f52859x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2e
                if (r0 == r2) goto L2a
                if (r0 == r1) goto L25
                if (r0 != r10) goto L1d
                java.lang.Object r0 = r12.f52858w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L77
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2a:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3e
            L2e:
                p505ts.AbstractC34132o.m107864I(r13)
                fh0.a$a$c r0 = fh0.C14479a.a.c.f52852a
                r12.f52860y = r8
                r12.f52859x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3e
                goto L76
            L3e:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                fh0.a r2 = fh0.C14479a.this
                tr2.n r2 = fh0.C14479a.m41351d(r2)
                fh0.a$c$a r4 = new fh0.a$c$a
                fh0.a r3 = fh0.C14479a.this
                fh0.f r6 = r12.f52857E
                r4.<init>(r3, r6, r11)
                r12.f52860y = r8
                r12.f52859x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "ContextStatusToggle update failed"
                r6 = 2
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L76
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                fh0.a$a$b r1 = new fh0.a$a$b
                boolean r0 = r0 instanceof u02.InterfaceC34385a.c
                r1.<init>(r0)
                r12.f52860y = r11
                r12.f52858w = r11
                r12.f52859x = r10
                java.lang.Object r0 = r8.emit(r1, r12)
                if (r0 != r9) goto L77
            L76:
                return r9
            L77:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fh0.C14479a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fh0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$2", m100430f = "ContextStatusToggleInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfh0/e;", "state", "Lfh0/a$a;", "result", "<anonymous>", "(Lfh0/e;Lfh0/a$a;)Lfh0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f52865w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f52866x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52867y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C14483e c14483e, a aVar, InterfaceC30057d<? super C14483e> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f52866x = c14483e;
            dVar.f52867y = aVar;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14483e c14483e = (C14483e) this.f52866x;
            a aVar = (a) this.f52867y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52865w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.C41586a) {
                return C14483e.m41366b(c14483e, ((a.C41586a) aVar).getIsActive(), false, false, 2, null);
            }
            if (aVar instanceof a.c) {
                return c14483e.m41367a(!c14483e.getIsActive(), true, false);
            }
            if (aVar instanceof a.b) {
                return ((a.b) aVar).getSuccess() ? C14483e.m41366b(c14483e, false, false, false, 5, null) : c14483e.m41367a(!c14483e.getIsActive(), false, true);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C14479a(C34387c apiClient, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C14483e(false, false, false, 6, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new d(null));
    }

    public /* synthetic */ C14479a(C34387c c34387c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ContextStatusToggleInteractor") : interfaceC34116n);
    }
}
