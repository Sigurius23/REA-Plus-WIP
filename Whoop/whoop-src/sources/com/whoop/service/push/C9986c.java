package com.whoop.service.push;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import m92.C25323f;
import p000.AbstractC11266d;
import p002a0.C0021f1;
import p692zt.C41112p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.whoop.service.push.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/service/push/c;", "", "<init>", "()V", "Liy1/c;", "metricWriter", "Lm92/f;", "dataPayload", "", "notificationType", "Lzt/p;", "remoteMessage", "", "error", "recognized", "Ll83/a0;", "a", "(Liy1/c;Lm92/f;Ljava/lang/String;Lzt/p;ZLjava/lang/Boolean;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9986c {
    /* JADX INFO: renamed from: a */
    public final void m24513a(InterfaceC21030c metricWriter, C25323f dataPayload, String notificationType, C41112p remoteMessage, boolean error, Boolean recognized) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(dataPayload, "dataPayload");
        AbstractC22676k.m65750j(remoteMessage, "remoteMessage");
        boolean zM74367a = dataPayload.m74367a("itbl");
        boolean zM24507b = PushService.INSTANCE.m24507b(notificationType);
        boolean z4 = remoteMessage.m133447h() != null;
        Object objM133446f = remoteMessage.m133446f();
        AbstractC22676k.m65749i(objM133446f, "getData(...)");
        boolean z13 = !((C0021f1) objM133446f).isEmpty();
        metricWriter.mo58701b(new C22047a(0, "push.received", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("notificationType:", notificationType), AbstractC11266d.m30462p("isIterablePush:", zM74367a), AbstractC11266d.m30462p("isIterablePushWhoop:", zM24507b), AbstractC11266d.m30462p("hasNotification:", z4), AbstractC11266d.m30462p("hasData:", z13), AbstractC11266d.m30462p("error:", error), "recognized:" + recognized), null, 21, null));
    }
}
