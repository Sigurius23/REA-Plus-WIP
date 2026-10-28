package p715kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.q */
/* JADX INFO: loaded from: classes5.dex */
public class C22686q extends AbstractC22685p {
    public C22686q(Class cls, String str, String str2, int i13) {
        super(AbstractC22660c.NO_RECEIVER, cls, str, str2, i13);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
