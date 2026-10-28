.class public abstract Lmo0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/design/models/items/form/FormSheetModel;",
        "Ljb1/a;",
        "designItemReducer",
        "Llo0/i0;",
        "a",
        "(Lcom/whoop/design/models/items/form/FormSheetModel;Ljb1/a;)Llo0/i0;",
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
.method public static final a(Lcom/whoop/design/models/items/form/FormSheetModel;Ljb1/a;)Llo0/i0;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getContent()Lcom/whoop/design/models/items/form/FormSheetContent;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast v0, Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;->getItems()Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    instance-of v1, p1, Ln01/e;

    if-eqz v1, :cond_0

    check-cast p1, Ln01/e;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;->getSearchField()Lcom/whoop/design/models/items/SearchFieldModel;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Llo0/u0;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SearchFieldModel;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SearchFieldModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Llo0/u0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    new-instance v0, Llo0/h0;

    invoke-direct {v0, v1, p1}, Llo0/h0;-><init>(Llo0/u0;Ln01/e;)V

    move-object v7, v0

    goto :goto_2

    :cond_3
    instance-of p1, v0, Lcom/whoop/design/models/items/form/FormSheetDateContent;

    if-eqz p1, :cond_4

    new-instance p1, Llo0/g0;

    check-cast v0, Lcom/whoop/design/models/items/form/FormSheetDateContent;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getDateLowerBound()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getDateUpperBound()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getStartingDate()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v1, v3, v0}, Llo0/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, p1

    :goto_2
    new-instance v4, Llo0/i0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getCancelButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v2, v0, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getConfirmButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    invoke-static {p0, v2, v0, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v9

    invoke-direct/range {v4 .. v9}, Llo0/i0;-><init>(Ljava/lang/String;Ljava/lang/String;Llo0/f0;Lny0/h;Lny0/h;)V

    return-object v4

    :cond_4
    sget-object p0, Lcom/whoop/design/models/items/form/UnknownFormSheetContent;->INSTANCE:Lcom/whoop/design/models/items/form/UnknownFormSheetContent;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    :goto_3
    return-object v2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
