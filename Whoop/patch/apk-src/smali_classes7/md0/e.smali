.class public abstract Lmd0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lny0/h;",
        "button",
        "Lkd0/c$b;",
        "responseDialog",
        "Lmd0/f;",
        "b",
        "(Lny0/h;Lkd0/c$b;)Lmd0/f;",
        "Lcom/whoop/design/models/modal/DialogButton;",
        "a",
        "(Lcom/whoop/design/models/modal/DialogButton;)Lny0/h;",
        "Lcom/whoop/design/models/modal/DialogModel;",
        "c",
        "(Lcom/whoop/design/models/modal/DialogModel;)Lkd0/c$b;",
        "advanced-labs_release"
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
.method public static final a(Lcom/whoop/design/models/modal/DialogButton;)Lny0/h;
    .locals 29

    const-string v0, "button"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lny0/h;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v8, Lny0/p;->DEFAULT:Lny0/p;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/modal/DialogButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v9, Lcom/whoop/navigation/e;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v9, v0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/modal/DialogButton;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v10

    sget-object v12, Lny0/g;->COMPACT:Lny0/g;

    const v27, 0x1f61a0c

    const/16 v28, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v1 .. v28}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final b(Lny0/h;Lkd0/c$b;)Lmd0/f;
    .locals 3

    const-string v0, "button"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/design/models/modal/AnyModal;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    sget-object p0, Lmd0/f$c;->a:Lmd0/f$c;

    return-object p0

    :cond_1
    sget-object p0, Lmd0/f$a;->a:Lmd0/f$a;

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v0

    instance-of v2, v0, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/models/modal/DialogModel;

    :cond_3
    if-nez v1, :cond_5

    if-eqz p1, :cond_4

    sget-object p0, Lmd0/f$c;->a:Lmd0/f$c;

    return-object p0

    :cond_4
    sget-object p0, Lmd0/f$a;->a:Lmd0/f$a;

    return-object p0

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance p1, Lmd0/f$b;

    invoke-direct {p1, p0}, Lmd0/f$b;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object p1

    :cond_6
    if-eqz p1, :cond_7

    sget-object p0, Lmd0/f$c;->a:Lmd0/f$c;

    return-object p0

    :cond_7
    sget-object p0, Lmd0/f$a;->a:Lmd0/f$a;

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/modal/DialogModel;)Lkd0/c$b;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lmd0/e;->a(Lcom/whoop/design/models/modal/DialogButton;)Lny0/h;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lmd0/e;->a(Lcom/whoop/design/models/modal/DialogButton;)Lny0/h;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lkd0/c$b;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogModel;->getDescription()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-nez p0, :cond_3

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    :cond_3
    invoke-direct {v1, v3, p0, v0, v2}, Lkd0/c$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Lny0/h;)V

    :cond_4
    :goto_0
    return-object v1
.end method
