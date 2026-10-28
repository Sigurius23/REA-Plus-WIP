package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import p180h0.InterfaceC16427n1;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p512u2.AbstractC34452c0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.f6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15008f6 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f56136E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f56137F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28670t2 f56138G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f56139H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f56140w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC16427n1 f56141x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC21083i f56142y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56143z;

    public C15008f6(boolean z4, C15091n5 c15091n5, InterfaceC21083i interfaceC21083i, float f13, boolean z13, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC28601c1 interfaceC28601c1) {
        this.f56140w = z4;
        this.f56141x = c15091n5;
        this.f56142y = interfaceC21083i;
        this.f56143z = f13;
        this.f56136E = z13;
        this.f56137F = interfaceC28690z0;
        this.f56138G = interfaceC28690z1;
        this.f56139H = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifierM108905d = (Modifier) obj;
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(1945228890);
        if (this.f56140w) {
            c28655q.m87150e0(-1679801122);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            float f13 = this.f56143z;
            Float fValueOf = Float.valueOf(f13);
            boolean z4 = this.f56136E;
            Boolean boolValueOf = Boolean.valueOf(z4);
            InterfaceC16427n1 interfaceC16427n1 = this.f56141x;
            Object[] objArr = {interfaceC16427n1, this.f56142y, fValueOf, boolValueOf};
            boolean zM87147d = c28655q.m87147d(f13) | c28655q.m87155h(z4) | c28655q.m87153g(this.f56137F) | c28655q.m87153g(this.f56138G) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16427n1);
            InterfaceC28601c1 interfaceC28601c1 = this.f56139H;
            boolean zM87153g = zM87147d | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C14997e6(this.f56136E, this.f56143z, this.f56137F, this.f56138G, interfaceC2994c0, this.f56141x, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            modifierM108905d = AbstractC34452c0.m108905d(modifierM108905d, objArr, (PointerInputEventHandler) objM87133R2);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1678708124);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierM108905d;
    }
}
