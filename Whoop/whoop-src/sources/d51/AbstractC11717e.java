package d51;

import e93.AbstractC12889b;
import g93.AbstractC15612d;
import i93.C18284j;
import i93.InterfaceC18280f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d51.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Li93/f;", "", "d", "(Li93/f;)F", "t", "b", "(Li93/f;F)F", "value", "a", "Li93/j;", "", "", "c", "(Li93/j;D)I", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11717e {
    /* JADX INFO: renamed from: a */
    public static final float m31312a(InterfaceC18280f interfaceC18280f, float f13) {
        AbstractC22676k.m65750j(interfaceC18280f, "<this>");
        return AbstractC12889b.m36283m((f13 - ((Number) interfaceC18280f.getStart()).floatValue()) / (((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue()), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static final float m31313b(InterfaceC18280f interfaceC18280f, float f13) {
        AbstractC22676k.m65750j(interfaceC18280f, "<this>");
        return ((((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue()) * f13) + ((Number) interfaceC18280f.getStart()).floatValue();
    }

    /* JADX INFO: renamed from: c */
    public static final int m31314c(C18284j c18284j, double d3) {
        AbstractC22676k.m65750j(c18284j, "<this>");
        int i13 = c18284j.f71133w;
        return i13 + ((int) (d3 * ((double) (c18284j.f71134x - i13))));
    }

    /* JADX INFO: renamed from: d */
    public static final float m31315d(InterfaceC18280f interfaceC18280f) {
        AbstractC22676k.m65750j(interfaceC18280f, "<this>");
        return ((((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue()) * AbstractC15612d.f58613x.mo43927e()) + ((Number) interfaceC18280f.getStart()).floatValue();
    }
}
