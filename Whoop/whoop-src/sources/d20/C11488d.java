package d20;

import a30.C0332w0;
import android.content.Context;
import androidx.lifecycle.C1601k1;
import b00.C2179a;
import b10.C2222b;
import b10.InterfaceC2227c1;
import b20.C2326f;
import bc3.InterfaceC2994c0;
import bz.InterfaceC3704c;
import c10.C3831n;
import h20.C16651f;
import h20.C16776z4;
import java.util.Set;
import k20.C22136a;
import p442qy.C30765d;
import p479s4.AbstractC32126g;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p599wz.C37751r0;
import p631xz.C38747x;
import p664yy.C39865j;
import p664yy.InterfaceC39860g0;
import p665yz.C39899b;
import p697zz.C41234a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import s00.C32038a;
import s10.C32064f;
import sz.C33124c0;
import sz.C33125d;
import sz.C33127e;
import t10.C33285e;
import t10.C33300t;
import t40.C33536f;
import u10.C34416d;
import v00.C35459c0;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import z20.C40013g;

/* JADX INFO: renamed from: d20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11488d implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f36941E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f36942F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f36943G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36944w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f36945x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f36946y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f36947z;

    public /* synthetic */ C11488d(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35521h interfaceC35521h6, int i13) {
        this.f36944w = i13;
        this.f36945x = interfaceC35521h;
        this.f36946y = interfaceC35521h2;
        this.f36947z = interfaceC35521h3;
        this.f36941E = interfaceC35521h4;
        this.f36942F = interfaceC35521h5;
        this.f36943G = interfaceC35521h6;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f36944w) {
            case 0:
                return new C11487c((InterfaceC2227c1) this.f36945x.get(), (C39865j) this.f36946y.get(), (C2222b) this.f36947z.get(), (InterfaceC39860g0) this.f36941E.get(), (C30765d) this.f36942F.get(), (InterfaceC30063j) this.f36943G.get());
            case 1:
                return new C32038a((InterfaceC2994c0) this.f36945x.get(), (C37734l1) this.f36946y.get(), (C37751r0) this.f36947z.get(), (C30765d) this.f36941E.get(), (C1601k1) this.f36942F.get(), (C39899b) this.f36943G.get());
            case 2:
                Context context = (Context) this.f36945x.get();
                C33124c0 googlePayConfig = (C33124c0) this.f36946y.get();
                C30765d logger = (C30765d) this.f36947z.get();
                C2326f errorReporter = (C2326f) this.f36941E.get();
                InterfaceC35320a cardBrandFilter = (InterfaceC35320a) this.f36942F.get();
                InterfaceC35322b cardFundingFilter = (InterfaceC35322b) this.f36943G.get();
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(googlePayConfig, "googlePayConfig");
                AbstractC22676k.m65750j(logger, "logger");
                AbstractC22676k.m65750j(errorReporter, "errorReporter");
                AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
                AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
                Context applicationContext = context.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                return new C33125d(applicationContext, googlePayConfig.f138175w, AbstractC32126g.m100040e(googlePayConfig.f138171E), googlePayConfig.f138172F, googlePayConfig.f138173G, new C33127e(context), errorReporter, logger, cardBrandFilter, cardFundingFilter, googlePayConfig.f138174H);
            case 3:
                return new C33285e((C35459c0) this.f36945x.get(), (C32064f) this.f36946y.get(), (C3831n) this.f36947z.get(), (C33300t) this.f36941E.get(), (C22136a) this.f36942F.get(), (InterfaceC2994c0) this.f36943G.get());
            case 4:
                return new C0332w0((C35459c0) this.f36945x.get(), (C16651f) this.f36946y.get(), (C32064f) this.f36947z.get(), (C16776z4) this.f36941E.get(), (C22136a) this.f36942F.get(), this.f36943G);
            case 5:
                return new C34416d(this.f36945x, (C35459c0) this.f36946y.get(), (C16651f) this.f36947z.get(), (C32064f) this.f36941E.get(), (C22136a) this.f36942F.get(), this.f36943G);
            case 6:
                return new C39899b((C39865j) this.f36945x.get(), (C2222b) this.f36946y.get(), (C2326f) this.f36947z.get(), (InterfaceC30063j) this.f36941E.get(), (C30765d) this.f36942F.get(), (InterfaceC3704c) this.f36943G.get());
            case 7:
                return new C40013g((InterfaceC2227c1) this.f36945x.get(), this.f36946y, (C30765d) this.f36947z.get(), (C2326f) this.f36941E.get(), (InterfaceC30063j) this.f36942F.get(), (Set) this.f36943G.get());
            default:
                return new C41234a((C2179a) this.f36945x.get(), (C33536f) this.f36946y.get(), (C38747x) this.f36947z.get(), (C37718g0) this.f36941E.get(), (C2326f) this.f36942F.get(), (InterfaceC30063j) this.f36943G.get());
        }
    }
}
