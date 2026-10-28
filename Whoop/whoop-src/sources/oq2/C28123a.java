package oq2;

import androidx.compose.runtime.Composer;
import ar2.C1930a;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import lr2.InterfaceC24703d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: oq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0006\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\u00020\u000f\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0006\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Loq2/a;", "", "", "Lj93/d;", "Lkotlin/Function0;", "Loq2/c;", "stateToView", "<init>", "(Ljava/util/Map;)V", "Llr2/d;", "T", "state", "", "isCurrentStep", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "b", "(Llr2/d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Ljava/util/Map;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28123a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, InterfaceC4339a> stateToView;

    /* JADX WARN: Multi-variable type inference failed */
    public C28123a(Map<InterfaceC21461d, ? extends InterfaceC4339a> stateToView) {
        AbstractC22676k.m65750j(stateToView, "stateToView");
        this.stateToView = stateToView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m85065c(C28123a c28123a, InterfaceC24703d interfaceC24703d, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        c28123a.m85066b(interfaceC24703d, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final <T extends InterfaceC24703d> void m85066b(T state, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-160009672);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Map<InterfaceC21461d, InterfaceC4339a> map = this.stateToView;
            Class<?> cls = state.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC4339a interfaceC4339a = map.get(c22673i0.getOrCreateKotlinClass(cls));
            InterfaceC28125c interfaceC28125c = interfaceC4339a != null ? (InterfaceC28125c) interfaceC4339a.invoke() : null;
            InterfaceC28125c interfaceC28125c2 = interfaceC28125c != null ? interfaceC28125c : null;
            if (interfaceC28125c2 == null) {
                throw new IllegalStateException(("no view mapped for " + c22673i0.getOrCreateKotlinClass(state.getClass()).getSimpleName()).toString());
            }
            interfaceC28125c2.mo5916a(state, z4, onViewEvent, c28655q, i14 & 1022);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(this, state, z4, onViewEvent, i13, 23);
        }
    }
}
