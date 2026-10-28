package v90;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2656x4;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bm2.C3433d0;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import j80.InterfaceC21413a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import v40.C35652d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v90.n */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ai\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lv90/o;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Lv90/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "optionTitle", "optionSubtitle", "optionPrice", "optionPriceSubtitle", "", "optionPriceSubtitleStrikeout", "tag", "", "isOptionSelected", "Lkotlin/Function0;", "onClickOption", "g", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lv90/k;", "selectedOption", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35822n {

    /* JADX INFO: renamed from: v90.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.TrialPlanPickerScreenKt$TrialPlanPickerView$1$1", m100430f = "TrialPlanPickerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152422w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f152423x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f152424y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152423x = function1;
            this.f152424y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f152423x, this.f152424y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            CommitmentType commitmentType;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152422w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC35822n.m113627m(this.f152424y) == null) {
                this.f152423x.invoke(EnumC3921e.DISABLE);
            } else {
                this.f152423x.invoke(EnumC3921e.ENABLE);
                C35819k c35819kM113627m = AbstractC35822n.m113627m(this.f152424y);
                if (c35819kM113627m != null && (commitmentType = c35819kM113627m.getCommitmentType()) != null) {
                    this.f152423x.invoke(new InterfaceC21413a.f0(commitmentType));
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0187  */
    /* JADX WARN: Code duplicated, block: B:121:0x018b  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x0238  */
    /* JADX WARN: Code duplicated, block: B:148:0x023e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0242  */
    /* JADX WARN: Code duplicated, block: B:152:0x0251  */
    /* JADX WARN: Code duplicated, block: B:155:0x0286  */
    /* JADX WARN: Code duplicated, block: B:156:0x028a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0297  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02af  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0300  */
    /* JADX WARN: Code duplicated, block: B:173:0x030d  */
    /* JADX WARN: Code duplicated, block: B:175:0x031b  */
    /* JADX WARN: Code duplicated, block: B:179:0x032d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x033c  */
    /* JADX WARN: Code duplicated, block: B:187:0x036e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0372  */
    /* JADX WARN: Code duplicated, block: B:191:0x037f  */
    /* JADX WARN: Code duplicated, block: B:193:0x038d  */
    /* JADX WARN: Code duplicated, block: B:196:0x040b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0416  */
    /* JADX WARN: Code duplicated, block: B:202:0x0489  */
    /* JADX WARN: Code duplicated, block: B:205:0x0492  */
    /* JADX WARN: Code duplicated, block: B:208:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:217:0x056b  */
    /* JADX WARN: Code duplicated, block: B:218:0x056f  */
    /* JADX WARN: Code duplicated, block: B:221:0x057c  */
    /* JADX WARN: Code duplicated, block: B:223:0x058a  */
    /* JADX WARN: Code duplicated, block: B:226:0x0592  */
    /* JADX WARN: Code duplicated, block: B:227:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:229:0x0621  */
    /* JADX WARN: Code duplicated, block: B:231:0x0630  */
    /* JADX WARN: Code duplicated, block: B:234:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:237:0x070b  */
    /* JADX WARN: Code duplicated, block: B:238:0x070f  */
    /* JADX WARN: Code duplicated, block: B:241:0x071c  */
    /* JADX WARN: Code duplicated, block: B:243:0x072a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0783  */
    /* JADX WARN: Code duplicated, block: B:248:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:249:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:252:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:254:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:256:0x080e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0828  */
    /* JADX WARN: Code duplicated, block: B:261:0x083c  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8 A[PHI: r17
      0x00b8: PHI (r17v23 int) = (r17v0 int), (r17v6 int), (r17v7 int) binds: [B:61:0x00b6, B:71:0x00d3, B:70:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX INFO: renamed from: g */
    public static final void m113621g(TextResource optionTitle, TextResource textResource, TextResource optionPrice, TextResource textResource2, String str, TextResource textResource3, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        boolean z13;
        int i19;
        int i24;
        int i25;
        boolean z14;
        C28655q c28655q;
        TextResource textResource4;
        String str2;
        TextResource textResource5;
        boolean z15;
        TextResource textResource6;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        TextResource textResource7;
        TextResource textResource8;
        String str3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        C2307m c2307m;
        int iHashCode;
        C2314t c2314t;
        int i26;
        C0213j c0213j;
        TextResource textResource9;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        TextResource textResource10;
        C2307m c2307m2;
        C0209i c0209i4;
        boolean z16;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        C38072d c38072d;
        int i27;
        boolean z18;
        float f13;
        float f14;
        float f15;
        long jM125372X0;
        int iHashCode2;
        float f16;
        float f17;
        int iHashCode3;
        float f18;
        float f19;
        float f24;
        int iHashCode4;
        int i28;
        int i29;
        C28655q c28655q2;
        int iHashCode5;
        int iHashCode6;
        TextResource textResource11;
        C2314t c2314t2;
        boolean z19;
        String str4;
        boolean z24;
        C1100b c1100b;
        int iHashCode7;
        TextResource textResource12;
        C1100b c1100b2;
        boolean z25;
        int iHashCode8;
        Object objM87133R3;
        TextResource textResource13 = textResource3;
        C2307m c2307m3 = C2299e.f9102E;
        AbstractC22676k.m65750j(optionTitle, "optionTitle");
        AbstractC22676k.m65750j(optionPrice, "optionPrice");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(776394014);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(optionTitle) : c28655q3.m87157i(optionTitle) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(textResource) : c28655q3.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(optionPrice) : c28655q3.m87157i(optionPrice) ? 256 : 128;
        }
        int i35 = i14 & 8;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q3.m87153g(textResource2) : c28655q3.m87157i(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i36 = i14 & 16;
        if (i36 == 0) {
            if ((i13 & 24576) == 0) {
                i15 |= c28655q3.m87153g(str) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q3.m87153g(textResource13);
                } else {
                    zM87157i = c28655q3.m87157i(textResource13);
                }
                if (zM87157i) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    textResource7 = null;
                } else {
                    textResource7 = textResource;
                }
                if (i35 != 0) {
                    textResource8 = null;
                } else {
                    textResource8 = textResource2;
                }
                if (i36 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    textResource13 = null;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35652d(15);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                c2314t = C2314t.f9131w;
                i26 = i15;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                textResource9 = textResource8;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                textResource10 = textResource13;
                if (c28655q3.f115903S) {
                    c2307m2 = c2307m3;
                } else {
                    c2307m2 = c2307m3;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                    if ((i26 & 29360128) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C31918g(interfaceC4339a3, 13);
                        c28655q3.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    if ((i26 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z17 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2656x4(z13, 11);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC18032n.m51775c(modifierM3362g, true, (Function1) objM87133R2));
                    c38072d = C38072d.f163053a;
                    i27 = C38072d.f163054b;
                    z18 = z13;
                    InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                    f13 = 4;
                    f14 = 3 * f13;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q3, i27).getWhite10(), AbstractC33253j.m105489e(f14));
                    if (z18) {
                        f15 = ((float) 0.5d) * f13;
                    } else {
                        f15 = 1;
                    }
                    if (z18) {
                        c28655q3.m87150e0(1142857161);
                        c28655q3.m87173q(false);
                        jM125372X0 = C17919x.f69629f;
                    } else {
                        c28655q3.m87150e0(1142858091);
                        jM125372X0 = c38072d.m121949b(c28655q3, i27).getWhite20();
                        c28655q3.m87173q(false);
                    }
                    Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3358c, f15, jM125372X0, AbstractC33253j.m105489e(f14));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM44455h);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                    if (textResource10 != null) {
                        f16 = 1 * 8;
                    } else {
                        f16 = 0 * 8;
                    }
                    f17 = 2;
                    float f25 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f17 * f25, AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13));
                    C2306l c2306l = C2299e.f9108K;
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q3, 48);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f18, true);
                    f19 = 1;
                    f24 = f19 * f25;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f24), C2299e.f9110M, c28655q3, 54);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N4);
                    i28 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(optionTitle, c28655q3, (i26 & 14) | i28);
                    C2886a c2886aM8436q = c38072d.m121952e(c28655q3, i27).getH3();
                    long jM125430y = c38072d.m121949b(c28655q3, i27).getBrandWhite();
                    i29 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q3, 0, i29, 196602);
                    c28655q2 = c28655q3;
                    if (textResource7 == null) {
                        c28655q2.m87150e0(-1277884002);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1277884001);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource7, c28655q2, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i27), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q2, 0, i29, 196606);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    String strM21274h2 = AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28);
                    TextResource textResource14 = textResource7;
                    C28655q c28655q4 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q4, 0, i29, 196606);
                    c28655q = c28655q4;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    if (textResource9 == null) {
                        c28655q.m87150e0(-47400983);
                        c28655q.m87173q(false);
                        textResource11 = textResource9;
                        z19 = false;
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-47400982);
                        textResource11 = textResource9;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource11, c28655q, i28), null, c38072d.m121949b(c28655q, i27).getTextBaseSecondary(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i29, 196602);
                        z19 = false;
                        c28655q.m87173q(false);
                    }
                    if (str3 == null) {
                        c28655q = c28655q;
                        c28655q.m87150e0(-46745922);
                        c28655q.m87173q(z19);
                        z24 = z19;
                        str4 = str3;
                    } else {
                        c28655q = c28655q;
                        c28655q.m87150e0(-46745921);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f24, c2314t2));
                        C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                        long jM125348L0 = c38072d.m121949b(c28655q, i27).getTextBaseSecondary();
                        C28655q c28655q5 = c28655q;
                        String str5 = str3;
                        AbstractC30795n.m94707h(str5, null, jM125348L0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q5, 0, i29, 196602);
                        str4 = str5;
                        c28655q = c28655q5;
                        z24 = false;
                        c28655q.m87173q(false);
                    }
                    AbstractC2875y.m8286B(c28655q, true, true, true, true);
                    c1100b = C1100b.f4583a;
                    if (textResource10 == null) {
                        c28655q.m87150e0(1072293968);
                        c28655q.m87173q(z24);
                        c1100b2 = c1100b;
                        textResource12 = textResource10;
                    } else {
                        c28655q.m87150e0(1072293969);
                        float f26 = f19 * f13;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t2, c2307m), f14, (-1) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f26));
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                        textResource12 = textResource10;
                        c1100b2 = c1100b;
                        C28655q c28655q6 = c28655q;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q, i28), AbstractC1099a.m3395q(c2314t2, f17 * f13, f26), c38072d.m121949b(c28655q, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH6(), null, c28655q6, 48, i29, 196600);
                        c28655q = c28655q6;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    if (z18) {
                        c28655q.m87150e0(1072953184);
                        Modifier modifierMo3400a = c1100b2.mo3400a(c2314t2, C2299e.f9116y);
                        float f27 = f17 * f13;
                        Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, AbstractC1092a.m3358c(AbstractC1099a.m3391m(modifierMo3400a, f27, (-2) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f27)));
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode8 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode8))) {
                            AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                        C28655q c28655q7 = c28655q;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q, 6), null, null, C17919x.f69625b, c28655q7, 3120, 4);
                        c28655q = c28655q7;
                        z25 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        z25 = true;
                        c28655q.m87150e0(1073514718);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    textResource6 = textResource11;
                    z15 = z18;
                    interfaceC4339a2 = interfaceC4339a4;
                    textResource5 = textResource12;
                    textResource4 = textResource14;
                    str2 = str4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                if ((i26 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R = c28655q3.m87133R();
                if (z16) {
                    objM87133R = new C31918g(interfaceC4339a3, 13);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 13);
                    c28655q3.m87172p0(objM87133R);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                if ((i26 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z17) {
                    objM87133R2 = new C2656x4(z13, 11);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2656x4(z13, 11);
                    c28655q3.m87172p0(objM87133R2);
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC18032n.m51775c(modifierM3362g2, true, (Function1) objM87133R2));
                c38072d = C38072d.f163053a;
                i27 = C38072d.f163054b;
                z18 = z13;
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                f13 = 4;
                f14 = 3 * f13;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM3409f2, c38072d.m121949b(c28655q3, i27).getWhite10(), AbstractC33253j.m105489e(f14));
                if (z18) {
                    f15 = ((float) 0.5d) * f13;
                } else {
                    f15 = 1;
                }
                if (z18) {
                    c28655q3.m87150e0(1142857161);
                    c28655q3.m87173q(false);
                    jM125372X0 = C17919x.f69629f;
                } else {
                    c28655q3.m87150e0(1142858091);
                    jM125372X0 = c38072d.m121949b(c28655q3, i27).getWhite20();
                    c28655q3.m87173q(false);
                }
                Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM3358c3, f15, jM125372X0, AbstractC33253j.m105489e(f14));
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM44455h2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N9);
                if (textResource10 != null) {
                    f16 = 1 * 8;
                } else {
                    f16 = 0 * 8;
                }
                f17 = 2;
                float f28 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f17 * f28, AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13));
                C2306l c2306l2 = C2299e.f9108K;
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q3, 48);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3394p2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N10);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f18, true);
                f19 = 1;
                f24 = f19 * f28;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f24), C2299e.f9110M, c28655q3, 54);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N11);
                i28 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(optionTitle, c28655q3, (i26 & 14) | i28);
                C2886a c2886aM8436q2 = c38072d.m121952e(c28655q3, i27).getH3();
                long jM125430y2 = c38072d.m121949b(c28655q3, i27).getBrandWhite();
                i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q3, 0, i29, 196602);
                c28655q2 = c28655q3;
                if (textResource7 == null) {
                    c28655q2.m87150e0(-1277884002);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1277884001);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource7, c28655q2, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i27), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q2, 0, i29, 196606);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                String strM21274h4 = AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28);
                TextResource textResource15 = textResource7;
                C28655q c28655q8 = c28655q2;
                AbstractC30795n.m94707h(strM21274h4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q8, 0, i29, 196606);
                c28655q = c28655q8;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                if (textResource9 == null) {
                    c28655q.m87150e0(-47400983);
                    c28655q.m87173q(false);
                    textResource11 = textResource9;
                    z19 = false;
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-47400982);
                    textResource11 = textResource9;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource11, c28655q, i28), null, c38072d.m121949b(c28655q, i27).getTextBaseSecondary(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i29, 196602);
                    z19 = false;
                    c28655q.m87173q(false);
                }
                if (str3 == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(-46745922);
                    c28655q.m87173q(z19);
                    z24 = z19;
                    str4 = str3;
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(-46745921);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f24, c2314t2));
                    C2886a c2886aM8397c2 = C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                    long jM125348L1 = c38072d.m121949b(c28655q, i27).getTextBaseSecondary();
                    C28655q c28655q9 = c28655q;
                    String str6 = str3;
                    AbstractC30795n.m94707h(str6, null, jM125348L1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c2, null, c28655q9, 0, i29, 196602);
                    str4 = str6;
                    c28655q = c28655q9;
                    z24 = false;
                    c28655q.m87173q(false);
                }
                AbstractC2875y.m8286B(c28655q, true, true, true, true);
                c1100b = C1100b.f4583a;
                if (textResource10 == null) {
                    c28655q.m87150e0(1072293968);
                    c28655q.m87173q(z24);
                    c1100b2 = c1100b;
                    textResource12 = textResource10;
                } else {
                    c28655q.m87150e0(1072293969);
                    float f29 = f19 * f13;
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t2, c2307m), f14, (-1) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f29));
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3358c4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                    textResource12 = textResource10;
                    c1100b2 = c1100b;
                    C28655q c28655q10 = c28655q;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q, i28), AbstractC1099a.m3395q(c2314t2, f17 * f13, f29), c38072d.m121949b(c28655q, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH6(), null, c28655q10, 48, i29, 196600);
                    c28655q = c28655q10;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                if (z18) {
                    c28655q.m87150e0(1072953184);
                    Modifier modifierMo3400a2 = c1100b2.mo3400a(c2314t2, C2299e.f9116y);
                    float f210 = f17 * f13;
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f13, AbstractC1092a.m3358c(AbstractC1099a.m3391m(modifierMo3400a2, f210, (-2) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f210)));
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode8 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3419p2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    C28655q c28655q11 = c28655q;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q, 6), null, null, C17919x.f69625b, c28655q11, 3120, 4);
                    c28655q = c28655q11;
                    z25 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z25 = true;
                    c28655q.m87150e0(1073514718);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                textResource6 = textResource11;
                z15 = z18;
                interfaceC4339a2 = interfaceC4339a5;
                textResource5 = textResource12;
                textResource4 = textResource15;
                str2 = str4;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                textResource4 = textResource;
                str2 = str;
                textResource5 = textResource13;
                z15 = z13;
                textResource6 = textResource2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35821m(optionTitle, textResource4, optionPrice, textResource6, str2, textResource5, z15, interfaceC4339a2, i13, i14, 0);
            }
        }
        i15 |= 24576;
        i16 = i14 & 32;
        i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i = c28655q3.m87153g(textResource13);
            } else {
                zM87157i = c28655q3.m87157i(textResource13);
            }
            if (zM87157i) {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i17;
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q3.m87157i(interfaceC4339a)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        if ((i15 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z14)) {
            if (i34 != 0) {
                textResource7 = null;
            } else {
                textResource7 = textResource;
            }
            if (i35 != 0) {
                textResource8 = null;
            } else {
                textResource8 = textResource2;
            }
            if (i36 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i16 != 0) {
                textResource13 = null;
            }
            if (i18 != 0) {
                z13 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35652d(15);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
            c2314t = C2314t.f9131w;
            i26 = i15;
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            textResource9 = textResource8;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d8);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m16);
            c0209i3 = C0217k.f732j;
            textResource10 = textResource13;
            if (c28655q3.f115903S) {
                c2307m2 = c2307m3;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N16);
                if ((i26 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R = c28655q3.m87133R();
                if (z16) {
                    objM87133R = new C31918g(interfaceC4339a3, 13);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 13);
                    c28655q3.m87172p0(objM87133R);
                }
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                if ((i26 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z17) {
                    objM87133R2 = new C2656x4(z13, 11);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2656x4(z13, 11);
                    c28655q3.m87172p0(objM87133R2);
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC18032n.m51775c(modifierM3362g3, true, (Function1) objM87133R2));
                c38072d = C38072d.f163053a;
                i27 = C38072d.f163054b;
                z18 = z13;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                f13 = 4;
                f14 = 3 * f13;
                Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM3409f3, c38072d.m121949b(c28655q3, i27).getWhite10(), AbstractC33253j.m105489e(f14));
                if (z18) {
                    f15 = ((float) 0.5d) * f13;
                } else {
                    f15 = 1;
                }
                if (z18) {
                    c28655q3.m87150e0(1142857161);
                    c28655q3.m87173q(false);
                    jM125372X0 = C17919x.f69629f;
                } else {
                    c28655q3.m87150e0(1142858091);
                    jM125372X0 = c38072d.m121949b(c28655q3, i27).getWhite20();
                    c28655q3.m87173q(false);
                }
                Modifier modifierM44455h3 = AbstractC15751g.m44455h(modifierM3358c5, f15, jM125372X0, AbstractC33253j.m105489e(f14));
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifierM44455h3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m17);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N17);
                if (textResource10 != null) {
                    f16 = 1 * 8;
                } else {
                    f16 = 0 * 8;
                }
                f17 = 2;
                float f211 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f17 * f211, AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13));
                C2306l c2306l3 = C2299e.f9108K;
                C22949e c22949e3 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e3, c2306l3, c28655q3, 48);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3394p3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N18);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f18, true);
                f19 = 1;
                f24 = f19 * f211;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f24), C2299e.f9110M, c28655q3, 54);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q3.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement5);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N19);
                i28 = TextResource.$stable;
                String strM21274h5 = AbstractC8693b.m21274h(optionTitle, c28655q3, (i26 & 14) | i28);
                C2886a c2886aM8436q3 = c38072d.m121952e(c28655q3, i27).getH3();
                long jM125430y3 = c38072d.m121949b(c28655q3, i27).getBrandWhite();
                i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q3, null, c28655q3, 0, i29, 196602);
                c28655q2 = c28655q3;
                if (textResource7 == null) {
                    c28655q2.m87150e0(-1277884002);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1277884001);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource7, c28655q2, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i27), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q2, 0, i29, 196606);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N110);
                String strM21274h6 = AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28);
                TextResource textResource16 = textResource7;
                C28655q c28655q12 = c28655q2;
                AbstractC30795n.m94707h(strM21274h6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q12, 0, i29, 196606);
                c28655q = c28655q12;
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e3, c2306l3, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
                if (textResource9 == null) {
                    c28655q.m87150e0(-47400983);
                    c28655q.m87173q(false);
                    textResource11 = textResource9;
                    z19 = false;
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-47400982);
                    textResource11 = textResource9;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource11, c28655q, i28), null, c38072d.m121949b(c28655q, i27).getTextBaseSecondary(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i29, 196602);
                    z19 = false;
                    c28655q.m87173q(false);
                }
                if (str3 == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(-46745922);
                    c28655q.m87173q(z19);
                    z24 = z19;
                    str4 = str3;
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(-46745921);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f24, c2314t2));
                    C2886a c2886aM8397c3 = C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                    long jM125348L2 = c38072d.m121949b(c28655q, i27).getTextBaseSecondary();
                    C28655q c28655q13 = c28655q;
                    String str7 = str3;
                    AbstractC30795n.m94707h(str7, null, jM125348L2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c3, null, c28655q13, 0, i29, 196602);
                    str4 = str7;
                    c28655q = c28655q13;
                    z24 = false;
                    c28655q.m87173q(false);
                }
                AbstractC2875y.m8286B(c28655q, true, true, true, true);
                c1100b = C1100b.f4583a;
                if (textResource10 == null) {
                    c28655q.m87150e0(1072293968);
                    c28655q.m87173q(z24);
                    c1100b2 = c1100b;
                    textResource12 = textResource10;
                } else {
                    c28655q.m87150e0(1072293969);
                    float f212 = f19 * f13;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t2, c2307m), f14, (-1) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f212));
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3358c6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                    textResource12 = textResource10;
                    c1100b2 = c1100b;
                    C28655q c28655q14 = c28655q;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q, i28), AbstractC1099a.m3395q(c2314t2, f17 * f13, f212), c38072d.m121949b(c28655q, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH6(), null, c28655q14, 48, i29, 196600);
                    c28655q = c28655q14;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                if (z18) {
                    c28655q.m87150e0(1072953184);
                    Modifier modifierMo3400a3 = c1100b2.mo3400a(c2314t2, C2299e.f9116y);
                    float f213 = f17 * f13;
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(6 * f13, AbstractC1092a.m3358c(AbstractC1099a.m3391m(modifierMo3400a3, f213, (-2) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f213)));
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode8 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3419p3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N113);
                    C28655q c28655q15 = c28655q;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q, 6), null, null, C17919x.f69625b, c28655q15, 3120, 4);
                    c28655q = c28655q15;
                    z25 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z25 = true;
                    c28655q.m87150e0(1073514718);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                textResource6 = textResource11;
                z15 = z18;
                interfaceC4339a2 = interfaceC4339a6;
                textResource5 = textResource12;
                textResource4 = textResource16;
                str2 = str4;
            } else {
                c2307m2 = c2307m3;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N16);
            if ((i26 & 29360128) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R = c28655q3.m87133R();
            if (z16) {
                objM87133R = new C31918g(interfaceC4339a3, 13);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a3, 13);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            if ((i26 & 3670016) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R2 = c28655q3.m87133R();
            if (z17) {
                objM87133R2 = new C2656x4(z13, 11);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2656x4(z13, 11);
                c28655q3.m87172p0(objM87133R2);
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC18032n.m51775c(modifierM3362g4, true, (Function1) objM87133R2));
            c38072d = C38072d.f163053a;
            i27 = C38072d.f163054b;
            z18 = z13;
            InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
            f13 = 4;
            f14 = 3 * f13;
            Modifier modifierM3358c7 = AbstractC1092a.m3358c(modifierM3409f4, c38072d.m121949b(c28655q3, i27).getWhite10(), AbstractC33253j.m105489e(f14));
            if (z18) {
                f15 = ((float) 0.5d) * f13;
            } else {
                f15 = 1;
            }
            if (z18) {
                c28655q3.m87150e0(1142857161);
                c28655q3.m87173q(false);
                jM125372X0 = C17919x.f69629f;
            } else {
                c28655q3.m87150e0(1142858091);
                jM125372X0 = c38072d.m121949b(c28655q3, i27).getWhite20();
                c28655q3.m87173q(false);
            }
            Modifier modifierM44455h4 = AbstractC15751g.m44455h(modifierM3358c7, f15, jM125372X0, AbstractC33253j.m105489e(f14));
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q3.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q3, modifierM44455h4);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m114);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N114);
            if (textResource10 != null) {
                f16 = 1 * 8;
            } else {
                f16 = 0 * 8;
            }
            f17 = 2;
            float f214 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f17 * f214, AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13));
            C2306l c2306l4 = C2299e.f9108K;
            C22949e c22949e4 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e4, c2306l4, c28655q3, 48);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q3.m87165m();
            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q3, modifierM3394p4);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a7);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m115);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N115);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f18, true);
            f19 = 1;
            f24 = f19 * f214;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f24), C2299e.f9110M, c28655q3, 54);
            iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement7);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m116);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N116);
            i28 = TextResource.$stable;
            String strM21274h7 = AbstractC8693b.m21274h(optionTitle, c28655q3, (i26 & 14) | i28);
            C2886a c2886aM8436q4 = c38072d.m121952e(c28655q3, i27).getH3();
            long jM125430y4 = c38072d.m121949b(c28655q3, i27).getBrandWhite();
            i29 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h7, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q4, null, c28655q3, 0, i29, 196602);
            c28655q2 = c28655q3;
            if (textResource7 == null) {
                c28655q2.m87150e0(-1277884002);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1277884001);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource7, c28655q2, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i27), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q2, 0, i29, 196606);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
            iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m117);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N117);
            String strM21274h8 = AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28);
            TextResource textResource17 = textResource7;
            C28655q c28655q16 = c28655q2;
            AbstractC30795n.m94707h(strM21274h8, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q16, 0, i29, 196606);
            c28655q = c28655q16;
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e4, c2306l4, c28655q, 48);
            iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N118);
            if (textResource9 == null) {
                c28655q.m87150e0(-47400983);
                c28655q.m87173q(false);
                textResource11 = textResource9;
                z19 = false;
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(-47400982);
                textResource11 = textResource9;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource11, c28655q, i28), null, c38072d.m121949b(c28655q, i27).getTextBaseSecondary(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i29, 196602);
                z19 = false;
                c28655q.m87173q(false);
            }
            if (str3 == null) {
                c28655q = c28655q;
                c28655q.m87150e0(-46745922);
                c28655q.m87173q(z19);
                z24 = z19;
                str4 = str3;
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(-46745921);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f24, c2314t2));
                C2886a c2886aM8397c4 = C2886a.m8397c(c38072d.m121952e(c28655q, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i27).getB3().getStyle(), c38072d.m121949b(c28655q, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                long jM125348L3 = c38072d.m121949b(c28655q, i27).getTextBaseSecondary();
                C28655q c28655q17 = c28655q;
                String str8 = str3;
                AbstractC30795n.m94707h(str8, null, jM125348L3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c4, null, c28655q17, 0, i29, 196602);
                str4 = str8;
                c28655q = c28655q17;
                z24 = false;
                c28655q.m87173q(false);
            }
            AbstractC2875y.m8286B(c28655q, true, true, true, true);
            c1100b = C1100b.f4583a;
            if (textResource10 == null) {
                c28655q.m87150e0(1072293968);
                c28655q.m87173q(z24);
                c1100b2 = c1100b;
                textResource12 = textResource10;
            } else {
                c28655q.m87150e0(1072293969);
                float f215 = f19 * f13;
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t2, c2307m), f14, (-1) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f215));
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode7 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3358c8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N119);
                textResource12 = textResource10;
                c1100b2 = c1100b;
                C28655q c28655q18 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q, i28), AbstractC1099a.m3395q(c2314t2, f17 * f13, f215), c38072d.m121949b(c28655q, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH6(), null, c28655q18, 48, i29, 196600);
                c28655q = c28655q18;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            if (z18) {
                c28655q.m87150e0(1072953184);
                Modifier modifierMo3400a4 = c1100b2.mo3400a(c2314t2, C2299e.f9116y);
                float f216 = f17 * f13;
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(6 * f13, AbstractC1092a.m3358c(AbstractC1099a.m3391m(modifierMo3400a4, f216, (-2) * f13), C17919x.f69629f, AbstractC33253j.m105489e(f216)));
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode8 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3419p4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1110);
                C28655q c28655q19 = c28655q;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q, 6), null, null, C17919x.f69625b, c28655q19, 3120, 4);
                c28655q = c28655q19;
                z25 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z25 = true;
                c28655q.m87150e0(1073514718);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z25);
            textResource6 = textResource11;
            z15 = z18;
            interfaceC4339a2 = interfaceC4339a7;
            textResource5 = textResource12;
            textResource4 = textResource17;
            str2 = str4;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            textResource4 = textResource;
            str2 = str;
            textResource5 = textResource13;
            z15 = z13;
            textResource6 = textResource2;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35821m(optionTitle, textResource4, optionPrice, textResource6, str2, textResource5, z15, interfaceC4339a2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m113622h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m113623i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m113624j(boolean z4, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51811j(z4, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m113625k(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, TextResource textResource5, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m113621g(textResource, textResource2, textResource3, textResource4, str, textResource5, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:102:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:109:0x051f A[LOOP:2: B:107:0x0519->B:109:0x051f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0537  */
    /* JADX WARN: Code duplicated, block: B:113:0x0539  */
    /* JADX WARN: Code duplicated, block: B:116:0x0544  */
    /* JADX WARN: Code duplicated, block: B:119:0x0558  */
    /* JADX WARN: Code duplicated, block: B:124:0x0565  */
    /* JADX WARN: Code duplicated, block: B:126:0x0594  */
    /* JADX WARN: Code duplicated, block: B:127:0x0598  */
    /* JADX WARN: Code duplicated, block: B:132:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:135:0x0633  */
    /* JADX WARN: Code duplicated, block: B:136:0x0638  */
    /* JADX WARN: Code duplicated, block: B:138:0x063b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0647  */
    /* JADX WARN: Code duplicated, block: B:143:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x032c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0330  */
    /* JADX WARN: Code duplicated, block: B:81:0x034b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0449  */
    /* JADX WARN: Code duplicated, block: B:87:0x0451  */
    /* JADX WARN: Code duplicated, block: B:89:0x0459  */
    /* JADX WARN: Code duplicated, block: B:90:0x045e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0494  */
    /* JADX WARN: Code duplicated, block: B:96:0x0499  */
    /* JADX WARN: Code duplicated, block: B:97:0x04a0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public static final void m113626l(C35823o viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        int iHashCode;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode2;
        C0209i c0209i;
        int iHashCode3;
        float f13;
        Iterator it;
        int i15;
        ArrayList arrayList;
        Iterator<T> it3;
        Iterator it4;
        Object next;
        int length;
        Object next2;
        int length2;
        String str;
        boolean z4;
        int iHashCode4;
        C0213j c0213j;
        C0209i c0209i2;
        C38072d c38072d;
        int i16;
        int i17;
        C35819k c35819kM113627m;
        String strM113602c;
        boolean z13;
        Object next3;
        int i18;
        C35819k c35819kM113627m2;
        String strM113610k;
        boolean zM87155h;
        Object objM87133R;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        InterfaceC28601c1 interfaceC28601c2;
        int i19;
        Object next4;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1221388961);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            if (objM87133R2 == c28676v4) {
                Iterator<T> it5 = viewState.m113636e().iterator();
                do {
                    if (!it5.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it5.next();
                } while (!((C35819k) next4).m113611l());
                objM87133R2 = AbstractC28683x.m87272z(next4);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            C35819k c35819kM113627m3 = m113627m(interfaceC28601c3);
            boolean z14 = (i14 & 112) == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z14 || objM87133R3 == c28676v4) {
                objM87133R3 = new a(onViewEvent, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R3);
            }
            int i24 = TextResource.$stable;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c35819kM113627m3);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d2 = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            long jM125426w = c38072d2.m121949b(c28655q, i25).getBrandBlack();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, jM125426w, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S) {
                c28676v0 = c28676v4;
            } else {
                c28676v0 = c28676v4;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                c28676v1 = c28676v0;
                interfaceC28601c1 = interfaceC28601c3;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                C1100b c1100b = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b.mo3401b(c2314t), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.35f), new C17919x(C17919x.m51541c(0.4f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.55f), new C17919x(C17919x.m51541c(0.65f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.75f), new C17919x(C17919x.m51541c(0.8f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.9f), new C17919x(C17919x.m51541c(0.9f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d2.m121949b(c28655q, i25).getBrandBlack()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
                c28655q.m87173q(true);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c1100b.mo3400a(AbstractC1092a.m3358c(c2314t, c38072d2.m121949b(c28655q, i25).getTransparent(), c17916v0), C2299e.f9105H));
                float f14 = 8;
                float f15 = 2 * f14;
                float f16 = 6 * f14;
                Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM3407d, f15, f16, f15, f16);
                C22957g c22957g = AbstractC22977m.f90653d;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i5;
                } else {
                    c0209i = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i24);
                C2886a c2886aM8417O = c38072d2.m121952e(c28655q, i25).getT2();
                long jM125430y = c38072d2.m121949b(c28655q, i25).getBrandWhite();
                C36775k c36775k = new C36775k(5);
                int i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i26, 196090);
                f13 = 1 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d2.m121952e(c28655q, i25).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d2, c28655q, i25), c38072d2.m121949b(c28655q, i25).getWhite70(), 0L, null, null, 0L, 5, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i26, 196606);
                c28655q = c28655q;
                c28655q.m87173q(true);
                float f17 = 4 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
                c28655q.m87150e0(-1384172515);
                it = viewState.m113636e().iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next3 = it.next();
                    i18 = i15 + 1;
                    if (i15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C35819k c35819k = (C35819k) next3;
                    c35819kM113627m2 = m113627m(interfaceC28601c1);
                    if (c35819kM113627m2 != null) {
                        strM113610k = c35819kM113627m2.getTrackingLabel();
                    } else {
                        strM113610k = null;
                    }
                    boolean zM65745e = AbstractC22676k.m65745e(strM113610k, c35819k.getTrackingLabel());
                    TextResource textResourceM113608i = c35819k.getOptionTitle();
                    TextResource textResourceM113607h = c35819k.getOptionSubtitle();
                    TextResource textResourceM113604e = c35819k.getOptionPrice();
                    TextResource textResourceM113605f = c35819k.getOptionPriceSubtitle();
                    String strM113606g = c35819k.getOptionPriceSubtitleStrikeout();
                    TextResource textResourceM113609j = c35819k.getTag();
                    zM87155h = c28655q.m87155h(zM65745e) | c28655q.m87157i(c35819k);
                    objM87133R = c28655q.m87133R();
                    if (zM87155h) {
                        c28676v2 = c28676v1;
                    } else {
                        c28676v2 = c28676v1;
                        if (objM87133R == c28676v2) {
                            c28676v3 = c28676v2;
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        int i27 = TextResource.$stable;
                        i19 = i15;
                        interfaceC28601c1 = interfaceC28601c2;
                        C28655q c28655q2 = c28655q;
                        m113621g(textResourceM113608i, textResourceM113607h, textResourceM113604e, textResourceM113605f, strM113606g, textResourceM113609j, zM65745e, (InterfaceC4339a) objM87133R, c28655q2, (i27 << 15) | (i27 << 3) | i27 | (i27 << 6) | (i27 << 9), 0);
                        c28655q = c28655q2;
                        if (i19 != AbstractC37056f.m118951C(viewState.m113636e())) {
                            AbstractC33745d.m106667z(c28655q, 1030427531, c2314t, f13, c28655q);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1030511138);
                            c28655q.m87173q(false);
                        }
                        i15 = i18;
                        it = it;
                        c28676v1 = c28676v3;
                    }
                    c28676v3 = c28676v2;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R = new C3433d0(zM65745e, c35819k, interfaceC28601c2, 11);
                    c28655q.m87172p0(objM87133R);
                    int i28 = TextResource.$stable;
                    i19 = i15;
                    interfaceC28601c1 = interfaceC28601c2;
                    C28655q c28655q3 = c28655q;
                    m113621g(textResourceM113608i, textResourceM113607h, textResourceM113604e, textResourceM113605f, strM113606g, textResourceM113609j, zM65745e, (InterfaceC4339a) objM87133R, c28655q3, (i28 << 15) | (i28 << 3) | i28 | (i28 << 6) | (i28 << 9), 0);
                    c28655q = c28655q3;
                    if (i19 != AbstractC37056f.m118951C(viewState.m113636e())) {
                        AbstractC33745d.m106667z(c28655q, 1030427531, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1030511138);
                        c28655q.m87173q(false);
                    }
                    i15 = i18;
                    it = it;
                    c28676v1 = c28676v3;
                }
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f17, c28655q);
                List<C35819k> listM113636e = viewState.m113636e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM113636e, 10));
                it3 = listM113636e.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C35819k) it3.next()).getDisclaimer());
                }
                it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    next = it4.next();
                    if (it4.hasNext()) {
                        length = ((String) next).length();
                        do {
                            next2 = it4.next();
                            length2 = ((String) next2).length();
                            if (length < length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next = null;
                }
                str = (String) next;
                if (str != null) {
                    c28655q.m87150e0(41555790);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    c38072d = C38072d.f163053a;
                    i16 = C38072d.f163054b;
                    C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, i16).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i16).getB3().getStyle(), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    long j7 = C17919x.f69636m;
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i17 = C2886a.f11498d << 18;
                    C28655q c28655q4 = c28655q;
                    AbstractC30795n.m94707h(str, modifierM3409f5, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q4, 432, i17, 196600);
                    c28655q = c28655q4;
                    c35819kM113627m = m113627m(interfaceC28601c1);
                    if (c35819kM113627m != null) {
                        strM113602c = c35819kM113627m.getDisclaimer();
                    } else {
                        strM113602c = null;
                    }
                    if (strM113602c == null) {
                        c28655q.m87150e0(1575533674);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1575533675);
                        AbstractC30795n.m94707h(AbstractC8693b.m21275i(strM113602c, c28655q, 0), AbstractC1102d.m3409f(1.0f, c2314t), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i16).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i16).getB3().getStyle(), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 48, i17, 196604);
                        c28655q = c28655q;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    z4 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z13);
                } else {
                    z4 = true;
                    c28655q.m87150e0(42748391);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73388u(5, f14, c2314t, c28655q, z4);
                c28655q.m87173q(z4);
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            c28676v1 = c28676v0;
            interfaceC28601c1 = interfaceC28601c3;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            C1100b c1100b2 = C1100b.f4583a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b2.mo3401b(c2314t), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.35f), new C17919x(C17919x.m51541c(0.4f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.55f), new C17919x(C17919x.m51541c(0.65f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.75f), new C17919x(C17919x.m51541c(0.8f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(0.9f), new C17919x(C17919x.m51541c(0.9f, c38072d2.m121949b(c28655q, i25).getBrandBlack()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d2.m121949b(c28655q, i25).getBrandBlack()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            c28655q.m87173q(true);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c1100b2.mo3400a(AbstractC1092a.m3358c(c2314t, c38072d2.m121949b(c28655q, i25).getTransparent(), c17916v0), C2299e.f9105H));
            float f18 = 8;
            float f19 = 2 * f18;
            float f110 = 6 * f18;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM3407d2, f19, f110, f19, f110);
            C22957g c22957g2 = AbstractC22977m.f90653d;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i24);
            C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q, i25).getT2();
            long jM125430y2 = c38072d2.m121949b(c28655q, i25).getBrandWhite();
            C36775k c36775k2 = new C36775k(5);
            int i29 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i29, 196090);
            f13 = 1 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i24), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d2.m121952e(c28655q, i25).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d2, c28655q, i25), c38072d2.m121949b(c28655q, i25).getWhite70(), 0L, null, null, 0L, 5, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, i29, 196606);
            c28655q = c28655q;
            c28655q.m87173q(true);
            float f111 = 4 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t));
            c28655q.m87150e0(-1384172515);
            it = viewState.m113636e().iterator();
            i15 = 0;
            while (it.hasNext()) {
                next3 = it.next();
                i18 = i15 + 1;
                if (i15 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C35819k c35819k2 = (C35819k) next3;
                c35819kM113627m2 = m113627m(interfaceC28601c1);
                if (c35819kM113627m2 != null) {
                    strM113610k = c35819kM113627m2.getTrackingLabel();
                } else {
                    strM113610k = null;
                }
                boolean zM65745e2 = AbstractC22676k.m65745e(strM113610k, c35819k2.getTrackingLabel());
                TextResource textResourceM113608i2 = c35819k2.getOptionTitle();
                TextResource textResourceM113607h2 = c35819k2.getOptionSubtitle();
                TextResource textResourceM113604e2 = c35819k2.getOptionPrice();
                TextResource textResourceM113605f2 = c35819k2.getOptionPriceSubtitle();
                String strM113606g2 = c35819k2.getOptionPriceSubtitleStrikeout();
                TextResource textResourceM113609j2 = c35819k2.getTag();
                zM87155h = c28655q.m87155h(zM65745e2) | c28655q.m87157i(c35819k2);
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    c28676v2 = c28676v1;
                    if (objM87133R == c28676v2) {
                        c28676v3 = c28676v2;
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    int i210 = TextResource.$stable;
                    i19 = i15;
                    interfaceC28601c1 = interfaceC28601c2;
                    C28655q c28655q5 = c28655q;
                    m113621g(textResourceM113608i2, textResourceM113607h2, textResourceM113604e2, textResourceM113605f2, strM113606g2, textResourceM113609j2, zM65745e2, (InterfaceC4339a) objM87133R, c28655q5, (i210 << 15) | (i210 << 3) | i210 | (i210 << 6) | (i210 << 9), 0);
                    c28655q = c28655q5;
                    if (i19 != AbstractC37056f.m118951C(viewState.m113636e())) {
                        AbstractC33745d.m106667z(c28655q, 1030427531, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1030511138);
                        c28655q.m87173q(false);
                    }
                    i15 = i18;
                    it = it;
                    c28676v1 = c28676v3;
                } else {
                    c28676v2 = c28676v1;
                }
                c28676v3 = c28676v2;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R = new C3433d0(zM65745e2, c35819k2, interfaceC28601c2, 11);
                c28655q.m87172p0(objM87133R);
                int i211 = TextResource.$stable;
                i19 = i15;
                interfaceC28601c1 = interfaceC28601c2;
                C28655q c28655q6 = c28655q;
                m113621g(textResourceM113608i2, textResourceM113607h2, textResourceM113604e2, textResourceM113605f2, strM113606g2, textResourceM113609j2, zM65745e2, (InterfaceC4339a) objM87133R, c28655q6, (i211 << 15) | (i211 << 3) | i211 | (i211 << 6) | (i211 << 9), 0);
                c28655q = c28655q6;
                if (i19 != AbstractC37056f.m118951C(viewState.m113636e())) {
                    AbstractC33745d.m106667z(c28655q, 1030427531, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1030511138);
                    c28655q.m87173q(false);
                }
                i15 = i18;
                it = it;
                c28676v1 = c28676v3;
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f111, c28655q);
            List<C35819k> listM113636e2 = viewState.m113636e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM113636e2, 10));
            it3 = listM113636e2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C35819k) it3.next()).getDisclaimer());
            }
            it4 = arrayList.iterator();
            if (it4.hasNext()) {
                next = null;
            } else {
                next = it4.next();
                if (it4.hasNext()) {
                    length = ((String) next).length();
                    do {
                        next2 = it4.next();
                        length2 = ((String) next2).length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it4.hasNext());
                }
            }
            str = (String) next;
            if (str != null) {
                c28655q.m87150e0(41555790);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a c2886aM8397c2 = C2886a.m8397c(c38072d.m121952e(c28655q, i16).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i16).getB3().getStyle(), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                long j13 = C17919x.f69636m;
                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                i17 = C2886a.f11498d << 18;
                C28655q c28655q7 = c28655q;
                AbstractC30795n.m94707h(str, modifierM3409f9, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c2, null, c28655q7, 432, i17, 196600);
                c28655q = c28655q7;
                c35819kM113627m = m113627m(interfaceC28601c1);
                if (c35819kM113627m != null) {
                    strM113602c = c35819kM113627m.getDisclaimer();
                } else {
                    strM113602c = null;
                }
                if (strM113602c == null) {
                    c28655q.m87150e0(1575533674);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1575533675);
                    AbstractC30795n.m94707h(AbstractC8693b.m21275i(strM113602c, c28655q, 0), AbstractC1102d.m3409f(1.0f, c2314t), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i16).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i16).getB3().getStyle(), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q, 48, i17, 196604);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(z13);
            } else {
                z4 = true;
                c28655q.m87150e0(42748391);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73388u(5, f18, c2314t, c28655q, z4);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C35819k m113627m(InterfaceC28601c1 interfaceC28601c1) {
        return (C35819k) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m113628n(InterfaceC28601c1 interfaceC28601c1, C35819k c35819k) {
        interfaceC28601c1.setValue(c35819k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m113629o(boolean z4, C35819k c35819k, InterfaceC28601c1 interfaceC28601c1) {
        m113628n(interfaceC28601c1, z4 ? null : c35819k);
        c35819k.getOnClickOption().invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m113630p(C35823o c35823o, Function1 function1, int i13, Composer composer, int i14) {
        m113626l(c35823o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
