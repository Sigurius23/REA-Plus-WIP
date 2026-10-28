package p710im1;

import c03.C3815c;
import c93.InterfaceC4351m;
import fm1.C14599c;
import fm1.C14602f;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import java.util.List;
import jn1.AbstractC21805d;
import mn1.AbstractC25712c;
import nl0.C26804f;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p668z1.C39967p;
import p711j31.C21280k;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import p734sl0.AbstractC32611g1;
import p734sl0.C32695y0;
import v81.AbstractC35798c;

/* JADX INFO: renamed from: im1.z0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18709z0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f73472E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f73473F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f73474G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73475w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f73476x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73477y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f73478z;

    public /* synthetic */ C18709z0(int i13, C3815c c3815c, C14602f c14602f, C18665d0 c18665d0, Function1 function1, C14599c c14599c) {
        this.f73476x = i13;
        this.f73477y = c3815c;
        this.f73478z = c14602f;
        this.f73472E = c18665d0;
        this.f73473F = function1;
        this.f73474G = c14599c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73475w) {
            case 0:
                return AbstractC18657a1.m54101o(this.f73476x, (C3815c) this.f73477y, (C14602f) this.f73478z, (C18665d0) this.f73472E, (Function1) this.f73473F, (C14599c) this.f73474G, (InterfaceC26064q) obj);
            case 1:
                return MessageDao_Impl.m54710a((String) this.f73477y, (String) this.f73478z, (List) this.f73472E, this.f73476x, (List) this.f73473F, (MessageDao_Impl) this.f73474G, (InterfaceC33687a) obj);
            case 2:
                return AbstractC25712c.m75733r((List) this.f73477y, (C39967p) this.f73478z, (AbstractC21805d.c) this.f73472E, (Function1) this.f73473F, (C21280k) this.f73474G, this.f73476x, (InterfaceC26064q) obj);
            case 3:
                return AbstractC32611g1.m101768y((C32695y0) this.f73477y, this.f73476x, (C26804f) this.f73478z, (InterfaceC25312u) this.f73472E, (Function1) this.f73473F, (Function1) this.f73474G, obj);
            default:
                return AbstractC35798c.m113511o(this.f73476x, (InterfaceC4351m) this.f73477y, this.f73478z, (InterfaceC28601c1) this.f73472E, (InterfaceC28601c1) this.f73474G, (Function1) this.f73473F, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C18709z0(int i13, InterfaceC4351m interfaceC4351m, Object obj, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f73476x = i13;
        this.f73477y = interfaceC4351m;
        this.f73478z = obj;
        this.f73472E = interfaceC28601c1;
        this.f73474G = interfaceC28601c2;
        this.f73473F = function1;
    }

    public /* synthetic */ C18709z0(String str, String str2, List list, int i13, List list2, MessageDao_Impl messageDao_Impl) {
        this.f73477y = str;
        this.f73478z = str2;
        this.f73472E = list;
        this.f73476x = i13;
        this.f73473F = list2;
        this.f73474G = messageDao_Impl;
    }

    public /* synthetic */ C18709z0(List list, C39967p c39967p, AbstractC21805d.c cVar, Function1 function1, C21280k c21280k, int i13) {
        this.f73477y = list;
        this.f73478z = c39967p;
        this.f73472E = cVar;
        this.f73473F = function1;
        this.f73474G = c21280k;
        this.f73476x = i13;
    }

    public /* synthetic */ C18709z0(C32695y0 c32695y0, int i13, C26804f c26804f, InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2) {
        this.f73477y = c32695y0;
        this.f73476x = i13;
        this.f73478z = c26804f;
        this.f73472E = interfaceC25312u;
        this.f73473F = function1;
        this.f73474G = function2;
    }
}
