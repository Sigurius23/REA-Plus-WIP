package i31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import gb1.AbstractC15673b0;
import gb1.AbstractC15693u;
import gf1.C15786e;
import gz0.EnumC16313m0;
import hu1.C17650g;
import hy0.C17750h1;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27264l;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p163g1.C15079m3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import sy0.AbstractC33088k;
import sy0.C33082e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: i31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008d\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$\u001aK\u0010'\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b'\u0010(\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00064"}, m65681d2 = {"Li31/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ln2/a;", "painter", "", "contentDescription", "Li2/t;", "tint", "f", "(Ln2/a;Ljava/lang/String;Li2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "id", "title", "Lb91/c;", "titleTypography", "Lm91/u;", "leading", "Lkd1/o;", "iconImageSource", "", "description", "trailing", "emoji", "", "isSelected", "iconBackgroundEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "m", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;)Li31/g;", "recommendationId", "isExpanded", "o", "(Ljava/lang/String;Ljava/lang/String;ZZZLm91/u;)Li31/g;", "Li2/x;", "a", "J", "iconGradientStart", "b", "iconGradientEnd", "c", "Li2/t;", "iconBackgroundGradient", "d", "iconTintGradient", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18048c {

    /* JADX INFO: renamed from: a */
    private static final long f70074a;

    /* JADX INFO: renamed from: b */
    private static final long f70075b;

    /* JADX INFO: renamed from: c */
    private static final AbstractC17911t f70076c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t f70077d;

    static {
        long jM51517e = AbstractC17918w0.m51517e(4283487743L);
        f70074a = jM51517e;
        long jM51517e2 = AbstractC17918w0.m51517e(4287324927L);
        f70075b = jM51517e2;
        C17909s c17909s = AbstractC17911t.f69612b;
        f70076c = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, jM51517e2)), new C17919x(C17919x.m51541c(0.1f, jM51517e))), 0L, 0L, 14);
        f70077d = AbstractC15693u.m44155b(c17909s, AbstractC15673b0.m44049m(), null, 0, 135.0f, true, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private static final void m51826f(AbstractC26165a abstractC26165a, String str, AbstractC17911t abstractC17911t, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Modifier modifier5;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(541379441);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC26165a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(abstractC17911t) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (abstractC17911t instanceof C17875c1) {
                    c28655q.m87150e0(632903023);
                    AbstractC23164r1.m67132a(abstractC26165a, str, modifier4, ((C17875c1) abstractC17911t).f69559c, c28655q, (i15 & 126) | ((i15 >> 3) & 896));
                    modifier5 = modifier4;
                    c28655q.m87173q(false);
                } else {
                    modifier5 = modifier4;
                    c28655q.m87150e0(633086574);
                    AbstractC23164r1.m67132a(abstractC26165a, str, AbstractC15673b0.m44061s(modifier5, abstractC17911t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, i15 & 126);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(abstractC26165a, str, abstractC17911t, modifier3, i13, i14, 11);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (abstractC17911t instanceof C17875c1) {
                c28655q.m87150e0(632903023);
                AbstractC23164r1.m67132a(abstractC26165a, str, modifier4, ((C17875c1) abstractC17911t).f69559c, c28655q, (i15 & 126) | ((i15 >> 3) & 896));
                modifier5 = modifier4;
                c28655q.m87173q(false);
            } else {
                modifier5 = modifier4;
                c28655q.m87150e0(633086574);
                AbstractC23164r1.m67132a(abstractC26165a, str, AbstractC15673b0.m44061s(modifier5, abstractC17911t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, i15 & 126);
                c28655q.m87173q(false);
            }
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(abstractC26165a, str, abstractC17911t, modifier3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m51827g(AbstractC26165a abstractC26165a, String str, AbstractC17911t abstractC17911t, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m51826f(abstractC26165a, str, abstractC17911t, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0262  */
    /* JADX WARN: Code duplicated, block: B:110:0x029d  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:117:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:122:0x0372  */
    /* JADX WARN: Code duplicated, block: B:124:0x0395  */
    /* JADX WARN: Code duplicated, block: B:125:0x0399  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d9 A[LOOP:0: B:134:0x03d3->B:136:0x03d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x040b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0415  */
    /* JADX WARN: Code duplicated, block: B:145:0x042f  */
    /* JADX WARN: Code duplicated, block: B:148:0x043a  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x020a  */
    /* JADX WARN: Code duplicated, block: B:92:0x020e  */
    /* JADX WARN: Code duplicated, block: B:95:0x021b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229  */
    /* JADX INFO: renamed from: h */
    public static final void m51828h(C18052g viewState, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        int i17;
        boolean z4;
        Function1 function3;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C2314t c2314t;
        Modifier modifier3;
        GenericInteraction genericInteractionM51846h;
        Modifier modifier4;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C2306l c2306l;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i18;
        C0209i c0209i4;
        InterfaceC25312u interfaceC25312uM51847i;
        C0209i c0209i5;
        InterfaceC17869a1 interfaceC17869a1;
        float f14;
        InterfaceC25312u interfaceC25312uM51843e;
        AbstractC22403o abstractC22403oM51845g;
        Modifier modifierM3357b;
        int iHashCode2;
        AbstractC17911t c17875c1;
        boolean z14;
        float f15;
        int iHashCode3;
        C0209i c0209i6;
        boolean z15;
        boolean z16;
        InterfaceC25312u interfaceC25312uM51850l;
        int iHashCode4;
        Iterator<T> it;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(814059547);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87153g(modifier)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C17650g(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    c2314t = C2314t.f9131w;
                    if (i16 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    genericInteractionM51846h = viewState.getInteraction();
                    modifier4 = null;
                    if (genericInteractionM51846h == null) {
                        c28655q.m87150e0(-2032076772);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2032076771);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(genericInteractionM51846h);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        c28655q.m87173q(false);
                        modifier4 = modifierM3362g;
                    }
                    if (modifier4 == null) {
                        modifier4 = c2314t;
                    }
                    Modifier modifierMo3471e = modifierM3409f.mo3471e(modifier4);
                    c2306l = C2299e.f9108K;
                    float f16 = 8;
                    f13 = f16 * 1.0f;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
                    modifier = modifier3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i18 = i15;
                    } else {
                        i18 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        interfaceC25312uM51847i = viewState.getLeading();
                        if (interfaceC25312uM51847i == null) {
                            c28655q.m87150e0(758398118);
                            c28655q.m87173q(false);
                            c0209i5 = c0209i2;
                            interfaceC17869a1 = null;
                            f14 = f13;
                        } else {
                            c28655q.m87150e0(758398119);
                            c0209i5 = c0209i2;
                            interfaceC17869a1 = null;
                            f14 = f13;
                            AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                            c28655q.m87173q(false);
                        }
                        interfaceC25312uM51843e = viewState.getEmoji();
                        if (interfaceC25312uM51843e != null) {
                            c28655q.m87150e0(758555258);
                            AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(758767298);
                            abstractC22403oM51845g = viewState.getIconImageSource();
                            if (abstractC22403oM51845g == null) {
                                c28655q.m87150e0(758767297);
                                c28655q.m87173q(false);
                                z14 = false;
                            } else {
                                c28655q.m87150e0(758767298);
                                float f17 = 4;
                                Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f17));
                                if (viewState.getIconBackgroundEnabled()) {
                                    modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                                } else {
                                    modifierM3357b = c2314t;
                                }
                                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifierM118994r.mo3471e(modifierM3357b));
                                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d);
                                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                                c28655q = c28655q;
                                String strM8299l = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                                if (viewState.getIconBackgroundEnabled() && viewState.getIsSelected()) {
                                    c28655q.m87150e0(891276960);
                                    c28655q.m87173q(false);
                                    c17875c1 = f70077d;
                                    z14 = false;
                                } else {
                                    c28655q.m87150e0(891355080);
                                    c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                    z14 = false;
                                    c28655q.m87173q(false);
                                }
                                m51826f(abstractC26165aM64500i, strM8299l, c17875c1, AbstractC1102d.m3419p(f17 * 6.0f, c2314t), c28655q, 3072, 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z14);
                            }
                            c28655q.m87173q(z14);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        f15 = 0.5f * f16;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        C28655q c28655q2 = c28655q;
                        c0209i6 = c0209i5;
                        AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q2, 0, 3072, 188410);
                        c28655q = c28655q2;
                        if (viewState.m51842c().isEmpty()) {
                            z15 = true;
                            z16 = false;
                            c28655q.m87150e0(727960461);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(727591003);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                            c28655q.m87150e0(-1544986756);
                            it = viewState.m51842c().iterator();
                            while (it.hasNext()) {
                                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                            }
                            z15 = true;
                            z16 = false;
                            AbstractC25012a.m73392y(c28655q, false, true, false);
                        }
                        c28655q.m87173q(z15);
                        interfaceC25312uM51850l = viewState.getTrailing();
                        if (interfaceC25312uM51850l == null) {
                            c28655q.m87150e0(760705572);
                            c28655q.m87173q(z16);
                        } else {
                            c28655q.m87150e0(760705573);
                            AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                            c28655q.m87173q(z16);
                        }
                        c28655q.m87173q(z15);
                        function3 = function4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    interfaceC25312uM51847i = viewState.getLeading();
                    if (interfaceC25312uM51847i == null) {
                        c28655q.m87150e0(758398118);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                    } else {
                        c28655q.m87150e0(758398119);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                        AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(false);
                    }
                    interfaceC25312uM51843e = viewState.getEmoji();
                    if (interfaceC25312uM51843e != null) {
                        c28655q.m87150e0(758555258);
                        AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(758767298);
                        abstractC22403oM51845g = viewState.getIconImageSource();
                        if (abstractC22403oM51845g == null) {
                            c28655q.m87150e0(758767297);
                            c28655q.m87173q(false);
                            z14 = false;
                        } else {
                            c28655q.m87150e0(758767298);
                            float f18 = 4;
                            Modifier modifierM118994r2 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f18));
                            if (viewState.getIconBackgroundEnabled()) {
                                modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                            } else {
                                modifierM3357b = c2314t;
                            }
                            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, modifierM118994r2.mo3471e(modifierM3357b));
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                            c28655q = c28655q;
                            String strM8299l2 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                            if (viewState.getIconBackgroundEnabled()) {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            }
                            m51826f(abstractC26165aM64500i2, strM8299l2, c17875c1, AbstractC1102d.m3419p(f18 * 6.0f, c2314t), c28655q, 3072, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z14);
                        }
                        c28655q.m87173q(z14);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    f15 = 0.5f * f16;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    C28655q c28655q3 = c28655q;
                    c0209i6 = c0209i5;
                    AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q3, 0, 3072, 188410);
                    c28655q = c28655q3;
                    if (viewState.m51842c().isEmpty()) {
                        c28655q.m87150e0(727591003);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m7);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                        c28655q.m87150e0(-1544986756);
                        it = viewState.m51842c().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        }
                        z15 = true;
                        z16 = false;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    } else {
                        z15 = true;
                        z16 = false;
                        c28655q.m87150e0(727960461);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    interfaceC25312uM51850l = viewState.getTrailing();
                    if (interfaceC25312uM51850l == null) {
                        c28655q.m87150e0(760705572);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(760705573);
                        AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z15);
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                modifier2 = modifier;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18047b(viewState, function3, modifier2, i13, i14);
                }
            }
            i15 |= 384;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17650g(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
                genericInteractionM51846h = viewState.getInteraction();
                modifier4 = null;
                if (genericInteractionM51846h == null) {
                    c28655q.m87150e0(-2032076772);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2032076771);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(genericInteractionM51846h);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                    modifier4 = modifierM3362g2;
                }
                if (modifier4 == null) {
                    modifier4 = c2314t;
                }
                Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(modifier4);
                c2306l = C2299e.f9108K;
                float f19 = 8;
                f13 = f19 * 1.0f;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
                modifier = modifier3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i18 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    interfaceC25312uM51847i = viewState.getLeading();
                    if (interfaceC25312uM51847i == null) {
                        c28655q.m87150e0(758398118);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                    } else {
                        c28655q.m87150e0(758398119);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                        AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(false);
                    }
                    interfaceC25312uM51843e = viewState.getEmoji();
                    if (interfaceC25312uM51843e != null) {
                        c28655q.m87150e0(758555258);
                        AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(758767298);
                        abstractC22403oM51845g = viewState.getIconImageSource();
                        if (abstractC22403oM51845g == null) {
                            c28655q.m87150e0(758767297);
                            c28655q.m87173q(false);
                            z14 = false;
                        } else {
                            c28655q.m87150e0(758767298);
                            float f110 = 4;
                            Modifier modifierM118994r3 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f110));
                            if (viewState.getIconBackgroundEnabled()) {
                                modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                            } else {
                                modifierM3357b = c2314t;
                            }
                            Modifier modifierM3394p3 = AbstractC1099a.m3394p(f14, modifierM118994r3.mo3471e(modifierM3357b));
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m9);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                            AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                            c28655q = c28655q;
                            String strM8299l3 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                            if (viewState.getIconBackgroundEnabled()) {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            }
                            m51826f(abstractC26165aM64500i3, strM8299l3, c17875c1, AbstractC1102d.m3419p(f110 * 6.0f, c2314t), c28655q, 3072, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z14);
                        }
                        c28655q.m87173q(z14);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    f15 = 0.5f * f19;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    C28655q c28655q4 = c28655q;
                    c0209i6 = c0209i5;
                    AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q4, 0, 3072, 188410);
                    c28655q = c28655q4;
                    if (viewState.m51842c().isEmpty()) {
                        c28655q.m87150e0(727591003);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                        c28655q.m87150e0(-1544986756);
                        it = viewState.m51842c().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        }
                        z15 = true;
                        z16 = false;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    } else {
                        z15 = true;
                        z16 = false;
                        c28655q.m87150e0(727960461);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    interfaceC25312uM51850l = viewState.getTrailing();
                    if (interfaceC25312uM51850l == null) {
                        c28655q.m87150e0(760705572);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(760705573);
                        AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z15);
                    function3 = function4;
                } else {
                    i18 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                interfaceC25312uM51847i = viewState.getLeading();
                if (interfaceC25312uM51847i == null) {
                    c28655q.m87150e0(758398118);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                } else {
                    c28655q.m87150e0(758398119);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                    AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(false);
                }
                interfaceC25312uM51843e = viewState.getEmoji();
                if (interfaceC25312uM51843e != null) {
                    c28655q.m87150e0(758555258);
                    AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(758767298);
                    abstractC22403oM51845g = viewState.getIconImageSource();
                    if (abstractC22403oM51845g == null) {
                        c28655q.m87150e0(758767297);
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c28655q.m87150e0(758767298);
                        float f111 = 4;
                        Modifier modifierM118994r4 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f111));
                        if (viewState.getIconBackgroundEnabled()) {
                            modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                        } else {
                            modifierM3357b = c2314t;
                        }
                        Modifier modifierM3394p4 = AbstractC1099a.m3394p(f14, modifierM118994r4.mo3471e(modifierM3357b));
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m12);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                        AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                        c28655q = c28655q;
                        String strM8299l4 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                        if (viewState.getIconBackgroundEnabled()) {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        }
                        m51826f(abstractC26165aM64500i4, strM8299l4, c17875c1, AbstractC1102d.m3419p(f111 * 6.0f, c2314t), c28655q, 3072, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                f15 = 0.5f * f19;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                C28655q c28655q5 = c28655q;
                c0209i6 = c0209i5;
                AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q5, 0, 3072, 188410);
                c28655q = c28655q5;
                if (viewState.m51842c().isEmpty()) {
                    c28655q.m87150e0(727591003);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                    c28655q.m87150e0(-1544986756);
                    it = viewState.m51842c().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    }
                    z15 = true;
                    z16 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z15 = true;
                    z16 = false;
                    c28655q.m87150e0(727960461);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                interfaceC25312uM51850l = viewState.getTrailing();
                if (interfaceC25312uM51850l == null) {
                    c28655q.m87150e0(760705572);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(760705573);
                    AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z15);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier2 = modifier;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18047b(viewState, function3, modifier2, i13, i14);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87153g(modifier)) {
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
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17650g(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier3);
                genericInteractionM51846h = viewState.getInteraction();
                modifier4 = null;
                if (genericInteractionM51846h == null) {
                    c28655q.m87150e0(-2032076772);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2032076771);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(genericInteractionM51846h);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                    modifier4 = modifierM3362g3;
                }
                if (modifier4 == null) {
                    modifier4 = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM3409f3.mo3471e(modifier4);
                c2306l = C2299e.f9108K;
                float f112 = 8;
                f13 = f112 * 1.0f;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
                modifier = modifier3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i18 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    interfaceC25312uM51847i = viewState.getLeading();
                    if (interfaceC25312uM51847i == null) {
                        c28655q.m87150e0(758398118);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                    } else {
                        c28655q.m87150e0(758398119);
                        c0209i5 = c0209i2;
                        interfaceC17869a1 = null;
                        f14 = f13;
                        AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(false);
                    }
                    interfaceC25312uM51843e = viewState.getEmoji();
                    if (interfaceC25312uM51843e != null) {
                        c28655q.m87150e0(758555258);
                        AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(758767298);
                        abstractC22403oM51845g = viewState.getIconImageSource();
                        if (abstractC22403oM51845g == null) {
                            c28655q.m87150e0(758767297);
                            c28655q.m87173q(false);
                            z14 = false;
                        } else {
                            c28655q.m87150e0(758767298);
                            float f113 = 4;
                            Modifier modifierM118994r5 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f113));
                            if (viewState.getIconBackgroundEnabled()) {
                                modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                            } else {
                                modifierM3357b = c2314t;
                            }
                            Modifier modifierM3394p5 = AbstractC1099a.m3394p(f14, modifierM118994r5.mo3471e(modifierM3357b));
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m16);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                            AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                            c28655q = c28655q;
                            String strM8299l5 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                            if (viewState.getIconBackgroundEnabled()) {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(891355080);
                                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                                z14 = false;
                                c28655q.m87173q(false);
                            }
                            m51826f(abstractC26165aM64500i5, strM8299l5, c17875c1, AbstractC1102d.m3419p(f113 * 6.0f, c2314t), c28655q, 3072, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z14);
                        }
                        c28655q.m87173q(z14);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    f15 = 0.5f * f112;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                    C28655q c28655q6 = c28655q;
                    c0209i6 = c0209i5;
                    AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q6, 0, 3072, 188410);
                    c28655q = c28655q6;
                    if (viewState.m51842c().isEmpty()) {
                        c28655q.m87150e0(727591003);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N18);
                        c28655q.m87150e0(-1544986756);
                        it = viewState.m51842c().iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        }
                        z15 = true;
                        z16 = false;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    } else {
                        z15 = true;
                        z16 = false;
                        c28655q.m87150e0(727960461);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    interfaceC25312uM51850l = viewState.getTrailing();
                    if (interfaceC25312uM51850l == null) {
                        c28655q.m87150e0(760705572);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(760705573);
                        AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z15);
                    function3 = function4;
                } else {
                    i18 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                interfaceC25312uM51847i = viewState.getLeading();
                if (interfaceC25312uM51847i == null) {
                    c28655q.m87150e0(758398118);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                } else {
                    c28655q.m87150e0(758398119);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                    AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(false);
                }
                interfaceC25312uM51843e = viewState.getEmoji();
                if (interfaceC25312uM51843e != null) {
                    c28655q.m87150e0(758555258);
                    AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(758767298);
                    abstractC22403oM51845g = viewState.getIconImageSource();
                    if (abstractC22403oM51845g == null) {
                        c28655q.m87150e0(758767297);
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c28655q.m87150e0(758767298);
                        float f114 = 4;
                        Modifier modifierM118994r6 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f114));
                        if (viewState.getIconBackgroundEnabled()) {
                            modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                        } else {
                            modifierM3357b = c2314t;
                        }
                        Modifier modifierM3394p6 = AbstractC1099a.m3394p(f14, modifierM118994r6.mo3471e(modifierM3357b));
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m19);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
                        AbstractC26165a abstractC26165aM64500i6 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                        c28655q = c28655q;
                        String strM8299l6 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                        if (viewState.getIconBackgroundEnabled()) {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        }
                        m51826f(abstractC26165aM64500i6, strM8299l6, c17875c1, AbstractC1102d.m3419p(f114 * 6.0f, c2314t), c28655q, 3072, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                f15 = 0.5f * f112;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
                C28655q c28655q7 = c28655q;
                c0209i6 = c0209i5;
                AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q7, 0, 3072, 188410);
                c28655q = c28655q7;
                if (viewState.m51842c().isEmpty()) {
                    c28655q.m87150e0(727591003);
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
                    c28655q.m87150e0(-1544986756);
                    it = viewState.m51842c().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    }
                    z15 = true;
                    z16 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z15 = true;
                    z16 = false;
                    c28655q.m87150e0(727960461);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                interfaceC25312uM51850l = viewState.getTrailing();
                if (interfaceC25312uM51850l == null) {
                    c28655q.m87150e0(760705572);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(760705573);
                    AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z15);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier2 = modifier;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18047b(viewState, function3, modifier2, i13, i14);
            }
        }
        i15 |= 384;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17650g(21);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier3);
            genericInteractionM51846h = viewState.getInteraction();
            modifier4 = null;
            if (genericInteractionM51846h == null) {
                c28655q.m87150e0(-2032076772);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2032076771);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(genericInteractionM51846h);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11161b(function4, genericInteractionM51846h, 3);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
                modifier4 = modifierM3362g4;
            }
            if (modifier4 == null) {
                modifier4 = c2314t;
            }
            Modifier modifierMo3471e4 = modifierM3409f4.mo3471e(modifier4);
            c2306l = C2299e.f9108K;
            float f115 = 8;
            f13 = f115 * 1.0f;
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
            modifier = modifier3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i18 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                interfaceC25312uM51847i = viewState.getLeading();
                if (interfaceC25312uM51847i == null) {
                    c28655q.m87150e0(758398118);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                } else {
                    c28655q.m87150e0(758398119);
                    c0209i5 = c0209i2;
                    interfaceC17869a1 = null;
                    f14 = f13;
                    AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(false);
                }
                interfaceC25312uM51843e = viewState.getEmoji();
                if (interfaceC25312uM51843e != null) {
                    c28655q.m87150e0(758555258);
                    AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(758767298);
                    abstractC22403oM51845g = viewState.getIconImageSource();
                    if (abstractC22403oM51845g == null) {
                        c28655q.m87150e0(758767297);
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c28655q.m87150e0(758767298);
                        float f116 = 4;
                        Modifier modifierM118994r7 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f116));
                        if (viewState.getIconBackgroundEnabled()) {
                            modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                        } else {
                            modifierM3357b = c2314t;
                        }
                        Modifier modifierM3394p7 = AbstractC1099a.m3394p(f14, modifierM118994r7.mo3471e(modifierM3357b));
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N113);
                        AbstractC26165a abstractC26165aM64500i7 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                        c28655q = c28655q;
                        String strM8299l7 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                        if (viewState.getIconBackgroundEnabled()) {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(891355080);
                            c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                            z14 = false;
                            c28655q.m87173q(false);
                        }
                        m51826f(abstractC26165aM64500i7, strM8299l7, c17875c1, AbstractC1102d.m3419p(f116 * 6.0f, c2314t), c28655q, 3072, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                f15 = 0.5f * f115;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N114);
                C28655q c28655q8 = c28655q;
                c0209i6 = c0209i5;
                AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q8, 0, 3072, 188410);
                c28655q = c28655q8;
                if (viewState.m51842c().isEmpty()) {
                    c28655q.m87150e0(727591003);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N115);
                    c28655q.m87150e0(-1544986756);
                    it = viewState.m51842c().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    }
                    z15 = true;
                    z16 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    z15 = true;
                    z16 = false;
                    c28655q.m87150e0(727960461);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                interfaceC25312uM51850l = viewState.getTrailing();
                if (interfaceC25312uM51850l == null) {
                    c28655q.m87150e0(760705572);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(760705573);
                    AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z15);
                function3 = function4;
            } else {
                i18 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
            interfaceC25312uM51847i = viewState.getLeading();
            if (interfaceC25312uM51847i == null) {
                c28655q.m87150e0(758398118);
                c28655q.m87173q(false);
                c0209i5 = c0209i2;
                interfaceC17869a1 = null;
                f14 = f13;
            } else {
                c28655q.m87150e0(758398119);
                c0209i5 = c0209i2;
                interfaceC17869a1 = null;
                f14 = f13;
                AbstractC25303l.m74291r(interfaceC25312uM51847i, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                c28655q.m87173q(false);
            }
            interfaceC25312uM51843e = viewState.getEmoji();
            if (interfaceC25312uM51843e != null) {
                c28655q.m87150e0(758555258);
                AbstractC25303l.m74291r(interfaceC25312uM51843e, null, new C15786e(6), function4, c28655q, (i18 << 6) & 7168, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(758767298);
                abstractC22403oM51845g = viewState.getIconImageSource();
                if (abstractC22403oM51845g == null) {
                    c28655q.m87150e0(758767297);
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    c28655q.m87150e0(758767298);
                    float f117 = 4;
                    Modifier modifierM118994r8 = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2.0f * f117));
                    if (viewState.getIconBackgroundEnabled()) {
                        modifierM3357b = AbstractC1092a.m3357b(c2314t, f70076c, interfaceC17869a1, 0.0f, 6);
                    } else {
                        modifierM3357b = c2314t;
                    }
                    Modifier modifierM3394p8 = AbstractC1099a.m3394p(f14, modifierM118994r8.mo3471e(modifierM3357b));
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, r2, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N116);
                    AbstractC26165a abstractC26165aM64500i8 = AbstractC22404p.m64500i(abstractC22403oM51845g, null, null, c28655q, 0, 3);
                    c28655q = c28655q;
                    String strM8299l8 = AbstractC2875y.m8299l(viewState.getTitle(), " icon");
                    if (viewState.getIconBackgroundEnabled()) {
                        c28655q.m87150e0(891355080);
                        c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(891355080);
                        c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                        z14 = false;
                        c28655q.m87173q(false);
                    }
                    m51826f(abstractC26165aM64500i8, strM8299l8, c17875c1, AbstractC1102d.m3419p(f117 * 6.0f, c2314t), c28655q, 3072, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            f15 = 0.5f * f115;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, r2, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m117);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N117);
            C28655q c28655q9 = c28655q;
            c0209i6 = c0209i5;
            AbstractC30795n.m94707h(viewState.getTitle(), null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, EnumC2888c.INSTANCE.m8402a(viewState.getTitleTypography()), null, c28655q9, 0, 3072, 188410);
            c28655q = c28655q9;
            if (viewState.m51842c().isEmpty()) {
                c28655q.m87150e0(727591003);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N118);
                c28655q.m87150e0(-1544986756);
                it = viewState.m51842c().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                }
                z15 = true;
                z16 = false;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                z15 = true;
                z16 = false;
                c28655q.m87150e0(727960461);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            interfaceC25312uM51850l = viewState.getTrailing();
            if (interfaceC25312uM51850l == null) {
                c28655q.m87150e0(760705572);
                c28655q.m87173q(z16);
            } else {
                c28655q.m87150e0(760705573);
                AbstractC25303l.m74291r(interfaceC25312uM51850l, null, null, function4, c28655q, (i18 << 6) & 7168, 6);
                c28655q.m87173q(z16);
            }
            c28655q.m87173q(z15);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier2 = modifier;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18047b(viewState, function3, modifier2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51829i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51830j(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Modifier m51831k(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-480433622);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 8 * 0.5f, 0.0f, 11);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51832l(C18052g c18052g, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m51828h(c18052g, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final C18052g m51833m(String str, String title, EnumC2888c titleTypography, InterfaceC25312u interfaceC25312u, AbstractC22403o abstractC22403o, List<? extends InterfaceC25312u> description, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, boolean z4, boolean z13, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        AbstractC22676k.m65750j(description, "description");
        return new C18052g(str, title, titleTypography, interfaceC25312u, abstractC22403o, description, interfaceC25312u2, interfaceC25312u3, z4, z13, genericInteraction);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C18052g m51834n(String str, String str2, EnumC2888c enumC2888c, InterfaceC25312u interfaceC25312u, AbstractC22403o abstractC22403o, List list, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, boolean z4, boolean z13, GenericInteraction genericInteraction, int i13, Object obj) {
        List listM118959K;
        String str3 = (i13 & 1) != 0 ? null : str;
        String str4 = (i13 & 2) != 0 ? "ZONE 2 RUN" : str2;
        EnumC2888c enumC2888c2 = (i13 & 4) != 0 ? EnumC2888c.SH4 : enumC2888c;
        InterfaceC25312u c17750h1 = (i13 & 8) != 0 ? new C17750h1(AbstractC8693b.m21278l("NEW"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null) : interfaceC25312u;
        AbstractC22403o aVar = (i13 & 16) != 0 ? new AbstractC22403o.a(C38072d.f163053a.m121951d().getActivities().getRunning()) : abstractC22403o;
        if ((i13 & 32) != 0) {
            listM118959K = AbstractC37056f.m118959K(new C17750h1(AbstractC8693b.m21278l("45 MIN"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), new C33169c0("**Zone 2** pace", EnumC2888c.B4, EnumC39333f.BRAND_WHITE, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null));
        } else {
            listM118959K = list;
        }
        InterfaceC25312u c17750h2 = (i13 & 64) != 0 ? new C17750h1(AbstractC8693b.m21278l("GO"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null) : interfaceC25312u2;
        InterfaceC25312u interfaceC25312u4 = (i13 & 128) != 0 ? null : interfaceC25312u3;
        boolean z14 = (i13 & 256) == 0 ? z4 : false;
        boolean z15 = (i13 & 512) == 0 ? z13 : true;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            genericInteraction = null;
        }
        return m51833m(str3, str4, enumC2888c2, c17750h1, aVar, listM118959K, c17750h2, interfaceC25312u4, z14, z15, genericInteraction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final C18052g m51835o(String recommendationId, String title, boolean z4, boolean z13, boolean z14, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(title, "title");
        C33082e c33082e = new C33082e("select-".concat(recommendationId), "", z4, AbstractC33088k.c.f137984b, null, 0, null, 80, null);
        Object[] objArr = null == true ? 1 : 0;
        return m51834n(null, title, null, c33082e, null, AbstractC37056f.m118958J(new C33169c0("Moderate · **7.3** Strain", EnumC2888c.B4, EnumC39333f.WHITE_70, 5, null, null == true ? 1 : 0, null, objArr, false, null, MessageListItemViewType.GIPHY, null)), new C27264l(null, z13 ? EnumC16313m0.CARET_UP : EnumC16313m0.CARET_DOWN, null, false, AbstractC18249c.m52575m(EnumC39333f.TRANSPARENT), null, 45, null), interfaceC25312u, z4, z14, null, 1045, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C18052g m51836p(String str, String str2, boolean z4, boolean z13, boolean z14, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "sample-recommendation-list-row";
        }
        if ((i13 & 2) != 0) {
            str2 = "STRENGTH TRAINING";
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        if ((i13 & 16) != 0) {
            z14 = true;
        }
        if ((i13 & 32) != 0) {
            interfaceC25312u = null;
        }
        InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
        boolean z15 = z14;
        boolean z16 = z13;
        return m51835o(str, str2, z4, z16, z15, interfaceC25312u2);
    }
}
