package dl0;

import com.whoop.design.models.DesignSystemModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ldl0/c;", "", "Ldl0/a;", "currentDialogType", "Lcom/whoop/design/models/DesignSystemModel;", "widget", "<init>", "(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldl0/a;", "()Ldl0/a;", "b", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12164c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC12162a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DesignSystemModel widget;

    public C12164c(InterfaceC12162a interfaceC12162a, DesignSystemModel designSystemModel) {
        this.currentDialogType = interfaceC12162a;
        this.widget = designSystemModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC12162a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DesignSystemModel getWidget() {
        return this.widget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12164c)) {
            return false;
        }
        C12164c c12164c = (C12164c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c12164c.currentDialogType) && AbstractC22676k.m65745e(this.widget, c12164c.widget);
    }

    public int hashCode() {
        InterfaceC12162a interfaceC12162a = this.currentDialogType;
        int iHashCode = (interfaceC12162a == null ? 0 : interfaceC12162a.hashCode()) * 31;
        DesignSystemModel designSystemModel = this.widget;
        return iHashCode + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        return "ChatMiniArchWidgetDomainState(currentDialogType=" + this.currentDialogType + ", widget=" + this.widget + ")";
    }

    public /* synthetic */ C12164c(InterfaceC12162a interfaceC12162a, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC12162a, (i13 & 2) != 0 ? null : designSystemModel);
    }
}
