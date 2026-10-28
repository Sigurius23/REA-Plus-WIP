package v02;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v02.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lv02/b;", "", "Lcom/google/gson/Gson;", "gson", "Lad3/c;", "kotlinSerialization", "<init>", "(Lcom/google/gson/Gson;Lad3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/gson/Gson;", "()Lcom/google/gson/Gson;", "b", "Lad3/c;", "()Lad3/c;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35513b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Gson gson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c kotlinSerialization;

    public C35513b(Gson gson, AbstractC0757c abstractC0757c) {
        this.gson = gson;
        this.kotlinSerialization = abstractC0757c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Gson getGson() {
        return this.gson;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC0757c getKotlinSerialization() {
        return this.kotlinSerialization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35513b)) {
            return false;
        }
        C35513b c35513b = (C35513b) other;
        return AbstractC22676k.m65745e(this.gson, c35513b.gson) && AbstractC22676k.m65745e(this.kotlinSerialization, c35513b.kotlinSerialization);
    }

    public int hashCode() {
        Gson gson = this.gson;
        int iHashCode = (gson == null ? 0 : gson.hashCode()) * 31;
        AbstractC0757c abstractC0757c = this.kotlinSerialization;
        return iHashCode + (abstractC0757c != null ? abstractC0757c.hashCode() : 0);
    }

    public String toString() {
        return "KtorClientSerializationLibraryWrapper(gson=" + this.gson + ", kotlinSerialization=" + this.kotlinSerialization + ")";
    }

    public /* synthetic */ C35513b(Gson gson, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : gson, (i13 & 2) != 0 ? null : abstractC0757c);
    }
}
