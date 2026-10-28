package p525uj;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.runtime.Composer;
import com.amplitude.android.engagement.C4861a;
import e93.AbstractC12889b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p108e4.AbstractC12682p;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import va3.AbstractC35846d;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;

/* JADX INFO: renamed from: uj.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35032j {

    /* JADX INFO: renamed from: a */
    public static final String[] f148294a = {"", "_"};

    /* JADX INFO: renamed from: a */
    public static final C35031i m110699a(C35031i c35031i, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        Object objOpt = jSONObject2.opt("--form-control-height");
        C17919x c17919x = null;
        Float f13 = objOpt instanceof Float ? (Float) objOpt : null;
        if (f13 == null) {
            Object objOpt2 = jSONObject.opt("--form-control-height");
            f13 = objOpt2 instanceof Float ? (Float) objOpt2 : null;
        }
        C35031i c35031iM110698a = f13 != null ? C35031i.m110698a(c35031i, f13.floatValue(), null, 0.0f, 0.0f, 0, null, null, null, null, 131070) : c35031i;
        Object objOpt3 = jSONObject2.opt("--form-control-width");
        Float f14 = objOpt3 instanceof Float ? (Float) objOpt3 : null;
        if (f14 == null) {
            Object objOpt4 = jSONObject.opt("--form-control-width");
            f14 = objOpt4 instanceof Float ? (Float) objOpt4 : null;
        }
        if (f14 != null) {
            c35031iM110698a = C35031i.m110698a(c35031iM110698a, 0.0f, Float.valueOf(f14.floatValue()), 0.0f, 0.0f, 0, null, null, null, null, 131069);
        }
        C35031i c35031iM110698a2 = c35031iM110698a;
        Object objOpt5 = jSONObject2.opt("--form-control-padding-x");
        Float f15 = objOpt5 instanceof Float ? (Float) objOpt5 : null;
        if (f15 == null) {
            Object objOpt6 = jSONObject.opt("--form-control-padding-x");
            f15 = objOpt6 instanceof Float ? (Float) objOpt6 : null;
        }
        if (f15 != null) {
            c35031iM110698a2 = C35031i.m110698a(c35031iM110698a2, 0.0f, null, f15.floatValue(), 0.0f, 0, null, null, null, null, 131067);
        }
        C35031i c35031iM110698a3 = c35031iM110698a2;
        Object objOpt7 = jSONObject2.opt("--layout-radius-button");
        Float f16 = objOpt7 instanceof Float ? (Float) objOpt7 : null;
        if (f16 == null) {
            Object objOpt8 = jSONObject.opt("--layout-radius-button");
            f16 = objOpt8 instanceof Float ? (Float) objOpt8 : null;
        }
        if (f16 != null) {
            c35031iM110698a3 = C35031i.m110698a(c35031iM110698a3, 0.0f, null, 0.0f, f16.floatValue(), 0, null, null, null, null, 131063);
        }
        C35031i c35031iM110698a4 = c35031iM110698a3;
        Object objOpt9 = jSONObject2.opt("--form-control-shadow");
        String str2 = objOpt9 instanceof String ? (String) objOpt9 : null;
        if (str2 == null) {
            Object objOpt10 = jSONObject.opt("--form-control-shadow");
            if (objOpt10 instanceof String) {
                str2 = (String) objOpt10;
                str = str2;
            } else {
                str = null;
            }
        } else {
            str = str2;
        }
        if (str != null) {
            c35031iM110698a4 = C35031i.m110698a(c35031iM110698a4, 0.0f, null, 0.0f, 0.0f, 0, str, null, null, null, 130815);
        }
        C35031i c35031iM110698a5 = c35031iM110698a4;
        Object objOpt11 = jSONObject2.opt("--form-control-shadow-color");
        C17919x c17919x2 = objOpt11 instanceof C17919x ? (C17919x) objOpt11 : null;
        if (c17919x2 == null) {
            Object objOpt12 = jSONObject.opt("--form-control-shadow-color");
            c17919x2 = objOpt12 instanceof C17919x ? (C17919x) objOpt12 : null;
        }
        if (c17919x2 != null) {
            c35031iM110698a5 = C35031i.m110698a(c35031iM110698a5, 0.0f, null, 0.0f, 0.0f, 0, null, new C17919x(c17919x2.f69639a), null, null, 130559);
        }
        C35031i c35031iM110698a6 = c35031iM110698a5;
        Object objOpt13 = jSONObject2.opt("--base-accent");
        C17919x c17919x3 = objOpt13 instanceof C17919x ? (C17919x) objOpt13 : null;
        if (c17919x3 == null) {
            Object objOpt14 = jSONObject.opt("--base-accent");
            c17919x3 = objOpt14 instanceof C17919x ? (C17919x) objOpt14 : null;
        }
        if (c17919x3 != null) {
            c35031iM110698a6 = C35031i.m110698a(c35031iM110698a6, 0.0f, null, 0.0f, 0.0f, 0, null, null, new C17919x(c17919x3.f69639a), null, 129023);
        }
        C35031i c35031i2 = c35031iM110698a6;
        Object objOpt15 = jSONObject2.opt("--form-control-active-background");
        C17919x c17919x4 = objOpt15 instanceof C17919x ? (C17919x) objOpt15 : null;
        if (c17919x4 == null) {
            Object objOpt16 = jSONObject.opt("--form-control-active-background");
            if (objOpt16 instanceof C17919x) {
                c17919x = (C17919x) objOpt16;
            }
        } else {
            c17919x = c17919x4;
        }
        return c17919x != null ? C35031i.m110698a(c35031i2, 0.0f, null, 0.0f, 0.0f, 0, null, null, null, new C17919x(c17919x.f69639a), 126975) : c35031i2;
    }

    /* JADX INFO: renamed from: b */
    public static final C35031i m110700b(C35031i c35031i, JSONObject jSONObject, JSONObject jSONObject2) {
        int iIntValue;
        Object objOpt = jSONObject2.opt("--font-weight-semibold");
        Integer num = objOpt instanceof Integer ? (Integer) objOpt : null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Object objOpt2 = jSONObject.opt("--font-weight-medium");
            Integer num2 = objOpt2 instanceof Integer ? (Integer) objOpt2 : null;
            if (num2 == null) {
                return c35031i;
            }
            iIntValue = num2.intValue();
        }
        return C35031i.m110698a(c35031i, 0.0f, null, 0.0f, 0.0f, iIntValue, null, null, null, null, 130943);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX INFO: renamed from: c */
    public static final Object m110701c(Object obj) {
        Float fValueOf;
        C17919x c17919x;
        long jM51515c;
        float[] fArr;
        long j7;
        CharSequence charSequenceSubSequence;
        if (obj instanceof Integer) {
            fValueOf = Float.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Float) {
            fValueOf = (Float) obj;
        } else {
            fValueOf = obj instanceof Double ? Float.valueOf((float) ((Number) obj).doubleValue()) : null;
        }
        if (fValueOf != null) {
            return Float.valueOf(fValueOf.floatValue());
        }
        boolean z4 = obj instanceof String;
        if (z4) {
            String str = (String) obj;
            int i13 = 1;
            if (AbstractC39421y.m125930O(str, "rgb(from rgb", false)) {
                C39410n c39410nM125848a = AbstractC35034l.f148297b.m125848a(str);
                float[] fArr2 = c39410nM125848a != null ? new float[]{Float.parseFloat((String) ((C39408l) c39410nM125848a.m125843a()).get(1)), Float.parseFloat((String) ((C39408l) c39410nM125848a.m125843a()).get(2)), Float.parseFloat((String) ((C39408l) c39410nM125848a.m125843a()).get(3)), Float.parseFloat((String) ((C39408l) c39410nM125848a.m125843a()).get(4))} : null;
                if (fArr2 != null) {
                    c17919x = new C17919x(AbstractC17918w0.m51516d((int) fArr2[0], (int) fArr2[1], (int) fArr2[2], (int) (fArr2[3] * 255)));
                } else {
                    c17919x = null;
                }
            } else if (AbstractC39421y.m125930O(str, "rgb(from #", false)) {
                C39410n c39410nM125848a2 = AbstractC35034l.f148298c.m125848a(str);
                if (c39410nM125848a2 != null) {
                    String str2 = (String) ((C39408l) c39410nM125848a2.m125843a()).get(1);
                    float f13 = Float.parseFloat((String) ((C39408l) c39410nM125848a2.m125843a()).get(2));
                    AbstractC22676k.m65750j(str2, "<this>");
                    if (6 <= str2.length()) {
                        charSequenceSubSequence = str2.subSequence(0, str2.length());
                    } else {
                        StringBuilder sb4 = new StringBuilder(6);
                        sb4.append((CharSequence) str2);
                        int length = 6 - str2.length();
                        if (1 <= length) {
                            while (true) {
                                sb4.append('0');
                                if (i13 == length) {
                                    break;
                                }
                                i13++;
                            }
                        }
                        charSequenceSubSequence = sb4;
                    }
                    String string = charSequenceSubSequence.toString();
                    String strSubstring = string.substring(0, 2);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    int i14 = Integer.parseInt(strSubstring, 16);
                    String strSubstring2 = string.substring(2, 4);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    int i15 = Integer.parseInt(strSubstring2, 16);
                    String strSubstring3 = string.substring(4, 6);
                    AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    c17919x = new C17919x(C17919x.m51541c(f13, AbstractC17918w0.m51516d(i14, i15, Integer.parseInt(strSubstring3, 16), 255)));
                } else {
                    c17919x = null;
                }
            } else {
                if (AbstractC39421y.m125930O(str, "color-mix", false)) {
                    C39410n c39410nM125848a3 = AbstractC35034l.f148299d.m125848a(str);
                    if (c39410nM125848a3 != null) {
                        long jM51516d = AbstractC17918w0.m51516d(((CharSequence) ((C39408l) c39410nM125848a3.m125843a()).get(4)).length() != 0 ? (int) (Float.parseFloat((String) ((C39408l) c39410nM125848a3.m125843a()).get(4)) * 255) : 255, Integer.parseInt((String) ((C39408l) c39410nM125848a3.m125843a()).get(1)), Integer.parseInt((String) ((C39408l) c39410nM125848a3.m125843a()).get(2)), Integer.parseInt((String) ((C39408l) c39410nM125848a3.m125843a()).get(3)));
                        String str3 = (String) ((C39408l) c39410nM125848a3.m125843a()).get(6);
                        if (AbstractC22676k.m65745e(str3, "white")) {
                            j7 = C17919x.f69629f;
                        } else if (AbstractC22676k.m65745e(str3, "black")) {
                            j7 = C17919x.f69625b;
                        } else {
                            c17919x = null;
                        }
                        float f14 = Float.parseFloat((String) ((C39408l) c39410nM125848a3.m125843a()).get(5)) / 100.0f;
                        int i16 = AbstractC35028f.f148225A;
                        float fM36283m = AbstractC12889b.m36283m(f14, 0.0f, 1.0f);
                        float f15 = 1.0f - fM36283m;
                        c17919x = new C17919x(AbstractC17918w0.m51516d((int) ((C17919x.m51547i(j7) * f15) + (C17919x.m51547i(jM51516d) * fM36283m)), (int) ((C17919x.m51546h(j7) * f15) + (C17919x.m51546h(jM51516d) * fM36283m)), (int) ((C17919x.m51544f(j7) * f15) + (C17919x.m51544f(jM51516d) * fM36283m)), (int) ((C17919x.m51543e(j7) * f15) + (C17919x.m51543e(jM51516d) * fM36283m))));
                    } else {
                        c17919x = null;
                    }
                } else if (AbstractC39421y.m125930O(str, "rgb", false)) {
                    C39410n c39410nM125848a4 = AbstractC35034l.f148300e.m125848a(str);
                    if (c39410nM125848a4 != null) {
                        fArr = new float[]{Float.parseFloat((String) ((C39408l) c39410nM125848a4.m125843a()).get(1)), Float.parseFloat((String) ((C39408l) c39410nM125848a4.m125843a()).get(2)), Float.parseFloat((String) ((C39408l) c39410nM125848a4.m125843a()).get(3)), ((CharSequence) ((C39408l) c39410nM125848a4.m125843a()).get(4)).length() != 0 ? Float.parseFloat((String) ((C39408l) c39410nM125848a4.m125843a()).get(4)) : 1.0f};
                    } else {
                        fArr = null;
                    }
                    if (fArr != null) {
                        c17919x = new C17919x(AbstractC17918w0.m51516d((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) (fArr[3] * 255)));
                    } else {
                        c17919x = null;
                    }
                } else if (AbstractC39421y.m125930O(str, "#", false)) {
                    String strSubstring4 = str.substring(1);
                    AbstractC22676k.m65749i(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 8) {
                        String strSubstring5 = strSubstring4.substring(6, 8);
                        AbstractC22676k.m65749i(strSubstring5, "substring(...)");
                        String strSubstring6 = strSubstring4.substring(0, 6);
                        AbstractC22676k.m65749i(strSubstring6, "substring(...)");
                        jM51515c = AbstractC17918w0.m51515c(Color.parseColor("#" + strSubstring5 + strSubstring6));
                    } else {
                        jM51515c = AbstractC17918w0.m51515c(Color.parseColor(str));
                    }
                    c17919x = new C17919x(jM51515c);
                } else {
                    c17919x = null;
                }
            }
        } else {
            c17919x = null;
        }
        if (c17919x != null) {
            return new C17919x(c17919x.f69639a);
        }
        if (!z4) {
            return null;
        }
        String str4 = (String) obj;
        return AbstractC35034l.f148296a.m125851e(str4) ? Float.valueOf(Float.parseFloat(AbstractC39414r.m125879X(2, str4))) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:502:0x07df  */
    /* JADX WARN: Code duplicated, block: B:503:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:505:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:507:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:509:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:510:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:512:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:513:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:516:0x0807  */
    /* JADX WARN: Code duplicated, block: B:517:0x080a  */
    /* JADX WARN: Code duplicated, block: B:519:0x080d  */
    /* JADX WARN: Code duplicated, block: B:521:0x0812  */
    /* JADX WARN: Code duplicated, block: B:523:0x081a  */
    /* JADX WARN: Code duplicated, block: B:524:0x081d  */
    /* JADX WARN: Code duplicated, block: B:526:0x0820  */
    /* JADX WARN: Code duplicated, block: B:527:0x0823  */
    /* JADX WARN: Code duplicated, block: B:530:0x085e  */
    /* JADX WARN: Code duplicated, block: B:531:0x0861  */
    /* JADX WARN: Code duplicated, block: B:533:0x0864 A[PHI: r7
      0x0864: PHI (r7v26 i2.x) = (r7v10 i2.x), (r7v13 i2.x) binds: [B:532:0x0862, B:539:0x0875] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:535:0x0869  */
    /* JADX WARN: Code duplicated, block: B:537:0x0871  */
    /* JADX WARN: Code duplicated, block: B:538:0x0874  */
    /* JADX WARN: Code duplicated, block: B:541:0x0878  */
    /* JADX WARN: Code duplicated, block: B:544:0x0899  */
    /* JADX WARN: Code duplicated, block: B:545:0x089c  */
    /* JADX WARN: Code duplicated, block: B:547:0x089f A[PHI: r7
      0x089f: PHI (r7v23 java.lang.Integer) = (r7v17 java.lang.Integer), (r7v20 java.lang.Integer) binds: [B:546:0x089d, B:552:0x08b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:548:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:550:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:551:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:554:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:557:0x08da  */
    /* JADX WARN: Code duplicated, block: B:558:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:560:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:562:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:564:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:565:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:567:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:568:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:571:0x0929  */
    /* JADX WARN: Code duplicated, block: B:572:0x092c  */
    /* JADX WARN: Code duplicated, block: B:574:0x092f  */
    /* JADX WARN: Code duplicated, block: B:576:0x0934  */
    /* JADX WARN: Code duplicated, block: B:578:0x093c  */
    /* JADX WARN: Code duplicated, block: B:579:0x093f  */
    /* JADX WARN: Code duplicated, block: B:581:0x0942  */
    /* JADX WARN: Code duplicated, block: B:582:0x0945  */
    /* JADX WARN: Code duplicated, block: B:585:0x0952  */
    /* JADX WARN: Code duplicated, block: B:586:0x0955  */
    /* JADX WARN: Code duplicated, block: B:588:0x0958  */
    /* JADX WARN: Code duplicated, block: B:590:0x095d  */
    /* JADX WARN: Code duplicated, block: B:592:0x0965  */
    /* JADX WARN: Code duplicated, block: B:593:0x0968  */
    /* JADX WARN: Code duplicated, block: B:595:0x096b  */
    /* JADX WARN: Code duplicated, block: B:596:0x096e  */
    /* JADX WARN: Code duplicated, block: B:599:0x097b  */
    /* JADX WARN: Code duplicated, block: B:600:0x097e  */
    /* JADX WARN: Code duplicated, block: B:602:0x0981 A[PHI: r10
      0x0981: PHI (r10v46 i2.x) = (r10v14 i2.x), (r10v17 i2.x) binds: [B:601:0x097f, B:608:0x0992] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:604:0x0986  */
    /* JADX WARN: Code duplicated, block: B:606:0x098e  */
    /* JADX WARN: Code duplicated, block: B:607:0x0991  */
    /* JADX WARN: Code duplicated, block: B:610:0x0995  */
    /* JADX WARN: Code duplicated, block: B:613:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:614:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:616:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:617:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:619:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:620:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:622:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:623:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:626:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:627:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:629:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:630:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:632:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:633:0x09df  */
    /* JADX WARN: Code duplicated, block: B:635:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:636:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:639:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:640:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:642:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:644:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:646:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:647:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:649:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:650:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:653:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:654:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:656:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:658:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:660:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:661:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:663:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:664:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:667:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:668:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:670:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:672:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:674:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:675:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:677:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:678:0x0aa7  */
    /* JADX INFO: renamed from: d */
    public static C35035m m110702d(JSONObject jSONObject) {
        long j7;
        long j13;
        Object objOpt;
        C17919x c17919x;
        Object objOpt2;
        C17919x c17919x2;
        long j14;
        long j15;
        Object objOpt3;
        C17919x c17919x3;
        Object objOpt4;
        C17919x c17919x4;
        long j16;
        Object objOpt5;
        C17919x c17919x5;
        Object objOpt6;
        long j17;
        Object objOpt7;
        Integer num;
        Object objOpt8;
        int iIntValue;
        Object objOpt9;
        Integer num2;
        Object objOpt10;
        Integer num3;
        int i13;
        int iIntValue2;
        Object objOpt11;
        C17919x c17919x6;
        Object objOpt12;
        C17919x c17919x7;
        long j18;
        Object objOpt13;
        C17919x c17919x8;
        Object objOpt14;
        C17919x c17919x9;
        long j19;
        Object objOpt15;
        C17919x c17919x10;
        Object objOpt16;
        long j24;
        Object objOpt17;
        C17919x c17919x11;
        Object objOpt18;
        C17919x c17919x12;
        long j25;
        Object objOpt19;
        C17919x c17919x13;
        Object objOpt20;
        C17919x c17919x14;
        long j26;
        Object objOpt21;
        Float f13;
        Object objOpt22;
        Float f14;
        float fFloatValue;
        Object objOpt23;
        C17919x c17919x15;
        Object objOpt24;
        C17919x c17919x16;
        long j27;
        long j28;
        Object objOpt25;
        Float f15;
        Object objOpt26;
        Float f16;
        float fFloatValue2;
        String mode = jSONObject.get("mode").toString();
        AbstractC22676k.m65750j(mode, "mode");
        int i14 = 0;
        for (int i15 : AbstractC12682p.m35486f(3)) {
            if (AbstractC33745d.m106643b(i15).equals(mode)) {
                i14 = i15;
                break;
            }
        }
        if (i14 == 0) {
            i14 = 1;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("theme");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        C35035m defaultTheme = i14 == 2 ? C35035m.f148303p0 : C35035m.f148302o0;
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("lightMode");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("varOverrides");
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject3 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(AbstractC33745d.m106643b(i14));
        if (jSONObjectOptJSONObject4 == null) {
            jSONObjectOptJSONObject4 = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5 = jSONObject2.optJSONObject("varDefaults");
        if (jSONObjectOptJSONObject5 == null) {
            jSONObjectOptJSONObject5 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject2.optJSONObject("varOverrides");
        if (jSONObjectOptJSONObject6 == null) {
            jSONObjectOptJSONObject6 = new JSONObject();
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
        AbstractC22676k.m65749i(itKeys, "lightModeVarOverrides.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObjectOptJSONObject5.put(next, jSONObjectOptJSONObject3.opt(next));
        }
        Iterator<String> itKeys2 = jSONObjectOptJSONObject6.keys();
        AbstractC22676k.m65749i(itKeys2, "targetVarOverrides.keys()");
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            jSONObjectOptJSONObject5.put(next2, jSONObjectOptJSONObject6.opt(next2));
        }
        JSONObject jSONObject3 = new JSONObject(jSONObjectOptJSONObject5.toString());
        Iterator<String> itKeys3 = jSONObjectOptJSONObject5.keys();
        while (itKeys3.hasNext()) {
            String next3 = itKeys3.next();
            String strOptString = jSONObjectOptJSONObject5.optString(next3, null);
            if (strOptString != null) {
                C39410n c39410nM125848a = AbstractC35034l.f148301f.m125848a(strOptString);
                while (c39410nM125848a != null) {
                    String strOptString2 = jSONObject3.optString("--" + ((String) ((C39408l) c39410nM125848a.m125843a()).get(1)), null);
                    if (strOptString2 == null) {
                        break;
                    }
                    strOptString = AbstractC39421y.m125928M(strOptString, c39410nM125848a.m125845c(), strOptString2);
                    c39410nM125848a = AbstractC35034l.f148301f.m125848a(strOptString);
                }
                jSONObject3.put(next3, strOptString);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> itKeys4 = jSONObject3.keys();
        AbstractC22676k.m65749i(itKeys4, "resolvedTargetVarDefaultsWithOverrides.keys()");
        while (itKeys4.hasNext()) {
            String next4 = itKeys4.next();
            Object value = jSONObject3.opt(next4);
            try {
                AbstractC22676k.m65749i(value, "value");
                jSONObject4.put(next4, m110701c(value));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject2.optJSONObject("componentOverrides");
        if (jSONObjectOptJSONObject7 == null) {
            jSONObjectOptJSONObject7 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("componentOverrides");
        if (jSONObjectOptJSONObject8 == null) {
            jSONObjectOptJSONObject8 = new JSONObject();
        }
        Iterator<String> itKeys5 = jSONObjectOptJSONObject8.keys();
        AbstractC22676k.m65749i(itKeys5, "targetComponentOverrides.keys()");
        while (itKeys5.hasNext()) {
            String next5 = itKeys5.next();
            if (jSONObjectOptJSONObject7.has(next5)) {
                JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject7.optJSONObject(next5);
                JSONObject jSONObjectOptJSONObject10 = jSONObjectOptJSONObject8.optJSONObject(next5);
                if (jSONObjectOptJSONObject9 == null || jSONObjectOptJSONObject10 == null) {
                    jSONObjectOptJSONObject7.put(next5, jSONObjectOptJSONObject8.opt(next5));
                } else {
                    Iterator<String> itKeys6 = jSONObjectOptJSONObject10.keys();
                    AbstractC22676k.m65749i(itKeys6, "newValue.keys()");
                    while (itKeys6.hasNext()) {
                        String next6 = itKeys6.next();
                        jSONObjectOptJSONObject9.put(next6, jSONObjectOptJSONObject10.opt(next6));
                    }
                    jSONObjectOptJSONObject7.put(next5, jSONObjectOptJSONObject9);
                }
            } else {
                jSONObjectOptJSONObject7.put(next5, jSONObjectOptJSONObject8.opt(next5));
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        Iterator<String> itKeys7 = jSONObjectOptJSONObject7.keys();
        AbstractC22676k.m65749i(itKeys7, "componentOverrides.keys()");
        while (itKeys7.hasNext()) {
            String next7 = itKeys7.next();
            JSONObject jSONObjectOptJSONObject11 = jSONObjectOptJSONObject7.optJSONObject(next7);
            if (jSONObjectOptJSONObject11 == null) {
                jSONObjectOptJSONObject11 = new JSONObject();
            }
            JSONObject jSONObject6 = new JSONObject();
            Iterator<String> itKeys8 = jSONObjectOptJSONObject11.keys();
            AbstractC22676k.m65749i(itKeys8, "overrides.keys()");
            while (itKeys8.hasNext()) {
                String next8 = itKeys8.next();
                Object value2 = jSONObjectOptJSONObject11.opt(next8);
                AbstractC22676k.m65749i(value2, "value");
                jSONObject6.put(next8, m110701c(value2));
            }
            jSONObject5.put(next7, jSONObject6);
        }
        JSONObject jSONObjectOptJSONObject12 = jSONObject5.optJSONObject("primaryButton");
        if (jSONObjectOptJSONObject12 == null) {
            jSONObjectOptJSONObject12 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject5.optJSONObject("secondaryButton");
        if (jSONObjectOptJSONObject13 == null) {
            jSONObjectOptJSONObject13 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject5.optJSONObject("tertiaryButton");
        if (jSONObjectOptJSONObject14 == null) {
            jSONObjectOptJSONObject14 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject15 = jSONObject5.optJSONObject("secondaryIconButton");
        if (jSONObjectOptJSONObject15 == null) {
            jSONObjectOptJSONObject15 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject16 = jSONObject5.optJSONObject("tertiaryIconButton");
        if (jSONObjectOptJSONObject16 == null) {
            jSONObjectOptJSONObject16 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject17 = jSONObject5.optJSONObject("inlineButton");
        if (jSONObjectOptJSONObject17 == null) {
            jSONObjectOptJSONObject17 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject18 = jSONObject5.optJSONObject("toggleButton");
        if (jSONObjectOptJSONObject18 == null) {
            jSONObjectOptJSONObject18 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject19 = jSONObject5.optJSONObject("nudgeRatingEmojis");
        if (jSONObjectOptJSONObject19 == null) {
            jSONObjectOptJSONObject19 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject20 = jSONObject5.optJSONObject("nudgeRatingNumbers");
        if (jSONObjectOptJSONObject20 == null) {
            jSONObjectOptJSONObject20 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject5.optJSONObject("nudgeRatingStars");
        if (jSONObjectOptJSONObject21 == null) {
            jSONObjectOptJSONObject21 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject22 = jSONObject5.optJSONObject("input");
        if (jSONObjectOptJSONObject22 == null) {
            jSONObjectOptJSONObject22 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject23 = jSONObject5.optJSONObject("textarea");
        if (jSONObjectOptJSONObject23 == null) {
            jSONObjectOptJSONObject23 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject5.optJSONObject("select");
        if (jSONObjectOptJSONObject24 == null) {
            jSONObjectOptJSONObject24 = new JSONObject();
        }
        JSONObject jSONObject7 = jSONObjectOptJSONObject24;
        JSONObject jSONObjectOptJSONObject25 = jSONObject5.optJSONObject("radioOption");
        if (jSONObjectOptJSONObject25 == null) {
            jSONObjectOptJSONObject25 = new JSONObject();
        }
        JSONObject jSONObject8 = jSONObjectOptJSONObject25;
        JSONObject jSONObjectOptJSONObject26 = jSONObject5.optJSONObject("checkboxOption");
        if (jSONObjectOptJSONObject26 == null) {
            jSONObjectOptJSONObject26 = new JSONObject();
        }
        JSONObject jSONObject9 = jSONObjectOptJSONObject26;
        JSONObject jSONObjectOptJSONObject27 = jSONObject5.optJSONObject("beacon");
        if (jSONObjectOptJSONObject27 == null) {
            jSONObjectOptJSONObject27 = new JSONObject();
        }
        JSONObject jSONObject10 = jSONObjectOptJSONObject27;
        Object objOpt27 = jSONObject4.opt("--base-accent");
        C17919x c17919x17 = objOpt27 instanceof C17919x ? (C17919x) objOpt27 : null;
        long j29 = c17919x17 != null ? c17919x17.f69639a : defaultTheme.f148330a;
        Object objOpt28 = jSONObject4.opt("--font-font-family");
        JSONObject jSONObject11 = jSONObjectOptJSONObject22;
        String str = objOpt28 instanceof String ? (String) objOpt28 : null;
        Object objOpt29 = jSONObject4.opt("--font-size-small");
        String str2 = str;
        Float f17 = objOpt29 instanceof Float ? (Float) objOpt29 : null;
        float fFloatValue3 = f17 != null ? f17.floatValue() : defaultTheme.f148334c;
        Object objOpt30 = jSONObject4.opt("--font-size-base");
        float f18 = fFloatValue3;
        Float f19 = objOpt30 instanceof Float ? (Float) objOpt30 : null;
        float fFloatValue4 = f19 != null ? f19.floatValue() : defaultTheme.f148336d;
        Object objOpt31 = jSONObject4.opt("--font-size-large");
        float f24 = fFloatValue4;
        Float f25 = objOpt31 instanceof Float ? (Float) objOpt31 : null;
        float fFloatValue5 = f25 != null ? f25.floatValue() : defaultTheme.f148338e;
        Object objOpt32 = jSONObject4.opt("--font-size-extra-large");
        float f26 = fFloatValue5;
        Float f27 = objOpt32 instanceof Float ? (Float) objOpt32 : null;
        float fFloatValue6 = f27 != null ? f27.floatValue() : defaultTheme.f148340f;
        Object objOpt33 = jSONObject4.opt("--font-weight-regular");
        float f28 = fFloatValue6;
        Integer num4 = objOpt33 instanceof Integer ? (Integer) objOpt33 : null;
        int iIntValue3 = num4 != null ? num4.intValue() : defaultTheme.f148342g;
        Object objOpt34 = jSONObject4.opt("--font-weight-medium");
        long j34 = j29;
        Integer num5 = objOpt34 instanceof Integer ? (Integer) objOpt34 : null;
        int iIntValue4 = num5 != null ? num5.intValue() : defaultTheme.f148344h;
        Object objOpt35 = jSONObject4.opt("--font-weight-semibold");
        Integer num6 = objOpt35 instanceof Integer ? (Integer) objOpt35 : null;
        int iIntValue5 = num6 != null ? num6.intValue() : defaultTheme.f148346i;
        Object objOpt36 = jSONObject4.opt("--font-weight-bold");
        int i16 = iIntValue4;
        Integer num7 = objOpt36 instanceof Integer ? (Integer) objOpt36 : null;
        int iIntValue6 = num7 != null ? num7.intValue() : defaultTheme.f148348j;
        Object objOpt37 = jSONObject4.opt("--font-line-height-none");
        int i17 = iIntValue6;
        Float f29 = objOpt37 instanceof Float ? (Float) objOpt37 : null;
        float fFloatValue7 = f29 != null ? f29.floatValue() : defaultTheme.f148350k;
        Object objOpt38 = jSONObject4.opt("--font-line-height-tight");
        float f34 = fFloatValue7;
        Float f35 = objOpt38 instanceof Float ? (Float) objOpt38 : null;
        float fFloatValue8 = f35 != null ? f35.floatValue() : defaultTheme.f148352l;
        Object objOpt39 = jSONObject4.opt("--font-line-height-snug");
        float f36 = fFloatValue8;
        Float f37 = objOpt39 instanceof Float ? (Float) objOpt39 : null;
        float fFloatValue9 = f37 != null ? f37.floatValue() : defaultTheme.f148354m;
        Object objOpt40 = jSONObject4.opt("--font-line-height-normal");
        float f38 = fFloatValue9;
        Float f39 = objOpt40 instanceof Float ? (Float) objOpt40 : null;
        float fFloatValue10 = f39 != null ? f39.floatValue() : defaultTheme.f148356n;
        Object objOpt41 = jSONObject4.opt("--content-primary");
        int i18 = iIntValue5;
        C17919x c17919x18 = objOpt41 instanceof C17919x ? (C17919x) objOpt41 : null;
        long j35 = c17919x18 != null ? c17919x18.f69639a : defaultTheme.f148358o;
        Object objOpt42 = jSONObject4.opt("--content-secondary");
        long j36 = j35;
        C17919x c17919x19 = objOpt42 instanceof C17919x ? (C17919x) objOpt42 : null;
        long j37 = c17919x19 != null ? c17919x19.f69639a : defaultTheme.f148359p;
        Object objOpt43 = jSONObject4.opt("--content-disabled");
        long j38 = j37;
        C17919x c17919x20 = objOpt43 instanceof C17919x ? (C17919x) objOpt43 : null;
        long j39 = c17919x20 != null ? c17919x20.f69639a : defaultTheme.f148360q;
        Object objOpt44 = jSONObject4.opt("--content-link");
        long j44 = j39;
        C17919x c17919x21 = objOpt44 instanceof C17919x ? (C17919x) objOpt44 : null;
        long j45 = c17919x21 != null ? c17919x21.f69639a : defaultTheme.f148361r;
        Object objOpt45 = jSONObject4.opt("--content-link-visited");
        long j46 = j45;
        C17919x c17919x22 = objOpt45 instanceof C17919x ? (C17919x) objOpt45 : null;
        long j47 = c17919x22 != null ? c17919x22.f69639a : defaultTheme.f148362s;
        Object objOpt46 = jSONObject4.opt("--highlight-color");
        long j48 = j47;
        C17919x c17919x23 = objOpt46 instanceof C17919x ? (C17919x) objOpt46 : null;
        long j49 = c17919x23 != null ? c17919x23.f69639a : defaultTheme.f148363t;
        Object objOpt47 = jSONObject4.opt("--border-primary");
        long j54 = j49;
        C17919x c17919x24 = objOpt47 instanceof C17919x ? (C17919x) objOpt47 : null;
        long j55 = c17919x24 != null ? c17919x24.f69639a : defaultTheme.f148364u;
        Object objOpt48 = jSONObject4.opt("--border-primary-disabled");
        long j56 = j55;
        C17919x c17919x25 = objOpt48 instanceof C17919x ? (C17919x) objOpt48 : null;
        long j57 = c17919x25 != null ? c17919x25.f69639a : defaultTheme.f148365v;
        Object objOpt49 = jSONObject4.opt("--background-primary");
        long j58 = j57;
        C17919x c17919x26 = objOpt49 instanceof C17919x ? (C17919x) objOpt49 : null;
        long j59 = c17919x26 != null ? c17919x26.f69639a : defaultTheme.f148366w;
        Object objOpt50 = jSONObject4.opt("--background-secondary");
        long j64 = j59;
        C17919x c17919x27 = objOpt50 instanceof C17919x ? (C17919x) objOpt50 : null;
        long j65 = c17919x27 != null ? c17919x27.f69639a : defaultTheme.f148367x;
        Object objOpt51 = jSONObject4.opt("--background-disabled");
        long j66 = j65;
        C17919x c17919x28 = objOpt51 instanceof C17919x ? (C17919x) objOpt51 : null;
        long j67 = c17919x28 != null ? c17919x28.f69639a : defaultTheme.f148368y;
        Object objOpt52 = jSONObject4.opt("--height-small");
        Float f43 = objOpt52 instanceof Float ? (Float) objOpt52 : null;
        float fFloatValue11 = f43 != null ? f43.floatValue() : defaultTheme.f148369z;
        Object objOpt53 = jSONObject4.opt("--layout-radius-beacon");
        float f44 = fFloatValue11;
        Float f45 = objOpt53 instanceof Float ? (Float) objOpt53 : null;
        float fFloatValue12 = f45 != null ? f45.floatValue() : defaultTheme.f148304A;
        Object objOpt54 = jSONObject4.opt("--form-control-height");
        float f46 = fFloatValue12;
        Float f47 = objOpt54 instanceof Float ? (Float) objOpt54 : null;
        float fFloatValue13 = f47 != null ? f47.floatValue() : defaultTheme.f148305B;
        Object objOpt55 = jSONObject4.opt("--layout-radius-button");
        float f48 = fFloatValue13;
        Float f49 = objOpt55 instanceof Float ? (Float) objOpt55 : null;
        float fFloatValue14 = f49 != null ? f49.floatValue() : defaultTheme.f148306C;
        Object objOpt56 = jSONObject4.opt("--form-control-padding-x");
        float f54 = fFloatValue14;
        Float f55 = objOpt56 instanceof Float ? (Float) objOpt56 : null;
        float fFloatValue15 = f55 != null ? f55.floatValue() : defaultTheme.f148307D;
        Object objOpt57 = jSONObject4.opt("--form-control-gap");
        float f56 = fFloatValue15;
        Float f57 = objOpt57 instanceof Float ? (Float) objOpt57 : null;
        float fFloatValue16 = f57 != null ? f57.floatValue() : defaultTheme.f148308E;
        Object objOpt58 = jSONObject4.opt("--form-control-shadow");
        float f58 = fFloatValue16;
        String str3 = objOpt58 instanceof String ? (String) objOpt58 : null;
        if (str3 == null) {
            str3 = defaultTheme.f148309F;
        }
        Object objOpt59 = jSONObject4.opt("--form-control-shadow-color");
        String str4 = str3;
        C17919x c17919x29 = objOpt59 instanceof C17919x ? (C17919x) objOpt59 : null;
        long j68 = c17919x29 != null ? c17919x29.f69639a : defaultTheme.f148310G;
        Object objOpt60 = jSONObject4.opt("--form-control-background");
        C17919x c17919x30 = objOpt60 instanceof C17919x ? (C17919x) objOpt60 : null;
        long j69 = c17919x30 != null ? c17919x30.f69639a : defaultTheme.f148311H;
        Object objOpt61 = jSONObject4.opt("--form-control-active-background");
        long j73 = j69;
        C17919x c17919x31 = objOpt61 instanceof C17919x ? (C17919x) objOpt61 : null;
        long j74 = c17919x31 != null ? c17919x31.f69639a : defaultTheme.f148312I;
        Object objOpt62 = jSONObject4.opt("--form-control-focus-ring-color");
        long j75 = j74;
        C17919x c17919x32 = objOpt62 instanceof C17919x ? (C17919x) objOpt62 : null;
        long j76 = c17919x32 != null ? c17919x32.f69639a : defaultTheme.f148313J;
        Object objOpt63 = jSONObject4.opt("--form-control-focus-ring-width");
        long j77 = j76;
        Float f59 = objOpt63 instanceof Float ? (Float) objOpt63 : null;
        float fFloatValue17 = f59 != null ? f59.floatValue() : defaultTheme.f148314K;
        Object objOpt64 = jSONObject4.opt("--layout-radius-card");
        Float f64 = objOpt64 instanceof Float ? (Float) objOpt64 : null;
        float fFloatValue18 = f64 != null ? f64.floatValue() : defaultTheme.f148315L;
        Object objOpt65 = jSONObject4.opt("--layout-padding");
        float f65 = fFloatValue17;
        Float f66 = objOpt65 instanceof Float ? (Float) objOpt65 : null;
        float fFloatValue19 = f66 != null ? f66.floatValue() : defaultTheme.f148316M;
        Object objOpt66 = jSONObject4.opt("--layout-gap");
        float f67 = fFloatValue19;
        Float f68 = objOpt66 instanceof Float ? (Float) objOpt66 : null;
        float fFloatValue20 = f68 != null ? f68.floatValue() : defaultTheme.f148317N;
        Object objOpt67 = jSONObject4.opt("--layout-shadow");
        float f69 = fFloatValue20;
        String str5 = objOpt67 instanceof String ? (String) objOpt67 : null;
        if (str5 == null) {
            str5 = defaultTheme.f148318O;
        }
        Object objOpt68 = jSONObject4.opt("--layout-shadow-color");
        float f74 = fFloatValue18;
        C17919x c17919x33 = objOpt68 instanceof C17919x ? (C17919x) objOpt68 : null;
        long j78 = c17919x33 != null ? c17919x33.f69639a : defaultTheme.f148319P;
        Object objOpt69 = jSONObject4.opt("--modal-width");
        long j79 = j78;
        Float f75 = objOpt69 instanceof Float ? (Float) objOpt69 : null;
        float fFloatValue21 = f75 != null ? f75.floatValue() : defaultTheme.f148320Q;
        Object objOpt70 = jSONObject4.opt("--modal-max-height");
        Float f76 = objOpt70 instanceof Float ? (Float) objOpt70 : null;
        if (f76 == null) {
            f76 = defaultTheme.f148321R;
        }
        Object objOpt71 = jSONObject4.opt("--popover-width");
        float f77 = fFloatValue21;
        Float f78 = objOpt71 instanceof Float ? (Float) objOpt71 : null;
        float fFloatValue22 = f78 != null ? f78.floatValue() : defaultTheme.f148322S;
        Object objOpt72 = jSONObject4.opt("--popover-max-height");
        float f79 = fFloatValue22;
        Float f84 = objOpt72 instanceof Float ? (Float) objOpt72 : null;
        if (f84 == null) {
            f84 = defaultTheme.f148323T;
        }
        Object objOpt73 = jSONObject4.opt("--tooltip-max-width");
        Float f85 = f76;
        Float f86 = objOpt73 instanceof Float ? (Float) objOpt73 : null;
        float fFloatValue23 = f86 != null ? f86.floatValue() : defaultTheme.f148324U;
        Object objOpt74 = jSONObject4.opt("--tooltip-max-height");
        float f87 = fFloatValue23;
        Float f88 = objOpt74 instanceof Float ? (Float) objOpt74 : null;
        if (f88 == null) {
            f88 = defaultTheme.f148325V;
        }
        Object objOpt75 = jSONObject4.opt("--checklist-width");
        Float f89 = f88;
        Float f94 = objOpt75 instanceof Float ? (Float) objOpt75 : null;
        float fFloatValue24 = f94 != null ? f94.floatValue() : defaultTheme.f148326W;
        Object objOpt76 = jSONObject4.opt("--checklist-max-height");
        float f95 = fFloatValue24;
        Float f96 = objOpt76 instanceof Float ? (Float) objOpt76 : null;
        float fFloatValue25 = f96 != null ? f96.floatValue() : defaultTheme.f148327X;
        AbstractC22676k.m65750j(defaultTheme, "defaultTheme");
        Float f97 = f84;
        long j82 = defaultTheme.f148330a;
        float f98 = fFloatValue25;
        int i19 = defaultTheme.f148344h;
        Object objOpt77 = jSONObjectOptJSONObject12.opt("--button-primary-background");
        C17919x c17919x34 = objOpt77 instanceof C17919x ? (C17919x) objOpt77 : null;
        if (c17919x34 == null) {
            Object objOpt78 = jSONObject4.opt("--button-primary-background");
            C17919x c17919x35 = objOpt78 instanceof C17919x ? (C17919x) objOpt78 : null;
            if (c17919x35 != null) {
                j13 = c17919x35.f69639a;
            } else {
                j7 = j82;
            }
            objOpt = jSONObjectOptJSONObject12.opt("--button-primary-border-color");
            if (objOpt instanceof C17919x) {
                c17919x = (C17919x) objOpt;
            } else {
                c17919x = null;
            }
            if (c17919x != null) {
                objOpt2 = jSONObject4.opt("--button-primary-border-color");
                if (objOpt2 instanceof C17919x) {
                    c17919x2 = (C17919x) objOpt2;
                } else {
                    c17919x2 = null;
                }
                if (c17919x2 != null) {
                    j15 = c17919x2.f69639a;
                } else {
                    j14 = j82;
                }
                objOpt3 = jSONObjectOptJSONObject12.opt("--button-primary-content");
                if (objOpt3 instanceof C17919x) {
                    c17919x3 = (C17919x) objOpt3;
                } else {
                    c17919x3 = null;
                }
                if (c17919x3 != null) {
                    j16 = c17919x3.f69639a;
                } else {
                    objOpt4 = jSONObject4.opt("--button-primary-content");
                    if (objOpt4 instanceof C17919x) {
                        c17919x4 = (C17919x) objOpt4;
                    } else {
                        c17919x4 = null;
                    }
                    if (c17919x4 != null) {
                        j16 = c17919x4.f69639a;
                    } else {
                        j16 = C17919x.f69629f;
                    }
                }
                C35031i c35031iM110700b = m110700b(m110699a(new C35031i(0.0f, 0.0f, j7, j14, j16, 0, null, null, null, 130959), jSONObject4, jSONObjectOptJSONObject12), jSONObject4, jSONObjectOptJSONObject12);
                C35031i c35031iM110706h = m110706h(jSONObject4, jSONObjectOptJSONObject13, defaultTheme);
                C35031i c35031iM110707i = m110707i(jSONObject4, jSONObjectOptJSONObject14, defaultTheme);
                C35031i c35031iM110706h2 = m110706h(jSONObject4, jSONObjectOptJSONObject15, defaultTheme);
                C35031i c35031iM110707i2 = m110707i(jSONObject4, jSONObjectOptJSONObject16, defaultTheme);
                long j83 = C17919x.f69636m;
                objOpt5 = jSONObjectOptJSONObject17.opt("--content-primary");
                if (objOpt5 instanceof C17919x) {
                    c17919x5 = (C17919x) objOpt5;
                } else {
                    c17919x5 = null;
                }
                if (c17919x5 != null) {
                    j17 = c17919x5.f69639a;
                } else {
                    objOpt6 = jSONObject4.opt("--content-primary");
                    if (objOpt6 instanceof C17919x) {
                        c17919x5 = (C17919x) objOpt6;
                    } else {
                        c17919x5 = null;
                    }
                    if (c17919x5 != null) {
                        j17 = c17919x5.f69639a;
                    } else {
                        j17 = defaultTheme.f148358o;
                    }
                }
                C35031i c35031i = new C35031i(0.0f, 0.0f, j83, j83, j17, 0, null, null, null, 130959);
                objOpt7 = jSONObjectOptJSONObject17.opt("--font-weight-medium");
                if (objOpt7 instanceof Integer) {
                    num = (Integer) objOpt7;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    objOpt8 = jSONObject4.opt("--font-weight-medium");
                    if (objOpt8 instanceof Integer) {
                        num = (Integer) objOpt8;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i19;
                    }
                }
                C35031i c35031iM110698a = C35031i.m110698a(c35031i, 0.0f, null, 0.0f, 0.0f, iIntValue, null, null, null, null, 130943);
                C35031i c35031iM110707i3 = m110707i(jSONObject4, jSONObjectOptJSONObject18, defaultTheme);
                objOpt9 = jSONObjectOptJSONObject18.opt("--font-weight-medium");
                if (objOpt9 instanceof Integer) {
                    num2 = (Integer) objOpt9;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    objOpt10 = jSONObject4.opt("--font-weight-medium");
                    if (objOpt10 instanceof Integer) {
                        num3 = (Integer) objOpt10;
                    } else {
                        num3 = null;
                    }
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        i13 = i19;
                    }
                    C35031i c35031iM110698a2 = C35031i.m110698a(c35031iM110707i3, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
                    C35031i c35031iM110708j = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
                    C35031i c35031iM110708j2 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
                    JSONObject jSONObject12 = jSONObjectOptJSONObject21;
                    objOpt11 = jSONObject12.opt("--form-control-background");
                    if (objOpt11 instanceof C17919x) {
                        c17919x6 = (C17919x) objOpt11;
                    } else {
                        c17919x6 = null;
                    }
                    if (c17919x6 != null) {
                        j18 = c17919x6.f69639a;
                    } else {
                        objOpt12 = jSONObject4.opt("--form-control-background");
                        if (objOpt12 instanceof C17919x) {
                            c17919x7 = (C17919x) objOpt12;
                        } else {
                            c17919x7 = null;
                        }
                        if (c17919x7 != null) {
                            j18 = c17919x7.f69639a;
                        } else {
                            j18 = defaultTheme.f148366w;
                        }
                    }
                    long j84 = j18;
                    objOpt13 = jSONObject12.opt("--form-control-border-color");
                    if (objOpt13 instanceof C17919x) {
                        c17919x8 = (C17919x) objOpt13;
                    } else {
                        c17919x8 = null;
                    }
                    if (c17919x8 != null) {
                        j19 = c17919x8.f69639a;
                    } else {
                        objOpt14 = jSONObject4.opt("--form-control-border-color");
                        if (objOpt14 instanceof C17919x) {
                            c17919x9 = (C17919x) objOpt14;
                        } else {
                            c17919x9 = null;
                        }
                        if (c17919x9 != null) {
                            j19 = c17919x9.f69639a;
                        } else {
                            j19 = defaultTheme.f148364u;
                        }
                    }
                    long j85 = j19;
                    objOpt15 = jSONObject12.opt("--nudge-rating-star-color");
                    if (objOpt15 instanceof C17919x) {
                        c17919x10 = (C17919x) objOpt15;
                    } else {
                        c17919x10 = null;
                    }
                    if (c17919x10 != null) {
                        j24 = c17919x10.f69639a;
                    } else {
                        objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                        if (objOpt16 instanceof C17919x) {
                            c17919x10 = (C17919x) objOpt16;
                        } else {
                            c17919x10 = null;
                        }
                        if (c17919x10 != null) {
                            j24 = c17919x10.f69639a;
                        } else {
                            j24 = AbstractC35028f.f148251z;
                        }
                    }
                    long j86 = j24;
                    objOpt17 = jSONObject12.opt("--nudge-rating-star-color");
                    if (objOpt17 instanceof C17919x) {
                        c17919x11 = (C17919x) objOpt17;
                    } else {
                        c17919x11 = null;
                    }
                    if (c17919x11 != null) {
                        j25 = c17919x11.f69639a;
                    } else {
                        objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                        if (objOpt18 instanceof C17919x) {
                            c17919x12 = (C17919x) objOpt18;
                        } else {
                            c17919x12 = null;
                        }
                        if (c17919x12 != null) {
                            j25 = c17919x12.f69639a;
                        } else {
                            j25 = AbstractC35028f.f148251z;
                        }
                    }
                    C17919x c17919x36 = new C17919x(j25);
                    objOpt19 = jSONObject12.opt("--nudge-rating-star-color-selected");
                    if (objOpt19 instanceof C17919x) {
                        c17919x13 = (C17919x) objOpt19;
                    } else {
                        c17919x13 = null;
                    }
                    if (c17919x13 != null) {
                        j26 = c17919x13.f69639a;
                    } else {
                        objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                        if (objOpt20 instanceof C17919x) {
                            c17919x14 = (C17919x) objOpt20;
                        } else {
                            c17919x14 = null;
                        }
                        if (c17919x14 != null) {
                            j26 = c17919x14.f69639a;
                        } else {
                            j26 = AbstractC35028f.f148251z;
                        }
                    }
                    C35031i c35031iM110700b2 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j84, j85, j86, 0, null, c17919x36, new C17919x(j26), 106383), jSONObject4, jSONObject12), jSONObject4, jSONObject12);
                    C35031i c35031iM110705g = m110705g(jSONObject4, jSONObject11, defaultTheme);
                    C35031i c35031iM110705g2 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
                    C35031i c35031iM110705g3 = m110705g(jSONObject4, jSONObject7, defaultTheme);
                    C35031i c35031iM110705g4 = m110705g(jSONObject4, jSONObject8, defaultTheme);
                    C35031i c35031iM110705g5 = m110705g(jSONObject4, jSONObject9, defaultTheme);
                    objOpt21 = jSONObject10.opt("--height-small");
                    if (objOpt21 instanceof Float) {
                        f13 = (Float) objOpt21;
                    } else {
                        f13 = null;
                    }
                    if (f13 != null) {
                        fFloatValue = f13.floatValue();
                    } else {
                        objOpt22 = jSONObject4.opt("--height-small");
                        if (objOpt22 instanceof Float) {
                            f14 = (Float) objOpt22;
                        } else {
                            f14 = null;
                        }
                        if (f14 != null) {
                            fFloatValue = f14.floatValue();
                        } else {
                            fFloatValue = defaultTheme.f148369z;
                        }
                    }
                    float f99 = fFloatValue;
                    objOpt23 = jSONObject10.opt("--base-accent");
                    if (objOpt23 instanceof C17919x) {
                        c17919x15 = (C17919x) objOpt23;
                    } else {
                        c17919x15 = null;
                    }
                    if (c17919x15 != null) {
                        objOpt24 = jSONObject4.opt("--base-accent");
                        if (objOpt24 instanceof C17919x) {
                            c17919x16 = (C17919x) objOpt24;
                        } else {
                            c17919x16 = null;
                        }
                        if (c17919x16 != null) {
                            j28 = c17919x16.f69639a;
                        } else {
                            j27 = j82;
                        }
                        objOpt25 = jSONObject10.opt("--layout-radius-circle");
                        if (objOpt25 instanceof Float) {
                            f15 = (Float) objOpt25;
                        } else {
                            f15 = null;
                        }
                        if (f15 != null) {
                            fFloatValue2 = f15.floatValue();
                        } else {
                            objOpt26 = jSONObject4.opt("--layout-radius-circle");
                            if (objOpt26 instanceof Float) {
                                f16 = (Float) objOpt26;
                            } else {
                                f16 = null;
                            }
                            if (f16 != null) {
                                fFloatValue2 = f16.floatValue();
                            } else {
                                fFloatValue2 = defaultTheme.f148304A;
                            }
                        }
                        return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b, c35031iM110706h, c35031iM110707i, c35031iM110706h2, c35031iM110707i2, c35031iM110698a, c35031iM110698a2, c35031iM110708j, c35031iM110708j2, c35031iM110700b2, c35031iM110705g, c35031iM110705g2, c35031iM110705g3, c35031iM110705g4, c35031iM110705g5, new C35031i(f99, fFloatValue2, j27, j83, j83, 0, null, null, null, 130950));
                    }
                    j28 = c17919x15.f69639a;
                    j27 = j28;
                    objOpt25 = jSONObject10.opt("--layout-radius-circle");
                    if (objOpt25 instanceof Float) {
                        f15 = (Float) objOpt25;
                    } else {
                        f15 = null;
                    }
                    if (f15 != null) {
                        fFloatValue2 = f15.floatValue();
                    } else {
                        objOpt26 = jSONObject4.opt("--layout-radius-circle");
                        if (objOpt26 instanceof Float) {
                            f16 = (Float) objOpt26;
                        } else {
                            f16 = null;
                        }
                        if (f16 != null) {
                            fFloatValue2 = f16.floatValue();
                        } else {
                            fFloatValue2 = defaultTheme.f148304A;
                        }
                    }
                    return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b, c35031iM110706h, c35031iM110707i, c35031iM110706h2, c35031iM110707i2, c35031iM110698a, c35031iM110698a2, c35031iM110708j, c35031iM110708j2, c35031iM110700b2, c35031iM110705g, c35031iM110705g2, c35031iM110705g3, c35031iM110705g4, c35031iM110705g5, new C35031i(f99, fFloatValue2, j27, j83, j83, 0, null, null, null, 130950));
                }
                iIntValue2 = num2.intValue();
                i13 = iIntValue2;
                C35031i c35031iM110698a3 = C35031i.m110698a(c35031iM110707i3, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
                C35031i c35031iM110708j3 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
                C35031i c35031iM110708j4 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
                JSONObject jSONObject13 = jSONObjectOptJSONObject21;
                objOpt11 = jSONObject13.opt("--form-control-background");
                if (objOpt11 instanceof C17919x) {
                    c17919x6 = (C17919x) objOpt11;
                } else {
                    c17919x6 = null;
                }
                if (c17919x6 != null) {
                    j18 = c17919x6.f69639a;
                } else {
                    objOpt12 = jSONObject4.opt("--form-control-background");
                    if (objOpt12 instanceof C17919x) {
                        c17919x7 = (C17919x) objOpt12;
                    } else {
                        c17919x7 = null;
                    }
                    if (c17919x7 != null) {
                        j18 = c17919x7.f69639a;
                    } else {
                        j18 = defaultTheme.f148366w;
                    }
                }
                long j87 = j18;
                objOpt13 = jSONObject13.opt("--form-control-border-color");
                if (objOpt13 instanceof C17919x) {
                    c17919x8 = (C17919x) objOpt13;
                } else {
                    c17919x8 = null;
                }
                if (c17919x8 != null) {
                    j19 = c17919x8.f69639a;
                } else {
                    objOpt14 = jSONObject4.opt("--form-control-border-color");
                    if (objOpt14 instanceof C17919x) {
                        c17919x9 = (C17919x) objOpt14;
                    } else {
                        c17919x9 = null;
                    }
                    if (c17919x9 != null) {
                        j19 = c17919x9.f69639a;
                    } else {
                        j19 = defaultTheme.f148364u;
                    }
                }
                long j88 = j19;
                objOpt15 = jSONObject13.opt("--nudge-rating-star-color");
                if (objOpt15 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt15;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt16 instanceof C17919x) {
                        c17919x10 = (C17919x) objOpt16;
                    } else {
                        c17919x10 = null;
                    }
                    if (c17919x10 != null) {
                        j24 = c17919x10.f69639a;
                    } else {
                        j24 = AbstractC35028f.f148251z;
                    }
                }
                long j89 = j24;
                objOpt17 = jSONObject13.opt("--nudge-rating-star-color");
                if (objOpt17 instanceof C17919x) {
                    c17919x11 = (C17919x) objOpt17;
                } else {
                    c17919x11 = null;
                }
                if (c17919x11 != null) {
                    j25 = c17919x11.f69639a;
                } else {
                    objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt18 instanceof C17919x) {
                        c17919x12 = (C17919x) objOpt18;
                    } else {
                        c17919x12 = null;
                    }
                    if (c17919x12 != null) {
                        j25 = c17919x12.f69639a;
                    } else {
                        j25 = AbstractC35028f.f148251z;
                    }
                }
                C17919x c17919x37 = new C17919x(j25);
                objOpt19 = jSONObject13.opt("--nudge-rating-star-color-selected");
                if (objOpt19 instanceof C17919x) {
                    c17919x13 = (C17919x) objOpt19;
                } else {
                    c17919x13 = null;
                }
                if (c17919x13 != null) {
                    j26 = c17919x13.f69639a;
                } else {
                    objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                    if (objOpt20 instanceof C17919x) {
                        c17919x14 = (C17919x) objOpt20;
                    } else {
                        c17919x14 = null;
                    }
                    if (c17919x14 != null) {
                        j26 = c17919x14.f69639a;
                    } else {
                        j26 = AbstractC35028f.f148251z;
                    }
                }
                C35031i c35031iM110700b3 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j87, j88, j89, 0, null, c17919x37, new C17919x(j26), 106383), jSONObject4, jSONObject13), jSONObject4, jSONObject13);
                C35031i c35031iM110705g6 = m110705g(jSONObject4, jSONObject11, defaultTheme);
                C35031i c35031iM110705g7 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
                C35031i c35031iM110705g8 = m110705g(jSONObject4, jSONObject7, defaultTheme);
                C35031i c35031iM110705g9 = m110705g(jSONObject4, jSONObject8, defaultTheme);
                C35031i c35031iM110705g10 = m110705g(jSONObject4, jSONObject9, defaultTheme);
                objOpt21 = jSONObject10.opt("--height-small");
                if (objOpt21 instanceof Float) {
                    f13 = (Float) objOpt21;
                } else {
                    f13 = null;
                }
                if (f13 != null) {
                    fFloatValue = f13.floatValue();
                } else {
                    objOpt22 = jSONObject4.opt("--height-small");
                    if (objOpt22 instanceof Float) {
                        f14 = (Float) objOpt22;
                    } else {
                        f14 = null;
                    }
                    if (f14 != null) {
                        fFloatValue = f14.floatValue();
                    } else {
                        fFloatValue = defaultTheme.f148369z;
                    }
                }
                float f910 = fFloatValue;
                objOpt23 = jSONObject10.opt("--base-accent");
                if (objOpt23 instanceof C17919x) {
                    c17919x15 = (C17919x) objOpt23;
                } else {
                    c17919x15 = null;
                }
                if (c17919x15 != null) {
                    objOpt24 = jSONObject4.opt("--base-accent");
                    if (objOpt24 instanceof C17919x) {
                        c17919x16 = (C17919x) objOpt24;
                    } else {
                        c17919x16 = null;
                    }
                    if (c17919x16 != null) {
                        j28 = c17919x16.f69639a;
                    } else {
                        j27 = j82;
                    }
                    objOpt25 = jSONObject10.opt("--layout-radius-circle");
                    if (objOpt25 instanceof Float) {
                        f15 = (Float) objOpt25;
                    } else {
                        f15 = null;
                    }
                    if (f15 != null) {
                        fFloatValue2 = f15.floatValue();
                    } else {
                        objOpt26 = jSONObject4.opt("--layout-radius-circle");
                        if (objOpt26 instanceof Float) {
                            f16 = (Float) objOpt26;
                        } else {
                            f16 = null;
                        }
                        if (f16 != null) {
                            fFloatValue2 = f16.floatValue();
                        } else {
                            fFloatValue2 = defaultTheme.f148304A;
                        }
                    }
                    return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b, c35031iM110706h, c35031iM110707i, c35031iM110706h2, c35031iM110707i2, c35031iM110698a, c35031iM110698a3, c35031iM110708j3, c35031iM110708j4, c35031iM110700b3, c35031iM110705g6, c35031iM110705g7, c35031iM110705g8, c35031iM110705g9, c35031iM110705g10, new C35031i(f910, fFloatValue2, j27, j83, j83, 0, null, null, null, 130950));
                }
                j28 = c17919x15.f69639a;
                j27 = j28;
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b, c35031iM110706h, c35031iM110707i, c35031iM110706h2, c35031iM110707i2, c35031iM110698a, c35031iM110698a3, c35031iM110708j3, c35031iM110708j4, c35031iM110700b3, c35031iM110705g6, c35031iM110705g7, c35031iM110705g8, c35031iM110705g9, c35031iM110705g10, new C35031i(f910, fFloatValue2, j27, j83, j83, 0, null, null, null, 130950));
            }
            j15 = c17919x.f69639a;
            j14 = j15;
            objOpt3 = jSONObjectOptJSONObject12.opt("--button-primary-content");
            if (objOpt3 instanceof C17919x) {
                c17919x3 = (C17919x) objOpt3;
            } else {
                c17919x3 = null;
            }
            if (c17919x3 != null) {
                j16 = c17919x3.f69639a;
            } else {
                objOpt4 = jSONObject4.opt("--button-primary-content");
                if (objOpt4 instanceof C17919x) {
                    c17919x4 = (C17919x) objOpt4;
                } else {
                    c17919x4 = null;
                }
                if (c17919x4 != null) {
                    j16 = c17919x4.f69639a;
                } else {
                    j16 = C17919x.f69629f;
                }
            }
            C35031i c35031iM110700b4 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j7, j14, j16, 0, null, null, null, 130959), jSONObject4, jSONObjectOptJSONObject12), jSONObject4, jSONObjectOptJSONObject12);
            C35031i c35031iM110706h3 = m110706h(jSONObject4, jSONObjectOptJSONObject13, defaultTheme);
            C35031i c35031iM110707i4 = m110707i(jSONObject4, jSONObjectOptJSONObject14, defaultTheme);
            C35031i c35031iM110706h4 = m110706h(jSONObject4, jSONObjectOptJSONObject15, defaultTheme);
            C35031i c35031iM110707i5 = m110707i(jSONObject4, jSONObjectOptJSONObject16, defaultTheme);
            long j810 = C17919x.f69636m;
            objOpt5 = jSONObjectOptJSONObject17.opt("--content-primary");
            if (objOpt5 instanceof C17919x) {
                c17919x5 = (C17919x) objOpt5;
            } else {
                c17919x5 = null;
            }
            if (c17919x5 != null) {
                j17 = c17919x5.f69639a;
            } else {
                objOpt6 = jSONObject4.opt("--content-primary");
                if (objOpt6 instanceof C17919x) {
                    c17919x5 = (C17919x) objOpt6;
                } else {
                    c17919x5 = null;
                }
                if (c17919x5 != null) {
                    j17 = c17919x5.f69639a;
                } else {
                    j17 = defaultTheme.f148358o;
                }
            }
            C35031i c35031i2 = new C35031i(0.0f, 0.0f, j810, j810, j17, 0, null, null, null, 130959);
            objOpt7 = jSONObjectOptJSONObject17.opt("--font-weight-medium");
            if (objOpt7 instanceof Integer) {
                num = (Integer) objOpt7;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                objOpt8 = jSONObject4.opt("--font-weight-medium");
                if (objOpt8 instanceof Integer) {
                    num = (Integer) objOpt8;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i19;
                }
            }
            C35031i c35031iM110698a4 = C35031i.m110698a(c35031i2, 0.0f, null, 0.0f, 0.0f, iIntValue, null, null, null, null, 130943);
            C35031i c35031iM110707i6 = m110707i(jSONObject4, jSONObjectOptJSONObject18, defaultTheme);
            objOpt9 = jSONObjectOptJSONObject18.opt("--font-weight-medium");
            if (objOpt9 instanceof Integer) {
                num2 = (Integer) objOpt9;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                objOpt10 = jSONObject4.opt("--font-weight-medium");
                if (objOpt10 instanceof Integer) {
                    num3 = (Integer) objOpt10;
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    i13 = i19;
                }
                C35031i c35031iM110698a5 = C35031i.m110698a(c35031iM110707i6, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
                C35031i c35031iM110708j5 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
                C35031i c35031iM110708j6 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
                JSONObject jSONObject14 = jSONObjectOptJSONObject21;
                objOpt11 = jSONObject14.opt("--form-control-background");
                if (objOpt11 instanceof C17919x) {
                    c17919x6 = (C17919x) objOpt11;
                } else {
                    c17919x6 = null;
                }
                if (c17919x6 != null) {
                    j18 = c17919x6.f69639a;
                } else {
                    objOpt12 = jSONObject4.opt("--form-control-background");
                    if (objOpt12 instanceof C17919x) {
                        c17919x7 = (C17919x) objOpt12;
                    } else {
                        c17919x7 = null;
                    }
                    if (c17919x7 != null) {
                        j18 = c17919x7.f69639a;
                    } else {
                        j18 = defaultTheme.f148366w;
                    }
                }
                long j811 = j18;
                objOpt13 = jSONObject14.opt("--form-control-border-color");
                if (objOpt13 instanceof C17919x) {
                    c17919x8 = (C17919x) objOpt13;
                } else {
                    c17919x8 = null;
                }
                if (c17919x8 != null) {
                    j19 = c17919x8.f69639a;
                } else {
                    objOpt14 = jSONObject4.opt("--form-control-border-color");
                    if (objOpt14 instanceof C17919x) {
                        c17919x9 = (C17919x) objOpt14;
                    } else {
                        c17919x9 = null;
                    }
                    if (c17919x9 != null) {
                        j19 = c17919x9.f69639a;
                    } else {
                        j19 = defaultTheme.f148364u;
                    }
                }
                long j812 = j19;
                objOpt15 = jSONObject14.opt("--nudge-rating-star-color");
                if (objOpt15 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt15;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt16 instanceof C17919x) {
                        c17919x10 = (C17919x) objOpt16;
                    } else {
                        c17919x10 = null;
                    }
                    if (c17919x10 != null) {
                        j24 = c17919x10.f69639a;
                    } else {
                        j24 = AbstractC35028f.f148251z;
                    }
                }
                long j813 = j24;
                objOpt17 = jSONObject14.opt("--nudge-rating-star-color");
                if (objOpt17 instanceof C17919x) {
                    c17919x11 = (C17919x) objOpt17;
                } else {
                    c17919x11 = null;
                }
                if (c17919x11 != null) {
                    j25 = c17919x11.f69639a;
                } else {
                    objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt18 instanceof C17919x) {
                        c17919x12 = (C17919x) objOpt18;
                    } else {
                        c17919x12 = null;
                    }
                    if (c17919x12 != null) {
                        j25 = c17919x12.f69639a;
                    } else {
                        j25 = AbstractC35028f.f148251z;
                    }
                }
                C17919x c17919x38 = new C17919x(j25);
                objOpt19 = jSONObject14.opt("--nudge-rating-star-color-selected");
                if (objOpt19 instanceof C17919x) {
                    c17919x13 = (C17919x) objOpt19;
                } else {
                    c17919x13 = null;
                }
                if (c17919x13 != null) {
                    j26 = c17919x13.f69639a;
                } else {
                    objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                    if (objOpt20 instanceof C17919x) {
                        c17919x14 = (C17919x) objOpt20;
                    } else {
                        c17919x14 = null;
                    }
                    if (c17919x14 != null) {
                        j26 = c17919x14.f69639a;
                    } else {
                        j26 = AbstractC35028f.f148251z;
                    }
                }
                C35031i c35031iM110700b5 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j811, j812, j813, 0, null, c17919x38, new C17919x(j26), 106383), jSONObject4, jSONObject14), jSONObject4, jSONObject14);
                C35031i c35031iM110705g11 = m110705g(jSONObject4, jSONObject11, defaultTheme);
                C35031i c35031iM110705g12 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
                C35031i c35031iM110705g13 = m110705g(jSONObject4, jSONObject7, defaultTheme);
                C35031i c35031iM110705g14 = m110705g(jSONObject4, jSONObject8, defaultTheme);
                C35031i c35031iM110705g15 = m110705g(jSONObject4, jSONObject9, defaultTheme);
                objOpt21 = jSONObject10.opt("--height-small");
                if (objOpt21 instanceof Float) {
                    f13 = (Float) objOpt21;
                } else {
                    f13 = null;
                }
                if (f13 != null) {
                    fFloatValue = f13.floatValue();
                } else {
                    objOpt22 = jSONObject4.opt("--height-small");
                    if (objOpt22 instanceof Float) {
                        f14 = (Float) objOpt22;
                    } else {
                        f14 = null;
                    }
                    if (f14 != null) {
                        fFloatValue = f14.floatValue();
                    } else {
                        fFloatValue = defaultTheme.f148369z;
                    }
                }
                float f911 = fFloatValue;
                objOpt23 = jSONObject10.opt("--base-accent");
                if (objOpt23 instanceof C17919x) {
                    c17919x15 = (C17919x) objOpt23;
                } else {
                    c17919x15 = null;
                }
                if (c17919x15 != null) {
                    objOpt24 = jSONObject4.opt("--base-accent");
                    if (objOpt24 instanceof C17919x) {
                        c17919x16 = (C17919x) objOpt24;
                    } else {
                        c17919x16 = null;
                    }
                    if (c17919x16 != null) {
                        j28 = c17919x16.f69639a;
                    } else {
                        j27 = j82;
                    }
                    objOpt25 = jSONObject10.opt("--layout-radius-circle");
                    if (objOpt25 instanceof Float) {
                        f15 = (Float) objOpt25;
                    } else {
                        f15 = null;
                    }
                    if (f15 != null) {
                        fFloatValue2 = f15.floatValue();
                    } else {
                        objOpt26 = jSONObject4.opt("--layout-radius-circle");
                        if (objOpt26 instanceof Float) {
                            f16 = (Float) objOpt26;
                        } else {
                            f16 = null;
                        }
                        if (f16 != null) {
                            fFloatValue2 = f16.floatValue();
                        } else {
                            fFloatValue2 = defaultTheme.f148304A;
                        }
                    }
                    return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b4, c35031iM110706h3, c35031iM110707i4, c35031iM110706h4, c35031iM110707i5, c35031iM110698a4, c35031iM110698a5, c35031iM110708j5, c35031iM110708j6, c35031iM110700b5, c35031iM110705g11, c35031iM110705g12, c35031iM110705g13, c35031iM110705g14, c35031iM110705g15, new C35031i(f911, fFloatValue2, j27, j810, j810, 0, null, null, null, 130950));
                }
                j28 = c17919x15.f69639a;
                j27 = j28;
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b4, c35031iM110706h3, c35031iM110707i4, c35031iM110706h4, c35031iM110707i5, c35031iM110698a4, c35031iM110698a5, c35031iM110708j5, c35031iM110708j6, c35031iM110700b5, c35031iM110705g11, c35031iM110705g12, c35031iM110705g13, c35031iM110705g14, c35031iM110705g15, new C35031i(f911, fFloatValue2, j27, j810, j810, 0, null, null, null, 130950));
            }
            iIntValue2 = num2.intValue();
            i13 = iIntValue2;
            C35031i c35031iM110698a6 = C35031i.m110698a(c35031iM110707i6, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
            C35031i c35031iM110708j7 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
            C35031i c35031iM110708j8 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
            JSONObject jSONObject15 = jSONObjectOptJSONObject21;
            objOpt11 = jSONObject15.opt("--form-control-background");
            if (objOpt11 instanceof C17919x) {
                c17919x6 = (C17919x) objOpt11;
            } else {
                c17919x6 = null;
            }
            if (c17919x6 != null) {
                j18 = c17919x6.f69639a;
            } else {
                objOpt12 = jSONObject4.opt("--form-control-background");
                if (objOpt12 instanceof C17919x) {
                    c17919x7 = (C17919x) objOpt12;
                } else {
                    c17919x7 = null;
                }
                if (c17919x7 != null) {
                    j18 = c17919x7.f69639a;
                } else {
                    j18 = defaultTheme.f148366w;
                }
            }
            long j814 = j18;
            objOpt13 = jSONObject15.opt("--form-control-border-color");
            if (objOpt13 instanceof C17919x) {
                c17919x8 = (C17919x) objOpt13;
            } else {
                c17919x8 = null;
            }
            if (c17919x8 != null) {
                j19 = c17919x8.f69639a;
            } else {
                objOpt14 = jSONObject4.opt("--form-control-border-color");
                if (objOpt14 instanceof C17919x) {
                    c17919x9 = (C17919x) objOpt14;
                } else {
                    c17919x9 = null;
                }
                if (c17919x9 != null) {
                    j19 = c17919x9.f69639a;
                } else {
                    j19 = defaultTheme.f148364u;
                }
            }
            long j815 = j19;
            objOpt15 = jSONObject15.opt("--nudge-rating-star-color");
            if (objOpt15 instanceof C17919x) {
                c17919x10 = (C17919x) objOpt15;
            } else {
                c17919x10 = null;
            }
            if (c17919x10 != null) {
                j24 = c17919x10.f69639a;
            } else {
                objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt16 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt16;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    j24 = AbstractC35028f.f148251z;
                }
            }
            long j816 = j24;
            objOpt17 = jSONObject15.opt("--nudge-rating-star-color");
            if (objOpt17 instanceof C17919x) {
                c17919x11 = (C17919x) objOpt17;
            } else {
                c17919x11 = null;
            }
            if (c17919x11 != null) {
                j25 = c17919x11.f69639a;
            } else {
                objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt18 instanceof C17919x) {
                    c17919x12 = (C17919x) objOpt18;
                } else {
                    c17919x12 = null;
                }
                if (c17919x12 != null) {
                    j25 = c17919x12.f69639a;
                } else {
                    j25 = AbstractC35028f.f148251z;
                }
            }
            C17919x c17919x39 = new C17919x(j25);
            objOpt19 = jSONObject15.opt("--nudge-rating-star-color-selected");
            if (objOpt19 instanceof C17919x) {
                c17919x13 = (C17919x) objOpt19;
            } else {
                c17919x13 = null;
            }
            if (c17919x13 != null) {
                j26 = c17919x13.f69639a;
            } else {
                objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                if (objOpt20 instanceof C17919x) {
                    c17919x14 = (C17919x) objOpt20;
                } else {
                    c17919x14 = null;
                }
                if (c17919x14 != null) {
                    j26 = c17919x14.f69639a;
                } else {
                    j26 = AbstractC35028f.f148251z;
                }
            }
            C35031i c35031iM110700b6 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j814, j815, j816, 0, null, c17919x39, new C17919x(j26), 106383), jSONObject4, jSONObject15), jSONObject4, jSONObject15);
            C35031i c35031iM110705g16 = m110705g(jSONObject4, jSONObject11, defaultTheme);
            C35031i c35031iM110705g17 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
            C35031i c35031iM110705g18 = m110705g(jSONObject4, jSONObject7, defaultTheme);
            C35031i c35031iM110705g19 = m110705g(jSONObject4, jSONObject8, defaultTheme);
            C35031i c35031iM110705g110 = m110705g(jSONObject4, jSONObject9, defaultTheme);
            objOpt21 = jSONObject10.opt("--height-small");
            if (objOpt21 instanceof Float) {
                f13 = (Float) objOpt21;
            } else {
                f13 = null;
            }
            if (f13 != null) {
                fFloatValue = f13.floatValue();
            } else {
                objOpt22 = jSONObject4.opt("--height-small");
                if (objOpt22 instanceof Float) {
                    f14 = (Float) objOpt22;
                } else {
                    f14 = null;
                }
                if (f14 != null) {
                    fFloatValue = f14.floatValue();
                } else {
                    fFloatValue = defaultTheme.f148369z;
                }
            }
            float f912 = fFloatValue;
            objOpt23 = jSONObject10.opt("--base-accent");
            if (objOpt23 instanceof C17919x) {
                c17919x15 = (C17919x) objOpt23;
            } else {
                c17919x15 = null;
            }
            if (c17919x15 != null) {
                objOpt24 = jSONObject4.opt("--base-accent");
                if (objOpt24 instanceof C17919x) {
                    c17919x16 = (C17919x) objOpt24;
                } else {
                    c17919x16 = null;
                }
                if (c17919x16 != null) {
                    j28 = c17919x16.f69639a;
                } else {
                    j27 = j82;
                }
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b4, c35031iM110706h3, c35031iM110707i4, c35031iM110706h4, c35031iM110707i5, c35031iM110698a4, c35031iM110698a6, c35031iM110708j7, c35031iM110708j8, c35031iM110700b6, c35031iM110705g16, c35031iM110705g17, c35031iM110705g18, c35031iM110705g19, c35031iM110705g110, new C35031i(f912, fFloatValue2, j27, j810, j810, 0, null, null, null, 130950));
            }
            j28 = c17919x15.f69639a;
            j27 = j28;
            objOpt25 = jSONObject10.opt("--layout-radius-circle");
            if (objOpt25 instanceof Float) {
                f15 = (Float) objOpt25;
            } else {
                f15 = null;
            }
            if (f15 != null) {
                fFloatValue2 = f15.floatValue();
            } else {
                objOpt26 = jSONObject4.opt("--layout-radius-circle");
                if (objOpt26 instanceof Float) {
                    f16 = (Float) objOpt26;
                } else {
                    f16 = null;
                }
                if (f16 != null) {
                    fFloatValue2 = f16.floatValue();
                } else {
                    fFloatValue2 = defaultTheme.f148304A;
                }
            }
            return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b4, c35031iM110706h3, c35031iM110707i4, c35031iM110706h4, c35031iM110707i5, c35031iM110698a4, c35031iM110698a6, c35031iM110708j7, c35031iM110708j8, c35031iM110700b6, c35031iM110705g16, c35031iM110705g17, c35031iM110705g18, c35031iM110705g19, c35031iM110705g110, new C35031i(f912, fFloatValue2, j27, j810, j810, 0, null, null, null, 130950));
        }
        j13 = c17919x34.f69639a;
        j7 = j13;
        objOpt = jSONObjectOptJSONObject12.opt("--button-primary-border-color");
        if (objOpt instanceof C17919x) {
            c17919x = (C17919x) objOpt;
        } else {
            c17919x = null;
        }
        if (c17919x != null) {
            objOpt2 = jSONObject4.opt("--button-primary-border-color");
            if (objOpt2 instanceof C17919x) {
                c17919x2 = (C17919x) objOpt2;
            } else {
                c17919x2 = null;
            }
            if (c17919x2 != null) {
                j15 = c17919x2.f69639a;
            } else {
                j14 = j82;
            }
            objOpt3 = jSONObjectOptJSONObject12.opt("--button-primary-content");
            if (objOpt3 instanceof C17919x) {
                c17919x3 = (C17919x) objOpt3;
            } else {
                c17919x3 = null;
            }
            if (c17919x3 != null) {
                j16 = c17919x3.f69639a;
            } else {
                objOpt4 = jSONObject4.opt("--button-primary-content");
                if (objOpt4 instanceof C17919x) {
                    c17919x4 = (C17919x) objOpt4;
                } else {
                    c17919x4 = null;
                }
                if (c17919x4 != null) {
                    j16 = c17919x4.f69639a;
                } else {
                    j16 = C17919x.f69629f;
                }
            }
            C35031i c35031iM110700b7 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j7, j14, j16, 0, null, null, null, 130959), jSONObject4, jSONObjectOptJSONObject12), jSONObject4, jSONObjectOptJSONObject12);
            C35031i c35031iM110706h5 = m110706h(jSONObject4, jSONObjectOptJSONObject13, defaultTheme);
            C35031i c35031iM110707i7 = m110707i(jSONObject4, jSONObjectOptJSONObject14, defaultTheme);
            C35031i c35031iM110706h6 = m110706h(jSONObject4, jSONObjectOptJSONObject15, defaultTheme);
            C35031i c35031iM110707i8 = m110707i(jSONObject4, jSONObjectOptJSONObject16, defaultTheme);
            long j817 = C17919x.f69636m;
            objOpt5 = jSONObjectOptJSONObject17.opt("--content-primary");
            if (objOpt5 instanceof C17919x) {
                c17919x5 = (C17919x) objOpt5;
            } else {
                c17919x5 = null;
            }
            if (c17919x5 != null) {
                j17 = c17919x5.f69639a;
            } else {
                objOpt6 = jSONObject4.opt("--content-primary");
                if (objOpt6 instanceof C17919x) {
                    c17919x5 = (C17919x) objOpt6;
                } else {
                    c17919x5 = null;
                }
                if (c17919x5 != null) {
                    j17 = c17919x5.f69639a;
                } else {
                    j17 = defaultTheme.f148358o;
                }
            }
            C35031i c35031i3 = new C35031i(0.0f, 0.0f, j817, j817, j17, 0, null, null, null, 130959);
            objOpt7 = jSONObjectOptJSONObject17.opt("--font-weight-medium");
            if (objOpt7 instanceof Integer) {
                num = (Integer) objOpt7;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                objOpt8 = jSONObject4.opt("--font-weight-medium");
                if (objOpt8 instanceof Integer) {
                    num = (Integer) objOpt8;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i19;
                }
            }
            C35031i c35031iM110698a7 = C35031i.m110698a(c35031i3, 0.0f, null, 0.0f, 0.0f, iIntValue, null, null, null, null, 130943);
            C35031i c35031iM110707i9 = m110707i(jSONObject4, jSONObjectOptJSONObject18, defaultTheme);
            objOpt9 = jSONObjectOptJSONObject18.opt("--font-weight-medium");
            if (objOpt9 instanceof Integer) {
                num2 = (Integer) objOpt9;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                objOpt10 = jSONObject4.opt("--font-weight-medium");
                if (objOpt10 instanceof Integer) {
                    num3 = (Integer) objOpt10;
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    i13 = i19;
                }
                C35031i c35031iM110698a8 = C35031i.m110698a(c35031iM110707i9, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
                C35031i c35031iM110708j9 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
                C35031i c35031iM110708j10 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
                JSONObject jSONObject16 = jSONObjectOptJSONObject21;
                objOpt11 = jSONObject16.opt("--form-control-background");
                if (objOpt11 instanceof C17919x) {
                    c17919x6 = (C17919x) objOpt11;
                } else {
                    c17919x6 = null;
                }
                if (c17919x6 != null) {
                    j18 = c17919x6.f69639a;
                } else {
                    objOpt12 = jSONObject4.opt("--form-control-background");
                    if (objOpt12 instanceof C17919x) {
                        c17919x7 = (C17919x) objOpt12;
                    } else {
                        c17919x7 = null;
                    }
                    if (c17919x7 != null) {
                        j18 = c17919x7.f69639a;
                    } else {
                        j18 = defaultTheme.f148366w;
                    }
                }
                long j818 = j18;
                objOpt13 = jSONObject16.opt("--form-control-border-color");
                if (objOpt13 instanceof C17919x) {
                    c17919x8 = (C17919x) objOpt13;
                } else {
                    c17919x8 = null;
                }
                if (c17919x8 != null) {
                    j19 = c17919x8.f69639a;
                } else {
                    objOpt14 = jSONObject4.opt("--form-control-border-color");
                    if (objOpt14 instanceof C17919x) {
                        c17919x9 = (C17919x) objOpt14;
                    } else {
                        c17919x9 = null;
                    }
                    if (c17919x9 != null) {
                        j19 = c17919x9.f69639a;
                    } else {
                        j19 = defaultTheme.f148364u;
                    }
                }
                long j819 = j19;
                objOpt15 = jSONObject16.opt("--nudge-rating-star-color");
                if (objOpt15 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt15;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt16 instanceof C17919x) {
                        c17919x10 = (C17919x) objOpt16;
                    } else {
                        c17919x10 = null;
                    }
                    if (c17919x10 != null) {
                        j24 = c17919x10.f69639a;
                    } else {
                        j24 = AbstractC35028f.f148251z;
                    }
                }
                long j8110 = j24;
                objOpt17 = jSONObject16.opt("--nudge-rating-star-color");
                if (objOpt17 instanceof C17919x) {
                    c17919x11 = (C17919x) objOpt17;
                } else {
                    c17919x11 = null;
                }
                if (c17919x11 != null) {
                    j25 = c17919x11.f69639a;
                } else {
                    objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                    if (objOpt18 instanceof C17919x) {
                        c17919x12 = (C17919x) objOpt18;
                    } else {
                        c17919x12 = null;
                    }
                    if (c17919x12 != null) {
                        j25 = c17919x12.f69639a;
                    } else {
                        j25 = AbstractC35028f.f148251z;
                    }
                }
                C17919x c17919x310 = new C17919x(j25);
                objOpt19 = jSONObject16.opt("--nudge-rating-star-color-selected");
                if (objOpt19 instanceof C17919x) {
                    c17919x13 = (C17919x) objOpt19;
                } else {
                    c17919x13 = null;
                }
                if (c17919x13 != null) {
                    j26 = c17919x13.f69639a;
                } else {
                    objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                    if (objOpt20 instanceof C17919x) {
                        c17919x14 = (C17919x) objOpt20;
                    } else {
                        c17919x14 = null;
                    }
                    if (c17919x14 != null) {
                        j26 = c17919x14.f69639a;
                    } else {
                        j26 = AbstractC35028f.f148251z;
                    }
                }
                C35031i c35031iM110700b8 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j818, j819, j8110, 0, null, c17919x310, new C17919x(j26), 106383), jSONObject4, jSONObject16), jSONObject4, jSONObject16);
                C35031i c35031iM110705g111 = m110705g(jSONObject4, jSONObject11, defaultTheme);
                C35031i c35031iM110705g112 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
                C35031i c35031iM110705g113 = m110705g(jSONObject4, jSONObject7, defaultTheme);
                C35031i c35031iM110705g114 = m110705g(jSONObject4, jSONObject8, defaultTheme);
                C35031i c35031iM110705g115 = m110705g(jSONObject4, jSONObject9, defaultTheme);
                objOpt21 = jSONObject10.opt("--height-small");
                if (objOpt21 instanceof Float) {
                    f13 = (Float) objOpt21;
                } else {
                    f13 = null;
                }
                if (f13 != null) {
                    fFloatValue = f13.floatValue();
                } else {
                    objOpt22 = jSONObject4.opt("--height-small");
                    if (objOpt22 instanceof Float) {
                        f14 = (Float) objOpt22;
                    } else {
                        f14 = null;
                    }
                    if (f14 != null) {
                        fFloatValue = f14.floatValue();
                    } else {
                        fFloatValue = defaultTheme.f148369z;
                    }
                }
                float f913 = fFloatValue;
                objOpt23 = jSONObject10.opt("--base-accent");
                if (objOpt23 instanceof C17919x) {
                    c17919x15 = (C17919x) objOpt23;
                } else {
                    c17919x15 = null;
                }
                if (c17919x15 != null) {
                    objOpt24 = jSONObject4.opt("--base-accent");
                    if (objOpt24 instanceof C17919x) {
                        c17919x16 = (C17919x) objOpt24;
                    } else {
                        c17919x16 = null;
                    }
                    if (c17919x16 != null) {
                        j28 = c17919x16.f69639a;
                    } else {
                        j27 = j82;
                    }
                    objOpt25 = jSONObject10.opt("--layout-radius-circle");
                    if (objOpt25 instanceof Float) {
                        f15 = (Float) objOpt25;
                    } else {
                        f15 = null;
                    }
                    if (f15 != null) {
                        fFloatValue2 = f15.floatValue();
                    } else {
                        objOpt26 = jSONObject4.opt("--layout-radius-circle");
                        if (objOpt26 instanceof Float) {
                            f16 = (Float) objOpt26;
                        } else {
                            f16 = null;
                        }
                        if (f16 != null) {
                            fFloatValue2 = f16.floatValue();
                        } else {
                            fFloatValue2 = defaultTheme.f148304A;
                        }
                    }
                    return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b7, c35031iM110706h5, c35031iM110707i7, c35031iM110706h6, c35031iM110707i8, c35031iM110698a7, c35031iM110698a8, c35031iM110708j9, c35031iM110708j10, c35031iM110700b8, c35031iM110705g111, c35031iM110705g112, c35031iM110705g113, c35031iM110705g114, c35031iM110705g115, new C35031i(f913, fFloatValue2, j27, j817, j817, 0, null, null, null, 130950));
                }
                j28 = c17919x15.f69639a;
                j27 = j28;
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b7, c35031iM110706h5, c35031iM110707i7, c35031iM110706h6, c35031iM110707i8, c35031iM110698a7, c35031iM110698a8, c35031iM110708j9, c35031iM110708j10, c35031iM110700b8, c35031iM110705g111, c35031iM110705g112, c35031iM110705g113, c35031iM110705g114, c35031iM110705g115, new C35031i(f913, fFloatValue2, j27, j817, j817, 0, null, null, null, 130950));
            }
            iIntValue2 = num2.intValue();
            i13 = iIntValue2;
            C35031i c35031iM110698a9 = C35031i.m110698a(c35031iM110707i9, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
            C35031i c35031iM110708j11 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
            C35031i c35031iM110708j12 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
            JSONObject jSONObject17 = jSONObjectOptJSONObject21;
            objOpt11 = jSONObject17.opt("--form-control-background");
            if (objOpt11 instanceof C17919x) {
                c17919x6 = (C17919x) objOpt11;
            } else {
                c17919x6 = null;
            }
            if (c17919x6 != null) {
                j18 = c17919x6.f69639a;
            } else {
                objOpt12 = jSONObject4.opt("--form-control-background");
                if (objOpt12 instanceof C17919x) {
                    c17919x7 = (C17919x) objOpt12;
                } else {
                    c17919x7 = null;
                }
                if (c17919x7 != null) {
                    j18 = c17919x7.f69639a;
                } else {
                    j18 = defaultTheme.f148366w;
                }
            }
            long j8111 = j18;
            objOpt13 = jSONObject17.opt("--form-control-border-color");
            if (objOpt13 instanceof C17919x) {
                c17919x8 = (C17919x) objOpt13;
            } else {
                c17919x8 = null;
            }
            if (c17919x8 != null) {
                j19 = c17919x8.f69639a;
            } else {
                objOpt14 = jSONObject4.opt("--form-control-border-color");
                if (objOpt14 instanceof C17919x) {
                    c17919x9 = (C17919x) objOpt14;
                } else {
                    c17919x9 = null;
                }
                if (c17919x9 != null) {
                    j19 = c17919x9.f69639a;
                } else {
                    j19 = defaultTheme.f148364u;
                }
            }
            long j8112 = j19;
            objOpt15 = jSONObject17.opt("--nudge-rating-star-color");
            if (objOpt15 instanceof C17919x) {
                c17919x10 = (C17919x) objOpt15;
            } else {
                c17919x10 = null;
            }
            if (c17919x10 != null) {
                j24 = c17919x10.f69639a;
            } else {
                objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt16 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt16;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    j24 = AbstractC35028f.f148251z;
                }
            }
            long j8113 = j24;
            objOpt17 = jSONObject17.opt("--nudge-rating-star-color");
            if (objOpt17 instanceof C17919x) {
                c17919x11 = (C17919x) objOpt17;
            } else {
                c17919x11 = null;
            }
            if (c17919x11 != null) {
                j25 = c17919x11.f69639a;
            } else {
                objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt18 instanceof C17919x) {
                    c17919x12 = (C17919x) objOpt18;
                } else {
                    c17919x12 = null;
                }
                if (c17919x12 != null) {
                    j25 = c17919x12.f69639a;
                } else {
                    j25 = AbstractC35028f.f148251z;
                }
            }
            C17919x c17919x311 = new C17919x(j25);
            objOpt19 = jSONObject17.opt("--nudge-rating-star-color-selected");
            if (objOpt19 instanceof C17919x) {
                c17919x13 = (C17919x) objOpt19;
            } else {
                c17919x13 = null;
            }
            if (c17919x13 != null) {
                j26 = c17919x13.f69639a;
            } else {
                objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                if (objOpt20 instanceof C17919x) {
                    c17919x14 = (C17919x) objOpt20;
                } else {
                    c17919x14 = null;
                }
                if (c17919x14 != null) {
                    j26 = c17919x14.f69639a;
                } else {
                    j26 = AbstractC35028f.f148251z;
                }
            }
            C35031i c35031iM110700b9 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j8111, j8112, j8113, 0, null, c17919x311, new C17919x(j26), 106383), jSONObject4, jSONObject17), jSONObject4, jSONObject17);
            C35031i c35031iM110705g116 = m110705g(jSONObject4, jSONObject11, defaultTheme);
            C35031i c35031iM110705g117 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
            C35031i c35031iM110705g118 = m110705g(jSONObject4, jSONObject7, defaultTheme);
            C35031i c35031iM110705g119 = m110705g(jSONObject4, jSONObject8, defaultTheme);
            C35031i c35031iM110705g1110 = m110705g(jSONObject4, jSONObject9, defaultTheme);
            objOpt21 = jSONObject10.opt("--height-small");
            if (objOpt21 instanceof Float) {
                f13 = (Float) objOpt21;
            } else {
                f13 = null;
            }
            if (f13 != null) {
                fFloatValue = f13.floatValue();
            } else {
                objOpt22 = jSONObject4.opt("--height-small");
                if (objOpt22 instanceof Float) {
                    f14 = (Float) objOpt22;
                } else {
                    f14 = null;
                }
                if (f14 != null) {
                    fFloatValue = f14.floatValue();
                } else {
                    fFloatValue = defaultTheme.f148369z;
                }
            }
            float f914 = fFloatValue;
            objOpt23 = jSONObject10.opt("--base-accent");
            if (objOpt23 instanceof C17919x) {
                c17919x15 = (C17919x) objOpt23;
            } else {
                c17919x15 = null;
            }
            if (c17919x15 != null) {
                objOpt24 = jSONObject4.opt("--base-accent");
                if (objOpt24 instanceof C17919x) {
                    c17919x16 = (C17919x) objOpt24;
                } else {
                    c17919x16 = null;
                }
                if (c17919x16 != null) {
                    j28 = c17919x16.f69639a;
                } else {
                    j27 = j82;
                }
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b7, c35031iM110706h5, c35031iM110707i7, c35031iM110706h6, c35031iM110707i8, c35031iM110698a7, c35031iM110698a9, c35031iM110708j11, c35031iM110708j12, c35031iM110700b9, c35031iM110705g116, c35031iM110705g117, c35031iM110705g118, c35031iM110705g119, c35031iM110705g1110, new C35031i(f914, fFloatValue2, j27, j817, j817, 0, null, null, null, 130950));
            }
            j28 = c17919x15.f69639a;
            j27 = j28;
            objOpt25 = jSONObject10.opt("--layout-radius-circle");
            if (objOpt25 instanceof Float) {
                f15 = (Float) objOpt25;
            } else {
                f15 = null;
            }
            if (f15 != null) {
                fFloatValue2 = f15.floatValue();
            } else {
                objOpt26 = jSONObject4.opt("--layout-radius-circle");
                if (objOpt26 instanceof Float) {
                    f16 = (Float) objOpt26;
                } else {
                    f16 = null;
                }
                if (f16 != null) {
                    fFloatValue2 = f16.floatValue();
                } else {
                    fFloatValue2 = defaultTheme.f148304A;
                }
            }
            return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b7, c35031iM110706h5, c35031iM110707i7, c35031iM110706h6, c35031iM110707i8, c35031iM110698a7, c35031iM110698a9, c35031iM110708j11, c35031iM110708j12, c35031iM110700b9, c35031iM110705g116, c35031iM110705g117, c35031iM110705g118, c35031iM110705g119, c35031iM110705g1110, new C35031i(f914, fFloatValue2, j27, j817, j817, 0, null, null, null, 130950));
        }
        j15 = c17919x.f69639a;
        j14 = j15;
        objOpt3 = jSONObjectOptJSONObject12.opt("--button-primary-content");
        if (objOpt3 instanceof C17919x) {
            c17919x3 = (C17919x) objOpt3;
        } else {
            c17919x3 = null;
        }
        if (c17919x3 != null) {
            j16 = c17919x3.f69639a;
        } else {
            objOpt4 = jSONObject4.opt("--button-primary-content");
            if (objOpt4 instanceof C17919x) {
                c17919x4 = (C17919x) objOpt4;
            } else {
                c17919x4 = null;
            }
            if (c17919x4 != null) {
                j16 = c17919x4.f69639a;
            } else {
                j16 = C17919x.f69629f;
            }
        }
        C35031i c35031iM110700b10 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j7, j14, j16, 0, null, null, null, 130959), jSONObject4, jSONObjectOptJSONObject12), jSONObject4, jSONObjectOptJSONObject12);
        C35031i c35031iM110706h7 = m110706h(jSONObject4, jSONObjectOptJSONObject13, defaultTheme);
        C35031i c35031iM110707i10 = m110707i(jSONObject4, jSONObjectOptJSONObject14, defaultTheme);
        C35031i c35031iM110706h8 = m110706h(jSONObject4, jSONObjectOptJSONObject15, defaultTheme);
        C35031i c35031iM110707i11 = m110707i(jSONObject4, jSONObjectOptJSONObject16, defaultTheme);
        long j8114 = C17919x.f69636m;
        objOpt5 = jSONObjectOptJSONObject17.opt("--content-primary");
        if (objOpt5 instanceof C17919x) {
            c17919x5 = (C17919x) objOpt5;
        } else {
            c17919x5 = null;
        }
        if (c17919x5 != null) {
            j17 = c17919x5.f69639a;
        } else {
            objOpt6 = jSONObject4.opt("--content-primary");
            if (objOpt6 instanceof C17919x) {
                c17919x5 = (C17919x) objOpt6;
            } else {
                c17919x5 = null;
            }
            if (c17919x5 != null) {
                j17 = c17919x5.f69639a;
            } else {
                j17 = defaultTheme.f148358o;
            }
        }
        C35031i c35031i4 = new C35031i(0.0f, 0.0f, j8114, j8114, j17, 0, null, null, null, 130959);
        objOpt7 = jSONObjectOptJSONObject17.opt("--font-weight-medium");
        if (objOpt7 instanceof Integer) {
            num = (Integer) objOpt7;
        } else {
            num = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            objOpt8 = jSONObject4.opt("--font-weight-medium");
            if (objOpt8 instanceof Integer) {
                num = (Integer) objOpt8;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i19;
            }
        }
        C35031i c35031iM110698a10 = C35031i.m110698a(c35031i4, 0.0f, null, 0.0f, 0.0f, iIntValue, null, null, null, null, 130943);
        C35031i c35031iM110707i12 = m110707i(jSONObject4, jSONObjectOptJSONObject18, defaultTheme);
        objOpt9 = jSONObjectOptJSONObject18.opt("--font-weight-medium");
        if (objOpt9 instanceof Integer) {
            num2 = (Integer) objOpt9;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            objOpt10 = jSONObject4.opt("--font-weight-medium");
            if (objOpt10 instanceof Integer) {
                num3 = (Integer) objOpt10;
            } else {
                num3 = null;
            }
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                i13 = i19;
            }
            C35031i c35031iM110698a11 = C35031i.m110698a(c35031iM110707i12, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
            C35031i c35031iM110708j13 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
            C35031i c35031iM110708j14 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
            JSONObject jSONObject18 = jSONObjectOptJSONObject21;
            objOpt11 = jSONObject18.opt("--form-control-background");
            if (objOpt11 instanceof C17919x) {
                c17919x6 = (C17919x) objOpt11;
            } else {
                c17919x6 = null;
            }
            if (c17919x6 != null) {
                j18 = c17919x6.f69639a;
            } else {
                objOpt12 = jSONObject4.opt("--form-control-background");
                if (objOpt12 instanceof C17919x) {
                    c17919x7 = (C17919x) objOpt12;
                } else {
                    c17919x7 = null;
                }
                if (c17919x7 != null) {
                    j18 = c17919x7.f69639a;
                } else {
                    j18 = defaultTheme.f148366w;
                }
            }
            long j8115 = j18;
            objOpt13 = jSONObject18.opt("--form-control-border-color");
            if (objOpt13 instanceof C17919x) {
                c17919x8 = (C17919x) objOpt13;
            } else {
                c17919x8 = null;
            }
            if (c17919x8 != null) {
                j19 = c17919x8.f69639a;
            } else {
                objOpt14 = jSONObject4.opt("--form-control-border-color");
                if (objOpt14 instanceof C17919x) {
                    c17919x9 = (C17919x) objOpt14;
                } else {
                    c17919x9 = null;
                }
                if (c17919x9 != null) {
                    j19 = c17919x9.f69639a;
                } else {
                    j19 = defaultTheme.f148364u;
                }
            }
            long j8116 = j19;
            objOpt15 = jSONObject18.opt("--nudge-rating-star-color");
            if (objOpt15 instanceof C17919x) {
                c17919x10 = (C17919x) objOpt15;
            } else {
                c17919x10 = null;
            }
            if (c17919x10 != null) {
                j24 = c17919x10.f69639a;
            } else {
                objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt16 instanceof C17919x) {
                    c17919x10 = (C17919x) objOpt16;
                } else {
                    c17919x10 = null;
                }
                if (c17919x10 != null) {
                    j24 = c17919x10.f69639a;
                } else {
                    j24 = AbstractC35028f.f148251z;
                }
            }
            long j8117 = j24;
            objOpt17 = jSONObject18.opt("--nudge-rating-star-color");
            if (objOpt17 instanceof C17919x) {
                c17919x11 = (C17919x) objOpt17;
            } else {
                c17919x11 = null;
            }
            if (c17919x11 != null) {
                j25 = c17919x11.f69639a;
            } else {
                objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
                if (objOpt18 instanceof C17919x) {
                    c17919x12 = (C17919x) objOpt18;
                } else {
                    c17919x12 = null;
                }
                if (c17919x12 != null) {
                    j25 = c17919x12.f69639a;
                } else {
                    j25 = AbstractC35028f.f148251z;
                }
            }
            C17919x c17919x312 = new C17919x(j25);
            objOpt19 = jSONObject18.opt("--nudge-rating-star-color-selected");
            if (objOpt19 instanceof C17919x) {
                c17919x13 = (C17919x) objOpt19;
            } else {
                c17919x13 = null;
            }
            if (c17919x13 != null) {
                j26 = c17919x13.f69639a;
            } else {
                objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
                if (objOpt20 instanceof C17919x) {
                    c17919x14 = (C17919x) objOpt20;
                } else {
                    c17919x14 = null;
                }
                if (c17919x14 != null) {
                    j26 = c17919x14.f69639a;
                } else {
                    j26 = AbstractC35028f.f148251z;
                }
            }
            C35031i c35031iM110700b11 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j8115, j8116, j8117, 0, null, c17919x312, new C17919x(j26), 106383), jSONObject4, jSONObject18), jSONObject4, jSONObject18);
            C35031i c35031iM110705g1111 = m110705g(jSONObject4, jSONObject11, defaultTheme);
            C35031i c35031iM110705g1112 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
            C35031i c35031iM110705g1113 = m110705g(jSONObject4, jSONObject7, defaultTheme);
            C35031i c35031iM110705g1114 = m110705g(jSONObject4, jSONObject8, defaultTheme);
            C35031i c35031iM110705g1115 = m110705g(jSONObject4, jSONObject9, defaultTheme);
            objOpt21 = jSONObject10.opt("--height-small");
            if (objOpt21 instanceof Float) {
                f13 = (Float) objOpt21;
            } else {
                f13 = null;
            }
            if (f13 != null) {
                fFloatValue = f13.floatValue();
            } else {
                objOpt22 = jSONObject4.opt("--height-small");
                if (objOpt22 instanceof Float) {
                    f14 = (Float) objOpt22;
                } else {
                    f14 = null;
                }
                if (f14 != null) {
                    fFloatValue = f14.floatValue();
                } else {
                    fFloatValue = defaultTheme.f148369z;
                }
            }
            float f915 = fFloatValue;
            objOpt23 = jSONObject10.opt("--base-accent");
            if (objOpt23 instanceof C17919x) {
                c17919x15 = (C17919x) objOpt23;
            } else {
                c17919x15 = null;
            }
            if (c17919x15 != null) {
                objOpt24 = jSONObject4.opt("--base-accent");
                if (objOpt24 instanceof C17919x) {
                    c17919x16 = (C17919x) objOpt24;
                } else {
                    c17919x16 = null;
                }
                if (c17919x16 != null) {
                    j28 = c17919x16.f69639a;
                } else {
                    j27 = j82;
                }
                objOpt25 = jSONObject10.opt("--layout-radius-circle");
                if (objOpt25 instanceof Float) {
                    f15 = (Float) objOpt25;
                } else {
                    f15 = null;
                }
                if (f15 != null) {
                    fFloatValue2 = f15.floatValue();
                } else {
                    objOpt26 = jSONObject4.opt("--layout-radius-circle");
                    if (objOpt26 instanceof Float) {
                        f16 = (Float) objOpt26;
                    } else {
                        f16 = null;
                    }
                    if (f16 != null) {
                        fFloatValue2 = f16.floatValue();
                    } else {
                        fFloatValue2 = defaultTheme.f148304A;
                    }
                }
                return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b10, c35031iM110706h7, c35031iM110707i10, c35031iM110706h8, c35031iM110707i11, c35031iM110698a10, c35031iM110698a11, c35031iM110708j13, c35031iM110708j14, c35031iM110700b11, c35031iM110705g1111, c35031iM110705g1112, c35031iM110705g1113, c35031iM110705g1114, c35031iM110705g1115, new C35031i(f915, fFloatValue2, j27, j8114, j8114, 0, null, null, null, 130950));
            }
            j28 = c17919x15.f69639a;
            j27 = j28;
            objOpt25 = jSONObject10.opt("--layout-radius-circle");
            if (objOpt25 instanceof Float) {
                f15 = (Float) objOpt25;
            } else {
                f15 = null;
            }
            if (f15 != null) {
                fFloatValue2 = f15.floatValue();
            } else {
                objOpt26 = jSONObject4.opt("--layout-radius-circle");
                if (objOpt26 instanceof Float) {
                    f16 = (Float) objOpt26;
                } else {
                    f16 = null;
                }
                if (f16 != null) {
                    fFloatValue2 = f16.floatValue();
                } else {
                    fFloatValue2 = defaultTheme.f148304A;
                }
            }
            return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b10, c35031iM110706h7, c35031iM110707i10, c35031iM110706h8, c35031iM110707i11, c35031iM110698a10, c35031iM110698a11, c35031iM110708j13, c35031iM110708j14, c35031iM110700b11, c35031iM110705g1111, c35031iM110705g1112, c35031iM110705g1113, c35031iM110705g1114, c35031iM110705g1115, new C35031i(f915, fFloatValue2, j27, j8114, j8114, 0, null, null, null, 130950));
        }
        iIntValue2 = num2.intValue();
        i13 = iIntValue2;
        C35031i c35031iM110698a12 = C35031i.m110698a(c35031iM110707i12, 0.0f, null, 0.0f, 0.0f, i13, null, null, null, null, 130943);
        C35031i c35031iM110708j15 = m110708j(jSONObject4, jSONObjectOptJSONObject19, defaultTheme);
        C35031i c35031iM110708j16 = m110708j(jSONObject4, jSONObjectOptJSONObject20, defaultTheme);
        JSONObject jSONObject19 = jSONObjectOptJSONObject21;
        objOpt11 = jSONObject19.opt("--form-control-background");
        if (objOpt11 instanceof C17919x) {
            c17919x6 = (C17919x) objOpt11;
        } else {
            c17919x6 = null;
        }
        if (c17919x6 != null) {
            j18 = c17919x6.f69639a;
        } else {
            objOpt12 = jSONObject4.opt("--form-control-background");
            if (objOpt12 instanceof C17919x) {
                c17919x7 = (C17919x) objOpt12;
            } else {
                c17919x7 = null;
            }
            if (c17919x7 != null) {
                j18 = c17919x7.f69639a;
            } else {
                j18 = defaultTheme.f148366w;
            }
        }
        long j8118 = j18;
        objOpt13 = jSONObject19.opt("--form-control-border-color");
        if (objOpt13 instanceof C17919x) {
            c17919x8 = (C17919x) objOpt13;
        } else {
            c17919x8 = null;
        }
        if (c17919x8 != null) {
            j19 = c17919x8.f69639a;
        } else {
            objOpt14 = jSONObject4.opt("--form-control-border-color");
            if (objOpt14 instanceof C17919x) {
                c17919x9 = (C17919x) objOpt14;
            } else {
                c17919x9 = null;
            }
            if (c17919x9 != null) {
                j19 = c17919x9.f69639a;
            } else {
                j19 = defaultTheme.f148364u;
            }
        }
        long j8119 = j19;
        objOpt15 = jSONObject19.opt("--nudge-rating-star-color");
        if (objOpt15 instanceof C17919x) {
            c17919x10 = (C17919x) objOpt15;
        } else {
            c17919x10 = null;
        }
        if (c17919x10 != null) {
            j24 = c17919x10.f69639a;
        } else {
            objOpt16 = jSONObject4.opt("--nudge-rating-star-color");
            if (objOpt16 instanceof C17919x) {
                c17919x10 = (C17919x) objOpt16;
            } else {
                c17919x10 = null;
            }
            if (c17919x10 != null) {
                j24 = c17919x10.f69639a;
            } else {
                j24 = AbstractC35028f.f148251z;
            }
        }
        long j81110 = j24;
        objOpt17 = jSONObject19.opt("--nudge-rating-star-color");
        if (objOpt17 instanceof C17919x) {
            c17919x11 = (C17919x) objOpt17;
        } else {
            c17919x11 = null;
        }
        if (c17919x11 != null) {
            j25 = c17919x11.f69639a;
        } else {
            objOpt18 = jSONObject4.opt("--nudge-rating-star-color");
            if (objOpt18 instanceof C17919x) {
                c17919x12 = (C17919x) objOpt18;
            } else {
                c17919x12 = null;
            }
            if (c17919x12 != null) {
                j25 = c17919x12.f69639a;
            } else {
                j25 = AbstractC35028f.f148251z;
            }
        }
        C17919x c17919x313 = new C17919x(j25);
        objOpt19 = jSONObject19.opt("--nudge-rating-star-color-selected");
        if (objOpt19 instanceof C17919x) {
            c17919x13 = (C17919x) objOpt19;
        } else {
            c17919x13 = null;
        }
        if (c17919x13 != null) {
            j26 = c17919x13.f69639a;
        } else {
            objOpt20 = jSONObject4.opt("--nudge-rating-star-color-selected");
            if (objOpt20 instanceof C17919x) {
                c17919x14 = (C17919x) objOpt20;
            } else {
                c17919x14 = null;
            }
            if (c17919x14 != null) {
                j26 = c17919x14.f69639a;
            } else {
                j26 = AbstractC35028f.f148251z;
            }
        }
        C35031i c35031iM110700b12 = m110700b(m110699a(new C35031i(0.0f, 0.0f, j8118, j8119, j81110, 0, null, c17919x313, new C17919x(j26), 106383), jSONObject4, jSONObject19), jSONObject4, jSONObject19);
        C35031i c35031iM110705g1116 = m110705g(jSONObject4, jSONObject11, defaultTheme);
        C35031i c35031iM110705g1117 = m110705g(jSONObject4, jSONObjectOptJSONObject23, defaultTheme);
        C35031i c35031iM110705g1118 = m110705g(jSONObject4, jSONObject7, defaultTheme);
        C35031i c35031iM110705g1119 = m110705g(jSONObject4, jSONObject8, defaultTheme);
        C35031i c35031iM110705g11110 = m110705g(jSONObject4, jSONObject9, defaultTheme);
        objOpt21 = jSONObject10.opt("--height-small");
        if (objOpt21 instanceof Float) {
            f13 = (Float) objOpt21;
        } else {
            f13 = null;
        }
        if (f13 != null) {
            fFloatValue = f13.floatValue();
        } else {
            objOpt22 = jSONObject4.opt("--height-small");
            if (objOpt22 instanceof Float) {
                f14 = (Float) objOpt22;
            } else {
                f14 = null;
            }
            if (f14 != null) {
                fFloatValue = f14.floatValue();
            } else {
                fFloatValue = defaultTheme.f148369z;
            }
        }
        float f916 = fFloatValue;
        objOpt23 = jSONObject10.opt("--base-accent");
        if (objOpt23 instanceof C17919x) {
            c17919x15 = (C17919x) objOpt23;
        } else {
            c17919x15 = null;
        }
        if (c17919x15 != null) {
            objOpt24 = jSONObject4.opt("--base-accent");
            if (objOpt24 instanceof C17919x) {
                c17919x16 = (C17919x) objOpt24;
            } else {
                c17919x16 = null;
            }
            if (c17919x16 != null) {
                j28 = c17919x16.f69639a;
            } else {
                j27 = j82;
            }
            objOpt25 = jSONObject10.opt("--layout-radius-circle");
            if (objOpt25 instanceof Float) {
                f15 = (Float) objOpt25;
            } else {
                f15 = null;
            }
            if (f15 != null) {
                fFloatValue2 = f15.floatValue();
            } else {
                objOpt26 = jSONObject4.opt("--layout-radius-circle");
                if (objOpt26 instanceof Float) {
                    f16 = (Float) objOpt26;
                } else {
                    f16 = null;
                }
                if (f16 != null) {
                    fFloatValue2 = f16.floatValue();
                } else {
                    fFloatValue2 = defaultTheme.f148304A;
                }
            }
            return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b10, c35031iM110706h7, c35031iM110707i10, c35031iM110706h8, c35031iM110707i11, c35031iM110698a10, c35031iM110698a12, c35031iM110708j15, c35031iM110708j16, c35031iM110700b12, c35031iM110705g1116, c35031iM110705g1117, c35031iM110705g1118, c35031iM110705g1119, c35031iM110705g11110, new C35031i(f916, fFloatValue2, j27, j8114, j8114, 0, null, null, null, 130950));
        }
        j28 = c17919x15.f69639a;
        j27 = j28;
        objOpt25 = jSONObject10.opt("--layout-radius-circle");
        if (objOpt25 instanceof Float) {
            f15 = (Float) objOpt25;
        } else {
            f15 = null;
        }
        if (f15 != null) {
            fFloatValue2 = f15.floatValue();
        } else {
            objOpt26 = jSONObject4.opt("--layout-radius-circle");
            if (objOpt26 instanceof Float) {
                f16 = (Float) objOpt26;
            } else {
                f16 = null;
            }
            if (f16 != null) {
                fFloatValue2 = f16.floatValue();
            } else {
                fFloatValue2 = defaultTheme.f148304A;
            }
        }
        return new C35035m(j34, str2, f18, f24, f26, f28, iIntValue3, i16, i18, i17, f34, f36, f38, fFloatValue10, j36, j38, j44, j46, j48, j54, j56, j58, j64, j66, j67, f44, f46, f48, f54, f56, f58, str4, j68, j73, j75, j77, f65, f74, f67, f69, str5, j79, f77, f85, f79, f97, f87, f89, f95, f98, c35031iM110700b10, c35031iM110706h7, c35031iM110707i10, c35031iM110706h8, c35031iM110707i11, c35031iM110698a10, c35031iM110698a12, c35031iM110708j15, c35031iM110708j16, c35031iM110700b12, c35031iM110705g1116, c35031iM110705g1117, c35031iM110705g1118, c35031iM110705g1119, c35031iM110705g11110, new C35031i(f916, fFloatValue2, j27, j8114, j8114, 0, null, null, null, 130950));
    }

    /* JADX INFO: renamed from: e */
    public static Integer m110703e(Context context, String str) {
        AbstractC22676k.m65750j(context, "context");
        if (str != null && !AbstractC39414r.m125890i0(str)) {
            List<String> listM122276E = AbstractC38176k.m122276E(AbstractC38176k.m122282r(AbstractC38176k.m122272A(AbstractC38176k.m122273B(C39412p.m125847b(str, new C39412p("\\s*(?:\"([^\"]*)\"|'([^']*)'|([^,'\"]+))\\s*(?:,|$)")), C35030h.f148275x), C35030h.f148276y), C35030h.f148277z));
            for (String str2 : listM122276E) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int identifier = context.getResources().getIdentifier(AbstractC39421y.m125926K(str2, " ", f148294a[i13], false), "font", context.getPackageName());
                    if (identifier != 0) {
                        return Integer.valueOf(identifier);
                    }
                }
            }
            C4861a.f20259o.m16067m0(AbstractC33745d.m106654m("Attempted to find a font matching `", "`, but none found. Falling back to default font.", listM122276E));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C35035m m110704f(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        return c35035m;
    }

    /* JADX INFO: renamed from: g */
    public static final C35031i m110705g(JSONObject jSONObject, JSONObject jSONObject2, C35035m c35035m) {
        long j7;
        long j13;
        long j14;
        float fFloatValue;
        int iIntValue;
        long j15;
        Object objOpt = jSONObject2.opt("--form-control-background");
        C17919x c17919x = objOpt instanceof C17919x ? (C17919x) objOpt : null;
        if (c17919x != null) {
            j7 = c17919x.f69639a;
        } else {
            Object objOpt2 = jSONObject.opt("--form-control-background");
            C17919x c17919x2 = objOpt2 instanceof C17919x ? (C17919x) objOpt2 : null;
            j7 = c17919x2 != null ? c17919x2.f69639a : c35035m.f148366w;
        }
        long j16 = j7;
        Object objOpt3 = jSONObject2.opt("--form-control-border-color");
        C17919x c17919x3 = objOpt3 instanceof C17919x ? (C17919x) objOpt3 : null;
        if (c17919x3 != null) {
            j13 = c17919x3.f69639a;
        } else {
            Object objOpt4 = jSONObject.opt("--form-control-border-color");
            C17919x c17919x4 = objOpt4 instanceof C17919x ? (C17919x) objOpt4 : null;
            j13 = c17919x4 != null ? c17919x4.f69639a : c35035m.f148364u;
        }
        long j17 = j13;
        Object objOpt5 = jSONObject2.opt("--content-primary");
        C17919x c17919x5 = objOpt5 instanceof C17919x ? (C17919x) objOpt5 : null;
        if (c17919x5 != null) {
            j14 = c17919x5.f69639a;
        } else {
            Object objOpt6 = jSONObject.opt("--content-primary");
            C17919x c17919x6 = objOpt6 instanceof C17919x ? (C17919x) objOpt6 : null;
            j14 = c17919x6 != null ? c17919x6.f69639a : c35035m.f148358o;
        }
        long j18 = j14;
        Object objOpt7 = jSONObject2.opt("--layout-radius-button");
        Float f13 = objOpt7 instanceof Float ? (Float) objOpt7 : null;
        if (f13 != null) {
            fFloatValue = f13.floatValue();
        } else {
            Object objOpt8 = jSONObject.opt("--layout-radius-button");
            Float f14 = objOpt8 instanceof Float ? (Float) objOpt8 : null;
            fFloatValue = f14 != null ? f14.floatValue() : c35035m.f148306C;
        }
        float f15 = fFloatValue;
        Object objOpt9 = jSONObject2.opt("--font-weight-medium");
        Integer num = objOpt9 instanceof Integer ? (Integer) objOpt9 : null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Object objOpt10 = jSONObject.opt("--font-weight-medium");
            Integer num2 = objOpt10 instanceof Integer ? (Integer) objOpt10 : null;
            iIntValue = num2 != null ? num2.intValue() : c35035m.f148344h;
        }
        int i13 = iIntValue;
        Object objOpt11 = jSONObject2.opt("--content-secondary");
        C17919x c17919x7 = objOpt11 instanceof C17919x ? (C17919x) objOpt11 : null;
        if (c17919x7 != null) {
            j15 = c17919x7.f69639a;
        } else {
            Object objOpt12 = jSONObject.opt("--content-secondary");
            C17919x c17919x8 = objOpt12 instanceof C17919x ? (C17919x) objOpt12 : null;
            j15 = c17919x8 != null ? c17919x8.f69639a : c35035m.f148359p;
        }
        return m110699a(new C35031i(0.0f, f15, j16, j17, j18, i13, new C17919x(j15), null, null, 129799), jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: h */
    public static final C35031i m110706h(JSONObject jSONObject, JSONObject jSONObject2, C35035m c35035m) {
        long j7;
        long j13;
        long j14;
        Object objOpt = jSONObject2.opt("--button-secondary-background");
        C17919x c17919x = objOpt instanceof C17919x ? (C17919x) objOpt : null;
        if (c17919x != null) {
            j7 = c17919x.f69639a;
        } else {
            Object objOpt2 = jSONObject.opt("--button-secondary-background");
            C17919x c17919x2 = objOpt2 instanceof C17919x ? (C17919x) objOpt2 : null;
            j7 = c17919x2 != null ? c17919x2.f69639a : c35035m.f148366w;
        }
        long j15 = j7;
        Object objOpt3 = jSONObject2.opt("--button-secondary-border-color");
        C17919x c17919x3 = objOpt3 instanceof C17919x ? (C17919x) objOpt3 : null;
        if (c17919x3 != null) {
            j13 = c17919x3.f69639a;
        } else {
            Object objOpt4 = jSONObject.opt("--button-secondary-border-color");
            C17919x c17919x4 = objOpt4 instanceof C17919x ? (C17919x) objOpt4 : null;
            j13 = c17919x4 != null ? c17919x4.f69639a : c35035m.f148364u;
        }
        Object objOpt5 = jSONObject2.opt("--button-secondary-content");
        C17919x c17919x5 = objOpt5 instanceof C17919x ? (C17919x) objOpt5 : null;
        if (c17919x5 != null) {
            j14 = c17919x5.f69639a;
        } else {
            Object objOpt6 = jSONObject.opt("--button-secondary-content");
            C17919x c17919x6 = objOpt6 instanceof C17919x ? (C17919x) objOpt6 : null;
            j14 = c17919x6 != null ? c17919x6.f69639a : c35035m.f148359p;
        }
        return m110700b(m110699a(new C35031i(0.0f, 0.0f, j15, j13, j14, 0, null, null, null, 130959), jSONObject, jSONObject2), jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: i */
    public static final C35031i m110707i(JSONObject jSONObject, JSONObject jSONObject2, C35035m c35035m) {
        long j7;
        long j13;
        long j14;
        Object objOpt = jSONObject2.opt("--button-tertiary-background");
        C17919x c17919x = objOpt instanceof C17919x ? (C17919x) objOpt : null;
        if (c17919x != null) {
            j7 = c17919x.f69639a;
        } else {
            Object objOpt2 = jSONObject.opt("--button-tertiary-background");
            C17919x c17919x2 = objOpt2 instanceof C17919x ? (C17919x) objOpt2 : null;
            j7 = c17919x2 != null ? c17919x2.f69639a : C17919x.f69636m;
        }
        Object objOpt3 = jSONObject2.opt("--button-tertiary-border-color");
        C17919x c17919x3 = objOpt3 instanceof C17919x ? (C17919x) objOpt3 : null;
        if (c17919x3 != null) {
            j13 = c17919x3.f69639a;
        } else {
            Object objOpt4 = jSONObject.opt("--button-tertiary-border-color");
            C17919x c17919x4 = objOpt4 instanceof C17919x ? (C17919x) objOpt4 : null;
            j13 = c17919x4 != null ? c17919x4.f69639a : C17919x.f69636m;
        }
        Object objOpt5 = jSONObject2.opt("--button-tertiary-content");
        C17919x c17919x5 = objOpt5 instanceof C17919x ? (C17919x) objOpt5 : null;
        if (c17919x5 != null) {
            j14 = c17919x5.f69639a;
        } else {
            Object objOpt6 = jSONObject.opt("--button-tertiary-content");
            C17919x c17919x6 = objOpt6 instanceof C17919x ? (C17919x) objOpt6 : null;
            j14 = c17919x6 != null ? c17919x6.f69639a : c35035m.f148359p;
        }
        return m110700b(m110699a(new C35031i(0.0f, 0.0f, j7, j13, j14, 0, null, null, null, 130959), jSONObject, jSONObject2), jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: j */
    public static final C35031i m110708j(JSONObject jSONObject, JSONObject jSONObject2, C35035m c35035m) {
        long j7;
        long j13;
        long j14;
        Object objOpt = jSONObject2.opt("--form-control-background");
        C17919x c17919x = objOpt instanceof C17919x ? (C17919x) objOpt : null;
        if (c17919x != null) {
            j7 = c17919x.f69639a;
        } else {
            Object objOpt2 = jSONObject.opt("--form-control-background");
            C17919x c17919x2 = objOpt2 instanceof C17919x ? (C17919x) objOpt2 : null;
            j7 = c17919x2 != null ? c17919x2.f69639a : c35035m.f148366w;
        }
        long j15 = j7;
        Object objOpt3 = jSONObject2.opt("--form-control-border-color");
        C17919x c17919x3 = objOpt3 instanceof C17919x ? (C17919x) objOpt3 : null;
        if (c17919x3 != null) {
            j13 = c17919x3.f69639a;
        } else {
            Object objOpt4 = jSONObject.opt("--form-control-border-color");
            C17919x c17919x4 = objOpt4 instanceof C17919x ? (C17919x) objOpt4 : null;
            j13 = c17919x4 != null ? c17919x4.f69639a : c35035m.f148364u;
        }
        Object objOpt5 = jSONObject2.opt("--content-primary");
        C17919x c17919x5 = objOpt5 instanceof C17919x ? (C17919x) objOpt5 : null;
        if (c17919x5 != null) {
            j14 = c17919x5.f69639a;
        } else {
            Object objOpt6 = jSONObject.opt("--content-primary");
            C17919x c17919x6 = objOpt6 instanceof C17919x ? (C17919x) objOpt6 : null;
            j14 = c17919x6 != null ? c17919x6.f69639a : c35035m.f148358o;
        }
        return m110700b(m110699a(new C35031i(0.0f, 0.0f, j15, j13, j14, 0, null, null, null, 130959), jSONObject, jSONObject2), jSONObject, jSONObject2);
    }
}
