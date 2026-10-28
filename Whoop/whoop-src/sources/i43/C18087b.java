package i43;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import ec3.C13045h2;
import h20.C16670i0;
import hc3.C17171d;
import l83.C23470p;
import n53.C26318e;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33381e1;
import t23.C33391g1;
import t23.C33403i3;
import t23.InterfaceC33408j3;

/* JADX INFO: renamed from: i43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18087b extends BroadcastReceiver {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f70292d = 0;

    /* JADX INFO: renamed from: a */
    public final C23470p f70293a;

    /* JADX INFO: renamed from: b */
    public C33368c0 f70294b;

    /* JADX INFO: renamed from: c */
    public boolean f70295c;

    public C18087b(C17171d coroutineScope) {
        C33391g1 c33391g1;
        C13045h2 c13045h2;
        C33368c0 c33368c0;
        C33391g1 c33391g2;
        C13045h2 c13045h3;
        C33368c0 c33368c1;
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.f70293a = AbstractC1772c1.m5382S(this, "ToggleCameraBroadcastReceiver");
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        C2345k c2345kM51936a = m51936a();
        InterfaceC2339e interfaceC2339e = c2345kM51936a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM51936a.f9273a)) {
            c2345kM51936a.f9274b.log(enumC2341g, c2345kM51936a.f9273a, AbstractC11266d.m30461o("Init active call value: ", (interfaceC33408j3 == null || (c33391g2 = ((C33366b4) interfaceC33408j3).f139248U) == null || (c13045h3 = c33391g2.f139405h) == null || (c33368c1 = (C33368c0) c13045h3.getValue()) == null) ? null : c33368c1.f139308v), null);
        }
        C2345k c2345kM51936a2 = m51936a();
        if (c2345kM51936a2.f9275c.isLoggable(enumC2341g, c2345kM51936a2.f9273a)) {
            c2345kM51936a2.f9274b.log(enumC2341g, c2345kM51936a2.f9273a, AbstractC11266d.m30461o("Init ringing call value: ", (interfaceC33408j3 == null || (c33391g1 = ((C33366b4) interfaceC33408j3).f139248U) == null || (c13045h2 = c33391g1.f139404g) == null || (c33368c0 = (C33368c0) c13045h2.getValue()) == null) ? null : c33368c0.f139308v), null);
        }
        if (interfaceC33408j3 != null) {
            C33366b4 c33366b4 = (C33366b4) interfaceC33408j3;
            C33368c0 c33368c2 = (C33368c0) c33366b4.f139248U.f139405h.getValue();
            c33368c2 = c33368c2 == null ? (C33368c0) c33366b4.f139248U.f139404g.getValue() : c33368c2;
            this.f70294b = c33368c2;
            if (c33368c2 == null) {
                AbstractC3006f0.m8732z(coroutineScope, null, null, new C16670i0(interfaceC33408j3, this, interfaceC30057d, 12), 3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m51936a() {
        return (C2345k) this.f70293a.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C26318e c26318e;
        C33368c0 c33368c0;
        C33381e1 c33381e1M105814e;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    C33368c0 c33368c1 = this.f70294b;
                    C33381e1 c33381e1M105814e2 = c33368c1 != null ? c33368c1.m105814e() : null;
                    this.f70295c = (c33381e1M105814e2 == null || (c26318e = c33381e1M105814e2.f139355l) == null) ? false : ((Boolean) ((AbstractC22680m) c26318e.f104635y).invoke()).booleanValue();
                    if (c33381e1M105814e2 != null) {
                        c33381e1M105814e2.m105834c();
                    }
                    C2345k c2345kM51936a = m51936a();
                    InterfaceC2339e interfaceC2339e = c2345kM51936a.f9275c;
                    String str = c2345kM51936a.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        InterfaceC2344j interfaceC2344j = c2345kM51936a.f9274b;
                        C33368c0 c33368c2 = this.f70294b;
                        interfaceC2344j.log(enumC2341g, str, AbstractC26725a.m79503g("Screen is off. Call: ", c33368c2 != null ? c33368c2.f139289c : null, ". Should re-enable camera: ", ".", this.f70295c), null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == -1454123155) {
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    C2345k c2345kM51936a2 = m51936a();
                    InterfaceC2339e interfaceC2339e2 = c2345kM51936a2.f9275c;
                    String str2 = c2345kM51936a2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        InterfaceC2344j interfaceC2344j2 = c2345kM51936a2.f9274b;
                        C33368c0 c33368c3 = this.f70294b;
                        interfaceC2344j2.log(enumC2341g2, str2, AbstractC11266d.m30461o("Screen is on and locked. Call: ", c33368c3 != null ? c33368c3.f139289c : null), null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                C2345k c2345kM51936a3 = m51936a();
                InterfaceC2339e interfaceC2339e3 = c2345kM51936a3.f9275c;
                String str3 = c2345kM51936a3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                    InterfaceC2344j interfaceC2344j3 = c2345kM51936a3.f9274b;
                    C33368c0 c33368c4 = this.f70294b;
                    interfaceC2344j3.log(enumC2341g3, str3, AbstractC11266d.m30461o("Screen is on and unlocked. Call: ", c33368c4 != null ? c33368c4.f139289c : null), null);
                }
                if (!this.f70295c || (c33368c0 = this.f70294b) == null || (c33381e1M105814e = c33368c0.m105814e()) == null) {
                    return;
                }
                c33381e1M105814e.m105835e(true);
            }
        }
    }
}
