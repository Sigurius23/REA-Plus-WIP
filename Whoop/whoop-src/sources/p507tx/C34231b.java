package p507tx;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.C5576g;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.InterfaceC5570a0;
import d93.InterfaceC11820a;
import d93.InterfaceC11824e;
import j43.C21317a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p043c4.C3955e;
import p084d8.C11764a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;
import yb3.C39412p;

/* JADX INFO: renamed from: tx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34231b extends AbstractC34232c {

    /* JADX INFO: renamed from: o */
    public static final C39412p f143598o = new C39412p("^is[^a-z].*$");

    /* JADX INFO: renamed from: b */
    public final Field f143599b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f143600c;

    /* JADX INFO: renamed from: d */
    public final EnumC5595z f143601d;

    /* JADX INFO: renamed from: e */
    public final String f143602e;

    /* JADX INFO: renamed from: f */
    public final String f143603f;

    /* JADX INFO: renamed from: g */
    public final String f143604g;

    /* JADX INFO: renamed from: h */
    public final int f143605h;

    /* JADX INFO: renamed from: i */
    public final String f143606i;

    /* JADX INFO: renamed from: j */
    public final String f143607j;

    /* JADX INFO: renamed from: k */
    public final boolean f143608k;

    /* JADX INFO: renamed from: l */
    public final AbstractC22680m f143609l;

    /* JADX INFO: renamed from: m */
    public final AbstractC22680m f143610m;

    /* JADX INFO: renamed from: n */
    public final AbstractC22680m f143611n;

    public C34231b(InterfaceC5570a0 interfaceC5570a0, Class cls, Field field, Class cls2, ClassLoader classLoader) {
        String strDeclaredName;
        C3955e c3955e;
        AbstractC22680m c34230a;
        AbstractC22680m c21317a;
        C21317a c21317a2;
        this.f143599b = field;
        this.f143600c = classLoader;
        this.f143601d = interfaceC5570a0.label();
        String name = field.getName();
        AbstractC22676k.m65749i(name, "messageField.name");
        this.f143602e = name;
        this.f143603f = interfaceC5570a0.jsonName();
        if (interfaceC5570a0.declaredName().length() == 0) {
            strDeclaredName = field.getName();
            AbstractC22676k.m65749i(strDeclaredName, "messageField.name");
        } else {
            strDeclaredName = interfaceC5570a0.declaredName();
        }
        this.f143604g = strDeclaredName;
        this.f143605h = interfaceC5570a0.tag();
        this.f143606i = interfaceC5570a0.keyAdapter();
        this.f143607j = interfaceC5570a0.adapter();
        this.f143608k = interfaceC5570a0.redacted();
        if (cls2.isAssignableFrom(C5576g.class)) {
            c34230a = new C34230a(interfaceC5570a0);
        } else {
            EnumC5595z enumC5595zLabel = interfaceC5570a0.label();
            enumC5595zLabel.getClass();
            if (enumC5595zLabel == EnumC5595z.f22137z) {
                Class<?> type = field.getType();
                try {
                    c3955e = new C3955e(cls2.getMethod(name, type), 11);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("No builder method " + cls2.getName() + '.' + name + '(' + type.getName() + ')');
                }
            } else {
                try {
                    c3955e = new C3955e(cls2.getField(name), 12);
                } catch (NoSuchFieldException unused2) {
                    throw new AssertionError("No builder field " + cls2.getName() + '.' + name);
                }
            }
            c34230a = c3955e;
        }
        this.f143609l = c34230a;
        if (cls2.isAssignableFrom(C5576g.class)) {
            c21317a = new C11764a(interfaceC5570a0, 12);
        } else {
            try {
                c21317a = new C21317a(cls2.getField(name), 13);
            } catch (NoSuchFieldException unused3) {
                throw new AssertionError("No builder field " + cls2.getName() + '.' + name);
            }
        }
        this.f143610m = c21317a;
        if (Modifier.isPrivate(field.getModifiers())) {
            String fieldName = field.getName();
            AbstractC22676k.m65749i(fieldName, "fieldName");
            if (!f143598o.m125851e(fieldName)) {
                StringBuilder sb4 = new StringBuilder("get");
                if (fieldName.length() > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    String strValueOf = String.valueOf(fieldName.charAt(0));
                    AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    sb5.append((Object) upperCase);
                    String strSubstring = fieldName.substring(1);
                    AbstractC22676k.m65749i(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb5.append(strSubstring);
                    fieldName = sb5.toString();
                }
                sb4.append(fieldName);
                fieldName = sb4.toString();
            }
            c21317a2 = new C21317a(cls.getMethod(fieldName, null), 14);
        } else {
            c21317a2 = new C21317a(this, 15);
        }
        this.f143611n = c21317a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // p507tx.AbstractC34232c
    /* JADX INFO: renamed from: a */
    public final Object mo108193a(Object obj) {
        return this.f143611n.invoke((AbstractC5581l) obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c93.m, kotlin.jvm.internal.m] */
    @Override // p507tx.AbstractC34232c
    /* JADX INFO: renamed from: b */
    public final void mo108194b(Object obj, Object obj2) {
        AbstractC5579j builder = (AbstractC5579j) obj;
        AbstractC22676k.m65750j(builder, "builder");
        boolean zM16831a = this.f143601d.m16831a();
        ?? r10 = this.f143609l;
        if (zM16831a) {
            Object objM108195c = m108195c(builder);
            if (AbstractC22681m0.m65776g(objM108195c)) {
                AbstractC22676k.m65748h(objM108195c, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                AbstractC22681m0.m65771b(objM108195c).add(obj2);
                return;
            } else if (objM108195c instanceof List) {
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1((Collection) objM108195c);
                arrayListM74097F1.add(obj2);
                r10.invoke(builder, arrayListM74097F1);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (objM108195c != null ? objM108195c.getClass() : null) + '.');
            }
        }
        if (this.f143606i.length() <= 0) {
            r10.invoke(builder, obj2);
            return;
        }
        Object objM108195c2 = m108195c(builder);
        boolean z4 = objM108195c2 instanceof Map;
        if (z4 && (!(objM108195c2 instanceof InterfaceC11820a) || (objM108195c2 instanceof InterfaceC11824e))) {
            ((Map) objM108195c2).putAll((Map) obj2);
            return;
        }
        if (z4) {
            LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) objM108195c2);
            linkedHashMapM74003l0.putAll((Map) obj2);
            r10.invoke(builder, linkedHashMapM74003l0);
        } else {
            throw new ClassCastException("Expected a map type, got " + (objM108195c2 != null ? objM108195c2.getClass() : null) + '.');
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: c */
    public final Object m108195c(AbstractC5579j builder) {
        AbstractC22676k.m65750j(builder, "builder");
        return this.f143610m.invoke(builder);
    }
}
