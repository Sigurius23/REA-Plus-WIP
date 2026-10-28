package p734sl0;

import c41.C4067l5;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.C9598e;
import j01.C21127d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k01.C22093e;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26801c;
import nl0.C26804f;
import nl0.EnumC26800b;
import ny0.C27256h;
import oz0.C28497c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import xl0.C38450d;

/* JADX INFO: renamed from: sl0.y0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lsl0/y0;", "", "<init>", "()V", "viewEvent", "", "index", "Lnl0/f;", "viewState", "Lm91/u;", "itemViewState", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "a", "(Ljava/lang/Object;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32695y0 {
    /* JADX INFO: renamed from: a */
    public final void m102587a(Object viewEvent, int index, C26804f viewState, InterfaceC25312u itemViewState, Function1 onViewEvent, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        if (viewEvent == ArticleTileCarouselEventEnum.DISMISS) {
            onViewEvent.invoke(AbstractC26802d.q.f106803a);
            return;
        }
        if (viewEvent instanceof C28497c) {
            String id4 = viewState.getConversation().getId();
            String content = ((C28497c) viewEvent).getContent();
            List<C26801c> listM79883f = viewState.getConversation().m79883f();
            int i13 = 0;
            if (!(listM79883f instanceof Collection) || !listM79883f.isEmpty()) {
                Iterator<T> it = listM79883f.iterator();
                while (it.hasNext()) {
                    if (((C26801c) it.next()).getRole() == EnumC26800b.USER && (i13 = i13 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            onViewEvent.invoke(new AbstractC26802d.m(content, index, i13, id4, null, null, 48, null));
            return;
        }
        if (viewEvent instanceof ArticleTileModelEvent) {
            onNavigationEvent.invoke(new AbstractC25669a.a((ArticleTileModelEvent) viewEvent));
            return;
        }
        if (viewEvent instanceof C9598e) {
            if ((itemViewState instanceof C21127d) || (itemViewState instanceof C22093e)) {
                onNavigationEvent.invoke(new AbstractC25669a.h((C9598e) viewEvent));
                return;
            } else {
                onNavigationEvent.invoke(new AbstractC25669a.f((C9598e) viewEvent));
                return;
            }
        }
        if (viewEvent instanceof ArticleTileCarouselEventEnum) {
            onNavigationEvent.invoke(AbstractC25669a.g.f100946a);
            return;
        }
        if (viewEvent instanceof C4067l5) {
            onViewEvent.invoke(new AbstractC26802d.c(((C4067l5) viewEvent).getId()));
            return;
        }
        if (viewEvent instanceof C38450d) {
            onNavigationEvent.invoke(new AbstractC25669a.d(((C38450d) viewEvent).getPage()));
            return;
        }
        if (viewEvent instanceof AbstractC25669a.g) {
            onNavigationEvent.invoke(AbstractC25669a.g.f100946a);
            return;
        }
        if (viewEvent instanceof AbstractC26802d.l) {
            onViewEvent.invoke(viewEvent);
        } else if (viewEvent instanceof AbstractC26802d.a) {
            onViewEvent.invoke(viewEvent);
        } else if (viewEvent instanceof C27256h) {
            onNavigationEvent.invoke(new AbstractC25669a.f(((C27256h) viewEvent).getDestination()));
        }
    }
}
