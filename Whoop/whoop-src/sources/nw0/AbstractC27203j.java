package nw0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import bw0.AbstractC3680c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dc0.C11901c;
import ec3.InterfaceC13058l;
import g32.C15310j;
import gy0.AbstractC16277f;
import hy0.AbstractC17808z1;
import hy0.C17723a2;
import hy0.EnumC17727b2;
import j11.AbstractC21211n;
import j21.C21245d;
import k71.C22252i;
import kw0.AbstractC22848a;
import l72.C23407n;
import l83.C23454a0;
import m31.C25002h;
import mf2.C25514e;
import mw0.AbstractC25974b;
import mw0.AbstractC25976d;
import mw0.AbstractC25979g;
import mw0.C25975c;
import mx1.C26003i;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import no0.C26984y0;
import no1.C26993g;
import or2.C28205u0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23254g;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import qz0.AbstractC30795n;
import vv0.AbstractC36529b;
import wb3.AbstractC37056f;
import x81.C38072d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: nw0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u001a2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010!\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0007¢\u0006\u0004\b!\u0010\"\u001a9\u0010#\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b#\u0010$\u001a3\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-¨\u0006.²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, m65681d2 = {"Lmw0/c;", "dialogViewModel", "Lnw0/h;", "sleepDialogType", "Lkotlin/Function1;", "Lmw0/g;", "Ll83/a0;", "onViewEvent", "Lkw0/a;", "onNavigationEvent", "Lbw0/c;", "onAnalyticsEvent", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function0;", "mainContent", "H", "(Lmw0/c;Lnw0/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lor2/u0;Lzr2/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lmw0/d;", "viewState", "Lmw0/b;", "onDialogViewEvent", "C", "(Lmw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lzr2/a;Lor2/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmw0/d$d;", "P", "(Lmw0/d$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onConfirm", "T", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "onDelete", "x", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Z", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "errorTitle", "message", "M", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnw0/k;", "savingType", "X", "(Lnw0/k;Landroidx/compose/runtime/Composer;I)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27203j {

    /* JADX INFO: renamed from: nw0.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108916a;

        static {
            int[] iArr = new int[EnumC27204k.values().length];
            try {
                iArr[EnumC27204k.DELETING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27204k.SAVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f108916a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m81834A(InterfaceC4339a interfaceC4339a, Function1 function1) {
        interfaceC4339a.invoke();
        function1.invoke(AbstractC3680c.c.f15002a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m81835B(Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m81886x(function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0222  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:112:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x024c  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    /* JADX INFO: renamed from: C */
    public static final void m81836C(final AbstractC25976d viewState, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, InterfaceC4351m mainContent, InterfaceC41070a dateAndTimeProvider, C28205u0 localizedDateTimeFormatter, final Function1 onDialogViewEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z4;
        Function1 function2;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        boolean z13;
        boolean z14;
        Object objM87133R;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        Object objM87133R3;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(mainContent, "mainContent");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(onDialogViewEvent, "onDialogViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1896597668);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q.m87157i(onDialogViewEvent)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i15 |= i16;
            }
            if ((4195475 & i15) != 4195474) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(19);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                if (viewState instanceof AbstractC25976d.a) {
                    c28655q.m87150e0(1564242696);
                    if ((i15 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | ((i15 & 14) == 4);
                    objM87133R2 = c28655q.m87133R();
                    if (z16 || objM87133R2 == c28676v0) {
                        final int i18 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: nw0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                    default:
                                        return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    m81886x(onViewEvent, function3, (InterfaceC4339a) objM87133R2, c28655q, ((i15 >> 6) & 112) | ((i15 >> 3) & 14), 0);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC25976d.b) {
                    c28655q.m87150e0(1564249650);
                    AbstractC25976d.b bVar = (AbstractC25976d.b) viewState;
                    TextResource textResourceM77003a = bVar.getErrorTitle();
                    TextResource textResourceM77004b = bVar.getMessage();
                    int i19 = TextResource.$stable;
                    m81846M(textResourceM77003a, textResourceM77004b, onViewEvent, c28655q, ((i15 << 3) & 896) | i19 | (i19 << 3));
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25976d.g.f102583a)) {
                    c28655q.m87150e0(1564253789);
                    m81859Z(onViewEvent, onNavigationEvent, c28655q, (i15 >> 3) & 126, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25976d.i.f102585a)) {
                    c28655q.m87150e0(1564257315);
                    m81857X(EnumC27204k.DELETING, c28655q, 6);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC25976d.c) {
                    c28655q.m87150e0(1564261266);
                    AbstractC25976d.c cVar = (AbstractC25976d.c) viewState;
                    TextResource textResourceM77005a = cVar.getErrorTitle();
                    TextResource textResourceM77006b = cVar.getMessage();
                    int i24 = TextResource.$stable;
                    m81846M(textResourceM77005a, textResourceM77006b, onViewEvent, c28655q, ((i15 << 3) & 896) | i24 | (i24 << 3));
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC25976d.e) {
                    c28655q.m87150e0(1564265574);
                    if ((i15 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 14) == 4);
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        final int i25 = 1;
                        objM87133R = new InterfaceC4339a() { // from class: nw0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                    default:
                                        return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    m81853T(onViewEvent, function3, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25976d.h.f102584a)) {
                    c28655q.m87150e0(1564272445);
                    m81859Z(onViewEvent, onNavigationEvent, c28655q, (i15 >> 3) & 126, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25976d.j.f102586a)) {
                    c28655q.m87150e0(1564276097);
                    m81857X(EnumC27204k.SAVING, c28655q, 6);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25976d.f.f102582a)) {
                    c28655q.m87150e0(1564279671);
                    c28655q.m87173q(false);
                    onNavigationEvent.invoke(AbstractC22848a.a.f90080a);
                } else {
                    if (viewState instanceof AbstractC25976d.d) {
                        throw AbstractC11895b.m32003v(1564241593, c28655q, false);
                    }
                    c28655q.m87150e0(1564283127);
                    m81849P((AbstractC25976d.d) viewState, onViewEvent, c28655q, i15 & 126);
                    c28655q.m87173q(false);
                }
                function2 = function3;
            } else {
                c28655q.m87138X();
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(viewState, onViewEvent, onNavigationEvent, function2, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, onDialogViewEvent, i13, i14);
            }
        }
        i15 |= 3072;
        if ((12582912 & i13) == 0) {
            if (c28655q.m87157i(onDialogViewEvent)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i15 |= i16;
        }
        if ((4195475 & i15) != 4195474) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(19);
                    c28655q.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            if (viewState instanceof AbstractC25976d.a) {
                c28655q.m87150e0(1564242696);
                if ((i15 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | ((i15 & 14) == 4);
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    final int i110 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: nw0.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                default:
                                    return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i111 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: nw0.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i111) {
                                case 0:
                                    return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                default:
                                    return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                m81886x(onViewEvent, function3, (InterfaceC4339a) objM87133R2, c28655q, ((i15 >> 6) & 112) | ((i15 >> 3) & 14), 0);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC25976d.b) {
                c28655q.m87150e0(1564249650);
                AbstractC25976d.b bVar2 = (AbstractC25976d.b) viewState;
                TextResource textResourceM77003a2 = bVar2.getErrorTitle();
                TextResource textResourceM77004b2 = bVar2.getMessage();
                int i112 = TextResource.$stable;
                m81846M(textResourceM77003a2, textResourceM77004b2, onViewEvent, c28655q, ((i15 << 3) & 896) | i112 | (i112 << 3));
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25976d.g.f102583a)) {
                c28655q.m87150e0(1564253789);
                m81859Z(onViewEvent, onNavigationEvent, c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25976d.i.f102585a)) {
                c28655q.m87150e0(1564257315);
                m81857X(EnumC27204k.DELETING, c28655q, 6);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC25976d.c) {
                c28655q.m87150e0(1564261266);
                AbstractC25976d.c cVar2 = (AbstractC25976d.c) viewState;
                TextResource textResourceM77005a2 = cVar2.getErrorTitle();
                TextResource textResourceM77006b2 = cVar2.getMessage();
                int i26 = TextResource.$stable;
                m81846M(textResourceM77005a2, textResourceM77006b2, onViewEvent, c28655q, ((i15 << 3) & 896) | i26 | (i26 << 3));
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC25976d.e) {
                c28655q.m87150e0(1564265574);
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    final int i27 = 1;
                    objM87133R = new InterfaceC4339a() { // from class: nw0.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                default:
                                    return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i28 = 1;
                    objM87133R = new InterfaceC4339a() { // from class: nw0.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    return AbstractC27203j.m81838E(onDialogViewEvent, viewState);
                                default:
                                    return AbstractC27203j.m81839F(onDialogViewEvent, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                m81853T(onViewEvent, function3, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25976d.h.f102584a)) {
                c28655q.m87150e0(1564272445);
                m81859Z(onViewEvent, onNavigationEvent, c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25976d.j.f102586a)) {
                c28655q.m87150e0(1564276097);
                m81857X(EnumC27204k.SAVING, c28655q, 6);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25976d.f.f102582a)) {
                c28655q.m87150e0(1564279671);
                c28655q.m87173q(false);
                onNavigationEvent.invoke(AbstractC22848a.a.f90080a);
            } else {
                if (viewState instanceof AbstractC25976d.d) {
                    throw AbstractC11895b.m32003v(1564241593, c28655q, false);
                }
                c28655q.m87150e0(1564283127);
                m81849P((AbstractC25976d.d) viewState, onViewEvent, c28655q, i15 & 126);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(viewState, onViewEvent, onNavigationEvent, function2, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, onDialogViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m81837D(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m81838E(Function1 function1, AbstractC25976d abstractC25976d) {
        function1.invoke(new AbstractC25974b.a(((AbstractC25976d.a) abstractC25976d).getSleepIdV2()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m81839F(Function1 function1, AbstractC25976d abstractC25976d) {
        function1.invoke(new AbstractC25974b.b(((AbstractC25976d.e) abstractC25976d).getSleepIdV2()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m81840G(AbstractC25976d abstractC25976d, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m81836C(abstractC25976d, function1, function2, function3, interfaceC4351m, interfaceC41070a, c28205u0, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:112:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:116:0x0267  */
    /* JADX WARN: Code duplicated, block: B:118:0x026d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0278  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a8  */
    /* JADX INFO: renamed from: H */
    public static final void m81841H(C25975c dialogViewModel, AbstractC27201h abstractC27201h, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, InterfaceC4351m mainContent, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Function1 function5;
        int iHashCode2;
        Object dVar;
        Object eVar;
        boolean zM87157i;
        Object objM87133R;
        Function1 function6;
        boolean z13;
        Object objM87133R2;
        int i17;
        int i18;
        boolean zM87157i2;
        int i19;
        AbstractC22676k.m65750j(dialogViewModel, "dialogViewModel");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(mainContent, "mainContent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-941308972);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(dialogViewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(abstractC27201h) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if ((262144 & i13) == 0) {
                    zM87157i2 = c28655q2.m87153g(localizedDateTimeFormatter);
                } else {
                    zM87157i2 = c28655q2.m87157i(localizedDateTimeFormatter);
                }
                if (zM87157i2) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(dateAndTimeProvider)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i15 |= i18;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87157i(mainContent)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
            if ((4793491 & i15) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(16);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                i16 = i15;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                mainContent.invoke(c28655q2, Integer.valueOf((i16 >> 21) & 14));
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 6);
                function5 = function4;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (abstractC27201h == null) {
                    c28655q2.m87150e0(569129172);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    function6 = function5;
                    z13 = true;
                } else {
                    c28655q2.m87150e0(569129173);
                    InterfaceC13058l viewState = dialogViewModel.getViewState();
                    if (abstractC27201h.equals(AbstractC27201h.a.f108904a)) {
                        eVar = new AbstractC25976d.a(dialogViewModel.getSleepIdV2());
                    } else {
                        if (abstractC27201h.equals(AbstractC27201h.c.f108912a)) {
                            eVar = new AbstractC25976d.e(dialogViewModel.getSleepIdV2());
                        } else {
                            if (abstractC27201h instanceof AbstractC27201h.b) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC27201h.b bVar = (AbstractC27201h.b) abstractC27201h;
                            dVar = new AbstractC25976d.d(bVar.getBodyTexts(), bVar.getIcon(), bVar.getTrendSubTitle(), bVar.getTrendTitle(), bVar.getTrendType());
                        }
                        AbstractC25976d abstractC25976dM81843J = m81843J(AbstractC28683x.m87260n(viewState, dVar, null, c28655q2, 0, 2));
                        zM87157i = c28655q2.m87157i(dialogViewModel);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C26944e0(dialogViewModel, 3);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function7 = (Function1) objM87133R;
                        int i25 = i16 >> 3;
                        int i26 = (i25 & 458752) | (i25 & 8176) | ((i16 >> 9) & 57344) | (C28205u0.f113964d << 18) | (3670016 & (i16 << 3));
                        function6 = function5;
                        z13 = true;
                        m81836C(abstractC25976dM81843J, onViewEvent, onNavigationEvent, function6, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, function7, c28655q2, i26, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    dVar = eVar;
                    AbstractC25976d abstractC25976dM81843J2 = m81843J(AbstractC28683x.m87260n(viewState, dVar, null, c28655q2, 0, 2));
                    zM87157i = c28655q2.m87157i(dialogViewModel);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new C26944e0(dialogViewModel, 3);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26944e0(dialogViewModel, 3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function8 = (Function1) objM87133R;
                    int i27 = i16 >> 3;
                    int i28 = (i27 & 458752) | (i27 & 8176) | ((i16 >> 9) & 57344) | (C28205u0.f113964d << 18) | (3670016 & (i16 << 3));
                    function6 = function5;
                    z13 = true;
                    m81836C(abstractC25976dM81843J2, onViewEvent, onNavigationEvent, function6, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, function8, c28655q2, i28, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                function3 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(dialogViewModel, abstractC27201h, onViewEvent, onNavigationEvent, function3, localizedDateTimeFormatter, dateAndTimeProvider, mainContent, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((196608 & i13) == 0) {
            if ((262144 & i13) == 0) {
                zM87157i2 = c28655q2.m87153g(localizedDateTimeFormatter);
            } else {
                zM87157i2 = c28655q2.m87157i(localizedDateTimeFormatter);
            }
            if (zM87157i2) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87157i(dateAndTimeProvider)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i15 |= i18;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q2.m87157i(mainContent)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i15 |= i17;
        }
        if ((4793491 & i15) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26993g(16);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            i16 = i15;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            mainContent.invoke(c28655q2, Integer.valueOf((i16 >> 21) & 14));
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 6);
            function5 = function4;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            if (abstractC27201h == null) {
                c28655q2.m87150e0(569129172);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                function6 = function5;
                z13 = true;
            } else {
                c28655q2.m87150e0(569129173);
                InterfaceC13058l viewState2 = dialogViewModel.getViewState();
                if (abstractC27201h.equals(AbstractC27201h.a.f108904a)) {
                    eVar = new AbstractC25976d.a(dialogViewModel.getSleepIdV2());
                } else {
                    if (abstractC27201h.equals(AbstractC27201h.c.f108912a)) {
                        eVar = new AbstractC25976d.e(dialogViewModel.getSleepIdV2());
                    } else {
                        if (abstractC27201h instanceof AbstractC27201h.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC27201h.b bVar2 = (AbstractC27201h.b) abstractC27201h;
                        dVar = new AbstractC25976d.d(bVar2.getBodyTexts(), bVar2.getIcon(), bVar2.getTrendSubTitle(), bVar2.getTrendTitle(), bVar2.getTrendType());
                    }
                    AbstractC25976d abstractC25976dM81843J3 = m81843J(AbstractC28683x.m87260n(viewState2, dVar, null, c28655q2, 0, 2));
                    zM87157i = c28655q2.m87157i(dialogViewModel);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new C26944e0(dialogViewModel, 3);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26944e0(dialogViewModel, 3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function9 = (Function1) objM87133R;
                    int i29 = i16 >> 3;
                    int i210 = (i29 & 458752) | (i29 & 8176) | ((i16 >> 9) & 57344) | (C28205u0.f113964d << 18) | (3670016 & (i16 << 3));
                    function6 = function5;
                    z13 = true;
                    m81836C(abstractC25976dM81843J3, onViewEvent, onNavigationEvent, function6, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, function9, c28655q2, i210, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                dVar = eVar;
                AbstractC25976d abstractC25976dM81843J4 = m81843J(AbstractC28683x.m87260n(viewState2, dVar, null, c28655q2, 0, 2));
                zM87157i = c28655q2.m87157i(dialogViewModel);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C26944e0(dialogViewModel, 3);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26944e0(dialogViewModel, 3);
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function10 = (Function1) objM87133R;
                int i211 = i16 >> 3;
                int i212 = (i211 & 458752) | (i211 & 8176) | ((i16 >> 9) & 57344) | (C28205u0.f113964d << 18) | (3670016 & (i16 << 3));
                function6 = function5;
                z13 = true;
                m81836C(abstractC25976dM81843J4, onViewEvent, onNavigationEvent, function6, mainContent, dateAndTimeProvider, localizedDateTimeFormatter, function10, c28655q2, i212, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(dialogViewModel, abstractC27201h, onViewEvent, onNavigationEvent, function3, localizedDateTimeFormatter, dateAndTimeProvider, mainContent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m81842I(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final AbstractC25976d m81843J(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC25976d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m81844K(C25975c c25975c, AbstractC25974b it) {
        AbstractC22676k.m65750j(it, "it");
        c25975c.m76999p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m81845L(C25975c c25975c, AbstractC27201h abstractC27201h, Function1 function1, Function1 function2, Function1 function3, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m81841H(c25975c, abstractC27201h, function1, function2, function3, c28205u0, interfaceC41070a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final void m81846M(TextResource errorTitle, TextResource message, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1411600519);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(errorTitle) : c28655q.m87157i(errorTitle) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(message) : c28655q.m87157i(message) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(errorTitle, false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC36529b.f156346q, null, i15, 0 == true ? 1 : 0);
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(onViewEvent, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(bVar, message, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (i16 & 112) | (TextResource.C8688b.f25889c << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(errorTitle, message, onViewEvent, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m81847N(Function1 function1) {
        function1.invoke(AbstractC25979g.e.f102605a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m81848O(TextResource textResource, TextResource textResource2, Function1 function1, int i13, Composer composer, int i14) {
        m81846M(textResource, textResource2, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    public static final void m81849P(AbstractC25976d.d viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1309376086);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C17723a2 c17723a2M51179g = AbstractC17808z1.m51179g(viewState.getTrendType(), c28655q2, 0);
            int iM77008b = viewState.getIcon();
            C23254g forSleepDetailsKeyMetricModal = viewState.getBody().formatForSleepDetailsKeyMetricModal(c28655q2, 0);
            Integer numValueOf = Integer.valueOf(iM77008b);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(onViewEvent, 26);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, 0, numValueOf, forSleepDetailsKeyMetricModal, null, false, null, (InterfaceC4339a) objM87133R, null, null, null, AbstractC37817c.m121344e(1775544379, c28655q2, new C21245d(23, viewState, c17723a2M51179g)), null, c28655q, 0, 0, 1572864, 196739071);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(viewState, onViewEvent, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m81850Q(Function1 function1) {
        function1.invoke(AbstractC25979g.e.f102605a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m81851R(AbstractC25976d.d dVar, C17723a2 c17723a2, Composer composer, int i13) {
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (dVar.getTrendType() != EnumC17727b2.NEUTRAL) {
                c28655q.m87150e0(-678012069);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(24, c2314t), AbstractC33253j.m105489e(2)), c17723a2.getBackgroundColor(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                Integer numM50727f = c17723a2.getIconResource();
                if (numM50727f == null) {
                    c28655q.m87150e0(1490153783);
                    c28655q.m87173q(false);
                    c0209i = c0209i4;
                } else {
                    c28655q.m87150e0(1490153784);
                    c0209i = c0209i4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(numM50727f.intValue(), c28655q, 6), null, AbstractC1102d.m3415l(12, c2314t), c17723a2.getIconColor(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC25012a.m73389v(c2314t, 10, c28655q, false);
            } else {
                c0209i = c0209i4;
                c28655q.m87150e0(-676951125);
                c28655q.m87173q(false);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i14).getH4();
            TextResource textResourceM77010d = dVar.getTrendTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM77010d, c28655q, i15);
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dVar.getTrendSubTitle(), c28655q, i15), null, c17723a2.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m81852S(AbstractC25976d.d dVar, Function1 function1, int i13, Composer composer, int i14) {
        m81849P(dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public static final void m81853T(Function1 onViewEvent, Function1 onAnalyticsEvent, InterfaceC4339a onConfirm, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onConfirm, "onConfirm");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1664865588);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(onViewEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onConfirm) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC36529b.f156324E, null, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC36529b.f156325F, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC36529b.f156348s, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC36529b.f156346q, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            int i16 = i14 & 112;
            boolean z4 = ((i14 & 14) == 4) | (i16 == 32);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C11901c(onViewEvent, 10, onAnalyticsEvent);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = ((i14 & 896) == 256) | (i16 == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15310j(onConfirm, onAnalyticsEvent, 6);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688b, c8688b2, c8688b3, false, null, null, null, null, c8688b4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 0, 0, 247463409);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n((Object) onViewEvent, onAnalyticsEvent, onConfirm, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m81854U(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC25979g.e.f102605a);
        function2.invoke(AbstractC3680c.i.f15008a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m81855V(InterfaceC4339a interfaceC4339a, Function1 function1) {
        interfaceC4339a.invoke();
        function1.invoke(AbstractC3680c.j.f15009a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m81856W(Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m81853T(function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final void m81857X(EnumC27204k savingType, Composer composer, int i13) {
        int i14;
        AbstractC33208p0 eVar;
        AbstractC22676k.m65750j(savingType, "savingType");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1943361410);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(savingType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = 0;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int i17 = a.f108916a[savingType.ordinal()];
            if (i17 == 1) {
                eVar = AbstractC33208p0.a.f138465e;
            } else {
                if (i17 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new AbstractC33208p0.e(new TextResource.C8688b(AbstractC16277f.f62309b2, null, i15, 0 == true ? 1 : 0), i16, i15, 0 == true ? 1 : 0);
            }
            AbstractC33199m0.m105214F(eVar, AbstractC8693b.m21278l(""), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f138461d | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(savingType, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m81858Y(EnumC27204k enumC27204k, int i13, Composer composer, int i14) {
        m81857X(enumC27204k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m81859Z(Function1 function1, Function1 onNavigationEvent, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        C28655q c28655q;
        Function1 function3;
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-263255910);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            function2 = function1;
        } else if ((i13 & 6) == 0) {
            function2 = function1;
            i15 = i13 | (c28655q2.m87157i(function2) ? 4 : 2);
        } else {
            function2 = function1;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C26993g(17);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            AbstractC33208p0.h hVar = new AbstractC33208p0.h(null, 0L, null, 7, null);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("");
            boolean z4 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C11901c(function3, 8, onNavigationEvent);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(hVar, textResourceM21278l, (InterfaceC4339a) objM87133R2, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(function3, i13, onNavigationEvent, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m81861a0(AbstractC25979g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m81863b0(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC25979g.e.f102605a);
        function2.invoke(AbstractC22848a.a.f90080a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m81865c0(Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m81859Z(function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final void m81886x(Function1 onViewEvent, Function1 function1, InterfaceC4339a onDelete, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        Object objM87133R3;
        int i17;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onDelete, "onDelete");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1085374799);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(onViewEvent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(onDelete)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC36529b.f156350u, null, i18, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC36529b.f156351v, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC36529b.f156335f, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC36529b.f156346q, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i16 = i15 & 112;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q2.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C11901c(onViewEvent, 9, function4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R2 = c28655q2.m87133R();
                if (z18 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C15310j(onDelete, function4, 5);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i24 = TextResource.C8688b.f25889c;
                int i25 = (i24 << 3) | (i24 << 6) | (i24 << 9) | (i24 << 27);
                function3 = function4;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, c8688b, c8688b2, c8688b3, false, null, null, null, null, c8688b4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, i25, 0, 0, 247463409);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(onViewEvent, function3, onDelete, i13, i14);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(onDelete)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(18);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC36529b.f156350u, null, i18, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC36529b.f156351v, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC36529b.f156335f, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC36529b.f156346q, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
            if ((i15 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            i16 = i15 & 112;
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C11901c(onViewEvent, 9, function4);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C11901c(onViewEvent, 9, function4);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            objM87133R2 = c28655q2.m87133R();
            if (z18) {
                objM87133R2 = new C15310j(onDelete, function4, 5);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C15310j(onDelete, function4, 5);
                c28655q2.m87172p0(objM87133R2);
            }
            int i26 = TextResource.C8688b.f25889c;
            int i27 = (i26 << 3) | (i26 << 6) | (i26 << 9) | (i26 << 27);
            function3 = function4;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688b5, c8688b6, c8688b7, false, null, null, null, null, c8688b8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, i27, 0, 0, 247463409);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(onViewEvent, function3, onDelete, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m81887y(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m81888z(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC25979g.e.f102605a);
        function2.invoke(AbstractC3680c.b.f15001a);
        return C23454a0.f92919a;
    }
}
