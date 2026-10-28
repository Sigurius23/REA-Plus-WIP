package gv1;

import a81.C0563n;
import am2.C1008b;
import am2.C1024j;
import am2.C1040r;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$GetContent;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import ep1.C13412g;
import g11.C15218b;
import g32.C15310j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13921a0;
import p179h.C16351i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v41.AbstractC35662e;
import v41.C35666g;
import va3.AbstractC35854l;
import vf3.AbstractC35952b;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: gv1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0019²\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lgv1/o;", "lottieSource", "Lkotlin/Function1;", "Lgv1/m;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onDismiss", "p", "(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "hasOverride", "onLoadUrlClick", "onLoadLocalFileClick", "onRemoveOverrideClick", "Q", "(ZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "showLottieTesterSheet", "showLoadUrlSheet", "showLoadLocalFileSheet", "", "urlInput", "Landroid/net/Uri;", "selectedFileUri", "selectedFileName", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16233g {

    /* JADX INFO: renamed from: gv1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61684a;

        static {
            int[] iArr = new int[EnumC16238l.values().length];
            try {
                iArr[EnumC16238l.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16238l.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61684a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m45944A(InterfaceC28601c1 interfaceC28601c1) {
        m45959P(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m45945B(Function1 function1, InterfaceC4339a interfaceC4339a) {
        function1.invoke(InterfaceC16239m.e.f61696a);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m45946C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m45947D(InterfaceC28601c1 interfaceC28601c1) {
        m45957N(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m45948E(Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM45979r = m45979r(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13921a0(12, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C1040r(function1, (Object) interfaceC4339a, (Object) interfaceC28601c1, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 11);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC16237k.m46001d(strM45979r, function2, (Function1) objM87133R2, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m45949F(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m45980s(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m45950G(Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, EnumC16238l urlType) {
        Object dVar;
        AbstractC22676k.m65750j(urlType, "urlType");
        int i13 = a.f61684a[urlType.ordinal()];
        if (i13 == 1) {
            dVar = new InterfaceC16239m.d(m45979r(interfaceC28601c1));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new InterfaceC16239m.b(m45979r(interfaceC28601c1));
        }
        function1.invoke(dVar);
        m45957N(interfaceC28601c2, false);
        m45946C(interfaceC28601c3, false);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m45951H(InterfaceC28601c1 interfaceC28601c1) {
        m45959P(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m45952I(C16351i c16351i, Context context, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c5;
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM45983v = m45983v(interfaceC28601c1);
            boolean z4 = m45981t(interfaceC28601c2) != null;
            boolean zM87157i = c28655q.m87157i(c16351i);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                interfaceC28601c5 = interfaceC28601c2;
                objM87133R = new C13412g(c16351i, interfaceC28601c5, interfaceC28601c1, 16);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC28601c5 = interfaceC28601c2;
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(context) | c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C1008b c1008b = new C1008b(interfaceC28601c5, context, function1, interfaceC4339a, interfaceC28601c3, interfaceC28601c4);
                c28655q.m87172p0(c1008b);
                objM87133R2 = c1008b;
            }
            AbstractC16236j.m45994d(strM45983v, z4, function2, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m45953J(C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, EnumC16238l fileType) {
        AbstractC22676k.m65750j(fileType, "fileType");
        m45982u(interfaceC28601c1, null);
        m45984w(interfaceC28601c2, null);
        int i13 = a.f61684a[fileType.ordinal()];
        if (i13 == 1) {
            c16351i.mo4052a("application/json", null);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c16351i.mo4052a("image/*", null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m45954K(InterfaceC28601c1 interfaceC28601c1, Context context, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, EnumC16238l fileType) throws IOException {
        String strM114200h;
        AbstractC22676k.m65750j(fileType, "fileType");
        Uri uriM45981t = m45981t(interfaceC28601c1);
        if (uriM45981t != null) {
            int i13 = a.f61684a[fileType.ordinal()];
            if (i13 == 1) {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM45981t);
                if (inputStreamOpenInputStream != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                    try {
                        strM114200h = AbstractC35952b.m114200h(bufferedReader);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(bufferedReader, th3);
                            throw th4;
                        }
                    }
                } else {
                    strM114200h = null;
                }
                if (strM114200h != null) {
                    function1.invoke(new InterfaceC16239m.c(strM114200h));
                    m45959P(interfaceC28601c2, false);
                    m45946C(interfaceC28601c3, false);
                    interfaceC4339a.invoke();
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String string = uriM45981t.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                function1.invoke(new InterfaceC16239m.a(string));
                m45959P(interfaceC28601c2, false);
                m45946C(interfaceC28601c3, false);
                interfaceC4339a.invoke();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m45955L(AbstractC16241o abstractC16241o, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m45977p(abstractC16241o, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final boolean m45956M(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    private static final void m45957N(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m45958O(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    private static final void m45959P(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: Q */
    public static final void m45960Q(boolean z4, InterfaceC4339a onLoadUrlClick, InterfaceC4339a onLoadLocalFileClick, InterfaceC4339a onRemoveOverrideClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onLoadUrlClick, "onLoadUrlClick");
        AbstractC22676k.m65750j(onLoadLocalFileClick, "onLoadLocalFileClick");
        AbstractC22676k.m65750j(onRemoveOverrideClick, "onRemoveOverrideClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1561246680);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onLoadUrlClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onLoadLocalFileClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onRemoveOverrideClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h("Replace any Lottie animation or image on this screen with a remote URL or a local file.", null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("LOAD URL");
            int i16 = TextResource.$stable << 18;
            int i17 = i16 | 6;
            int i18 = i14;
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, onLoadUrlClick, c28655q, i17, (i14 << 6) & 7168, 8126);
            int i19 = i18 << 3;
            AbstractC27292z.m82343j(AbstractC1102d.m3409f(1.0f, c2314t), false, false, null, null, null, AbstractC8693b.m21278l("LOAD LOCAL FILE"), null, null, null, 0.0f, null, null, onLoadLocalFileClick, c28655q, i17, i19 & 7168, 8126);
            AbstractC27292z.m82343j(AbstractC1102d.m3409f(1.0f, c2314t), z4, false, null, null, null, AbstractC8693b.m21278l("REMOVE OVERRIDE"), null, null, null, 0.0f, null, null, onRemoveOverrideClick, c28655q, (i19 & 112) | 6 | i16, i18 & 7168, 8124);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(z4, onLoadUrlClick, onLoadLocalFileClick, onRemoveOverrideClick, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m45961R(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m45960Q(z4, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m45977p(AbstractC16241o abstractC16241o, Function1 onViewEvent, InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z4;
        boolean z13;
        InterfaceC28601c1 interfaceC28601c5;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c6;
        InterfaceC28601c1 interfaceC28601c7;
        String str;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-464952340);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(abstractC16241o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onDismiss) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R == c28676v2) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R;
            C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v2) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R2;
            C23196w3 c23196w3M67125g2 = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v2) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R3;
            C23196w3 c23196w3M67125g3 = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v2) {
                if (abstractC16241o instanceof AbstractC16241o.d) {
                    str = ((AbstractC16241o.d) abstractC16241o).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                } else {
                    str = abstractC16241o instanceof AbstractC16241o.b ? ((AbstractC16241o.b) abstractC16241o).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String() : "";
                }
                objM87133R4 = AbstractC28683x.m87272z(str);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v2) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R5;
            Object objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v2) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R6;
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            ActivityResultContracts$GetContent activityResultContracts$GetContent = new ActivityResultContracts$GetContent();
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v2) {
                objM87133R7 = new C1024j(3, interfaceC28601c12, interfaceC28601c13);
                c28655q2.m87172p0(objM87133R7);
            }
            C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$GetContent, (Function1) objM87133R7, c28655q2, 48);
            if (m45978q(interfaceC28601c8)) {
                c28655q2.m87150e0(-124282435);
                c28655q = c28655q2;
                interfaceC28601c1 = interfaceC28601c9;
                interfaceC28601c2 = interfaceC28601c10;
                c28676v0 = c28676v2;
                interfaceC28601c4 = interfaceC28601c13;
                interfaceC28601c3 = interfaceC28601c12;
                AbstractC35662e.m112943g(null, c23196w3M67125g, new C35666g(AbstractC8693b.m21278l("Lottie Tester"), null, null, null, null, 0.0f, 0.0f, 126, null), null, null, null, onDismiss, null, false, null, null, false, AbstractC37817c.m121344e(2063279755, c28655q2, new C0563n((Object) abstractC16241o, onViewEvent, (Object) onDismiss, (Object) interfaceC28601c9, (Object) interfaceC28601c10, 6)), c28655q, (C35666g.f151591h << 6) | ((i15 << 12) & 3670016), 384, 4025);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                interfaceC28601c1 = interfaceC28601c9;
                interfaceC28601c2 = interfaceC28601c10;
                c28676v0 = c28676v2;
                interfaceC28601c3 = interfaceC28601c12;
                c28655q = c28655q2;
                interfaceC28601c4 = interfaceC28601c13;
                z4 = false;
                c28655q.m87150e0(-123612618);
                c28655q.m87173q(false);
            }
            if (m45956M(interfaceC28601c1)) {
                c28655q.m87150e0(-123555330);
                C35666g c35666g = new C35666g(AbstractC8693b.m21278l("Load URL"), null, null, null, null, 0.0f, 0.0f, 126, null);
                Object objM87133R8 = c28655q.m87133R();
                C28676v0 c28676v3 = c28676v0;
                if (objM87133R8 == c28676v3) {
                    interfaceC28601c7 = interfaceC28601c1;
                    objM87133R8 = new C15218b(10, interfaceC28601c7);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c7 = interfaceC28601c1;
                }
                C28655q c28655q3 = c28655q;
                interfaceC28601c5 = interfaceC28601c8;
                z13 = z4;
                c28676v1 = c28676v3;
                AbstractC35662e.m112943g(null, c23196w3M67125g2, c35666g, null, null, null, (InterfaceC4339a) objM87133R8, null, false, null, null, false, AbstractC37817c.m121344e(592821684, c28655q, new C0563n(onViewEvent, onDismiss, interfaceC28601c11, interfaceC28601c7, interfaceC28601c8)), c28655q3, (C35666g.f151591h << 6) | 1572864, 384, 4025);
                c28655q = c28655q3;
                c28655q.m87173q(z13);
            } else {
                z13 = z4;
                interfaceC28601c5 = interfaceC28601c8;
                c28676v1 = c28676v0;
                c28655q.m87150e0(-122640458);
                c28655q.m87173q(z13);
            }
            if (m45958O(interfaceC28601c2)) {
                c28655q.m87150e0(-122541816);
                C35666g c35666g2 = new C35666g(AbstractC8693b.m21278l("Load Local File"), null, null, null, null, 0.0f, 0.0f, 126, null);
                Object objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v1) {
                    interfaceC28601c6 = interfaceC28601c2;
                    objM87133R9 = new C15218b(11, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    interfaceC28601c6 = interfaceC28601c2;
                }
                InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c4;
                C28655q c28655q4 = c28655q;
                AbstractC35662e.m112943g(null, c23196w3M67125g3, c35666g2, null, null, null, (InterfaceC4339a) objM87133R9, null, false, null, null, false, AbstractC37817c.m121344e(1931585107, c28655q, new C16232f(c16351iM118972a0, context, onViewEvent, onDismiss, interfaceC28601c15, interfaceC28601c3, interfaceC28601c14, interfaceC28601c5, 0)), c28655q4, (C35666g.f151591h << 6) | 1572864, 384, 4025);
                c28655q = c28655q4;
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-120529482);
                c28655q.m87173q(z13);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(abstractC16241o, onViewEvent, onDismiss, i13, 28);
        }
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m45978q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    private static final String m45979r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m45980s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: t */
    private static final Uri m45981t(InterfaceC28601c1 interfaceC28601c1) {
        return (Uri) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m45982u(InterfaceC28601c1 interfaceC28601c1, Uri uri) {
        interfaceC28601c1.setValue(uri);
    }

    /* JADX INFO: renamed from: v */
    private static final String m45983v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m45984w(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m45985x(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Uri uri) {
        m45982u(interfaceC28601c1, uri);
        m45984w(interfaceC28601c2, uri != null ? uri.getLastPathSegment() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m45986y(AbstractC16241o abstractC16241o, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean z4 = abstractC16241o != null;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C15218b(12, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C15218b(9, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C15310j(function1, interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R3);
            }
            m45960Q(z4, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R3, c28655q, 432);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m45987z(InterfaceC28601c1 interfaceC28601c1) {
        m45957N(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }
}
