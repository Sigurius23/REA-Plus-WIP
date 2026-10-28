package p441qx;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: qx.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30720k0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f126497a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f126498b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public boolean f126499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30722l0 f126500d;

    public C30720k0(C30722l0 c30722l0) {
        this.f126500d = c30722l0;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m94396a(IllegalArgumentException illegalArgumentException) {
        if (!this.f126499c) {
            this.f126499c = true;
            ArrayDeque arrayDeque = this.f126498b;
            if (arrayDeque.size() != 1 || ((C30718j0) arrayDeque.getFirst()).f126491b != null) {
                StringBuilder sb4 = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C30718j0 c30718j0 = (C30718j0) itDescendingIterator.next();
                    sb4.append("\nfor ");
                    Type type = c30718j0.f126490a;
                    String str = c30718j0.f126491b;
                    sb4.append(type);
                    if (str != null) {
                        sb4.append(' ');
                        sb4.append(str);
                    }
                }
                return new IllegalArgumentException(sb4.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    /* JADX INFO: renamed from: b */
    public final void m94397b(boolean z4) {
        this.f126498b.removeLast();
        if (this.f126498b.isEmpty()) {
            this.f126500d.f126507b.remove();
            if (z4) {
                synchronized (this.f126500d.f126508c) {
                    try {
                        int size = this.f126497a.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            C30718j0 c30718j0 = (C30718j0) this.f126497a.get(i13);
                            JsonAdapter jsonAdapter = (JsonAdapter) this.f126500d.f126508c.put(c30718j0.f126492c, c30718j0.f126493d);
                            if (jsonAdapter != null) {
                                c30718j0.f126493d = jsonAdapter;
                                this.f126500d.f126508c.put(c30718j0.f126492c, jsonAdapter);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }
}
