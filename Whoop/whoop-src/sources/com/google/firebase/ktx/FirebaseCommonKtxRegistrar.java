package com.google.firebase.ktx;

import androidx.annotation.Keep;
import bc3.AbstractC3076z;
import com.google.firebase.components.ComponentRegistrar;
import gt.C16162a;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import java.util.List;
import java.util.concurrent.Executor;
import l83.InterfaceC23457c;
import p155ft.InterfaceC14761a;
import p155ft.InterfaceC14762b;
import p155ft.InterfaceC14763c;
import p155ft.InterfaceC14764d;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;
import yt.C39761a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lgt/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C16163b> getComponents() {
        C16162a c16162aM45707a = C16163b.m45707a(new C16177p(InterfaceC14761a.class, AbstractC3076z.class));
        c16162aM45707a.m45705a(new C16171j(new C16177p(InterfaceC14761a.class, Executor.class), 1, 0));
        c16162aM45707a.f61426f = C39761a.f171278x;
        C16163b c16163bM45706b = c16162aM45707a.m45706b();
        C16162a c16162aM45707a2 = C16163b.m45707a(new C16177p(InterfaceC14763c.class, AbstractC3076z.class));
        c16162aM45707a2.m45705a(new C16171j(new C16177p(InterfaceC14763c.class, Executor.class), 1, 0));
        c16162aM45707a2.f61426f = C39761a.f171279y;
        C16163b c16163bM45706b2 = c16162aM45707a2.m45706b();
        C16162a c16162aM45707a3 = C16163b.m45707a(new C16177p(InterfaceC14762b.class, AbstractC3076z.class));
        c16162aM45707a3.m45705a(new C16171j(new C16177p(InterfaceC14762b.class, Executor.class), 1, 0));
        c16162aM45707a3.f61426f = C39761a.f171280z;
        C16163b c16163bM45706b3 = c16162aM45707a3.m45706b();
        C16162a c16162aM45707a4 = C16163b.m45707a(new C16177p(InterfaceC14764d.class, AbstractC3076z.class));
        c16162aM45707a4.m45705a(new C16171j(new C16177p(InterfaceC14764d.class, Executor.class), 1, 0));
        c16162aM45707a4.f61426f = C39761a.f171277E;
        return AbstractC37056f.m118959K(c16163bM45706b, c16163bM45706b2, c16163bM45706b3, c16162aM45707a4.m45706b());
    }
}
