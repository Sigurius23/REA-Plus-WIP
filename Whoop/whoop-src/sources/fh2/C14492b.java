package fh2;

import dh2.AbstractC12050c;
import dh2.C12048a;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import eh2.EnumC13196a;
import hh2.C17291b;
import hh2.C17295f;
import hh2.C17296g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: fh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfh2/b;", "", "<init>", "()V", "", "isStealthModeOn", "toggleSuccess", "Lhh2/g;", "previousViewState", "e", "(ZZLhh2/g;)Lhh2/g;", "Leh2/a;", "metricType", "isEnabled", "d", "(Lhh2/g;Leh2/a;Z)Lhh2/g;", "Lec3/l;", "Ldh2/c;", "upstream", "c", "(Lec3/l;)Lec3/l;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14492b {

    /* JADX INFO: renamed from: fh2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.reducer.StealthModeViewStateReducer$reduce$1", m100430f = "StealthModeViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lhh2/g;", "previousViewState", "Ldh2/c;", "currentDomainState", "<anonymous>", "(Lhh2/g;Ldh2/c;)Lhh2/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f52918w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f52919x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52920y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C17296g c17296g, AbstractC12050c abstractC12050c, InterfaceC30057d<? super C17296g> interfaceC30057d) {
            a aVar = C14492b.this.new a(interfaceC30057d);
            aVar.f52919x = c17296g;
            aVar.f52920y = abstractC12050c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C17296g c17296g = (C17296g) this.f52919x;
            AbstractC12050c abstractC12050c = (AbstractC12050c) this.f52920y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52918w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC12050c instanceof AbstractC12050c.d) {
                return C17296g.m48982b(c17296g, false, true, null, null, 13, null);
            }
            if (abstractC12050c instanceof AbstractC12050c.f) {
                return C14492b.this.m41402e(((AbstractC12050c.f) abstractC12050c).getIsStealthModeEnabled(), true, c17296g);
            }
            if (abstractC12050c instanceof AbstractC12050c.a) {
                return C14492b.this.m41402e(((AbstractC12050c.a) abstractC12050c).getIsStealthModeEnabled(), false, c17296g);
            }
            if (abstractC12050c instanceof AbstractC12050c.c) {
                return C17296g.m48982b(c17296g, true, false, null, null, 12, null);
            }
            if (abstractC12050c instanceof AbstractC12050c.h) {
                return C17296g.m48982b(c17296g, false, false, new C17295f(false, false, true, null, 11, null), null, 8, null);
            }
            if (abstractC12050c instanceof AbstractC12050c.e) {
                return C17296g.m48982b(c17296g, false, true, null, null, 13, null);
            }
            if (!(abstractC12050c instanceof AbstractC12050c.b)) {
                if (!(abstractC12050c instanceof AbstractC12050c.g)) {
                    return c17296g;
                }
                AbstractC12050c.g gVar = (AbstractC12050c.g) abstractC12050c;
                return C14492b.this.m41401d(c17296g, gVar.getMetricType(), gVar.getIsHiddenMetricEnabled());
            }
            AbstractC12050c.b bVar = (AbstractC12050c.b) abstractC12050c;
            boolean isStealthModeEnabled = bVar.getIsStealthModeEnabled();
            List<C12048a> listM33199a = bVar.m33199a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM33199a, 10));
            for (C12048a c12048a : listM33199a) {
                arrayList.add(new C17291b(c12048a.getType(), c12048a.getIsEnabled()));
            }
            return new C17296g(false, false, new C17295f(isStealthModeEnabled, false, false, arrayList, 6, null), null, 11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final C17296g m41401d(C17296g previousViewState, EnumC13196a metricType, boolean isEnabled) {
        Object next;
        C17295f stealthModeScreenViewState = previousViewState.getStealthModeScreenViewState();
        if (stealthModeScreenViewState != null) {
            Iterator<T> it = stealthModeScreenViewState.m48978c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C17291b) next).getType() != metricType);
            if (next != null) {
                List<C17291b> listM48978c = stealthModeScreenViewState.m48978c();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM48978c, 10));
                for (C17291b c17291bM48972b : listM48978c) {
                    if (c17291bM48972b.getType() == metricType) {
                        c17291bM48972b = C17291b.m48972b(c17291bM48972b, null, isEnabled, 1, null);
                    }
                    arrayList.add(c17291bM48972b);
                }
                return C17296g.m48982b(previousViewState, false, false, C17295f.m48976b(stealthModeScreenViewState, false, false, false, arrayList, 7, null), null, 9, null);
            }
        }
        return C17296g.m48982b(previousViewState, false, false, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C17296g m41402e(boolean isStealthModeOn, boolean toggleSuccess, C17296g previousViewState) {
        boolean z4;
        boolean z13;
        C17295f c17295f;
        C17295f stealthModeScreenViewState = previousViewState.getStealthModeScreenViewState();
        if (stealthModeScreenViewState != null) {
            z4 = isStealthModeOn;
            z13 = toggleSuccess;
            C17295f c17295fM48976b = C17295f.m48976b(stealthModeScreenViewState, z4, z13, false, null, 12, null);
            if (c17295fM48976b != null) {
                c17295f = c17295fM48976b;
            }
            return C17296g.m48982b(previousViewState, false, false, c17295f, null, 9, null);
        }
        z4 = isStealthModeOn;
        z13 = toggleSuccess;
        c17295f = new C17295f(z4, z13, false, null, 12, null);
        return C17296g.m48982b(previousViewState, false, false, c17295f, null, 9, null);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m41403c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C17296g(false, true, null, null, 13, null), upstream, new a(null));
    }
}
