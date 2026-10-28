package com.whoop.widget.network;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.widget.api.StressWidgetApi;
import com.whoop.widget.api.WidgetApi;
import com.whoop.widget.model.HealthspanWidgetModel;
import com.whoop.widget.model.WidgetStressResponse;
import com.whoop.widget.p071ui.healthspan.C10920a;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetLockedContentViewState;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState;
import g93.AbstractC15612d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import l03.C23058h;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n03.C26100k;
import of3.InterfaceC27903a;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p335n6.InterfaceC26395l;
import p395p6.C28901n0;
import p481s6.AbstractC32229a;
import p505ts.AbstractC34132o;
import p639y6.InterfaceC39255g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import va3.AbstractC35854l;
import vf3.C35953c;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tH\u0082@¢\u0006\u0004\b#\u0010\u000bJ\u0010\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b&\u00103R\u001b\u00108\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b:\u0010;R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b(\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u0010E¨\u0006G"}, m65681d2 = {"Lcom/whoop/widget/network/WidgetRefreshWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ll83/a0;", "D", "(Lq83/d;)Ljava/lang/Object;", "H", "()V", "G", "F", "E", "Lcom/whoop/widget/model/HealthspanWidgetModel;", "response", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "B", "(Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;", "", QueryParams.URL, "Lbc3/i0;", "", "t", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "u", "()Ljava/lang/Integer;", "Lf6/a;", "preferences", "s", "(Lf6/a;)V", "C", "Lic/u;", "j", "y", "Landroid/content/Context;", "z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/widget/api/WidgetApi;", "Ll83/h;", "v", "()Lcom/whoop/widget/api/WidgetApi;", "api", "Lcom/whoop/widget/api/StressWidgetApi;", "()Lcom/whoop/widget/api/StressWidgetApi;", "stressApi", "Ltd1/b;", "A", "()Ltd1/b;", "whoopStrapProxy", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ly6/g;", "Lf6/f;", "I", "()Ly6/g;", "stressStateDefinition", "Lcom/whoop/widget/ui/healthspan/a;", "J", "x", "()Lcom/whoop/widget/ui/healthspan/a;", "healthspanWidgetStateWriter", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WidgetRefreshWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h api;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h stressApi;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapProxy;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h stressStateDefinition;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h healthspanWidgetStateWriter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$createHealthspanByteArrayFrom$2", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lbc3/i0;", "", "<anonymous>", "(Lbc3/c0;)Lbc3/i0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10896a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33608w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f33609x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33610y;

        /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$a$a */
        @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$createHealthspanByteArrayFrom$2$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)[B"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f33611w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f33612x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f33612x = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f33612x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super byte[]> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws IOException {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f33611w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InputStream inputStreamOpenStream = new URL(this.f33612x).openStream();
                try {
                    AbstractC22676k.m65747g(inputStreamOpenStream);
                    byte[] bArrM100100g = AbstractC32145e0.m100100g(inputStreamOpenStream);
                    AbstractC35854l.m113829i(inputStreamOpenStream, null);
                    return bArrM100100g;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(inputStreamOpenStream, th3);
                        throw th4;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10896a(String str, InterfaceC30057d<? super C10896a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33610y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10896a c10896a = new C10896a(this.f33610y, interfaceC30057d);
            c10896a.f33609x = obj;
            return c10896a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC3018i0> interfaceC30057d) {
            return ((C10896a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f33609x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33608w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return AbstractC3006f0.m8711e(interfaceC2994c0, null, new a(this.f33610y, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {199, 199}, m100432m = "healthspanViewStateFrom", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10897b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f33613E;

        /* JADX INFO: renamed from: w */
        Object f33614w;

        /* JADX INFO: renamed from: x */
        Object f33615x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f33616y;

        public C10897b(InterfaceC30057d<? super C10897b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33616y = obj;
            this.f33613E |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.m28941B(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {243, 244, 245, 254, 255, 261, 262, 267, 268, 273, 274, 279, 280, 288, 289, 290, 291, 292}, m100432m = "refreshApiAndUpdateWidgets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10898c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33618E;

        /* JADX INFO: renamed from: F */
        Object f33619F;

        /* JADX INFO: renamed from: G */
        Object f33620G;

        /* JADX INFO: renamed from: H */
        Object f33621H;

        /* JADX INFO: renamed from: I */
        Object f33622I;

        /* JADX INFO: renamed from: J */
        Object f33623J;

        /* JADX INFO: renamed from: K */
        Object f33624K;

        /* JADX INFO: renamed from: L */
        float f33625L;

        /* JADX INFO: renamed from: M */
        int f33626M;

        /* JADX INFO: renamed from: N */
        int f33627N;

        /* JADX INFO: renamed from: O */
        int f33628O;

        /* JADX INFO: renamed from: P */
        /* synthetic */ Object f33629P;

        /* JADX INFO: renamed from: R */
        int f33631R;

        /* JADX INFO: renamed from: w */
        Object f33632w;

        /* JADX INFO: renamed from: x */
        Object f33633x;

        /* JADX INFO: renamed from: y */
        Object f33634y;

        /* JADX INFO: renamed from: z */
        Object f33635z;

        public C10898c(InterfaceC30057d<? super C10898c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33629P = obj;
            this.f33631R |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.m28942C(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$refreshApiAndUpdateWidgets$2$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10899d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33636w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33637x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f33638y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f33639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10899d(float f13, boolean z4, InterfaceC30057d<? super C10899d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33638y = f13;
            this.f33639z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10899d c10899d = new C10899d(this.f33638y, this.f33639z, interfaceC30057d);
            c10899d.f33637x = obj;
            return c10899d;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10899d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33637x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33636w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44471x = AbstractC15751g.m44471x("WIDGET_KEY_RECOVERY_PERCENT");
            Float f13 = new Float(this.f33638y);
            c14129a.getClass();
            c14129a.m40231h(c14132dM44471x, f13);
            c14129a.m40231h(AbstractC15751g.m44453f("WIDGET_KEY_IS_CALIBRATING"), Boolean.valueOf(this.f33639z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$refreshApiAndUpdateWidgets$3$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10900e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33640w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33641x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33642y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10900e(String str, InterfaceC30057d<? super C10900e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33642y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10900e c10900e = new C10900e(this.f33642y, interfaceC30057d);
            c10900e.f33641x = obj;
            return c10900e;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10900e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33641x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33640w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_SLEEP_PERCENT");
            String str = this.f33642y;
            c14129a.getClass();
            c14129a.m40231h(c14132dM44441U, str);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$refreshApiAndUpdateWidgets$4$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10901f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33643w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33644x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10901f(String str, InterfaceC30057d<? super C10901f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33645y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10901f c10901f = new C10901f(this.f33645y, interfaceC30057d);
            c10901f.f33644x = obj;
            return c10901f;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10901f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33644x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33643w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_STRAIN_PERCENT");
            String str = this.f33645y;
            c14129a.getClass();
            c14129a.m40231h(c14132dM44441U, str);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$refreshApiAndUpdateWidgets$5$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10902g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33646w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33647x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33648y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10902g(String str, InterfaceC30057d<? super C10902g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33648y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10902g c10902g = new C10902g(this.f33648y, interfaceC30057d);
            c10902g.f33647x = obj;
            return c10902g;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10902g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33647x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33646w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_STEPS_COUNT");
            String str = this.f33648y;
            c14129a.getClass();
            c14129a.m40231h(c14132dM44441U, str);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$refreshApiAndUpdateWidgets$6$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10903h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f33649E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f33650F;

        /* JADX INFO: renamed from: w */
        int f33651w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33652x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f33653y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f33654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10903h(float f13, String str, String str2, boolean z4, InterfaceC30057d<? super C10903h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33653y = f13;
            this.f33654z = str;
            this.f33649E = str2;
            this.f33650F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10903h c10903h = new C10903h(this.f33653y, this.f33654z, this.f33649E, this.f33650F, interfaceC30057d);
            c10903h.f33652x = obj;
            return c10903h;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10903h) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33652x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33651w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44471x = AbstractC15751g.m44471x("WIDGET_KEY_RECOVERY_PERCENT");
            Float f13 = new Float(this.f33653y);
            c14129a.getClass();
            c14129a.m40231h(c14132dM44471x, f13);
            c14129a.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_SLEEP_PERCENT"), this.f33654z);
            c14129a.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_STRAIN_PERCENT"), this.f33649E);
            c14129a.m40231h(AbstractC15751g.m44453f("WIDGET_KEY_IS_CALIBRATING"), Boolean.valueOf(this.f33650F));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10904i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33655w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33656x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33657y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10904i(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33655w = interfaceC27903a;
            this.f33656x = interfaceC35951a;
            this.f33657y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.widget.api.WidgetApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final WidgetApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f33655w;
            InterfaceC35951a interfaceC35951a = this.f33656x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33657y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WidgetApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10905j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33658w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33659x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33660y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10905j(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33658w = interfaceC27903a;
            this.f33659x = interfaceC35951a;
            this.f33660y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.widget.api.StressWidgetApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final StressWidgetApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f33658w;
            InterfaceC35951a interfaceC35951a = this.f33659x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33660y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(StressWidgetApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$k */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10906k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33661w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33662x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33663y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10906k(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33661w = interfaceC27903a;
            this.f33662x = interfaceC35951a;
            this.f33663y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, td1.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC33704b invoke() {
            InterfaceC27903a interfaceC27903a = this.f33661w;
            InterfaceC35951a interfaceC35951a = this.f33662x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33663y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33704b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$l */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10907l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33664w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33665x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33666y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10907l(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33664w = interfaceC27903a;
            this.f33665x = interfaceC35951a;
            this.f33666y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f33664w;
            InterfaceC35951a interfaceC35951a = this.f33665x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33666y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$m */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10908m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33667w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33668x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10908m(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33667w = interfaceC27903a;
            this.f33668x = interfaceC35951a;
            this.f33669y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y6.g] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39255g invoke() {
            InterfaceC27903a interfaceC27903a = this.f33667w;
            InterfaceC35951a interfaceC35951a = this.f33668x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33669y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39255g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$n */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10909n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33670w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33671x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33672y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10909n(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33670w = interfaceC27903a;
            this.f33671x = interfaceC35951a;
            this.f33672y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.widget.ui.healthspan.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10920a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33670w;
            InterfaceC35951a interfaceC35951a = this.f33671x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33672y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10920a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {101, 102, 105, 108}, m100432m = "updateBatteryStatusForFlatPreferenceWidgets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10910o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33673E;

        /* JADX INFO: renamed from: F */
        int f33674F;

        /* JADX INFO: renamed from: G */
        int f33675G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f33676H;

        /* JADX INFO: renamed from: J */
        int f33678J;

        /* JADX INFO: renamed from: w */
        Object f33679w;

        /* JADX INFO: renamed from: x */
        Object f33680x;

        /* JADX INFO: renamed from: y */
        Object f33681y;

        /* JADX INFO: renamed from: z */
        Object f33682z;

        public C10910o(InterfaceC30057d<? super C10910o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33676H = obj;
            this.f33678J |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.m28943D(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$updateBatteryStatusForFlatPreferenceWidgets$2$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10911p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33683w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33684x;

        public C10911p(InterfaceC30057d<? super C10911p> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10911p c10911p = WidgetRefreshWorker.this.new C10911p(interfaceC30057d);
            c10911p.f33684x = obj;
            return c10911p;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10911p) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33684x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33683w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            WidgetRefreshWorker.this.m28956s(c14129a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {176, 179, 183, 188, 188, 190}, m100432m = "updateHealthspanWidget", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10912q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f33686E;

        /* JADX INFO: renamed from: w */
        Object f33687w;

        /* JADX INFO: renamed from: x */
        Object f33688x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f33689y;

        public C10912q(InterfaceC30057d<? super C10912q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33689y = obj;
            this.f33686E |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.m28944E(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$r */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$updateHealthspanWidget$response$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/widget/model/HealthspanWidgetModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10913r extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f33691w;

        public C10913r(InterfaceC30057d<? super C10913r> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return WidgetRefreshWorker.this.new C10913r(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33691w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WidgetApi widgetApiM28959v = WidgetRefreshWorker.this.m28959v();
            this.f33691w = 1;
            Object healthspanWidgetInfo = widgetApiM28959v.getHealthspanWidgetInfo(this);
            return healthspanWidgetInfo == enumC31071a ? enumC31071a : healthspanWidgetInfo;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HealthspanWidgetModel> interfaceC30057d) {
            return ((C10913r) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$s */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {128, 132, 136, 142, 156}, m100432m = "updateStressWidget", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10914s extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33693E;

        /* JADX INFO: renamed from: F */
        Object f33694F;

        /* JADX INFO: renamed from: G */
        int f33695G;

        /* JADX INFO: renamed from: H */
        int f33696H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f33697I;

        /* JADX INFO: renamed from: K */
        int f33699K;

        /* JADX INFO: renamed from: w */
        Object f33700w;

        /* JADX INFO: renamed from: x */
        Object f33701x;

        /* JADX INFO: renamed from: y */
        Object f33702y;

        /* JADX INFO: renamed from: z */
        Object f33703z;

        public C10914s(InterfaceC30057d<? super C10914s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33697I = obj;
            this.f33699K |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.m28946G(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$t */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$updateStressWidget$2$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lf6/f;", "preferences", "<anonymous>", "(Lf6/f;)Lf6/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10915t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33704w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33705x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WidgetStressResponse f33706y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10915t(WidgetStressResponse widgetStressResponse, InterfaceC30057d<? super C10915t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33706y = widgetStressResponse;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10915t c10915t = new C10915t(this.f33706y, interfaceC30057d);
            c10915t.f33705x = obj;
            return c10915t;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC14134f abstractC14134f, InterfaceC30057d<? super AbstractC14134f> interfaceC30057d) {
            return ((C10915t) create(abstractC14134f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC14134f abstractC14134f = (AbstractC14134f) this.f33705x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33704w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14129a c14129aM40233c = abstractC14134f.m40233c();
            WidgetStressResponse widgetStressResponse = this.f33706y;
            c14129aM40233c.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_SCORE"), widgetStressResponse.getValueDisplay());
            c14129aM40233c.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_STATE"), widgetStressResponse.getState().name());
            if (widgetStressResponse.getBucketDisplay() != null) {
                c14129aM40233c.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_BUCKET"), widgetStressResponse.getBucketDisplay());
                return c14129aM40233c;
            }
            c14129aM40233c.m40229f(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_BUCKET"));
            return c14129aM40233c;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$u */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker$updateStressWidget$stress$1", m100430f = "WidgetRefreshWorker.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/widget/model/WidgetStressResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10916u extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f33707w;

        public C10916u(InterfaceC30057d<? super C10916u> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return WidgetRefreshWorker.this.new C10916u(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33707w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StressWidgetApi stressWidgetApiM28962y = WidgetRefreshWorker.this.m28962y();
            this.f33707w = 1;
            Object stressWidget = stressWidgetApiM28962y.getStressWidget(this);
            return stressWidget == enumC31071a ? enumC31071a : stressWidget;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WidgetStressResponse> interfaceC30057d) {
            return ((C10916u) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.network.WidgetRefreshWorker$v */
    @InterfaceC32271e(m100429c = "com.whoop.widget.network.WidgetRefreshWorker", m100430f = "WidgetRefreshWorker.kt", m100431l = {79, 80, 82, 83, 84, 85, 86, 89, 92}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10917v extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f33709E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f33710F;

        /* JADX INFO: renamed from: H */
        int f33712H;

        /* JADX INFO: renamed from: w */
        int f33713w;

        /* JADX INFO: renamed from: x */
        int f33714x;

        /* JADX INFO: renamed from: y */
        int f33715y;

        /* JADX INFO: renamed from: z */
        int f33716z;

        public C10917v(InterfaceC30057d<? super C10917v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33710F = obj;
            this.f33712H |= Integer.MIN_VALUE;
            return WidgetRefreshWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.context = context;
        this.uniqueWorkName = "WIDGET_REFRESH_WORKER";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.api = AbstractC30060g.m92087G(enumC23463i, new C10904i(this, null, null));
        this.stressApi = AbstractC30060g.m92087G(enumC23463i, new C10905j(this, null, null));
        this.whoopStrapProxy = AbstractC30060g.m92087G(enumC23463i, new C10906k(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10907l(this, null, null));
        this.stressStateDefinition = AbstractC30060g.m92087G(enumC23463i, new C10908m(this, new C35953c("STRESS_WIDGET_STATE_DEFINITION"), null));
        this.healthspanWidgetStateWriter = AbstractC30060g.m92087G(enumC23463i, new C10909n(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC33704b m28940A() {
        return (InterfaceC33704b) this.whoopStrapProxy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: B */
    public final Object m28941B(HealthspanWidgetModel healthspanWidgetModel, InterfaceC30057d<? super HealthspanWidgetViewState> interfaceC30057d) {
        C10897b c10897b;
        Integer num;
        HealthspanWidgetModel healthspanWidgetModel2;
        Integer num2;
        HealthspanWidgetModel healthspanWidgetModel3;
        if (interfaceC30057d instanceof C10897b) {
            c10897b = (C10897b) interfaceC30057d;
            int i13 = c10897b.f33613E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10897b.f33613E = i13 - Integer.MIN_VALUE;
            } else {
                c10897b = new C10897b(interfaceC30057d);
            }
        } else {
            c10897b = new C10897b(interfaceC30057d);
        }
        Object objAwait = c10897b.f33616y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c10897b.f33613E;
        if (i14 != 0) {
            if (i14 == 1) {
                num = (Integer) c10897b.f33615x;
                healthspanWidgetModel2 = (HealthspanWidgetModel) c10897b.f33614w;
                AbstractC34132o.m107864I(objAwait);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Integer num3 = (Integer) c10897b.f33615x;
                healthspanWidgetModel3 = (HealthspanWidgetModel) c10897b.f33614w;
                AbstractC34132o.m107864I(objAwait);
                num2 = num3;
            }
            return new HealthspanWidgetViewState((Long) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, new HealthspanWidgetLockedContentViewState((byte[]) objAwait, healthspanWidgetModel3.getLockedContent().getHeaderTextDisplay(), healthspanWidgetModel3.getLockedContent().getDescriptionDisplay()), true, num2, 63, (DefaultConstructorMarker) null);
        }
        AbstractC34132o.m107864I(objAwait);
        Integer numM28958u = m28958u();
        if (healthspanWidgetModel.getLockedContent() == null) {
            return healthspanWidgetModel.getAmoeba() == null ? new HealthspanWidgetViewState((Long) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, (HealthspanWidgetLockedContentViewState) null, false, numM28958u, 127, (DefaultConstructorMarker) null) : new HealthspanWidgetViewState(new Long(AbstractC15612d.f58613x.mo43930i().nextLong()), new Float((float) healthspanWidgetModel.getAmoeba().getStyleValues().getPaceOfAgingAnimationScore()), new Float((float) healthspanWidgetModel.getAmoeba().getStyleValues().getYearsDifferenceAnimationScore()), String.valueOf(healthspanWidgetModel.getAmoeba().getStyleValues().getAge()), healthspanWidgetModel.getAmoeba().getAgeSubtitleDisplay(), healthspanWidgetModel.getAmoeba().getAgeSubtitleStyle(), (HealthspanWidgetLockedContentViewState) null, false, numM28958u, 64, (DefaultConstructorMarker) null);
        }
        String lockedIcon = healthspanWidgetModel.getLockedContent().getLockedIcon();
        c10897b.f33614w = healthspanWidgetModel;
        c10897b.f33615x = numM28958u;
        c10897b.f33613E = 1;
        Object objM28957t = m28957t(lockedIcon, c10897b);
        if (objM28957t != obj) {
            num = numM28958u;
            objAwait = objM28957t;
            healthspanWidgetModel2 = healthspanWidgetModel;
        }
        return obj;
        c10897b.f33614w = healthspanWidgetModel2;
        c10897b.f33615x = num;
        c10897b.f33613E = 2;
        objAwait = ((InterfaceC3018i0) objAwait).await(c10897b);
        if (objAwait != obj) {
            num2 = num;
            healthspanWidgetModel3 = healthspanWidgetModel2;
            return new HealthspanWidgetViewState((Long) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, new HealthspanWidgetLockedContentViewState((byte[]) objAwait, healthspanWidgetModel3.getLockedContent().getHeaderTextDisplay(), healthspanWidgetModel3.getLockedContent().getDescriptionDisplay()), true, num2, 63, (DefaultConstructorMarker) null);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x0478  */
    /* JADX WARN: Code duplicated, block: B:109:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:119:0x0557  */
    /* JADX WARN: Code duplicated, block: B:123:0x056b  */
    /* JADX WARN: Code duplicated, block: B:129:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0650  */
    /* JADX WARN: Code duplicated, block: B:147:0x0677 A[PHI: r3 r4 r7
      0x0677: PHI (r3v44 ??) = (r3v57 ??), (r3v58 ??) binds: [B:145:0x0674, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0677: PHI (r4v48 float) = (r4v46 float), (r4v49 float) binds: [B:145:0x0674, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0677: PHI (r7v27 com.whoop.widget.network.WidgetRefreshWorker$c) = (r7v26 com.whoop.widget.network.WidgetRefreshWorker$c), (r7v0 com.whoop.widget.network.WidgetRefreshWorker$c) binds: [B:145:0x0674, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x069b A[PHI: r3 r4 r7
      0x069b: PHI (r3v46 ??) = (r3v55 ??), (r3v56 ??) binds: [B:148:0x0698, B:15:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x069b: PHI (r4v50 float) = (r4v48 float), (r4v51 float) binds: [B:148:0x0698, B:15:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x069b: PHI (r7v28 com.whoop.widget.network.WidgetRefreshWorker$c) = (r7v27 com.whoop.widget.network.WidgetRefreshWorker$c), (r7v0 com.whoop.widget.network.WidgetRefreshWorker$c) binds: [B:148:0x0698, B:15:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x06bf A[PHI: r3 r4 r7
      0x06bf: PHI (r3v48 ??) = (r3v53 ??), (r3v54 ??) binds: [B:151:0x06bc, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x06bf: PHI (r4v52 float) = (r4v50 float), (r4v53 float) binds: [B:151:0x06bc, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x06bf: PHI (r7v29 com.whoop.widget.network.WidgetRefreshWorker$c) = (r7v28 com.whoop.widget.network.WidgetRefreshWorker$c), (r7v0 com.whoop.widget.network.WidgetRefreshWorker$c) binds: [B:151:0x06bc, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[LOOP:0: B:131:0x05df->B:161:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[LOOP:1: B:121:0x0565->B:165:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[LOOP:2: B:111:0x04eb->B:169:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[LOOP:3: B:101:0x0472->B:173:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0301  */
    /* JADX WARN: Code duplicated, block: B:41:0x0319 A[PHI: r1 r3 r4
      0x0319: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:39:0x0315, B:28:0x02bf] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r3v8 com.whoop.widget.model.WidgetSingle) = (r3v5 com.whoop.widget.model.WidgetSingle), (r3v12 com.whoop.widget.model.WidgetSingle) binds: [B:39:0x0315, B:28:0x02bf] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r4v5 com.whoop.widget.model.WidgetModel) = (r4v3 com.whoop.widget.model.WidgetModel), (r4v15 com.whoop.widget.model.WidgetModel) binds: [B:39:0x0315, B:28:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0340  */
    /* JADX WARN: Code duplicated, block: B:50:0x0355  */
    /* JADX WARN: Code duplicated, block: B:54:0x035e  */
    /* JADX WARN: Code duplicated, block: B:58:0x036f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0384  */
    /* JADX WARN: Code duplicated, block: B:71:0x039c  */
    /* JADX WARN: Code duplicated, block: B:77:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x0407  */
    /* JADX WARN: Code duplicated, block: B:96:0x0436  */
    /* JADX WARN: Code duplicated, block: B:99:0x0464  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x06e0, code lost:
    
        if (pf.AbstractC29125c.m88519a0(r1, r5, r7) == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0430, code lost:
    
        if (p481s6.AbstractC32229a.m100264k(r14, r13, r15, r8) == r2) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0430 -> B:95:0x0434). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28942C(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.network.WidgetRefreshWorker.m28942C(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:27:0x0098->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (pf.AbstractC29125c.m88519a0(r11, r2, r0) == r1) goto L34;
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28943D(q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.network.WidgetRefreshWorker.m28943D(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[PHI: r12
      0x00a2: PHI (r12v13 java.lang.Object) = (r12v10 java.lang.Object), (r12v1 java.lang.Object) binds: [B:32:0x009f, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[PHI: r1 r12
      0x00be: PHI (r1v7 com.whoop.widget.ui.healthspan.a) = (r1v6 com.whoop.widget.ui.healthspan.a), (r1v9 com.whoop.widget.ui.healthspan.a) binds: [B:37:0x00bb, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r12v20 java.lang.Object) = (r12v19 java.lang.Object), (r12v1 java.lang.Object) binds: [B:37:0x00bb, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: E */
    public final Object m28944E(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10912q c10912q;
        C23058h c23058h;
        Context context;
        HealthspanWidgetModel healthspanWidgetModel;
        C10920a c10920aM28961x;
        Integer numM28958u;
        C10920a c10920aM28961x2;
        if (interfaceC30057d instanceof C10912q) {
            c10912q = (C10912q) interfaceC30057d;
            int i13 = c10912q.f33686E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10912q.f33686E = i13 - Integer.MIN_VALUE;
            } else {
                c10912q = new C10912q(interfaceC30057d);
            }
        } else {
            c10912q = new C10912q(interfaceC30057d);
        }
        C10912q c10912q2 = c10912q;
        Object objM28969d = c10912q2.f33689y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c10912q2.f33686E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i14) {
            case 0:
                AbstractC34132o.m107864I(objM28969d);
                C10920a c10920aM28961x3 = m28961x();
                c10912q2.f33686E = 1;
                objM28969d = c10920aM28961x3.m28969d(c10912q2);
                if (objM28969d != obj) {
                    if (((Boolean) objM28969d).booleanValue()) {
                        if (m28960w().isFeatureEnabled("healthspan-widget")) {
                            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                            InterfaceC34116n interfaceC34116nM22895c = m22895c();
                            C10913r c10913r = new C10913r(null);
                            c10912q2.f33686E = 3;
                            objM28969d = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116nM22895c, null, "Failed to fetch healthspan widget info", c10913r, c10912q2, 2, null);
                            if (objM28969d != obj) {
                                healthspanWidgetModel = (HealthspanWidgetModel) AbstractC34386b.m108737b((InterfaceC34385a) objM28969d);
                                if (healthspanWidgetModel != null) {
                                    c10920aM28961x2 = m28961x();
                                    c10912q2.f33687w = null;
                                    c10912q2.f33688x = c10920aM28961x2;
                                    c10912q2.f33686E = 4;
                                    objM28969d = m28941B(healthspanWidgetModel, c10912q2);
                                    if (objM28969d != obj) {
                                        c10912q2.f33687w = null;
                                        c10912q2.f33688x = null;
                                        c10912q2.f33686E = 5;
                                        if (c10920aM28961x2.m28971f((HealthspanWidgetViewState) objM28969d, c10912q2) != obj) {
                                        }
                                    }
                                } else {
                                    c10920aM28961x = m28961x();
                                    numM28958u = m28958u();
                                    c10912q2.f33687w = null;
                                    c10912q2.f33686E = 6;
                                    if (c10920aM28961x.m28970e(numM28958u, c10912q2) != obj) {
                                    }
                                }
                            }
                        } else {
                            c23058h = new C23058h();
                            context = this.context;
                            c10912q2.f33686E = 2;
                            if (AbstractC29125c.m88519a0(c23058h, context, c10912q2) == obj) {
                            }
                        }
                    }
                    return c23454a0;
                }
                return obj;
            case 1:
                AbstractC34132o.m107864I(objM28969d);
                if (((Boolean) objM28969d).booleanValue()) {
                    if (m28960w().isFeatureEnabled("healthspan-widget")) {
                        c23058h = new C23058h();
                        context = this.context;
                        c10912q2.f33686E = 2;
                        if (AbstractC29125c.m88519a0(c23058h, context, c10912q2) == obj) {
                        }
                    } else {
                        InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                        InterfaceC34116n interfaceC34116nM22895c2 = m22895c();
                        C10913r c10913r2 = new C10913r(null);
                        c10912q2.f33686E = 3;
                        objM28969d = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116nM22895c2, null, "Failed to fetch healthspan widget info", c10913r2, c10912q2, 2, null);
                        if (objM28969d != obj) {
                            healthspanWidgetModel = (HealthspanWidgetModel) AbstractC34386b.m108737b((InterfaceC34385a) objM28969d);
                            if (healthspanWidgetModel != null) {
                                c10920aM28961x2 = m28961x();
                                c10912q2.f33687w = null;
                                c10912q2.f33688x = c10920aM28961x2;
                                c10912q2.f33686E = 4;
                                objM28969d = m28941B(healthspanWidgetModel, c10912q2);
                                if (objM28969d != obj) {
                                    c10912q2.f33687w = null;
                                    c10912q2.f33688x = null;
                                    c10912q2.f33686E = 5;
                                    if (c10920aM28961x2.m28971f((HealthspanWidgetViewState) objM28969d, c10912q2) != obj) {
                                    }
                                }
                            } else {
                                c10920aM28961x = m28961x();
                                numM28958u = m28958u();
                                c10912q2.f33687w = null;
                                c10912q2.f33686E = 6;
                                if (c10920aM28961x.m28970e(numM28958u, c10912q2) != obj) {
                                }
                            }
                        }
                    }
                    return obj;
                }
                return c23454a0;
            case 2:
                AbstractC34132o.m107864I(objM28969d);
                return c23454a0;
            case 3:
                AbstractC34132o.m107864I(objM28969d);
                healthspanWidgetModel = (HealthspanWidgetModel) AbstractC34386b.m108737b((InterfaceC34385a) objM28969d);
                if (healthspanWidgetModel != null) {
                    c10920aM28961x2 = m28961x();
                    c10912q2.f33687w = null;
                    c10912q2.f33688x = c10920aM28961x2;
                    c10912q2.f33686E = 4;
                    objM28969d = m28941B(healthspanWidgetModel, c10912q2);
                    if (objM28969d != obj) {
                        c10912q2.f33687w = null;
                        c10912q2.f33688x = null;
                        c10912q2.f33686E = 5;
                        if (c10920aM28961x2.m28971f((HealthspanWidgetViewState) objM28969d, c10912q2) != obj) {
                            return c23454a0;
                        }
                    }
                } else {
                    c10920aM28961x = m28961x();
                    numM28958u = m28958u();
                    c10912q2.f33687w = null;
                    c10912q2.f33686E = 6;
                    if (c10920aM28961x.m28970e(numM28958u, c10912q2) != obj) {
                        return c23454a0;
                    }
                }
                return obj;
            case 4:
                c10920aM28961x2 = (C10920a) c10912q2.f33688x;
                AbstractC34132o.m107864I(objM28969d);
                c10912q2.f33687w = null;
                c10912q2.f33688x = null;
                c10912q2.f33686E = 5;
                if (c10920aM28961x2.m28971f((HealthspanWidgetViewState) objM28969d, c10912q2) != obj) {
                    return obj;
                }
                return c23454a0;
            case 5:
            case 6:
                AbstractC34132o.m107864I(objM28969d);
                return c23454a0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m28945F() {
        this.context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.context, (Class<?>) AmoebaWidgetProvider.class), (Build.VERSION.SDK_INT < 31 || !m28960w().isFeatureEnabled("healthspan-widget")) ? 2 : 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120 A[PHI: r12
      0x0120: PHI (r12v3 ??) = (r12v2 ??), (r12v4 ??) binds: [B:40:0x00e5, B:51:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:42:0x00f0->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker, y6.g] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, q83.d] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX INFO: renamed from: G */
    public final Object m28946G(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10914s c10914s;
        ?? r14;
        List list;
        WidgetStressResponse widgetStressResponse;
        WidgetStressResponse widgetStressResponse2;
        Iterator it;
        int i13;
        C26100k c26100k;
        Context context;
        InterfaceC26395l interfaceC26395l;
        Context context2;
        InterfaceC39255g interfaceC39255gM28963z;
        C10915t c10915t;
        if (interfaceC30057d instanceof C10914s) {
            c10914s = (C10914s) interfaceC30057d;
            int i14 = c10914s.f33699K;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c10914s.f33699K = i14 - Integer.MIN_VALUE;
            } else {
                c10914s = new C10914s(interfaceC30057d);
            }
        } else {
            c10914s = new C10914s(interfaceC30057d);
        }
        C10914s c10914s2 = c10914s;
        Object objM87820b = c10914s2.f33697I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c10914s2.f33699K;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM87820b);
            C28901n0 c28901n0 = new C28901n0(this.context);
            c10914s2.f33699K = 1;
            objM87820b = c28901n0.m87820b(C26100k.class, c10914s2);
            if (objM87820b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    list = (List) c10914s2.f33700w;
                    AbstractC34132o.m107864I(objM87820b);
                    r14 = 0;
                    widgetStressResponse = (WidgetStressResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM87820b);
                    if (widgetStressResponse != null) {
                        widgetStressResponse2 = widgetStressResponse;
                        it = list.iterator();
                        i13 = 0;
                        r14 = r14;
                    } else {
                        c26100k = new C26100k(r14, 1, r14);
                        context = this.context;
                        c10914s2.f33700w = r14;
                        c10914s2.f33701x = r14;
                        c10914s2.f33702y = r14;
                        c10914s2.f33703z = r14;
                        c10914s2.f33693E = r14;
                        c10914s2.f33694F = r14;
                        c10914s2.f33699K = 5;
                        if (AbstractC29125c.m88519a0(c26100k, context, c10914s2) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                }
                if (i15 == 4) {
                    i13 = c10914s2.f33695G;
                    it = (Iterator) c10914s2.f33703z;
                    widgetStressResponse2 = (WidgetStressResponse) c10914s2.f33701x;
                    AbstractC34132o.m107864I(objM87820b);
                    r14 = 0;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            AbstractC34132o.m107864I(objM87820b);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objM87820b);
        while (it.hasNext()) {
            interfaceC26395l = (InterfaceC26395l) it.next();
            context2 = this.context;
            interfaceC39255gM28963z = m28963z();
            c10915t = new C10915t(widgetStressResponse2, r14);
            c10914s2.f33700w = r14;
            c10914s2.f33701x = widgetStressResponse2;
            c10914s2.f33702y = r14;
            c10914s2.f33703z = it;
            c10914s2.f33693E = r14;
            c10914s2.f33694F = r14;
            c10914s2.f33695G = i13;
            c10914s2.f33696H = 0;
            c10914s2.f33699K = 4;
            if (AbstractC32229a.m100265l(context2, interfaceC39255gM28963z, interfaceC26395l, c10915t, c10914s2) == enumC31071a) {
                return enumC31071a;
            }
        }
        c26100k = new C26100k(r14, 1, r14);
        context = this.context;
        c10914s2.f33700w = r14;
        c10914s2.f33701x = r14;
        c10914s2.f33702y = r14;
        c10914s2.f33703z = r14;
        c10914s2.f33693E = r14;
        c10914s2.f33694F = r14;
        c10914s2.f33699K = 5;
        if (AbstractC29125c.m88519a0(c26100k, context, c10914s2) != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
        List list2 = (List) objM87820b;
        if (!list2.isEmpty()) {
            if (m28960w().isFeatureEnabled("stress-monitor-widget")) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116nM22895c = m22895c();
                C10916u c10916u = new C10916u(null);
                c10914s2.f33700w = list2;
                c10914s2.f33699K = 3;
                r14 = 0;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116nM22895c, null, "Failed to fetch stress for widget", c10916u, c10914s2, 2, null);
                if (objM108729b != enumC31071a) {
                    list = list2;
                    objM87820b = objM108729b;
                    widgetStressResponse = (WidgetStressResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM87820b);
                    if (widgetStressResponse != null) {
                        widgetStressResponse2 = widgetStressResponse;
                        it = list.iterator();
                        i13 = 0;
                        r14 = r14;
                        while (it.hasNext()) {
                            interfaceC26395l = (InterfaceC26395l) it.next();
                            context2 = this.context;
                            interfaceC39255gM28963z = m28963z();
                            c10915t = new C10915t(widgetStressResponse2, r14);
                            c10914s2.f33700w = r14;
                            c10914s2.f33701x = widgetStressResponse2;
                            c10914s2.f33702y = r14;
                            c10914s2.f33703z = it;
                            c10914s2.f33693E = r14;
                            c10914s2.f33694F = r14;
                            c10914s2.f33695G = i13;
                            c10914s2.f33696H = 0;
                            c10914s2.f33699K = 4;
                            if (AbstractC32229a.m100265l(context2, interfaceC39255gM28963z, interfaceC26395l, c10915t, c10914s2) == enumC31071a) {
                            }
                        }
                        c26100k = new C26100k(r14, 1, r14);
                        context = this.context;
                        c10914s2.f33700w = r14;
                        c10914s2.f33701x = r14;
                        c10914s2.f33702y = r14;
                        c10914s2.f33703z = r14;
                        c10914s2.f33693E = r14;
                        c10914s2.f33694F = r14;
                        c10914s2.f33699K = 5;
                        if (AbstractC29125c.m88519a0(c26100k, context, c10914s2) != enumC31071a) {
                        }
                    } else {
                        c26100k = new C26100k(r14, 1, r14);
                        context = this.context;
                        c10914s2.f33700w = r14;
                        c10914s2.f33701x = r14;
                        c10914s2.f33702y = r14;
                        c10914s2.f33703z = r14;
                        c10914s2.f33693E = r14;
                        c10914s2.f33694F = r14;
                        c10914s2.f33699K = 5;
                        if (AbstractC29125c.m88519a0(c26100k, context, c10914s2) != enumC31071a) {
                        }
                    }
                }
            } else {
                C26100k c26100k2 = new C26100k(null, 1, null);
                Context context3 = this.context;
                c10914s2.f33700w = null;
                c10914s2.f33699K = 2;
                if (AbstractC29125c.m88519a0(c26100k2, context3, c10914s2) == enumC31071a) {
                }
            }
            return enumC31071a;
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: H */
    private final void m28947H() {
        this.context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.context, (Class<?>) SmallWidgetStressProvider.class), (Build.VERSION.SDK_INT < 31 || !m28960w().isFeatureEnabled("stress-monitor-widget")) ? 2 : 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m28956s(C14129a preferences) {
        Integer numM28958u = m28958u();
        if (numM28958u == null) {
            preferences.m40229f(AbstractC15751g.m44423C("WIDGET_KEY_STRAP_BATTERY_PERCENT"));
            return;
        }
        C14132d c14132dM44423C = AbstractC15751g.m44423C("WIDGET_KEY_STRAP_BATTERY_PERCENT");
        preferences.getClass();
        preferences.m40231h(c14132dM44423C, numM28958u);
    }

    /* JADX INFO: renamed from: t */
    private final Object m28957t(String str, InterfaceC30057d<? super InterfaceC3018i0> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new C10896a(str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: u */
    private final Integer m28958u() {
        if (m28940A().mo106484A() == EnumC33707e.READY) {
            return Integer.valueOf(m28940A().getBatteryLevel().getUserDisplayPercent());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final WidgetApi m28959v() {
        return (WidgetApi) this.api.getValue();
    }

    /* JADX INFO: renamed from: w */
    private final FeatureFlagChecker m28960w() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: x */
    private final C10920a m28961x() {
        return (C10920a) this.healthspanWidgetStateWriter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final StressWidgetApi m28962y() {
        return (StressWidgetApi) this.stressApi.getValue();
    }

    /* JADX INFO: renamed from: z */
    private final InterfaceC39255g m28963z() {
        return (InterfaceC39255g) this.stressStateDefinition.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[Catch: Exception -> 0x002e, PHI: r9
      0x00ac: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:42:0x00a8, B:30:0x006d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8 A[Catch: Exception -> 0x002e, PHI: r2 r9
      0x00c8: PHI (r2v5 int) = (r2v4 int), (r2v6 int) binds: [B:45:0x00c4, B:29:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v1 java.lang.Object) binds: [B:45:0x00c4, B:29:0x0069] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109 A[Catch: Exception -> 0x002e, PHI: r2 r3 r4 r9
      0x0109: PHI (r2v9 int) = (r2v7 int), (r2v10 int) binds: [B:52:0x0106, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r3v9 int) = (r3v6 int), (r3v11 int) binds: [B:52:0x0106, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r4v7 int) = (r4v5 int), (r4v9 int) binds: [B:52:0x0106, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r9v22 java.lang.Object) = (r9v21 java.lang.Object), (r9v1 java.lang.Object) binds: [B:52:0x0106, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152 A[Catch: Exception -> 0x002e, PHI: r2 r3 r4 r5 r6
      0x0152: PHI (r2v13 int) = (r2v11 int), (r2v11 int), (r2v14 int) binds: [B:59:0x013b, B:61:0x014f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r3v15 int) = (r3v12 int), (r3v12 int), (r3v16 int) binds: [B:59:0x013b, B:61:0x014f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r4v13 int) = (r4v10 int), (r4v10 int), (r4v14 int) binds: [B:59:0x013b, B:61:0x014f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r5v9 int) = (r5v6 int), (r5v6 int), (r5v10 int) binds: [B:59:0x013b, B:61:0x014f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r6v7 int) = (r6v5 int), (r6v5 int), (r6v8 int) binds: [B:59:0x013b, B:61:0x014f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:66:0x0167, B:17:0x003b, B:63:0x0152, B:20:0x0048, B:58:0x0130, B:60:0x013d, B:23:0x0057, B:54:0x0109, B:26:0x0060, B:51:0x00ea, B:29:0x0069, B:47:0x00c8, B:30:0x006d, B:44:0x00ac, B:31:0x0071, B:41:0x0098, B:32:0x0075, B:38:0x008d, B:35:0x007c), top: B:70:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        if (m28944E(r0) == r1) goto L65;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r9) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.network.WidgetRefreshWorker.mo18568j(q83.d):java.lang.Object");
    }
}
