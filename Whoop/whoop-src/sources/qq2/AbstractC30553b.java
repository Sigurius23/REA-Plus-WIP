package qq2;

import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cw2.C11162c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q12.C29802c;
import q83.InterfaceC30057d;
import qb0.C30179a;
import qo1.C30527b;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;
import xq2.C38558e;

/* JADX INFO: renamed from: qq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0012\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "text", "", "delayTimeMillis", "Lkotlin/Function1;", "Ll83/a0;", "updateText", "Lkotlin/Function0;", "onFinished", "l", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lxq2/e;", "viewState", "Lb91/a;", "textStyle", "onAnimationComplete", "f", "(Lxq2/e;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "textToShow", "animatedText", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30553b {

    /* JADX INFO: renamed from: qq2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.shared.AnimateTextTypingKt$AnimateTextTyping$2$1", m100430f = "AnimateTextTyping.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f125730E;

        /* JADX INFO: renamed from: F */
        Object f125731F;

        /* JADX INFO: renamed from: G */
        long f125732G;

        /* JADX INFO: renamed from: H */
        int f125733H;

        /* JADX INFO: renamed from: I */
        int f125734I;

        /* JADX INFO: renamed from: J */
        int f125735J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ List<String> f125736K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC4339a f125737L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ Function1 f125738M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ long f125739N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ InterfaceC28601c1 f125740O;

        /* JADX INFO: renamed from: w */
        Object f125741w;

        /* JADX INFO: renamed from: x */
        Object f125742x;

        /* JADX INFO: renamed from: y */
        Object f125743y;

        /* JADX INFO: renamed from: z */
        Object f125744z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, InterfaceC4339a interfaceC4339a, Function1 function1, long j7, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125736K = list;
            this.f125737L = interfaceC4339a;
            this.f125738M = function1;
            this.f125739N = j7;
            this.f125740O = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f125736K, this.f125737L, this.f125738M, this.f125739N, this.f125740O, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            long j7;
            Function1 function1;
            int i13;
            InterfaceC28601c1 interfaceC28601c1;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f125735J;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<String> list = this.f125736K;
                Function1 function2 = this.f125738M;
                j7 = this.f125739N;
                function1 = function2;
                i13 = 0;
                interfaceC28601c1 = this.f125740O;
                it = list.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f125733H;
                j7 = this.f125732G;
                it = (Iterator) this.f125744z;
                interfaceC28601c1 = (InterfaceC28601c1) this.f125743y;
                function1 = (Function1) this.f125742x;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC30553b.m93702o(interfaceC28601c1, AbstractC30553b.m93701n(interfaceC28601c1) + str);
                function1.invoke(AbstractC30553b.m93701n(interfaceC28601c1));
                this.f125741w = null;
                this.f125742x = function1;
                this.f125743y = interfaceC28601c1;
                this.f125744z = it;
                this.f125730E = null;
                this.f125731F = null;
                this.f125732G = j7;
                this.f125733H = i13;
                this.f125734I = 0;
                this.f125735J = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            this.f125737L.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090 A[PHI: r0 r2
      0x0090: PHI (r0v13 b91.a) = (r0v2 b91.a), (r0v0 b91.a), (r0v0 b91.a) binds: [B:54:0x00a6, B:48:0x008c, B:49:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v14 int) = (r2v10 int), (r2v7 int), (r2v15 int) binds: [B:54:0x00a6, B:48:0x008c, B:49:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m93693f(C38558e viewState, C2886a c2886a, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C2886a c2886a2;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Object objM87133R;
        C2886a c2886a3;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        int i17;
        C2886a t14 = c2886a;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(698817420);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i17 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q.m87153g(t14) : c28655q.m87157i(t14)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
            }
            i15 |= i17;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if ((i14 & 2) != 0) {
                        t14 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
                        i15 &= -113;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30527b(16);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        c2886a3 = t14;
                    }
                    c28655q.m87175r();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    AbstractC30795n.m94707h(m93695h(interfaceC28601c1), AbstractC1136a.m3599a(C2314t.f9131w, "animText"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, 48, (C2886a.f11498d << 18) | ((i15 << 15) & 3670016), 196088);
                    c28655q = c28655q;
                    String strM21274h = AbstractC8693b.m21274h(viewState.getAnimatableText(), c28655q, TextResource.$stable);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29802c(3, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m93699l(strM21274h, 25L, (Function1) objM87133R3, interfaceC4339a3, c28655q, ((i15 << 3) & 7168) | 432, 0);
                    c2886a2 = c2886a3;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                }
                c2886a3 = t14;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q.m87175r();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                AbstractC30795n.m94707h(m93695h(interfaceC28601c1), AbstractC1136a.m3599a(C2314t.f9131w, "animText"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, 48, (C2886a.f11498d << 18) | ((i15 << 15) & 3670016), 196088);
                c28655q = c28655q;
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getAnimatableText(), c28655q, TextResource.$stable);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C29802c(3, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                m93699l(strM21274h2, 25L, (Function1) objM87133R3, interfaceC4339a3, c28655q, ((i15 << 3) & 7168) | 432, 0);
                c2886a2 = c2886a3;
            } else {
                c28655q.m87138X();
                c2886a2 = t14;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(viewState, c2886a2, interfaceC4339a3, i13, i14, 8);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if ((i14 & 2) != 0) {
                    t14 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
                    i15 &= -113;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30527b(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c2886a3 = t14;
                } else {
                    c2886a3 = t14;
                    interfaceC4339a3 = interfaceC4339a2;
                }
            } else {
                if ((i14 & 2) != 0) {
                    t14 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
                    i15 &= -113;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30527b(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c2886a3 = t14;
                } else {
                    c2886a3 = t14;
                    interfaceC4339a3 = interfaceC4339a2;
                }
            }
            c28655q.m87175r();
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            AbstractC30795n.m94707h(m93695h(interfaceC28601c1), AbstractC1136a.m3599a(C2314t.f9131w, "animText"), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, 48, (C2886a.f11498d << 18) | ((i15 << 15) & 3670016), 196088);
            c28655q = c28655q;
            String strM21274h3 = AbstractC8693b.m21274h(viewState.getAnimatableText(), c28655q, TextResource.$stable);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C29802c(3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            m93699l(strM21274h3, 25L, (Function1) objM87133R3, interfaceC4339a3, c28655q, ((i15 << 3) & 7168) | 432, 0);
            c2886a2 = c2886a3;
        } else {
            c28655q.m87138X();
            c2886a2 = t14;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(viewState, c2886a2, interfaceC4339a3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93694g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final String m93695h(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final void m93696i(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m93697j(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m93696i(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m93698k(C38558e c38558e, C2886a c2886a, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m93693f(c38558e, c2886a, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc A[LOOP:0: B:60:0x00c6->B:62:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m93699l(String text, long j7, Function1 updateText, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        long j13;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        long j14;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        Object obj;
        List list;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        ArrayList arrayList;
        int i17;
        Object objM87133R4;
        int i18;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(updateText, "updateText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1683419003);
        int i19 = (i13 & 6) == 0 ? (c28655q.m87153g(text) ? 4 : 2) | i13 : i13;
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                j13 = j7;
                i19 |= c28655q.m87151f(j13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(updateText)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i19 |= i18;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i16 = 2048;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i19 |= i16;
                }
                if ((i19 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i19 & 1, z4)) {
                    if (i24 != 0) {
                        j13 = 50;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30527b(17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        arrayList = new ArrayList(text.length());
                        for (i17 = 0; i17 < text.length(); i17++) {
                            arrayList.add(String.valueOf(text.charAt(i17)));
                        }
                        c28655q.m87172p0(arrayList);
                        obj = arrayList;
                    }
                    list = (List) obj;
                    boolean zM87157i = c28655q.m87157i(list);
                    if ((i19 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = z13 | zM87157i;
                    if ((i19 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z16 | ((i19 & 7168) == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        a aVar = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                        c28655q.m87172p0(aVar);
                        objM87133R3 = aVar;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                }
                j14 = j13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11162c(text, j14, updateText, interfaceC4339a3, i13, i14, 3);
                }
            }
            i19 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                if (i24 != 0) {
                    j13 = 50;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30527b(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    arrayList = new ArrayList(text.length());
                    while (i17 < text.length()) {
                        arrayList.add(String.valueOf(text.charAt(i17)));
                    }
                    c28655q.m87172p0(arrayList);
                    obj = arrayList;
                }
                list = (List) obj;
                boolean zM87157i2 = c28655q.m87157i(list);
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = z13 | zM87157i2;
                if ((i19 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z17 | ((i19 & 7168) == 2048);
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    a aVar2 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                    c28655q.m87172p0(aVar2);
                    objM87133R3 = aVar2;
                } else {
                    a aVar3 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                    c28655q.m87172p0(aVar3);
                    objM87133R3 = aVar3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            j14 = j13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11162c(text, j14, updateText, interfaceC4339a3, i13, i14, 3);
            }
        }
        i19 |= 48;
        j13 = j7;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(updateText)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i19 |= i18;
        }
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i16 = 2048;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i19 |= i16;
            }
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                if (i24 != 0) {
                    j13 = 50;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30527b(17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    arrayList = new ArrayList(text.length());
                    while (i17 < text.length()) {
                        arrayList.add(String.valueOf(text.charAt(i17)));
                    }
                    c28655q.m87172p0(arrayList);
                    obj = arrayList;
                }
                list = (List) obj;
                boolean zM87157i3 = c28655q.m87157i(list);
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = z13 | zM87157i3;
                if ((i19 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z18 | ((i19 & 7168) == 2048);
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    a aVar4 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                    c28655q.m87172p0(aVar4);
                    objM87133R3 = aVar4;
                } else {
                    a aVar5 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                    c28655q.m87172p0(aVar5);
                    objM87133R3 = aVar5;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            j14 = j13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11162c(text, j14, updateText, interfaceC4339a3, i13, i14, 3);
            }
        }
        i19 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i19 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i19 & 1, z4)) {
            if (i24 != 0) {
                j13 = 50;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30527b(17);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            obj = objM87133R2;
            if (objM87133R2 == c28676v0) {
                arrayList = new ArrayList(text.length());
                while (i17 < text.length()) {
                    arrayList.add(String.valueOf(text.charAt(i17)));
                }
                c28655q.m87172p0(arrayList);
                obj = arrayList;
            }
            list = (List) obj;
            boolean zM87157i4 = c28655q.m87157i(list);
            if ((i19 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z13 | zM87157i4;
            if ((i19 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z19 | ((i19 & 7168) == 2048);
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                a aVar6 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                c28655q.m87172p0(aVar6);
                objM87133R3 = aVar6;
            } else {
                a aVar7 = new a(list, interfaceC4339a4, updateText, j13, interfaceC28601c1, null);
                c28655q.m87172p0(aVar7);
                objM87133R3 = aVar7;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        j14 = j13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(text, j14, updateText, interfaceC4339a3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m93700m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m93701n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m93702o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m93703p(String str, long j7, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m93699l(str, j7, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
