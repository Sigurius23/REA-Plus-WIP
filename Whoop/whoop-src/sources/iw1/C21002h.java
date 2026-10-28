package iw1;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CheckoutScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ew1.C13722a;
import fw1.AbstractC14835b;
import fw1.C14837d;
import fw1.C14838e;
import fw1.C14840g;
import fw1.EnumC14841h;
import fw1.InterfaceC14836c;
import hw1.AbstractC17702a;
import hw1.C17703b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Map;
import jw1.C21993a;
import jx1.C22032v;
import l83.C23454a0;
import l83.C23465k;
import lw1.C24773i;
import m83.AbstractC25247g0;
import or2.C28180m;
import org.joda.time.DateTimeConstants;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: iw1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bJ-\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002020\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u000e8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106¨\u0006<"}, m65681d2 = {"Liw1/h;", "Landroidx/lifecycle/w1;", "Lfw1/d;", "interactor", "Ljw1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "Lhw1/b;", "navigationRouter", "Lew1/a;", "analytics", "<init>", "(Lfw1/d;Ljw1/a;Lbc3/c0;Lhw1/b;Lew1/a;)V", "Lec3/l;", "Lfw1/b;", "Lfw1/c;", "r", "(Lec3/l;Lfw1/d;)Lec3/l;", "Liw1/g;", "viewEvent", "Ll83/a0;", "t", "(Liw1/g;)V", "Llw1/i;", "option", "q", "(Llw1/i;Lq83/d;)Ljava/lang/Object;", "u", "", "promoCode", "", "isOnTrial", "Lbc3/k1;", "v", "(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lhw1/b;", "y", "Lew1/a;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "E", "Lec3/t1;", "domainState", "Liw1/i;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Lhw1/a;", "G", "p", "navigationEvents", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21002h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17703b navigationRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C13722a analytics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: iw1.h$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.presentation.ExtensionsViewModel$sendViewEvent$1", m100430f = "ExtensionsViewModel.kt", m100431l = {108, 109, 111, 113, 117, 125, 133, 148, 166, DateTimeConstants.HOURS_PER_WEEK, 171, 178, 179, 180, 181, 182, 184, 198, 203, 213, 228}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f79438E;

        /* JADX INFO: renamed from: F */
        int f79439F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC21001g f79441H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f79442I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ Boolean f79443J;

        /* JADX INFO: renamed from: w */
        Object f79444w;

        /* JADX INFO: renamed from: x */
        Object f79445x;

        /* JADX INFO: renamed from: y */
        Object f79446y;

        /* JADX INFO: renamed from: z */
        int f79447z;

        /* JADX INFO: renamed from: iw1.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41803a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f79448a;

            static {
                int[] iArr = new int[CtaAction.values().length];
                try {
                    iArr[CtaAction.RETRY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CtaAction.DISMISS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CtaAction.DISMISS_TO_ROOT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CtaAction.GO_HOME.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CtaAction.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f79448a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21001g interfaceC21001g, String str, Boolean bool, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79441H = interfaceC21001g;
            this.f79442I = str;
            this.f79443J = bool;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21002h.this.new a(this.f79441H, this.f79442I, this.f79443J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:233:0x063b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:234:0x063c A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79439F;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i13) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    C21002h.this.m58545t(this.f79441H);
                    InterfaceC21001g interfaceC21001g = this.f79441H;
                    if (interfaceC21001g instanceof AbstractC21004j.c) {
                        InterfaceC13072o1 interfaceC13072o1 = C21002h.this.eventFlow;
                        AbstractC14835b.e eVar = new AbstractC14835b.e(this.f79442I, this.f79443J);
                        this.f79439F = 1;
                        if (interfaceC13072o1.emit(eVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    if (interfaceC21001g instanceof AbstractC21004j.e) {
                        InterfaceC13072o1 interfaceC13072o2 = C21002h.this.eventFlow;
                        AbstractC14835b.j jVar = new AbstractC14835b.j(((AbstractC21004j.e) this.f79441H).getIndex());
                        this.f79439F = 2;
                        if (interfaceC13072o2.emit(jVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    int i14 = 3;
                    if (interfaceC21001g instanceof AbstractC21004j.d) {
                        InterfaceC13072o1 interfaceC13072o3 = C21002h.this.eventFlow;
                        AbstractC14835b.h hVar = new AbstractC14835b.h(((AbstractC21004j.d) this.f79441H).getOptionState());
                        this.f79439F = 3;
                        if (interfaceC13072o3.emit(hVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    if (interfaceC21001g instanceof AbstractC21004j.a) {
                        InterfaceC13072o1 interfaceC13072o4 = C21002h.this.eventFlow;
                        AbstractC14835b.e eVar2 = new AbstractC14835b.e(this.f79442I, this.f79443J);
                        this.f79439F = 4;
                        if (interfaceC13072o4.emit(eVar2, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    String str = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    Object[] objArr5 = 0;
                    Object[] objArr6 = 0;
                    Object[] objArr7 = 0;
                    Object[] objArr8 = 0;
                    if (interfaceC21001g instanceof AbstractC21004j.b) {
                        Action actionM63001a = ((AbstractC21004j.b) interfaceC21001g).getOptionState().getAction();
                        if (actionM63001a != null) {
                            InterfaceC13072o1 interfaceC13072o5 = C21002h.this.eventFlow;
                            AbstractC14835b.f fVar = new AbstractC14835b.f(actionM63001a, EnumC14841h.REACTIVATION);
                            this.f79444w = null;
                            this.f79447z = 0;
                            this.f79439F = 5;
                            if (interfaceC13072o5.emit(fVar, this) == enumC31071a) {
                                return enumC31071a;
                            }
                            return c23454a0;
                        }
                        C22032v c22032vM58550a = ((AbstractC21004j.b) this.f79441H).getOptionState();
                        if (!(c22032vM58550a.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9313g1)) {
                            C21002h.this.navigationRouter.m50668a(new AbstractC17702a.b(c22032vM58550a.getDestination()));
                            return c23454a0;
                        }
                        NavigationScreenModel parameters = c22032vM58550a.getDestination().getParameters();
                        CheckoutScreenModel checkoutScreenModel = parameters instanceof CheckoutScreenModel ? (CheckoutScreenModel) parameters : null;
                        if (checkoutScreenModel != null) {
                            C21002h c21002h = C21002h.this;
                            if (AbstractC22676k.m65745e(checkoutScreenModel.getSkipConfirmation(), Boolean.TRUE)) {
                                InterfaceC13072o1 interfaceC13072o6 = c21002h.eventFlow;
                                String path = checkoutScreenModel.getPath();
                                String str2 = checkoutScreenModel.getPayload().get("sku");
                                AbstractC14835b.b bVar = new AbstractC14835b.b(path, new CheckoutPayload(str2 != null ? str2 : "", checkoutScreenModel.getPayload().get("promo_code"), checkoutScreenModel.getPayload().get("new_tier")), checkoutScreenModel.getPayload().get("promo_code"), null, 8, null);
                                this.f79444w = null;
                                this.f79445x = null;
                                this.f79446y = null;
                                this.f79447z = 0;
                                this.f79439F = 6;
                                if (interfaceC13072o6.emit(bVar, this) == enumC31071a) {
                                    return enumC31071a;
                                }
                            } else {
                                InterfaceC13072o1 interfaceC13072o7 = c21002h.eventFlow;
                                Map<String, String> payload = checkoutScreenModel.getPayload();
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry<String, String> entry : payload.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    C23465k c23465k = value != null ? new C23465k(key, value) : null;
                                    if (c23465k != null) {
                                        arrayList.add(c23465k);
                                    }
                                }
                                AbstractC14835b.d dVar = new AbstractC14835b.d(AbstractC25247g0.m74000i0(arrayList), checkoutScreenModel.getPath(), checkoutScreenModel.getPayload().get("promo_code"), null, null, null, 56, null);
                                this.f79444w = null;
                                this.f79445x = null;
                                this.f79446y = null;
                                this.f79447z = 0;
                                this.f79439F = 7;
                                if (interfaceC13072o7.emit(dVar, this) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        }
                        return c23454a0;
                    }
                    if (interfaceC21001g instanceof AbstractC20997c.e) {
                        InterfaceC13072o1 interfaceC13072o8 = C21002h.this.eventFlow;
                        AbstractC14835b.c cVar = new AbstractC14835b.c(this.f79442I, this.f79443J);
                        this.f79439F = 8;
                        if (interfaceC13072o8.emit(cVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    if (interfaceC21001g instanceof AbstractC20997c.a) {
                        NavigationScreenModel parameters2 = ((AbstractC20997c.a) interfaceC21001g).getOptionSelected().getDestination().getParameters();
                        if (parameters2 instanceof CheckoutScreenModel) {
                            CheckoutScreenModel checkoutScreenModel2 = (CheckoutScreenModel) parameters2;
                            String str3 = checkoutScreenModel2.getPayload().get("sku");
                            new AbstractC14835b.a(new CheckoutPayload(str3 != null ? str3 : "", checkoutScreenModel2.getPayload().get("promo_code"), checkoutScreenModel2.getPayload().get("new_tier")), checkoutScreenModel2.getPath(), null, null, null, null, 60, null);
                            return c23454a0;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20997c.c) {
                        C21002h c21002h2 = C21002h.this;
                        C24773i c24773iM58523a = ((AbstractC20997c.c) interfaceC21001g).getOptionSelected();
                        this.f79439F = 9;
                        if (c21002h2.m58543q(c24773iM58523a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20997c.d) {
                        C21002h c21002h3 = C21002h.this;
                        C24773i c24773iM58524a = ((AbstractC20997c.d) interfaceC21001g).getOptionSelected();
                        this.f79439F = 10;
                        if (c21002h3.m58546u(c24773iM58524a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20997c.b) {
                        int i15 = C41803a.f79448a[((AbstractC20997c.b) interfaceC21001g).getAction().ordinal()];
                        if (i15 == 1) {
                            InterfaceC13072o1 interfaceC13072o9 = C21002h.this.eventFlow;
                            AbstractC14835b.c cVar2 = new AbstractC14835b.c(this.f79442I, this.f79443J);
                            this.f79439F = 11;
                            if (interfaceC13072o9.emit(cVar2, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        } else {
                            if (i15 == 2) {
                                C21002h.this.navigationRouter.m50668a(AbstractC17702a.a.f68771a);
                                return c23454a0;
                            }
                            if (i15 == 3) {
                                C21002h.this.navigationRouter.m50668a(AbstractC17702a.a.f68771a);
                                return c23454a0;
                            }
                            if (i15 == 4) {
                                C21002h.this.navigationRouter.m50668a(new AbstractC17702a.b(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel(str, (AiAction) (objArr8 == true ? 1 : 0), i14, (DefaultConstructorMarker) (objArr7 == true ? 1 : 0)), null, 4, null)));
                                return c23454a0;
                            }
                            if (i15 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.e) {
                        InterfaceC13072o1 interfaceC13072o10 = C21002h.this.eventFlow;
                        AbstractC14835b.a aVar = new AbstractC14835b.a(((AbstractC20995a.e) this.f79441H).getPayloadV2(), ((AbstractC20995a.e) this.f79441H).getPath(), ((AbstractC20995a.e) this.f79441H).getPromoCode(), null, null, null, 56, null);
                        this.f79439F = 12;
                        if (interfaceC13072o10.emit(aVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.c) {
                        InterfaceC13072o1 interfaceC13072o11 = C21002h.this.eventFlow;
                        AbstractC14835b.c cVar3 = new AbstractC14835b.c(this.f79442I, this.f79443J);
                        this.f79439F = 13;
                        if (interfaceC13072o11.emit(cVar3, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.b) {
                        InterfaceC13072o1 interfaceC13072o12 = C21002h.this.eventFlow;
                        AbstractC14835b.e eVar3 = new AbstractC14835b.e(this.f79442I, this.f79443J);
                        this.f79439F = 14;
                        if (interfaceC13072o12.emit(eVar3, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.g) {
                        InterfaceC13072o1 interfaceC13072o13 = C21002h.this.eventFlow;
                        AbstractC14835b.k kVar = new AbstractC14835b.k(((AbstractC20995a.g) this.f79441H).m58506a());
                        this.f79439F = 15;
                        if (interfaceC13072o13.emit(kVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.f) {
                        InterfaceC13072o1 interfaceC13072o14 = C21002h.this.eventFlow;
                        AbstractC14835b.i iVar = new AbstractC14835b.i(((AbstractC20995a.f) this.f79441H).getCard());
                        this.f79439F = 16;
                        if (interfaceC13072o14.emit(iVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.d) {
                        InterfaceC13072o1 interfaceC13072o15 = C21002h.this.eventFlow;
                        AbstractC14835b.g gVar = new AbstractC14835b.g(((AbstractC20995a.d) this.f79441H).getPayloadV2(), ((AbstractC20995a.d) this.f79441H).getPromoCode(), ((AbstractC20995a.d) this.f79441H).getPaymentOption().getCard(), ((AbstractC20995a.d) this.f79441H).m58497a(), ((AbstractC20995a.d) this.f79441H).getStepPrefetchContent().getPath());
                        this.f79439F = 17;
                        if (interfaceC13072o15.emit(gVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (interfaceC21001g instanceof AbstractC20995a.a) {
                        int i16 = C41803a.f79448a[((AbstractC20995a.a) interfaceC21001g).getAction().ordinal()];
                        if (i16 == 1) {
                            String path2 = ((AbstractC20995a.a) this.f79441H).getViewState().getPath();
                            if (path2 != null) {
                                InterfaceC21001g interfaceC21001g2 = this.f79441H;
                                C21002h c21002h4 = C21002h.this;
                                AbstractC20995a.a aVar2 = (AbstractC20995a.a) interfaceC21001g2;
                                CheckoutPayload checkoutPayloadMo58508b = aVar2.getViewState().getPayloadV2();
                                if (checkoutPayloadMo58508b != null) {
                                    InterfaceC13072o1 interfaceC13072o16 = c21002h4.eventFlow;
                                    AbstractC14835b.a aVar3 = new AbstractC14835b.a(checkoutPayloadMo58508b, path2, aVar2.getViewState().getPromoCode(), null, null, null, 56, null);
                                    this.f79444w = null;
                                    this.f79445x = null;
                                    this.f79447z = 0;
                                    this.f79438E = 0;
                                    this.f79439F = 18;
                                    if (interfaceC13072o16.emit(aVar3, this) == enumC31071a) {
                                        return enumC31071a;
                                    }
                                }
                            }
                        } else if (i16 == 2) {
                            InterfaceC13072o1 interfaceC13072o17 = C21002h.this.eventFlow;
                            AbstractC14835b.c cVar4 = new AbstractC14835b.c(this.f79442I, this.f79443J);
                            this.f79439F = 19;
                            if (interfaceC13072o17.emit(cVar4, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        } else {
                            if (i16 == 3) {
                                C21002h.this.navigationRouter.m50668a(AbstractC17702a.a.f68771a);
                                return c23454a0;
                            }
                            if (i16 == 4) {
                                C21002h.this.navigationRouter.m50668a(new AbstractC17702a.b(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) (objArr6 == true ? 1 : 0), (AiAction) (objArr5 == true ? 1 : 0), i14, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0)), null, 4, null)));
                                return c23454a0;
                            }
                            if (i16 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        if (!(interfaceC21001g instanceof AbstractC20999e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i17 = C41803a.f79448a[((AbstractC20999e.a) interfaceC21001g).getAction().ordinal()];
                        if (i17 == 1) {
                            CheckoutPayload checkoutPayloadMo58532b = ((AbstractC20999e.a) this.f79441H).getViewState().getPayloadV2();
                            if (checkoutPayloadMo58532b != null) {
                                InterfaceC21001g interfaceC21001g3 = this.f79441H;
                                C21002h c21002h5 = C21002h.this;
                                AbstractC20999e.a aVar4 = (AbstractC20999e.a) interfaceC21001g3;
                                String path3 = aVar4.getViewState().getPath();
                                if (path3 != null) {
                                    InterfaceC13072o1 interfaceC13072o18 = c21002h5.eventFlow;
                                    AbstractC14835b.g gVar2 = new AbstractC14835b.g(checkoutPayloadMo58532b, aVar4.getViewState().getPromoCode(), aVar4.getViewState().getCard(), aVar4.getViewState().mo58533c(), path3);
                                    this.f79444w = null;
                                    this.f79445x = null;
                                    this.f79447z = 0;
                                    this.f79438E = 0;
                                    this.f79439F = 20;
                                    if (interfaceC13072o18.emit(gVar2, this) == enumC31071a) {
                                        return enumC31071a;
                                    }
                                }
                            }
                        } else if (i17 == 2) {
                            CheckoutPayload checkoutPayloadMo58532b2 = ((AbstractC20999e.a) this.f79441H).getViewState().getPayloadV2();
                            if (checkoutPayloadMo58532b2 != null) {
                                InterfaceC21001g interfaceC21001g4 = this.f79441H;
                                C21002h c21002h6 = C21002h.this;
                                AbstractC20999e.a aVar5 = (AbstractC20999e.a) interfaceC21001g4;
                                String path4 = aVar5.getViewState().getPath();
                                if (path4 != null) {
                                    InterfaceC13072o1 interfaceC13072o19 = c21002h6.eventFlow;
                                    AbstractC14835b.a aVar6 = new AbstractC14835b.a(checkoutPayloadMo58532b2, path4, aVar5.getViewState().getPromoCode(), aVar5.getViewState().getCard(), aVar5.getViewState().mo58533c(), null, 32, null);
                                    this.f79444w = null;
                                    this.f79445x = null;
                                    this.f79447z = 0;
                                    this.f79438E = 0;
                                    this.f79439F = 21;
                                    if (interfaceC13072o19.emit(aVar6, this) == enumC31071a) {
                                        return enumC31071a;
                                    }
                                }
                            }
                        } else {
                            if (i17 == 3) {
                                C21002h.this.navigationRouter.m50668a(AbstractC17702a.a.f68771a);
                                return c23454a0;
                            }
                            if (i17 == 4) {
                                C21002h.this.navigationRouter.m50668a(new AbstractC17702a.b(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) (objArr3 == true ? 1 : 0), (AiAction) (objArr2 == true ? 1 : 0), i14, (DefaultConstructorMarker) (objArr == true ? 1 : 0)), null, 4, null)));
                                return c23454a0;
                            }
                            if (i17 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    return c23454a0;
                case 1:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 2:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 3:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 4:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 5:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 6:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 7:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 8:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 9:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 10:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 11:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 12:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 13:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 14:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 15:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 16:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 20:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 21:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: iw1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21993a f79450x;

        /* JADX INFO: renamed from: iw1.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79451w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21993a f79452x;

            /* JADX INFO: renamed from: iw1.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.presentation.ExtensionsViewModel$special$$inlined$map$1$2", m100430f = "ExtensionsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41804a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79453E;

                /* JADX INFO: renamed from: F */
                Object f79454F;

                /* JADX INFO: renamed from: G */
                Object f79455G;

                /* JADX INFO: renamed from: H */
                int f79456H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79457w;

                /* JADX INFO: renamed from: x */
                int f79458x;

                /* JADX INFO: renamed from: y */
                Object f79459y;

                public C41804a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79457w = obj;
                    this.f79458x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21993a c21993a) {
                this.f79451w = interfaceC13062m;
                this.f79452x = c21993a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41804a c41804a;
                if (interfaceC30057d instanceof C41804a) {
                    c41804a = (C41804a) interfaceC30057d;
                    int i13 = c41804a.f79458x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41804a.f79458x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41804a = new C41804a(interfaceC30057d);
                    }
                } else {
                    c41804a = new C41804a(interfaceC30057d);
                }
                Object obj2 = c41804a.f79457w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41804a.f79458x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79451w;
                    InterfaceC21003i interfaceC21003iM62846d = this.f79452x.m62846d((InterfaceC14836c) obj);
                    c41804a.f79459y = null;
                    c41804a.f79453E = null;
                    c41804a.f79454F = null;
                    c41804a.f79455G = null;
                    c41804a.f79456H = 0;
                    c41804a.f79458x = 1;
                    if (interfaceC13062m.emit(interfaceC21003iM62846d, c41804a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C21993a c21993a) {
            this.f79449w = interfaceC13058l;
            this.f79450x = c21993a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79449w.collect(new a(interfaceC13062m, this.f79450x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iw1.h$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79461w;

        /* JADX INFO: renamed from: iw1.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79462w;

            /* JADX INFO: renamed from: iw1.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.presentation.ExtensionsViewModel$special$$inlined$map$2$2", m100430f = "ExtensionsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41805a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79463E;

                /* JADX INFO: renamed from: F */
                Object f79464F;

                /* JADX INFO: renamed from: G */
                Object f79465G;

                /* JADX INFO: renamed from: H */
                int f79466H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79467w;

                /* JADX INFO: renamed from: x */
                int f79468x;

                /* JADX INFO: renamed from: y */
                Object f79469y;

                public C41805a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79467w = obj;
                    this.f79468x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f79462w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41805a c41805a;
                if (interfaceC30057d instanceof C41805a) {
                    c41805a = (C41805a) interfaceC30057d;
                    int i13 = c41805a.f79468x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41805a.f79468x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41805a = new C41805a(interfaceC30057d);
                    }
                } else {
                    c41805a = new C41805a(interfaceC30057d);
                }
                Object obj2 = c41805a.f79467w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41805a.f79468x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79462w;
                    AbstractC17702a.b bVar = new AbstractC17702a.b((C9598e) obj);
                    c41805a.f79469y = null;
                    c41805a.f79463E = null;
                    c41805a.f79464F = null;
                    c41805a.f79465G = null;
                    c41805a.f79466H = 0;
                    c41805a.f79468x = 1;
                    if (interfaceC13062m.emit(bVar, c41805a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f79461w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79461w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iw1.h$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79471w;

        /* JADX INFO: renamed from: iw1.h$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79472w;

            /* JADX INFO: renamed from: iw1.h$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.presentation.ExtensionsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "ExtensionsViewModel.kt", m100431l = {56}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41806a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79473E;

                /* JADX INFO: renamed from: F */
                Object f79474F;

                /* JADX INFO: renamed from: G */
                Object f79475G;

                /* JADX INFO: renamed from: H */
                Object f79476H;

                /* JADX INFO: renamed from: I */
                int f79477I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79478w;

                /* JADX INFO: renamed from: x */
                int f79479x;

                /* JADX INFO: renamed from: y */
                Object f79480y;

                public C41806a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79478w = obj;
                    this.f79479x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f79472w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41806a c41806a;
                C9598e c9598eM42709f;
                if (interfaceC30057d instanceof C41806a) {
                    c41806a = (C41806a) interfaceC30057d;
                    int i13 = c41806a.f79479x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41806a.f79479x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41806a = new C41806a(interfaceC30057d);
                    }
                } else {
                    c41806a = new C41806a(interfaceC30057d);
                }
                Object obj2 = c41806a.f79478w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41806a.f79479x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79472w;
                    InterfaceC14836c interfaceC14836c = (InterfaceC14836c) obj;
                    if (interfaceC14836c instanceof C14838e) {
                        c9598eM42709f = ((C14838e) interfaceC14836c).getNavigateTo();
                    } else {
                        c9598eM42709f = interfaceC14836c instanceof C14840g ? ((C14840g) interfaceC14836c).getNavigateTo() : null;
                    }
                    if (c9598eM42709f != null) {
                        c41806a.f79480y = null;
                        c41806a.f79473E = null;
                        c41806a.f79474F = null;
                        c41806a.f79475G = null;
                        c41806a.f79476H = null;
                        c41806a.f79477I = 0;
                        c41806a.f79479x = 1;
                        if (interfaceC13062m.emit(c9598eM42709f, c41806a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f79471w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79471w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21002h(C14837d interactor, C21993a reducer, InterfaceC2994c0 coroutineScope, C17703b navigationRouter, C13722a analytics) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.coroutineScope = coroutineScope;
        this.navigationRouter = navigationRouter;
        this.analytics = analytics;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM58544r = m58544r(c13096w1M36592b, interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM58544r, coroutineScope, c13021b2, 0);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new b(c13078q1M36586L, reducer), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new c(new d(c13078q1M36586L)), coroutineScope, c13021b2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final Object m58543q(C24773i c24773i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Action action = c24773i.getAction();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (action != null) {
            Object objEmit = this.eventFlow.emit(new AbstractC14835b.f(c24773i.getAction(), null, 2, 0 == true ? 1 : 0), interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : c23454a0;
        }
        Object objM58546u = m58546u(c24773i, interfaceC30057d);
        return objM58546u == EnumC31071a.f128113w ? objM58546u : c23454a0;
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC13058l m58544r(InterfaceC13058l interfaceC13058l, C14837d c14837d) {
        return c14837d.m42689v(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m58545t(InterfaceC21001g viewEvent) {
        if (viewEvent instanceof AbstractC20997c.a) {
            this.analytics.m38889p(((AbstractC20997c.a) viewEvent).getOptionSelected().getTrackingLabel());
            return;
        }
        if (viewEvent instanceof AbstractC20997c.c) {
            C24773i c24773iM58523a = ((AbstractC20997c.c) viewEvent).getOptionSelected();
            if (c24773iM58523a.getSecondaryCtaTitle() == null) {
                this.analytics.m38884i(c24773iM58523a.getTrackingLabel());
                return;
            } else {
                this.analytics.m38882b(c24773iM58523a.getTrackingLabel());
                return;
            }
        }
        if (viewEvent instanceof AbstractC20997c.d) {
            this.analytics.m38883c(((AbstractC20997c.d) viewEvent).getOptionSelected().getTrackingLabel());
        } else if (viewEvent instanceof AbstractC20995a.d) {
            AbstractC20995a.d dVar = (AbstractC20995a.d) viewEvent;
            this.analytics.m38885j(dVar.getPayloadV2().getSku(), dVar.getPaymentOption());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final Object m58546u(C24773i c24773i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C9598e destination = c24773i.getDestination();
        NavigationScreenModel parameters = destination.getParameters();
        boolean z4 = parameters instanceof CheckoutScreenModel;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            this.navigationRouter.m50668a(new AbstractC17702a.b(destination));
            return c23454a0;
        }
        CheckoutScreenModel checkoutScreenModel = (CheckoutScreenModel) parameters;
        String str = checkoutScreenModel.getPayload().get("sku");
        if (str == null) {
            str = "";
        }
        CheckoutPayload checkoutPayload = new CheckoutPayload(str, checkoutScreenModel.getPayload().get("promo_code"), checkoutScreenModel.getPayload().get("new_tier"));
        if (AbstractC22676k.m65745e(checkoutScreenModel.getSkipConfirmation(), Boolean.TRUE)) {
            Object objEmit = this.eventFlow.emit(new AbstractC14835b.b(checkoutScreenModel.getPath(), checkoutPayload, checkoutPayload.getPromoCode(), null, 8, null), interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : c23454a0;
        }
        Object objEmit2 = this.eventFlow.emit(new AbstractC14835b.a(checkoutPayload, checkoutScreenModel.getPath(), checkoutPayload.getPromoCode(), null, null, null, 56, null), interfaceC30057d);
        return objEmit2 == EnumC31071a.f128113w ? objEmit2 : c23454a0;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ InterfaceC3027k1 m58547w(C21002h c21002h, InterfaceC21001g interfaceC21001g, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            bool = null;
        }
        return c21002h.m58549v(interfaceC21001g, str, bool);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC3027k1 m58549v(InterfaceC21001g viewEvent, String promoCode, Boolean isOnTrial) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, promoCode, isOnTrial, null), 3);
    }

    public /* synthetic */ C21002h(C14837d c14837d, C21993a c21993a, InterfaceC2994c0 interfaceC2994c0, C17703b c17703b, C13722a c13722a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14837d, c21993a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c17703b, c13722a);
    }
}
