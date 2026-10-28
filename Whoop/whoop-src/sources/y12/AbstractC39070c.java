package y12;

import a81.C0556g;
import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.ChatHeaderMetadata;
import fg2.C14470l;
import ih0.AbstractC18504n;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import l83.C23454a0;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import o01.AbstractC27348d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p702ch0.AbstractC4658w0;
import p702ch0.C4656v0;
import p702ch0.EnumC4612d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p72.C28958a;
import p733ry2.C31918g;
import p734sl0.C32645n0;
import p734sl0.C32655p0;
import ph1.C29244h;
import q12.AbstractC29803d;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v90.C35813e;
import w12.AbstractC36705h;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x30.C37888f1;
import x81.C38072d;

/* JADX INFO: renamed from: y12.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a[\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\u000e\u0010\u0018\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsl0/n0;", "screenArgs", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/navigation/models/ChatHeaderMetadata;", "headerMetaData", "Lkotlin/Function0;", "Ll83/a0;", "onBack", "onUnrecoverableFailure", "Lch0/v0;", "coordinator", "l", "(Lsl0/n0;Landroidx/compose/ui/Modifier;Lcom/whoop/navigation/models/ChatHeaderMetadata;Lc93/a;Lc93/a;Lch0/v0;Landroidx/compose/runtime/Composer;II)V", "Lnl0/m;", "loadingState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lnl0/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "t", "(Lnl0/m;Landroidx/compose/runtime/Composer;I)I", "completedTurns", "j", "(Lcom/whoop/navigation/models/ChatHeaderMetadata;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "count", "onboarding-personalization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39070c {

    /* JADX INFO: renamed from: y12.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function1 {
        public a(Object obj) {
            super(1, 0, C39068a.class, obj, "record", "record(Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m124614a(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C39068a) this.receiver).m124590c(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124614a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y12.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.ui.DayZeroPersonalizationChatScreenKt$rememberFailedLoadCount$1$1", m100430f = "DayZeroPersonalizationChatScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168114w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC26811m f168115x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f168116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC26811m enumC26811m, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168115x = enumC26811m;
            this.f168116y = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f168115x, this.f168116y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168114w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f168115x == EnumC26811m.SCREEN_ERROR) {
                AbstractC39070c.m124613v(this.f168116y, AbstractC39070c.m124612u(this.f168116y) + 1);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m124599h(EnumC26811m loadingState, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(loadingState, "loadingState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(913267311);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87149e(loadingState.ordinal()) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int iM124611t = m124611t(loadingState, c28655q, i14 & 14);
            if (interfaceC4339a == null || iM124611t < 3) {
                c28655q.m87150e0(-1470802637);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1471107274);
                float f13 = 2 * 8;
                AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1099a.m3395q(C2314t.f9131w, f13, f13), "DayZeroChatExit"), false, AbstractC8693b.m21277k(AbstractC37336b.f159693s), null, null, null, null, null, false, null, interfaceC4339a, c28655q, (TextResource.C8688b.f25889c << 6) | 6, (i14 >> 3) & 14, MessageListItemViewType.POLL);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(loadingState, interfaceC4339a, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m124600i(EnumC26811m enumC26811m, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m124599h(enumC26811m, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    private static final void m124601j(ChatHeaderMetadata chatHeaderMetadata, int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1639837168);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(chatHeaderMetadata) : c28655q.m87157i(chatHeaderMetadata) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                float f15 = 4 * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier4), "DayZeroChatHeader"), f14, f14, f14, f15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
                AbstractC27348d.m82519c(null, c28655q, 0, 1);
                if (chatHeaderMetadata != null) {
                    c28655q.m87150e0(1597117052);
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC36705h.m117833f(chatHeaderMetadata, AbstractC1136a.m3599a(new LayoutWeightElement(1.0f, true), "DayZeroHeaderWidgets"), i13, 0.0f, c28655q, ChatHeaderMetadata.$stable | (i16 & 14) | ((i16 << 3) & 896), 8);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1597388054);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C29244h(chatHeaderMetadata, i13, modifier3, i14, i15, 3);
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            float f16 = 8;
            float f17 = ((float) 2.5d) * f16;
            float f18 = 4 * f16;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier4), "DayZeroChatHeader"), f17, f17, f17, f18);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
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
            AbstractC27348d.m82519c(null, c28655q, 0, 1);
            if (chatHeaderMetadata != null) {
                c28655q.m87150e0(1597117052);
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC36705h.m117833f(chatHeaderMetadata, AbstractC1136a.m3599a(new LayoutWeightElement(1.0f, true), "DayZeroHeaderWidgets"), i13, 0.0f, c28655q, ChatHeaderMetadata.$stable | (i16 & 14) | ((i16 << 3) & 896), 8);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1597388054);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(chatHeaderMetadata, i13, modifier3, i14, i15, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m124602k(ChatHeaderMetadata chatHeaderMetadata, int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m124601j(chatHeaderMetadata, i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0197  */
    /* JADX WARN: Code duplicated, block: B:112:0x019b  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX INFO: renamed from: l */
    public static final void m124603l(C32645n0 screenArgs, Modifier modifier, ChatHeaderMetadata chatHeaderMetadata, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C4656v0 c4656v0, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean zM87157i;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a3;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a4;
        int i25;
        boolean z4;
        ChatHeaderMetadata chatHeaderMetadata2;
        C4656v0 c4656v1;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        InterfaceC4339a interfaceC4339a7;
        ChatHeaderMetadata chatHeaderMetadata3;
        int i26;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i27;
        boolean zM87157i2;
        ChatHeaderMetadata chatHeaderMetadata4 = chatHeaderMetadata;
        C4656v0 c4656v0M14712i = c4656v0;
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-741766095);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(screenArgs) : c28655q.m87157i(screenArgs) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(chatHeaderMetadata4);
                } else {
                    zM87157i = c28655q.m87157i(chatHeaderMetadata4);
                }
                if (zM87157i) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if ((i14 & 32) != 0) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            if ((262144 & i13) == 0) {
                                zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                            } else {
                                zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                            }
                            if (zM87157i2) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                        }
                        i15 |= i27;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if (i28 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                chatHeaderMetadata4 = null;
                            }
                            if (i18 != 0) {
                                interfaceC4339a3 = null;
                            }
                            if (i24 != 0) {
                                interfaceC4339a4 = null;
                            }
                            if ((i14 & 32) != 0) {
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                                i15 &= -458753;
                            }
                            modifier4 = modifier3;
                            interfaceC4339a7 = interfaceC4339a4;
                            chatHeaderMetadata3 = chatHeaderMetadata4;
                            i26 = i15;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 32) != 0) {
                                i15 &= -458753;
                            }
                            chatHeaderMetadata3 = chatHeaderMetadata4;
                            i26 = i15;
                            modifier4 = modifier2;
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        C4656v0 c4656v2 = c4656v0M14712i;
                        c28655q.m87175r();
                        if ((i26 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C31918g(interfaceC4339a3, 29);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                        C39068a c39068aM124591a = AbstractC39069b.m124591a(c28655q, 0);
                        Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3357b);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a, screenArgs, c4656v2, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                        c28655q.m87173q(true);
                        Modifier modifier5 = modifier4;
                        interfaceC4339a5 = interfaceC4339a7;
                        modifier2 = modifier5;
                        c4656v1 = c4656v2;
                        chatHeaderMetadata2 = chatHeaderMetadata3;
                    } else {
                        c28655q.m87138X();
                        chatHeaderMetadata2 = chatHeaderMetadata4;
                        c4656v1 = c4656v0M14712i;
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    interfaceC4339a6 = interfaceC4339a3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((196608 & i13) == 0) {
                    if ((i14 & 32) != 0) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                        } else {
                            zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                        }
                        if (zM87157i2) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    } else {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    }
                    C4656v0 c4656v3 = c4656v0M14712i;
                    c28655q.m87175r();
                    if ((i26 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                    C39068a c39068aM124591a2 = AbstractC39069b.m124591a(c28655q, 0);
                    Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3357b2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a2, screenArgs, c4656v3, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                    c28655q.m87173q(true);
                    Modifier modifier6 = modifier4;
                    interfaceC4339a5 = interfaceC4339a7;
                    modifier2 = modifier6;
                    c4656v1 = c4656v3;
                    chatHeaderMetadata2 = chatHeaderMetadata3;
                } else {
                    c28655q.m87138X();
                    chatHeaderMetadata2 = chatHeaderMetadata4;
                    c4656v1 = c4656v0M14712i;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
                }
            }
            i15 |= 3072;
            interfaceC4339a3 = interfaceC4339a;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if ((i14 & 32) != 0) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                        } else {
                            zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                        }
                        if (zM87157i2) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    } else {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    }
                    C4656v0 c4656v4 = c4656v0M14712i;
                    c28655q.m87175r();
                    if ((i26 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                    C39068a c39068aM124591a3 = AbstractC39069b.m124591a(c28655q, 0);
                    Modifier modifierM3357b3 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3357b3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a3, screenArgs, c4656v4, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                    c28655q.m87173q(true);
                    Modifier modifier7 = modifier4;
                    interfaceC4339a5 = interfaceC4339a7;
                    modifier2 = modifier7;
                    c4656v1 = c4656v4;
                    chatHeaderMetadata2 = chatHeaderMetadata3;
                } else {
                    c28655q.m87138X();
                    chatHeaderMetadata2 = chatHeaderMetadata4;
                    c4656v1 = c4656v0M14712i;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((196608 & i13) == 0) {
                if ((i14 & 32) != 0) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                    } else {
                        zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                    }
                    if (zM87157i2) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                } else {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                }
                C4656v0 c4656v5 = c4656v0M14712i;
                c28655q.m87175r();
                if ((i26 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                C39068a c39068aM124591a4 = AbstractC39069b.m124591a(c28655q, 0);
                Modifier modifierM3357b4 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3357b4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a4, screenArgs, c4656v5, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                c28655q.m87173q(true);
                Modifier modifier8 = modifier4;
                interfaceC4339a5 = interfaceC4339a7;
                modifier2 = modifier8;
                c4656v1 = c4656v5;
                chatHeaderMetadata2 = chatHeaderMetadata3;
            } else {
                c28655q.m87138X();
                chatHeaderMetadata2 = chatHeaderMetadata4;
                c4656v1 = c4656v0M14712i;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                zM87157i = c28655q.m87153g(chatHeaderMetadata4);
            } else {
                zM87157i = c28655q.m87157i(chatHeaderMetadata4);
            }
            if (zM87157i) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if ((i14 & 32) != 0) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                        } else {
                            zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                        }
                        if (zM87157i2) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    } else {
                        if (i28 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            chatHeaderMetadata4 = null;
                        }
                        if (i18 != 0) {
                            interfaceC4339a3 = null;
                        }
                        if (i24 != 0) {
                            interfaceC4339a4 = null;
                        }
                        if ((i14 & 32) != 0) {
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                            i15 &= -458753;
                        }
                        modifier4 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                        chatHeaderMetadata3 = chatHeaderMetadata4;
                        i26 = i15;
                    }
                    C4656v0 c4656v6 = c4656v0M14712i;
                    c28655q.m87175r();
                    if ((i26 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a3, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                    C39068a c39068aM124591a5 = AbstractC39069b.m124591a(c28655q, 0);
                    Modifier modifierM3357b5 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3357b5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a5, screenArgs, c4656v6, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                    c28655q.m87173q(true);
                    Modifier modifier9 = modifier4;
                    interfaceC4339a5 = interfaceC4339a7;
                    modifier2 = modifier9;
                    c4656v1 = c4656v6;
                    chatHeaderMetadata2 = chatHeaderMetadata3;
                } else {
                    c28655q.m87138X();
                    chatHeaderMetadata2 = chatHeaderMetadata4;
                    c4656v1 = c4656v0M14712i;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((196608 & i13) == 0) {
                if ((i14 & 32) != 0) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                    } else {
                        zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                    }
                    if (zM87157i2) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                } else {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                }
                C4656v0 c4656v7 = c4656v0M14712i;
                c28655q.m87175r();
                if ((i26 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                C39068a c39068aM124591a6 = AbstractC39069b.m124591a(c28655q, 0);
                Modifier modifierM3357b6 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3357b6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a6, screenArgs, c4656v7, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                c28655q.m87173q(true);
                Modifier modifier10 = modifier4;
                interfaceC4339a5 = interfaceC4339a7;
                modifier2 = modifier10;
                c4656v1 = c4656v7;
                chatHeaderMetadata2 = chatHeaderMetadata3;
            } else {
                c28655q.m87138X();
                chatHeaderMetadata2 = chatHeaderMetadata4;
                c4656v1 = c4656v0M14712i;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
            }
        }
        i15 |= 3072;
        interfaceC4339a3 = interfaceC4339a;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if ((i14 & 32) != 0) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                    } else {
                        zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                    }
                    if (zM87157i2) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                } else {
                    if (i28 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        chatHeaderMetadata4 = null;
                    }
                    if (i18 != 0) {
                        interfaceC4339a3 = null;
                    }
                    if (i24 != 0) {
                        interfaceC4339a4 = null;
                    }
                    if ((i14 & 32) != 0) {
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                        i15 &= -458753;
                    }
                    modifier4 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                    chatHeaderMetadata3 = chatHeaderMetadata4;
                    i26 = i15;
                }
                C4656v0 c4656v8 = c4656v0M14712i;
                c28655q.m87175r();
                if ((i26 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a3, 29);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
                C39068a c39068aM124591a7 = AbstractC39069b.m124591a(c28655q, 0);
                Modifier modifierM3357b7 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3357b7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a7, screenArgs, c4656v8, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
                c28655q.m87173q(true);
                Modifier modifier11 = modifier4;
                interfaceC4339a5 = interfaceC4339a7;
                modifier2 = modifier11;
                c4656v1 = c4656v8;
                chatHeaderMetadata2 = chatHeaderMetadata3;
            } else {
                c28655q.m87138X();
                chatHeaderMetadata2 = chatHeaderMetadata4;
                c4656v1 = c4656v0M14712i;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((196608 & i13) == 0) {
            if ((i14 & 32) != 0) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((262144 & i13) == 0) {
                    zM87157i2 = c28655q.m87153g(c4656v0M14712i);
                } else {
                    zM87157i2 = c28655q.m87157i(c4656v0M14712i);
                }
                if (zM87157i2) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i27;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i28 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    chatHeaderMetadata4 = null;
                }
                if (i18 != 0) {
                    interfaceC4339a3 = null;
                }
                if (i24 != 0) {
                    interfaceC4339a4 = null;
                }
                if ((i14 & 32) != 0) {
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                    i15 &= -458753;
                }
                modifier4 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
                chatHeaderMetadata3 = chatHeaderMetadata4;
                i26 = i15;
            } else {
                if (i28 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    chatHeaderMetadata4 = null;
                }
                if (i18 != 0) {
                    interfaceC4339a3 = null;
                }
                if (i24 != 0) {
                    interfaceC4339a4 = null;
                }
                if ((i14 & 32) != 0) {
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q, (C32645n0.f135304t << 3) | ((i15 << 3) & 112));
                    i15 &= -458753;
                }
                modifier4 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
                chatHeaderMetadata3 = chatHeaderMetadata4;
                i26 = i15;
            }
            C4656v0 c4656v9 = c4656v0M14712i;
            c28655q.m87175r();
            if ((i26 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C31918g(interfaceC4339a3, 29);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a3, 29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q, 6, 0);
            C39068a c39068aM124591a8 = AbstractC39069b.m124591a(c28655q, 0);
            Modifier modifierM3357b8 = AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), C32655p0.f135412a.m102118b(), null, 0.0f, 6);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3357b8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            AbstractC28683x.m87247a(AbstractC18504n.m53619h().mo86977a(Boolean.TRUE), AbstractC37817c.m121344e(-55660809, c28655q, new C0556g(c39068aM124591a8, screenArgs, c4656v9, chatHeaderMetadata3, interfaceC4339a7, 24)), c28655q, 56);
            c28655q.m87173q(true);
            Modifier modifier12 = modifier4;
            interfaceC4339a5 = interfaceC4339a7;
            modifier2 = modifier12;
            c4656v1 = c4656v9;
            chatHeaderMetadata2 = chatHeaderMetadata3;
        } else {
            c28655q.m87138X();
            chatHeaderMetadata2 = chatHeaderMetadata4;
            c4656v1 = c4656v0M14712i;
            interfaceC4339a5 = interfaceC4339a4;
        }
        interfaceC4339a6 = interfaceC4339a3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(i13, i14, 13, screenArgs, modifier2, chatHeaderMetadata2, c4656v1, interfaceC4339a6, interfaceC4339a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m124604m(InterfaceC4339a interfaceC4339a) {
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m124605n(C39068a c39068a, C32645n0 c32645n0, C4656v0 c4656v0, ChatHeaderMetadata chatHeaderMetadata, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66725n(C2314t.f9131w));
            float f13 = 4 * 8;
            EnumC4612d0 enumC4612d0 = EnumC4612d0.PINS_LATEST_RESPONSE;
            boolean zM87153g = c28655q.m87153g(c39068a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c39068a);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29803d.m91306h(c32645n0, modifierM66720i, false, f13, enumC4612d0, c4656v0, AbstractC37817c.m121344e(-1472192108, c28655q, new C37888f1(5, chatHeaderMetadata, c39068a)), AbstractC37817c.m121344e(-947282144, c28655q, new C14470l(interfaceC4339a, 2)), (Function1) ((InterfaceC21467g) objM87133R), c28655q, 14183424 | C32645n0.f135304t | (C4656v0.f18980q << 15), 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m124606o(ChatHeaderMetadata chatHeaderMetadata, C39068a c39068a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m124601j(chatHeaderMetadata, c39068a.m124589a(), null, c28655q, ChatHeaderMetadata.$stable, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m124607p(InterfaceC4339a interfaceC4339a, EnumC26811m loadingState, Composer composer, int i13) {
        AbstractC22676k.m65750j(loadingState, "loadingState");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87149e(loadingState.ordinal()) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            m124599h(loadingState, interfaceC4339a, c28655q, i13 & 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m124608q(C32645n0 c32645n0, Modifier modifier, ChatHeaderMetadata chatHeaderMetadata, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C4656v0 c4656v0, int i13, int i14, Composer composer, int i15) {
        m124603l(c32645n0, modifier, chatHeaderMetadata, interfaceC4339a, interfaceC4339a2, c4656v0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final int m124611t(EnumC26811m enumC26811m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC31061c.m95646v(0, c28655q);
        }
        InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
        boolean z4 = (((i13 & 14) ^ 6) > 4 && c28655q.m87149e(enumC26811m.ordinal())) || (i13 & 6) == 4;
        Object objM87133R2 = c28655q.m87133R();
        if (z4 || objM87133R2 == c28676v0) {
            objM87133R2 = new b(enumC26811m, interfaceC28593a1, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, enumC26811m);
        return m124612u(interfaceC28593a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final int m124612u(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m124613v(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }
}
