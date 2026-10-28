package p044c5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c5.e */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC4213e implements Callable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f17085E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f17087x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Context f17088y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f17089z;

    public /* synthetic */ CallableC4213e(String str, Context context, Object obj, int i13, int i14) {
        this.f17086w = i14;
        this.f17087x = str;
        this.f17088y = context;
        this.f17085E = obj;
        this.f17089z = i13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17086w) {
            case 0:
                Object[] objArr = {(C4212d) this.f17085E};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return AbstractC4216h.m13079b(this.f17087x, this.f17088y, Collections.unmodifiableList(arrayList), this.f17089z);
            default:
                try {
                    return AbstractC4216h.m13079b(this.f17087x, this.f17088y, (List) this.f17085E, this.f17089z);
                } catch (Throwable unused) {
                    return new C4215g(-3);
                }
        }
    }
}
