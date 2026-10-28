package n20;

import a30.C0274a0;
import android.content.Context;
import b10.EnumC2228d;
import com.stripe.android.link.LinkActivityContract;
import g73.C15553a;
import java.util.Set;
import p599wz.C37751r0;
import p631xz.C38737n0;
import p664yy.C39865j;
import p695zx.C41193o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: n20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C26182q implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f103842E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103843w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f103844x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103845y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f103846z;

    public /* synthetic */ C26182q(int i13, InterfaceC35517d interfaceC35517d, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3) {
        this.f103843w = i13;
        this.f103844x = interfaceC35521h;
        this.f103845y = interfaceC35521h2;
        this.f103846z = interfaceC35517d;
        this.f103842E = interfaceC35521h3;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103843w) {
            case 0:
                return new C26181p((C0274a0) this.f103844x.get(), (InterfaceC30063j) this.f103845y.get(), (C26186u) this.f103846z.get(), new C15553a(28), (C26176k) this.f103842E.get());
            case 1:
                C26168c linkAnalyticsComponentFactory = (C26168c) this.f103844x.get();
                LinkActivityContract linkActivityContract = (LinkActivityContract) this.f103845y.get();
                String identifier = (String) this.f103846z.get();
                C38737n0 linkStore = (C38737n0) this.f103842E.get();
                AbstractC22676k.m65750j(linkAnalyticsComponentFactory, "linkAnalyticsComponentFactory");
                AbstractC22676k.m65750j(linkActivityContract, "linkActivityContract");
                AbstractC22676k.m65750j(identifier, "identifier");
                AbstractC22676k.m65750j(linkStore, "linkStore");
                return new C37751r0(linkAnalyticsComponentFactory, identifier, linkActivityContract, linkStore);
            case 2:
                C26168c linkAnalyticsComponentFactory2 = (C26168c) this.f103844x.get();
                LinkActivityContract linkActivityContract2 = (LinkActivityContract) this.f103845y.get();
                String identifier2 = (String) this.f103846z.get();
                C38737n0 linkStore2 = (C38737n0) this.f103842E.get();
                AbstractC22676k.m65750j(linkAnalyticsComponentFactory2, "linkAnalyticsComponentFactory");
                AbstractC22676k.m65750j(linkActivityContract2, "linkActivityContract");
                AbstractC22676k.m65750j(identifier2, "identifier");
                AbstractC22676k.m65750j(linkStore2, "linkStore");
                return new C37751r0(linkAnalyticsComponentFactory2, identifier2, linkActivityContract2, linkStore2);
            case 3:
                return new C37751r0((C26168c) this.f103844x.get(), (String) this.f103845y.get(), (LinkActivityContract) this.f103846z.get(), (C38737n0) this.f103842E.get());
            default:
                return new C41193o((Context) this.f103844x.get(), (Set) this.f103845y.get(), (EnumC2228d) this.f103846z.get(), (C39865j) this.f103842E.get());
        }
    }
}
