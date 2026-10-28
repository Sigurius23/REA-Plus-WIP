package mh0;

import c93.InterfaceC4351m;
import com.whoop.bot.api.StartTurnApi;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.p057ai.chat.view.startturnbutton.StartTurnResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.C25272z;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: mh0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lmh0/a;", "Lod1/g;", "Lmh0/f;", "Lmh0/e;", "Lcom/whoop/bot/api/StartTurnApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;)V", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lmh0/a$a;", "e", "(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/bot/api/StartTurnApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25549a implements InterfaceC27844g<InterfaceC25554f, C25553e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StartTurnApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: mh0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lmh0/a$a;", "", "c", "d", "b", "a", "Lmh0/a$a$a;", "Lmh0/a$a$b;", "Lmh0/a$a$c;", "Lmh0/a$a$d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mh0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmh0/a$a$a;", "Lmh0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41997a implements a {

            /* JADX INFO: renamed from: a */
            public static final C41997a f100163a = new C41997a();

            private C41997a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C41997a);
            }

            public int hashCode() {
                return -1157773347;
            }

            public String toString() {
                return "ClearPending";
            }
        }

        /* JADX INFO: renamed from: mh0.a$a$b */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmh0/a$a$b;", "Lmh0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f100164a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1633596378;
            }

            public String toString() {
                return "FireFailed";
            }
        }

        /* JADX INFO: renamed from: mh0.a$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmh0/a$a$c;", "Lmh0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f100165a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 87524792;
            }

            public String toString() {
                return "FireStarted";
            }
        }

        /* JADX INFO: renamed from: mh0.a$a$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lmh0/a$a$d;", "Lmh0/a$a;", "", "turnId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String turnId;

            public d(String turnId) {
                AbstractC22676k.m65750j(turnId, "turnId");
                this.turnId = turnId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getTurnId() {
                return this.turnId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && AbstractC22676k.m65745e(this.turnId, ((d) other).turnId);
            }

            public int hashCode() {
                return this.turnId.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("FireSucceeded(turnId=", this.turnId, ")");
            }
        }
    }

    /* JADX INFO: renamed from: mh0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor", m100430f = "StartTurnButtonInteractor.kt", m100431l = {53}, m100432m = "fire", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f100167E;

        /* JADX INFO: renamed from: w */
        Object f100168w;

        /* JADX INFO: renamed from: x */
        Object f100169x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100170y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100170y = obj;
            this.f100167E |= Integer.MIN_VALUE;
            return C25549a.this.m75125e(null, this);
        }
    }

    /* JADX INFO: renamed from: mh0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor$fire$result$1", m100430f = "StartTurnButtonInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f100172w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ApiRequest f100174y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ JsonElement f100175z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ApiRequest apiRequest, JsonElement jsonElement, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f100174y = apiRequest;
            this.f100175z = jsonElement;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25549a.this.new c(this.f100174y, this.f100175z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100172w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StartTurnApi startTurnApi = C25549a.this.api;
            String path = this.f100174y.getPath();
            JsonElement jsonElement = this.f100175z;
            this.f100172w = 1;
            Object objStartTurn = startTurnApi.startTurn(path, jsonElement, this);
            return objStartTurn == enumC31071a ? enumC31071a : objStartTurn;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<StartTurnResponse>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mh0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StartTurnButtonInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100176w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100177x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100178y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25549a f100179z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C25549a c25549a) {
            super(3, interfaceC30057d);
            this.f100179z = c25549a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC25554f interfaceC25554f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f100179z);
            dVar.f100177x = interfaceC13062m;
            dVar.f100178y = interfaceC25554f;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100176w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100177x;
                InterfaceC25554f interfaceC25554f = (InterfaceC25554f) this.f100178y;
                if (interfaceC25554f instanceof InterfaceC25554f.b) {
                    c0456u = new C13084s1(this.f100179z.new e(interfaceC25554f, null));
                } else {
                    if (!(interfaceC25554f instanceof InterfaceC25554f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(a.C41997a.f100163a, 1);
                }
                this.f100177x = null;
                this.f100178y = null;
                this.f100176w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC25554f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: mh0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor$interact$1$1", m100430f = "StartTurnButtonInteractor.kt", m100431l = {32, 33, 33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmh0/a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC25554f f100180E;

        /* JADX INFO: renamed from: w */
        Object f100181w;

        /* JADX INFO: renamed from: x */
        int f100182x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f100183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC25554f interfaceC25554f, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100180E = interfaceC25554f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C25549a.this.new e(this.f100180E, interfaceC30057d);
            eVar.f100183y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
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
                java.lang.Object r0 = r7.f100183y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f100182x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L60
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f100181w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L53
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                mh0.a$a$c r8 = mh0.C25549a.a.c.f100165a
                r7.f100183y = r0
                r7.f100182x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L5f
            L3c:
                mh0.a r8 = mh0.C25549a.this
                mh0.f r2 = r7.f100180E
                mh0.f$b r2 = (mh0.InterfaceC25554f.b) r2
                com.whoop.navigation.models.ApiRequest r2 = r2.getRequest()
                r7.f100183y = r6
                r7.f100181w = r0
                r7.f100182x = r4
                java.lang.Object r8 = mh0.C25549a.m75123c(r8, r2, r7)
                if (r8 != r1) goto L53
                goto L5f
            L53:
                r7.f100183y = r6
                r7.f100181w = r6
                r7.f100182x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L60
            L5f:
                return r1
            L60:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C25549a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mh0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor$interact$2", m100430f = "StartTurnButtonInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmh0/e;", "state", "Lmh0/a$a;", "result", "<anonymous>", "(Lmh0/e;Lmh0/a$a;)Lmh0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100185w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100186x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100187y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C25553e c25553e, a aVar, InterfaceC30057d<? super C25553e> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f100186x = c25553e;
            fVar.f100187y = aVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C25553e c25553e = (C25553e) this.f100186x;
            a aVar = (a) this.f100187y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100185w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.c) {
                return c25553e.m75137a(false, null);
            }
            if (aVar instanceof a.d) {
                return c25553e.m75137a(false, ((a.d) aVar).getTurnId());
            }
            if (aVar instanceof a.b) {
                return c25553e.m75137a(true, null);
            }
            if (aVar instanceof a.C41997a) {
                return C25553e.m75136b(c25553e, false, null, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C25549a(StartTurnApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m75125e(ApiRequest apiRequest, InterfaceC30057d<? super a> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f100167E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f100167E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f100170y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f100167E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (apiRequest.getMethod() != GenericHttpMethod.POST) {
                this.logger.mo85225p("StartTurnButton", "startTurn request must use POST. path=" + apiRequest.getPath() + " method=" + apiRequest.getMethod(), new AbstractC30556a.a[0]);
                return a.b.f100164a;
            }
            JsonElement body = apiRequest.getBody();
            if (body == null) {
                body = new JsonObject(C25272z.f99163w);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(apiRequest, body, null);
            bVar2.f100168w = apiRequest;
            bVar2.f100169x = null;
            bVar2.f100167E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "StartTurnButton fire failed", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiRequest = (ApiRequest) bVar2.f100168w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return a.b.f100164a;
            }
            throw new NoWhenBranchMatchedException();
        }
        StartTurnResponse startTurnResponse = (StartTurnResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        String turnId = startTurnResponse != null ? startTurnResponse.getTurnId() : null;
        if (turnId != null) {
            return new a.d(turnId);
        }
        this.logger.mo85225p("StartTurnButton", AbstractC11266d.m30461o("startTurn returned no turn_id. path=", apiRequest.getPath()), new AbstractC30556a.a[0]);
        return a.b.f100164a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C25553e(false, null, 3, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new f(null));
    }

    public /* synthetic */ C25549a(StartTurnApi startTurnApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(startTurnApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StartTurnButtonInteractor") : interfaceC34116n);
    }
}
