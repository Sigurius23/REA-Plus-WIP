.class public abstract Ly71/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "Ly71/o;",
        "a",
        "()Ljava/util/List;",
        "b",
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
.method public static final a()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly71/o;",
            ">;"
        }
    .end annotation

    sget-object v0, Ly71/o;->p:Ly71/o$c;

    const-string v9, "Title"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v10, "Description"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x3a

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v11

    const-string v12, "Title: Long"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v13, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v0 .. v8}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v14

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x2a

    const/4 v5, 0x1

    invoke-static/range {v0 .. v8}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x32

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v13

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x22

    const/4 v5, 0x1

    invoke-static/range {v0 .. v8}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    filled-new-array {v11, v14, v12, v13, v0}, [Ly71/o;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Ljava/util/List;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly71/o;",
            ">;"
        }
    .end annotation

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    const-string v0, "Title"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const v25, 0x7ffffe

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v27

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v28, "Support Text"

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const v25, 0x7ffff6

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v29

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v6, 0x2

    invoke-direct {v7, v3, v4, v6, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fffd6

    const/4 v3, 0x0

    move-object v8, v4

    move v9, v6

    const/4 v6, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move-object/from16 v32, v0

    move-object/from16 v0, v31

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v30

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->ONBOARDING:Ly71/q;

    const v25, 0x77ffd6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v31

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->OUTLINED:Ly71/q;

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v33

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->RAF_MENU_ITEM:Ly71/q;

    sget-object v3, Ly71/m$a;->w:Ly71/m$a;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    sget-object v6, Ly71/m$b;->w:Ly71/m$b;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    sget-object v8, Ly71/m$c;->w:Ly71/m$c;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    sget-object v9, Ly71/m$d;->w:Ly71/m$d;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    const v25, 0x77df84

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v9, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v34

    const-string v2, "Title Alert"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->ALERT:Ly71/q;

    sget-object v3, Ly71/m$e;->w:Ly71/m$e;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    const v25, 0x77dfd6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v35

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fffde

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v36

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    move-object/from16 v8, v18

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7effde

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v37

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fff56

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v38

    const-string v39, "Title: Long"

    invoke-static/range {v39 .. v39}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v40, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

    invoke-static/range {v40 .. v40}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v41

    invoke-static/range {v39 .. v39}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v40 .. v40}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7f7f56

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x1

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v39

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fff5e

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v40

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fff7e

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v42

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fff76

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v43

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7fbf56

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v44

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v3

    invoke-direct {v9, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v25, 0x7f3f56

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x1

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v45

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v46, "3"

    invoke-static/range {v46 .. v46}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const v25, 0x7ffdd6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v9, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v47

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v46 .. v46}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v3, "min"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const v25, 0x7ff9d6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v46

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v48, "TITLE"

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const v25, 0x7ff7d6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v49

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v50, "small subtitle"

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const v25, 0x7fe7d6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v51

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v28

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "Read Only"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const v25, 0x5fe7d6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    const/16 v23, 0x1

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v32

    const-string v2, "Download your full WHOOP Care Plan"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->o()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object/from16 v8, v18

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->DOWNLOAD_CARE_PLAN:Ly71/q;

    const v25, 0x76ffde

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    const/16 v23, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v50

    const-string v2, "Invite Friends"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "Give one month, get one month"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    move-object/from16 v8, v18

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->SHOP_PROMO:Ly71/q;

    sget-object v3, Ly71/m$f;->w:Ly71/m$f;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    const v25, 0x76dfd6

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v53, v19

    const/16 v19, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v48

    const-string v2, "My account"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "Billing & More"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v7, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v7, v3, v0, v4, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    move-object/from16 v8, v18

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Ly71/q;->SHOP:Ly71/q;

    sget-object v0, Ly71/m$g;->w:Ly71/m$g;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v52

    move-object/from16 v54, v48

    move-object/from16 v48, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v33

    move-object/from16 v33, v35

    move-object/from16 v35, v37

    move-object/from16 v37, v41

    move-object/from16 v41, v43

    move-object/from16 v43, v45

    move-object/from16 v45, v46

    move-object/from16 v46, v49

    move-object/from16 v49, v32

    move-object/from16 v32, v34

    move-object/from16 v34, v36

    move-object/from16 v36, v38

    move-object/from16 v38, v39

    move-object/from16 v39, v40

    move-object/from16 v40, v42

    move-object/from16 v42, v44

    move-object/from16 v44, v47

    move-object/from16 v47, v51

    move-object/from16 v51, v54

    filled-new-array/range {v27 .. v52}, [Ly71/o;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
