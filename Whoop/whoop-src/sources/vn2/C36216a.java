package vn2;

import androidx.core.app.NotificationCompat;
import io2.C20754d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sn2.C32778d;
import wn2.InterfaceC37427e;

/* JADX INFO: renamed from: vn2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lvn2/a;", "", "<init>", "()V", NotificationCompat.CATEGORY_EVENT, "", "paymentMethodId", "Lwn2/e;", "a", "(Ljava/lang/Object;Ljava/lang/String;)Lwn2/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36216a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC37427e m115281a(Object event, String paymentMethodId) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37427e) {
            return (InterfaceC37427e) event;
        }
        if (!(event instanceof C20754d) || paymentMethodId == null) {
            return null;
        }
        C20754d c20754d = (C20754d) event;
        return new InterfaceC37427e.f(new C32778d(c20754d.getPath(), c20754d.getCartId(), paymentMethodId));
    }
}
