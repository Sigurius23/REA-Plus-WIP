package p524ui;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p426qi.C30387i;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ui.a */
/* JADX INFO: loaded from: classes.dex */
public final class C34969a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C30387i f147945E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f147946F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ float f147947G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC34987o f147948H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f147949I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC28601c1 f147950J;

    /* JADX INFO: renamed from: w */
    public int f147951w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f147952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f147953y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC34971b f147954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34969a(boolean z4, boolean z13, InterfaceC34971b interfaceC34971b, C30387i c30387i, int i13, float f13, AbstractC34987o abstractC34987o, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f147952x = z4;
        this.f147953y = z13;
        this.f147954z = interfaceC34971b;
        this.f147945E = c30387i;
        this.f147946F = i13;
        this.f147947G = f13;
        this.f147948H = abstractC34987o;
        this.f147949I = i14;
        this.f147950J = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C34969a(this.f147952x, this.f147953y, this.f147954z, this.f147945E, this.f147946F, this.f147947G, this.f147948H, this.f147949I, this.f147950J, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C34969a) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f147951w;
        InterfaceC28601c1 interfaceC28601c1 = this.f147950J;
        C23454a0 c23454a0 = C23454a0.f92919a;
        boolean z4 = this.f147952x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (z4 && !((Boolean) interfaceC28601c1.getValue()).booleanValue() && this.f147953y) {
                this.f147951w = 1;
                C34981i c34981i = (C34981i) this.f147954z;
                C30387i c30387iM110470e = c34981i.m110470e();
                AbstractC34987o abstractC34987oM110469d = c34981i.m110469d();
                float fM110474l = c34981i.m110474l();
                float fMo110478b = 0.0f;
                if (fM110474l < 0.0f && c30387iM110470e == null) {
                    fMo110478b = 1.0f;
                } else if (c30387iM110470e != null) {
                    if (fM110474l < 0.0f) {
                        if (abstractC34987oM110469d != null) {
                            fMo110478b = abstractC34987oM110469d.mo110477a(c30387iM110470e);
                        } else {
                            fMo110478b = 1.0f;
                        }
                    } else if (abstractC34987oM110469d != null) {
                        fMo110478b = abstractC34987oM110469d.mo110478b(c30387iM110470e);
                    }
                }
                Object objM60422a0 = AbstractC21478l0.m60422a0(c34981i, null, fMo110478b, this, 9);
                if (objM60422a0 != enumC31071a) {
                    objM60422a0 = c23454a0;
                }
                if (objM60422a0 != enumC31071a) {
                }
            }
            return enumC31071a;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        if (z4) {
            InterfaceC34971b interfaceC34971b = this.f147954z;
            float fM110473k = ((C34981i) interfaceC34971b).m110473k();
            this.f147951w = 2;
            if (AbstractC21478l0.m60437i(interfaceC34971b, this.f147945E, this.f147946F, this.f147947G, this.f147948H, fM110473k, this.f147949I, this, 514) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }
}
