package bf0;

import a81.C0555f;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p025b1.C2217h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qs1.AbstractC30574a;
import qs1.C30575b;
import ze0.AbstractC40584c;
import ze0.InterfaceC40582a;

/* JADX INFO: renamed from: bf0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lze0/c$e$b;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onTagClick", "onUploadFailure", "Lkotlin/Function1;", "Lze0/a;", "onEvent", "f", "(Lze0/c$e$b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3194f {
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m9192f(final AbstractC40584c.e.b viewState, InterfaceC4339a onTagClick, InterfaceC4339a interfaceC4339a, final Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        boolean z13;
        Object objM87133R;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onTagClick, "onTagClick");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-106408855);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onTagClick) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onEvent)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C2217h(28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C30575b c30575b = new C30575b(viewState.getNavigationBar().getNavigationTitle(), viewState.m131605e(), viewState.getReuploadButton().getText(), viewState.getSaveButton().getText(), viewState.getNavigationBar().getTag(), viewState.getCoachFooter());
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C3189a(onEvent, 2);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                boolean zM87157i2 = c28655q.m87157i(viewState);
                if (i16 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    final int i19 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: bf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC3194f.m9195i(viewState, onEvent);
                                default:
                                    return AbstractC3194f.m9196j(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                zM87157i = c28655q.m87157i(viewState) | (i16 == 2048);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    final int i24 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: bf0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC3194f.m9195i(viewState, onEvent);
                                default:
                                    return AbstractC3194f.m9196j(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                AbstractC30574a.m93775y(c30575b, interfaceC4339a5, onTagClick, interfaceC4339a6, (InterfaceC4339a) objM87133R3, interfaceC4339a7, c28655q, C30575b.f125807g | ((i15 << 3) & 896) | ((i15 << 9) & 458752), 0);
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) onTagClick, (Object) interfaceC4339a3, onEvent, i13, i14, 10);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onEvent)) {
                i17 = 2048;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C2217h(28);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C30575b c30575b2 = new C30575b(viewState.getNavigationBar().getNavigationTitle(), viewState.m131605e(), viewState.getReuploadButton().getText(), viewState.getSaveButton().getText(), viewState.getNavigationBar().getTag(), viewState.getCoachFooter());
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C3189a(onEvent, 2);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3189a(onEvent, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            boolean zM87157i3 = c28655q.m87157i(viewState);
            if (i16 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i3 | z14;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                final int i110 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: bf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i110) {
                            case 0:
                                return AbstractC3194f.m9195i(viewState, onEvent);
                            default:
                                return AbstractC3194f.m9196j(viewState, onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i111 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: bf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i111) {
                            case 0:
                                return AbstractC3194f.m9195i(viewState, onEvent);
                            default:
                                return AbstractC3194f.m9196j(viewState, onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R2;
            zM87157i = c28655q.m87157i(viewState) | (i16 == 2048);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                final int i25 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: bf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return AbstractC3194f.m9195i(viewState, onEvent);
                            default:
                                return AbstractC3194f.m9196j(viewState, onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i26 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: bf0.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                return AbstractC3194f.m9195i(viewState, onEvent);
                            default:
                                return AbstractC3194f.m9196j(viewState, onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
            AbstractC30574a.m93775y(c30575b2, interfaceC4339a8, onTagClick, interfaceC4339a9, (InterfaceC4339a) objM87133R3, interfaceC4339a10, c28655q, C30575b.f125807g | ((i15 << 3) & 896) | ((i15 << 9) & 458752), 0);
            interfaceC4339a3 = interfaceC4339a10;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) onTagClick, (Object) interfaceC4339a3, onEvent, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m9193g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m9194h(Function1 function1) {
        function1.invoke(InterfaceC40582a.c.f174785a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m9195i(AbstractC40584c.e.b bVar, Function1 function1) {
        InterfaceC40582a interfaceC40582aM131594a = bVar.getReuploadButton().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (interfaceC40582aM131594a != null) {
            function1.invoke(interfaceC40582aM131594a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m9196j(AbstractC40584c.e.b bVar, Function1 function1) {
        InterfaceC40582a interfaceC40582aM131594a = bVar.getSaveButton().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (interfaceC40582aM131594a != null) {
            function1.invoke(interfaceC40582aM131594a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m9197k(AbstractC40584c.e.b bVar, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9192f(bVar, interfaceC4339a, interfaceC4339a2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
