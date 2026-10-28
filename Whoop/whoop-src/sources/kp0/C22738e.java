package kp0;

import android.content.Context;
import android.content.SharedPreferences;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import in2.InterfaceC18732d;
import l83.C23454a0;
import org.joda.time.Instant;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: kp0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lkp0/e;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "log", "<init>", "(Landroid/content/SharedPreferences;Lin2/d;Ltr2/n;)V", "Lorg/joda/time/Instant;", "b", "(Lq83/d;)Ljava/lang/Object;", "instant", "Ll83/a0;", "c", "(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/SharedPreferences;", "Lin2/d;", "Ltr2/n;", "d", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22738e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f89418e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: kp0.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lkp0/e$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "log", "Lkp0/e;", "a", "(Landroid/content/Context;Lin2/d;Ltr2/n;)Lkp0/e;", "", "NAME", "Ljava/lang/String;", "KEY_UNTIL", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C22738e m65824a(Context context, InterfaceC18732d dispatcherFactory, InterfaceC34116n log) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
            AbstractC22676k.m65750j(log, "log");
            SharedPreferences sharedPreferences = context.getSharedPreferences("lasthighfreqsyncstore", 0);
            AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
            return new C22738e(sharedPreferences, dispatcherFactory, log);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kp0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.harvard.HighFrequencySyncModeStateHolder", m100430f = "HighFrequencySyncModeStateHolder.kt", m100431l = {26}, m100432m = "inHighFreqSyncModeUntil", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f89422w;

        /* JADX INFO: renamed from: y */
        int f89424y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89422w = obj;
            this.f89424y |= Integer.MIN_VALUE;
            return C22738e.this.m65822b(this);
        }
    }

    /* JADX INFO: renamed from: kp0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.harvard.HighFrequencySyncModeStateHolder$inHighFreqSyncModeUntil$2", m100430f = "HighFrequencySyncModeStateHolder.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lorg/joda/time/Instant;", "<anonymous>", "(Lbc3/c0;)Lorg/joda/time/Instant;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89425w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22738e.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Instant> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f89425w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new Instant(C22738e.this.sharedPreferences.getLong("keytimestampuntilhifreq", 0L));
        }
    }

    /* JADX INFO: renamed from: kp0.e$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.harvard.HighFrequencySyncModeStateHolder", m100430f = "HighFrequencySyncModeStateHolder.kt", m100431l = {36}, m100432m = "setInHighFreqUntil", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f89427w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89428x;

        /* JADX INFO: renamed from: z */
        int f89430z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89428x = obj;
            this.f89430z |= Integer.MIN_VALUE;
            return C22738e.this.m65823c(null, this);
        }
    }

    /* JADX INFO: renamed from: kp0.e$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.harvard.HighFrequencySyncModeStateHolder$setInHighFreqUntil$2", m100430f = "HighFrequencySyncModeStateHolder.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89431w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Instant f89433y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Instant instant, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89433y = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22738e.this.new e(this.f89433y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f89431w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SharedPreferences sharedPreferences = C22738e.this.sharedPreferences;
            Instant instant = this.f89433y;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("keytimestampuntilhifreq", instant.getMillis());
            editorEdit.apply();
            return C23454a0.f92919a;
        }
    }

    public C22738e(SharedPreferences sharedPreferences, InterfaceC18732d dispatcherFactory, InterfaceC34116n log) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(log, "log");
        this.sharedPreferences = sharedPreferences;
        this.dispatcherFactory = dispatcherFactory;
        this.log = log;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m65822b(InterfaceC30057d<? super Instant> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f89424y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f89424y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f89422w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f89424y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                c cVar = new c(null);
                bVar.f89424y = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, cVar, bVar);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            return (Instant) objM8705K;
        } catch (Throwable unused) {
            Instant instant = Instant.EPOCH;
            AbstractC22676k.m65747g(instant);
            return instant;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m65823c(Instant instant, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f89430z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f89430z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f89428x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f89430z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                e eVar = new e(instant, null);
                dVar.f89427w = null;
                dVar.f89430z = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, eVar, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Throwable th3) {
            this.log.mo85215f("WakeWindow", "Failed to set in high freq until", th3, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }
}
