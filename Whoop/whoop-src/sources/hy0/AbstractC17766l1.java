package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6492c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15050j4;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
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
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.l1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "label", "text", "hintText", "errorMessage", "", "maxCharacterCount", "maxLines", "", "isError", "isEnabled", "readOnly", "Lb91/a;", "errorTextStyle", "refreshText", "Lkotlin/Function1;", "", "Ll83/a0;", "onTextChanged", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17766l1 {

    /* JADX INFO: renamed from: hy0.l1$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.atom.TextAreaKt$TextArea$1$1", m100430f = "TextArea.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f69088w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f69089x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f69090y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f69091z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC28601c1 interfaceC28601c1, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f69089x = z4;
            this.f69090y = interfaceC28601c1;
            this.f69091z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f69089x, this.f69090y, this.f69091z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f69088w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f69089x) {
                this.f69090y.setValue(this.f69091z);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:106:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x015c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x020b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0254  */
    /* JADX WARN: Code duplicated, block: B:170:0x0269  */
    /* JADX WARN: Code duplicated, block: B:171:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x0282  */
    /* JADX WARN: Code duplicated, block: B:180:0x0295  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:188:0x0316  */
    /* JADX WARN: Code duplicated, block: B:189:0x031a  */
    /* JADX WARN: Code duplicated, block: B:192:0x032f  */
    /* JADX WARN: Code duplicated, block: B:194:0x033d  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:198:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:203:0x0406  */
    /* JADX WARN: Code duplicated, block: B:206:0x042f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0434  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:221:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:227:0x0536  */
    /* JADX WARN: Code duplicated, block: B:229:0x0587  */
    /* JADX WARN: Code duplicated, block: B:231:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:234:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0143  */
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
    /* JADX INFO: renamed from: e */
    public static final void m50964e(Modifier modifier, final TextResource label, final TextResource text, final TextResource hintText, final TextResource errorMessage, int i13, int i14, boolean z4, boolean z13, boolean z14, C2886a c2886a, boolean z15, Function1 onTextChanged, Composer composer, final int i15, final int i16, final int i17) {
        Modifier modifier2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z16;
        C28655q c28655q;
        Function1 function1;
        final int i29;
        final int i34;
        final boolean z17;
        final boolean z18;
        final C2886a c2886a2;
        final boolean z19;
        final Modifier modifier3;
        final boolean z24;
        C28677v1 c28677v1M87180u;
        int i35;
        C2314t c2314t;
        int i36;
        int i37;
        boolean z25;
        boolean z26;
        boolean z27;
        C2886a c2886aM8432m;
        boolean z28;
        int i38;
        C2886a c2886a3;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        String strM21274h;
        C38072d c38072d;
        int i39;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z37;
        boolean zM87153g;
        Object objM87133R2;
        boolean z38;
        int i44;
        boolean z39;
        long jM125416r;
        int i45;
        long jM125385c1;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        float f14;
        int iHashCode2;
        boolean zM87151f;
        Object objM87133R4;
        C28676v0 c28676v1;
        boolean z44;
        boolean z45;
        boolean z46;
        Object objM87133R5;
        C2886a c2886a4;
        int i46;
        boolean zM87157i;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(onTextChanged, "onTextChanged");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1982961640);
        int i47 = i17 & 1;
        if (i47 != 0) {
            i18 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i18 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87153g(label) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q2.m87153g(text) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= c28655q2.m87153g(hintText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i18 |= c28655q2.m87153g(errorMessage) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i48 = i17 & 32;
        if (i48 != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q2.m87149e(i13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i49 = i17 & 64;
        if (i49 != 0) {
            i18 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            i18 |= c28655q2.m87149e(i14) ? 1048576 : 524288;
        }
        int i54 = i17 & 128;
        if (i54 == 0) {
            if ((i15 & 12582912) == 0) {
                i18 |= c28655q2.m87155h(z4) ? 8388608 : 4194304;
            }
            i19 = i17 & 256;
            if (i19 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i24;
                }
                i25 = i17 & 512;
                if (i25 != 0) {
                    if ((i15 & 805306368) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i18 |= i26;
                    }
                    if ((i16 & 6) == 0) {
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 2;
                        } else {
                            if ((i16 & 8) == 0) {
                                zM87157i = c28655q2.m87153g(c2886a);
                            } else {
                                zM87157i = c28655q2.m87157i(c2886a);
                            }
                            if (zM87157i) {
                                i46 = 4;
                            } else {
                                i46 = 2;
                            }
                        }
                        i27 = i46 | i16;
                    } else {
                        i27 = i16;
                    }
                    i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    if (i28 != 0) {
                        if ((i16 & 48) == 0) {
                            i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                        }
                        if ((i16 & 384) == 0) {
                            i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                        }
                        if ((306783379 & i18) == 306783378 || (i27 & 147) != 146) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q2.m87135U(i18 & 1, z16)) {
                            c28655q2.m87140Z();
                            i35 = i15 & 1;
                            c2314t = C2314t.f9131w;
                            if (i35 != 0 || c28655q2.m87118C()) {
                                if (i47 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i48 != 0) {
                                    i36 = 100;
                                } else {
                                    i36 = i13;
                                }
                                if (i49 != 0) {
                                    i37 = 2;
                                } else {
                                    i37 = i14;
                                }
                                if (i54 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z4;
                                }
                                if (i19 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z13;
                                }
                                if (i25 != 0) {
                                    z27 = false;
                                } else {
                                    z27 = z14;
                                }
                                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                    i27 &= -15;
                                } else {
                                    c2886aM8432m = c2886a;
                                }
                                if (i28 != 0) {
                                    i38 = i27;
                                    c2886a3 = c2886aM8432m;
                                    z29 = z25;
                                    z34 = z26;
                                    z35 = z27;
                                    z28 = false;
                                } else {
                                    z28 = z15;
                                    i38 = i27;
                                    c2886a3 = c2886aM8432m;
                                    z29 = z25;
                                    z34 = z26;
                                    z35 = z27;
                                }
                            } else {
                                c28655q2.m87138X();
                                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i27 &= -15;
                                }
                                i36 = i13;
                                i37 = i14;
                                z34 = z13;
                                z35 = z14;
                                c2886a3 = c2886a;
                                z28 = z15;
                                i38 = i27;
                                z29 = z4;
                            }
                            c28655q2.m87175r();
                            z36 = z29;
                            strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                            c28655q2.m87150e0(1339360287);
                            c38072d = C38072d.f163053a;
                            i39 = i18;
                            float fM124805c = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                            c28655q2.m87173q(false);
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(strM21274h);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            int i55 = i37;
                            Boolean boolValueOf = Boolean.valueOf(z28);
                            if ((i38 & 112) == 32) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            zM87153g = z37 | c28655q2.m87153g(strM21274h);
                            objM87133R2 = c28655q2.m87133R();
                            if (!zM87153g || objM87133R2 == c28676v0) {
                                z38 = z28;
                                objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                z38 = z28;
                            }
                            AbstractC28683x.m87254h(boolValueOf, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                            if (z36) {
                                c28655q2.m87150e0(1339381962);
                                i44 = 6;
                                jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                                z39 = false;
                            } else {
                                i44 = 6;
                                z39 = false;
                                c28655q2.m87150e0(1339383295);
                                jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                            }
                            c28655q2.m87173q(z39);
                            long j7 = jM125416r;
                            boolean z47 = z38;
                            i45 = i38;
                            long jM125430y = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                            jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                                c28655q2.m87172p0(objM87133R3);
                            }
                            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier4 = modifier2;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            String upperCase = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            float f15 = 4;
                            f13 = 2 * f15;
                            f14 = 1 * f15;
                            AbstractC30795n.m94707h(upperCase, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c2.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                            c28655q = c28655q2;
                            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j7, AbstractC17918w0.f69621a);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                            c28655q.m87158i0();
                            boolean z48 = z34;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                            C23285v0 style = AbstractC2890e.m8450e().getB1().getStyle();
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "text area");
                            zM87151f = c28655q.m87151f(jM125430y) | c28655q.m87151f(jM125385c1);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87151f) {
                                c28676v1 = c28676v0;
                            } else {
                                c28676v1 = c28676v0;
                                if (objM87133R4 == c28676v1) {
                                }
                                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                                C15043i8 c15043i8 = C15043i8.f56313a;
                                C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                                String str = (String) interfaceC28601c1.getValue();
                                if ((i39 & 458752) == 131072) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                if ((i45 & 896) == 256) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                z46 = z44 | z45;
                                objM87133R5 = c28655q.m87133R();
                                if (!z46 || objM87133R5 == c28676v1) {
                                    i29 = i36;
                                    function1 = onTextChanged;
                                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    i29 = i36;
                                    function1 = onTextChanged;
                                }
                                int i56 = i39 >> 15;
                                boolean z49 = z35;
                                AbstractC15050j4.m43135a(str, (Function1) objM87133R5, modifierM118994r, z48, z49, style, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h, c28655q, (i56 & 7168) | 12582912 | (i56 & 57344), (i39 >> 21) & 14, 523072);
                                c28655q.m87173q(true);
                                if (z36) {
                                    c28655q.m87150e0(-1697416904);
                                    c2886a4 = c2886a3;
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                    c28655q.m87173q(false);
                                } else {
                                    c2886a4 = c2886a3;
                                    c28655q.m87150e0(-1697132448);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(true);
                                i34 = i55;
                                z19 = z47;
                                z17 = z36;
                                z24 = z49;
                                c2886a2 = c2886a4;
                                modifier3 = modifier4;
                                z18 = z48;
                            }
                            objM87133R4 = new C6492c(jM125430y, jM125385c1, interfaceC28601c2, 1);
                            c28655q.m87172p0(objM87133R4);
                            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                            C15043i8 c15043i9 = C15043i8.f56313a;
                            C15197y1 c15197y1M43130h2 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                            String str2 = (String) interfaceC28601c1.getValue();
                            if ((i39 & 458752) == 131072) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if ((i45 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z44 | z45;
                            objM87133R5 = c28655q.m87133R();
                            if (z46) {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i57 = i39 >> 15;
                            boolean z410 = z35;
                            AbstractC15050j4.m43135a(str2, (Function1) objM87133R5, modifierM118994r2, z48, z410, style, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h2, c28655q, (i57 & 7168) | 12582912 | (i57 & 57344), (i39 >> 21) & 14, 523072);
                            c28655q.m87173q(true);
                            if (z36) {
                                c28655q.m87150e0(-1697416904);
                                c2886a4 = c2886a3;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                c28655q.m87173q(false);
                            } else {
                                c2886a4 = c2886a3;
                                c28655q.m87150e0(-1697132448);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i34 = i55;
                            z19 = z47;
                            z17 = z36;
                            z24 = z410;
                            c2886a2 = c2886a4;
                            modifier3 = modifier4;
                            z18 = z48;
                        } else {
                            c28655q = c28655q2;
                            function1 = onTextChanged;
                            c28655q.m87138X();
                            i29 = i13;
                            i34 = i14;
                            z17 = z4;
                            z18 = z13;
                            c2886a2 = c2886a;
                            z19 = z15;
                            modifier3 = modifier2;
                            z24 = z14;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final Function1 function2 = function1;
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function2, i15, i16, i17, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i27 |= 48;
                    if ((i16 & 384) == 0) {
                        i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                    }
                    if ((306783379 & i18) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i35 = i15 & 1;
                        c2314t = C2314t.f9131w;
                        if (i35 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        }
                        c28655q2.m87175r();
                        z36 = z29;
                        strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                        c28655q2.m87150e0(1339360287);
                        c38072d = C38072d.f163053a;
                        i39 = i18;
                        float fM124805c2 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                        c28655q2.m87173q(false);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(strM21274h);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        int i58 = i37;
                        Boolean boolValueOf2 = Boolean.valueOf(z28);
                        if ((i38 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zM87153g = z37 | c28655q2.m87153g(strM21274h);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g) {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(boolValueOf2, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                        if (z36) {
                            c28655q2.m87150e0(1339381962);
                            i44 = 6;
                            jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                            z39 = false;
                        } else {
                            i44 = 6;
                            z39 = false;
                            c28655q2.m87150e0(1339383295);
                            jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                        }
                        c28655q2.m87173q(z39);
                        long j13 = jM125416r;
                        boolean z411 = z38;
                        i45 = i38;
                        long jM125430y2 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                        jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier5 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i5 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                        C0209i c0209i6 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                        String upperCase2 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        float f16 = 4;
                        f13 = 2 * f16;
                        f14 = 1 * f16;
                        AbstractC30795n.m94707h(upperCase2, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c3.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                        c28655q = c28655q2;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j13, AbstractC17918w0.f69621a);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                        c28655q.m87158i0();
                        boolean z412 = z34;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                        C23285v0 style2 = AbstractC2890e.m8450e().getB1().getStyle();
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "text area");
                        zM87151f = c28655q.m87151f(jM125430y2) | c28655q.m87151f(jM125385c1);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87151f) {
                            c28676v1 = c28676v0;
                            if (objM87133R4 == c28676v1) {
                            }
                            Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c2, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a2, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                            C15043i8 c15043i10 = C15043i8.f56313a;
                            C15197y1 c15197y1M43130h3 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                            String str3 = (String) interfaceC28601c1.getValue();
                            if ((i39 & 458752) == 131072) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if ((i45 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z44 | z45;
                            objM87133R5 = c28655q.m87133R();
                            if (z46) {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i59 = i39 >> 15;
                            boolean z413 = z35;
                            AbstractC15050j4.m43135a(str3, (Function1) objM87133R5, modifierM118994r3, z412, z413, style2, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h3, c28655q, (i59 & 7168) | 12582912 | (i59 & 57344), (i39 >> 21) & 14, 523072);
                            c28655q.m87173q(true);
                            if (z36) {
                                c28655q.m87150e0(-1697416904);
                                c2886a4 = c2886a3;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                c28655q.m87173q(false);
                            } else {
                                c2886a4 = c2886a3;
                                c28655q.m87150e0(-1697132448);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i34 = i58;
                            z19 = z411;
                            z17 = z36;
                            z24 = z413;
                            c2886a2 = c2886a4;
                            modifier3 = modifier5;
                            z18 = z412;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R4 = new C6492c(jM125430y2, jM125385c1, interfaceC28601c3, 1);
                        c28655q.m87172p0(objM87133R4);
                        Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c2, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a2, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i11 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h4 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str4 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i510 = i39 >> 15;
                        boolean z414 = z35;
                        AbstractC15050j4.m43135a(str4, (Function1) objM87133R5, modifierM118994r4, z412, z414, style2, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h4, c28655q, (i510 & 7168) | 12582912 | (i510 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i58;
                        z19 = z411;
                        z17 = z36;
                        z24 = z414;
                        c2886a2 = c2886a4;
                        modifier3 = modifier5;
                        z18 = z412;
                    } else {
                        c28655q = c28655q2;
                        function1 = onTextChanged;
                        c28655q.m87138X();
                        i29 = i13;
                        i34 = i14;
                        z17 = z4;
                        z18 = z13;
                        c2886a2 = c2886a;
                        z19 = z15;
                        modifier3 = modifier2;
                        z24 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Function1 function3 = function1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function3, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i18 |= 805306368;
                if ((i16 & 6) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 2;
                    } else {
                        if ((i16 & 8) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i46 = 4;
                        } else {
                            i46 = 2;
                        }
                    }
                    i27 = i46 | i16;
                } else {
                    i27 = i16;
                }
                i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i28 != 0) {
                    if ((i16 & 48) == 0) {
                        i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                    }
                    if ((i16 & 384) == 0) {
                        i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                    }
                    if ((306783379 & i18) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i35 = i15 & 1;
                        c2314t = C2314t.f9131w;
                        if (i35 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        }
                        c28655q2.m87175r();
                        z36 = z29;
                        strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                        c28655q2.m87150e0(1339360287);
                        c38072d = C38072d.f163053a;
                        i39 = i18;
                        float fM124805c3 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                        c28655q2.m87173q(false);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(strM21274h);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        int i511 = i37;
                        Boolean boolValueOf3 = Boolean.valueOf(z28);
                        if ((i38 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zM87153g = z37 | c28655q2.m87153g(strM21274h);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g) {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(boolValueOf3, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                        if (z36) {
                            c28655q2.m87150e0(1339381962);
                            i44 = 6;
                            jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                            z39 = false;
                        } else {
                            i44 = 6;
                            z39 = false;
                            c28655q2.m87150e0(1339383295);
                            jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                        }
                        c28655q2.m87173q(z39);
                        long j14 = jM125416r;
                        boolean z415 = z38;
                        i45 = i38;
                        long jM125430y3 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                        jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier6 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i8 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a3);
                        C0209i c0209i9 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N5);
                        String upperCase3 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                        float f17 = 4;
                        f13 = 2 * f17;
                        f14 = 1 * f17;
                        AbstractC30795n.m94707h(upperCase3, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c4.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                        c28655q = c28655q2;
                        Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j14, AbstractC17918w0.f69621a);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3358c3);
                        c28655q.m87158i0();
                        boolean z416 = z34;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                        C23285v0 style3 = AbstractC2890e.m8450e().getB1().getStyle();
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "text area");
                        zM87151f = c28655q.m87151f(jM125430y3) | c28655q.m87151f(jM125385c1);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87151f) {
                            c28676v1 = c28676v0;
                            if (objM87133R4 == c28676v1) {
                            }
                            Modifier modifierM118994r5 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c3, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a3, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                            C15043i8 c15043i12 = C15043i8.f56313a;
                            C15197y1 c15197y1M43130h5 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                            String str5 = (String) interfaceC28601c1.getValue();
                            if ((i39 & 458752) == 131072) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if ((i45 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z44 | z45;
                            objM87133R5 = c28655q.m87133R();
                            if (z46) {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i512 = i39 >> 15;
                            boolean z417 = z35;
                            AbstractC15050j4.m43135a(str5, (Function1) objM87133R5, modifierM118994r5, z416, z417, style3, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h5, c28655q, (i512 & 7168) | 12582912 | (i512 & 57344), (i39 >> 21) & 14, 523072);
                            c28655q.m87173q(true);
                            if (z36) {
                                c28655q.m87150e0(-1697416904);
                                c2886a4 = c2886a3;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                c28655q.m87173q(false);
                            } else {
                                c2886a4 = c2886a3;
                                c28655q.m87150e0(-1697132448);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i34 = i511;
                            z19 = z415;
                            z17 = z36;
                            z24 = z417;
                            c2886a2 = c2886a4;
                            modifier3 = modifier6;
                            z18 = z416;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R4 = new C6492c(jM125430y3, jM125385c1, interfaceC28601c4, 1);
                        c28655q.m87172p0(objM87133R4);
                        Modifier modifierM118994r6 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c3, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a3, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i13 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h6 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str6 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i513 = i39 >> 15;
                        boolean z418 = z35;
                        AbstractC15050j4.m43135a(str6, (Function1) objM87133R5, modifierM118994r6, z416, z418, style3, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h6, c28655q, (i513 & 7168) | 12582912 | (i513 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i511;
                        z19 = z415;
                        z17 = z36;
                        z24 = z418;
                        c2886a2 = c2886a4;
                        modifier3 = modifier6;
                        z18 = z416;
                    } else {
                        c28655q = c28655q2;
                        function1 = onTextChanged;
                        c28655q.m87138X();
                        i29 = i13;
                        i34 = i14;
                        z17 = z4;
                        z18 = z13;
                        c2886a2 = c2886a;
                        z19 = z15;
                        modifier3 = modifier2;
                        z24 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Function1 function4 = function1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function4, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i27 |= 48;
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c4 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i514 = i37;
                    Boolean boolValueOf4 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf4, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j15 = jM125416r;
                    boolean z419 = z38;
                    i45 = i38;
                    long jM125430y4 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier7 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i11 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a4);
                    C0209i c0209i12 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
                    String upperCase4 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                    float f18 = 4;
                    f13 = 2 * f18;
                    f14 = 1 * f18;
                    AbstractC30795n.m94707h(upperCase4, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c5.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j15, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3358c4);
                    c28655q.m87158i0();
                    boolean z4110 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                    C23285v0 style4 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y4) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r7 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c4, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a4, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i14 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h7 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str7 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i515 = i39 >> 15;
                        boolean z4111 = z35;
                        AbstractC15050j4.m43135a(str7, (Function1) objM87133R5, modifierM118994r7, z4110, z4111, style4, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h7, c28655q, (i515 & 7168) | 12582912 | (i515 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i514;
                        z19 = z419;
                        z17 = z36;
                        z24 = z4111;
                        c2886a2 = c2886a4;
                        modifier3 = modifier7;
                        z18 = z4110;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y4, jM125385c1, interfaceC28601c5, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r8 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c4, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a4, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i15 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h8 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str8 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i516 = i39 >> 15;
                    boolean z4112 = z35;
                    AbstractC15050j4.m43135a(str8, (Function1) objM87133R5, modifierM118994r8, z4110, z4112, style4, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h8, c28655q, (i516 & 7168) | 12582912 | (i516 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i514;
                    z19 = z419;
                    z17 = z36;
                    z24 = z4112;
                    c2886a2 = c2886a4;
                    modifier3 = modifier7;
                    z18 = z4110;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function5 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function5, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 100663296;
            i25 = i17 & 512;
            if (i25 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i16 & 6) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 2;
                    } else {
                        if ((i16 & 8) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i46 = 4;
                        } else {
                            i46 = 2;
                        }
                    }
                    i27 = i46 | i16;
                } else {
                    i27 = i16;
                }
                i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i28 != 0) {
                    if ((i16 & 48) == 0) {
                        i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                    }
                    if ((i16 & 384) == 0) {
                        i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                    }
                    if ((306783379 & i18) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i35 = i15 & 1;
                        c2314t = C2314t.f9131w;
                        if (i35 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        }
                        c28655q2.m87175r();
                        z36 = z29;
                        strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                        c28655q2.m87150e0(1339360287);
                        c38072d = C38072d.f163053a;
                        i39 = i18;
                        float fM124805c5 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                        c28655q2.m87173q(false);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(strM21274h);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        int i517 = i37;
                        Boolean boolValueOf5 = Boolean.valueOf(z28);
                        if ((i38 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zM87153g = z37 | c28655q2.m87153g(strM21274h);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g) {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(boolValueOf5, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                        if (z36) {
                            c28655q2.m87150e0(1339381962);
                            i44 = 6;
                            jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                            z39 = false;
                        } else {
                            i44 = 6;
                            z39 = false;
                            c28655q2.m87150e0(1339383295);
                            jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                        }
                        c28655q2.m87173q(z39);
                        long j16 = jM125416r;
                        boolean z4113 = z38;
                        i45 = i38;
                        long jM125430y5 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                        jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R3;
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier8 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i14 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a5);
                        C0209i c0209i15 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N9);
                        String upperCase5 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                        float f19 = 4;
                        f13 = 2 * f19;
                        f14 = 1 * f19;
                        AbstractC30795n.m94707h(upperCase5, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c6.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                        c28655q = c28655q2;
                        Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j16, AbstractC17918w0.f69621a);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3358c5);
                        c28655q.m87158i0();
                        boolean z4114 = z34;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                        C23285v0 style5 = AbstractC2890e.m8450e().getB1().getStyle();
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t, "text area");
                        zM87151f = c28655q.m87151f(jM125430y5) | c28655q.m87151f(jM125385c1);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87151f) {
                            c28676v1 = c28676v0;
                            if (objM87133R4 == c28676v1) {
                            }
                            Modifier modifierM118994r9 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c5, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a5, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                            C15043i8 c15043i16 = C15043i8.f56313a;
                            C15197y1 c15197y1M43130h9 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                            String str9 = (String) interfaceC28601c1.getValue();
                            if ((i39 & 458752) == 131072) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if ((i45 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z44 | z45;
                            objM87133R5 = c28655q.m87133R();
                            if (z46) {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i518 = i39 >> 15;
                            boolean z4115 = z35;
                            AbstractC15050j4.m43135a(str9, (Function1) objM87133R5, modifierM118994r9, z4114, z4115, style5, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h9, c28655q, (i518 & 7168) | 12582912 | (i518 & 57344), (i39 >> 21) & 14, 523072);
                            c28655q.m87173q(true);
                            if (z36) {
                                c28655q.m87150e0(-1697416904);
                                c2886a4 = c2886a3;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                c28655q.m87173q(false);
                            } else {
                                c2886a4 = c2886a3;
                                c28655q.m87150e0(-1697132448);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i34 = i517;
                            z19 = z4113;
                            z17 = z36;
                            z24 = z4115;
                            c2886a2 = c2886a4;
                            modifier3 = modifier8;
                            z18 = z4114;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R4 = new C6492c(jM125430y5, jM125385c1, interfaceC28601c6, 1);
                        c28655q.m87172p0(objM87133R4);
                        Modifier modifierM118994r10 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c5, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a5, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i17 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h10 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str10 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i519 = i39 >> 15;
                        boolean z4116 = z35;
                        AbstractC15050j4.m43135a(str10, (Function1) objM87133R5, modifierM118994r10, z4114, z4116, style5, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h10, c28655q, (i519 & 7168) | 12582912 | (i519 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i517;
                        z19 = z4113;
                        z17 = z36;
                        z24 = z4116;
                        c2886a2 = c2886a4;
                        modifier3 = modifier8;
                        z18 = z4114;
                    } else {
                        c28655q = c28655q2;
                        function1 = onTextChanged;
                        c28655q.m87138X();
                        i29 = i13;
                        i34 = i14;
                        z17 = z4;
                        z18 = z13;
                        c2886a2 = c2886a;
                        z19 = z15;
                        modifier3 = modifier2;
                        z24 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Function1 function6 = function1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function6, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i27 |= 48;
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c6 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i5110 = i37;
                    Boolean boolValueOf6 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf6, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j17 = jM125416r;
                    boolean z4117 = z38;
                    i45 = i38;
                    long jM125430y6 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier9 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i17 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i17, c23010xM66775a6);
                    C0209i c0209i18 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i19 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N11);
                    String upperCase6 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                    float f110 = 4;
                    f13 = 2 * f110;
                    f14 = 1 * f110;
                    AbstractC30795n.m94707h(upperCase6, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c7.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j17, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3358c6);
                    c28655q.m87158i0();
                    boolean z4118 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                    C23285v0 style6 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y6) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r11 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c6, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a6, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i18 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h11 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str11 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i5111 = i39 >> 15;
                        boolean z4119 = z35;
                        AbstractC15050j4.m43135a(str11, (Function1) objM87133R5, modifierM118994r11, z4118, z4119, style6, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h11, c28655q, (i5111 & 7168) | 12582912 | (i5111 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i5110;
                        z19 = z4117;
                        z17 = z36;
                        z24 = z4119;
                        c2886a2 = c2886a4;
                        modifier3 = modifier9;
                        z18 = z4118;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y6, jM125385c1, interfaceC28601c7, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r12 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c6, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a6, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i19 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h12 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str12 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5112 = i39 >> 15;
                    boolean z41110 = z35;
                    AbstractC15050j4.m43135a(str12, (Function1) objM87133R5, modifierM118994r12, z4118, z41110, style6, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h12, c28655q, (i5112 & 7168) | 12582912 | (i5112 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i5110;
                    z19 = z4117;
                    z17 = z36;
                    z24 = z41110;
                    c2886a2 = c2886a4;
                    modifier3 = modifier9;
                    z18 = z4118;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function7 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function7, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 805306368;
            if ((i16 & 6) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i46 = 2;
                } else {
                    if ((i16 & 8) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i46 = 4;
                    } else {
                        i46 = 2;
                    }
                }
                i27 = i46 | i16;
            } else {
                i27 = i16;
            }
            i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i28 != 0) {
                if ((i16 & 48) == 0) {
                    i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                }
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c7 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i5113 = i37;
                    Boolean boolValueOf7 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf7, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j18 = jM125416r;
                    boolean z41111 = z38;
                    i45 = i38;
                    long jM125430y7 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier10 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i110, c23010xM66775a7);
                    C0209i c0209i111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N13);
                    String upperCase7 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
                    float f111 = 4;
                    f13 = 2 * f111;
                    f14 = 1 * f111;
                    AbstractC30795n.m94707h(upperCase7, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c8.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j18, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3358c7);
                    c28655q.m87158i0();
                    boolean z41112 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                    C23285v0 style7 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y7) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r13 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c7, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a7, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i110 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h13 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str13 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i5114 = i39 >> 15;
                        boolean z41113 = z35;
                        AbstractC15050j4.m43135a(str13, (Function1) objM87133R5, modifierM118994r13, z41112, z41113, style7, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h13, c28655q, (i5114 & 7168) | 12582912 | (i5114 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i5113;
                        z19 = z41111;
                        z17 = z36;
                        z24 = z41113;
                        c2886a2 = c2886a4;
                        modifier3 = modifier10;
                        z18 = z41112;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y7, jM125385c1, interfaceC28601c8, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r14 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c7, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a7, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i111 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h14 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str14 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5115 = i39 >> 15;
                    boolean z41114 = z35;
                    AbstractC15050j4.m43135a(str14, (Function1) objM87133R5, modifierM118994r14, z41112, z41114, style7, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h14, c28655q, (i5115 & 7168) | 12582912 | (i5115 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i5113;
                    z19 = z41111;
                    z17 = z36;
                    z24 = z41114;
                    c2886a2 = c2886a4;
                    modifier3 = modifier10;
                    z18 = z41112;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function8 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function8, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i27 |= 48;
            if ((i16 & 384) == 0) {
                i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
            }
            if ((306783379 & i18) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i35 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                }
                c28655q2.m87175r();
                z36 = z29;
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                c28655q2.m87150e0(1339360287);
                c38072d = C38072d.f163053a;
                i39 = i18;
                float fM124805c8 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                c28655q2.m87173q(false);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(strM21274h);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                int i5116 = i37;
                Boolean boolValueOf8 = Boolean.valueOf(z28);
                if ((i38 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(boolValueOf8, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                if (z36) {
                    c28655q2.m87150e0(1339381962);
                    i44 = 6;
                    jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                    z39 = false;
                } else {
                    i44 = 6;
                    z39 = false;
                    c28655q2.m87150e0(1339383295);
                    jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                }
                c28655q2.m87173q(z39);
                long j19 = jM125416r;
                boolean z41115 = z38;
                i45 = i38;
                long jM125430y8 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R3;
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier11 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i113 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i113, c23010xM66775a8);
                C0209i c0209i114 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N15);
                String upperCase8 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase8, "toUpperCase(...)");
                float f112 = 4;
                f13 = 2 * f112;
                f14 = 1 * f112;
                AbstractC30795n.m94707h(upperCase8, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c9.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j19, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3358c8);
                c28655q.m87158i0();
                boolean z41116 = z34;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
                C23285v0 style8 = AbstractC2890e.m8450e().getB1().getStyle();
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "text area");
                zM87151f = c28655q.m87151f(jM125430y8) | c28655q.m87151f(jM125385c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87151f) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    Modifier modifierM118994r15 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c8, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a8, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i112 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h15 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str15 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5117 = i39 >> 15;
                    boolean z41117 = z35;
                    AbstractC15050j4.m43135a(str15, (Function1) objM87133R5, modifierM118994r15, z41116, z41117, style8, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h15, c28655q, (i5117 & 7168) | 12582912 | (i5117 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i5116;
                    z19 = z41115;
                    z17 = z36;
                    z24 = z41117;
                    c2886a2 = c2886a4;
                    modifier3 = modifier11;
                    z18 = z41116;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C6492c(jM125430y8, jM125385c1, interfaceC28601c9, 1);
                c28655q.m87172p0(objM87133R4);
                Modifier modifierM118994r16 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c8, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a8, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                C15043i8 c15043i113 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h16 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                String str16 = (String) interfaceC28601c1.getValue();
                if ((i39 & 458752) == 131072) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                if ((i45 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z44 | z45;
                objM87133R5 = c28655q.m87133R();
                if (z46) {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                int i5118 = i39 >> 15;
                boolean z41118 = z35;
                AbstractC15050j4.m43135a(str16, (Function1) objM87133R5, modifierM118994r16, z41116, z41118, style8, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h16, c28655q, (i5118 & 7168) | 12582912 | (i5118 & 57344), (i39 >> 21) & 14, 523072);
                c28655q.m87173q(true);
                if (z36) {
                    c28655q.m87150e0(-1697416904);
                    c2886a4 = c2886a3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                    c28655q.m87173q(false);
                } else {
                    c2886a4 = c2886a3;
                    c28655q.m87150e0(-1697132448);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i34 = i5116;
                z19 = z41115;
                z17 = z36;
                z24 = z41118;
                c2886a2 = c2886a4;
                modifier3 = modifier11;
                z18 = z41116;
            } else {
                c28655q = c28655q2;
                function1 = onTextChanged;
                c28655q.m87138X();
                i29 = i13;
                i34 = i14;
                z17 = z4;
                z18 = z13;
                c2886a2 = c2886a;
                z19 = z15;
                modifier3 = modifier2;
                z24 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function9 = function1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function9, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 12582912;
        i19 = i17 & 256;
        if (i19 != 0) {
            if ((i15 & 100663296) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i24;
            }
            i25 = i17 & 512;
            if (i25 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i18 |= i26;
                }
                if ((i16 & 6) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 2;
                    } else {
                        if ((i16 & 8) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i46 = 4;
                        } else {
                            i46 = 2;
                        }
                    }
                    i27 = i46 | i16;
                } else {
                    i27 = i16;
                }
                i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i28 != 0) {
                    if ((i16 & 48) == 0) {
                        i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                    }
                    if ((i16 & 384) == 0) {
                        i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                    }
                    if ((306783379 & i18) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i35 = i15 & 1;
                        c2314t = C2314t.f9131w;
                        if (i35 != 0) {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        } else {
                            if (i47 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i48 != 0) {
                                i36 = 100;
                            } else {
                                i36 = i13;
                            }
                            if (i49 != 0) {
                                i37 = 2;
                            } else {
                                i37 = i14;
                            }
                            if (i54 != 0) {
                                z25 = false;
                            } else {
                                z25 = z4;
                            }
                            if (i19 != 0) {
                                z26 = true;
                            } else {
                                z26 = z13;
                            }
                            if (i25 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                                i27 &= -15;
                            } else {
                                c2886aM8432m = c2886a;
                            }
                            if (i28 != 0) {
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                i38 = i27;
                                c2886a3 = c2886aM8432m;
                                z29 = z25;
                                z34 = z26;
                                z35 = z27;
                            }
                        }
                        c28655q2.m87175r();
                        z36 = z29;
                        strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                        c28655q2.m87150e0(1339360287);
                        c38072d = C38072d.f163053a;
                        i39 = i18;
                        float fM124805c9 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                        c28655q2.m87173q(false);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(strM21274h);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        int i5119 = i37;
                        Boolean boolValueOf9 = Boolean.valueOf(z28);
                        if ((i38 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zM87153g = z37 | c28655q2.m87153g(strM21274h);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g) {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            z38 = z28;
                            objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87254h(boolValueOf9, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                        if (z36) {
                            c28655q2.m87150e0(1339381962);
                            i44 = 6;
                            jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                            z39 = false;
                        } else {
                            i44 = 6;
                            z39 = false;
                            c28655q2.m87150e0(1339383295);
                            jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                        }
                        c28655q2.m87173q(z39);
                        long j110 = jM125416r;
                        boolean z41119 = z38;
                        i45 = i38;
                        long jM125430y9 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                        jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R3;
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier12 = modifier2;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i116 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a9);
                        C0209i c0209i117 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m17);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N17);
                        String upperCase9 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase9, "toUpperCase(...)");
                        float f113 = 4;
                        f13 = 2 * f113;
                        f14 = 1 * f113;
                        AbstractC30795n.m94707h(upperCase9, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c10.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                        c28655q = c28655q2;
                        Modifier modifierM3358c9 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j110, AbstractC17918w0.f69621a);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3358c9);
                        c28655q.m87158i0();
                        boolean z411110 = z34;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N18);
                        C23285v0 style9 = AbstractC2890e.m8450e().getB1().getStyle();
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(c2314t, "text area");
                        zM87151f = c28655q.m87151f(jM125430y9) | c28655q.m87151f(jM125385c1);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87151f) {
                            c28676v1 = c28676v0;
                            if (objM87133R4 == c28676v1) {
                            }
                            Modifier modifierM118994r17 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c9, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a9, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                            C15043i8 c15043i114 = C15043i8.f56313a;
                            C15197y1 c15197y1M43130h17 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                            String str17 = (String) interfaceC28601c1.getValue();
                            if ((i39 & 458752) == 131072) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            if ((i45 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z44 | z45;
                            objM87133R5 = c28655q.m87133R();
                            if (z46) {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                i29 = i36;
                                function1 = onTextChanged;
                                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i51110 = i39 >> 15;
                            boolean z411111 = z35;
                            AbstractC15050j4.m43135a(str17, (Function1) objM87133R5, modifierM118994r17, z411110, z411111, style9, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h17, c28655q, (i51110 & 7168) | 12582912 | (i51110 & 57344), (i39 >> 21) & 14, 523072);
                            c28655q.m87173q(true);
                            if (z36) {
                                c28655q.m87150e0(-1697416904);
                                c2886a4 = c2886a3;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                                c28655q.m87173q(false);
                            } else {
                                c2886a4 = c2886a3;
                                c28655q.m87150e0(-1697132448);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i34 = i5119;
                            z19 = z41119;
                            z17 = z36;
                            z24 = z411111;
                            c2886a2 = c2886a4;
                            modifier3 = modifier12;
                            z18 = z411110;
                        } else {
                            c28676v1 = c28676v0;
                        }
                        objM87133R4 = new C6492c(jM125430y9, jM125385c1, interfaceC28601c10, 1);
                        c28655q.m87172p0(objM87133R4);
                        Modifier modifierM118994r18 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c9, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a9, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i115 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h18 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str18 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i51111 = i39 >> 15;
                        boolean z411112 = z35;
                        AbstractC15050j4.m43135a(str18, (Function1) objM87133R5, modifierM118994r18, z411110, z411112, style9, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h18, c28655q, (i51111 & 7168) | 12582912 | (i51111 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i5119;
                        z19 = z41119;
                        z17 = z36;
                        z24 = z411112;
                        c2886a2 = c2886a4;
                        modifier3 = modifier12;
                        z18 = z411110;
                    } else {
                        c28655q = c28655q2;
                        function1 = onTextChanged;
                        c28655q.m87138X();
                        i29 = i13;
                        i34 = i14;
                        z17 = z4;
                        z18 = z13;
                        c2886a2 = c2886a;
                        z19 = z15;
                        modifier3 = modifier2;
                        z24 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Function1 function10 = function1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function10, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i27 |= 48;
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c10 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i51112 = i37;
                    Boolean boolValueOf10 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf10, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j111 = jM125416r;
                    boolean z411113 = z38;
                    i45 = i38;
                    long jM125430y10 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier13 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i119 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i119, c23010xM66775a10);
                    C0209i c0209i1110 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC28653p1M87165m19);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i1111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, modifierM118962N19);
                    String upperCase10 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase10, "toUpperCase(...)");
                    float f114 = 4;
                    f13 = 2 * f114;
                    f14 = 1 * f114;
                    AbstractC30795n.m94707h(upperCase10, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c11.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c10 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j111, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3358c10);
                    c28655q.m87158i0();
                    boolean z411114 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N110);
                    C23285v0 style10 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y10) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r19 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c10, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a10, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i116 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h19 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str19 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i51113 = i39 >> 15;
                        boolean z411115 = z35;
                        AbstractC15050j4.m43135a(str19, (Function1) objM87133R5, modifierM118994r19, z411114, z411115, style10, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h19, c28655q, (i51113 & 7168) | 12582912 | (i51113 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i51112;
                        z19 = z411113;
                        z17 = z36;
                        z24 = z411115;
                        c2886a2 = c2886a4;
                        modifier3 = modifier13;
                        z18 = z411114;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y10, jM125385c1, interfaceC28601c11, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r110 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c10, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a10, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i117 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h110 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str110 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i51114 = i39 >> 15;
                    boolean z411116 = z35;
                    AbstractC15050j4.m43135a(str110, (Function1) objM87133R5, modifierM118994r110, z411114, z411116, style10, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h110, c28655q, (i51114 & 7168) | 12582912 | (i51114 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i51112;
                    z19 = z411113;
                    z17 = z36;
                    z24 = z411116;
                    c2886a2 = c2886a4;
                    modifier3 = modifier13;
                    z18 = z411114;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function11 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function11, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 805306368;
            if ((i16 & 6) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i46 = 2;
                } else {
                    if ((i16 & 8) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i46 = 4;
                    } else {
                        i46 = 2;
                    }
                }
                i27 = i46 | i16;
            } else {
                i27 = i16;
            }
            i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i28 != 0) {
                if ((i16 & 48) == 0) {
                    i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                }
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c11 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i51115 = i37;
                    Boolean boolValueOf11 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf11, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j112 = jM125416r;
                    boolean z411117 = z38;
                    i45 = i38;
                    long jM125430y11 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier14 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i1112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, c23010xM66775a11);
                    C0209i c0209i1113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1113, interfaceC28653p1M87165m111);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i1114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1114, modifierM118962N111);
                    String upperCase11 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase11, "toUpperCase(...)");
                    float f115 = 4;
                    f13 = 2 * f115;
                    f14 = 1 * f115;
                    AbstractC30795n.m94707h(upperCase11, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c12.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c11 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j112, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3358c11);
                    c28655q.m87158i0();
                    boolean z411118 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N112);
                    C23285v0 style11 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y11) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r111 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c11, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a11, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i118 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h111 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str111 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i51116 = i39 >> 15;
                        boolean z411119 = z35;
                        AbstractC15050j4.m43135a(str111, (Function1) objM87133R5, modifierM118994r111, z411118, z411119, style11, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h111, c28655q, (i51116 & 7168) | 12582912 | (i51116 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i51115;
                        z19 = z411117;
                        z17 = z36;
                        z24 = z411119;
                        c2886a2 = c2886a4;
                        modifier3 = modifier14;
                        z18 = z411118;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y11, jM125385c1, interfaceC28601c12, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r112 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c11, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a11, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i119 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h112 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str112 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i51117 = i39 >> 15;
                    boolean z4111110 = z35;
                    AbstractC15050j4.m43135a(str112, (Function1) objM87133R5, modifierM118994r112, z411118, z4111110, style11, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h112, c28655q, (i51117 & 7168) | 12582912 | (i51117 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i51115;
                    z19 = z411117;
                    z17 = z36;
                    z24 = z4111110;
                    c2886a2 = c2886a4;
                    modifier3 = modifier14;
                    z18 = z411118;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function12 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function12, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i27 |= 48;
            if ((i16 & 384) == 0) {
                i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
            }
            if ((306783379 & i18) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i35 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                }
                c28655q2.m87175r();
                z36 = z29;
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                c28655q2.m87150e0(1339360287);
                c38072d = C38072d.f163053a;
                i39 = i18;
                float fM124805c12 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                c28655q2.m87173q(false);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(strM21274h);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                int i51118 = i37;
                Boolean boolValueOf12 = Boolean.valueOf(z28);
                if ((i38 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(boolValueOf12, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                if (z36) {
                    c28655q2.m87150e0(1339381962);
                    i44 = 6;
                    jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                    z39 = false;
                } else {
                    i44 = 6;
                    z39 = false;
                    c28655q2.m87150e0(1339383295);
                    jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                }
                c28655q2.m87173q(z39);
                long j113 = jM125416r;
                boolean z4111111 = z38;
                i45 = i38;
                long jM125430y12 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R3;
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier15 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i1115 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i1115, c23010xM66775a12);
                C0209i c0209i1116 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i1116, interfaceC28653p1M87165m113);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i1117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N113);
                String upperCase12 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase12, "toUpperCase(...)");
                float f116 = 4;
                f13 = 2 * f116;
                f14 = 1 * f116;
                AbstractC30795n.m94707h(upperCase12, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c13.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                Modifier modifierM3358c12 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j113, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3358c12);
                c28655q.m87158i0();
                boolean z4111112 = z34;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N114);
                C23285v0 style12 = AbstractC2890e.m8450e().getB1().getStyle();
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(c2314t, "text area");
                zM87151f = c28655q.m87151f(jM125430y12) | c28655q.m87151f(jM125385c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87151f) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    Modifier modifierM118994r113 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c12, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a12, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i1110 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h113 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str113 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i51119 = i39 >> 15;
                    boolean z4111113 = z35;
                    AbstractC15050j4.m43135a(str113, (Function1) objM87133R5, modifierM118994r113, z4111112, z4111113, style12, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h113, c28655q, (i51119 & 7168) | 12582912 | (i51119 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i51118;
                    z19 = z4111111;
                    z17 = z36;
                    z24 = z4111113;
                    c2886a2 = c2886a4;
                    modifier3 = modifier15;
                    z18 = z4111112;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C6492c(jM125430y12, jM125385c1, interfaceC28601c13, 1);
                c28655q.m87172p0(objM87133R4);
                Modifier modifierM118994r114 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c12, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a12, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                C15043i8 c15043i1111 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h114 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                String str114 = (String) interfaceC28601c1.getValue();
                if ((i39 & 458752) == 131072) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                if ((i45 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z44 | z45;
                objM87133R5 = c28655q.m87133R();
                if (z46) {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                int i511110 = i39 >> 15;
                boolean z4111114 = z35;
                AbstractC15050j4.m43135a(str114, (Function1) objM87133R5, modifierM118994r114, z4111112, z4111114, style12, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h114, c28655q, (i511110 & 7168) | 12582912 | (i511110 & 57344), (i39 >> 21) & 14, 523072);
                c28655q.m87173q(true);
                if (z36) {
                    c28655q.m87150e0(-1697416904);
                    c2886a4 = c2886a3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                    c28655q.m87173q(false);
                } else {
                    c2886a4 = c2886a3;
                    c28655q.m87150e0(-1697132448);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i34 = i51118;
                z19 = z4111111;
                z17 = z36;
                z24 = z4111114;
                c2886a2 = c2886a4;
                modifier3 = modifier15;
                z18 = z4111112;
            } else {
                c28655q = c28655q2;
                function1 = onTextChanged;
                c28655q.m87138X();
                i29 = i13;
                i34 = i14;
                z17 = z4;
                z18 = z13;
                c2886a2 = c2886a;
                z19 = z15;
                modifier3 = modifier2;
                z24 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function13 = function1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function13, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 100663296;
        i25 = i17 & 512;
        if (i25 != 0) {
            if ((i15 & 805306368) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i18 |= i26;
            }
            if ((i16 & 6) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i46 = 2;
                } else {
                    if ((i16 & 8) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i46 = 4;
                    } else {
                        i46 = 2;
                    }
                }
                i27 = i46 | i16;
            } else {
                i27 = i16;
            }
            i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i28 != 0) {
                if ((i16 & 48) == 0) {
                    i27 |= c28655q2.m87155h(z15) ? 32 : 16;
                }
                if ((i16 & 384) == 0) {
                    i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
                }
                if ((306783379 & i18) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i35 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    } else {
                        if (i47 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i48 != 0) {
                            i36 = 100;
                        } else {
                            i36 = i13;
                        }
                        if (i49 != 0) {
                            i37 = 2;
                        } else {
                            i37 = i14;
                        }
                        if (i54 != 0) {
                            z25 = false;
                        } else {
                            z25 = z4;
                        }
                        if (i19 != 0) {
                            z26 = true;
                        } else {
                            z26 = z13;
                        }
                        if (i25 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                            i27 &= -15;
                        } else {
                            c2886aM8432m = c2886a;
                        }
                        if (i28 != 0) {
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            i38 = i27;
                            c2886a3 = c2886aM8432m;
                            z29 = z25;
                            z34 = z26;
                            z35 = z27;
                        }
                    }
                    c28655q2.m87175r();
                    z36 = z29;
                    strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                    c28655q2.m87150e0(1339360287);
                    c38072d = C38072d.f163053a;
                    i39 = i18;
                    float fM124805c13 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                    c28655q2.m87173q(false);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(strM21274h);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    int i511111 = i37;
                    Boolean boolValueOf13 = Boolean.valueOf(z28);
                    if ((i38 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | c28655q2.m87153g(strM21274h);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        z38 = z28;
                        objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87254h(boolValueOf13, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                    if (z36) {
                        c28655q2.m87150e0(1339381962);
                        i44 = 6;
                        jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                        z39 = false;
                    } else {
                        i44 = 6;
                        z39 = false;
                        c28655q2.m87150e0(1339383295);
                        jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                    }
                    c28655q2.m87173q(z39);
                    long j114 = jM125416r;
                    boolean z4111115 = z38;
                    i45 = i38;
                    long jM125430y13 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                    jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R3;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier16 = modifier2;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a13);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m115);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i11110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N115);
                    String upperCase13 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase13, "toUpperCase(...)");
                    float f117 = 4;
                    f13 = 2 * f117;
                    f14 = 1 * f117;
                    AbstractC30795n.m94707h(upperCase13, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c14.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    Modifier modifierM3358c13 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j114, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3358c13);
                    c28655q.m87158i0();
                    boolean z4111116 = z34;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N116);
                    C23285v0 style13 = AbstractC2890e.m8450e().getB1().getStyle();
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(c2314t, "text area");
                    zM87151f = c28655q.m87151f(jM125430y13) | c28655q.m87151f(jM125385c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87151f) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        Modifier modifierM118994r115 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c13, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a13, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                        C15043i8 c15043i1112 = C15043i8.f56313a;
                        C15197y1 c15197y1M43130h115 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                        String str115 = (String) interfaceC28601c1.getValue();
                        if ((i39 & 458752) == 131072) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if ((i45 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z44 | z45;
                        objM87133R5 = c28655q.m87133R();
                        if (z46) {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            i29 = i36;
                            function1 = onTextChanged;
                            objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i511112 = i39 >> 15;
                        boolean z4111117 = z35;
                        AbstractC15050j4.m43135a(str115, (Function1) objM87133R5, modifierM118994r115, z4111116, z4111117, style13, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h115, c28655q, (i511112 & 7168) | 12582912 | (i511112 & 57344), (i39 >> 21) & 14, 523072);
                        c28655q.m87173q(true);
                        if (z36) {
                            c28655q.m87150e0(-1697416904);
                            c2886a4 = c2886a3;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                            c28655q.m87173q(false);
                        } else {
                            c2886a4 = c2886a3;
                            c28655q.m87150e0(-1697132448);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i34 = i511111;
                        z19 = z4111115;
                        z17 = z36;
                        z24 = z4111117;
                        c2886a2 = c2886a4;
                        modifier3 = modifier16;
                        z18 = z4111116;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R4 = new C6492c(jM125430y13, jM125385c1, interfaceC28601c14, 1);
                    c28655q.m87172p0(objM87133R4);
                    Modifier modifierM118994r116 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c13, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a13, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i1113 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h116 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str116 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i511113 = i39 >> 15;
                    boolean z4111118 = z35;
                    AbstractC15050j4.m43135a(str116, (Function1) objM87133R5, modifierM118994r116, z4111116, z4111118, style13, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h116, c28655q, (i511113 & 7168) | 12582912 | (i511113 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i511111;
                    z19 = z4111115;
                    z17 = z36;
                    z24 = z4111118;
                    c2886a2 = c2886a4;
                    modifier3 = modifier16;
                    z18 = z4111116;
                } else {
                    c28655q = c28655q2;
                    function1 = onTextChanged;
                    c28655q.m87138X();
                    i29 = i13;
                    i34 = i14;
                    z17 = z4;
                    z18 = z13;
                    c2886a2 = c2886a;
                    z19 = z15;
                    modifier3 = modifier2;
                    z24 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function14 = function1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function14, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i27 |= 48;
            if ((i16 & 384) == 0) {
                i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
            }
            if ((306783379 & i18) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i35 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                }
                c28655q2.m87175r();
                z36 = z29;
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                c28655q2.m87150e0(1339360287);
                c38072d = C38072d.f163053a;
                i39 = i18;
                float fM124805c14 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                c28655q2.m87173q(false);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(strM21274h);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                int i511114 = i37;
                Boolean boolValueOf14 = Boolean.valueOf(z28);
                if ((i38 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(boolValueOf14, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                if (z36) {
                    c28655q2.m87150e0(1339381962);
                    i44 = 6;
                    jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                    z39 = false;
                } else {
                    i44 = 6;
                    z39 = false;
                    c28655q2.m87150e0(1339383295);
                    jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                }
                c28655q2.m87173q(z39);
                long j115 = jM125416r;
                boolean z4111119 = z38;
                i45 = i38;
                long jM125430y14 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R3;
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier17 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11111 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11111, c23010xM66775a14);
                C0209i c0209i11112 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i11112, interfaceC28653p1M87165m117);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i11113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i11113, modifierM118962N117);
                String upperCase14 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase14, "toUpperCase(...)");
                float f118 = 4;
                f13 = 2 * f118;
                f14 = 1 * f118;
                AbstractC30795n.m94707h(upperCase14, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c15.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                Modifier modifierM3358c14 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j115, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3358c14);
                c28655q.m87158i0();
                boolean z41111110 = z34;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11111, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC28653p1M87165m118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11113, modifierM118962N118);
                C23285v0 style14 = AbstractC2890e.m8450e().getB1().getStyle();
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(c2314t, "text area");
                zM87151f = c28655q.m87151f(jM125430y14) | c28655q.m87151f(jM125385c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87151f) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    Modifier modifierM118994r117 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c14, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a14, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i1114 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h117 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str117 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i511115 = i39 >> 15;
                    boolean z41111111 = z35;
                    AbstractC15050j4.m43135a(str117, (Function1) objM87133R5, modifierM118994r117, z41111110, z41111111, style14, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h117, c28655q, (i511115 & 7168) | 12582912 | (i511115 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i511114;
                    z19 = z4111119;
                    z17 = z36;
                    z24 = z41111111;
                    c2886a2 = c2886a4;
                    modifier3 = modifier17;
                    z18 = z41111110;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C6492c(jM125430y14, jM125385c1, interfaceC28601c15, 1);
                c28655q.m87172p0(objM87133R4);
                Modifier modifierM118994r118 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c14, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a14, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                C15043i8 c15043i1115 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h118 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                String str118 = (String) interfaceC28601c1.getValue();
                if ((i39 & 458752) == 131072) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                if ((i45 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z44 | z45;
                objM87133R5 = c28655q.m87133R();
                if (z46) {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                int i511116 = i39 >> 15;
                boolean z41111112 = z35;
                AbstractC15050j4.m43135a(str118, (Function1) objM87133R5, modifierM118994r118, z41111110, z41111112, style14, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h118, c28655q, (i511116 & 7168) | 12582912 | (i511116 & 57344), (i39 >> 21) & 14, 523072);
                c28655q.m87173q(true);
                if (z36) {
                    c28655q.m87150e0(-1697416904);
                    c2886a4 = c2886a3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                    c28655q.m87173q(false);
                } else {
                    c2886a4 = c2886a3;
                    c28655q.m87150e0(-1697132448);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i34 = i511114;
                z19 = z4111119;
                z17 = z36;
                z24 = z41111112;
                c2886a2 = c2886a4;
                modifier3 = modifier17;
                z18 = z41111110;
            } else {
                c28655q = c28655q2;
                function1 = onTextChanged;
                c28655q.m87138X();
                i29 = i13;
                i34 = i14;
                z17 = z4;
                z18 = z13;
                c2886a2 = c2886a;
                z19 = z15;
                modifier3 = modifier2;
                z24 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function15 = function1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function15, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 805306368;
        if ((i16 & 6) == 0) {
            if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                i46 = 2;
            } else {
                if ((i16 & 8) == 0) {
                    zM87157i = c28655q2.m87153g(c2886a);
                } else {
                    zM87157i = c28655q2.m87157i(c2886a);
                }
                if (zM87157i) {
                    i46 = 4;
                } else {
                    i46 = 2;
                }
            }
            i27 = i46 | i16;
        } else {
            i27 = i16;
        }
        i28 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i28 != 0) {
            if ((i16 & 48) == 0) {
                i27 |= c28655q2.m87155h(z15) ? 32 : 16;
            }
            if ((i16 & 384) == 0) {
                i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
            }
            if ((306783379 & i18) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i35 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                } else {
                    if (i47 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i48 != 0) {
                        i36 = 100;
                    } else {
                        i36 = i13;
                    }
                    if (i49 != 0) {
                        i37 = 2;
                    } else {
                        i37 = i14;
                    }
                    if (i54 != 0) {
                        z25 = false;
                    } else {
                        z25 = z4;
                    }
                    if (i19 != 0) {
                        z26 = true;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                        i27 &= -15;
                    } else {
                        c2886aM8432m = c2886a;
                    }
                    if (i28 != 0) {
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        i38 = i27;
                        c2886a3 = c2886aM8432m;
                        z29 = z25;
                        z34 = z26;
                        z35 = z27;
                    }
                }
                c28655q2.m87175r();
                z36 = z29;
                strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
                c28655q2.m87150e0(1339360287);
                c38072d = C38072d.f163053a;
                i39 = i18;
                float fM124805c15 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
                c28655q2.m87173q(false);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(strM21274h);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                int i511117 = i37;
                Boolean boolValueOf15 = Boolean.valueOf(z28);
                if ((i38 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | c28655q2.m87153g(strM21274h);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    z38 = z28;
                    objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(boolValueOf15, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
                if (z36) {
                    c28655q2.m87150e0(1339381962);
                    i44 = 6;
                    jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                    z39 = false;
                } else {
                    i44 = 6;
                    z39 = false;
                    c28655q2.m87150e0(1339383295);
                    jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
                }
                c28655q2.m87173q(z39);
                long j116 = jM125416r;
                boolean z41111113 = z38;
                i45 = i38;
                long jM125430y15 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
                jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R3;
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier18 = modifier2;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11114, c23010xM66775a15);
                C0209i c0209i11115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i11115, interfaceC28653p1M87165m119);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i11116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i11116, modifierM118962N119);
                String upperCase15 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase15, "toUpperCase(...)");
                float f119 = 4;
                f13 = 2 * f119;
                f14 = 1 * f119;
                AbstractC30795n.m94707h(upperCase15, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c16.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                Modifier modifierM3358c15 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j116, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3358c15);
                c28655q.m87158i0();
                boolean z41111114 = z34;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11114, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q, c0209i11115, interfaceC28653p1M87165m1110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, modifierM118962N1110);
                C23285v0 style15 = AbstractC2890e.m8450e().getB1().getStyle();
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(c2314t, "text area");
                zM87151f = c28655q.m87151f(jM125430y15) | c28655q.m87151f(jM125385c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87151f) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    Modifier modifierM118994r119 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c15, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a15, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                    C15043i8 c15043i1116 = C15043i8.f56313a;
                    C15197y1 c15197y1M43130h119 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                    String str119 = (String) interfaceC28601c1.getValue();
                    if ((i39 & 458752) == 131072) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    if ((i45 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z44 | z45;
                    objM87133R5 = c28655q.m87133R();
                    if (z46) {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        i29 = i36;
                        function1 = onTextChanged;
                        objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i511118 = i39 >> 15;
                    boolean z41111115 = z35;
                    AbstractC15050j4.m43135a(str119, (Function1) objM87133R5, modifierM118994r119, z41111114, z41111115, style15, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h119, c28655q, (i511118 & 7168) | 12582912 | (i511118 & 57344), (i39 >> 21) & 14, 523072);
                    c28655q.m87173q(true);
                    if (z36) {
                        c28655q.m87150e0(-1697416904);
                        c2886a4 = c2886a3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                        c28655q.m87173q(false);
                    } else {
                        c2886a4 = c2886a3;
                        c28655q.m87150e0(-1697132448);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i34 = i511117;
                    z19 = z41111113;
                    z17 = z36;
                    z24 = z41111115;
                    c2886a2 = c2886a4;
                    modifier3 = modifier18;
                    z18 = z41111114;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C6492c(jM125430y15, jM125385c1, interfaceC28601c16, 1);
                c28655q.m87172p0(objM87133R4);
                Modifier modifierM118994r1110 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c15, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a15, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                C15043i8 c15043i1117 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h1110 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                String str1110 = (String) interfaceC28601c1.getValue();
                if ((i39 & 458752) == 131072) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                if ((i45 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z44 | z45;
                objM87133R5 = c28655q.m87133R();
                if (z46) {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                int i511119 = i39 >> 15;
                boolean z41111116 = z35;
                AbstractC15050j4.m43135a(str1110, (Function1) objM87133R5, modifierM118994r1110, z41111114, z41111116, style15, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h1110, c28655q, (i511119 & 7168) | 12582912 | (i511119 & 57344), (i39 >> 21) & 14, 523072);
                c28655q.m87173q(true);
                if (z36) {
                    c28655q.m87150e0(-1697416904);
                    c2886a4 = c2886a3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                    c28655q.m87173q(false);
                } else {
                    c2886a4 = c2886a3;
                    c28655q.m87150e0(-1697132448);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i34 = i511117;
                z19 = z41111113;
                z17 = z36;
                z24 = z41111116;
                c2886a2 = c2886a4;
                modifier3 = modifier18;
                z18 = z41111114;
            } else {
                c28655q = c28655q2;
                function1 = onTextChanged;
                c28655q.m87138X();
                i29 = i13;
                i34 = i14;
                z17 = z4;
                z18 = z13;
                c2886a2 = c2886a;
                z19 = z15;
                modifier3 = modifier2;
                z24 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function16 = function1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function16, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i27 |= 48;
        if ((i16 & 384) == 0) {
            i27 |= c28655q2.m87157i(onTextChanged) ? 256 : 128;
        }
        if ((306783379 & i18) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q2.m87135U(i18 & 1, z16)) {
            c28655q2.m87140Z();
            i35 = i15 & 1;
            c2314t = C2314t.f9131w;
            if (i35 != 0) {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if (i48 != 0) {
                    i36 = 100;
                } else {
                    i36 = i13;
                }
                if (i49 != 0) {
                    i37 = 2;
                } else {
                    i37 = i14;
                }
                if (i54 != 0) {
                    z25 = false;
                } else {
                    z25 = z4;
                }
                if (i19 != 0) {
                    z26 = true;
                } else {
                    z26 = z13;
                }
                if (i25 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                    i27 &= -15;
                } else {
                    c2886aM8432m = c2886a;
                }
                if (i28 != 0) {
                    i38 = i27;
                    c2886a3 = c2886aM8432m;
                    z29 = z25;
                    z34 = z26;
                    z35 = z27;
                    z28 = false;
                } else {
                    z28 = z15;
                    i38 = i27;
                    c2886a3 = c2886aM8432m;
                    z29 = z25;
                    z34 = z26;
                    z35 = z27;
                }
            } else {
                if (i47 != 0) {
                    modifier2 = c2314t;
                }
                if (i48 != 0) {
                    i36 = 100;
                } else {
                    i36 = i13;
                }
                if (i49 != 0) {
                    i37 = 2;
                } else {
                    i37 = i14;
                }
                if (i54 != 0) {
                    z25 = false;
                } else {
                    z25 = z4;
                }
                if (i19 != 0) {
                    z26 = true;
                } else {
                    z26 = z13;
                }
                if (i25 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    c2886aM8432m = AbstractC2890e.m8450e().getFormLabel();
                    i27 &= -15;
                } else {
                    c2886aM8432m = c2886a;
                }
                if (i28 != 0) {
                    i38 = i27;
                    c2886a3 = c2886aM8432m;
                    z29 = z25;
                    z34 = z26;
                    z35 = z27;
                    z28 = false;
                } else {
                    z28 = z15;
                    i38 = i27;
                    c2886a3 = c2886aM8432m;
                    z29 = z25;
                    z34 = z26;
                    z35 = z27;
                }
            }
            c28655q2.m87175r();
            z36 = z29;
            strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i18 >> 6) & 14);
            c28655q2.m87150e0(1339360287);
            c38072d = C38072d.f163053a;
            i39 = i18;
            float fM124805c16 = (C39183o.m124805c(AbstractC33745d.m106661t(c38072d, c28655q2, 6).f92256b.f92106c) * i37) + 32;
            c28655q2.m87173q(false);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(strM21274h);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            int i5111110 = i37;
            Boolean boolValueOf16 = Boolean.valueOf(z28);
            if ((i38 & 112) == 32) {
                z37 = true;
            } else {
                z37 = false;
            }
            zM87153g = z37 | c28655q2.m87153g(strM21274h);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                z38 = z28;
                objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                z38 = z28;
                objM87133R2 = new a(z38, interfaceC28601c1, strM21274h, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(boolValueOf16, strM21274h, (InterfaceC4351m) objM87133R2, c28655q2);
            if (z36) {
                c28655q2.m87150e0(1339381962);
                i44 = 6;
                jM125416r = c38072d.m121949b(c28655q2, 6).getAccentAlertTrend15();
                z39 = false;
            } else {
                i44 = 6;
                z39 = false;
                c28655q2.m87150e0(1339383295);
                jM125416r = c38072d.m121949b(c28655q2, 6).getBlack30();
            }
            c28655q2.m87173q(z39);
            long j117 = jM125416r;
            boolean z41111117 = z38;
            i45 = i38;
            long jM125430y16 = c38072d.m121949b(c28655q2, i44).getBrandWhite();
            jM125385c1 = c38072d.m121949b(c28655q2, i44).getWhite70();
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C17919x(jM125385c1));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R3;
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifier2);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier19 = modifier2;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11117 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11117, c23010xM66775a16);
            C0209i c0209i11118 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i11118, interfaceC28653p1M87165m1111);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i11119 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N1111);
            String upperCase16 = AbstractC8693b.m21274h(label, c28655q2, (i39 >> 3) & 14).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase16, "toUpperCase(...)");
            float f1110 = 4;
            f13 = 2 * f1110;
            f14 = 1 * f1110;
            AbstractC30795n.m94707h(upperCase16, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), f14, f13), ((C17919x) interfaceC28601c17.getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, 0, 196600);
            c28655q = c28655q2;
            Modifier modifierM3358c16 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, z34)), AbstractC33253j.m105489e(f14)), j117, AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3358c16);
            c28655q.m87158i0();
            boolean z41111118 = z34;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, c0209i11118, interfaceC28653p1M87165m1112);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N1112);
            C23285v0 style16 = AbstractC2890e.m8450e().getB1().getStyle();
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(c2314t, "text area");
            zM87151f = c28655q.m87151f(jM125430y16) | c28655q.m87151f(jM125385c1);
            objM87133R4 = c28655q.m87133R();
            if (zM87151f) {
                c28676v1 = c28676v0;
                if (objM87133R4 == c28676v1) {
                }
                Modifier modifierM118994r1111 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c16, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a16, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
                C15043i8 c15043i1118 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h1111 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
                String str1111 = (String) interfaceC28601c1.getValue();
                if ((i39 & 458752) == 131072) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                if ((i45 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z44 | z45;
                objM87133R5 = c28655q.m87133R();
                if (z46) {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    i29 = i36;
                    function1 = onTextChanged;
                    objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                int i5111111 = i39 >> 15;
                boolean z41111119 = z35;
                AbstractC15050j4.m43135a(str1111, (Function1) objM87133R5, modifierM118994r1111, z41111118, z41111119, style16, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h1111, c28655q, (i5111111 & 7168) | 12582912 | (i5111111 & 57344), (i39 >> 21) & 14, 523072);
                c28655q.m87173q(true);
                if (z36) {
                    c28655q.m87150e0(-1697416904);
                    c2886a4 = c2886a3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                    c28655q.m87173q(false);
                } else {
                    c2886a4 = c2886a3;
                    c28655q.m87150e0(-1697132448);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i34 = i5111110;
                z19 = z41111117;
                z17 = z36;
                z24 = z41111119;
                c2886a2 = c2886a4;
                modifier3 = modifier19;
                z18 = z41111118;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R4 = new C6492c(jM125430y16, jM125385c1, interfaceC28601c17, 1);
            c28655q.m87172p0(objM87133R4);
            Modifier modifierM118994r1112 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM124805c16, AbstractC1102d.m3409f(1.0f, AbstractC1094c.m3366a(AbstractC1126a.m3484c(modifierM3599a16, (Function1) objM87133R4), true, null))), AbstractC33253j.m105489e(f14));
            C15043i8 c15043i1119 = C15043i8.f56313a;
            C15197y1 c15197y1M43130h1112 = C15043i8.m43130h(c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, 0L, 0L, 0L, c38072d.m121949b(c28655q, 6).getWhite50(), c38072d.m121949b(c28655q, 6).getWhite10(), 0L, c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q, 2096798);
            String str1112 = (String) interfaceC28601c1.getValue();
            if ((i39 & 458752) == 131072) {
                z44 = true;
            } else {
                z44 = false;
            }
            if ((i45 & 896) == 256) {
                z45 = true;
            } else {
                z45 = false;
            }
            z46 = z44 | z45;
            objM87133R5 = c28655q.m87133R();
            if (z46) {
                i29 = i36;
                function1 = onTextChanged;
                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                c28655q.m87172p0(objM87133R5);
            } else {
                i29 = i36;
                function1 = onTextChanged;
                objM87133R5 = new C17758j1(i29, interfaceC28601c1, function1);
                c28655q.m87172p0(objM87133R5);
            }
            int i5111112 = i39 >> 15;
            boolean z411111110 = z35;
            AbstractC15050j4.m43135a(str1112, (Function1) objM87133R5, modifierM118994r1112, z41111118, z411111110, style16, null, AbstractC37817c.m121344e(-2122840829, c28655q, new C17768m0(hintText, 1)), null, z36, null, null, null, false, 0, 0, null, c15197y1M43130h1112, c28655q, (i5111112 & 7168) | 12582912 | (i5111112 & 57344), (i39 >> 21) & 14, 523072);
            c28655q.m87173q(true);
            if (z36) {
                c28655q.m87150e0(-1697416904);
                c2886a4 = c2886a3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(errorMessage, c28655q, (i39 >> 12) & 14), AbstractC1099a.m3395q(c2314t, f14, f13), c38072d.m121949b(c28655q, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q, 0, (i45 << 18) & 3670016, 196600);
                c28655q.m87173q(false);
            } else {
                c2886a4 = c2886a3;
                c28655q.m87150e0(-1697132448);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            i34 = i5111110;
            z19 = z41111117;
            z17 = z36;
            z24 = z411111110;
            c2886a2 = c2886a4;
            modifier3 = modifier19;
            z18 = z41111118;
        } else {
            c28655q = c28655q2;
            function1 = onTextChanged;
            c28655q.m87138X();
            i29 = i13;
            i34 = i14;
            z17 = z4;
            z18 = z13;
            c2886a2 = c2886a;
            z19 = z15;
            modifier3 = modifier2;
            z24 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Function1 function17 = function1;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.k1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC17766l1.m50968i(modifier3, label, text, hintText, errorMessage, i29, i34, z17, z18, z24, c2886a2, z19, function17, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m50965f(InterfaceC28601c1 interfaceC28601c1, long j7, long j13, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        if (!((EnumC15251w) it).m43353a()) {
            j7 = j13;
        }
        interfaceC28601c1.setValue(new C17919x(j7));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m50966g(int i13, InterfaceC28601c1 interfaceC28601c1, Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= i13) {
            interfaceC28601c1.setValue(it);
            function1.invoke(interfaceC28601c1.getValue());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m50967h(TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, 0, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m50968i(Modifier modifier, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, int i14, boolean z4, boolean z13, boolean z14, C2886a c2886a, boolean z15, Function1 function1, int i15, int i16, int i17, Composer composer, int i18) {
        m50964e(modifier, textResource, textResource2, textResource3, textResource4, i13, i14, z4, z13, z14, c2886a, z15, function1, composer, AbstractC28683x.m87244L(i15 | 1), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }
}
