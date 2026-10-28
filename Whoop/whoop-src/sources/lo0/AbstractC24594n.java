package lo0;

import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lo0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Llo0/n;", "Lfy1/k;", "<init>", "()V", "c", "b", "a", "Llo0/n$a;", "Llo0/n$b;", "Llo0/n$c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24594n implements InterfaceC14875k {

    /* JADX INFO: renamed from: lo0.n$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llo0/n$a;", "Llo0/n;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC24594n {

        /* JADX INFO: renamed from: b */
        public static final a f96128b = new a();

        private a() {
            super(null);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.ERROR;
        }
    }

    /* JADX INFO: renamed from: lo0.n$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llo0/n$b;", "Llo0/n;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC24594n {

        /* JADX INFO: renamed from: b */
        public static final b f96129b = new b();

        private b() {
            super(null);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.LOADING;
        }
    }

    /* JADX INFO: renamed from: lo0.n$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Llo0/n$c;", "Llo0/n;", "Llo0/l;", "screenState", "<init>", "(Llo0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Llo0/l;", "()Llo0/l;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24594n {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C24590l screenState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C24590l screenState) {
            super(null);
            AbstractC22676k.m65750j(screenState, "screenState");
            this.screenState = screenState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C24590l getScreenState() {
            return this.screenState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.screenState, ((c) other).screenState);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.SUCCESS;
        }

        public int hashCode() {
            return this.screenState.hashCode();
        }

        public String toString() {
            return "Success(screenState=" + this.screenState + ")";
        }
    }

    public /* synthetic */ AbstractC24594n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24594n() {
    }
}
