package cp0;

import ah0.C0882c;
import android.widget.RadioButton;
import c93.InterfaceC4339a;
import i93.C18279e;
import ih0.AbstractC18491e0;
import ik1.AbstractC18611h;
import kk1.AbstractC22546g;
import mp0.C25853s0;
import np0.C27020m;
import p132f0.C13821r1;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32658p3;
import xd2.C38217m;
import yd2.AbstractC39462d;

/* JADX INFO: renamed from: cp0.z */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11012z implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f34474E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f34475F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f34477x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f34478y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f34479z;

    public /* synthetic */ C11012z(int i13, Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f34476w = i13;
        this.f34478y = obj;
        this.f34477x = z4;
        this.f34479z = obj2;
        this.f34474E = obj3;
        this.f34475F = obj4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34476w) {
            case 0:
                return AbstractC10942a0.m28991A((InterfaceC28601c1) this.f34478y, this.f34477x, (InterfaceC28670t2) this.f34479z, (InterfaceC28670t2) this.f34474E, (InterfaceC28670t2) this.f34475F, (C29891y) obj);
            case 1:
                return AbstractC18491e0.m53536y0(this.f34477x, (C29891y) this.f34479z, (C0882c) this.f34474E, (InterfaceC28601c1) this.f34478y, (InterfaceC28601c1) this.f34475F, (C29891y) obj);
            case 2:
                return Float.valueOf(AbstractC22546g.m65264v0((AbstractC18611h.c) this.f34479z, this.f34477x, (C18279e) this.f34474E, 0.001f, (C13821r1) this.f34475F, (InterfaceC28601c1) this.f34478y, ((Float) obj).floatValue()));
            case 3:
                return C25853s0.m76366P((C25853s0) this.f34478y, this.f34477x, (RadioButton) this.f34479z, (RadioButton) this.f34474E, (RadioButton) this.f34475F, (C27020m) obj);
            case 4:
                return AbstractC32658p3.m102193R(this.f34477x, (InterfaceC28670t2) this.f34479z, (InterfaceC28670t2) this.f34474E, (InterfaceC28670t2) this.f34475F, (InterfaceC28670t2) this.f34478y, (C29891y) obj);
            default:
                return AbstractC39462d.m126030r((C38217m) this.f34478y, this.f34477x, (InterfaceC4339a) this.f34479z, (Function1) this.f34474E, (Function1) this.f34475F, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C11012z(AbstractC18611h.c cVar, boolean z4, C18279e c18279e, C13821r1 c13821r1, InterfaceC28601c1 interfaceC28601c1) {
        this.f34476w = 2;
        this.f34479z = cVar;
        this.f34477x = z4;
        this.f34474E = c18279e;
        this.f34475F = c13821r1;
        this.f34478y = interfaceC28601c1;
    }

    public /* synthetic */ C11012z(boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5) {
        this.f34476w = 4;
        this.f34477x = z4;
        this.f34479z = interfaceC28670t2;
        this.f34474E = interfaceC28670t3;
        this.f34475F = interfaceC28670t4;
        this.f34478y = interfaceC28670t5;
    }

    public /* synthetic */ C11012z(boolean z4, C29891y c29891y, C0882c c0882c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f34476w = 1;
        this.f34477x = z4;
        this.f34479z = c29891y;
        this.f34474E = c0882c;
        this.f34478y = interfaceC28601c1;
        this.f34475F = interfaceC28601c2;
    }
}
