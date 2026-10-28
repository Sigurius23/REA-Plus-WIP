package p132f0;

import android.text.Editable;
import android.text.Layout;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p077d0.C11349f0;
import p181h2.C16618c;
import p182h3.C16791g;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p208i2.InterfaceC17910s0;
import p249jc.AbstractC21598x;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p294l3.C23242a;
import p294l3.C23283u0;
import p294l3.C23290y;
import p316m1.InterfaceC24926x;
import p318m3.C24983m;
import p330n1.AbstractC26108h;
import p390p1.InterfaceC28670t2;
import p448r3.AbstractC30895a;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import us1.C35219b;

/* JADX INFO: renamed from: f0.r */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13819r implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f49303E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49304w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f49305x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49306y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49307z;

    public /* synthetic */ C13819r(int i13, long j7, Object obj, Object obj2, Object obj3) {
        this.f49304w = i13;
        this.f49306y = obj;
        this.f49307z = obj2;
        this.f49305x = j7;
        this.f49303E = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        float[] fArr;
        long j7;
        int i13;
        boolean z4;
        float fM47336a;
        float fM47336a2;
        long j13;
        switch (this.f49304w) {
            case 0:
                C16618c c16618c = (C16618c) this.f49306y;
                C22669g0 c22669g0 = (C22669g0) this.f49307z;
                long j14 = this.f49305x;
                AbstractC17921y abstractC17921y = (AbstractC17921y) this.f49303E;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                float f13 = c16618c.f63939a;
                float f14 = c16618c.f63940b;
                C22128b c22128b = c0238p0.f815w;
                ((C0929d) c22128b.f85852x.f812x).m2339B(f13, f14);
                try {
                    InterfaceC22131e.m63377K0(c0238p0, (C17885g) c22669g0.f89336w, j14, 0L, 0.0f, abstractC17921y, 0, 890);
                    return C23454a0.f92919a;
                } finally {
                    ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
                }
            case 1:
                float[] fArr2 = (float[]) this.f49306y;
                C22665e0 c22665e0 = (C22665e0) this.f49307z;
                C22663d0 c22663d0 = (C22663d0) this.f49303E;
                C23290y c23290y = (C23290y) obj;
                int i14 = c23290y.f92271b;
                C23242a c23242a = c23290y.f92270a;
                int iM67359e = c23290y.f92272c;
                long j15 = this.f49305x;
                int iM67360f = i14 > C23283u0.m67360f(j15) ? c23290y.f92271b : C23283u0.m67360f(j15);
                if (iM67359e >= C23283u0.m67359e(j15)) {
                    iM67359e = C23283u0.m67359e(j15);
                }
                long jM60431f = AbstractC21478l0.m60431f(c23290y.m67387d(iM67360f), c23290y.m67387d(iM67359e));
                int i15 = c22665e0.f89334w;
                C24983m c24983m = c23242a.f92101d;
                int iM67360f2 = C23283u0.m67360f(jM60431f);
                int iM67359e2 = C23283u0.m67359e(jM60431f);
                Layout layout = c24983m.f97768f;
                int length = layout.getText().length();
                if (iM67360f2 < 0) {
                    AbstractC30895a.m95015a("startOffset must be > 0");
                }
                if (iM67360f2 >= length) {
                    AbstractC30895a.m95015a("startOffset must be less than text length");
                }
                if (iM67359e2 <= iM67360f2) {
                    AbstractC30895a.m95015a("endOffset must be greater than startOffset");
                }
                if (iM67359e2 > length) {
                    AbstractC30895a.m95015a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i15 < (iM67359e2 - iM67360f2) * 4) {
                    AbstractC30895a.m95015a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM67360f2);
                int lineForOffset2 = layout.getLineForOffset(iM67359e2 - 1);
                C16791g c16791g = new C16791g(c24983m);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iM73312f = c24983m.m73312f(lineForOffset);
                        int iMax = Math.max(iM67360f2, lineStart);
                        float fM73313g = c24983m.m73313g(lineForOffset);
                        float fM73311e = c24983m.m73311e(lineForOffset);
                        j7 = jM60431f;
                        boolean z13 = layout.getParagraphDirection(lineForOffset) == 1;
                        for (int iMin = Math.min(iM67359e2, iM73312f); iMax < iMin; iMin = i13) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z13 || zIsRtlCharAt) {
                                i13 = iMin;
                                if (z13 && zIsRtlCharAt) {
                                    float fM47336a3 = c16791g.m47336a(iMax, false, false, false);
                                    z4 = z13;
                                    fM47336a = c16791g.m47336a(iMax + 1, true, true, false);
                                    fM47336a2 = fM47336a3;
                                } else {
                                    z4 = z13;
                                    if (z4 || !zIsRtlCharAt) {
                                        fM47336a = c16791g.m47336a(iMax, false, false, false);
                                        fM47336a2 = c16791g.m47336a(iMax + 1, true, true, false);
                                    } else {
                                        fM47336a2 = c16791g.m47336a(iMax, false, false, true);
                                        fM47336a = c16791g.m47336a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i15] = fM47336a;
                                fArr[i15 + 1] = fM73313g;
                                fArr[i15 + 2] = fM47336a2;
                                fArr[i15 + 3] = fM73311e;
                                i15 += 4;
                                iMax++;
                                z13 = z4;
                            } else {
                                i13 = iMin;
                                fM47336a = c16791g.m47336a(iMax, false, false, true);
                                z4 = z13;
                                fM47336a2 = c16791g.m47336a(iMax + 1, true, true, true);
                            }
                            fArr[i15] = fM47336a;
                            fArr[i15 + 1] = fM73313g;
                            fArr[i15 + 2] = fM47336a2;
                            fArr[i15 + 3] = fM73311e;
                            i15 += 4;
                            iMax++;
                            z13 = z4;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            fArr2 = fArr;
                            jM60431f = j7;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j7 = jM60431f;
                }
                int iM67358d = (C23283u0.m67358d(j7) * 4) + c22665e0.f89334w;
                for (int i16 = c22665e0.f89334w; i16 < iM67358d; i16 += 4) {
                    int i17 = i16 + 1;
                    float f15 = fArr[i17];
                    float f16 = c22663d0.f89331w;
                    fArr[i17] = f15 + f16;
                    int i18 = i16 + 3;
                    fArr[i18] = fArr[i18] + f16;
                }
                c22665e0.f89334w = iM67358d;
                c22663d0.f89331w = c23242a.m67290b() + c22663d0.f89331w;
                return C23454a0.f92919a;
            case 2:
                InterfaceC24926x interfaceC24926x = (InterfaceC24926x) this.f49306y;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f49307z;
                long j16 = this.f49305x;
                InterfaceC17910s0 interfaceC17910s0 = (InterfaceC17910s0) this.f49303E;
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                float fInvoke = interfaceC24926x.invoke();
                float fMax = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5) / 3;
                float fM36283m = AbstractC12889b.m36283m(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fM36283m - (((float) Math.pow(fM36283m, 2)) / 4))) * 0.5f;
                float f17 = 360;
                float f18 = fPow * f17;
                float f19 = ((0.8f * fMax) + fPow) * f17;
                float fMin = Math.min(1.0f, fMax);
                C11349f0 c11349f0 = new C11349f0();
                c11349f0.f36376w = f19;
                c11349f0.f36377x = fMin;
                float fFloatValue = ((Number) interfaceC28670t2.getValue()).floatValue();
                long jMo721B0 = interfaceC22131e.mo721B0();
                C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2358v(fPow, jMo721B0);
                    float fMo743q0 = interfaceC22131e.mo743q0(AbstractC26108h.f103436b);
                    float f24 = AbstractC26108h.f103435a;
                    C16618c c16618cM48895i = AbstractC17269i.m48895i((interfaceC22131e.mo743q0(f24) / 2.0f) + fMo743q0, AbstractC21598x.m60656L(interfaceC22131e.mo731d()));
                    try {
                        InterfaceC22131e.m63380P(interfaceC22131e, j16, f18, f19 - f18, c16618cM48895i.m47200f(), c16618cM48895i.m47199e(), fFloatValue, new C22135i(interfaceC22131e.mo743q0(f24), 0.0f, 0, 0, null, 26), 768);
                        AbstractC26108h.m77671b(interfaceC22131e, interfaceC17910s0, c16618cM48895i, j16, fFloatValue, c11349f0);
                        AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                        return C23454a0.f92919a;
                    } catch (Throwable th3) {
                        th = th3;
                        j13 = jM670A;
                        AbstractC11266d.m30472z(c0237pMo744t0, j13);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j13 = jM670A;
                }
                break;
            case 3:
                return TeamRemoveMembersActivity.m19456Q((C22669g0) this.f49307z, (TeamRemoveMembersActivity) this.f49306y, this.f49305x, (Function1) this.f49303E, (Editable) obj);
            default:
                return ((C35219b) this.f49306y).m111583v((List) this.f49307z, (String) this.f49303E, this.f49305x, (InterfaceC33687a) obj);
        }
    }

    public /* synthetic */ C13819r(long j7, float[] fArr, C22665e0 c22665e0, C22663d0 c22663d0) {
        this.f49304w = 1;
        this.f49305x = j7;
        this.f49306y = fArr;
        this.f49307z = c22665e0;
        this.f49303E = c22663d0;
    }

    public /* synthetic */ C13819r(C22669g0 c22669g0, TeamRemoveMembersActivity teamRemoveMembersActivity, long j7, Function1 function1) {
        this.f49304w = 3;
        this.f49307z = c22669g0;
        this.f49306y = teamRemoveMembersActivity;
        this.f49305x = j7;
        this.f49303E = function1;
    }

    public /* synthetic */ C13819r(C35219b c35219b, List list, String str, long j7) {
        this.f49304w = 4;
        this.f49306y = c35219b;
        this.f49307z = list;
        this.f49303E = str;
        this.f49305x = j7;
    }
}
