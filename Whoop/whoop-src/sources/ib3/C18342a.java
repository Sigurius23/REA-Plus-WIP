package ib3;

import gb3.AbstractC15702a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ra3.AbstractC31182b;
import va3.C35847e;
import va3.C35848f;
import wa3.C36998i;
import wa3.C37010o;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ib3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C18342a extends AbstractC15702a {

    /* JADX INFO: renamed from: m */
    public static final C18342a f71436m;

    static {
        C36998i c36998i = new C36998i();
        AbstractC31182b.m95913a(c36998i);
        C37010o packageFqName = AbstractC31182b.f128483a;
        AbstractC22676k.m65749i(packageFqName, "packageFqName");
        C37010o constructorAnnotation = AbstractC31182b.f128485c;
        AbstractC22676k.m65749i(constructorAnnotation, "constructorAnnotation");
        C37010o classAnnotation = AbstractC31182b.f128484b;
        AbstractC22676k.m65749i(classAnnotation, "classAnnotation");
        C37010o functionAnnotation = AbstractC31182b.f128486d;
        AbstractC22676k.m65749i(functionAnnotation, "functionAnnotation");
        C37010o propertyAnnotation = AbstractC31182b.f128487e;
        AbstractC22676k.m65749i(propertyAnnotation, "propertyAnnotation");
        C37010o propertyGetterAnnotation = AbstractC31182b.f128488f;
        AbstractC22676k.m65749i(propertyGetterAnnotation, "propertyGetterAnnotation");
        C37010o propertySetterAnnotation = AbstractC31182b.f128489g;
        AbstractC22676k.m65749i(propertySetterAnnotation, "propertySetterAnnotation");
        C37010o enumEntryAnnotation = AbstractC31182b.f128491i;
        AbstractC22676k.m65749i(enumEntryAnnotation, "enumEntryAnnotation");
        C37010o compileTimeValue = AbstractC31182b.f128490h;
        AbstractC22676k.m65749i(compileTimeValue, "compileTimeValue");
        C37010o parameterAnnotation = AbstractC31182b.f128492j;
        AbstractC22676k.m65749i(parameterAnnotation, "parameterAnnotation");
        C37010o typeAnnotation = AbstractC31182b.f128493k;
        AbstractC22676k.m65749i(typeAnnotation, "typeAnnotation");
        C37010o typeParameterAnnotation = AbstractC31182b.f128494l;
        AbstractC22676k.m65749i(typeParameterAnnotation, "typeParameterAnnotation");
        f71436m = new C18342a(c36998i, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    /* JADX INFO: renamed from: a */
    public static String m52849a(C35847e fqName) {
        String strM113817b;
        AbstractC22676k.m65750j(fqName, "fqName");
        StringBuilder sb4 = new StringBuilder();
        C35848f c35848f = fqName.f152613a;
        sb4.append(AbstractC39421y.m125927L(c35848f.f152616a, '.', '/'));
        sb4.append('/');
        if (c35848f.m113793c()) {
            strM113817b = "default-package";
        } else {
            strM113817b = c35848f.m113796g().m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
        }
        sb4.append(strM113817b.concat(".kotlin_builtins"));
        return sb4.toString();
    }
}
