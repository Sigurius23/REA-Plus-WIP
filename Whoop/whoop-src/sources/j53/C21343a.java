package j53;

import c43.EnumC4208x;
import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import t23.C33392g2;

/* JADX INFO: renamed from: j53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21343a extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C21343a f81653x;

    /* JADX INFO: renamed from: y */
    public static final C21343a f81654y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81655w;

    static {
        int i13 = 2;
        f81653x = new C21343a(i13, 0);
        f81654y = new C21343a(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21343a(int i13, int i14) {
        super(i13);
        this.f81655w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f81655w) {
            case 0:
                C33392g2 a5 = (C33392g2) obj;
                C33392g2 b = (C33392g2) obj2;
                AbstractC22676k.m65750j(a5, "a");
                AbstractC22676k.m65750j(b, "b");
                Object value = a5.f139431j.getValue();
                EnumC4208x enumC4208x = EnumC4208x.f17069x;
                return Boolean.valueOf(value == enumC4208x || b.f139431j.getValue() == enumC4208x);
            default:
                C33392g2 a14 = (C33392g2) obj;
                C33392g2 b6 = (C33392g2) obj2;
                AbstractC22676k.m65750j(a14, "a");
                AbstractC22676k.m65750j(b6, "b");
                Object value2 = a14.f139431j.getValue();
                EnumC4208x enumC4208x2 = EnumC4208x.f17068w;
                return Boolean.valueOf((value2 == enumC4208x2 && b6.f139431j.getValue() == enumC4208x2) ? false : true);
        }
    }
}
