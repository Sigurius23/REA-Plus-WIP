package vl0;

import a12.AbstractC0142b;
import am2.C1023i0;
import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1583f2;
import aw0.C2101a;
import bc3.InterfaceC2994c0;
import c91.InterfaceC4327a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.TextResource;
import e31.AbstractC12610b;
import e31.C12611c;
import gb1.AbstractC15673b0;
import gb1.AbstractC15679g;
import gy0.AbstractC16276e;
import ih0.AbstractC18486c;
import ih0.C18497h0;
import ih0.InterfaceC18484b;
import java.util.Map;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import ny0.C27256h;
import o71.C27632b;
import ol0.C28012b;
import ol0.C28013c;
import ol0.InterfaceC28011a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p734sl0.AbstractC32640m0;
import p736sz0.AbstractC33208p0;
import p739ui0.C35015q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v31.C35608d;
import v41.AbstractC35684p;
import v41.C35657b0;
import v41.InterfaceC35689r0;
import v90.C35813e;
import ve.C35916a;
import ve0.C35926d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lvl0/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "t", "(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "widget", "", "path", "G", "(Lm91/u;Ljava/lang/String;)Lm91/u;", "Lol0/c;", "viewState", "onEvent", "s", "(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "I", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lol0/c$a;", "Lol0/a;", "o", "(Lol0/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "H", "()Landroidx/compose/ui/Modifier;", "aiDashedBorderModifier", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36101d {

    /* JADX INFO: renamed from: vl0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.chatminiarch.ChatMiniArchWidgetItemKt$ChatMiniArchWidgetScreen$2$1", m100430f = "ChatMiniArchWidgetItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154328w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28012b f154329x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36102e f154330y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C28012b c28012b, C36102e c36102e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154329x = c28012b;
            this.f154330y = c36102e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f154329x, this.f154330y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f154328w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f154329x.mo1216g(new InterfaceC28011a.a(this.f154330y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m114703A(Modifier modifier, C36102e c36102e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m114731t(modifier, c36102e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m114704B(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m114705C(C28013c c28013c, Function1 function1, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC25312u widget = c28013c.getWidget();
            C2101a c2101a = new C2101a(12, modifier);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(widget, null, c2101a, (Function1) objM87133R, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Modifier m114706D(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-215712318);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m114707E(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m114711I(event, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m114708F(Modifier modifier, C28013c c28013c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m114730s(modifier, c28013c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC25312u m114709G(InterfaceC25312u widget, String path) {
        AbstractC22676k.m65750j(widget, "widget");
        AbstractC22676k.m65750j(path, "path");
        if (!(widget instanceof C18497h0)) {
            return widget;
        }
        Map<String, String> mapM354b = AbstractC0142b.m360e(path).m354b();
        C18497h0 c18497h0 = (C18497h0) widget;
        String conversationFingerprint = mapM354b.get("conversationFingerprint");
        if (conversationFingerprint == null) {
            conversationFingerprint = c18497h0.getConversationFingerprint();
        }
        String str = conversationFingerprint;
        String turnId = mapM354b.get("turnId");
        if (turnId == null) {
            turnId = c18497h0.getTurnId();
        }
        return C18497h0.m53547b(c18497h0, null, null, str, turnId, null, 19, null);
    }

    /* JADX INFO: renamed from: H */
    private static final Modifier m114710H() {
        float f13 = 4;
        float f14 = 3;
        return AbstractC15679g.m44108e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), ((float) 0.5d) * f13, AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f13 * f14), 5, f14);
    }

    /* JADX INFO: renamed from: I */
    public static final void m114711I(Object event, Function1 onEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if ((event instanceof InterfaceC28011a) || (event instanceof InterfaceC4327a) || (event instanceof C27256h) || (event instanceof DesignItemInteraction)) {
            onEvent.invoke(event);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private static final void m114726o(C28013c.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2075289260);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(aVar) : c28655q2.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C12611c state = aVar.getState();
            AbstractC33208p0 type = state.getType();
            if (type instanceof AbstractC33208p0.c) {
                c28655q2.m87150e0(1297503045);
                Modifier modifierM3394p = AbstractC1099a.m3394p(6 * 8, m114710H());
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                c28655q = c28655q2;
                AbstractC35684p.m113047h(AbstractC1102d.m3419p(((float) 22.5d) * 4, C2314t.f9131w), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                boolean z4 = type instanceof AbstractC33208p0.h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4) {
                    c28655q.m87150e0(1297516527);
                    TextResource title = state.getType().getTitle();
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35916a(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC12610b.m35349f(new C12611c(0 == true ? 1 : 0, new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), state.getSupportText(), null, null, null, 57, null), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1297527500);
                    Modifier modifierM114710H = m114710H();
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM114710H);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    int i15 = i14;
                    C12611c state2 = aVar.getState();
                    boolean z13 = ((i15 & 112) == 32) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(aVar)));
                    Object objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C35015q(aVar, function1, 17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(state2, null, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(aVar, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m114727p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m114728q(C28013c.a aVar, Function1 function1) {
        InterfaceC28011a secondaryClickEvent = aVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m114729r(C28013c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m114726o(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m114730s(Modifier modifier, C28013c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1438245841);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C35926d(10);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function1;
            }
            if (viewState.getMiniArchModal() != null) {
                c28655q.m87150e0(-825209630);
                m114726o(viewState.getMiniArchModal(), function2, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getWidget() != null) {
                c28655q.m87150e0(-825204585);
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC32640m0.m102010c()), AbstractC37817c.m121344e(-970233038, c28655q, new C36100c(viewState, function2, modifier2, 0)), c28655q, 56);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(188780881);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier2, viewState, function2, i13, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:106:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x027c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0286  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x0227  */
    /* JADX WARN: Code duplicated, block: B:97:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
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
    /* JADX INFO: renamed from: t */
    public static final void m114731t(Modifier modifier, C36102e state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C28013c c28013cM114739b;
        String strM114738a;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        C28012b c28012b;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87153g2;
        Object objM87133R3;
        InterfaceC25312u widget;
        C28013c c28013cM84479b;
        InterfaceC25312u widget2;
        C18497h0 c18497h0;
        String conversationFingerprint;
        boolean z13;
        boolean zM87153g3;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g4;
        Object objM87133R5;
        Object obj;
        boolean zM87153g5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1239136362);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35926d(11);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                c28013cM114739b = state.getViewState();
                strM114738a = state.getPath();
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c28013cM114739b, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, strM114738a);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g4 = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87153g4 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, new C23863b(c28013cM114739b), strM114738a);
                            obj = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g5 = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g5 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(c28013cM114739b);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.bot.presentation.chatminiarchwidget.ChatMiniArchWidgetViewModel");
                c28012b = (C28012b) abstractC23864c;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(c28012b.getViewState(), state.getViewState(), null, c28655q, 0, 2);
                zM87157i = c28655q.m87157i(c28012b) | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(c28012b, state, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c28012b);
                zM87153g2 = c28655q.m87153g(m114733v(interfaceC28601c1M87260n)) | c28655q.m87153g(state.getPath());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    widget = m114733v(interfaceC28601c1M87260n).getWidget();
                    if (widget != null || (c28013cM84479b = C28013c.m84479b(m114733v(interfaceC28601c1M87260n), null, m114709G(widget, state.getPath()), 1, null)) == null) {
                        objM87133R3 = m114733v(interfaceC28601c1M87260n);
                    } else {
                        objM87133R3 = c28013cM84479b;
                    }
                    c28655q.m87172p0(objM87133R3);
                }
                C28013c c28013c = (C28013c) objM87133R3;
                widget2 = c28013c.getWidget();
                if (widget2 instanceof C18497h0) {
                    c18497h0 = (C18497h0) widget2;
                } else {
                    c18497h0 = null;
                }
                conversationFingerprint = c18497h0 != null ? c18497h0.getConversationFingerprint() : null;
                if (conversationFingerprint == null) {
                    conversationFingerprint = "";
                }
                z13 = conversationFingerprint.length() > 0;
                zM87153g3 = c28655q.m87153g(c28012b) | c28655q.m87153g(conversationFingerprint) | c28655q.m87155h(z13);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C1023i0(c28012b, conversationFingerprint, z13, 14);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87247a(AbstractC18486c.m53351e().mo86977a((Function1) objM87133R4), AbstractC37817c.m121344e(-524153558, c28655q, new C27632b(modifier3, c28013c, c28012b, function4, 9)), c28655q, 56);
                modifier2 = modifier3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier2, state, function3, i13, i14, 10);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35926d(11);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            c28013cM114739b = state.getViewState();
            strM114738a = state.getPath();
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g4 = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, new C23863b(c28013cM114739b), strM114738a);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, new C23863b(c28013cM114739b), strM114738a);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g5 = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g5) {
                        objM87133R6 = new C23863b(c28013cM114739b);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(c28013cM114739b);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(strM114738a) | c28655q.m87153g(c28013cM114739b) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c28013cM114739b, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, strM114738a);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c28013cM114739b, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28012b.class), null, strM114738a);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.bot.presentation.chatminiarchwidget.ChatMiniArchWidgetViewModel");
            c28012b = (C28012b) abstractC23864c;
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(c28012b.getViewState(), state.getViewState(), null, c28655q, 0, 2);
            zM87157i = c28655q.m87157i(c28012b) | c28655q.m87157i(state);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(c28012b, state, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(c28012b, state, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c28012b);
            zM87153g2 = c28655q.m87153g(m114733v(interfaceC28601c1M87260n)) | c28655q.m87153g(state.getPath());
            objM87133R3 = c28655q.m87133R();
            if (zM87153g2) {
                widget = m114733v(interfaceC28601c1M87260n).getWidget();
                if (widget != null) {
                    objM87133R3 = m114733v(interfaceC28601c1M87260n);
                } else {
                    objM87133R3 = m114733v(interfaceC28601c1M87260n);
                }
                c28655q.m87172p0(objM87133R3);
            } else {
                widget = m114733v(interfaceC28601c1M87260n).getWidget();
                if (widget != null) {
                    objM87133R3 = m114733v(interfaceC28601c1M87260n);
                } else {
                    objM87133R3 = m114733v(interfaceC28601c1M87260n);
                }
                c28655q.m87172p0(objM87133R3);
            }
            C28013c c28013c2 = (C28013c) objM87133R3;
            widget2 = c28013c2.getWidget();
            if (widget2 instanceof C18497h0) {
                c18497h0 = (C18497h0) widget2;
            } else {
                c18497h0 = null;
            }
            if (c18497h0 != null) {
            }
            if (conversationFingerprint == null) {
                conversationFingerprint = "";
            }
            if (conversationFingerprint.length() > 0) {
            }
            zM87153g3 = c28655q.m87153g(c28012b) | c28655q.m87153g(conversationFingerprint) | c28655q.m87155h(z13);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R4 = new C1023i0(c28012b, conversationFingerprint, z13, 14);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C1023i0(c28012b, conversationFingerprint, z13, 14);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87247a(AbstractC18486c.m53351e().mo86977a((Function1) objM87133R4), AbstractC37817c.m121344e(-524153558, c28655q, new C27632b(modifier3, c28013c2, c28012b, function4, 9)), c28655q, 56);
            modifier2 = modifier3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier2, state, function3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m114732u(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final C28013c m114733v(InterfaceC28670t2 interfaceC28670t2) {
        return (C28013c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m114734w(C28012b c28012b, String str, boolean z4, InterfaceC18484b event) {
        AbstractC22676k.m65750j(event, "event");
        c28012b.m84477n(event, str, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m114735x(Modifier modifier, C28013c c28013c, C28012b c28012b, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(c28012b) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C36099b(c28012b, function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            m114730s(modifier, c28013c, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m114736y(C28012b c28012b, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m114711I(event, new C36099b(c28012b, function1, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m114737z(C28012b c28012b, Function1 function1, Object routed) {
        AbstractC22676k.m65750j(routed, "routed");
        if (routed instanceof InterfaceC28011a) {
            c28012b.mo1216g((InterfaceC28011a) routed);
        } else {
            function1.invoke(routed);
        }
        return C23454a0.f92919a;
    }
}
