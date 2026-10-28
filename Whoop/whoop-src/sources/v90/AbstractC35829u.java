package v90;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import h80.InterfaceC17002b;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j80.InterfaceC21413a;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
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
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
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
import r80.AbstractC31061c;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import v40.C35652d;
import wb3.AbstractC37056f;
import x60.AbstractC38021a;
import x81.C38072d;

/* JADX INFO: renamed from: v90.u */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ai\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lv90/v;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Lv90/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "optionTitle", "optionSubtitle", "optionPrice", "optionPriceSubtitle", "", "optionPriceSubtitleStrikeout", "tag", "", "isOptionSelected", "Lkotlin/Function0;", "onClickOption", "f", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35829u {

    /* JADX INFO: renamed from: v90.u$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcyclePlanPickerScreenKt$UpcyclePlanPickerView$1$1", m100430f = "UpcyclePlanPickerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152483w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35830v f152484x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152485y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C35830v c35830v, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152484x = c35830v;
            this.f152485y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f152484x, this.f152485y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152483w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Iterator<T> it = this.f152484x.m113719f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C35827s) next).m113699n());
            C35827s c35827s = (C35827s) next;
            if (c35827s != null) {
                Function1 function1 = this.f152485y;
                function1.invoke(new InterfaceC21413a.f0(c35827s.getCommitmentType()));
                function1.invoke(new InterfaceC17002b.j("upcycle_plan_picker", AbstractC11266d.m30461o("default ", c35827s.getTrackingLabel()), "upcycle", AbstractC31061c.m95645u("membership", c35827s.getMembershipTier())));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x019c  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:140:0x022f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0236  */
    /* JADX WARN: Code duplicated, block: B:145:0x0266  */
    /* JADX WARN: Code duplicated, block: B:146:0x026a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:151:0x0285  */
    /* JADX WARN: Code duplicated, block: B:156:0x02be  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0325  */
    /* JADX WARN: Code duplicated, block: B:175:0x0329  */
    /* JADX WARN: Code duplicated, block: B:178:0x0336  */
    /* JADX WARN: Code duplicated, block: B:180:0x0344  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:185:0x03df  */
    /* JADX WARN: Code duplicated, block: B:189:0x0452  */
    /* JADX WARN: Code duplicated, block: B:192:0x045b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0480  */
    /* JADX WARN: Code duplicated, block: B:196:0x0484  */
    /* JADX WARN: Code duplicated, block: B:199:0x0491  */
    /* JADX WARN: Code duplicated, block: B:201:0x049f  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:210:0x04df  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:215:0x0588  */
    /* JADX WARN: Code duplicated, block: B:216:0x058c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0599  */
    /* JADX WARN: Code duplicated, block: B:221:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:224:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:225:0x05be  */
    /* JADX WARN: Code duplicated, block: B:227:0x0635  */
    /* JADX WARN: Code duplicated, block: B:229:0x0643  */
    /* JADX WARN: Code duplicated, block: B:232:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:234:0x0706  */
    /* JADX WARN: Code duplicated, block: B:235:0x070a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0717  */
    /* JADX WARN: Code duplicated, block: B:240:0x0725  */
    /* JADX WARN: Code duplicated, block: B:242:0x0751  */
    /* JADX WARN: Code duplicated, block: B:244:0x0763  */
    /* JADX WARN: Code duplicated, block: B:245:0x0771  */
    /* JADX WARN: Code duplicated, block: B:247:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:248:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:251:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:253:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:256:0x0838  */
    /* JADX WARN: Code duplicated, block: B:259:0x084b  */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5 A[PHI: r16
      0x00b5: PHI (r16v13 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:61:0x00b3, B:71:0x00d0, B:70:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v44, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v59 */
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
    /* JADX INFO: renamed from: f */
    public static final void m113708f(TextResource optionTitle, TextResource textResource, TextResource optionPrice, TextResource textResource2, String str, TextResource textResource3, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        boolean z13;
        int i19;
        int i24;
        int i25;
        boolean z14;
        TextResource textResource4;
        TextResource textResource5;
        boolean z15;
        String str3;
        TextResource textResource6;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        TextResource textResource7;
        TextResource textResource8;
        String str4;
        Object obj;
        InterfaceC4339a interfaceC4339a3;
        C2307m c2307m;
        int iHashCode;
        C2314t c2314t;
        int i26;
        boolean z16;
        InterfaceC4339a interfaceC4339a4;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        TextResource textResource9;
        C0209i c0209i4;
        float f13;
        boolean z17;
        Object objM87133R;
        float f14;
        float f15;
        C38072d c38072d;
        int i27;
        float f16;
        long j7;
        C2307m c2307m2;
        int iHashCode2;
        C0209i c0209i5;
        float f17;
        int iHashCode3;
        float f18;
        int iHashCode4;
        int i28;
        int i29;
        C0209i c0209i6;
        TextResource textResource10;
        TextResource textResource11;
        C28655q c28655q2;
        int iHashCode5;
        C0209i c0209i7;
        int iHashCode6;
        C28655q c28655q3;
        int iHashCode7;
        C28655q c28655q4;
        boolean z18;
        C28655q c28655q5;
        String str5;
        boolean z19;
        C28655q c28655q6;
        C1100b c1100b;
        C1100b c1100b2;
        C2307m c2307m3;
        float f19;
        ?? r14;
        C28655q c28655q7;
        int iHashCode8;
        TextResource textResource12;
        boolean z24;
        C28655q c28655q8;
        int iHashCode9;
        Object objM87133R2;
        TextResource textResource13 = textResource3;
        AbstractC22676k.m65750j(optionTitle, "optionTitle");
        AbstractC22676k.m65750j(optionPrice, "optionPrice");
        C28655q c28655q9 = (C28655q) composer;
        c28655q9.m87154g0(1454504190);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q9.m87153g(optionTitle) : c28655q9.m87157i(optionTitle) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q9.m87153g(textResource) : c28655q9.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q9.m87153g(optionPrice) : c28655q9.m87157i(optionPrice) ? 256 : 128;
        }
        int i35 = i14 & 8;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q9.m87153g(textResource2) : c28655q9.m87157i(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i36 = i14 & 16;
        if (i36 == 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                i15 |= c28655q9.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q9.m87153g(textResource13);
                } else {
                    zM87157i = c28655q9.m87157i(textResource13);
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
                    if (c28655q9.m87155h(z13)) {
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
                if (c28655q9.m87157i(interfaceC4339a)) {
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
            if (c28655q9.m87135U(i15 & 1, z14)) {
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
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    textResource13 = null;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                obj = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q9.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C35652d(17);
                        c28655q9.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q9.m87165m();
                c2314t = C2314t.f9131w;
                i26 = i15;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q9, c2314t);
                InterfaceC0221l.f734a.getClass();
                z16 = z13;
                interfaceC4339a4 = C0217k.f724b;
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q9.f115903S) {
                    textResource9 = textResource8;
                } else {
                    textResource9 = textResource8;
                    if (!AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N);
                    f13 = 4;
                    Modifier modifierM3405b = AbstractC1102d.m3405b(c2314t, 0.0f, 30 * f13, 1);
                    if ((i26 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q9.m87133R();
                    if (z17 || objM87133R == obj) {
                        objM87133R = new C31918g(interfaceC4339a3, 14);
                        c28655q9.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3405b, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    f14 = 1;
                    float f24 = 8;
                    f15 = f14 * f24;
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifierM3362g, 0.0f, f15, 1));
                    c38072d = C38072d.f163053a;
                    i27 = C38072d.f163054b;
                    float f25 = 3 * f13;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q9, i27).getWhite10(), AbstractC33253j.m105489e(f25));
                    if (z16) {
                        f16 = ((float) 0.5d) * f13;
                    } else {
                        f16 = Float.NaN;
                    }
                    j7 = C17919x.f69629f;
                    Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3358c, f16, j7, AbstractC33253j.m105489e(f25));
                    c2307m2 = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q9.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q9, modifierM44455h);
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(interfaceC4339a4);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q9.f115903S && AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i3;
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N2);
                    f17 = 2;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f17 * f24, c2314t);
                    C2306l c2306l = C2299e.f9108K;
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q9, 48);
                    iHashCode3 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q9.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q9, modifierM3394p);
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(interfaceC4339a4);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N3);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f18, true);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q9, 54);
                    iHashCode4 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q9.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q9, layoutWeightElement);
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(interfaceC4339a4);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N4);
                    i28 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(optionTitle, c28655q9, (i26 & 14) | i28);
                    C2886a c2886aM8436q = c38072d.m121952e(c28655q9, i27).getH3();
                    long jM125430y = c38072d.m121949b(c28655q9, i27).getBrandWhite();
                    i29 = C2886a.f11498d << 18;
                    c0209i6 = c0209i5;
                    textResource10 = textResource9;
                    textResource11 = textResource13;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q9, 0, i29, 196602);
                    c28655q2 = c28655q9;
                    if (textResource7 == null) {
                        c28655q2.m87150e0(-877241154);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-877241153);
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
                        c28655q2.m87163l(interfaceC4339a4);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        c0209i7 = c0209i6;
                    } else {
                        c0209i7 = c0209i6;
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q2, 48);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    TextResource textResource14 = textResource7;
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a4);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                    C28655q c28655q10 = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q10, 0, i29, 196606);
                    c28655q3 = c28655q10;
                    c28655q3.m87173q(true);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q3, 0);
                    iHashCode7 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N7);
                    if (textResource10 == null) {
                        c28655q3.m87150e0(-40407162);
                        z18 = false;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(-40407161);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource10, c28655q3, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q3, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q3, i27).getB3().getStyle(), c38072d.m121949b(c28655q3, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q3, 0, i29, 196606);
                        z18 = false;
                        c28655q4.m87173q(false);
                    }
                    if (str4 == null) {
                        c28655q4 = c28655q3;
                        c28655q5 = c28655q4;
                        c28655q5 = c28655q3;
                        c28655q5.m87150e0(-39835212);
                        c28655q5.m87173q(z18);
                        str5 = str4;
                        c28655q6 = c28655q5;
                        z19 = z18;
                    } else {
                        c28655q4 = c28655q3;
                        c28655q5 = c28655q4;
                        c28655q5 = c28655q3;
                        c28655q5.m87150e0(-39835211);
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f15, c2314t));
                        C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q5, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q5, i27).getB3().getStyle(), c38072d.m121949b(c28655q5, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                        C28655q c28655q11 = c28655q5;
                        String str6 = str4;
                        AbstractC30795n.m94707h(str6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q11, 0, i29, 196606);
                        str5 = str6;
                        C28655q c28655q12 = c28655q11;
                        z19 = false;
                        c28655q12.m87173q(false);
                        c28655q6 = c28655q12;
                    }
                    AbstractC2875y.m8286B(c28655q6, true, true, true, true);
                    c1100b = C1100b.f4583a;
                    if (z16) {
                        c28655q6.m87150e0(804610434);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(7 * f13, AbstractC31061c.m95629e(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), -(f14 * f13), (z19 ? 1.0f : 0.0f) * f13), f17, f13, j7));
                        c2307m3 = c2307m2;
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, z19);
                        iHashCode9 = Long.hashCode(c28655q6.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q6.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q6, modifierM3419p);
                        c28655q6.m87158i0();
                        f19 = f13;
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(interfaceC4339a4);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode9))) {
                            AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N8);
                        C28655q c28655q13 = c28655q6;
                        c1100b2 = c1100b;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q6, 6), null, null, C17919x.f69625b, c28655q13, 3120, 4);
                        C28655q c28655q14 = c28655q13;
                        c28655q14.m87173q(true);
                        r14 = 0;
                        c28655q14.m87173q(false);
                        c28655q7 = c28655q14;
                    } else {
                        c1100b2 = c1100b;
                        c2307m3 = c2307m2;
                        f19 = f13;
                        c28655q6.m87150e0(805170046);
                        c28655q6.m87173q(z19);
                    }
                    if (textResource11 == null) {
                        c28655q7 = c28655q6;
                        r14 = z19;
                        c28655q7.m87150e0(805204734);
                        c28655q7.m87173q(r14);
                        textResource12 = textResource11;
                        z24 = true;
                        c28655q8 = c28655q7;
                    } else {
                        c28655q7 = c28655q6;
                        r14 = z19;
                        c28655q7.m87150e0(805204735);
                        float f26 = f14 * f19;
                        Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t, c2307m), 6 * f19, ((float) r14) * f19), AbstractC15673b0.m43981E0(), AbstractC33253j.m105489e(f26), 0.0f, 4);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, r14);
                        iHashCode8 = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q7.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q7, modifierM3357b);
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(interfaceC4339a4);
                        } else {
                            c28655q7.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m9);
                        if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode8))) {
                            AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N9);
                        textResource12 = textResource11;
                        C28655q c28655q15 = c28655q7;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q7, i28), AbstractC1099a.m3394p(f26, c2314t), c38072d.m121949b(c28655q7, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, i27).getH6(), null, c28655q15, 48, i29, 196600);
                        C28655q c28655q16 = c28655q15;
                        z24 = true;
                        c28655q16.m87173q(true);
                        c28655q16.m87173q(false);
                        c28655q8 = c28655q16;
                    }
                    c28655q8.m87173q(z24);
                    z15 = z16;
                    interfaceC4339a2 = interfaceC4339a5;
                    str3 = str5;
                    textResource5 = textResource12;
                    textResource4 = textResource14;
                    textResource6 = textResource10;
                    c28655q = c28655q8;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N);
                f13 = 4;
                Modifier modifierM3405b2 = AbstractC1102d.m3405b(c2314t, 0.0f, 30 * f13, 1);
                if ((i26 & 29360128) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q9.m87133R();
                if (z17) {
                    objM87133R = new C31918g(interfaceC4339a3, 14);
                    c28655q9.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 14);
                    c28655q9.m87172p0(objM87133R);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3405b2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                f14 = 1;
                float f27 = 8;
                f15 = f14 * f27;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifierM3362g2, 0.0f, f15, 1));
                c38072d = C38072d.f163053a;
                i27 = C38072d.f163054b;
                float f28 = 3 * f13;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3409f2, c38072d.m121949b(c28655q9, i27).getWhite10(), AbstractC33253j.m105489e(f28));
                if (z16) {
                    f16 = ((float) 0.5d) * f13;
                } else {
                    f16 = Float.NaN;
                }
                j7 = C17919x.f69629f;
                Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM3358c2, f16, j7, AbstractC33253j.m105489e(f28));
                c2307m2 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q9.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q9, modifierM44455h2);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q9.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N10);
                f17 = 2;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f17 * f27, c2314t);
                C2306l c2306l2 = C2299e.f9108K;
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q9, 48);
                iHashCode3 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q9.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q9, modifierM3394p2);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N11);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f18, true);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q9, 54);
                iHashCode4 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q9.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q9, layoutWeightElement3);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m12);
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N12);
                i28 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(optionTitle, c28655q9, (i26 & 14) | i28);
                C2886a c2886aM8436q2 = c38072d.m121952e(c28655q9, i27).getH3();
                long jM125430y2 = c38072d.m121949b(c28655q9, i27).getBrandWhite();
                i29 = C2886a.f11498d << 18;
                c0209i6 = c0209i5;
                textResource10 = textResource9;
                textResource11 = textResource13;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q9, 0, i29, 196602);
                c28655q2 = c28655q9;
                if (textResource7 == null) {
                    c28655q2.m87150e0(-877241154);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-877241153);
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
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a4);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    c0209i7 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
                } else {
                    c0209i7 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N13);
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9109L, c28655q2, 48);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                TextResource textResource15 = textResource7;
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a4);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N14);
                C28655q c28655q17 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q17, 0, i29, 196606);
                c28655q3 = c28655q17;
                c28655q3.m87173q(true);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q3, 0);
                iHashCode7 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, c2314t);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m15);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N15);
                if (textResource10 == null) {
                    c28655q3.m87150e0(-40407162);
                    z18 = false;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-40407161);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource10, c28655q3, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q3, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q3, i27).getB3().getStyle(), c38072d.m121949b(c28655q3, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q3, 0, i29, 196606);
                    z18 = false;
                    c28655q4.m87173q(false);
                }
                if (str4 == null) {
                    c28655q4 = c28655q3;
                    c28655q5 = c28655q4;
                    c28655q5 = c28655q3;
                    c28655q5.m87150e0(-39835212);
                    c28655q5.m87173q(z18);
                    str5 = str4;
                    c28655q6 = c28655q5;
                    z19 = z18;
                } else {
                    c28655q4 = c28655q3;
                    c28655q5 = c28655q4;
                    c28655q5 = c28655q3;
                    c28655q5.m87150e0(-39835211);
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f15, c2314t));
                    C2886a c2886aM8397c2 = C2886a.m8397c(c38072d.m121952e(c28655q5, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q5, i27).getB3().getStyle(), c38072d.m121949b(c28655q5, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                    C28655q c28655q18 = c28655q5;
                    String str7 = str4;
                    AbstractC30795n.m94707h(str7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c2, null, c28655q18, 0, i29, 196606);
                    str5 = str7;
                    C28655q c28655q19 = c28655q18;
                    z19 = false;
                    c28655q19.m87173q(false);
                    c28655q6 = c28655q19;
                }
                AbstractC2875y.m8286B(c28655q6, true, true, true, true);
                c1100b = C1100b.f4583a;
                if (z16) {
                    c28655q6.m87150e0(804610434);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(7 * f13, AbstractC31061c.m95629e(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), -(f14 * f13), (z19 ? 1.0f : 0.0f) * f13), f17, f13, j7));
                    c2307m3 = c2307m2;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, z19);
                    iHashCode9 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q6.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q6, modifierM3419p2);
                    c28655q6.m87158i0();
                    f19 = f13;
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(interfaceC4339a4);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m16);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N16);
                    C28655q c28655q110 = c28655q6;
                    c1100b2 = c1100b;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q6, 6), null, null, C17919x.f69625b, c28655q110, 3120, 4);
                    C28655q c28655q111 = c28655q110;
                    c28655q111.m87173q(true);
                    r14 = 0;
                    c28655q111.m87173q(false);
                    c28655q7 = c28655q111;
                } else {
                    c1100b2 = c1100b;
                    c2307m3 = c2307m2;
                    f19 = f13;
                    c28655q6.m87150e0(805170046);
                    c28655q6.m87173q(z19);
                }
                if (textResource11 == null) {
                    c28655q7 = c28655q6;
                    r14 = z19;
                    c28655q7.m87150e0(805204734);
                    c28655q7.m87173q(r14);
                    textResource12 = textResource11;
                    z24 = true;
                    c28655q8 = c28655q7;
                } else {
                    c28655q7 = c28655q6;
                    r14 = z19;
                    c28655q7.m87150e0(805204735);
                    float f29 = f14 * f19;
                    Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t, c2307m), 6 * f19, ((float) r14) * f19), AbstractC15673b0.m43981E0(), AbstractC33253j.m105489e(f29), 0.0f, 4);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m3, r14);
                    iHashCode8 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q7.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q7, modifierM3357b2);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(interfaceC4339a4);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m17);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N17);
                    textResource12 = textResource11;
                    C28655q c28655q112 = c28655q7;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q7, i28), AbstractC1099a.m3394p(f29, c2314t), c38072d.m121949b(c28655q7, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, i27).getH6(), null, c28655q112, 48, i29, 196600);
                    C28655q c28655q113 = c28655q112;
                    z24 = true;
                    c28655q113.m87173q(true);
                    c28655q113.m87173q(false);
                    c28655q8 = c28655q113;
                }
                c28655q8.m87173q(z24);
                z15 = z16;
                interfaceC4339a2 = interfaceC4339a6;
                str3 = str5;
                textResource5 = textResource12;
                textResource4 = textResource15;
                textResource6 = textResource10;
                c28655q = c28655q8;
            } else {
                C28655q c28655q20 = c28655q9;
                c28655q20.m87138X();
                textResource4 = textResource;
                textResource5 = textResource13;
                z15 = z13;
                str3 = str2;
                textResource6 = textResource2;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q20;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35821m(optionTitle, textResource4, optionPrice, textResource6, str3, textResource5, z15, interfaceC4339a2, i13, i14, 1);
            }
        }
        i15 |= 24576;
        str2 = str;
        i16 = i14 & 32;
        i17 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i = c28655q9.m87153g(textResource13);
            } else {
                zM87157i = c28655q9.m87157i(textResource13);
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
                if (c28655q9.m87155h(z13)) {
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
            if (c28655q9.m87157i(interfaceC4339a)) {
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
        if (c28655q9.m87135U(i15 & 1, z14)) {
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
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i16 != 0) {
                textResource13 = null;
            }
            if (i18 != 0) {
                z13 = false;
            }
            obj = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q9.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C35652d(17);
                    c28655q9.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q9.m87165m();
            c2314t = C2314t.f9131w;
            i26 = i15;
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q9, c2314t);
            InterfaceC0221l.f734a.getClass();
            z16 = z13;
            interfaceC4339a4 = C0217k.f724b;
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a4);
            } else {
                c28655q9.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d8);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m18);
            c0209i3 = C0217k.f732j;
            if (c28655q9.f115903S) {
                textResource9 = textResource8;
                if (!AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N18);
                f13 = 4;
                Modifier modifierM3405b3 = AbstractC1102d.m3405b(c2314t, 0.0f, 30 * f13, 1);
                if ((i26 & 29360128) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q9.m87133R();
                if (z17) {
                    objM87133R = new C31918g(interfaceC4339a3, 14);
                    c28655q9.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 14);
                    c28655q9.m87172p0(objM87133R);
                }
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3405b3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                f14 = 1;
                float f210 = 8;
                f15 = f14 * f210;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifierM3362g3, 0.0f, f15, 1));
                c38072d = C38072d.f163053a;
                i27 = C38072d.f163054b;
                float f211 = 3 * f13;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM3409f3, c38072d.m121949b(c28655q9, i27).getWhite10(), AbstractC33253j.m105489e(f211));
                if (z16) {
                    f16 = ((float) 0.5d) * f13;
                } else {
                    f16 = Float.NaN;
                }
                j7 = C17919x.f69629f;
                Modifier modifierM44455h3 = AbstractC15751g.m44455h(modifierM3358c3, f16, j7, AbstractC33253j.m105489e(f211));
                c2307m2 = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q9.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q9, modifierM44455h3);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q9.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N19);
                f17 = 2;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f17 * f210, c2314t);
                C2306l c2306l3 = C2299e.f9108K;
                C22949e c22949e3 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e3, c2306l3, c28655q9, 48);
                iHashCode3 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q9.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q9, modifierM3394p3);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m110);
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N110);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f18, true);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q9, 54);
                iHashCode4 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q9.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q9, layoutWeightElement5);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(interfaceC4339a4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m111);
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N111);
                i28 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(optionTitle, c28655q9, (i26 & 14) | i28);
                C2886a c2886aM8436q3 = c38072d.m121952e(c28655q9, i27).getH3();
                long jM125430y3 = c38072d.m121949b(c28655q9, i27).getBrandWhite();
                i29 = C2886a.f11498d << 18;
                c0209i6 = c0209i5;
                textResource10 = textResource9;
                textResource11 = textResource13;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q3, null, c28655q9, 0, i29, 196602);
                c28655q2 = c28655q9;
                if (textResource7 == null) {
                    c28655q2.m87150e0(-877241154);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-877241153);
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
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a4);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m112);
                if (c28655q2.f115903S) {
                    c0209i7 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
                } else {
                    c0209i7 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N112);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e3, C2299e.f9109L, c28655q2, 48);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                TextResource textResource16 = textResource7;
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a4);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                C28655q c28655q114 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q114, 0, i29, 196606);
                c28655q3 = c28655q114;
                c28655q3.m87173q(true);
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e3, C2299e.f9107J, c28655q3, 0);
                iHashCode7 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q3.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q3, c2314t);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m114);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N114);
                if (textResource10 == null) {
                    c28655q3.m87150e0(-40407162);
                    z18 = false;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-40407161);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource10, c28655q3, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q3, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q3, i27).getB3().getStyle(), c38072d.m121949b(c28655q3, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q3, 0, i29, 196606);
                    z18 = false;
                    c28655q4.m87173q(false);
                }
                if (str4 == null) {
                    c28655q4 = c28655q3;
                    c28655q5 = c28655q4;
                    c28655q5 = c28655q3;
                    c28655q5.m87150e0(-39835212);
                    c28655q5.m87173q(z18);
                    str5 = str4;
                    c28655q6 = c28655q5;
                    z19 = z18;
                } else {
                    c28655q4 = c28655q3;
                    c28655q5 = c28655q4;
                    c28655q5 = c28655q3;
                    c28655q5.m87150e0(-39835211);
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f15, c2314t));
                    C2886a c2886aM8397c3 = C2886a.m8397c(c38072d.m121952e(c28655q5, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q5, i27).getB3().getStyle(), c38072d.m121949b(c28655q5, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                    C28655q c28655q115 = c28655q5;
                    String str8 = str4;
                    AbstractC30795n.m94707h(str8, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c3, null, c28655q115, 0, i29, 196606);
                    str5 = str8;
                    C28655q c28655q116 = c28655q115;
                    z19 = false;
                    c28655q116.m87173q(false);
                    c28655q6 = c28655q116;
                }
                AbstractC2875y.m8286B(c28655q6, true, true, true, true);
                c1100b = C1100b.f4583a;
                if (z16) {
                    c28655q6.m87150e0(804610434);
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(7 * f13, AbstractC31061c.m95629e(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), -(f14 * f13), (z19 ? 1.0f : 0.0f) * f13), f17, f13, j7));
                    c2307m3 = c2307m2;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m3, z19);
                    iHashCode9 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q6.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q6, modifierM3419p3);
                    c28655q6.m87158i0();
                    f19 = f13;
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(interfaceC4339a4);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m115);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N115);
                    C28655q c28655q117 = c28655q6;
                    c1100b2 = c1100b;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q6, 6), null, null, C17919x.f69625b, c28655q117, 3120, 4);
                    C28655q c28655q118 = c28655q117;
                    c28655q118.m87173q(true);
                    r14 = 0;
                    c28655q118.m87173q(false);
                    c28655q7 = c28655q118;
                } else {
                    c1100b2 = c1100b;
                    c2307m3 = c2307m2;
                    f19 = f13;
                    c28655q6.m87150e0(805170046);
                    c28655q6.m87173q(z19);
                }
                if (textResource11 == null) {
                    c28655q7 = c28655q6;
                    r14 = z19;
                    c28655q7.m87150e0(805204734);
                    c28655q7.m87173q(r14);
                    textResource12 = textResource11;
                    z24 = true;
                    c28655q8 = c28655q7;
                } else {
                    c28655q7 = c28655q6;
                    r14 = z19;
                    c28655q7.m87150e0(805204735);
                    float f212 = f14 * f19;
                    Modifier modifierM3357b3 = AbstractC1092a.m3357b(AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t, c2307m), 6 * f19, ((float) r14) * f19), AbstractC15673b0.m43981E0(), AbstractC33253j.m105489e(f212), 0.0f, 4);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m3, r14);
                    iHashCode8 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q7.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q7, modifierM3357b3);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(interfaceC4339a4);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m116);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N116);
                    textResource12 = textResource11;
                    C28655q c28655q119 = c28655q7;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q7, i28), AbstractC1099a.m3394p(f212, c2314t), c38072d.m121949b(c28655q7, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, i27).getH6(), null, c28655q119, 48, i29, 196600);
                    C28655q c28655q1110 = c28655q119;
                    z24 = true;
                    c28655q1110.m87173q(true);
                    c28655q1110.m87173q(false);
                    c28655q8 = c28655q1110;
                }
                c28655q8.m87173q(z24);
                z15 = z16;
                interfaceC4339a2 = interfaceC4339a7;
                str3 = str5;
                textResource5 = textResource12;
                textResource4 = textResource16;
                textResource6 = textResource10;
                c28655q = c28655q8;
            } else {
                textResource9 = textResource8;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N18);
            f13 = 4;
            Modifier modifierM3405b4 = AbstractC1102d.m3405b(c2314t, 0.0f, 30 * f13, 1);
            if ((i26 & 29360128) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q9.m87133R();
            if (z17) {
                objM87133R = new C31918g(interfaceC4339a3, 14);
                c28655q9.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a3, 14);
                c28655q9.m87172p0(objM87133R);
            }
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3405b4, false, null, null, (InterfaceC4339a) objM87133R, 15);
            f14 = 1;
            float f213 = 8;
            f15 = f14 * f213;
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifierM3362g4, 0.0f, f15, 1));
            c38072d = C38072d.f163053a;
            i27 = C38072d.f163054b;
            float f214 = 3 * f13;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM3409f4, c38072d.m121949b(c28655q9, i27).getWhite10(), AbstractC33253j.m105489e(f214));
            if (z16) {
                f16 = ((float) 0.5d) * f13;
            } else {
                f16 = Float.NaN;
            }
            j7 = C17919x.f69629f;
            Modifier modifierM44455h4 = AbstractC15751g.m44455h(modifierM3358c4, f16, j7, AbstractC33253j.m105489e(f214));
            c2307m2 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode2 = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q9.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q9, modifierM44455h4);
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a4);
            } else {
                c28655q9.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q9, c0209i, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m117);
            if (c28655q9.f115903S) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N117);
            f17 = 2;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f17 * f213, c2314t);
            C2306l c2306l4 = C2299e.f9108K;
            C22949e c22949e4 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e4, c2306l4, c28655q9, 48);
            iHashCode3 = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q9.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q9, modifierM3394p4);
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a4);
            } else {
                c28655q9.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q9, c0209i, c22994r1M66759a10);
            AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m118);
            if (c28655q9.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N118);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f18, true);
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q9, 54);
            iHashCode4 = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q9.m87165m();
            Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q9, layoutWeightElement7);
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a4);
            } else {
                c28655q9.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q9, c0209i, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC28653p1M87165m119);
            if (c28655q9.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q9, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q9, c0209i4, modifierM118962N119);
            i28 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(optionTitle, c28655q9, (i26 & 14) | i28);
            C2886a c2886aM8436q4 = c38072d.m121952e(c28655q9, i27).getH3();
            long jM125430y4 = c38072d.m121949b(c28655q9, i27).getBrandWhite();
            i29 = C2886a.f11498d << 18;
            c0209i6 = c0209i5;
            textResource10 = textResource9;
            textResource11 = textResource13;
            AbstractC30795n.m94707h(strM21274h4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q4, null, c28655q9, 0, i29, 196602);
            c28655q2 = c28655q9;
            if (textResource7 == null) {
                c28655q2.m87150e0(-877241154);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-877241153);
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
            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a4);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1110);
            if (c28655q2.f115903S) {
                c0209i7 = c0209i6;
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
            } else {
                c0209i7 = c0209i6;
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1110);
            C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e4, C2299e.f9109L, c28655q2, 48);
            iHashCode6 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
            TextResource textResource17 = textResource7;
            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a4);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a11);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111);
            C28655q c28655q1111 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(optionPrice, c28655q2, ((i26 >> 6) & 14) | i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i27).getN4(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i27).getN4().getStyle(), c38072d.m121949b(c28655q2, i27).getBrandWhite(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q1111, 0, i29, 196606);
            c28655q3 = c28655q1111;
            c28655q3.m87173q(true);
            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e4, C2299e.f9107J, c28655q3, 0);
            iHashCode7 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q3.m87165m();
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a4);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a12);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m1112);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode7, c28655q3, iHashCode7, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1112);
            if (textResource10 == null) {
                c28655q3.m87150e0(-40407162);
                z18 = false;
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-40407161);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource10, c28655q3, i28), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q3, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q3, i27).getB3().getStyle(), c38072d.m121949b(c28655q3, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q3, 0, i29, 196606);
                z18 = false;
                c28655q4.m87173q(false);
            }
            if (str4 == null) {
                c28655q4 = c28655q3;
                c28655q5 = c28655q4;
                c28655q5 = c28655q3;
                c28655q5.m87150e0(-39835212);
                c28655q5.m87173q(z18);
                str5 = str4;
                c28655q6 = c28655q5;
                z19 = z18;
            } else {
                c28655q4 = c28655q3;
                c28655q5 = c28655q4;
                c28655q5 = c28655q3;
                c28655q5.m87150e0(-39835211);
                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f15, c2314t));
                C2886a c2886aM8397c4 = C2886a.m8397c(c38072d.m121952e(c28655q5, i27).getB3(), C23285v0.m67364b(c38072d.m121952e(c28655q5, i27).getB3().getStyle(), c38072d.m121949b(c28655q5, i27).getGreyL1(), 0L, null, null, 0L, 3, 0L, null, null, 16740350), null, 2, null);
                C28655q c28655q1112 = c28655q5;
                String str9 = str4;
                AbstractC30795n.m94707h(str9, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c4, null, c28655q1112, 0, i29, 196606);
                str5 = str9;
                C28655q c28655q1113 = c28655q1112;
                z19 = false;
                c28655q1113.m87173q(false);
                c28655q6 = c28655q1113;
            }
            AbstractC2875y.m8286B(c28655q6, true, true, true, true);
            c1100b = C1100b.f4583a;
            if (z16) {
                c28655q6.m87150e0(804610434);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(7 * f13, AbstractC31061c.m95629e(AbstractC1099a.m3391m(c1100b.mo3400a(c2314t, C2299e.f9116y), -(f14 * f13), (z19 ? 1.0f : 0.0f) * f13), f17, f13, j7));
                c2307m3 = c2307m2;
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m3, z19);
                iHashCode9 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q6.m87165m();
                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q6, modifierM3419p4);
                c28655q6.m87158i0();
                f19 = f13;
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(interfaceC4339a4);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m1113);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N1113);
                C28655q c28655q1114 = c28655q6;
                c1100b2 = c1100b;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SELECTED_CHECK.toWhoopIcon(), c28655q6, 6), null, null, C17919x.f69625b, c28655q1114, 3120, 4);
                C28655q c28655q1115 = c28655q1114;
                c28655q1115.m87173q(true);
                r14 = 0;
                c28655q1115.m87173q(false);
                c28655q7 = c28655q1115;
            } else {
                c1100b2 = c1100b;
                c2307m3 = c2307m2;
                f19 = f13;
                c28655q6.m87150e0(805170046);
                c28655q6.m87173q(z19);
            }
            if (textResource11 == null) {
                c28655q7 = c28655q6;
                r14 = z19;
                c28655q7.m87150e0(805204734);
                c28655q7.m87173q(r14);
                textResource12 = textResource11;
                z24 = true;
                c28655q8 = c28655q7;
            } else {
                c28655q7 = c28655q6;
                r14 = z19;
                c28655q7.m87150e0(805204735);
                float f215 = f14 * f19;
                Modifier modifierM3357b4 = AbstractC1092a.m3357b(AbstractC1099a.m3391m(c1100b2.mo3400a(c2314t, c2307m), 6 * f19, ((float) r14) * f19), AbstractC15673b0.m43981E0(), AbstractC33253j.m105489e(f215), 0.0f, 4);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m3, r14);
                iHashCode8 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q7.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q7, modifierM3357b4);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a4);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m1114);
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode8, c28655q7, iHashCode8, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1114);
                textResource12 = textResource11;
                C28655q c28655q1116 = c28655q7;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource12, c28655q7, i28), AbstractC1099a.m3394p(f215, c2314t), c38072d.m121949b(c28655q7, i27).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q7, i27).getH6(), null, c28655q1116, 48, i29, 196600);
                C28655q c28655q1117 = c28655q1116;
                z24 = true;
                c28655q1117.m87173q(true);
                c28655q1117.m87173q(false);
                c28655q8 = c28655q1117;
            }
            c28655q8.m87173q(z24);
            z15 = z16;
            interfaceC4339a2 = interfaceC4339a8;
            str3 = str5;
            textResource5 = textResource12;
            textResource4 = textResource17;
            textResource6 = textResource10;
            c28655q = c28655q8;
        } else {
            C28655q c28655q21 = c28655q9;
            c28655q21.m87138X();
            textResource4 = textResource;
            textResource5 = textResource13;
            z15 = z13;
            str3 = str2;
            textResource6 = textResource2;
            interfaceC4339a2 = interfaceC4339a;
            c28655q = c28655q21;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35821m(optionTitle, textResource4, optionPrice, textResource6, str3, textResource5, z15, interfaceC4339a2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m113709g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m113710h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m113711i(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, TextResource textResource5, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m113708f(textResource, textResource2, textResource3, textResource4, str, textResource5, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: j */
    public static final void m113712j(C35830v viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        Object next;
        Object next2;
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-368346412);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14 & 112;
            boolean zM87157i = c28655q.m87157i(viewState) | (i15 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v1) {
                objM87133R = new a(viewState, onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, c2314t));
            AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC38021a.f162855a);
            int i16 = AbstractC22403o.a.f87639c;
            C28676v0 c28676v2 = c28676v1;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar, null, null, c28655q, i16, 3), null, modifierM44028b0, null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i17).getTransparent(), AbstractC17918w0.f69621a)), f13 * f14, 6 * f14);
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            TextResource textResourceM113718e = viewState.getPlanPickerTitle();
            int i18 = TextResource.$stable;
            int i19 = i15;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM113718e, c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261626);
            float f15 = 4;
            float f16 = f13 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            float f17 = f15 * f15;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC38021a.f162859e), null, null, c28655q, i16, 3), null, AbstractC1102d.m3411h(f17, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getPlanPickerSubtitle(), c28655q, i18), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i17).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i17), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, 0L, 5, 0L, null, null, 16744446), null, 2, null), null, c28655q, 0, C2886a.f11498d << 18, 196606);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
            char c3 = '0';
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            Iterator<T> it = viewState.m113719f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C35827s) next).m113699n());
            C35827s c35827s = (C35827s) next;
            CommitmentType commitmentType = c35827s != null ? c35827s.getCommitmentType() : null;
            c28655q.m87150e0(-932945002);
            Iterator it3 = viewState.m113719f().iterator();
            int i24 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                int i25 = i24 + 1;
                if (i24 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C35827s c35827s2 = (C35827s) next3;
                TextResource textResourceM113696k = c35827s2.getOptionTitle();
                TextResource textResourceM113695j = c35827s2.getOptionSubtitle();
                TextResource textResourceM113692g = c35827s2.getOptionPrice();
                TextResource textResourceM113693h = c35827s2.getOptionPriceSubtitle();
                String strM113694i = c35827s2.getOptionPriceSubtitleStrikeout();
                TextResource textResourceM113697l = c35827s2.getTag();
                boolean zM113699n = c35827s2.m113699n();
                char c7 = c3;
                int i26 = i19;
                boolean zM87157i2 = c28655q.m87157i(c35827s2) | c28655q.m87149e(commitmentType == null ? -1 : commitmentType.ordinal()) | (i26 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v0 = c28676v2;
                } else {
                    c28676v0 = c28676v2;
                    if (objM87133R2 == c28676v0) {
                    }
                    int i27 = TextResource.$stable;
                    i19 = i26;
                    c28676v2 = c28676v0;
                    C28655q c28655q2 = c28655q;
                    m113708f(textResourceM113696k, textResourceM113695j, textResourceM113692g, textResourceM113693h, strM113694i, textResourceM113697l, zM113699n, (InterfaceC4339a) objM87133R2, c28655q2, (i27 << 15) | (i27 << 3) | i27 | (i27 << 6) | (i27 << 9), 0);
                    c28655q = c28655q2;
                    i24 = i25;
                    f15 = f15;
                    it3 = it3;
                    c3 = c7;
                }
                objM87133R2 = new C31324k(c35827s2, commitmentType, onViewEvent, 15);
                c28655q.m87172p0(objM87133R2);
                int i28 = TextResource.$stable;
                i19 = i26;
                c28676v2 = c28676v0;
                C28655q c28655q3 = c28655q;
                m113708f(textResourceM113696k, textResourceM113695j, textResourceM113692g, textResourceM113693h, strM113694i, textResourceM113697l, zM113699n, (InterfaceC4339a) objM87133R2, c28655q3, (i28 << 15) | (i28 << 3) | i28 | (i28 << 6) | (i28 << 9), 0);
                c28655q = c28655q3;
                i24 = i25;
                f15 = f15;
                it3 = it3;
                c3 = c7;
            }
            float f18 = f15;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            Iterator<T> it4 = viewState.m113719f().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!((C35827s) next2).m113699n());
            C35827s c35827s3 = (C35827s) next2;
            String strM113690e = c35827s3 != null ? c35827s3.getDisclaimer() : null;
            if (strM113690e == null) {
                c28655q.m87150e0(721755669);
                c28655q.m87173q(false);
                function1 = onViewEvent;
            } else {
                c28655q.m87150e0(721755670);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f18 * f14, 1);
                C28655q c28655q4 = c28655q;
                function1 = onViewEvent;
                C21054m c21054mM58880a = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q4, 0, C21053l.f79835b << 15, 32767);
                C38072d c38072d2 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                AbstractC21048g.m58807M(strM113690e, modifierM3396r, false, C21054m.m58881b(c21054mM58880a, C23285v0.m67364b(c38072d2.m121952e(c28655q4, i29).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d2.m121949b(c28655q4, i29).getWhite50(), c38072d2.m121949b(c28655q4, i29).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q4, (C21054m.f79836p << 9) | 48, 500);
                c28655q = c28655q4;
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m113713k(C35827s c35827s, CommitmentType commitmentType, Function1 function1) {
        if (c35827s.getCommitmentType() != commitmentType) {
            function1.invoke(new InterfaceC21413a.f0(c35827s.getCommitmentType()));
            function1.invoke(new InterfaceC17002b.i("upcycle_plan_picker", "toggle", "plan", c35827s.getTrackingLabel(), "upcycle", AbstractC31061c.m95645u("membership", c35827s.getMembershipTier())));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m113714l(C35830v c35830v, Function1 function1, int i13, Composer composer, int i14) {
        m113712j(c35830v, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
