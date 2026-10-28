package sj;

import ad3.C0775r;
import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonBlock;
import com.amplitude.android.engagement.types.ButtonMeta;
import com.amplitude.android.engagement.types.ButtonType;
import com.amplitude.android.engagement.types.ContentAlignment;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.ImageBlock;
import com.amplitude.android.engagement.types.MarkdownBlock;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.Required;
import com.amplitude.android.engagement.types.SnoozeAction;
import com.amplitude.android.engagement.types.StepBackAction;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseText;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import com.amplitude.android.engagement.types.ValidationConfig;
import com.amplitude.android.engagement.types.VideoBlock;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.google.crypto.tink.internal.C5101l0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p028b4.C2696g;
import p031b9.AbstractC2875y;
import p043c4.C3963i;
import p127ev.C13667h;
import p208i2.AbstractC17918w0;
import p222ij.C18587m;
import p222ij.RunnableC18585k;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23149o4;
import p294l3.C23285v0;
import p305lj.AbstractC24425e0;
import p319m4.AbstractC25012a;
import p328mj.AbstractC25611r;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p401pj.C29257a;
import p463rj.AbstractC31479j;
import p490t0.AbstractC33253j;
import p525uj.AbstractC35032j;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p530up.AbstractC35148d;
import p571w3.C36775k;
import p585wj.AbstractC37316b;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32411b;
import se.AbstractC32417h;
import tj.AbstractC33863b;
import ug.AbstractC34924m;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C32561l {

    /* JADX INFO: renamed from: a */
    public final Nudge f134896a;

    /* JADX INFO: renamed from: b */
    public final NudgeStep f134897b;

    /* JADX INFO: renamed from: c */
    public final int f134898c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f134899d;

    public C32561l(Nudge nudge, NudgeStep step, int i13, InterfaceC4339a onClose) {
        AbstractC22676k.m65750j(step, "step");
        AbstractC22676k.m65750j(onClose, "onClose");
        this.f134896a = nudge;
        this.f134897b = step;
        this.f134898c = i13;
        this.f134899d = onClose;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x0376  */
    /* JADX WARN: Code duplicated, block: B:79:0x0289  */
    /* JADX INFO: renamed from: a */
    public final void m101581a(Composer composer, int i13) {
        String strM1833d;
        String strM1833d2;
        String jSONString;
        Object objInvoke;
        Object objM1831b;
        Action action;
        Boolean boolValueOf;
        Required required;
        Required required2;
        Required required3;
        String uuid;
        boolean z4;
        ValidationConfig validation;
        Required required4;
        String message;
        Required required5;
        Required required6;
        String str;
        Required required7;
        Required required8;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1129712199);
        C4861a c4861a = (C4861a) c28655q.m87161k(AbstractC25611r.f100475a);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        NudgeStep nudgeStep = this.f134897b;
        List<ContentBlock> content = nudgeStep.getContent();
        ArrayList<ButtonBlock> arrayList = new ArrayList();
        for (Object obj : content) {
            if (obj instanceof ButtonBlock) {
                arrayList.add(obj);
            }
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
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
        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
        c28655q.m87152f0(-412521741);
        C28674u2 c28674u2 = AbstractC35033k.f148295a;
        C35035m c35035m = (C35035m) c28655q.m87161k(c28674u2);
        c28655q.m87173q(false);
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, c35035m.f148317N, 0.0f, 0.0f, 13);
        c28655q.m87152f0(-412521741);
        C35035m c35035m2 = (C35035m) c28655q.m87161k(c28674u2);
        boolean z13 = false;
        c28655q.m87173q(false);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c35035m2.f148317N), C2299e.f9110M, c28655q, 0);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
        c28655q.m87152f0(-1679330791);
        for (ButtonBlock buttonBlock : arrayList) {
            AbstractC24425e0 abstractC24425e0 = (AbstractC24425e0) ((InterfaceC28601c1) c28655q.m87161k(AbstractC33863b.f141865a)).getValue();
            ButtonMeta buttonMeta = buttonBlock.getMeta();
            c4861a.getClass();
            AbstractC22676k.m65750j(buttonMeta, "buttonMeta");
            C5101l0 c5101l0 = C4861a.f20259o;
            c5101l0.m16030H(new C13667h(nudgeStep, buttonMeta, abstractC24425e0, 3));
            try {
                C0775r c0775r = AbstractC37316b.f159546a;
                c0775r.getClass();
                strM1833d = c0775r.m1833d(NudgeStep.Companion.serializer(), nudgeStep);
            } catch (Exception e5) {
                c5101l0.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
                strM1833d = null;
            }
            try {
                C0775r c0775r2 = AbstractC37316b.f159546a;
                c0775r2.getClass();
                strM1833d2 = c0775r2.m1833d(ButtonMeta.Companion.serializer(), buttonMeta);
            } catch (Exception e13) {
                c5101l0.m16067m0(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to serialize to JSON string: ")));
                strM1833d2 = null;
            }
            if (abstractC24425e0 == null || (jSONString = abstractC24425e0.toJSONString()) == null) {
                jSONString = "undefined";
            }
            C18587m c18587m = c4861a.f20263d;
            C2696g c2696g = new C2696g(strM1833d, strM1833d2, jSONString, 6);
            c18587m.getClass();
            QuickJSContext quickJSContextM53802b = c18587m.m53802b();
            if (quickJSContextM53802b == null) {
                objInvoke = null;
            } else if (AbstractC22676k.m65745e(Looper.myLooper(), c18587m.f72605c.getLooper())) {
                objInvoke = c2696g.invoke(quickJSContextM53802b);
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference();
                AtomicReference atomicReference2 = new AtomicReference();
                c18587m.f72606d.post(new RunnableC18585k(atomicReference, c2696g, quickJSContextM53802b, atomicReference2, countDownLatch));
                try {
                    countDownLatch.await();
                    Exception exc = (Exception) atomicReference2.get();
                    if (exc != null) {
                        throw exc;
                    }
                    objInvoke = atomicReference.get();
                } catch (InterruptedException e14) {
                    c5101l0.m16032K("Interrupted while waiting for evaluation", e14);
                    objInvoke = null;
                }
            }
            String str2 = (String) objInvoke;
            if (str2 != null) {
                try {
                    C0775r c0775r3 = AbstractC37316b.f159546a;
                    c0775r3.getClass();
                    objM1831b = c0775r3.m1831b(Action.Companion.serializer(), str2);
                } catch (Exception e15) {
                    c5101l0.m16067m0(AbstractC2875y.m8298k(e15, new StringBuilder("Failed to deserialize from JSON string: ")));
                    objM1831b = null;
                }
                action = (Action) objM1831b;
            } else {
                action = null;
            }
            boolean z14 = action instanceof StepBackAction;
            boolean z15 = buttonBlock.getMeta().getButtonType() == ButtonType.SNOOZE || (action instanceof SnoozeAction);
            ContentBlock contentBlockM110165z = AbstractC34924m.m110165z(nudgeStep);
            ContentBlock contentBlockM110165z2 = AbstractC34924m.m110165z(nudgeStep);
            if (contentBlockM110165z2 instanceof SurveyTextShortBlock) {
                ValidationConfig validation2 = ((SurveyTextShortBlock) contentBlockM110165z2).getMeta().getValidation();
                if (validation2 == null || (required8 = validation2.getRequired()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(required8.getValue());
                }
            } else if (contentBlockM110165z2 instanceof SurveyTextBlock) {
                ValidationConfig validation3 = ((SurveyTextBlock) contentBlockM110165z2).getMeta().getValidation();
                if (validation3 == null || (required3 = validation3.getRequired()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(required3.getValue());
                }
            } else if (contentBlockM110165z2 instanceof SurveyListBlock) {
                ValidationConfig validation4 = ((SurveyListBlock) contentBlockM110165z2).getMeta().getValidation();
                if (validation4 == null || (required2 = validation4.getRequired()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(required2.getValue());
                }
            } else if (contentBlockM110165z2 instanceof SurveyRatingBlock) {
                ValidationConfig validation5 = ((SurveyRatingBlock) contentBlockM110165z2).getMeta().getValidation();
                if (validation5 == null || (required = validation5.getRequired()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(required.getValue());
                }
            } else {
                boolValueOf = Boolean.FALSE;
            }
            if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                ContentBlock contentBlockM110165z3 = AbstractC34924m.m110165z(nudgeStep);
                if (contentBlockM110165z3 instanceof SurveyTextBlock) {
                    uuid = ((SurveyTextBlock) contentBlockM110165z3).getUuid();
                } else if (contentBlockM110165z3 instanceof SurveyTextShortBlock) {
                    uuid = ((SurveyTextShortBlock) contentBlockM110165z3).getUuid();
                } else if (contentBlockM110165z3 instanceof SurveyListBlock) {
                    uuid = ((SurveyListBlock) contentBlockM110165z3).getUuid();
                } else {
                    uuid = contentBlockM110165z3 instanceof SurveyRatingBlock ? ((SurveyRatingBlock) contentBlockM110165z3).getUuid() : null;
                }
                if (abstractC24425e0 != null && uuid != null && AbstractC22676k.m65745e(abstractC24425e0.getBlockId(), uuid)) {
                    if (!(abstractC24425e0 instanceof SurveyResponseText ? AbstractC39414r.m125890i0(AbstractC39414r.m125869O0(((SurveyResponseText) abstractC24425e0).getValue()).toString()) : false)) {
                        z4 = false;
                    }
                }
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z16 = (!z4 || z14 || z15) ? false : true;
            if (contentBlockM110165z instanceof SurveyTextShortBlock) {
                ValidationConfig validation6 = ((SurveyTextShortBlock) contentBlockM110165z).getMeta().getValidation();
                if (validation6 == null || (required7 = validation6.getRequired()) == null) {
                    str = null;
                } else {
                    message = required7.getMessage();
                    str = message;
                }
            } else if (contentBlockM110165z instanceof SurveyTextBlock) {
                ValidationConfig validation7 = ((SurveyTextBlock) contentBlockM110165z).getMeta().getValidation();
                if (validation7 == null || (required6 = validation7.getRequired()) == null) {
                    str = null;
                } else {
                    message = required6.getMessage();
                    str = message;
                }
            } else if (contentBlockM110165z instanceof SurveyListBlock) {
                ValidationConfig validation8 = ((SurveyListBlock) contentBlockM110165z).getMeta().getValidation();
                if (validation8 == null || (required5 = validation8.getRequired()) == null) {
                    str = null;
                } else {
                    message = required5.getMessage();
                    str = message;
                }
            } else if (!(contentBlockM110165z instanceof SurveyRatingBlock) || (validation = ((SurveyRatingBlock) contentBlockM110165z).getMeta().getValidation()) == null || (required4 = validation.getRequired()) == null) {
                str = null;
            } else {
                message = required4.getMessage();
                str = message;
            }
            AbstractC32410a.m101024d(buttonBlock, !(z16 && (str == null || str.equals(""))), new C32555f(z16, context, str, action, buttonBlock, c4861a, this), c28655q, 8);
            z13 = false;
        }
        c28655q.m87173q(z13);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32556g(this, i13, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m101582b(Modifier modifier, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2026913813);
        if ((i14 & 1) != 0) {
            modifier = C2314t.f9131w;
        }
        if (this.f134896a.isDismissible()) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(8, modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC23124k3.m67102f(this.f134899d, AbstractC1102d.m3419p(16, modifier), false, null, AbstractC32552c.f134868a, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3963i(this, modifier, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX INFO: renamed from: c */
    public final void m101583c(Composer composer, int i13) {
        ?? r10;
        C28655q c28655q;
        boolean z4;
        C28655q c28655q2;
        C28655q c28655q3;
        long j7;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1978409599);
        Nudge nudge = this.f134896a;
        if (nudge.getShowStepCounter()) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 16, 0.0f, 2);
            C22949e c22949e = AbstractC22977m.f90650a;
            float f13 = 8;
            C22971k c22971kM66747j = AbstractC22977m.m66747j(f13, C2299e.f9111N);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q4, 54);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
            int i14 = this.f134898c;
            int i15 = i14 + 1;
            int size = nudge.getSteps().size();
            int i16 = AbstractC32560k.f134895b[nudge.getStepCounterFormat().ordinal()];
            if (i16 == 1) {
                c28655q4.m87152f0(-1079927940);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i15);
                sb4.append('/');
                sb4.append(size);
                String string = sb4.toString();
                c28655q4.m87152f0(-412521741);
                C28674u2 c28674u2 = AbstractC35033k.f148295a;
                C35035m c35035m = (C35035m) c28655q4.m87161k(c28674u2);
                c28655q4.m87173q(false);
                C23285v0 c23285v0M110712b = c35035m.m110712b(null, c28655q4, 1);
                c28655q4.m87152f0(-412521741);
                C35035m c35035m2 = (C35035m) c28655q4.m87161k(c28674u2);
                c28655q4.m87173q(false);
                AbstractC23149o4.m67127b(string, null, c35035m2.f148359p, 0L, null, 0L, new C36775k(3), 0L, 0, false, 0, 0, c23285v0M110712b, c28655q4, 0, 0, 65018);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q3 = c28655q5;
            } else if (i16 != 2) {
                if (i16 != 3) {
                    c28655q4.m87152f0(-1079925992);
                    c28655q4.m87173q(false);
                    c28655q3 = c28655q4;
                } else {
                    c28655q4.m87152f0(-1079927142);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4), c2306l, c28655q4, 54);
                    int iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                    c28655q4.m87152f0(-1079926899);
                    int size2 = nudge.getSteps().size();
                    int i17 = 0;
                    while (i17 < size2) {
                        boolean z13 = i17 == i14;
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, c2314t), AbstractC33253j.f138651a);
                        if (z13) {
                            c28655q4.m87152f0(-1227944187);
                            c28655q4.m87152f0(-412521741);
                            C35035m c35035m3 = (C35035m) c28655q4.m87161k(AbstractC35033k.f148295a);
                            c28655q4.m87173q(false);
                            j7 = c35035m3.f148358o;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87152f0(-1227944041);
                            c28655q4.m87152f0(-412521741);
                            C35035m c35035m4 = (C35035m) c28655q4.m87161k(AbstractC35033k.f148295a);
                            c28655q4.m87173q(false);
                            j7 = c35035m4.f148367x;
                            c28655q4.m87173q(false);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, j7, AbstractC17918w0.f69621a), c28655q4, 0);
                        i17++;
                    }
                    z4 = true;
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                    c28655q2 = c28655q4;
                }
                c28655q2.m87173q(z4);
                c28655q = c28655q2;
                r10 = z4;
            } else {
                c28655q4.m87152f0(-1079927541);
                c28655q4.m87152f0(-412521741);
                C28674u2 c28674u3 = AbstractC35033k.f148295a;
                C35035m c35035m5 = (C35035m) c28655q4.m87161k(c28674u3);
                c28655q4.m87173q(false);
                C23285v0 c23285v0M110712b2 = c35035m5.m110712b(null, c28655q4, 1);
                c28655q4.m87152f0(-412521741);
                C35035m c35035m6 = (C35035m) c28655q4.m87161k(c28674u3);
                c28655q4.m87173q(false);
                AbstractC23149o4.m67127b(i15 + " of " + size, null, c35035m6.f148359p, 0L, null, 0L, new C36775k(3), 0L, 0, false, 0, 0, c23285v0M110712b2, c28655q4, 0, 0, 65018);
                C28655q c28655q6 = c28655q4;
                c28655q6.m87173q(false);
                c28655q3 = c28655q6;
            }
            z4 = true;
            c28655q2 = c28655q3;
            c28655q2.m87173q(z4);
            c28655q = c28655q2;
            r10 = z4;
        } else {
            r10 = 1;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32556g(this, i13, r10);
    }

    /* JADX INFO: renamed from: d */
    public final void m101584d(Modifier modifier, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1163070364);
        Modifier modifier2 = (i14 & 1) != 0 ? C2314t.f9131w : modifier;
        C4861a c4861a = (C4861a) c28655q.m87161k(AbstractC25611r.f100475a);
        NudgeStep nudgeStep = this.f134897b;
        ContentAlignment titleAlignment = nudgeStep.getFormFactor().getTitleAlignment();
        int i15 = titleAlignment == null ? -1 : AbstractC32560k.f134894a[titleAlignment.ordinal()];
        int i16 = 5;
        if (i15 != 1) {
            if (i15 == 2) {
                i16 = 4;
            } else if (i15 == 3) {
                i16 = 6;
            }
        }
        int i17 = i16;
        String title = nudgeStep.getTitle();
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
        String textAnimation = nudgeStep.getFormFactor().getTextAnimation();
        long j7 = AbstractC35032j.m110704f(c28655q).f148358o;
        long j13 = AbstractC35032j.m110704f(c28655q).f148361r;
        C35035m c35035mM110704f = AbstractC35032j.m110704f(c28655q);
        c35035mM110704f.getClass();
        c28655q.m87152f0(-1055530448);
        C23285v0 c23285v0 = new C23285v0(0L, AbstractC35745c.m113248j(c35035mM110704f.f148338e, 4294967296L), new C28780r(c35035mM110704f.f148346i), null, c35035mM110704f.m110713c(c28655q), 0L, null, null, 0, 0L, 16777177);
        c28655q.m87173q(false);
        Modifier modifier3 = modifier2;
        AbstractC35148d.m111170a(title, modifierM3409f, textAnimation, j7, j13, i17, C39183o.m124805c(c23285v0.f92255a.f92192b), new C28780r(AbstractC35032j.m110704f(c28655q).f148346i), AbstractC35032j.m110704f(c28655q).m110714d(c28655q), 0L, new C32557h(c4861a, this, 0), c28655q, 134217728, 512);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32558i(this, modifier3, i13, i14, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m101585e(int i13, int i14, Composer composer, int i15) {
        C32561l c32561l = this;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1186082972);
        int i16 = (i15 & 1) != 0 ? 5 : i13;
        C4861a c4861a = (C4861a) c28655q.m87161k(AbstractC25611r.f100475a);
        float f13 = 1.0f;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        boolean z4 = false;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        c28655q.m87152f0(291378783);
        NudgeStep nudgeStep = c32561l.f134897b;
        List<ContentBlock> content = nudgeStep.getContent();
        ArrayList<MarkdownBlock> arrayList = new ArrayList();
        for (Object obj : content) {
            if (obj instanceof MarkdownBlock) {
                arrayList.add(obj);
            }
        }
        for (MarkdownBlock markdownBlock : arrayList) {
            boolean zM125920E = AbstractC39421y.m125920E(markdownBlock.getMeta().getValue(), "\n", z4);
            String value = markdownBlock.getMeta().getValue();
            if (zM125920E) {
                value = AbstractC39414r.m125879X(1, value);
            }
            C28655q c28655q2 = c28655q;
            AbstractC35148d.m111170a(AbstractC39421y.m125926K(value, "<br>", "\n", z4), AbstractC1102d.m3409f(f13, c2314t), nudgeStep.getFormFactor().getTextAnimation(), AbstractC35032j.m110704f(c28655q).f148359p, AbstractC35032j.m110704f(c28655q).f148361r, i16, AbstractC35032j.m110704f(c28655q).f148336d, new C28780r(AbstractC35032j.m110704f(c28655q).f148344h), AbstractC35032j.m110704f(c28655q).m110714d(c28655q), 100L, new C32557h(c4861a, c32561l, 1), c28655q2, 939524144, 0);
            z4 = z4;
            c28655q = c28655q2;
            c4861a = c4861a;
            f13 = 1.0f;
            c2314t = c2314t;
            nudgeStep = nudgeStep;
            c32561l = this;
        }
        c28655q.m87173q(z4);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32559j(this, i16, i14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32561l)) {
            return false;
        }
        C32561l c32561l = (C32561l) obj;
        return AbstractC22676k.m65745e(this.f134896a, c32561l.f134896a) && AbstractC22676k.m65745e(this.f134897b, c32561l.f134897b) && this.f134898c == c32561l.f134898c && AbstractC22676k.m65745e(this.f134899d, c32561l.f134899d);
    }

    /* JADX INFO: renamed from: f */
    public final void m101586f(Modifier modifier, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-43696681);
        if ((i14 & 1) != 0) {
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
        c28655q.m87152f0(1677393659);
        List<ContentBlock> content = this.f134897b.getContent();
        ArrayList<ContentBlock> arrayList = new ArrayList();
        for (Object obj : content) {
            ContentBlock contentBlock = (ContentBlock) obj;
            if ((contentBlock instanceof ImageBlock) || (contentBlock instanceof VideoBlock)) {
                arrayList.add(obj);
            }
        }
        for (ContentBlock contentBlock2 : arrayList) {
            if (contentBlock2 instanceof ImageBlock) {
                c28655q.m87152f0(1122287900);
                AbstractC32411b.m101096h((ImageBlock) contentBlock2, modifier2, c28655q, (i13 << 3) & 112);
                c28655q.m87173q(false);
            } else if (contentBlock2 instanceof VideoBlock) {
                c28655q.m87152f0(1122288029);
                AbstractC32417h.m101209r((VideoBlock) contentBlock2, modifier2, c28655q, (i13 << 3) & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(1122288149);
                c28655q.m87173q(false);
            }
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32558i(this, modifier2, i13, i14, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m101587g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-908116672);
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) c28655q.m87161k(AbstractC33863b.f141865a);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
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
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        c28655q.m87152f0(1960823048);
        List<ContentBlock> content = this.f134897b.getContent();
        ArrayList<ContentBlock> arrayList = new ArrayList();
        for (Object obj : content) {
            ContentBlock contentBlock = (ContentBlock) obj;
            if ((contentBlock instanceof SurveyTextShortBlock) || (contentBlock instanceof SurveyTextBlock) || (contentBlock instanceof SurveyListBlock) || (contentBlock instanceof SurveyRatingBlock)) {
                arrayList.add(obj);
            }
        }
        for (ContentBlock contentBlock2 : arrayList) {
            AbstractC24425e0 abstractC24425e0 = (AbstractC24425e0) interfaceC28601c1.getValue();
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C29257a(3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31479j.m96924c(contentBlock2, abstractC24425e0, (Function1) objM87133R, c28655q, 0);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C32556g(this, i13, 2);
    }

    public final int hashCode() {
        return this.f134899d.hashCode() + AbstractC11266d.m30448b(this.f134898c, (this.f134897b.hashCode() + (this.f134896a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "NudgeLayoutComponents(nudge=" + this.f134896a + ", step=" + this.f134897b + ", stepIndex=" + this.f134898c + ", onClose=" + this.f134899d + ')';
    }
}
