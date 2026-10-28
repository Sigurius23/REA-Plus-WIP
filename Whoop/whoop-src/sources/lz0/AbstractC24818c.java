package lz0;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import e61.C12769l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import kw1.C22852c;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17916v0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import s21.EnumC32086i;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\r*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls21/i;", "type", "", "Llz0/a;", "progressBars", "Llz0/b;", "labels", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Llz0/d;", "Ly81/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Llz0/d;)Ly81/f;", "Llz0/g;", "i", "(Llz0/g;)Ly81/f;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24818c {

    /* JADX INFO: renamed from: lz0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f97156w = new a();

        /* JADX INFO: renamed from: a */
        public final long m72734a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m72734a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lz0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97157a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f97158b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f97159c;

        static {
            int[] iArr = new int[EnumC32086i.values().length];
            try {
                iArr[EnumC32086i.STEP_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32086i.PROGRESS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97157a = iArr;
            int[] iArr2 = new int[EnumC24819d.values().length];
            try {
                iArr2[EnumC24819d.PREGNANCY_FIRST_TRIMESTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC24819d.PREGNANCY_SECOND_TRIMESTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC24819d.PREGNANCY_THIRD_TRIMESTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC24819d.PREGNANCY_POST_PARTUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC24819d.NO_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC24819d.INACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f97158b = iArr2;
            int[] iArr3 = new int[EnumC24822g.values().length];
            try {
                iArr3[EnumC24822g.FIRST_TRIMESTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC24822g.SECOND_TRIMESTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC24822g.THIRD_TRIMESTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC24822g.POST_PARTUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC24822g.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f97159c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x030e  */
    /* JADX WARN: Code duplicated, block: B:112:0x033e  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:121:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x026d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0289  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m72728d(Modifier modifier, EnumC32086i enumC32086i, List<C24816a> progressBars, List<C24817b> list, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Object obj;
        int i16;
        int i17;
        boolean z4;
        EnumC32086i enumC32086i2;
        Modifier modifier3;
        Object obj2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        EnumC32086i enumC32086i3;
        Object obj3;
        float f13;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        Iterator<T> it;
        boolean zHasNext;
        C17916v0 c17916v0;
        Object obj4;
        int i18;
        boolean z13;
        C28655q c28655q2;
        int i19;
        Object objM87133R;
        C28655q c28655q3;
        C24816a c24816a;
        long jMo134584toComposableColorWaAFU9c;
        int i24;
        long j7;
        long jM51541c;
        C2314t c2314t2;
        float f14;
        int i25;
        float fMo743q0;
        float fMo743q1;
        Object objM87133R2;
        long jMo134584toComposableColorWaAFU9c2;
        boolean zM87151f;
        Object objM87133R3;
        AbstractC22676k.m65750j(progressBars, "progressBars");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1071448741);
        int i26 = i14 & 1;
        int i27 = 2;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87149e(enumC32086i == null ? -1 : enumC32086i.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87157i(progressBars) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                obj = list;
                i15 |= c28655q4.m87157i(obj) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = 0;
            i17 = 1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    enumC32086i3 = EnumC32086i.STEP_BAR;
                } else {
                    enumC32086i3 = enumC32086i;
                }
                if (i29 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                f13 = 4;
                Modifier modifierM3411h = AbstractC1102d.m3411h(13 * f13, modifier3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                c28655q4.m87150e0(147970917);
                it = progressBars.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c17916v0 = AbstractC17918w0.f69621a;
                    obj4 = C28635l.f115821a;
                    i18 = 6;
                    if (zHasNext) {
                        z13 = i16;
                        c28655q4.m87173q(z13);
                        if (obj3 == null) {
                            c28655q4.m87150e0(294500524);
                            c28655q4.m87173q(z13);
                            c28655q3 = c28655q4;
                        } else {
                            c28655q4.m87150e0(294500525);
                            c28655q2 = c28655q4;
                            for (C24817b c24817b : (Iterable) obj3) {
                                if (c24817b.getShowMarker()) {
                                    c28655q2.m87150e0(-1823805037);
                                    Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t, c24817b.getPosition() - ((2 - AbstractC8693b.m21274h(c24817b.getLabel(), c28655q2, 0).length()) * 0.01f), 0.4f, new C29007a(0.0f, 0.0f, false, false, 12, null));
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == obj4) {
                                        objM87133R = new C24174a(28);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    i19 = 0;
                                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(((float) 2.25d) * f13, AbstractC1125a.m3478a(modifierM88149j, (Function1) objM87133R)), AbstractC33253j.f138651a), EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, i18), c17916v0), c28655q2, 0);
                                    c28655q2.m87173q(false);
                                } else {
                                    i19 = 0;
                                    c28655q2.m87150e0(-1822894009);
                                    c28655q2.m87173q(false);
                                }
                                C28655q c28655q5 = c28655q2;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c24817b.getLabel(), c28655q2, i19), AbstractC29011e.m88145f(c2314t, c24817b.getPosition(), 0.7f, 0.0f, 0.0f, null, 28, null), c24817b.getColor().mo134584toComposableColorWaAFU9c(c28655q2, i19), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, i18).getN10(), null, c28655q5, 0, 0, 196600);
                                c2314t = c2314t;
                                c28655q2 = c28655q5;
                                c17916v0 = c17916v0;
                                i18 = i18;
                                obj4 = obj4;
                            }
                            C28655q c28655q6 = c28655q2;
                            c28655q6.m87173q(false);
                            c28655q3 = c28655q6;
                        }
                        c28655q3.m87173q(true);
                        enumC32086i2 = enumC32086i3;
                        obj2 = obj3;
                        c28655q = c28655q3;
                        break;
                    }
                    c24816a = (C24816a) it.next();
                    jMo134584toComposableColorWaAFU9c = c24816a.getColor().mo134584toComposableColorWaAFU9c(c28655q4, i16);
                    i24 = b.f97157a[enumC32086i3.ordinal()];
                    if (i24 != i17) {
                        c28655q4.m87150e0(1530818030);
                        c28655q4.m87173q(false);
                        if (c24816a.getCurrentValue() != null) {
                            jM51541c = C17919x.m51541c(0.3f, jMo134584toComposableColorWaAFU9c);
                        } else {
                            j7 = jMo134584toComposableColorWaAFU9c;
                        }
                        c2314t2 = c2314t;
                        f14 = ((float) 0.5d) * f13;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getRangeMax() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), j7, c17916v0), c28655q4, 0);
                        if (c24816a.getCurrentValue() == null) {
                            c28655q4.m87150e0(211479229);
                            c28655q4.m87173q(false);
                            c2314t = c2314t2;
                        } else {
                            c28655q4.m87150e0(211479230);
                            c2314t = c2314t2;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getCurrentValue().floatValue() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q4, 0);
                            c28655q4.m87173q(false);
                        }
                        if (c24816a.getShowAnnotation()) {
                            c28655q4.m87150e0(212113552);
                            AbstractC28669t1 abstractC28669t1 = AbstractC2453v1.f9569h;
                            fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t1)).mo743q0(f13);
                            fMo743q1 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t1)).mo743q0(2);
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == obj4) {
                                objM87133R2 = a.f97156w;
                                c28655q4.m87172p0(objM87133R2);
                            }
                            jMo134584toComposableColorWaAFU9c2 = p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q4, 0);
                            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC29011e.m88145f(c2314t, c24816a.getRangeMax(), 0.1f, 0.0f, 0.28f, null, 20, null));
                            zM87151f = c28655q4.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q4.m87147d(fMo743q0) | c28655q4.m87147d(fMo743q1);
                            objM87133R3 = c28655q4.m87133R();
                            if (zM87151f || objM87133R3 == obj4) {
                                objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            i25 = 0;
                            AbstractC21478l0.m60421a(modifierM3424u, (Function1) objM87133R3, c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            i25 = 0;
                            c28655q4.m87150e0(212906377);
                            c28655q4.m87173q(false);
                        }
                        i16 = i25;
                        i27 = 2;
                        i17 = 1;
                    } else {
                        if (i24 == i27) {
                            throw AbstractC11895b.m32003v(1530816307, c28655q4, false);
                        }
                        c28655q4.m87150e0(1530823020);
                        jM51541c = EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q4, 6);
                        c28655q4.m87173q(false);
                    }
                    j7 = jM51541c;
                    c2314t2 = c2314t;
                    f14 = ((float) 0.5d) * f13;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getRangeMax() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), j7, c17916v0), c28655q4, 0);
                    if (c24816a.getCurrentValue() == null) {
                        c28655q4.m87150e0(211479229);
                        c28655q4.m87173q(false);
                        c2314t = c2314t2;
                    } else {
                        c28655q4.m87150e0(211479230);
                        c2314t = c2314t2;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getCurrentValue().floatValue() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q4, 0);
                        c28655q4.m87173q(false);
                    }
                    if (c24816a.getShowAnnotation()) {
                        c28655q4.m87150e0(212113552);
                        AbstractC28669t1 abstractC28669t2 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t2)).mo743q0(f13);
                        fMo743q1 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t2)).mo743q0(2);
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == obj4) {
                            objM87133R2 = a.f97156w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        jMo134584toComposableColorWaAFU9c2 = p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q4, 0);
                        Modifier modifierM3424u2 = AbstractC1102d.m3424u(f13, AbstractC29011e.m88145f(c2314t, c24816a.getRangeMax(), 0.1f, 0.0f, 0.28f, null, 20, null));
                        zM87151f = c28655q4.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q4.m87147d(fMo743q0) | c28655q4.m87147d(fMo743q1);
                        objM87133R3 = c28655q4.m87133R();
                        if (zM87151f) {
                            objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        i25 = 0;
                        AbstractC21478l0.m60421a(modifierM3424u2, (Function1) objM87133R3, c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        i25 = 0;
                        c28655q4.m87150e0(212906377);
                        c28655q4.m87173q(false);
                    }
                    i16 = i25;
                    i27 = 2;
                    i17 = 1;
                }
            } else {
                C28655q c28655q7 = c28655q4;
                c28655q7.m87138X();
                enumC32086i2 = enumC32086i;
                modifier3 = modifier2;
                obj2 = obj;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(modifier3, enumC32086i2, progressBars, obj2, i13, i14, 11);
            }
        }
        i15 |= 3072;
        obj = list;
        i16 = 0;
        i17 = 1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i28 != 0) {
                enumC32086i3 = EnumC32086i.STEP_BAR;
            } else {
                enumC32086i3 = enumC32086i;
            }
            if (i29 != 0) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            f13 = 4;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(13 * f13, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3411h2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
            c28655q4.m87150e0(147970917);
            it = progressBars.iterator();
            while (true) {
                zHasNext = it.hasNext();
                c17916v0 = AbstractC17918w0.f69621a;
                obj4 = C28635l.f115821a;
                i18 = 6;
                if (zHasNext) {
                    z13 = i16;
                    c28655q4.m87173q(z13);
                    if (obj3 == null) {
                        c28655q4.m87150e0(294500524);
                        c28655q4.m87173q(z13);
                        c28655q3 = c28655q4;
                    } else {
                        c28655q4.m87150e0(294500525);
                        c28655q2 = c28655q4;
                        while (r4.hasNext()) {
                            if (c24817b.getShowMarker()) {
                                c28655q2.m87150e0(-1823805037);
                                Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t, c24817b.getPosition() - ((2 - AbstractC8693b.m21274h(c24817b.getLabel(), c28655q2, 0).length()) * 0.01f), 0.4f, new C29007a(0.0f, 0.0f, false, false, 12, null));
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == obj4) {
                                    objM87133R = new C24174a(28);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                i19 = 0;
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(((float) 2.25d) * f13, AbstractC1125a.m3478a(modifierM88149j2, (Function1) objM87133R)), AbstractC33253j.f138651a), EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q2, i18), c17916v0), c28655q2, 0);
                                c28655q2.m87173q(false);
                            } else {
                                i19 = 0;
                                c28655q2.m87150e0(-1822894009);
                                c28655q2.m87173q(false);
                            }
                            C28655q c28655q8 = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c24817b.getLabel(), c28655q2, i19), AbstractC29011e.m88145f(c2314t, c24817b.getPosition(), 0.7f, 0.0f, 0.0f, null, 28, null), c24817b.getColor().mo134584toComposableColorWaAFU9c(c28655q2, i19), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, i18).getN10(), null, c28655q8, 0, 0, 196600);
                            c2314t = c2314t;
                            c28655q2 = c28655q8;
                            c17916v0 = c17916v0;
                            i18 = i18;
                            obj4 = obj4;
                        }
                        C28655q c28655q9 = c28655q2;
                        c28655q9.m87173q(false);
                        c28655q3 = c28655q9;
                    }
                    c28655q3.m87173q(true);
                    enumC32086i2 = enumC32086i3;
                    obj2 = obj3;
                    c28655q = c28655q3;
                    break;
                }
                c24816a = (C24816a) it.next();
                jMo134584toComposableColorWaAFU9c = c24816a.getColor().mo134584toComposableColorWaAFU9c(c28655q4, i16);
                i24 = b.f97157a[enumC32086i3.ordinal()];
                if (i24 != i17) {
                    c28655q4.m87150e0(1530818030);
                    c28655q4.m87173q(false);
                    if (c24816a.getCurrentValue() != null) {
                        jM51541c = C17919x.m51541c(0.3f, jMo134584toComposableColorWaAFU9c);
                    } else {
                        j7 = jMo134584toComposableColorWaAFU9c;
                    }
                    c2314t2 = c2314t;
                    f14 = ((float) 0.5d) * f13;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getRangeMax() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), j7, c17916v0), c28655q4, 0);
                    if (c24816a.getCurrentValue() == null) {
                        c28655q4.m87150e0(211479229);
                        c28655q4.m87173q(false);
                        c2314t = c2314t2;
                    } else {
                        c28655q4.m87150e0(211479230);
                        c2314t = c2314t2;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getCurrentValue().floatValue() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q4, 0);
                        c28655q4.m87173q(false);
                    }
                    if (c24816a.getShowAnnotation()) {
                        c28655q4.m87150e0(212113552);
                        AbstractC28669t1 abstractC28669t3 = AbstractC2453v1.f9569h;
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t3)).mo743q0(f13);
                        fMo743q1 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t3)).mo743q0(2);
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == obj4) {
                            objM87133R2 = a.f97156w;
                            c28655q4.m87172p0(objM87133R2);
                        }
                        jMo134584toComposableColorWaAFU9c2 = p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q4, 0);
                        Modifier modifierM3424u3 = AbstractC1102d.m3424u(f13, AbstractC29011e.m88145f(c2314t, c24816a.getRangeMax(), 0.1f, 0.0f, 0.28f, null, 20, null));
                        zM87151f = c28655q4.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q4.m87147d(fMo743q0) | c28655q4.m87147d(fMo743q1);
                        objM87133R3 = c28655q4.m87133R();
                        if (zM87151f) {
                            objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        i25 = 0;
                        AbstractC21478l0.m60421a(modifierM3424u3, (Function1) objM87133R3, c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        i25 = 0;
                        c28655q4.m87150e0(212906377);
                        c28655q4.m87173q(false);
                    }
                    i16 = i25;
                    i27 = 2;
                    i17 = 1;
                } else {
                    if (i24 == i27) {
                        throw AbstractC11895b.m32003v(1530816307, c28655q4, false);
                    }
                    c28655q4.m87150e0(1530823020);
                    jM51541c = EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q4, 6);
                    c28655q4.m87173q(false);
                }
                j7 = jM51541c;
                c2314t2 = c2314t;
                f14 = ((float) 0.5d) * f13;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getRangeMax() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), j7, c17916v0), c28655q4, 0);
                if (c24816a.getCurrentValue() == null) {
                    c28655q4.m87150e0(211479229);
                    c28655q4.m87173q(false);
                    c2314t = c2314t2;
                } else {
                    c28655q4.m87150e0(211479230);
                    c2314t = c2314t2;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC29011e.m88144e(c2314t, c24816a.getRangeMin(), 0.45f, c24816a.getCurrentValue().floatValue() - c24816a.getRangeMin(), 0.1f, new C29007a(0.0f, 0.0f, false, false, 12, null)), AbstractC33253j.m105489e(f14)), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q4, 0);
                    c28655q4.m87173q(false);
                }
                if (c24816a.getShowAnnotation()) {
                    c28655q4.m87150e0(212113552);
                    AbstractC28669t1 abstractC28669t4 = AbstractC2453v1.f9569h;
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t4)).mo743q0(f13);
                    fMo743q1 = ((InterfaceC39171c) c28655q4.m87161k(abstractC28669t4)).mo743q0(2);
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == obj4) {
                        objM87133R2 = a.f97156w;
                        c28655q4.m87172p0(objM87133R2);
                    }
                    jMo134584toComposableColorWaAFU9c2 = p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q4, 0);
                    Modifier modifierM3424u4 = AbstractC1102d.m3424u(f13, AbstractC29011e.m88145f(c2314t, c24816a.getRangeMax(), 0.1f, 0.0f, 0.28f, null, 20, null));
                    zM87151f = c28655q4.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q4.m87147d(fMo743q0) | c28655q4.m87147d(fMo743q1);
                    objM87133R3 = c28655q4.m87133R();
                    if (zM87151f) {
                        objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C12769l(jMo134584toComposableColorWaAFU9c2, fMo743q0, fMo743q1, 4);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    i25 = 0;
                    AbstractC21478l0.m60421a(modifierM3424u4, (Function1) objM87133R3, c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    i25 = 0;
                    c28655q4.m87150e0(212906377);
                    c28655q4.m87173q(false);
                }
                i16 = i25;
                i27 = 2;
                i17 = 1;
            }
        } else {
            C28655q c28655q10 = c28655q4;
            c28655q10.m87138X();
            enumC32086i2 = enumC32086i;
            modifier3 = modifier2;
            obj2 = obj;
            c28655q = c28655q10;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(modifier3, enumC32086i2, progressBars, obj2, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m72729e(long j7, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : 0.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m72730f(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63379M(drawBehind, EnumC39333f.BLACK_20.getColor(), drawBehind.mo743q0(((float) 2.25d) * 4), 0L, 0.0f, null, 124);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m72731g(Modifier modifier, EnumC32086i enumC32086i, List list, List list2, int i13, int i14, Composer composer, int i15) {
        m72728d(modifier, enumC32086i, list, list2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final EnumC39333f m72732h(EnumC24819d enumC24819d) {
        AbstractC22676k.m65750j(enumC24819d, "<this>");
        switch (b.f97158b[enumC24819d.ordinal()]) {
            case 1:
                return EnumC39333f.SLEEP_LIGHT_SLEEP;
            case 2:
                return EnumC39333f.SLEEP_REM_SLEEP;
            case 3:
                return EnumC39333f.STRAIN_ZONE_3;
            case 4:
                return EnumC39333f.RECOVERY;
            case 5:
                return EnumC39333f.BRAND_WHITE;
            case 6:
                return EnumC39333f.WHITE_50;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final EnumC39333f m72733i(EnumC24822g enumC24822g) {
        AbstractC22676k.m65750j(enumC24822g, "<this>");
        int i13 = b.f97159c[enumC24822g.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.SLEEP_LIGHT_SLEEP;
        }
        if (i13 == 2) {
            return EnumC39333f.SLEEP_REM_SLEEP;
        }
        if (i13 == 3) {
            return EnumC39333f.STRAIN_ZONE_3;
        }
        if (i13 == 4) {
            return EnumC39333f.RECOVERY;
        }
        if (i13 == 5) {
            return EnumC39333f.WHITE_50;
        }
        throw new NoWhenBranchMatchedException();
    }
}
