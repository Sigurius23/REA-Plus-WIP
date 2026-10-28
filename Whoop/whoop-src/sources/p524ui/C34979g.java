package p524ui;

import c93.InterfaceC4339a;
import p426qi.C30387i;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ui.g */
/* JADX INFO: loaded from: classes.dex */
public final class C34979g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f147997w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34981i f147998x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34979g(C34981i c34981i, int i13) {
        super(0);
        this.f147997w = i13;
        this.f147998x = c34981i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f147997w) {
            case 0:
                C34981i c34981i = this.f147998x;
                C30387i c30387iM110470e = c34981i.m110470e();
                float fMo110477a = 0.0f;
                if (c30387iM110470e != null) {
                    if (c34981i.m110474l() < 0.0f) {
                        AbstractC34987o abstractC34987oM110469d = c34981i.m110469d();
                        if (abstractC34987oM110469d != null) {
                            fMo110477a = abstractC34987oM110469d.mo110478b(c30387iM110470e);
                        }
                    } else {
                        AbstractC34987o abstractC34987oM110469d2 = c34981i.m110469d();
                        fMo110477a = abstractC34987oM110469d2 != null ? abstractC34987oM110469d2.mo110477a(c30387iM110470e) : 1.0f;
                    }
                }
                return Float.valueOf(fMo110477a);
            case 1:
                C34981i c34981i2 = this.f147998x;
                return Float.valueOf((((Boolean) c34981i2.f148018z.getValue()).booleanValue() && c34981i2.m110472j() % 2 == 0) ? -c34981i2.m110474l() : c34981i2.m110474l());
            default:
                C34981i c34981i3 = this.f147998x;
                return Boolean.valueOf(c34981i3.m110472j() == ((Number) c34981i3.f148017y.getValue()).intValue() && c34981i3.m110473k() == c34981i3.m110471g());
        }
    }
}
