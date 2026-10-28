package p114eb;

import android.os.Bundle;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12938a implements InterfaceC12981p0 {

    /* JADX INFO: renamed from: a */
    public final int f44672a;

    /* JADX INFO: renamed from: b */
    public final Bundle f44673b = new Bundle();

    public C12938a(int i13) {
        this.f44672a = i13;
    }

    @Override // p114eb.InterfaceC12981p0
    /* JADX INFO: renamed from: a */
    public final int mo19186a() {
        return this.f44672a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12938a.class.equals(obj.getClass()) && this.f44672a == ((C12938a) obj).f44672a;
    }

    @Override // p114eb.InterfaceC12981p0
    public final Bundle getArguments() {
        return this.f44673b;
    }

    public final int hashCode() {
        return 31 + this.f44672a;
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f44672a, ')');
    }
}
