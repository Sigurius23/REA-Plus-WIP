package hh0;

import am2.C1012d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import f01.C13845b;
import f02.C13917c;
import g11.C15218b;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hb1.C17085h;
import ih0.AbstractC18489d0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.C22409u;
import kh0.AbstractC22478e;
import kh0.AbstractC22479f;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: hh0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lhh0/a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkd1/u;", "pdfCacheManager", "Ll83/a0;", "i", "(Lhh0/a;Landroidx/compose/ui/Modifier;Lkd1/u;Landroidx/compose/runtime/Composer;II)V", "Lhh0/c;", "file", "p", "(Lhh0/c;Lkd1/u;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "selectedImage", "", "filePath", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17286f {

    /* JADX INFO: renamed from: hh0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.filewidget.FileWidgetKt$PdfFileTile$1$1$1", m100430f = "FileWidget.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f66451w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22409u f66452x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17283c f66453y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f66454z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22409u c22409u, C17283c c17283c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f66452x = c22409u;
            this.f66453y = c17283c;
            this.f66454z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f66452x, this.f66453y, this.f66454z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objM64527k;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f66451w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22409u c22409u = this.f66452x;
                String strM48933c = this.f66453y.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                this.f66451w = 1;
                aVar = this;
                objM64527k = C22409u.m64527k(c22409u, strM48933c, null, aVar, 2, null);
                if (objM64527k == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM64527k = ((C23468n) obj).f92940w;
                aVar = this;
            }
            InterfaceC28601c1 interfaceC28601c1 = aVar.f66454z;
            if (!(objM64527k instanceof C23467m)) {
                AbstractC17286f.m48951r(interfaceC28601c1, ((File) objM64527k).getAbsolutePath());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m48942i(C17281a viewState, Modifier modifier, C22409u pdfCacheManager, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        boolean zIsFeatureEnabled;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        AbstractC22403o abstractC22403oM48943j;
        Object objM87133R2;
        boolean zM87157i;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(pdfCacheManager, "pdfCacheManager");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1787975050);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(pdfCacheManager);
                } else {
                    zM87157i = c28655q.m87157i(pdfCacheManager);
                }
                if (zM87157i) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(1658444896, c28655q, new C17284d(0, modifier3, viewState, interfaceC28601c1, pdfCacheManager, zIsFeatureEnabled)), c28655q, 3072, 7);
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-257073501);
                    abstractC22403oM48943j = m48943j(interfaceC28601c1);
                    if (abstractC22403oM48943j == null) {
                        c28655q.m87150e0(620656062);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(620656063);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C15218b(18, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22478e.m64913f(abstractC22403oM48943j, null, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.f87638a | 432);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(620859020);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(viewState, modifier3, pdfCacheManager, i13, i14, 29);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                zM87157i = c28655q.m87153g(pdfCacheManager);
            } else {
                zM87157i = c28655q.m87157i(pdfCacheManager);
            }
            if (zM87157i) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(1658444896, c28655q, new C17284d(0, modifier3, viewState, interfaceC28601c1, pdfCacheManager, zIsFeatureEnabled)), c28655q, 3072, 7);
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-257073501);
                abstractC22403oM48943j = m48943j(interfaceC28601c1);
                if (abstractC22403oM48943j == null) {
                    c28655q.m87150e0(620656062);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(620656063);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C15218b(18, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC22478e.m64913f(abstractC22403oM48943j, null, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.f87638a | 432);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(620859020);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(viewState, modifier3, pdfCacheManager, i13, i14, 29);
        }
    }

    /* JADX INFO: renamed from: j */
    private static final AbstractC22403o m48943j(InterfaceC28601c1 interfaceC28601c1) {
        return (AbstractC22403o) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m48944k(InterfaceC28601c1 interfaceC28601c1, AbstractC22403o abstractC22403o) {
        interfaceC28601c1.setValue(abstractC22403o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m48945l(Modifier modifier, C17281a c17281a, boolean z4, InterfaceC28601c1 interfaceC28601c1, C22409u c22409u, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3425v = AbstractC1102d.m3425v(modifier, 0.0f, ((C1101c) BoxWithConstraints).m3403d() * 0.85f, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3425v);
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
            if (c17281a.m48927b().isEmpty()) {
                c28655q.m87150e0(-1344260456);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1344453617);
                List<AbstractC22403o> listM48927b = c17281a.m48927b();
                boolean zM87155h = c28655q.m87155h(z4);
                Object objM87133R = c28655q.m87133R();
                if (zM87155h || objM87133R == C28635l.f115821a) {
                    objM87133R = new C17285e(z4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22479f.m64936c(listM48927b, null, (Function1) objM87133R, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-1567382827);
            Iterator<T> it = c17281a.m48926a().iterator();
            while (it.hasNext()) {
                m48949p((C17283c) it.next(), c22409u, c28655q, C22409u.f87656e << 3);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m48946m(boolean z4, InterfaceC28601c1 interfaceC28601c1, AbstractC22403o it) {
        AbstractC22676k.m65750j(it, "it");
        if (z4) {
            m48944k(interfaceC28601c1, it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m48947n(InterfaceC28601c1 interfaceC28601c1) {
        m48944k(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m48948o(C17281a c17281a, Modifier modifier, C22409u c22409u, int i13, int i14, Composer composer, int i15) {
        m48942i(c17281a, modifier, c22409u, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x029c  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b5  */
    /* JADX INFO: renamed from: p */
    private static final void m48949p(C17283c c17283c, C22409u c22409u, Composer composer, int i13) {
        int i14;
        C22409u c22409u2;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i15;
        Object objM87133R2;
        boolean z15;
        int iHashCode2;
        String strM48950q;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1131753989);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c17283c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c22409u) : c28655q.m87157i(c22409u) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), f13, f14);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC17918w0.f69621a);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0);
            if ((i14 & 112) != 32) {
                if ((i14 & 64) != 0) {
                    c22409u2 = c22409u;
                    if (c28655q.m87157i(c22409u2)) {
                    }
                    boolean z16 = zM87157i | z4;
                    if ((i14 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | z16;
                    objM87133R = c28655q.m87133R();
                    if (!z14 || objM87133R == c28676v0) {
                        interfaceC28601c1 = interfaceC28601c2;
                        C1012d c1012d = new C1012d(interfaceC2994c0, c22409u2, c17283c, interfaceC28601c1, 13);
                        c28655q.m87172p0(c1012d);
                        objM87133R = c1012d;
                    } else {
                        interfaceC28601c1 = interfaceC28601c2;
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    float f15 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f15, modifierM3362g);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i15 = i16;
                    } else {
                        i15 = i16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f15 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C17085h(13);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i17 = i15;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R2), 0L, c28655q, 48, 8);
                        if (1.0f > 0.0d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        String strM48931a = c17283c.getDisplayName();
                        C2886a b6 = c38072d.m121952e(c28655q, i17).getB2();
                        long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                        int i18 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM48931a, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b6, null, c28655q, 0, i18 | 3120, 186362);
                        AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        strM48950q = m48950q(interfaceC28601c1);
                        if (strM48950q == null) {
                            c28655q.m87150e0(591511996);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(591511997);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C15218b(19, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                            c28655q.m87173q(false);
                        }
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f15 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17085h(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i19 = i15;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R2), 0L, c28655q, 48, 8);
                    if (1.0f > 0.0d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    String strM48931a2 = c17283c.getDisplayName();
                    C2886a b8 = c38072d.m121952e(c28655q, i19).getB2();
                    long brandWhite2 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    int i110 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM48931a2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b8, null, c28655q, 0, i110 | 3120, 186362);
                    AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB2(), null, c28655q, 0, i110, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    strM48950q = m48950q(interfaceC28601c1);
                    if (strM48950q == null) {
                        c28655q.m87150e0(591511996);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(591511997);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15218b(19, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                        c28655q.m87173q(false);
                    }
                } else {
                    c22409u2 = c22409u;
                }
                z4 = false;
                boolean z17 = zM87157i | z4;
                if ((i14 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z17;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    interfaceC28601c1 = interfaceC28601c2;
                    C1012d c1012d2 = new C1012d(interfaceC2994c0, c22409u2, c17283c, interfaceC28601c1, 13);
                    c28655q.m87172p0(c1012d2);
                    objM87133R = c1012d2;
                } else {
                    interfaceC28601c1 = interfaceC28601c2;
                    C1012d c1012d3 = new C1012d(interfaceC2994c0, c22409u2, c17283c, interfaceC28601c1, 13);
                    c28655q.m87172p0(c1012d3);
                    objM87133R = c1012d3;
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f16 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13 * f16, modifierM3362g2);
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 1.5d, f16, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M53376q2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i15 = i16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f16 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17085h(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i111 = i15;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c3, (Function1) objM87133R2), 0L, c28655q, 48, 8);
                    if (1.0f > 0.0d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    String strM48931a3 = c17283c.getDisplayName();
                    C2886a b14 = c38072d.m121952e(c28655q, i111).getB2();
                    long brandWhite3 = c38072d.m121949b(c28655q, i111).getBrandWhite();
                    int i112 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM48931a3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b14, null, c28655q, 0, i112 | 3120, 186362);
                    AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i112, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    strM48950q = m48950q(interfaceC28601c1);
                    if (strM48950q == null) {
                        c28655q.m87150e0(591511996);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(591511997);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15218b(19, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                        c28655q.m87173q(false);
                    }
                } else {
                    i15 = i16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f16 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17085h(13);
                    c28655q.m87172p0(objM87133R2);
                }
                int i113 = i15;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c4, (Function1) objM87133R2), 0L, c28655q, 48, 8);
                if (1.0f > 0.0d) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                String strM48931a4 = c17283c.getDisplayName();
                C2886a b15 = c38072d.m121952e(c28655q, i113).getB2();
                long brandWhite4 = c38072d.m121949b(c28655q, i113).getBrandWhite();
                int i114 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM48931a4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b15, null, c28655q, 0, i114 | 3120, 186362);
                AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i113).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i113).getB2(), null, c28655q, 0, i114, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                strM48950q = m48950q(interfaceC28601c1);
                if (strM48950q == null) {
                    c28655q.m87150e0(591511996);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(591511997);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15218b(19, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                    c28655q.m87173q(false);
                }
            } else {
                c22409u2 = c22409u;
            }
            z4 = true;
            boolean z18 = zM87157i | z4;
            if ((i14 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | z18;
            objM87133R = c28655q.m87133R();
            if (z14) {
                interfaceC28601c1 = interfaceC28601c2;
                C1012d c1012d4 = new C1012d(interfaceC2994c0, c22409u2, c17283c, interfaceC28601c1, 13);
                c28655q.m87172p0(c1012d4);
                objM87133R = c1012d4;
            } else {
                interfaceC28601c1 = interfaceC28601c2;
                C1012d c1012d5 = new C1012d(interfaceC2994c0, c22409u2, c17283c, interfaceC28601c1, 13);
                c28655q.m87172p0(c1012d5);
                objM87133R = c1012d5;
            }
            Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f17 = 8;
            Modifier modifierM3394p3 = AbstractC1099a.m3394p(f13 * f17, modifierM3362g3);
            C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 1.5d, f17, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i10 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M53376q3);
            C0209i c0209i11 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                Modifier modifierM3488c5 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f17 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17085h(13);
                    c28655q.m87172p0(objM87133R2);
                }
                int i115 = i15;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c5, (Function1) objM87133R2), 0L, c28655q, 48, 8);
                if (1.0f > 0.0d) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                String strM48931a5 = c17283c.getDisplayName();
                C2886a b16 = c38072d.m121952e(c28655q, i115).getB2();
                long brandWhite5 = c38072d.m121949b(c28655q, i115).getBrandWhite();
                int i116 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM48931a5, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b16, null, c28655q, 0, i116 | 3120, 186362);
                AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i115).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i115).getB2(), null, c28655q, 0, i116, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                strM48950q = m48950q(interfaceC28601c1);
                if (strM48950q == null) {
                    c28655q.m87150e0(591511996);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(591511997);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15218b(19, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                    c28655q.m87173q(false);
                }
            } else {
                i15 = i16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Modifier modifierM3488c6 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f17 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C17085h(13);
                c28655q.m87172p0(objM87133R2);
            }
            int i117 = i15;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.FILE.toWhoopIcon(), c28655q, 0), null, AbstractC1125a.m3480c(modifierM3488c6, (Function1) objM87133R2), 0L, c28655q, 48, 8);
            if (1.0f > 0.0d) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
            String strM48931a6 = c17283c.getDisplayName();
            C2886a b17 = c38072d.m121952e(c28655q, i117).getB2();
            long brandWhite6 = c38072d.m121949b(c28655q, i117).getBrandWhite();
            int i118 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM48931a6, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, b17, null, c28655q, 0, i118 | 3120, 186362);
            AbstractC30795n.m94707h(c17283c.getSubtitle(), null, c38072d.m121949b(c28655q, i117).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i117).getB2(), null, c28655q, 0, i118, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            strM48950q = m48950q(interfaceC28601c1);
            if (strM48950q == null) {
                c28655q.m87150e0(591511996);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(591511997);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15218b(19, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC17287g.m48960d(strM48950q, (InterfaceC4339a) objM87133R3, c28655q, 48);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(c17283c, c22409u, i13, 21);
        }
    }

    /* JADX INFO: renamed from: q */
    private static final String m48950q(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m48951r(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m48952s(InterfaceC2994c0 interfaceC2994c0, C22409u c22409u, C17283c c17283c, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c22409u, c17283c, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m48953t(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, AbstractC15673b0.m43972A(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m48954u(InterfaceC28601c1 interfaceC28601c1) {
        m48951r(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m48955v(C17283c c17283c, C22409u c22409u, int i13, Composer composer, int i14) {
        m48949p(c17283c, c22409u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
