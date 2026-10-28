package i21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import bu2.C3661v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cw2.C11162c;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import hu1.C17650g;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import hy0.C17797w;
import i01.C17841d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39061n;
import y11.C39065r;

/* JADX INFO: renamed from: i21.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001aS\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a7\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "Li2/x;", "titleColor", "Ly11/r;", "horizontalImpactBarViewState", "Li21/l$d;", "impactCardType", "Lkotlin/Function1;", "Ljava/util/UUID;", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "subtitle", "", "Lhy0/h1;", "trailingTagStateList", "q", "(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "countOne", "Ly81/f;", "countOneColor", "countTwo", "countTwoColor", "o", "(Ly11/r;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Landroidx/compose/runtime/Composer;I)V", "countOneText", "countTwoText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18004n {
    /* JADX INFO: renamed from: h */
    private static final void m51672h(long j7, long j13, TextResource textResource, TextResource textResource2, Composer composer, int i13, int i14) {
        long brandWhite;
        int i15;
        long brandWhite2;
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(578711172);
        if ((i13 & 6) == 0) {
            brandWhite = j7;
            i15 = (((i14 & 1) == 0 && c28655q.m87151f(brandWhite)) ? 4 : 2) | i13;
        } else {
            brandWhite = j7;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            brandWhite2 = j13;
            i15 |= ((i14 & 2) == 0 && c28655q.m87151f(brandWhite2)) ? 32 : 16;
        } else {
            brandWhite2 = j13;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                textResourceM21267a = textResource;
                int i17 = c28655q.m87153g(textResourceM21267a) ? 256 : 128;
                i15 |= i17;
            } else {
                textResourceM21267a = textResource;
            }
            i15 |= i17;
        } else {
            textResourceM21267a = textResource;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                textResourceM21267a2 = textResource2;
                if (c28655q.m87153g(textResourceM21267a2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                textResourceM21267a2 = textResource2;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            textResourceM21267a2 = textResource2;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 1) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    brandWhite2 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i15 &= -7169;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            c28655q.m87175r();
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 4), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            AbstractC17999i.m51630g(textResourceM21267a, brandWhite, c38072d.m121951d().getTinyIcons().getCross(), c28655q, ((i15 >> 6) & 14) | ((i15 << 3) & 112), 0);
            AbstractC17999i.m51630g(textResourceM21267a2, brandWhite2, c38072d.m121951d().getAction().getCheckMark(), c28655q, (i15 & 112) | ((i15 >> 9) & 14), 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        long j14 = brandWhite;
        TextResource textResource3 = textResourceM21267a;
        long j15 = brandWhite2;
        TextResource textResource4 = textResourceM21267a2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17797w(j14, j15, textResource3, textResource4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51673i(long j7, long j13, TextResource textResource, TextResource textResource2, int i13, int i14, Composer composer, int i15) {
        m51672h(j7, j13, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4 A[PHI: r0 r2 r3 r9
      0x00e4: PHI (r0v13 com.whoop.design.util.TextResource) = (r0v7 com.whoop.design.util.TextResource), (r0v16 com.whoop.design.util.TextResource) binds: [B:88:0x010b, B:77:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r2v10 androidx.compose.ui.Modifier) = (r2v6 androidx.compose.ui.Modifier), (r2v3 androidx.compose.ui.Modifier) binds: [B:88:0x010b, B:77:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r3v21 int) = (r3v16 int), (r3v24 int) binds: [B:88:0x010b, B:77:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r9v9 long) = (r9v4 long), (r9v2 long) binds: [B:88:0x010b, B:77:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x012e  */
    /* JADX WARN: Code duplicated, block: B:99:0x013c A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: j */
    public static final void m51674j(Modifier modifier, TextResource textResource, long j7, final C39065r horizontalImpactBarViewState, final InterfaceC18002l.d impactCardType, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource2;
        long brandWhite;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        final Modifier modifier3;
        final TextResource textResource3;
        final long j13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        C28676v0 c28676v0;
        TextResource textResourceM21267a;
        Object objM87133R;
        int i17;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R2;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(impactCardType, "impactCardType");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2116245853);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                textResource2 = textResource;
                int i19 = c28655q2.m87153g(textResource2) ? 32 : 16;
                i15 |= i19;
            } else {
                textResource2 = textResource;
            }
            i15 |= i19;
        } else {
            textResource2 = textResource;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                brandWhite = j7;
                int i24 = c28655q2.m87151f(brandWhite) ? 256 : 128;
                i15 |= i24;
            } else {
                brandWhite = j7;
            }
            i15 |= i24;
        } else {
            brandWhite = j7;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(horizontalImpactBarViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(impactCardType) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i25 = i14 & 32;
        if (i25 == 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q2.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17650g(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        long j14 = brandWhite;
                        i17 = i15;
                        function4 = (Function1) objM87133R;
                        j13 = j14;
                    }
                    c28655q2.m87175r();
                    zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C17841d(function4, impactCardType, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    float f13 = 4;
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                    float f14 = ((float) 0.375d) * f13;
                    C38072d c38072d = C38072d.f163053a;
                    modifier3 = modifier2;
                    textResource3 = textResourceM21267a;
                    c28655q = c28655q2;
                    AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, c38072d.m121949b(c28655q2, 6).getTransparent(), AbstractC17269i.m48880a(f14, c38072d.m121949b(c28655q2, 6).getWhite20()), 0, AbstractC37817c.m121344e(-1660576863, c28655q2, new InterfaceC4351m() { // from class: i21.m
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC18004n.m51677m(modifier3, textResource3, j13, impactCardType, horizontalImpactBarViewState, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 1769472, 8);
                    function3 = function4;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    textResourceM21267a = textResource2;
                }
                i17 = i15;
                j13 = brandWhite;
                function4 = function2;
                c28655q2.m87175r();
                zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C17841d(function4, impactCardType, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C17841d(function4, impactCardType, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                float f15 = 4;
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f15);
                float f16 = ((float) 0.375d) * f15;
                C38072d c38072d2 = C38072d.f163053a;
                modifier3 = modifier2;
                textResource3 = textResourceM21267a;
                c28655q = c28655q2;
                AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, c38072d2.m121949b(c28655q2, 6).getTransparent(), AbstractC17269i.m48880a(f16, c38072d2.m121949b(c28655q2, 6).getWhite20()), 0, AbstractC37817c.m121344e(-1660576863, c28655q2, new InterfaceC4351m() { // from class: i21.m
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC18004n.m51677m(modifier3, textResource3, j13, impactCardType, horizontalImpactBarViewState, (Composer) obj, iIntValue);
                    }
                }), c28655q, 1769472, 8);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                textResource3 = textResource2;
                j13 = brandWhite;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3661v(modifier3, textResource3, j13, horizontalImpactBarViewState, impactCardType, function3, i13, i14, 3);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17650g(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    long j15 = brandWhite;
                    i17 = i15;
                    function4 = (Function1) objM87133R;
                    j13 = j15;
                } else {
                    i17 = i15;
                    j13 = brandWhite;
                    function4 = function2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17650g(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    long j16 = brandWhite;
                    i17 = i15;
                    function4 = (Function1) objM87133R;
                    j13 = j16;
                } else {
                    i17 = i15;
                    j13 = brandWhite;
                    function4 = function2;
                }
            }
            c28655q2.m87175r();
            zM87157i = ((i17 & 458752) == 131072) | c28655q2.m87157i(impactCardType);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new C17841d(function4, impactCardType, 3);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17841d(function4, impactCardType, 3);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            float f17 = 4;
            C33252i c33252iM105489e3 = AbstractC33253j.m105489e(3 * f17);
            float f18 = ((float) 0.375d) * f17;
            C38072d c38072d3 = C38072d.f163053a;
            modifier3 = modifier2;
            textResource3 = textResourceM21267a;
            c28655q = c28655q2;
            AbstractC12889b.m36263b(modifierM3362g3, c33252iM105489e3, c38072d3.m121949b(c28655q2, 6).getTransparent(), AbstractC17269i.m48880a(f18, c38072d3.m121949b(c28655q2, 6).getWhite20()), 0, AbstractC37817c.m121344e(-1660576863, c28655q2, new InterfaceC4351m() { // from class: i21.m
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC18004n.m51677m(modifier3, textResource3, j13, impactCardType, horizontalImpactBarViewState, (Composer) obj, iIntValue);
                }
            }), c28655q, 1769472, 8);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            textResource3 = textResource2;
            j13 = brandWhite;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3661v(modifier3, textResource3, j13, horizontalImpactBarViewState, impactCardType, function3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51675k(UUID it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51676l(Function1 function1, InterfaceC18002l.d dVar) {
        function1.invoke(dVar.getImpactId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51677m(Modifier modifier, TextResource textResource, long j7, InterfaceC18002l.d dVar, C39065r c39065r, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            m51681q(textResource, j7, dVar.getSubtitle(), dVar.m51662g(), c28655q, 0, 0);
            m51679o(c39065r, dVar.getCountOne(), dVar.getCountOneColor(), dVar.getCountTwo(), dVar.getCountTwoColor(), c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51678n(Modifier modifier, TextResource textResource, long j7, C39065r c39065r, InterfaceC18002l.d dVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51674j(modifier, textResource, j7, c39065r, dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m51679o(C39065r horizontalImpactBarViewState, TextResource countOne, EnumC39333f countOneColor, TextResource countTwo, EnumC39333f countTwoColor, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        AbstractC22676k.m65750j(countOne, "countOne");
        AbstractC22676k.m65750j(countOneColor, "countOneColor");
        AbstractC22676k.m65750j(countTwo, "countTwo");
        AbstractC22676k.m65750j(countTwoColor, "countTwoColor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1936734087);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(horizontalImpactBarViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(countOne) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(countOneColor.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(countTwo) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87149e(countTwoColor.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            int i15 = i14 << 3;
            AbstractC39061n.m124553f(new LayoutWeightElement(1.0f, true), horizontalImpactBarViewState, c28655q, i15 & 112, 0);
            AbstractC18489d0.m53380u(3, 4, c2314t, c28655q);
            m51672h(countOneColor.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 6) & 14), countTwoColor.mo134584toComposableColorWaAFU9c(c28655q, (i14 >> 12) & 14), countOne, countTwo, c28655q, (i14 & 7168) | (i15 & 896), 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(horizontalImpactBarViewState, countOne, countOneColor, countTwo, countTwoColor, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m51680p(C39065r c39065r, TextResource textResource, EnumC39333f enumC39333f, TextResource textResource2, EnumC39333f enumC39333f2, int i13, Composer composer, int i14) {
        m51679o(c39065r, textResource, enumC39333f, textResource2, enumC39333f2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0231  */
    /* JADX WARN: Code duplicated, block: B:79:0x024e  */
    /* JADX WARN: Code duplicated, block: B:85:0x026f A[LOOP:0: B:83:0x0269->B:85:0x026f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static final void m51681q(TextResource title, long j7, TextResource subtitle, List<C17750h1> list, Composer composer, int i13, int i14) {
        int i15;
        List<C17750h1> list2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        List<C17750h1> list3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i16;
        C38072d c38072d;
        C28655q c28655q;
        int iHashCode3;
        Iterator<T> it;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(873711316);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(subtitle) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                list2 = list;
                i15 |= c28655q2.m87157i(list2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    list3 = C25271y.f99162w;
                } else {
                    list3 = list2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q2, 54);
                List<C17750h1> list4 = list3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                c28655q2.m87158i0();
                i16 = i15;
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
                String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i16 & 14);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, (i16 << 3) & 896, 0, 196602);
                c28655q = c28655q2;
                if (AbstractC8693b.m21270d(subtitle)) {
                    c28655q.m87150e0(899734841);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, (i16 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(899945300);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                float f13 = 4;
                float f14 = 1 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, C2299e.f9112O), c2306l, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                c28655q.m87150e0(2036869192);
                it = list4.iterator();
                while (it.hasNext()) {
                    AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, 0, 6);
                }
                c28655q.m87173q(false);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q3 = c28655q;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q3, 432, 0);
                c28655q2 = c28655q3;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                list2 = list4;
            } else {
                c28655q2.m87138X();
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11162c(title, j7, subtitle, list2, i13, i14, 1);
            }
        }
        i15 |= 3072;
        list2 = list;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                list3 = C25271y.f99162w;
            } else {
                list3 = list2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l2, c28655q2, 54);
            List<C17750h1> list5 = list3;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            i16 = i15;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q2, i16 & 14);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, (i16 << 3) & 896, 0, 196602);
            c28655q = c28655q2;
            if (AbstractC8693b.m21270d(subtitle)) {
                c28655q.m87150e0(899734841);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, (i16 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(899945300);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            float f15 = 4;
            float f16 = 1 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f16, C2299e.f9112O), c2306l2, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            c28655q.m87150e0(2036869192);
            it = list5.iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, 0, 6);
            }
            c28655q.m87173q(false);
            C38072d c38072d3 = C38072d.f163053a;
            C28655q c28655q4 = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f15 * f15, c2314t2), c38072d3.m121949b(c28655q, 6).getWhite50(), c28655q4, 432, 0);
            c28655q2 = c28655q4;
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            list2 = list5;
        } else {
            c28655q2.m87138X();
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(title, j7, subtitle, list2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m51682r(TextResource textResource, long j7, TextResource textResource2, List list, int i13, int i14, Composer composer, int i15) {
        m51681q(textResource, j7, textResource2, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
