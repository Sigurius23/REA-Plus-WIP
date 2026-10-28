package s30;

import am2.C1044u;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.ModalFormFactor;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.PinFormFactor;
import com.amplitude.android.engagement.types.PopoverFormFactor;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import com.google.android.gms.common.api.C4976g;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.attestation.AttestationError;
import d00.C11433l;
import d40.AbstractC11673r;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.seon.androidsdk.service.AbstractC20660e1;
import java.io.EOFException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23465k;
import l83.C23468n;
import m30.AbstractC24985a;
import m30.InterfaceC24987c;
import ne3.InterfaceC26633p0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p043c4.C3951c;
import p097ds.AbstractC12313p;
import p184h5.AbstractC16880i0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p197hj.C17338u;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p314m.AbstractActivityC24852m;
import p319m4.AbstractC25012a;
import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p326mf.C25490j;
import p326mf.C25494n;
import p342nj.C26741f;
import p367of.C27892a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p442qy.C30767f;
import p477s2.AbstractC32076h;
import p478s3.AbstractC32098d;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p529uo.C35126n;
import p543v4.C35643b;
import p571w3.C36780p;
import p590wo.C37434b;
import p598wy.InterfaceC37689b;
import p602x1.AbstractC37817c;
import p631xz.C38725h0;
import p631xz.C38727i0;
import p631xz.C38729j0;
import p631xz.C38731k0;
import p631xz.C38733l0;
import p631xz.InterfaceC38735m0;
import p635y2.InterfaceC39127r0;
import p647yf.C39498k;
import p647yf.InterfaceC39508u;
import p679zf.C40605f;
import p679zf.C40607h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sj.AbstractC32554e;
import sj.C32561l;
import w20.C36727q;
import w63.C36866a;
import wb3.AbstractC37056f;
import wf.C37236a;
import wf.C37237b;
import x30.AbstractC37926s0;
import x30.C37915o1;
import y00.AbstractC38792b8;
import z00.AbstractC39935d;
import z00.C39932a;

