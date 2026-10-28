package rw;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p088dc.AbstractC11895b;
import p384ow.AbstractC28430z;
import p596ww.C37654b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: rw.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C31861k {

    /* JADX INFO: renamed from: a */
    public final String f132129a;

    /* JADX INFO: renamed from: b */
    public final Field f132130b;

    /* JADX INFO: renamed from: c */
    public final String f132131c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f132132d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28430z f132133e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC28430z f132134f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f132135g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f132136h;

    public C31861k(String str, Field field, Method method, AbstractC28430z abstractC28430z, AbstractC28430z abstractC28430z2, boolean z4, boolean z13) {
        this.f132132d = method;
        this.f132133e = abstractC28430z;
        this.f132134f = abstractC28430z2;
        this.f132135g = z4;
        this.f132136h = z13;
        this.f132129a = str;
        this.f132130b = field;
        this.f132131c = field.getName();
    }

    /* JADX INFO: renamed from: a */
    public final void m99047a(C37654b c37654b, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f132132d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e5) {
                throw new JsonIOException(AbstractC11895b.m31996o("Accessor ", AbstractC34214c.m108139d(method, false), " threw exception"), e5.getCause());
            }
        } else {
            objInvoke = this.f132130b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c37654b.m121074i(this.f132129a);
        this.f132133e.mo86133c(c37654b, objInvoke);
    }
}
