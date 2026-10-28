package do2;

import androidx.core.app.NotificationCompat;
import eo2.InterfaceC13383c;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: do2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ldo2/a;", "", "<init>", "()V", NotificationCompat.CATEGORY_EVENT, "Leo2/c;", "a", "(Ljava/lang/Object;)Leo2/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12235a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC13383c m34026a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC13383c) {
            return (InterfaceC13383c) event;
        }
        if (event instanceof C27256h) {
            return new InterfaceC13383c.c(((C27256h) event).getDestination());
        }
        return null;
    }
}
