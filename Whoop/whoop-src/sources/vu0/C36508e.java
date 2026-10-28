package vu0;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import com.whoop.connectivityNotifications.lowbattery.LowBatteryStreakApi;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ts0.C34137b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vu0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvu0/e;", "", "La6/g;", "Lf6/f;", "dataStore", "Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;", "lowBatteryStreakApi", "Ltr2/n;", "logger", "<init>", "(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;)V", "Lvu0/d;", "c", "(Lq83/d;)Ljava/lang/Object;", "b", "a", "La6/g;", "Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;", "Ltr2/n;", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36508e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LowBatteryStreakApi lowBatteryStreakApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vu0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.StreakInfoHandler", m100430f = "StreakInfoHandler.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 25}, m100432m = "getStreakData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f155972w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155973x;

        /* JADX INFO: renamed from: z */
        int f155975z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155973x = obj;
            this.f155975z |= Integer.MIN_VALUE;
            return C36508e.this.m117020b(this);
        }
    }

    /* JADX INFO: renamed from: vu0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.StreakInfoHandler", m100430f = "StreakInfoHandler.kt", m100431l = {31}, m100432m = "readFromDataStore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f155976w;

        /* JADX INFO: renamed from: y */
        int f155978y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155976w = obj;
            this.f155978y |= Integer.MIN_VALUE;
            return C36508e.this.m117019c(this);
        }
    }

    public C36508e(InterfaceC0422g dataStore, LowBatteryStreakApi lowBatteryStreakApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(lowBatteryStreakApi, "lowBatteryStreakApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.lowBatteryStreakApi = lowBatteryStreakApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m117019c(InterfaceC30057d<? super C36507d> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f155978y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f155978y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f155976w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f155978y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.dataStore.getData();
                bVar.f155978y = 1;
                objM36575A = AbstractC13091v.m36575A(data, bVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A);
            }
            String str = (String) ((AbstractC14134f) objM36575A).mo40227b(C34137b.f143077a.m107904a());
            this.logger.mo85228t("Raw streak DataStore value: " + str, new AbstractC30556a.a[0]);
            if (str != null && !AbstractC39414r.m125890i0(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("streak_value", "");
                AbstractC22676k.m65749i(strOptString, "optString(...)");
                String strOptString2 = jSONObject.optString("streak_state", "");
                AbstractC22676k.m65749i(strOptString2, "optString(...)");
                return new C36507d(strOptString, strOptString2);
            }
            return null;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read streak from DataStore: ", e5.getMessage()), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m117020b(q83.InterfaceC30057d<? super vu0.C36507d> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vu0.C36508e.a
            if (r0 == 0) goto L13
            r0 = r8
            vu0.e$a r0 = (vu0.C36508e.a) r0
            int r1 = r0.f155975z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155975z = r1
            goto L18
        L13:
            vu0.e$a r0 = new vu0.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f155973x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f155975z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f155972w
            java.lang.Exception r0 = (java.lang.Exception) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L3b
            goto L4b
        L3b:
            r8 = move-exception
            goto L64
        L3d:
            p505ts.AbstractC34132o.m107864I(r8)
            com.whoop.connectivityNotifications.lowbattery.LowBatteryStreakApi r8 = r7.lowBatteryStreakApi     // Catch: java.lang.Exception -> L3b
            r0.f155975z = r5     // Catch: java.lang.Exception -> L3b
            java.lang.Object r8 = r8.fetchStreak(r0)     // Catch: java.lang.Exception -> L3b
            if (r8 != r1) goto L4b
            goto L87
        L4b:
            com.whoop.connectivityNotifications.lowbattery.StreakApiResponse r8 = (com.whoop.connectivityNotifications.lowbattery.StreakApiResponse) r8     // Catch: java.lang.Exception -> L3b
            tr2.n r2 = r7.logger     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = "Fetched fresh streak data from API"
            qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r3]     // Catch: java.lang.Exception -> L3b
            r2.mo85228t(r5, r6)     // Catch: java.lang.Exception -> L3b
            vu0.d r2 = new vu0.d     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r8.getStreakValue()     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = r8.getStreakState()     // Catch: java.lang.Exception -> L3b
            r2.<init>(r5, r8)     // Catch: java.lang.Exception -> L3b
            return r2
        L64:
            q83.j r2 = r0.getContext()
            bc3.AbstractC3006f0.m8721o(r2)
            tr2.n r2 = r7.logger
            java.lang.String r8 = r8.getMessage()
            java.lang.String r5 = "API fetch failed, falling back to DataStore: "
            java.lang.String r8 = p000.AbstractC11266d.m30461o(r5, r8)
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
            r2.mo85222m(r8, r3)
            r8 = 0
            r0.f155972w = r8
            r0.f155975z = r4
            java.lang.Object r8 = r7.m117019c(r0)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            vu0.d r8 = (vu0.C36507d) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.C36508e.m117020b(q83.d):java.lang.Object");
    }

    public /* synthetic */ C36508e(InterfaceC0422g interfaceC0422g, LowBatteryStreakApi lowBatteryStreakApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, lowBatteryStreakApi, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreakInfoHandler") : interfaceC34116n);
    }
}
