package gv1;

import i51.AbstractC18111h;
import i51.C18112i;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: gv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Li51/i;", "", "isOverrideEnabled", "Lgv1/o;", "lottieSource", "a", "(Li51/i;ZLgv1/o;)Li51/i;", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16227a {
    /* JADX INFO: renamed from: a */
    public static final C18112i m45933a(C18112i c18112i, boolean z4, AbstractC16241o abstractC16241o) {
        AbstractC22676k.m65750j(c18112i, "<this>");
        if (!z4 || abstractC16241o == null) {
            return c18112i;
        }
        InterfaceC35689r0 interfaceC35689r0M46026b = AbstractC16242p.m46026b(abstractC16241o);
        if (interfaceC35689r0M46026b != null) {
            return C18112i.m51978b(c18112i, new AbstractC18111h.d(interfaceC35689r0M46026b), null, null, null, null, false, 62, null);
        }
        AbstractC22403o abstractC22403oM46025a = AbstractC16242p.m46025a(abstractC16241o);
        return abstractC22403oM46025a != null ? C18112i.m51978b(c18112i, new AbstractC18111h.c(abstractC22403oM46025a), null, null, null, null, false, 62, null) : c18112i;
    }
}