/* JADX INFO: renamed from: s30.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32100b implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m99856a(NudgeStep step, C32561l c32561l, Modifier modifier, Composer composer, int i13, int i14) {
        float fFloatValue;
        Float fValueOf;
        float f13;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-163111963);
        int i15 = i14 & 4;
        Modifier modifierM3413j = C2314t.f9131w;
        Modifier modifier2 = i15 != 0 ? modifierM3413j : modifier;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C33252i c33252iM105489e = AbstractC33253j.m105489e(c35035m.f148315L);
        Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            Activity activityM49083a = C17338u.f67142w.m49083a();
            if (activityM49083a != null) {
                float f14 = activityM49083a.getResources().getConfiguration().screenHeightDp;
                ViewGroup viewGroup = (ViewGroup) activityM49083a.findViewById(R.id.content);
                if (Build.VERSION.SDK_INT < 30 || viewGroup == null) {
                    fValueOf = Float.valueOf(f14 * 0.95f);
                } else {
                    try {
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        C16905q1 c16905q1M47522a = AbstractC16880i0.m47522a(viewGroup);
                        C35643b c35643bMo47530g = c16905q1M47522a != null ? c16905q1M47522a.f64864a.mo47530g(7) : null;
                        if (c35643bMo47530g != null) {
                            float f15 = activityM49083a.getResources().getDisplayMetrics().density;
                            f13 = (f14 - (c35643bMo47530g.f151450b / f15)) - (c35643bMo47530g.f151452d / f15);
                        } else {
                            f13 = f14 * 0.95f;
                        }
                    } catch (Exception unused) {
                    }
                    fValueOf = Float.valueOf(f13);
                }
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = configuration.screenHeightDp * 0.95f;
            }
            objM87133R = Float.valueOf(fFloatValue);
            c28655q.m87172p0(objM87133R);
        }
        float fFloatValue2 = ((Number) objM87133R).floatValue();
        FormFactor formFactor = step.getFormFactor();
        if (formFactor instanceof ModalFormFactor) {
            Float f16 = c35035m.f148321R;
            if (f16 != null) {
                fFloatValue2 = Math.min(f16.floatValue(), fFloatValue2);
            }
            modifierM3413j = AbstractC1102d.m3413j(modifierM3413j, 0.0f, fFloatValue2, 1);
        } else {
            if (formFactor instanceof PopoverFormFactor ? true : formFactor instanceof PinFormFactor) {
                Float f17 = c35035m.f148323T;
                if (f17 != null) {
                    fFloatValue2 = Math.min(f17.floatValue(), fFloatValue2);
                }
                modifierM3413j = AbstractC1102d.m3413j(modifierM3413j, 0.0f, fFloatValue2, 1);
            } else if (formFactor instanceof TooltipFormFactor) {
                Float f18 = c35035m.f148325V;
                if (f18 != null) {
                    fFloatValue2 = Math.min(f18.floatValue(), fFloatValue2);
                }
                modifierM3413j = AbstractC1102d.m3413j(modifierM3413j, 0.0f, fFloatValue2, 1);
            }
        }
        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC15751g.m44455h(AbstractC12313p.m34307y(modifierM3413j, !(step.getFormFactor() instanceof ModalFormFactor), new C26741f(c33252iM105489e, 4), c28655q, 0), 1, c35035m.f148364u, c33252iM105489e), c33252iM105489e), c35035m.f148366w, AbstractC17918w0.f69621a);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
        int i16 = AbstractC32554e.f134873a[step.getFormFactor().getLayout().ordinal()];
        if (i16 == 1) {
            c28655q.m87152f0(-1995076759);
            AbstractC32076h.m99768a(step, c32561l, modifier2, false, c28655q, 72, 8);
            c28655q.m87173q(false);
        } else if (i16 == 2) {
            c28655q.m87152f0(-1995076675);
            AbstractC32098d.m99835a(step, c32561l, modifier2, c28655q, 72);
            c28655q.m87173q(false);
        } else if (i16 != 3) {
            c28655q.m87152f0(-1995076538);
            c28655q.m87173q(false);
        } else {
            c28655q.m87152f0(-1995076590);
            AbstractC32103e.m99881c(step, c32561l, modifier2, c28655q, 72);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(step, c32561l, modifier2, i13, i14);
    }

    /* JADX INFO: renamed from: b */
    public static final void m99857b(String titleText, String str, String confirmText, String dismissText, boolean z4, InterfaceC4339a onConfirmListener, InterfaceC4339a onDismissListener, Composer composer, int i13) {
        int i14;
        String str2;
        boolean z13;
        C28655q c28655q;
        AbstractC22676k.m65750j(titleText, "titleText");
        AbstractC22676k.m65750j(confirmText, "confirmText");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        AbstractC22676k.m65750j(onConfirmListener, "onConfirmListener");
        AbstractC22676k.m65750j(onDismissListener, "onDismissListener");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-165056289);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(titleText) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(confirmText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(dismissText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            z13 = z4;
            i14 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            z13 = z4;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onConfirmListener) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(onDismissListener) ? 1048576 : 524288;
        }
        if ((i14 & 599187) == 599186 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1760112139, c28655q2, new C37915o1(str2, onDismissListener, onConfirmListener, confirmText, z13, dismissText, titleText)), c28655q, 12582912, 127);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(titleText, str, confirmText, dismissText, z4, onConfirmListener, onDismissListener, i13, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static SpannableString m99858c(AbstractActivityC24852m abstractActivityC24852m, String str, InterfaceC24987c customization) {
        AbstractC22676k.m65750j(customization, "customization");
        SpannableString spannableString = new SpannableString(str);
        AbstractC24985a abstractC24985a = (AbstractC24985a) customization;
        String str2 = abstractC24985a.f97783x;
        if (str2 != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), 0, spannableString.length(), 0);
        }
        int i13 = abstractC24985a.f97784y;
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, numValueOf.intValue(), abstractActivityC24852m.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String str3 = abstractC24985a.f97782w;
        if (str3 != null) {
            spannableString.setSpan(new TypefaceSpan(str3), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public static final void m99859d(int i13, int i14) throws EOFException {
        throw new EOFException(AbstractC25012a.m73372e(i13, i14, "Unable to discard ", " bytes: only ", " available for writing"));
    }

    /* JADX INFO: renamed from: e */
    public static final void m99860e(int i13, int i14) throws EOFException {
        throw new EOFException(AbstractC25012a.m73372e(i13, i14, "Unable to discard ", " bytes: only ", " available for reading"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Serializable m99861f(C37236a c37236a, boolean z4, AbstractC32269c abstractC32269c) {
        C37237b c37237b;
        C39498k c39498k;
        Object obj;
        C37236a c37236a2;
        if (abstractC32269c instanceof C37237b) {
            c37237b = (C37237b) abstractC32269c;
            int i13 = c37237b.f159239E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37237b.f159239E = i13 - Integer.MIN_VALUE;
            } else {
                c37237b = new C37237b(abstractC32269c);
            }
        } else {
            c37237b = new C37237b(abstractC32269c);
        }
        Object obj2 = c37237b.f159243z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37237b.f159239E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c39498k = new C39498k();
            String str = "HTTP " + c37236a.f159235a + "\r\n";
            c39498k.mo126148z(str.length(), str);
            c37236a.f159236b.m44480c(new C36727q(c39498k, 2));
            c39498k.mo126148z(2, "\r\n");
            if (z4) {
                AbstractC25492l abstractC25492l = c37236a.f159237c;
                if (abstractC25492l instanceof C27892a) {
                    byte[] bArr = ((C27892a) abstractC25492l).f112471a;
                    c39498k.write(bArr, 0, bArr.length);
                } else if ((abstractC25492l instanceof C25494n) || (abstractC25492l instanceof AbstractC25491k)) {
                    c37237b.f159240w = c37236a;
                    c37237b.f159241x = c39498k;
                    c37237b.f159242y = c37236a;
                    c37237b.f159239E = 1;
                    Serializable serializableM121450B = AbstractC37926s0.m121450B(abstractC25492l, c37237b);
                    if (serializableM121450B == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = serializableM121450B;
                    c37236a2 = c37236a;
                } else if (!(abstractC25492l instanceof C25490j)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new C23465k(c37236a, c39498k.m126161b());
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C37236a c37236a3 = c37237b.f159242y;
        C39498k c39498k2 = c37237b.f159241x;
        C37236a c37236a4 = c37237b.f159240w;
        AbstractC34132o.m107864I(obj2);
        c37236a2 = c37236a3;
        c37236a = c37236a4;
        obj = obj2;
        c39498k = c39498k2;
        byte[] bArr2 = (byte[]) obj;
        if (bArr2 != null) {
            c39498k.write(bArr2, 0, bArr2.length);
            c37236a = new C37236a(c37236a.f159235a, c37236a.f159236b, new C27892a(bArr2));
        } else {
            c37236a = c37236a2;
        }
        return new C23465k(c37236a, c39498k.m126161b());
    }

    /* JADX INFO: renamed from: g */
    public static final void m99862g(AbstractC20660e1 abstractC20660e1) {
        throw new IllegalArgumentException("End gap 8 is too big: capacity is " + abstractC20660e1.f77290f);
    }

    /* JADX INFO: renamed from: h */
    public static final void m99863h(AbstractC20660e1 abstractC20660e1) {
        throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (abstractC20660e1.f77287c - abstractC20660e1.f77286b) + " content bytes at offset " + abstractC20660e1.f77286b);
    }

    /* JADX INFO: renamed from: i */
    public static final void m99864i(AbstractC20660e1 abstractC20660e1) {
        throw new IllegalArgumentException(AbstractC18489d0.m53371l(new StringBuilder("End gap 8 is too big: there are already "), abstractC20660e1.f77288d, " bytes reserved in the beginning"));
    }

    /* JADX INFO: renamed from: l */
    public static C37434b m99865l(Context context) {
        return new C37434b(context, null, C37434b.f160242a, C35126n.f149057w, C4976g.f20501c);
    }

    /* JADX INFO: renamed from: o */
    public static final String m99866o(C37236a c37236a) {
        return (String) c37236a.f159236b.get("Date");
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m99867p(Throwable th3) {
        if (!(th3 instanceof APIException)) {
            return false;
        }
        C30767f c30767f = ((APIException) th3).f22155w;
        return AbstractC22676k.m65745e(c30767f != null ? c30767f.f126704y : null, "link_failed_to_attest_request");
    }

    /* JADX INFO: renamed from: r */
    public static final C36780p m99868r(C36780p c36780p, C36780p c36780p2, float f13) {
        return new C36780p(AbstractC12889b.m36249O(c36780p.f157358a, c36780p2.f157358a, f13), AbstractC12889b.m36249O(c36780p.f157359b, c36780p2.f157359b, f13));
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC38792b8 m99869s(JSONObject jSONObject) {
        Object next;
        C39932a c39932a;
        C33623c0 c33623c0 = StripeIntent$NextActionType.f22239x;
        String strOptString = jSONObject.optString("type");
        c33623c0.getClass();
        Iterator it = StripeIntent$NextActionType.f22238Q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((StripeIntent$NextActionType) next).f22242w.equals(strOptString));
        StripeIntent$NextActionType stripeIntent$NextActionType = (StripeIntent$NextActionType) next;
        switch (stripeIntent$NextActionType == null ? -1 : AbstractC39935d.f172385a[stripeIntent$NextActionType.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                c39932a = new C39932a(19);
                break;
            case 2:
                c39932a = new C39932a(16);
                break;
            case 3:
                c39932a = new C39932a(17);
                break;
            case 4:
                c39932a = new C39932a(18);
                break;
            case 5:
                c39932a = new C39932a(20);
                break;
            case 6:
                c39932a = new C39932a(21);
                break;
            case 7:
                c39932a = new C39932a(22);
                break;
            case 8:
                c39932a = new C39932a(23);
                break;
            case 9:
                c39932a = new C39932a(13);
                break;
            case 10:
                c39932a = new C39932a(14);
                break;
            case 11:
                c39932a = new C39932a(27);
                break;
            case 12:
                c39932a = new C39932a(26);
                break;
            case 13:
                c39932a = new C39932a(25);
                break;
            case 14:
                c39932a = new C39932a(15);
                break;
            case 15:
                c39932a = new C39932a(24);
                break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(stripeIntent$NextActionType.f22242w);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return (AbstractC38792b8) c39932a.mo8011m(jSONObjectOptJSONObject);
    }

    /* JADX INFO: renamed from: t */
    public static final void m99870t(int i13, C36866a c36866a) {
        c36866a.m56794e(c36866a.f77286b - i13);
    }

    /* JADX INFO: renamed from: u */
    public static final void m99871u(int i13, C36866a c36866a) {
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Unable to reserve ", " start gap: there are already ");
        sbM30466t.append(c36866a.f77287c - c36866a.f77286b);
        sbM30466t.append(" content bytes starting at offset ");
        sbM30466t.append(c36866a.f77286b);
        throw new IllegalStateException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: v */
    public static final void m99872v(int i13, C36866a c36866a) {
        int i14 = c36866a.f77290f;
        if (i13 > i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "Start gap ", " is bigger than the capacity "));
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Unable to reserve ", " start gap: there are already ");
        sbM30466t.append(i14 - c36866a.f77289e);
        sbM30466t.append(" bytes reserved in the end");
        throw new IllegalStateException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC38735m0 m99873w(Object obj) {
        boolean zM65745e;
        try {
            AbstractC34132o.m107864I(obj);
            C11433l c11433l = (C11433l) obj;
            return c11433l != null ? new C38733l0(c11433l) : C38731k0.f166690a;
        } catch (Throwable th3) {
            Object objM107888l = AbstractC34132o.m107888l(th3);
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                if ((thM68037a instanceof AttestationError) || m99867p(thM68037a)) {
                    objM107888l = new C38727i0(thM68037a);
                } else {
                    if (thM68037a instanceof APIException) {
                        C30767f c30767f = ((APIException) thM68037a).f22155w;
                        zM65745e = AbstractC22676k.m65745e(c30767f != null ? c30767f.f126704y : null, "link_consumer_details_not_available");
                    } else {
                        zM65745e = false;
                    }
                    objM107888l = zM65745e ? new C38725h0(thM68037a) : new C38729j0(thM68037a);
                }
            }
            return (InterfaceC38735m0) objM107888l;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC26633p0 m99874x(InterfaceC39508u interfaceC39508u) {
        AbstractC22676k.m65750j(interfaceC39508u, "<this>");
        return interfaceC39508u instanceof C40605f ? ((C40605f) interfaceC39508u).f174968w : new C40607h(interfaceC39508u);
    }

    /* JADX INFO: renamed from: j */
    public abstract Method mo99875j(Class cls, Field field);

    /* JADX INFO: renamed from: k */
    public abstract Constructor mo99876k(Class cls);

    /* JADX INFO: renamed from: n */
    public abstract String[] mo99877n(Class cls);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo99878q(Class cls);
}
