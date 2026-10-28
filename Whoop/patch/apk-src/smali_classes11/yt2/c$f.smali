.class public final Lyt2/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyt2/c;->t(Lwt2/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lkotlin/jvm/functions/Function1;

.field final synthetic y:Lc93/a;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lyt2/c$f;->w:Ljava/util/List;

    iput-object p2, p0, Lyt2/c$f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lyt2/c$f;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    move v3, v6

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lyt2/c$f;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lzt2/h;

    const v1, -0x173fe81c

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/16 v25, 0x1eff

    const/16 v26, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v11 .. v26}, Lzt2/h;->b(Lzt2/h;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;Ljava/util/List;Lhy0/f;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lzt2/h;

    move-result-object v6

    iget-object v1, v0, Lyt2/c$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_5

    if-ne v2, v3, :cond_6

    :cond_5
    new-instance v2, Lyt2/c$b;

    iget-object v1, v0, Lyt2/c$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v1}, Lyt2/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lyt2/c$f;->y:Lc93/a;

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    if-ne v2, v3, :cond_8

    :cond_7
    new-instance v2, Lyt2/c$c;

    iget-object v1, v0, Lyt2/c$f;->y:Lc93/a;

    invoke-direct {v2, v1}, Lyt2/c$c;-><init>(Lc93/a;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v9, v2

    check-cast v9, Lc93/a;

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v7, 0x0

    invoke-static/range {v6 .. v12}, Lzt2/i;->h(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v10}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lyt2/c$f;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
