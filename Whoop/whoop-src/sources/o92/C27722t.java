package o92;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3850a;
import c93.InterfaceC4351m;
import com.whoop.service.push.InvalidPushDataException;
import e93.AbstractC12889b;
import hi0.AbstractC17312j;
import l83.C23454a0;
import l83.C23465k;
import m92.AbstractC25319b;
import m92.C25323f;
import p114eb.C12966j0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vv0.AbstractC36528a;
import wm0.C37378a;

/* JADX INFO: renamed from: o92.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lo92/t;", "Lm92/b;", "Lo92/s;", "pushContext", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lo92/s;Lwm0/a;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lwm0/a;", "", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "K", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27722t extends AbstractC25319b {

    /* JADX INFO: renamed from: L */
    public static final int f111724L = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.t$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.RecoveryActivityProcessedPushNotification$perform$1", m100430f = "RecoveryActivityProcessedPushNotification.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111727w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27722t.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111727w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378a = C27722t.this.scopeCoordinator;
                this.f111727w = 1;
                if (C37378a.m119655c(c37378a, null, this, 1, null) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27722t(C27721s pushContext, C37378a scopeCoordinator) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.scopeCoordinator = scopeCoordinator;
        this.logTag = "RecoveryActivityProcessedPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) throws InvalidPushDataException {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String strM74353r = m74353r(dataMap, "activityId");
        String strM74368b = dataMap.m74368b("title");
        if (strM74368b == null) {
            strM74368b = context.getString(AbstractC17312j.f66975d, context.getString(AbstractC17312j.f66916B));
            AbstractC22676k.m65749i(strM74368b, "getString(...)");
        }
        String str = strM74368b;
        String strM74368b2 = dataMap.m74368b("body");
        if (strM74368b2 == null) {
            strM74368b2 = context.getString(AbstractC17312j.f66972c, context.getString(AbstractC17312j.f66916B));
            AbstractC22676k.m65749i(strM74368b2, "getString(...)");
        }
        String str2 = strM74368b2;
        int iM11798a = C3850a.f15766a.m11798a(strM74353r);
        NotificationCompat.Builder style = m74346d(context, Integer.valueOf(iM11798a)).setContentTitle(str).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2));
        AbstractC22676k.m65749i(style, "setStyle(...)");
        C27691a.f111471M.m11805a(style);
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("entryPoint", "Push Notification"), new C23465k("activityType", "Recovery"), new C23465k("activityIdV2", strM74353r));
        C12966j0 c12966j0M74345c = m74345c(context);
        C12966j0.m36442f(c12966j0M74345c, AbstractC36528a.f156319a);
        c12966j0M74345c.m36447e(bundleM36273g);
        style.setContentIntent(c12966j0M74345c.m36444b());
        AbstractC3006f0.m8732z(getScope(), null, null, new b(null), 3);
        Notification notificationBuild = style.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, iM11798a, notificationBuild, context, str, str2, null, 32, null);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
