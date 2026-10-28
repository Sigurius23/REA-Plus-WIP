package s93;

import ab3.C0709a;
import ab3.C0710b;
import ab3.C0717i;
import ab3.C0732x;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p000.C31931s;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: s93.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32303e {

    /* JADX INFO: renamed from: a */
    public static final C35850h f133679a = C35850h.m113814e("message");

    /* JADX INFO: renamed from: b */
    public static final C35850h f133680b = C35850h.m113814e("replaceWith");

    /* JADX INFO: renamed from: c */
    public static final C35850h f133681c = C35850h.m113814e("level");

    /* JADX INFO: renamed from: d */
    public static final C35850h f133682d = C35850h.m113814e("expression");

    /* JADX INFO: renamed from: e */
    public static final C35850h f133683e = C35850h.m113814e("imports");

    /* JADX INFO: renamed from: a */
    public static final C32310l m100551a(AbstractC27736h abstractC27736h, String message, String replaceWith, String str) {
        AbstractC22676k.m65750j(abstractC27736h, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(replaceWith, "replaceWith");
        C32310l c32310l = new C32310l(abstractC27736h, AbstractC27741m.f111864o, AbstractC25247g0.m73990Y(new C23465k(f133682d, new C0732x((Object) replaceWith)), new C23465k(f133683e, new C0710b(C25271y.f99162w, new C31931s(abstractC27736h, 19)))));
        C35847e c35847e = AbstractC27741m.f111862m;
        C23465k c23465k = new C23465k(f133679a, new C0732x((Object) message));
        C23465k c23465k2 = new C23465k(f133680b, new C0709a((Object) c32310l));
        C35847e topLevelFqName = AbstractC27741m.f111863n;
        AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
        return new C32310l(abstractC27736h, c35847e, AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k(f133681c, new C0717i(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()), C35850h.m113814e(str)))));
    }
}
