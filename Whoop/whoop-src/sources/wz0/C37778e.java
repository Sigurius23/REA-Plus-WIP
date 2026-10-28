package wz0;

import com.whoop.navigation.models.GenericInteraction;
import i51.EnumC18104a;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, m65681d2 = {"Lwz0/e;", "Lm91/u;", "", "Lwz0/f;", "steps", "Li51/a;", "repeatMode", "Ly3/f;", "height", "width", "Lcom/whoop/navigation/models/GenericInteraction;", "onCompleteInteraction", "<init>", "(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Li51/a;", "c", "()Li51/a;", "F", "()F", "d", "Ly3/f;", "f", "()Ly3/f;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37778e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C37779f> steps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC18104a repeatMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39174f width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final GenericInteraction onCompleteInteraction;

    public /* synthetic */ C37778e(List list, EnumC18104a enumC18104a, float f13, C39174f c39174f, GenericInteraction genericInteraction, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, enumC18104a, f13, c39174f, genericInteraction);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getOnCompleteInteraction() {
        return this.onCompleteInteraction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC18104a getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: e */
    public final List<C37779f> m121229e() {
        return this.steps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37778e)) {
            return false;
        }
        C37778e c37778e = (C37778e) other;
        return AbstractC22676k.m65745e(this.steps, c37778e.steps) && this.repeatMode == c37778e.repeatMode && C39174f.m124782b(this.height, c37778e.height) && AbstractC22676k.m65745e(this.width, c37778e.width) && AbstractC22676k.m65745e(this.onCompleteInteraction, c37778e.onCompleteInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C39174f getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.height, (this.repeatMode.hashCode() + (this.steps.hashCode() * 31)) * 31, 31);
        C39174f c39174f = this.width;
        int iHashCode = (iM30447a + (c39174f == null ? 0 : Float.hashCode(c39174f.f168413w))) * 31;
        GenericInteraction genericInteraction = this.onCompleteInteraction;
        return iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        List<C37779f> list = this.steps;
        EnumC18104a enumC18104a = this.repeatMode;
        String strM124783c = C39174f.m124783c(this.height);
        C39174f c39174f = this.width;
        GenericInteraction genericInteraction = this.onCompleteInteraction;
        StringBuilder sb4 = new StringBuilder("AnimatedSequenceState(steps=");
        sb4.append(list);
        sb4.append(", repeatMode=");
        sb4.append(enumC18104a);
        sb4.append(", height=");
        sb4.append(strM124783c);
        sb4.append(", width=");
        sb4.append(c39174f);
        sb4.append(", onCompleteInteraction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }

    private C37778e(List<C37779f> steps, EnumC18104a repeatMode, float f13, C39174f c39174f, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(repeatMode, "repeatMode");
        this.steps = steps;
        this.repeatMode = repeatMode;
        this.height = f13;
        this.width = c39174f;
        this.onCompleteInteraction = genericInteraction;
    }
}
