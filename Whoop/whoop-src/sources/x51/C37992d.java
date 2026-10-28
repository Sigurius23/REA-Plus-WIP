package x51;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import vb1.C35868a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x51.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lx51/d;", "Lm91/u;", "", "Lx51/a;", "fabList", "Lkotlin/Function1;", "", "Ll83/a0;", "onFabStateClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lkotlin/jvm/functions/Function1;", "getOnFabStateClick", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37992d implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f162752c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AbstractC37989a> fabList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onFabStateClick;

    /* JADX WARN: Multi-variable type inference failed */
    public C37992d(List<? extends AbstractC37989a> fabList, Function1 onFabStateClick) {
        AbstractC22676k.m65750j(fabList, "fabList");
        AbstractC22676k.m65750j(onFabStateClick, "onFabStateClick");
        this.fabList = fabList;
        this.onFabStateClick = onFabStateClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m121718b(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC37989a> m121719c() {
        return this.fabList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37992d)) {
            return false;
        }
        C37992d c37992d = (C37992d) other;
        return AbstractC22676k.m65745e(this.fabList, c37992d.fabList) && AbstractC22676k.m65745e(this.onFabStateClick, c37992d.onFabStateClick);
    }

    public int hashCode() {
        return this.onFabStateClick.hashCode() + (this.fabList.hashCode() * 31);
    }

    public String toString() {
        return "MultiFabViewState(fabList=" + this.fabList + ", onFabStateClick=" + this.onFabStateClick + ")";
    }

    public /* synthetic */ C37992d(List list, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37056f.m118959K(AbstractC37989a.g.f162725g, AbstractC37989a.d.f162719g, AbstractC37989a.h.f162727g, AbstractC37989a.b.f162712g, AbstractC37989a.e.f162721g, new AbstractC37989a.a(false, 1, null)) : list, (i13 & 2) != 0 ? new C35868a(14) : function1);
    }
}
