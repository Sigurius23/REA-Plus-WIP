package g82;

import f82.EnumC14250a;
import f82.EnumC14251b;
import ot0.C28323a;
import p715kotlin.Metadata;
import zj0.C40727h;

/* JADX INFO: renamed from: g82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lg82/a;", "", "Lf82/a;", "smartAlarmEventType", "Lf82/b;", "smartAlarmTrigger", "", "phoneSetAlarmTimeMillis", "Lzj0/h;", "responsePacket", "", "isSuccess", "Ll83/a0;", "b", "(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V", "Lot0/a;", "eventPacket", "a", "(Lf82/a;Lot0/a;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC15574a {
    /* JADX INFO: renamed from: a */
    void mo43870a(EnumC14250a smartAlarmEventType, C28323a eventPacket);

    /* JADX INFO: renamed from: b */
    void mo43871b(EnumC14250a smartAlarmEventType, EnumC14251b smartAlarmTrigger, String phoneSetAlarmTimeMillis, C40727h responsePacket, boolean isSuccess);
}
