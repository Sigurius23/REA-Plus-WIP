package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import l83.InterfaceC23462h;
import p003a1.C0111j;
import p518ub.InterfaceC34735h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: androidx.room.r1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1825r1 {
    private final AbstractC1848z0 database;
    private final AtomicBoolean lock;
    private final InterfaceC23462h stmt$delegate;

    public AbstractC1825r1(AbstractC1848z0 database) {
        AbstractC22676k.m65750j(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = AbstractC30060g.m92088H(new C0111j(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC34735h m5451a() {
        return this.database.compileStatement(createQuery());
    }

    public InterfaceC34735h acquire() {
        assertNotMainThread();
        return this.lock.compareAndSet(false, true) ? (InterfaceC34735h) this.stmt$delegate.getValue() : m5451a();
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(InterfaceC34735h statement) {
        AbstractC22676k.m65750j(statement, "statement");
        if (statement == ((InterfaceC34735h) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
