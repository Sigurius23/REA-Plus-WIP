package rg3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import pg3.AbstractC29199m;
import pg3.C29203o;
import pg3.C29224y0;
import pg3.InterfaceC29201n;

/* JADX INFO: renamed from: rg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C31410a extends AbstractC29199m {

    /* JADX INFO: renamed from: a */
    public final Gson f129266a;

    public C31410a(Gson gson) {
        this.f129266a = gson;
    }

    /* JADX INFO: renamed from: a */
    public static C31410a m96728a(Gson gson) {
        if (gson != null) {
            return new C31410a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C29224y0 c29224y0) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f129266a;
        return new C31411b(gson, gson.getAdapter(typeToken));
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f129266a;
        return new C29203o(gson, gson.getAdapter(typeToken));
    }
}
