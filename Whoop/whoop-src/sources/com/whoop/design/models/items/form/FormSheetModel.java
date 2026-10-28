package com.whoop.design.models.items.form;

import com.whoop.design.models.items.CardButtonModel;
import o91.C27687d;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormSheetModel;", "", "id", "", "type", "Lcom/whoop/design/models/items/form/FormSheetType;", "title", "content", "Lcom/whoop/design/models/items/form/FormSheetContent;", "cancelButton", "Lcom/whoop/design/models/items/CardButtonModel;", "confirmButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/form/FormSheetType;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormSheetContent;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/whoop/design/models/items/form/FormSheetType;", "getTitle", "getContent", "()Lcom/whoop/design/models/items/form/FormSheetContent;", "getCancelButton", "()Lcom/whoop/design/models/items/CardButtonModel;", "getConfirmButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C27687d.class)
public final /* data */ class FormSheetModel {
    private final CardButtonModel cancelButton;
    private final CardButtonModel confirmButton;
    private final FormSheetContent content;
    private final String id;
    private final String title;
    private final FormSheetType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormSheetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/form/FormSheetModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C27687d.f111455a;
        }

        private Companion() {
        }
    }

    public FormSheetModel(String id4, FormSheetType type, String title, FormSheetContent content, CardButtonModel cancelButton, CardButtonModel confirmButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        this.id = id4;
        this.type = type;
        this.title = title;
        this.content = content;
        this.cancelButton = cancelButton;
        this.confirmButton = confirmButton;
    }

    public static /* synthetic */ FormSheetModel copy$default(FormSheetModel formSheetModel, String str, FormSheetType formSheetType, String str2, FormSheetContent formSheetContent, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = formSheetModel.id;
        }
        if ((i13 & 2) != 0) {
            formSheetType = formSheetModel.type;
        }
        if ((i13 & 4) != 0) {
            str2 = formSheetModel.title;
        }
        if ((i13 & 8) != 0) {
            formSheetContent = formSheetModel.content;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = formSheetModel.cancelButton;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel2 = formSheetModel.confirmButton;
        }
        CardButtonModel cardButtonModel3 = cardButtonModel;
        CardButtonModel cardButtonModel4 = cardButtonModel2;
        return formSheetModel.copy(str, formSheetType, str2, formSheetContent, cardButtonModel3, cardButtonModel4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FormSheetType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormSheetContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getCancelButton() {
        return this.cancelButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getConfirmButton() {
        return this.confirmButton;
    }

    public final FormSheetModel copy(String id4, FormSheetType type, String title, FormSheetContent content, CardButtonModel cancelButton, CardButtonModel confirmButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        return new FormSheetModel(id4, type, title, content, cancelButton, confirmButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormSheetModel)) {
            return false;
        }
        FormSheetModel formSheetModel = (FormSheetModel) other;
        return AbstractC22676k.m65745e(this.id, formSheetModel.id) && this.type == formSheetModel.type && AbstractC22676k.m65745e(this.title, formSheetModel.title) && AbstractC22676k.m65745e(this.content, formSheetModel.content) && AbstractC22676k.m65745e(this.cancelButton, formSheetModel.cancelButton) && AbstractC22676k.m65745e(this.confirmButton, formSheetModel.confirmButton);
    }

    public final CardButtonModel getCancelButton() {
        return this.cancelButton;
    }

    public final CardButtonModel getConfirmButton() {
        return this.confirmButton;
    }

    public final FormSheetContent getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final FormSheetType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.confirmButton.hashCode() + ((this.cancelButton.hashCode() + ((this.content.hashCode() + AbstractC11266d.m30450d((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title)) * 31)) * 31);
    }

    public String toString() {
        return "FormSheetModel(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", content=" + this.content + ", cancelButton=" + this.cancelButton + ", confirmButton=" + this.confirmButton + ")";
    }
}
