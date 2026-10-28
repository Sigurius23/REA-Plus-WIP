.class public final Lyt2/m$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyt2/m;->I(Lwt2/q$c;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lkotlin/jvm/functions/Function1;

.field final synthetic F:Lkotlin/jvm/functions/Function1;

.field final synthetic G:Lp1/c1;

.field final synthetic H:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lwt2/n;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lv41/f$a;


# direct methods
.method public constructor <init>(Ljava/util/List;Lwt2/n;Lbc3/c0;Lv41/f$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lyt2/m$g;->w:Ljava/util/List;

    iput-object p2, p0, Lyt2/m$g;->x:Lwt2/n;

    iput-object p3, p0, Lyt2/m$g;->y:Lbc3/c0;

    iput-object p4, p0, Lyt2/m$g;->z:Lv41/f$a;

    iput-object p5, p0, Lyt2/m$g;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lyt2/m$g;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lyt2/m$g;->G:Lp1/c1;

    iput-object p8, p0, Lyt2/m$g;->H:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 28

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

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lyt2/m$g;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lzt2/h;

    const v1, 0x54dccc25

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lyt2/m$g;->x:Lwt2/n;

    invoke-virtual {v1}, Lwt2/n;->d()Le11/d;

    move-result-object v1

    if-nez v1, :cond_5

    move/from16 v21, v6

    goto :goto_4

    :cond_5
    move/from16 v21, v5

    :goto_4
    const/16 v26, 0x1eff

    const/16 v27, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v12 .. v27}, Lzt2/h;->b(Lzt2/h;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;Ljava/util/List;Lhy0/f;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lzt2/h;

    move-result-object v7

    iget-object v1, v0, Lyt2/m$g;->y:Lbc3/c0;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lyt2/m$g;->z:Lv41/f$a;

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lyt2/m$g;->E:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_6

    if-ne v2, v3, :cond_7

    :cond_6
    new-instance v12, Lyt2/m$b;

    iget-object v13, v0, Lyt2/m$g;->y:Lbc3/c0;

    iget-object v14, v0, Lyt2/m$g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lyt2/m$g;->z:Lv41/f$a;

    iget-object v1, v0, Lyt2/m$g;->G:Lp1/c1;

    iget-object v2, v0, Lyt2/m$g;->H:Lp1/c1;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    invoke-direct/range {v12 .. v17}, Lyt2/m$b;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v12

    :cond_7
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lyt2/m$g;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    if-ne v2, v3, :cond_9

    :cond_8
    new-instance v2, Lyt2/m$c;

    iget-object v1, v0, Lyt2/m$g;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v1}, Lyt2/m$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v10, v2

    check-cast v10, Lc93/a;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v8, 0x0

    invoke-static/range {v7 .. v13}, Lzt2/i;->h(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_a
    invoke-virtual {v11}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lyt2/m$g;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
