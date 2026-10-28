package vl2;

import com.whoop.design.models.DesignSystemModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lvl2/d;", "Lcom/whoop/design/models/DesignSystemModel;", "", "type", "Lvl2/c;", "content", "<init>", "(Ljava/lang/String;Lvl2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lvl2/c;", "()Lvl2/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36111d implements DesignSystemModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36110c content;

    public C36111d(String type, C36110c content) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        this.type = type;
        this.content = content;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36110c getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36111d)) {
            return false;
        }
        C36111d c36111d = (C36111d) other;
        return AbstractC22676k.m65745e(this.type, c36111d.type) && AbstractC22676k.m65745e(this.content, c36111d.content);
    }

    public int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "MeasurementDomainState(type=" + this.type + ", content=" + this.content + ")";
    }
}
