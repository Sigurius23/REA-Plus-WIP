package x93;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import ma3.InterfaceC25376e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C38128t extends AbstractC38130v {

    /* JADX INFO: renamed from: a */
    public final Field f163238a;

    public C38128t(Field member) {
        AbstractC22676k.m65750j(member, "member");
        this.f163238a = member;
    }

    @Override // x93.AbstractC38130v
    /* JADX INFO: renamed from: c */
    public final Member mo122112c() {
        return this.f163238a;
    }

    /* JADX INFO: renamed from: j */
    public final Field m122115j() {
        return this.f163238a;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC25376e m122116k() {
        Type genericType = this.f163238a.getGenericType();
        AbstractC22676k.m65749i(genericType, "getGenericType(...)");
        boolean z4 = genericType instanceof Class;
        if (z4) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C38133y(cls);
            }
        }
        if ((genericType instanceof GenericArrayType) || (z4 && ((Class) genericType).isArray())) {
            return new C38116h(genericType);
        }
        return genericType instanceof WildcardType ? new C38112d0((WildcardType) genericType) : new C38124p(genericType);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m122117l() {
        return this.f163238a.isEnumConstant();
    }
}
