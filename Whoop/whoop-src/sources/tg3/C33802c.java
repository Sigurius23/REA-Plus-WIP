package tg3;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p441qx.C30742x;
import p441qx.EnumC30741w;
import pg3.InterfaceC29201n;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: tg3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C33802c implements InterfaceC29201n {

    /* JADX INFO: renamed from: x */
    public static final C26624l f141577x;

    /* JADX INFO: renamed from: w */
    public final JsonAdapter f141578w;

    static {
        C26622k c26622k = C26624l.f105882z;
        f141577x = C26622k.m79240a("EFBBBF");
    }

    public C33802c(JsonAdapter jsonAdapter) {
        this.f141578w = jsonAdapter;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) {
        AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) obj;
        InterfaceC26620j interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1();
        try {
            C26624l c26624l = f141577x;
            if (interfaceC26620jMo1940d1.mo79202d0(0L, c26624l)) {
                interfaceC26620jMo1940d1.skip(c26624l.f105883w.length);
            }
            C30742x c30742x = new C30742x(interfaceC26620jMo1940d1);
            Object objFromJson = this.f141578w.fromJson(c30742x);
            if (c30742x.mo16731k() != EnumC30741w.f126547J) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            abstractC34799a1.close();
            return objFromJson;
        } catch (Throwable th3) {
            abstractC34799a1.close();
            throw th3;
        }
    }
}
