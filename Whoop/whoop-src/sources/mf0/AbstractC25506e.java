package mf0;

import a81.C0561l;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2662y3;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.edit.C9722a;
import cu2.C11135o;
import d42.C11691g;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import h00.C16527u;
import jp1.C21859k;
import js2.C21927e;
import jt1.C21937b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kk1.C22541b;
import kotlin.C2032u;
import ky2.C22892a;
import l01.C23045q;
import l41.AbstractC23332d;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m01.C24875c;
import ma0.AbstractC25370d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import ny0.EnumC27269n0;
import or2.C28204u;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimeUtilKt;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p180h0.C16416l0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23079d0;
import p292l1.AbstractC23092f1;
import p292l1.AbstractC23138n;
import p292l1.AbstractC23168s;
import p292l1.AbstractC23200x1;
import p292l1.C23067b0;
import p292l1.C23104h1;
import p292l1.C23132m;
import p292l1.C23204y;
import p292l1.InterfaceC23098g1;
import p292l1.InterfaceC23142n3;
import p315m0.AbstractC24868a;
import p354o1.AbstractC27363d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p707gt1.C16196j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import p719m22.C24958m;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30783b;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: mf0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\u001au\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!\u001aK\u0010*\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+¨\u00062²\u0006\u000e\u0010$\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010.\u001a\n -*\u0004\u0018\u00010\"0\"8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\u000e\u00100\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lmf0/g;", "viewState", "Lzr2/a;", "dateAndTimeProvider", "", "isUsing24HourTime", "Lgz0/m0;", "leftIcon", "showDatePickerByDefault", "showTimePickerByDefault", "Lkotlin/Function0;", "Ll83/a0;", "onTagClick", "Lkotlin/Function1;", "Lmf0/a;", "onViewEvent", "A", "(Landroidx/compose/ui/Modifier;Lmf0/g;Lzr2/a;ZLgz0/m0;ZZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll1/g1;", "state", "onDismiss", "onDateSelected", "i0", "(Ll1/g1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ll1/y;", "q0", "(Landroidx/compose/runtime/Composer;I)Ll1/y;", "Lorg/joda/time/LocalDateTime;", "dateTime", "dateTimeNow", "r0", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z", "", "testNameField", "isDateSelected", "isTimeSelected", "errorTimePicker", "originalName", "originalDateTime", "currentDateTime", "s0", "(Ljava/lang/String;ZZZLjava/lang/String;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z", "localDateTime", "kotlin.jvm.PlatformType", "formattedDateDisplay", "formattedTimeDisplay", "showDatePickerDialog", "isSubmitEnabled", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25506e {

    /* JADX INFO: renamed from: mf0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.components.testinputcontent.TestInputContentKt$TestInputContent$5$1$1", m100430f = "TestInputContent.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f99877x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99877x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f99877x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99876w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f99877x;
                this.f99876w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mf0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.components.testinputcontent.TestInputContentKt$TestInputContent$6$1$1$1", m100430f = "TestInputContent.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99878w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f99879x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99879x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f99879x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99878w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f99879x;
                this.f99878w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mf0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.components.testinputcontent.TestInputContentKt$TestInputContent$7$1$2$4$1$1", m100430f = "TestInputContent.kt", m100431l = {282}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99880w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f99881x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99881x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f99881x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99880w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f99881x;
                this.f99880w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mf0.e$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"mf0/e$d", "Ll1/n3;", "", "utcTimeMillis", "", "isSelectableDate", "(J)Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC23142n3 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC41070a f99882a;

        public d(InterfaceC41070a interfaceC41070a) {
            this.f99882a = interfaceC41070a;
        }

        @Override // p292l1.InterfaceC23142n3
        public boolean isSelectableDate(long utcTimeMillis) {
            return utcTimeMillis <= this.f99882a.mo133363b();
        }

        @Override // p292l1.InterfaceC23142n3
        public /* bridge */ boolean isSelectableYear(int i13) {
            return true;
        }
    }

    /* JADX INFO: renamed from: mf0.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f99883w = new e();

        /* JADX INFO: renamed from: a */
        public final long m74981a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m74981a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x019f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01de  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:146:0x0229  */
    /* JADX WARN: Code duplicated, block: B:148:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x023b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x026a  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:170:0x02df  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0354  */
    /* JADX WARN: Code duplicated, block: B:177:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /* JADX INFO: renamed from: A */
    public static final void m74910A(Modifier modifier, C25508g viewState, InterfaceC41070a dateAndTimeProvider, boolean z4, EnumC16313m0 enumC16313m0, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        int i24;
        int i25;
        boolean z17;
        C28655q c28655q;
        Modifier modifier2;
        EnumC16313m0 enumC16313m1;
        Function1 function2;
        boolean z18;
        boolean z19;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        EnumC16313m0 enumC16313m2;
        boolean z24;
        boolean z25;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function3;
        Object objM87133R;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        final InterfaceC28601c1 interfaceC28601c5;
        final C23104h1 c23104h1M67082p;
        InterfaceC28601c1 interfaceC28601c6;
        InterfaceC28601c1 interfaceC28601c7;
        Object objM87133R8;
        InterfaceC28670t2 interfaceC28670t2;
        EnumC15209z3 enumC15209z3;
        C15199y3 c15199y3M3460c;
        Object objM87133R9;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R10;
        InterfaceC28601c1 interfaceC28601c8;
        InterfaceC28601c1 interfaceC28601c9;
        boolean z26;
        boolean zM87157i;
        Object objM87133R11;
        boolean zM87153g;
        Object objM87133R12;
        boolean zM87153g2;
        Object objM87133R13;
        Object objM87133R14;
        Object objM87133R15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(905754722);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(dateAndTimeProvider) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i27 = i14 & 16;
        if (i27 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i28 = i14 & 32;
        if (i28 == 0) {
            if ((196608 & i13) == 0) {
                z15 = z13;
                i15 |= c28655q2.m87155h(z15) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    z16 = z14;
                    if (c28655q2.m87155h(z16)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 128;
                if (i18 != 0) {
                    if ((12582912 & i13) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 256;
                    if (i24 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i25 = 67108864;
                            } else {
                                i25 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z17)) {
                            c2314t = C2314t.f9131w;
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i27 != 0) {
                                enumC16313m2 = EnumC16313m0.CROSS;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i28 != 0) {
                                z24 = false;
                            } else {
                                z24 = z15;
                            }
                            if (i16 != 0) {
                                z25 = false;
                            } else {
                                z25 = z16;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R15 = c28655q2.m87133R();
                                if (objM87133R15 == c28676v0) {
                                    objM87133R15 = new C24958m(16);
                                    c28655q2.m87172p0(objM87133R15);
                                }
                                interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                            } else {
                                interfaceC4339a4 = interfaceC4339a2;
                            }
                            if (i24 != 0) {
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v0) {
                                    objM87133R14 = new C24875c(24);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                function3 = (Function1) objM87133R14;
                            } else {
                                function3 = function1;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                                c28655q2.m87172p0(objM87133R5);
                            }
                            InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                                c28655q2.m87172p0(objM87133R6);
                            }
                            InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                            }
                            interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                            c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                            if (m74920K(interfaceC28601c5)) {
                                c28655q2.m87150e0(-1939095993);
                                zM87153g = c28655q2.m87153g(c23104h1M67082p);
                                objM87133R12 = c28655q2.m87133R();
                                if (zM87153g || objM87133R12 == c28676v0) {
                                    final int i29 = 0;
                                    objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i29) {
                                                case 0:
                                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                                default:
                                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            }
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R12;
                                zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                                objM87133R13 = c28655q2.m87133R();
                                if (!zM87153g2 || objM87133R13 == c28676v0) {
                                    final int i34 = 1;
                                    objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i34) {
                                                case 0:
                                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                                default:
                                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            }
                                        }
                                    };
                                    interfaceC28601c6 = interfaceC28601c5;
                                    interfaceC28601c7 = interfaceC28601c3;
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    interfaceC28601c6 = interfaceC28601c5;
                                    interfaceC28601c7 = interfaceC28601c3;
                                }
                                m74953i0(c23104h1M67082p, interfaceC4339a5, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                                c28655q2.m87173q(false);
                            } else {
                                interfaceC28601c2 = interfaceC28601c2;
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87150e0(-1938210912);
                                c28655q2.m87173q(false);
                            }
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                            if (z25) {
                                enumC15209z3 = EnumC15209z3.f57107x;
                            } else {
                                enumC15209z3 = EnumC15209z3.f57106w;
                            }
                            c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                            objM87133R9 = c28655q2.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                            objM87133R10 = c28655q2.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28601c9 = interfaceC28601c2;
                                z26 = z24;
                                C0561l c0561l = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                                interfaceC28601c4 = interfaceC28601c4;
                                interfaceC28601c8 = interfaceC28601c1;
                                objM87133R10 = AbstractC28683x.m87264r(c0561l);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                interfaceC28601c8 = interfaceC28601c1;
                                interfaceC28601c9 = interfaceC28601c2;
                                z26 = z24;
                            }
                            InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R10;
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                            C35666g c35666g = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                            zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i || objM87133R11 == c28676v0) {
                                objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c9;
                            c28655q = c28655q2;
                            Modifier modifier4 = modifier3;
                            EnumC16313m0 enumC16313m3 = enumC16313m2;
                            AbstractC35660d.m112871m(modifierM3599a, c35666g, aVar, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c10, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier4, viewState, enumC16313m3, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t3, interfaceC28601c6, interfaceC28601c10, interfaceC28670t4, interfaceC28670t5, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                            modifier2 = modifier4;
                            enumC16313m1 = enumC16313m3;
                            z19 = z25;
                            interfaceC4339a3 = interfaceC4339a4;
                            function2 = function3;
                            z18 = z26;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            enumC16313m1 = enumC16313m0;
                            function2 = function1;
                            z18 = z15;
                            z19 = z16;
                            interfaceC4339a3 = interfaceC4339a2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z17)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC16313m2 = EnumC16313m0.CROSS;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i28 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i16 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C24958m(16);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i24 != 0) {
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C24875c(24);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            function3 = (Function1) objM87133R14;
                        } else {
                            function3 = function1;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC28670t2 interfaceC28670t6 = (InterfaceC28670t2) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                            c28655q2.m87172p0(objM87133R6);
                        }
                        InterfaceC28670t2 interfaceC28670t7 = (InterfaceC28670t2) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                        c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                        if (m74920K(interfaceC28601c5)) {
                            c28655q2.m87150e0(-1939095993);
                            zM87153g = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87153g) {
                                final int i210 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i210) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                final int i211 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i211) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                            zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R13 = c28655q2.m87133R();
                            if (zM87153g2) {
                                final int i35 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i35) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                final int i36 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i36) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            }
                            m74953i0(c23104h1M67082p, interfaceC4339a6, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            interfaceC28601c2 = interfaceC28601c2;
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87150e0(-1938210912);
                            c28655q2.m87173q(false);
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                        if (z25) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                        } else {
                            enumC15209z3 = EnumC15209z3.f57106w;
                        }
                        c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                            C0561l c0561l2 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                            interfaceC28601c4 = interfaceC28601c4;
                            interfaceC28601c8 = interfaceC28601c1;
                            objM87133R10 = AbstractC28683x.m87264r(c0561l2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            interfaceC28601c8 = interfaceC28601c1;
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                        }
                        InterfaceC28670t2 interfaceC28670t8 = (InterfaceC28670t2) objM87133R10;
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                        C35666g c35666g2 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                        AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c);
                        zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c9;
                        c28655q = c28655q2;
                        Modifier modifier5 = modifier3;
                        EnumC16313m0 enumC16313m4 = enumC16313m2;
                        AbstractC35660d.m112871m(modifierM3599a2, c35666g2, aVar2, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c11, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier5, viewState, enumC16313m4, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t6, interfaceC28601c6, interfaceC28601c11, interfaceC28670t7, interfaceC28670t8, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                        modifier2 = modifier5;
                        enumC16313m1 = enumC16313m4;
                        z19 = z25;
                        interfaceC4339a3 = interfaceC4339a4;
                        function2 = function3;
                        z18 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        enumC16313m1 = enumC16313m0;
                        function2 = function1;
                        z18 = z15;
                        z19 = z16;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                    }
                }
                i15 |= 12582912;
                interfaceC4339a2 = interfaceC4339a;
                i24 = i14 & 256;
                if (i24 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i25 = 67108864;
                        } else {
                            i25 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z17)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC16313m2 = EnumC16313m0.CROSS;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i28 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i16 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C24958m(16);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i24 != 0) {
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C24875c(24);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            function3 = (Function1) objM87133R14;
                        } else {
                            function3 = function1;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC28670t2 interfaceC28670t9 = (InterfaceC28670t2) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                            c28655q2.m87172p0(objM87133R6);
                        }
                        InterfaceC28670t2 interfaceC28670t10 = (InterfaceC28670t2) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                        c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                        if (m74920K(interfaceC28601c5)) {
                            c28655q2.m87150e0(-1939095993);
                            zM87153g = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87153g) {
                                final int i212 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i212) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                final int i213 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i213) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R12;
                            zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R13 = c28655q2.m87133R();
                            if (zM87153g2) {
                                final int i37 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i37) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                final int i38 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i38) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            }
                            m74953i0(c23104h1M67082p, interfaceC4339a7, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            interfaceC28601c2 = interfaceC28601c2;
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87150e0(-1938210912);
                            c28655q2.m87173q(false);
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                        if (z25) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                        } else {
                            enumC15209z3 = EnumC15209z3.f57106w;
                        }
                        c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                            C0561l c0561l3 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                            interfaceC28601c4 = interfaceC28601c4;
                            interfaceC28601c8 = interfaceC28601c1;
                            objM87133R10 = AbstractC28683x.m87264r(c0561l3);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            interfaceC28601c8 = interfaceC28601c1;
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                        }
                        InterfaceC28670t2 interfaceC28670t11 = (InterfaceC28670t2) objM87133R10;
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                        C35666g c35666g3 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                        AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y3M3460c);
                        zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c9;
                        c28655q = c28655q2;
                        Modifier modifier6 = modifier3;
                        EnumC16313m0 enumC16313m5 = enumC16313m2;
                        AbstractC35660d.m112871m(modifierM3599a3, c35666g3, aVar3, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c12, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier6, viewState, enumC16313m5, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t9, interfaceC28601c6, interfaceC28601c12, interfaceC28670t10, interfaceC28670t11, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                        modifier2 = modifier6;
                        enumC16313m1 = enumC16313m5;
                        z19 = z25;
                        interfaceC4339a3 = interfaceC4339a4;
                        function2 = function3;
                        z18 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        enumC16313m1 = enumC16313m0;
                        function2 = function1;
                        z18 = z15;
                        z19 = z16;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t12 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t13 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i214 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i215 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i215) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i39 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i39) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i310 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i310) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a8, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l4 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l4);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t14 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g4 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar4 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier7 = modifier3;
                    EnumC16313m0 enumC16313m6 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a4, c35666g4, aVar4, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c13, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier7, viewState, enumC16313m6, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t12, interfaceC28601c6, interfaceC28601c13, interfaceC28670t13, interfaceC28670t14, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier7;
                    enumC16313m1 = enumC16313m6;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 1572864;
            z16 = z14;
            i18 = i14 & 128;
            if (i18 != 0) {
                if ((12582912 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i25 = 67108864;
                        } else {
                            i25 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z17)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC16313m2 = EnumC16313m0.CROSS;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i28 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i16 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C24958m(16);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i24 != 0) {
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C24875c(24);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            function3 = (Function1) objM87133R14;
                        } else {
                            function3 = function1;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC28670t2 interfaceC28670t15 = (InterfaceC28670t2) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                            c28655q2.m87172p0(objM87133R6);
                        }
                        InterfaceC28670t2 interfaceC28670t16 = (InterfaceC28670t2) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                        c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                        if (m74920K(interfaceC28601c5)) {
                            c28655q2.m87150e0(-1939095993);
                            zM87153g = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87153g) {
                                final int i216 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i216) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                final int i217 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i217) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R12;
                            zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R13 = c28655q2.m87133R();
                            if (zM87153g2) {
                                final int i311 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i311) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                final int i312 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i312) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            }
                            m74953i0(c23104h1M67082p, interfaceC4339a9, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            interfaceC28601c2 = interfaceC28601c2;
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87150e0(-1938210912);
                            c28655q2.m87173q(false);
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                        if (z25) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                        } else {
                            enumC15209z3 = EnumC15209z3.f57106w;
                        }
                        c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                            C0561l c0561l5 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                            interfaceC28601c4 = interfaceC28601c4;
                            interfaceC28601c8 = interfaceC28601c1;
                            objM87133R10 = AbstractC28683x.m87264r(c0561l5);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            interfaceC28601c8 = interfaceC28601c1;
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                        }
                        InterfaceC28670t2 interfaceC28670t17 = (InterfaceC28670t2) objM87133R10;
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                        C35666g c35666g5 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                        AbstractC35664f.a aVar5 = new AbstractC35664f.a(c15199y3M3460c);
                        zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c9;
                        c28655q = c28655q2;
                        Modifier modifier8 = modifier3;
                        EnumC16313m0 enumC16313m7 = enumC16313m2;
                        AbstractC35660d.m112871m(modifierM3599a5, c35666g5, aVar5, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c14, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier8, viewState, enumC16313m7, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t15, interfaceC28601c6, interfaceC28601c14, interfaceC28670t16, interfaceC28670t17, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                        modifier2 = modifier8;
                        enumC16313m1 = enumC16313m7;
                        z19 = z25;
                        interfaceC4339a3 = interfaceC4339a4;
                        function2 = function3;
                        z18 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        enumC16313m1 = enumC16313m0;
                        function2 = function1;
                        z18 = z15;
                        z19 = z16;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t18 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t19 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i218 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i218) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i219 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i219) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i313 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i313) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i314 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i314) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a10, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l6 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l6);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t110 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g6 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar6 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier9 = modifier3;
                    EnumC16313m0 enumC16313m8 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a6, c35666g6, aVar6, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c15, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier9, viewState, enumC16313m8, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t18, interfaceC28601c6, interfaceC28601c15, interfaceC28670t19, interfaceC28670t110, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier9;
                    enumC16313m1 = enumC16313m8;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 12582912;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 256;
            if (i24 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i25;
                }
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t111 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t112 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i2110 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2110) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i2111 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i315 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i315) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i316 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i316) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a11, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l7 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l7);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t113 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g7 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar7 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier10 = modifier3;
                    EnumC16313m0 enumC16313m9 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a7, c35666g7, aVar7, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c16, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier10, viewState, enumC16313m9, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t111, interfaceC28601c6, interfaceC28601c16, interfaceC28670t112, interfaceC28670t113, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier10;
                    enumC16313m1 = enumC16313m9;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC16313m2 = EnumC16313m0.CROSS;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i28 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C24958m(16);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i24 != 0) {
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C24875c(24);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    function3 = (Function1) objM87133R14;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28670t2 interfaceC28670t114 = (InterfaceC28670t2) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC28670t2 interfaceC28670t115 = (InterfaceC28670t2) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                if (m74920K(interfaceC28601c5)) {
                    c28655q2.m87150e0(-1939095993);
                    zM87153g = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i2112 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        final int i2113 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R12;
                    zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i317 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i317) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        final int i318 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i318) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    m74953i0(c23104h1M67082p, interfaceC4339a12, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87150e0(-1938210912);
                    c28655q2.m87173q(false);
                }
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                if (z25) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                    C0561l c0561l8 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c8 = interfaceC28601c1;
                    objM87133R10 = AbstractC28683x.m87264r(c0561l8);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c1;
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                }
                InterfaceC28670t2 interfaceC28670t116 = (InterfaceC28670t2) objM87133R10;
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                C35666g c35666g8 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                AbstractC35664f.a aVar8 = new AbstractC35664f.a(c15199y3M3460c);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c9;
                c28655q = c28655q2;
                Modifier modifier11 = modifier3;
                EnumC16313m0 enumC16313m10 = enumC16313m2;
                AbstractC35660d.m112871m(modifierM3599a8, c35666g8, aVar8, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c17, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier11, viewState, enumC16313m10, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t114, interfaceC28601c6, interfaceC28601c17, interfaceC28670t115, interfaceC28670t116, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                modifier2 = modifier11;
                enumC16313m1 = enumC16313m10;
                z19 = z25;
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                z18 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC16313m1 = enumC16313m0;
                function2 = function1;
                z18 = z15;
                z19 = z16;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z15 = z13;
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                z16 = z14;
                if (c28655q2.m87155h(z16)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                if ((12582912 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i25 = 67108864;
                        } else {
                            i25 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z17)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i27 != 0) {
                            enumC16313m2 = EnumC16313m0.CROSS;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i28 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i16 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C24958m(16);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i24 != 0) {
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C24875c(24);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            function3 = (Function1) objM87133R14;
                        } else {
                            function3 = function1;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC28670t2 interfaceC28670t117 = (InterfaceC28670t2) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                            c28655q2.m87172p0(objM87133R6);
                        }
                        InterfaceC28670t2 interfaceC28670t118 = (InterfaceC28670t2) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                        c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                        if (m74920K(interfaceC28601c5)) {
                            c28655q2.m87150e0(-1939095993);
                            zM87153g = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87153g) {
                                final int i2114 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2114) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                final int i2115 = 0;
                                objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2115) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R12;
                            zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                            objM87133R13 = c28655q2.m87133R();
                            if (zM87153g2) {
                                final int i319 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i319) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                final int i3110 = 1;
                                objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i3110) {
                                            case 0:
                                                return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                            default:
                                                return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        }
                                    }
                                };
                                interfaceC28601c6 = interfaceC28601c5;
                                interfaceC28601c7 = interfaceC28601c3;
                                c28655q2.m87172p0(objM87133R13);
                            }
                            m74953i0(c23104h1M67082p, interfaceC4339a13, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            interfaceC28601c2 = interfaceC28601c2;
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87150e0(-1938210912);
                            c28655q2.m87173q(false);
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                        if (z25) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                        } else {
                            enumC15209z3 = EnumC15209z3.f57106w;
                        }
                        c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                            C0561l c0561l9 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                            interfaceC28601c4 = interfaceC28601c4;
                            interfaceC28601c8 = interfaceC28601c1;
                            objM87133R10 = AbstractC28683x.m87264r(c0561l9);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            interfaceC28601c8 = interfaceC28601c1;
                            interfaceC28601c9 = interfaceC28601c2;
                            z26 = z24;
                        }
                        InterfaceC28670t2 interfaceC28670t119 = (InterfaceC28670t2) objM87133R10;
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                        C35666g c35666g9 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                        AbstractC35664f.a aVar9 = new AbstractC35664f.a(c15199y3M3460c);
                        zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c9;
                        c28655q = c28655q2;
                        Modifier modifier12 = modifier3;
                        EnumC16313m0 enumC16313m11 = enumC16313m2;
                        AbstractC35660d.m112871m(modifierM3599a9, c35666g9, aVar9, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c18, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier12, viewState, enumC16313m11, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t117, interfaceC28601c6, interfaceC28601c18, interfaceC28670t118, interfaceC28670t119, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                        modifier2 = modifier12;
                        enumC16313m1 = enumC16313m11;
                        z19 = z25;
                        interfaceC4339a3 = interfaceC4339a4;
                        function2 = function3;
                        z18 = z26;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        enumC16313m1 = enumC16313m0;
                        function2 = function1;
                        z18 = z15;
                        z19 = z16;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t1110 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t1111 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i2116 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2116) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i2117 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2117) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i3111 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i3112 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3112) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a14, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l10 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l10);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t1112 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g10 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar10 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier13 = modifier3;
                    EnumC16313m0 enumC16313m12 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a10, c35666g10, aVar10, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c19, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier13, viewState, enumC16313m12, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t1110, interfaceC28601c6, interfaceC28601c19, interfaceC28670t1111, interfaceC28670t1112, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier13;
                    enumC16313m1 = enumC16313m12;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 12582912;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 256;
            if (i24 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i25;
                }
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t1113 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t1114 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i2118 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2118) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i2119 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2119) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i3113 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3113) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i3114 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3114) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a15, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l11 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l11);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t1115 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g11 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar11 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier14 = modifier3;
                    EnumC16313m0 enumC16313m13 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a11, c35666g11, aVar11, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c110, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier14, viewState, enumC16313m13, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t1113, interfaceC28601c6, interfaceC28601c110, interfaceC28670t1114, interfaceC28670t1115, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier14;
                    enumC16313m1 = enumC16313m13;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC16313m2 = EnumC16313m0.CROSS;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i28 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C24958m(16);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i24 != 0) {
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C24875c(24);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    function3 = (Function1) objM87133R14;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28670t2 interfaceC28670t1116 = (InterfaceC28670t2) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC28670t2 interfaceC28670t1117 = (InterfaceC28670t2) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                if (m74920K(interfaceC28601c5)) {
                    c28655q2.m87150e0(-1939095993);
                    zM87153g = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i21110 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21110) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        final int i21111 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R12;
                    zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i3115 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3115) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        final int i3116 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3116) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    m74953i0(c23104h1M67082p, interfaceC4339a16, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87150e0(-1938210912);
                    c28655q2.m87173q(false);
                }
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                if (z25) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                    C0561l c0561l12 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c8 = interfaceC28601c1;
                    objM87133R10 = AbstractC28683x.m87264r(c0561l12);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c1;
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                }
                InterfaceC28670t2 interfaceC28670t1118 = (InterfaceC28670t2) objM87133R10;
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                C35666g c35666g12 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                AbstractC35664f.a aVar12 = new AbstractC35664f.a(c15199y3M3460c);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c9;
                c28655q = c28655q2;
                Modifier modifier15 = modifier3;
                EnumC16313m0 enumC16313m14 = enumC16313m2;
                AbstractC35660d.m112871m(modifierM3599a12, c35666g12, aVar12, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c111, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier15, viewState, enumC16313m14, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t1116, interfaceC28601c6, interfaceC28601c111, interfaceC28670t1117, interfaceC28670t1118, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                modifier2 = modifier15;
                enumC16313m1 = enumC16313m14;
                z19 = z25;
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                z18 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC16313m1 = enumC16313m0;
                function2 = function1;
                z18 = z15;
                z19 = z16;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= 1572864;
        z16 = z14;
        i18 = i14 & 128;
        if (i18 != 0) {
            if ((12582912 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i25;
                }
                if ((i15 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z17)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i27 != 0) {
                        enumC16313m2 = EnumC16313m0.CROSS;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i28 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C24958m(16);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i24 != 0) {
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C24875c(24);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        function3 = (Function1) objM87133R14;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC28670t2 interfaceC28670t1119 = (InterfaceC28670t2) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC28670t2 interfaceC28670t11110 = (InterfaceC28670t2) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                    c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                    if (m74920K(interfaceC28601c5)) {
                        c28655q2.m87150e0(-1939095993);
                        zM87153g = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i21112 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21112) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            final int i21113 = 0;
                            objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21113) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R12;
                        zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i3117 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3117) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            final int i3118 = 1;
                            objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3118) {
                                        case 0:
                                            return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                        default:
                                            return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    }
                                }
                            };
                            interfaceC28601c6 = interfaceC28601c5;
                            interfaceC28601c7 = interfaceC28601c3;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        m74953i0(c23104h1M67082p, interfaceC4339a17, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87150e0(-1938210912);
                        c28655q2.m87173q(false);
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                    if (z25) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                        C0561l c0561l13 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c8 = interfaceC28601c1;
                        objM87133R10 = AbstractC28683x.m87264r(c0561l13);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c8 = interfaceC28601c1;
                        interfaceC28601c9 = interfaceC28601c2;
                        z26 = z24;
                    }
                    InterfaceC28670t2 interfaceC28670t11111 = (InterfaceC28670t2) objM87133R10;
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                    C35666g c35666g13 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                    AbstractC35664f.a aVar13 = new AbstractC35664f.a(c15199y3M3460c);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c9;
                    c28655q = c28655q2;
                    Modifier modifier16 = modifier3;
                    EnumC16313m0 enumC16313m15 = enumC16313m2;
                    AbstractC35660d.m112871m(modifierM3599a13, c35666g13, aVar13, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c112, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier16, viewState, enumC16313m15, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t1119, interfaceC28601c6, interfaceC28601c112, interfaceC28670t11110, interfaceC28670t11111, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                    modifier2 = modifier16;
                    enumC16313m1 = enumC16313m15;
                    z19 = z25;
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    z18 = z26;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    enumC16313m1 = enumC16313m0;
                    function2 = function1;
                    z18 = z15;
                    z19 = z16;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC16313m2 = EnumC16313m0.CROSS;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i28 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C24958m(16);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i24 != 0) {
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C24875c(24);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    function3 = (Function1) objM87133R14;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28670t2 interfaceC28670t11112 = (InterfaceC28670t2) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC28670t2 interfaceC28670t11113 = (InterfaceC28670t2) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                if (m74920K(interfaceC28601c5)) {
                    c28655q2.m87150e0(-1939095993);
                    zM87153g = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i21114 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21114) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        final int i21115 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21115) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R12;
                    zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i3119 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3119) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        final int i31110 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31110) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    m74953i0(c23104h1M67082p, interfaceC4339a18, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87150e0(-1938210912);
                    c28655q2.m87173q(false);
                }
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                if (z25) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                    C0561l c0561l14 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c8 = interfaceC28601c1;
                    objM87133R10 = AbstractC28683x.m87264r(c0561l14);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c1;
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                }
                InterfaceC28670t2 interfaceC28670t11114 = (InterfaceC28670t2) objM87133R10;
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                C35666g c35666g14 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                AbstractC35664f.a aVar14 = new AbstractC35664f.a(c15199y3M3460c);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC28601c1 interfaceC28601c113 = interfaceC28601c9;
                c28655q = c28655q2;
                Modifier modifier17 = modifier3;
                EnumC16313m0 enumC16313m16 = enumC16313m2;
                AbstractC35660d.m112871m(modifierM3599a14, c35666g14, aVar14, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c113, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier17, viewState, enumC16313m16, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t11112, interfaceC28601c6, interfaceC28601c113, interfaceC28670t11113, interfaceC28670t11114, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                modifier2 = modifier17;
                enumC16313m1 = enumC16313m16;
                z19 = z25;
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                z18 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC16313m1 = enumC16313m0;
                function2 = function1;
                z18 = z15;
                z19 = z16;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= 12582912;
        interfaceC4339a2 = interfaceC4339a;
        i24 = i14 & 256;
        if (i24 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i25;
            }
            if ((i15 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z17)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i27 != 0) {
                    enumC16313m2 = EnumC16313m0.CROSS;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i28 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C24958m(16);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i24 != 0) {
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C24875c(24);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    function3 = (Function1) objM87133R14;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC28670t2 interfaceC28670t11115 = (InterfaceC28670t2) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC28670t2 interfaceC28670t11116 = (InterfaceC28670t2) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
                c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
                if (m74920K(interfaceC28601c5)) {
                    c28655q2.m87150e0(-1939095993);
                    zM87153g = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i21116 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21116) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        final int i21117 = 0;
                        objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21117) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R12;
                    zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i31111 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31111) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        final int i31112 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31112) {
                                    case 0:
                                        return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                    default:
                                        return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                }
                            }
                        };
                        interfaceC28601c6 = interfaceC28601c5;
                        interfaceC28601c7 = interfaceC28601c3;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    m74953i0(c23104h1M67082p, interfaceC4339a19, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87150e0(-1938210912);
                    c28655q2.m87173q(false);
                }
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
                if (z25) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                    C0561l c0561l15 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c8 = interfaceC28601c1;
                    objM87133R10 = AbstractC28683x.m87264r(c0561l15);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c8 = interfaceC28601c1;
                    interfaceC28601c9 = interfaceC28601c2;
                    z26 = z24;
                }
                InterfaceC28670t2 interfaceC28670t11117 = (InterfaceC28670t2) objM87133R10;
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
                C35666g c35666g15 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
                AbstractC35664f.a aVar15 = new AbstractC35664f.a(c15199y3M3460c);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c9;
                c28655q = c28655q2;
                Modifier modifier18 = modifier3;
                EnumC16313m0 enumC16313m17 = enumC16313m2;
                AbstractC35660d.m112871m(modifierM3599a15, c35666g15, aVar15, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c114, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier18, viewState, enumC16313m17, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t11115, interfaceC28601c6, interfaceC28601c114, interfaceC28670t11116, interfaceC28670t11117, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
                modifier2 = modifier18;
                enumC16313m1 = enumC16313m17;
                z19 = z25;
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                z18 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                enumC16313m1 = enumC16313m0;
                function2 = function1;
                z18 = z15;
                z19 = z16;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= 100663296;
        if ((i15 & 38347923) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z17)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            if (i27 != 0) {
                enumC16313m2 = EnumC16313m0.CROSS;
            } else {
                enumC16313m2 = enumC16313m0;
            }
            if (i28 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i16 != 0) {
                z25 = false;
            } else {
                z25 = z16;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C24958m(16);
                    c28655q2.m87172p0(objM87133R15);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R15;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i24 != 0) {
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C24875c(24);
                    c28655q2.m87172p0(objM87133R14);
                }
                function3 = (Function1) objM87133R14;
            } else {
                function3 = function1;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsDateTimeSelected()));
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(viewState.getDateTimeValue());
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(viewState.getNameValue());
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87264r(new C21937b(26, interfaceC28601c3));
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28670t2 interfaceC28670t11118 = (InterfaceC28670t2) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87264r(new C16196j(z4, interfaceC28601c3, 1));
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC28670t2 interfaceC28670t11119 = (InterfaceC28670t2) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC31061c.m95647w(z24, c28655q2);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R7;
            c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(JodaTimeUtilKt.millis(m74951h0(interfaceC28601c3))), null, new d(dateAndTimeProvider), c28655q2, 5);
            if (m74920K(interfaceC28601c5)) {
                c28655q2.m87150e0(-1939095993);
                zM87153g = c28655q2.m87153g(c23104h1M67082p);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g) {
                    final int i21118 = 0;
                    objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21118) {
                                case 0:
                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                default:
                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    final int i21119 = 0;
                    objM87133R12 = new InterfaceC4339a() { // from class: mf0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21119) {
                                case 0:
                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                default:
                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R12);
                }
                InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R12;
                zM87153g2 = c28655q2.m87153g(c23104h1M67082p);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g2) {
                    final int i31113 = 1;
                    objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31113) {
                                case 0:
                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                default:
                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                            }
                        }
                    };
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    final int i31114 = 1;
                    objM87133R13 = new InterfaceC4339a() { // from class: mf0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31114) {
                                case 0:
                                    return AbstractC25506e.m74922M(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                                default:
                                    return AbstractC25506e.m74923N(c23104h1M67082p, interfaceC28601c3, interfaceC28601c1, interfaceC28601c5);
                            }
                        }
                    };
                    interfaceC28601c6 = interfaceC28601c5;
                    interfaceC28601c7 = interfaceC28601c3;
                    c28655q2.m87172p0(objM87133R13);
                }
                m74953i0(c23104h1M67082p, interfaceC4339a110, (InterfaceC4339a) objM87133R13, c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                interfaceC28601c2 = interfaceC28601c2;
                interfaceC28601c6 = interfaceC28601c5;
                interfaceC28601c7 = interfaceC28601c3;
                c28655q2.m87150e0(-1938210912);
                c28655q2.m87173q(false);
            }
            objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87264r(new C23045q(27, dateAndTimeProvider, interfaceC28601c7));
                c28655q2.m87172p0(objM87133R8);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R8;
            if (z25) {
                enumC15209z3 = EnumC15209z3.f57107x;
            } else {
                enumC15209z3 = EnumC15209z3.f57106w;
            }
            c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q2, 3072, 6);
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R9);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R9;
            objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                interfaceC28601c9 = interfaceC28601c2;
                z26 = z24;
                C0561l c0561l16 = new C0561l(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c9, interfaceC28670t2, interfaceC28601c7, 8);
                interfaceC28601c4 = interfaceC28601c4;
                interfaceC28601c8 = interfaceC28601c1;
                objM87133R10 = AbstractC28683x.m87264r(c0561l16);
                c28655q2.m87172p0(objM87133R10);
            } else {
                interfaceC28601c8 = interfaceC28601c1;
                interfaceC28601c9 = interfaceC28601c2;
                z26 = z24;
            }
            InterfaceC28670t2 interfaceC28670t111110 = (InterfaceC28670t2) objM87133R10;
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(c2314t, "TIMER_PICKER_BOTTOM_SHEET_TAG");
            C35666g c35666g16 = new C35666g(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99451t)), null, new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, null, 0.0f, 0.0f, 122, null);
            AbstractC35664f.a aVar16 = new AbstractC35664f.a(c15199y3M3460c);
            zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c);
            objM87133R11 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C3196h(interfaceC2994c0, c15199y3M3460c, 16);
                c28655q2.m87172p0(objM87133R11);
            }
            InterfaceC28601c1 interfaceC28601c115 = interfaceC28601c9;
            c28655q = c28655q2;
            Modifier modifier19 = modifier3;
            EnumC16313m0 enumC16313m18 = enumC16313m2;
            AbstractC35660d.m112871m(modifierM3599a16, c35666g16, aVar16, null, null, (InterfaceC4339a) objM87133R11, null, AbstractC37817c.m121344e(659426064, c28655q2, new C11135o(viewState, z4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c115, interfaceC28601c7)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1072745004, c28655q, new C16527u(modifier19, viewState, enumC16313m18, function3, interfaceC4339a4, interfaceC2994c0, c15199y3M3460c, interfaceC28601c4, interfaceC28601c8, interfaceC28670t11118, interfaceC28601c6, interfaceC28601c115, interfaceC28670t11119, interfaceC28670t111110, interfaceC28601c7)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16216);
            modifier2 = modifier19;
            enumC16313m1 = enumC16313m18;
            z19 = z25;
            interfaceC4339a3 = interfaceC4339a4;
            function2 = function3;
            z18 = z26;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            enumC16313m1 = enumC16313m0;
            function2 = function1;
            z18 = z15;
            z19 = z16;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11691g(modifier2, viewState, dateAndTimeProvider, z4, enumC16313m1, z18, z19, interfaceC4339a3, function2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m74911B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m74912C(AbstractC25502a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m74913D(InterfaceC28601c1 interfaceC28601c1, LocalDateTime localDateTime) {
        interfaceC28601c1.setValue(localDateTime);
    }

    /* JADX INFO: renamed from: E */
    private static final String m74914E(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m74915F(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m74916G(InterfaceC28601c1 interfaceC28601c1) {
        return m74951h0(interfaceC28601c1).toString("MM/dd/yyyy");
    }

    /* JADX INFO: renamed from: H */
    private static final String m74917H(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m74918I(boolean z4, InterfaceC28601c1 interfaceC28601c1) {
        return C28204u.INSTANCE.m85362e(m74951h0(interfaceC28601c1), z4, "%02d");
    }

    /* JADX INFO: renamed from: J */
    private static final String m74919J(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m74920K(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    private static final void m74921L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m74922M(InterfaceC23098g1 interfaceC23098g1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
        if (lM67085b != null) {
            LocalDateTime localDateTimeWithMinuteOfHour = new LocalDateTime(lM67085b.longValue(), DateTimeZone.UTC).withHourOfDay(m74951h0(interfaceC28601c1).getHourOfDay()).withMinuteOfHour(m74951h0(interfaceC28601c1).getMinuteOfHour());
            AbstractC22676k.m65749i(localDateTimeWithMinuteOfHour, "withMinuteOfHour(...)");
            m74913D(interfaceC28601c1, localDateTimeWithMinuteOfHour);
            m74945e0(interfaceC28601c2, true);
        }
        m74921L(interfaceC28601c3, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m74923N(InterfaceC23098g1 interfaceC23098g1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
        if (lM67085b != null) {
            LocalDateTime localDateTimeWithMinuteOfHour = new LocalDateTime(lM67085b.longValue(), DateTimeZone.UTC).withHourOfDay(m74951h0(interfaceC28601c1).getHourOfDay()).withMinuteOfHour(m74951h0(interfaceC28601c1).getMinuteOfHour());
            AbstractC22676k.m65749i(localDateTimeWithMinuteOfHour, "withMinuteOfHour(...)");
            m74913D(interfaceC28601c1, localDateTimeWithMinuteOfHour);
            m74945e0(interfaceC28601c2, true);
        }
        m74921L(interfaceC28601c3, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final boolean m74924O(InterfaceC41070a interfaceC41070a, InterfaceC28601c1 interfaceC28601c1) {
        return !m74971r0(m74951h0(interfaceC28601c1), interfaceC41070a.mo133362a());
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m74925P(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final boolean m74926Q(C25508g c25508g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c4) {
        return m74973s0(m74914E(interfaceC28601c1), m74941c0(interfaceC28601c2), m74947f0(interfaceC28601c3), m74925P(interfaceC28670t2), c25508g.getNameValue(), c25508g.getDateTimeValue(), m74951h0(interfaceC28601c4));
    }

    /* JADX INFO: renamed from: R */
    private static final boolean m74927R(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m74928S(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m74929T(C25508g c25508g, boolean z4, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87138X();
        } else if (System.getProperty("paparazzi.test.resources") == null) {
            c28655q.m87150e0(-218206369);
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62233F);
            LocalTime localTime = c25508g.getDateTimeValue().toLocalTime();
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C2032u(interfaceC2994c0, c15199y3, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23332d.m67560g(null, z4, localTime, true, strM92103Y, jM125430y, null, false, (InterfaceC4351m) objM87133R, c28655q, 3078, 192);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-217559182);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m74930U(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c2, int i13, int i14) {
        m74949g0(interfaceC28601c1, true);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c15199y3, null), 3);
        LocalDateTime localDateTimeWithMinuteOfHour = m74951h0(interfaceC28601c2).withHourOfDay(i13).withMinuteOfHour(i14);
        AbstractC22676k.m65749i(localDateTimeWithMinuteOfHour, "withMinuteOfHour(...)");
        m74913D(interfaceC28601c2, localDateTimeWithMinuteOfHour);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m74931V(Modifier modifier, C25508g c25508g, EnumC16313m0 enumC16313m0, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28601c1 interfaceC28601c5, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, modifier)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 1 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, f15, 5);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(c25508g.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(enumC16313m0.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, c25508g.getNavigationBar().getTag(), null, 49146, null);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C22892a(function1, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, interfaceC4339a, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 20);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1099a.m3394p(f14, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3407d, true, 1.0f), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q, 1), 14)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f16 = 4;
            float f17 = f16 * f13;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c25508g.getImageUrl(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(100, c2314t), 0.0f, 0.0f, 0.0f, f17, 7), null, null, 0.0f, null, c28655q, 432, 120);
            float f18 = ((float) 0.5d) * f13;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f18, 7);
            String strM74993j = c25508g.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i14).getT2();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i15 = C2886a.f11498d;
            int i16 = i15 << 18;
            AbstractC30795n.m94707h(strM74993j, modifierM3398t2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 48, i16, 196600);
            AbstractC30795n.m94707h(c25508g.getSubtitle(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f17, 7), c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 48, i16, 196600);
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "TEST_NAME_INPUT_TEST_TAG");
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c25508g.getNameLabel());
            C2886a c2886aM8432m = c38072d.m121952e(c28655q, i14).getFormLabel();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m74914E(interfaceC28601c1));
            float f19 = 3;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f16 * f19);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f18, 0.0f, f18, f15, 2);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C24958m(17);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C21927e(14, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            int i17 = TextResource.$stable;
            int i18 = i17 << 3;
            AbstractC30792k.m94678l(modifierM3599a, textResourceM21278l2, null, textResourceM21278l, c2886aM8432m, null, null, null, textResourceM21267a, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e, null, null, c22976l1M3381c, null, interfaceC4339a2, function2, c28655q, (i15 << 12) | i18 | 6 | (i17 << 9) | (i17 << 24), 24576, 100663296, 54, 771735268, 0);
            float f24 = f19 * f13;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f24, 0.0f, 0.0f, 13);
            float f25 = 48;
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c25508g.getDateLabel());
            TextResource textResourceM21278l4 = m74941c0(interfaceC28601c2) ? AbstractC8693b.m21278l(m74917H(interfaceC28670t2)) : AbstractC8693b.m21267a();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C21937b(25, interfaceC28601c3);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30783b.m94649b(textResourceM21278l3, textResourceM21278l4, (InterfaceC4339a) objM87133R4, modifierM3398t3, "DATE_PICKER", null, false, false, f25, 0L, null, c28655q, 100691328 | i17 | i18, 0, 1760);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, f24, 0.0f, f17, 5);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(c25508g.getTimeLabel());
            TextResource textResourceM21278l6 = m74947f0(interfaceC28601c4) ? AbstractC8693b.m21278l(m74919J(interfaceC28670t3)) : AbstractC8693b.m21267a();
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C3196h(interfaceC2994c0, c15199y3, 17);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC30783b.m94649b(textResourceM21278l5, textResourceM21278l6, (InterfaceC4339a) objM87133R5, modifierM3398t4, "TIME_PICKER", null, false, false, f25, 0L, null, c28655q, i17 | 100690944 | i18, 0, 1760);
            c28655q.m87173q(true);
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, f15);
            C27238a0 c27238a0M82077b = C27238a0.m82077b(c25508g.getButton(), null, null, null, null, 0.0f, null, null, null, m74927R(interfaceC28670t4), false, 767, null);
            boolean zM87153g2 = c28655q.m87153g(function1);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g2 || objM87133R6 == c28676v0) {
                objM87133R6 = new C25504c(0, function1, interfaceC28601c1, interfaceC28601c5);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC27292z.m82341h(c27238a0M82077b, modifierM3395q, null, (InterfaceC4339a) objM87133R6, c28655q, C27238a0.f109008k | 48, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m74932W(Function1 function1) {
        function1.invoke(AbstractC25502a.a.f99859a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m74933X() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m74934Y(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m74915F(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m74935Z(InterfaceC28601c1 interfaceC28601c1) {
        m74921L(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m74937a0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m74939b0(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2) {
        String strM74914E = m74914E(interfaceC28601c1);
        if (strM74914E != null) {
            function1.invoke(new AbstractC25502a.b(strM74914E, m74951h0(interfaceC28601c2)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final boolean m74941c0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m74943d0(Modifier modifier, C25508g c25508g, InterfaceC41070a interfaceC41070a, boolean z4, EnumC16313m0 enumC16313m0, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m74910A(modifier, c25508g, interfaceC41070a, z4, enumC16313m0, z13, z14, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m74945e0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: f0 */
    private static final boolean m74947f0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m74949g0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: h0 */
    private static final LocalDateTime m74951h0(InterfaceC28601c1 interfaceC28601c1) {
        return (LocalDateTime) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private static final void m74953i0(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-731628856);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23098g1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C28674u2 c28674u2 = AbstractC23138n.f91494a;
            long j7 = AbstractC27363d.f109767z;
            AbstractC23200x1.m67158b(new C23132m(j7, AbstractC27363d.f109751j, AbstractC27363d.f109721A, AbstractC27363d.f109752k, AbstractC27363d.f109746e, AbstractC27363d.f109725E, AbstractC27363d.f109755n, AbstractC27363d.f109726F, AbstractC27363d.f109756o, AbstractC27363d.f109738R, AbstractC27363d.f109761t, AbstractC27363d.f109739S, AbstractC27363d.f109762u, AbstractC27363d.f109742a, AbstractC27363d.f109748g, AbstractC27363d.f109729I, AbstractC27363d.f109759r, AbstractC27363d.f109737Q, AbstractC27363d.f109760s, j7, AbstractC27363d.f109747f, AbstractC27363d.f109745d, AbstractC27363d.f109743b, AbstractC27363d.f109749h, AbstractC27363d.f109744c, AbstractC27363d.f109750i, AbstractC27363d.f109765x, AbstractC27363d.f109766y, AbstractC27363d.f109724D, AbstractC27363d.f109730J, AbstractC27363d.f109736P, AbstractC27363d.f109731K, AbstractC27363d.f109732L, AbstractC27363d.f109733M, AbstractC27363d.f109734N, AbstractC27363d.f109735O, AbstractC27363d.f109722B, AbstractC27363d.f109723C, AbstractC27363d.f109753l, AbstractC27363d.f109754m, AbstractC27363d.f109727G, AbstractC27363d.f109728H, AbstractC27363d.f109757p, AbstractC27363d.f109758q, AbstractC27363d.f109740T, AbstractC27363d.f109741U, AbstractC27363d.f109763v, AbstractC27363d.f109764w), null, null, AbstractC37817c.m121344e(1395820956, c28655q, new C21859k(interfaceC4339a, interfaceC4339a2, interfaceC23098g1, 7)), c28655q, 3072);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25503b(interfaceC23098g1, interfaceC4339a, interfaceC4339a2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m74955j0(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC23098g1 interfaceC23098g1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "DATE_PICKER_DIALOG_TEST_TAG");
            C23204y c23204yM74969q0 = m74969q0(c28655q, 0);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C24679k(interfaceC4339a, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23079d0.m67054a((InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(-292315702, c28655q, new C2662y3(interfaceC4339a2, 5)), modifierM3599a, null, null, 0.0f, c23204yM74969q0, null, AbstractC37817c.m121344e(-1229398061, c28655q, new C9722a(interfaceC23098g1, 2)), c28655q, 100663728, 184);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m74957k0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m74959l0(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, f13, f13, 3);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35283c.f150166D);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = e.f99883w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C16416l0(interfaceC4339a, 17);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27265l0.m82217i(modifierM3398t, enumC27269n0, c8688bM21277k, null, null, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R2, c28655q, (TextResource.C8688b.f25889c << 6) | 54, 0, 4024);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m74961m0(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m74963n0(InterfaceC23098g1 interfaceC23098g1, InterfaceC23013y DatePickerDialog, Composer composer, int i13) {
        AbstractC22676k.m65750j(DatePickerDialog, "$this$DatePickerDialog");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC28683x.m87247a(AbstractC23168s.f91626a.mo86977a(new C17919x(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite())), AbstractC37817c.m121344e(217793299, c28655q, new C22541b(interfaceC23098g1, 27)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m74965o0(InterfaceC23098g1 interfaceC23098g1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC23092f1.m67068b(interfaceC23098g1, null, null, m74969q0(c28655q, 0), null, null, false, null, c28655q, 1572864);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m74967p0(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m74953i0(interfaceC23098g1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private static final C23204y m74969q0(Composer composer, int i13) {
        C23067b0 c23067b0 = C23067b0.f90984a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125408n = c38072d.m121949b(composer, i14).getBackgroundDarkAlt();
        long jM125430y = c38072d.m121949b(composer, i14).getBrandWhite();
        long jM125426w = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125430y2 = c38072d.m121949b(composer, i14).getBrandWhite();
        return C23067b0.m67042c(jM125408n, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c38072d.m121949b(composer, i14).getBrandBlack(), jM125430y2, 0L, 0L, jM125426w, jM125430y, c38072d.m121949b(composer, i14).getBrandWhite(), c38072d.m121949b(composer, i14).getBrandWhite(), 0L, composer, 31815166);
    }

    /* JADX INFO: renamed from: r0 */
    public static final boolean m74971r0(LocalDateTime dateTime, LocalDateTime dateTimeNow) {
        AbstractC22676k.m65750j(dateTime, "dateTime");
        AbstractC22676k.m65750j(dateTimeNow, "dateTimeNow");
        return JodaTimeUtilKt.millis(dateTime) <= JodaTimeUtilKt.millis(dateTimeNow) + ((long) DateTimeConstants.MILLIS_PER_MINUTE);
    }

    /* JADX INFO: renamed from: s0 */
    public static final boolean m74973s0(String str, boolean z4, boolean z13, boolean z14, String str2, LocalDateTime originalDateTime, LocalDateTime currentDateTime) {
        AbstractC22676k.m65750j(originalDateTime, "originalDateTime");
        AbstractC22676k.m65750j(currentDateTime, "currentDateTime");
        return !(str == null || str.length() == 0) && (z4 && z13) && !z14 && (!AbstractC22676k.m65745e(str, str2) || !currentDateTime.equals(originalDateTime));
    }
}
