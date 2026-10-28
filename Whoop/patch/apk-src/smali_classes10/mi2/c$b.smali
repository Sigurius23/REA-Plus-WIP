.class public final Lmi2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmi2/c;->q(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lji2/e;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lji2/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lmi2/c$b;->w:Ljava/util/List;

    iput-object p2, p0, Lmi2/c$b;->x:Lji2/e;

    iput-object p3, p0, Lmi2/c$b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lmi2/c$b;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji2/c;

    const v4, -0x3afe0e61

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    if-nez v1, :cond_5

    const v1, -0x3afde365

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    iget-object v1, v0, Lmi2/c$b;->x:Lji2/e;

    invoke-virtual {v1}, Lji2/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit8 v19, v1, 0x6

    const/16 v20, 0xf6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v5

    invoke-static/range {v8 .. v20}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v18

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    move-object v1, v5

    const v3, -0x3afada56

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    :goto_4
    iget-object v3, v0, Lmi2/c$b;->y:Lkotlin/jvm/functions/Function1;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v5, Lkd1/o;->a:I

    or-int/2addr v4, v5

    invoke-static {v2, v3, v1, v4}, Lmi2/c;->B(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_6
    move-object v1, v5

    invoke-virtual {v1}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lmi2/c$b;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
