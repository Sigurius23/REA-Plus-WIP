package za2;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fb2.AbstractC14337a;
import fb2.C14338b;
import fb2.InterfaceC14339c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import od1.InterfaceC27844g;
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
import vc2.AbstractC35878a;
import vc2.AbstractC35880c;
import vc2.C35879b;

/* JADX INFO: renamed from: za2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\" B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lza2/d;", "Lod1/g;", "Lza2/o;", "Lza2/e;", "Lza2/k;", "settingBannerInteractor", "Lvc2/b;", "billingInteractor", "Lfb2/b;", "upsellModalInteractor", "<init>", "(Lza2/k;Lvc2/b;Lfb2/b;)V", "Lec3/l;", "upstream", "Lza2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Lza2/b;", "k", "(Lza2/o;)Lza2/b;", "Lvc2/c;", "g", "Lvc2/a;", "j", "(Lza2/o;)Lvc2/a;", "Lfb2/c;", "i", "Lfb2/a;", "l", "(Lza2/o;)Lfb2/a;", "interact", "a", "Lza2/k;", "b", "Lvc2/b;", "c", "Lfb2/b;", "Lec3/o1;", "d", "Lec3/o1;", "internalActions", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40228d implements InterfaceC27844g<AbstractC40239o, InterfaceC40229e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40235k settingBannerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35879b billingInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14338b upsellModalInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13072o1 internalActions;

    /* JADX INFO: renamed from: za2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lza2/d$b;", "", "a", "b", "Lza2/d$b$a;", "Lza2/d$b$b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {

        /* JADX INFO: renamed from: za2.d$b$a */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lza2/d$b$a;", "Lza2/d$b;", "Lza2/f;", "state", "<init>", "(Lza2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lza2/f;", "()Lza2/f;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC40230f state;

            public a(AbstractC40230f state) {
                AbstractC22676k.m65750j(state, "state");
                this.state = state;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC40230f getState() {
                return this.state;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.state, ((a) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Base(state=" + this.state + ")";
            }
        }

        /* JADX INFO: renamed from: za2.d$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lza2/d$b$b;", "Lza2/d$b;", "Lfb2/c;", "result", "<init>", "(Lfb2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfb2/c;", "()Lfb2/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42728b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC14339c result;

            public C42728b(InterfaceC14339c result) {
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC14339c getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42728b) && AbstractC22676k.m65745e(this.result, ((C42728b) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Upsell(result=" + this.result + ")";
            }
        }
    }

    /* JADX INFO: renamed from: za2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173797w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40228d f173798x;

        /* JADX INFO: renamed from: za2.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173799w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40228d f173800x;

            /* JADX INFO: renamed from: za2.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$billingInteractor$$inlined$mapNotNull$1$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42729a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173801E;

                /* JADX INFO: renamed from: F */
                Object f173802F;

                /* JADX INFO: renamed from: G */
                Object f173803G;

                /* JADX INFO: renamed from: H */
                Object f173804H;

                /* JADX INFO: renamed from: I */
                int f173805I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173806w;

                /* JADX INFO: renamed from: x */
                int f173807x;

                /* JADX INFO: renamed from: y */
                Object f173808y;

                public C42729a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173806w = obj;
                    this.f173807x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40228d c40228d) {
                this.f173799w = interfaceC13062m;
                this.f173800x = c40228d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42729a c42729a;
                if (interfaceC30057d instanceof C42729a) {
                    c42729a = (C42729a) interfaceC30057d;
                    int i13 = c42729a.f173807x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42729a.f173807x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42729a = new C42729a(interfaceC30057d);
                    }
                } else {
                    c42729a = new C42729a(interfaceC30057d);
                }
                Object obj2 = c42729a.f173806w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42729a.f173807x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173799w;
                    AbstractC35878a abstractC35878aM129165j = this.f173800x.m129165j((AbstractC40239o) obj);
                    if (abstractC35878aM129165j != null) {
                        c42729a.f173808y = null;
                        c42729a.f173801E = null;
                        c42729a.f173802F = null;
                        c42729a.f173803G = null;
                        c42729a.f173804H = null;
                        c42729a.f173805I = 0;
                        c42729a.f173807x = 1;
                        if (interfaceC13062m.emit(abstractC35878aM129165j, c42729a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C40228d c40228d) {
            this.f173797w = interfaceC13058l;
            this.f173798x = c40228d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173797w.collect(new a(interfaceC13062m, this.f173798x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$billingInteractor$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvc2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173810w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173811x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f173811x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173811x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC35880c.c cVar = AbstractC35880c.c.f152797a;
                this.f173811x = null;
                this.f173810w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173812w;

        /* JADX INFO: renamed from: za2.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173813w;

            /* JADX INFO: renamed from: za2.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$$inlined$map$1$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42730a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173814E;

                /* JADX INFO: renamed from: F */
                Object f173815F;

                /* JADX INFO: renamed from: G */
                Object f173816G;

                /* JADX INFO: renamed from: H */
                int f173817H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173818w;

                /* JADX INFO: renamed from: x */
                int f173819x;

                /* JADX INFO: renamed from: y */
                Object f173820y;

                public C42730a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173818w = obj;
                    this.f173819x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173813w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42730a c42730a;
                if (interfaceC30057d instanceof C42730a) {
                    c42730a = (C42730a) interfaceC30057d;
                    int i13 = c42730a.f173819x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42730a.f173819x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42730a = new C42730a(interfaceC30057d);
                    }
                } else {
                    c42730a = new C42730a(interfaceC30057d);
                }
                Object obj2 = c42730a.f173818w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42730a.f173819x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173813w;
                    b.a aVar = new b.a((AbstractC40230f) obj);
                    c42730a.f173820y = null;
                    c42730a.f173814E = null;
                    c42730a.f173815F = null;
                    c42730a.f173816G = null;
                    c42730a.f173817H = 0;
                    c42730a.f173819x = 1;
                    if (interfaceC13062m.emit(aVar, c42730a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f173812w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173812w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173822w;

        /* JADX INFO: renamed from: za2.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173823w;

            /* JADX INFO: renamed from: za2.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$$inlined$map$2$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42731a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173824E;

                /* JADX INFO: renamed from: F */
                Object f173825F;

                /* JADX INFO: renamed from: G */
                Object f173826G;

                /* JADX INFO: renamed from: H */
                int f173827H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173828w;

                /* JADX INFO: renamed from: x */
                int f173829x;

                /* JADX INFO: renamed from: y */
                Object f173830y;

                public C42731a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173828w = obj;
                    this.f173829x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173823w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42731a c42731a;
                if (interfaceC30057d instanceof C42731a) {
                    c42731a = (C42731a) interfaceC30057d;
                    int i13 = c42731a.f173829x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42731a.f173829x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42731a = new C42731a(interfaceC30057d);
                    }
                } else {
                    c42731a = new C42731a(interfaceC30057d);
                }
                Object obj2 = c42731a.f173828w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42731a.f173829x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173823w;
                    b.C42728b c42728b = new b.C42728b((InterfaceC14339c) obj);
                    c42731a.f173830y = null;
                    c42731a.f173824E = null;
                    c42731a.f173825F = null;
                    c42731a.f173826G = null;
                    c42731a.f173827H = 0;
                    c42731a.f173829x = 1;
                    if (interfaceC13062m.emit(c42728b, c42731a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f173822w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173822w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173832w;

        /* JADX INFO: renamed from: za2.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173833w;

            /* JADX INFO: renamed from: za2.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$$inlined$mapNotNull$1$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42732a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173834E;

                /* JADX INFO: renamed from: F */
                Object f173835F;

                /* JADX INFO: renamed from: G */
                Object f173836G;

                /* JADX INFO: renamed from: H */
                Object f173837H;

                /* JADX INFO: renamed from: I */
                int f173838I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173839w;

                /* JADX INFO: renamed from: x */
                int f173840x;

                /* JADX INFO: renamed from: y */
                Object f173841y;

                public C42732a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173839w = obj;
                    this.f173840x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173833w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42732a c42732a;
                if (interfaceC30057d instanceof C42732a) {
                    c42732a = (C42732a) interfaceC30057d;
                    int i13 = c42732a.f173840x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42732a.f173840x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42732a = new C42732a(interfaceC30057d);
                    }
                } else {
                    c42732a = new C42732a(interfaceC30057d);
                }
                Object obj2 = c42732a.f173839w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42732a.f173840x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173833w;
                    InterfaceC40229e output = ((a) obj).getOutput();
                    if (output != null) {
                        c42732a.f173841y = null;
                        c42732a.f173834E = null;
                        c42732a.f173835F = null;
                        c42732a.f173836G = null;
                        c42732a.f173837H = null;
                        c42732a.f173838I = 0;
                        c42732a.f173840x = 1;
                        if (interfaceC13062m.emit(output, c42732a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f173832w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173832w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$1", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lza2/d$a;", "accumulator", "Lza2/d$b;", "emission", "<anonymous>", "(Lza2/d$a;Lza2/d$b;)Lza2/d$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f173843w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f173844x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f173845y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f173844x = aVar;
            hVar.f173845y = bVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f173844x;
            b bVar = (b) this.f173845y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173843w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return aVar.m129172d(bVar);
        }
    }

    /* JADX INFO: renamed from: za2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$base$1", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lza2/f;", "settingsBannerDomainState", "Lvc2/c;", "switchModalResult", "<anonymous>", "(Lza2/f;Lvc2/c;)Lza2/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f173846w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f173847x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f173848y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC40230f abstractC40230f, AbstractC35880c abstractC35880c, InterfaceC30057d<? super AbstractC40230f> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f173847x = abstractC40230f;
            iVar.f173848y = abstractC35880c;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC40230f abstractC40230f = (AbstractC40230f) this.f173847x;
            AbstractC35880c abstractC35880c = (AbstractC35880c) this.f173848y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173846w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC40230f.b bVar = AbstractC40230f.b.f173883a;
            if (AbstractC22676k.m65745e(abstractC40230f, bVar)) {
                return bVar;
            }
            if (abstractC40230f instanceof AbstractC40230f.a) {
                return AbstractC40230f.a.f173882a;
            }
            if (abstractC40230f instanceof AbstractC40230f.c) {
                return AbstractC40230f.c.m129180b((AbstractC40230f.c) abstractC40230f, null, abstractC35880c, null, false, null, 29, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: za2.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$upsell$1", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lfb2/c;", "result", "Ll83/a0;", "<anonymous>", "(Lfb2/c;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173849w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f173850x;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C40228d.this.new j(interfaceC30057d);
            jVar.f173850x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14339c interfaceC14339c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC14339c, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14339c interfaceC14339c = (InterfaceC14339c) this.f173850x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173849w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (interfaceC14339c instanceof InterfaceC14339c.c) {
                    InterfaceC13072o1 interfaceC13072o1 = C40228d.this.internalActions;
                    AbstractC40226b.a aVar = AbstractC40226b.a.f173731a;
                    this.f173850x = null;
                    this.f173849w = 1;
                    if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.d$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173852w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40228d f173853x;

        /* JADX INFO: renamed from: za2.d$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173854w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40228d f173855x;

            /* JADX INFO: renamed from: za2.d$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$settingsInteractor$$inlined$mapNotNull$1$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42733a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173856E;

                /* JADX INFO: renamed from: F */
                Object f173857F;

                /* JADX INFO: renamed from: G */
                Object f173858G;

                /* JADX INFO: renamed from: H */
                Object f173859H;

                /* JADX INFO: renamed from: I */
                int f173860I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173861w;

                /* JADX INFO: renamed from: x */
                int f173862x;

                /* JADX INFO: renamed from: y */
                Object f173863y;

                public C42733a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173861w = obj;
                    this.f173862x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40228d c40228d) {
                this.f173854w = interfaceC13062m;
                this.f173855x = c40228d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42733a c42733a;
                if (interfaceC30057d instanceof C42733a) {
                    c42733a = (C42733a) interfaceC30057d;
                    int i13 = c42733a.f173862x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42733a.f173862x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42733a = new C42733a(interfaceC30057d);
                    }
                } else {
                    c42733a = new C42733a(interfaceC30057d);
                }
                Object obj2 = c42733a.f173861w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42733a.f173862x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173854w;
                    AbstractC40226b abstractC40226bM129166k = this.f173855x.m129166k((AbstractC40239o) obj);
                    if (abstractC40226bM129166k != null) {
                        c42733a.f173863y = null;
                        c42733a.f173856E = null;
                        c42733a.f173857F = null;
                        c42733a.f173858G = null;
                        c42733a.f173859H = null;
                        c42733a.f173860I = 0;
                        c42733a.f173862x = 1;
                        if (interfaceC13062m.emit(abstractC40226bM129166k, c42733a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l, C40228d c40228d) {
            this.f173852w = interfaceC13058l;
            this.f173853x = c40228d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173852w.collect(new a(interfaceC13062m, this.f173853x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.d$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$settingsInteractor$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173865w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173866x;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f173866x = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173866x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173865w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC40230f.b bVar = AbstractC40230f.b.f173883a;
                this.f173866x = null;
                this.f173865w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.d$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173867w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40228d f173868x;

        /* JADX INFO: renamed from: za2.d$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173869w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40228d f173870x;

            /* JADX INFO: renamed from: za2.d$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$upsellModalInteractor$$inlined$mapNotNull$1$2", m100430f = "SettingsBannerDomainCombiner.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42734a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173871E;

                /* JADX INFO: renamed from: F */
                Object f173872F;

                /* JADX INFO: renamed from: G */
                Object f173873G;

                /* JADX INFO: renamed from: H */
                Object f173874H;

                /* JADX INFO: renamed from: I */
                int f173875I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173876w;

                /* JADX INFO: renamed from: x */
                int f173877x;

                /* JADX INFO: renamed from: y */
                Object f173878y;

                public C42734a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173876w = obj;
                    this.f173877x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40228d c40228d) {
                this.f173869w = interfaceC13062m;
                this.f173870x = c40228d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42734a c42734a;
                if (interfaceC30057d instanceof C42734a) {
                    c42734a = (C42734a) interfaceC30057d;
                    int i13 = c42734a.f173877x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42734a.f173877x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42734a = new C42734a(interfaceC30057d);
                    }
                } else {
                    c42734a = new C42734a(interfaceC30057d);
                }
                Object obj2 = c42734a.f173876w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42734a.f173877x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173869w;
                    AbstractC14337a abstractC14337aM129167l = this.f173870x.m129167l((AbstractC40239o) obj);
                    if (abstractC14337aM129167l != null) {
                        c42734a.f173878y = null;
                        c42734a.f173871E = null;
                        c42734a.f173872F = null;
                        c42734a.f173873G = null;
                        c42734a.f173874H = null;
                        c42734a.f173875I = 0;
                        c42734a.f173877x = 1;
                        if (interfaceC13062m.emit(abstractC14337aM129167l, c42734a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l, C40228d c40228d) {
            this.f173867w = interfaceC13058l;
            this.f173868x = c40228d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173867w.collect(new a(interfaceC13062m, this.f173868x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C40228d(C40235k settingBannerInteractor, C35879b billingInteractor, C14338b upsellModalInteractor) {
        AbstractC22676k.m65750j(settingBannerInteractor, "settingBannerInteractor");
        AbstractC22676k.m65750j(billingInteractor, "billingInteractor");
        AbstractC22676k.m65750j(upsellModalInteractor, "upsellModalInteractor");
        this.settingBannerInteractor = settingBannerInteractor;
        this.billingInteractor = billingInteractor;
        this.upsellModalInteractor = upsellModalInteractor;
        this.internalActions = AbstractC13091v.m36592b(0, 1, null, 5);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m129162g(InterfaceC13058l upstream) {
        return new C13015a0(new d(null), AbstractC27845h.m83945a(new c(upstream, this), this.billingInteractor));
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m129163h(InterfaceC13058l upstream) {
        return new C13015a0(new l(null), AbstractC27845h.m83945a(AbstractC13091v.m36584J(new k(upstream, this), this.internalActions), this.settingBannerInteractor));
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m129164i(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(new m(upstream, this), this.upsellModalInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final AbstractC35878a m129165j(AbstractC40239o event) {
        if (event instanceof AbstractC40239o.c) {
            return new AbstractC35878a.a(((AbstractC40239o.c) event).getSubscriptionPlan());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC40226b m129166k(AbstractC40239o event) {
        if (event instanceof AbstractC40239o.g) {
            return AbstractC40226b.c.f173733a;
        }
        if (event instanceof AbstractC40239o.d) {
            return AbstractC40226b.a.f173731a;
        }
        if (event instanceof AbstractC40239o.b) {
            return new AbstractC40226b.b(((AbstractC40239o.b) event).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC14337a m129167l(AbstractC40239o event) {
        if (event instanceof AbstractC40239o.f) {
            return new AbstractC14337a.c(((AbstractC40239o.f) event).getModal());
        }
        if (event instanceof AbstractC40239o.a) {
            return AbstractC14337a.a.f52356a;
        }
        if (event instanceof AbstractC40239o.e) {
            return new AbstractC14337a.b(((AbstractC40239o.e) event).getAction());
        }
        return null;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new g(new C13060l1(new a(null, null, null, 7, null), AbstractC13091v.m36584J(new e(new C13060l1(m129163h(upstream), m129162g(upstream), new i(null), 1)), new f(new C13052j1(m129164i(upstream), new j(null), 0))), new h(null)));
    }

    /* JADX INFO: renamed from: za2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lza2/d$a;", "", "Lza2/f;", "base", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lza2/e;", "output", "<init>", "(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)V", "e", "()Lza2/d$a;", "Lza2/d$b;", "emission", "d", "(Lza2/d$b;)Lza2/d$a;", "a", "(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)Lza2/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lza2/f;", "getBase", "()Lza2/f;", "b", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "()Lcom/whoop/design/models/modal/AnyModal;", "c", "Lza2/e;", "()Lza2/e;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC40230f base;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AnyModal modal;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC40229e output;

        public a(AbstractC40230f base, AnyModal anyModal, InterfaceC40229e interfaceC40229e) {
            AbstractC22676k.m65750j(base, "base");
            this.base = base;
            this.modal = anyModal;
            this.output = interfaceC40229e;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m129168b(a aVar, AbstractC40230f abstractC40230f, AnyModal anyModal, InterfaceC40229e interfaceC40229e, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC40230f = aVar.base;
            }
            if ((i13 & 2) != 0) {
                anyModal = aVar.modal;
            }
            if ((i13 & 4) != 0) {
                interfaceC40229e = aVar.output;
            }
            return aVar.m129170a(abstractC40230f, anyModal, interfaceC40229e);
        }

        /* JADX INFO: renamed from: e */
        private final a m129169e() {
            AbstractC40230f abstractC40230fM129180b;
            AbstractC40230f abstractC40230f = this.base;
            AbstractC40230f.c cVar = abstractC40230f instanceof AbstractC40230f.c ? (AbstractC40230f.c) abstractC40230f : null;
            if (cVar == null || (abstractC40230fM129180b = AbstractC40230f.c.m129180b(cVar, null, null, null, false, this.modal, 15, null)) == null) {
                abstractC40230fM129180b = this.base;
            }
            return m129168b(this, null, null, new InterfaceC40229e.b(abstractC40230fM129180b), 3, null);
        }

        /* JADX INFO: renamed from: a */
        public final a m129170a(AbstractC40230f base, AnyModal modal, InterfaceC40229e output) {
            AbstractC22676k.m65750j(base, "base");
            return new a(base, modal, output);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC40229e getOutput() {
            return this.output;
        }

        /* JADX INFO: renamed from: d */
        public final a m129172d(b emission) {
            AbstractC22676k.m65750j(emission, "emission");
            if (emission instanceof b.a) {
                return m129168b(this, ((b.a) emission).getState(), null, null, 6, null).m129169e();
            }
            if (!(emission instanceof b.C42728b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14339c result = ((b.C42728b) emission).getResult();
            if (result instanceof InterfaceC14339c.a) {
                return m129168b(this, null, ((InterfaceC14339c.a) result).getModal(), null, 5, null).m129169e();
            }
            if (result instanceof InterfaceC14339c.b) {
                return m129168b(this, null, null, new InterfaceC40229e.a(new InterfaceC40231g.a(((InterfaceC14339c.b) result).getDestination())), 3, null);
            }
            if (AbstractC22676k.m65745e(result, InterfaceC14339c.c.f52390a)) {
                return m129168b(this, null, null, null, 3, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.base, aVar.base) && AbstractC22676k.m65745e(this.modal, aVar.modal) && AbstractC22676k.m65745e(this.output, aVar.output);
        }

        public int hashCode() {
            int iHashCode = this.base.hashCode() * 31;
            AnyModal anyModal = this.modal;
            int iHashCode2 = (iHashCode + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
            InterfaceC40229e interfaceC40229e = this.output;
            return iHashCode2 + (interfaceC40229e != null ? interfaceC40229e.hashCode() : 0);
        }

        public String toString() {
            return "Accumulator(base=" + this.base + ", modal=" + this.modal + ", output=" + this.output + ")";
        }

        public /* synthetic */ a(AbstractC40230f abstractC40230f, AnyModal anyModal, InterfaceC40229e interfaceC40229e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC40230f.b.f173883a : abstractC40230f, (i13 & 2) != 0 ? null : anyModal, (i13 & 4) != 0 ? null : interfaceC40229e);
        }
    }
}
