package rw;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p384ow.AbstractC28430z;
import p596ww.C37653a;
import p596ww.C37654b;
import s30.AbstractC32100b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: rw.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31862l extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public final C31864n f132137a;

    public AbstractC31862l(C31864n c31864n) {
        this.f132137a = c31864n;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        if (c37653a.m121062o0() == 9) {
            c37653a.m121053T();
            return null;
        }
        Object objMo99048d = mo99048d();
        Map map = this.f132137a.f132140a;
        try {
            c37653a.beginObject();
            while (c37653a.hasNext()) {
                C31861k c31861k = (C31861k) map.get(c37653a.nextName());
                if (c31861k == null) {
                    c37653a.skipValue();
                } else {
                    mo99050f(objMo99048d, c37653a, c31861k);
                }
            }
            c37653a.endObject();
            return mo99049e(objMo99048d);
        } catch (IllegalAccessException e5) {
            AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalStateException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        if (obj == null) {
            c37654b.m121076m();
            return;
        }
        c37654b.beginObject();
        try {
            Iterator it = this.f132137a.f132141b.iterator();
            while (it.hasNext()) {
                ((C31861k) it.next()).m99047a(c37654b, obj);
            }
            c37654b.endObject();
        } catch (IllegalAccessException e5) {
            AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo99048d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo99049e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo99050f(Object obj, C37653a c37653a, C31861k c31861k);
}
