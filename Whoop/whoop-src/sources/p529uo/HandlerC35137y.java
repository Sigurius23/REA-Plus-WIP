package p529uo;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4978i;
import jp.HandlerC21846d;
import p656yp.C39698e;

/* JADX INFO: renamed from: uo.y */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC35137y extends HandlerC21846d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC35107c f149086a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC35137y(AbstractC35107c abstractC35107c, Looper looper) {
        super(looper, 2);
        this.f149086a = abstractC35107c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        AbstractC35133u abstractC35133u;
        AbstractC35107c abstractC35107c = this.f149086a;
        if (abstractC35107c.f148984w.get() != message.arg1) {
            int i13 = message.what;
            if ((i13 == 2 || i13 == 1 || i13 == 7) && (abstractC35133u = (AbstractC35133u) message.obj) != null) {
                synchronized (abstractC35133u) {
                    abstractC35133u.f149075a = null;
                }
                AbstractC35107c abstractC35107c2 = abstractC35133u.f149077c;
                synchronized (abstractC35107c2.f148972k) {
                    abstractC35107c2.f148972k.remove(abstractC35133u);
                }
                return;
            }
            return;
        }
        int i14 = message.what;
        if ((i14 == 1 || i14 == 7 || ((i14 == 4 && !(abstractC35107c instanceof C39698e)) || i14 == 5)) && !abstractC35107c.m111063o()) {
            AbstractC35133u abstractC35133u2 = (AbstractC35133u) message.obj;
            if (abstractC35133u2 != null) {
                synchronized (abstractC35133u2) {
                    abstractC35133u2.f149075a = null;
                }
                AbstractC35107c abstractC35107c3 = abstractC35133u2.f149077c;
                synchronized (abstractC35107c3.f148972k) {
                    abstractC35107c3.f148972k.remove(abstractC35133u2);
                }
                return;
            }
            return;
        }
        int i15 = message.what;
        if (i15 == 4) {
            abstractC35107c.f148981t = new C4969a(message.arg2);
            if (abstractC35107c.m111066s() && !abstractC35107c.f148982u) {
                abstractC35107c.m111067t(3, null);
                return;
            }
            C4969a c4969a = abstractC35107c.f148981t;
            if (c4969a == null) {
                c4969a = new C4969a(8);
            }
            abstractC35107c.f148970i.mo13941b(c4969a);
            System.currentTimeMillis();
            return;
        }
        if (i15 == 5) {
            C4969a c4969a2 = abstractC35107c.f148981t;
            if (c4969a2 == null) {
                c4969a2 = new C4969a(8);
            }
            abstractC35107c.f148970i.mo13941b(c4969a2);
            System.currentTimeMillis();
            return;
        }
        if (i15 == 3) {
            Object obj = message.obj;
            abstractC35107c.f148970i.mo13941b(new C4969a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i15 == 6) {
            abstractC35107c.m111067t(5, null);
            C35123k c35123k = abstractC35107c.f148975n;
            if (c35123k != null) {
                ((InterfaceC4978i) c35123k.f149049a).mo15599X(message.arg2);
            }
            System.currentTimeMillis();
            abstractC35107c.m111064q(5, 1, null);
            return;
        }
        if (i15 == 2 && !abstractC35107c.m111062n()) {
            AbstractC35133u abstractC35133u3 = (AbstractC35133u) message.obj;
            if (abstractC35133u3 != null) {
                synchronized (abstractC35133u3) {
                    abstractC35133u3.f149075a = null;
                }
                AbstractC35107c abstractC35107c4 = abstractC35133u3.f149077c;
                synchronized (abstractC35107c4.f148972k) {
                    abstractC35107c4.f148972k.remove(abstractC35133u3);
                }
                return;
            }
            return;
        }
        int i16 = message.what;
        if (i16 != 2 && i16 != 1 && i16 != 7) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i16).length() + 34);
            sb4.append("Don't know how to handle message: ");
            sb4.append(i16);
            Log.wtf("GmsClient", sb4.toString(), new Exception());
            return;
        }
        AbstractC35133u abstractC35133u4 = (AbstractC35133u) message.obj;
        synchronized (abstractC35133u4) {
            try {
                bool = abstractC35133u4.f149075a;
                if (abstractC35133u4.f149076b) {
                    String string = abstractC35133u4.toString();
                    StringBuilder sb5 = new StringBuilder(string.length() + 47);
                    sb5.append("Callback proxy ");
                    sb5.append(string);
                    sb5.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb5.toString());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (bool != null) {
            AbstractC35107c abstractC35107c5 = abstractC35133u4.f149080f;
            int i17 = abstractC35133u4.f149078d;
            if (i17 != 0) {
                abstractC35107c5.m111067t(1, null);
                Bundle bundle = abstractC35133u4.f149079e;
                abstractC35133u4.mo111057b(new C4969a(i17, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC35133u4.mo111056a()) {
                abstractC35107c5.m111067t(1, null);
                abstractC35133u4.mo111057b(new C4969a(8, null));
            }
        }
        synchronized (abstractC35133u4) {
            abstractC35133u4.f149076b = true;
        }
        synchronized (abstractC35133u4) {
            abstractC35133u4.f149075a = null;
        }
        AbstractC35107c abstractC35107c6 = abstractC35133u4.f149077c;
        synchronized (abstractC35107c6.f148972k) {
            abstractC35107c6.f148972k.remove(abstractC35133u4);
        }
    }
}
