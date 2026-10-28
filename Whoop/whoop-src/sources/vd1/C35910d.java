package vd1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.C6656c;
import com.whoop.domain.exception.ConnectivityException;
import ek0.AbstractC13296u;
import f82.EnumC14250a;
import f82.EnumC14251b;
import f82.InterfaceC14252c;
import f83.AbstractC14258f;
import fk2.C14554a;
import g82.InterfaceC15574a;
import g83.AbstractC15583i;
import g83.C15578d;
import g83.C15582h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kh3.C22488a;
import l73.AbstractC23410a;
import l73.AbstractC23416g;
import l83.C23454a0;
import lt0.EnumC24728e;
import n73.C26442a;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import ot0.C28323a;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t73.C33589b;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import v73.C35779e;
import v73.C35783i;
import vb1.C35868a;
import w73.C36921g;
import w73.C36930p;
import xj0.AbstractC38356i0;
import z73.C40164a;
import zj0.C40727h;
import zj0.C40733j;
import zj0.C40742m;
import zj0.C40749p0;
import zj0.C40761v0;

/* JADX INFO: renamed from: vd1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ!\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\"\u00105\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00140\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\"\u00109\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010707068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m65681d2 = {"Lvd1/d;", "Lf82/c;", "Ltd1/b;", "whoopStrapProxy", "Lg82/a;", "smartAlarmDiagnosticDbHelper", "<init>", "(Ltd1/b;Lg82/a;)V", "Ll83/a0;", "F", "()V", "x", "C", "u", "Lzj0/h;", "commandResponsePacket", "Llt0/e;", "commandNumber", "v", "(Lzj0/h;Llt0/e;)V", "Lot0/a;", "eventPacket", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lot0/a;)V", "", "timeStampMillis", "Lzj0/v0;", "e", "(JLq83/d;)Ljava/lang/Object;", "Lzj0/m;", "g", "(Lq83/d;)Ljava/lang/Object;", "Lf82/b;", "smartAlarmTrigger", "Lzj0/p0;", "d", "(Lf82/b;Lq83/d;)Ljava/lang/Object;", "Lzj0/j;", "a", "", "durationSeconds", "", "b", "(ILq83/d;)Ljava/lang/Object;", "c", "Ltd1/b;", "Lg82/a;", "Ltr2/n;", "Ltr2/n;", "logger", "Lg83/d;", "kotlin.jvm.PlatformType", "Lg83/d;", "strapAlarmEventsPubSub", "Lg83/i;", "Lek0/u;", "Lg83/i;", "highFreqSyncEventsPubSub", "Ln73/a;", "f", "Ln73/a;", "disposables", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35910d implements InterfaceC14252c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC15574a smartAlarmDiagnosticDbHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15578d strapAlarmEventsPubSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC15583i highFreqSyncEventsPubSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C26442a disposables;

    /* JADX INFO: renamed from: vd1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152888a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f152889b;

        static {
            int[] iArr = new int[EnumC33707e.values().length];
            try {
                iArr[EnumC33707e.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33707e.CONNECTION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33707e.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f152888a = iArr;
            int[] iArr2 = new int[C28323a.b.values().length];
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_EXECUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C28323a.b.APP_DRIVEN_ALARM_EXECUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f152889b = iArr2;
        }
    }

    /* JADX INFO: renamed from: vd1.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$disableAlarm$2", m100430f = "StrapAlarmSdkImpl.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/j;", "<anonymous>", "(Lbc3/c0;)Lzj0/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152890w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35910d.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40733j> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152890w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35910d.this.logger.mo85232x("WakeWindow", "Sending disableAlarm command to the strap", new AbstractC30556a.a[0]);
                InterfaceC33704b interfaceC33704b = C35910d.this.whoopStrapProxy;
                this.f152890w = 1;
                obj = interfaceC33704b.mo106488a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C40733j c40733j = (C40733j) obj;
            C35910d.this.m114068v(c40733j, EnumC24728e.DISABLE_ALARM);
            C35910d.this.smartAlarmDiagnosticDbHelper.mo43871b(EnumC14250a.PHONE_DISABLED_ALARM, null, "", c40733j, c40733j != null ? c40733j.m132198W() : false);
            return c40733j;
        }
    }

    /* JADX INFO: renamed from: vd1.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$getAlarmTime$2", m100430f = "StrapAlarmSdkImpl.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/m;", "<anonymous>", "(Lbc3/c0;)Lzj0/m;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152892w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35910d.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40742m> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152892w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35910d.this.logger.mo85232x("WakeWindow", "Sending getAlarm command to the strap", new AbstractC30556a.a[0]);
                InterfaceC33704b interfaceC33704b = C35910d.this.whoopStrapProxy;
                this.f152892w = 1;
                obj = interfaceC33704b.mo106494g(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C40742m c40742m = (C40742m) obj;
            if (c40742m != null) {
                DateTime dateTime = new DateTime(c40742m.m132186c0());
                String str = c40742m.m132230d0() ? "enabled" : "disabled";
                C35910d.this.logger.mo85232x("WakeWindow", "Strap alarm is " + str + " with time " + dateTime, new AbstractC30556a.a[0]);
            }
            C35910d.this.m114068v(c40742m, EnumC24728e.GET_ALARM_TIME);
            C35910d.this.smartAlarmDiagnosticDbHelper.mo43871b(EnumC14250a.PHONE_GET_ALARM_TIME, null, "", c40742m, c40742m != null ? c40742m.m132198W() : false);
            return c40742m;
        }
    }

    /* JADX INFO: renamed from: vd1.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$runAlarm$2", m100430f = "StrapAlarmSdkImpl.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/p0;", "<anonymous>", "(Lbc3/c0;)Lzj0/p0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152894w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC14251b f152896y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC14251b enumC14251b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152896y = enumC14251b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35910d.this.new d(this.f152896y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40749p0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152894w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35910d.this.logger.mo85232x("WakeWindow", "Sending runAlarm command to the strap", new AbstractC30556a.a[0]);
                InterfaceC33704b interfaceC33704b = C35910d.this.whoopStrapProxy;
                AbstractC38356i0.a aVar = AbstractC38356i0.a.f164274a;
                this.f152894w = 1;
                obj = interfaceC33704b.mo106506w(aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C40749p0 c40749p0 = (C40749p0) obj;
            C35910d.this.m114068v(c40749p0, EnumC24728e.RUN_ALARM);
            C35910d.this.smartAlarmDiagnosticDbHelper.mo43871b(EnumC14250a.PHONE_RUN_ALARM, this.f152896y, "", c40749p0, c40749p0 != null ? c40749p0.m132198W() : false);
            return c40749p0;
        }
    }

    /* JADX INFO: renamed from: vd1.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$setAlarm$2", m100430f = "StrapAlarmSdkImpl.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/v0;", "<anonymous>", "(Lbc3/c0;)Lzj0/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f152897E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C35910d f152898F;

        /* JADX INFO: renamed from: w */
        Object f152899w;

        /* JADX INFO: renamed from: x */
        Object f152900x;

        /* JADX INFO: renamed from: y */
        int f152901y;

        /* JADX INFO: renamed from: z */
        int f152902z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j7, C35910d c35910d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152897E = j7;
            this.f152898F = c35910d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f152897E, this.f152898F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40761v0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152902z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                DateTime dateTime = new DateTime(this.f152897E);
                int minutes = Minutes.minutesBetween(DateTime.now(), dateTime).getMinutes();
                this.f152898F.logger.mo85232x("WakeWindow", "Sending setAlarm command to the strap with time " + dateTime + ", which is in " + minutes + " minutes", new AbstractC30556a.a[0]);
                C14554a c14554a = new C14554a(this.f152897E, C14554a.c.MILLIS);
                InterfaceC33704b interfaceC33704b = this.f152898F.whoopStrapProxy;
                this.f152899w = null;
                this.f152900x = null;
                this.f152901y = minutes;
                this.f152902z = 1;
                obj = interfaceC33704b.mo106505u(c14554a, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C40761v0 c40761v0 = (C40761v0) obj;
            this.f152898F.m114068v(c40761v0, EnumC24728e.SET_ALARM_TIME);
            this.f152898F.smartAlarmDiagnosticDbHelper.mo43871b(EnumC14250a.PHONE_SET_ALARM_TIME, null, String.valueOf(this.f152897E), c40761v0, c40761v0 != null ? c40761v0.m132198W() : false);
            return c40761v0;
        }
    }

    public C35910d(InterfaceC33704b whoopStrapProxy, InterfaceC15574a smartAlarmDiagnosticDbHelper) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(smartAlarmDiagnosticDbHelper, "smartAlarmDiagnosticDbHelper");
        this.whoopStrapProxy = whoopStrapProxy;
        this.smartAlarmDiagnosticDbHelper = smartAlarmDiagnosticDbHelper;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("StrapAlarmSdkImpl");
        this.strapAlarmEventsPubSub = new C15578d();
        this.highFreqSyncEventsPubSub = new C15582h(new C15578d());
        this.disposables = new C26442a();
        m114048F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m114043A(C35910d c35910d, C28323a c28323a) {
        c35910d.strapAlarmEventsPubSub.onNext(c28323a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m114044B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    private final void m114045C() {
        AbstractC23410a abstractC23410aMo106495h = this.whoopStrapProxy.mo106495h();
        abstractC23410aMo106495h.getClass();
        C35783i c35783i = new C35783i(abstractC23410aMo106495h);
        AbstractC23416g abstractC23416g = AbstractC14258f.f52051b;
        int i13 = AbstractC23410a.f92767w;
        AbstractC31056a.m95616a(abstractC23416g, "scheduler is null");
        AbstractC31056a.m95617b(i13, "bufferSize");
        C35779e c35779e = new C35779e(c35783i, abstractC23416g, i13);
        C40164a c40164a = new C40164a(new C6656c(new C35908b(this, 1), 28));
        c35779e.m67903a(c40164a);
        this.logger.mo85232x("WakeWindow", "Adding high freq sync event subscription to disposable", new AbstractC30556a.a[0]);
        this.disposables.mo78293a(c40164a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m114046D(C35910d c35910d, AbstractC13296u abstractC13296u) {
        c35910d.highFreqSyncEventsPubSub.onNext(abstractC13296u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m114047E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    private final void m114048F() {
        this.whoopStrapProxy.mo106496i().m122655E().m122652B(C22488a.m64989a().f88182b).m122678n(new C6656c(new C35868a(2), 27)).m122661K(new C6529c(new C35908b(this, 0), 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Boolean m114049G(EnumC33707e enumC33707e) {
        return Boolean.valueOf(enumC33707e == EnumC33707e.READY || enumC33707e == EnumC33707e.NONE || enumC33707e == EnumC33707e.CONNECTION_FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Boolean m114050H(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m114051I(C35910d c35910d, EnumC33707e enumC33707e) {
        int i13 = enumC33707e == null ? -1 : a.f152888a[enumC33707e.ordinal()];
        if (i13 == 1) {
            c35910d.m114070x();
            c35910d.m114045C();
        } else if (i13 == 2 || i13 == 3) {
            c35910d.m114067u();
        } else {
            c35910d.logger.mo85222m("Something went wrong! Got strap status as " + enumC33707e + " when only observing for READY or NONE or CONNECTION_FAILED", new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m114052J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    private final void m114067u() {
        this.logger.mo85232x("WakeWindow", "Clearing strap alarm event subscription!", new AbstractC30556a.a[0]);
        this.disposables.m78296d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m114068v(C40727h commandResponsePacket, EnumC24728e commandNumber) {
        if (commandResponsePacket == null) {
            this.logger.mo85214e("WakeWindow", "Did not receive any response packet for command " + commandNumber + "!", new AbstractC30556a.a[0]);
            return;
        }
        String str = commandResponsePacket.m132198W() ? "success" : "failure";
        this.logger.mo85232x("WakeWindow", "Command " + commandNumber + " resulted in " + str, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: w */
    private final void m114069w(C28323a eventPacket) {
        C28323a.b bVarM85785R = eventPacket.m85785R();
        int i13 = bVarM85785R == null ? -1 : a.f152889b[bVarM85785R.ordinal()];
        if (i13 == 1) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_SET, eventPacket);
            return;
        }
        if (i13 == 2) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_EXECUTED, eventPacket);
            return;
        }
        if (i13 == 3) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.APP_DRIVEN_ALARM_EXECUTED, eventPacket);
            return;
        }
        if (i13 == 4) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_DISABLED, eventPacket);
            return;
        }
        this.logger.mo85214e("WakeWindow", "Got a non strap smart alarm event - " + eventPacket.m85785R() + "!", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: x */
    private final void m114070x() {
        C36930p c36930pM67904a = this.whoopStrapProxy.mo106487E().m67904a(AbstractC14258f.f52051b);
        C6656c c6656c = new C6656c(new C35908b(this, 2), 29);
        C33589b c33589b = new C33589b(new C35909c(new C35908b(this, 3), 0), AbstractC31056a.f128065d);
        try {
            c36930pM67904a.m67905c(new C36921g(c33589b, c6656c));
            this.logger.mo85232x("WakeWindow", "Adding strap alarm event subscription to disposable", new AbstractC30556a.a[0]);
            this.disposables.mo78293a(c33589b);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m114071y(C35910d c35910d, C28323a c28323a) {
        AbstractC22676k.m65747g(c28323a);
        c35910d.m114069w(c28323a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m114072z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: a */
    public Object mo40722a(InterfaceC30057d<? super C40733j> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new b(null), interfaceC30057d);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: b */
    public Object mo40723b(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) throws ConnectivityException {
        if (i13 > 7200) {
            throw new ConnectivityException(AbstractC2875y.m8296i(i13, "Cannot enter High Freq Sync Mode for ", " which is greater than max allowed 7200"), null, 2, null);
        }
        this.logger.mo85220k("WakeWindow", AbstractC2875y.m8296i(i13, "Sending Enter High Freq Sync Command to the strap for ", " seconds"), new AbstractC30556a.a[0]);
        return this.whoopStrapProxy.mo106509z(180, i13, interfaceC30057d);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: c */
    public Object mo40724c(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.whoopStrapProxy.mo106507x(interfaceC30057d);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: d */
    public Object mo40725d(EnumC14251b enumC14251b, InterfaceC30057d<? super C40749p0> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new d(enumC14251b, null), interfaceC30057d);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: e */
    public Object mo40726e(long j7, InterfaceC30057d<? super C40761v0> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new e(j7, this, null), interfaceC30057d);
    }

    @Override // f82.InterfaceC14252c
    /* JADX INFO: renamed from: g */
    public Object mo40727g(InterfaceC30057d<? super C40742m> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new c(null), interfaceC30057d);
    }
}
