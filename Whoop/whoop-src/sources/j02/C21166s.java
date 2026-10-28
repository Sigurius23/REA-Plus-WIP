package j02;

import com.whoop.navigation.PopUpToModel;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j02.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lj02/s;", "", "Lj02/v;", "type", "Lcom/whoop/navigation/PopUpToModel;", "popUpTo", "", "popBackCount", "<init>", "(Lj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/v;", "c", "()Lj02/v;", "b", "Lcom/whoop/navigation/PopUpToModel;", "()Lcom/whoop/navigation/PopUpToModel;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21166s {

    /* JADX INFO: renamed from: d */
    public static final int f80697d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21172v type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PopUpToModel popUpTo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer popBackCount;

    public C21166s(EnumC21172v type, PopUpToModel popUpToModel, Integer num) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.popUpTo = popUpToModel;
        this.popBackCount = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getPopBackCount() {
        return this.popBackCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PopUpToModel getPopUpTo() {
        return this.popUpTo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC21172v getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21166s)) {
            return false;
        }
        C21166s c21166s = (C21166s) other;
        return this.type == c21166s.type && AbstractC22676k.m65745e(this.popUpTo, c21166s.popUpTo) && AbstractC22676k.m65745e(this.popBackCount, c21166s.popBackCount);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        PopUpToModel popUpToModel = this.popUpTo;
        int iHashCode2 = (iHashCode + (popUpToModel == null ? 0 : popUpToModel.hashCode())) * 31;
        Integer num = this.popBackCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        EnumC21172v enumC21172v = this.type;
        PopUpToModel popUpToModel = this.popUpTo;
        Integer num = this.popBackCount;
        StringBuilder sb4 = new StringBuilder("DismissEvent(type=");
        sb4.append(enumC21172v);
        sb4.append(", popUpTo=");
        sb4.append(popUpToModel);
        sb4.append(", popBackCount=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }

    public /* synthetic */ C21166s(EnumC21172v enumC21172v, PopUpToModel popUpToModel, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC21172v.AUTO : enumC21172v, (i13 & 2) != 0 ? null : popUpToModel, (i13 & 4) != 0 ? null : num);
    }
}
