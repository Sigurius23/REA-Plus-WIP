package p745y81;

import androidx.compose.runtime.Composer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: y81.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ly81/h;", "Ly81/e;", "Lkotlin/Function1;", "Ly81/i;", "Li2/x;", "colorFactory", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "toComposableColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "toComposableColor", "toTestableColor-0d7_KjU", "()J", "toTestableColor", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39335h implements InterfaceC39332e {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1 colorFactory;

    public C39335h(Function1 colorFactory) {
        AbstractC22676k.m65750j(colorFactory, "colorFactory");
        this.colorFactory = colorFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C39335h.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.design.atomic.theme.color.WhoopColorProvider");
        return C17919x.m51542d(getColor(), ((C39335h) other).getColor());
    }

    public int hashCode() {
        long color = getColor();
        int i13 = C17919x.f69638o;
        return Long.hashCode(color);
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toComposableColor-WaAFU9c */
    public long mo134584toComposableColorWaAFU9c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(136216782);
        long j7 = ((C17919x) this.colorFactory.invoke(C38072d.f163053a.m121949b(c28655q, 6))).f69639a;
        c28655q.m87173q(false);
        return j7;
    }

    public String toString() {
        return AbstractC11895b.m31996o("WhoopColorProvider(", C17919x.m51548j(getColor()), ")");
    }

    @Override // p745y81.InterfaceC39332e
    /* JADX INFO: renamed from: toTestableColor-0d7_KjU */
    public long getColor() {
        return ((C17919x) this.colorFactory.invoke(AbstractC42793j.m125436c())).f69639a;
    }
}
