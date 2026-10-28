package e20;

import android.content.Context;
import b20.C2327g;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.NativeLinkActivityContract;
import com.stripe.android.link.WebLinkActivityContract;
import com.whoop.profile.view.edit.C9790n;
import cy.C11181b;
import h20.C16757w3;
import j20.C21241c;
import n10.C26145o0;
import ng3.C26701n;
import ng3.C26702o;
import p442qy.C30765d;
import p442qy.C30766e;
import p499t9.C33647p;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import q20.C29827l;
import qg3.C30352d;
import u00.C34377e;
import u03.InterfaceC34393a;
import v03.C35515b;
import v03.C35516c;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import v10.C35525a;

/* JADX INFO: renamed from: e20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12593a implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42977w;

    /* JADX INFO: renamed from: x */
    public final Object f42978x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f42979y;

    public /* synthetic */ C12593a(Object obj, InterfaceC35521h interfaceC35521h, int i13) {
        this.f42977w = i13;
        this.f42978x = obj;
        this.f42979y = interfaceC35521h;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f42977w) {
            case 0:
                InterfaceC34393a lazyRegistry = C35516c.m112677a((C35515b) this.f42978x);
                C35525a defaultReturnUrl = (C35525a) this.f42979y.get();
                AbstractC22676k.m65750j(lazyRegistry, "lazyRegistry");
                AbstractC22676k.m65750j(defaultReturnUrl, "defaultReturnUrl");
                return new C9790n(15, lazyRegistry, defaultReturnUrl);
            case 1:
                return new C30352d((C26145o0) ((C35518e) this.f42978x).f151137w, (C30765d) ((C11181b) this.f42979y).get());
            case 2:
                C26701n c26701n = (C26701n) this.f42978x;
                C21241c defaultAddressLauncherEventReporter = (C21241c) this.f42979y.get();
                c26701n.getClass();
                AbstractC22676k.m65750j(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
                return defaultAddressLauncherEventReporter;
            case 3:
                C26702o c26702o = (C26702o) this.f42978x;
                C16757w3 starterArgs = (C16757w3) this.f42979y.get();
                c26702o.getClass();
                AbstractC22676k.m65750j(starterArgs, "starterArgs");
                return starterArgs.f64385z;
            case 4:
                return new C29205p((C29827l) ((C2327g) this.f42978x).get(), (Context) this.f42979y.get());
            case 5:
                C33647p c33647p = (C33647p) this.f42978x;
                boolean zBooleanValue = ((Boolean) this.f42979y.get()).booleanValue();
                c33647p.getClass();
                return zBooleanValue ? C30766e.f126696a : C30766e.f126697b;
            default:
                return new LinkActivityContract((NativeLinkActivityContract) this.f42979y.get(), (WebLinkActivityContract) ((C2327g) this.f42978x).get(), new C34377e(11));
        }
    }

    public C12593a(C2327g c2327g, C2327g c2327g2) {
        this.f42977w = 6;
        this.f42979y = c2327g;
        this.f42978x = c2327g2;
    }
}
