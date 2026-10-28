package ol0;

import com.whoop.design.models.DesignSystemModel;
import dl0.C12164c;
import dl0.InterfaceC12162a;
import e31.C12612d;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.AbstractC29345c;

/* JADX INFO: renamed from: ol0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lol0/d;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Ldl0/a$b;", "Lol0/c;", "b", "(Ldl0/a$b;)Lol0/c;", "Ldl0/c;", "domainState", "a", "(Ldl0/c;)Lol0/c;", "Ljb1/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28014d {

    /* JADX INFO: renamed from: b */
    public static final int f112976b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C28014d(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C28013c m84485b(InterfaceC12162a.b bVar) {
        if (bVar instanceof InterfaceC12162a.a) {
            return new C28013c(new C28013c.a(C12612d.f43056a.m35366a(), null, 2, null), null, 2, null);
        }
        if (bVar instanceof InterfaceC12162a.c) {
            return new C28013c(new C28013c.a(C12612d.f43056a.m35367b(), null, 2, null), null, 2, null);
        }
        if (bVar instanceof InterfaceC12162a.d) {
            return new C28013c(new C28013c.a(C12612d.f43056a.m35368c(), new InterfaceC28011a.a(((InterfaceC12162a.d) bVar).getPath())), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final C28013c m84486a(C12164c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCurrentDialogType() instanceof InterfaceC12162a.b) {
            return m84485b((InterfaceC12162a.b) domainState.getCurrentDialogType());
        }
        DesignSystemModel widget = domainState.getWidget();
        return new C28013c(null, widget != null ? this.reducer.m60544l(widget) : null, 1, null);
    }

    public /* synthetic */ C28014d(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC29345c.m89363U() : c21535a);
    }
}
