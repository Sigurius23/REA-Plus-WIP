package n71;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b23.C2342h;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import e61.C12769l;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import is0.C20883g0;
import j21.C21245d;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l72.C23407n;
import l83.C23454a0;
import l83.C23465k;
import lc0.C23821c;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11381n0;
import p077d0.C11385o0;
import p077d0.EnumC11408v0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22134h;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n71.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a;\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0006\u001a7\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u0006\u001a+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0006\u001a-\u0010%\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b%\u0010&\u001a-\u0010'\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0003¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010,¨\u00061²\u0006\f\u0010-\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln71/q;", "state", "Ll83/a0;", "H", "(Landroidx/compose/ui/Modifier;Ln71/q;Landroidx/compose/runtime/Composer;II)V", "Lo2/e;", "imageVector", "", "contentDescription", "Li2/x;", "tint", "", "isActive", "M", "(Landroidx/compose/ui/Modifier;Lo2/e;Ljava/lang/String;JZLandroidx/compose/runtime/Composer;II)V", "K", "lineColor", "", "lineWidth", "Ly3/f;", "squareDimensions", "B", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "T", "color", "height", "width", "Q", "(JFFLandroidx/compose/runtime/Composer;II)V", "F", "", "Ln71/a;", "graphPoints", "Ln71/r;", "zoneState", "x", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ln71/r;Landroidx/compose/runtime/Composer;I)V", "q", "(Landroidx/compose/ui/Modifier;Ln71/q;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "minYValue", "maxYValue", "Y", "(Ln71/q;FF)Ljava/util/List;", "scale", "animatedColor", "animatedYPercent", "time", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26434o {

    /* JADX INFO: renamed from: n71.o$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.heartratemonitor.LiveHrMonitorKt$FinalMarkerLineWithBubble$1$1", m100430f = "LiveHrMonitor.kt", m100431l = {364}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f104994E;

        /* JADX INFO: renamed from: w */
        int f104995w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26436q f104996x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C26420a> f104997y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f104998z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C26436q c26436q, List<C26420a> list, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f104996x = c26436q;
            this.f104997y = list;
            this.f104998z = interfaceC28690z0;
            this.f104994E = interfaceC28690z1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f104996x, this.f104997y, this.f104998z, this.f104994E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f104995w;
            if (i13 != 0 && i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            do {
                if (!this.f104996x.getZoneStatus().isCalibrating()) {
                    InterfaceC28690z0 interfaceC28690z0 = this.f104994E;
                    C26420a c26420a = (C26420a) AbstractC25265s.m74114R0(this.f104997y);
                    AbstractC26434o.m78246s(interfaceC28690z0, c26420a != null ? c26420a.getYPercent() : 1.0f);
                    return C23454a0.f92919a;
                }
                InterfaceC28690z0 interfaceC28690z1 = this.f104998z;
                AbstractC26434o.m78248u(interfaceC28690z1, AbstractC26434o.m78247t(interfaceC28690z1) + 0.02f);
                AbstractC26434o.m78246s(this.f104994E, AbstractC12889b.m36283m((1 + ((float) Math.sin(AbstractC26434o.m78247t(this.f104998z)))) * 0.5f, 0.0f, 1.0f));
                this.f104995w = 1;
            } while (AbstractC3034m0.m8782b(16L, this) != enumC31071a);
            return enumC31071a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m78202A(Modifier modifier, List list, EnumC26437r enumC26437r, int i13, Composer composer, int i14) {
        m78251x(modifier, list, enumC26437r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8 A[PHI: r1 r4 r8 r11
      0x00a8: PHI (r1v8 androidx.compose.ui.Modifier) = (r1v5 androidx.compose.ui.Modifier), (r1v10 androidx.compose.ui.Modifier) binds: [B:69:0x00c9, B:59:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r4v23 int) = (r4v14 int), (r4v24 int) binds: [B:69:0x00c9, B:59:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r8v7 long) = (r8v3 long), (r8v1 long) binds: [B:69:0x00c9, B:59:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r11v6 float) = (r11v3 float), (r11v2 float) binds: [B:69:0x00c9, B:59:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x019f  */
    /* JADX INFO: renamed from: B */
    public static final void m78203B(Modifier modifier, long j7, float f13, float f14, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        long jM125370W0;
        float f15;
        int i16;
        float f16;
        int i17;
        boolean z4;
        final Modifier modifier3;
        final long j13;
        final float f17;
        final float f18;
        C28677v1 c28677v1M87180u;
        float f19;
        float f24;
        C23465k[] c23465kArr;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        long j14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-290331569);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            jM125370W0 = j7;
            i15 |= ((i14 & 2) == 0 && c28655q.m87151f(jM125370W0)) ? 32 : 16;
        } else {
            jM125370W0 = j7;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                f15 = f13;
                i15 |= c28655q.m87147d(f15) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f16 = f14;
                    if (c28655q.m87147d(f16)) {
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
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i18 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i14 & 2) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                            i15 &= -113;
                        }
                        if (i19 != 0) {
                            f15 = 4.0f;
                        }
                        if (i16 != 0) {
                            float f25 = 4;
                            f19 = f25 * f25;
                            f24 = f15;
                        }
                        c28655q.m87175r();
                        Float fValueOf = Float.valueOf(0.0f);
                        long j15 = C17919x.f69625b;
                        c23465kArr = new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.3f, j15))), new C23465k(Float.valueOf(0.5f), new C17919x(j15)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.3f, j15)))};
                        Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, modifier3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                        zM87157i = c28655q.m87157i(c23465kArr);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C23821c(c23465kArr, 23);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(jM125370W0)) || (i15 & 48) == 32) | ((i15 & 896) == 256);
                        objM87133R2 = c28655q.m87133R();
                        if (!z14 || objM87133R2 == c28676v0) {
                            j14 = jM125370W0;
                            objM87133R2 = new C12769l(f19, j14, f24, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            j14 = jM125370W0;
                        }
                        AbstractC21478l0.m60421a(modifierM3480c, (Function1) objM87133R2, c28655q, 0);
                        f18 = f19;
                        j13 = j14;
                        f17 = f24;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        modifier3 = modifier2;
                    }
                    f24 = f15;
                    f19 = f16;
                    c28655q.m87175r();
                    Float fValueOf2 = Float.valueOf(0.0f);
                    long j16 = C17919x.f69625b;
                    c23465kArr = new C23465k[]{new C23465k(fValueOf2, new C17919x(C17919x.m51541c(0.3f, j16))), new C23465k(Float.valueOf(0.5f), new C17919x(j16)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.3f, j16)))};
                    Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, modifier3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                    zM87157i = c28655q.m87157i(c23465kArr);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87157i) {
                        objM87133R = new C23821c(c23465kArr, 23);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C23821c(c23465kArr, 23);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3480c2 = AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(jM125370W0)) || (i15 & 48) == 32) | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        j14 = jM125370W0;
                        objM87133R2 = new C12769l(f19, j14, f24, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        j14 = jM125370W0;
                        objM87133R2 = new C12769l(f19, j14, f24, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC21478l0.m60421a(modifierM3480c2, (Function1) objM87133R2, c28655q, 0);
                    f18 = f19;
                    j13 = j14;
                    f17 = f24;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j13 = jM125370W0;
                    f17 = f15;
                    f18 = f16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC26434o.m78206E(modifier3, j13, f17, f18, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 3072;
            f16 = f14;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        f15 = 4.0f;
                    }
                    if (i16 != 0) {
                        float f26 = 4;
                        f19 = f26 * f26;
                        f24 = f15;
                    } else {
                        f24 = f15;
                        f19 = f16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        f15 = 4.0f;
                    }
                    if (i16 != 0) {
                        float f27 = 4;
                        f19 = f27 * f27;
                        f24 = f15;
                    } else {
                        f24 = f15;
                        f19 = f16;
                    }
                }
                c28655q.m87175r();
                Float fValueOf3 = Float.valueOf(0.0f);
                long j17 = C17919x.f69625b;
                c23465kArr = new C23465k[]{new C23465k(fValueOf3, new C17919x(C17919x.m51541c(0.3f, j17))), new C23465k(Float.valueOf(0.5f), new C17919x(j17)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.3f, j17)))};
                Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, modifier3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                zM87157i = c28655q.m87157i(c23465kArr);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (zM87157i) {
                    objM87133R = new C23821c(c23465kArr, 23);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C23821c(c23465kArr, 23);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3480c3 = AbstractC1125a.m3480c(modifierM3488c3, (Function1) objM87133R);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(jM125370W0)) || (i15 & 48) == 32) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    j14 = jM125370W0;
                    objM87133R2 = new C12769l(f19, j14, f24, 6);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    j14 = jM125370W0;
                    objM87133R2 = new C12769l(f19, j14, f24, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC21478l0.m60421a(modifierM3480c3, (Function1) objM87133R2, c28655q, 0);
                f18 = f19;
                j13 = j14;
                f17 = f24;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM125370W0;
                f17 = f15;
                f18 = f16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26434o.m78206E(modifier3, j13, f17, f18, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        f15 = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f16 = f14;
                if (c28655q.m87147d(f16)) {
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
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        f15 = 4.0f;
                    }
                    if (i16 != 0) {
                        float f28 = 4;
                        f19 = f28 * f28;
                        f24 = f15;
                    } else {
                        f24 = f15;
                        f19 = f16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        f15 = 4.0f;
                    }
                    if (i16 != 0) {
                        float f29 = 4;
                        f19 = f29 * f29;
                        f24 = f15;
                    } else {
                        f24 = f15;
                        f19 = f16;
                    }
                }
                c28655q.m87175r();
                Float fValueOf4 = Float.valueOf(0.0f);
                long j18 = C17919x.f69625b;
                c23465kArr = new C23465k[]{new C23465k(fValueOf4, new C17919x(C17919x.m51541c(0.3f, j18))), new C23465k(Float.valueOf(0.5f), new C17919x(j18)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.3f, j18)))};
                Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, modifier3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                zM87157i = c28655q.m87157i(c23465kArr);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v3 = C28635l.f115821a;
                if (zM87157i) {
                    objM87133R = new C23821c(c23465kArr, 23);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C23821c(c23465kArr, 23);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3480c4 = AbstractC1125a.m3480c(modifierM3488c4, (Function1) objM87133R);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(jM125370W0)) || (i15 & 48) == 32) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    j14 = jM125370W0;
                    objM87133R2 = new C12769l(f19, j14, f24, 6);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    j14 = jM125370W0;
                    objM87133R2 = new C12769l(f19, j14, f24, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC21478l0.m60421a(modifierM3480c4, (Function1) objM87133R2, c28655q, 0);
                f18 = f19;
                j13 = j14;
                f17 = f24;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM125370W0;
                f17 = f15;
                f18 = f16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26434o.m78206E(modifier3, j13, f17, f18, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        f16 = f14;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                    i15 &= -113;
                }
                if (i19 != 0) {
                    f15 = 4.0f;
                }
                if (i16 != 0) {
                    float f210 = 4;
                    f19 = f210 * f210;
                    f24 = f15;
                } else {
                    f24 = f15;
                    f19 = f16;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                    i15 &= -113;
                }
                if (i19 != 0) {
                    f15 = 4.0f;
                }
                if (i16 != 0) {
                    float f211 = 4;
                    f19 = f211 * f211;
                    f24 = f15;
                } else {
                    f24 = f15;
                    f19 = f16;
                }
            }
            c28655q.m87175r();
            Float fValueOf5 = Float.valueOf(0.0f);
            long j19 = C17919x.f69625b;
            c23465kArr = new C23465k[]{new C23465k(fValueOf5, new C17919x(C17919x.m51541c(0.3f, j19))), new C23465k(Float.valueOf(0.5f), new C17919x(j19)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.3f, j19)))};
            Modifier modifierM3488c5 = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, modifier3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            zM87157i = c28655q.m87157i(c23465kArr);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            if (zM87157i) {
                objM87133R = new C23821c(c23465kArr, 23);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C23821c(c23465kArr, 23);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c5 = AbstractC1125a.m3480c(modifierM3488c5, (Function1) objM87133R);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((((i15 & 112) ^ 48) <= 32 && c28655q.m87151f(jM125370W0)) || (i15 & 48) == 32) | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                j14 = jM125370W0;
                objM87133R2 = new C12769l(f19, j14, f24, 6);
                c28655q.m87172p0(objM87133R2);
            } else {
                j14 = jM125370W0;
                objM87133R2 = new C12769l(f19, j14, f24, 6);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC21478l0.m60421a(modifierM3480c5, (Function1) objM87133R2, c28655q, 0);
            f18 = f19;
            j13 = j14;
            f17 = f24;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            j13 = jM125370W0;
            f17 = f15;
            f18 = f16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26434o.m78206E(modifier3, j13, f17, f18, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m78204C(C23465k[] c23465kArr, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(c17909s, (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length)), 0L, 0L, 0.0f, null, 6, 62);
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m78205D(float f13, long j7, float f14, InterfaceC22131e interfaceC22131e) {
        char c3;
        long j13;
        int i13;
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c7 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        long j14 = 4294967295L;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        float fMo743q0 = Canvas.mo743q0(f13);
        int i14 = (int) (fIntBitsToFloat2 / fMo743q0);
        int i15 = (int) (fIntBitsToFloat / fMo743q0);
        if (i14 >= 0) {
            int i16 = 0;
            while (true) {
                float f15 = i16 * fMo743q0;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c7) | (((long) Float.floatToRawIntBits(f15)) & j14);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c7) | (((long) Float.floatToRawIntBits(f15)) & j14);
                int i17 = i16;
                c3 = c7;
                j13 = j14;
                int i18 = i14;
                i13 = i15;
                Canvas.mo732d0(j7, jFloatToRawIntBits, jFloatToRawIntBits2, (496 & 8) != 0 ? 0.0f : f14, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                if (i17 == i18) {
                    break;
                }
                i16 = i17 + 1;
                Canvas = interfaceC22131e;
                i14 = i18;
                i15 = i13;
                c7 = c3;
                j14 = j13;
            }
        } else {
            c3 = ' ';
            j13 = 4294967295L;
            i13 = i15;
        }
        if (i13 >= 0) {
            int i19 = 0;
            while (true) {
                float f16 = i19 * fMo743q0;
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
                interfaceC22131e.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) & j13) | (jFloatToRawIntBits3 << c3), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & j13) | (Float.floatToRawIntBits(f16) << c3), (496 & 8) != 0 ? 0.0f : f14, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                if (i19 == i13) {
                    break;
                }
                i19++;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m78206E(Modifier modifier, long j7, float f13, float f14, int i13, int i14, Composer composer, int i15) {
        m78203B(modifier, j7, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m78207F(Modifier modifier, C26436q state, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(599814063);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            float f13 = 4;
            float f14 = 8 * f13;
            List listM78227Z = m78227Z(state, 0.0f, 0.0f, 6, null);
            m78251x(AbstractC1099a.m3398t(AbstractC1099a.m3394p(f14, modifier), 12 * f13, 0.0f, 0.0f, 0.0f, 14), listM78227Z, state.getZoneStatus(), c28655q, 0);
            m78244q(AbstractC1099a.m3394p(f14, modifier), state, listM78227Z, c28655q, i15 & 112);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26432m(modifier2, state, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m78208G(Modifier modifier, C26436q c26436q, int i13, int i14, Composer composer, int i15) {
        m78207F(modifier, c26436q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m78209H(Modifier modifier, C26436q state, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1189146147);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1916079773, c28655q, new C21245d(21, modifier, state)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26432m(modifier2, state, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m78210I(Modifier modifier, C26436q c26436q, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier), false, 2.0f);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3384f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m78203B(AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3407d(1.0f, modifier)), 0L, 0.0f, 0.0f, c28655q, 0, 14);
            m78212K(AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(modifier, C2299e.f9117z), 3 * 8, 0.0f, 0.0f, 0.0f, 14), c26436q, c28655q, 0, 0);
            m78207F(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier), false, 2.0f), c26436q, c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m78211J(Modifier modifier, C26436q c26436q, int i13, int i14, Composer composer, int i15) {
        m78209H(modifier, c26436q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m78212K(Modifier modifier, C26436q c26436q, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String strM21274h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-284734673);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c26436q) ? 32 : 16;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
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
            String strM21274h2 = AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC16277f.f62234F0), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifier4 = modifier3;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            m78214M(null, AbstractC34132o.m107874S(c26436q.getZoneStatus().getIcon().toWhoopIcon(), c28655q, 6), null, c26436q.getZoneStatus().getZoneColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c26436q.getZoneStatus().isActive(), c28655q, 384, 1);
            List<Integer> listM78257c = c26436q.m78257c();
            if (listM78257c == null || listM78257c.isEmpty()) {
                c28655q.m87150e0(783344509);
                strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC16277f.f62230E0), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(783346837);
                c28655q.m87173q(false);
                strM21274h = String.valueOf(((Number) AbstractC25265s.m74112P0(c26436q.m78257c())).intValue());
            }
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN4(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC16277f.f62291W0), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            m78221T(null, c26436q, c28655q, i17 & 112, 1);
            c28655q.m87173q(true);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26432m(modifier2, c26436q, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m78213L(Modifier modifier, C26436q c26436q, int i13, int i14, Composer composer, int i15) {
        m78212K(modifier, c26436q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m78214M(Modifier modifier, final C27430e imageVector, final String str, final long j7, final boolean z4, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        final Modifier modifier3;
        AbstractC22676k.m65750j(imageVector, "imageVector");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1460239597);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(imageVector) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            str2 = str;
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("pulsingIconInfiniteTransition", c28655q, 0);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C26009o(21);
                c28655q.m87172p0(objM87133R);
            }
            C11365j0 c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 1.0f, 1.2f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), EnumC11408v0.f36577w, 4), "pulsingIcon", c28655q, 29112, 0);
            AbstractC15005f3.m43108b(imageVector, str2, AbstractC1127a.m3488c(AbstractC1102d.m3419p(24, modifier4), z4 ? m78216O(c11365j0M30559g) : 1.0f, z4 ? m78216O(c11365j0M30559g) : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284), j7, c28655q, ((i15 >> 3) & 126) | (i15 & 7168), 0);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26434o.m78217P(modifier3, imageVector, str, j7, z4, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m78215N(C11385o0 keyframes) {
        AbstractC22676k.m65750j(keyframes, "$this$keyframes");
        keyframes.f36506a = ErrorCodes.InitAPIErrors.cServerErrors;
        Float fValueOf = Float.valueOf(1.2f);
        C11381n0 c11381n0M30615a = keyframes.m30615a(200, fValueOf);
        C2342h c2342h = AbstractC11333b0.f36312c;
        c11381n0M30615a.f36485b = c2342h;
        Float fValueOf2 = Float.valueOf(1.0f);
        keyframes.m30615a(400, fValueOf2).f36485b = c2342h;
        keyframes.m30615a(600, fValueOf).f36485b = c2342h;
        keyframes.m30615a(1000, fValueOf2).f36485b = c2342h;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final float m78216O(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m78217P(Modifier modifier, C27430e c27430e, String str, long j7, boolean z4, int i13, int i14, Composer composer, int i15) {
        m78214M(modifier, c27430e, str, j7, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    private static final void m78218Q(final long j7, float f13, float f14, Composer composer, final int i13, final int i14) {
        int i15;
        final float f15;
        int i16;
        float f16;
        int i17;
        boolean z4;
        final float f17;
        C28677v1 c28677v1M87180u;
        float f18;
        float f19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1952448505);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                f15 = f13;
                i15 |= c28655q.m87147d(f15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    f16 = f14;
                    if (c28655q.m87147d(f16)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        f18 = ((float) 0.6d) * 4;
                    } else {
                        f18 = f15;
                    }
                    if (i16 != 0) {
                        f19 = 5 * 4;
                    } else {
                        f19 = f16;
                    }
                    AbstractC22989q.m66760a(AbstractC1102d.m3424u(f19, AbstractC1102d.m3411h(f18, AbstractC11895b.m31987f(1, 4, C2314t.f9131w, m78219R(AbstractC3760m1.m11569a(j7, null, "zoneBoxColor", c28655q, (i15 & 14) | 384, 10))))), c28655q, 0);
                    f17 = f19;
                    f15 = f18;
                } else {
                    c28655q.m87138X();
                    f17 = f16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.l
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC26434o.m78220S(j7, f15, f17, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 384;
            f16 = f14;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    f18 = ((float) 0.6d) * 4;
                } else {
                    f18 = f15;
                }
                if (i16 != 0) {
                    f19 = 5 * 4;
                } else {
                    f19 = f16;
                }
                AbstractC22989q.m66760a(AbstractC1102d.m3424u(f19, AbstractC1102d.m3411h(f18, AbstractC11895b.m31987f(1, 4, C2314t.f9131w, m78219R(AbstractC3760m1.m11569a(j7, null, "zoneBoxColor", c28655q, (i15 & 14) | 384, 10))))), c28655q, 0);
                f17 = f19;
                f15 = f18;
            } else {
                c28655q.m87138X();
                f17 = f16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26434o.m78220S(j7, f15, f17, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        f15 = f13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                f16 = f14;
                if (c28655q.m87147d(f16)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    f18 = ((float) 0.6d) * 4;
                } else {
                    f18 = f15;
                }
                if (i16 != 0) {
                    f19 = 5 * 4;
                } else {
                    f19 = f16;
                }
                AbstractC22989q.m66760a(AbstractC1102d.m3424u(f19, AbstractC1102d.m3411h(f18, AbstractC11895b.m31987f(1, 4, C2314t.f9131w, m78219R(AbstractC3760m1.m11569a(j7, null, "zoneBoxColor", c28655q, (i15 & 14) | 384, 10))))), c28655q, 0);
                f17 = f19;
                f15 = f18;
            } else {
                c28655q.m87138X();
                f17 = f16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC26434o.m78220S(j7, f15, f17, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        f16 = f14;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                f18 = ((float) 0.6d) * 4;
            } else {
                f18 = f15;
            }
            if (i16 != 0) {
                f19 = 5 * 4;
            } else {
                f19 = f16;
            }
            AbstractC22989q.m66760a(AbstractC1102d.m3424u(f19, AbstractC1102d.m3411h(f18, AbstractC11895b.m31987f(1, 4, C2314t.f9131w, m78219R(AbstractC3760m1.m11569a(j7, null, "zoneBoxColor", c28655q, (i15 & 14) | 384, 10))))), c28655q, 0);
            f17 = f19;
            f15 = f18;
        } else {
            c28655q.m87138X();
            f17 = f16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n71.l
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26434o.m78220S(j7, f15, f17, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: R */
    private static final long m78219R(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m78220S(long j7, float f13, float f14, int i13, int i14, Composer composer, int i15) {
        m78218Q(j7, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m78221T(Modifier modifier, C26436q c26436q, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C26436q c26436q2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1589258387);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c26436q2 = c26436q;
            i15 |= c28655q.m87157i(c26436q2) ? 32 : 16;
        } else {
            c26436q2 = c26436q;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c26436q2.getZoneStatus().getZoneText(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(1639005026);
            Iterator it = AbstractC37056f.m118959K(EnumC26437r.ZONE_1, EnumC26437r.ZONE_2, EnumC26437r.ZONE_3, EnumC26437r.ZONE_4, EnumC26437r.ZONE_5).iterator();
            while (it.hasNext()) {
                m78218Q((((EnumC26437r) it.next()) == c26436q.getZoneStatus() ? c26436q.getZoneStatus().getZoneColor() : EnumC39333f.WHITE_10).mo134584toComposableColorWaAFU9c(c28655q, 0), 0.0f, 0.0f, c28655q, 0, 6);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26432m(modifier3, c26436q, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m78222U(Modifier modifier, C26436q c26436q, int i13, int i14, Composer composer, int i15) {
        m78221T(modifier, c26436q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final List<C26420a> m78226Y(C26436q c26436q, float f13, float f14) {
        List<Integer> listM74158x1;
        List<Integer> listM78257c = c26436q.m78257c();
        int i13 = 0;
        if (listM78257c == null || listM78257c.isEmpty()) {
            listM74158x1 = C25271y.f99162w;
        } else if (c26436q.m78257c().size() == 1) {
            listM74158x1 = AbstractC37056f.m118959K(c26436q.m78257c().get(0), c26436q.m78257c().get(0));
        } else {
            listM74158x1 = c26436q.m78257c().size() > c26436q.getMaxVisibleHeartRates() ? AbstractC25265s.m74158x1(c26436q.getMaxVisibleHeartRates(), c26436q.m78257c()) : c26436q.m78257c();
        }
        List<Integer> list = listM74158x1;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C26420a(i13 / (listM74158x1.size() - 1), AbstractC12889b.m36283m(((Number) obj).intValue() / f14, f13 / f14, 1.0f)));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ List m78227Z(C26436q c26436q, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = 220.0f;
        }
        return m78226Y(c26436q, f13, f14);
    }

    /* JADX INFO: renamed from: q */
    private static final void m78244q(Modifier modifier, final C26436q c26436q, final List<C26420a> list, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(671693483);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c26436q) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(list) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            final InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
            EnumC26437r zoneStatus = c26436q.getZoneStatus();
            boolean zM87157i = c28655q.m87157i(c26436q) | c28655q.m87157i(list);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                a aVar = new a(c26436q, list, interfaceC28690z1, interfaceC28690z0, null);
                c28655q.m87172p0(aVar);
                objM87133R3 = aVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, zoneStatus);
            C38072d c38072d = C38072d.f163053a;
            final long jM125412p = c38072d.m121949b(c28655q, 6).getBlack10();
            final long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            final long jM125382b1 = c38072d.m121949b(c28655q, 6).getWhite50();
            boolean zM87157i2 = c28655q.m87157i(c26436q) | c28655q.m87157i(list) | c28655q.m87151f(jM125382b1) | c28655q.m87151f(jM125430y) | c28655q.m87151f(jM125412p);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                Function1 function1 = new Function1() { // from class: n71.k
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC26434o.m78249v(c26436q, list, jM125382b1, jM125430y, jM125412p, interfaceC28690z0, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R4 = function1;
            }
            AbstractC21478l0.m60421a(modifier, (Function1) objM87133R4, c28655q, i15 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(modifier, c26436q, list, i13, 17);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final float m78245r(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m78246s(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final float m78247t(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m78248u(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m78249v(C26436q c26436q, List list, long j7, long j13, long j14, InterfaceC28690z0 interfaceC28690z0, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        if (c26436q.getZoneStatus().shouldDrawMarkerLine()) {
            C26420a c26420a = (C26420a) AbstractC25265s.m74114R0(list);
            if (c26420a == null) {
                c26420a = new C26420a(1.0f, 1.0f);
            }
            C17893k c17893k = new C17893k(new DashPathEffect(new float[]{12.0f, 5.0f}, 0.0f));
            float fM78171a = c26420a.getXPercent() * fIntBitsToFloat;
            float fM78172b = fIntBitsToFloat2 - (c26420a.getYPercent() * fIntBitsToFloat2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM78171a)) << 32) | (((long) Float.floatToRawIntBits(fM78172b)) & 4294967295L);
            int i13 = (int) (jFloatToRawIntBits >> 32);
            Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (496 & 8) != 0 ? 0.0f : 3.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : c17893k);
            if (c26436q.getZoneStatus().isCalibrating()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
                float fM78245r = fIntBitsToFloat2 - (m78245r(interfaceC28690z0) * fIntBitsToFloat2);
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fM78245r)) & 4294967295L);
            }
            long j15 = jFloatToRawIntBits;
            InterfaceC22131e.m63379M(Canvas, j13, 10.0f, j15, 0.0f, null, 120);
            InterfaceC22131e.m63379M(Canvas, j14, 20.0f, j15, 0.0f, null, 120);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m78250w(Modifier modifier, C26436q c26436q, List list, int i13, Composer composer, int i14) {
        m78244q(modifier, c26436q, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m78251x(Modifier modifier, List<C26420a> list, EnumC26437r enumC26437r, Composer composer, int i13) {
        Modifier modifier2;
        int i14;
        AbstractC18254h abstractC18254hM52584a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1676588937);
        if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i14 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC26437r.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC18247a graphBackground = enumC26437r.getGraphBackground();
            if (graphBackground == null) {
                c28655q.m87150e0(-1086175999);
                c28655q.m87173q(false);
                abstractC18254hM52584a = null;
            } else {
                c28655q.m87150e0(-589227264);
                abstractC18254hM52584a = AbstractC18255i.m52584a(graphBackground, c28655q, 0);
                c28655q.m87173q(false);
            }
            long jMo134584toComposableColorWaAFU9c = enumC26437r.getZoneColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            Modifier modifierM3488c = AbstractC1127a.m3488c(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C26009o(22);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R);
            boolean zM87157i = c28655q.m87157i(list) | c28655q.m87153g(abstractC18254hM52584a) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C20883g0(list, abstractC18254hM52584a, jMo134584toComposableColorWaAFU9c);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC21478l0.m60421a(modifierM3480c, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(modifier, list, enumC26437r, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m78252y(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69625b;
        C23465k c23465k = new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.0f, j7)));
        Float fValueOf2 = Float.valueOf(0.5f);
        C23465k c23465k2 = new C23465k(fValueOf2, new C17919x(j7));
        Float fValueOf3 = Float.valueOf(1.0f);
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(c17909s, new C23465k[]{c23465k, c23465k2, new C23465k(fValueOf3, new C17919x(j7))}), 0L, 0L, 0.0f, null, 6, 62);
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(j7)), new C23465k(fValueOf2, new C17919x(j7)), new C23465k(fValueOf3, new C17919x(C17919x.m51541c(0.0f, j7)))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m78253z(List list, AbstractC18254h abstractC18254h, long j7, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c3 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        long j13 = 4294967295L;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        boolean zIsEmpty = list.isEmpty();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zIsEmpty) {
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            c17891jM51478a.m51462i(0.0f, fIntBitsToFloat2);
            List<C26420a> list2 = list;
            for (C26420a c26420a : list2) {
                c17891jM51478a.m51461h(c26420a.getXPercent() * fIntBitsToFloat, fIntBitsToFloat2 - (c26420a.getYPercent() * fIntBitsToFloat2));
            }
            c17891jM51478a.m51461h(fIntBitsToFloat, fIntBitsToFloat2);
            c17891jM51478a.m51459f();
            boolean z4 = abstractC18254h instanceof C18251e;
            C22134h c22134h = C22134h.f85857a;
            if (z4) {
                InterfaceC22131e.m63378L(Canvas, c17891jM51478a, ((C18251e) abstractC18254h).getBrush(), 0.0f, c22134h, 52);
            } else if (abstractC18254h instanceof C18253g) {
                InterfaceC22131e.m63386z(Canvas, c17891jM51478a, ((C18253g) abstractC18254h).getColor(), 0.0f, c22134h, 52);
            } else {
                InterfaceC22131e.m63386z(Canvas, c17891jM51478a, C17919x.f69636m, 0.0f, c22134h, 52);
            }
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Object next = it.next();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C26420a c26420a2 = (C26420a) next2;
                    C26420a c26420a3 = (C26420a) next;
                    float fM78171a = c26420a3.getXPercent() * fIntBitsToFloat;
                    float fM78172b = fIntBitsToFloat2 - (c26420a3.getYPercent() * fIntBitsToFloat2);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM78171a)) << c3) | (((long) Float.floatToRawIntBits(fM78172b)) & j13);
                    float fM78171a2 = c26420a2.getXPercent() * fIntBitsToFloat;
                    float fM78172b2 = fIntBitsToFloat2 - (c26420a2.getYPercent() * fIntBitsToFloat2);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM78171a2)) << c3) | (((long) Float.floatToRawIntBits(fM78172b2)) & j13);
                    C23454a0 c23454a1 = c23454a0;
                    ArrayList arrayList2 = arrayList;
                    Canvas.mo732d0(j7, jFloatToRawIntBits, jFloatToRawIntBits2, (496 & 8) != 0 ? 0.0f : 6.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                    arrayList2.add(c23454a1);
                    arrayList = arrayList2;
                    c23454a0 = c23454a1;
                    next = next2;
                    fIntBitsToFloat2 = fIntBitsToFloat2;
                    c3 = ' ';
                    j13 = 4294967295L;
                }
            }
        }
        return c23454a0;
    }
}
