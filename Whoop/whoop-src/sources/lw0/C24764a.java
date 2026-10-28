package lw0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.core.details.network.api.CoreDetailsApi;
import com.whoop.core.details.network.model.sleep.ErrorMessage;
import com.whoop.core.details.network.model.sleep.ErrorMessageModel;
import com.whoop.core.details.network.model.sleep.SleepDetailsModel;
import com.whoop.data.remote.commons.Resource;
import com.whoop.design.util.TextResource;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28169i0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import vv0.AbstractC36529b;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: lw0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0018\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Llw0/a;", "Lhj0/n;", "Lcom/whoop/core/details/network/api/CoreDetailsApi;", "coreDetailsApi", "Ltr2/n;", "logger", "Lin2/d;", "dispatcherFactory", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/core/details/network/api/CoreDetailsApi;Ltr2/n;Lin2/d;Lrr2/c;)V", "Lud3/a1;", "e", "Lcom/whoop/core/details/network/model/sleep/ErrorMessage;", "i", "(Lud3/a1;)Lcom/whoop/core/details/network/model/sleep/ErrorMessage;", "", "sleepIdV2", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "j", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "a", "Lcom/whoop/core/details/network/api/CoreDetailsApi;", "b", "Lcom/whoop/core/details/network/model/sleep/ErrorMessage;", "defaultErrorMessage", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24764a extends AbstractC17355n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoreDetailsApi coreDetailsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ErrorMessage defaultErrorMessage;

    /* JADX INFO: renamed from: lw0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.network.SleepRepository", m100430f = "SleepRepository.kt", m100431l = {44}, m100432m = "deleteSleep$core_details_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f96859w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f96860x;

        /* JADX INFO: renamed from: z */
        int f96862z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f96860x = obj;
            this.f96862z |= Integer.MIN_VALUE;
            return C24764a.this.m72511h(null, this);
        }
    }

    /* JADX INFO: renamed from: lw0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.network.SleepRepository$getSleepDetails$2", m100430f = "SleepRepository.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96863w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f96865y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96865y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24764a.this.new b(this.f96865y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<SleepDetailsModel>> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f96863w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    CoreDetailsApi coreDetailsApi = C24764a.this.coreDetailsApi;
                    String str = this.f96865y;
                    this.f96863w = 1;
                    obj = coreDetailsApi.fetchSleepDetails(str, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success((SleepDetailsModel) obj);
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while getting sleep details", C24764a.this.getLogger(), C24764a.this.getCrashReporter()), null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: lw0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.network.SleepRepository", m100430f = "SleepRepository.kt", m100431l = {56}, m100432m = "napToSleep$core_details_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f96866w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f96867x;

        /* JADX INFO: renamed from: z */
        int f96869z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f96867x = obj;
            this.f96869z |= Integer.MIN_VALUE;
            return C24764a.this.m72513k(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24764a(CoreDetailsApi coreDetailsApi, InterfaceC34116n logger, InterfaceC18732d dispatcherFactory, InterfaceC31766c crashReporter) {
        super(logger, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(coreDetailsApi, "coreDetailsApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.coreDetailsApi = coreDetailsApi;
        this.defaultErrorMessage = new ErrorMessage(new TextResource.C8688b(AbstractC36529b.f156355z, null, 2, null), new TextResource.C8688b(AbstractC36529b.f156321B, null, 2, null));
    }

    /* JADX INFO: renamed from: i */
    private final ErrorMessage m72510i(AbstractC34799a1 e5) {
        try {
            return ((ErrorMessageModel) C28169i0.m85275e(e5.m109860m(), ErrorMessageModel.class)).toErrorMessage();
        } catch (Exception e13) {
            getLogger().mo85230v("Backend contract violation, could not serialize following error message", e13, new AbstractC30556a.a[0]);
            return this.defaultErrorMessage;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m72511h(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f96862z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f96862z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objDeleteSleep = aVar.f96860x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f96862z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objDeleteSleep);
                if (str.length() > 0) {
                    CoreDetailsApi coreDetailsApi = this.coreDetailsApi;
                    aVar.f96859w = null;
                    aVar.f96862z = 1;
                    objDeleteSleep = coreDetailsApi.deleteSleep(str, aVar);
                    if (objDeleteSleep == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return Boolean.valueOf(z4);
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objDeleteSleep);
            z4 = ((C29218v0) objDeleteSleep).f118269a.f146788Q;
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "failed to delete sleep");
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: j */
    public final Object m72512j(String str, InterfaceC30057d<? super Resource<SleepDetailsModel>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(getDispatcherFactory().mo54465b(), new b(str, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m72513k(String str, InterfaceC30057d<? super ErrorMessage> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f96869z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f96869z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objNapToSleep = cVar.f96867x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f96869z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objNapToSleep);
                if (str.length() <= 0) {
                    return this.defaultErrorMessage;
                }
                CoreDetailsApi coreDetailsApi = this.coreDetailsApi;
                cVar.f96866w = str;
                cVar.f96869z = 1;
                objNapToSleep = coreDetailsApi.napToSleep(str, cVar);
                if (objNapToSleep == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objNapToSleep);
            }
            AbstractC34799a1 abstractC34799a1 = ((C29218v0) objNapToSleep).f118271c;
            if (abstractC34799a1 != null) {
                return m72510i(abstractC34799a1);
            }
            return null;
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "failed to convert nap " + str + " to sleep");
            return this.defaultErrorMessage;
        }
    }
}
