package jy1;

import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jy1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lmb/b;", "a", "Lmb/b;", "getMIGRATION_1_2", "()Lmb/b;", "MIGRATION_1_2", "", "b", "[Lmb/b;", "()[Lmb/b;", "METRICS_DATABASE_MIGRATIONS", "metrics_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22050d {

    /* JADX INFO: renamed from: a */
    private static final AbstractC25380b f85538a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC25380b[] f85539b;

    /* JADX INFO: renamed from: jy1.d$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"jy1/d$a", "Lmb/b;", "Lub/a;", "db", "Ll83/a0;", "migrate", "(Lub/a;)V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC25380b {
        public a() {
            super(1, 2);
        }

        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a db4) {
            AbstractC22676k.m65750j(db4, "db");
            db4.mo109660E("ALTER TABLE metrics_table ADD COLUMN metric_type TEXT NULL");
        }
    }

    static {
        a aVar = new a();
        f85538a = aVar;
        f85539b = new AbstractC25380b[]{aVar};
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC25380b[] m63123a() {
        return f85539b;
    }
}
