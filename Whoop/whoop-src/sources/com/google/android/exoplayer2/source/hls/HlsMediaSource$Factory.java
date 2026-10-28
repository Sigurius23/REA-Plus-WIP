package com.google.android.exoplayer2.source.hls;

import f93.C14289a;
import g73.C15556d;
import java.util.List;
import ng3.C26701n;
import p284ko.InterfaceC22626k;
import p465rm.C31545k0;
import p499t9.C33623c0;
import p499t9.C33652u;
import p508ty.C34249c;
import p537ux.C35331f0;
import p556vm.InterfaceC36141h;
import p589wn.C37395c;
import p589wn.InterfaceC37408p;
import sn.AbstractC32721a;
import sn.InterfaceC32761u;
import vn.C36172c;
import vn.C36181l;
import vn.InterfaceC36178i;

/* JADX INFO: loaded from: classes6.dex */
public final class HlsMediaSource$Factory implements InterfaceC32761u {

    /* JADX INFO: renamed from: a */
    public final C34249c f20386a;

    /* JADX INFO: renamed from: f */
    public final C14289a f20391f = new C14289a(6);

    /* JADX INFO: renamed from: c */
    public final C33623c0 f20388c = new C33623c0();

    /* JADX INFO: renamed from: d */
    public final C35331f0 f20389d = C37395c.f159990O;

    /* JADX INFO: renamed from: b */
    public final C36172c f20387b = InterfaceC36178i.f154782a;

    /* JADX INFO: renamed from: g */
    public final C15556d f20392g = new C15556d(17);

    /* JADX INFO: renamed from: e */
    public final C26701n f20390e = new C26701n(25);

    /* JADX INFO: renamed from: i */
    public final int f20394i = 1;

    /* JADX INFO: renamed from: j */
    public final long f20395j = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public final boolean f20393h = true;

    public HlsMediaSource$Factory(InterfaceC22626k interfaceC22626k) {
        this.f20386a = new C34249c(interfaceC22626k, 13);
    }

    @Override // sn.InterfaceC32761u
    /* JADX INFO: renamed from: a */
    public final AbstractC32721a mo15565a(C31545k0 c31545k0) {
        c31545k0.f130206x.getClass();
        List list = c31545k0.f130206x.f130174b;
        boolean zIsEmpty = list.isEmpty();
        InterfaceC37408p c33652u = this.f20388c;
        if (!zIsEmpty) {
            c33652u = new C33652u(c33652u, list);
        }
        InterfaceC36141h interfaceC36141hM40833d = this.f20391f.m40833d(c31545k0);
        this.f20389d.getClass();
        C34249c c34249c = this.f20386a;
        C15556d c15556d = this.f20392g;
        return new C36181l(c31545k0, c34249c, this.f20387b, this.f20390e, interfaceC36141hM40833d, c15556d, new C37395c(c34249c, c15556d, c33652u), this.f20395j, this.f20393h, this.f20394i);
    }
}
