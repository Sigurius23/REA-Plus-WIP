package com.stripe.android.paymentelement.embedded.manage;

import a30.C0273a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1643y1;
import b30.C2619s2;
import h20.C16651f;
import h53.C16940e;
import jp1.C21859k;
import k20.C22136a;
import k20.C22146k;
import l83.C23470p;
import live.hms.video.media.tracks.HMSTrackSource;
import o73.C27648a;
import p023ay.C2140n;
import p026b2.C2314t;
import p027b3.AbstractC2378g1;
import p027b3.AbstractC2453v1;
import p095dp.AbstractC12240d;
import p108e4.AbstractC12667a;
import p132f0.C13821r1;
import p163g1.C15001f;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q83.AbstractC30060g;
import rq0.C31703x;
import s10.C32064f;
import u10.AbstractC34428p;
import u10.C34417e;
import u10.C34419g;
import u10.C34420h;
import u10.C34421i;
import u10.C34429q;
import u10.C34430r;
import u10.C34434v;
import v03.C35515b;
import v03.InterfaceC35521h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;", "Lm/m;", "<init>", "()V", "Lu10/p;", HMSTrackSource.SCREEN, "", "hasResult", "Ly3/f;", "contentHeight", "Lb30/j3;", "topBarState", "Lzy/c;", "headerText", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ManageActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ int f22343G = 0;

    /* JADX INFO: renamed from: E */
    public C32064f f22344E;

    /* JADX INFO: renamed from: F */
    public C22136a f22345F;

    /* JADX INFO: renamed from: w */
    public final C23470p f22346w = AbstractC30060g.m92088H(new C34417e(this, 0));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22347x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34434v.class), new C34420h(this, 0), new C34417e(this, 1), new C34420h(this, 1));

    /* JADX INFO: renamed from: y */
    public C16651f f22348y;

    /* JADX INFO: renamed from: z */
    public C34429q f22349z;

    /* JADX INFO: renamed from: p */
    public static final void m16852p(ManageActivity manageActivity, boolean z4) {
        C16651f c16651f = manageActivity.f22348y;
        if (c16651f == null) {
            AbstractC22676k.m65757q("customerStateHolder");
            throw null;
        }
        Object value = c16651f.f64021b.f45200w.getValue();
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C0273a c0273a = (C0273a) value;
        C32064f c32064f = manageActivity.f22344E;
        if (c32064f == null) {
            AbstractC22676k.m65757q("selectionHolder");
            throw null;
        }
        C34430r c34430r = new C34430r(c0273a, (AbstractC29840y) c32064f.f132973b.f45200w.getValue(), z4);
        Intent intent = manageActivity.getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        Intent intentPutExtra = intent.putExtra("extra_activity_result", c34430r);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        manageActivity.setResult(-1, intentPutExtra);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m16853o(C34429q c34429q, AbstractC34428p abstractC34428p, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-362033229);
        if ((((c28655q.m87157i(c34429q) ? 4 : 2) | i13 | (c28655q.m87153g(abstractC34428p) ? 32 : 16) | (c28655q.m87157i(this) ? 256 : 128)) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c28655q.m87150e0(-973067970);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1777492334, c28655q, new C15001f(abstractC34428p, c34429q, this, 12));
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1765925809, c28655q, new C2140n(abstractC34428p, 10));
            c28655q.m87150e0(-973026508);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C2619s2(interfaceC39171c, interfaceC28601c1, 10);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC12240d.m34061a(c37816bM121344e, c37816bM121344e2, AbstractC1131a.m3500d(C2314t.f9131w, (Function1) objM87133R2), c13821r1M92099U, c28655q, 54, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(this, c34429q, abstractC34428p, i13, 26);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((C34421i) this.f22346w.getValue()) == null) {
            finish();
            return;
        }
        AbstractC12667a.m35444P(this);
        C16940e c16940e = ((C34434v) this.f22347x.getValue()).f144685w;
        this.f22348y = (C16651f) ((InterfaceC35521h) c16940e.f65002e).get();
        this.f22349z = (C34429q) ((C35515b) c16940e.f65012o).get();
        this.f22344E = (C32064f) ((InterfaceC35521h) c16940e.f65000c).get();
        this.f22345F = (C22136a) ((InterfaceC35521h) c16940e.f65010m).get();
        C27648a.m83591n(getOnBackPressedDispatcher(), null, new C31703x(this, 25), 3);
        AbstractC16348f.m46559a(this, new C37816b(new C34419g(this, 1), true, 573781948));
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        C22136a c22136a;
        super.onDestroy();
        if (!isFinishing() || (c22136a = this.f22345F) == null) {
            return;
        }
        C22136a.m63387i(c22136a, new C22146k(2));
    }

    /* JADX INFO: renamed from: r */
    public final C34429q m16854r() {
        C34429q c34429q = this.f22349z;
        if (c34429q != null) {
            return c34429q;
        }
        AbstractC22676k.m65757q("manageNavigator");
        throw null;
    }
}
