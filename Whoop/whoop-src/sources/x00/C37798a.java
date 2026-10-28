package x00;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d40.AbstractC11673r;
import ec3.InterfaceC13037f2;
import j00.AbstractC21106i0;
import j00.EnumC21096d0;
import java.util.Set;
import m83.C25271y;
import p026b2.C2314t;
import p390p1.C28655q;
import p507tx.AbstractC34235f;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37891g1;

/* JADX INFO: renamed from: x00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37798a extends AbstractC37891g1 {

    /* JADX INFO: renamed from: c */
    public final EnumC21096d0 f161904c;

    /* JADX INFO: renamed from: d */
    public final C37718g0 f161905d;

    /* JADX INFO: renamed from: e */
    public final C37734l1 f161906e;

    /* JADX INFO: renamed from: f */
    public final AbstractC21106i0 f161907f;

    /* JADX INFO: renamed from: g */
    public final Function1 f161908g;

    /* JADX INFO: renamed from: h */
    public final Boolean f161909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37798a(EnumC21096d0 signupMode, C37718g0 configuration, C37734l1 linkConfigurationCoordinator, AbstractC21106i0 abstractC21106i0, Function1 onLinkInlineSignupStateChanged, Boolean bool) {
        super(C5705a.m16892a("link_form"), true);
        AbstractC22676k.m65750j(signupMode, "signupMode");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC22676k.m65750j(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        IdentifierSpec.Companion.getClass();
        this.f161904c = signupMode;
        this.f161905d = configuration;
        this.f161906e = linkConfigurationCoordinator;
        this.f161907f = abstractC21106i0;
        this.f161908g = onLinkInlineSignupStateChanged;
        this.f161909h = bool;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    @Override // x30.AbstractC37891g1
    /* JADX INFO: renamed from: g */
    public final void mo82070g(boolean z4, Set hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(364284523);
        c28655q.m87150e0(-1298466444);
        Object objM87161k = c28655q.m87161k(AbstractC11673r.f37714f);
        Modifier modifierM3396r = C2314t.f9131w;
        if (objM87161k == null) {
            modifierM3396r = AbstractC1099a.m3396r(modifierM3396r, 0.0f, 6, 1);
        }
        c28655q.m87173q(false);
        AbstractC34235f.m108222h(this.f161907f, this.f161906e, this.f161905d, this.f161904c, z4, this.f161908g, modifierM3396r, this.f161909h, c28655q, (i13 << 12) & 57344);
        c28655q.m87173q(false);
    }
}
