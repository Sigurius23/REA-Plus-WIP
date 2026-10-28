package bb2;

import a20.C0167g;
import a41.C0372h;
import a80.C0539c;
import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import am2.C1042s;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2194o;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import bm.InterfaceC3389m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import eb2.C13006a;
import fi0.InterfaceC14515a;
import gz0.EnumC16313m0;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.Locale;
import kd1.AbstractC22403o;
import l01.C23037i;
import l01.C23042n;
import l83.C23454a0;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C13762f;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x81.C38072d;
import xc2.InterfaceC38193d;
import za2.AbstractC40225a;
import za2.C40236l;
import za2.C40241q;

/* JADX INFO: renamed from: bb2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\t*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lza2/q;", "viewState", "Lkotlin/Function3;", "Lza2/m;", "", "", "Ll83/a0;", "navigationEvent", "Lkotlin/Function1;", "Lza2/a;", "upsellViewEvent", "Lkotlin/Function2;", "Lza2/l;", "onPagerScrolled", "Leb2/a;", "actionRouter", "Leb2/b;", "onRoutedEvent", "Lfi0/a;", "analyticsWriter", "i", "(Lza2/q;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lc93/m;Leb2/a;Lkotlin/jvm/functions/Function1;Lfi0/a;Landroidx/compose/runtime/Composer;II)V", "", "Ll01/n;", "card", "u", "(Ljava/lang/Object;Ll01/n;)Lza2/a;", "Lxc2/d$d;", "successViewState", "r", "(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V", "previousPage", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2933i {

    /* JADX INFO: renamed from: bb2.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.components.SettingsBannerScreenKt$SettingsBannerScreen$1$1$1", m100430f = "SettingsBannerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11817w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f11818x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C23042n f11819y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C23042n c23042n, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11818x = function1;
            this.f11819y = c23042n;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f11818x, this.f11819y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f11817w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f11818x.invoke(new AbstractC40225a.c(this.f11819y.getTrackingValue(), this.f11819y.getCategory()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0186  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:118:0x0221  */
    /* JADX WARN: Code duplicated, block: B:119:0x0225  */
    /* JADX WARN: Code duplicated, block: B:124:0x0246  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:128:0x028b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x031d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0321  */
    /* JADX WARN: Code duplicated, block: B:139:0x0324  */
    /* JADX WARN: Code duplicated, block: B:141:0x032f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0343  */
    /* JADX WARN: Code duplicated, block: B:144:0x034f  */
    /* JADX WARN: Code duplicated, block: B:147:0x035a  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r14v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX INFO: renamed from: i */
    public static final void m8555i(C40241q viewState, Function3 navigationEvent, Function1 upsellViewEvent, InterfaceC4351m onPagerScrolled, C13006a actionRouter, Function1 onRoutedEvent, InterfaceC14515a interfaceC14515a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC14515a interfaceC14515a2;
        boolean z4;
        InterfaceC14515a interfaceC14515a3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        InterfaceC14515a interfaceC14515a4;
        C3396t c3396tM60415U;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        C23042n c23042nM129240d;
        int i16;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        C23042n c23042n;
        int i17;
        C28676v0 c28676v1;
        int i18;
        ?? r10;
        ?? r15;
        ?? r16;
        int i19;
        Object objM87133R4;
        InterfaceC14515a interfaceC14515a5;
        ?? r17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        ?? r18;
        InterfaceC38193d interfaceC38193dM129239c;
        InterfaceC38193d.d dVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        AbstractC22676k.m65750j(upsellViewEvent, "upsellViewEvent");
        AbstractC22676k.m65750j(onPagerScrolled, "onPagerScrolled");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(onRoutedEvent, "onRoutedEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1491536230);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navigationEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(upsellViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onPagerScrolled) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(actionRouter) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onRoutedEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i24 = i14 & 64;
        if (i24 == 0) {
            if ((1572864 & i13) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                i15 |= c28655q.m87157i(interfaceC14515a2) ? 1048576 : 524288;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i24 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c3396tM60415U = AbstractC21478l0.m60415U(0, c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(0, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (c3396tM60415U.m9774m() != m8556j(interfaceC28601c1)) {
                    onPagerScrolled.invoke(viewState.m129237a().get(c3396tM60415U.m9774m()), Integer.valueOf(m8556j(interfaceC28601c1)));
                    m8557k(interfaceC28601c1, c3396tM60415U.m9774m());
                }
                c23042nM129240d = viewState.getUpsellCardFeaturesState();
                if (c23042nM129240d == null) {
                    c28655q.m87150e0(-1375083118);
                    c28655q.m87173q(false);
                    i15 = i15;
                    c28676v1 = c28676v0;
                    r10 = 0;
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    c28655q.m87150e0(-1375083117);
                    i16 = i15 & 896;
                    if (i16 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(c23042nM129240d);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(upsellViewEvent, c23042nM129240d, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    C13762f c13762f = new C13762f(17);
                    boolean zM87157i2 = c28655q.m87157i(c23042nM129240d);
                    if (i16 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z18 = z14 | zM87157i2;
                    if ((i15 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z19 = z18 | z15;
                    if ((i15 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z19 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (!z17 || objM87133R3 == c28676v0) {
                        c23042n = c23042nM129240d;
                        C1042s c1042s = new C1042s((Object) c23042n, (Object) upsellViewEvent, (Object) actionRouter, (Object) onRoutedEvent, 4);
                        c28655q.m87172p0(c1042s);
                        objM87133R3 = c1042s;
                    } else {
                        c23042n = c23042nM129240d;
                    }
                    i17 = 16384;
                    C23042n c23042n2 = c23042n;
                    c28676v1 = c28676v0;
                    i18 = 131072;
                    r10 = 0;
                    AbstractC25303l.m74291r(c23042n2, null, c13762f, (Function1) objM87133R3, c28655q, C23042n.f90836v, 2);
                    c28655q.m87173q(false);
                }
                AnyModal anyModalM129238b = viewState.getPresentedModal();
                if ((i15 & 57344) == i17) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                if ((i15 & 458752) == i18) {
                    r16 = 1;
                } else {
                    r16 = r10;
                }
                i19 = r16 | r15;
                objM87133R4 = c28655q.m87133R();
                if (i19 == 0 || objM87133R4 == c28676v1) {
                    objM87133R4 = new C0167g(29, actionRouter, onRoutedEvent);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC14515a5 = interfaceC14515a4;
                AbstractC0564o.m1394P(anyModalM129238b, (Function1) objM87133R4, null, interfaceC14515a5, null, null, c28655q, AnyModal.$stable | ((i15 >> 9) & 7168), 52);
                r17 = c28655q;
                if (viewState.getUpsellCardFeaturesState() == null) {
                    r17.m87150e0(-1374250922);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r17, r10);
                    iHashCode = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = r17.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(r17, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j);
                    } else {
                        r17.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(r17, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(r17, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, r17, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N);
                    float f13 = 8;
                    float f14 = 1 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
                    interfaceC14515a3 = interfaceC14515a5;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r17, 0);
                    iHashCode2 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = r17.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(r17, modifierM3398t);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(r17, c0209i3, interfaceC28653p1M87165m2);
                    if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N2);
                    AbstractC32411b.m101095g(viewState.m129237a().size(), AbstractC1102d.m3411h(50 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), c3396tM60415U, f14, AbstractC1099a.m3379a(2 * f13, 0.0f, 2), null, null, false, AbstractC37817c.m121344e(133570005, r17, new C2194o(1, viewState, navigationEvent)), r17, 221232, 968);
                    r18 = r17;
                    r18.m87173q(true);
                    AbstractC22953f.m66715b(r18, AbstractC1102d.m3424u(18, c2314t));
                    AbstractC2930f.m8545h(viewState.m129237a().size(), c3396tM60415U.m9774m(), r18, 0, 0);
                    interfaceC38193dM129239c = viewState.getSwitchBillingPlanModal();
                    if (interfaceC38193dM129239c instanceof InterfaceC38193d.d) {
                        dVar = (InterfaceC38193d.d) interfaceC38193dM129239c;
                    } else {
                        dVar = null;
                    }
                    if (dVar == null) {
                        r18.m87150e0(1853625318);
                        r18.m87173q(false);
                    } else {
                        r18.m87150e0(1853625319);
                        m8564r(dVar, r18, 0);
                        r18.m87173q(false);
                    }
                    r18.m87173q(true);
                    r18.m87173q(false);
                    r14 = r18;
                } else {
                    interfaceC14515a3 = interfaceC14515a5;
                    r17.m87150e0(-1373015076);
                    r17.m87173q(r10);
                    r14 = r17;
                }
            } else {
                c28655q.m87138X();
                interfaceC14515a3 = interfaceC14515a2;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) viewState, (Object) navigationEvent, upsellViewEvent, (Object) onPagerScrolled, (Object) actionRouter, onRoutedEvent, (Object) interfaceC14515a3, i13, i14, 0);
            }
        }
        i15 |= 1572864;
        interfaceC14515a2 = interfaceC14515a;
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i24 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            c3396tM60415U = AbstractC21478l0.m60415U(0, c28655q, 0);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(0, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (c3396tM60415U.m9774m() != m8556j(interfaceC28601c1)) {
                onPagerScrolled.invoke(viewState.m129237a().get(c3396tM60415U.m9774m()), Integer.valueOf(m8556j(interfaceC28601c1)));
                m8557k(interfaceC28601c1, c3396tM60415U.m9774m());
            }
            c23042nM129240d = viewState.getUpsellCardFeaturesState();
            if (c23042nM129240d == null) {
                c28655q.m87150e0(-1375083118);
                c28655q.m87173q(false);
                i15 = i15;
                c28676v1 = c28676v0;
                r10 = 0;
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                c28655q.m87150e0(-1375083117);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(c23042nM129240d);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(upsellViewEvent, c23042nM129240d, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(upsellViewEvent, c23042nM129240d, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                C13762f c13762f2 = new C13762f(17);
                boolean zM87157i3 = c28655q.m87157i(c23042nM129240d);
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z110 = z14 | zM87157i3;
                if ((i15 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z111 = z110 | z15;
                if ((i15 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z111 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    c23042n = c23042nM129240d;
                    C1042s c1042s2 = new C1042s((Object) c23042n, (Object) upsellViewEvent, (Object) actionRouter, (Object) onRoutedEvent, 4);
                    c28655q.m87172p0(c1042s2);
                    objM87133R3 = c1042s2;
                } else {
                    c23042n = c23042nM129240d;
                    C1042s c1042s3 = new C1042s((Object) c23042n, (Object) upsellViewEvent, (Object) actionRouter, (Object) onRoutedEvent, 4);
                    c28655q.m87172p0(c1042s3);
                    objM87133R3 = c1042s3;
                }
                i17 = 16384;
                C23042n c23042n3 = c23042n;
                c28676v1 = c28676v0;
                i18 = 131072;
                r10 = 0;
                AbstractC25303l.m74291r(c23042n3, null, c13762f2, (Function1) objM87133R3, c28655q, C23042n.f90836v, 2);
                c28655q.m87173q(false);
            }
            AnyModal anyModalM129238b2 = viewState.getPresentedModal();
            if ((i15 & 57344) == i17) {
                r15 = 1;
            } else {
                r15 = r10;
            }
            if ((i15 & 458752) == i18) {
                r16 = 1;
            } else {
                r16 = r10;
            }
            i19 = r16 | r15;
            objM87133R4 = c28655q.m87133R();
            if (i19 == 0) {
                objM87133R4 = new C0167g(29, actionRouter, onRoutedEvent);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C0167g(29, actionRouter, onRoutedEvent);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC14515a5 = interfaceC14515a4;
            AbstractC0564o.m1394P(anyModalM129238b2, (Function1) objM87133R4, null, interfaceC14515a5, null, null, c28655q, AnyModal.$stable | ((i15 >> 9) & 7168), 52);
            r17 = c28655q;
            if (viewState.getUpsellCardFeaturesState() == null) {
                r17.m87150e0(-1374250922);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r17, r10);
                iHashCode = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r17.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r17, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j);
                } else {
                    r17.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(r17, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(r17, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (r17.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, r17, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, r17, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(r17, c0209i7, modifierM118962N3);
                float f15 = 8;
                float f16 = 1 * f15;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f16, 7);
                interfaceC14515a3 = interfaceC14515a5;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, r17, 0);
                iHashCode2 = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r17.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r17, modifierM3398t2);
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j);
                } else {
                    r17.m87178s0();
                }
                AbstractC28683x.m87239G(r17, c0209i5, c22994r1M66759a2);
                AbstractC28683x.m87239G(r17, c0209i6, interfaceC28653p1M87165m4);
                if (r17.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(r17, c0209i7, modifierM118962N4);
                AbstractC32411b.m101095g(viewState.m129237a().size(), AbstractC1102d.m3411h(50 * 4, AbstractC1102d.m3409f(1.0f, c2314t2)), c3396tM60415U, f16, AbstractC1099a.m3379a(2 * f15, 0.0f, 2), null, null, false, AbstractC37817c.m121344e(133570005, r17, new C2194o(1, viewState, navigationEvent)), r17, 221232, 968);
                r18 = r17;
                r18.m87173q(true);
                AbstractC22953f.m66715b(r18, AbstractC1102d.m3424u(18, c2314t2));
                AbstractC2930f.m8545h(viewState.m129237a().size(), c3396tM60415U.m9774m(), r18, 0, 0);
                interfaceC38193dM129239c = viewState.getSwitchBillingPlanModal();
                if (interfaceC38193dM129239c instanceof InterfaceC38193d.d) {
                    dVar = (InterfaceC38193d.d) interfaceC38193dM129239c;
                } else {
                    dVar = null;
                }
                if (dVar == null) {
                    r18.m87150e0(1853625318);
                    r18.m87173q(false);
                } else {
                    r18.m87150e0(1853625319);
                    m8564r(dVar, r18, 0);
                    r18.m87173q(false);
                }
                r18.m87173q(true);
                r18.m87173q(false);
                r14 = r18;
            } else {
                interfaceC14515a3 = interfaceC14515a5;
                r17.m87150e0(-1373015076);
                r17.m87173q(r10);
                r14 = r17;
            }
        } else {
            c28655q.m87138X();
            interfaceC14515a3 = interfaceC14515a2;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) viewState, (Object) navigationEvent, upsellViewEvent, (Object) onPagerScrolled, (Object) actionRouter, onRoutedEvent, (Object) interfaceC14515a3, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    private static final int m8556j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m8557k(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m8558l(C23042n it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(459150178);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m8559m(C23042n c23042n, Function1 function1, C13006a c13006a, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC40225a abstractC40225aM8567u = m8567u(event, c23042n);
        if (abstractC40225aM8567u != null) {
            function1.invoke(abstractC40225aM8567u);
        }
        Iterator<T> it = c13006a.m36534f(event).iterator();
        while (it.hasNext()) {
            function2.invoke(it.next());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m8560n(C13006a c13006a, Function1 function1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        Iterator<T> it = c13006a.m36535g(modalEvent).iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m8561o(C40241q c40241q, Function3 function3, InterfaceC3389m HorizontalPager, int i13, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        if ((i14 & 48) == 0) {
            i15 = i14 | (((C28655q) composer).m87149e(i13) ? 32 : 16);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 145) != 144)) {
            C40236l c40236l = c40241q.m129237a().get(i13);
            AbstractC22403o abstractC22403oM129222c = c40236l.getBackgroundImageSource();
            TextResource textResourceM129226g = c40236l.getTitleText();
            TextResource textResourceM129224e = c40236l.getSubtitleText();
            TextResource textResourceM129225f = c40236l.getTagText();
            boolean zM87153g = c28655q.m87153g(function3) | c28655q.m87157i(c40236l) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0372h(function3, c40236l, i13, 1);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = AbstractC22403o.f87638a;
            int i17 = TextResource.$stable;
            AbstractC2926b.m8534d(abstractC22403oM129222c, textResourceM129226g, textResourceM129224e, textResourceM129225f, (InterfaceC4339a) objM87133R, c28655q, i16 | (i17 << 3) | (i17 << 6) | (i17 << 9));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m8562p(Function3 function3, C40236l c40236l, int i13) {
        function3.invoke(c40236l.getCtaAction(), Integer.valueOf(i13), Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m8563q(C40241q c40241q, Function3 function3, Function1 function1, InterfaceC4351m interfaceC4351m, C13006a c13006a, Function1 function2, InterfaceC14515a interfaceC14515a, int i13, int i14, Composer composer, int i15) {
        m8555i(c40241q, function3, function1, interfaceC4351m, c13006a, function2, interfaceC14515a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m8564r(InterfaceC38193d.d successViewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(successViewState, "successViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1309300862);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(successViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC12889b.m36263b(AbstractC1099a.m3394p(16, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), AbstractC33253j.m105489e(6), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * 4, AbstractC37817c.m121344e(1263921761, c28655q, new C0539c(successViewState, 12)), c28655q, 1769478, 24);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2932h(successViewState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m8565s(InterfaceC38193d.d dVar, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(16, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C2307m c2307m = C2299e.f9102E;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(24, AbstractC11895b.m31987f(2, f13, c2314t, c38072d.m121949b(c28655q, i14).getAccentPositiveTrend15()));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q, 6), null, null, c38072d.m121949b(c28655q, i14).getAccentAction(), c28655q, 48, 4);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(12, c2314t));
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(dVar.getTitle());
            int i15 = TextResource.$stable;
            String upperCase = AbstractC8693b.m21274h(textResourceM21278l, c28655q, i15).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            long jM125377a = c38072d.m121949b(c28655q, i14).getAccentAction();
            C2886a c2886aM8439t = c38072d.m121952e(c28655q, i14).getH6();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(upperCase, null, jM125377a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(dVar.getSubtitle()), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH6(), null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m8566t(InterfaceC38193d.d dVar, int i13, Composer composer, int i14) {
        m8564r(dVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final AbstractC40225a m8567u(Object obj, C23042n c23042n) {
        Object next;
        if (obj instanceof C27256h) {
            return new AbstractC40225a.b((C27256h) obj, c23042n.getTrackingValue(), c23042n.getCategory());
        }
        if (obj instanceof C9598e) {
            Iterator it = AbstractC25260n.m74077r0(new C27256h[]{c23042n.getCardButton(), c23042n.getSecondCardButton()}).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C27256h) next).getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), ((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()));
            C27256h c27256h = (C27256h) next;
            if (c27256h != null) {
                return new AbstractC40225a.b(c27256h, c23042n.getTrackingValue(), c23042n.getCategory());
            }
        } else if (obj instanceof C23037i) {
            return new AbstractC40225a.a(((C23037i) obj).getId(), c23042n.getTrackingValue(), c23042n.getCategory());
        }
        return null;
    }
}
