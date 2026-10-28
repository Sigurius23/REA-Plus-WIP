package kotlinx.serialization.internal;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.lang.annotation.Annotation;
import java.util.List;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lj93/a0;", AnalyticsRequestV2.HEADER_ORIGIN, "<init>", "(Lj93/a0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lj93/a0;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lj93/d0;", "getArguments", "arguments", "Lj93/e;", "getClassifier", "()Lj93/e;", "classifier", "isMarkedNullable", "()Z", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class KTypeWrapper implements InterfaceC21456a0 {
    private final InterfaceC21456a0 origin;

    public KTypeWrapper(InterfaceC21456a0 origin) {
        AbstractC22676k.m65750j(origin, "origin");
        this.origin = origin;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        InterfaceC21456a0 interfaceC21456a0 = this.origin;
        KTypeWrapper kTypeWrapper = other instanceof KTypeWrapper ? (KTypeWrapper) other : null;
        if (!AbstractC22676k.m65745e(interfaceC21456a0, kTypeWrapper != null ? kTypeWrapper.origin : null)) {
            return false;
        }
        InterfaceC21463e classifier = getClassifier();
        if (classifier instanceof InterfaceC21461d) {
            InterfaceC21456a0 interfaceC21456a1 = other instanceof InterfaceC21456a0 ? (InterfaceC21456a0) other : null;
            InterfaceC21463e classifier2 = interfaceC21456a1 != null ? interfaceC21456a1.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof InterfaceC21461d)) {
                return AbstractC21598x.m60663S((InterfaceC21461d) classifier).equals(AbstractC21598x.m60663S((InterfaceC21461d) classifier2));
            }
        }
        return false;
    }

    @Override // j93.InterfaceC21457b
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // j93.InterfaceC21456a0
    public List<C21462d0> getArguments() {
        return this.origin.getArguments();
    }

    @Override // j93.InterfaceC21456a0
    public InterfaceC21463e getClassifier() {
        return this.origin.getClassifier();
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @Override // j93.InterfaceC21456a0
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
