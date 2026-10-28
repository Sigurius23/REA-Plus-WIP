.class public final Lo51/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo51/c;->v(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 25

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x764fde18

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    new-instance v9, Lo51/f;

    const-string v0, "M"

    const-string v1, "6M"

    const-string v4, "W"

    filled-new-array {v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v9, v2, v0}, Lo51/f;-><init>(ILjava/util/List;)V

    new-instance v10, Li11/f;

    const-string v0, "MAR 2nd - MAR 9, 22"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/16 v21, 0x3c1

    const/16 v22, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x1

    const-string v14, "test2"

    const/4 v15, 0x1

    const-string v16, "test"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v10 .. v22}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Li11/f;

    const-string v0, "MAR 2nd - APR 2, 22"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v22, 0x3c1

    const/16 v23, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x1

    const-string v15, "test2"

    const/16 v16, 0x1

    const-string v17, "test"

    const/16 v21, 0x0

    invoke-direct/range {v11 .. v23}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Li11/f;

    const-string v0, "MAR 2nd - SEP 9, 22"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v23, 0x3c1

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x1

    const-string v16, "test2"

    const/16 v17, 0x1

    const-string v18, "test"

    const/16 v22, 0x0

    invoke-direct/range {v12 .. v24}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7, v3}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v13

    invoke-static {}, Lr61/e;->x()Lj71/c;

    move-result-object v14

    invoke-static {v7, v3}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v15

    const-string v0, "Manual Value"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lo51/c$e;->w:Lo51/c$e;

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v17

    sget-object v20, Ln21/i;->THIN_CAPSULE:Ln21/i;

    new-instance v16, Lk71/d;

    const/16 v22, 0x14

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    const-string v2, "Whoop Estimate"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    sget-object v2, Lo51/c$f;->w:Lo51/c$f;

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v17

    sget-object v20, Ln21/i;->BAR_AND_CAPSULE:Ln21/i;

    new-instance v16, Lk71/d;

    const/16 v22, 0x14

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    filled-new-array {v0, v1}, [Lk71/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    new-instance v5, Lo51/d;

    const/16 v16, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v17}, Lo51/d;-><init>(Lo51/f;Li11/f;Li11/f;Li11/f;Lm91/u;Lm91/u;Lm91/u;Lo51/e;Ljava/util/List;)V

    const/4 v8, 0x6

    const/4 v9, 0x4

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lo51/c;->j(Landroidx/compose/ui/Modifier;Lo51/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-void

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo51/c$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
