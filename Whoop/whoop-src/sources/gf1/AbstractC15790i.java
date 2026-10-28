package gf1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import e31.AbstractC12610b;
import e31.C12611c;
import ef1.C13146b;
import ef1.C13147c;
import ef1.InterfaceC13145a;
import f02.C13917c;
import g40.C15449y1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p163g1.C15079m3;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p701ce2.C4493a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: gf1.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lgf1/j;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lgf1/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "Lef1/a$g;", "sendViewEvent", "Lef1/a$a;", "sendAnalytics", "t", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lef1/c;", "viewState", "", "exercisePath", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lef1/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lef1/b;", "viewModel", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15790i {

    /* JADX INFO: renamed from: gf1.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f59500w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f59501x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f59502y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f59503z;

        /* JADX INFO: renamed from: gf1.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41648a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f59504w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41648a(C21647a c21647a) {
                super(0);
                this.f59504w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f59504w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f59500w = c38266c;
            this.f59501x = interfaceC35951a;
            this.f59502y = interfaceC4339a;
            this.f59503z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ef1.b] */
        @Override // c93.InterfaceC4339a
        public final C13146b invoke() {
            return AbstractC21598x.m60668X(this.f59500w, this.f59501x, new C41648a(this.f59503z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13146b.class), null, this.f59502y);
        }
    }

    /* JADX INFO: renamed from: gf1.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.view.ExerciseProgressScreenKt$ExerciseProgressMiniArchScreen$2$1", m100430f = "ExerciseProgressScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f59505w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15791j f59506x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f59507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15791j c15791j, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f59506x = c15791j;
            this.f59507y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f59506x, this.f59507y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f59505w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC15790i.m44541k(this.f59507y).m36802p(new InterfaceC13145a.e(this.f59506x.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gf1.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements Function1 {
        public c(Object obj) {
            super(1, 0, C13146b.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/exerciseprogressminiarch/presentation/ExerciseProgressEvent$ViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m44551a(InterfaceC13145a.g p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C13146b) this.receiver).m36802p(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m44551a((InterfaceC13145a.g) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gf1.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d extends C22672i implements Function1 {
        public d(Object obj) {
            super(1, 0, C13146b.class, obj, "sendAnalytics", "sendAnalytics(Lcom/whoop/exerciseprogressminiarch/presentation/ExerciseProgressEvent$AnalyticsEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m44552a(InterfaceC13145a.a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C13146b) this.receiver).m36801o(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m44552a((InterfaceC13145a.a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x014a  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m44538h(Modifier modifier, final C13147c viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        String str4;
        C28676v0 c28676v0;
        final Function1 function4;
        Modifier modifier4;
        String str5;
        int i18;
        boolean z13;
        boolean z14;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1253503550);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i24 != 0) {
                        str4 = "sample-path";
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15449y1(27);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (viewState.getMiniArchModal() != null) {
                        c28655q.m87150e0(-1616114440);
                        C12611c state = viewState.getMiniArchModal().getState();
                        boolean zM87157i2 = c28655q.m87157i(viewState);
                        i18 = i15 & 7168;
                        if (i18 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i2 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == c28676v0) {
                            final int i25 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: gf1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            return AbstractC15790i.m44546p(viewState, function4);
                                        default:
                                            return AbstractC15790i.m44547q(viewState, function4);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        zM87157i = c28655q.m87157i(viewState) | (i18 == 2048);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            final int i26 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC15790i.m44546p(viewState, function4);
                                        default:
                                            return AbstractC15790i.m44547q(viewState, function4);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(state, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 0);
                        c28655q.m87173q(false);
                        modifier4 = modifier3;
                        str5 = str4;
                        function2 = function4;
                    } else if (viewState.getScreenContent() != null) {
                        c28655q.m87150e0(-1615744393);
                        Function1 function5 = function4;
                        modifier4 = modifier3;
                        str5 = str4;
                        AbstractC15788g.m44523s(modifier4, viewState.getScreenContent(), str5, function5, c28655q, i15 & 8078, 0);
                        function2 = function5;
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        modifier4 = modifier3;
                        str5 = str4;
                        function2 = function4;
                        c28655q.m87150e0(-1615510684);
                        c28655q.m87173q(false);
                    }
                    modifier2 = modifier4;
                    str3 = str5;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                }
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(modifier2, viewState, str3, function3, i13, i14, 3);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i24 != 0) {
                    str4 = "sample-path";
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15449y1(27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (viewState.getMiniArchModal() != null) {
                    c28655q.m87150e0(-1616114440);
                    C12611c state2 = viewState.getMiniArchModal().getState();
                    boolean zM87157i3 = c28655q.m87157i(viewState);
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i3 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        final int i27 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i28 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    zM87157i = c28655q.m87157i(viewState) | (i18 == 2048);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i29 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i210 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(state2, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 0);
                    c28655q.m87173q(false);
                    modifier4 = modifier3;
                    str5 = str4;
                    function2 = function4;
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(-1615744393);
                    Function1 function6 = function4;
                    modifier4 = modifier3;
                    str5 = str4;
                    AbstractC15788g.m44523s(modifier4, viewState.getScreenContent(), str5, function6, c28655q, i15 & 8078, 0);
                    function2 = function6;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    modifier4 = modifier3;
                    str5 = str4;
                    function2 = function4;
                    c28655q.m87150e0(-1615510684);
                    c28655q.m87173q(false);
                }
                modifier2 = modifier4;
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier2, viewState, str3, function3, i13, i14, 3);
            }
        }
        i15 |= 384;
        str2 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i24 != 0) {
                    str4 = "sample-path";
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15449y1(27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (viewState.getMiniArchModal() != null) {
                    c28655q.m87150e0(-1616114440);
                    C12611c state3 = viewState.getMiniArchModal().getState();
                    boolean zM87157i4 = c28655q.m87157i(viewState);
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i4 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        final int i211 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i212 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i212) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    zM87157i = c28655q.m87157i(viewState) | (i18 == 2048);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i213 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i214 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return AbstractC15790i.m44546p(viewState, function4);
                                    default:
                                        return AbstractC15790i.m44547q(viewState, function4);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(state3, interfaceC4339a3, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 0);
                    c28655q.m87173q(false);
                    modifier4 = modifier3;
                    str5 = str4;
                    function2 = function4;
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(-1615744393);
                    Function1 function7 = function4;
                    modifier4 = modifier3;
                    str5 = str4;
                    AbstractC15788g.m44523s(modifier4, viewState.getScreenContent(), str5, function7, c28655q, i15 & 8078, 0);
                    function2 = function7;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    modifier4 = modifier3;
                    str5 = str4;
                    function2 = function4;
                    c28655q.m87150e0(-1615510684);
                    c28655q.m87173q(false);
                }
                modifier2 = modifier4;
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier2, viewState, str3, function3, i13, i14, 3);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i24 != 0) {
                str4 = "sample-path";
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15449y1(27);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            if (viewState.getMiniArchModal() != null) {
                c28655q.m87150e0(-1616114440);
                C12611c state4 = viewState.getMiniArchModal().getState();
                boolean zM87157i5 = c28655q.m87157i(viewState);
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i5 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    final int i215 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: gf1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i215) {
                                case 0:
                                    return AbstractC15790i.m44546p(viewState, function4);
                                default:
                                    return AbstractC15790i.m44547q(viewState, function4);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i216 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: gf1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i216) {
                                case 0:
                                    return AbstractC15790i.m44546p(viewState, function4);
                                default:
                                    return AbstractC15790i.m44547q(viewState, function4);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                zM87157i = c28655q.m87157i(viewState) | (i18 == 2048);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    final int i217 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i217) {
                                case 0:
                                    return AbstractC15790i.m44546p(viewState, function4);
                                default:
                                    return AbstractC15790i.m44547q(viewState, function4);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i218 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: gf1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    return AbstractC15790i.m44546p(viewState, function4);
                                default:
                                    return AbstractC15790i.m44547q(viewState, function4);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC12610b.m35349f(state4, interfaceC4339a4, (InterfaceC4339a) objM87133R2, c28655q, C12611c.f43049g, 0);
                c28655q.m87173q(false);
                modifier4 = modifier3;
                str5 = str4;
                function2 = function4;
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(-1615744393);
                Function1 function8 = function4;
                modifier4 = modifier3;
                str5 = str4;
                AbstractC15788g.m44523s(modifier4, viewState.getScreenContent(), str5, function8, c28655q, i15 & 8078, 0);
                function2 = function8;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                modifier4 = modifier3;
                str5 = str4;
                function2 = function4;
                c28655q.m87150e0(-1615510684);
                c28655q.m87173q(false);
            }
            modifier2 = modifier4;
            str3 = str5;
        } else {
            c28655q.m87138X();
            str3 = str2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier2, viewState, str3, function3, i13, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m44539i(Modifier modifier, C15791j state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1809458134);
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
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C15449y1(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m44541k(interfaceC23462h).getViewState(), state.getViewState(), null, c28655q, 0, 2);
                C13146b c13146bM44541k = m44541k(interfaceC23462h);
                zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(state, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c13146bM44541k);
                C13147c c13147cM44542l = m44542l(interfaceC28601c1M87260n);
                String path = state.getPath();
                zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C4493a(function4, interfaceC23462h, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifier5 = modifier4;
                m44538h(modifier5, c13147cM44542l, path, (Function1) objM87133R3, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                function3 = function4;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 13, modifier3, function3, state);
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
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C15449y1(26);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m44541k(interfaceC23462h).getViewState(), state.getViewState(), null, c28655q, 0, 2);
            C13146b c13146bM44541k2 = m44541k(interfaceC23462h);
            zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(state);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(state, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(state, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c13146bM44541k2);
            C13147c c13147cM44542l2 = m44542l(interfaceC28601c1M87260n2);
            String path2 = state.getPath();
            zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i15 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new C4493a(function4, interfaceC23462h, 2);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C4493a(function4, interfaceC23462h, 2);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifier6 = modifier4;
            m44538h(modifier6, c13147cM44542l2, path2, (Function1) objM87133R3, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            function3 = function4;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 13, modifier3, function3, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m44540j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C13146b m44541k(InterfaceC23462h interfaceC23462h) {
        return (C13146b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final C13147c m44542l(InterfaceC28670t2 interfaceC28670t2) {
        return (C13147c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m44543m(Function1 function1, InterfaceC23462h interfaceC23462h, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m44550t(event, function1, new c(m44541k(interfaceC23462h)), new d(m44541k(interfaceC23462h)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m44544n(Modifier modifier, C15791j c15791j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44539i(modifier, c15791j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m44545o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m44546p(C13147c c13147c, Function1 function1) {
        InterfaceC13145a primaryClickEvent = c13147c.getMiniArchModal().getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m44547q(C13147c c13147c, Function1 function1) {
        InterfaceC13145a secondaryClickEvent = c13147c.getMiniArchModal().getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m44548r(Modifier modifier, C13147c c13147c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44538h(modifier, c13147c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m44550t(Object event, Function1 onViewEvent, Function1 sendViewEvent, Function1 sendAnalytics) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(sendViewEvent, "sendViewEvent");
        AbstractC22676k.m65750j(sendAnalytics, "sendAnalytics");
        if (event instanceof C9598e) {
            onViewEvent.invoke(event);
        } else if (event instanceof InterfaceC13145a.a) {
            sendAnalytics.invoke(event);
        } else if (event instanceof InterfaceC13145a.g) {
            sendViewEvent.invoke(event);
        }
    }
}
