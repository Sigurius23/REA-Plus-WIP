package p179h;

import a13.C0149g;
import p027b3.C2427q0;
import p236j.AbstractC21071j;
import p236j.C21070i;
import p267k.AbstractC22081b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16344b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f62850E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C16343a f62851w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC21071j f62852x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f62853y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC22081b f62854z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16344b(C16343a c16343a, AbstractC21071j abstractC21071j, String str, AbstractC22081b abstractC22081b, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f62851w = c16343a;
        this.f62852x = abstractC21071j;
        this.f62853y = str;
        this.f62854z = abstractC22081b;
        this.f62850E = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C21070i c21070iM58914d = this.f62852x.m58914d(this.f62853y, this.f62854z, new C0149g(this.f62850E, 1));
        C16343a c16343a = this.f62851w;
        c16343a.f62849a = c21070iM58914d;
        return new C2427q0(c16343a, 1);
    }
}
