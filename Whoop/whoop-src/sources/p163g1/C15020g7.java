package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bh.C3245h;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import java.util.Map;
import m83.AbstractC25265s;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.C11362i1;
import p180h0.AbstractC16412k1;
import p180h0.C16485z;
import p180h0.EnumC16377d2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: g1.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C15020g7 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f56206E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f56207F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Map f56208w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15093n7 f56209x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15190x4 f56210y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56211z;

    public C15020g7(Map map, C15093n7 c15093n7, C15190x4 c15190x4, InterfaceC4351m interfaceC4351m, boolean z4, boolean z13) {
        C11362i1 c11362i1 = AbstractC14987d7.f56024a;
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f56208w = map;
        this.f56209x = c15093n7;
        this.f56210y = c15190x4;
        this.f56211z = interfaceC4351m;
        this.f56206E = z4;
        this.f56207F = z13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(43594985);
        Map map = this.f56208w;
        if (map.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        if (AbstractC25265s.m74159y0(map.values()).size() != map.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        C15093n7 c15093n7 = this.f56209x;
        if (((Map) c15093n7.f56516i.getValue()).isEmpty()) {
            Float fM60433g = AbstractC21478l0.m60433g(c15093n7.f56510c.getValue(), map);
            if (fM60433g == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            c15093n7.f56512e.m87023y(fM60433g.floatValue());
            c15093n7.f56514g.m87023y(fM60433g.floatValue());
        }
        boolean zM87153g = c28655q.m87153g(c15093n7) | c28655q.m87157i(map) | c28655q.m87153g(this.f56210y) | c28655q.m87153g(this.f56211z) | c28655q.m87153g(interfaceC39171c) | c28655q.m87147d(AbstractC14987d7.f56025b);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            C3245h c3245h = new C3245h(this.f56209x, this.f56208w, this.f56210y, interfaceC39171c, this.f56211z, (InterfaceC30057d) null);
            c28655q.m87172p0(c3245h);
            objM87133R = c3245h;
        }
        AbstractC28683x.m87254h(map, c15093n7, (InterfaceC4351m) objM87133R, c28655q);
        boolean zBooleanValue = ((Boolean) c15093n7.f56511d.getValue()).booleanValue();
        C16485z c16485z = c15093n7.f56523p;
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62972x;
        boolean zM87153g2 = c28655q.m87153g(c15093n7);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C15009f7(c15093n7, null);
            c28655q.m87172p0(objM87133R2);
        }
        boolean z4 = this.f56207F;
        Modifier modifierM46598a = AbstractC16412k1.m46598a(C2314t.f9131w, c16485z, enumC16377d2, this.f56206E, null, zBooleanValue, null, (Function3) objM87133R2, z4, 32);
        c28655q.m87173q(false);
        return modifierM46598a;
    }
}
