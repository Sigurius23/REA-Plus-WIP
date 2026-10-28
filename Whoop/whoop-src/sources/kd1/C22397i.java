package kd1;

import com.mapbox.maps.MapboxMap;
import i93.C18284j;
import p031b9.AbstractC2875y;
import p294l3.C23254g;
import p412q3.C29869e0;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kd1.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkd1/i;", "Lq3/g0;", "<init>", "()V", "Ll3/g;", "text", "Lq3/e0;", "a", "(Ll3/g;)Lq3/e0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22397i implements InterfaceC29873g0 {

    /* JADX INFO: renamed from: kd1.i$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"kd1/i$a", "Lq3/r;", "", MapboxMap.QFE_OFFSET, "x", "(I)I", "n", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC29884r {
        @Override // p412q3.InterfaceC29884r
        /* JADX INFO: renamed from: n */
        public int mo15743n(int offset) {
            return offset <= 2 ? offset : offset - 1;
        }

        @Override // p412q3.InterfaceC29884r
        /* JADX INFO: renamed from: x */
        public int mo15749x(int offset) {
            return offset <= 1 ? offset : offset + 1;
        }
    }

    @Override // p412q3.InterfaceC29873g0
    /* JADX INFO: renamed from: a */
    public C29869e0 mo43546a(C23254g text) {
        AbstractC22676k.m65750j(text, "text");
        String strM125857C0 = text.f92135x;
        if (strM125857C0.length() >= 4) {
            strM125857C0 = AbstractC39414r.m125857C0(strM125857C0, new C18284j(0, 3, 1));
        }
        int length = strM125857C0.length();
        String strM8299l = "";
        for (int i13 = 0; i13 < length; i13++) {
            strM8299l = strM8299l + strM125857C0.charAt(i13);
            if (i13 == 1) {
                strM8299l = AbstractC2875y.m8299l(strM8299l, "/");
            }
        }
        return new C29869e0(new C23254g(strM8299l), new a());
    }
}
