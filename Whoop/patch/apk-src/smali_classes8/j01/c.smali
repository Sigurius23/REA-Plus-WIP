.class public abstract Lj01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lj01/d;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "design_release"
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
.method public static final a(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lj01/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj01/d;

    new-instance v1, Lc41/t0;

    new-instance v2, Lc41/u0$e;

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/g0;->d()I

    move-result v3

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    const-string v11, "ALARM ON"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v12, "8:00am"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v13, "PLAN YOUR\nBEDTIME"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object v14, v4

    const/16 v6, 0xb

    const/4 v7, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    move-object v8, v1

    const-string v1, "SLEEP PLANNER"

    const-string v2, "11:23pm"

    const-string v3, "BED TIME"

    const-string v4, "8:45h"

    const-string v5, "TIME IN BED"

    const-string v6, "8:00am"

    const-string v7, "WAKETIME"

    invoke-direct/range {v0 .. v9}, Lj01/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc41/t0;Lcom/whoop/navigation/e;)V

    new-instance v15, Lj01/d;

    new-instance v1, Lc41/t0;

    new-instance v4, Lc41/u0$e;

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/g0;->d()I

    move-result v5

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v6, v14

    invoke-direct/range {v4 .. v9}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/navigation/e;

    sget-object v3, Lcom/whoop/navigation/AppScreen$n5;->w:Lcom/whoop/navigation/AppScreen$n5;

    sget-object v4, Lcom/whoop/navigation/NavigationScreenModel$None;->INSTANCE:Lcom/whoop/navigation/NavigationScreenModel$None;

    const/4 v6, 0x4

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v16, "SLEEP PLANNER"

    const-string v17, "11:23pm"

    const-string v18, "BED TIME"

    const-string v19, "8:45h"

    const-string v20, "TIME IN BED"

    const-string v21, "8:00am"

    const-string v22, "WAKETIME"

    move-object/from16 v23, v1

    move-object/from16 v24, v2

    invoke-direct/range {v15 .. v24}, Lj01/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc41/t0;Lcom/whoop/navigation/e;)V

    filled-new-array {v0, v15}, [Lj01/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
