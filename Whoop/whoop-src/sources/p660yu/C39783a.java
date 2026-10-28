package p660yu;

import com.mapbox.bindgen.Value;
import java.util.Arrays;
import p048ce.AbstractC4482w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39783a {

    /* JADX INFO: renamed from: a */
    public final String f171378a;

    /* JADX INFO: renamed from: b */
    public final Object f171379b;

    /* JADX INFO: renamed from: c */
    public final Value f171380c;

    public C39783a(String str, Object obj) {
        this.f171378a = str;
        this.f171379b = obj;
        try {
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Any");
            this.f171380c = AbstractC4482w.m14004n0(obj);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException("Incorrect property value for " + this.f171378a + ": " + e5.getMessage(), e5.getCause());
        }
    }

    public final String toString() {
        return String.format("%s: %s", Arrays.copyOf(new Object[]{this.f171378a, this.f171379b}, 2));
    }
}
