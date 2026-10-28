package ci0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import f61.C14147i;
import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p163g1.AbstractC14977c8;
import p163g1.C15060k4;
import p163g1.C15061k5;
import p163g1.EnumC14988d8;
import p181h2.C16618c;
import p602x1.C37816b;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import p91.C29007a;

/* JADX INFO: renamed from: ci0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4728c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f19322E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f19323F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f19324G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19325w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f19326x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f19327y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f19328z;

    public /* synthetic */ C4728c(float f13, String str, String str2, String str3, Function1 function1, int i13) {
        this.f19326x = f13;
        this.f19328z = str;
        this.f19322E = str2;
        this.f19323F = str3;
        this.f19324G = function1;
        this.f19327y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19325w) {
            case 0:
                return AbstractC4729d.m14802t(this.f19326x, (String) this.f19328z, (String) this.f19322E, (String) this.f19323F, (Function1) this.f19324G, this.f19327y, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return C14147i.m40273Q((C14147i) this.f19328z, (C16618c) this.f19322E, (TextResource) this.f19323F, (C29007a) this.f19324G, this.f19326x, this.f19327y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                C37816b c37816b = (C37816b) this.f19328z;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f19322E;
                C15061k5 c15061k5 = (C15061k5) this.f19323F;
                C37816b c37816b2 = (C37816b) this.f19324G;
                InterfaceC39140v1 interfaceC39140v1 = (InterfaceC39140v1) obj;
                C39169a c39169a = (C39169a) obj2;
                int iMo724F = interfaceC39140v1.mo724F(AbstractC14977c8.f55961a);
                int iMo724F2 = interfaceC39140v1.mo724F(this.f19326x);
                long jM124758b = C39169a.m124758b(c39169a.f168407a, iMo724F, 0, 0, 0, 14);
                List listMo124616s0 = interfaceC39140v1.mo124616s0(EnumC14988d8.f56026w, c37816b);
                ArrayList arrayList = new ArrayList(listMo124616s0.size());
                int size = listMo124616s0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add(((InterfaceC39124q0) listMo124616s0.get(i13)).mo448T(jM124758b));
                }
                C22665e0 c22665e0 = new C22665e0();
                c22665e0.f89334w = iMo724F2 * 2;
                C22665e0 c22665e1 = new C22665e0();
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) arrayList.get(i14);
                    c22665e0.f89334w += abstractC39104j1.f168211w;
                    c22665e1.f89334w = Math.max(c22665e1.f89334w, abstractC39104j1.f168212x);
                }
                return interfaceC39140v1.mo86822W(c22665e0.f89334w, c22665e1.f89334w, C25272z.f99163w, new C15060k4(iMo724F2, arrayList, interfaceC39140v1, interfaceC4351m, c15061k5, this.f19327y, c39169a, c22665e0, c22665e1, c37816b2));
        }
    }

    public /* synthetic */ C4728c(float f13, C37816b c37816b, InterfaceC4351m interfaceC4351m, C15061k5 c15061k5, int i13, C37816b c37816b2) {
        this.f19326x = f13;
        this.f19328z = c37816b;
        this.f19322E = interfaceC4351m;
        this.f19323F = c15061k5;
        this.f19327y = i13;
        this.f19324G = c37816b2;
    }

    public /* synthetic */ C4728c(C14147i c14147i, C16618c c16618c, TextResource textResource, C29007a c29007a, float f13, int i13) {
        this.f19328z = c14147i;
        this.f19322E = c16618c;
        this.f19323F = textResource;
        this.f19324G = c29007a;
        this.f19326x = f13;
        this.f19327y = i13;
    }
}
