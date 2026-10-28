package ql1;

import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;

/* JADX INFO: renamed from: ql1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u000fB5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lql1/a;", "", "La6/g;", "Lf6/f;", "dataStore", "Ljava/time/Clock;", "clock", "Lql1/c;", "dismissHelper", "Ltd1/b;", "whoopStrapProxy", "Lql1/b;", "analyticsHelper", "<init>", "(La6/g;Ljava/time/Clock;Lql1/c;Ltd1/b;Lql1/b;)V", "a", "La6/g;", "b", "Ljava/time/Clock;", "c", "Lql1/c;", "d", "Ltd1/b;", "e", "Lql1/b;", "", "f", "Ljava/lang/String;", "lastViewAnalyticsDate", "g", "lastDismissAnalyticsDate", "Lec3/l;", "Lql1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/l;", "i", "()Lec3/l;", "showLowBatteryStateFlow", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30470a {

    /* JADX INFO: renamed from: j */
    public static final int f125197j = 8;

    /* JADX INFO: renamed from: k */
    private static final C14132d f125198k = AbstractC15751g.m44441U("lowBatteryDismissId");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30472c dismissHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C30471b analyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String lastViewAnalyticsDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String lastDismissAnalyticsDate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC13058l showLowBatteryStateFlow;

    /* JADX INFO: renamed from: ql1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.lowbattery.LowBatteryAlertHelper$showLowBatteryStateFlow$1", m100430f = "LowBatteryAlertHelper.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"", "dismissedDate", "", "isCharging", "", "batteryPercentageByte", "Lql1/d;", "<anonymous>", "(Ljava/lang/String;ZB)Lql1/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        /* synthetic */ boolean f125207E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ byte f125208F;

        /* JADX INFO: renamed from: w */
        Object f125210w;

        /* JADX INFO: renamed from: x */
        Object f125211x;

        /* JADX INFO: renamed from: y */
        int f125212y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f125213z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m93242f(String str, boolean z4, byte b, InterfaceC30057d<? super C30473d> interfaceC30057d) {
            b bVar = C30470a.this.new b(interfaceC30057d);
            bVar.f125213z = str;
            bVar.f125207E = z4;
            bVar.f125208F = b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return m93242f((String) obj, ((Boolean) obj2).booleanValue(), ((Number) obj3).byteValue(), (InterfaceC30057d) obj4);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3 = (String) this.f125213z;
            boolean z4 = this.f125207E;
            byte b = this.f125208F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125212y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str4 = LocalDate.now(C30470a.this.clock).format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
                InterfaceC13058l data = C30470a.this.dataStore.getData();
                this.f125213z = str3;
                this.f125210w = null;
                this.f125211x = str4;
                this.f125207E = z4;
                this.f125208F = b;
                this.f125212y = 1;
                Object objM36577C = AbstractC13091v.m36577C(data, this);
                if (objM36577C == enumC31071a) {
                    return enumC31071a;
                }
                str = str4;
                obj = objM36577C;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f125211x;
                AbstractC34132o.m107864I(obj);
            }
            AbstractC14134f abstractC14134f = (AbstractC14134f) obj;
            if (abstractC14134f == null || (str2 = (String) abstractC14134f.mo40227b(C30470a.f125198k)) == null) {
                str2 = "";
            }
            if (!str2.equals(str) && b <= 10 && !z4 && !AbstractC22676k.m65745e(str3, str)) {
                if (!AbstractC22676k.m65745e(C30470a.this.lastViewAnalyticsDate, str)) {
                    C30470a.this.analyticsHelper.m93244b(((int) b) + "%");
                    C30470a.this.lastViewAnalyticsDate = str;
                }
                return new C30473d(true, b);
            }
            if (AbstractC22676k.m65745e(str3, str) && !AbstractC22676k.m65745e(C30470a.this.lastDismissAnalyticsDate, str)) {
                C30470a.this.analyticsHelper.m93243a(((int) b) + "%");
                C30470a.this.lastDismissAnalyticsDate = str;
            }
            return new C30473d(false, 0, 2, null);
        }
    }

    /* JADX INFO: renamed from: ql1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.lowbattery.LowBatteryAlertHelper$showLowBatteryStateFlow$2", m100430f = "LowBatteryAlertHelper.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lql1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125214w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125215x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f125215x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125215x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125214w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30473d c30473d = new C30473d(false, 0, 2, null);
                this.f125215x = null;
                this.f125214w = 1;
                if (interfaceC13062m.emit(c30473d, this) == enumC31071a) {
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

    public C30470a(InterfaceC0422g dataStore, Clock clock, C30472c dismissHelper, InterfaceC33704b whoopStrapProxy, C30471b analyticsHelper) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dismissHelper, "dismissHelper");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.dataStore = dataStore;
        this.clock = clock;
        this.dismissHelper = dismissHelper;
        this.whoopStrapProxy = whoopStrapProxy;
        this.analyticsHelper = analyticsHelper;
        this.showLowBatteryStateFlow = new C13015a0(new c(null), AbstractC13091v.m36606p(dismissHelper.getObserveAlertIsDismissed(), whoopStrapProxy.getChargeStatus().m65150e(), whoopStrapProxy.getBatteryLevel().m65136e(), new b(null)));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC13058l getShowLowBatteryStateFlow() {
        return this.showLowBatteryStateFlow;
    }
}
