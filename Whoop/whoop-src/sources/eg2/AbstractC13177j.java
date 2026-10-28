package eg2;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1910d;
import az1.C2161b;
import az1.C2165f;
import b01.C2192m;
import bc3.InterfaceC2994c0;
import bg2.AbstractC3235h;
import bg2.C3228a;
import bg2.InterfaceC3232e;
import bm0.C3403f;
import bs1.C3590i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cg2.AbstractC4574a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9813i;
import com.whoop.sms.setup.view.SmsSetupDestinationV2;
import dg2.C12009a;
import dg2.C12010b;
import e81.C12824e;
import eb1.C13005a;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import fg2.AbstractC14465g;
import fg2.AbstractC14472n;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.C3789x;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p179h.C16351i;
import p236j.C21062a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf2.AbstractC35950b;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: eg2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ao\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\u00020\u0004*\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ldg2/a;", "viewModel", "Lkotlin/Function1;", "Lcg2/a;", "Ll83/a0;", "onNavigationEvent", "O", "(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ldg2/b;", "viewState", "Lec3/l;", "Lbg2/e;", "effects", "Lcom/whoop/sms/setup/view/SmsSetupDestinationV2;", "initialDestination", "Lbg2/h;", "onViewEvent", "Lkotlin/Function0;", "onSuccessComplete", "v", "(Ldg2/b;Lec3/l;Lcom/whoop/sms/setup/view/SmsSetupDestinationV2;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp1/c1;", "", "currentRoute", "W", "(Lp1/c1;Lkotlin/jvm/functions/Function1;)V", "", "Lbg2/a;", "contactPhoneNumbers", "Landroid/content/Intent;", "U", "(Ljava/util/List;)Landroid/content/Intent;", "fallbackNumbers", "X", "(Landroid/content/Intent;Ljava/util/List;)V", "Landroid/content/ContentValues;", "Y", "(Lbg2/a;)Landroid/content/ContentValues;", "destinationPhoneNumber", "prefilledBody", "V", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13177j {

    /* JADX INFO: renamed from: eg2.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.view.SmsSetupScreenV2Kt$SmsSetupScreenContentV2$4$1", m100430f = "SmsSetupScreenV2.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45677w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13058l f45678x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16351i f45679y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C16351i f45680z;

        /* JADX INFO: renamed from: eg2.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41526a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C16351i f45681w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16351i f45682x;

            public C41526a(C16351i c16351i, C16351i c16351i2) {
                this.f45681w = c16351i;
                this.f45682x = c16351i2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC3232e interfaceC3232e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (interfaceC3232e instanceof InterfaceC3232e.b) {
                    InterfaceC3232e.b bVar = (InterfaceC3232e.b) interfaceC3232e;
                    this.f45681w.mo4052a(AbstractC13177j.m37014V(bVar.getDestinationPhoneNumber(), bVar.getPrefilledBody()), null);
                } else {
                    if (!(interfaceC3232e instanceof InterfaceC3232e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f45682x.mo4052a(AbstractC13177j.m37013U(((InterfaceC3232e.a) interfaceC3232e).m9352a()), null);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13058l interfaceC13058l, C16351i c16351i, C16351i c16351i2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45678x = interfaceC13058l;
            this.f45679y = c16351i;
            this.f45680z = c16351i2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f45678x, this.f45679y, this.f45680z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45677w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = this.f45678x;
                C41526a c41526a = new C41526a(this.f45679y, this.f45680z);
                this.f45677w = 1;
                if (interfaceC13058l.collect(c41526a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: eg2.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements Function1 {
        public b(Object obj) {
            super(1, 0, C12009a.class, obj, "onViewEvent", "onViewEvent(Lcom/whoop/sms/setup/domain/SmsSetupViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m37045a(AbstractC3235h p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C12009a) this.receiver).m33127p(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m37045a((AbstractC3235h) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m36993A(InterfaceC4339a interfaceC4339a, C21062a it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m36994B(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        m37015W(interfaceC28601c1, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m36995C(Function1 function1) {
        function1.invoke(AbstractC4574a.c.f18426a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C3756l0 m36996D(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC22676k.m65745e(((C3789x) AnimatedContent).mo11595b(), "INTRO") ? AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(19)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(20))) : AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(21)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(22)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final int m36997E(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final int m36998F(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final int m36999G(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final int m37000H(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m37001I(Function1 function1, C12010b c12010b, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC3764o AnimatedContent, String route, Composer composer, int i13) throws Throwable {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(route, "route");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C3590i(interfaceC28601c1, function1, 9);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
        int iHashCode = route.hashCode();
        C2314t c2314t = C2314t.f9131w;
        if (iHashCode != 69824076) {
            if (iHashCode != 753543685) {
                if (iHashCode == 1383663147 && route.equals("COMPLETED")) {
                    c28655q.m87150e0(939583058);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    boolean zM33141m = c12010b.getIsStartingTextingWhoop();
                    boolean zM33142n = c12010b.getIsTextingWhoopError();
                    boolean zM87157i = c28655q.m87157i(c12010b) | c28655q.m87153g(function2);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C13173f(c12010b, function2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC14465g.m41234e(modifierM3407d, zM33141m, zM33142n, (InterfaceC4339a) objM87133R2, c28655q, 6, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(940373062);
                    c28655q.m87173q(false);
                }
            } else if (route.equals("TERMS_OF_SERVICE")) {
                c28655q.m87150e0(940224634);
                AbstractC13181n.m37055i(AbstractC1102d.m3407d(1.0f, c2314t), c28655q, 6, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(940373062);
                c28655q.m87173q(false);
            }
        } else if (route.equals("INTRO")) {
            c28655q.m87150e0(938927005);
            boolean zM33137i = c12010b.getIsFetchingDestinationPhoneNumber();
            boolean zM33139k = c12010b.getIsPhoneNumberError();
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87153g2 = c28655q.m87153g(function2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C9813i(function2, 20);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C2192m(25, interfaceC28601c1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC14472n.m41309n(modifierM3407d2, zM33137i, zM33139k, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q, 24582, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(940373062);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m37002J(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        m37015W(interfaceC28601c1, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m37003K(Function1 function1) {
        function1.invoke(AbstractC3235h.b.f12695a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m37004L(InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue("TERMS_OF_SERVICE");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m37005M(C12010b c12010b, Function1 function1) {
        if (c12010b.getDestinationPhoneNumber().length() > 0) {
            function1.invoke(new AbstractC3235h.e(c12010b.getDestinationPhoneNumber()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m37006N(C12010b c12010b, InterfaceC13058l interfaceC13058l, SmsSetupDestinationV2 smsSetupDestinationV2, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m37039v(c12010b, interfaceC13058l, smsSetupDestinationV2, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    public static final void m37007O(C12009a viewModel, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-955385760);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewModel) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                InterfaceC13087t1 interfaceC13087t1M33126o = viewModel.getViewState();
                C12010b c12010b = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                int i17 = TextResource.$stable;
                C12010b c12010bM37009Q = m37009Q(AbstractC28683x.m87260n(interfaceC13087t1M33126o, c12010b, null, c28655q, i17 << 3, 2));
                InterfaceC13058l interfaceC13058lM33125n = viewModel.getEffects();
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new b(viewModel);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function5 = (Function1) ((InterfaceC21467g) objM87133R);
                z13 = (i15 & 112) == 32;
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9813i(function4, 21);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function6 = function4;
                m37039v(c12010bM37009Q, interfaceC13058lM33125n, null, function5, (InterfaceC4339a) objM87133R2, function6, c28655q, i17 | ((i15 << 12) & 458752), 4);
                c28655q = c28655q;
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13174g(viewModel, function3, i13, i14, 1);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12824e(17);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            InterfaceC13087t1 interfaceC13087t1M33126o2 = viewModel.getViewState();
            C12010b c12010b2 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
            int i18 = TextResource.$stable;
            C12010b c12010bM37009Q2 = m37009Q(AbstractC28683x.m87260n(interfaceC13087t1M33126o2, c12010b2, null, c28655q, i18 << 3, 2));
            InterfaceC13058l interfaceC13058lM33125n2 = viewModel.getEffects();
            zM87157i = c28655q.m87157i(viewModel);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new b(viewModel);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new b(viewModel);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function7 = (Function1) ((InterfaceC21467g) objM87133R);
            if ((i15 & 112) == 32) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C9813i(function4, 21);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C9813i(function4, 21);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function8 = function4;
            m37039v(c12010bM37009Q2, interfaceC13058lM33125n2, null, function7, (InterfaceC4339a) objM87133R2, function8, c28655q, i18 | ((i15 << 12) & 458752), 4);
            c28655q = c28655q;
            function3 = function8;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13174g(viewModel, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m37008P(AbstractC4574a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final C12010b m37009Q(InterfaceC28670t2 interfaceC28670t2) {
        return (C12010b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m37010R(Function1 function1) {
        function1.invoke(AbstractC4574a.b.f18425a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m37011S(C12009a c12009a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37007O(c12009a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    public static final Intent m37013U(List<C3228a> contactPhoneNumbers) {
        AbstractC22676k.m65750j(contactPhoneNumbers, "contactPhoneNumbers");
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("name", "WHOOP");
        C3228a c3228a = (C3228a) AbstractC25265s.m74100H0(contactPhoneNumbers);
        String strM9329b = c3228a != null ? c3228a.getPhoneNumber() : null;
        if (strM9329b == null) {
            strM9329b = "";
        }
        intent.putExtra("phone", strM9329b);
        intent.putExtra("phone_type", 2);
        m37016X(intent, AbstractC25265s.m74161z0(contactPhoneNumbers, 1));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Intent m37014V(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        return intent;
    }

    /* JADX INFO: renamed from: W */
    private static final void m37015W(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        String str = (String) interfaceC28601c1.getValue();
        int iHashCode = str.hashCode();
        if (iHashCode == 69824076) {
            if (str.equals("INTRO")) {
                function1.invoke(AbstractC4574a.a.f18424a);
                return;
            }
            return;
        }
        if (iHashCode != 753543685) {
            if (iHashCode != 1383663147 || !str.equals("COMPLETED")) {
                return;
            }
        } else if (!str.equals("TERMS_OF_SERVICE")) {
            return;
        }
        interfaceC28601c1.setValue("INTRO");
    }

    /* JADX INFO: renamed from: X */
    private static final void m37016X(Intent intent, List<C3228a> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m37017Y((C3228a) it.next()));
        }
        intent.putParcelableArrayListExtra("data", arrayList);
    }

    /* JADX INFO: renamed from: Y */
    private static final ContentValues m37017Y(C3228a c3228a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("data1", c3228a.getPhoneNumber());
        if (c3228a.getLabel().length() == 0) {
            contentValues.put("data2", (Integer) 7);
            return contentValues;
        }
        contentValues.put("data2", (Integer) 0);
        contentValues.put("data3", c3228a.getLabel());
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0248  */
    /* JADX WARN: Code duplicated, block: B:138:0x024c  */
    /* JADX WARN: Code duplicated, block: B:141:0x025f  */
    /* JADX WARN: Code duplicated, block: B:143:0x026d  */
    /* JADX WARN: Code duplicated, block: B:146:0x027f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0288  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0306  */
    /* JADX WARN: Code duplicated, block: B:166:0x0309  */
    /* JADX WARN: Code duplicated, block: B:169:0x0311 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0313  */
    /* JADX WARN: Code duplicated, block: B:173:0x033a  */
    /* JADX WARN: Code duplicated, block: B:176:0x037c  */
    /* JADX WARN: Code duplicated, block: B:179:0x038d  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final void m37039v(C12010b c12010b, InterfaceC13058l interfaceC13058l, SmsSetupDestinationV2 smsSetupDestinationV2, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC13058l interfaceC13058l2;
        Function1 function3;
        int i16;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        InterfaceC4339a interfaceC4339a2;
        InterfaceC13058l interfaceC13058l3;
        Function1 function5;
        Function1 function6;
        SmsSetupDestinationV2 smsSetupDestinationV3;
        C12010b c12010b2;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        SmsSetupDestinationV2 smsSetupDestinationV4;
        Function1 function7;
        InterfaceC4339a interfaceC4339a3;
        int i25;
        Function1 function8;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM65745e;
        Object objM87133R5;
        C16351i c16351iM118972a0;
        boolean z13;
        Object objM87133R6;
        C16351i c16351iM118972a1;
        boolean zM87157i;
        Object objM87133R7;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM21267a;
        C39274g c39274g;
        int i26;
        boolean z14;
        Object objM87133R8;
        Function1 function10;
        boolean z15;
        Object objM87133R9;
        Object objM87133R10;
        int i27;
        C12010b c12010b3 = c12010b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1924931204);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) != 0) {
                i27 = 2;
            } else {
                if ((i13 & 8) == 0 ? c28655q.m87153g(c12010b3) : c28655q.m87157i(c12010b3)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
            }
            i15 = i27 | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                interfaceC13058l2 = interfaceC13058l;
                int i28 = c28655q.m87157i(interfaceC13058l2) ? 32 : 16;
                i15 |= i28;
            } else {
                interfaceC13058l2 = interfaceC13058l;
            }
            i15 |= i28;
        } else {
            interfaceC13058l2 = interfaceC13058l;
        }
        int i29 = i14 & 4;
        if (i29 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(smsSetupDestinationV2 == null ? -1 : smsSetupDestinationV2.ordinal()) ? 256 : 128;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i17 = 16384;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        i24 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0 || c28655q.m87118C()) {
                            if ((i14 & 1) != 0) {
                                i15 &= -15;
                                c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            }
                            if ((i14 & 2) != 0) {
                                i15 &= -113;
                                interfaceC13058l2 = C13054k.f45116w;
                            }
                            if (i29 != 0) {
                                smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                            } else {
                                smsSetupDestinationV4 = smsSetupDestinationV2;
                            }
                            if (i34 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C12824e(23);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function7 = (Function1) objM87133R3;
                            } else {
                                function7 = function3;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13005a(25);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C12824e(24);
                                    c28655q.m87172p0(objM87133R);
                                }
                                Function1 function11 = (Function1) objM87133R;
                                i25 = i15;
                                function8 = function11;
                            } else {
                                i25 = i15;
                                function8 = function4;
                            }
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 1) != 0) {
                                i15 &= -15;
                            }
                            if ((i14 & 2) != 0) {
                                i15 &= -113;
                            }
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                            i25 = i15;
                            function7 = function3;
                            function8 = function4;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        c28655q.m87175r();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                        zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                        ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1910d(27, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult, (Function1) objM87133R5, c28655q, 48);
                        ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
                        if ((57344 & i25) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z13 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C2161b(interfaceC4339a3, 18);
                            c28655q.m87172p0(objM87133R6);
                        }
                        c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult2, (Function1) objM87133R6, c28655q, 0);
                        zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                        objM87133R7 = c28655q.m87133R();
                        C12010b c12010b4 = c12010b3;
                        if (zM87157i || objM87133R7 == c28676v0) {
                            objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                        Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C2305k c2305k = C2299e.f9111N;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 54);
                        function9 = function8;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        InterfaceC13058l interfaceC13058l4 = interfaceC13058l2;
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
                        int i35 = i25;
                        HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
                        if (zM65745e) {
                            textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        TextResource textResource = textResourceM21267a;
                        C39274g c39274g2 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                        if (zM65745e) {
                            c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                        } else {
                            c39274g = null;
                        }
                        AbstractC6721d.a aVar = new AbstractC6721d.a(textResource, null, c39274g2, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        i26 = 458752 & i35;
                        if (i26 == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (!z14 || objM87133R8 == c28676v0) {
                            function10 = function9;
                            objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function10 = function9;
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                        if (i26 == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z15 || objM87133R9 == c28676v0) {
                            objM87133R9 = new C9813i(function10, 22);
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC6719b.m20143d(horizontalAlignElement, aVar, null, interfaceC4339a4, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                        Object value = interfaceC28601c1.getValue();
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C12824e(18);
                            c28655q.m87172p0(objM87133R10);
                        }
                        c12010b3 = c12010b4;
                        AbstractC1089a.m3344b(value, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b4, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                        function6 = function10;
                        smsSetupDestinationV3 = smsSetupDestinationV4;
                        function5 = function7;
                        interfaceC4339a2 = interfaceC4339a5;
                        interfaceC13058l3 = interfaceC13058l4;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        interfaceC13058l3 = interfaceC13058l2;
                        function5 = function3;
                        function6 = function4;
                        smsSetupDestinationV3 = smsSetupDestinationV2;
                    }
                    c12010b2 = c12010b3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function12 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function12;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function13 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function13;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult3 = new ActivityResultContracts$StartActivityForResult();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1910d(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult3, (Function1) objM87133R5, c28655q, 48);
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult4 = new ActivityResultContracts$StartActivityForResult();
                    if ((57344 & i25) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z13) {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult4, (Function1) objM87133R6, c28655q, 0);
                    zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                    objM87133R7 = c28655q.m87133R();
                    C12010b c12010b5 = c12010b3;
                    if (zM87157i) {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                    Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9111N;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 54);
                    function9 = function8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    InterfaceC13058l interfaceC13058l5 = interfaceC13058l2;
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
                    int i36 = i25;
                    HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(c2305k2);
                    if (zM65745e) {
                        textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource2 = textResourceM21267a;
                    C39274g c39274g3 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    if (zM65745e) {
                        c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResource2, null, c39274g3, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    i26 = 458752 & i36;
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z14) {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    if (i26 == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z15) {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement2, aVar2, null, interfaceC4339a6, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value2 = interfaceC28601c1.getValue();
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12824e(18);
                        c28655q.m87172p0(objM87133R10);
                    }
                    c12010b3 = c12010b5;
                    AbstractC1089a.m3344b(value2, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b5, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                    function6 = function10;
                    smsSetupDestinationV3 = smsSetupDestinationV4;
                    function5 = function7;
                    interfaceC4339a2 = interfaceC4339a7;
                    interfaceC13058l3 = interfaceC13058l5;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    interfaceC13058l3 = interfaceC13058l2;
                    function5 = function3;
                    function6 = function4;
                    smsSetupDestinationV3 = smsSetupDestinationV2;
                }
                c12010b2 = c12010b3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
                }
            }
            i15 |= 24576;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function14 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function14;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function15 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function15;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult5 = new ActivityResultContracts$StartActivityForResult();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1910d(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult5, (Function1) objM87133R5, c28655q, 48);
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult6 = new ActivityResultContracts$StartActivityForResult();
                    if ((57344 & i25) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z13) {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult6, (Function1) objM87133R6, c28655q, 0);
                    zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                    objM87133R7 = c28655q.m87133R();
                    C12010b c12010b6 = c12010b3;
                    if (zM87157i) {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                    Modifier modifierM66720i3 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C2305k c2305k3 = C2299e.f9111N;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 54);
                    function9 = function8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66720i3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    InterfaceC13058l interfaceC13058l6 = interfaceC13058l2;
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
                    int i37 = i25;
                    HorizontalAlignElement horizontalAlignElement3 = new HorizontalAlignElement(c2305k3);
                    if (zM65745e) {
                        textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource3 = textResourceM21267a;
                    C39274g c39274g4 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    if (zM65745e) {
                        c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResource3, null, c39274g4, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    i26 = 458752 & i37;
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z14) {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R8;
                    if (i26 == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z15) {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement3, aVar3, null, interfaceC4339a8, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value3 = interfaceC28601c1.getValue();
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12824e(18);
                        c28655q.m87172p0(objM87133R10);
                    }
                    c12010b3 = c12010b6;
                    AbstractC1089a.m3344b(value3, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b6, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                    function6 = function10;
                    smsSetupDestinationV3 = smsSetupDestinationV4;
                    function5 = function7;
                    interfaceC4339a2 = interfaceC4339a9;
                    interfaceC13058l3 = interfaceC13058l6;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    interfaceC13058l3 = interfaceC13058l2;
                    function5 = function3;
                    function6 = function4;
                    smsSetupDestinationV3 = smsSetupDestinationV2;
                }
                c12010b2 = c12010b3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function16 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function16;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function17 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function17;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult7 = new ActivityResultContracts$StartActivityForResult();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1910d(27, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult7, (Function1) objM87133R5, c28655q, 48);
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult8 = new ActivityResultContracts$StartActivityForResult();
                if ((57344 & i25) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z13) {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult8, (Function1) objM87133R6, c28655q, 0);
                zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                objM87133R7 = c28655q.m87133R();
                C12010b c12010b7 = c12010b3;
                if (zM87157i) {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                Modifier modifierM66720i4 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9111N;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 54);
                function9 = function8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                InterfaceC13058l interfaceC13058l7 = interfaceC13058l2;
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
                int i38 = i25;
                HorizontalAlignElement horizontalAlignElement4 = new HorizontalAlignElement(c2305k4);
                if (zM65745e) {
                    textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource4 = textResourceM21267a;
                C39274g c39274g5 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                if (zM65745e) {
                    c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResource4, null, c39274g5, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                i26 = 458752 & i38;
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z14) {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R8;
                if (i26 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z15) {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC6719b.m20143d(horizontalAlignElement4, aVar4, null, interfaceC4339a10, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value4 = interfaceC28601c1.getValue();
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C12824e(18);
                    c28655q.m87172p0(objM87133R10);
                }
                c12010b3 = c12010b7;
                AbstractC1089a.m3344b(value4, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b7, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                function6 = function10;
                smsSetupDestinationV3 = smsSetupDestinationV4;
                function5 = function7;
                interfaceC4339a2 = interfaceC4339a11;
                interfaceC13058l3 = interfaceC13058l7;
            } else {
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                interfaceC13058l3 = interfaceC13058l2;
                function5 = function3;
                function6 = function4;
                smsSetupDestinationV3 = smsSetupDestinationV2;
            }
            c12010b2 = c12010b3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i17 = 16384;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function18 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function18;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            i15 &= -15;
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        }
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                            interfaceC13058l2 = C13054k.f45116w;
                        }
                        if (i29 != 0) {
                            smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                        } else {
                            smsSetupDestinationV4 = smsSetupDestinationV2;
                        }
                        if (i34 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function19 = (Function1) objM87133R;
                            i25 = i15;
                            function8 = function19;
                        } else {
                            i25 = i15;
                            function8 = function4;
                        }
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult9 = new ActivityResultContracts$StartActivityForResult();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1910d(27, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult9, (Function1) objM87133R5, c28655q, 48);
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult10 = new ActivityResultContracts$StartActivityForResult();
                    if ((57344 & i25) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z13) {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C2161b(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult10, (Function1) objM87133R6, c28655q, 0);
                    zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                    objM87133R7 = c28655q.m87133R();
                    C12010b c12010b8 = c12010b3;
                    if (zM87157i) {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                    Modifier modifierM66720i5 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C2305k c2305k5 = C2299e.f9111N;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 54);
                    function9 = function8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66720i5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    InterfaceC13058l interfaceC13058l8 = interfaceC13058l2;
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
                    int i39 = i25;
                    HorizontalAlignElement horizontalAlignElement5 = new HorizontalAlignElement(c2305k5);
                    if (zM65745e) {
                        textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource5 = textResourceM21267a;
                    C39274g c39274g6 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    if (zM65745e) {
                        c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(textResource5, null, c39274g6, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    i26 = 458752 & i39;
                    if (i26 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z14) {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function10 = function9;
                        objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R8;
                    if (i26 == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z15) {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C9813i(function10, 22);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement5, aVar5, null, interfaceC4339a12, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value5 = interfaceC28601c1.getValue();
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C12824e(18);
                        c28655q.m87172p0(objM87133R10);
                    }
                    c12010b3 = c12010b8;
                    AbstractC1089a.m3344b(value5, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b8, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a3;
                    function6 = function10;
                    smsSetupDestinationV3 = smsSetupDestinationV4;
                    function5 = function7;
                    interfaceC4339a2 = interfaceC4339a13;
                    interfaceC13058l3 = interfaceC13058l8;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    interfaceC13058l3 = interfaceC13058l2;
                    function5 = function3;
                    function6 = function4;
                    smsSetupDestinationV3 = smsSetupDestinationV2;
                }
                c12010b2 = c12010b3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function110 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function110;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function111 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function111;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult11 = new ActivityResultContracts$StartActivityForResult();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1910d(27, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult11, (Function1) objM87133R5, c28655q, 48);
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult12 = new ActivityResultContracts$StartActivityForResult();
                if ((57344 & i25) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z13) {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult12, (Function1) objM87133R6, c28655q, 0);
                zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                objM87133R7 = c28655q.m87133R();
                C12010b c12010b9 = c12010b3;
                if (zM87157i) {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                Modifier modifierM66720i6 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C2305k c2305k6 = C2299e.f9111N;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 54);
                function9 = function8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66720i6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                InterfaceC13058l interfaceC13058l9 = interfaceC13058l2;
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
                int i310 = i25;
                HorizontalAlignElement horizontalAlignElement6 = new HorizontalAlignElement(c2305k6);
                if (zM65745e) {
                    textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource6 = textResourceM21267a;
                C39274g c39274g7 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                if (zM65745e) {
                    c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(textResource6, null, c39274g7, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                i26 = 458752 & i310;
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z14) {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R8;
                if (i26 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z15) {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC6719b.m20143d(horizontalAlignElement6, aVar6, null, interfaceC4339a14, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value6 = interfaceC28601c1.getValue();
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C12824e(18);
                    c28655q.m87172p0(objM87133R10);
                }
                c12010b3 = c12010b9;
                AbstractC1089a.m3344b(value6, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b9, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a3;
                function6 = function10;
                smsSetupDestinationV3 = smsSetupDestinationV4;
                function5 = function7;
                interfaceC4339a2 = interfaceC4339a15;
                interfaceC13058l3 = interfaceC13058l9;
            } else {
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                interfaceC13058l3 = interfaceC13058l2;
                function5 = function3;
                function6 = function4;
                smsSetupDestinationV3 = smsSetupDestinationV2;
            }
            c12010b2 = c12010b3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
            }
        }
        i15 |= 24576;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function112 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function112;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        i15 &= -15;
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    }
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                        interfaceC13058l2 = C13054k.f45116w;
                    }
                    if (i29 != 0) {
                        smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                    } else {
                        smsSetupDestinationV4 = smsSetupDestinationV2;
                    }
                    if (i34 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function113 = (Function1) objM87133R;
                        i25 = i15;
                        function8 = function113;
                    } else {
                        i25 = i15;
                        function8 = function4;
                    }
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult13 = new ActivityResultContracts$StartActivityForResult();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1910d(27, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult13, (Function1) objM87133R5, c28655q, 48);
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult14 = new ActivityResultContracts$StartActivityForResult();
                if ((57344 & i25) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z13) {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C2161b(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult14, (Function1) objM87133R6, c28655q, 0);
                zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
                objM87133R7 = c28655q.m87133R();
                C12010b c12010b10 = c12010b3;
                if (zM87157i) {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
                Modifier modifierM66720i7 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C2305k c2305k7 = C2299e.f9111N;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 54);
                function9 = function8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66720i7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                InterfaceC13058l interfaceC13058l10 = interfaceC13058l2;
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
                int i311 = i25;
                HorizontalAlignElement horizontalAlignElement7 = new HorizontalAlignElement(c2305k7);
                if (zM65745e) {
                    textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                TextResource textResource7 = textResourceM21267a;
                C39274g c39274g8 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                if (zM65745e) {
                    c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(textResource7, null, c39274g8, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                i26 = 458752 & i311;
                if (i26 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z14) {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function10 = function9;
                    objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R8;
                if (i26 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z15) {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C9813i(function10, 22);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC6719b.m20143d(horizontalAlignElement7, aVar7, null, interfaceC4339a16, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value7 = interfaceC28601c1.getValue();
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C12824e(18);
                    c28655q.m87172p0(objM87133R10);
                }
                c12010b3 = c12010b10;
                AbstractC1089a.m3344b(value7, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b10, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                InterfaceC4339a interfaceC4339a17 = interfaceC4339a3;
                function6 = function10;
                smsSetupDestinationV3 = smsSetupDestinationV4;
                function5 = function7;
                interfaceC4339a2 = interfaceC4339a17;
                interfaceC13058l3 = interfaceC13058l10;
            } else {
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                interfaceC13058l3 = interfaceC13058l2;
                function5 = function3;
                function6 = function4;
                smsSetupDestinationV3 = smsSetupDestinationV2;
            }
            c12010b2 = c12010b3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function4 = function2;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                    c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                    interfaceC13058l2 = C13054k.f45116w;
                }
                if (i29 != 0) {
                    smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                } else {
                    smsSetupDestinationV4 = smsSetupDestinationV2;
                }
                if (i34 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12824e(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function114 = (Function1) objM87133R;
                    i25 = i15;
                    function8 = function114;
                } else {
                    i25 = i15;
                    function8 = function4;
                }
            } else {
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                    c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                    interfaceC13058l2 = C13054k.f45116w;
                }
                if (i29 != 0) {
                    smsSetupDestinationV4 = SmsSetupDestinationV2.INTRO;
                } else {
                    smsSetupDestinationV4 = smsSetupDestinationV2;
                }
                if (i34 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12824e(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function115 = (Function1) objM87133R;
                    i25 = i15;
                    function8 = function115;
                } else {
                    i25 = i15;
                    function8 = function4;
                }
            }
            c28655q.m87175r();
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(smsSetupDestinationV4.name());
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult15 = new ActivityResultContracts$StartActivityForResult();
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C1910d(27, interfaceC28601c1);
                c28655q.m87172p0(objM87133R5);
            }
            c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult15, (Function1) objM87133R5, c28655q, 48);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult16 = new ActivityResultContracts$StartActivityForResult();
            if ((57344 & i25) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z13) {
                objM87133R6 = new C2161b(interfaceC4339a3, 18);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C2161b(interfaceC4339a3, 18);
                c28655q.m87172p0(objM87133R6);
            }
            c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult16, (Function1) objM87133R6, c28655q, 0);
            zM87157i = c28655q.m87157i(interfaceC13058l2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(c16351iM118972a0);
            objM87133R7 = c28655q.m87133R();
            C12010b c12010b11 = c12010b3;
            if (zM87157i) {
                objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new a(interfaceC13058l2, c16351iM118972a1, c16351iM118972a0, null);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, C23454a0.f92919a);
            Modifier modifierM66720i8 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C2305k c2305k8 = C2299e.f9111N;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 54);
            function9 = function8;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66720i8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            InterfaceC13058l interfaceC13058l11 = interfaceC13058l2;
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
            int i312 = i25;
            HorizontalAlignElement horizontalAlignElement8 = new HorizontalAlignElement(c2305k8);
            if (zM65745e) {
                textResourceM21267a = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            TextResource textResource8 = textResourceM21267a;
            C39274g c39274g9 = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
            if (zM65745e) {
                c39274g = new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, 2, 0 == true ? 1 : 0);
            } else {
                c39274g = null;
            }
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(textResource8, null, c39274g9, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
            i26 = 458752 & i312;
            if (i26 == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R8 = c28655q.m87133R();
            if (z14) {
                function10 = function9;
                objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                c28655q.m87172p0(objM87133R8);
            } else {
                function10 = function9;
                objM87133R8 = new C3590i(interfaceC28601c1, function10, 10);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R8;
            if (i26 == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R9 = c28655q.m87133R();
            if (z15) {
                objM87133R9 = new C9813i(function10, 22);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C9813i(function10, 22);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC6719b.m20143d(horizontalAlignElement8, aVar8, null, interfaceC4339a18, (InterfaceC4339a) objM87133R9, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
            Object value8 = interfaceC28601c1.getValue();
            objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C12824e(18);
                c28655q.m87172p0(objM87133R10);
            }
            c12010b3 = c12010b11;
            AbstractC1089a.m3344b(value8, null, (Function1) objM87133R10, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(1958868764, c28655q, new C3403f(function10, (Object) c12010b11, function7, (InterfaceC28670t2) interfaceC28601c1, 1)), c28655q, 1597824, 42);
            c28655q = c28655q;
            c28655q.m87173q(true);
            InterfaceC4339a interfaceC4339a19 = interfaceC4339a3;
            function6 = function10;
            smsSetupDestinationV3 = smsSetupDestinationV4;
            function5 = function7;
            interfaceC4339a2 = interfaceC4339a19;
            interfaceC13058l3 = interfaceC13058l11;
        } else {
            c28655q.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            interfaceC13058l3 = interfaceC13058l2;
            function5 = function3;
            function6 = function4;
            smsSetupDestinationV3 = smsSetupDestinationV2;
        }
        c12010b2 = c12010b3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f((Object) c12010b2, (Object) interfaceC13058l3, (Object) smsSetupDestinationV3, function5, interfaceC4339a2, function6, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m37040w(AbstractC3235h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m37041x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m37042y(AbstractC4574a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m37043z(InterfaceC28601c1 interfaceC28601c1, C21062a it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue("COMPLETED");
        return C23454a0.f92919a;
    }
}
