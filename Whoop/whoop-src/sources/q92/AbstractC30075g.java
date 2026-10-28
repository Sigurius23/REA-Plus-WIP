package q92;

import android.os.Handler;
import en0.AbstractC13363a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.AbstractC32962f;
import st0.C32958b;
import st0.C32959c;
import st0.C32960d;
import st0.C32961e;
import st0.C32963g;
import st0.C32964h;
import st0.C32965i;
import st0.C32966j;
import st0.C32967k;
import st0.C32969m;
import st0.C32970n;
import st0.C32971o;

/* JADX INFO: renamed from: q92.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lq92/g;", "Len0/a;", "Lst0/f;", "", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "returnedObj", "Ll83/a0;", "f", "(Lst0/f;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "g", "j", "i", "o", "m", "l", "n", "p", "", "errorCode", "", "message", "k", "(ILjava/lang/String;)V", "y", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30075g extends AbstractC13363a<AbstractC32962f> {

    /* JADX INFO: renamed from: y */
    private static final a f122750y = new a(null);

    /* JADX INFO: renamed from: q92.g$a */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lq92/g$a;", "", "<init>", "()V", "Lq92/g;", "whoopStrapConnectionCallback", "Lst0/f;", "connectionState", "Ll83/a0;", "a", "(Lq92/g;Lst0/f;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m92194a(AbstractC30075g whoopStrapConnectionCallback, AbstractC32962f connectionState) {
            AbstractC22676k.m65750j(whoopStrapConnectionCallback, "whoopStrapConnectionCallback");
            AbstractC22676k.m65750j(connectionState, "connectionState");
            if (connectionState.equals(C32959c.f137288a)) {
                whoopStrapConnectionCallback.m92188h();
                return;
            }
            if (connectionState.equals(C32958b.f137287a)) {
                whoopStrapConnectionCallback.m92187g();
                return;
            }
            if (connectionState.equals(C32961e.f137290a)) {
                whoopStrapConnectionCallback.m92190j();
                return;
            }
            if (connectionState.equals(C32960d.f137289a)) {
                whoopStrapConnectionCallback.m92189i();
                return;
            }
            if (connectionState.equals(C32970n.f137298a)) {
                whoopStrapConnectionCallback.m92193o();
                return;
            }
            if (connectionState.equals(C32969m.f137297a)) {
                return;
            }
            if (connectionState.equals(C32964h.f137292a)) {
                whoopStrapConnectionCallback.m92192m();
                return;
            }
            if (connectionState.equals(C32963g.f137291a)) {
                whoopStrapConnectionCallback.mo24772l();
                return;
            }
            if (connectionState.equals(C32966j.f137295a)) {
                whoopStrapConnectionCallback.mo24773n();
                return;
            }
            if (connectionState.equals(C32971o.f137299a)) {
                whoopStrapConnectionCallback.mo24774p();
            } else {
                if (connectionState.equals(C32967k.f137296a)) {
                    return;
                }
                if (!(connectionState instanceof C32965i)) {
                    throw new NoWhenBranchMatchedException();
                }
                C32965i c32965i = (C32965i) connectionState;
                whoopStrapConnectionCallback.m92191k(c32965i.getCode(), c32965i.getMessage());
            }
        }

        private a() {
        }
    }

    public AbstractC30075g(Handler handler) {
        super(handler);
    }

    @Override // en0.AbstractC13363a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo24775d(AbstractC32962f returnedObj) {
        AbstractC22676k.m65750j(returnedObj, "returnedObj");
        f122750y.m92194a(this, returnedObj);
    }

    /* JADX INFO: renamed from: g */
    public void m92187g() {
    }

    /* JADX INFO: renamed from: h */
    public void m92188h() {
    }

    /* JADX INFO: renamed from: i */
    public void m92189i() {
    }

    /* JADX INFO: renamed from: j */
    public void m92190j() {
    }

    /* JADX INFO: renamed from: k */
    public void m92191k(int errorCode, String message) {
        AbstractC22676k.m65750j(message, "message");
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo24772l();

    /* JADX INFO: renamed from: m */
    public void m92192m() {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo24773n();

    /* JADX INFO: renamed from: o */
    public void m92193o() {
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo24774p();

    public /* synthetic */ AbstractC30075g(Handler handler, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : handler);
    }
}
