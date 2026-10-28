package a11;

import a13.C0148f;
import aa2.C0597f;
import ad3.C0772o;
import ae3.C0803k;
import androidx.health.platform.client.proto.C1533u;
import au0.C2055f;
import b61.AbstractC2756k;
import b91.AbstractC2890e;
import bc3.AbstractC2995c1;
import bc3.AbstractC3076z;
import c03.AbstractC3813a;
import c41.AbstractC4011d5;
import c41.AbstractC4072m3;
import c41.AbstractC4075n;
import c41.AbstractC4137v5;
import cg.C4553h;
import ch.AbstractC4585f;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao_Impl;
import com.whoop.data.onboarding.OnboardingStatusDao_Impl;
import com.whoop.data.repositories.FeatureFlagRepositoryImpl;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.data.repositories.UserStrapsRepository;
import com.whoop.whoopstatus.models.WhoopStatusArchMiniModel;
import eg.C13161j;
import eg.C13166o;
import java.io.File;
import java.util.Map;
import jb1.C21536b;
import kd1.C22395g;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import n83.C26466i;
import od1.C27858u;
import p007a6.C0415d1;
import p098dt.AbstractC12350b;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import q83.InterfaceC30061h;
import td1.EnumC33707e;
import tg.C33770b;
import yc3.C39437a;

/* JADX INFO: renamed from: a11.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0129g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f386w;

    public /* synthetic */ C0129g(int i13) {
        this.f386w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f386w) {
            case 0:
                return AbstractC0139q.m290A(obj);
            case 1:
                File it = (File) obj;
                AbstractC22676k.m65750j(it, "it");
                String absolutePath = it.getCanonicalFile().getAbsolutePath();
                AbstractC22676k.m65749i(absolutePath, "getAbsolutePath(...)");
                return new C0415d1(absolutePath);
            case 2:
                return C0597f.m1578w((InterfaceC33687a) obj);
            case 3:
                C39437a buildSerialDescriptor = (C39437a) obj;
                AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.m125993a("JsonPrimitive", new C0772o(new C0148f(2)), false);
                buildSerialDescriptor.m125993a("JsonNull", new C0772o(new C0148f(3)), false);
                buildSerialDescriptor.m125993a("JsonLiteral", new C0772o(new C0148f(4)), false);
                buildSerialDescriptor.m125993a("JsonObject", new C0772o(new C0148f(5)), false);
                buildSerialDescriptor.m125993a("JsonArray", new C0772o(new C0148f(6)), false);
                return C23454a0.f92919a;
            case 4:
                return JsonObject.toString$lambda$1((Map.Entry) obj);
            case 5:
                InterfaceC33689c it3 = (InterfaceC33689c) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3.mo5355e1());
            case 6:
                InterfaceC33689c statement = (InterfaceC33689c) obj;
                AbstractC22676k.m65750j(statement, "statement");
                C26466i c26466i = new C26466i();
                while (statement.mo5355e1()) {
                    c26466i.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return AbstractC12350b.m34586g(c26466i);
            case 7:
                return C2055f.m6472s((InterfaceC33687a) obj);
            case 8:
                return AbstractC2756k.m7800q(obj);
            case 9:
                return Integer.valueOf(AbstractC2756k.m7769B(((Integer) obj).intValue()));
            case 10:
                return Integer.valueOf(AbstractC2756k.m7768A(((Integer) obj).intValue()));
            case 11:
                return AbstractC2890e.m8447b((C22395g) obj);
            case 12:
                InterfaceC30061h interfaceC30061h = (InterfaceC30061h) obj;
                if (interfaceC30061h instanceof AbstractC3076z) {
                    return (AbstractC3076z) interfaceC30061h;
                }
                return null;
            case 13:
                InterfaceC30061h interfaceC30061h2 = (InterfaceC30061h) obj;
                if (interfaceC30061h2 instanceof AbstractC2995c1) {
                    return (AbstractC2995c1) interfaceC30061h2;
                }
                return null;
            case 14:
                return AbstractC3813a.m11677f((C21536b) obj);
            case 15:
                return AbstractC3813a.m11678g((C23749z0) obj);
            case 16:
                return AbstractC3813a.m11679h((WhoopStatusArchMiniModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4075n.m12504i(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4072m3.m12490j(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4011d5.m12160f(obj);
            case 20:
                return AbstractC4137v5.m12843f(obj);
            case 21:
                C13166o DslBuilderProperty = (C13166o) obj;
                AbstractC22676k.m65750j(DslBuilderProperty, "$this$DslBuilderProperty");
                C0803k c0803kMo36845f = DslBuilderProperty.mo36845f();
                c0803kMo36845f.getClass();
                return new C13161j(c0803kMo36845f, 0);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C4553h c4553h = C4553h.f18347w;
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "<destruct>");
                return ((String) c4553h.get((C33770b) entry.getKey())) + '=' + ((String) c4553h.get((C33770b) entry.getValue()));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (AbstractC4585f) obj;
            case 24:
                return ConfigurationsDao_Impl.lambda$deleteAll$2((InterfaceC33687a) obj);
            case 25:
                return ConfigurationsDao_Impl.lambda$getAllConfigurations$1((InterfaceC33687a) obj);
            case 26:
                return OnboardingStatusDao_Impl.lambda$deleteAll$4((InterfaceC33687a) obj);
            case 27:
                return FeatureFlagRepositoryImpl.periodicFetchOnboardingFlags$lambda$4((String) obj);
            case 28:
                return SmartAlarmTriggerRepository.start$lambda$2((EnumC33707e) obj);
            default:
                return UserStrapsRepository.observeUserAndStrapUpdates$lambda$0((C27858u.a) obj);
        }
    }
}
