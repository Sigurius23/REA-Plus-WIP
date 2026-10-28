package pv2;

import fz0.C14889d;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: pv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpv2/a;", "", "", "Lfz0/d;", "hrZonesState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29580a {

    /* JADX INFO: renamed from: b */
    public static final int f120738b = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C14889d> hrZonesState;

    public C29580a(List<C14889d> hrZonesState) {
        AbstractC22676k.m65750j(hrZonesState, "hrZonesState");
        this.hrZonesState = hrZonesState;
    }

    /* JADX INFO: renamed from: a */
    public final List<C14889d> m90688a() {
        return this.hrZonesState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C29580a) && AbstractC22676k.m65745e(this.hrZonesState, ((C29580a) other).hrZonesState);
    }

    public int hashCode() {
        return this.hrZonesState.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("HeartRateViewState(hrZonesState=", ")", this.hrZonesState);
    }
}
