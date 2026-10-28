package kb3;

/* JADX INFO: renamed from: kb3.i */
/* JADX INFO: loaded from: classes5.dex */
public class C22340i extends C22339h implements InterfaceC22343l {
    @Override // kb3.C22339h, c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
