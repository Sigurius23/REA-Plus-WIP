package xy1;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.User;
import dj0.C12066b;
import dj0.InterfaceC12073i;
import dj0.InterfaceC12075k;
import dj0.InterfaceC12082r;
import dj0.InterfaceC12084t;
import dj0.InterfaceC12087w;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import py1.AbstractC29623b;
import py1.C29622a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wy1.InterfaceC37694a;
import y92.C39352a;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: xy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006*"}, m65681d2 = {"Lxy1/b;", "", "Ldj0/b;", "cognitoAuthApi", "Ly92/a;", "authManager", "Lpy1/a;", "mfaAnalyticsHelper", "Lz92/a;", "userInfoAccessor", "Ltr2/n;", "logger", "<init>", "(Ldj0/b;Ly92/a;Lpy1/a;Lz92/a;Ltr2/n;)V", "Lxy1/c;", "e", "(Lq83/d;)Ljava/lang/Object;", "", "input", "inputMode", "source", "Lec3/l;", "Lxy1/b$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lxy1/c;Ljava/lang/String;)Lec3/l;", "", "g", "(Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lwy1/a;", "upstream", "Lxy1/a;", "f", "(Lec3/l;)Lec3/l;", "a", "Ldj0/b;", "b", "Ly92/a;", "c", "Lpy1/a;", "d", "Lz92/a;", "Ltr2/n;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38701b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xy1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lxy1/b$a;", "", "a", "b", "c", "Lxy1/b$a$a;", "Lxy1/b$a$b;", "Lxy1/b$a$c;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: xy1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxy1/b$a$a;", "Lxy1/b$a;", "Lwy1/a;", "viewEvent", "<init>", "(Lwy1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwy1/a;", "()Lwy1/a;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42671a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC37694a viewEvent;

            public C42671a(InterfaceC37694a viewEvent) {
                AbstractC22676k.m65750j(viewEvent, "viewEvent");
                this.viewEvent = viewEvent;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC37694a getViewEvent() {
                return this.viewEvent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42671a) && AbstractC22676k.m65745e(this.viewEvent, ((C42671a) other).viewEvent);
            }

            public int hashCode() {
                return this.viewEvent.hashCode();
            }

            public String toString() {
                return "HandleEvent(viewEvent=" + this.viewEvent + ")";
            }
        }

        /* JADX INFO: renamed from: xy1.b$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxy1/b$a$b;", "Lxy1/b$a;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f166544a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: xy1.b$a$c */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lxy1/b$a$c;", "Lxy1/b$a;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean success;

            public c(boolean z4) {
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
                return (other instanceof c) && this.success == ((c) other).success;
            }

            public int hashCode() {
                return Boolean.hashCode(this.success);
            }

            public String toString() {
                return AbstractC3855a.m11827k("SubmitFinished(success=", ")", this.success);
            }
        }
    }

    /* JADX INFO: renamed from: xy1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166546a;

        static {
            int[] iArr = new int[EnumC38702c.values().length];
            try {
                iArr[EnumC38702c.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38702c.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166546a = iArr;
        }
    }

    /* JADX INFO: renamed from: xy1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaInputInteractor", m100430f = "MfaInputInteractor.kt", m100431l = {84}, m100432m = "getInputModeForCountry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f166547w;

        /* JADX INFO: renamed from: y */
        int f166549y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166547w = obj;
            this.f166549y |= Integer.MIN_VALUE;
            return C38701b.this.m124122e(this);
        }
    }

    /* JADX INFO: renamed from: xy1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaInputInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MfaInputInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166550w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166551x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166552y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38701b f166553z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C38701b c38701b) {
            super(3, interfaceC30057d);
            this.f166553z = c38701b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC37694a interfaceC37694a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f166553z);
            dVar.f166551x = interfaceC13062m;
            dVar.f166552y = interfaceC37694a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166550w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f166551x;
                InterfaceC37694a interfaceC37694a = (InterfaceC37694a) this.f166552y;
                if (interfaceC37694a instanceof InterfaceC37694a.e) {
                    InterfaceC37694a.e eVar = (InterfaceC37694a.e) interfaceC37694a;
                    c0456u = this.f166553z.m124124h(eVar.getInput(), eVar.getInputMode(), eVar.getSource());
                } else {
                    c0456u = new C0456u(new a.C42671a(interfaceC37694a), 1);
                }
                this.f166551x = null;
                this.f166552y = null;
                this.f166550w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC37694a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xy1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaInputInteractor$interact$2", m100430f = "MfaInputInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxy1/a;", "domainState", "Lxy1/b$a;", "internalDomainAction", "<anonymous>", "(Lxy1/a;Lxy1/b$a;)Lxy1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        float f166555w;

        /* JADX INFO: renamed from: x */
        int f166556x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166557y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f166558z;

        /* JADX INFO: renamed from: xy1.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f166559a;

            static {
                int[] iArr = new int[EnumC38702c.values().length];
                try {
                    iArr[EnumC38702c.PHONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC38702c.EMAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f166559a = iArr;
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38700a c38700a, a aVar, InterfaceC30057d<? super C38700a> interfaceC30057d) {
            e eVar = C38701b.this.new e(interfaceC30057d);
            eVar.f166557y = c38700a;
            eVar.f166558z = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            float f13;
            EnumC38702c enumC38702c;
            C38700a c38700a = (C38700a) this.f166557y;
            a aVar = (a) this.f166558z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166556x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(aVar instanceof a.C42671a)) {
                    if (aVar instanceof a.b) {
                        return C38700a.m124112b(c38700a, null, null, 0.0f, EnumC38705f.LOADING, 7, null);
                    }
                    if (aVar instanceof a.c) {
                        return C38700a.m124112b(c38700a, null, null, 0.0f, ((a.c) aVar).getSuccess() ? EnumC38705f.SUCCESS : EnumC38705f.FAILURE, 7, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                a.C42671a c42671a = (a.C42671a) aVar;
                InterfaceC37694a viewEvent = c42671a.getViewEvent();
                if (viewEvent instanceof InterfaceC37694a.b) {
                    return C38700a.m124112b(c38700a, null, ((InterfaceC37694a.b) c42671a.getViewEvent()).getValue(), 0.0f, EnumC38705f.IDLE, 5, null);
                }
                if (viewEvent instanceof InterfaceC37694a.c) {
                    int i14 = a.f166559a[c38700a.getInputMode().ordinal()];
                    if (i14 == 1) {
                        enumC38702c = EnumC38702c.EMAIL;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        enumC38702c = EnumC38702c.PHONE;
                    }
                    return C38700a.m124112b(c38700a, enumC38702c, "", 0.0f, EnumC38705f.IDLE, 4, null);
                }
                if (!(viewEvent instanceof InterfaceC37694a.a)) {
                    if (viewEvent instanceof InterfaceC37694a.d) {
                        return C38700a.m124112b(c38700a, null, null, 0.0f, EnumC38705f.IDLE, 7, null);
                    }
                    if (viewEvent instanceof InterfaceC37694a.e) {
                        return c38700a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C29622a.m91011s(C38701b.this.mfaAnalyticsHelper, null, ((InterfaceC37694a.a) c42671a.getViewEvent()).getSource(), 1, null);
                f13 = ((InterfaceC37694a.a) c42671a.getViewEvent()).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                C38701b c38701b = C38701b.this;
                this.f166557y = c38700a;
                this.f166558z = null;
                this.f166555w = f13;
                this.f166556x = 1;
                obj = c38701b.m124122e(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f13 = this.f166555w;
                AbstractC34132o.m107864I(obj);
            }
            return C38700a.m124112b(c38700a, (EnumC38702c) obj, null, f13, null, 10, null);
        }
    }

    /* JADX INFO: renamed from: xy1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaInputInteractor", m100430f = "MfaInputInteractor.kt", m100431l = {98, 122, 129}, m100432m = "performSubmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f166560E;

        /* JADX INFO: renamed from: F */
        Object f166561F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f166562G;

        /* JADX INFO: renamed from: I */
        int f166564I;

        /* JADX INFO: renamed from: w */
        Object f166565w;

        /* JADX INFO: renamed from: x */
        Object f166566x;

        /* JADX INFO: renamed from: y */
        Object f166567y;

        /* JADX INFO: renamed from: z */
        Object f166568z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166562G = obj;
            this.f166564I |= Integer.MIN_VALUE;
            return C38701b.this.m124123g(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: xy1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaInputInteractor$submitInput$1", m100430f = "MfaInputInteractor.kt", m100431l = {91, 92, 93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxy1/b$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f166569E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC38702c f166570F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f166571G;

        /* JADX INFO: renamed from: w */
        boolean f166572w;

        /* JADX INFO: renamed from: x */
        int f166573x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f166574y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, EnumC38702c enumC38702c, String str2, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f166569E = str;
            this.f166570F = enumC38702c;
            this.f166571G = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C38701b.this.new g(this.f166569E, this.f166570F, this.f166571G, interfaceC30057d);
            gVar.f166574y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f166574y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f166573x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r8)
                goto L63
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4a
            L23:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L37
            L27:
                p505ts.AbstractC34132o.m107864I(r8)
                xy1.b$a$b r8 = xy1.C38701b.a.b.f166544a
                r7.f166574y = r0
                r7.f166573x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L37
                goto L62
            L37:
                xy1.b r8 = xy1.C38701b.this
                java.lang.String r2 = r7.f166569E
                xy1.c r5 = r7.f166570F
                java.lang.String r6 = r7.f166571G
                r7.f166574y = r0
                r7.f166573x = r4
                java.lang.Object r8 = xy1.C38701b.m124120c(r8, r2, r5, r6, r7)
                if (r8 != r1) goto L4a
                goto L62
            L4a:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                xy1.b$a$c r2 = new xy1.b$a$c
                r2.<init>(r8)
                r4 = 0
                r7.f166574y = r4
                r7.f166572w = r8
                r7.f166573x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L63
            L62:
                return r1
            L63:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xy1.C38701b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C38701b(C12066b cognitoAuthApi, C39352a authManager, C29622a mfaAnalyticsHelper, InterfaceC40205a userInfoAccessor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(logger, "logger");
        this.cognitoAuthApi = cognitoAuthApi;
        this.authManager = authManager;
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
        this.userInfoAccessor = userInfoAccessor;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m124122e(InterfaceC30057d<? super EnumC38702c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f166549y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f166549y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36575A = cVar.f166547w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f166549y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l user = this.userInfoAccessor.getUser();
            cVar.f166549y = 1;
            objM36575A = AbstractC13091v.m36575A(user, cVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        User user2 = (User) objM36575A;
        return AbstractC22676k.m65745e(user2 != null ? user2.getCountry() : null, "US") ? EnumC38702c.PHONE : EnumC38702c.EMAIL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0164  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0128, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0178, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01a7, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public final Object m124123g(String str, EnumC38702c enumC38702c, String str2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        EnumC38702c enumC38702c2;
        String str3;
        String str4;
        InterfaceC12087w bVar;
        String str5;
        EnumC38702c enumC38702c3;
        String str6;
        InterfaceC12087w interfaceC12087w;
        InterfaceC12075k interfaceC12075k;
        String str7;
        InterfaceC12075k.a aVar;
        String str8;
        EnumC38702c enumC38702c4;
        InterfaceC12084t interfaceC12084t;
        String str9;
        boolean z4;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f166564I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f166564I = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM125478a = fVar.f166562G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f166564I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            fVar.f166565w = str;
            enumC38702c2 = enumC38702c;
            fVar.f166566x = enumC38702c2;
            fVar.f166567y = str2;
            fVar.f166564I = 1;
            objM125478a = c39352a.m125478a(fVar);
            if (objM125478a != enumC31071a) {
                str3 = str2;
                str4 = str;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            String str10 = (String) fVar.f166567y;
            enumC38702c2 = (EnumC38702c) fVar.f166566x;
            str4 = (String) fVar.f166565w;
            AbstractC34132o.m107864I(objM125478a);
            str3 = str10;
        } else {
            if (i14 == 2) {
                interfaceC12087w = (InterfaceC12087w) fVar.f166560E;
                str5 = (String) fVar.f166568z;
                str6 = (String) fVar.f166567y;
                enumC38702c3 = (EnumC38702c) fVar.f166566x;
                AbstractC34132o.m107864I(objM125478a);
                interfaceC12075k = (InterfaceC12075k) objM125478a;
                if (interfaceC12075k instanceof InterfaceC12075k.a) {
                    this.logger.mo85222m("Error during MFA enablement: " + interfaceC12075k, new AbstractC30556a.a[0]);
                    if (interfaceC12075k instanceof InterfaceC12073i) {
                        str7 = "server";
                    } else {
                        str7 = "network";
                    }
                    this.mfaAnalyticsHelper.m91018f("input_screen", str7, AbstractC29623b.m91036c(enumC38702c3), str6, "MFA Setup Flow");
                    return Boolean.FALSE;
                }
                aVar = (InterfaceC12075k.a) interfaceC12075k;
                if (aVar.getCodeDeliveryInfo() != null) {
                    this.logger.mo85216g("MFA enablement successful, code delivery info: " + aVar.getCodeDeliveryInfo(), new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                this.logger.mo85228t("MFA enablement successful but no code delivery info, requesting verification code", new AbstractC30556a.a[0]);
                C12066b c12066b = this.cognitoAuthApi;
                fVar.f166565w = null;
                fVar.f166566x = enumC38702c3;
                fVar.f166567y = str6;
                fVar.f166568z = null;
                fVar.f166560E = null;
                fVar.f166561F = null;
                fVar.f166564I = 3;
                objM125478a = c12066b.m33300E(interfaceC12087w, str5, fVar);
                if (objM125478a != enumC31071a) {
                    str8 = str6;
                    enumC38702c4 = enumC38702c3;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str11 = (String) fVar.f166567y;
            enumC38702c4 = (EnumC38702c) fVar.f166566x;
            AbstractC34132o.m107864I(objM125478a);
            str8 = str11;
        }
        interfaceC12084t = (InterfaceC12084t) objM125478a;
        if (interfaceC12084t instanceof InterfaceC12084t.a) {
            this.logger.mo85216g("MFA setup challenge code requested successfully", new AbstractC30556a.a[0]);
            z4 = true;
        } else {
            this.logger.mo85222m("Error during MFA setup code request: " + interfaceC12084t, new AbstractC30556a.a[0]);
            if (interfaceC12084t instanceof InterfaceC12082r) {
                str9 = "server";
            } else {
                str9 = "network";
            }
            this.mfaAnalyticsHelper.m91018f("input_screen", str9, AbstractC29623b.m91036c(enumC38702c4), str8, "MFA Setup Flow");
            z4 = false;
        }
        return Boolean.valueOf(z4);
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        String accessToken = authMaterial != null ? authMaterial.getAccessToken() : null;
        if (accessToken == null) {
            this.logger.mo85222m("No access token available for MFA setup", new AbstractC30556a.a[0]);
            this.mfaAnalyticsHelper.m91018f("input_screen", "other", AbstractC29623b.m91036c(enumC38702c2), str3, "MFA Setup Flow");
            return Boolean.FALSE;
        }
        String str12 = str3;
        int i15 = b.f166546a[enumC38702c2.ordinal()];
        if (i15 == 1) {
            bVar = new InterfaceC12087w.b(str4);
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new InterfaceC12087w.a(str4);
        }
        this.mfaAnalyticsHelper.m91020h(enumC38702c2, str12);
        this.logger.mo85228t(AbstractC11266d.m30461o("Starting MFA enablement for ", enumC38702c2.name()), new AbstractC30556a.a[0]);
        C12066b c12066b2 = this.cognitoAuthApi;
        fVar.f166565w = null;
        fVar.f166566x = enumC38702c2;
        fVar.f166567y = str12;
        fVar.f166568z = accessToken;
        fVar.f166560E = bVar;
        fVar.f166564I = 2;
        Object objM33305L = c12066b2.m33305L(bVar, accessToken, fVar);
        if (objM33305L != enumC31071a) {
            str5 = accessToken;
            objM125478a = objM33305L;
            enumC38702c3 = enumC38702c2;
            str6 = str12;
            interfaceC12087w = bVar;
            interfaceC12075k = (InterfaceC12075k) objM125478a;
            if (interfaceC12075k instanceof InterfaceC12075k.a) {
                this.logger.mo85222m("Error during MFA enablement: " + interfaceC12075k, new AbstractC30556a.a[0]);
                if (interfaceC12075k instanceof InterfaceC12073i) {
                    str7 = "server";
                } else {
                    str7 = "network";
                }
                this.mfaAnalyticsHelper.m91018f("input_screen", str7, AbstractC29623b.m91036c(enumC38702c3), str6, "MFA Setup Flow");
                return Boolean.FALSE;
            }
            aVar = (InterfaceC12075k.a) interfaceC12075k;
            if (aVar.getCodeDeliveryInfo() != null) {
                this.logger.mo85216g("MFA enablement successful, code delivery info: " + aVar.getCodeDeliveryInfo(), new AbstractC30556a.a[0]);
                return Boolean.TRUE;
            }
            this.logger.mo85228t("MFA enablement successful but no code delivery info, requesting verification code", new AbstractC30556a.a[0]);
            C12066b c12066b3 = this.cognitoAuthApi;
            fVar.f166565w = null;
            fVar.f166566x = enumC38702c3;
            fVar.f166567y = str6;
            fVar.f166568z = null;
            fVar.f166560E = null;
            fVar.f166561F = null;
            fVar.f166564I = 3;
            objM125478a = c12066b3.m33300E(interfaceC12087w, str5, fVar);
            if (objM125478a != enumC31071a) {
                str8 = str6;
                enumC38702c4 = enumC38702c3;
                interfaceC12084t = (InterfaceC12084t) objM125478a;
                if (interfaceC12084t instanceof InterfaceC12084t.a) {
                    this.logger.mo85216g("MFA setup challenge code requested successfully", new AbstractC30556a.a[0]);
                    z4 = true;
                } else {
                    this.logger.mo85222m("Error during MFA setup code request: " + interfaceC12084t, new AbstractC30556a.a[0]);
                    if (interfaceC12084t instanceof InterfaceC12082r) {
                        str9 = "server";
                    } else {
                        str9 = "network";
                    }
                    this.mfaAnalyticsHelper.m91018f("input_screen", str9, AbstractC29623b.m91036c(enumC38702c4), str8, "MFA Setup Flow");
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m124124h(String input, EnumC38702c inputMode, String source) {
        return new C13084s1(new g(input, inputMode, source, null));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m124125f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C38700a(null, null, 0.0f, null, 15, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }

    public /* synthetic */ C38701b(C12066b c12066b, C39352a c39352a, C29622a c29622a, InterfaceC40205a interfaceC40205a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12066b, c39352a, c29622a, interfaceC40205a, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaInputInteractor") : interfaceC34116n);
    }
}
