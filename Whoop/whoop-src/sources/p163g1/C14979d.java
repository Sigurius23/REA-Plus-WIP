package p163g1;

import androidx.compose.p018ui.layout.AbstractC1131a;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ep1.C13412g;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p006a4.AbstractC0355b;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.C39111m;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C14979d implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: b */
    public static final C14979d f55983b = new C14979d(0);

    /* JADX INFO: renamed from: c */
    public static final C14979d f55984c = new C14979d(1);

    /* JADX INFO: renamed from: d */
    public static final C14979d f55985d = new C14979d(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55986a;

    public /* synthetic */ C14979d(int i13) {
        this.f55986a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02af  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e5  */
    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        Object obj;
        Object obj2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iMo724F;
        int iMax;
        switch (this.f55986a) {
            case 0:
                List list2 = list;
                int size = list2.size();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        obj = list.get(i14);
                        if (!AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "title")) {
                            i14++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
                AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(C39169a.m124758b(j7, 0, 0, 0, 0, 11)) : null;
                int size2 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        obj2 = list.get(i15);
                        if (!AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj2), "text")) {
                            i15++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
                AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1 != null ? interfaceC39124q1.mo448T(C39169a.m124758b(j7, 0, 0, 0, 0, 11)) : null;
                int iMax2 = Math.max(abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0, abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0);
                if (abstractC39104j1Mo448T == null) {
                    iIntValue = 0;
                } else {
                    int iMo450c0 = abstractC39104j1Mo448T.mo450c0(AbstractC39083d.f168140a);
                    Integer numValueOf = iMo450c0 == Integer.MIN_VALUE ? null : Integer.valueOf(iMo450c0);
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                }
                if (abstractC39104j1Mo448T == null) {
                    iIntValue2 = 0;
                } else {
                    int iMo450c1 = abstractC39104j1Mo448T.mo450c0(AbstractC39083d.f168141b);
                    Integer numValueOf2 = iMo450c1 == Integer.MIN_VALUE ? null : Integer.valueOf(iMo450c1);
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                }
                int iMo86824w0 = interfaceC39133t0.mo86824w0(AbstractC15055k.f56364c) - iIntValue;
                if (abstractC39104j1Mo448T2 == null) {
                    iIntValue3 = 0;
                } else {
                    int iMo450c2 = abstractC39104j1Mo448T2.mo450c0(AbstractC39083d.f168140a);
                    Integer numValueOf3 = iMo450c2 != Integer.MIN_VALUE ? Integer.valueOf(iMo450c2) : null;
                    if (numValueOf3 != null) {
                        iIntValue3 = numValueOf3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                }
                int iMo86824w1 = abstractC39104j1Mo448T == null ? interfaceC39133t0.mo86824w0(AbstractC15055k.f56366e) : interfaceC39133t0.mo86824w0(AbstractC15055k.f56365d);
                int i16 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x + iMo86824w0 : 0;
                int i17 = abstractC39104j1Mo448T == null ? iMo86824w1 - iIntValue3 : (iIntValue2 == 0 ? i16 - iIntValue3 : (iMo86824w0 + iIntValue2) - iIntValue3) + iMo86824w1;
                if (abstractC39104j1Mo448T2 != null) {
                    i13 = iIntValue2 == 0 ? (abstractC39104j1Mo448T2.f168212x + iMo86824w1) - iIntValue3 : ((abstractC39104j1Mo448T2.f168212x + iMo86824w1) - iIntValue3) - ((abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0) - iIntValue2);
                }
                return interfaceC39133t0.mo86822W(iMax2, i16 + i13, C25272z.f99163w, new C14968c(abstractC39104j1Mo448T, iMo86824w0, abstractC39104j1Mo448T2, i17));
            case 1:
                int size3 = list.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) list.get(i18);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q2), "badge")) {
                        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q2.mo448T(C39169a.m124758b(j7, 0, 0, 0, 0, 11));
                        int size4 = list.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) list.get(i19);
                            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q3), "anchor")) {
                                AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3.mo448T(j7);
                                C39111m c39111m = AbstractC39083d.f168140a;
                                int iMo450c3 = abstractC39104j1Mo448T4.mo450c0(c39111m);
                                C39111m c39111m2 = AbstractC39083d.f168141b;
                                return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T4.f168211w, abstractC39104j1Mo448T4.f168212x, AbstractC25247g0.m73990Y(new C23465k(c39111m, Integer.valueOf(iMo450c3)), new C23465k(c39111m2, Integer.valueOf(abstractC39104j1Mo448T4.mo450c0(c39111m2)))), new C13412g(abstractC39104j1Mo448T3, interfaceC39133t0, abstractC39104j1Mo448T4, 9));
                            }
                        }
                        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                }
                AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            case 2:
                ArrayList arrayList = new ArrayList(list.size());
                int size5 = list.size();
                boolean z4 = false;
                int iMo450c4 = Integer.MIN_VALUE;
                int iMo450c5 = Integer.MIN_VALUE;
                int iMax3 = 0;
                for (int i24 = 0; i24 < size5; i24++) {
                    AbstractC39104j1 abstractC39104j1Mo448T5 = ((InterfaceC39124q0) list.get(i24)).mo448T(j7);
                    arrayList.add(abstractC39104j1Mo448T5);
                    C39111m c39111m3 = AbstractC39083d.f168140a;
                    if (abstractC39104j1Mo448T5.mo450c0(c39111m3) != Integer.MIN_VALUE && (iMo450c4 == Integer.MIN_VALUE || abstractC39104j1Mo448T5.mo450c0(c39111m3) < iMo450c4)) {
                        iMo450c4 = abstractC39104j1Mo448T5.mo450c0(c39111m3);
                    }
                    C39111m c39111m4 = AbstractC39083d.f168141b;
                    if (abstractC39104j1Mo448T5.mo450c0(c39111m4) != Integer.MIN_VALUE && (iMo450c5 == Integer.MIN_VALUE || abstractC39104j1Mo448T5.mo450c0(c39111m4) > iMo450c5)) {
                        iMo450c5 = abstractC39104j1Mo448T5.mo450c0(c39111m4);
                    }
                    iMax3 = Math.max(iMax3, abstractC39104j1Mo448T5.f168212x);
                }
                if (iMo450c4 != Integer.MIN_VALUE && iMo450c5 != Integer.MIN_VALUE) {
                    z4 = true;
                }
                int iMax4 = Math.max(interfaceC39133t0.mo724F((iMo450c4 == iMo450c5 || !z4) ? AbstractC15142s6.f56784f : AbstractC15142s6.f56785g), iMax3);
                return interfaceC39133t0.mo86822W(C39169a.m124765i(j7), iMax4, C25272z.f99163w, new C6516c(arrayList, iMax4, 6));
            default:
                int size6 = list.size();
                int i25 = 0;
                for (int i26 = 0; i26 < size6; i26++) {
                    InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) list.get(i26);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q4), "action")) {
                        final AbstractC39104j1 abstractC39104j1Mo448T6 = interfaceC39124q4.mo448T(j7);
                        int iM124765i = (C39169a.m124765i(j7) - abstractC39104j1Mo448T6.f168211w) - interfaceC39133t0.mo724F(AbstractC15142s6.f56783e);
                        int iM124767k = C39169a.m124767k(j7);
                        if (iM124765i >= iM124767k) {
                            iM124767k = iM124765i;
                        }
                        int size7 = list.size();
                        for (int i27 = 0; i27 < size7; i27++) {
                            InterfaceC39124q0 interfaceC39124q5 = (InterfaceC39124q0) list.get(i27);
                            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q5), "text")) {
                                final AbstractC39104j1 abstractC39104j1Mo448T7 = interfaceC39124q5.mo448T(C39169a.m124758b(j7, 0, iM124767k, 0, 0, 9));
                                C39111m c39111m5 = AbstractC39083d.f168140a;
                                int iMo450c6 = abstractC39104j1Mo448T7.mo450c0(c39111m5);
                                int iMo450c7 = abstractC39104j1Mo448T7.mo450c0(AbstractC39083d.f168141b);
                                boolean z13 = true;
                                boolean z14 = (iMo450c6 == Integer.MIN_VALUE || iMo450c7 == Integer.MIN_VALUE) ? false : true;
                                if (iMo450c6 != iMo450c7 && z14) {
                                    z13 = false;
                                }
                                final int iM124765i2 = C39169a.m124765i(j7) - abstractC39104j1Mo448T6.f168211w;
                                if (z13) {
                                    iMax = Math.max(interfaceC39133t0.mo724F(AbstractC15142s6.f56784f), abstractC39104j1Mo448T6.f168212x);
                                    iMo724F = (iMax - abstractC39104j1Mo448T7.f168212x) / 2;
                                    int iMo450c8 = abstractC39104j1Mo448T6.mo450c0(c39111m5);
                                    if (iMo450c8 != Integer.MIN_VALUE) {
                                        i25 = (iMo450c6 + iMo724F) - iMo450c8;
                                    }
                                } else {
                                    iMo724F = interfaceC39133t0.mo724F(AbstractC15142s6.f56779a) - iMo450c6;
                                    iMax = Math.max(interfaceC39133t0.mo724F(AbstractC15142s6.f56785g), abstractC39104j1Mo448T7.f168212x + iMo724F);
                                    i25 = (iMax - abstractC39104j1Mo448T6.f168212x) / 2;
                                }
                                final int i28 = iMo724F;
                                final int i29 = i25;
                                return interfaceC39133t0.mo86822W(C39169a.m124765i(j7), iMax, C25272z.f99163w, new Function1() { // from class: g1.p6
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj3;
                                        AbstractC39101i1.m124624n(abstractC39104j1Mo448T7, 0, i28, abstractC39101i1);
                                        AbstractC39101i1.m124624n(abstractC39104j1Mo448T6, iM124765i2, i29, abstractC39101i1);
                                        return C23454a0.f92919a;
                                    }
                                });
                            }
                        }
                        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                }
                AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
        }
    }
}
