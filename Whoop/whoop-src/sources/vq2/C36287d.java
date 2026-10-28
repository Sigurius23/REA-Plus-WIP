package vq2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c31.C3927k;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function3;
import so1.C32835s;
import us2.AbstractC35225f;
import vs2.AbstractC36479e;
import w90.AbstractC36952b;
import w90.C36953c;
import wo1.AbstractC37461m0;
import wo1.AbstractC37469r;
import wo1.C37463n0;
import x50.InterfaceC37988c;
import y01.AbstractC39019b;
import y01.C39020c;
import z50.AbstractC40088d;
import zz0.AbstractC41246g;
import zz0.C41252m;

/* JADX INFO: renamed from: vq2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C36287d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155524w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f155525x;

    public /* synthetic */ C36287d(Object obj, int i13) {
        this.f155524w = i13;
        this.f155525x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f155524w) {
            case 0:
                return AbstractC36289f.m116011e((C36286c) this.f155525x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC36479e.m116868b0((AbstractC35225f.c) this.f155525x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC36952b.m118655l((C3927k) this.f155525x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC36952b.m118668y((C36953c) this.f155525x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC37469r.m120110l((C32835s) this.f155525x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return AbstractC37461m0.m120034h((C37463n0) this.f155525x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC39019b.m124419k((C39020c) this.f155525x, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return AbstractC40088d.m128503v((InterfaceC37988c.c) this.f155525x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC41246g.m133986p((C41252m) this.f155525x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
