package zk2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import go1.C16016a;
import gw1.C16268a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kk2.AbstractC22551d;
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
import p180h0.AbstractC16486z0;
import p181h2.C16617b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import ph1.C29244h;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.C36806f;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40670c0;

/* JADX INFO: renamed from: zk2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lw41/f;", "controller", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lw41/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "iconRes", "contentDescriptionRes", "", "automationTag", "Lkotlin/Function0;", "onClick", "f", "(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40854o {

    /* JADX INFO: renamed from: zk2.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        public static final a f176089w = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m132406b(C34472r change, C16617b c16617b) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46657f = AbstractC16486z0.m46657f(interfaceC34476v, new C16016a(22), new C16268a(27), new C16268a(27), new C40853n(), interfaceC30057d);
            return objM46657f == EnumC31071a.f128113w ? objM46657f : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zk2.o$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.component.TrackSessionMapControlsKt$TrackSessionMapControls$2$1$1$1", m100430f = "TrackSessionMapControls.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176090w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36806f f176091x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36806f c36806f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176091x = c36806f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f176091x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176090w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36806f c36806f = this.f176091x;
                this.f176090w = 1;
                if (c36806f.m117965f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zk2.o$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.component.TrackSessionMapControlsKt$TrackSessionMapControls$2$2$1$1", m100430f = "TrackSessionMapControls.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176092w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36806f f176093x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C36806f c36806f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176093x = c36806f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f176093x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176092w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36806f c36806f = this.f176093x;
                this.f176092w = 1;
                if (c36806f.m117970k(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zk2.o$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.component.TrackSessionMapControlsKt$TrackSessionMapControls$2$3$1$1", m100430f = "TrackSessionMapControls.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36806f f176095x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C36806f c36806f, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176095x = c36806f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f176095x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176094w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36806f c36806f = this.f176095x;
                this.f176094w = 1;
                if (c36806f.m117971l(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: f */
    private static final void m132398f(int i13, int i14, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1946560606);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, i13, EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, false, 504, null), AbstractC8693b.m21273g(i14, c28655q, (i16 >> 3) & 14), AbstractC15676d.m44101d(C2314t.f9131w, str), null, interfaceC4339a, c28655q, ((i16 << 3) & 57344) | C27270o.f109105k, 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(i13, i14, i15, interfaceC4339a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132399g(int i13, int i14, String str, InterfaceC4339a interfaceC4339a, int i15, Composer composer, int i16) {
        m132398f(i13, i14, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m132400h(final C36806f controller, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Object objM87133R;
        C28676v0 c28676v0;
        final InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        boolean z15;
        boolean z16;
        Object objM87133R4;
        boolean zM87157i;
        Object objM87133R5;
        AbstractC22676k.m65750j(controller, "controller");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-334702430);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(controller) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = a.f176089w;
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(modifier3, C23454a0.f92919a, (PointerInputEventHandler) objM87133R2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM108903b);
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
                C38072d c38072d = C38072d.f163053a;
                int location = c38072d.m121951d().getVarious().getLocation();
                int i18 = AbstractC22551d.f88708v;
                boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0);
                i16 = i15 & 14;
                if (i16 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R3 = c28655q.m87133R();
                if (z14 || objM87133R3 == c28676v0) {
                    final int i19 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: zk2.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                                case 1:
                                    return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                                default:
                                    return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                m132398f(location, i18, "track_session_map_recenter_button", (InterfaceC4339a) objM87133R3, c28655q, 384);
                int zoomIn = c38072d.m121951d().getNavigation().getZoomIn();
                int i24 = AbstractC22551d.f88709w;
                boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0);
                if (i16 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i3 | z15;
                objM87133R4 = c28655q.m87133R();
                if (z16 || objM87133R4 == c28676v0) {
                    final int i25 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: zk2.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                                case 1:
                                    return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                                default:
                                    return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                m132398f(zoomIn, i24, "track_session_map_zoom_in_button", (InterfaceC4339a) objM87133R4, c28655q, 384);
                int zoomOut = c38072d.m121951d().getNavigation().getZoomOut();
                int i26 = AbstractC22551d.f88710x;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | (i16 == 4);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i || objM87133R5 == c28676v0) {
                    final int i27 = 2;
                    objM87133R5 = new InterfaceC4339a() { // from class: zk2.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                                case 1:
                                    return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                                default:
                                    return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                m132398f(zoomOut, i26, "track_session_map_zoom_out_button", (InterfaceC4339a) objM87133R5, c28655q, 384);
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40670c0(controller, i13, modifier2, i14, 3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = a.f176089w;
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM108903b2 = AbstractC34452c0.m108903b(modifier3, C23454a0.f92919a, (PointerInputEventHandler) objM87133R2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM108903b2);
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
            C38072d c38072d2 = C38072d.f163053a;
            int location2 = c38072d2.m121951d().getVarious().getLocation();
            int i110 = AbstractC22551d.f88708v;
            boolean zM87157i4 = c28655q.m87157i(interfaceC2994c0);
            i16 = i15 & 14;
            if (i16 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i4 | z13;
            objM87133R3 = c28655q.m87133R();
            if (z14) {
                final int i111 = 0;
                objM87133R3 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i111) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i112 = 0;
                objM87133R3 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i112) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            m132398f(location2, i110, "track_session_map_recenter_button", (InterfaceC4339a) objM87133R3, c28655q, 384);
            int zoomIn2 = c38072d2.m121951d().getNavigation().getZoomIn();
            int i28 = AbstractC22551d.f88709w;
            boolean zM87157i5 = c28655q.m87157i(interfaceC2994c0);
            if (i16 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i5 | z15;
            objM87133R4 = c28655q.m87133R();
            if (z16) {
                final int i29 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i29) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            } else {
                final int i210 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i210) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            m132398f(zoomIn2, i28, "track_session_map_zoom_in_button", (InterfaceC4339a) objM87133R4, c28655q, 384);
            int zoomOut2 = c38072d2.m121951d().getNavigation().getZoomOut();
            int i211 = AbstractC22551d.f88710x;
            zM87157i = c28655q.m87157i(interfaceC2994c0) | (i16 == 4);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                final int i212 = 2;
                objM87133R5 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i212) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            } else {
                final int i213 = 2;
                objM87133R5 = new InterfaceC4339a() { // from class: zk2.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                return AbstractC40854o.m132401i(interfaceC2994c0, controller);
                            case 1:
                                return AbstractC40854o.m132402j(interfaceC2994c0, controller);
                            default:
                                return AbstractC40854o.m132403k(interfaceC2994c0, controller);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            m132398f(zoomOut2, i211, "track_session_map_zoom_out_button", (InterfaceC4339a) objM87133R5, c28655q, 384);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(controller, i13, modifier2, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m132401i(InterfaceC2994c0 interfaceC2994c0, C36806f c36806f) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c36806f, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m132402j(InterfaceC2994c0 interfaceC2994c0, C36806f c36806f) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c36806f, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132403k(InterfaceC2994c0 interfaceC2994c0, C36806f c36806f) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c36806f, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132404l(C36806f c36806f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132400h(c36806f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
