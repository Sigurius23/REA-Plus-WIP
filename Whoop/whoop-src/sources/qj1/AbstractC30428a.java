package qj1;

import android.os.RemoteException;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p030b7.InterfaceC2773b;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p322m7.InterfaceC25170r0;
import p359o7.C27626b;
import p396p7.C28952c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: qj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001e\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010#\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H¦@¢\u0006\u0004\b#\u0010$J \u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0086@¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lqj1/a;", "Lm7/r0;", "T", "", "Lj93/d;", "recordType", "", "tokenPrefixKey", "Lu92/d;", "sharedPreferences", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lj93/d;Ljava/lang/String;Lu92/d;Ljava/time/Clock;Ltr2/n;)V", "Ljava/time/Instant;", "startTime", "endTime", "Lb7/b;", "client", "", "isInitialImport", "isTokenRefreshImport", "i", "(Ljava/time/Instant;Ljava/time/Instant;Lb7/b;ZZLq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "block", "j", "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "", "records", "deletions", "g", "(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;", "", "pullDataFromDays", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lb7/b;JLq83/d;)Ljava/lang/Object;", "a", "Lj93/d;", "b", "Ljava/lang/String;", "c", "Lu92/d;", "d", "Ljava/time/Clock;", "e", "Ltr2/n;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30428a<T extends InterfaceC25170r0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21461d recordType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String tokenPrefixKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qj1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager$readNewRecords$2", m100430f = "HealthConnectBaseManager.kt", m100431l = {48, 58, 63, 65, 72, 74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC30428a<T> f124974E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f124975F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C22659b0 f124976G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Instant f124977H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC2773b f124978I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C22665e0 f124979J;

        /* JADX INFO: renamed from: w */
        Object f124980w;

        /* JADX INFO: renamed from: x */
        Object f124981x;

        /* JADX INFO: renamed from: y */
        Object f124982y;

        /* JADX INFO: renamed from: z */
        int f124983z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC30428a<T> abstractC30428a, String str, C22659b0 c22659b0, Instant instant, InterfaceC2773b interfaceC2773b, C22665e0 c22665e0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f124974E = abstractC30428a;
            this.f124975F = str;
            this.f124976G = c22659b0;
            this.f124977H = instant;
            this.f124978I = interfaceC2773b;
            this.f124979J = c22665e0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f124974E, this.f124975F, this.f124976G, this.f124977H, this.f124978I, this.f124979J, interfaceC30057d);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0241 -> B:68:0x0242). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type q83.d to qj1.a$a for r17v1 'this'  q83.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 658
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.AbstractC30428a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qj1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager", m100430f = "HealthConnectBaseManager.kt", m100431l = {105, 111}, m100432m = "readRecordByTimeRange", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f124984E;

        /* JADX INFO: renamed from: F */
        boolean f124985F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f124986G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ AbstractC30428a<T> f124987H;

        /* JADX INFO: renamed from: I */
        int f124988I;

        /* JADX INFO: renamed from: w */
        Object f124989w;

        /* JADX INFO: renamed from: x */
        Object f124990x;

        /* JADX INFO: renamed from: y */
        Object f124991y;

        /* JADX INFO: renamed from: z */
        Object f124992z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC30428a<T> abstractC30428a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
            this.f124987H = abstractC30428a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124986G = obj;
            this.f124988I |= Integer.MIN_VALUE;
            return this.f124987H.m93047i(null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: qj1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager", m100430f = "HealthConnectBaseManager.kt", m100431l = {120}, m100432m = "tryHealthConnectOperation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f124993w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124994x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30428a<T> f124995y;

        /* JADX INFO: renamed from: z */
        int f124996z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC30428a<T> abstractC30428a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
            this.f124995y = abstractC30428a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124994x = obj;
            this.f124996z |= Integer.MIN_VALUE;
            return this.f124995y.m93048j(null, this);
        }
    }

    public AbstractC30428a(InterfaceC21461d recordType, String tokenPrefixKey, C34660d sharedPreferences, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(recordType, "recordType");
        AbstractC22676k.m65750j(tokenPrefixKey, "tokenPrefixKey");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.recordType = recordType;
        this.tokenPrefixKey = tokenPrefixKey;
        this.sharedPreferences = sharedPreferences;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m93047i(Instant instant, Instant instant2, InterfaceC2773b interfaceC2773b, boolean z4, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f124988I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f124988I = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, interfaceC30057d);
            }
        } else {
            bVar = new b(this, interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objMo7837a = bVar2.f124986G;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f124988I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo7837a);
            C27626b c27626b = new C27626b(this.recordType, AbstractC3511b.m10379h(instant, instant2));
            bVar2.f124989w = null;
            bVar2.f124990x = null;
            bVar2.f124991y = null;
            bVar2.f124984E = z4;
            bVar2.f124985F = z13;
            bVar2.f124988I = 1;
            objMo7837a = interfaceC2773b.mo7837a(c27626b, bVar2);
            if (objMo7837a != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo7837a);
            return objMo7837a;
        }
        z13 = bVar2.f124985F;
        z4 = bVar2.f124984E;
        AbstractC34132o.m107864I(objMo7837a);
        List<? extends T> listM87911a = ((C28952c) objMo7837a).m87911a();
        bVar2.f124989w = null;
        bVar2.f124990x = null;
        bVar2.f124991y = null;
        bVar2.f124992z = null;
        bVar2.f124984E = z4;
        bVar2.f124985F = z13;
        bVar2.f124988I = 2;
        Object objMo93049g = mo93049g(listM87911a, C25271y.f99162w, z4, z13, bVar2);
        return objMo93049g == obj ? obj : objMo93049g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m93048j(Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f124996z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f124996z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, interfaceC30057d);
            }
        } else {
            cVar = new c(this, interfaceC30057d);
        }
        Object obj = cVar.f124994x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f124996z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                cVar.f124993w = null;
                cVar.f124996z = 1;
                if (function1.invoke(cVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (RemoteException e5) {
            this.logger.mo85230v("IPC Failures", e5, new AbstractC30556a.a[0]);
        } catch (IOException e13) {
            this.logger.mo85230v("Input/Output error", e13, new AbstractC30556a.a[0]);
        } catch (IllegalStateException e14) {
            this.logger.mo85230v("Google Health Connect not available", e14, new AbstractC30556a.a[0]);
        } catch (SecurityException unused) {
            this.logger.mo85222m("Lack of required permissions for " + this.recordType, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo93049g(List<? extends T> list, List<String> list2, boolean z4, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    public final Object m93050h(InterfaceC2773b interfaceC2773b, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM93048j = m93048j(new a(this, AbstractC2875y.m8299l(this.tokenPrefixKey, "_changes_token"), new C22659b0(), Instant.now(this.clock).minus(j7, (TemporalUnit) ChronoUnit.DAYS), interfaceC2773b, new C22665e0(), null), interfaceC30057d);
        return objM93048j == EnumC31071a.f128113w ? objM93048j : C23454a0.f92919a;
    }
}
