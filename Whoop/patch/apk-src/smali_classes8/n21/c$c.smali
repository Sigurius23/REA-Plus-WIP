.class public final Ln21/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln21/c;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:J


# direct methods
.method public constructor <init>(Ljava/util/List;J)V
    .locals 0

    iput-object p1, p0, Ln21/c$c;->w:Ljava/util/List;

    iput-wide p2, p0, Ln21/c$c;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo0/j;ILandroidx/compose/runtime/Composer;I)V
    .locals 18

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

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Ln21/c$c;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk71/d;

    const v2, -0x56f51a9b

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lk71/d;->b()Li91/a;

    move-result-object v7

    invoke-virtual {v1}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lk71/d;->e()Ln21/i;

    move-result-object v9

    invoke-virtual {v1}, Lk71/d;->a()Lgz0/m0;

    move-result-object v10

    iget-wide v11, v0, Ln21/c$c;->x:J

    const/16 v16, 0x0

    const/16 v17, 0xc1

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v6 .. v17}, Ln21/h;->n(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLkotlin/jvm/functions/Function1;Lb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_5
    invoke-virtual {v15}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/j;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ln21/c$c;->a(Lo0/j;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
