package qf2;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.domain.dto.SmartAlarmUserInfoDto;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import ey1.EnumC13750g;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rf2.InterfaceC31359a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34850x0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qf2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "Ltr2/n;", "log", "Lrf2/a;", "dao", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "a", "(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;", "smart-alarm_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30328g {

    /* JADX INFO: renamed from: qf2.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepositoryKt", m100430f = "SetSmartAlarmRepository.kt", m100431l = {187, 193, 194}, m100432m = "obtainUserInfoRecord", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f124461E;

        /* JADX INFO: renamed from: F */
        Object f124462F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f124463G;

        /* JADX INFO: renamed from: H */
        int f124464H;

        /* JADX INFO: renamed from: w */
        Object f124465w;

        /* JADX INFO: renamed from: x */
        Object f124466x;

        /* JADX INFO: renamed from: y */
        Object f124467y;

        /* JADX INFO: renamed from: z */
        Object f124468z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124463G = obj;
            this.f124464H |= Integer.MIN_VALUE;
            return AbstractC30328g.m92687a(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public static final Object m92687a(SmartAlarmApi smartAlarmApi, InterfaceC34116n interfaceC34116n, InterfaceC31359a interfaceC31359a, InterfaceC21030c interfaceC21030c, FeatureFlagChecker featureFlagChecker, InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        a aVar;
        InterfaceC31359a interfaceC31359a2;
        InterfaceC34116n interfaceC34116n2;
        InterfaceC21030c interfaceC21030c2;
        Object obj;
        InterfaceC34116n interfaceC34116n3;
        InterfaceC34116n interfaceC34116n4;
        C22047a c22047a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f124464H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f124464H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj2 = aVar.f124463G;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = aVar.f124464H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            interfaceC34116n.mo85232x("WakeWindow", "GET /smart-alarm-service/v1/smartalarm/preferences", new AbstractC30556a.a[0]);
            aVar.f124465w = null;
            aVar.f124466x = interfaceC34116n;
            interfaceC31359a2 = interfaceC31359a;
            aVar.f124467y = interfaceC31359a2;
            aVar.f124468z = interfaceC21030c;
            aVar.f124461E = null;
            aVar.f124464H = 1;
            Object smartAlarmUserInfoResponseAlarmService = smartAlarmApi.getSmartAlarmUserInfoResponseAlarmService(aVar);
            if (smartAlarmUserInfoResponseAlarmService != obj3) {
                interfaceC34116n2 = interfaceC34116n;
                interfaceC21030c2 = interfaceC21030c;
                obj = smartAlarmUserInfoResponseAlarmService;
            }
            return obj3;
        }
        if (i14 == 1) {
            interfaceC21030c2 = (InterfaceC21030c) aVar.f124468z;
            InterfaceC31359a interfaceC31359a3 = (InterfaceC31359a) aVar.f124467y;
            interfaceC34116n2 = (InterfaceC34116n) aVar.f124466x;
            AbstractC34132o.m107864I(obj2);
            obj = obj2;
            interfaceC31359a2 = interfaceC31359a3;
        } else if (i14 == 2) {
            interfaceC21030c2 = (InterfaceC21030c) aVar.f124468z;
            interfaceC34116n4 = (InterfaceC34116n) aVar.f124466x;
            try {
                AbstractC34132o.m107864I(obj2);
                EnumC13750g enumC13750g = EnumC13750g.ALARM_CACHE_PURGE;
                c22047a = new C22047a(0, enumC13750g.getValue(), null, AbstractC37056f.m118958J("Event:" + enumC13750g.getValue()), null, 17, null);
                aVar.f124465w = null;
                aVar.f124466x = interfaceC34116n4;
                aVar.f124467y = null;
                aVar.f124468z = null;
                aVar.f124461E = null;
                aVar.f124462F = null;
                aVar.f124464H = 3;
                if (interfaceC21030c2.mo58700a(c22047a, aVar) != obj3) {
                    return obj3;
                }
            } catch (Exception e5) {
                e = e5;
                interfaceC34116n3 = interfaceC34116n4;
                interfaceC34116n3.mo85215f("WakeWindow", "Failed to delete after 404", e, new AbstractC30556a.a[0]);
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34116n3 = (InterfaceC34116n) aVar.f124466x;
            try {
                AbstractC34132o.m107864I(obj2);
            } catch (Exception e13) {
                e = e13;
                interfaceC34116n3.mo85215f("WakeWindow", "Failed to delete after 404", e, new AbstractC30556a.a[0]);
            }
        }
        return null;
        C29218v0 c29218v0 = (C29218v0) obj;
        interfaceC34116n2.mo85232x("WakeWindow", AbstractC2875y.m8295h(c29218v0.f118269a.f146792z, "/smart-alarm-service/v1/smartalarm/preferences returned response code "), new AbstractC30556a.a[0]);
        C34850x0 c34850x0 = c29218v0.f118269a;
        if (c34850x0.f146788Q) {
            Object obj4 = c29218v0.f118270b;
            if (obj4 != null) {
                return ((SmartAlarmUserInfoDto) obj4).toSmartAlarmUserInfo();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        int i15 = c34850x0.f146792z;
        if (i15 != 404) {
            interfaceC34116n2.mo85214e("WakeWindow", AbstractC2875y.m8295h(i15, "Failed to etch user info record with code "), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            aVar.f124465w = null;
            aVar.f124466x = interfaceC34116n2;
            aVar.f124467y = null;
            aVar.f124468z = interfaceC21030c2;
            aVar.f124461E = null;
            aVar.f124462F = null;
            aVar.f124464H = 2;
            if (interfaceC31359a2.deleteAll(aVar) != obj3) {
                interfaceC34116n4 = interfaceC34116n2;
                EnumC13750g enumC13750g2 = EnumC13750g.ALARM_CACHE_PURGE;
                c22047a = new C22047a(0, enumC13750g2.getValue(), null, AbstractC37056f.m118958J("Event:" + enumC13750g2.getValue()), null, 17, null);
                aVar.f124465w = null;
                aVar.f124466x = interfaceC34116n4;
                aVar.f124467y = null;
                aVar.f124468z = null;
                aVar.f124461E = null;
                aVar.f124462F = null;
                aVar.f124464H = 3;
                if (interfaceC21030c2.mo58700a(c22047a, aVar) != obj3) {
                    return null;
                }
            }
            return obj3;
        } catch (Exception e14) {
            e = e14;
            interfaceC34116n3 = interfaceC34116n2;
            interfaceC34116n3.mo85215f("WakeWindow", "Failed to delete after 404", e, new AbstractC30556a.a[0]);
        }
    }
}
