package oj2;

import c41.C4138w;
import lj2.AbstractC24475a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: oj2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Loj2/d;", "", "Lkotlin/Function1;", "Ll83/a0;", "onEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lc41/w;", "viewState", "a", "(Lc41/w;)V", "Lm91/u;", "b", "(Lm91/u;)V", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27983d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onEvent;

    public C27983d(Function1 onEvent) {
        AbstractC22676k.m65750j(onEvent, "onEvent");
        this.onEvent = onEvent;
    }

    /* JADX INFO: renamed from: a */
    private final void m84416a(C4138w viewState) {
        this.onEvent.invoke(new AbstractC24475a.a(viewState.getActivityIdV2(), viewState.getActivityDetailType()));
    }

    /* JADX INFO: renamed from: b */
    public final void m84417b(InterfaceC25312u viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        if (viewState instanceof C4138w) {
            m84416a((C4138w) viewState);
        }
    }
}
