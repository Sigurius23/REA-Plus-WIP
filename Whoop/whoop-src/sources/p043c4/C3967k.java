package p043c4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseSelect;
import com.amplitude.quickjs.wrapper.JSCallFunction;
import com.amplitude.quickjs.wrapper.JSFunction;
import com.amplitude.quickjs.wrapper.JSObject;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.amplitude.quickjs.wrapper.QuickJSObject;
import e93.AbstractC12889b;
import hm.C17417d;
import io.sentry.android.replay.util.C20235c;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import io.sentry.android.replay.viewhierarchy.C20249d;
import io.sentry.android.replay.viewhierarchy.C20251f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.C25271y;
import org.json.JSONObject;
import p025b1.C2214e;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p294l3.AbstractC23278s;
import p294l3.C23277r0;
import p294l3.C23286w;
import p294l3.C23290y;
import p390p1.InterfaceC28601c1;
import p401pj.C29287u;
import p463rj.C31485p;
import p525uj.C35035m;
import p558vp.AbstractC36259c;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c4.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C3967k extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16167E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16168F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16169w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16170x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16171y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f16172z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3967k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        super(1);
        this.f16169w = i13;
        this.f16170x = obj;
        this.f16171y = obj2;
        this.f16172z = obj3;
        this.f16167E = obj4;
        this.f16168F = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x0302  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:120:0x0326  */
    /* JADX WARN: Code duplicated, block: B:122:0x033a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0358  */
    /* JADX WARN: Code duplicated, block: B:124:0x035d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0377  */
    /* JADX WARN: Code duplicated, block: B:132:0x0381  */
    /* JADX WARN: Code duplicated, block: B:133:0x0390  */
    /* JADX WARN: Code duplicated, block: B:136:0x039d  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b0 A[PHI: r4
      0x02b0: PHI (r4v9 java.lang.Integer) = (r4v6 java.lang.Integer), (r4v17 java.lang.Integer) binds: [B:94:0x02b9, B:90:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x02c4  */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, l83.h] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        List listSubList;
        C23465k c23465k;
        int i13;
        Integer numValueOf;
        int iIntValue;
        int i14;
        int i15;
        ArrayList arrayList;
        int lineCount;
        int i16;
        List listM118958J;
        Layout layout;
        float lineLeft;
        Layout layout2;
        float lineRight;
        int lineTop;
        int lineBottom;
        C23277r0 c23277r0;
        C23286w c23286w;
        C23277r0 c23277r1;
        int i17;
        int pixel;
        JSObject jSObject;
        JSFunction jSFunction;
        String str;
        switch (this.f16169w) {
            case 0:
                C3958f0 c3958f0 = (C3958f0) this.f16170x;
                c3958f0.f16132O.addView(c3958f0, c3958f0.f16133P);
                c3958f0.m11999k((InterfaceC4339a) this.f16171y, (C3966j0) this.f16172z, (String) this.f16167E, (EnumC39181m) this.f16168F);
                return new C2214e(c3958f0, 2);
            case 1:
                C12982q entry = (C12982q) obj;
                C22665e0 c22665e0 = (C22665e0) this.f16172z;
                AbstractC22676k.m65750j(entry, "entry");
                ((C22659b0) this.f16170x).f89329w = true;
                ArrayList arrayList2 = (ArrayList) this.f16171y;
                int iIndexOf = arrayList2.indexOf(entry);
                if (iIndexOf != -1) {
                    int i18 = iIndexOf + 1;
                    listSubList = arrayList2.subList(c22665e0.f89334w, i18);
                    c22665e0.f89334w = i18;
                } else {
                    listSubList = C25271y.f99162w;
                }
                ((AbstractC12939a0) this.f16167E).m36387a(entry.f44844x, (Bundle) this.f16168F, entry, listSubList);
                return C23454a0.f92919a;
            case 2:
                AbstractC20252g node = (AbstractC20252g) obj;
                C20235c c20235c = (C20235c) this.f16170x;
                ?? r10 = c20235c.f76021y;
                ?? r14 = c20235c.f76019w;
                AbstractC22676k.m65750j(node, "node");
                Rect rect = node.f76067f;
                if (node.f76065d && node.f76062a > 0 && node.f76063b > 0) {
                    if (rect == null) {
                        return Boolean.FALSE;
                    }
                    if (node instanceof C20249d) {
                        List listM118958J2 = AbstractC37056f.m118958J(rect);
                        Bitmap bitmap = (Bitmap) this.f16171y;
                        Matrix matrix = (Matrix) this.f16172z;
                        if (bitmap.isRecycled() || ((Bitmap) r14.getValue()).isRecycled()) {
                            pixel = -16777216;
                        } else {
                            Rect rect2 = new Rect(rect);
                            RectF rectF = new RectF(rect2);
                            if (matrix != null) {
                                matrix.mapRect(rectF);
                            }
                            rectF.round(rect2);
                            ((Canvas) c20235c.f76020x.getValue()).drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
                            pixel = ((Bitmap) r14.getValue()).getPixel(0, 0);
                        }
                        c23465k = new C23465k(listM118958J2, Integer.valueOf(pixel));
                    } else if (node instanceof C20251f) {
                        C20251f c20251f = (C20251f) node;
                        C17417d c17417d = c20251f.f76058h;
                        if (c17417d != null) {
                            switch (c17417d.f67506w) {
                                case 10:
                                    Layout layout3 = (Layout) c17417d.f67507x;
                                    if (layout3.getText() instanceof Spanned) {
                                        CharSequence text = layout3.getText();
                                        AbstractC22676k.m65748h(text, "null cannot be cast to non-null type android.text.Spanned");
                                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout3.getText().length(), ForegroundColorSpan.class);
                                        AbstractC22676k.m65747g(foregroundColorSpanArr);
                                        int i19 = Integer.MIN_VALUE;
                                        Integer numValueOf2 = null;
                                        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                                            CharSequence text2 = layout3.getText();
                                            AbstractC22676k.m65748h(text2, "null cannot be cast to non-null type android.text.Spanned");
                                            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
                                            CharSequence text3 = layout3.getText();
                                            AbstractC22676k.m65748h(text3, "null cannot be cast to non-null type android.text.Spanned");
                                            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
                                            if (spanStart != -1 && spanEnd != -1 && (i17 = spanEnd - spanStart) > i19) {
                                                numValueOf2 = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                                                i19 = i17;
                                            }
                                        }
                                        i13 = -16777216;
                                        numValueOf = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() | (-16777216)) : null;
                                        break;
                                    }
                                default:
                                    numValueOf = null;
                                    i13 = -16777216;
                                    break;
                            }
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            }
                            i14 = c20251f.f76060j;
                            i15 = c20251f.f76061k;
                            if (c17417d == null) {
                                listM118958J = AbstractC37056f.m118958J(rect);
                            } else {
                                arrayList = new ArrayList();
                                switch (c17417d.f67506w) {
                                    case 10:
                                        lineCount = ((Layout) c17417d.f67507x).getLineCount();
                                        break;
                                    default:
                                        lineCount = ((C23277r0) c17417d.f67507x).f92228b.f92263f;
                                        break;
                                }
                                for (i16 = 0; i16 < lineCount; i16++) {
                                    switch (c17417d.f67506w) {
                                        case 10:
                                            layout = (Layout) c17417d.f67507x;
                                            if (layout.getEllipsizedWidth() > 0 || layout.getEllipsizedWidth() >= layout.getWidth()) {
                                                lineLeft = layout.getLineLeft(i16);
                                            } else {
                                                lineLeft = 0.0f;
                                            }
                                            break;
                                        default:
                                            c23277r1 = (C23277r0) c17417d.f67507x;
                                            if (c23277r1.f92228b.f92261d > ((int) (c23277r1.f92229c >> 32))) {
                                                lineLeft = 0.0f;
                                            } else {
                                                lineLeft = c23277r1.m67337f(i16);
                                            }
                                            break;
                                    }
                                    int i24 = (int) lineLeft;
                                    switch (c17417d.f67506w) {
                                        case 10:
                                            layout2 = (Layout) c17417d.f67507x;
                                            if (layout2.getEllipsizedWidth() > 0 || layout2.getEllipsizedWidth() >= layout2.getWidth()) {
                                                lineRight = layout2.getLineRight(i16);
                                            } else {
                                                lineRight = layout2.getEllipsizedWidth();
                                            }
                                            break;
                                        default:
                                            c23277r0 = (C23277r0) c17417d.f67507x;
                                            c23286w = c23277r0.f92228b;
                                            if (c23286w.f92261d > ((int) (c23277r0.f92229c >> 32))) {
                                                c23286w.m67381m(i16);
                                                ArrayList arrayList3 = c23286w.f92265h;
                                                C23290y c23290y = (C23290y) arrayList3.get(AbstractC23278s.m67347d(i16, arrayList3));
                                                lineRight = c23290y.f92270a.f92101d.f97768f.getLineWidth(i16 - c23290y.f92273d);
                                            } else {
                                                lineRight = c23277r0.m67338g(i16);
                                            }
                                            break;
                                    }
                                    int i25 = (int) lineRight;
                                    switch (c17417d.f67506w) {
                                        case 10:
                                            lineTop = ((Layout) c17417d.f67507x).getLineTop(i16);
                                            break;
                                        default:
                                            lineTop = AbstractC12889b.m36258X(((C23277r0) c17417d.f67507x).f92228b.m67376f(i16));
                                            break;
                                    }
                                    switch (c17417d.f67506w) {
                                        case 10:
                                            lineBottom = ((Layout) c17417d.f67507x).getLineBottom(i16);
                                            break;
                                        default:
                                            lineBottom = AbstractC12889b.m36258X(((C23277r0) c17417d.f67507x).f92228b.m67372b(i16));
                                            break;
                                    }
                                    Rect rect3 = new Rect();
                                    rect3.left = rect.left + i14 + i24;
                                    rect3.right = rect.left + i14 + i25;
                                    int i26 = rect.top + i15 + lineTop;
                                    rect3.top = i26;
                                    rect3.bottom = (lineBottom - lineTop) + i26;
                                    arrayList.add(rect3);
                                }
                                listM118958J = arrayList;
                            }
                            c23465k = new C23465k(listM118958J, Integer.valueOf(iIntValue));
                        } else {
                            i13 = -16777216;
                        }
                        numValueOf = c20251f.f76059i;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = i13;
                        }
                        i14 = c20251f.f76060j;
                        i15 = c20251f.f76061k;
                        if (c17417d == null) {
                            listM118958J = AbstractC37056f.m118958J(rect);
                        } else {
                            arrayList = new ArrayList();
                            switch (c17417d.f67506w) {
                                case 10:
                                    lineCount = ((Layout) c17417d.f67507x).getLineCount();
                                    break;
                                default:
                                    lineCount = ((C23277r0) c17417d.f67507x).f92228b.f92263f;
                                    break;
                            }
                            while (i16 < lineCount) {
                                switch (c17417d.f67506w) {
                                    case 10:
                                        layout = (Layout) c17417d.f67507x;
                                        if (layout.getEllipsizedWidth() > 0) {
                                        }
                                        lineLeft = layout.getLineLeft(i16);
                                        break;
                                    default:
                                        c23277r1 = (C23277r0) c17417d.f67507x;
                                        if (c23277r1.f92228b.f92261d > ((int) (c23277r1.f92229c >> 32))) {
                                            lineLeft = 0.0f;
                                        } else {
                                            lineLeft = c23277r1.m67337f(i16);
                                        }
                                        break;
                                }
                                int i27 = (int) lineLeft;
                                switch (c17417d.f67506w) {
                                    case 10:
                                        layout2 = (Layout) c17417d.f67507x;
                                        if (layout2.getEllipsizedWidth() > 0) {
                                            lineRight = layout2.getLineRight(i16);
                                        } else {
                                            lineRight = layout2.getLineRight(i16);
                                        }
                                        break;
                                    default:
                                        c23277r0 = (C23277r0) c17417d.f67507x;
                                        c23286w = c23277r0.f92228b;
                                        if (c23286w.f92261d > ((int) (c23277r0.f92229c >> 32))) {
                                            c23286w.m67381m(i16);
                                            ArrayList arrayList4 = c23286w.f92265h;
                                            C23290y c23290y2 = (C23290y) arrayList4.get(AbstractC23278s.m67347d(i16, arrayList4));
                                            lineRight = c23290y2.f92270a.f92101d.f97768f.getLineWidth(i16 - c23290y2.f92273d);
                                        } else {
                                            lineRight = c23277r0.m67338g(i16);
                                        }
                                        break;
                                }
                                int i28 = (int) lineRight;
                                switch (c17417d.f67506w) {
                                    case 10:
                                        lineTop = ((Layout) c17417d.f67507x).getLineTop(i16);
                                        break;
                                    default:
                                        lineTop = AbstractC12889b.m36258X(((C23277r0) c17417d.f67507x).f92228b.m67376f(i16));
                                        break;
                                }
                                switch (c17417d.f67506w) {
                                    case 10:
                                        lineBottom = ((Layout) c17417d.f67507x).getLineBottom(i16);
                                        break;
                                    default:
                                        lineBottom = AbstractC12889b.m36258X(((C23277r0) c17417d.f67507x).f92228b.m67372b(i16));
                                        break;
                                }
                                Rect rect4 = new Rect();
                                rect4.left = rect.left + i14 + i27;
                                rect4.right = rect.left + i14 + i28;
                                int i29 = rect.top + i15 + lineTop;
                                rect4.top = i29;
                                rect4.bottom = (lineBottom - lineTop) + i29;
                                arrayList.add(rect4);
                            }
                            listM118958J = arrayList;
                        }
                        c23465k = new C23465k(listM118958J, Integer.valueOf(iIntValue));
                    } else {
                        c23465k = new C23465k(AbstractC37056f.m118958J(rect), -16777216);
                    }
                    List list = (List) c23465k.f92937w;
                    ((Paint) r10.getValue()).setColor(((Number) c23465k.f92938x).intValue());
                    Canvas canvas = (Canvas) this.f16168F;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) r10.getValue());
                    }
                    ((ArrayList) this.f16167E).addAll(list);
                }
                return Boolean.TRUE;
            case 3:
                QuickJSContext jsContext = (QuickJSContext) obj;
                Rect rect5 = (Rect) this.f16172z;
                AbstractC22676k.m65750j(jsContext, "jsContext");
                Configuration configuration = ((Context) this.f16170x).getResources().getConfiguration();
                int i34 = configuration.screenWidthDp;
                int i35 = configuration.screenHeightDp;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f16167E;
                Object objValueOf = ((int) (AbstractC36259c.m115685d(interfaceC28601c1) >> 32)) > 0 ? Integer.valueOf((int) (((C39180l) interfaceC28601c1.getValue()).f168422a >> 32)) : Float.valueOf(((C35035m) this.f16171y).f148322S);
                int i36 = ((int) (((C39180l) interfaceC28601c1.getValue()).f168422a & 4294967295L)) > 0 ? (int) (((C39180l) interfaceC28601c1.getValue()).f168422a & 4294967295L) : 144;
                String string = new JSONObject().put("x", rect5.left).put("y", rect5.top).put("width", rect5.width()).put("height", rect5.height()).toString();
                AbstractC22676k.m65749i(string, "JSONObject()\n           …              .toString()");
                String string2 = new JSONObject().put("width", objValueOf).put("height", i36).put("x", 0).put("y", 0).toString();
                AbstractC22676k.m65749i(string2, "JSONObject()\n           …              .toString()");
                String string3 = new JSONObject().put("x", 0).put("y", 0).put("width", i34).put("height", i35).toString();
                AbstractC22676k.m65749i(string3, "JSONObject()\n           …              .toString()");
                JSFunction jSFunction2 = null;
                try {
                    Object objEvaluate = jsContext.evaluate("globalThis.pinPositioning.position(" + string + ", " + string2 + ", " + string3 + ')');
                    AbstractC22676k.m65748h(objEvaluate, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSObject");
                    jSObject = (JSObject) objEvaluate;
                    try {
                        Object property = jsContext.getProperty(jSObject, "then");
                        AbstractC22676k.m65748h(property, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSFunction");
                        jSFunction = (JSFunction) property;
                        try {
                            final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) this.f16168F;
                            jSFunction.call(new JSCallFunction() { // from class: pj.t
                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                @Override // com.amplitude.quickjs.wrapper.JSCallFunction
                                public final Object call(Object[] objArr) {
                                    InterfaceC28601c1 pinNudgePosition$delegate = interfaceC28601c2;
                                    AbstractC22676k.m65750j(pinNudgePosition$delegate, "$pinNudgePosition$delegate");
                                    int i37 = 0;
                                    Object obj2 = objArr[0];
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.QuickJSObject");
                                    QuickJSObject quickJSObject = (QuickJSObject) obj2;
                                    Object property2 = quickJSObject.getProperty("x");
                                    AbstractC22676k.m65748h(property2, "null cannot be cast to non-null type kotlin.Number");
                                    Number number = (Number) property2;
                                    Object property3 = quickJSObject.getProperty("y");
                                    AbstractC22676k.m65748h(property3, "null cannot be cast to non-null type kotlin.Number");
                                    Number number2 = (Number) property3;
                                    QuickJSObject quickJSObject2 = (QuickJSObject) quickJSObject.getProperty("arrow");
                                    Number number3 = (Number) (quickJSObject2 != null ? quickJSObject2.getProperty("x") : null);
                                    Number number4 = (Number) (quickJSObject2 != null ? quickJSObject2.getProperty("y") : null);
                                    Object property4 = quickJSObject.getProperty("placement");
                                    AbstractC22676k.m65748h(property4, "null cannot be cast to non-null type kotlin.String");
                                    String lowerCase = ((String) property4).toLowerCase(Locale.ROOT);
                                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                                    switch (lowerCase.hashCode()) {
                                        case -1683715527:
                                            if (lowerCase.equals("bottom-end")) {
                                                i37 = 10;
                                            }
                                            break;
                                        case -1570287190:
                                            if (lowerCase.equals("right-end")) {
                                                i37 = 8;
                                            }
                                            break;
                                        case -1499359887:
                                            if (lowerCase.equals("right-start")) {
                                                i37 = 7;
                                            }
                                            break;
                                        case -1383228885:
                                            if (lowerCase.equals("bottom")) {
                                                i37 = 3;
                                            }
                                            break;
                                        case -1313634838:
                                            if (lowerCase.equals("top-start")) {
                                                i37 = 5;
                                            }
                                            break;
                                        case -1141044125:
                                            if (lowerCase.equals("top-end")) {
                                                i37 = 6;
                                            }
                                            break;
                                        case 115029:
                                            if (lowerCase.equals("top")) {
                                                i37 = 1;
                                            }
                                            break;
                                        case 3317767:
                                            if (lowerCase.equals("left")) {
                                                i37 = 4;
                                            }
                                            break;
                                        case 108511772:
                                            if (lowerCase.equals("right")) {
                                                i37 = 2;
                                            }
                                            break;
                                        case 1029379868:
                                            if (lowerCase.equals("left-start")) {
                                                i37 = 11;
                                            }
                                            break;
                                        case 1165157952:
                                            if (lowerCase.equals("bottom-start")) {
                                                i37 = 9;
                                            }
                                            break;
                                        case 1717256725:
                                            if (lowerCase.equals("left-end")) {
                                                i37 = 12;
                                            }
                                            break;
                                    }
                                    pinNudgePosition$delegate.setValue(new C29282p(new C29267f(number, number2), i37, new C29267f(number3, number4)));
                                    return null;
                                }
                            });
                            Object property2 = jsContext.getProperty(jSObject, "catch");
                            AbstractC22676k.m65748h(property2, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSFunction");
                            JSFunction jSFunction3 = (JSFunction) property2;
                            try {
                                jSFunction3.call(new C29287u());
                                jSFunction3.release();
                                jSFunction.release();
                                jSObject.release();
                                return C23454a0.f92919a;
                            } catch (Throwable th3) {
                                th = th3;
                                jSFunction2 = jSFunction3;
                                if (jSFunction2 != null) {
                                    jSFunction2.release();
                                }
                                if (jSFunction != null) {
                                    jSFunction.release();
                                }
                                if (jSObject != null) {
                                    jSObject.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        jSFunction = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    jSObject = null;
                    jSFunction = null;
                }
                break;
            default:
                String newText = (String) obj;
                AbstractC22676k.m65750j(newText, "newText");
                Function1 function1 = (Function1) this.f16170x;
                String uuid = ((SurveyListBlock) this.f16171y).getUuid();
                Integer num = (Integer) this.f16172z;
                int iIntValue2 = num != null ? num.intValue() : ((List) this.f16167E).size();
                C31485p c31485p = (C31485p) this.f16168F;
                if (c31485p == null || (str = c31485p.f129728a) == null) {
                    str = "";
                }
                function1.invoke(new SurveyResponseSelect(uuid, iIntValue2, str, newText));
                return C23454a0.f92919a;
        }
    }
}
