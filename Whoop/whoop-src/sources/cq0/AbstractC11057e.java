package cq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.InterfaceC1633v0;
import com.whoop.data.remote.commons.ApiEmptyResponse;
import com.whoop.data.remote.commons.ApiErrorResponse;
import com.whoop.data.remote.commons.ApiResponse;
import com.whoop.data.remote.commons.ApiSuccessResponse;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.data.remote.commons.Resource;
import com.whoop.profile.view.edit.C9790n;
import l83.C23454a0;
import l83.InterfaceC23457c;
import l83.InterfaceC23459e;
import p000.C29656q;
import p009a8.RunnableC0533c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: cq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00028\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00028\u0001H%¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\rH%¢\u0006\u0004\b \u0010\u0014J\u001b\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0\rH%¢\u0006\u0004\b\"\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lcq0/e;", "ResultType", "RequestType", "", "Lcom/whoop/data/remote/commons/AppExecutors;", "appExecutors", "<init>", "(Lcom/whoop/data/remote/commons/AppExecutors;)V", "Lcom/whoop/data/remote/commons/Resource;", "newValue", "Ll83/a0;", "B", "(Lcom/whoop/data/remote/commons/Resource;)V", "Landroidx/lifecycle/p0;", "dbSource", "n", "(Landroidx/lifecycle/p0;)V", "y", "()V", "l", "()Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiSuccessResponse;", "response", "z", "(Lcom/whoop/data/remote/commons/ApiSuccessResponse;)Ljava/lang/Object;", "item", "A", "(Ljava/lang/Object;)V", "data", "", "C", "(Ljava/lang/Object;)Z", "x", "Lcom/whoop/data/remote/commons/ApiResponse;", "m", "a", "Lcom/whoop/data/remote/commons/AppExecutors;", "Landroidx/lifecycle/t0;", "b", "Landroidx/lifecycle/t0;", "result", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class AbstractC11057e<ResultType, RequestType> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1627t0 result;

    /* JADX INFO: renamed from: cq0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f34725w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f34725w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f34725w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34725w.invoke(obj);
        }
    }

    public AbstractC11057e(AppExecutors appExecutors) {
        AbstractC22676k.m65750j(appExecutors, "appExecutors");
        this.appExecutors = appExecutors;
        C1627t0 c1627t0 = new C1627t0();
        this.result = c1627t0;
        c1627t0.setValue(Resource.INSTANCE.loading(null));
        AbstractC1615p0 abstractC1615p0Mo29747x = mo29747x();
        c1627t0.m5035b(abstractC1615p0Mo29747x, new a(new C9790n(2, this, abstractC1615p0Mo29747x)));
    }

    /* JADX INFO: renamed from: B */
    private final void m29721B(Resource<? extends ResultType> newValue) {
        if (AbstractC22676k.m65745e(this.result.getValue(), newValue)) {
            return;
        }
        this.result.setValue(newValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m29732k(AbstractC11057e abstractC11057e, AbstractC1615p0 abstractC1615p0, Object obj) {
        abstractC11057e.result.m5036c(abstractC1615p0);
        if (abstractC11057e.mo29744C(obj)) {
            abstractC11057e.m29733n(abstractC1615p0);
        } else {
            abstractC11057e.result.m5035b(abstractC1615p0, new a(new C11055c(abstractC11057e, 0)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private final void m29733n(AbstractC1615p0 dbSource) {
        AbstractC1615p0 abstractC1615p0Mo29746m = mo29746m();
        this.result.m5035b(dbSource, new a(new C11055c(this, 1)));
        this.result.m5035b(abstractC1615p0Mo29746m, new a(new C29656q(this, abstractC1615p0Mo29746m, dbSource, 23)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m29734o(AbstractC11057e abstractC11057e, Object obj) {
        abstractC11057e.m29721B(Resource.INSTANCE.loading(obj));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m29735p(AbstractC11057e abstractC11057e, AbstractC1615p0 abstractC1615p0, AbstractC1615p0 abstractC1615p1, ApiResponse apiResponse) {
        abstractC11057e.result.m5036c(abstractC1615p0);
        abstractC11057e.result.m5036c(abstractC1615p1);
        if (apiResponse instanceof ApiSuccessResponse) {
            abstractC11057e.appExecutors.getDiskIO().execute(new RunnableC0533c(16, abstractC11057e, (ApiSuccessResponse) apiResponse));
        } else if (apiResponse instanceof ApiEmptyResponse) {
            abstractC11057e.appExecutors.getMainThread().execute(new RunnableC11056d(abstractC11057e, 0));
        } else {
            if (!(apiResponse instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC11057e.m29748y();
            abstractC11057e.result.m5035b(abstractC1615p1, new a(new C9790n(3, abstractC11057e, (ApiErrorResponse) apiResponse)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final void m29736q(AbstractC11057e abstractC11057e, ApiResponse apiResponse) {
        abstractC11057e.mo29743A(abstractC11057e.m29749z((ApiSuccessResponse) apiResponse));
        abstractC11057e.appExecutors.getMainThread().execute(new RunnableC11056d(abstractC11057e, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m29737r(AbstractC11057e abstractC11057e) {
        abstractC11057e.result.m5035b(abstractC11057e.mo29747x(), new a(new C11055c(abstractC11057e, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m29738s(AbstractC11057e abstractC11057e, Object obj) {
        abstractC11057e.m29721B(Resource.INSTANCE.success(obj));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m29739t(AbstractC11057e abstractC11057e) {
        abstractC11057e.result.m5035b(abstractC11057e.mo29747x(), new a(new C11055c(abstractC11057e, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m29740u(AbstractC11057e abstractC11057e, Object obj) {
        abstractC11057e.m29721B(Resource.INSTANCE.success(obj));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m29741v(AbstractC11057e abstractC11057e, ApiResponse apiResponse, Object obj) {
        abstractC11057e.m29721B(Resource.Companion.error$default(Resource.INSTANCE, ((ApiErrorResponse) apiResponse).getErrorMessage(), null, obj, null, 10, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m29742w(AbstractC11057e abstractC11057e, Object obj) {
        abstractC11057e.m29721B(Resource.INSTANCE.success(obj));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo29743A(RequestType item);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo29744C(ResultType data);

    /* JADX INFO: renamed from: l */
    public final AbstractC1615p0 m29745l() {
        C1627t0 c1627t0 = this.result;
        AbstractC22676k.m65748h(c1627t0, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.whoop.data.remote.commons.Resource<ResultType of com.whoop.community.data.repository.NetworkBoundResource>>");
        return c1627t0;
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC1615p0 mo29746m();

    /* JADX INFO: renamed from: x */
    public abstract AbstractC1615p0 mo29747x();

    /* JADX INFO: renamed from: y */
    public void m29748y() {
    }

    /* JADX INFO: renamed from: z */
    public RequestType m29749z(ApiSuccessResponse<RequestType> response) {
        AbstractC22676k.m65750j(response, "response");
        return response.getBody();
    }
}
