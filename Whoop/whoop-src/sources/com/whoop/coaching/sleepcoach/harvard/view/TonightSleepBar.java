package com.whoop.coaching.sleepcoach.harvard.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1707m0;
import c93.InterfaceC4339a;
import com.whoop.coaching.sleepcoach.harvard.view.TonightSleepBar;
import gy0.AbstractC16273b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import kp0.AbstractC22734a;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22747n;
import l83.InterfaceC23462h;
import lp0.AbstractC24638i;
import lp0.AbstractC24640k;
import lp0.C24641l;
import lp0.EnumC24630a;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qe2.AbstractC30311d;
import qe2.AbstractC30314g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00103\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010)R\u0018\u0010;\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010)R\u001b\u0010A\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010)R\u0016\u0010K\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@R\u001b\u0010U\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010>\u001a\u0004\bT\u0010@R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\b[\u0010@R\u001b\u0010_\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010ER\u001b\u0010b\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010>\u001a\u0004\ba\u0010@R\u001b\u0010e\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010>\u001a\u0004\bd\u0010@R\u0014\u0010g\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010XR\u001b\u0010j\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010>\u001a\u0004\bi\u0010@R\u001b\u0010m\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010>\u001a\u0004\bl\u0010ER\u001b\u0010p\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010>\u001a\u0004\bo\u0010@R\u001b\u0010s\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010>\u001a\u0004\br\u0010@R\u0014\u0010u\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010XR\u0016\u0010x\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010zR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010)R\u0018\u0010\u0081\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010XR\u0018\u0010\u0083\u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010JR\u0018\u0010\u0085\u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010JR\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R.\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R.\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R4\u0010\u009d\u0001\u001a\u00030\u0096\u00012\b\u0010\u008a\u0001\u001a\u00030\u0096\u00018\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009e\u0001"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/view/TonightSleepBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Ll83/a0;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Llp0/l;", "tonightWindow", "optimalWindow", "Lkp0/a;", "alarmType", "", "sleepTime", "", "alarmEnabled", "x", "(Llp0/l;Llp0/l;Lkp0/a;Ljava/lang/String;Z)V", "sleepWindow", "Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "drawScale", "Landroid/graphics/Rect;", "s", "(Llp0/l;Lcom/whoop/coaching/sleepcoach/harvard/view/a;)Landroid/graphics/Rect;", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap;", "t", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "topOfBar", "bottomOfBar", "Landroid/graphics/Paint;", "y", "Landroid/graphics/Paint;", "paint", "z", "sleepBarBackGroundPaint", "E", "sleepBarBackGroundStrokePaint", "F", "Llp0/l;", "tonightsSleepWindow", "G", "screenWidth", "H", "Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "scale", "textScaleFactor", "J", "Ll83/h;", "getHashBitmap", "()Landroid/graphics/Bitmap;", "hashBitmap", "Landroid/graphics/BitmapShader;", "K", "getBitmapShader", "()Landroid/graphics/BitmapShader;", "bitmapShader", "L", "endpointWidth", "M", "Landroid/graphics/Rect;", "mainBarRect", "Landroid/graphics/ComposeShader;", "N", "Landroid/graphics/ComposeShader;", "composeShader", "O", "getPillButtonBitmap", "pillButtonBitmap", "P", "getAlarmTeardrop", "alarmTeardrop", "Landroid/graphics/LinearGradient;", "Q", "Landroid/graphics/LinearGradient;", "linearGradient", "R", "getHashBitmapTeal", "hashBitmapTeal", "S", "getBitmapShaderTeal", "bitmapShaderTeal", "T", "getPillButtonBitmapTeal", "pillButtonBitmapTeal", "U", "getAlarmTeardropTeal", "alarmTeardropTeal", "V", "linearGradientTeal", "W", "getHashBitmapGreen", "hashBitmapGreen", "a0", "getBitmapShaderGreen", "bitmapShaderGreen", "b0", "getPillButtonBitmapGreen", "pillButtonBitmapGreen", "c0", "getAlarmTeardropGreen", "alarmTeardropGreen", "d0", "linearGradientGreen", "e0", "Landroid/graphics/BitmapShader;", "shaderPref", "f0", "Landroid/graphics/Bitmap;", "pillButtonPref", "g0", "alarmTeardropPref", "h0", "colorPref", "i0", "lineGradientPref", "j0", "leftBarEndpointRectangle", "k0", "rightBarEndpointRectangle", "Landroid/graphics/DashPathEffect;", "l0", "Landroid/graphics/DashPathEffect;", "dashedPathEffect", "value", "m0", "Ljava/lang/String;", "getSleepTimeLabel", "()Ljava/lang/String;", "sleepTimeLabel", "n0", "getAbovePillLabel", "abovePillLabel", "o0", "Ljava/lang/Boolean;", "isAlarmEnabled", "Llp0/a;", "p0", "Llp0/a;", "getBarType", "()Llp0/a;", "setBarType", "(Llp0/a;)V", "barType", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TonightSleepBar extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Paint sleepBarBackGroundStrokePaint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private C24641l tonightsSleepWindow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int screenWidth;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C6223a scale;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int textScaleFactor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h hashBitmap;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h bitmapShader;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int endpointWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Rect mainBarRect;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private ComposeShader composeShader;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h pillButtonBitmap;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h alarmTeardrop;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final LinearGradient linearGradient;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC23462h hashBitmapTeal;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h bitmapShaderTeal;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h pillButtonBitmapTeal;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h alarmTeardropTeal;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final LinearGradient linearGradientTeal;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h hashBitmapGreen;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC23462h bitmapShaderGreen;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC23462h pillButtonBitmapGreen;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC23462h alarmTeardropGreen;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final LinearGradient linearGradientGreen;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private BitmapShader shaderPref;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private Bitmap pillButtonPref;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private Bitmap alarmTeardropPref;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private int colorPref;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private LinearGradient lineGradientPref;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private Rect leftBarEndpointRectangle;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private Rect rightBarEndpointRectangle;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private final DashPathEffect dashedPathEffect;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private String sleepTimeLabel;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private String abovePillLabel;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private Boolean isAlarmEnabled;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private EnumC24630a barType;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int topOfBar;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int bottomOfBar;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Paint sleepBarBackGroundPaint;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.view.TonightSleepBar$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6222a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24496a;

        static {
            int[] iArr = new int[EnumC24630a.values().length];
            try {
                iArr[EnumC24630a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24630a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24630a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24496a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonightSleepBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        this.topOfBar = 140;
        this.bottomOfBar = 210;
        this.paint = new Paint();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#40000000"));
        paint.setStyle(Paint.Style.FILL);
        this.sleepBarBackGroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(4.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-16777216);
        this.sleepBarBackGroundStrokePaint = paint2;
        this.screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        final int i13 = 10;
        this.textScaleFactor = 10;
        final int i14 = 0;
        this.hashBitmap = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i15 = 5;
        this.bitmapShader = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i16 = 6;
        this.endpointWidth = 6;
        this.pillButtonBitmap = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i17 = 7;
        this.alarmTeardrop = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        float f13 = 140;
        float f14 = f13 - 10.0f;
        float f15 = f13 - 170.0f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, f14, 0.0f, f15, -1, -16777216, tileMode);
        this.linearGradient = linearGradient;
        final int i18 = 8;
        this.hashBitmapTeal = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i19 = 9;
        this.bitmapShaderTeal = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        this.pillButtonBitmapTeal = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i24 = 11;
        this.alarmTeardropTeal = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        this.linearGradientTeal = new LinearGradient(0.0f, f14, 0.0f, f15, Color.parseColor("#00f19f"), -16777216, tileMode);
        final int i25 = 1;
        this.hashBitmapGreen = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i26 = 2;
        this.bitmapShaderGreen = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i27 = 3;
        this.pillButtonBitmapGreen = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        final int i28 = 4;
        this.alarmTeardropGreen = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: lp0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TonightSleepBar f96383x;

            {
                this.f96383x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return TonightSleepBar.m18557w(this.f96383x);
                    case 1:
                        return TonightSleepBar.m18555u(this.f96383x);
                    case 2:
                        return TonightSleepBar.m18550p(this.f96383x);
                    case 3:
                        return TonightSleepBar.m18558y(this.f96383x);
                    case 4:
                        return TonightSleepBar.m18547m(this.f96383x);
                    case 5:
                        return TonightSleepBar.m18552r(this.f96383x);
                    case 6:
                        return TonightSleepBar.m18534A(this.f96383x);
                    case 7:
                        return TonightSleepBar.m18549o(this.f96383x);
                    case 8:
                        return TonightSleepBar.m18556v(this.f96383x);
                    case 9:
                        return TonightSleepBar.m18551q(this.f96383x);
                    case 10:
                        return TonightSleepBar.m18559z(this.f96383x);
                    default:
                        return TonightSleepBar.m18548n(this.f96383x);
                }
            }
        });
        this.linearGradientGreen = new LinearGradient(0.0f, f14, 0.0f, f15, Color.parseColor("#19ec06"), -16777216, tileMode);
        this.shaderPref = getBitmapShader();
        this.pillButtonPref = getPillButtonBitmap();
        this.alarmTeardropPref = getAlarmTeardrop();
        this.colorPref = -1;
        this.lineGradientPref = linearGradient;
        this.dashedPathEffect = new DashPathEffect(new float[]{9.0f, 7.0f}, 0.0f);
        this.barType = EnumC24630a.EXACT_TIME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Bitmap m18534A(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124029C, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    private final Bitmap getAlarmTeardrop() {
        return (Bitmap) this.alarmTeardrop.getValue();
    }

    private final Bitmap getAlarmTeardropGreen() {
        return (Bitmap) this.alarmTeardropGreen.getValue();
    }

    private final Bitmap getAlarmTeardropTeal() {
        return (Bitmap) this.alarmTeardropTeal.getValue();
    }

    private final BitmapShader getBitmapShader() {
        return (BitmapShader) this.bitmapShader.getValue();
    }

    private final BitmapShader getBitmapShaderGreen() {
        return (BitmapShader) this.bitmapShaderGreen.getValue();
    }

    private final BitmapShader getBitmapShaderTeal() {
        return (BitmapShader) this.bitmapShaderTeal.getValue();
    }

    private final Bitmap getHashBitmap() {
        return (Bitmap) this.hashBitmap.getValue();
    }

    private final Bitmap getHashBitmapGreen() {
        return (Bitmap) this.hashBitmapGreen.getValue();
    }

    private final Bitmap getHashBitmapTeal() {
        return (Bitmap) this.hashBitmapTeal.getValue();
    }

    private final Bitmap getPillButtonBitmap() {
        return (Bitmap) this.pillButtonBitmap.getValue();
    }

    private final Bitmap getPillButtonBitmapGreen() {
        return (Bitmap) this.pillButtonBitmapGreen.getValue();
    }

    private final Bitmap getPillButtonBitmapTeal() {
        return (Bitmap) this.pillButtonBitmapTeal.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Bitmap m18547m(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124044o, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Bitmap m18548n(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124045p, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Bitmap m18549o(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124043n, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final BitmapShader m18550p(TonightSleepBar tonightSleepBar) {
        Bitmap hashBitmapGreen = tonightSleepBar.getHashBitmapGreen();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(hashBitmapGreen, tileMode, tileMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final BitmapShader m18551q(TonightSleepBar tonightSleepBar) {
        Bitmap hashBitmapTeal = tonightSleepBar.getHashBitmapTeal();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(hashBitmapTeal, tileMode, tileMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final BitmapShader m18552r(TonightSleepBar tonightSleepBar) {
        Bitmap hashBitmap = tonightSleepBar.getHashBitmap();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(hashBitmap, tileMode, tileMode);
    }

    /* JADX INFO: renamed from: s */
    private final Rect m18553s(C24641l sleepWindow, C6223a drawScale) {
        return new Rect(AbstractC24638i.m71989c(sleepWindow.getStartTime(), drawScale), this.topOfBar, AbstractC24638i.m71989c(sleepWindow.getEndTime(), drawScale), this.bottomOfBar);
    }

    private final void setBarType(EnumC24630a enumC24630a) {
        this.barType = enumC24630a;
        int i13 = C6222a.f24496a[enumC24630a.ordinal()];
        if (i13 == 1) {
            this.shaderPref = getBitmapShader();
            this.pillButtonPref = getPillButtonBitmap();
            this.alarmTeardropPref = getAlarmTeardrop();
            this.colorPref = -1;
            this.lineGradientPref = this.linearGradient;
            return;
        }
        if (i13 == 2) {
            this.shaderPref = getBitmapShaderTeal();
            this.pillButtonPref = getPillButtonBitmapTeal();
            this.alarmTeardropPref = getAlarmTeardropTeal();
            this.colorPref = Color.parseColor("#00f19f");
            this.lineGradientPref = this.linearGradientTeal;
            return;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        this.shaderPref = getBitmapShaderGreen();
        this.pillButtonPref = getPillButtonBitmapGreen();
        this.alarmTeardropPref = getAlarmTeardropGreen();
        this.colorPref = Color.parseColor("#19ec06");
        this.lineGradientPref = this.linearGradientGreen;
    }

    /* JADX INFO: renamed from: t */
    private final Bitmap m18554t(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            AbstractC22676k.m65749i(bitmap, "getBitmap(...)");
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Bitmap m18555u(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124041l, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Bitmap m18556v(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124042m, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Bitmap m18557w(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124040k, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Bitmap m18558y(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124027A, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Bitmap m18559z(TonightSleepBar tonightSleepBar) {
        Drawable drawable = tonightSleepBar.getResources().getDrawable(AbstractC30311d.f124028B, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        return tonightSleepBar.m18554t(drawable);
    }

    public final String getAbovePillLabel() {
        return this.abovePillLabel;
    }

    public final EnumC24630a getBarType() {
        return this.barType;
    }

    public final String getSleepTimeLabel() {
        return this.sleepTimeLabel;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C24641l c24641l;
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.reset();
        C6223a c6223a = this.scale;
        if (c6223a == null || (c24641l = this.tonightsSleepWindow) == null) {
            return;
        }
        canvas.drawRect(0.0f, this.topOfBar - 20.0f, getWidth(), this.bottomOfBar + 20.0f, this.sleepBarBackGroundPaint);
        canvas.drawRect(0.0f, this.topOfBar - 20.0f, getWidth(), this.bottomOfBar + 20.0f, this.sleepBarBackGroundStrokePaint);
        EnumC24630a enumC24630a = this.barType;
        EnumC24630a enumC24630a2 = EnumC24630a.EXACT_TIME;
        if (enumC24630a != enumC24630a2) {
            Paint paint = this.paint;
            ComposeShader composeShader = this.composeShader;
            if (composeShader == null) {
                AbstractC22676k.m65757q("composeShader");
                throw null;
            }
            paint.setShader(composeShader);
            Rect rect = this.mainBarRect;
            if (rect == null) {
                AbstractC22676k.m65757q("mainBarRect");
                throw null;
            }
            canvas.drawRect(AbstractC24640k.m71992b(rect), this.paint);
        } else {
            Paint paint2 = this.paint;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setShader(this.shaderPref);
            Rect rect2 = this.mainBarRect;
            if (rect2 == null) {
                AbstractC22676k.m65757q("mainBarRect");
                throw null;
            }
            canvas.drawRect(rect2, this.paint);
        }
        Paint paint3 = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        paint3.setShader(null);
        int iM71989c = AbstractC24638i.m71989c(c24641l.getMiddle(), c6223a);
        Bitmap bitmap = this.pillButtonPref;
        String upperCase = "";
        if (bitmap != null) {
            float f13 = iM71989c;
            float width = f13 - (getPillButtonBitmap().getWidth() / 2);
            float f14 = this.topOfBar;
            int height = getPillButtonBitmap().getHeight();
            Rect rect3 = this.mainBarRect;
            if (rect3 == null) {
                AbstractC22676k.m65757q("mainBarRect");
                throw null;
            }
            canvas.drawBitmap(bitmap, width, f14 - ((height - rect3.height()) / 2), this.paint);
            float fSqrt = (float) (Math.sqrt(((double) getWidth()) * ((double) getHeight())) / ((double) this.textScaleFactor));
            Paint paint4 = this.paint;
            paint4.setColor(this.colorPref);
            paint4.setTextSize(fSqrt);
            paint4.setLetterSpacing(0.0f);
            paint4.setTextAlign(Paint.Align.CENTER);
            paint4.setTypeface(AbstractC34523k.m109098b(getContext(), AbstractC16273b.f62203d));
            String str = this.sleepTimeLabel;
            if (str == null) {
                str = "";
            }
            float f15 = this.topOfBar;
            Rect rect4 = this.mainBarRect;
            if (rect4 == null) {
                AbstractC22676k.m65757q("mainBarRect");
                throw null;
            }
            canvas.drawText(str, f13, (this.paint.getTextSize() / 3) + f15 + (rect4.height() / 2), this.paint);
        }
        Paint paint5 = this.paint;
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setColor(this.colorPref);
        paint5.setTextSize(30.0f);
        paint5.setLetterSpacing(0.1f);
        paint5.setTypeface(AbstractC34523k.m109098b(getContext(), AbstractC16273b.f62200a));
        String str2 = this.abovePillLabel;
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        }
        canvas.drawText(upperCase, iM71989c, this.topOfBar - 45.0f, this.paint);
        int iM71989c2 = AbstractC24638i.m71989c(c24641l.getEndTime(), c6223a);
        int iM71989c3 = AbstractC24638i.m71989c(c24641l.getStartTime(), c6223a);
        Paint paint6 = this.paint;
        paint6.setColor(this.colorPref);
        paint6.setStyle(style);
        Rect rect5 = this.leftBarEndpointRectangle;
        if (rect5 == null) {
            AbstractC22676k.m65757q("leftBarEndpointRectangle");
            throw null;
        }
        canvas.drawRect(rect5, this.paint);
        if (this.barType == enumC24630a2) {
            Rect rect6 = this.rightBarEndpointRectangle;
            if (rect6 == null) {
                AbstractC22676k.m65757q("rightBarEndpointRectangle");
                throw null;
            }
            canvas.drawRect(rect6, this.paint);
        }
        Paint paint7 = this.paint;
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeWidth(2.0f);
        paint7.setPathEffect(this.dashedPathEffect);
        paint7.setColor(this.colorPref);
        paint7.setShader(this.lineGradientPref);
        float f16 = iM71989c3;
        int i13 = this.endpointWidth;
        int i14 = this.topOfBar;
        canvas.drawLine((i13 / 2) + f16, i14 - 10.0f, f16 + (i13 / 2), i14 - 400.0f, this.paint);
        float f17 = iM71989c2;
        int i15 = this.endpointWidth;
        int i16 = this.topOfBar;
        canvas.drawLine(f17 - (i15 / 2), i16 - 10.0f, f17 - (i15 / 2), i16 - 400.0f, this.paint);
        if (AbstractC22676k.m65745e(this.isAlarmEnabled, Boolean.TRUE)) {
            Paint paint8 = this.paint;
            paint8.setStyle(style);
            paint8.setPathEffect(null);
            Bitmap bitmap2 = this.alarmTeardropPref;
            canvas.drawBitmap(bitmap2, (f17 - (bitmap2.getWidth() / 2)) - 3.0f, (this.topOfBar - (this.alarmTeardropPref.getHeight() / 2)) - 13.0f, this.paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    /* JADX INFO: renamed from: x */
    public final void m18560x(C24641l tonightWindow, C24641l optimalWindow, AbstractC22734a alarmType, String sleepTime, boolean alarmEnabled) {
        EnumC24630a enumC24630a;
        AbstractC22676k.m65750j(tonightWindow, "tonightWindow");
        AbstractC22676k.m65750j(optimalWindow, "optimalWindow");
        AbstractC22676k.m65750j(alarmType, "alarmType");
        AbstractC22676k.m65750j(sleepTime, "sleepTime");
        this.tonightsSleepWindow = tonightWindow;
        if (alarmType instanceof C22736c) {
            enumC24630a = EnumC24630a.EXACT_TIME;
        } else if (alarmType instanceof C22747n) {
            enumC24630a = EnumC24630a.SLEEP_GOAL;
        } else {
            if (!(alarmType instanceof C22739f)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC24630a = EnumC24630a.IN_THE_GREEN;
        }
        setBarType(enumC24630a);
        C6223a c6223aM18564a = C6223a.INSTANCE.m18564a(this.screenWidth, tonightWindow, optimalWindow);
        int iM71989c = AbstractC24638i.m71989c(tonightWindow.getEndTime(), c6223aM18564a);
        int iM71989c2 = AbstractC24638i.m71989c(tonightWindow.getStartTime(), c6223aM18564a);
        this.leftBarEndpointRectangle = new Rect(iM71989c2, this.topOfBar, this.endpointWidth + iM71989c2, this.bottomOfBar);
        this.rightBarEndpointRectangle = new Rect(iM71989c - this.endpointWidth, this.topOfBar, iM71989c, this.bottomOfBar);
        this.mainBarRect = m18553s(tonightWindow, c6223aM18564a);
        float fM71989c = AbstractC24638i.m71989c(tonightWindow.getEndTime(), c6223aM18564a);
        Rect rect = this.mainBarRect;
        if (rect == null) {
            AbstractC22676k.m65757q("mainBarRect");
            throw null;
        }
        float fWidth = (rect.width() / 10.0f) + fM71989c;
        float fM71989c2 = AbstractC24638i.m71989c(tonightWindow.getEndTime(), c6223aM18564a);
        Rect rect2 = this.mainBarRect;
        if (rect2 == null) {
            AbstractC22676k.m65757q("mainBarRect");
            throw null;
        }
        this.composeShader = new ComposeShader(this.shaderPref, new LinearGradient(fWidth, 0.0f, fM71989c2 - (rect2.width() / 4.0f), 0.0f, 0, -16777216, Shader.TileMode.CLAMP), PorterDuff.Mode.DST_ATOP);
        this.scale = c6223aM18564a;
        this.sleepTimeLabel = sleepTime;
        this.abovePillLabel = getContext().getString(AbstractC30314g.f124340p1);
        this.isAlarmEnabled = Boolean.valueOf(alarmEnabled);
        invalidate();
    }
}
