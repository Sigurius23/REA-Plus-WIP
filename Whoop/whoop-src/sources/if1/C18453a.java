package if1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p213i7.C18194g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: if1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lif1/a;", "Lpg3/m;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lpg3/y0;", "retrofit", "Lpg3/n;", "Lud3/a1;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18453a extends AbstractC29199m {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m53196b(AbstractC34799a1 abstractC34799a1) {
        return abstractC34799a1.m109860m();
    }

    @Override // pg3.AbstractC29199m
    public InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        if (type.equals(String.class)) {
            return new C18194g(6);
        }
        return null;
    }
}
