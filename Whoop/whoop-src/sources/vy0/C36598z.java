package vy0;

import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vy0.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lvy0/z;", "", "", "title", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36598z {

    /* JADX INFO: renamed from: d */
    public static final int f156779d = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    public C36598z(String title, GenericInteraction interaction, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(interaction, "interaction");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.interaction = interaction;
        this.icon = icon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36598z)) {
            return false;
        }
        C36598z c36598z = (C36598z) other;
        return AbstractC22676k.m65745e(this.title, c36598z.title) && AbstractC22676k.m65745e(this.interaction, c36598z.interaction) && this.icon == c36598z.icon;
    }

    public int hashCode() {
        return this.icon.hashCode() + ((this.interaction.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "FabMenuItemState(title=" + this.title + ", interaction=" + this.interaction + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ C36598z(String str, GenericInteraction genericInteraction, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            genericInteraction = new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null);
        }
        this(str, genericInteraction, enumC16313m0);
    }
}
