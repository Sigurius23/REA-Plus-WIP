package q12;

import android.content.Context;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import bc3.InterfaceC2994c0;
import bp0.C3525m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import gb1.AbstractC15674c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import j93.InterfaceC21467g;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import nl0.C26809k;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p132f0.C13821r1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p636y3.InterfaceC39171c;
import p702ch0.AbstractC4639n;
import p702ch0.AbstractC4658w0;
import p702ch0.C4656v0;
import p702ch0.EnumC4612d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p718lz1.C24823a;
import p734sl0.AbstractC32661q1;
import p734sl0.AbstractC32667r2;
import p734sl0.C32645n0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q12.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0087\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aE\u0010!\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#²\u0006\u000e\u0010\u001d\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsl0/n0;", "screenArgs", "Landroidx/compose/ui/Modifier;", "modifier", "", "isVisible", "Ly3/f;", "contentTopFade", "Lch0/d0;", "scrolling", "Lch0/v0;", "coordinator", "Lkotlin/Function0;", "Ll83/a0;", "header", "Lkotlin/Function1;", "Lnl0/m;", "footer", "", "onTurnCompleted", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsl0/n0;Landroidx/compose/ui/Modifier;ZFLch0/d0;Lch0/v0;Lc93/m;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "scrollOffsetPx", "", "fadeHeightPx", "u", "(IF)F", "Ll0/y;", "loadingState", "Lnl0/k;", "submitErrorToast", "onRetry", "i", "(Ll0/y;Lnl0/m;Lnl0/k;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "onboarding-personalization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29803d {

    /* JADX INFO: renamed from: q12.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.chat.EmbeddedAiChatKt$EmbeddedAiChat$2$1", m100430f = "EmbeddedAiChat.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f121845w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f121846x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4656v0 f121847y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC12251g f121848z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C4656v0 c4656v0, InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f121846x = z4;
            this.f121847y = c4656v0;
            this.f121848z = interfaceC12251g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f121846x, this.f121847y, this.f121848z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121845w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f121846x) {
                    C4656v0 c4656v0 = this.f121847y;
                    this.f121845w = 1;
                    if (c4656v0.m14694n(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    this.f121847y.m14692l();
                    this.f121847y.m14687g();
                    this.f121848z.mo34136d();
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f121847y.m14677E();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q12.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements InterfaceC4339a {
        public b(Object obj) {
            super(0, 0, C4656v0.class, obj, "retryFailedSend", "retryFailedSend()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134473invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134473invoke() {
            ((C4656v0) this.receiver).m14700u();
        }
    }

    /* JADX INFO: renamed from: q12.d$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"q12/d$c", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12251g f121849a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4656v0 f121850b;

        public c(InterfaceC12251g interfaceC12251g, C4656v0 c4656v0) {
            this.f121849a = interfaceC12251g;
            this.f121850b = c4656v0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f121849a.mo34136d();
            this.f121850b.m14692l();
            this.f121850b.m14687g();
            this.f121850b.m14698s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:151:0x0237  */
    /* JADX WARN: Code duplicated, block: B:153:0x023d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0247 A[PHI: r34
      0x0247: PHI (r34v4 p1.c1) = (r34v1 p1.c1), (r34v5 p1.c1) binds: [B:156:0x0245, B:154:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:161:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x025c  */
    /* JADX WARN: Code duplicated, block: B:165:0x027f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0283  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x028d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0297 A[PHI: r37
      0x0297: PHI (r37v4 boolean) = (r37v1 boolean), (r37v5 boolean) binds: [B:174:0x0295, B:172:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x0299  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:184:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:187:0x0311  */
    /* JADX WARN: Code duplicated, block: B:189:0x031f  */
    /* JADX WARN: Code duplicated, block: B:192:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0350  */
    /* JADX WARN: Code duplicated, block: B:196:0x0366  */
    /* JADX WARN: Code duplicated, block: B:199:0x0377  */
    /* JADX WARN: Code duplicated, block: B:200:0x0383  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:211:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:213:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:215:0x043a  */
    /* JADX WARN: Code duplicated, block: B:218:0x044f  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    /* JADX INFO: renamed from: h */
    public static final void m91306h(C32645n0 screenArgs, Modifier modifier, boolean z4, float f13, EnumC4612d0 enumC4612d0, C4656v0 c4656v0, InterfaceC4351m interfaceC4351m, Function3 function3, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        float f14;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        int i26;
        InterfaceC4351m interfaceC4351mM91297c;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean z14;
        EnumC4612d0 enumC4612d1;
        Modifier modifier3;
        InterfaceC4351m interfaceC4351m2;
        boolean z15;
        float f15;
        C4656v0 c4656v1;
        Function3 function4;
        Function1 function2;
        C28677v1 c28677v1M87180u;
        int i37;
        C2314t c2314t;
        EnumC4612d0 enumC4612d2;
        C4656v0 c4656v0M14712i;
        int i38;
        InterfaceC4351m interfaceC4351m3;
        C4656v0 c4656v2;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC12251g interfaceC12251g;
        C13821r1 c13821r1M92099U;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        int i39;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z16;
        boolean zM87157i;
        Object objM87133R4;
        int i44;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zM87157i2;
        Object objM87133R5;
        float fMo743q0;
        int iHashCode;
        C4656v0 c4656v3;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z24;
        Object objM87133R9;
        int i45;
        boolean zM87157i3;
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(488781934);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(screenArgs) : c28655q.m87157i(screenArgs) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i46 = i14 & 2;
        if (i46 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        i15 |= 24576;
                    } else if ((i13 & 24576) == 0) {
                        if (enumC4612d0 == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC4612d0.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if ((i14 & 32) != 0) {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            if ((262144 & i13) == 0) {
                                zM87157i3 = c28655q.m87153g(c4656v0);
                            } else {
                                zM87157i3 = c28655q.m87157i(c4656v0);
                            }
                            if (zM87157i3) {
                                i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                        }
                        i15 |= i45;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        interfaceC4351mM91297c = interfaceC4351m;
                    } else {
                        interfaceC4351mM91297c = interfaceC4351m;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(interfaceC4351mM91297c)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q.m87157i(function1)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        i36 = i15;
                        if ((i15 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i36 & 1, z14)) {
                            c28655q.m87140Z();
                            i37 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i37 != 0 || c28655q.m87118C()) {
                                if (i46 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    f14 = 0;
                                }
                                if (i24 != 0) {
                                    enumC4612d2 = EnumC4612d0.LEGACY;
                                } else {
                                    enumC4612d2 = enumC4612d0;
                                }
                                if ((i14 & 32) != 0) {
                                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                    i38 = i36 & (-458753);
                                } else {
                                    c4656v0M14712i = c4656v0;
                                    i38 = i36;
                                }
                                if (i26 != 0) {
                                    interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                                }
                                if (i28 != 0) {
                                    function3 = C29800a.f121837a.m91298d();
                                } else {
                                    function3 = function3;
                                }
                                if (i34 != 0) {
                                    function1 = null;
                                } else {
                                    function1 = function1;
                                }
                                enumC4612d0 = enumC4612d2;
                                modifier2 = modifier2;
                                z13 = z13;
                                interfaceC4351m3 = interfaceC4351mM91297c;
                                c4656v2 = c4656v0M14712i;
                                f14 = f14;
                            } else {
                                c28655q.m87138X();
                                i38 = (i14 & 32) != 0 ? i36 & (-458753) : i36;
                                interfaceC4351m3 = interfaceC4351mM91297c;
                                c4656v2 = c4656v0;
                            }
                            c28655q.m87175r();
                            objM87133R = c28655q.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87262p(c28655q);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                            interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                            EnumC4612d0 enumC4612d3 = enumC4612d0;
                            p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                            i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            Function1 function5 = function1;
                            if (i39 > 131072 || !c28655q.m87157i(c4656v2)) {
                                interfaceC28601c3 = interfaceC28601c2;
                                if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                    z16 = false;
                                }
                                zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87157i || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i47 = C4656v0.f18980q;
                                int i48 = i38 >> 15;
                                int i49 = i48 & 14;
                                AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                                Boolean boolValueOf = Boolean.valueOf(z13);
                                i44 = i38;
                                if ((i38 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (i39 > 131072 || !c28655q.m87157i(c4656v2)) {
                                    z18 = z17;
                                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                        z19 = false;
                                    }
                                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                                    objM87133R5 = c28655q.m87133R();
                                    if (zM87157i2 || objM87133R5 == c28676v0) {
                                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    int i54 = i44 >> 6;
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf);
                                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
                                    Modifier modifier4 = modifier2;
                                    boolean z25 = z13;
                                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                                    float f16 = f14;
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                                    InterfaceC0221l.f734a.getClass();
                                    c4656v3 = c4656v2;
                                    c0213j = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                                    c0209i = C0217k.f732j;
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                                    C23016z c23016z = C23016z.f90757a;
                                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f));
                                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                                    objM87133R6 = c28655q.m87133R();
                                    if (zM87153g || objM87133R6 == c28676v0) {
                                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    Modifier modifierM44084h = AbstractC15674c.m44084h(modifierM3409f, f16, (InterfaceC4339a) objM87133R6);
                                    objM87133R7 = c28655q.m87133R();
                                    if (objM87133R7 == c28676v0) {
                                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                                        c28655q.m87172p0(objM87133R7);
                                    }
                                    Function1 function6 = (Function1) objM87133R7;
                                    objM87133R8 = c28655q.m87133R();
                                    if (objM87133R8 == c28676v0) {
                                        interfaceC28601c4 = interfaceC28601c3;
                                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                                        c28655q.m87172p0(objM87133R8);
                                    } else {
                                        interfaceC28601c4 = interfaceC28601c3;
                                    }
                                    InterfaceC4351m interfaceC4351m4 = interfaceC4351m3;
                                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h, c13821r1M92099U, 0.0f, null, null, null, null, function6, (Function1) objM87133R8, true, enumC4612d3, function5, c28655q, i47 | 805306368 | i49 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i54 & 896) | 54 | (i48 & 7168), 496);
                                    EnumC26811m enumC26811mM91310l = m91310l(interfaceC28601c1);
                                    C26809k c26809kM91313o = m91313o(interfaceC28601c4);
                                    z24 = (i39 <= 131072 && c28655q.m87157i(c4656v3)) || (i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072;
                                    objM87133R9 = c28655q.m87133R();
                                    if (z24 || objM87133R9 == c28676v0) {
                                        objM87133R9 = new b(c4656v3);
                                        c28655q.m87172p0(objM87133R9);
                                    }
                                    int i55 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                                    Function3 function7 = function3;
                                    m91307i(c23016z, enumC26811mM91310l, c26809kM91313o, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function7, c28655q, i55);
                                    c28655q.m87173q(true);
                                    c4656v1 = c4656v3;
                                    function4 = function7;
                                    enumC4612d1 = enumC4612d3;
                                    function2 = function5;
                                    z15 = z25;
                                    interfaceC4351m2 = interfaceC4351m4;
                                    f15 = f16;
                                    modifier3 = modifier4;
                                } else {
                                    z18 = z17;
                                }
                                z19 = true;
                                zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                                objM87133R5 = c28655q.m87133R();
                                if (zM87157i2) {
                                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                int i56 = i44 >> 6;
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf);
                                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier2);
                                Modifier modifier5 = modifier2;
                                boolean z26 = z13;
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                                float f17 = f14;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                                InterfaceC0221l.f734a.getClass();
                                c4656v3 = c4656v2;
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                                interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                                C23016z c23016z2 = C23016z.f90757a;
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c23016z2.m66779c(c2314t, true, 1.0f));
                                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                                objM87133R6 = c28655q.m87133R();
                                if (zM87153g) {
                                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                Modifier modifierM44084h2 = AbstractC15674c.m44084h(modifierM3409f2, f17, (InterfaceC4339a) objM87133R6);
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C29802c(0, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                Function1 function8 = (Function1) objM87133R7;
                                objM87133R8 = c28655q.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    interfaceC28601c4 = interfaceC28601c3;
                                    objM87133R8 = new C29802c(1, interfaceC28601c4);
                                    c28655q.m87172p0(objM87133R8);
                                } else {
                                    interfaceC28601c4 = interfaceC28601c3;
                                }
                                InterfaceC4351m interfaceC4351m5 = interfaceC4351m3;
                                AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h2, c13821r1M92099U, 0.0f, null, null, null, null, function8, (Function1) objM87133R8, true, enumC4612d3, function5, c28655q, i47 | 805306368 | i49 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i56 & 896) | 54 | (i48 & 7168), 496);
                                EnumC26811m enumC26811mM91310l2 = m91310l(interfaceC28601c1);
                                C26809k c26809kM91313o2 = m91313o(interfaceC28601c4);
                                if (i39 <= 131072) {
                                }
                                objM87133R9 = c28655q.m87133R();
                                if (z24) {
                                    objM87133R9 = new b(c4656v3);
                                    c28655q.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new b(c4656v3);
                                    c28655q.m87172p0(objM87133R9);
                                }
                                int i57 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                                Function3 function9 = function3;
                                m91307i(c23016z2, enumC26811mM91310l2, c26809kM91313o2, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function9, c28655q, i57);
                                c28655q.m87173q(true);
                                c4656v1 = c4656v3;
                                function4 = function9;
                                enumC4612d1 = enumC4612d3;
                                function2 = function5;
                                z15 = z26;
                                interfaceC4351m2 = interfaceC4351m5;
                                f15 = f17;
                                modifier3 = modifier5;
                            } else {
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                            z16 = true;
                            zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i410 = C4656v0.f18980q;
                            int i411 = i38 >> 15;
                            int i412 = i411 & 14;
                            AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                            Boolean boolValueOf2 = Boolean.valueOf(z13);
                            i44 = i38;
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i39 > 131072) {
                                z18 = z17;
                                if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                            } else {
                                z18 = z17;
                                if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                            }
                            zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i58 = i44 >> 6;
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf2);
                            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier2);
                            Modifier modifier6 = modifier2;
                            boolean z27 = z13;
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            float f18 = f14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                            InterfaceC0221l.f734a.getClass();
                            c4656v3 = c4656v2;
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                            C23016z c23016z3 = C23016z.f90757a;
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c23016z3.m66779c(c2314t, true, 1.0f));
                            zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Modifier modifierM44084h3 = AbstractC15674c.m44084h(modifierM3409f3, f18, (InterfaceC4339a) objM87133R6);
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29802c(0, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function10 = (Function1) objM87133R7;
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c3;
                                objM87133R8 = new C29802c(1, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R8);
                            } else {
                                interfaceC28601c4 = interfaceC28601c3;
                            }
                            InterfaceC4351m interfaceC4351m6 = interfaceC4351m3;
                            AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h3, c13821r1M92099U, 0.0f, null, null, null, null, function10, (Function1) objM87133R8, true, enumC4612d3, function5, c28655q, i410 | 805306368 | i412 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i58 & 896) | 54 | (i411 & 7168), 496);
                            EnumC26811m enumC26811mM91310l3 = m91310l(interfaceC28601c1);
                            C26809k c26809kM91313o3 = m91313o(interfaceC28601c4);
                            if (i39 <= 131072) {
                            }
                            objM87133R9 = c28655q.m87133R();
                            if (z24) {
                                objM87133R9 = new b(c4656v3);
                                c28655q.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new b(c4656v3);
                                c28655q.m87172p0(objM87133R9);
                            }
                            int i59 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                            Function3 function11 = function3;
                            m91307i(c23016z3, enumC26811mM91310l3, c26809kM91313o3, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function11, c28655q, i59);
                            c28655q.m87173q(true);
                            c4656v1 = c4656v3;
                            function4 = function11;
                            enumC4612d1 = enumC4612d3;
                            function2 = function5;
                            z15 = z27;
                            interfaceC4351m2 = interfaceC4351m6;
                            f15 = f18;
                            modifier3 = modifier6;
                        } else {
                            c28655q.m87138X();
                            enumC4612d1 = enumC4612d0;
                            modifier3 = modifier2;
                            interfaceC4351m2 = interfaceC4351mM91297c;
                            z15 = z13;
                            f15 = f14;
                            c4656v1 = c4656v0;
                            function4 = function3;
                            function2 = function1;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    i36 = i15;
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i36 & 1, z14)) {
                        c28655q.m87140Z();
                        i37 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        } else {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        EnumC4612d0 enumC4612d4 = enumC4612d0;
                        p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                        i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        Function1 function12 = function1;
                        if (i39 > 131072) {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i413 = C4656v0.f18980q;
                        int i414 = i38 >> 15;
                        int i415 = i414 & 14;
                        AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                        Boolean boolValueOf3 = Boolean.valueOf(z13);
                        i44 = i38;
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i39 > 131072) {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        } else {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        }
                        zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i510 = i44 >> 6;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf3);
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                        Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier2);
                        Modifier modifier7 = modifier2;
                        boolean z28 = z13;
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        float f19 = f14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                        InterfaceC0221l.f734a.getClass();
                        c4656v3 = c4656v2;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                        C23016z c23016z4 = C23016z.f90757a;
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c23016z4.m66779c(c2314t, true, 1.0f));
                        zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Modifier modifierM44084h4 = AbstractC15674c.m44084h(modifierM3409f4, f19, (InterfaceC4339a) objM87133R6);
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29802c(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function13 = (Function1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R8 = new C29802c(1, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        InterfaceC4351m interfaceC4351m7 = interfaceC4351m3;
                        AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h4, c13821r1M92099U, 0.0f, null, null, null, null, function13, (Function1) objM87133R8, true, enumC4612d4, function12, c28655q, i413 | 805306368 | i415 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i510 & 896) | 54 | (i414 & 7168), 496);
                        EnumC26811m enumC26811mM91310l4 = m91310l(interfaceC28601c1);
                        C26809k c26809kM91313o4 = m91313o(interfaceC28601c4);
                        if (i39 <= 131072) {
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z24) {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i511 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                        Function3 function14 = function3;
                        m91307i(c23016z4, enumC26811mM91310l4, c26809kM91313o4, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function14, c28655q, i511);
                        c28655q.m87173q(true);
                        c4656v1 = c4656v3;
                        function4 = function14;
                        enumC4612d1 = enumC4612d4;
                        function2 = function12;
                        z15 = z28;
                        interfaceC4351m2 = interfaceC4351m7;
                        f15 = f19;
                        modifier3 = modifier7;
                    } else {
                        c28655q.m87138X();
                        enumC4612d1 = enumC4612d0;
                        modifier3 = modifier2;
                        interfaceC4351m2 = interfaceC4351mM91297c;
                        z15 = z13;
                        f15 = f14;
                        c4656v1 = c4656v0;
                        function4 = function3;
                        function2 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                    }
                }
                i15 |= 3072;
                f14 = f13;
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (enumC4612d0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC4612d0.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i3 = c28655q.m87153g(c4656v0);
                        } else {
                            zM87157i3 = c28655q.m87157i(c4656v0);
                        }
                        if (zM87157i3) {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i45;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    interfaceC4351mM91297c = interfaceC4351m;
                } else {
                    interfaceC4351mM91297c = interfaceC4351m;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4351mM91297c)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    i36 = i15;
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i36 & 1, z14)) {
                        c28655q.m87140Z();
                        i37 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        } else {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        EnumC4612d0 enumC4612d5 = enumC4612d0;
                        p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                        i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        Function1 function15 = function1;
                        if (i39 > 131072) {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i416 = C4656v0.f18980q;
                        int i417 = i38 >> 15;
                        int i418 = i417 & 14;
                        AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                        Boolean boolValueOf4 = Boolean.valueOf(z13);
                        i44 = i38;
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i39 > 131072) {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        } else {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        }
                        zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i512 = i44 >> 6;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf4);
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, modifier2);
                        Modifier modifier8 = modifier2;
                        boolean z29 = z13;
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        float f110 = f14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                        InterfaceC0221l.f734a.getClass();
                        c4656v3 = c4656v2;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                        C23016z c23016z5 = C23016z.f90757a;
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c23016z5.m66779c(c2314t, true, 1.0f));
                        zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Modifier modifierM44084h5 = AbstractC15674c.m44084h(modifierM3409f5, f110, (InterfaceC4339a) objM87133R6);
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29802c(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function16 = (Function1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R8 = new C29802c(1, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        InterfaceC4351m interfaceC4351m8 = interfaceC4351m3;
                        AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h5, c13821r1M92099U, 0.0f, null, null, null, null, function16, (Function1) objM87133R8, true, enumC4612d5, function15, c28655q, i416 | 805306368 | i418 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i512 & 896) | 54 | (i417 & 7168), 496);
                        EnumC26811m enumC26811mM91310l5 = m91310l(interfaceC28601c1);
                        C26809k c26809kM91313o5 = m91313o(interfaceC28601c4);
                        if (i39 <= 131072) {
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z24) {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i513 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                        Function3 function17 = function3;
                        m91307i(c23016z5, enumC26811mM91310l5, c26809kM91313o5, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function17, c28655q, i513);
                        c28655q.m87173q(true);
                        c4656v1 = c4656v3;
                        function4 = function17;
                        enumC4612d1 = enumC4612d5;
                        function2 = function15;
                        z15 = z29;
                        interfaceC4351m2 = interfaceC4351m8;
                        f15 = f110;
                        modifier3 = modifier8;
                    } else {
                        c28655q.m87138X();
                        enumC4612d1 = enumC4612d0;
                        modifier3 = modifier2;
                        interfaceC4351m2 = interfaceC4351mM91297c;
                        z15 = z13;
                        f15 = f14;
                        c4656v1 = c4656v0;
                        function4 = function3;
                        function2 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d6 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function18 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i419 = C4656v0.f18980q;
                    int i4110 = i38 >> 15;
                    int i4111 = i4110 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf5 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i514 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf5);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier9 = modifier2;
                    boolean z210 = z13;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f111 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z6 = C23016z.f90757a;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c23016z6.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h6 = AbstractC15674c.m44084h(modifierM3409f6, f111, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function19 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m9 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h6, c13821r1M92099U, 0.0f, null, null, null, null, function19, (Function1) objM87133R8, true, enumC4612d6, function18, c28655q, i419 | 805306368 | i4111 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i514 & 896) | 54 | (i4110 & 7168), 496);
                    EnumC26811m enumC26811mM91310l6 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o6 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i515 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function110 = function3;
                    m91307i(c23016z6, enumC26811mM91310l6, c26809kM91313o6, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function110, c28655q, i515);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function110;
                    enumC4612d1 = enumC4612d6;
                    function2 = function18;
                    z15 = z210;
                    interfaceC4351m2 = interfaceC4351m9;
                    f15 = f111;
                    modifier3 = modifier9;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 384;
            z13 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (enumC4612d0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC4612d0.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i3 = c28655q.m87153g(c4656v0);
                        } else {
                            zM87157i3 = c28655q.m87157i(c4656v0);
                        }
                        if (zM87157i3) {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i45;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    interfaceC4351mM91297c = interfaceC4351m;
                } else {
                    interfaceC4351mM91297c = interfaceC4351m;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4351mM91297c)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    i36 = i15;
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i36 & 1, z14)) {
                        c28655q.m87140Z();
                        i37 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        } else {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        EnumC4612d0 enumC4612d7 = enumC4612d0;
                        p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                        i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        Function1 function111 = function1;
                        if (i39 > 131072) {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i4112 = C4656v0.f18980q;
                        int i4113 = i38 >> 15;
                        int i4114 = i4113 & 14;
                        AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                        Boolean boolValueOf6 = Boolean.valueOf(z13);
                        i44 = i38;
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i39 > 131072) {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        } else {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        }
                        zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i516 = i44 >> 6;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf6);
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                        Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, modifier2);
                        Modifier modifier10 = modifier2;
                        boolean z211 = z13;
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        float f112 = f14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                        InterfaceC0221l.f734a.getClass();
                        c4656v3 = c4656v2;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                        C23016z c23016z7 = C23016z.f90757a;
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c23016z7.m66779c(c2314t, true, 1.0f));
                        zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Modifier modifierM44084h7 = AbstractC15674c.m44084h(modifierM3409f7, f112, (InterfaceC4339a) objM87133R6);
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29802c(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function112 = (Function1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R8 = new C29802c(1, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        InterfaceC4351m interfaceC4351m10 = interfaceC4351m3;
                        AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h7, c13821r1M92099U, 0.0f, null, null, null, null, function112, (Function1) objM87133R8, true, enumC4612d7, function111, c28655q, i4112 | 805306368 | i4114 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i516 & 896) | 54 | (i4113 & 7168), 496);
                        EnumC26811m enumC26811mM91310l7 = m91310l(interfaceC28601c1);
                        C26809k c26809kM91313o7 = m91313o(interfaceC28601c4);
                        if (i39 <= 131072) {
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z24) {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i517 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                        Function3 function113 = function3;
                        m91307i(c23016z7, enumC26811mM91310l7, c26809kM91313o7, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function113, c28655q, i517);
                        c28655q.m87173q(true);
                        c4656v1 = c4656v3;
                        function4 = function113;
                        enumC4612d1 = enumC4612d7;
                        function2 = function111;
                        z15 = z211;
                        interfaceC4351m2 = interfaceC4351m10;
                        f15 = f112;
                        modifier3 = modifier10;
                    } else {
                        c28655q.m87138X();
                        enumC4612d1 = enumC4612d0;
                        modifier3 = modifier2;
                        interfaceC4351m2 = interfaceC4351mM91297c;
                        z15 = z13;
                        f15 = f14;
                        c4656v1 = c4656v0;
                        function4 = function3;
                        function2 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d8 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function114 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i4115 = C4656v0.f18980q;
                    int i4116 = i38 >> 15;
                    int i4117 = i4116 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf7 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i518 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf7);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier11 = modifier2;
                    boolean z212 = z13;
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f113 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z8 = C23016z.f90757a;
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c23016z8.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h8 = AbstractC15674c.m44084h(modifierM3409f8, f113, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function115 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m11 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h8, c13821r1M92099U, 0.0f, null, null, null, null, function115, (Function1) objM87133R8, true, enumC4612d8, function114, c28655q, i4115 | 805306368 | i4117 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i518 & 896) | 54 | (i4116 & 7168), 496);
                    EnumC26811m enumC26811mM91310l8 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o8 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i519 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function116 = function3;
                    m91307i(c23016z8, enumC26811mM91310l8, c26809kM91313o8, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function116, c28655q, i519);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function116;
                    enumC4612d1 = enumC4612d8;
                    function2 = function114;
                    z15 = z212;
                    interfaceC4351m2 = interfaceC4351m11;
                    f15 = f113;
                    modifier3 = modifier11;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 3072;
            f14 = f13;
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (enumC4612d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4612d0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i3 = c28655q.m87153g(c4656v0);
                    } else {
                        zM87157i3 = c28655q.m87157i(c4656v0);
                    }
                    if (zM87157i3) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i45;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                interfaceC4351mM91297c = interfaceC4351m;
            } else {
                interfaceC4351mM91297c = interfaceC4351m;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4351mM91297c)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function3)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d9 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function117 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i4118 = C4656v0.f18980q;
                    int i4119 = i38 >> 15;
                    int i41110 = i4119 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf8 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5110 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf8);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier12 = modifier2;
                    boolean z213 = z13;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f114 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d9);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z9 = C23016z.f90757a;
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c23016z9.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h9 = AbstractC15674c.m44084h(modifierM3409f9, f114, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function118 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m12 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h9, c13821r1M92099U, 0.0f, null, null, null, null, function118, (Function1) objM87133R8, true, enumC4612d9, function117, c28655q, i4118 | 805306368 | i41110 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i5110 & 896) | 54 | (i4119 & 7168), 496);
                    EnumC26811m enumC26811mM91310l9 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o9 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i5111 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function119 = function3;
                    m91307i(c23016z9, enumC26811mM91310l9, c26809kM91313o9, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function119, c28655q, i5111);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function119;
                    enumC4612d1 = enumC4612d9;
                    function2 = function117;
                    z15 = z213;
                    interfaceC4351m2 = interfaceC4351m12;
                    f15 = f114;
                    modifier3 = modifier12;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            i36 = i15;
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i36 & 1, z14)) {
                c28655q.m87140Z();
                i37 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                } else {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                EnumC4612d0 enumC4612d10 = enumC4612d0;
                p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                Function1 function1110 = function1;
                if (i39 > 131072) {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                }
                int i41111 = C4656v0.f18980q;
                int i41112 = i38 >> 15;
                int i41113 = i41112 & 14;
                AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                Boolean boolValueOf9 = Boolean.valueOf(z13);
                i44 = i38;
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i39 > 131072) {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                }
                int i5112 = i44 >> 6;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf9);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, modifier2);
                Modifier modifier13 = modifier2;
                boolean z214 = z13;
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                float f115 = f14;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3407d10);
                InterfaceC0221l.f734a.getClass();
                c4656v3 = c4656v2;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                C23016z c23016z10 = C23016z.f90757a;
                Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c23016z10.m66779c(c2314t, true, 1.0f));
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM44084h10 = AbstractC15674c.m44084h(modifierM3409f10, f115, (InterfaceC4339a) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29802c(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function1111 = (Function1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R8 = new C29802c(1, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                InterfaceC4351m interfaceC4351m13 = interfaceC4351m3;
                AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h10, c13821r1M92099U, 0.0f, null, null, null, null, function1111, (Function1) objM87133R8, true, enumC4612d10, function1110, c28655q, i41111 | 805306368 | i41113 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i5112 & 896) | 54 | (i41112 & 7168), 496);
                EnumC26811m enumC26811mM91310l10 = m91310l(interfaceC28601c1);
                C26809k c26809kM91313o10 = m91313o(interfaceC28601c4);
                if (i39 <= 131072) {
                }
                objM87133R9 = c28655q.m87133R();
                if (z24) {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                }
                int i5113 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                Function3 function1112 = function3;
                m91307i(c23016z10, enumC26811mM91310l10, c26809kM91313o10, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function1112, c28655q, i5113);
                c28655q.m87173q(true);
                c4656v1 = c4656v3;
                function4 = function1112;
                enumC4612d1 = enumC4612d10;
                function2 = function1110;
                z15 = z214;
                interfaceC4351m2 = interfaceC4351m13;
                f15 = f115;
                modifier3 = modifier13;
            } else {
                c28655q.m87138X();
                enumC4612d1 = enumC4612d0;
                modifier3 = modifier2;
                interfaceC4351m2 = interfaceC4351mM91297c;
                z15 = z13;
                f15 = f14;
                c4656v1 = c4656v0;
                function4 = function3;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (enumC4612d0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC4612d0.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i3 = c28655q.m87153g(c4656v0);
                        } else {
                            zM87157i3 = c28655q.m87157i(c4656v0);
                        }
                        if (zM87157i3) {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i45;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    interfaceC4351mM91297c = interfaceC4351m;
                } else {
                    interfaceC4351mM91297c = interfaceC4351m;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4351mM91297c)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    i36 = i15;
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i36 & 1, z14)) {
                        c28655q.m87140Z();
                        i37 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        } else {
                            if (i46 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                f14 = 0;
                            }
                            if (i24 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                                i38 = i36 & (-458753);
                            } else {
                                c4656v0M14712i = c4656v0;
                                i38 = i36;
                            }
                            if (i26 != 0) {
                                interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                            }
                            if (i28 != 0) {
                                function3 = C29800a.f121837a.m91298d();
                            } else {
                                function3 = function3;
                            }
                            if (i34 != 0) {
                                function1 = null;
                            } else {
                                function1 = function1;
                            }
                            enumC4612d0 = enumC4612d2;
                            modifier2 = modifier2;
                            z13 = z13;
                            interfaceC4351m3 = interfaceC4351mM91297c;
                            c4656v2 = c4656v0M14712i;
                            f14 = f14;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        EnumC4612d0 enumC4612d11 = enumC4612d0;
                        p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                        i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        Function1 function1113 = function1;
                        if (i39 > 131072) {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i41114 = C4656v0.f18980q;
                        int i41115 = i38 >> 15;
                        int i41116 = i41115 & 14;
                        AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                        Boolean boolValueOf10 = Boolean.valueOf(z13);
                        i44 = i38;
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i39 > 131072) {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        } else {
                            z18 = z17;
                            if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        }
                        zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i5114 = i44 >> 6;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf10);
                        fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                        Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, modifier2);
                        Modifier modifier14 = modifier2;
                        boolean z215 = z13;
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        float f116 = f14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d11);
                        InterfaceC0221l.f734a.getClass();
                        c4656v3 = c4656v2;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                        C23016z c23016z11 = C23016z.f90757a;
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c23016z11.m66779c(c2314t, true, 1.0f));
                        zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Modifier modifierM44084h11 = AbstractC15674c.m44084h(modifierM3409f11, f116, (InterfaceC4339a) objM87133R6);
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29802c(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function1114 = (Function1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c3;
                            objM87133R8 = new C29802c(1, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c4 = interfaceC28601c3;
                        }
                        InterfaceC4351m interfaceC4351m14 = interfaceC4351m3;
                        AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h11, c13821r1M92099U, 0.0f, null, null, null, null, function1114, (Function1) objM87133R8, true, enumC4612d11, function1113, c28655q, i41114 | 805306368 | i41116 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i5114 & 896) | 54 | (i41115 & 7168), 496);
                        EnumC26811m enumC26811mM91310l11 = m91310l(interfaceC28601c1);
                        C26809k c26809kM91313o11 = m91313o(interfaceC28601c4);
                        if (i39 <= 131072) {
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z24) {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new b(c4656v3);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i5115 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                        Function3 function1115 = function3;
                        m91307i(c23016z11, enumC26811mM91310l11, c26809kM91313o11, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function1115, c28655q, i5115);
                        c28655q.m87173q(true);
                        c4656v1 = c4656v3;
                        function4 = function1115;
                        enumC4612d1 = enumC4612d11;
                        function2 = function1113;
                        z15 = z215;
                        interfaceC4351m2 = interfaceC4351m14;
                        f15 = f116;
                        modifier3 = modifier14;
                    } else {
                        c28655q.m87138X();
                        enumC4612d1 = enumC4612d0;
                        modifier3 = modifier2;
                        interfaceC4351m2 = interfaceC4351mM91297c;
                        z15 = z13;
                        f15 = f14;
                        c4656v1 = c4656v0;
                        function4 = function3;
                        function2 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                    }
                }
                i15 |= 100663296;
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d12 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function1116 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i41117 = C4656v0.f18980q;
                    int i41118 = i38 >> 15;
                    int i41119 = i41118 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf11 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5116 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf11);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier15 = modifier2;
                    boolean z216 = z13;
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f117 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d12);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z12 = C23016z.f90757a;
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c23016z12.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h12 = AbstractC15674c.m44084h(modifierM3409f12, f117, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function1117 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m15 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h12, c13821r1M92099U, 0.0f, null, null, null, null, function1117, (Function1) objM87133R8, true, enumC4612d12, function1116, c28655q, i41117 | 805306368 | i41119 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i5116 & 896) | 54 | (i41118 & 7168), 496);
                    EnumC26811m enumC26811mM91310l12 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o12 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i5117 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function1118 = function3;
                    m91307i(c23016z12, enumC26811mM91310l12, c26809kM91313o12, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function1118, c28655q, i5117);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function1118;
                    enumC4612d1 = enumC4612d12;
                    function2 = function1116;
                    z15 = z216;
                    interfaceC4351m2 = interfaceC4351m15;
                    f15 = f117;
                    modifier3 = modifier15;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 3072;
            f14 = f13;
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (enumC4612d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4612d0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i3 = c28655q.m87153g(c4656v0);
                    } else {
                        zM87157i3 = c28655q.m87157i(c4656v0);
                    }
                    if (zM87157i3) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i45;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                interfaceC4351mM91297c = interfaceC4351m;
            } else {
                interfaceC4351mM91297c = interfaceC4351m;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4351mM91297c)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function3)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d13 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function1119 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i411110 = C4656v0.f18980q;
                    int i411111 = i38 >> 15;
                    int i411112 = i411111 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf12 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i5118 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf12);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier16 = modifier2;
                    boolean z217 = z13;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f118 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3407d13);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z13 = C23016z.f90757a;
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c23016z13.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h13 = AbstractC15674c.m44084h(modifierM3409f13, f118, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11110 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m16 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h13, c13821r1M92099U, 0.0f, null, null, null, null, function11110, (Function1) objM87133R8, true, enumC4612d13, function1119, c28655q, i411110 | 805306368 | i411112 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i5118 & 896) | 54 | (i411111 & 7168), 496);
                    EnumC26811m enumC26811mM91310l13 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o13 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i5119 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function11111 = function3;
                    m91307i(c23016z13, enumC26811mM91310l13, c26809kM91313o13, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function11111, c28655q, i5119);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function11111;
                    enumC4612d1 = enumC4612d13;
                    function2 = function1119;
                    z15 = z217;
                    interfaceC4351m2 = interfaceC4351m16;
                    f15 = f118;
                    modifier3 = modifier16;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            i36 = i15;
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i36 & 1, z14)) {
                c28655q.m87140Z();
                i37 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                } else {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                EnumC4612d0 enumC4612d14 = enumC4612d0;
                p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                Function1 function11112 = function1;
                if (i39 > 131072) {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                }
                int i411113 = C4656v0.f18980q;
                int i411114 = i38 >> 15;
                int i411115 = i411114 & 14;
                AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                Boolean boolValueOf13 = Boolean.valueOf(z13);
                i44 = i38;
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i39 > 131072) {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                }
                int i51110 = i44 >> 6;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf13);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, modifier2);
                Modifier modifier17 = modifier2;
                boolean z218 = z13;
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                float f119 = f14;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3407d14);
                InterfaceC0221l.f734a.getClass();
                c4656v3 = c4656v2;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                C23016z c23016z14 = C23016z.f90757a;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c23016z14.m66779c(c2314t, true, 1.0f));
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM44084h14 = AbstractC15674c.m44084h(modifierM3409f14, f119, (InterfaceC4339a) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29802c(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function11113 = (Function1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R8 = new C29802c(1, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                InterfaceC4351m interfaceC4351m17 = interfaceC4351m3;
                AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h14, c13821r1M92099U, 0.0f, null, null, null, null, function11113, (Function1) objM87133R8, true, enumC4612d14, function11112, c28655q, i411113 | 805306368 | i411115 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i51110 & 896) | 54 | (i411114 & 7168), 496);
                EnumC26811m enumC26811mM91310l14 = m91310l(interfaceC28601c1);
                C26809k c26809kM91313o14 = m91313o(interfaceC28601c4);
                if (i39 <= 131072) {
                }
                objM87133R9 = c28655q.m87133R();
                if (z24) {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                }
                int i51111 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                Function3 function11114 = function3;
                m91307i(c23016z14, enumC26811mM91310l14, c26809kM91313o14, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function11114, c28655q, i51111);
                c28655q.m87173q(true);
                c4656v1 = c4656v3;
                function4 = function11114;
                enumC4612d1 = enumC4612d14;
                function2 = function11112;
                z15 = z218;
                interfaceC4351m2 = interfaceC4351m17;
                f15 = f119;
                modifier3 = modifier17;
            } else {
                c28655q.m87138X();
                enumC4612d1 = enumC4612d0;
                modifier3 = modifier2;
                interfaceC4351m2 = interfaceC4351mM91297c;
                z15 = z13;
                f15 = f14;
                c4656v1 = c4656v0;
                function4 = function3;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (enumC4612d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4612d0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i3 = c28655q.m87153g(c4656v0);
                    } else {
                        zM87157i3 = c28655q.m87157i(c4656v0);
                    }
                    if (zM87157i3) {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i45;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                interfaceC4351mM91297c = interfaceC4351m;
            } else {
                interfaceC4351mM91297c = interfaceC4351m;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4351mM91297c)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function3)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                i36 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i36 & 1, z14)) {
                    c28655q.m87140Z();
                    i37 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    } else {
                        if (i46 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        }
                        if (i24 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                            i38 = i36 & (-458753);
                        } else {
                            c4656v0M14712i = c4656v0;
                            i38 = i36;
                        }
                        if (i26 != 0) {
                            interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                        }
                        if (i28 != 0) {
                            function3 = C29800a.f121837a.m91298d();
                        } else {
                            function3 = function3;
                        }
                        if (i34 != 0) {
                            function1 = null;
                        } else {
                            function1 = function1;
                        }
                        enumC4612d0 = enumC4612d2;
                        modifier2 = modifier2;
                        z13 = z13;
                        interfaceC4351m3 = interfaceC4351mM91297c;
                        c4656v2 = c4656v0M14712i;
                        f14 = f14;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    EnumC4612d0 enumC4612d15 = enumC4612d0;
                    p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                    i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    Function1 function11115 = function1;
                    if (i39 > 131072) {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i411116 = C4656v0.f18980q;
                    int i411117 = i38 >> 15;
                    int i411118 = i411117 & 14;
                    AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                    Boolean boolValueOf14 = Boolean.valueOf(z13);
                    i44 = i38;
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i39 > 131072) {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z18 = z17;
                        if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    }
                    zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i51112 = i44 >> 6;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf14);
                    fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                    Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, modifier2);
                    Modifier modifier18 = modifier2;
                    boolean z219 = z13;
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    float f1110 = f14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3407d15);
                    InterfaceC0221l.f734a.getClass();
                    c4656v3 = c4656v2;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                    C23016z c23016z15 = C23016z.f90757a;
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c23016z15.m66779c(c2314t, true, 1.0f));
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM44084h15 = AbstractC15674c.m44084h(modifierM3409f15, f1110, (InterfaceC4339a) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29802c(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11116 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c3;
                        objM87133R8 = new C29802c(1, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c4 = interfaceC28601c3;
                    }
                    InterfaceC4351m interfaceC4351m18 = interfaceC4351m3;
                    AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h15, c13821r1M92099U, 0.0f, null, null, null, null, function11116, (Function1) objM87133R8, true, enumC4612d15, function11115, c28655q, i411116 | 805306368 | i411118 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i51112 & 896) | 54 | (i411117 & 7168), 496);
                    EnumC26811m enumC26811mM91310l15 = m91310l(interfaceC28601c1);
                    C26809k c26809kM91313o15 = m91313o(interfaceC28601c4);
                    if (i39 <= 131072) {
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z24) {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new b(c4656v3);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i51113 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                    Function3 function11117 = function3;
                    m91307i(c23016z15, enumC26811mM91310l15, c26809kM91313o15, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function11117, c28655q, i51113);
                    c28655q.m87173q(true);
                    c4656v1 = c4656v3;
                    function4 = function11117;
                    enumC4612d1 = enumC4612d15;
                    function2 = function11115;
                    z15 = z219;
                    interfaceC4351m2 = interfaceC4351m18;
                    f15 = f1110;
                    modifier3 = modifier18;
                } else {
                    c28655q.m87138X();
                    enumC4612d1 = enumC4612d0;
                    modifier3 = modifier2;
                    interfaceC4351m2 = interfaceC4351mM91297c;
                    z15 = z13;
                    f15 = f14;
                    c4656v1 = c4656v0;
                    function4 = function3;
                    function2 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
                }
            }
            i15 |= 100663296;
            i36 = i15;
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i36 & 1, z14)) {
                c28655q.m87140Z();
                i37 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                } else {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                EnumC4612d0 enumC4612d16 = enumC4612d0;
                p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                Function1 function11118 = function1;
                if (i39 > 131072) {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                }
                int i411119 = C4656v0.f18980q;
                int i4111110 = i38 >> 15;
                int i4111111 = i4111110 & 14;
                AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                Boolean boolValueOf15 = Boolean.valueOf(z13);
                i44 = i38;
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i39 > 131072) {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                }
                int i51114 = i44 >> 6;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf15);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, modifier2);
                Modifier modifier19 = modifier2;
                boolean z2110 = z13;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                float f1111 = f14;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3407d16);
                InterfaceC0221l.f734a.getClass();
                c4656v3 = c4656v2;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                C23016z c23016z16 = C23016z.f90757a;
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c23016z16.m66779c(c2314t, true, 1.0f));
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM44084h16 = AbstractC15674c.m44084h(modifierM3409f16, f1111, (InterfaceC4339a) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29802c(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function11119 = (Function1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R8 = new C29802c(1, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                InterfaceC4351m interfaceC4351m19 = interfaceC4351m3;
                AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h16, c13821r1M92099U, 0.0f, null, null, null, null, function11119, (Function1) objM87133R8, true, enumC4612d16, function11118, c28655q, i411119 | 805306368 | i4111111 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i51114 & 896) | 54 | (i4111110 & 7168), 496);
                EnumC26811m enumC26811mM91310l16 = m91310l(interfaceC28601c1);
                C26809k c26809kM91313o16 = m91313o(interfaceC28601c4);
                if (i39 <= 131072) {
                }
                objM87133R9 = c28655q.m87133R();
                if (z24) {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                }
                int i51115 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                Function3 function111110 = function3;
                m91307i(c23016z16, enumC26811mM91310l16, c26809kM91313o16, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function111110, c28655q, i51115);
                c28655q.m87173q(true);
                c4656v1 = c4656v3;
                function4 = function111110;
                enumC4612d1 = enumC4612d16;
                function2 = function11118;
                z15 = z2110;
                interfaceC4351m2 = interfaceC4351m19;
                f15 = f1111;
                modifier3 = modifier19;
            } else {
                c28655q.m87138X();
                enumC4612d1 = enumC4612d0;
                modifier3 = modifier2;
                interfaceC4351m2 = interfaceC4351mM91297c;
                z15 = z13;
                f15 = f14;
                c4656v1 = c4656v0;
                function4 = function3;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
            }
        }
        i15 |= 3072;
        f14 = f13;
        i24 = i14 & 16;
        if (i24 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if (enumC4612d0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC4612d0.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i25;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & 32) != 0) {
                i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((262144 & i13) == 0) {
                    zM87157i3 = c28655q.m87153g(c4656v0);
                } else {
                    zM87157i3 = c28655q.m87157i(c4656v0);
                }
                if (zM87157i3) {
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i45;
        }
        i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
            interfaceC4351mM91297c = interfaceC4351m;
        } else {
            interfaceC4351mM91297c = interfaceC4351m;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(interfaceC4351mM91297c)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
        }
        i28 = i14 & 128;
        if (i28 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(function3)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i15 |= i29;
        }
        i34 = i14 & 256;
        if (i34 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(function1)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            i36 = i15;
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i36 & 1, z14)) {
                c28655q.m87140Z();
                i37 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                } else {
                    if (i46 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    }
                    if (i24 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                        i38 = i36 & (-458753);
                    } else {
                        c4656v0M14712i = c4656v0;
                        i38 = i36;
                    }
                    if (i26 != 0) {
                        interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                    }
                    if (i28 != 0) {
                        function3 = C29800a.f121837a.m91298d();
                    } else {
                        function3 = function3;
                    }
                    if (i34 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                    enumC4612d0 = enumC4612d2;
                    modifier2 = modifier2;
                    z13 = z13;
                    interfaceC4351m3 = interfaceC4351mM91297c;
                    c4656v2 = c4656v0M14712i;
                    f14 = f14;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                EnumC4612d0 enumC4612d17 = enumC4612d0;
                p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
                i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
                Function1 function111111 = function1;
                if (i39 > 131072) {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                    c28655q.m87172p0(objM87133R4);
                }
                int i4111112 = C4656v0.f18980q;
                int i4111113 = i38 >> 15;
                int i4111114 = i4111113 & 14;
                AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
                Boolean boolValueOf16 = Boolean.valueOf(z13);
                i44 = i38;
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i39 > 131072) {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    z18 = z17;
                    if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                    c28655q.m87172p0(objM87133R5);
                }
                int i51116 = i44 >> 6;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf16);
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                Modifier modifierM3407d17 = AbstractC1102d.m3407d(1.0f, modifier2);
                Modifier modifier110 = modifier2;
                boolean z2111 = z13;
                C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                float f1112 = f14;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3407d17);
                InterfaceC0221l.f734a.getClass();
                c4656v3 = c4656v2;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a17);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m17);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N17);
                interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
                C23016z c23016z17 = C23016z.f90757a;
                Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c23016z17.m66779c(c2314t, true, 1.0f));
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM44084h17 = AbstractC15674c.m44084h(modifierM3409f17, f1112, (InterfaceC4339a) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29802c(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function111112 = (Function1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R8 = new C29802c(1, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                InterfaceC4351m interfaceC4351m110 = interfaceC4351m3;
                AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h17, c13821r1M92099U, 0.0f, null, null, null, null, function111112, (Function1) objM87133R8, true, enumC4612d17, function111111, c28655q, i4111112 | 805306368 | i4111114 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i51116 & 896) | 54 | (i4111113 & 7168), 496);
                EnumC26811m enumC26811mM91310l17 = m91310l(interfaceC28601c1);
                C26809k c26809kM91313o17 = m91313o(interfaceC28601c4);
                if (i39 <= 131072) {
                }
                objM87133R9 = c28655q.m87133R();
                if (z24) {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(c4656v3);
                    c28655q.m87172p0(objM87133R9);
                }
                int i51117 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
                Function3 function111113 = function3;
                m91307i(c23016z17, enumC26811mM91310l17, c26809kM91313o17, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function111113, c28655q, i51117);
                c28655q.m87173q(true);
                c4656v1 = c4656v3;
                function4 = function111113;
                enumC4612d1 = enumC4612d17;
                function2 = function111111;
                z15 = z2111;
                interfaceC4351m2 = interfaceC4351m110;
                f15 = f1112;
                modifier3 = modifier110;
            } else {
                c28655q.m87138X();
                enumC4612d1 = enumC4612d0;
                modifier3 = modifier2;
                interfaceC4351m2 = interfaceC4351mM91297c;
                z15 = z13;
                f15 = f14;
                c4656v1 = c4656v0;
                function4 = function3;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
            }
        }
        i15 |= 100663296;
        i36 = i15;
        if ((i15 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i36 & 1, z14)) {
            c28655q.m87140Z();
            i37 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i37 != 0) {
                if (i46 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    f14 = 0;
                }
                if (i24 != 0) {
                    enumC4612d2 = EnumC4612d0.LEGACY;
                } else {
                    enumC4612d2 = enumC4612d0;
                }
                if ((i14 & 32) != 0) {
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                    i38 = i36 & (-458753);
                } else {
                    c4656v0M14712i = c4656v0;
                    i38 = i36;
                }
                if (i26 != 0) {
                    interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                }
                if (i28 != 0) {
                    function3 = C29800a.f121837a.m91298d();
                } else {
                    function3 = function3;
                }
                if (i34 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
                enumC4612d0 = enumC4612d2;
                modifier2 = modifier2;
                z13 = z13;
                interfaceC4351m3 = interfaceC4351mM91297c;
                c4656v2 = c4656v0M14712i;
                f14 = f14;
            } else {
                if (i46 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    f14 = 0;
                }
                if (i24 != 0) {
                    enumC4612d2 = EnumC4612d0.LEGACY;
                } else {
                    enumC4612d2 = enumC4612d0;
                }
                if ((i14 & 32) != 0) {
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i36 << 3) & 112));
                    i38 = i36 & (-458753);
                } else {
                    c4656v0M14712i = c4656v0;
                    i38 = i36;
                }
                if (i26 != 0) {
                    interfaceC4351mM91297c = C29800a.f121837a.m91297c();
                }
                if (i28 != 0) {
                    function3 = C29800a.f121837a.m91298d();
                } else {
                    function3 = function3;
                }
                if (i34 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
                enumC4612d0 = enumC4612d2;
                modifier2 = modifier2;
                z13 = z13;
                interfaceC4351m3 = interfaceC4351mM91297c;
                c4656v2 = c4656v0M14712i;
                f14 = f14;
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(EnumC26811m.NONE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C26809k(false, null, 0, null, 15, null));
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            EnumC4612d0 enumC4612d18 = enumC4612d0;
            p702ch0.Function1.m14423c0(c13821r1M92099U, c28655q, 0);
            i39 = (458752 & i38) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
            Function1 function111114 = function1;
            if (i39 > 131072) {
                interfaceC28601c3 = interfaceC28601c2;
                if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                interfaceC28601c3 = interfaceC28601c2;
                if ((i38 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            zM87157i = z16 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26954j0(c4656v2, interfaceC2994c0, interfaceC12251g, 17);
                c28655q.m87172p0(objM87133R4);
            }
            int i4111115 = C4656v0.f18980q;
            int i4111116 = i38 >> 15;
            int i4111117 = i4111116 & 14;
            AbstractC28683x.m87251e(c4656v2, (Function1) objM87133R4, c28655q);
            Boolean boolValueOf17 = Boolean.valueOf(z13);
            i44 = i38;
            if ((i38 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i39 > 131072) {
                z18 = z17;
                if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            } else {
                z18 = z17;
                if ((i44 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            }
            zM87157i2 = z18 | z19 | c28655q.m87157i(interfaceC12251g);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(z13, c4656v2, interfaceC12251g, null);
                c28655q.m87172p0(objM87133R5);
            }
            int i51118 = i44 >> 6;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf17);
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
            Modifier modifierM3407d18 = AbstractC1102d.m3407d(1.0f, modifier2);
            Modifier modifier111 = modifier2;
            boolean z2112 = z13;
            C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            float f1113 = f14;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3407d18);
            InterfaceC0221l.f734a.getClass();
            c4656v3 = c4656v2;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a18);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
            interfaceC4351m3.invoke(c28655q, Integer.valueOf((i44 >> 18) & 14));
            C23016z c23016z18 = C23016z.f90757a;
            Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c23016z18.m66779c(c2314t, true, 1.0f));
            zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87147d(fMo743q0);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C29801b(fMo743q0, c13821r1M92099U);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM44084h18 = AbstractC15674c.m44084h(modifierM3409f18, f1113, (InterfaceC4339a) objM87133R6);
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C29802c(0, interfaceC28601c1);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function111115 = (Function1) objM87133R7;
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                interfaceC28601c4 = interfaceC28601c3;
                objM87133R8 = new C29802c(1, interfaceC28601c4);
                c28655q.m87172p0(objM87133R8);
            } else {
                interfaceC28601c4 = interfaceC28601c3;
            }
            InterfaceC4351m interfaceC4351m111 = interfaceC4351m3;
            AbstractC4639n.m14514s(c4656v3, screenArgs, modifierM44084h18, c13821r1M92099U, 0.0f, null, null, null, null, function111115, (Function1) objM87133R8, true, enumC4612d18, function111114, c28655q, i4111115 | 805306368 | i4111117 | (C32645n0.f135304t << 3) | ((i44 << 3) & 112), (i51118 & 896) | 54 | (i4111116 & 7168), 496);
            EnumC26811m enumC26811mM91310l18 = m91310l(interfaceC28601c1);
            C26809k c26809kM91313o18 = m91313o(interfaceC28601c4);
            if (i39 <= 131072) {
            }
            objM87133R9 = c28655q.m87133R();
            if (z24) {
                objM87133R9 = new b(c4656v3);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new b(c4656v3);
                c28655q.m87172p0(objM87133R9);
            }
            int i51119 = (C26809k.f106859e << 6) | 6 | ((i44 >> 9) & 57344);
            Function3 function111116 = function3;
            m91307i(c23016z18, enumC26811mM91310l18, c26809kM91313o18, (InterfaceC4339a) ((InterfaceC21467g) objM87133R9), function111116, c28655q, i51119);
            c28655q.m87173q(true);
            c4656v1 = c4656v3;
            function4 = function111116;
            enumC4612d1 = enumC4612d18;
            function2 = function111114;
            z15 = z2112;
            interfaceC4351m2 = interfaceC4351m111;
            f15 = f1113;
            modifier3 = modifier111;
        } else {
            c28655q.m87138X();
            enumC4612d1 = enumC4612d0;
            modifier3 = modifier2;
            interfaceC4351m2 = interfaceC4351mM91297c;
            z15 = z13;
            f15 = f14;
            c4656v1 = c4656v0;
            function4 = function3;
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3525m(screenArgs, modifier3, z15, f15, enumC4612d1, c4656v1, interfaceC4351m2, function4, function2, i13, i14);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m91307i(InterfaceC23013y interfaceC23013y, EnumC26811m loadingState, C26809k submitErrorToast, InterfaceC4339a onRetry, Function3 footer, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(submitErrorToast, "submitErrorToast");
        AbstractC22676k.m65750j(onRetry, "onRetry");
        AbstractC22676k.m65750j(footer, "footer");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1357721112);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(loadingState.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(submitErrorToast) : c28655q.m87157i(submitErrorToast) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onRetry) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(footer) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            if (loadingState == EnumC26811m.MESSAGE_ERROR || loadingState == EnumC26811m.MESSAGE_FLAGGED) {
                c28655q.m87150e0(2132673219);
                AbstractC32667r2.m102247d(loadingState, onRetry, c28655q, ((i15 >> 3) & 14) | ((i15 >> 6) & 112), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2132726074);
                c28655q.m87173q(false);
            }
            AbstractC1090b.m3350e(interfaceC23013y, submitErrorToast.getShowFeedbackToast(), null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(1967209664, c28655q, new C24823a(submitErrorToast, 15)), c28655q, (i15 & 14) | 1600512, 18);
            footer.invoke(loadingState, c28655q, Integer.valueOf(((i15 >> 3) & 14) | ((i15 >> 9) & 112)));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(interfaceC23013y, loadingState, submitErrorToast, onRetry, footer, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m91308j(C26809k c26809k, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC32661q1.m102241b(c26809k.getFeedbackToastColor(), c26809k.getFeedbackToastText(), c26809k.getFeedbackToastIcon(), composer, TextResource.$stable << 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m91309k(InterfaceC23013y interfaceC23013y, EnumC26811m enumC26811m, C26809k c26809k, InterfaceC4339a interfaceC4339a, Function3 function3, int i13, Composer composer, int i14) {
        m91307i(interfaceC23013y, enumC26811m, c26809k, interfaceC4339a, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final EnumC26811m m91310l(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC26811m) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m91311m(C32645n0 c32645n0, Modifier modifier, boolean z4, float f13, EnumC4612d0 enumC4612d0, C4656v0 c4656v0, InterfaceC4351m interfaceC4351m, Function3 function3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91306h(c32645n0, modifier, z4, f13, enumC4612d0, c4656v0, interfaceC4351m, function3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m91312n(InterfaceC28601c1 interfaceC28601c1, EnumC26811m enumC26811m) {
        interfaceC28601c1.setValue(enumC26811m);
    }

    /* JADX INFO: renamed from: o */
    private static final C26809k m91313o(InterfaceC28601c1 interfaceC28601c1) {
        return (C26809k) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m91314p(InterfaceC28601c1 interfaceC28601c1, C26809k c26809k) {
        interfaceC28601c1.setValue(c26809k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28620h0 m91315q(C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        c4656v0.m14673A(interfaceC2994c0, false);
        return new c(interfaceC12251g, c4656v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final float m91316r(C13821r1 c13821r1, float f13) {
        return m91319u(c13821r1.f49318a.m87024x(), f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m91317s(InterfaceC28601c1 interfaceC28601c1, EnumC26811m it) {
        AbstractC22676k.m65750j(it, "it");
        m91312n(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91318t(InterfaceC28601c1 interfaceC28601c1, C26809k it) {
        AbstractC22676k.m65750j(it, "it");
        m91314p(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final float m91319u(int i13, float f13) {
        if (f13 <= 0.0f) {
            return 0.0f;
        }
        return AbstractC12889b.m36283m(i13 / f13, 0.0f, 1.0f);
    }
}
