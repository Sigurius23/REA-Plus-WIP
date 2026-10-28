package p164g2;

import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p026b2.AbstractC2316v;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g2.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C15247s {

    /* JADX INFO: renamed from: b */
    public static final C15247s f57265b = new C15247s();

    /* JADX INFO: renamed from: c */
    public static final C15247s f57266c = new C15247s();

    /* JADX INFO: renamed from: d */
    public static final C15247s f57267d = new C15247s();

    /* JADX INFO: renamed from: a */
    public final C30849c f57268a = new C30849c(new InterfaceC15248t[16]);

    /* JADX INFO: renamed from: c */
    public static void m43350c(C15247s c15247s) {
        c15247s.getClass();
        c15247s.m43351a(new C15242n(1, 3));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43351a(Function1 function1) {
        if (this == f57265b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f57266c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        C30849c c30849c = this.f57268a;
        int i13 = c30849c.f127229y;
        if (i13 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = c30849c.f127227w;
        boolean z4 = false;
        for (int i14 = 0; i14 < i13; i14++) {
            AbstractC2316v abstractC2316v = (AbstractC2316v) ((InterfaceC15248t) objArr[i14]);
            if (!abstractC2316v.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitChildren called on an unattached node");
            }
            C30849c c30849c2 = new C30849c(new AbstractC2316v[16]);
            AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w;
            AbstractC2316v abstractC2316v3 = abstractC2316v2.f9133F;
            if (abstractC2316v3 == null) {
                AbstractC0201g.m501a(c30849c2, abstractC2316v2);
            } else {
                c30849c2.m94885b(abstractC2316v3);
            }
            while (true) {
                int i15 = c30849c2.f127229y;
                if (i15 == 0) {
                    break;
                }
                AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c2.m94894l(i15 - 1);
                if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                    AbstractC0201g.m501a(c30849c2, abstractC2316vM504d);
                } else {
                    while (abstractC2316vM504d != null) {
                        if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            C30849c c30849c3 = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    C15252x c15252x = (C15252x) abstractC2316vM504d;
                                    if (c15252x.m43357Y0().f57252a ? ((Boolean) function1.invoke(c15252x)).booleanValue() : AbstractC15235g.m43320j(c15252x, 7, function1)) {
                                        z4 = true;
                                        break;
                                    }
                                } else if (((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i16 = 0;
                                    for (AbstractC2316v abstractC2316v4 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v4 != null; abstractC2316v4 = abstractC2316v4.f9133F) {
                                        if ((abstractC2316v4.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                abstractC2316vM504d = abstractC2316v4;
                                            } else {
                                                if (c30849c3 == null) {
                                                    c30849c3 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c3.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c3.m94885b(abstractC2316v4);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c3);
                            }
                            break;
                        }
                        abstractC2316vM504d = abstractC2316vM504d.f9133F;
                    }
                }
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m43352b() {
        m43351a(new C15242n(1, 3));
    }
}
