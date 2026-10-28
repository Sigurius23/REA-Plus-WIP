package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.items.ArticleTileModelEvent;
import h51.C16934f;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22405q;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p133f1.AbstractC13994y0;
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
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.i3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "text", "", "Lm91/u;", "items", "", "isSuggestion", "messageId", "Ll83/a0;", "f", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "imageUrl", "startAnimation", "", "alpha", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32623i3 {

    /* JADX INFO: renamed from: sl0.i3$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.UserQuestionMessageKt$UserQuestionMessage$2$1", m100430f = "UserQuestionMessage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135218w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Boolean f135219x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f135220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135219x = bool;
            this.f135220y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135219x, this.f135220y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135218w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(this.f135219x, Boolean.TRUE)) {
                AbstractC32623i3.m101878l(this.f135220y, true);
            } else {
                AbstractC32623i3.m101878l(this.f135220y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x022b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0239  */
    /* JADX WARN: Code duplicated, block: B:117:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x027b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0288  */
    /* JADX WARN: Code duplicated, block: B:126:0x029d  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0146  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x016e  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bf  */
    /* JADX INFO: renamed from: f */
    public static final void m101872f(String text, List<? extends InterfaceC25312u> list, Boolean bool, String str, Composer composer, int i13, int i14) {
        List<? extends InterfaceC25312u> list2;
        int i15;
        Boolean bool2;
        int i16;
        int i17;
        String str2;
        int i18;
        boolean z4;
        List<? extends InterfaceC25312u> list3;
        Boolean bool3;
        String str3;
        C28677v1 c28677v1M87180u;
        List<? extends InterfaceC25312u> list4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        String strM101873g;
        Object objM87133R2;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        float f13;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        boolean z16;
        boolean zM87153g;
        Object objM87133R4;
        float fM101879m;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        Object objM87133R5;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c4;
        int iHashCode2;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1398649450);
        int i24 = (i13 & 6) == 0 ? (c28655q.m87153g(text) ? 4 : 2) | i13 : i13;
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                list2 = list;
                i24 |= c28655q.m87157i(list2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    bool2 = bool;
                    if (c28655q.m87153g(bool2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i24 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i18 = 2048;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i24 |= i18;
                    }
                    if ((i24 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i24 & 1, z4)) {
                        if (i25 != 0) {
                            list4 = C25271y.f99162w;
                        } else {
                            list4 = list2;
                        }
                        if (i15 != 0) {
                            bool3 = Boolean.FALSE;
                        } else {
                            bool3 = bool2;
                        }
                        if (i17 != 0) {
                            str2 = null;
                        }
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        strM101873g = m101873g(interfaceC28601c1);
                        if (strM101873g == null) {
                            c28655q.m87150e0(-1687807717);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1687807716);
                            AbstractC22403o.c cVar = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32586b1(10, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC22405q.m64507d(cVar, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                            c28655q.m87173q(false);
                        }
                        if ((i24 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i19 = i24 & 896;
                        if (i19 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R3 = c28655q.m87133R();
                        if (z15 || objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        if (m101877k(interfaceC28601c2)) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        String str4 = str2;
                        interfaceC28601c3 = interfaceC28601c1;
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                        if (i19 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g || objM87133R4 == c28676v0) {
                            objM87133R4 = new a(bool3, interfaceC28601c2, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                        if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                            fM101879m = m101879m(interfaceC28670t2M30588b);
                        } else {
                            fM101879m = 1.0f;
                        }
                        c2314t = C2314t.f9131w;
                        float f14 = 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f14, ((float) 3.5d) * f14, 1 * f14, 0.0f, 8);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        if (text.length() > 0) {
                            c28655q.m87150e0(-743183690);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                            AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-742249598);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87150e0(-578131894);
                        for (InterfaceC25312u interfaceC25312u : list4) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C32618h3(0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            C25307p c25307pM74306g = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c3;
                                objM87133R6 = new C32614h(7, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                interfaceC28601c4 = interfaceC28601c3;
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                            interfaceC28601c3 = interfaceC28601c4;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        list3 = list4;
                        str3 = str4;
                    } else {
                        c28655q.m87138X();
                        list3 = list2;
                        bool3 = bool2;
                        str3 = str2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
                    }
                }
                i24 |= 3072;
                str2 = str;
                if ((i24 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        bool3 = Boolean.FALSE;
                    } else {
                        bool3 = bool2;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    strM101873g = m101873g(interfaceC28601c1);
                    if (strM101873g == null) {
                        c28655q.m87150e0(-1687807717);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1687807716);
                        AbstractC22403o.c cVar2 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(10, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22405q.m64507d(cVar2, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                        c28655q.m87173q(false);
                    }
                    if ((i24 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i24 & 896;
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m101877k(interfaceC28601c2)) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    String str5 = str2;
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                    if (i19 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str5, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                    if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                        fM101879m = m101879m(interfaceC28670t2M30588b);
                    } else {
                        fM101879m = 1.0f;
                    }
                    c2314t = C2314t.f9131w;
                    float f15 = 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f15, ((float) 3.5d) * f15, 1 * f15, 0.0f, 8);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    if (text.length() > 0) {
                        c28655q.m87150e0(-743183690);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-742249598);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(-578131894);
                    while (r0.hasNext()) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32618h3(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        C25307p c25307pM74306g2 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R6 = new C32614h(7, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g2, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                        interfaceC28601c3 = interfaceC28601c4;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    list3 = list4;
                    str3 = str5;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    bool3 = bool2;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
                }
            }
            i24 |= 384;
            bool2 = bool;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i18 = 2048;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i24 |= i18;
                }
                if ((i24 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        bool3 = Boolean.FALSE;
                    } else {
                        bool3 = bool2;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    strM101873g = m101873g(interfaceC28601c1);
                    if (strM101873g == null) {
                        c28655q.m87150e0(-1687807717);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1687807716);
                        AbstractC22403o.c cVar3 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(10, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22405q.m64507d(cVar3, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                        c28655q.m87173q(false);
                    }
                    if ((i24 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i24 & 896;
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m101877k(interfaceC28601c2)) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    String str6 = str2;
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                    if (i19 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str6, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                    if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                        fM101879m = m101879m(interfaceC28670t2M30588b);
                    } else {
                        fM101879m = 1.0f;
                    }
                    c2314t = C2314t.f9131w;
                    float f16 = 8;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f16, ((float) 3.5d) * f16, 1 * f16, 0.0f, 8);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    if (text.length() > 0) {
                        c28655q.m87150e0(-743183690);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-742249598);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(-578131894);
                    while (r0.hasNext()) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32618h3(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        C25307p c25307pM74306g3 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R6 = new C32614h(7, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g3, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                        interfaceC28601c3 = interfaceC28601c4;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    list3 = list4;
                    str3 = str6;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    bool3 = bool2;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
                }
            }
            i24 |= 3072;
            str2 = str;
            if ((i24 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    bool3 = Boolean.FALSE;
                } else {
                    bool3 = bool2;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                strM101873g = m101873g(interfaceC28601c1);
                if (strM101873g == null) {
                    c28655q.m87150e0(-1687807717);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1687807716);
                    AbstractC22403o.c cVar4 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(10, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC22405q.m64507d(cVar4, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                    c28655q.m87173q(false);
                }
                if ((i24 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i19 = i24 & 896;
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m101877k(interfaceC28601c2)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                String str7 = str2;
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                if (i19 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(str7, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                    fM101879m = m101879m(interfaceC28670t2M30588b);
                } else {
                    fM101879m = 1.0f;
                }
                c2314t = C2314t.f9131w;
                float f17 = 8;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f17, ((float) 3.5d) * f17, 1 * f17, 0.0f, 8);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                if (text.length() > 0) {
                    c28655q.m87150e0(-743183690);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-742249598);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(-578131894);
                while (r0.hasNext()) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32618h3(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C25307p c25307pM74306g4 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R6 = new C32614h(7, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g4, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                    interfaceC28601c3 = interfaceC28601c4;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                list3 = list4;
                str3 = str7;
            } else {
                c28655q.m87138X();
                list3 = list2;
                bool3 = bool2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
            }
        }
        i24 |= 48;
        list2 = list;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                bool2 = bool;
                if (c28655q.m87153g(bool2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i24 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i18 = 2048;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i24 |= i18;
                }
                if ((i24 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i25 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        bool3 = Boolean.FALSE;
                    } else {
                        bool3 = bool2;
                    }
                    if (i17 != 0) {
                        str2 = null;
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    strM101873g = m101873g(interfaceC28601c1);
                    if (strM101873g == null) {
                        c28655q.m87150e0(-1687807717);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1687807716);
                        AbstractC22403o.c cVar5 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(10, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22405q.m64507d(cVar5, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                        c28655q.m87173q(false);
                    }
                    if ((i24 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i24 & 896;
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m101877k(interfaceC28601c2)) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    String str8 = str2;
                    interfaceC28601c3 = interfaceC28601c1;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                    if (i19 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(bool3, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str8, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                    if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                        fM101879m = m101879m(interfaceC28670t2M30588b);
                    } else {
                        fM101879m = 1.0f;
                    }
                    c2314t = C2314t.f9131w;
                    float f18 = 8;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f18, ((float) 3.5d) * f18, 1 * f18, 0.0f, 8);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                    if (text.length() > 0) {
                        c28655q.m87150e0(-743183690);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                        AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-742249598);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(-578131894);
                    while (r0.hasNext()) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32618h3(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        C25307p c25307pM74306g5 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R6 = new C32614h(7, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g5, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                        interfaceC28601c3 = interfaceC28601c4;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    list3 = list4;
                    str3 = str8;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    bool3 = bool2;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
                }
            }
            i24 |= 3072;
            str2 = str;
            if ((i24 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    bool3 = Boolean.FALSE;
                } else {
                    bool3 = bool2;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                strM101873g = m101873g(interfaceC28601c1);
                if (strM101873g == null) {
                    c28655q.m87150e0(-1687807717);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1687807716);
                    AbstractC22403o.c cVar6 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(10, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC22405q.m64507d(cVar6, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                    c28655q.m87173q(false);
                }
                if ((i24 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i19 = i24 & 896;
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m101877k(interfaceC28601c2)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                String str9 = str2;
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                if (i19 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(str9, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                    fM101879m = m101879m(interfaceC28670t2M30588b);
                } else {
                    fM101879m = 1.0f;
                }
                c2314t = C2314t.f9131w;
                float f19 = 8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f19, ((float) 3.5d) * f19, 1 * f19, 0.0f, 8);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                if (text.length() > 0) {
                    c28655q.m87150e0(-743183690);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-742249598);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(-578131894);
                while (r0.hasNext()) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32618h3(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C25307p c25307pM74306g6 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R6 = new C32614h(7, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g6, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                    interfaceC28601c3 = interfaceC28601c4;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                list3 = list4;
                str3 = str9;
            } else {
                c28655q.m87138X();
                list3 = list2;
                bool3 = bool2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
            }
        }
        i24 |= 384;
        bool2 = bool;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i24 |= i18;
            }
            if ((i24 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i25 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    bool3 = Boolean.FALSE;
                } else {
                    bool3 = bool2;
                }
                if (i17 != 0) {
                    str2 = null;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                strM101873g = m101873g(interfaceC28601c1);
                if (strM101873g == null) {
                    c28655q.m87150e0(-1687807717);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1687807716);
                    AbstractC22403o.c cVar7 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(10, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC22405q.m64507d(cVar7, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                    c28655q.m87173q(false);
                }
                if ((i24 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i19 = i24 & 896;
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m101877k(interfaceC28601c2)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                String str10 = str2;
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
                if (i19 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(bool3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(str10, bool3, (InterfaceC4351m) objM87133R4, c28655q);
                if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                    fM101879m = m101879m(interfaceC28670t2M30588b);
                } else {
                    fM101879m = 1.0f;
                }
                c2314t = C2314t.f9131w;
                float f110 = 8;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f110, ((float) 3.5d) * f110, 1 * f110, 0.0f, 8);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                if (text.length() > 0) {
                    c28655q.m87150e0(-743183690);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                    AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-742249598);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(-578131894);
                while (r0.hasNext()) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32618h3(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C25307p c25307pM74306g7 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R6 = new C32614h(7, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g7, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                    interfaceC28601c3 = interfaceC28601c4;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                list3 = list4;
                str3 = str10;
            } else {
                c28655q.m87138X();
                list3 = list2;
                bool3 = bool2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
            }
        }
        i24 |= 3072;
        str2 = str;
        if ((i24 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            if (i25 != 0) {
                list4 = C25271y.f99162w;
            } else {
                list4 = list2;
            }
            if (i15 != 0) {
                bool3 = Boolean.FALSE;
            } else {
                bool3 = bool2;
            }
            if (i17 != 0) {
                str2 = null;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            strM101873g = m101873g(interfaceC28601c1);
            if (strM101873g == null) {
                c28655q.m87150e0(-1687807717);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1687807716);
                AbstractC22403o.c cVar8 = new AbstractC22403o.c(strM101873g, 0, 0, 0, 14, null);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32586b1(10, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22405q.m64507d(cVar8, (InterfaceC4339a) objM87133R2, c28655q, AbstractC22403o.c.f87642f | 48);
                c28655q.m87173q(false);
            }
            if ((i24 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            i19 = i24 & 896;
            if (i19 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            if (m101877k(interfaceC28601c2)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            String str11 = str2;
            interfaceC28601c3 = interfaceC28601c1;
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "fadeIn", null, c28655q, 3120, 20);
            if (i19 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87153g = z16 | c28655q.m87153g(interfaceC28601c2);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R4 = new a(bool3, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(bool3, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(str11, bool3, (InterfaceC4351m) objM87133R4, c28655q);
            if (AbstractC22676k.m65745e(bool3, Boolean.TRUE)) {
                fM101879m = m101879m(interfaceC28670t2M30588b);
            } else {
                fM101879m = 1.0f;
            }
            c2314t = C2314t.f9131w;
            float f111 = 8;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(fM101879m, c2314t)), ((float) 8.5d) * f111, ((float) 3.5d) * f111, 1 * f111, 0.0f, 8);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
            if (text.length() > 0) {
                c28655q.m87150e0(-743183690);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                AbstractC13994y0.m39815d(null, AbstractC37817c.m121344e(1170149054, c28655q, new C32609g(text, 3)), c28655q, 48);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-742249598);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-578131894);
            while (r0.hasNext()) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32618h3(0);
                    c28655q.m87172p0(objM87133R5);
                }
                C25307p c25307pM74306g8 = Function1.m74306g((p715kotlin.jvm.functions.Function1) objM87133R5);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R6 = new C32614h(7, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g8, null, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                interfaceC28601c3 = interfaceC28601c4;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            list3 = list4;
            str3 = str11;
        } else {
            c28655q.m87138X();
            list3 = list2;
            bool3 = bool2;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(text, list3, bool3, str3, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final String m101873g(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101874h(String str, List list, Boolean bool, String str2, int i13, int i14, Composer composer, int i15) {
        m101872f(str, list, bool, str2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m101875i(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m101876j(InterfaceC28601c1 interfaceC28601c1) {
        m101875i(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m101877k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m101878l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: m */
    private static final float m101879m(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m101880n(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125370W0 = c38072d.m121949b(c28655q, i14).getWhite10();
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC11895b.m31987f(3, 4, c2314t, jM125370W0), ((float) 1.5d) * f13, 1 * f13);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            AbstractC30795n.m94707h(str, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m101881o(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74323b(AbstractC32640m0.m102010c());
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16934f.class), new C32691x0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m101882p(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof ArticleTileModelEvent.Image) {
            m101875i(interfaceC28601c1, ((ArticleTileModelEvent.Image) it).getImageUrl());
        }
        return C23454a0.f92919a;
    }
}
