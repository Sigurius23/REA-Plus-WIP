package u62;

import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import el1.C13319b;
import el1.EnumC13318a;
import it0.C20926b;
import it0.EnumC20925a;
import jk0.InterfaceC21750d;
import l83.InterfaceC23457c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: u62.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lu62/c;", "", "Lci2/b;", "whoopStrapProvider", "Lit0/b;", "firmwareFeatureFlagSyncService", "Lel1/b;", "historySyncStatusHook", "<init>", "(Lci2/b;Lit0/b;Lel1/b;)V", "Lu62/a;", "fetchRemoteStatus", "", "a", "(Lu62/a;Lq83/d;)Ljava/lang/Object;", "Lci2/b;", "getWhoopStrapProvider", "()Lci2/b;", "Lec3/f2;", "Lit0/a;", "b", "Lec3/f2;", "currentFirmwareFeatureFlagState", "Lec3/l;", "Lel1/a;", "c", "Lec3/l;", "historySyncStatus", "Ljk0/d;", "()Ljk0/d;", "currentWhoopStrap", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C34559c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 currentFirmwareFeatureFlagState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l historySyncStatus;

    /* JADX INFO: renamed from: u62.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigTrigger", m100430f = "RemoteDeviceConfigTrigger.kt", m100431l = {25}, m100432m = "canStartExchangeWithStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f145558F;

        /* JADX INFO: renamed from: w */
        Object f145559w;

        /* JADX INFO: renamed from: x */
        int f145560x;

        /* JADX INFO: renamed from: y */
        int f145561y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f145562z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145562z = obj;
            this.f145558F |= Integer.MIN_VALUE;
            return C34559c.this.m109272a(null, this);
        }
    }

    public C34559c(InterfaceC4733b whoopStrapProvider, C20926b firmwareFeatureFlagSyncService, C13319b historySyncStatusHook) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(firmwareFeatureFlagSyncService, "firmwareFeatureFlagSyncService");
        AbstractC22676k.m65750j(historySyncStatusHook, "historySyncStatusHook");
        this.whoopStrapProvider = whoopStrapProvider;
        this.currentFirmwareFeatureFlagState = firmwareFeatureFlagSyncService.getCurrentState();
        this.historySyncStatus = historySyncStatusHook.getHistorySyncStatus();
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC21750d m109271b() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14819c().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m109272a(EnumC34557a enumC34557a, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        int i13;
        int i14;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i15 = aVar.f145558F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f145558F = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f145562z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = aVar.f145558F;
        boolean z4 = false;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            int i17 = m109271b() != null ? 1 : 0;
            i13 = this.currentFirmwareFeatureFlagState.getValue() == EnumC20925a.RUNNING ? 1 : 0;
            InterfaceC13058l interfaceC13058l = this.historySyncStatus;
            aVar.f145559w = enumC34557a;
            aVar.f145560x = i17;
            aVar.f145561y = i13;
            aVar.f145558F = 1;
            Object objM36575A = AbstractC13091v.m36575A(interfaceC13058l, aVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
            i14 = i17;
            obj = objM36575A;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i18 = aVar.f145561y;
            i14 = aVar.f145560x;
            EnumC34557a enumC34557a2 = (EnumC34557a) aVar.f145559w;
            AbstractC34132o.m107864I(obj);
            i13 = i18;
            enumC34557a = enumC34557a2;
        }
        boolean z13 = obj == EnumC13318a.IN_PROGRESS;
        boolean z14 = enumC34557a == EnumC34557a.FETCHED || enumC34557a == EnumC34557a.CACHED;
        if (i14 != 0 && i13 == 0 && !z13 && z14) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
