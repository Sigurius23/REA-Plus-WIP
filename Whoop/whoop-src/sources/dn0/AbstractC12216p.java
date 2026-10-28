package dn0;

import android.app.Application;
import android.content.Context;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1910d;
import b03.C2205b;
import bc3.InterfaceC2994c0;
import bn0.AbstractC3494b;
import bn0.AbstractC3495c;
import bn0.C3497e;
import bp0.C3524l;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.view.edit.C9790n;
import d30.C11546l;
import df2.C12000a;
import dh0.C12040a;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import g51.AbstractC15492b;
import g51.C15493c;
import gy0.AbstractC16276e;
import hy0.AbstractC17725b0;
import hy0.EnumC17753i0;
import i11.AbstractC17862e;
import i11.C17863f;
import ib1.C18334a;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22965i;
import p315m0.AbstractC24868a;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2776b;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import qy0.InterfaceC30768a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import vy0.AbstractC36568c0;
import vy0.AbstractC36597y;
import vy0.C36570d0;
import w81.AbstractC36945c;
import w81.EnumC36946d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: dn0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a7\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a©\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001aa\u0010&\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b&\u0010'¨\u0006(²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"", "monthIndex", "b0", "(I)I", "page", "a0", "Landroidx/compose/ui/Modifier;", "modifier", "Lib1/a;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "y", "(Landroidx/compose/ui/Modifier;Lib1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbn0/e;", "viewState", "", "heightRatio", "onPageChanged", "onRetryMonth", "onDateSelectorClick", "Ljava/time/LocalDate;", "onDaySelected", "Lkotlin/Function0;", "onRetry", "H", "(Landroidx/compose/ui/Modifier;Lbn0/e;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Li11/f;", "dateSelector", "", "isLoading", "Lvy0/d0;", "fabMenu", "", "Lm91/u;", "trailingItems", "W", "(Li11/f;ZLvy0/d0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "calendar-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12216p {

    /* JADX INFO: renamed from: dn0.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.view.ArchMiniCalendarKt$ArchMiniCalendar$2$1", m100430f = "ArchMiniCalendar.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40866w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C3497e, AbstractC3494b> f40867x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C18334a f40868y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C3497e, AbstractC3494b> abstractC23864c, C18334a c18334a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40867x = abstractC23864c;
            this.f40868y = c18334a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f40867x, this.f40868y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40866w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f40867x.mo1216g(new AbstractC3494b.b(this.f40868y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final C3497e m33874A(InterfaceC28670t2 interfaceC28670t2) {
        return (C3497e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m33875B(AbstractC23864c abstractC23864c, int i13) {
        abstractC23864c.mo1216g(new AbstractC3494b.d(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m33876C(AbstractC23864c abstractC23864c, int i13) {
        abstractC23864c.mo1216g(new AbstractC3494b.e(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m33877D(Function1 function1, AbstractC23864c abstractC23864c, Object payload) {
        AbstractC22676k.m65750j(payload, "payload");
        if (payload instanceof GenericInteraction) {
            function1.invoke(payload);
        } else {
            abstractC23864c.mo1216g(new AbstractC3494b.c(payload.toString()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m33878E(AbstractC23864c abstractC23864c, LocalDate it) {
        AbstractC22676k.m65750j(it, "it");
        abstractC23864c.mo1216g(new AbstractC3494b.a(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m33879F(AbstractC23864c abstractC23864c, C18334a c18334a) {
        abstractC23864c.mo1216g(new AbstractC3494b.b(c18334a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m33880G(Modifier modifier, C18334a c18334a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m33926y(modifier, c18334a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0240  */
    /* JADX WARN: Code duplicated, block: B:156:0x0281  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0360  */
    /* JADX WARN: Code duplicated, block: B:172:0x0362  */
    /* JADX WARN: Code duplicated, block: B:175:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x036c  */
    /* JADX WARN: Code duplicated, block: B:179:0x037e  */
    /* JADX WARN: Code duplicated, block: B:182:0x041c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0434  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX INFO: renamed from: H */
    public static final void m33881H(Modifier modifier, C3497e viewState, float f13, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f14;
        int i16;
        Function1 function6;
        int i17;
        int i18;
        Function1 function7;
        int i19;
        int i24;
        int i25;
        int i26;
        Function1 function8;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean z4;
        Function1 function9;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier3;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        float f15;
        Function1 function13;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87149e;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        InterfaceC4339a interfaceC4339a4;
        int i37;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        C28621h1 c28621h1;
        Function1 function18;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        Object objM87133R4;
        Function1 function19;
        float f16;
        Function1 function20;
        Function1 function21;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        Object objM87133R10;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-925009422);
        int i38 = i14 & 1;
        if (i38 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i39 = i14 & 4;
        if (i39 == 0) {
            if ((i13 & 384) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function1;
                    if (c28655q.m87157i(function6)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function7 = function2;
                        if (c28655q.m87157i(function7)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(function8)) {
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
                        i29 = i38;
                    } else {
                        i29 = i38;
                        if ((i13 & 12582912) == 0) {
                            if (c28655q.m87157i(function5)) {
                                i34 = 8388608;
                            } else {
                                i34 = 4194304;
                            }
                            i15 |= i34;
                        }
                    }
                    i35 = i14 & 256;
                    if (i35 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q.m87157i(interfaceC4339a)) {
                                i36 = 67108864;
                            } else {
                                i36 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i29 != 0) {
                                modifier4 = c2314t;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i39 != 0) {
                                f14 = 1.0f;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R10 = c28655q.m87133R();
                                if (objM87133R10 == c28676v0) {
                                    objM87133R10 = new C12040a(28);
                                    c28655q.m87172p0(objM87133R10);
                                }
                                function14 = (Function1) objM87133R10;
                            } else {
                                function14 = function6;
                            }
                            if (i18 != 0) {
                                objM87133R9 = c28655q.m87133R();
                                if (objM87133R9 == c28676v0) {
                                    objM87133R9 = new C12040a(23);
                                    c28655q.m87172p0(objM87133R9);
                                }
                                function15 = (Function1) objM87133R9;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                objM87133R8 = c28655q.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    objM87133R8 = new C12040a(24);
                                    c28655q.m87172p0(objM87133R8);
                                }
                                function16 = (Function1) objM87133R8;
                            } else {
                                function16 = function3;
                            }
                            if (i26 != 0) {
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C12040a(25);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function8 = (Function1) objM87133R7;
                            }
                            if (i28 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C12040a(26);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function17 = (Function1) objM87133R6;
                            } else {
                                function17 = function5;
                            }
                            if (i35 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C12000a(23);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            zM87149e = c28655q.m87149e(viewState.getPageIndex());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87149e || objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                            }
                            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                            if (viewState.getIsLoading()) {
                                c28655q.m87150e0(124194606);
                                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                                c28655q.m87173q(false);
                                interfaceC4339a4 = interfaceC4339a3;
                            } else {
                                if (viewState.getIsError()) {
                                    c28655q.m87150e0(124199616);
                                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a5, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                                    interfaceC4339a4 = interfaceC4339a5;
                                    c28655q.m87173q(false);
                                } else {
                                    interfaceC4339a4 = interfaceC4339a3;
                                    c28655q.m87150e0(124209138);
                                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                                    Function1 function22 = function8;
                                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                                    i37 = i15;
                                    Function1 function23 = function14;
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                                    InterfaceC0221l.f734a.getClass();
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
                                    C17863f c17863fM10313a = viewState.getDateSelector();
                                    if (viewState.getLoadingMonth() != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    m33896W(c17863fM10313a, z13, viewState.getFabMenu(), viewState.m10319g(), function22, function23, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                                    float f17 = 4;
                                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f17, 7);
                                    c28621h1 = (C28621h1) interfaceC28593a1;
                                    int iM33903b0 = m33903b0(c28621h1.m87024x());
                                    boolean zM87153g = c28655q.m87153g(c28621h1);
                                    function18 = function22;
                                    if ((i37 & 57344) == 16384) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = z14 | zM87153g;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z15 || objM87133R3 == c28676v0) {
                                        objM87133R3 = new C9790n(13, c28621h1, function15);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    Function1 function24 = (Function1) objM87133R3;
                                    objM87133R4 = c28655q.m87133R();
                                    if (objM87133R4 == c28676v0) {
                                        objM87133R4 = new C1910d(21, interfaceC28601c1);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    float f18 = f14;
                                    Function1 function25 = function16;
                                    Function1 function26 = function17;
                                    function19 = function25;
                                    f16 = f18;
                                    function20 = function23;
                                    function21 = function26;
                                    AbstractC36945c.m118620i(modifierM3398t, 120, iM33903b0, function24, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function25, f18, function23, function26, 1)), c28655q, 221238, 0);
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17 * f17, c2314t));
                                    AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(false);
                                }
                                function11 = function15;
                                interfaceC4339a2 = interfaceC4339a4;
                                f15 = f16;
                                modifier3 = modifier4;
                                function10 = function20;
                                function9 = function19;
                                function13 = function21;
                                function12 = function18;
                            }
                            function18 = function8;
                            function20 = function14;
                            f16 = f14;
                            function19 = function16;
                            function21 = function17;
                            function11 = function15;
                            interfaceC4339a2 = interfaceC4339a4;
                            f15 = f16;
                            modifier3 = modifier4;
                            function10 = function20;
                            function9 = function19;
                            function13 = function21;
                            function12 = function18;
                        } else {
                            c28655q.m87138X();
                            function9 = function3;
                            interfaceC4339a2 = interfaceC4339a;
                            modifier3 = modifier2;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            f15 = f14;
                            function13 = function5;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i39 != 0) {
                            f14 = 1.0f;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C12040a(28);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function14 = (Function1) objM87133R10;
                        } else {
                            function14 = function6;
                        }
                        if (i18 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C12040a(23);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function15 = (Function1) objM87133R9;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C12040a(24);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function16 = (Function1) objM87133R8;
                        } else {
                            function16 = function3;
                        }
                        if (i26 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C12040a(25);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        }
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C12040a(26);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function17 = (Function1) objM87133R6;
                        } else {
                            function17 = function5;
                        }
                        if (i35 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C12000a(23);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        zM87149e = c28655q.m87149e(viewState.getPageIndex());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        } else {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        if (viewState.getIsLoading()) {
                            c28655q.m87150e0(124194606);
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                            c28655q.m87173q(false);
                            interfaceC4339a4 = interfaceC4339a3;
                        } else {
                            if (viewState.getIsError()) {
                                c28655q.m87150e0(124199616);
                                InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a6, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                                interfaceC4339a4 = interfaceC4339a6;
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a4 = interfaceC4339a3;
                                c28655q.m87150e0(124209138);
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                                Function1 function27 = function8;
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                                i37 = i15;
                                Function1 function28 = function14;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                                InterfaceC0221l.f734a.getClass();
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
                                C17863f c17863fM10313a2 = viewState.getDateSelector();
                                if (viewState.getLoadingMonth() != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                m33896W(c17863fM10313a2, z13, viewState.getFabMenu(), viewState.m10319g(), function27, function28, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                                float f19 = 4;
                                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f19, 7);
                                c28621h1 = (C28621h1) interfaceC28593a1;
                                int iM33903b1 = m33903b0(c28621h1.m87024x());
                                boolean zM87153g2 = c28655q.m87153g(c28621h1);
                                function18 = function27;
                                if ((i37 & 57344) == 16384) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | zM87153g2;
                                objM87133R3 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function29 = (Function1) objM87133R3;
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C1910d(21, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                float f110 = f14;
                                Function1 function210 = function16;
                                Function1 function211 = function17;
                                function19 = function210;
                                f16 = f110;
                                function20 = function28;
                                function21 = function211;
                                AbstractC36945c.m118620i(modifierM3398t2, 120, iM33903b1, function29, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function210, f110, function28, function211, 1)), c28655q, 221238, 0);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f19, c2314t));
                                AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            function11 = function15;
                            interfaceC4339a2 = interfaceC4339a4;
                            f15 = f16;
                            modifier3 = modifier4;
                            function10 = function20;
                            function9 = function19;
                            function13 = function21;
                            function12 = function18;
                        }
                        function18 = function8;
                        function20 = function14;
                        f16 = f14;
                        function19 = function16;
                        function21 = function17;
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    } else {
                        c28655q.m87138X();
                        function9 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        modifier3 = modifier2;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        f15 = f14;
                        function13 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 24576;
                function7 = function2;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function8)) {
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
                    i29 = i38;
                } else {
                    i29 = i38;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function5)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i15 |= i34;
                    }
                }
                i35 = i14 & 256;
                if (i35 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i39 != 0) {
                            f14 = 1.0f;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C12040a(28);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function14 = (Function1) objM87133R10;
                        } else {
                            function14 = function6;
                        }
                        if (i18 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C12040a(23);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function15 = (Function1) objM87133R9;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C12040a(24);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function16 = (Function1) objM87133R8;
                        } else {
                            function16 = function3;
                        }
                        if (i26 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C12040a(25);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        }
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C12040a(26);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function17 = (Function1) objM87133R6;
                        } else {
                            function17 = function5;
                        }
                        if (i35 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C12000a(23);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        zM87149e = c28655q.m87149e(viewState.getPageIndex());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        } else {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        if (viewState.getIsLoading()) {
                            c28655q.m87150e0(124194606);
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                            c28655q.m87173q(false);
                            interfaceC4339a4 = interfaceC4339a3;
                        } else {
                            if (viewState.getIsError()) {
                                c28655q.m87150e0(124199616);
                                InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a7, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                                interfaceC4339a4 = interfaceC4339a7;
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a4 = interfaceC4339a3;
                                c28655q.m87150e0(124209138);
                                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
                                Function1 function212 = function8;
                                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                                i37 = i15;
                                Function1 function213 = function14;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                                InterfaceC0221l.f734a.getClass();
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
                                C17863f c17863fM10313a3 = viewState.getDateSelector();
                                if (viewState.getLoadingMonth() != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                m33896W(c17863fM10313a3, z13, viewState.getFabMenu(), viewState.m10319g(), function212, function213, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                                float f111 = 4;
                                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f111, 7);
                                c28621h1 = (C28621h1) interfaceC28593a1;
                                int iM33903b2 = m33903b0(c28621h1.m87024x());
                                boolean zM87153g3 = c28655q.m87153g(c28621h1);
                                function18 = function212;
                                if ((i37 & 57344) == 16384) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | zM87153g3;
                                objM87133R3 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function214 = (Function1) objM87133R3;
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C1910d(21, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                float f112 = f14;
                                Function1 function215 = function16;
                                Function1 function216 = function17;
                                function19 = function215;
                                f16 = f112;
                                function20 = function213;
                                function21 = function216;
                                AbstractC36945c.m118620i(modifierM3398t3, 120, iM33903b2, function214, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function215, f112, function213, function216, 1)), c28655q, 221238, 0);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111 * f111, c2314t));
                                AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            function11 = function15;
                            interfaceC4339a2 = interfaceC4339a4;
                            f15 = f16;
                            modifier3 = modifier4;
                            function10 = function20;
                            function9 = function19;
                            function13 = function21;
                            function12 = function18;
                        }
                        function18 = function8;
                        function20 = function14;
                        f16 = f14;
                        function19 = function16;
                        function21 = function17;
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    } else {
                        c28655q.m87138X();
                        function9 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        modifier3 = modifier2;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        f15 = f14;
                        function13 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a8, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a8;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function217 = function8;
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function218 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a4 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a4, z13, viewState.getFabMenu(), viewState.m10319g(), function217, function218, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f113 = 4;
                            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f113, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b3 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g4 = c28655q.m87153g(c28621h1);
                            function18 = function217;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g4;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function219 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f114 = f14;
                            Function1 function2110 = function16;
                            Function1 function2111 = function17;
                            function19 = function2110;
                            f16 = f114;
                            function20 = function218;
                            function21 = function2111;
                            AbstractC36945c.m118620i(modifierM3398t4, 120, iM33903b3, function219, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function2110, f114, function218, function2111, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f113 * f113, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 3072;
            function6 = function1;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function8)) {
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
                    i29 = i38;
                } else {
                    i29 = i38;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function5)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i15 |= i34;
                    }
                }
                i35 = i14 & 256;
                if (i35 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i39 != 0) {
                            f14 = 1.0f;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C12040a(28);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function14 = (Function1) objM87133R10;
                        } else {
                            function14 = function6;
                        }
                        if (i18 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C12040a(23);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function15 = (Function1) objM87133R9;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C12040a(24);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function16 = (Function1) objM87133R8;
                        } else {
                            function16 = function3;
                        }
                        if (i26 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C12040a(25);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        }
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C12040a(26);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function17 = (Function1) objM87133R6;
                        } else {
                            function17 = function5;
                        }
                        if (i35 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C12000a(23);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        zM87149e = c28655q.m87149e(viewState.getPageIndex());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        } else {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        if (viewState.getIsLoading()) {
                            c28655q.m87150e0(124194606);
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                            c28655q.m87173q(false);
                            interfaceC4339a4 = interfaceC4339a3;
                        } else {
                            if (viewState.getIsError()) {
                                c28655q.m87150e0(124199616);
                                InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a9, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                                interfaceC4339a4 = interfaceC4339a9;
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a4 = interfaceC4339a3;
                                c28655q.m87150e0(124209138);
                                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier4);
                                Function1 function2112 = function8;
                                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                                i37 = i15;
                                Function1 function2113 = function14;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                                InterfaceC0221l.f734a.getClass();
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
                                C17863f c17863fM10313a5 = viewState.getDateSelector();
                                if (viewState.getLoadingMonth() != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                m33896W(c17863fM10313a5, z13, viewState.getFabMenu(), viewState.m10319g(), function2112, function2113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                                float f115 = 4;
                                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f115, 7);
                                c28621h1 = (C28621h1) interfaceC28593a1;
                                int iM33903b4 = m33903b0(c28621h1.m87024x());
                                boolean zM87153g5 = c28655q.m87153g(c28621h1);
                                function18 = function2112;
                                if ((i37 & 57344) == 16384) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | zM87153g5;
                                objM87133R3 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function2114 = (Function1) objM87133R3;
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C1910d(21, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                float f116 = f14;
                                Function1 function2115 = function16;
                                Function1 function2116 = function17;
                                function19 = function2115;
                                f16 = f116;
                                function20 = function2113;
                                function21 = function2116;
                                AbstractC36945c.m118620i(modifierM3398t5, 120, iM33903b4, function2114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function2115, f116, function2113, function2116, 1)), c28655q, 221238, 0);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f115 * f115, c2314t));
                                AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            function11 = function15;
                            interfaceC4339a2 = interfaceC4339a4;
                            f15 = f16;
                            modifier3 = modifier4;
                            function10 = function20;
                            function9 = function19;
                            function13 = function21;
                            function12 = function18;
                        }
                        function18 = function8;
                        function20 = function14;
                        f16 = f14;
                        function19 = function16;
                        function21 = function17;
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    } else {
                        c28655q.m87138X();
                        function9 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        modifier3 = modifier2;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        f15 = f14;
                        function13 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a10, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a10;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function2117 = function8;
                            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function2118 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a6 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a6, z13, viewState.getFabMenu(), viewState.m10319g(), function2117, function2118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f117 = 4;
                            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f117, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b5 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g6 = c28655q.m87153g(c28621h1);
                            function18 = function2117;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g6;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function2119 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f118 = f14;
                            Function1 function21110 = function16;
                            Function1 function21111 = function17;
                            function19 = function21110;
                            f16 = f118;
                            function20 = function2118;
                            function21 = function21111;
                            AbstractC36945c.m118620i(modifierM3398t6, 120, iM33903b5, function2119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function21110, f118, function2118, function21111, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117 * f117, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 24576;
            function7 = function2;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function8)) {
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
                i29 = i38;
            } else {
                i29 = i38;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i15 |= i34;
                }
            }
            i35 = i14 & 256;
            if (i35 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i36;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a11, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a11;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function21112 = function8;
                            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function21113 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a7 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a7, z13, viewState.getFabMenu(), viewState.m10319g(), function21112, function21113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f119 = 4;
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f119, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b6 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g7 = c28655q.m87153g(c28621h1);
                            function18 = function21112;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g7;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function21114 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f1110 = f14;
                            Function1 function21115 = function16;
                            Function1 function21116 = function17;
                            function19 = function21115;
                            f16 = f1110;
                            function20 = function21113;
                            function21 = function21116;
                            AbstractC36945c.m118620i(modifierM3398t7, 120, iM33903b6, function21114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function21115, f1110, function21113, function21116, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f119 * f119, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i39 != 0) {
                    f14 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12040a(28);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function14 = (Function1) objM87133R10;
                } else {
                    function14 = function6;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12040a(23);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function15 = (Function1) objM87133R9;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(24);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function16 = (Function1) objM87133R8;
                } else {
                    function16 = function3;
                }
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(25);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                }
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12040a(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function17 = (Function1) objM87133R6;
                } else {
                    function17 = function5;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C12000a(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e = c28655q.m87149e(viewState.getPageIndex());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(124194606);
                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                    interfaceC4339a4 = interfaceC4339a3;
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(124199616);
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a3;
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a12, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                        interfaceC4339a4 = interfaceC4339a12;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a3;
                        c28655q.m87150e0(124209138);
                        Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, modifier4);
                        Function1 function21117 = function8;
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        i37 = i15;
                        Function1 function21118 = function14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                        InterfaceC0221l.f734a.getClass();
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
                        C17863f c17863fM10313a8 = viewState.getDateSelector();
                        if (viewState.getLoadingMonth() != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m33896W(c17863fM10313a8, z13, viewState.getFabMenu(), viewState.m10319g(), function21117, function21118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                        float f1111 = 4;
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f1111, 7);
                        c28621h1 = (C28621h1) interfaceC28593a1;
                        int iM33903b7 = m33903b0(c28621h1.m87024x());
                        boolean zM87153g8 = c28655q.m87153g(c28621h1);
                        function18 = function21117;
                        if ((i37 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM87153g8;
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function21119 = (Function1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C1910d(21, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        float f1112 = f14;
                        Function1 function211110 = function16;
                        Function1 function211111 = function17;
                        function19 = function211110;
                        f16 = f1112;
                        function20 = function21118;
                        function21 = function211111;
                        AbstractC36945c.m118620i(modifierM3398t8, 120, iM33903b7, function21119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function211110, f1112, function21118, function211111, 1)), c28655q, 221238, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1111 * f1111, c2314t));
                        AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                }
                function18 = function8;
                function20 = function14;
                f16 = f14;
                function19 = function16;
                function21 = function17;
                function11 = function15;
                interfaceC4339a2 = interfaceC4339a4;
                f15 = f16;
                modifier3 = modifier4;
                function10 = function20;
                function9 = function19;
                function13 = function21;
                function12 = function18;
            } else {
                c28655q.m87138X();
                function9 = function3;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                f15 = f14;
                function13 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 384;
        f14 = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function1;
                if (c28655q.m87157i(function6)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function2;
                    if (c28655q.m87157i(function7)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function8)) {
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
                    i29 = i38;
                } else {
                    i29 = i38;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function5)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i15 |= i34;
                    }
                }
                i35 = i14 & 256;
                if (i35 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i39 != 0) {
                            f14 = 1.0f;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C12040a(28);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function14 = (Function1) objM87133R10;
                        } else {
                            function14 = function6;
                        }
                        if (i18 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C12040a(23);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function15 = (Function1) objM87133R9;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C12040a(24);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function16 = (Function1) objM87133R8;
                        } else {
                            function16 = function3;
                        }
                        if (i26 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C12040a(25);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        }
                        if (i28 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C12040a(26);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function17 = (Function1) objM87133R6;
                        } else {
                            function17 = function5;
                        }
                        if (i35 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C12000a(23);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        zM87149e = c28655q.m87149e(viewState.getPageIndex());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        } else {
                            objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                        }
                        interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                        if (viewState.getIsLoading()) {
                            c28655q.m87150e0(124194606);
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                            c28655q.m87173q(false);
                            interfaceC4339a4 = interfaceC4339a3;
                        } else {
                            if (viewState.getIsError()) {
                                c28655q.m87150e0(124199616);
                                InterfaceC4339a interfaceC4339a13 = interfaceC4339a3;
                                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a13, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                                interfaceC4339a4 = interfaceC4339a13;
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a4 = interfaceC4339a3;
                                c28655q.m87150e0(124209138);
                                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, modifier4);
                                Function1 function211112 = function8;
                                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                                i37 = i15;
                                Function1 function211113 = function14;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                                InterfaceC0221l.f734a.getClass();
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
                                C17863f c17863fM10313a9 = viewState.getDateSelector();
                                if (viewState.getLoadingMonth() != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                m33896W(c17863fM10313a9, z13, viewState.getFabMenu(), viewState.m10319g(), function211112, function211113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                                float f1113 = 4;
                                Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f1113, 7);
                                c28621h1 = (C28621h1) interfaceC28593a1;
                                int iM33903b8 = m33903b0(c28621h1.m87024x());
                                boolean zM87153g9 = c28655q.m87153g(c28621h1);
                                function18 = function211112;
                                if ((i37 & 57344) == 16384) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | zM87153g9;
                                objM87133R3 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C9790n(13, c28621h1, function15);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                Function1 function211114 = (Function1) objM87133R3;
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C1910d(21, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                float f1114 = f14;
                                Function1 function211115 = function16;
                                Function1 function211116 = function17;
                                function19 = function211115;
                                f16 = f1114;
                                function20 = function211113;
                                function21 = function211116;
                                AbstractC36945c.m118620i(modifierM3398t9, 120, iM33903b8, function211114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function211115, f1114, function211113, function211116, 1)), c28655q, 221238, 0);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1113 * f1113, c2314t));
                                AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            function11 = function15;
                            interfaceC4339a2 = interfaceC4339a4;
                            f15 = f16;
                            modifier3 = modifier4;
                            function10 = function20;
                            function9 = function19;
                            function13 = function21;
                            function12 = function18;
                        }
                        function18 = function8;
                        function20 = function14;
                        f16 = f14;
                        function19 = function16;
                        function21 = function17;
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    } else {
                        c28655q.m87138X();
                        function9 = function3;
                        interfaceC4339a2 = interfaceC4339a;
                        modifier3 = modifier2;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        f15 = f14;
                        function13 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a14 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a14, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a14;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function211117 = function8;
                            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function211118 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a10 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a10, z13, viewState.getFabMenu(), viewState.m10319g(), function211117, function211118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f1115 = 4;
                            Modifier modifierM3398t10 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f1115, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b9 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g10 = c28655q.m87153g(c28621h1);
                            function18 = function211117;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g10;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function211119 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f1116 = f14;
                            Function1 function2111110 = function16;
                            Function1 function2111111 = function17;
                            function19 = function2111110;
                            f16 = f1116;
                            function20 = function211118;
                            function21 = function2111111;
                            AbstractC36945c.m118620i(modifierM3398t10, 120, iM33903b9, function211119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function2111110, f1116, function211118, function2111111, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1115 * f1115, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 24576;
            function7 = function2;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function8)) {
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
                i29 = i38;
            } else {
                i29 = i38;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i15 |= i34;
                }
            }
            i35 = i14 & 256;
            if (i35 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i36;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a15 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a15, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a15;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function2111112 = function8;
                            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function2111113 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a11 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a11, z13, viewState.getFabMenu(), viewState.m10319g(), function2111112, function2111113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f1117 = 4;
                            Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f1117, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b10 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g11 = c28655q.m87153g(c28621h1);
                            function18 = function2111112;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g11;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function2111114 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f1118 = f14;
                            Function1 function2111115 = function16;
                            Function1 function2111116 = function17;
                            function19 = function2111115;
                            f16 = f1118;
                            function20 = function2111113;
                            function21 = function2111116;
                            AbstractC36945c.m118620i(modifierM3398t11, 120, iM33903b10, function2111114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function2111115, f1118, function2111113, function2111116, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1117 * f1117, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i39 != 0) {
                    f14 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12040a(28);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function14 = (Function1) objM87133R10;
                } else {
                    function14 = function6;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12040a(23);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function15 = (Function1) objM87133R9;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(24);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function16 = (Function1) objM87133R8;
                } else {
                    function16 = function3;
                }
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(25);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                }
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12040a(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function17 = (Function1) objM87133R6;
                } else {
                    function17 = function5;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C12000a(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e = c28655q.m87149e(viewState.getPageIndex());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(124194606);
                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                    interfaceC4339a4 = interfaceC4339a3;
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(124199616);
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a3;
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a16, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                        interfaceC4339a4 = interfaceC4339a16;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a3;
                        c28655q.m87150e0(124209138);
                        Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, modifier4);
                        Function1 function2111117 = function8;
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        i37 = i15;
                        Function1 function2111118 = function14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                        InterfaceC0221l.f734a.getClass();
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
                        C17863f c17863fM10313a12 = viewState.getDateSelector();
                        if (viewState.getLoadingMonth() != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m33896W(c17863fM10313a12, z13, viewState.getFabMenu(), viewState.m10319g(), function2111117, function2111118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                        float f1119 = 4;
                        Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f1119, 7);
                        c28621h1 = (C28621h1) interfaceC28593a1;
                        int iM33903b11 = m33903b0(c28621h1.m87024x());
                        boolean zM87153g12 = c28655q.m87153g(c28621h1);
                        function18 = function2111117;
                        if ((i37 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM87153g12;
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function2111119 = (Function1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C1910d(21, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        float f11110 = f14;
                        Function1 function21111110 = function16;
                        Function1 function21111111 = function17;
                        function19 = function21111110;
                        f16 = f11110;
                        function20 = function2111118;
                        function21 = function21111111;
                        AbstractC36945c.m118620i(modifierM3398t12, 120, iM33903b11, function2111119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function21111110, f11110, function2111118, function21111111, 1)), c28655q, 221238, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1119 * f1119, c2314t));
                        AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                }
                function18 = function8;
                function20 = function14;
                f16 = f14;
                function19 = function16;
                function21 = function17;
                function11 = function15;
                interfaceC4339a2 = interfaceC4339a4;
                f15 = f16;
                modifier3 = modifier4;
                function10 = function20;
                function9 = function19;
                function13 = function21;
                function12 = function18;
            } else {
                c28655q.m87138X();
                function9 = function3;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                f15 = f14;
                function13 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 3072;
        function6 = function1;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function7 = function2;
                if (c28655q.m87157i(function7)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function8)) {
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
                i29 = i38;
            } else {
                i29 = i38;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function5)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i15 |= i34;
                }
            }
            i35 = i14 & 256;
            if (i35 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i36;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i39 != 0) {
                        f14 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12040a(28);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function14 = (Function1) objM87133R10;
                    } else {
                        function14 = function6;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12040a(23);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function15 = (Function1) objM87133R9;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(24);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function16 = (Function1) objM87133R8;
                    } else {
                        function16 = function3;
                    }
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(25);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    }
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12040a(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function17 = (Function1) objM87133R6;
                    } else {
                        function17 = function5;
                    }
                    if (i35 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C12000a(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e = c28655q.m87149e(viewState.getPageIndex());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    } else {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(124194606);
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                        interfaceC4339a4 = interfaceC4339a3;
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(124199616);
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a3;
                            AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a17, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                            interfaceC4339a4 = interfaceC4339a17;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a3;
                            c28655q.m87150e0(124209138);
                            Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, modifier4);
                            Function1 function21111112 = function8;
                            C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                            i37 = i15;
                            Function1 function21111113 = function14;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3409f13);
                            InterfaceC0221l.f734a.getClass();
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
                            C17863f c17863fM10313a13 = viewState.getDateSelector();
                            if (viewState.getLoadingMonth() != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            m33896W(c17863fM10313a13, z13, viewState.getFabMenu(), viewState.m10319g(), function21111112, function21111113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                            float f11111 = 4;
                            Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f11111, 7);
                            c28621h1 = (C28621h1) interfaceC28593a1;
                            int iM33903b12 = m33903b0(c28621h1.m87024x());
                            boolean zM87153g13 = c28655q.m87153g(c28621h1);
                            function18 = function21111112;
                            if ((i37 & 57344) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | zM87153g13;
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C9790n(13, c28621h1, function15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function1 function21111114 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C1910d(21, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            float f11112 = f14;
                            Function1 function21111115 = function16;
                            Function1 function21111116 = function17;
                            function19 = function21111115;
                            f16 = f11112;
                            function20 = function21111113;
                            function21 = function21111116;
                            AbstractC36945c.m118620i(modifierM3398t13, 120, iM33903b12, function21111114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function21111115, f11112, function21111113, function21111116, 1)), c28655q, 221238, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f11111 * f11111, c2314t));
                            AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        function11 = function15;
                        interfaceC4339a2 = interfaceC4339a4;
                        f15 = f16;
                        modifier3 = modifier4;
                        function10 = function20;
                        function9 = function19;
                        function13 = function21;
                        function12 = function18;
                    }
                    function18 = function8;
                    function20 = function14;
                    f16 = f14;
                    function19 = function16;
                    function21 = function17;
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                } else {
                    c28655q.m87138X();
                    function9 = function3;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    f15 = f14;
                    function13 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i39 != 0) {
                    f14 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12040a(28);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function14 = (Function1) objM87133R10;
                } else {
                    function14 = function6;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12040a(23);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function15 = (Function1) objM87133R9;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(24);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function16 = (Function1) objM87133R8;
                } else {
                    function16 = function3;
                }
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(25);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                }
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12040a(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function17 = (Function1) objM87133R6;
                } else {
                    function17 = function5;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C12000a(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e = c28655q.m87149e(viewState.getPageIndex());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(124194606);
                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                    interfaceC4339a4 = interfaceC4339a3;
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(124199616);
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a3;
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a18, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                        interfaceC4339a4 = interfaceC4339a18;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a3;
                        c28655q.m87150e0(124209138);
                        Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, modifier4);
                        Function1 function21111117 = function8;
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        i37 = i15;
                        Function1 function21111118 = function14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                        InterfaceC0221l.f734a.getClass();
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
                        C17863f c17863fM10313a14 = viewState.getDateSelector();
                        if (viewState.getLoadingMonth() != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m33896W(c17863fM10313a14, z13, viewState.getFabMenu(), viewState.m10319g(), function21111117, function21111118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                        float f11113 = 4;
                        Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f11113, 7);
                        c28621h1 = (C28621h1) interfaceC28593a1;
                        int iM33903b13 = m33903b0(c28621h1.m87024x());
                        boolean zM87153g14 = c28655q.m87153g(c28621h1);
                        function18 = function21111117;
                        if ((i37 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM87153g14;
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function21111119 = (Function1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C1910d(21, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        float f11114 = f14;
                        Function1 function211111110 = function16;
                        Function1 function211111111 = function17;
                        function19 = function211111110;
                        f16 = f11114;
                        function20 = function21111118;
                        function21 = function211111111;
                        AbstractC36945c.m118620i(modifierM3398t14, 120, iM33903b13, function21111119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function211111110, f11114, function21111118, function211111111, 1)), c28655q, 221238, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f11113 * f11113, c2314t));
                        AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                }
                function18 = function8;
                function20 = function14;
                f16 = f14;
                function19 = function16;
                function21 = function17;
                function11 = function15;
                interfaceC4339a2 = interfaceC4339a4;
                f15 = f16;
                modifier3 = modifier4;
                function10 = function20;
                function9 = function19;
                function13 = function21;
                function12 = function18;
            } else {
                c28655q.m87138X();
                function9 = function3;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                f15 = f14;
                function13 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 24576;
        function7 = function2;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(function3)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function8)) {
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
            i29 = i38;
        } else {
            i29 = i38;
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function5)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i15 |= i34;
            }
        }
        i35 = i14 & 256;
        if (i35 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i36 = 67108864;
                } else {
                    i36 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i36;
            }
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i39 != 0) {
                    f14 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12040a(28);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function14 = (Function1) objM87133R10;
                } else {
                    function14 = function6;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12040a(23);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function15 = (Function1) objM87133R9;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(24);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function16 = (Function1) objM87133R8;
                } else {
                    function16 = function3;
                }
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(25);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                }
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12040a(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function17 = (Function1) objM87133R6;
                } else {
                    function17 = function5;
                }
                if (i35 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C12000a(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e = c28655q.m87149e(viewState.getPageIndex());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(124194606);
                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                    interfaceC4339a4 = interfaceC4339a3;
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(124199616);
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a3;
                        AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a19, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                        interfaceC4339a4 = interfaceC4339a19;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a3;
                        c28655q.m87150e0(124209138);
                        Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, modifier4);
                        Function1 function211111112 = function8;
                        C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        i37 = i15;
                        Function1 function211111113 = function14;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f15);
                        InterfaceC0221l.f734a.getClass();
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
                        C17863f c17863fM10313a15 = viewState.getDateSelector();
                        if (viewState.getLoadingMonth() != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m33896W(c17863fM10313a15, z13, viewState.getFabMenu(), viewState.m10319g(), function211111112, function211111113, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                        float f11115 = 4;
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f11115, 7);
                        c28621h1 = (C28621h1) interfaceC28593a1;
                        int iM33903b14 = m33903b0(c28621h1.m87024x());
                        boolean zM87153g15 = c28655q.m87153g(c28621h1);
                        function18 = function211111112;
                        if ((i37 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM87153g15;
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C9790n(13, c28621h1, function15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function211111114 = (Function1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C1910d(21, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        float f11116 = f14;
                        Function1 function211111115 = function16;
                        Function1 function211111116 = function17;
                        function19 = function211111115;
                        f16 = f11116;
                        function20 = function211111113;
                        function21 = function211111116;
                        AbstractC36945c.m118620i(modifierM3398t15, 120, iM33903b14, function211111114, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function211111115, f11116, function211111113, function211111116, 1)), c28655q, 221238, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f11115 * f11115, c2314t));
                        AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    function11 = function15;
                    interfaceC4339a2 = interfaceC4339a4;
                    f15 = f16;
                    modifier3 = modifier4;
                    function10 = function20;
                    function9 = function19;
                    function13 = function21;
                    function12 = function18;
                }
                function18 = function8;
                function20 = function14;
                f16 = f14;
                function19 = function16;
                function21 = function17;
                function11 = function15;
                interfaceC4339a2 = interfaceC4339a4;
                f15 = f16;
                modifier3 = modifier4;
                function10 = function20;
                function9 = function19;
                function13 = function21;
                function12 = function18;
            } else {
                c28655q.m87138X();
                function9 = function3;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                f15 = f14;
                function13 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 100663296;
        if ((i15 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i39 != 0) {
                f14 = 1.0f;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C12040a(28);
                    c28655q.m87172p0(objM87133R10);
                }
                function14 = (Function1) objM87133R10;
            } else {
                function14 = function6;
            }
            if (i18 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C12040a(23);
                    c28655q.m87172p0(objM87133R9);
                }
                function15 = (Function1) objM87133R9;
            } else {
                function15 = function7;
            }
            if (i24 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C12040a(24);
                    c28655q.m87172p0(objM87133R8);
                }
                function16 = (Function1) objM87133R8;
            } else {
                function16 = function3;
            }
            if (i26 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C12040a(25);
                    c28655q.m87172p0(objM87133R7);
                }
                function8 = (Function1) objM87133R7;
            }
            if (i28 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12040a(26);
                    c28655q.m87172p0(objM87133R6);
                }
                function17 = (Function1) objM87133R6;
            } else {
                function17 = function5;
            }
            if (i35 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C12000a(23);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87149e = c28655q.m87149e(viewState.getPageIndex());
            objM87133R2 = c28655q.m87133R();
            if (zM87149e) {
                objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
            } else {
                objM87133R2 = AbstractC31061c.m95646v(viewState.getPageIndex(), c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(124194606);
                AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35366a(), modifier4, null, null, null, null, null, 62, null), null, null, c28655q, C12611c.f43049g, 6);
                c28655q.m87173q(false);
                interfaceC4339a4 = interfaceC4339a3;
            } else {
                if (viewState.getIsError()) {
                    c28655q.m87150e0(124199616);
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a3;
                    AbstractC12610b.m35349f(C12611c.m35358d(C12612d.f43056a.m35368c(), modifier4, null, null, null, null, null, 62, null), null, interfaceC4339a110, c28655q, C12611c.f43049g | ((i15 >> 18) & 896), 2);
                    interfaceC4339a4 = interfaceC4339a110;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a3;
                    c28655q.m87150e0(124209138);
                    Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, modifier4);
                    Function1 function211111117 = function8;
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    i37 = i15;
                    Function1 function211111118 = function14;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f16);
                    InterfaceC0221l.f734a.getClass();
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
                    C17863f c17863fM10313a16 = viewState.getDateSelector();
                    if (viewState.getLoadingMonth() != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m33896W(c17863fM10313a16, z13, viewState.getFabMenu(), viewState.m10319g(), function211111117, function211111118, c28655q, C17863f.f69516k | (C36570d0.f156622b << 6) | ((i37 >> 6) & 57344) | ((i37 << 6) & 458752));
                    float f11117 = 4;
                    Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f11117, 7);
                    c28621h1 = (C28621h1) interfaceC28593a1;
                    int iM33903b15 = m33903b0(c28621h1.m87024x());
                    boolean zM87153g16 = c28655q.m87153g(c28621h1);
                    function18 = function211111117;
                    if ((i37 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM87153g16;
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C9790n(13, c28621h1, function15);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C9790n(13, c28621h1, function15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function211111119 = (Function1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C1910d(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    float f11118 = f14;
                    Function1 function2111111110 = function16;
                    Function1 function2111111111 = function17;
                    function19 = function2111111110;
                    f16 = f11118;
                    function20 = function211111118;
                    function21 = function2111111111;
                    AbstractC36945c.m118620i(modifierM3398t16, 120, iM33903b15, function211111119, (Function1) objM87133R4, AbstractC37817c.m121344e(-2048494242, c28655q, new C3524l(viewState, function2111111110, f11118, function211111118, function2111111111, 1)), c28655q, 221238, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f11117 * f11117, c2314t));
                    AbstractC1090b.m3350e(C23016z.f90757a, ((Boolean) interfaceC28601c1.getValue()).booleanValue(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(540157187, c28655q, new C22931l(16, viewState, c28621h1)), c28655q, 1600518, 18);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                function11 = function15;
                interfaceC4339a2 = interfaceC4339a4;
                f15 = f16;
                modifier3 = modifier4;
                function10 = function20;
                function9 = function19;
                function13 = function21;
                function12 = function18;
            }
            function18 = function8;
            function20 = function14;
            f16 = f14;
            function19 = function16;
            function21 = function17;
            function11 = function15;
            interfaceC4339a2 = interfaceC4339a4;
            f15 = f16;
            modifier3 = modifier4;
            function10 = function20;
            function9 = function19;
            function13 = function21;
            function12 = function18;
        } else {
            c28655q.m87138X();
            function9 = function3;
            interfaceC4339a2 = interfaceC4339a;
            modifier3 = modifier2;
            function10 = function6;
            function11 = function7;
            function12 = function8;
            f15 = f14;
            function13 = function5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12215o(modifier3, viewState, f15, function10, function11, function9, function12, function13, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m33882I(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m33883J(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m33884K(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m33885L(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m33886M(LocalDate it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m33887N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m33888O(InterfaceC28593a1 interfaceC28593a1, Function1 function1, int i13) {
        C28621h1 c28621h1 = (C28621h1) interfaceC28593a1;
        c28621h1.m87025y(m33901a0(i13));
        function1.invoke(Integer.valueOf(c28621h1.m87024x()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m33889P(InterfaceC28601c1 interfaceC28601c1, EnumC36946d it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(Boolean.valueOf(!it.isPaging()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m33890Q(C3497e c3497e, Function1 function1, float f13, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        int i15;
        int i16;
        boolean z4;
        if ((i14 & 6) == 0) {
            i15 = i13;
            i16 = i14 | (((C28655q) composer).m87149e(i15) ? 4 : 2);
        } else {
            i15 = i13;
            i16 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i16 & 1, (i16 & 19) != 18);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        int iM33901a0 = m33901a0(i15);
        Integer numM10316d = c3497e.getLoadingMonth();
        boolean z13 = numM10316d != null && numM10316d.intValue() == iM33901a0;
        Integer numM10315c = c3497e.getFailedMonth();
        if (numM10315c != null && numM10315c.intValue() == iM33901a0) {
            c28655q.m87150e0(498529584);
            C12611c c12611cM35368c = C12612d.f43056a.m35368c();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(iM33901a0);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C12212l(function1, iM33901a0, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R, c28655q, C12611c.f43049g, 2);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(498887076);
        c28655q.m87173q(false);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
        Modifier modifierM107879c = z13 ? AbstractC34132o.m107879c(0.3f, c2314t) : c2314t;
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
        boolean z14 = z13;
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM107879c);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
        C15493c c15493c = c3497e.m10317e().get(Integer.valueOf(iM33901a0));
        if (c15493c == null) {
            c28655q.m87150e0(-474238164);
            c28655q.m87173q(false);
            z4 = z14;
        } else {
            c28655q.m87150e0(-474238163);
            z4 = z14;
            AbstractC15492b.m43693d(c15493c, f13, 4, function2, AbstractC37817c.m121344e(-920040952, c28655q, new C12213m(z4, function3, 0)), c28655q, C15493c.f58150e | 24960, 0);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        if (z4) {
            c28655q.m87150e0(-1959438844);
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(8 * 4, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1959198594);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m33891R(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m33892S(boolean z4, Function1 function1, InterfaceC30768a date, Function1 onClick, Composer composer, int i13) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(onClick, "onClick");
        C12209i c12209i = date instanceof C12209i ? (C12209i) date : null;
        C28655q c28655q = (C28655q) composer;
        if (c12209i == null) {
            c28655q.m87150e0(1541386294);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1541386295);
            boolean zM87155h = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(onClick)) || (i13 & 48) == 32) | c28655q.m87155h(z4) | c28655q.m87157i(c12209i) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = new C12211k(z4, c12209i, function1, onClick, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12208h.m33838n(c12209i, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m33893T(boolean z4, C12209i c12209i, Function1 function1, Function1 function2) {
        if (!z4) {
            LocalDate localDateM33856c = c12209i.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            if (localDateM33856c != null) {
                function1.invoke(localDateM33856c);
            }
            function2.invoke(c12209i.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m33894U(C3497e c3497e, InterfaceC28593a1 interfaceC28593a1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C15493c c15493c = c3497e.m10317e().get(Integer.valueOf(((C28621h1) interfaceC28593a1).m87024x()));
        C28655q c28655q = (C28655q) composer;
        if (c15493c == null) {
            c28655q.m87150e0(-1419635249);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1419635248);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC17725b0.m50777n(EnumC17753i0.BACKEND_DRIVEN, c15493c.m43700c(), c28655q, 6, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m33895V(Modifier modifier, C3497e c3497e, float f13, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m33881H(modifier, c3497e, f13, function1, function2, function3, function4, function5, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private static final void m33896W(final C17863f c17863f, final boolean z4, final C36570d0 c36570d0, final List<? extends InterfaceC25312u> list, final Function1 function1, Function1 function2, Composer composer, final int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        C0209i c0209i3;
        boolean z13;
        boolean z14;
        final Function1 function3 = function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(168017420);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c17863f) : c28655q.m87157i(c17863f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c36570d0) : c28655q.m87157i(c36570d0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(list) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 74899) != 74898)) {
            if (c17863f == null && c36570d0 == null && list.isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i16 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: dn0.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12216p.m33897X(c17863f, z4, c36570d0, list, function1, function3, i13, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC12216p.m33899Z(c17863f, z4, c36570d0, list, function1, function3, i13, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                C0209i c0209i6 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                if (c17863f == null) {
                    c28655q.m87150e0(-939017921);
                    c28655q.m87173q(false);
                    c0209i = c0209i7;
                    c0209i3 = c0209i5;
                    c0209i2 = c0209i6;
                    c0213j = c0213j2;
                    z14 = false;
                    z13 = true;
                } else {
                    c28655q.m87150e0(-939017920);
                    Modifier modifierM3424u = AbstractC1102d.m3424u(36 * 4, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                    Modifier modifierM3388j = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90537w);
                    InterfaceC22965i interfaceC22965iM51364c = c17863f.getArrangement();
                    TextResource textResourceM51373m = c17863f.getText();
                    boolean zM51365e = c17863f.getBackButtonEnabled();
                    boolean zM51368h = c17863f.getForwardButtonEnabled();
                    String strM51366f = c17863f.getBackDate();
                    String strM51369i = c17863f.getForwardDate();
                    GenericInteraction genericInteractionM51372l = c17863f.getPreviousInteraction();
                    GenericInteraction genericInteractionM51371k = c17863f.getNextInteraction();
                    int i17 = (i15 & 112) | 6 | (TextResource.$stable << 9);
                    int i18 = GenericInteraction.$stable;
                    c0209i = c0209i7;
                    c0209i2 = c0209i6;
                    c0213j = c0213j2;
                    c0209i3 = c0209i5;
                    AbstractC17862e.m51358q(modifierM3388j, z4, interfaceC22965iM51364c, textResourceM51373m, zM51365e, zM51368h, strM51366f, strM51369i, genericInteractionM51372l, genericInteractionM51371k, null, null, function1, c28655q, i17 | (i18 << 24) | (i18 << 27), (i15 >> 6) & 896, 3072);
                    z13 = true;
                    c28655q.m87173q(true);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                if (!(((double) 1.0f) > 0.0d ? z13 : z14)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, z13, c28655q);
                float f13 = 4;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                c28655q.m87150e0(-1279555034);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function2, c28655q, (i15 >> 6) & 7168, 6);
                }
                function3 = function2;
                c28655q.m87173q(z14);
                if (c36570d0 == null) {
                    c28655q.m87150e0(-1011374529);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-1011374528);
                    boolean z15 = (i15 & 458752) == 131072 ? z13 : z14;
                    Object objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C12122i(function3, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC36568c0.m117308m(c36570d0, null, (Function1) objM87133R, c28655q, C36570d0.f156622b, 2);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f13, c2314t));
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i19 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: dn0.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12216p.m33897X(c17863f, z4, c36570d0, list, function1, function3, i13, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC12216p.m33899Z(c17863f, z4, c36570d0, list, function1, function3, i13, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m33897X(C17863f c17863f, boolean z4, C36570d0 c36570d0, List list, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m33896W(c17863f, z4, c36570d0, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m33898Y(Function1 function1, AbstractC36597y event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC36597y.a) {
            function1.invoke(((AbstractC36597y.a) event).getInteraction());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m33899Z(C17863f c17863f, boolean z4, C36570d0 c36570d0, List list, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m33896W(c17863f, z4, c36570d0, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final int m33901a0(int i13) {
        return 119 - i13;
    }

    /* JADX INFO: renamed from: b0 */
    public static final int m33903b0(int i13) {
        return 119 - i13;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x0265  */
    /* JADX WARN: Code duplicated, block: B:108:0x0267  */
    /* JADX WARN: Code duplicated, block: B:112:0x0275  */
    /* JADX WARN: Code duplicated, block: B:116:0x028c  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0209  */
    /* JADX WARN: Code duplicated, block: B:92:0x0213  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022f  */
    /* JADX INFO: renamed from: y */
    public static final void m33926y(Modifier modifier, C18334a itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C3497e c3497e;
        String path;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        Function1 function5;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        Float fM52791e;
        float fFloatValue;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R5;
        boolean zM87157i4;
        Object objM87133R6;
        boolean z16;
        boolean z17;
        Object objM87133R7;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R8;
        Object obj;
        boolean zM87153g3;
        Object objM87133R9;
        Object objM87133R10;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-947804232);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12040a(27);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    function4 = (Function1) objM87133R10;
                } else {
                    function4 = function2;
                }
                c3497e = new C3497e(false, false, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                path = itemState.getRequest().getPath();
                c28655q2.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q2, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q2, -707312137, false, c28655q2);
                    applicationContext = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(null);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3497e, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, path);
                        c28655q2.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                } else {
                    c28655q2.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q2);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q2.m87150e0(-707931115);
                        c28655q2.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q2.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g2 = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(null);
                        objM87133R8 = c28655q2.m87133R();
                        if (!zM87153g2 || objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, new C23863b(c3497e), path);
                            obj = null;
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R8;
                        c28655q2.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q2.m87150e0(-707430526);
                        zM87153g3 = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(obj);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g3 || objM87133R9 == c28676v0) {
                            objM87133R9 = new C23863b(c3497e);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        abstractC23864c = (C23863b) objM87133R9;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-438479417);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                function5 = function4;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C3497e(false, false, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q2, 0, 2);
                boolean zM87157i5 = c28655q2.m87157i(abstractC23864c);
                i16 = i15 & 112;
                if (i16 != 32 || ((i15 & 64) != 0 && c28655q2.m87157i(itemState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i5 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(abstractC23864c, itemState, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, itemState);
                C3497e c3497eM33874A = m33874A(interfaceC28601c1M87260n);
                fM52791e = itemState.getPageHeightRatio();
                if (fM52791e != null) {
                    fFloatValue = fM52791e.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                zM87157i = c28655q2.m87157i(abstractC23864c);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C2776b(abstractC23864c, 1);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function6 = (Function1) objM87133R3;
                zM87157i2 = c28655q2.m87157i(abstractC23864c);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C2776b(abstractC23864c, 2);
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function7 = (Function1) objM87133R4;
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q2.m87157i(abstractC23864c);
                objM87133R5 = c28655q2.m87133R();
                if (zM87157i3 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2205b(function5, abstractC23864c, 1);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function1 function8 = (Function1) objM87133R5;
                zM87157i4 = c28655q2.m87157i(abstractC23864c);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i4 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C2776b(abstractC23864c, 3);
                    c28655q2.m87172p0(objM87133R6);
                }
                Function1 function9 = (Function1) objM87133R6;
                boolean zM87157i6 = c28655q2.m87157i(abstractC23864c);
                Modifier modifier4 = modifier3;
                if (i16 != 32 || ((i15 & 64) != 0 && c28655q2.m87157i(itemState))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i6 | z16;
                objM87133R7 = c28655q2.m87133R();
                if (z17 || objM87133R7 == c28676v0) {
                    objM87133R7 = new C11546l(9, abstractC23864c, itemState);
                    c28655q2.m87172p0(objM87133R7);
                }
                m33881H(modifier4, c3497eM33874A, fFloatValue, function5, function6, function7, function8, function9, (InterfaceC4339a) objM87133R7, c28655q2, (i15 & 14) | ((i15 << 3) & 7168), 0);
                c28655q = c28655q2;
                modifier2 = modifier4;
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier2, itemState, function3, i13, i14, 25);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C12040a(27);
                    c28655q2.m87172p0(objM87133R10);
                }
                function4 = (Function1) objM87133R10;
            } else {
                function4 = function2;
            }
            c3497e = new C3497e(false, false, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            path = itemState.getRequest().getPath();
            c28655q2.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q2, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q2.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q2);
                if (interfaceC1583f2M73844a == null) {
                    c28655q2.m87150e0(-707931115);
                    c28655q2.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q2.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g2 = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(null);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R8 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, new C23863b(c3497e), path);
                        obj = null;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, new C23863b(c3497e), path);
                        obj = null;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R8;
                    c28655q2.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q2.m87150e0(-707430526);
                    zM87153g3 = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(obj);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R9 = new C23863b(c3497e);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C23863b(c3497e);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    abstractC23864c = (C23863b) objM87133R9;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-438479417);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q2, -707312137, false, c28655q2);
                applicationContext = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q2.m87153g(path) | c28655q2.m87153g(c3497e) | c28655q2.m87153g(null);
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3497e, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, path);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3497e, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC3495c.class), null, path);
                    c28655q2.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q2.m87173q(false);
            function5 = function4;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C3497e(false, false, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q2, 0, 2);
            boolean zM87157i7 = c28655q2.m87157i(abstractC23864c);
            i16 = i15 & 112;
            if (i16 != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = zM87157i7 | z13;
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new a(abstractC23864c, itemState, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(abstractC23864c, itemState, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, itemState);
            C3497e c3497eM33874A2 = m33874A(interfaceC28601c1M87260n2);
            fM52791e = itemState.getPageHeightRatio();
            if (fM52791e != null) {
                fFloatValue = fM52791e.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            zM87157i = c28655q2.m87157i(abstractC23864c);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R3 = new C2776b(abstractC23864c, 1);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C2776b(abstractC23864c, 1);
                c28655q2.m87172p0(objM87133R3);
            }
            Function1 function10 = (Function1) objM87133R3;
            zM87157i2 = c28655q2.m87157i(abstractC23864c);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C2776b(abstractC23864c, 2);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2776b(abstractC23864c, 2);
                c28655q2.m87172p0(objM87133R4);
            }
            Function1 function11 = (Function1) objM87133R4;
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i3 = z15 | c28655q2.m87157i(abstractC23864c);
            objM87133R5 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R5 = new C2205b(function5, abstractC23864c, 1);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2205b(function5, abstractC23864c, 1);
                c28655q2.m87172p0(objM87133R5);
            }
            Function1 function12 = (Function1) objM87133R5;
            zM87157i4 = c28655q2.m87157i(abstractC23864c);
            objM87133R6 = c28655q2.m87133R();
            if (zM87157i4) {
                objM87133R6 = new C2776b(abstractC23864c, 3);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C2776b(abstractC23864c, 3);
                c28655q2.m87172p0(objM87133R6);
            }
            Function1 function13 = (Function1) objM87133R6;
            boolean zM87157i8 = c28655q2.m87157i(abstractC23864c);
            Modifier modifier5 = modifier3;
            if (i16 != 32) {
                z16 = true;
            } else {
                z16 = true;
            }
            z17 = zM87157i8 | z16;
            objM87133R7 = c28655q2.m87133R();
            if (z17) {
                objM87133R7 = new C11546l(9, abstractC23864c, itemState);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C11546l(9, abstractC23864c, itemState);
                c28655q2.m87172p0(objM87133R7);
            }
            m33881H(modifier5, c3497eM33874A2, fFloatValue, function5, function10, function11, function12, function13, (InterfaceC4339a) objM87133R7, c28655q2, (i15 & 14) | ((i15 << 3) & 7168), 0);
            c28655q = c28655q2;
            modifier2 = modifier5;
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier2, itemState, function3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m33927z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
