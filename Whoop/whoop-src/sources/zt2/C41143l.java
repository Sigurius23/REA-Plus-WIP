package zt2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zt2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lzt2/l;", "", "Lcom/whoop/design/util/TextResource;", "number", "Lgz0/m0;", "icon", "", "isSelected", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lgz0/m0;", "()Lgz0/m0;", "c", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41143l {

    /* JADX INFO: renamed from: d */
    public static final int f177369d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    public C41143l(TextResource textResource, EnumC16313m0 enumC16313m0, boolean z4) {
        this.number = textResource;
        this.icon = enumC16313m0;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41143l)) {
            return false;
        }
        C41143l c41143l = (C41143l) other;
        return AbstractC22676k.m65745e(this.number, c41143l.number) && this.icon == c41143l.icon && this.isSelected == c41143l.isSelected;
    }

    public int hashCode() {
        TextResource textResource = this.number;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return Boolean.hashCode(this.isSelected) + ((iHashCode + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.number;
        EnumC16313m0 enumC16313m0 = this.icon;
        return AbstractC18489d0.m53372m(AbstractC21702c.m61140k("RecoveriesCounterItemState(number=", textResource, ", icon=", enumC16313m0, ", isSelected="), this.isSelected, ")");
    }
}
