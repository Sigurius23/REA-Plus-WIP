package id1;

import g91.AbstractC15602a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: id1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lid1/b;", "Lg91/a;", "a", "(Lid1/b;)Lg91/a;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18413d {
    /* JADX INFO: renamed from: a */
    public static final AbstractC15602a m52994a(AbstractC18411b abstractC18411b) {
        AbstractC22676k.m65750j(abstractC18411b, "<this>");
        if (abstractC18411b instanceof AbstractC18411b.a) {
            return new AbstractC15602a.a(((AbstractC18411b.a) abstractC18411b).getItemType());
        }
        if (abstractC18411b instanceof AbstractC18411b.b) {
            return new AbstractC15602a.b(((AbstractC18411b.b) abstractC18411b).getSearchQuery());
        }
        throw new NoWhenBranchMatchedException();
    }
}
