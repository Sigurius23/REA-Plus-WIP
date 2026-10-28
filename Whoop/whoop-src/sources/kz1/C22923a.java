package kz1;

import gz1.AbstractC16332c;
import gz1.InterfaceC16331b;
import iz1.C21056b;
import iz1.EnumC21059e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz1.C22075c;
import jz1.C22076d;
import jz1.C22077e;
import jz1.InterfaceC22073a;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkz1/a;", "", "<init>", "()V", "Liz1/e;", "Ljz1/c$a;", "f", "(Liz1/e;)Ljz1/c$a;", "Lgz1/b;", "detection", "Ljz1/e;", "a", "(Lgz1/b;)Ljz1/e;", "", "d", "(Lgz1/b;)Ljava/lang/String;", "", "c", "(Ljava/util/List;)Ljava/lang/String;", "Lgz1/c;", "b", "(Lgz1/c;)Ljava/lang/String;", "Liz1/b;", "state", "Ljz1/c;", "e", "(Liz1/b;)Ljz1/c;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22923a {

    /* JADX INFO: renamed from: a */
    private static final a f90489a = new a(null);

    /* JADX INFO: renamed from: kz1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkz1/a$a;", "", "<init>", "()V", "", "NONE_YET", "Ljava/lang/String;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: kz1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90490a;

        static {
            int[] iArr = new int[EnumC21059e.values().length];
            try {
                iArr[EnumC21059e.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21059e.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90490a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final C22077e m66649a(InterfaceC16331b detection) {
        String reason;
        if (detection instanceof InterfaceC16331b.c) {
            reason = ((InterfaceC16331b.c) detection).getReason();
        } else {
            if (!AbstractC22676k.m65745e(detection, InterfaceC16331b.a.f62836a) && !AbstractC22676k.m65745e(detection, InterfaceC16331b.b.f62837a)) {
                throw new NoWhenBranchMatchedException();
            }
            reason = null;
        }
        return new C22077e("Exercise detection", AbstractC25260n.m74077r0(new C22076d[]{new C22076d("Motion-tracking state", m66652d(detection)), reason != null ? new C22076d("Reason", reason) : null, new C22076d("Top 5 exercises", m66651c(null)), new C22076d("Final classification", m66650b(null))}));
    }

    /* JADX INFO: renamed from: b */
    private final String m66650b(AbstractC16332c abstractC16332c) {
        return "none yet";
    }

    /* JADX INFO: renamed from: c */
    private final String m66651c(List<Object> list) {
        if (list == null) {
            list = C25271y.f99162w;
        }
        List listM74156w1 = AbstractC25265s.m74156w1(list, 5);
        if (listM74156w1.isEmpty()) {
            return "none yet";
        }
        List list2 = listM74156w1;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        return AbstractC25265s.m74110N0(arrayList, "\n", null, null, null, 62);
    }

    /* JADX INFO: renamed from: d */
    private final String m66652d(InterfaceC16331b interfaceC16331b) {
        if (interfaceC16331b instanceof InterfaceC16331b.c) {
            return "Unavailable";
        }
        if (AbstractC22676k.m65745e(interfaceC16331b, InterfaceC16331b.a.f62836a)) {
            return "Idle";
        }
        if (AbstractC22676k.m65745e(interfaceC16331b, InterfaceC16331b.b.f62837a)) {
            return "Starting";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final C22075c.a m66653f(EnumC21059e enumC21059e) {
        int i13 = b.f90490a[enumC21059e.ordinal()];
        if (i13 == 1) {
            return new C22075c.a("Start session", InterfaceC22073a.a.f85594a);
        }
        if (i13 == 2) {
            return new C22075c.a("Stop session", InterfaceC22073a.b.f85595a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public final C22075c m66654e(C21056b state) {
        AbstractC22676k.m65750j(state, "state");
        return new C22075c(m66653f(state.getSession()), AbstractC37056f.m118958J(m66649a(state.getDetection())));
    }
}
