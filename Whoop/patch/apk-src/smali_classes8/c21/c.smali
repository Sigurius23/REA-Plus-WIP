.class public abstract Lc21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lc21/d;",
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
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lc21/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc21/d;

    new-instance v1, Lc21/e;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->h()I

    move-result v2

    invoke-static {v7}, Lb9/y;->c(Lx81/d;)I

    move-result v4

    sget-object v12, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v13, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    const-string v3, "RESP."

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v1 .. v6}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    new-instance v14, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->k()I

    move-result v15

    invoke-static {v7}, Lih0/d0;->c(Lx81/d;)I

    move-result v17

    sget-object v18, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v19, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    const-string v16, "SPO2"

    invoke-direct/range {v14 .. v19}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    new-instance v20, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->i()I

    move-result v21

    invoke-static {v7}, Lih0/d0;->c(Lx81/d;)I

    move-result v23

    sget-object v24, Ly81/f;->ACCENT_ALERT:Ly81/f;

    sget-object v25, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    const-string v22, "RHR"

    invoke-direct/range {v20 .. v25}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v2, v20

    new-instance v8, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a0;->d()I

    move-result v9

    const-string v10, "HRV"

    invoke-static {v7}, Lb9/y;->c(Lx81/d;)I

    move-result v11

    invoke-direct/range {v8 .. v13}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    new-instance v26, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a0;->e()I

    move-result v27

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/i0;->A()I

    move-result v29

    sget-object v30, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v31, Ly81/f;->WHITE_10:Ly81/f;

    const-string v28, "MAX"

    invoke-direct/range {v26 .. v31}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v3, v26

    filled-new-array {v1, v14, v2, v8, v3}, [Lc21/e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "HEALTH MONITOR"

    invoke-direct {v0, v3, v1, v2}, Lc21/d;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V

    new-instance v1, Lc21/d;

    new-instance v8, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a0;->h()I

    move-result v9

    const-string v10, "RESP."

    invoke-static {v7}, Lb9/y;->c(Lx81/d;)I

    move-result v11

    invoke-direct/range {v8 .. v13}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object v2, v8

    move-object/from16 v22, v18

    new-instance v18, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->k()I

    move-result v4

    const-string v20, "SPO2"

    invoke-static {v7}, Lih0/d0;->c(Lx81/d;)I

    move-result v21

    move-object/from16 v23, v19

    move/from16 v19, v4

    invoke-direct/range {v18 .. v23}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v4, v18

    move-object/from16 v28, v24

    new-instance v24, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/a0;->i()I

    move-result v5

    const-string v26, "RHR"

    invoke-static {v7}, Lih0/d0;->c(Lx81/d;)I

    move-result v27

    move-object/from16 v29, v25

    move/from16 v25, v5

    invoke-direct/range {v24 .. v29}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v5, v24

    new-instance v8, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/a0;->d()I

    move-result v9

    const-string v10, "HRV"

    invoke-static {v7}, Lb9/y;->c(Lx81/d;)I

    move-result v11

    invoke-direct/range {v8 .. v13}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v34, v30

    new-instance v30, Lc21/e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/a0;->e()I

    move-result v6

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/i0;->A()I

    move-result v33

    const-string v32, "MAX"

    move-object/from16 v35, v31

    move/from16 v31, v6

    invoke-direct/range {v30 .. v35}, Lc21/e;-><init>(ILjava/lang/String;ILy81/e;Ly81/e;)V

    move-object/from16 v6, v30

    filled-new-array {v2, v4, v5, v8, v6}, [Lc21/e;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3, v2, v4}, Lc21/d;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V

    filled-new-array {v0, v1}, [Lc21/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
