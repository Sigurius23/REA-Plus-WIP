package kb1;

import g51.C15493c;
import h91.C17027b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kb1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"DateModel", "Lh91/b;", "domainState", "", "monthIndex", "Lkotlin/Function1;", "Lkb1/e;", "Lqy0/a;", "mapper", "Lg51/c;", "a", "(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22324d {
    /* JADX INFO: renamed from: a */
    public static final <DateModel> C15493c m64148a(C17027b<DateModel> domainState, int i13, Function1 mapper) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(mapper, "mapper");
        return new C22323c(mapper).m64147e(domainState, i13);
    }
}
