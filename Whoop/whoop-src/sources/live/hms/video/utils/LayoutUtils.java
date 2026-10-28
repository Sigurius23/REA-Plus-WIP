package live.hms.video.utils;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import ge3.AbstractC15751g;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.HMSApiClient;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.signal.init.ErrorTokenResult;
import live.hms.video.signal.init.HMSLayoutListener;
import live.hms.video.signal.init.HMSRoomLayout;
import live.hms.video.signal.init.LayoutRequestOptions;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/utils/LayoutUtils;", "", "<init>", "()V", "", "token", "Llive/hms/video/signal/init/LayoutRequestOptions;", "layoutRequestOptions", "Llive/hms/video/utils/HMSAgentOs;", "agentOs", "Llive/hms/video/signal/init/HMSRoomLayout;", "getLayout", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/init/HMSLayoutListener;", "hmsLayoutConfigListener", "Ll83/a0;", "getLayoutConfigByToken", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;Llive/hms/video/utils/HMSAgentOs;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class LayoutUtils {
    public static final LayoutUtils INSTANCE = new LayoutUtils();

    /* JADX INFO: renamed from: live.hms.video.utils.LayoutUtils$getLayoutConfigByToken$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.utils.LayoutUtils$getLayoutConfigByToken$1", m100430f = "LayoutUtils.kt", m100431l = {25}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243991 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSAgentOs $agentOs;
        final /* synthetic */ HMSLayoutListener $hmsLayoutConfigListener;
        final /* synthetic */ LayoutRequestOptions $layoutRequestOptions;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243991(HMSLayoutListener hMSLayoutListener, String str, LayoutRequestOptions layoutRequestOptions, HMSAgentOs hMSAgentOs, InterfaceC30057d<? super C243991> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsLayoutConfigListener = hMSLayoutListener;
            this.$token = str;
            this.$layoutRequestOptions = layoutRequestOptions;
            this.$agentOs = hMSAgentOs;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C243991(this.$hmsLayoutConfigListener, this.$token, this.$layoutRequestOptions, this.$agentOs, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243991) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0066  */
        /* JADX WARN: Code duplicated, block: B:39:0x0081  */
        /* JADX WARN: Instruction removed from duplicated block: B:39:0x0081, please report this as an issue */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C243991 c243991;
            Throwable th3;
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    LayoutUtils$getLayoutConfigByToken$1$layoutTask$1$1 layoutUtils$getLayoutConfigByToken$1$layoutTask$1$1 = new LayoutUtils$getLayoutConfigByToken$1$layoutTask$1$1(this.$token, this.$layoutRequestOptions, this.$agentOs, null);
                    LayoutUtils$getLayoutConfigByToken$1$layoutTask$1$2 layoutUtils$getLayoutConfigByToken$1$layoutTask$1$2 = new LayoutUtils$getLayoutConfigByToken$1$layoutTask$1$2(null);
                    this.label = 1;
                    c243991 = this;
                    try {
                        obj = ExtensionUtilsKt.withRetry$default(layoutUtils$getLayoutConfigByToken$1$layoutTask$1$1, layoutUtils$getLayoutConfigByToken$1$layoutTask$1$2, null, null, null, 0, c243991, 56, null);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = th;
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c243991 = this;
                    th3 = th;
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    c243991 = this;
                } catch (Throwable th6) {
                    th3 = th6;
                    c243991 = this;
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
            }
            objM107888l = (HMSRoomLayout) obj;
            boolean z4 = objM107888l instanceof C23467m;
            if (!z4) {
                if ((z4 ? null : objM107888l) != null) {
                    HMSLayoutListener hMSLayoutListener = c243991.$hmsLayoutConfigListener;
                    Object obj2 = z4 ? null : objM107888l;
                    AbstractC22676k.m65747g(obj2);
                    hMSLayoutListener.onLayoutSuccess((HMSRoomLayout) obj2);
                } else if (z4) {
                    c243991.$hmsLayoutConfigListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.GET_LAYOUT_CONFIG, "failed to layout confi! " + C23468n.m68037a(objM107888l), null, null, 12, null));
                } else {
                    c243991.$hmsLayoutConfigListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.GET_LAYOUT_CONFIG, "failed to layout confi! " + C23468n.m68037a(objM107888l), null, null, 12, null));
                }
            } else if (z4 || !(C23468n.m68037a(objM107888l) instanceof HMSException)) {
                c243991.$hmsLayoutConfigListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.GET_LAYOUT_CONFIG, "failed to layout confi! " + C23468n.m68037a(objM107888l), null, null, 12, null));
            } else {
                HMSLayoutListener hMSLayoutListener2 = c243991.$hmsLayoutConfigListener;
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                AbstractC22676k.m65748h(thM68037a, "null cannot be cast to non-null type live.hms.video.error.HMSException");
                hMSLayoutListener2.onError((HMSException) thM68037a);
            }
            return C23454a0.f92919a;
        }
    }

    private LayoutUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLayout(String str, LayoutRequestOptions layoutRequestOptions, HMSAgentOs hMSAgentOs, InterfaceC30057d<? super HMSRoomLayout> interfaceC30057d) {
        String strM109860m;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C34850x0 c34850x0M131549e = OkHttpFactory.INSTANCE.getClient().m109898b(HMSApiClient.INSTANCE.makeLayoutRequest$lib_release(str, layoutRequestOptions != null ? layoutRequestOptions.getEndpoint() : null, hMSAgentOs)).m131549e();
        AbstractC34799a1 abstractC34799a1 = c34850x0M131549e.f146778G;
        try {
            boolean z4 = c34850x0M131549e.f146788Q;
            String str2 = "";
            if (z4 && c34850x0M131549e.f146792z == 200) {
                if (abstractC34799a1 != null && (strM109860m = abstractC34799a1.m109860m()) != null) {
                    str2 = strM109860m;
                }
                HMSRoomLayout hMSRoomLayout = (HMSRoomLayout) GsonUtils.INSTANCE.getGson().fromJson(str2, HMSRoomLayout.class);
                AbstractC22676k.m65747g(hMSRoomLayout);
                c3033m.mo8744e(hMSRoomLayout, new Function1() { // from class: live.hms.video.utils.LayoutUtils$getLayout$2$1$1
                    public final void invoke(Throwable it) {
                        AbstractC22676k.m65750j(it, "it");
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C23454a0.f92919a;
                    }
                });
            } else if (z4 || abstractC34799a1 == null) {
                c3033m.resumeWith(AbstractC34132o.m107888l(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.GET_LAYOUT_CONFIG, "An error occurred while fetching the layout config. Please look into logs for more details.", null, null, 12, null)));
            } else {
                Gson gson = GsonUtils.INSTANCE.getGson();
                String strM109860m2 = abstractC34799a1.m109860m();
                if (strM109860m2 == null) {
                    strM109860m2 = "";
                }
                ErrorTokenResult errorTokenResult = (ErrorTokenResult) gson.fromJson(strM109860m2, ErrorTokenResult.class);
                ErrorFactory.APIErrors aPIErrors = ErrorFactory.APIErrors.INSTANCE;
                int i13 = c34850x0M131549e.f146792z;
                ErrorFactory.Action action = ErrorFactory.Action.GET_LAYOUT_CONFIG;
                String errorMessage = errorTokenResult.getErrorMessage();
                c3033m.resumeWith(AbstractC34132o.m107888l(ErrorFactory.APIErrors.HTTPError$default(aPIErrors, i13, action, errorMessage == null ? "" : errorMessage, null, null, 24, null)));
            }
            c34850x0M131549e.close();
            Object objM8773r = c3033m.m8773r();
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return objM8773r;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(c34850x0M131549e, th3);
                throw th4;
            }
        }
    }

    public final void getLayoutConfigByToken(String token, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener hmsLayoutConfigListener, HMSAgentOs agentOs) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(hmsLayoutConfigListener, "hmsLayoutConfigListener");
        AbstractC22676k.m65750j(agentOs, "agentOs");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C243991(hmsLayoutConfigListener, token, layoutRequestOptions, agentOs, null), 3);
    }
}
