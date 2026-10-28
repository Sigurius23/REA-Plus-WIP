package fr1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.integrations.domain.IntegrationsApi;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import fq2.C14686c;
import g12.AbstractC15225c;
import g12.C15227e;
import gr1.InterfaceC16107n;
import h12.C16614a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28152c1;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12970k1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p114eb.C12999y0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: fr1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001/Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J1\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010A¨\u0006C"}, m65681d2 = {"Lfr1/d;", "", "Leb/u0;", "navHostController", "Leb/a0;", "fragmentNavController", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lbc3/c0;", "applicationScope", "Lg12/e;", "realOAuthFlowPerformer", "Lj02/o0;", "navigator", "Lcom/whoop/integrations/domain/IntegrationsApi;", "integrationsApi", "Ltr2/n;", "logger", "Lh12/a;", "pkceGenerator", "<init>", "(Leb/u0;Leb/a0;Lor2/y;Landroid/app/Activity;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg12/e;Lj02/o0;Lcom/whoop/integrations/domain/IntegrationsApi;Ltr2/n;Lh12/a;)V", "", QueryParams.URL, "j", "(Ljava/lang/String;)V", "Lcom/whoop/navigation/e;", "action", "i", "(Lcom/whoop/navigation/e;)V", "oAuthUri", "provider", "integrationId", "", "isManualRefresh", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lfr1/c;", NotificationCompat.CATEGORY_EVENT, "k", "(Lfr1/c;)V", "a", "Leb/u0;", "b", "Leb/a0;", "c", "Lor2/y;", "d", "Landroid/app/Activity;", "e", "Lkotlin/jvm/functions/Function1;", "f", "Lbc3/c0;", "g", "Lg12/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj02/o0;", "Lcom/whoop/integrations/domain/IntegrationsApi;", "Ltr2/n;", "Lh12/a;", "l", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14715d {

    /* JADX INFO: renamed from: m */
    public static final int f54418m = 8;

    /* JADX INFO: renamed from: n */
    private static final String f54419n = "COACH";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12991u0 navHostController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 onViewEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C15227e realOAuthFlowPerformer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final IntegrationsApi integrationsApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C16614a pkceGenerator;

    /* JADX INFO: renamed from: fr1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.navigation.IntegrationsNavigationRouter$startOAuthConnectedFlow$1", m100430f = "IntegrationsNavigationRouter.kt", m100431l = {132}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54431w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f54433y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f54434z;

        /* JADX INFO: renamed from: fr1.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14715d f54435w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f54436x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f54437y;

            /* JADX INFO: renamed from: fr1.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.integrations.navigation.IntegrationsNavigationRouter$startOAuthConnectedFlow$1$1$1", m100430f = "IntegrationsNavigationRouter.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41600a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f54438w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C14715d f54439x;

                /* JADX INFO: renamed from: fr1.d$b$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.integrations.navigation.IntegrationsNavigationRouter$startOAuthConnectedFlow$1$1$1$1", m100430f = "IntegrationsNavigationRouter.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
                @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
                public static final class C41601a extends AbstractC32275i implements Function1 {

                    /* JADX INFO: renamed from: w */
                    int f54440w;

                    /* JADX INFO: renamed from: x */
                    final /* synthetic */ C14715d f54441x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C41601a(C14715d c14715d, InterfaceC30057d<? super C41601a> interfaceC30057d) {
                        super(1, interfaceC30057d);
                        this.f54441x = c14715d;
                    }

                    @Override // s83.AbstractC32267a
                    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                        return new C41601a(this.f54441x, interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i13 = this.f54440w;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                            return obj;
                        }
                        AbstractC34132o.m107864I(obj);
                        IntegrationsApi integrationsApi = this.f54441x.integrationsApi;
                        this.f54440w = 1;
                        Object objTriggerHealthexSync = integrationsApi.triggerHealthexSync(this);
                        return objTriggerHealthexSync == enumC31071a ? enumC31071a : objTriggerHealthexSync;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                        return ((C41601a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41600a(C14715d c14715d, InterfaceC30057d<? super C41600a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f54439x = c14715d;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41600a(this.f54439x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41600a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f54438w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                        InterfaceC34116n interfaceC34116n = this.f54439x.logger;
                        C41601a c41601a = new C41601a(this.f54439x, null);
                        this.f54438w = 1;
                        if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c41601a, this, 6, null) == enumC31071a) {
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

            public a(C14715d c14715d, String str, boolean z4) {
                this.f54435w = c14715d;
                this.f54436x = str;
                this.f54437y = z4;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC15225c abstractC15225c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.d.f57174a)) {
                    this.f54435w.onViewEvent.invoke(new InterfaceC16107n.j(this.f54436x));
                } else if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.c.f57173a)) {
                    if (AbstractC22676k.m65745e(this.f54436x, "healthex")) {
                        AbstractC3006f0.m8732z(this.f54435w.applicationScope, null, null, new C41600a(this.f54435w, null), 3);
                    }
                    this.f54435w.onViewEvent.invoke(new InterfaceC16107n.k(this.f54436x, this.f54437y));
                } else if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.b.f57172a)) {
                    this.f54435w.onViewEvent.invoke(new InterfaceC16107n.i(this.f54436x));
                } else if (!AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.a.f57171a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54433y = str;
            this.f54434z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14715d.this.new b(this.f54433y, this.f54434z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54431w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1M43295e = C14715d.this.realOAuthFlowPerformer.getResult();
                a aVar = new a(C14715d.this, this.f54433y, this.f54434z);
                this.f54431w = 1;
                if (interfaceC13087t1M43295e.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: fr1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.navigation.IntegrationsNavigationRouter$startOAuthConnectedFlow$2", m100430f = "IntegrationsNavigationRouter.kt", m100431l = {164, 166}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14715d f54442E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f54443F;

        /* JADX INFO: renamed from: w */
        Object f54444w;

        /* JADX INFO: renamed from: x */
        Object f54445x;

        /* JADX INFO: renamed from: y */
        int f54446y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f54447z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C14715d c14715d, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54447z = str;
            this.f54442E = c14715d;
            this.f54443F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f54447z, this.f54442E, this.f54443F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        
            if (r4.mo43291a(r3, r5, r8, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
        
            if (r8.mo43291a(r2, r4, null, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f54446y
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L22
                if (r1 == r2) goto L15
                if (r1 != r3) goto Ld
                goto L1d
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L15:
                java.lang.Object r0 = r7.f54445x
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f54444w
                h12.b r0 = (h12.C16615b) r0
            L1d:
                p505ts.AbstractC34132o.m107864I(r8)
                goto La7
            L22:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.String r8 = r7.f54447z
                java.lang.String r1 = "healthex"
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r1)
                r1 = 0
                if (r8 == 0) goto L94
                fr1.d r8 = r7.f54442E
                h12.a r8 = fr1.C14715d.m42195g(r8)
                h12.b r8 = r8.m47180a()
                java.lang.String r3 = r7.f54443F
                r4 = 0
                java.lang.String r5 = "code_challenge="
                boolean r3 = yb3.AbstractC39414r.m125876U(r3, r5, r4)
                if (r3 == 0) goto L5c
                java.lang.String r3 = r7.f54443F
                java.lang.String r4 = r8.getCodeChallenge()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r5)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                java.lang.String r3 = yb3.AbstractC39421y.m125928M(r3, r5, r4)
                goto L7b
            L5c:
                java.lang.String r3 = r7.f54443F
                android.net.Uri r3 = android.net.Uri.parse(r3)
                android.net.Uri$Builder r3 = r3.buildUpon()
                java.lang.String r4 = "code_challenge"
                java.lang.String r5 = r8.getCodeChallenge()
                android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
                android.net.Uri r3 = r3.build()
                java.lang.String r3 = r3.toString()
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r3)
            L7b:
                fr1.d r4 = r7.f54442E
                g12.e r4 = fr1.C14715d.m42196h(r4)
                java.lang.String r5 = r7.f54447z
                java.lang.String r8 = r8.getCodeVerifier()
                r7.f54444w = r1
                r7.f54445x = r1
                r7.f54446y = r2
                java.lang.Object r8 = r4.mo43291a(r3, r5, r8, r7)
                if (r8 != r0) goto La7
                goto La6
            L94:
                fr1.d r8 = r7.f54442E
                g12.e r8 = fr1.C14715d.m42196h(r8)
                java.lang.String r2 = r7.f54443F
                java.lang.String r4 = r7.f54447z
                r7.f54446y = r3
                java.lang.Object r8 = r8.mo43291a(r2, r4, r1, r7)
                if (r8 != r0) goto La7
            La6:
                return r0
            La7:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fr1.C14715d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14715d(C12991u0 navHostController, AbstractC12939a0 fragmentNavController, C28216y externalLinkNavigator, Activity activity, Function1 onViewEvent, InterfaceC2994c0 applicationScope, C15227e realOAuthFlowPerformer, InterfaceC21159o0 navigator, IntegrationsApi integrationsApi, InterfaceC34116n logger, C16614a pkceGenerator) {
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(realOAuthFlowPerformer, "realOAuthFlowPerformer");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(integrationsApi, "integrationsApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(pkceGenerator, "pkceGenerator");
        this.navHostController = navHostController;
        this.fragmentNavController = fragmentNavController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.onViewEvent = onViewEvent;
        this.applicationScope = applicationScope;
        this.realOAuthFlowPerformer = realOAuthFlowPerformer;
        this.navigator = navigator;
        this.integrationsApi = integrationsApi;
        this.logger = logger;
        this.pkceGenerator = pkceGenerator;
    }

    /* JADX INFO: renamed from: i */
    private final void m42197i(C9598e action) {
        if (!AbstractC22676k.m65745e(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9267a3.f27473w)) {
            this.navigator.mo59392a(action);
            return;
        }
        NavigationScreenModel parameters = action.getParameters();
        IntegrationsScreenModel integrationsScreenModel = parameters instanceof IntegrationsScreenModel ? (IntegrationsScreenModel) parameters : null;
        String integrationId = integrationsScreenModel != null ? integrationsScreenModel.getIntegrationId() : null;
        if (integrationId == null) {
            integrationId = "";
        }
        AbstractC12939a0.m36374y(this.navHostController, "DISCLAIMER", null, 6);
        this.onViewEvent.invoke(new InterfaceC16107n.g(integrationId));
    }

    /* JADX INFO: renamed from: j */
    private final void m42198j(String url) {
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException e5) {
            this.logger.mo85216g("No activity found to handle " + url + ", falling back to the in-app browser: " + e5, new AbstractC30556a.a[0]);
            C28216y.m85414y(this.externalLinkNavigator, this.activity, url, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m42199l(C12999y0 navigate) {
        AbstractC22676k.m65750j(navigate, "$this$navigate");
        navigate.m36510b("DISCOVERY", new C14686c(9));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m42200m(C12970k1 popUpTo) {
        AbstractC22676k.m65750j(popUpTo, "$this$popUpTo");
        popUpTo.f44796a = false;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private final void m42201n(String oAuthUri, String provider, String integrationId, boolean isManualRefresh) {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new b(integrationId, isManualRefresh, null), 3);
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new c(provider, this, oAuthUri, null), 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m42202k(InterfaceC14714c event) {
        C12977n0 c12977n0;
        C12977n0 c12977n1;
        AbstractC22676k.m65750j(event, "event");
        String str = null;
        if (event instanceof InterfaceC14714c.a) {
            C12982q c12982qM36393h = this.navHostController.m36393h();
            if (c12982qM36393h != null && (c12977n1 = c12982qM36393h.f44844x) != null) {
                str = c12977n1.f44820I;
            }
            if (!AbstractC22676k.m65745e(str, "DISCOVERY")) {
                InterfaceC14714c.a aVar = (InterfaceC14714c.a) event;
                if (!AbstractC22676k.m65745e(aVar.getSource(), "TRENDS") && !AbstractC22676k.m65745e(aVar.getSource(), "MCI_ONBOARDING") && !AbstractC22676k.m65745e(aVar.getSource(), f54419n) && !AbstractC22676k.m65745e(aVar.getSource(), "push_notification") && !AbstractC22676k.m65745e(aVar.getSource(), "notification_card") && !AbstractC22676k.m65745e(aVar.getSource(), "health_tab")) {
                    if (AbstractC22676k.m65745e(str, "DISCLAIMER")) {
                        this.navHostController.m36410z();
                        return;
                    } else {
                        this.onViewEvent.invoke(InterfaceC16107n.h.f61108a);
                        this.navHostController.m36410z();
                        return;
                    }
                }
            }
            this.fragmentNavController.m36410z();
            return;
        }
        if (event instanceof InterfaceC14714c.e) {
            C12982q c12982qM36393h2 = this.navHostController.m36393h();
            if (c12982qM36393h2 != null && (c12977n0 = c12982qM36393h2.f44844x) != null) {
                str = c12977n0.f44820I;
            }
            if (AbstractC22676k.m65745e(str, "DETAILS")) {
                return;
            }
            this.navHostController.m36408w("DETAILS", new C14686c(8));
            return;
        }
        if (event instanceof InterfaceC14714c.d) {
            InterfaceC14714c.d dVar = (InterfaceC14714c.d) event;
            if (AbstractC22676k.m65745e(dVar.getSource(), "TRENDS") || AbstractC22676k.m65745e(dVar.getSource(), "MCI_ONBOARDING") || AbstractC22676k.m65745e(dVar.getSource(), f54419n)) {
                this.fragmentNavController.m36410z();
            }
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/settings/integrations/healthConnect"));
            return;
        }
        if (event instanceof InterfaceC14714c.i) {
            this.fragmentNavController.m36403r(Uri.parse("android-app://com.whoop/settings/strava"), AbstractC28152c1.m85184b());
            return;
        }
        if (event instanceof InterfaceC14714c.f) {
            C28216y.m85414y(this.externalLinkNavigator, this.activity, ((InterfaceC14714c.f) event).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), false, 4, null);
            return;
        }
        if (event instanceof InterfaceC14714c.b) {
            C28216y.m85414y(this.externalLinkNavigator, this.activity, ((InterfaceC14714c.b) event).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), false, 4, null);
            return;
        }
        if (event instanceof InterfaceC14714c.c) {
            InterfaceC14714c.c cVar = (InterfaceC14714c.c) event;
            if (AbstractC39421y.m125930O(cVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), "android-app://com.whoop", false)) {
                this.fragmentNavController.m36403r(Uri.parse(cVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()), AbstractC28152c1.m85184b());
                return;
            } else {
                m42198j(cVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
                return;
            }
        }
        if (event instanceof InterfaceC14714c.h) {
            InterfaceC14714c.h hVar = (InterfaceC14714c.h) event;
            m42201n(hVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), hVar.getProvider(), hVar.getIntegrationId(), hVar.getIsManualRefresh());
        } else {
            if (!(event instanceof InterfaceC14714c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            m42197i(((InterfaceC14714c.g) event).getNavigationAction());
        }
    }

    public /* synthetic */ C14715d(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, C28216y c28216y, Activity activity, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15227e c15227e, InterfaceC21159o0 interfaceC21159o0, IntegrationsApi integrationsApi, InterfaceC34116n interfaceC34116n, C16614a c16614a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12991u0, abstractC12939a0, c28216y, activity, function1, interfaceC2994c0, c15227e, interfaceC21159o0, integrationsApi, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IntegrationsNavigationRouter") : interfaceC34116n, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C16614a(null, 1, null) : c16614a);
    }
}
