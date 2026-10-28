package p715kotlin.reflect.jvm.internal;

import j93.InterfaceC21463e;
import ob3.InterfaceC27802l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KTypeAliasImpl;", "Lj93/e;", "Lob3/l;", "Lva3/e;", "fqName", "<init>", "(Lorg/jetbrains/kotlin/name/FqName;)V", "Lva3/e;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KTypeAliasImpl implements InterfaceC21463e, InterfaceC27802l {
    private final C35847e fqName;

    public KTypeAliasImpl(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        this.fqName = fqName;
    }

    public final C35847e getFqName() {
        return this.fqName;
    }
}
