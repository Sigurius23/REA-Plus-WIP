package ga3;

import fa3.AbstractC14331x;
import ha3.InterfaceC17064g;
import ja3.C21509f;
import l83.C23465k;
import m83.AbstractC25247g0;
import ma3.InterfaceC25373b;
import o93.AbstractC27741m;
import p249jc.AbstractC21598x;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import x93.AbstractC38109c;
import x93.C38111d;

/* JADX INFO: renamed from: ga3.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15625c {

    /* JADX INFO: renamed from: a */
    public static final C35850h f58656a = C35850h.m113814e("message");

    /* JADX INFO: renamed from: b */
    public static final C35850h f58657b = C35850h.m113814e("allowedTargets");

    /* JADX INFO: renamed from: c */
    public static final C35850h f58658c = C35850h.m113814e("value");

    /* JADX INFO: renamed from: d */
    public static final Object f58659d = AbstractC25247g0.m73990Y(new C23465k(AbstractC27741m.f111869t, AbstractC14331x.f52308c), new C23465k(AbstractC27741m.f111872w, AbstractC14331x.f52309d), new C23465k(AbstractC27741m.f111873x, AbstractC14331x.f52311f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static InterfaceC17064g m43954a(C35847e kotlinName, InterfaceC25373b annotationOwner, C41113q c3) {
        C38111d c38111dMo74422a;
        AbstractC22676k.m65750j(kotlinName, "kotlinName");
        AbstractC22676k.m65750j(annotationOwner, "annotationOwner");
        AbstractC22676k.m65750j(c3, "c");
        if (kotlinName.equals(AbstractC27741m.f111862m)) {
            C35847e DEPRECATED_ANNOTATION = AbstractC14331x.f52310e;
            AbstractC22676k.m65749i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            C38111d c38111dMo74422a2 = annotationOwner.mo74422a(DEPRECATED_ANNOTATION);
            if (c38111dMo74422a2 != null) {
                return new C15629g(c38111dMo74422a2, c3);
            }
        }
        C35847e c35847e = (C35847e) f58659d.get(kotlinName);
        if (c35847e == null || (c38111dMo74422a = annotationOwner.mo74422a(c35847e)) == null) {
            return null;
        }
        return m43955b(c38111dMo74422a, c3, false);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC17064g m43955b(C38111d annotation, C41113q c3, boolean z4) {
        AbstractC22676k.m65750j(annotation, "annotation");
        AbstractC22676k.m65750j(c3, "c");
        C35845c c35845cM122089a = AbstractC38109c.m122089a(AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation.f163219a)));
        C35847e TARGET_ANNOTATION = AbstractC14331x.f52308c;
        AbstractC22676k.m65749i(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (c35845cM122089a.equals(AbstractC35844b.m113770k(TARGET_ANNOTATION))) {
            return new C15632j(annotation, c3);
        }
        C35847e RETENTION_ANNOTATION = AbstractC14331x.f52309d;
        AbstractC22676k.m65749i(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (c35845cM122089a.equals(AbstractC35844b.m113770k(RETENTION_ANNOTATION))) {
            return new C15631i(annotation, c3);
        }
        C35847e DOCUMENTED_ANNOTATION = AbstractC14331x.f52311f;
        AbstractC22676k.m65749i(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (c35845cM122089a.equals(AbstractC35844b.m113770k(DOCUMENTED_ANNOTATION))) {
            return new C15624b(c3, annotation, AbstractC27741m.f111873x);
        }
        C35847e DEPRECATED_ANNOTATION = AbstractC14331x.f52310e;
        AbstractC22676k.m65749i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (c35845cM122089a.equals(AbstractC35844b.m113770k(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C21509f(annotation, c3, z4);
    }
}
