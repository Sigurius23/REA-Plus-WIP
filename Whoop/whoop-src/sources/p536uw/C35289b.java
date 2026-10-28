package p536uw;

import java.sql.Timestamp;
import java.util.Date;
import rw.AbstractC31855e;

/* JADX INFO: renamed from: uw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35289b extends AbstractC31855e {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f150280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35289b(int i13, Class cls) {
        super(cls);
        this.f150280c = i13;
    }

    @Override // rw.AbstractC31855e
    /* JADX INFO: renamed from: a */
    public final Date mo99043a(Date date) {
        switch (this.f150280c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
