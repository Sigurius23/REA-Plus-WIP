package r90;

import a81.C0556g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import iz0.AbstractC21048g;
import j80.InterfaceC21416d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import o70.AbstractC27628b;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p043c4.C3948a0;
import p077d0.C11362i1;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p714k80.AbstractC22280i;
import p714k80.AbstractC22284m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p725ot1.C28329e;
import p730qt2.C30599e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r70.C31050b;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: r90.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lr90/j;", "viewState", "", "jumpCtaTitle", "acceptCtaTitle", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onAccept", "onDismissRequest", "k", "(Lr90/j;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "r", "(Lr90/j;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31101h {

    /* JADX INFO: renamed from: r90.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyDetailDialogKt$PrivacyDialog$2$2$1$1$1$1", m100430f = "PrivacyDetailDialog.kt", m100431l = {178}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128289w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f128290x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13821r1 c13821r1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128290x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f128290x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128289w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f128290x;
                int iM87024x = c13821r1.f49321d.m87024x();
                this.f128289w = 1;
                if (c13821r1.m39184f(iM87024x, new C11362i1(null, 7), this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m95830k(C31103j viewState, String str, String acceptCtaTitle, Function1 onViewEvent, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(acceptCtaTitle, "acceptCtaTitle");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1903704938);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i15 |= c28655q.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(acceptCtaTitle) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i17 = 131072;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C31050b(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C31050b(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    z13 = (i15 & 458752) == 131072;
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C28329e(interfaceC4339a4, 22);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(3), AbstractC37817c.m121344e(304919021, c28655q, new C0556g(viewState, str2, acceptCtaTitle, interfaceC4339a7, onViewEvent, 19)), c28655q, 432);
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(viewState, str, acceptCtaTitle, onViewEvent, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a4 = interfaceC4339a2;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C31050b(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31050b(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if ((i15 & 458752) == 131072) {
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C28329e(interfaceC4339a4, 22);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28329e(interfaceC4339a4, 22);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(3), AbstractC37817c.m121344e(304919021, c28655q, new C0556g(viewState, str2, acceptCtaTitle, interfaceC4339a7, onViewEvent, 19)), c28655q, 432);
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(viewState, str, acceptCtaTitle, onViewEvent, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i17 = 131072;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C31050b(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31050b(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if ((i15 & 458752) == 131072) {
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C28329e(interfaceC4339a4, 22);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28329e(interfaceC4339a4, 22);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(3), AbstractC37817c.m121344e(304919021, c28655q, new C0556g(viewState, str2, acceptCtaTitle, interfaceC4339a7, onViewEvent, 19)), c28655q, 432);
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(viewState, str, acceptCtaTitle, onViewEvent, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a4 = interfaceC4339a2;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C31050b(23);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31050b(24);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            }
            if ((i15 & 458752) == 131072) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C28329e(interfaceC4339a4, 22);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C28329e(interfaceC4339a4, 22);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(3), AbstractC37817c.m121344e(304919021, c28655q, new C0556g(viewState, str2, acceptCtaTitle, interfaceC4339a7, onViewEvent, 19)), c28655q, 432);
            interfaceC4339a5 = interfaceC4339a7;
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
        }
        interfaceC4339a6 = interfaceC4339a4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(viewState, str, acceptCtaTitle, onViewEvent, interfaceC4339a5, interfaceC4339a6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m95831l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m95832m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m95833n(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m95834o(C31103j c31103j, String str, String str2, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC27628b abstractC27628bM95843b = c31103j.getDetails().getState();
            boolean zM65745e = AbstractC22676k.m65745e(abstractC27628bM95843b, AbstractC27628b.a.f111179a);
            C2314t c2314t = C2314t.f9131w;
            if (zM65745e) {
                c28655q.m87150e0(-13148583);
                float f13 = 8;
                Modifier modifierM3409f = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(3 * f13, AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(2 * f13), 0.0f, 4)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9111N, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21273g = AbstractC8693b.m21273g(AbstractC38022b.f162910u, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i14).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                EnumC27284v enumC27284v = EnumC27284v.TextSmall;
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC38022b.f162882W, c28655q, 0);
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c31103j);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31094a(function1, c31103j, 2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(null, enumC27284v, strM21273g2, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (AbstractC22676k.m65745e(abstractC27628bM95843b, AbstractC27628b.b.f111180a)) {
                c28655q.m87150e0(-11808205);
                m95837r(c31103j, str, str2, interfaceC4339a, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (!AbstractC22676k.m65745e(abstractC27628bM95843b, AbstractC27628b.c.f111181a)) {
                    throw AbstractC11895b.m32003v(969405852, c28655q, false);
                }
                c28655q.m87150e0(-11533638);
                C2307m c2307m = C2299e.f9102E;
                float f14 = 8;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(3 * f14, AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(2 * f14), 0.0f, 4)));
                float f15 = 4;
                Modifier modifierM3411h = AbstractC1102d.m3411h(25 * f15, modifierM3409f2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC35684p.m113047h(AbstractC1102d.m3419p(7 * f15, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 2.0f, 0, null, null, null, null, c28655q, 3078, 500);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m95835p(Function1 function1, C31103j c31103j) {
        function1.invoke(new InterfaceC21416d.c(c31103j.getId(), c31103j.getFullTermsUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m95836q(C31103j c31103j, String str, String str2, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m95830k(c31103j, str, str2, function1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0301  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0233  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:95:0x0283  */
    /* JADX WARN: Code duplicated, block: B:96:0x0289  */
    /* JADX INFO: renamed from: r */
    private static final void m95837r(C31103j c31103j, String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        C13821r1 c13821r1M92099U;
        C2307m c2307m;
        int iHashCode;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a4;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        float f13;
        float f14;
        int iHashCode2;
        C0209i c0209i5;
        int iHashCode3;
        C0209i c0209i6;
        boolean z13;
        Object objM87133R2;
        int i16;
        boolean z14;
        boolean z15;
        int iHashCode4;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(18576012);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(c31103j) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C31050b(25);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a4 = interfaceC4339a2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                float f15 = 8;
                f13 = 2 * f15;
                f14 = 3 * f15;
                Modifier modifierM3409f = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(f14, AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(f13), 0.0f, 4)));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i5 = c0209i3;
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q2, 6);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                c0209i6 = c0209i5;
                c28655q = c28655q2;
                AbstractC21048g.m58807M(c31103j.getDetails().getBody(), c2314t, false, null, null, 0, 0, 0, false, c28655q, 48, 508);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(str2);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C28329e(interfaceC4339a4, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                i16 = TextResource.$stable;
                AbstractC22280i.m64006d(false, textResourceM21278l, null, null, null, interfaceC4339a5, c28655q, i16 << 3, 29);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (c13821r1M92099U.mo39183d()) {
                    c28655q.m87150e0(-374249715);
                    if (str == null) {
                        c28655q.m87150e0(1283160724);
                        z15 = false;
                        c28655q.m87173q(false);
                        z14 = true;
                    } else {
                        z15 = false;
                        c28655q.m87150e0(1283160725);
                        Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1092a.m3357b(AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(f14, c2314t)), AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(f13), 0.0f, 4), C2299e.f9105H);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(str);
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r1M92099U);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i || objM87133R3 == c28676v0) {
                            objM87133R3 = new C30599e(11, interfaceC2994c0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22284m.m64016d(textResourceM21278l2, (InterfaceC4339a) objM87133R3, c28655q, i16, 0);
                        z14 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                } else {
                    z14 = true;
                    c28655q.m87150e0(1283965392);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) c31103j, str, str2, (InterfaceC23459e) interfaceC4339a3, i13, i14, 19);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C31050b(25);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            c13821r1M92099U = AbstractC30060g.m92099U(6, c28655q2, 0);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a4 = interfaceC4339a2;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
            float f16 = 8;
            f13 = 2 * f16;
            f14 = 3 * f16;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(f14, AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(f13), 0.0f, 4)));
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q2, 6);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
            c0209i6 = c0209i5;
            c28655q = c28655q2;
            AbstractC21048g.m58807M(c31103j.getDetails().getBody(), c2314t, false, null, null, 0, 0, 0, false, c28655q, 48, 508);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(str2);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C28329e(interfaceC4339a4, 23);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C28329e(interfaceC4339a4, 23);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
            i16 = TextResource.$stable;
            AbstractC22280i.m64006d(false, textResourceM21278l3, null, null, null, interfaceC4339a6, c28655q, i16 << 3, 29);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (c13821r1M92099U.mo39183d()) {
                c28655q.m87150e0(-374249715);
                if (str == null) {
                    c28655q.m87150e0(1283160724);
                    z15 = false;
                    c28655q.m87173q(false);
                    z14 = true;
                } else {
                    z15 = false;
                    c28655q.m87150e0(1283160725);
                    Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(AbstractC1092a.m3357b(AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(f14, c2314t)), AbstractC15673b0.m44012U(), AbstractC33253j.m105489e(f13), 0.0f, 4), C2299e.f9105H);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3400a2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(str);
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r1M92099U);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C30599e(11, interfaceC2994c0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C30599e(11, interfaceC2994c0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22284m.m64016d(textResourceM21278l4, (InterfaceC4339a) objM87133R3, c28655q, i16, 0);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
            } else {
                z14 = true;
                c28655q.m87150e0(1283965392);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) c31103j, str, str2, (InterfaceC23459e) interfaceC4339a3, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m95838s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m95839t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m95840u(InterfaceC2994c0 interfaceC2994c0, C13821r1 c13821r1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c13821r1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m95841v(C31103j c31103j, String str, String str2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m95837r(c31103j, str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
