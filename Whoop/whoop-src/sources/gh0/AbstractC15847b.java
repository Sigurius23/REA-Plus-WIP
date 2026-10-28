package gh0;

import a00.C0073h;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.profile.view.C9814j;
import fa0.C14294a;
import ga1.C15620a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13989w1;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: gh0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "textToCopy", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "feedbackType", "", "showFeedbackButtons", "Lkotlin/Function1;", "Ll83/a0;", "onFeedbackClicked", "Lkotlin/Function0;", "onMessageCopied", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "alpha", "m", "(Landroidx/compose/ui/Modifier;Lcom/whoop/bot/models/feedback/AiFeedbackType;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/ClipboardManager;", "clipboardManager", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15847b {

    /* JADX INFO: renamed from: gh0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f59853w = new a();

        /* JADX INFO: renamed from: a */
        public final long m44701a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44701a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gh0.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f59854w = new b();

        /* JADX INFO: renamed from: a */
        public final long m44702a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44702a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gh0.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f59855w = new c();

        /* JADX INFO: renamed from: a */
        public final long m44703a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44703a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gh0.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f59856w = new d();

        /* JADX INFO: renamed from: a */
        public final long m44704a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44704a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gh0.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59857a;

        static {
            int[] iArr = new int[AiFeedbackType.values().length];
            try {
                iArr[AiFeedbackType.BETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AiFeedbackType.WORSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59857a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x020f  */
    /* JADX WARN: Code duplicated, block: B:109:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0245  */
    /* JADX WARN: Code duplicated, block: B:114:0x0252  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x01be  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cc  */
    /* JADX INFO: renamed from: h */
    public static final void m44691h(Modifier modifier, String textToCopy, AiFeedbackType aiFeedbackType, boolean z4, Function1 onFeedbackClicked, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z16;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        String strM92103Y;
        Context context;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        boolean z17;
        boolean z18;
        boolean zM87157i;
        Object objM87133R2;
        Modifier modifier5;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R3;
        int i19;
        AbstractC22676k.m65750j(textToCopy, "textToCopy");
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1646346090);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(textToCopy) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(aiFeedbackType == null ? -1 : aiFeedbackType.ordinal()) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onFeedbackClicked)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15620a(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                    Object systemService = ((Context) c28655q.m87161k(c28674u2)).getSystemService("clipboard");
                    AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService, c28655q);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159679l);
                    context = (Context) c28655q.m87161k(c28674u2);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 3 * 8, 0.0f, 0.0f, 0.0f, 14), "feedbackRow");
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    int i26 = AbstractC37335a.f159604f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = a.f59853w;
                        c28655q.m87172p0(objM87133R);
                    }
                    C27270o c27270o = new C27270o(bVar, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159681m);
                    boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
                    if ((i18 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z19 = zM87153g | z17;
                    if ((i18 & 458752) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i = z19 | z18 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87157i || objM87133R2 == c28676v0) {
                        modifier5 = modifier4;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                        C0073h c0073h = new C0073h(textToCopy, (Object) interfaceC4339a5, context, strM92103Y, interfaceC28601c1M87238F, 8);
                        interfaceC4339a4 = interfaceC4339a5;
                        c28655q.m87172p0(c0073h);
                        objM87133R2 = c0073h;
                    } else {
                        modifier5 = modifier4;
                        interfaceC4339a4 = interfaceC4339a3;
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y2, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    if (z16) {
                        c28655q.m87150e0(-396052402);
                        AbstractC38963t7.m124386p(1, 4, c2314t, c28655q);
                        m44696m(null, aiFeedbackType, 0.0f, onFeedbackClicked, c28655q, (i18 >> 3) & 7280, 5);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-395842904);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z15 = z16;
                    modifier3 = modifier5;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(modifier3, textToCopy, aiFeedbackType, z15, onFeedbackClicked, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15620a(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                C28674u2 c28674u3 = AndroidCompositionLocals_androidKt.f4976b;
                Object systemService2 = ((Context) c28655q.m87161k(c28674u3)).getSystemService("clipboard");
                AbstractC22676k.m65748h(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService2, c28655q);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159679l);
                context = (Context) c28655q.m87161k(c28674u3);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 3 * 8, 0.0f, 0.0f, 0.0f, 14), "feedbackRow");
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                int i27 = AbstractC37335a.f159604f;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f59853w;
                    c28655q.m87172p0(objM87133R);
                }
                C27270o c27270o2 = new C27270o(bVar2, i27, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159681m);
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F);
                if ((i18 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z110 = zM87153g2 | z17;
                if ((i18 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i = z110 | z18 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    modifier5 = modifier4;
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                    C0073h c0073h2 = new C0073h(textToCopy, (Object) interfaceC4339a6, context, strM92103Y, interfaceC28601c1M87238F, 8);
                    interfaceC4339a4 = interfaceC4339a6;
                    c28655q.m87172p0(c0073h2);
                    objM87133R2 = c0073h2;
                } else {
                    modifier5 = modifier4;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                    C0073h c0073h3 = new C0073h(textToCopy, (Object) interfaceC4339a7, context, strM92103Y, interfaceC28601c1M87238F, 8);
                    interfaceC4339a4 = interfaceC4339a7;
                    c28655q.m87172p0(c0073h3);
                    objM87133R2 = c0073h3;
                }
                AbstractC27242b1.m82092d(c27270o2, strM92103Y3, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                if (z16) {
                    c28655q.m87150e0(-396052402);
                    AbstractC38963t7.m124386p(1, 4, c2314t, c28655q);
                    m44696m(null, aiFeedbackType, 0.0f, onFeedbackClicked, c28655q, (i18 >> 3) & 7280, 5);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-395842904);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z15 = z16;
                modifier3 = modifier5;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier3, textToCopy, aiFeedbackType, z15, onFeedbackClicked, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onFeedbackClicked)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15620a(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                C28674u2 c28674u4 = AndroidCompositionLocals_androidKt.f4976b;
                Object systemService3 = ((Context) c28655q.m87161k(c28674u4)).getSystemService("clipboard");
                AbstractC22676k.m65748h(systemService3, "null cannot be cast to non-null type android.content.ClipboardManager");
                interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService3, c28655q);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159679l);
                context = (Context) c28655q.m87161k(c28674u4);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 3 * 8, 0.0f, 0.0f, 0.0f, 14), "feedbackRow");
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                int i28 = AbstractC37335a.f159604f;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f59853w;
                    c28655q.m87172p0(objM87133R);
                }
                C27270o c27270o3 = new C27270o(bVar3, i28, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159681m);
                boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87238F);
                if ((i18 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z111 = zM87153g3 | z17;
                if ((i18 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i = z111 | z18 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    modifier5 = modifier4;
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                    C0073h c0073h4 = new C0073h(textToCopy, (Object) interfaceC4339a8, context, strM92103Y, interfaceC28601c1M87238F, 8);
                    interfaceC4339a4 = interfaceC4339a8;
                    c28655q.m87172p0(c0073h4);
                    objM87133R2 = c0073h4;
                } else {
                    modifier5 = modifier4;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                    C0073h c0073h5 = new C0073h(textToCopy, (Object) interfaceC4339a9, context, strM92103Y, interfaceC28601c1M87238F, 8);
                    interfaceC4339a4 = interfaceC4339a9;
                    c28655q.m87172p0(c0073h5);
                    objM87133R2 = c0073h5;
                }
                AbstractC27242b1.m82092d(c27270o3, strM92103Y4, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                if (z16) {
                    c28655q.m87150e0(-396052402);
                    AbstractC38963t7.m124386p(1, 4, c2314t, c28655q);
                    m44696m(null, aiFeedbackType, 0.0f, onFeedbackClicked, c28655q, (i18 >> 3) & 7280, 5);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-395842904);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z15 = z16;
                modifier3 = modifier5;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(modifier3, textToCopy, aiFeedbackType, z15, onFeedbackClicked, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i18 = i15;
        if ((i18 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i25 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15620a(14);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            C28674u2 c28674u5 = AndroidCompositionLocals_androidKt.f4976b;
            Object systemService4 = ((Context) c28655q.m87161k(c28674u5)).getSystemService("clipboard");
            AbstractC22676k.m65748h(systemService4, "null cannot be cast to non-null type android.content.ClipboardManager");
            interfaceC28601c1M87238F = AbstractC28683x.m87238F((ClipboardManager) systemService4, c28655q);
            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159679l);
            context = (Context) c28655q.m87161k(c28674u5);
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 3 * 8, 0.0f, 0.0f, 0.0f, 14), "feedbackRow");
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3599a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
            int i29 = AbstractC37335a.f159604f;
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = a.f59853w;
                c28655q.m87172p0(objM87133R);
            }
            C27270o c27270o4 = new C27270o(bVar4, i29, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159681m);
            boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87238F);
            if ((i18 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z112 = zM87153g4 | z17;
            if ((i18 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87157i = z112 | z18 | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                modifier5 = modifier4;
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a3;
                C0073h c0073h6 = new C0073h(textToCopy, (Object) interfaceC4339a10, context, strM92103Y, interfaceC28601c1M87238F, 8);
                interfaceC4339a4 = interfaceC4339a10;
                c28655q.m87172p0(c0073h6);
                objM87133R2 = c0073h6;
            } else {
                modifier5 = modifier4;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                C0073h c0073h7 = new C0073h(textToCopy, (Object) interfaceC4339a11, context, strM92103Y, interfaceC28601c1M87238F, 8);
                interfaceC4339a4 = interfaceC4339a11;
                c28655q.m87172p0(c0073h7);
                objM87133R2 = c0073h7;
            }
            AbstractC27242b1.m82092d(c27270o4, strM92103Y5, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
            if (z16) {
                c28655q.m87150e0(-396052402);
                AbstractC38963t7.m124386p(1, 4, c2314t, c28655q);
                m44696m(null, aiFeedbackType, 0.0f, onFeedbackClicked, c28655q, (i18 >> 3) & 7280, 5);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-395842904);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            z15 = z16;
            modifier3 = modifier5;
            interfaceC4339a2 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(modifier3, textToCopy, aiFeedbackType, z15, onFeedbackClicked, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m44692i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final ClipboardManager m44693j(InterfaceC28670t2 interfaceC28670t2) {
        return (ClipboardManager) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m44694k(String str, InterfaceC4339a interfaceC4339a, Context context, String str2, InterfaceC28670t2 interfaceC28670t2) {
        m44693j(interfaceC28670t2).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
        interfaceC4339a.invoke();
        if (Build.VERSION.SDK_INT < 33) {
            Toast.makeText(context, str2, 1).show();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m44695l(Modifier modifier, String str, AiFeedbackType aiFeedbackType, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m44691h(modifier, str, aiFeedbackType, z4, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0233  */
    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:105:0x023a  */
    /* JADX WARN: Code duplicated, block: B:106:0x023c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:113:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0275  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
    /* JADX INFO: renamed from: m */
    public static final void m44696m(Modifier modifier, AiFeedbackType aiFeedbackType, float f13, Function1 onFeedbackClicked, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f14;
        boolean z4;
        Modifier modifier3;
        float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        float f16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28676v0 c28676v0;
        int i16;
        int iM46359t;
        Object objM87133R;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        Object objM87133R3;
        int i17;
        boolean z16;
        Object objM87133R4;
        Object objM87133R5;
        boolean z17;
        Object objM87133R6;
        int i18;
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1465132975);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(aiFeedbackType == null ? -1 : aiFeedbackType.ordinal()) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onFeedbackClicked)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    f16 = 0.7f;
                } else {
                    f16 = f14;
                }
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28676v0 = C28635l.f115821a;
                if (aiFeedbackType == null) {
                    c28655q.m87150e0(93514592);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    C38072d c38072d = C38072d.f163053a;
                    int iM46344k0 = c38072d.m121951d().getVarious().getThumbUp();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = b.f59854w;
                        c28655q.m87172p0(objM87133R3);
                    }
                    C27270o c27270o = new C27270o(bVar, iM46344k0, p745y81.Function1.m125323a((Function1) objM87133R3), null, null, false, false, false, f16, false, 760, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159613C0);
                    i17 = i15 & 7168;
                    if (i17 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z16 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C14294a(onFeedbackClicked, 20);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i25 = C27270o.f109105k;
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R4, c28655q, i25, 12);
                    int iM46342j0 = c38072d.m121951d().getVarious().getThumbDown();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = c.f59855w;
                        c28655q.m87172p0(objM87133R5);
                    }
                    C27270o c27270o2 = new C27270o(bVar, iM46342j0, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, false, false, false, f16, false, 760, null);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159611B0);
                    if (i17 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z17 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C14294a(onFeedbackClicked, 21);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, null, (InterfaceC4339a) objM87133R6, c28655q, i25, 12);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(94542645);
                    i16 = e.f59857a[aiFeedbackType.ordinal()];
                    if (i16 != 1) {
                        iM46359t = C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsUp();
                    } else {
                        if (i16 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iM46359t = C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsDown();
                    }
                    int i26 = iM46359t;
                    AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = d.f59856w;
                        c28655q.m87172p0(objM87133R);
                    }
                    C27270o c27270o3 = new C27270o(bVar2, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f16, false, 760, null);
                    String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C13989w1(14, onFeedbackClicked, aiFeedbackType);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o3, strM92103Y3, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
                f15 = f16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(modifier3, aiFeedbackType, f15, onFeedbackClicked, i13, i14, 3);
            }
        }
        i15 |= 384;
        f14 = f13;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onFeedbackClicked)) {
                i18 = 2048;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i24 != 0) {
                f16 = 0.7f;
            } else {
                f16 = f14;
            }
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 0.5d) * 8, modifier4);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28676v0 = C28635l.f115821a;
            if (aiFeedbackType == null) {
                c28655q.m87150e0(93514592);
                AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                C38072d c38072d2 = C38072d.f163053a;
                int iM46344k1 = c38072d2.m121951d().getVarious().getThumbUp();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = b.f59854w;
                    c28655q.m87172p0(objM87133R3);
                }
                C27270o c27270o4 = new C27270o(bVar3, iM46344k1, p745y81.Function1.m125323a((Function1) objM87133R3), null, null, false, false, false, f16, false, 760, null);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159613C0);
                i17 = i15 & 7168;
                if (i17 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z16) {
                    objM87133R4 = new C14294a(onFeedbackClicked, 20);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C14294a(onFeedbackClicked, 20);
                    c28655q.m87172p0(objM87133R4);
                }
                int i27 = C27270o.f109105k;
                AbstractC27242b1.m82092d(c27270o4, strM92103Y4, null, null, (InterfaceC4339a) objM87133R4, c28655q, i27, 12);
                int iM46342j1 = c38072d2.m121951d().getVarious().getThumbDown();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = c.f59855w;
                    c28655q.m87172p0(objM87133R5);
                }
                C27270o c27270o5 = new C27270o(bVar3, iM46342j1, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, false, false, false, f16, false, 760, null);
                String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159611B0);
                if (i17 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z17) {
                    objM87133R6 = new C14294a(onFeedbackClicked, 21);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C14294a(onFeedbackClicked, 21);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27242b1.m82092d(c27270o5, strM92103Y5, null, null, (InterfaceC4339a) objM87133R6, c28655q, i27, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(94542645);
                i16 = e.f59857a[aiFeedbackType.ordinal()];
                if (i16 != 1) {
                    iM46359t = C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsUp();
                } else {
                    if (i16 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iM46359t = C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsDown();
                }
                int i28 = iM46359t;
                AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = d.f59856w;
                    c28655q.m87172p0(objM87133R);
                }
                C27270o c27270o6 = new C27270o(bVar4, i28, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f16, false, 760, null);
                String strM92103Y6 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C13989w1(14, onFeedbackClicked, aiFeedbackType);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13989w1(14, onFeedbackClicked, aiFeedbackType);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o6, strM92103Y6, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
            f15 = f16;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(modifier3, aiFeedbackType, f15, onFeedbackClicked, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m44697n(Function1 function1) {
        function1.invoke(AiFeedbackType.BETTER);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m44698o(Function1 function1) {
        function1.invoke(AiFeedbackType.WORSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m44699p(Function1 function1, AiFeedbackType aiFeedbackType) {
        function1.invoke(aiFeedbackType);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m44700q(Modifier modifier, AiFeedbackType aiFeedbackType, float f13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44696m(modifier, aiFeedbackType, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
