package bm2;

import a01.C0084d;
import am2.C1012d;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.NumberFormat;
import android.widget.DatePicker;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b72.C2783a;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf2.C3201a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4835w;
import cm2.C4819g;
import cm2.C4826n;
import cm2.EnumC4822j;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import hc3.AbstractC17176i;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import j11.AbstractC21211n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import l41.AbstractC23332d;
import l83.C23454a0;
import l83.C23471q;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import ny0.EnumC27284v;
import or2.AbstractC28177l;
import or2.AbstractC28193q0;
import or2.C28204u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimeUtilKt;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p000.C17820i;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15081m5;
import p163g1.C15071l5;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import qz0.AbstractC30787f;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl2.AbstractC32706a;
import sl2.AbstractC32707b;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: bm2.e0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a©\u0001\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0003¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020,*\u00020\"H\u0001¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u00100\u001a#\u00104\u001a\u0004\u0018\u00010\u00002\b\u00101\u001a\u0004\u0018\u00010\u001e2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u00020\u0000*\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0000H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00020\u0000*\u00020\u001c2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010>\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u001eH\u0000¢\u0006\u0004\b>\u0010?\u001a\u0017\u0010A\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u001eH\u0000¢\u0006\u0004\bA\u0010?\u001a\u001b\u0010C\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010B\u001a\u00020,H\u0000¢\u0006\u0004\bC\u0010D\u001a)\u0010G\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0F2\u0006\u0010E\u001a\u00020\u001cH\u0002¢\u0006\u0004\bG\u0010H¨\u0006V²\u0006\u000e\u0010I\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010J\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010K\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010M\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010N\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010O\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010\u001e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010P\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010Q\u001a\u0004\u0018\u00010\u001e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010R\u001a\u0004\u0018\u00010\u001e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010S\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010T\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010U\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "title", "", "isViewOnly", "Lcm2/g;", "viewState", "Lg1/y3;", "bottomSheetState", "Lorg/joda/time/DateTime;", "dateTimeNow", "Lorg/joda/time/LocalDate;", "localDateNow", "isUsing24HourTime", "Lbc3/c0;", "coroutineScope", "primaryButtonText", "secondaryButtonText", "Lkotlin/Function1;", "Lcm2/w;", "Ll83/a0;", "onAnalyticsEvent", "Lkotlin/Function0;", "onCloseClicked", "Lbm2/f0;", "onPrimaryButtonClick", "onSecondaryButtonClicked", "F", "(Ljava/lang/String;ZLcm2/g;Lg1/y3;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDate;ZLbc3/c0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "Lorg/joda/time/LocalDateTime;", "localDateTime", "", "weightDouble", "bodyFatPercent", "leanBodyMassDouble", "Lcm2/j;", "metricType", "a1", "(Lorg/joda/time/LocalDateTime;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcm2/j;)Lbm2/f0;", "value", "N0", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "dateTime", "V0", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z", "", "b1", "(Lcm2/j;)I", "W0", "(Lcm2/j;D)Z", "bodyFat", "Landroid/icu/text/NumberFormat;", "numberFormat", "R0", "(Ljava/lang/Double;Landroid/icu/text/NumberFormat;)Ljava/lang/String;", "today", "S0", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "T0", "(Lorg/joda/time/LocalDateTime;ZLjava/util/Locale;)Ljava/lang/String;", "lbs", "Y0", "(D)D", "kg", "X0", "decimals", "Z0", "(DI)D", "currentDate", "Ll83/q;", "U0", "(Lorg/joda/time/LocalDateTime;)Ll83/q;", "showReplaceDialog", "isTimeExpanded", "formattedDateDisplay", "formattedTimeDisplay", "weightText", "bodyFatText", "leanBodyMassText", "errorLeanBodyMass", "derivedBodyFatPercent", "derivedLeanBodyMassDouble", "manualMeasurementResult", "errorTimePicker", "hasTriggeredAnalytics", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3436e0 {

    /* JADX INFO: renamed from: bm2.e0$a */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.ManualMeasurementBottomSheetKt$ManualMeasurementBottomSheet$2$1", m100430f = "ManualMeasurementBottomSheet.kt", m100431l = {227}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f13450x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f13451y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f13452z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13450x = c15199y3;
            this.f13451y = function1;
            this.f13452z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f13450x, this.f13451y, this.f13452z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13449w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f13450x;
                this.f13449w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (this.f13450x.m43221b() == EnumC15209z3.f57107x && !AbstractC3436e0.m10002m0(this.f13452z)) {
                AbstractC3436e0.m10004n0(this.f13452z, true);
                this.f13451y.invoke(AbstractC4835w.c.f19917a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm2.e0$b */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.ManualMeasurementBottomSheetKt$ManualMeasurementBottomSheet$3$1$1", m100430f = "ManualMeasurementBottomSheet.kt", m100431l = {245}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13453w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f13454x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f13455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13454x = c15199y3;
            this.f13455y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f13454x, this.f13455y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13453w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f13454x;
                this.f13453w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f13455y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm2.e0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13456a;

        static {
            int[] iArr = new int[EnumC4822j.values().length];
            try {
                iArr[EnumC4822j.KG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4822j.LBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13456a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m9924A0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Double d3) {
        if (d3 != null) {
            d3 = Double.valueOf(AbstractC12889b.m36282l(d3.doubleValue() / 100.0d, 0.0d, 1.0d));
        }
        m9961T(interfaceC28601c1, d3);
        Double dM9986e0 = m9986e0(interfaceC28670t2);
        if (dM9986e0 != null) {
            double dDoubleValue = dM9986e0.doubleValue();
            m9971Y(interfaceC28601c2, Double.valueOf(dDoubleValue));
            m9965V(interfaceC28601c3, numberFormat.format(dDoubleValue));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m9926B0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m9928C0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, String text) {
        AbstractC22676k.m65750j(text, "text");
        m9965V(interfaceC28601c1, text);
        if (text.equals("")) {
            m9961T(interfaceC28601c2, null);
            m9957R(interfaceC28601c3, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m9930D0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Double d3) {
        m9971Y(interfaceC28601c1, d3);
        Double dM9982c0 = m9982c0(interfaceC28670t2);
        if (dM9982c0 != null) {
            double dDoubleValue = dM9982c0.doubleValue();
            m9961T(interfaceC28601c2, Double.valueOf(dDoubleValue));
            Double dValueOf = Double.valueOf(dDoubleValue);
            AbstractC22676k.m65747g(numberFormat);
            m9957R(interfaceC28601c3, m9958R0(dValueOf, numberFormat));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m9932E0(InterfaceC28670t2 interfaceC28670t2, C4819g c4819g, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        C3439f0 c3439f0M9994i0 = m9994i0(interfaceC28670t2);
        if (c3439f0M9994i0 != null) {
            if (c4819g.getReplaceDialog() == null) {
                function1.invoke(c3439f0M9994i0);
            } else {
                m9967W(interfaceC28601c1, true);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m9933F(final String title, final boolean z4, final C4819g viewState, final C15199y3 bottomSheetState, final DateTime dateTimeNow, final LocalDate localDateNow, final boolean z13, final InterfaceC2994c0 coroutineScope, final String str, final String str2, Function1 function1, final InterfaceC4339a onCloseClicked, final Function1 onPrimaryButtonClick, final InterfaceC4339a onSecondaryButtonClicked, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        C28655q c28655q;
        Function1 function2;
        final Function1 function3;
        Function1 function4;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        Function1 function5;
        boolean z14;
        String str3;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        AbstractC22676k.m65750j(dateTimeNow, "dateTimeNow");
        AbstractC22676k.m65750j(localDateNow, "localDateNow");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(onCloseClicked, "onCloseClicked");
        AbstractC22676k.m65750j(onPrimaryButtonClick, "onPrimaryButtonClick");
        AbstractC22676k.m65750j(onSecondaryButtonClicked, "onSecondaryButtonClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(754014827);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(title) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87157i(viewState) ? 256 : 128;
        }
        int i18 = i13 & 3072;
        int i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i18 == 0) {
            i16 |= (i13 & 4096) == 0 ? c28655q2.m87153g(bottomSheetState) : c28655q2.m87157i(bottomSheetState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q2.m87157i(dateTimeNow) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q2.m87157i(localDateNow) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= c28655q2.m87155h(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i16 |= c28655q2.m87157i(coroutineScope) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q2.m87153g(str) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= c28655q2.m87153g(str2) ? 536870912 : 268435456;
        }
        int i24 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i24 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q2.m87157i(function1) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87157i(onCloseClicked) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87157i(onPrimaryButtonClick) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87157i(onSecondaryButtonClicked)) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i17 |= i19;
        }
        int i25 = i17;
        if (c28655q2.m87135U(i16 & 1, ((i16 & 306783379) == 306783378 && (i25 & 1171) == 1170) ? false : true)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2783a(24);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function1;
            }
            final NumberFormat numberInstance = NumberFormat.getNumberInstance();
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Locale locale = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            AbstractC22676k.m65747g(locale);
            Locale localeM85323b = AbstractC28193q0.m85323b(locale);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62224C2, c28655q2, 0);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(viewState.getInitialDateTime());
                c28655q2.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87264r(new C3718c(localDateNow, strM21273g, interfaceC28601c5, 16));
                c28655q2.m87172p0(objM87133R5);
            }
            final InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
            Object objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87264r(new C3433d0(z13, localeM85323b, interfaceC28601c5, 0));
                c28655q2.m87172p0(objM87133R6);
            }
            final InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R6;
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Double.valueOf(m9974Z0(viewState.getWeight(), 1)));
                c28655q2.m87172p0(objM87133R7);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
            Object objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(String.valueOf(viewState.getWeight()));
                c28655q2.m87172p0(objM87133R8);
            }
            final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R8;
            Object objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                Double dM15210a = viewState.getBodyFat();
                AbstractC22676k.m65747g(numberInstance);
                objM87133R9 = AbstractC28683x.m87272z(m9958R0(dM15210a, numberInstance));
                c28655q2.m87172p0(objM87133R9);
            }
            final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R9;
            Object objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z(viewState.getBodyFat());
                c28655q2.m87172p0(objM87133R10);
            }
            final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R10;
            Object objM87133R11 = c28655q2.m87133R();
            if (objM87133R11 == c28676v0) {
                Double dM15214e = viewState.getLeanBodyMass();
                if (dM15214e != null) {
                    double dDoubleValue = dM15214e.doubleValue();
                    z14 = true;
                    str3 = numberInstance.format(m9974Z0(dDoubleValue, 1));
                } else {
                    z14 = true;
                    str3 = null;
                }
                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(str3);
                c28655q2.m87172p0(c28633k1M87272z);
                objM87133R11 = c28633k1M87272z;
            }
            final InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R11;
            Object objM87133R12 = c28655q2.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = AbstractC28683x.m87272z(viewState.getLeanBodyMass());
                c28655q2.m87172p0(objM87133R12);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R12;
            Object objM87133R13 = c28655q2.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = AbstractC28683x.m87264r(new C3718c(interfaceC28601c10, (InterfaceC28670t2) interfaceC28601c11, (Object) interfaceC28601c6, 17));
                c28655q2.m87172p0(objM87133R13);
            }
            final InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R13;
            Object objM87133R14 = c28655q2.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = AbstractC28683x.m87264r(new C3718c(interfaceC28601c6, (InterfaceC28670t2) interfaceC28601c11, (Object) interfaceC28670t4, 18));
                c28655q2.m87172p0(objM87133R14);
            }
            final InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R14;
            Object objM87133R15 = c28655q2.m87133R();
            if (objM87133R15 == c28676v0) {
                objM87133R15 = AbstractC28683x.m87264r(new C3472s(0, interfaceC28601c9, interfaceC28601c6));
                c28655q2.m87172p0(objM87133R15);
            }
            final InterfaceC28670t2 interfaceC28670t6 = (InterfaceC28670t2) objM87133R15;
            Object objM87133R16 = c28655q2.m87133R();
            if (objM87133R16 == c28676v0) {
                objM87133R16 = AbstractC28683x.m87272z(viewState.getMetricType());
                c28655q2.m87172p0(objM87133R16);
            }
            final InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R16;
            final String strM21273g2 = AbstractC8693b.m21273g(m9980b1(m9988f0(interfaceC28601c12)), c28655q2, 0);
            final TextResource textResourceM21278l = AbstractC8693b.m21278l(strM21273g2);
            Object objM87133R17 = c28655q2.m87133R();
            if (objM87133R17 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c11;
                interfaceC28601c2 = interfaceC28601c6;
                objM87133R17 = AbstractC28683x.m87264r(new C3474t(interfaceC28601c5, interfaceC28601c2, interfaceC28601c9, interfaceC28601c1, interfaceC28601c12, 0));
                c28655q2.m87172p0(objM87133R17);
            } else {
                interfaceC28601c1 = interfaceC28601c11;
                interfaceC28601c2 = interfaceC28601c6;
            }
            final InterfaceC28670t2 interfaceC28670t7 = (InterfaceC28670t2) objM87133R17;
            final Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            C23471q c23471qM9964U0 = m9964U0(viewState.getInitialDateTime());
            int iIntValue = ((Number) c23471qM9964U0.f92947w).intValue();
            int iIntValue2 = ((Number) c23471qM9964U0.f92948x).intValue();
            int iIntValue3 = ((Number) c23471qM9964U0.f92949y).intValue();
            calendar.set(iIntValue, iIntValue2, iIntValue3);
            Object objM87133R18 = c28655q2.m87133R();
            if (objM87133R18 == c28676v0) {
                objM87133R18 = AbstractC28683x.m87264r(new C17820i(26, dateTimeNow, interfaceC28601c5));
                c28655q2.m87172p0(objM87133R18);
            }
            final InterfaceC28670t2 interfaceC28670t8 = (InterfaceC28670t2) objM87133R18;
            int i26 = AbstractC32707b.f135973a;
            boolean zM87157i = c28655q2.m87157i(calendar);
            Object objM87133R19 = c28655q2.m87133R();
            if (zM87157i || objM87133R19 == c28676v0) {
                objM87133R19 = new DatePickerDialog.OnDateSetListener() { // from class: bm2.u
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i27, int i28, int i29) {
                        AbstractC3436e0.m10000l0(calendar, interfaceC28601c5, datePicker, i27, i28, i29);
                    }
                };
                c28655q2.m87172p0(objM87133R19);
            }
            final DatePickerDialog datePickerDialog = new DatePickerDialog(context, i26, (DatePickerDialog.OnDateSetListener) objM87133R19, iIntValue, iIntValue2, iIntValue3);
            DatePicker datePicker = datePickerDialog.getDatePicker();
            datePicker.setMinDate(viewState.getStartDate().getTime());
            datePicker.setMaxDate(calendar2.getTime().getTime());
            Function1 function6 = function4;
            final EnumC4822j[] enumC4822jArrValues = EnumC4822j.values();
            Object objM87133R20 = c28655q2.m87133R();
            if (objM87133R20 == c28676v0) {
                objM87133R20 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R20);
            }
            InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R20;
            EnumC15209z3 enumC15209z3M43221b = bottomSheetState.m43221b();
            int i27 = i16 & 7168;
            boolean z15 = (i27 == 2048 || ((i16 & 4096) != 0 && c28655q2.m87157i(bottomSheetState))) | ((i25 & 14) == 4);
            Object objM87133R21 = c28655q2.m87133R();
            if (z15 || objM87133R21 == c28676v0) {
                function5 = function6;
                objM87133R21 = new a(bottomSheetState, function5, interfaceC28601c13, null);
                c28655q2.m87172p0(objM87133R21);
            } else {
                function5 = function6;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R21, enumC15209z3M43221b);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1136a.m3599a(C2314t.f9131w, "ManualMeasurementBottomSheetTag"));
            C35666g c35666g = new C35666g(AbstractC8693b.m21278l(title), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(bottomSheetState);
            C33252i c33252i = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
            boolean zM87157i2 = (i27 == 2048 || ((i16 & 4096) != 0 && c28655q2.m87157i(bottomSheetState))) | c28655q2.m87157i(coroutineScope) | ((i25 & 112) == 32);
            Object objM87133R22 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R22 == c28676v0) {
                objM87133R22 = new C3478v(coroutineScope, bottomSheetState, onCloseClicked, 0);
                c28655q2.m87172p0(objM87133R22);
            }
            Function1 function7 = function5;
            c28655q = c28655q2;
            final InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c2;
            final InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c1;
            function2 = onPrimaryButtonClick;
            AbstractC35660d.m112871m(modifierM66724m, c35666g, aVar, null, (InterfaceC4339a) objM87133R22, null, c33252i, AbstractC37817c.m121344e(-1836953063, c28655q, new Function3() { // from class: bm2.z
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue4 = ((Integer) obj3).intValue();
                    return AbstractC3436e0.m10010q0(viewState, z13, z4, str, strM21273g2, str2, datePickerDialog, interfaceC28670t2, interfaceC28670t3, interfaceC28601c4, interfaceC28601c5, numberInstance, interfaceC28601c7, interfaceC28601c15, interfaceC28601c10, interfaceC28601c14, interfaceC28670t6, enumC4822jArrValues, interfaceC28601c12, textResourceM21278l, interfaceC28601c8, interfaceC28601c9, interfaceC28670t4, interfaceC28670t5, onPrimaryButtonClick, interfaceC28670t8, interfaceC28670t7, interfaceC28601c3, onSecondaryButtonClicked, (InterfaceC23013y) obj, (Composer) obj2, iIntValue4);
                }
            }), true, null, null, null, false, null, C3423a.f13399a.m9895b(), c28655q, (C35666g.f151591h << 3) | 113246208 | (AbstractC35664f.a.f151587c << 6), 24576, 15912);
            if (m9953P(interfaceC28601c3)) {
                c28655q.m87150e0(-1240550641);
                C4826n c4826nM15216g = viewState.getReplaceDialog();
                if (c4826nM15216g == null) {
                    c28655q.m87150e0(197635794);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(197635795);
                    TextResource textResourceM15243e = c4826nM15216g.getTitle();
                    TextResource textResourceM15239a = c4826nM15216g.getDescription();
                    TextResource textResourceM15240b = c4826nM15216g.getPrimaryButtonTitle();
                    EnumC39333f enumC39333f = EnumC39333f.RECOVERY;
                    TextResource textResourceM15241c = c4826nM15216g.getSecondaryButtonTitle();
                    Object objM87133R23 = c28655q.m87133R();
                    if (objM87133R23 == c28676v0) {
                        objM87133R23 = new C3464o(3, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R23);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R23;
                    boolean z16 = (i25 & 896) == 256;
                    Object objM87133R24 = c28655q.m87133R();
                    if (z16 || objM87133R24 == c28676v0) {
                        objM87133R24 = new C3718c(interfaceC28601c3, interfaceC28670t7, (Object) function2, 15);
                        c28655q.m87172p0(objM87133R24);
                    }
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(-1698474560, c28655q, new C0084d(c4826nM15216g, strM21273g2, interfaceC28601c7, 5));
                    int i28 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM15243e, textResourceM15239a, textResourceM15240b, false, enumC39333f, null, null, null, textResourceM15241c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R24, null, c37816bM121344e, null, c28655q, (i28 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i28 << 6) | (i28 << 9) | (i28 << 27), 0, 1573248, 180354513);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(199613719);
                c28655q.m87173q(false);
            }
            function3 = function7;
        } else {
            c28655q = c28655q2;
            function2 = onPrimaryButtonClick;
            c28655q.m87138X();
            function3 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Function1 function8 = function2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bm2.c0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue4 = ((Integer) obj2).intValue();
                    return AbstractC3436e0.m9942J0(title, z4, viewState, bottomSheetState, dateTimeNow, localDateNow, z13, coroutineScope, str, str2, function3, onCloseClicked, function8, onSecondaryButtonClicked, i13, i14, i15, (Composer) obj, iIntValue4);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m9934F0(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m9935G(AbstractC4835w it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m9936G0(InterfaceC28601c1 interfaceC28601c1) {
        m9967W(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m9937H(LocalDate localDate, String str, InterfaceC28601c1 interfaceC28601c1) {
        return m9960S0(m9946L0(interfaceC28601c1), localDate, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m9938H0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, Function1 function1) {
        m9967W(interfaceC28601c1, false);
        C3439f0 c3439f0M9994i0 = m9994i0(interfaceC28670t2);
        if (c3439f0M9994i0 != null) {
            function1.invoke(c3439f0M9994i0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final String m9939I(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m9940I0(C4826n c4826n, String str, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c4826n.getStartingWeight(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8406D = c38072d.m121952e(c28655q, i14).getN7();
            long jM125382b1 = c38072d.m121949b(c28655q, i14).getWhite50();
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8406D, null, c28655q, 0, i15, 196602);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 6), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, i14).getWhite30(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC18489d0.m53370k(m9949N(interfaceC28601c1), " ", str), null, c38072d.m121949b(c28655q, i14).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN7(), null, c28655q, 0, i15, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final String m9941J(boolean z4, Locale locale, InterfaceC28601c1 interfaceC28601c1) {
        return m9962T0(m9946L0(interfaceC28601c1), z4, locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m9942J0(String str, boolean z4, C4819g c4819g, C15199y3 c15199y3, DateTime dateTime, LocalDate localDate, boolean z13, InterfaceC2994c0 interfaceC2994c0, String str2, String str3, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, InterfaceC4339a interfaceC4339a2, int i13, int i14, int i15, Composer composer, int i16) {
        m9933F(str, z4, c4819g, c15199y3, dateTime, localDate, z13, interfaceC2994c0, str2, str3, function1, interfaceC4339a, function2, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final String m9943K(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: K0 */
    private static final void m9944K0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: L */
    private static final Double m9945L(InterfaceC28601c1 interfaceC28601c1) {
        return (Double) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: L0 */
    private static final LocalDateTime m9946L0(InterfaceC28601c1 interfaceC28601c1) {
        return (LocalDateTime) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final void m9947M(InterfaceC28601c1 interfaceC28601c1, Double d3) {
        interfaceC28601c1.setValue(d3);
    }

    /* JADX INFO: renamed from: M0 */
    private static final void m9948M0(InterfaceC28601c1 interfaceC28601c1, LocalDateTime localDateTime) {
        interfaceC28601c1.setValue(localDateTime);
    }

    /* JADX INFO: renamed from: N */
    private static final String m9949N(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: N0 */
    private static final void m9950N0(String str, String str2, Composer composer, int i13) {
        int i14;
        String str3;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-235377527);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i16).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, i15 & 14, i17, 196602);
            str3 = str2;
            AbstractC30795n.m94707h(str3, null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getN7(), null, c28655q2, (i15 >> 3) & 14, i17, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            str3 = str2;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3427b0(str, str3, i13, 0);
        }
    }

    /* JADX INFO: renamed from: O */
    private static final void m9951O(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m9952O0(String str, String str2, int i13, Composer composer, int i14) {
        m9950N0(str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m9953P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final String m9955Q(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: R */
    private static final void m9957R(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: R0 */
    private static final String m9958R0(Double d3, NumberFormat numberFormat) {
        if (d3 != null) {
            return numberFormat.format(m9974Z0(d3.doubleValue() * ((double) 100), 2));
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    private static final Double m9959S(InterfaceC28601c1 interfaceC28601c1) {
        return (Double) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    private static final String m9960S0(LocalDateTime localDateTime, LocalDate localDate, String str) {
        if (AbstractC22676k.m65745e(localDateTime.toLocalDate(), localDate)) {
            return str;
        }
        String string = localDateTime.toString("MMM dd, yyyy");
        AbstractC22676k.m65747g(string);
        return string;
    }

    /* JADX INFO: renamed from: T */
    private static final void m9961T(InterfaceC28601c1 interfaceC28601c1, Double d3) {
        interfaceC28601c1.setValue(d3);
    }

    /* JADX INFO: renamed from: T0 */
    private static final String m9962T0(LocalDateTime localDateTime, boolean z4, Locale locale) {
        if (!z4) {
            String strPrint = C28204u.INSTANCE.m85367j().withLocale(locale).print(localDateTime);
            AbstractC22676k.m65749i(strPrint, "print(...)");
            String upperCase = strPrint.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        String str = localDateTime.getHourOfDay() + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateTime.getMinuteOfHour())}, 1));
        AbstractC22676k.m65747g(str);
        return str;
    }

    /* JADX INFO: renamed from: U */
    private static final String m9963U(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    private static final C23471q m9964U0(LocalDateTime localDateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(localDateTime.toDate());
        return new C23471q(Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2)), Integer.valueOf(calendar.get(5)));
    }

    /* JADX INFO: renamed from: V */
    private static final void m9965V(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: V0 */
    private static final boolean m9966V0(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return JodaTimeUtilKt.millis(localDateTime) <= JodaTimeUtilKt.millis(localDateTime2) + ((long) DateTimeConstants.MILLIS_PER_MINUTE);
    }

    /* JADX INFO: renamed from: W */
    private static final void m9967W(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: W0 */
    private static final boolean m9968W0(EnumC4822j enumC4822j, double d3) {
        if (enumC4822j == EnumC4822j.LBS) {
            return 50.0d <= d3 && d3 <= 450.0d;
        }
        return 23.0d <= d3 && d3 <= 204.0d;
    }

    /* JADX INFO: renamed from: X */
    private static final Double m9969X(InterfaceC28601c1 interfaceC28601c1) {
        return (Double) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    public static final double m9970X0(double d3) {
        return m9974Z0(AbstractC28177l.m85292b((float) d3), 2);
    }

    /* JADX INFO: renamed from: Y */
    private static final void m9971Y(InterfaceC28601c1 interfaceC28601c1, Double d3) {
        interfaceC28601c1.setValue(d3);
    }

    /* JADX INFO: renamed from: Y0 */
    public static final double m9972Y0(double d3) {
        return m9974Z0(AbstractC28177l.m85293c((float) d3), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final boolean m9973Z(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        String strM9963U = m9963U(interfaceC28601c1);
        if ((strM9963U != null ? strM9963U.length() : 0) > 0 && m9969X(interfaceC28601c2) == null) {
            return true;
        }
        Double dM9969X = m9969X(interfaceC28601c2);
        double dDoubleValue = dM9969X != null ? dM9969X.doubleValue() : 0.0d;
        Double dM9945L = m9945L(interfaceC28601c3);
        return dDoubleValue > (dM9945L != null ? dM9945L.doubleValue() : 0.0d);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final double m9974Z0(double d3, int i13) {
        if (Double.isNaN(d3)) {
            return d3;
        }
        double dPow = Math.pow(10.0d, i13);
        return ((double) AbstractC12889b.m36257W(d3 * dPow)) / dPow;
    }

    /* JADX INFO: renamed from: a0 */
    private static final boolean m9976a0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: a1 */
    private static final C3439f0 m9977a1(LocalDateTime localDateTime, Double d3, Double d14, Double d15, EnumC4822j enumC4822j) {
        if (d3 == null) {
            return null;
        }
        double dDoubleValue = d3.doubleValue();
        boolean zM9968W0 = m9968W0(enumC4822j, dDoubleValue);
        DateTime dateTime = localDateTime.toDateTime(DateTimeZone.getDefault());
        if (!zM9968W0) {
            return null;
        }
        AbstractC22676k.m65747g(dateTime);
        return new C3439f0(dateTime, dDoubleValue, d14, d15, enumC4822j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final Double m9979b0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2) {
        Double dM9945L = m9945L(interfaceC28601c1);
        if (dM9945L != null) {
            double dDoubleValue = dM9945L.doubleValue();
            Double dM9969X = m9969X(interfaceC28601c2);
            if (dM9969X != null) {
                double dDoubleValue2 = dM9969X.doubleValue();
                if (!m9976a0(interfaceC28670t2)) {
                    return Double.valueOf(m9974Z0((dDoubleValue - dDoubleValue2) / dDoubleValue, 3));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b1 */
    public static final int m9980b1(EnumC4822j enumC4822j) {
        AbstractC22676k.m65750j(enumC4822j, "<this>");
        int i13 = c.f13456a[enumC4822j.ordinal()];
        if (i13 == 1) {
            return AbstractC16277f.f62273Q0;
        }
        if (i13 == 2) {
            return AbstractC16277f.f62247I1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c0 */
    private static final Double m9982c0(InterfaceC28670t2 interfaceC28670t2) {
        return (Double) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final Double m9984d0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        Double dM9945L;
        Double dM9959S = m9959S(interfaceC28601c1);
        if (dM9959S != null) {
            double dDoubleValue = dM9959S.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d && (dM9945L = m9945L(interfaceC28601c2)) != null) {
                double dDoubleValue2 = dM9945L.doubleValue();
                return Double.valueOf(dDoubleValue2 - m9974Z0(dDoubleValue * dDoubleValue2, 1));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    private static final Double m9986e0(InterfaceC28670t2 interfaceC28670t2) {
        return (Double) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    private static final EnumC4822j m9988f0(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC4822j) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m9990g0(InterfaceC28601c1 interfaceC28601c1, EnumC4822j enumC4822j) {
        interfaceC28601c1.setValue(enumC4822j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C3439f0 m9992h0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
        return m9977a1(m9946L0(interfaceC28601c1), m9945L(interfaceC28601c2), m9959S(interfaceC28601c3), m9969X(interfaceC28601c4), m9988f0(interfaceC28601c5));
    }

    /* JADX INFO: renamed from: i0 */
    private static final C3439f0 m9994i0(InterfaceC28670t2 interfaceC28670t2) {
        return (C3439f0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m9996j0(DateTime dateTime, InterfaceC28601c1 interfaceC28601c1) {
        LocalDateTime localDateTimeM9946L0 = m9946L0(interfaceC28601c1);
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        AbstractC22676k.m65749i(localDateTime, "toLocalDateTime(...)");
        return !m9966V0(localDateTimeM9946L0, localDateTime);
    }

    /* JADX INFO: renamed from: k0 */
    private static final boolean m9998k0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m10000l0(Calendar calendar, InterfaceC28601c1 interfaceC28601c1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        m9948M0(interfaceC28601c1, new LocalDateTime(calendar.get(1), calendar.get(2) + 1, calendar.get(5), m9946L0(interfaceC28601c1).hourOfDay().get(), m9946L0(interfaceC28601c1).minuteOfHour().get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m10002m0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m10004n0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: o0 */
    private static final boolean m10006o0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m10008p0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC4339a interfaceC4339a) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c15199y3, interfaceC4339a, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:131:0x0732  */
    /* JADX WARN: Code duplicated, block: B:132:0x0736  */
    /* JADX WARN: Code duplicated, block: B:137:0x0757  */
    /* JADX WARN: Code duplicated, block: B:140:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x089a  */
    /* JADX WARN: Code duplicated, block: B:156:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:157:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:161:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:165:0x0922  */
    /* JADX WARN: Code duplicated, block: B:168:0x092c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0938  */
    /* JADX WARN: Code duplicated, block: B:177:0x096f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0984  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36, types: [boolean, int] */
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
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m10010q0(C4819g c4819g, boolean z4, boolean z13, String str, String str2, String str3, DatePickerDialog datePickerDialog, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c3, final InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, final InterfaceC28601c1 interfaceC28601c6, final InterfaceC28670t2 interfaceC28670t4, EnumC4822j[] enumC4822jArr, InterfaceC28601c1 interfaceC28601c7, TextResource textResource, final InterfaceC28601c1 interfaceC28601c8, final InterfaceC28601c1 interfaceC28601c9, InterfaceC28670t2 interfaceC28670t5, final InterfaceC28670t2 interfaceC28670t6, Function1 function1, InterfaceC28670t2 interfaceC28670t7, InterfaceC28670t2 interfaceC28670t8, InterfaceC28601c1 interfaceC28601c10, InterfaceC4339a interfaceC4339a, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        C0213j c0213j;
        Object obj;
        C28655q c28655q;
        String str4;
        C28655q c28655q2;
        Object obj2;
        float f13;
        C2314t c2314t;
        String str5;
        String strM53370k;
        boolean z14;
        C28655q c28655q3;
        InterfaceC28601c1 interfaceC28601c11;
        final InterfaceC28601c1 interfaceC28601c12;
        Object obj3;
        C2314t c2314t2;
        final NumberFormat numberFormat2;
        Object obj4;
        Object obj5;
        int i14;
        final InterfaceC28601c1 interfaceC28601c13;
        final InterfaceC28601c1 interfaceC28601c14;
        int iHashCode;
        C0213j c0213j2;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        Object obj6;
        Object objM87133R5;
        final InterfaceC28601c1 interfaceC28601c15;
        Object obj7;
        boolean zM87157i2;
        Object objM87133R6;
        C28655q c28655q4;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R7;
        boolean z16;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q5 = (C28655q) composer;
        if (c28655q5.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t3));
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j3);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N);
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t3, "ManualMeasurementColumnTag")), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
            int iHashCode3 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM92116f0);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c0213j = c0213j3;
                c28655q5.m87163l(c0213j);
            } else {
                c0213j = c0213j3;
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N2);
            float f14 = 4;
            float f15 = 2 * f14;
            AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f15, c2314t3));
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC32706a.f135955i);
            int i15 = TextResource.C8688b.f25889c << 9;
            C0213j c0213j4 = c0213j;
            AbstractC17755i2.m50938j(null, null, null, c8688bM21277k, null, 0L, 0L, null, c28655q5, i15, 247);
            float f16 = f14 * f14;
            AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(f16, c2314t3));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q5, 54);
            int iHashCode4 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3409f);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j4);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N3);
            String strM21273g = AbstractC8693b.m21273g(AbstractC32706a.f135951e, c28655q5, 0);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q5, i16).getB1();
            long jM125430y = c38072d.m121949b(c28655q5, i16).getBrandWhite();
            int i17 = C2886a.f11498d;
            int i18 = i17 << 18;
            AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q5, 0, i18, 196602);
            Object obj8 = C28635l.f115821a;
            if (z13) {
                obj = obj8;
                c28655q5.m87150e0(458566767);
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(m9939I(interfaceC28670t2), c28655q5, 0), null, c38072d.m121949b(c28655q5, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i16).getN7(), null, c28655q5, 0, i18, 196602);
                c28655q = c28655q5;
                c28655q.m87173q(false);
            } else {
                c28655q5.m87150e0(458054337);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode5 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, c2314t3);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j4);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q5, iHashCode5, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N4);
                String strM9939I = m9939I(interfaceC28670t2);
                AbstractC27285v0.c cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                boolean zM87157i4 = c28655q5.m87157i(datePickerDialog);
                Object objM87133R8 = c28655q5.m87133R();
                if (zM87157i4 || objM87133R8 == obj8) {
                    objM87133R8 = new C3480w(datePickerDialog, 0);
                    c28655q5.m87172p0(objM87133R8);
                }
                obj = obj8;
                AbstractC27283u0.m82318q(null, strM9939I, null, null, cVar, false, false, 0.0f, null, (InterfaceC4339a) objM87133R8, c28655q5, (AbstractC27285v0.c.f109206f << 12) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 461);
                c28655q = c28655q5;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            AbstractC17176i.m48516r(c28655q, true, c2314t3, f16, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j4);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            C28655q c28655q6 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC32706a.f135953g, c28655q, 0), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q6, 0, i18, 196602);
            if (z13) {
                str4 = null;
                c28655q6.m87150e0(1159856248);
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(m9943K(interfaceC28670t3), c28655q6, 0), null, c38072d.m121949b(c28655q6, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q6, i16).getN7(), null, c28655q6, 0, i18, 196602);
                c28655q2 = c28655q6;
                c28655q2.m87173q(false);
            } else {
                c28655q6.m87150e0(1159414932);
                String strM9943K = m9943K(interfaceC28670t3);
                AbstractC27285v0.c cVar2 = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                boolean zM10006o0 = m10006o0(interfaceC28601c1);
                Object objM87133R9 = c28655q6.m87133R();
                if (objM87133R9 == obj) {
                    objM87133R9 = new C3464o(2, interfaceC28601c1);
                    c28655q6.m87172p0(objM87133R9);
                }
                AbstractC27283u0.m82318q(null, strM9943K, null, null, cVar2, zM10006o0, false, 0.0f, null, (InterfaceC4339a) objM87133R9, c28655q6, (AbstractC27285v0.c.f109206f << 12) | 805306368, 461);
                c28655q2 = c28655q6;
                c28655q2.m87173q(false);
                str4 = null;
            }
            c28655q2.m87173q(true);
            if (m10006o0(interfaceC28601c1)) {
                c28655q2.m87150e0(-1455863271);
                LocalTime localTime = c4819g.getInitialDateTime().toLocalTime();
                Object objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == obj) {
                    objM87133R10 = new C3456l(interfaceC28601c2, 1);
                    c28655q2.m87172p0(objM87133R10);
                }
                C28655q c28655q7 = c28655q2;
                AbstractC23332d.m67560g(null, z4, localTime, false, null, 0L, null, false, (InterfaceC4351m) objM87133R10, c28655q7, 100666368, 241);
                c28655q2 = c28655q7;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1455483955);
                c28655q2.m87173q(false);
            }
            float f17 = 6 * f14;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f17, c2314t3));
            C28655q c28655q8 = c28655q2;
            AbstractC17755i2.m50938j(null, null, null, AbstractC8693b.m21277k(AbstractC32706a.f135947a), null, 0L, 0L, null, c28655q8, i15, 247);
            C28655q c28655q9 = c28655q8;
            AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f16, c2314t3));
            if (z13) {
                obj2 = obj;
                f17 = f17;
                f13 = f14;
                ?? r14 = 0;
                c2314t = c2314t3;
                String str6 = str4;
                c28655q9.m87150e0(-1445845745);
                m9950N0(AbstractC8693b.m21273g(AbstractC32706a.f135954h, c28655q9, 0), AbstractC18489d0.m53370k(m9949N(interfaceC28601c3), " ", str2), c28655q9, 0);
                float f18 = 5 * f13;
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f18, c2314t));
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC32706a.f135950d, c28655q9, 0);
                if (m9955Q(interfaceC28601c8) == null) {
                    c28655q9.m87150e0(-1445403283);
                    c28655q9.m87173q(false);
                    str5 = str6;
                } else {
                    c28655q9.m87150e0(-1445403282);
                    str5 = m9955Q(interfaceC28601c8) + " " + AbstractC8693b.m21274h(c4819g.getBodyFatSuffix(), c28655q9, TextResource.$stable);
                    r14 = 0;
                    c28655q9.m87173q(false);
                }
                String str7 = "-";
                if (str5 == null) {
                    str5 = "-";
                }
                m9950N0(strM21273g2, str5, c28655q9, r14);
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f18, c2314t));
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC32706a.f135952f, c28655q9, r14);
                if (m9963U(interfaceC28601c5) != null && (strM53370k = AbstractC18489d0.m53370k(m9963U(interfaceC28601c5), " ", str2)) != null) {
                    str7 = strM53370k;
                }
                m9950N0(strM21273g3, str7, c28655q9, r14);
                c28655q9.m87173q(r14);
                c28655q3 = c28655q9;
                z14 = r14;
            } else {
                c28655q9.m87150e0(-1454895606);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q9, 48);
                int iHashCode7 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q9.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q9, c2314t3);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q9, c0209i3, interfaceC28653p1M87165m6);
                if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode7))) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q9, iHashCode7, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i5, modifierM118962N6);
                C23000t1 c23000t1 = C23000t1.f90727a;
                Modifier modifierM3599a = AbstractC1136a.m3599a(c23000t1.mo66772c(c2314t3, true, 1.0f), "ManualMeasurementWeightTag");
                float f19 = 3 * f14;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f19);
                TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, AbstractC8693b.m21273g(AbstractC32706a.f135954h, c28655q9, 0), "toUpperCase(...)");
                C2886a c2886aM8438s = AbstractC2890e.m8450e().getH5();
                TextResource textResourceM21278l = AbstractC8693b.m21278l(m9949N(interfaceC28601c3));
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                Object objM87133R11 = c28655q9.m87133R();
                if (objM87133R11 == obj) {
                    objM87133R11 = new C3201a(24);
                    c28655q9.m87172p0(objM87133R11);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R11;
                Object objM87133R12 = c28655q9.m87133R();
                if (objM87133R12 == obj) {
                    interfaceC28601c11 = interfaceC28601c4;
                    interfaceC28601c12 = interfaceC28601c5;
                    objM87133R12 = new C3482x(interfaceC28601c3, interfaceC28601c11, interfaceC28601c12, 1);
                    c28655q9.m87172p0(objM87133R12);
                } else {
                    interfaceC28601c11 = interfaceC28601c4;
                    interfaceC28601c12 = interfaceC28601c5;
                }
                Function1 function2 = (Function1) objM87133R12;
                boolean zM87157i5 = c28655q9.m87157i(numberFormat);
                Object objM87133R13 = c28655q9.m87133R();
                if (zM87157i5 || objM87133R13 == obj) {
                    final int i19 = 1;
                    c2314t2 = c2314t3;
                    numberFormat2 = numberFormat;
                    final InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c11;
                    obj3 = new Function1() { // from class: bm2.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i19) {
                                case 0:
                                    return AbstractC3436e0.m9930D0(interfaceC28601c6, interfaceC28670t4, numberFormat2, interfaceC28601c16, interfaceC28601c12, (Double) obj9);
                                case 1:
                                    return AbstractC3436e0.m10022w0(interfaceC28601c6, interfaceC28670t4, numberFormat2, interfaceC28601c16, interfaceC28601c12, (Double) obj9);
                                default:
                                    return AbstractC3436e0.m9924A0(interfaceC28601c6, interfaceC28670t4, numberFormat2, interfaceC28601c16, interfaceC28601c12, (Double) obj9);
                            }
                        }
                    };
                    c28655q9.m87172p0(obj3);
                } else {
                    c2314t2 = c2314t3;
                    obj3 = objM87133R13;
                    numberFormat2 = numberFormat;
                }
                Function1 function3 = (Function1) obj3;
                int i24 = TextResource.$stable;
                AbstractC30787f.m94664c(modifierM3599a, textResourceM21278l, null, textResourceM30853e, c2886aM8438s, null, null, null, textResourceM21267a, false, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e, null, null, null, null, false, interfaceC4339a2, function2, function3, c28655q9, (i24 << 3) | (i24 << 9) | (i17 << 12) | (i24 << 24), 384, 14155776, 66055908);
                C2314t c2314t4 = c2314t2;
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f15, c2314t4));
                Modifier modifierM3398t = AbstractC1099a.m3398t(c23000t1.mo66772c(c2314t4, true, 1.0f), 0.0f, 0.0f, 0.0f, ((float) 0.37d) * f14, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode8 = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q9.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q9, modifierM3398t);
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j4);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q9, c0209i3, interfaceC28653p1M87165m7);
                if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode8))) {
                    AbstractC11266d.m30471y(iHashCode8, c28655q9, iHashCode8, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q9, c0209i5, modifierM118962N7);
                c28655q9.m87150e0(162631568);
                ArrayList arrayList = new ArrayList(enumC4822jArr.length);
                for (EnumC4822j enumC4822j : enumC4822jArr) {
                    arrayList.add(new C33223u0(AbstractC8693b.m21273g(m9980b1(enumC4822j), c28655q9, 0), null, 2, false ? 1 : 0));
                }
                c28655q9.m87173q(false);
                int length = enumC4822jArr.length;
                int i25 = 0;
                while (true) {
                    if (i25 >= length) {
                        i25 = -1;
                        break;
                    }
                    if (enumC4822jArr[i25] == m9988f0(interfaceC28601c7)) {
                        break;
                    }
                    i25++;
                }
                int i26 = i25;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.125d) * 8, c2314t4);
                boolean zM87157i6 = c28655q9.m87157i(enumC4822jArr) | c28655q9.m87157i(numberFormat2);
                Object objM87133R14 = c28655q9.m87133R();
                if (zM87157i6) {
                    obj4 = obj;
                } else {
                    Object obj9 = obj;
                    if (objM87133R14 == obj9) {
                        obj4 = obj9;
                    } else {
                        interfaceC28601c14 = interfaceC28601c4;
                        interfaceC28601c13 = interfaceC28601c5;
                        obj5 = obj9;
                        i14 = 5;
                    }
                    c2314t = c2314t4;
                    AbstractC33231x0.m105420e(arrayList, i26, modifierM3394p, "ManualMeasurementUnitControlTag", (Function1) objM87133R14, c28655q9, 3456, 0);
                    c28655q9.m87173q(true);
                    c28655q9.m87173q(true);
                    f13 = f14;
                    AbstractC18489d0.m53380u(i14, f13, c2314t, c28655q9);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q9, 0);
                    iHashCode = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q9.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q9, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(c0213j2);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, C0217k.f729g, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q9, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q9, C0217k.f726d, modifierM118962N8);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(c23000t1.mo66772c(c2314t, true, 1.0f), "ManualMeasurementBodyFatTag");
                    C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f19);
                    String strM21273g4 = AbstractC8693b.m21273g(AbstractC32706a.f135950d, c28655q9, 0);
                    Locale locale = Locale.ROOT;
                    TextResource textResourceM30853e2 = AbstractC11478a.m30853e(locale, strM21273g4, "toUpperCase(...)");
                    C2886a c2886aM8438s2 = AbstractC2890e.m8450e().getH5();
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m9955Q(interfaceC28601c8));
                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                    AbstractC30784c.c cVar3 = new AbstractC30784c.c(c4819g.getBodyFatSuffix(), null, 2, false ? 1 : 0);
                    objM87133R = c28655q9.m87133R();
                    obj2 = obj5;
                    if (objM87133R == obj2) {
                        objM87133R = new C3201a(25);
                        c28655q9.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q9.m87133R();
                    if (objM87133R2 == obj2) {
                        objM87133R2 = new C3482x(interfaceC28601c8, interfaceC28601c14, interfaceC28601c13, 2);
                        c28655q9.m87172p0(objM87133R2);
                    }
                    Function1 function4 = (Function1) objM87133R2;
                    zM87157i = c28655q9.m87157i(numberFormat2);
                    objM87133R3 = c28655q9.m87133R();
                    if (zM87157i || objM87133R3 == obj2) {
                        final int i27 = 2;
                        Object obj10 = new Function1() { // from class: bm2.y
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                switch (i27) {
                                    case 0:
                                        return AbstractC3436e0.m9930D0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj11);
                                    case 1:
                                        return AbstractC3436e0.m10022w0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj11);
                                    default:
                                        return AbstractC3436e0.m9924A0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj11);
                                }
                            }
                        };
                        c28655q9.m87172p0(obj10);
                        objM87133R3 = obj10;
                    }
                    int i28 = TextResource.$stable;
                    int i29 = (i28 << 3) | (i28 << 9) | (C2886a.f11498d << 12) | (AbstractC30784c.c.f126792d << 21) | (i28 << 24);
                    AbstractC30787f.m94664c(modifierM3599a2, textResourceM21278l2, null, textResourceM30853e2, c2886aM8438s2, null, null, cVar3, textResourceM21267a2, false, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e2, null, null, null, null, false, interfaceC4339a3, function4, (Function1) objM87133R3, c28655q9, i29, 384, 14155776, 66055780);
                    AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f15, c2314t));
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(c23000t1.mo66772c(c2314t, true, 1.0f), "ManualMeasurementLeanBodyMassTag");
                    C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f19);
                    boolean zM9976a0 = m9976a0(interfaceC28670t5);
                    String upperCase = AbstractC8693b.m21273g(AbstractC32706a.f135952f, c28655q9, 0).toUpperCase(locale);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(upperCase);
                    C2886a c2886aM8438s3 = AbstractC2890e.m8450e().getH5();
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m9963U(interfaceC28601c13));
                    TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                    AbstractC30784c.c cVar4 = new AbstractC30784c.c(textResource, null, 2, false ? 1 : 0);
                    objM87133R4 = c28655q9.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj2) {
                        C3201a c3201a = new C3201a(23);
                        c28655q9.m87172p0(c3201a);
                        obj6 = c3201a;
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) obj6;
                    objM87133R5 = c28655q9.m87133R();
                    if (objM87133R5 == obj2) {
                        interfaceC28601c15 = interfaceC28601c9;
                        C3482x c3482x = new C3482x(interfaceC28601c13, interfaceC28601c15, interfaceC28601c8, 0);
                        c28655q9.m87172p0(c3482x);
                        obj7 = c3482x;
                    } else {
                        interfaceC28601c15 = interfaceC28601c9;
                        obj7 = objM87133R5;
                    }
                    Function1 function5 = (Function1) obj7;
                    zM87157i2 = c28655q9.m87157i(numberFormat2);
                    objM87133R6 = c28655q9.m87133R();
                    if (zM87157i2 || objM87133R6 == obj2) {
                        final int i34 = 0;
                        Object obj11 = new Function1() { // from class: bm2.y
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj12) {
                                switch (i34) {
                                    case 0:
                                        return AbstractC3436e0.m9930D0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj12);
                                    case 1:
                                        return AbstractC3436e0.m10022w0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj12);
                                    default:
                                        return AbstractC3436e0.m9924A0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj12);
                                }
                            }
                        };
                        c28655q9.m87172p0(obj11);
                        objM87133R6 = obj11;
                    }
                    AbstractC30787f.m94664c(modifierM3599a3, textResourceM21278l4, null, textResourceM21278l3, c2886aM8438s3, null, null, cVar4, textResourceM21267a3, zM9976a0, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e3, null, null, null, null, false, interfaceC4339a4, function5, (Function1) objM87133R6, c28655q9, i29, 384, 14155776, 66055268);
                    c28655q4 = c28655q9;
                    c28655q4.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q4);
                    if (str == null) {
                        c28655q4.m87150e0(-1446834460);
                        z16 = false;
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1446834459);
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        String strM21275i = AbstractC8693b.m21275i(str, c28655q4, 0);
                        long jM125371X = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getRecovery();
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (!m9998k0(interfaceC28670t7) || m9976a0(interfaceC28670t5) || m9994i0(interfaceC28670t8) == null) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        zM87157i3 = c28655q4.m87157i(c4819g) | c28655q4.m87153g(function1);
                        objM87133R7 = c28655q4.m87133R();
                        if (zM87157i3 || objM87133R7 == obj2) {
                            objM87133R7 = new C1012d((Object) interfaceC28670t8, (Object) c4819g, function1, (Object) interfaceC28601c10, 2);
                            c28655q4.m87172p0(objM87133R7);
                        }
                        AbstractC27282u.m82292h(modifierM3409f3, enumC27284v, strM21275i, z15, jM125371X, null, false, (InterfaceC4339a) objM87133R7, c28655q4, 54, 96);
                        z16 = false;
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(z16);
                    c28655q3 = c28655q4;
                    z14 = z16;
                }
                obj5 = obj4;
                NumberFormat numberFormat3 = numberFormat2;
                i14 = 5;
                Object c3424a0 = new C3424a0(interfaceC28601c6, enumC4822jArr, interfaceC28601c7, numberFormat3, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5);
                numberFormat2 = numberFormat3;
                interfaceC28601c14 = interfaceC28601c4;
                interfaceC28601c13 = interfaceC28601c5;
                c28655q9.m87172p0(c3424a0);
                objM87133R14 = c3424a0;
                c2314t = c2314t4;
                AbstractC33231x0.m105420e(arrayList, i26, modifierM3394p, "ManualMeasurementUnitControlTag", (Function1) objM87133R14, c28655q9, 3456, 0);
                c28655q9.m87173q(true);
                c28655q9.m87173q(true);
                f13 = f14;
                AbstractC18489d0.m53380u(i14, f13, c2314t, c28655q9);
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q9, 0);
                iHashCode = Long.hashCode(c28655q9.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q9.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q9, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q9.m87158i0();
                if (c28655q9.f115903S) {
                    c28655q9.m87163l(c0213j2);
                } else {
                    c28655q9.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q9, C0217k.f729g, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q9, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i = C0217k.f732j;
                if (c28655q9.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q9, C0217k.f726d, modifierM118962N9);
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(c23000t1.mo66772c(c2314t, true, 1.0f), "ManualMeasurementBodyFatTag");
                C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f19);
                String strM21273g5 = AbstractC8693b.m21273g(AbstractC32706a.f135950d, c28655q9, 0);
                Locale locale2 = Locale.ROOT;
                TextResource textResourceM30853e3 = AbstractC11478a.m30853e(locale2, strM21273g5, "toUpperCase(...)");
                C2886a c2886aM8438s4 = AbstractC2890e.m8450e().getH5();
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m9955Q(interfaceC28601c8));
                TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                AbstractC30784c.c cVar5 = new AbstractC30784c.c(c4819g.getBodyFatSuffix(), null, 2, false ? 1 : 0);
                objM87133R = c28655q9.m87133R();
                obj2 = obj5;
                if (objM87133R == obj2) {
                    objM87133R = new C3201a(25);
                    c28655q9.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q9.m87133R();
                if (objM87133R2 == obj2) {
                    objM87133R2 = new C3482x(interfaceC28601c8, interfaceC28601c14, interfaceC28601c13, 2);
                    c28655q9.m87172p0(objM87133R2);
                }
                Function1 function6 = (Function1) objM87133R2;
                zM87157i = c28655q9.m87157i(numberFormat2);
                objM87133R3 = c28655q9.m87133R();
                if (zM87157i) {
                    final int i210 = 2;
                    Object obj12 = new Function1() { // from class: bm2.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            switch (i210) {
                                case 0:
                                    return AbstractC3436e0.m9930D0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj13);
                                case 1:
                                    return AbstractC3436e0.m10022w0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj13);
                                default:
                                    return AbstractC3436e0.m9924A0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj13);
                            }
                        }
                    };
                    c28655q9.m87172p0(obj12);
                    objM87133R3 = obj12;
                } else {
                    final int i211 = 2;
                    Object obj13 = new Function1() { // from class: bm2.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj14) {
                            switch (i211) {
                                case 0:
                                    return AbstractC3436e0.m9930D0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj14);
                                case 1:
                                    return AbstractC3436e0.m10022w0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj14);
                                default:
                                    return AbstractC3436e0.m9924A0(interfaceC28601c9, interfaceC28670t4, numberFormat2, interfaceC28601c14, interfaceC28601c13, (Double) obj14);
                            }
                        }
                    };
                    c28655q9.m87172p0(obj13);
                    objM87133R3 = obj13;
                }
                int i212 = TextResource.$stable;
                int i213 = (i212 << 3) | (i212 << 9) | (C2886a.f11498d << 12) | (AbstractC30784c.c.f126792d << 21) | (i212 << 24);
                AbstractC30787f.m94664c(modifierM3599a4, textResourceM21278l5, null, textResourceM30853e3, c2886aM8438s4, null, null, cVar5, textResourceM21267a4, false, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e4, null, null, null, null, false, interfaceC4339a5, function6, (Function1) objM87133R3, c28655q9, i213, 384, 14155776, 66055780);
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3419p(f15, c2314t));
                Modifier modifierM3599a5 = AbstractC1136a.m3599a(c23000t1.mo66772c(c2314t, true, 1.0f), "ManualMeasurementLeanBodyMassTag");
                C33252i c33252iM105489e5 = AbstractC33253j.m105489e(f19);
                boolean zM9976a1 = m9976a0(interfaceC28670t5);
                String upperCase2 = AbstractC8693b.m21273g(AbstractC32706a.f135952f, c28655q9, 0).toUpperCase(locale2);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(upperCase2);
                C2886a c2886aM8438s5 = AbstractC2890e.m8450e().getH5();
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m9963U(interfaceC28601c13));
                TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                AbstractC30784c.c cVar6 = new AbstractC30784c.c(textResource, null, 2, false ? 1 : 0);
                objM87133R4 = c28655q9.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj2) {
                    C3201a c3201a2 = new C3201a(23);
                    c28655q9.m87172p0(c3201a2);
                    obj6 = c3201a2;
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) obj6;
                objM87133R5 = c28655q9.m87133R();
                if (objM87133R5 == obj2) {
                    interfaceC28601c15 = interfaceC28601c9;
                    C3482x c3482x2 = new C3482x(interfaceC28601c13, interfaceC28601c15, interfaceC28601c8, 0);
                    c28655q9.m87172p0(c3482x2);
                    obj7 = c3482x2;
                } else {
                    interfaceC28601c15 = interfaceC28601c9;
                    obj7 = objM87133R5;
                }
                Function1 function7 = (Function1) obj7;
                zM87157i2 = c28655q9.m87157i(numberFormat2);
                objM87133R6 = c28655q9.m87133R();
                if (zM87157i2) {
                    final int i35 = 0;
                    Object obj14 = new Function1() { // from class: bm2.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            switch (i35) {
                                case 0:
                                    return AbstractC3436e0.m9930D0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj15);
                                case 1:
                                    return AbstractC3436e0.m10022w0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj15);
                                default:
                                    return AbstractC3436e0.m9924A0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj15);
                            }
                        }
                    };
                    c28655q9.m87172p0(obj14);
                    objM87133R6 = obj14;
                } else {
                    final int i36 = 0;
                    Object obj15 = new Function1() { // from class: bm2.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj16) {
                            switch (i36) {
                                case 0:
                                    return AbstractC3436e0.m9930D0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj16);
                                case 1:
                                    return AbstractC3436e0.m10022w0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj16);
                                default:
                                    return AbstractC3436e0.m9924A0(interfaceC28601c4, interfaceC28670t6, numberFormat2, interfaceC28601c15, interfaceC28601c8, (Double) obj16);
                            }
                        }
                    };
                    c28655q9.m87172p0(obj15);
                    objM87133R6 = obj15;
                }
                AbstractC30787f.m94664c(modifierM3599a5, textResourceM21278l7, null, textResourceM21278l6, c2886aM8438s5, null, null, cVar6, textResourceM21267a5, zM9976a1, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e5, null, null, null, null, false, interfaceC4339a6, function7, (Function1) objM87133R6, c28655q9, i213, 384, 14155776, 66055268);
                c28655q4 = c28655q9;
                c28655q4.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q4);
                if (str == null) {
                    c28655q4.m87150e0(-1446834460);
                    z16 = false;
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1446834459);
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    String strM21275i2 = AbstractC8693b.m21275i(str, c28655q4, 0);
                    long jM125371X2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getRecovery();
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (m9998k0(interfaceC28670t7)) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = c28655q4.m87157i(c4819g) | c28655q4.m87153g(function1);
                    objM87133R7 = c28655q4.m87133R();
                    if (zM87157i3) {
                        objM87133R7 = new C1012d((Object) interfaceC28670t8, (Object) c4819g, function1, (Object) interfaceC28601c10, 2);
                        c28655q4.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C1012d((Object) interfaceC28670t8, (Object) c4819g, function1, (Object) interfaceC28601c10, 2);
                        c28655q4.m87172p0(objM87133R7);
                    }
                    AbstractC27282u.m82292h(modifierM3409f4, enumC27284v2, strM21275i2, z15, jM125371X2, null, false, (InterfaceC4339a) objM87133R7, c28655q4, 54, 96);
                    z16 = false;
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(z16);
                c28655q3 = c28655q4;
                z14 = z16;
            }
            if (str3 == null) {
                c28655q3.m87150e0(-1444844105);
                c28655q3.m87173q(z14);
            } else {
                c28655q3.m87150e0(-1444844104);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(3 * f13, c2314t));
                TextResource textResourceM21278l8 = AbstractC8693b.m21278l(str3);
                boolean zM87153g = c28655q3.m87153g(interfaceC4339a);
                Object objM87133R15 = c28655q3.m87133R();
                if (zM87153g || objM87133R15 == obj2) {
                    objM87133R15 = new C3429c(interfaceC4339a, 1);
                    c28655q3.m87172p0(objM87133R15);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM21278l8, null, null, false, null, null, false, false, null, null, (Function1) objM87133R15, c28655q3, TextResource.$stable << 6, 0, 4091);
                c28655q3.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
        } else {
            c28655q5.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m10012r0(DatePickerDialog datePickerDialog) {
        datePickerDialog.show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m10014s0(InterfaceC28601c1 interfaceC28601c1) {
        m9944K0(interfaceC28601c1, !m10006o0(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m10016t0(InterfaceC28601c1 interfaceC28601c1, int i13, int i14) {
        LocalDateTime localDateTimeWithMinuteOfHour = m9946L0(interfaceC28601c1).withHourOfDay(i13).withMinuteOfHour(i14);
        AbstractC22676k.m65749i(localDateTimeWithMinuteOfHour, "withMinuteOfHour(...)");
        m9948M0(interfaceC28601c1, localDateTimeWithMinuteOfHour);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m10018u0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m10020v0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, String text) {
        AbstractC22676k.m65750j(text, "text");
        m9951O(interfaceC28601c1, text);
        if (text.equals("")) {
            m9971Y(interfaceC28601c2, null);
            m9965V(interfaceC28601c3, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m10022w0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Double d3) {
        m9947M(interfaceC28601c1, d3);
        Double dM9986e0 = m9986e0(interfaceC28670t2);
        if (dM9986e0 != null) {
            double dDoubleValue = dM9986e0.doubleValue();
            m9971Y(interfaceC28601c2, Double.valueOf(dDoubleValue));
            m9965V(interfaceC28601c3, numberFormat.format(dDoubleValue));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m10024x0(InterfaceC28601c1 interfaceC28601c1, EnumC4822j[] enumC4822jArr, InterfaceC28601c1 interfaceC28601c2, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, int i13) {
        if (m9945L(interfaceC28601c1) != null) {
            EnumC4822j enumC4822jM9988f0 = m9988f0(interfaceC28601c2);
            EnumC4822j enumC4822j = enumC4822jArr[i13];
            if (enumC4822jM9988f0 != enumC4822j) {
                m9990g0(interfaceC28601c2, enumC4822j);
                if (m9988f0(interfaceC28601c2) == EnumC4822j.KG) {
                    Double dM9945L = m9945L(interfaceC28601c1);
                    if (dM9945L != null) {
                        double dM9972Y0 = m9972Y0(dM9945L.doubleValue());
                        m9947M(interfaceC28601c1, Double.valueOf(dM9972Y0));
                        String str = numberFormat.format(dM9972Y0);
                        AbstractC22676k.m65749i(str, "format(...)");
                        m9951O(interfaceC28601c3, str);
                    }
                    Double dM9969X = m9969X(interfaceC28601c4);
                    if (dM9969X != null) {
                        m9971Y(interfaceC28601c4, Double.valueOf(m9972Y0(dM9969X.doubleValue())));
                        m9965V(interfaceC28601c5, numberFormat.format(m9969X(interfaceC28601c4)));
                    }
                } else {
                    Double dM9945L2 = m9945L(interfaceC28601c1);
                    if (dM9945L2 != null) {
                        m9947M(interfaceC28601c1, Double.valueOf(m9970X0(dM9945L2.doubleValue())));
                        String str2 = numberFormat.format(m9945L(interfaceC28601c1));
                        AbstractC22676k.m65749i(str2, "format(...)");
                        m9951O(interfaceC28601c3, str2);
                    }
                    Double dM9969X2 = m9969X(interfaceC28601c4);
                    if (dM9969X2 != null) {
                        m9971Y(interfaceC28601c4, Double.valueOf(m9970X0(dM9969X2.doubleValue())));
                        m9965V(interfaceC28601c5, numberFormat.format(m9969X(interfaceC28601c4)));
                    }
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m10026y0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m10028z0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, String text) {
        AbstractC22676k.m65750j(text, "text");
        m9957R(interfaceC28601c1, text);
        if (text.equals("")) {
            m9971Y(interfaceC28601c2, null);
            m9965V(interfaceC28601c3, "");
        }
        return C23454a0.f92919a;
    }
}
