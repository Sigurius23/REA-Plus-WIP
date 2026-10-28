package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dm.InterfaceC12175e;
import gt.C16162a;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import gt.InterfaceC16164c;
import java.util.Arrays;
import java.util.List;
import p037bu.C3631b;
import p098dt.C12355g;
import p249jc.AbstractC21598x;
import p260jt.InterfaceC21933b;
import p437qt.C30579b;
import p437qt.InterfaceC30584g;
import p469rt.InterfaceC31798a;
import pt.InterfaceC29509b;
import tt.InterfaceC34150d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C16177p c16177p, InterfaceC16164c interfaceC16164c) {
        C12355g c12355g = (C12355g) interfaceC16164c.mo1617a(C12355g.class);
        if (interfaceC16164c.mo1617a(InterfaceC31798a.class) == null) {
            return new FirebaseMessaging(c12355g, interfaceC16164c.mo1621e(C3631b.class), interfaceC16164c.mo1621e(InterfaceC30584g.class), (InterfaceC34150d) interfaceC16164c.mo1617a(InterfaceC34150d.class), interfaceC16164c.mo1622f(c16177p), (InterfaceC29509b) interfaceC16164c.mo1617a(InterfaceC29509b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C16163b> getComponents() {
        C16177p c16177p = new C16177p(InterfaceC21933b.class, InterfaceC12175e.class);
        C16162a c16162a = new C16162a(FirebaseMessaging.class, new Class[0]);
        c16162a.f61421a = LIBRARY_NAME;
        c16162a.m45705a(C16171j.m45713a(C12355g.class));
        c16162a.m45705a(new C16171j(0, 0, InterfaceC31798a.class));
        c16162a.m45705a(new C16171j(0, 1, C3631b.class));
        c16162a.m45705a(new C16171j(0, 1, InterfaceC30584g.class));
        c16162a.m45705a(C16171j.m45713a(InterfaceC34150d.class));
        c16162a.m45705a(new C16171j(c16177p, 0, 1));
        c16162a.m45705a(C16171j.m45713a(InterfaceC29509b.class));
        c16162a.f61426f = new C30579b(c16177p, 1);
        if (!(c16162a.f61424d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c16162a.f61424d = 1;
        return Arrays.asList(c16162a.m45706b(), AbstractC21598x.m60712y(LIBRARY_NAME, "24.0.0"));
    }
}
