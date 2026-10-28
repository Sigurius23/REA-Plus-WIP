.class public abstract Lmo0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "Ljb1/a;",
        "designItemReducer",
        "",
        "textOverride",
        "",
        "isError",
        "errorMessageOverride",
        "Llo0/j0;",
        "a",
        "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Ljb1/a;Ljava/lang/String;ZLjava/lang/String;)Llo0/j0;",
        "clinician-in-the-loop_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/design/models/items/form/FormTextFieldModel;Ljb1/a;Ljava/lang/String;ZLjava/lang/String;)Llo0/j0;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llo0/j0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getKeyboardType()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getHintText()Ljava/lang/String;

    move-result-object v5

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getText()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, p2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getValidRegex()Ljava/lang/String;

    move-result-object v7

    if-nez p4, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object/from16 v8, p4

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getDisabled()Z

    move-result v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getSelectionSheet()Lcom/whoop/design/models/items/form/FormSheetModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p1}, Lmo0/g;->a(Lcom/whoop/design/models/items/form/FormSheetModel;Ljb1/a;)Llo0/i0;

    move-result-object p1

    :goto_2
    move-object v10, p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired()Z

    move-result v11

    move/from16 v12, p3

    invoke-direct/range {v1 .. v12}, Llo0/j0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLlo0/i0;ZZ)V

    return-object v1
.end method
