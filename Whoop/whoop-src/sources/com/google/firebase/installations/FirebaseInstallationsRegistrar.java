package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.whoop.data.repositories.C6656c;
import gt.C16162a;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import gt.InterfaceC16164c;
import ht.ExecutorC17621j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p098dt.C12355g;
import p155ft.InterfaceC14761a;
import p155ft.InterfaceC14762b;
import p249jc.AbstractC21598x;
import p437qt.C30582e;
import p437qt.InterfaceC30583f;
import p505ts.C34119b;
import tt.C34149c;
import tt.InterfaceC34150d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC34150d lambda$getComponents$0(InterfaceC16164c interfaceC16164c) {
        return new C34149c((C12355g) interfaceC16164c.mo1617a(C12355g.class), interfaceC16164c.mo1621e(InterfaceC30583f.class), (ExecutorService) interfaceC16164c.mo1624h(new C16177p(InterfaceC14761a.class, ExecutorService.class)), new ExecutorC17621j((Executor) interfaceC16164c.mo1624h(new C16177p(InterfaceC14762b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C16163b> getComponents() {
        C16162a c16162a = new C16162a(InterfaceC34150d.class, new Class[0]);
        c16162a.f61421a = LIBRARY_NAME;
        c16162a.m45705a(C16171j.m45713a(C12355g.class));
        c16162a.m45705a(new C16171j(0, 1, InterfaceC30583f.class));
        c16162a.m45705a(new C16171j(new C16177p(InterfaceC14761a.class, ExecutorService.class), 1, 0));
        c16162a.m45705a(new C16171j(new C16177p(InterfaceC14762b.class, Executor.class), 1, 0));
        c16162a.f61426f = new C34119b(5);
        C16163b c16163bM45706b = c16162a.m45706b();
        C30582e c30582e = new C30582e(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C16177p.m45715a(C30582e.class));
        return Arrays.asList(c16163bM45706b, new C16163b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C6656c(c30582e, 4), hashSet3), AbstractC21598x.m60712y(LIBRARY_NAME, "18.0.0"));
    }
}
