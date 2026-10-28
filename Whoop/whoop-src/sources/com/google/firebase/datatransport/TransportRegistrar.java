package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dm.InterfaceC12175e;
import gm.C15989q;
import gt.C16162a;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import gt.InterfaceC16164c;
import io.sentry.okhttp.C20450b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p122em.C13321a;
import p249jc.AbstractC21598x;
import p260jt.InterfaceC21932a;
import p260jt.InterfaceC21933b;
import p505ts.AbstractC34132o;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC12175e lambda$getComponents$0(InterfaceC16164c interfaceC16164c) {
        C15989q.m45133b((Context) interfaceC16164c.mo1617a(Context.class));
        return C15989q.m45132a().m45134c(C13321a.f46155f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC12175e lambda$getComponents$1(InterfaceC16164c interfaceC16164c) {
        C15989q.m45133b((Context) interfaceC16164c.mo1617a(Context.class));
        return C15989q.m45132a().m45134c(C13321a.f46155f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC12175e lambda$getComponents$2(InterfaceC16164c interfaceC16164c) {
        C15989q.m45133b((Context) interfaceC16164c.mo1617a(Context.class));
        return C15989q.m45132a().m45134c(C13321a.f46154e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C16163b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C16177p.m45715a(InterfaceC12175e.class));
        for (Class cls : new Class[0]) {
            AbstractC34132o.m107884h(cls, "Null interface");
            hashSet.add(C16177p.m45715a(cls));
        }
        C16171j c16171jM45713a = C16171j.m45713a(Context.class);
        if (hashSet.contains(c16171jM45713a.f61451a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(c16171jM45713a);
        C16163b c16163b = new C16163b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C20450b(9), hashSet3);
        C16162a c16162aM45707a = C16163b.m45707a(new C16177p(InterfaceC21932a.class, InterfaceC12175e.class));
        c16162aM45707a.m45705a(C16171j.m45713a(Context.class));
        c16162aM45707a.f61426f = new C20450b(10);
        C16163b c16163bM45706b = c16162aM45707a.m45706b();
        C16162a c16162aM45707a2 = C16163b.m45707a(new C16177p(InterfaceC21933b.class, InterfaceC12175e.class));
        c16162aM45707a2.m45705a(C16171j.m45713a(Context.class));
        c16162aM45707a2.f61426f = new C20450b(11);
        return Arrays.asList(c16163b, c16163bM45706b, c16162aM45707a2.m45706b(), AbstractC21598x.m60712y(LIBRARY_NAME, "18.2.0"));
    }
}
