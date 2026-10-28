package tg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC33773e {

    /* JADX INFO: renamed from: a */
    public static final C33772d f141355a = C33772d.f141353a;

    /* JADX INFO: renamed from: a */
    String mo106776a(String str);

    /* JADX INFO: renamed from: b */
    String mo106777b(String str);

    /* JADX INFO: renamed from: c */
    default C33770b m106778c(String decoded) {
        AbstractC22676k.m65750j(decoded, "decoded");
        return new C33770b(decoded, mo106776a(decoded), this);
    }

    /* JADX INFO: renamed from: d */
    default C33770b m106779d(String encoded) {
        AbstractC22676k.m65750j(encoded, "encoded");
        return new C33770b(mo106777b(encoded), encoded, this);
    }

    String getName();
}
