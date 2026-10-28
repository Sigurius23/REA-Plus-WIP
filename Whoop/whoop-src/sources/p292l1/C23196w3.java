package p292l1;

import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11372l;
import p132f0.EnumC13840z0;
import p180h0.C16416l0;
import p316m1.C24893b0;
import p316m1.C24902g;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.w3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23196w3 {

    /* JADX INFO: renamed from: a */
    public final boolean f91783a;

    /* JADX INFO: renamed from: b */
    public final Function1 f91784b;

    /* JADX INFO: renamed from: c */
    public final boolean f91785c;

    /* JADX INFO: renamed from: d */
    public InterfaceC11372l f91786d;

    /* JADX INFO: renamed from: e */
    public final C24902g f91787e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11337c0 f91788f;

    /* JADX INFO: renamed from: g */
    public InterfaceC11337c0 f91789g;

    public C23196w3(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, EnumC23202x3 enumC23202x3, Function1 function1, boolean z13) {
        this.f91783a = z4;
        this.f91784b = function1;
        this.f91785c = z13;
        if (z4 && enumC23202x3 == EnumC23202x3.f91822y) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z13 && enumC23202x3 == EnumC23202x3.f91820w) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f91786d = AbstractC23178t3.f91694b;
        this.f91787e = new C24902g(enumC23202x3, new C16416l0(interfaceC4339a, 15), interfaceC4339a2, new C19683b(this, 19), function1);
        this.f91788f = AbstractC11348f.m30572t();
        this.f91789g = AbstractC11348f.m30572t();
    }

    /* JADX INFO: renamed from: a */
    public static Object m67149a(C23196w3 c23196w3, EnumC23202x3 enumC23202x3, InterfaceC11337c0 interfaceC11337c0, InterfaceC30057d interfaceC30057d) {
        Object objM73006b = c23196w3.f91787e.m73006b(enumC23202x3, EnumC13840z0.f49374w, new C23190v3(c23196w3, c23196w3.f91787e.f97551k.m87022x(), interfaceC11337c0, null), interfaceC30057d);
        return objM73006b == EnumC31071a.f128113w ? objM73006b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m67150b(AbstractC32275i abstractC32275i) {
        Object objM67149a;
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91821x;
        return (((Boolean) this.f91784b.invoke(enumC23202x3)).booleanValue() && (objM67149a = m67149a(this, enumC23202x3, this.f91788f, abstractC32275i)) == EnumC31071a.f128113w) ? objM67149a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC23202x3 m67151c() {
        return (EnumC23202x3) this.f91787e.f97547g.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Object m67152d(InterfaceC30057d interfaceC30057d) {
        Object objM67149a;
        if (this.f91785c) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
        return (((Boolean) this.f91784b.invoke(enumC23202x3)).booleanValue() && (objM67149a = m67149a(this, enumC23202x3, this.f91789g, interfaceC30057d)) == EnumC31071a.f128113w) ? objM67149a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67153e() {
        return this.f91787e.f97547g.getValue() != EnumC23202x3.f91820w;
    }

    /* JADX INFO: renamed from: f */
    public final Object m67154f(AbstractC32275i abstractC32275i) {
        Object objM67149a;
        if (this.f91783a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91822y;
        return (((Boolean) this.f91784b.invoke(enumC23202x3)).booleanValue() && (objM67149a = m67149a(this, enumC23202x3, this.f91789g, abstractC32275i)) == EnumC31071a.f128113w) ? objM67149a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m67155g(AbstractC32275i abstractC32275i) {
        Object objM67149a;
        C24893b0 c24893b0M73008d = this.f91787e.m73008d();
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91822y;
        if (!c24893b0M73008d.f97517a.containsKey(enumC23202x3)) {
            enumC23202x3 = EnumC23202x3.f91821x;
        }
        return (((Boolean) this.f91784b.invoke(enumC23202x3)).booleanValue() && (objM67149a = m67149a(this, enumC23202x3, this.f91788f, abstractC32275i)) == EnumC31071a.f128113w) ? objM67149a : C23454a0.f92919a;
    }
}
