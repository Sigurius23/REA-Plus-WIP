package g43;

import android.content.Context;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationManagerCompat;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g43.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15464a {
    /* JADX INFO: renamed from: a */
    public static final void m43659a(C15476m c15476m, NotificationManagerCompat manager) {
        AbstractC22676k.m65750j(c15476m, "<this>");
        AbstractC22676k.m65750j(manager, "manager");
        try {
            manager.createNotificationChannel(new NotificationChannelCompat.Builder(c15476m.f58128a, c15476m.f58131d).setName(c15476m.f58129b).setDescription(c15476m.f58130c).build());
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C15476m m43660b(Context context, int i13, int i14, int i15, int i16) {
        String string = context.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = context.getString(i14);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = context.getString(i15);
        AbstractC22676k.m65749i(string3, "getString(...)");
        return new C15476m(i16, string, string2, string3);
    }
}
