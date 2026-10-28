package zl0;

import b81.C2799f;
import b81.C2803j;
import b81.EnumC2798e;
import java.util.ArrayList;
import java.util.List;
import l11.C23223e;
import l11.InterfaceC23222d;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r31.C30911f;

/* JADX INFO: renamed from: zl0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lzl0/g;", "", "Lr31/f;", "initialViewState", "<init>", "(Lr31/f;)V", "Lzl0/c;", "domainState", "Lzl0/k;", "a", "(Lzl0/c;)Lzl0/k;", "Lr31/f;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40875g {

    /* JADX INFO: renamed from: b */
    public static final int f176169b = C30911f.f127478h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30911f initialViewState;

    public C40875g(C30911f initialViewState) {
        AbstractC22676k.m65750j(initialViewState, "initialViewState");
        this.initialViewState = initialViewState;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0190  */
    /* JADX INFO: renamed from: a */
    public final C40879k m132477a(C40871c domainState) {
        EnumC2798e enumC2798e;
        InterfaceC25312u button;
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC40869a buttonState = domainState.getButtonState();
        if (buttonState instanceof InterfaceC40869a.c) {
            enumC2798e = EnumC2798e.DISABLED;
        } else if (buttonState instanceof InterfaceC40869a.d) {
            enumC2798e = EnumC2798e.SUCCESS;
        } else {
            if (!(buttonState instanceof InterfaceC40869a.a) && !(buttonState instanceof InterfaceC40869a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC2798e = EnumC2798e.ENABLED;
        }
        EnumC2798e enumC2798e2 = enumC2798e;
        List<InterfaceC25312u> listM95035f = this.initialViewState.m95035f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM95035f, 10));
        for (Object objM7969b : listM95035f) {
            if (objM7969b instanceof C2799f) {
                C2799f c2799f = (C2799f) objM7969b;
                List<InterfaceC25312u> listM7971c = c2799f.m7971c();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM7971c, 10));
                for (Object objM7983b : listM7971c) {
                    if (objM7983b instanceof C2803j) {
                        C2803j c2803j = (C2803j) objM7983b;
                        objM7983b = C2803j.m7983b(c2803j, 0, null, domainState.m132466g().contains(Integer.valueOf(c2803j.getSelectionId())), false, 0.0d, 27, null);
                    }
                    arrayList2.add(objM7983b);
                }
                objM7969b = C2799f.m7969b(c2799f, null, arrayList2, enumC2798e2, 1, null);
            }
            arrayList.add(objM7969b);
        }
        InterfaceC25312u button2 = this.initialViewState.getButton();
        C23223e c23223eM67193b = button2 instanceof C23223e ? (C23223e) button2 : null;
        if (c23223eM67193b != null) {
            InterfaceC40869a buttonState2 = domainState.getButtonState();
            if (buttonState2 instanceof InterfaceC40869a.c) {
                if (c23223eM67193b.getShowLoading()) {
                    c23223eM67193b = C23223e.m67193b(c23223eM67193b, null, null, null, null, null, null, null, InterfaceC23222d.d.f91941a, false, null, null, null, 3967, null);
                }
            } else if (buttonState2 instanceof InterfaceC40869a.d) {
                c23223eM67193b = C23223e.m67193b(c23223eM67193b, null, null, null, null, null, null, null, InterfaceC23222d.g.f91944a, false, null, null, null, 3967, null);
            } else if (buttonState2 instanceof InterfaceC40869a.a) {
                c23223eM67193b = C23223e.m67193b(c23223eM67193b, null, null, null, null, null, null, null, InterfaceC23222d.f.f91943a, false, null, null, null, 3967, null);
            } else if (!(buttonState2 instanceof InterfaceC40869a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            C23223e c23223e = c23223eM67193b;
            String prefixText = c23223e.getPrefixText();
            button = c23223e;
            if (prefixText != null && !domainState.m132466g().isEmpty()) {
                button = c23223e;
                button = C23223e.m67193b(c23223e, null, c23223e.getPrefixText() + " (" + domainState.m132466g().size() + ")", null, null, null, null, null, null, false, null, null, null, 4093, null);
            }
            if (button == null) {
                button = this.initialViewState.getButton();
            }
        } else {
            button = this.initialViewState.getButton();
        }
        return new C40879k(C30911f.m95031b(this.initialViewState, null, null, null, arrayList, button, domainState.m132466g(), null, 71, null), domainState.getFollowupMessage());
    }
}
