package jl2;

import al2.AbstractC0988d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: jl2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Ljl2/a;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ly81/f;", "toWhoopColorKey", "()Ly81/f;", "Lcom/whoop/design/util/TextResource$b;", "toMinTitle", "()Lcom/whoop/design/util/TextResource$b;", "toMaxTitle", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "ZONE_5", "ZONE_4", "ZONE_3", "ZONE_2", "ZONE_1", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC21774a {
    ZONE_5("ZONE_5"),
    ZONE_4("ZONE_4"),
    ZONE_3("ZONE_3"),
    ZONE_2("ZONE_2"),
    ZONE_1("ZONE_1");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String id;

    /* JADX INFO: renamed from: jl2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f83847a;

        static {
            int[] iArr = new int[EnumC21774a.values().length];
            try {
                iArr[EnumC21774a.ZONE_5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21774a.ZONE_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21774a.ZONE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21774a.ZONE_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21774a.ZONE_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f83847a = iArr;
        }
    }

    EnumC21774a(String str) {
        this.id = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getId() {
        return this.id;
    }

    public final TextResource.C8688b toMaxTitle() {
        int i13 = a.f83847a[ordinal()];
        if (i13 == 1) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3660O);
        }
        if (i13 == 2) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3658M);
        }
        if (i13 == 3) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3656K);
        }
        if (i13 == 4) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3654I);
        }
        if (i13 == 5) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3652G);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextResource.C8688b toMinTitle() {
        int i13 = a.f83847a[ordinal()];
        if (i13 == 1) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3661P);
        }
        if (i13 == 2) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3659N);
        }
        if (i13 == 3) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3657L);
        }
        if (i13 == 4) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3655J);
        }
        if (i13 == 5) {
            return AbstractC8693b.m21277k(AbstractC0988d.f3653H);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final EnumC39333f toWhoopColorKey() {
        int i13 = a.f83847a[ordinal()];
        if (i13 == 1) {
            return EnumC39333f.STRAIN_ZONE_5;
        }
        if (i13 == 2) {
            return EnumC39333f.STRAIN_ZONE_4;
        }
        if (i13 == 3) {
            return EnumC39333f.STRAIN_ZONE_3;
        }
        if (i13 == 4) {
            return EnumC39333f.STRAIN_ZONE_2;
        }
        if (i13 == 5) {
            return EnumC39333f.STRAIN_ZONE_1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
