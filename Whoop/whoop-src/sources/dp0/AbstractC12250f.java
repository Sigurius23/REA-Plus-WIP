package dp0;

import android.annotation.SuppressLint;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ep0.C13404j;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28620h0;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dp0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lep0/j;", "context", "", "isScreenOverlayVisible", "b", "(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12250f {

    /* JADX INFO: renamed from: dp0.f$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"dp0/f$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC34116n f40993a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40994b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13404j f40995c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC12251g f40996d;

        public a(InterfaceC34116n interfaceC34116n, String str, C13404j c13404j, InterfaceC12251g interfaceC12251g) {
            this.f40993a = interfaceC34116n;
            this.f40994b = str;
            this.f40995c = c13404j;
            this.f40996d = interfaceC12251g;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f40993a.mo85216g("DisposableEffect: onDispose - screenId: " + this.f40994b + ", context: " + this.f40995c, new AbstractC30556a.a[0]);
            if (this.f40994b != null) {
                this.f40996d.mo34135c();
                this.f40996d.mo34138h(this.f40994b);
            }
        }
    }

    @SuppressLint({"ComposableModifierFactory", "This is actually the standard moving forward, but lint disagrees and the agents will keep trying to change it"})
    /* JADX INFO: renamed from: b */
    public static final Modifier m34129b(Modifier modifier, C13404j c13404j, boolean z4, Composer composer, int i13, int i14) {
        C13404j c13404j2;
        AbstractC22676k.m65750j(modifier, "<this>");
        boolean z13 = (i14 & 2) != 0 ? false : z4;
        C28655q c28655q = (C28655q) composer;
        InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("CoachEverywhereModifier");
        Boolean boolValueOf = Boolean.valueOf(z13);
        boolean zM87157i = c28655q.m87157i(c13404j) | c28655q.m87157i(interfaceC34116nM107848a) | ((((i13 & 896) ^ 384) > 256 && c28655q.m87155h(z13)) || (i13 & 384) == 256) | c28655q.m87157i(interfaceC12251g);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            c13404j2 = c13404j;
            C4614e c4614e = new C4614e(c13404j2, interfaceC34116nM107848a, z13, interfaceC12251g, 3);
            c28655q.m87172p0(c4614e);
            objM87133R = c4614e;
        } else {
            c13404j2 = c13404j;
        }
        AbstractC28683x.m87250d(c13404j2, boolValueOf, (Function1) objM87133R, c28655q);
        return modifier.mo3471e(C2314t.f9131w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC28620h0 m34130c(C13404j c13404j, InterfaceC34116n interfaceC34116n, boolean z4, InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        String screenId = c13404j != null ? c13404j.getScreenId() : null;
        boolean z13 = false;
        interfaceC34116n.mo85216g("DisposableEffect: registerCoachEverywhere - screenId: " + screenId + ", context: " + c13404j, new AbstractC30556a.a[0]);
        if (screenId != null) {
            if (c13404j != null && c13404j.getIsWceEnabled() && !z4) {
                z13 = true;
            }
            interfaceC12251g.mo34145t(z13, c13404j);
        }
        return new a(interfaceC34116n, screenId, c13404j, interfaceC12251g);
    }
}
