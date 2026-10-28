package com.whoop.startactivity.goals;

import a81.C0554e;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import az1.C2165f;
import b91.C2886a;
import bm2.C3483x0;
import c13.AbstractC3855a;
import com.whoop.navigation.models.GenericInteraction;
import e41.C12701f;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp2.C21881l;
import k71.C22252i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
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
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.AbstractC39330c;
import pf.AbstractC29125c;
import pz0.AbstractC29641d;
import pz0.EnumC29642e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y21.AbstractC39162i;
import y21.C39155b;

/* JADX INFO: renamed from: com.whoop.startactivity.goals.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "model", "", "Lm91/u;", "childItems", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;", "badge", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Landroidx/compose/runtime/Composer;I)V", "", "isToggleOn", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;", "toggleStyle", "onCheckedChange", "q", "(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10237a {

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30906a;

        static {
            int[] iArr = new int[CollapsibleToggleContainerModel.EnumC10234b.values().length];
            try {
                iArr[CollapsibleToggleContainerModel.EnumC10234b.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollapsibleToggleContainerModel.EnumC10234b.AI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30906a = iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m25998h(CollapsibleToggleContainerModel.Badge badge, Composer composer, int i13) {
        int i14;
        Modifier modifierM3358c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1724874404);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(badge) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int iM46380e = AbstractC16315n0.m46380e(badge.getIcon(), EnumC16313m0.WHOOP_LOGO_CIRCLE);
            CollapsibleToggleContainerModel.Badge.EnumC10231a style = badge.getStyle();
            CollapsibleToggleContainerModel.Badge.EnumC10231a enumC10231a = CollapsibleToggleContainerModel.Badge.EnumC10231a.AI;
            C2314t c2314t = C2314t.f9131w;
            if (style == enumC10231a) {
                c28655q.m87150e0(-744448266);
                c28655q.m87173q(false);
                modifierM3358c = AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43972A(), null, 0.15f, 2);
            } else {
                c28655q.m87150e0(-744363295);
                modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), AbstractC17918w0.f69621a);
                c28655q.m87173q(false);
            }
            float f13 = 4;
            Modifier modifierMo3471e = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * f13)).mo3471e(modifierM3358c);
            float f14 = 8;
            float f15 = 1 * f14;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierMo3471e, f15, ((float) 0.5d) * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(iM46380e, c28655q, 0), null, AbstractC1102d.m3419p(3 * f13, c2314t), C17919x.f69637n, c28655q, 3504, 0);
            String title = badge.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(badge, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m25999i(CollapsibleToggleContainerModel.Badge badge, int i13, Composer composer, int i14) {
        m25998h(badge, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x0226  */
    /* JADX WARN: Code duplicated, block: B:123:0x0228  */
    /* JADX WARN: Code duplicated, block: B:125:0x022b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0256  */
    /* JADX WARN: Code duplicated, block: B:129:0x025a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0275  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x030b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0320  */
    /* JADX WARN: Code duplicated, block: B:160:0x0327  */
    /* JADX WARN: Code duplicated, block: B:161:0x0329  */
    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX INFO: renamed from: j */
    public static final void m26000j(Modifier modifier, CollapsibleToggleContainerModel model, List<? extends InterfaceC25312u> list, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        GenericInteraction genericInteraction3;
        GenericInteraction genericInteraction4;
        Modifier modifier3;
        C28676v0 c28676v0;
        int iHashCode;
        boolean z4;
        int iHashCode2;
        CollapsibleToggleContainerModel.Badge badge;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        GenericInteraction genericInteraction5;
        InterfaceC28601c1 interfaceC28601c1;
        Float fValueOf;
        List<? extends InterfaceC25312u> childItems = list;
        GenericInteraction genericInteraction6 = genericInteraction;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(childItems, "childItems");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1113145533);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q2.m87157i(model) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(childItems) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(genericInteraction6) : c28655q2.m87157i(genericInteraction6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= (i13 & 32768) == 0 ? c28655q2.m87153g(genericInteraction2) : c28655q2.m87157i(genericInteraction2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            GenericInteraction genericInteraction7 = null;
            if (i17 != 0) {
                genericInteraction6 = null;
            }
            if (i18 == 0) {
                genericInteraction7 = genericInteraction2;
            }
            boolean zM87155h = c28655q2.m87155h(model.isToggleOn());
            Object objM87133R2 = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87155h || objM87133R2 == c28676v1) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(model.isToggleOn()));
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v1) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : childItems) {
                    if (obj instanceof C39155b) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    C39155b c39155b = (C39155b) it.next();
                    float fMax = Math.max(c39155b.getUpperBound(), c39155b.getSliderValue());
                    while (it.hasNext()) {
                        C39155b c39155b2 = (C39155b) it.next();
                        fMax = Math.max(fMax, Math.max(c39155b2.getUpperBound(), c39155b2.getSliderValue()));
                    }
                    fValueOf = Float.valueOf(fMax);
                } else {
                    fValueOf = null;
                }
                objM87133R3 = AbstractC3855a.m11831o(fValueOf != null ? fValueOf.floatValue() : 0.0f, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (1.0f > 0.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(1, 8, c2305k, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                String title = model.getTitle();
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C28676v0 c28676v2 = c28676v0;
                AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getSh3(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                badge = model.getBadge();
                if (badge == null) {
                    c28655q.m87150e0(-488200814);
                    z13 = false;
                } else {
                    z13 = false;
                    c28655q.m87150e0(-488200813);
                    m25998h(badge, c28655q, 0);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(true);
                boolean zM26001k = m26001k(interfaceC28601c2);
                CollapsibleToggleContainerModel.EnumC10234b toggleStyle = model.getToggleStyle();
                boolean zM87153g = c28655q.m87153g(interfaceC28601c2);
                if ((i15 & 7168) != 2048 || ((i15 & 4096) != 0 && c28655q.m87157i(genericInteraction6))) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                boolean z18 = z14 | zM87153g;
                if ((57344 & i15) != 16384 || ((i15 & 32768) != 0 && c28655q.m87157i(genericInteraction7))) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                boolean z19 = z15 | z18;
                if ((458752 & i15) == 131072) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                z17 = z16 | z19;
                objM87133R = c28655q.m87133R();
                if (!z17 || objM87133R == c28676v2) {
                    onViewEvent = function1;
                    genericInteraction5 = genericInteraction6;
                    interfaceC28601c1 = interfaceC28601c2;
                    objM87133R = new C21881l(genericInteraction5, genericInteraction7, interfaceC28601c1, onViewEvent, 3);
                    c28655q.m87172p0(objM87133R);
                } else {
                    onViewEvent = function1;
                    genericInteraction5 = genericInteraction6;
                    interfaceC28601c1 = interfaceC28601c2;
                }
                m26007q(zM26001k, toggleStyle, (Function1) objM87133R, c28655q, z13);
                c28655q.m87173q(true);
                childItems = list;
                AbstractC1090b.m3350e(C23016z.f90757a, m26001k(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(1430514991, c28655q, new C3483x0(interfaceC28601c3, childItems, onViewEvent)), c28655q, 1572870, 30);
                c28655q.m87173q(true);
                genericInteraction3 = genericInteraction5;
                genericInteraction4 = genericInteraction7;
                modifier3 = modifier5;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            if (1.0f > 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, 8, c2305k, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
            String title2 = model.getTitle();
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C28676v0 c28676v3 = c28676v0;
            AbstractC30795n.m94707h(title2, null, c38072d2.m121949b(c28655q2, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i110).getSh3(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q2;
            badge = model.getBadge();
            if (badge == null) {
                c28655q.m87150e0(-488200814);
                z13 = false;
            } else {
                z13 = false;
                c28655q.m87150e0(-488200813);
                m25998h(badge, c28655q, 0);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
            boolean zM26001k2 = m26001k(interfaceC28601c2);
            CollapsibleToggleContainerModel.EnumC10234b toggleStyle2 = model.getToggleStyle();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c2);
            if ((i15 & 7168) != 2048) {
                z14 = true;
            } else {
                z14 = true;
            }
            boolean z110 = z14 | zM87153g2;
            if ((57344 & i15) != 16384) {
                z15 = true;
            } else {
                z15 = true;
            }
            boolean z111 = z15 | z110;
            if ((458752 & i15) == 131072) {
                z16 = true;
            } else {
                z16 = z13;
            }
            z17 = z16 | z111;
            objM87133R = c28655q.m87133R();
            if (z17) {
                onViewEvent = function1;
                genericInteraction5 = genericInteraction6;
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R = new C21881l(genericInteraction5, genericInteraction7, interfaceC28601c1, onViewEvent, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                onViewEvent = function1;
                genericInteraction5 = genericInteraction6;
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R = new C21881l(genericInteraction5, genericInteraction7, interfaceC28601c1, onViewEvent, 3);
                c28655q.m87172p0(objM87133R);
            }
            m26007q(zM26001k2, toggleStyle2, (Function1) objM87133R, c28655q, z13);
            c28655q.m87173q(true);
            childItems = list;
            AbstractC1090b.m3350e(C23016z.f90757a, m26001k(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(1430514991, c28655q, new C3483x0(interfaceC28601c3, childItems, onViewEvent)), c28655q, 1572870, 30);
            c28655q.m87173q(true);
            genericInteraction3 = genericInteraction5;
            genericInteraction4 = genericInteraction7;
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            genericInteraction3 = genericInteraction6;
            genericInteraction4 = genericInteraction2;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(modifier3, (Object) model, (Object) childItems, (Object) genericInteraction3, (Object) genericInteraction4, onViewEvent, i13, i14, 17);
        }
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m26001k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m26002l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m26003m(GenericInteraction genericInteraction, GenericInteraction genericInteraction2, InterfaceC28601c1 interfaceC28601c1, Function1 function1, boolean z4) {
        m26002l(interfaceC28601c1, z4);
        if (!z4) {
            genericInteraction = genericInteraction2;
        }
        if (genericInteraction != null) {
            function1.invoke(genericInteraction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m26004n(InterfaceC28601c1 interfaceC28601c1, List list, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC28683x.m87247a(AbstractC39162i.m124706V().mo86977a(interfaceC28601c1), AbstractC37817c.m121344e(-1989627793, composer, new C0554e(list, 1, function1)), composer, 56);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m26005o(List list, Function1 function1, Composer composer, int i13) {
        Object objValueOf;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1211618356);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                InterfaceC25305n interfaceC25305n = interfaceC25312u instanceof InterfaceC25305n ? (InterfaceC25305n) interfaceC25312u : null;
                if (interfaceC25305n == null || (objValueOf = interfaceC25305n.getId()) == null) {
                    objValueOf = Integer.valueOf(i14);
                }
                c28655q.m87144b0(-1483146976, objValueOf);
                AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                c28655q.m87173q(false);
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m26006p(Modifier modifier, CollapsibleToggleContainerModel collapsibleToggleContainerModel, List list, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m26000j(modifier, collapsibleToggleContainerModel, list, genericInteraction, genericInteraction2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m26007q(boolean z4, CollapsibleToggleContainerModel.EnumC10234b enumC10234b, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1507231664);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC10234b.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = a.f30906a[enumC10234b.ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(-1045644307);
                AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend(), 0L, 0L, AbstractC37817c.m121344e(217284399, c28655q, new C12701f(z4, function2, 2)), c28655q, 24576, 13);
                c28655q.m87173q(false);
            } else {
                if (i15 != 2) {
                    throw AbstractC11895b.m32003v(-1045645626, c28655q, false);
                }
                c28655q.m87150e0(-1045635402);
                AbstractC29641d.m91043e(null, z4, false, 0L, EnumC29642e.Large, AbstractC15673b0.m43972A(), function1, c28655q, ((i14 << 3) & 112) | 24576 | ((i14 << 12) & 3670016), 13);
                function2 = function1;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(z4, enumC10234b, function2, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m26008r(boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC29641d.m91043e(null, z4, false, 0L, EnumC29642e.Large, null, function1, c28655q, 24576, 45);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m26009s(boolean z4, CollapsibleToggleContainerModel.EnumC10234b enumC10234b, Function1 function1, int i13, Composer composer, int i14) {
        m26007q(z4, enumC10234b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
