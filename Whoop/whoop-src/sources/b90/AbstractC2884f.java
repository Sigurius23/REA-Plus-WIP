package b90;

import a01.C0089i;
import am2.C1042s;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b30.C2564l1;
import b72.C2783a;
import bc3.InterfaceC2994c0;
import c31.EnumC3921e;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d70.C11751e;
import g80.C15568i;
import g80.EnumC15567h;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h80.InterfaceC17002b;
import j11.AbstractC21211n;
import j80.InterfaceC21413a;
import j93.InterfaceC21493z;
import kd1.AbstractC22403o;
import l80.AbstractC23438o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p000.C17820i;
import p000.C27314o;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p042c2.C3862g;
import p042c2.C3870o;
import p042c2.InterfaceC3871p;
import p088dc.AbstractC11895b;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p412q3.C29871f0;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p714k80.AbstractC22273b;
import p714k80.AbstractC22287p;
import p714k80.AbstractC22288q;
import p714k80.AbstractC22290s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b90.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lb90/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Lb90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "passwordValue", "", "hidePassword", "submitEnabled", "hasBeenFocusedPassword", "isKeyboardOpen", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2884f {

    /* JADX INFO: renamed from: b90.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenKt$EnterYourPasswordScreenView$2$1", m100430f = "EnterYourPasswordScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11473w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2885g f11474x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f11475y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f11476z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2885g c2885g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11474x = c2885g;
            this.f11475y = interfaceC28601c1;
            this.f11476z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f11474x, this.f11475y, this.f11476z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f11473w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC39414r.m125890i0(this.f11474x.getPasswordPrefill().getValue())) {
                AbstractC2884f.m8345B(this.f11475y, this.f11474x.getPasswordPrefill().getValue());
                AbstractC2884f.m8349F(this.f11476z, AbstractC2884f.m8344A(this.f11475y).length() >= 6);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b90.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenKt$EnterYourPasswordScreenView$3$1", m100430f = "EnterYourPasswordScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11477w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f11478x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f11479y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11478x = function1;
            this.f11479y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f11478x, this.f11479y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f11477w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f11478x.invoke(this.f11479y ? EnumC3921e.ENABLE : EnumC3921e.DISABLE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b90.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f11480w = new c();

        /* JADX INFO: renamed from: a */
        public final long m8379a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m8379a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b90.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f11481w = new d();

        /* JADX INFO: renamed from: a */
        public final long m8380a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m8380a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b90.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f11482w = new e();

        /* JADX INFO: renamed from: a */
        public final long m8381a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m8381a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b90.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f11483w = new f();

        /* JADX INFO: renamed from: a */
        public final long m8382a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m8382a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b90.f$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11484a;

        static {
            int[] iArr = new int[EnumC15567h.values().length];
            try {
                iArr[EnumC15567h.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15567h.ALERT_TILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11484a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final String m8344A(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m8345B(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m8346C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m8347D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m8348E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m8349F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x021c  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:123:0x0305  */
    /* JADX WARN: Code duplicated, block: B:126:0x0344  */
    /* JADX WARN: Code duplicated, block: B:127:0x0348  */
    /* JADX WARN: Code duplicated, block: B:132:0x0363  */
    /* JADX WARN: Code duplicated, block: B:135:0x0370  */
    /* JADX WARN: Code duplicated, block: B:136:0x0396  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03db  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x0420  */
    /* JADX WARN: Code duplicated, block: B:164:0x0426  */
    /* JADX WARN: Code duplicated, block: B:167:0x0432  */
    /* JADX WARN: Code duplicated, block: B:168:0x0435  */
    /* JADX WARN: Code duplicated, block: B:170:0x0439  */
    /* JADX WARN: Code duplicated, block: B:177:0x0480  */
    /* JADX WARN: Code duplicated, block: B:179:0x048c  */
    /* JADX WARN: Code duplicated, block: B:180:0x048e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0491  */
    /* JADX WARN: Code duplicated, block: B:191:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:195:0x050f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0514  */
    /* JADX WARN: Code duplicated, block: B:199:0x0522  */
    /* JADX WARN: Code duplicated, block: B:202:0x052a  */
    /* JADX WARN: Code duplicated, block: B:204:0x052d  */
    /* JADX WARN: Code duplicated, block: B:205:0x052f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0532  */
    /* JADX WARN: Code duplicated, block: B:213:0x0540  */
    /* JADX WARN: Code duplicated, block: B:216:0x054a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x054c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0560  */
    /* JADX WARN: Code duplicated, block: B:221:0x0562  */
    /* JADX WARN: Code duplicated, block: B:224:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x056b  */
    /* JADX WARN: Code duplicated, block: B:228:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:230:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:232:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:234:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:238:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:248:0x060d  */
    /* JADX WARN: Code duplicated, block: B:250:0x0614  */
    /* JADX WARN: Code duplicated, block: B:252:0x0618  */
    /* JADX WARN: Code duplicated, block: B:254:0x063c  */
    /* JADX WARN: Code duplicated, block: B:257:0x064d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0694  */
    /* JADX WARN: Code duplicated, block: B:262:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:263:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:266:0x06f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:269:0x071b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:272:0x0726  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f7  */
    /* JADX INFO: renamed from: l */
    public static final void m8364l(C2885g viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C2885g c2885g;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC15237i interfaceC15237i;
        InterfaceC28670t2 interfaceC28670t2M64044h;
        int i16;
        int i17;
        boolean z13;
        Object objM87133R5;
        int i18;
        C15568i c15568iM8392k;
        EnumC15567h displayType;
        EnumC15567h enumC15567h;
        boolean z14;
        boolean z15;
        InterfaceC28601c1 interfaceC28601c5;
        int i19;
        boolean z16;
        boolean zM87155h;
        Object objM87133R6;
        final C15568i c15568iM8392k2;
        int i24;
        boolean z17;
        boolean zM87157i;
        Object objM87133R7;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R8;
        C28676v0 c28676v1;
        Function1 function5;
        InterfaceC15237i interfaceC15237i2;
        boolean z19;
        InterfaceC28601c1 interfaceC28601c6;
        EnumC15567h enumC15567h2;
        InterfaceC28601c1 interfaceC28601c7;
        int i25;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        Object objM87133R9;
        C28676v0 c28676v2;
        int i26;
        boolean z24;
        int i27;
        C2885g c2885g2;
        boolean z25;
        boolean z26;
        Object objM87133R10;
        Function1 function6;
        InterfaceC28601c1 interfaceC28601c8;
        InterfaceC29873g0 c29885s;
        boolean z27;
        boolean z28;
        AbstractC30784c.a aVar;
        boolean zM87157i3;
        Object objM87133R11;
        TextResource textResourceM21272f;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        Object objM87133R12;
        boolean z37;
        Object objM87133R13;
        C28655q c28655q;
        Function1 function7;
        boolean z38;
        boolean z39;
        Object objM87133R14;
        Function1 function8;
        C15568i c15568iM8392k3;
        EnumC15567h displayType2;
        float f14;
        C2314t c2314t2;
        boolean z44;
        Object objM87133R15;
        Object objM87133R16;
        Object objM87133R17;
        boolean z45;
        Object objM87133R18;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-859464655);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R18 = c28655q2.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C2783a(6);
                        c28655q2.m87172p0(objM87133R18);
                    }
                    function4 = (Function1) objM87133R18;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getPasswordPrefill().getValue());
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getHidePassword()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    if (m8344A(interfaceC28601c1).length() >= 6) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R3 = AbstractC31061c.m95647w(z45, c28655q2);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q2, 0);
                i16 = 6;
                String value = viewState.getPasswordPrefill().getValue();
                i17 = i15 & 14;
                if (i17 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                i18 = i17;
                if (z13 || objM87133R5 == c28676v0) {
                    objM87133R5 = new a(viewState, interfaceC28601c1, interfaceC28601c3, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R5, value);
                c15568iM8392k = viewState.getLoginErrorState();
                if (c15568iM8392k != null) {
                    displayType = c15568iM8392k.getDisplayType();
                } else {
                    displayType = null;
                }
                enumC15567h = EnumC15567h.ALERT_TILE;
                if (displayType == enumC15567h) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (m8348E(interfaceC28601c3) || z14) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z15);
                interfaceC28601c5 = interfaceC28601c1;
                i19 = i15 & 112;
                if (i19 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87155h = z16 | c28655q2.m87155h(z15);
                objM87133R6 = c28655q2.m87133R();
                if (zM87155h || objM87133R6 == c28676v0) {
                    objM87133R6 = new b(function4, z15, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, boolValueOf);
                c15568iM8392k2 = viewState.getLoginErrorState();
                if (c15568iM8392k2 == null) {
                    c28655q2.m87150e0(-2010147378);
                    c28655q2.m87173q(false);
                    i15 = i15;
                    function5 = function4;
                    i25 = i19;
                    c28676v1 = c28676v0;
                    z19 = false;
                    interfaceC28601c6 = interfaceC28601c3;
                    enumC15567h2 = enumC15567h;
                    interfaceC28601c7 = interfaceC28601c4;
                    interfaceC15237i2 = interfaceC15237i;
                    i18 = i18;
                    interfaceC28601c5 = interfaceC28601c5;
                    i16 = 6;
                } else {
                    c28655q2.m87150e0(-2010147377);
                    function4.invoke(new InterfaceC17002b.a(viewState.getAnalyticsName(), "inline_error", c15568iM8392k2.getAnalyticsName(), "authentication"));
                    i24 = g.f11484a[c15568iM8392k2.getDisplayType().ordinal()];
                    if (i24 != 1) {
                        c28655q2.m87150e0(-269747334);
                        TextResource loginErrorTitle = c15568iM8392k2.getLoginErrorTitle();
                        TextResource loginErrorDescription = c15568iM8392k2.getLoginErrorDescription();
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC38022b.f162873N, null, 2, null);
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q2.m87157i(c15568iM8392k2);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87157i || objM87133R7 == c28676v0) {
                            final int i29 = 0;
                            objM87133R7 = new InterfaceC4339a() { // from class: b90.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                        default:
                                            return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R7);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R7;
                        if (i19 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = z18 | c28655q2.m87157i(c15568iM8392k2);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R8 == c28676v0) {
                            final int i34 = 1;
                            objM87133R8 = new InterfaceC4339a() { // from class: b90.d
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i34) {
                                        case 0:
                                            return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                        default:
                                            return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R8);
                        }
                        int i35 = TextResource.$stable;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        interfaceC15237i2 = interfaceC15237i;
                        z19 = false;
                        interfaceC28601c6 = interfaceC28601c3;
                        enumC15567h2 = enumC15567h;
                        interfaceC28601c7 = interfaceC28601c4;
                        i25 = i19;
                        AbstractC21211n.m59497o(null, loginErrorTitle, loginErrorDescription, c8688b, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i35 << 6) | (i35 << 3) | (TextResource.C8688b.f25889c << 9), 384, 0, 247459825);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        if (i24 == 2) {
                            throw AbstractC11895b.m32003v(-1117082479, c28655q2, false);
                        }
                        c28655q2.m87150e0(-269166270);
                        c28655q2.m87173q(false);
                        z19 = false;
                        function5 = function4;
                        i25 = i19;
                        c28676v1 = c28676v0;
                        interfaceC28601c6 = interfaceC28601c3;
                        enumC15567h2 = enumC15567h;
                        interfaceC28601c7 = interfaceC28601c4;
                        interfaceC15237i2 = interfaceC15237i;
                    }
                    c28655q2.m87173q(z19);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z19);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                float f15 = 8;
                f13 = 2 * f15;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f15, f13, 0.0f, 8);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, i16);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (m8368p(interfaceC28670t2M64044h)) {
                    c28655q2.m87150e0(107811989);
                    c28655q2.m87173q(z19);
                } else {
                    c28655q2.m87150e0(107618828);
                    AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
                    c28655q2.m87173q(z19);
                }
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 3 * f15, 0.0f, 0.0f, 13);
                objM87133R9 = c28655q2.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R9 == c28676v2) {
                    objM87133R9 = new C2783a(7);
                    c28655q2.m87172p0(objM87133R9);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3398t2, z19, (Function1) objM87133R9);
                i26 = i25;
                if (i26 == 32) {
                    z24 = true;
                } else {
                    z24 = z19;
                }
                i27 = i18;
                if (i27 != 4) {
                    if ((i15 & 8) != 0) {
                        c2885g2 = viewState;
                        if (c28655q2.m87157i(c2885g2)) {
                        }
                        z26 = z24 | z25;
                        objM87133R10 = c28655q2.m87133R();
                        if (!z26 || objM87133R10 == c28676v2) {
                            function6 = function5;
                            interfaceC28601c8 = interfaceC28601c6;
                            objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            function6 = function5;
                            interfaceC28601c8 = interfaceC28601c6;
                        }
                        Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM51775c, (Function1) objM87133R10);
                        TextResource textResourceM8390i = c2885g2.getHint();
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
                        if (m8346C(interfaceC28601c2)) {
                            c29885s = new C29885s();
                        } else {
                            c29885s = C29871f0.f122092w;
                        }
                        if (m8344A(interfaceC28601c5).length() > 0) {
                            z27 = true;
                        } else {
                            z27 = z19;
                        }
                        if (z27 || !m8346C(interfaceC28601c2)) {
                            if (m8344A(interfaceC28601c5).length() > 0) {
                                z28 = true;
                            } else {
                                z28 = z19;
                            }
                            if (z28 || m8346C(interfaceC28601c2)) {
                                c28655q2.m87150e0(109851664);
                                c28655q2.m87173q(z19);
                                aVar = null;
                            } else {
                                c28655q2.m87150e0(-1104842250);
                                int stealthMode = C38072d.f163053a.m121951d().getVarious().getStealthMode();
                                float f16 = 4;
                                C39174f c39174f = new C39174f(f16 * f16);
                                Object objM87133R19 = c28655q2.m87133R();
                                if (objM87133R19 == c28676v2) {
                                    objM87133R19 = e.f11482w;
                                    c28655q2.m87172p0(objM87133R19);
                                }
                                aVar = new AbstractC30784c.a(stealthMode, c39174f, p745y81.Function1.m125323a((Function1) objM87133R19), null, 8, null);
                                c28655q2.m87173q(z19);
                            }
                            zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i3 || objM87133R11 == c28676v2) {
                                objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            Function1 function9 = (Function1) objM87133R11;
                            C34348q0 c34348q0 = new C34348q0(function9, function9, function9, function9, function9, function9);
                            if (c2885g2.getLoginErrorState() != null) {
                                textResourceM21272f = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                            }
                            if (c2885g2.getErrorMessage() == null && c2885g2.getLoginErrorState() == null) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i26 == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if (i27 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(c2885g2))) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = z34 | z35;
                            objM87133R12 = c28655q2.m87133R();
                            if (z36 || objM87133R12 == c28676v2) {
                                objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R12;
                            if (i26 == 32) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z37 || objM87133R13 == c28676v2) {
                                objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            int i36 = TextResource.$stable;
                            c28655q = c28655q2;
                            function7 = function6;
                            AbstractC22273b.m63999c(modifierM3484c, textResourceM8390i, textResourceM21278l, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q0, 7, interfaceC4339a2, (Function1) objM87133R13, c28655q, (i36 << 3) | 3072 | (i36 << 6) | (AbstractC30784c.a.f126785f << 15) | (i36 << 18), 24582, 6912);
                            TextResource textResourceM8388g = viewState.getForgotPasswordText();
                            if (i26 == 32) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            if (i27 != 4) {
                                c2885g = viewState;
                                boolean z46 = (i15 & 8) == 0 && c28655q.m87157i(c2885g);
                                z39 = z46 | z38;
                                objM87133R14 = c28655q.m87133R();
                                if (!z39 || objM87133R14 == c28676v2) {
                                    function8 = function7;
                                    objM87133R14 = new C17820i(20, function8, c2885g);
                                    c28655q.m87172p0(objM87133R14);
                                } else {
                                    function8 = function7;
                                }
                                AbstractC22287p.m64027d(textResourceM8388g, null, (InterfaceC4339a) objM87133R14, c28655q, i36, 2);
                                c15568iM8392k3 = c2885g.getLoginErrorState();
                                if (c15568iM8392k3 != null) {
                                    displayType2 = c15568iM8392k3.getDisplayType();
                                } else {
                                    displayType2 = null;
                                }
                                if (displayType2 == enumC15567h2) {
                                    c28655q.m87150e0(112357736);
                                    f14 = f13;
                                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                                    c2314t2 = c2314t;
                                    EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_INFORMATION;
                                    TextResource loginErrorTitle2 = c2885g.getLoginErrorState().getLoginErrorTitle();
                                    objM87133R16 = c28655q.m87133R();
                                    if (objM87133R16 == c28676v2) {
                                        objM87133R16 = f.f11483w;
                                        c28655q.m87172p0(objM87133R16);
                                    }
                                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R16);
                                    objM87133R17 = c28655q.m87133R();
                                    if (objM87133R17 == c28676v2) {
                                        objM87133R17 = c.f11480w;
                                        c28655q.m87172p0(objM87133R17);
                                    }
                                    AbstractC4106r2.m12647f(modifierM3398t3, new C4092p2(enumC16313m0, 0.0f, null, null, loginErrorTitle2, null, interfaceC39332eM125323a, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                                    c28655q.m87173q(false);
                                } else {
                                    f14 = f13;
                                    c2314t2 = c2314t;
                                    c28655q.m87150e0(112831509);
                                    c28655q.m87173q(false);
                                }
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                                c28655q.m87173q(true);
                                C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                                String strM21273g = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                                if (i26 == 32) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R15 = c28655q.m87133R();
                                if (z44 || objM87133R15 == c28676v2) {
                                    objM87133R15 = new C27314o(function8, 16);
                                    c28655q.m87172p0(objM87133R15);
                                }
                                AbstractC27242b1.m82092d(c27270o, strM21273g, modifierM3394p, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                                c28655q2 = c28655q;
                                c28655q2.m87173q(true);
                                function3 = function8;
                            } else {
                                c2885g = viewState;
                            }
                            z39 = z46 | z38;
                            objM87133R14 = c28655q.m87133R();
                            if (z39) {
                                function8 = function7;
                                objM87133R14 = new C17820i(20, function8, c2885g);
                                c28655q.m87172p0(objM87133R14);
                            } else {
                                function8 = function7;
                                objM87133R14 = new C17820i(20, function8, c2885g);
                                c28655q.m87172p0(objM87133R14);
                            }
                            AbstractC22287p.m64027d(textResourceM8388g, null, (InterfaceC4339a) objM87133R14, c28655q, i36, 2);
                            c15568iM8392k3 = c2885g.getLoginErrorState();
                            if (c15568iM8392k3 != null) {
                                displayType2 = c15568iM8392k3.getDisplayType();
                            } else {
                                displayType2 = null;
                            }
                            if (displayType2 == enumC15567h2) {
                                c28655q.m87150e0(112357736);
                                f14 = f13;
                                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                                c2314t2 = c2314t;
                                EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
                                TextResource loginErrorTitle3 = c2885g.getLoginErrorState().getLoginErrorTitle();
                                objM87133R16 = c28655q.m87133R();
                                if (objM87133R16 == c28676v2) {
                                    objM87133R16 = f.f11483w;
                                    c28655q.m87172p0(objM87133R16);
                                }
                                InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R16);
                                objM87133R17 = c28655q.m87133R();
                                if (objM87133R17 == c28676v2) {
                                    objM87133R17 = c.f11480w;
                                    c28655q.m87172p0(objM87133R17);
                                }
                                AbstractC4106r2.m12647f(modifierM3398t4, new C4092p2(enumC16313m1, 0.0f, null, null, loginErrorTitle3, null, interfaceC39332eM125323a2, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                                c28655q.m87173q(false);
                            } else {
                                f14 = f13;
                                c2314t2 = c2314t;
                                c28655q.m87150e0(112831509);
                                c28655q.m87173q(false);
                            }
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                            c28655q.m87173q(true);
                            C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                            String strM21273g2 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                            if (i26 == 32) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R15 = c28655q.m87133R();
                            if (z44) {
                                objM87133R15 = new C27314o(function8, 16);
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C27314o(function8, 16);
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM3394p2, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                            c28655q2 = c28655q;
                            c28655q2.m87173q(true);
                            function3 = function8;
                        } else {
                            c28655q2.m87150e0(-1104851118);
                            int privacy = C38072d.f163053a.m121951d().getVarious().getPrivacy();
                            float f17 = 4;
                            C39174f c39174f2 = new C39174f(f17 * f17);
                            Object objM87133R20 = c28655q2.m87133R();
                            if (objM87133R20 == c28676v2) {
                                objM87133R20 = d.f11481w;
                                c28655q2.m87172p0(objM87133R20);
                            }
                            aVar = new AbstractC30784c.a(privacy, c39174f2, p745y81.Function1.m125323a((Function1) objM87133R20), null, 8, null);
                            c28655q2.m87173q(z19);
                        }
                        zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        Function1 function10 = (Function1) objM87133R11;
                        C34348q0 c34348q1 = new C34348q0(function10, function10, function10, function10, function10, function10);
                        if (c2885g2.getLoginErrorState() != null) {
                            textResourceM21272f = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                        }
                        if (c2885g2.getErrorMessage() == null) {
                            z29 = false;
                        } else {
                            z29 = false;
                        }
                        if (i26 == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        if (i27 != 4) {
                            z35 = true;
                        } else {
                            z35 = true;
                        }
                        z36 = z34 | z35;
                        objM87133R12 = c28655q2.m87133R();
                        if (z36) {
                            objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R12;
                        if (i26 == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z37) {
                            objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        int i37 = TextResource.$stable;
                        c28655q = c28655q2;
                        function7 = function6;
                        AbstractC22273b.m63999c(modifierM3484c, textResourceM8390i, textResourceM21278l, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q1, 7, interfaceC4339a3, (Function1) objM87133R13, c28655q, (i37 << 3) | 3072 | (i37 << 6) | (AbstractC30784c.a.f126785f << 15) | (i37 << 18), 24582, 6912);
                        TextResource textResourceM8388g2 = viewState.getForgotPasswordText();
                        if (i26 == 32) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        if (i27 != 4) {
                            c2885g = viewState;
                            if ((i15 & 8) == 0) {
                            }
                            z39 = z46 | z38;
                            objM87133R14 = c28655q.m87133R();
                            if (z39) {
                                function8 = function7;
                                objM87133R14 = new C17820i(20, function8, c2885g);
                                c28655q.m87172p0(objM87133R14);
                            } else {
                                function8 = function7;
                                objM87133R14 = new C17820i(20, function8, c2885g);
                                c28655q.m87172p0(objM87133R14);
                            }
                            AbstractC22287p.m64027d(textResourceM8388g2, null, (InterfaceC4339a) objM87133R14, c28655q, i37, 2);
                            c15568iM8392k3 = c2885g.getLoginErrorState();
                            if (c15568iM8392k3 != null) {
                                displayType2 = c15568iM8392k3.getDisplayType();
                            } else {
                                displayType2 = null;
                            }
                            if (displayType2 == enumC15567h2) {
                                c28655q.m87150e0(112357736);
                                f14 = f13;
                                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                                c2314t2 = c2314t;
                                EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_INFORMATION;
                                TextResource loginErrorTitle4 = c2885g.getLoginErrorState().getLoginErrorTitle();
                                objM87133R16 = c28655q.m87133R();
                                if (objM87133R16 == c28676v2) {
                                    objM87133R16 = f.f11483w;
                                    c28655q.m87172p0(objM87133R16);
                                }
                                InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) objM87133R16);
                                objM87133R17 = c28655q.m87133R();
                                if (objM87133R17 == c28676v2) {
                                    objM87133R17 = c.f11480w;
                                    c28655q.m87172p0(objM87133R17);
                                }
                                AbstractC4106r2.m12647f(modifierM3398t5, new C4092p2(enumC16313m2, 0.0f, null, null, loginErrorTitle4, null, interfaceC39332eM125323a3, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                                c28655q.m87173q(false);
                            } else {
                                f14 = f13;
                                c2314t2 = c2314t;
                                c28655q.m87150e0(112831509);
                                c28655q.m87173q(false);
                            }
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                            c28655q.m87173q(true);
                            C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            Modifier modifierM3394p3 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                            String strM21273g3 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                            if (i26 == 32) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R15 = c28655q.m87133R();
                            if (z44) {
                                objM87133R15 = new C27314o(function8, 16);
                                c28655q.m87172p0(objM87133R15);
                            } else {
                                objM87133R15 = new C27314o(function8, 16);
                                c28655q.m87172p0(objM87133R15);
                            }
                            AbstractC27242b1.m82092d(c27270o3, strM21273g3, modifierM3394p3, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                            c28655q2 = c28655q;
                            c28655q2.m87173q(true);
                            function3 = function8;
                        } else {
                            c2885g = viewState;
                        }
                        z39 = z46 | z38;
                        objM87133R14 = c28655q.m87133R();
                        if (z39) {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC22287p.m64027d(textResourceM8388g2, null, (InterfaceC4339a) objM87133R14, c28655q, i37, 2);
                        c15568iM8392k3 = c2885g.getLoginErrorState();
                        if (c15568iM8392k3 != null) {
                            displayType2 = c15568iM8392k3.getDisplayType();
                        } else {
                            displayType2 = null;
                        }
                        if (displayType2 == enumC15567h2) {
                            c28655q.m87150e0(112357736);
                            f14 = f13;
                            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                            c2314t2 = c2314t;
                            EnumC16313m0 enumC16313m3 = EnumC16313m0.TINY_INFORMATION;
                            TextResource loginErrorTitle5 = c2885g.getLoginErrorState().getLoginErrorTitle();
                            objM87133R16 = c28655q.m87133R();
                            if (objM87133R16 == c28676v2) {
                                objM87133R16 = f.f11483w;
                                c28655q.m87172p0(objM87133R16);
                            }
                            InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) objM87133R16);
                            objM87133R17 = c28655q.m87133R();
                            if (objM87133R17 == c28676v2) {
                                objM87133R17 = c.f11480w;
                                c28655q.m87172p0(objM87133R17);
                            }
                            AbstractC4106r2.m12647f(modifierM3398t6, new C4092p2(enumC16313m3, 0.0f, null, null, loginErrorTitle5, null, interfaceC39332eM125323a4, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(false);
                        } else {
                            f14 = f13;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(112831509);
                            c28655q.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                        c28655q.m87173q(true);
                        C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierM3394p4 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                        String strM21273g4 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                        if (i26 == 32) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R15 = c28655q.m87133R();
                        if (z44) {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC27242b1.m82092d(c27270o4, strM21273g4, modifierM3394p4, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        function3 = function8;
                    } else {
                        c2885g2 = viewState;
                    }
                    z25 = z19;
                    z26 = z24 | z25;
                    objM87133R10 = c28655q2.m87133R();
                    if (z26) {
                        function6 = function5;
                        interfaceC28601c8 = interfaceC28601c6;
                        objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        function6 = function5;
                        interfaceC28601c8 = interfaceC28601c6;
                        objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM51775c, (Function1) objM87133R10);
                    TextResource textResourceM8390i2 = c2885g2.getHint();
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
                    if (m8346C(interfaceC28601c2)) {
                        c29885s = new C29885s();
                    } else {
                        c29885s = C29871f0.f122092w;
                    }
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z27 = true;
                    } else {
                        z27 = z19;
                    }
                    if (z27) {
                        if (m8344A(interfaceC28601c5).length() > 0) {
                            z28 = true;
                        } else {
                            z28 = z19;
                        }
                        if (z28) {
                        }
                        c28655q2.m87150e0(109851664);
                        c28655q2.m87173q(z19);
                        aVar = null;
                    } else {
                        if (m8344A(interfaceC28601c5).length() > 0) {
                            z28 = true;
                        } else {
                            z28 = z19;
                        }
                        if (z28) {
                        }
                        c28655q2.m87150e0(109851664);
                        c28655q2.m87173q(z19);
                        aVar = null;
                    }
                    zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    Function1 function11 = (Function1) objM87133R11;
                    C34348q0 c34348q2 = new C34348q0(function11, function11, function11, function11, function11, function11);
                    if (c2885g2.getLoginErrorState() != null) {
                        textResourceM21272f = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                    }
                    if (c2885g2.getErrorMessage() == null) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    if (i26 == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i27 != 4) {
                        z35 = true;
                    } else {
                        z35 = true;
                    }
                    z36 = z34 | z35;
                    objM87133R12 = c28655q2.m87133R();
                    if (z36) {
                        objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R12;
                    if (i26 == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z37) {
                        objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    int i38 = TextResource.$stable;
                    c28655q = c28655q2;
                    function7 = function6;
                    AbstractC22273b.m63999c(modifierM3484c2, textResourceM8390i2, textResourceM21278l2, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q2, 7, interfaceC4339a4, (Function1) objM87133R13, c28655q, (i38 << 3) | 3072 | (i38 << 6) | (AbstractC30784c.a.f126785f << 15) | (i38 << 18), 24582, 6912);
                    TextResource textResourceM8388g3 = viewState.getForgotPasswordText();
                    if (i26 == 32) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    if (i27 != 4) {
                        c2885g = viewState;
                        if ((i15 & 8) == 0) {
                        }
                        z39 = z46 | z38;
                        objM87133R14 = c28655q.m87133R();
                        if (z39) {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC22287p.m64027d(textResourceM8388g3, null, (InterfaceC4339a) objM87133R14, c28655q, i38, 2);
                        c15568iM8392k3 = c2885g.getLoginErrorState();
                        if (c15568iM8392k3 != null) {
                            displayType2 = c15568iM8392k3.getDisplayType();
                        } else {
                            displayType2 = null;
                        }
                        if (displayType2 == enumC15567h2) {
                            c28655q.m87150e0(112357736);
                            f14 = f13;
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                            c2314t2 = c2314t;
                            EnumC16313m0 enumC16313m4 = EnumC16313m0.TINY_INFORMATION;
                            TextResource loginErrorTitle6 = c2885g.getLoginErrorState().getLoginErrorTitle();
                            objM87133R16 = c28655q.m87133R();
                            if (objM87133R16 == c28676v2) {
                                objM87133R16 = f.f11483w;
                                c28655q.m87172p0(objM87133R16);
                            }
                            InterfaceC39332e interfaceC39332eM125323a5 = p745y81.Function1.m125323a((Function1) objM87133R16);
                            objM87133R17 = c28655q.m87133R();
                            if (objM87133R17 == c28676v2) {
                                objM87133R17 = c.f11480w;
                                c28655q.m87172p0(objM87133R17);
                            }
                            AbstractC4106r2.m12647f(modifierM3398t7, new C4092p2(enumC16313m4, 0.0f, null, null, loginErrorTitle6, null, interfaceC39332eM125323a5, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(false);
                        } else {
                            f14 = f13;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(112831509);
                            c28655q.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                        c28655q.m87173q(true);
                        C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierM3394p5 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                        String strM21273g5 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                        if (i26 == 32) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R15 = c28655q.m87133R();
                        if (z44) {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC27242b1.m82092d(c27270o5, strM21273g5, modifierM3394p5, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        function3 = function8;
                    } else {
                        c2885g = viewState;
                    }
                    z39 = z46 | z38;
                    objM87133R14 = c28655q.m87133R();
                    if (z39) {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC22287p.m64027d(textResourceM8388g3, null, (InterfaceC4339a) objM87133R14, c28655q, i38, 2);
                    c15568iM8392k3 = c2885g.getLoginErrorState();
                    if (c15568iM8392k3 != null) {
                        displayType2 = c15568iM8392k3.getDisplayType();
                    } else {
                        displayType2 = null;
                    }
                    if (displayType2 == enumC15567h2) {
                        c28655q.m87150e0(112357736);
                        f14 = f13;
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                        c2314t2 = c2314t;
                        EnumC16313m0 enumC16313m5 = EnumC16313m0.TINY_INFORMATION;
                        TextResource loginErrorTitle7 = c2885g.getLoginErrorState().getLoginErrorTitle();
                        objM87133R16 = c28655q.m87133R();
                        if (objM87133R16 == c28676v2) {
                            objM87133R16 = f.f11483w;
                            c28655q.m87172p0(objM87133R16);
                        }
                        InterfaceC39332e interfaceC39332eM125323a6 = p745y81.Function1.m125323a((Function1) objM87133R16);
                        objM87133R17 = c28655q.m87133R();
                        if (objM87133R17 == c28676v2) {
                            objM87133R17 = c.f11480w;
                            c28655q.m87172p0(objM87133R17);
                        }
                        AbstractC4106r2.m12647f(modifierM3398t8, new C4092p2(enumC16313m5, 0.0f, null, null, loginErrorTitle7, null, interfaceC39332eM125323a6, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                    } else {
                        f14 = f13;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(112831509);
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                    c28655q.m87173q(true);
                    C27270o c27270o6 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierM3394p6 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                    String strM21273g6 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                    if (i26 == 32) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R15 = c28655q.m87133R();
                    if (z44) {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC27242b1.m82092d(c27270o6, strM21273g6, modifierM3394p6, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    function3 = function8;
                } else {
                    c2885g2 = viewState;
                }
                z25 = true;
                z26 = z24 | z25;
                objM87133R10 = c28655q2.m87133R();
                if (z26) {
                    function6 = function5;
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    function6 = function5;
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3484c3 = AbstractC1126a.m3484c(modifierM51775c, (Function1) objM87133R10);
                TextResource textResourceM8390i3 = c2885g2.getHint();
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
                if (m8346C(interfaceC28601c2)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m8344A(interfaceC28601c5).length() > 0) {
                    z27 = true;
                } else {
                    z27 = z19;
                }
                if (z27) {
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z28 = true;
                    } else {
                        z28 = z19;
                    }
                    if (z28) {
                    }
                    c28655q2.m87150e0(109851664);
                    c28655q2.m87173q(z19);
                    aVar = null;
                } else {
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z28 = true;
                    } else {
                        z28 = z19;
                    }
                    if (z28) {
                    }
                    c28655q2.m87150e0(109851664);
                    c28655q2.m87173q(z19);
                    aVar = null;
                }
                zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                Function1 function12 = (Function1) objM87133R11;
                C34348q0 c34348q3 = new C34348q0(function12, function12, function12, function12, function12, function12);
                if (c2885g2.getLoginErrorState() != null) {
                    textResourceM21272f = AbstractC8693b.m21267a();
                } else {
                    textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                }
                if (c2885g2.getErrorMessage() == null) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                if (i26 == 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i27 != 4) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                z36 = z34 | z35;
                objM87133R12 = c28655q2.m87133R();
                if (z36) {
                    objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R12);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R12;
                if (i26 == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R13 = c28655q2.m87133R();
                if (z37) {
                    objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R13);
                }
                int i39 = TextResource.$stable;
                c28655q = c28655q2;
                function7 = function6;
                AbstractC22273b.m63999c(modifierM3484c3, textResourceM8390i3, textResourceM21278l3, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q3, 7, interfaceC4339a5, (Function1) objM87133R13, c28655q, (i39 << 3) | 3072 | (i39 << 6) | (AbstractC30784c.a.f126785f << 15) | (i39 << 18), 24582, 6912);
                TextResource textResourceM8388g4 = viewState.getForgotPasswordText();
                if (i26 == 32) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                if (i27 != 4) {
                    c2885g = viewState;
                    if ((i15 & 8) == 0) {
                    }
                    z39 = z46 | z38;
                    objM87133R14 = c28655q.m87133R();
                    if (z39) {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC22287p.m64027d(textResourceM8388g4, null, (InterfaceC4339a) objM87133R14, c28655q, i39, 2);
                    c15568iM8392k3 = c2885g.getLoginErrorState();
                    if (c15568iM8392k3 != null) {
                        displayType2 = c15568iM8392k3.getDisplayType();
                    } else {
                        displayType2 = null;
                    }
                    if (displayType2 == enumC15567h2) {
                        c28655q.m87150e0(112357736);
                        f14 = f13;
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                        c2314t2 = c2314t;
                        EnumC16313m0 enumC16313m6 = EnumC16313m0.TINY_INFORMATION;
                        TextResource loginErrorTitle8 = c2885g.getLoginErrorState().getLoginErrorTitle();
                        objM87133R16 = c28655q.m87133R();
                        if (objM87133R16 == c28676v2) {
                            objM87133R16 = f.f11483w;
                            c28655q.m87172p0(objM87133R16);
                        }
                        InterfaceC39332e interfaceC39332eM125323a7 = p745y81.Function1.m125323a((Function1) objM87133R16);
                        objM87133R17 = c28655q.m87133R();
                        if (objM87133R17 == c28676v2) {
                            objM87133R17 = c.f11480w;
                            c28655q.m87172p0(objM87133R17);
                        }
                        AbstractC4106r2.m12647f(modifierM3398t9, new C4092p2(enumC16313m6, 0.0f, null, null, loginErrorTitle8, null, interfaceC39332eM125323a7, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                    } else {
                        f14 = f13;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(112831509);
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                    c28655q.m87173q(true);
                    C27270o c27270o7 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierM3394p7 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                    String strM21273g7 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                    if (i26 == 32) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R15 = c28655q.m87133R();
                    if (z44) {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC27242b1.m82092d(c27270o7, strM21273g7, modifierM3394p7, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    function3 = function8;
                } else {
                    c2885g = viewState;
                }
                z39 = z46 | z38;
                objM87133R14 = c28655q.m87133R();
                if (z39) {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC22287p.m64027d(textResourceM8388g4, null, (InterfaceC4339a) objM87133R14, c28655q, i39, 2);
                c15568iM8392k3 = c2885g.getLoginErrorState();
                if (c15568iM8392k3 != null) {
                    displayType2 = c15568iM8392k3.getDisplayType();
                } else {
                    displayType2 = null;
                }
                if (displayType2 == enumC15567h2) {
                    c28655q.m87150e0(112357736);
                    f14 = f13;
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2314t2 = c2314t;
                    EnumC16313m0 enumC16313m7 = EnumC16313m0.TINY_INFORMATION;
                    TextResource loginErrorTitle9 = c2885g.getLoginErrorState().getLoginErrorTitle();
                    objM87133R16 = c28655q.m87133R();
                    if (objM87133R16 == c28676v2) {
                        objM87133R16 = f.f11483w;
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC39332e interfaceC39332eM125323a8 = p745y81.Function1.m125323a((Function1) objM87133R16);
                    objM87133R17 = c28655q.m87133R();
                    if (objM87133R17 == c28676v2) {
                        objM87133R17 = c.f11480w;
                        c28655q.m87172p0(objM87133R17);
                    }
                    AbstractC4106r2.m12647f(modifierM3398t10, new C4092p2(enumC16313m7, 0.0f, null, null, loginErrorTitle9, null, interfaceC39332eM125323a8, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                    c28655q.m87173q(false);
                } else {
                    f14 = f13;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(112831509);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f15, c2314t2));
                c28655q.m87173q(true);
                C27270o c27270o8 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierM3394p8 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                String strM21273g8 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                if (i26 == 32) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R15 = c28655q.m87133R();
                if (z44) {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                }
                AbstractC27242b1.m82092d(c27270o8, strM21273g8, modifierM3394p8, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                function3 = function8;
            } else {
                c2885g = viewState;
                c28655q2.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c2885g, i13, function3, i14, 11);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R18 = c28655q2.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = new C2783a(6);
                    c28655q2.m87172p0(objM87133R18);
                }
                function4 = (Function1) objM87133R18;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getPasswordPrefill().getValue());
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getHidePassword()));
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                if (m8344A(interfaceC28601c1).length() >= 6) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                objM87133R3 = AbstractC31061c.m95647w(z45, c28655q2);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q2, 0);
            i16 = 6;
            String value2 = viewState.getPasswordPrefill().getValue();
            i17 = i15 & 14;
            if (i17 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            objM87133R5 = c28655q2.m87133R();
            i18 = i17;
            if (z13) {
                objM87133R5 = new a(viewState, interfaceC28601c1, interfaceC28601c3, null);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(viewState, interfaceC28601c1, interfaceC28601c3, null);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R5, value2);
            c15568iM8392k = viewState.getLoginErrorState();
            if (c15568iM8392k != null) {
                displayType = c15568iM8392k.getDisplayType();
            } else {
                displayType = null;
            }
            enumC15567h = EnumC15567h.ALERT_TILE;
            if (displayType == enumC15567h) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (m8348E(interfaceC28601c3)) {
                z15 = false;
            } else {
                z15 = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            interfaceC28601c5 = interfaceC28601c1;
            i19 = i15 & 112;
            if (i19 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87155h = z16 | c28655q2.m87155h(z15);
            objM87133R6 = c28655q2.m87133R();
            if (zM87155h) {
                objM87133R6 = new b(function4, z15, null);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new b(function4, z15, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, boolValueOf2);
            c15568iM8392k2 = viewState.getLoginErrorState();
            if (c15568iM8392k2 == null) {
                c28655q2.m87150e0(-2010147378);
                c28655q2.m87173q(false);
                i15 = i15;
                function5 = function4;
                i25 = i19;
                c28676v1 = c28676v0;
                z19 = false;
                interfaceC28601c6 = interfaceC28601c3;
                enumC15567h2 = enumC15567h;
                interfaceC28601c7 = interfaceC28601c4;
                interfaceC15237i2 = interfaceC15237i;
                i18 = i18;
                interfaceC28601c5 = interfaceC28601c5;
                i16 = 6;
            } else {
                c28655q2.m87150e0(-2010147377);
                function4.invoke(new InterfaceC17002b.a(viewState.getAnalyticsName(), "inline_error", c15568iM8392k2.getAnalyticsName(), "authentication"));
                i24 = g.f11484a[c15568iM8392k2.getDisplayType().ordinal()];
                if (i24 != 1) {
                    c28655q2.m87150e0(-269747334);
                    TextResource loginErrorTitle10 = c15568iM8392k2.getLoginErrorTitle();
                    TextResource loginErrorDescription2 = c15568iM8392k2.getLoginErrorDescription();
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC38022b.f162873N, null, 2, null);
                    if (i19 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q2.m87157i(c15568iM8392k2);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i) {
                        final int i210 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: b90.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                    default:
                                        return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        final int i211 = 0;
                        objM87133R7 = new InterfaceC4339a() { // from class: b90.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211) {
                                    case 0:
                                        return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                    default:
                                        return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R7;
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | c28655q2.m87157i(c15568iM8392k2);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i2) {
                        final int i310 = 1;
                        objM87133R8 = new InterfaceC4339a() { // from class: b90.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i310) {
                                    case 0:
                                        return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                    default:
                                        return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        final int i311 = 1;
                        objM87133R8 = new InterfaceC4339a() { // from class: b90.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311) {
                                    case 0:
                                        return AbstractC2884f.m8369q(function4, c15568iM8392k2);
                                    default:
                                        return AbstractC2884f.m8370r(function4, c15568iM8392k2);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R8);
                    }
                    int i312 = TextResource.$stable;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    interfaceC15237i2 = interfaceC15237i;
                    z19 = false;
                    interfaceC28601c6 = interfaceC28601c3;
                    enumC15567h2 = enumC15567h;
                    interfaceC28601c7 = interfaceC28601c4;
                    i25 = i19;
                    AbstractC21211n.m59497o(null, loginErrorTitle10, loginErrorDescription2, c8688b2, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a6, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i312 << 6) | (i312 << 3) | (TextResource.C8688b.f25889c << 9), 384, 0, 247459825);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    if (i24 == 2) {
                        throw AbstractC11895b.m32003v(-1117082479, c28655q2, false);
                    }
                    c28655q2.m87150e0(-269166270);
                    c28655q2.m87173q(false);
                    z19 = false;
                    function5 = function4;
                    i25 = i19;
                    c28676v1 = c28676v0;
                    interfaceC28601c6 = interfaceC28601c3;
                    enumC15567h2 = enumC15567h;
                    interfaceC28601c7 = interfaceC28601c4;
                    interfaceC15237i2 = interfaceC15237i;
                }
                c28655q2.m87173q(z19);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z19);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            float f18 = 8;
            f13 = 2 * f18;
            Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f18, f13, 0.0f, 8);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, i16);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            if (m8368p(interfaceC28670t2M64044h)) {
                c28655q2.m87150e0(107618828);
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
                c28655q2.m87173q(z19);
            } else {
                c28655q2.m87150e0(107811989);
                c28655q2.m87173q(z19);
            }
            Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, 0.0f, 3 * f18, 0.0f, 0.0f, 13);
            objM87133R9 = c28655q2.m87133R();
            c28676v2 = c28676v1;
            if (objM87133R9 == c28676v2) {
                objM87133R9 = new C2783a(7);
                c28655q2.m87172p0(objM87133R9);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3398t12, z19, (Function1) objM87133R9);
            i26 = i25;
            if (i26 == 32) {
                z24 = true;
            } else {
                z24 = z19;
            }
            i27 = i18;
            if (i27 != 4) {
                if ((i15 & 8) != 0) {
                    c2885g2 = viewState;
                    if (c28655q2.m87157i(c2885g2)) {
                    }
                    z26 = z24 | z25;
                    objM87133R10 = c28655q2.m87133R();
                    if (z26) {
                        function6 = function5;
                        interfaceC28601c8 = interfaceC28601c6;
                        objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        function6 = function5;
                        interfaceC28601c8 = interfaceC28601c6;
                        objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Modifier modifierM3484c4 = AbstractC1126a.m3484c(modifierM51775c2, (Function1) objM87133R10);
                    TextResource textResourceM8390i4 = c2885g2.getHint();
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
                    if (m8346C(interfaceC28601c2)) {
                        c29885s = new C29885s();
                    } else {
                        c29885s = C29871f0.f122092w;
                    }
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z27 = true;
                    } else {
                        z27 = z19;
                    }
                    if (z27) {
                        if (m8344A(interfaceC28601c5).length() > 0) {
                            z28 = true;
                        } else {
                            z28 = z19;
                        }
                        if (z28) {
                        }
                        c28655q2.m87150e0(109851664);
                        c28655q2.m87173q(z19);
                        aVar = null;
                    } else {
                        if (m8344A(interfaceC28601c5).length() > 0) {
                            z28 = true;
                        } else {
                            z28 = z19;
                        }
                        if (z28) {
                        }
                        c28655q2.m87150e0(109851664);
                        c28655q2.m87173q(z19);
                        aVar = null;
                    }
                    zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    Function1 function13 = (Function1) objM87133R11;
                    C34348q0 c34348q4 = new C34348q0(function13, function13, function13, function13, function13, function13);
                    if (c2885g2.getLoginErrorState() != null) {
                        textResourceM21272f = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                    }
                    if (c2885g2.getErrorMessage() == null) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    if (i26 == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i27 != 4) {
                        z35 = true;
                    } else {
                        z35 = true;
                    }
                    z36 = z34 | z35;
                    objM87133R12 = c28655q2.m87133R();
                    if (z36) {
                        objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R12;
                    if (i26 == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z37) {
                        objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    int i313 = TextResource.$stable;
                    c28655q = c28655q2;
                    function7 = function6;
                    AbstractC22273b.m63999c(modifierM3484c4, textResourceM8390i4, textResourceM21278l4, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q4, 7, interfaceC4339a7, (Function1) objM87133R13, c28655q, (i313 << 3) | 3072 | (i313 << 6) | (AbstractC30784c.a.f126785f << 15) | (i313 << 18), 24582, 6912);
                    TextResource textResourceM8388g5 = viewState.getForgotPasswordText();
                    if (i26 == 32) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    if (i27 != 4) {
                        c2885g = viewState;
                        if ((i15 & 8) == 0) {
                        }
                        z39 = z46 | z38;
                        objM87133R14 = c28655q.m87133R();
                        if (z39) {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            function8 = function7;
                            objM87133R14 = new C17820i(20, function8, c2885g);
                            c28655q.m87172p0(objM87133R14);
                        }
                        AbstractC22287p.m64027d(textResourceM8388g5, null, (InterfaceC4339a) objM87133R14, c28655q, i313, 2);
                        c15568iM8392k3 = c2885g.getLoginErrorState();
                        if (c15568iM8392k3 != null) {
                            displayType2 = c15568iM8392k3.getDisplayType();
                        } else {
                            displayType2 = null;
                        }
                        if (displayType2 == enumC15567h2) {
                            c28655q.m87150e0(112357736);
                            f14 = f13;
                            Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                            c2314t2 = c2314t;
                            EnumC16313m0 enumC16313m8 = EnumC16313m0.TINY_INFORMATION;
                            TextResource loginErrorTitle11 = c2885g.getLoginErrorState().getLoginErrorTitle();
                            objM87133R16 = c28655q.m87133R();
                            if (objM87133R16 == c28676v2) {
                                objM87133R16 = f.f11483w;
                                c28655q.m87172p0(objM87133R16);
                            }
                            InterfaceC39332e interfaceC39332eM125323a9 = p745y81.Function1.m125323a((Function1) objM87133R16);
                            objM87133R17 = c28655q.m87133R();
                            if (objM87133R17 == c28676v2) {
                                objM87133R17 = c.f11480w;
                                c28655q.m87172p0(objM87133R17);
                            }
                            AbstractC4106r2.m12647f(modifierM3398t13, new C4092p2(enumC16313m8, 0.0f, null, null, loginErrorTitle11, null, interfaceC39332eM125323a9, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(false);
                        } else {
                            f14 = f13;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(112831509);
                            c28655q.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
                        c28655q.m87173q(true);
                        C27270o c27270o9 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierM3394p9 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                        String strM21273g9 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                        if (i26 == 32) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R15 = c28655q.m87133R();
                        if (z44) {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        } else {
                            objM87133R15 = new C27314o(function8, 16);
                            c28655q.m87172p0(objM87133R15);
                        }
                        AbstractC27242b1.m82092d(c27270o9, strM21273g9, modifierM3394p9, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        function3 = function8;
                    } else {
                        c2885g = viewState;
                    }
                    z39 = z46 | z38;
                    objM87133R14 = c28655q.m87133R();
                    if (z39) {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC22287p.m64027d(textResourceM8388g5, null, (InterfaceC4339a) objM87133R14, c28655q, i313, 2);
                    c15568iM8392k3 = c2885g.getLoginErrorState();
                    if (c15568iM8392k3 != null) {
                        displayType2 = c15568iM8392k3.getDisplayType();
                    } else {
                        displayType2 = null;
                    }
                    if (displayType2 == enumC15567h2) {
                        c28655q.m87150e0(112357736);
                        f14 = f13;
                        Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                        c2314t2 = c2314t;
                        EnumC16313m0 enumC16313m9 = EnumC16313m0.TINY_INFORMATION;
                        TextResource loginErrorTitle12 = c2885g.getLoginErrorState().getLoginErrorTitle();
                        objM87133R16 = c28655q.m87133R();
                        if (objM87133R16 == c28676v2) {
                            objM87133R16 = f.f11483w;
                            c28655q.m87172p0(objM87133R16);
                        }
                        InterfaceC39332e interfaceC39332eM125323a10 = p745y81.Function1.m125323a((Function1) objM87133R16);
                        objM87133R17 = c28655q.m87133R();
                        if (objM87133R17 == c28676v2) {
                            objM87133R17 = c.f11480w;
                            c28655q.m87172p0(objM87133R17);
                        }
                        AbstractC4106r2.m12647f(modifierM3398t14, new C4092p2(enumC16313m9, 0.0f, null, null, loginErrorTitle12, null, interfaceC39332eM125323a10, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                    } else {
                        f14 = f13;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(112831509);
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
                    c28655q.m87173q(true);
                    C27270o c27270o10 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierM3394p10 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                    String strM21273g10 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                    if (i26 == 32) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R15 = c28655q.m87133R();
                    if (z44) {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC27242b1.m82092d(c27270o10, strM21273g10, modifierM3394p10, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    function3 = function8;
                } else {
                    c2885g2 = viewState;
                }
                z25 = z19;
                z26 = z24 | z25;
                objM87133R10 = c28655q2.m87133R();
                if (z26) {
                    function6 = function5;
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    function6 = function5;
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R10);
                }
                Modifier modifierM3484c5 = AbstractC1126a.m3484c(modifierM51775c2, (Function1) objM87133R10);
                TextResource textResourceM8390i5 = c2885g2.getHint();
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
                if (m8346C(interfaceC28601c2)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m8344A(interfaceC28601c5).length() > 0) {
                    z27 = true;
                } else {
                    z27 = z19;
                }
                if (z27) {
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z28 = true;
                    } else {
                        z28 = z19;
                    }
                    if (z28) {
                    }
                    c28655q2.m87150e0(109851664);
                    c28655q2.m87173q(z19);
                    aVar = null;
                } else {
                    if (m8344A(interfaceC28601c5).length() > 0) {
                        z28 = true;
                    } else {
                        z28 = z19;
                    }
                    if (z28) {
                    }
                    c28655q2.m87150e0(109851664);
                    c28655q2.m87173q(z19);
                    aVar = null;
                }
                zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                Function1 function14 = (Function1) objM87133R11;
                C34348q0 c34348q5 = new C34348q0(function14, function14, function14, function14, function14, function14);
                if (c2885g2.getLoginErrorState() != null) {
                    textResourceM21272f = AbstractC8693b.m21267a();
                } else {
                    textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
                }
                if (c2885g2.getErrorMessage() == null) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                if (i26 == 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i27 != 4) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                z36 = z34 | z35;
                objM87133R12 = c28655q2.m87133R();
                if (z36) {
                    objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                    c28655q2.m87172p0(objM87133R12);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R12;
                if (i26 == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R13 = c28655q2.m87133R();
                if (z37) {
                    objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                    c28655q2.m87172p0(objM87133R13);
                }
                int i314 = TextResource.$stable;
                c28655q = c28655q2;
                function7 = function6;
                AbstractC22273b.m63999c(modifierM3484c5, textResourceM8390i5, textResourceM21278l5, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q5, 7, interfaceC4339a8, (Function1) objM87133R13, c28655q, (i314 << 3) | 3072 | (i314 << 6) | (AbstractC30784c.a.f126785f << 15) | (i314 << 18), 24582, 6912);
                TextResource textResourceM8388g6 = viewState.getForgotPasswordText();
                if (i26 == 32) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                if (i27 != 4) {
                    c2885g = viewState;
                    if ((i15 & 8) == 0) {
                    }
                    z39 = z46 | z38;
                    objM87133R14 = c28655q.m87133R();
                    if (z39) {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        function8 = function7;
                        objM87133R14 = new C17820i(20, function8, c2885g);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC22287p.m64027d(textResourceM8388g6, null, (InterfaceC4339a) objM87133R14, c28655q, i314, 2);
                    c15568iM8392k3 = c2885g.getLoginErrorState();
                    if (c15568iM8392k3 != null) {
                        displayType2 = c15568iM8392k3.getDisplayType();
                    } else {
                        displayType2 = null;
                    }
                    if (displayType2 == enumC15567h2) {
                        c28655q.m87150e0(112357736);
                        f14 = f13;
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                        c2314t2 = c2314t;
                        EnumC16313m0 enumC16313m10 = EnumC16313m0.TINY_INFORMATION;
                        TextResource loginErrorTitle13 = c2885g.getLoginErrorState().getLoginErrorTitle();
                        objM87133R16 = c28655q.m87133R();
                        if (objM87133R16 == c28676v2) {
                            objM87133R16 = f.f11483w;
                            c28655q.m87172p0(objM87133R16);
                        }
                        InterfaceC39332e interfaceC39332eM125323a11 = p745y81.Function1.m125323a((Function1) objM87133R16);
                        objM87133R17 = c28655q.m87133R();
                        if (objM87133R17 == c28676v2) {
                            objM87133R17 = c.f11480w;
                            c28655q.m87172p0(objM87133R17);
                        }
                        AbstractC4106r2.m12647f(modifierM3398t15, new C4092p2(enumC16313m10, 0.0f, null, null, loginErrorTitle13, null, interfaceC39332eM125323a11, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                    } else {
                        f14 = f13;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(112831509);
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
                    c28655q.m87173q(true);
                    C27270o c27270o11 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierM3394p11 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                    String strM21273g11 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                    if (i26 == 32) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R15 = c28655q.m87133R();
                    if (z44) {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C27314o(function8, 16);
                        c28655q.m87172p0(objM87133R15);
                    }
                    AbstractC27242b1.m82092d(c27270o11, strM21273g11, modifierM3394p11, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    function3 = function8;
                } else {
                    c2885g = viewState;
                }
                z39 = z46 | z38;
                objM87133R14 = c28655q.m87133R();
                if (z39) {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC22287p.m64027d(textResourceM8388g6, null, (InterfaceC4339a) objM87133R14, c28655q, i314, 2);
                c15568iM8392k3 = c2885g.getLoginErrorState();
                if (c15568iM8392k3 != null) {
                    displayType2 = c15568iM8392k3.getDisplayType();
                } else {
                    displayType2 = null;
                }
                if (displayType2 == enumC15567h2) {
                    c28655q.m87150e0(112357736);
                    f14 = f13;
                    Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2314t2 = c2314t;
                    EnumC16313m0 enumC16313m11 = EnumC16313m0.TINY_INFORMATION;
                    TextResource loginErrorTitle14 = c2885g.getLoginErrorState().getLoginErrorTitle();
                    objM87133R16 = c28655q.m87133R();
                    if (objM87133R16 == c28676v2) {
                        objM87133R16 = f.f11483w;
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC39332e interfaceC39332eM125323a12 = p745y81.Function1.m125323a((Function1) objM87133R16);
                    objM87133R17 = c28655q.m87133R();
                    if (objM87133R17 == c28676v2) {
                        objM87133R17 = c.f11480w;
                        c28655q.m87172p0(objM87133R17);
                    }
                    AbstractC4106r2.m12647f(modifierM3398t16, new C4092p2(enumC16313m11, 0.0f, null, null, loginErrorTitle14, null, interfaceC39332eM125323a12, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                    c28655q.m87173q(false);
                } else {
                    f14 = f13;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(112831509);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
                c28655q.m87173q(true);
                C27270o c27270o12 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierM3394p12 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                String strM21273g12 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                if (i26 == 32) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R15 = c28655q.m87133R();
                if (z44) {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                }
                AbstractC27242b1.m82092d(c27270o12, strM21273g12, modifierM3394p12, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                function3 = function8;
            } else {
                c2885g2 = viewState;
            }
            z25 = true;
            z26 = z24 | z25;
            objM87133R10 = c28655q2.m87133R();
            if (z26) {
                function6 = function5;
                interfaceC28601c8 = interfaceC28601c6;
                objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                c28655q2.m87172p0(objM87133R10);
            } else {
                function6 = function5;
                interfaceC28601c8 = interfaceC28601c6;
                objM87133R10 = new C1042s(function6, c2885g2, interfaceC28601c7, interfaceC28601c8);
                c28655q2.m87172p0(objM87133R10);
            }
            Modifier modifierM3484c6 = AbstractC1126a.m3484c(modifierM51775c2, (Function1) objM87133R10);
            TextResource textResourceM8390i6 = c2885g2.getHint();
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(m8344A(interfaceC28601c5));
            if (m8346C(interfaceC28601c2)) {
                c29885s = new C29885s();
            } else {
                c29885s = C29871f0.f122092w;
            }
            if (m8344A(interfaceC28601c5).length() > 0) {
                z27 = true;
            } else {
                z27 = z19;
            }
            if (z27) {
                if (m8344A(interfaceC28601c5).length() > 0) {
                    z28 = true;
                } else {
                    z28 = z19;
                }
                if (z28) {
                }
                c28655q2.m87150e0(109851664);
                c28655q2.m87173q(z19);
                aVar = null;
            } else {
                if (m8344A(interfaceC28601c5).length() > 0) {
                    z28 = true;
                } else {
                    z28 = z19;
                }
                if (z28) {
                }
                c28655q2.m87150e0(109851664);
                c28655q2.m87173q(z19);
                aVar = null;
            }
            zM87157i3 = c28655q2.m87157i(interfaceC15237i2);
            objM87133R11 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C2564l1(interfaceC15237i2, 1);
                c28655q2.m87172p0(objM87133R11);
            }
            Function1 function15 = (Function1) objM87133R11;
            C34348q0 c34348q6 = new C34348q0(function15, function15, function15, function15, function15, function15);
            if (c2885g2.getLoginErrorState() != null) {
                textResourceM21272f = AbstractC8693b.m21267a();
            } else {
                textResourceM21272f = AbstractC8693b.m21272f(c2885g2.getErrorMessage());
            }
            if (c2885g2.getErrorMessage() == null) {
                z29 = false;
            } else {
                z29 = false;
            }
            if (i26 == 32) {
                z34 = true;
            } else {
                z34 = false;
            }
            if (i27 != 4) {
                z35 = true;
            } else {
                z35 = true;
            }
            z36 = z34 | z35;
            objM87133R12 = c28655q2.m87133R();
            if (z36) {
                objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                c28655q2.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C3718c(function6, c2885g2, interfaceC28601c2, 9);
                c28655q2.m87172p0(objM87133R12);
            }
            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R12;
            if (i26 == 32) {
                z37 = true;
            } else {
                z37 = false;
            }
            objM87133R13 = c28655q2.m87133R();
            if (z37) {
                objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                c28655q2.m87172p0(objM87133R13);
            } else {
                objM87133R13 = new C2883e(0, function6, interfaceC28601c5, interfaceC28601c8);
                c28655q2.m87172p0(objM87133R13);
            }
            int i315 = TextResource.$stable;
            c28655q = c28655q2;
            function7 = function6;
            AbstractC22273b.m63999c(modifierM3484c6, textResourceM8390i6, textResourceM21278l6, 7, c29885s, aVar, textResourceM21272f, z29, false, false, "password_field_tag", 0L, null, c34348q6, 7, interfaceC4339a9, (Function1) objM87133R13, c28655q, (i315 << 3) | 3072 | (i315 << 6) | (AbstractC30784c.a.f126785f << 15) | (i315 << 18), 24582, 6912);
            TextResource textResourceM8388g7 = viewState.getForgotPasswordText();
            if (i26 == 32) {
                z38 = true;
            } else {
                z38 = false;
            }
            if (i27 != 4) {
                c2885g = viewState;
                if ((i15 & 8) == 0) {
                }
                z39 = z46 | z38;
                objM87133R14 = c28655q.m87133R();
                if (z39) {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    function8 = function7;
                    objM87133R14 = new C17820i(20, function8, c2885g);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC22287p.m64027d(textResourceM8388g7, null, (InterfaceC4339a) objM87133R14, c28655q, i315, 2);
                c15568iM8392k3 = c2885g.getLoginErrorState();
                if (c15568iM8392k3 != null) {
                    displayType2 = c15568iM8392k3.getDisplayType();
                } else {
                    displayType2 = null;
                }
                if (displayType2 == enumC15567h2) {
                    c28655q.m87150e0(112357736);
                    f14 = f13;
                    Modifier modifierM3398t17 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2314t2 = c2314t;
                    EnumC16313m0 enumC16313m12 = EnumC16313m0.TINY_INFORMATION;
                    TextResource loginErrorTitle15 = c2885g.getLoginErrorState().getLoginErrorTitle();
                    objM87133R16 = c28655q.m87133R();
                    if (objM87133R16 == c28676v2) {
                        objM87133R16 = f.f11483w;
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC39332e interfaceC39332eM125323a13 = p745y81.Function1.m125323a((Function1) objM87133R16);
                    objM87133R17 = c28655q.m87133R();
                    if (objM87133R17 == c28676v2) {
                        objM87133R17 = c.f11480w;
                        c28655q.m87172p0(objM87133R17);
                    }
                    AbstractC4106r2.m12647f(modifierM3398t17, new C4092p2(enumC16313m12, 0.0f, null, null, loginErrorTitle15, null, interfaceC39332eM125323a13, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                    c28655q.m87173q(false);
                } else {
                    f14 = f13;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(112831509);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
                c28655q.m87173q(true);
                C27270o c27270o13 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierM3394p13 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                String strM21273g13 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
                if (i26 == 32) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R15 = c28655q.m87133R();
                if (z44) {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new C27314o(function8, 16);
                    c28655q.m87172p0(objM87133R15);
                }
                AbstractC27242b1.m82092d(c27270o13, strM21273g13, modifierM3394p13, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                function3 = function8;
            } else {
                c2885g = viewState;
            }
            z39 = z46 | z38;
            objM87133R14 = c28655q.m87133R();
            if (z39) {
                function8 = function7;
                objM87133R14 = new C17820i(20, function8, c2885g);
                c28655q.m87172p0(objM87133R14);
            } else {
                function8 = function7;
                objM87133R14 = new C17820i(20, function8, c2885g);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC22287p.m64027d(textResourceM8388g7, null, (InterfaceC4339a) objM87133R14, c28655q, i315, 2);
            c15568iM8392k3 = c2885g.getLoginErrorState();
            if (c15568iM8392k3 != null) {
                displayType2 = c15568iM8392k3.getDisplayType();
            } else {
                displayType2 = null;
            }
            if (displayType2 == enumC15567h2) {
                c28655q.m87150e0(112357736);
                f14 = f13;
                Modifier modifierM3398t18 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                c2314t2 = c2314t;
                EnumC16313m0 enumC16313m13 = EnumC16313m0.TINY_INFORMATION;
                TextResource loginErrorTitle16 = c2885g.getLoginErrorState().getLoginErrorTitle();
                objM87133R16 = c28655q.m87133R();
                if (objM87133R16 == c28676v2) {
                    objM87133R16 = f.f11483w;
                    c28655q.m87172p0(objM87133R16);
                }
                InterfaceC39332e interfaceC39332eM125323a14 = p745y81.Function1.m125323a((Function1) objM87133R16);
                objM87133R17 = c28655q.m87133R();
                if (objM87133R17 == c28676v2) {
                    objM87133R17 = c.f11480w;
                    c28655q.m87172p0(objM87133R17);
                }
                AbstractC4106r2.m12647f(modifierM3398t18, new C4092p2(enumC16313m13, 0.0f, null, null, loginErrorTitle16, null, interfaceC39332eM125323a14, null, p745y81.Function1.m125323a((Function1) objM87133R17), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            } else {
                f14 = f13;
                c2314t2 = c2314t;
                c28655q.m87150e0(112831509);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(13 * f18, c2314t2));
            c28655q.m87173q(true);
            C27270o c27270o14 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            Modifier modifierM3394p14 = AbstractC1099a.m3394p(f14, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
            String strM21273g14 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, c28655q, 0);
            if (i26 == 32) {
                z44 = true;
            } else {
                z44 = false;
            }
            objM87133R15 = c28655q.m87133R();
            if (z44) {
                objM87133R15 = new C27314o(function8, 16);
                c28655q.m87172p0(objM87133R15);
            } else {
                objM87133R15 = new C27314o(function8, 16);
                c28655q.m87172p0(objM87133R15);
            }
            AbstractC27242b1.m82092d(c27270o14, strM21273g14, modifierM3394p14, null, (InterfaceC4339a) objM87133R15, c28655q, C27270o.f109105k, 8);
            c28655q2 = c28655q;
            c28655q2.m87173q(true);
            function3 = function8;
        } else {
            c2885g = viewState;
            c28655q2.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c2885g, i13, function3, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m8365m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m8366n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m8367o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m8368p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m8369q(Function1 function1, C15568i c15568i) {
        function1.invoke(new InterfaceC21413a.g(c15568i.getAnalyticsName()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m8370r(Function1 function1, C15568i c15568i) {
        function1.invoke(new InterfaceC21413a.g(c15568i.getAnalyticsName()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m8371s(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        InterfaceC3871p.f15846a.getClass();
        C3862g c3862g = C3870o.f15843b;
        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
        C18043y c18043y = AbstractC18039u.f70050q;
        InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[8];
        c18043y.m51817a(semantics, c3862g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m8372t(Function1 function1, C2885g c2885g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC15250v focusState) {
        AbstractC22676k.m65750j(focusState, "focusState");
        if (m8366n(interfaceC28601c1) && !((EnumC15251w) focusState).m43354b()) {
            m8367o(interfaceC28601c1, false);
            if (!m8348E(interfaceC28601c2)) {
                function1.invoke(new InterfaceC17002b.a(c2885g.getAnalyticsName(), "inline_error", "formatting", "account_creation"));
            }
        }
        if (((EnumC15251w) focusState).m43353a()) {
            m8367o(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m8373u(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m8374v(Function1 function1, C2885g c2885g, InterfaceC28601c1 interfaceC28601c1) {
        m8347D(interfaceC28601c1, !m8346C(interfaceC28601c1));
        function1.invoke(new InterfaceC17002b.i(c2885g.getAnalyticsName(), null, "icon", "eye", "account_creation", null, 34, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m8375w(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, String it) {
        AbstractC22676k.m65750j(it, "it");
        m8345B(interfaceC28601c1, it);
        boolean z4 = false;
        m8349F(interfaceC28601c2, m8344A(interfaceC28601c1).length() >= 6);
        function1.invoke(new InterfaceC21413a.u0(new C11751e(it), z4, 2, null));
        function1.invoke(new InterfaceC21413a.o0(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m8376x(Function1 function1, C2885g c2885g) {
        function1.invoke(new InterfaceC17002b.i(c2885g.getAnalyticsName(), null, "link", "forgot_pw", "account_creation", null, 34, null));
        function1.invoke(new AbstractC23438o.g(ActivationFlowDestination.FORGOT_PASSWORD, AbstractC25247g0.m73990Y(new C23465k(NotificationCompat.CATEGORY_EMAIL, c2885g.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue()), new C23465k("fromPostPairing", Boolean.TRUE))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m8377y(Function1 function1) {
        function1.invoke(AbstractC23438o.d.f92874a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m8378z(C2885g c2885g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m8364l(c2885g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
