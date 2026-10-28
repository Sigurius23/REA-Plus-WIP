package p745y81;

import androidx.compose.runtime.Composer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y81.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, m65681d2 = {"Ly81/d;", "Ly81/e;", "Li2/x;", "color", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toComposableColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "toComposableColor", "toTestableColor-0d7_KjU", "()J", "toTestableColor", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "J", "getColor-0d7_KjU", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39331d implements InterfaceC39332e {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final long color;

    public /* synthetic */ C39331d(long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C39331d) && C17919x.m51542d(this.color, ((C39331d) other).color);
    }

    public int hashCode() {
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return Long.hashCode(j7);
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toComposableColor-WaAFU9c, reason: not valid java name */
    public long mo134584toComposableColorWaAFU9c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1827064735);
        long j7 = this.color;
        c28655q.m87173q(false);
        return j7;
    }

    public String toString() {
        return AbstractC11895b.m31996o("SimpleColorProvider(color=", C17919x.m51548j(this.color), ")");
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toTestableColor-0d7_KjU, reason: not valid java name and from getter */
    public long getColor() {
        return this.color;
    }

    private C39331d(long j7) {
        this.color = j7;
    }
}
