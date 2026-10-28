package p606x7;

import android.os.RemoteException;
import j93.InterfaceC21461d;
import java.io.IOException;
import l83.C23465k;
import m83.AbstractC25247g0;
import p497t7.C33562c;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: x7.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38035a {

    /* JADX INFO: renamed from: a */
    public static final Object f162941a;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f162941a = AbstractC25247g0.m73990Y(new C23465k(1, c22673i0.getOrCreateKotlinClass(UnsupportedOperationException.class)), new C23465k(2, c22673i0.getOrCreateKotlinClass(UnsupportedOperationException.class)), new C23465k(3, c22673i0.getOrCreateKotlinClass(UnsupportedOperationException.class)), new C23465k(4, c22673i0.getOrCreateKotlinClass(SecurityException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.INVALID_OWNERSHIP), c22673i0.getOrCreateKotlinClass(SecurityException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.NOT_ALLOWED), c22673i0.getOrCreateKotlinClass(SecurityException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.EMPTY_PERMISSION_LIST), c22673i0.getOrCreateKotlinClass(IllegalArgumentException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.PERMISSION_NOT_DECLARED), c22673i0.getOrCreateKotlinClass(SecurityException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.INVALID_PERMISSION_RATIONALE_DECLARATION), c22673i0.getOrCreateKotlinClass(SecurityException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.INVALID_UID), c22673i0.getOrCreateKotlinClass(RemoteException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.DATABASE_ERROR), c22673i0.getOrCreateKotlinClass(IOException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.INTERNAL_ERROR), c22673i0.getOrCreateKotlinClass(RemoteException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.CHANGES_TOKEN_OUTDATED), c22673i0.getOrCreateKotlinClass(RemoteException.class)), new C23465k(Integer.valueOf(InterfaceC33561b.TRANSACTION_TOO_LARGE), c22673i0.getOrCreateKotlinClass(RemoteException.class)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final Exception m121771a(C33562c c33562c) {
        String str = c33562c.f140041y;
        InterfaceC21461d interfaceC21461d = (InterfaceC21461d) f162941a.get(Integer.valueOf(c33562c.f140040x));
        if (interfaceC21461d == null) {
            return new UnsupportedOperationException(str);
        }
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(SecurityException.class))) {
            return new SecurityException(str);
        }
        if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(RemoteException.class))) {
            return new RemoteException(str);
        }
        if (interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(IllegalArgumentException.class))) {
            return new IllegalArgumentException(str);
        }
        return interfaceC21461d.equals(c22673i0.getOrCreateKotlinClass(IOException.class)) ? new IOException(str) : new UnsupportedOperationException(str);
    }
}
