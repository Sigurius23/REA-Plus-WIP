.class public final Ll1/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Ll1/n3;

.field public final synthetic G:Ll1/y;

.field public final synthetic w:Li93/j;

.field public final synthetic x:Lm1/o;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Li93/j;Lm1/o;IILkotlin/jvm/functions/Function1;Ll1/n3;Ll1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/d1;->w:Li93/j;

    iput-object p2, p0, Ll1/d1;->x:Lm1/o;

    iput p3, p0, Ll1/d1;->y:I

    iput p4, p0, Ll1/d1;->z:I

    iput-object p5, p0, Ll1/d1;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll1/d1;->F:Ll1/n3;

    iput-object p7, p0, Ll1/d1;->G:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lo0/j;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object/from16 v2, p3

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x30

    if-nez v4, :cond_1

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x20

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit16 v4, v3, 0x91

    const/16 v5, 0x90

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_2

    move v4, v7

    goto :goto_1

    :cond_2
    move v4, v6

    :goto_1
    and-int/2addr v3, v7

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v0, Ll1/d1;->w:Li93/j;

    iget v3, v3, Li93/h;->w:I

    add-int/2addr v1, v3

    iget-object v3, v0, Ll1/d1;->x:Lm1/o;

    iget-object v3, v3, Lm1/o;->a:Ljava/util/Locale;

    invoke-static {v1, v3}, Ll1/j;->a(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    sget v3, Lo1/g;->z:F

    sget v4, Lo1/g;->y:F

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3, v4}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    iget v3, v0, Ll1/d1;->y:I

    if-ne v1, v3, :cond_3

    move v10, v7

    goto :goto_2

    :cond_3
    move v10, v6

    :goto_2
    iget v3, v0, Ll1/d1;->z:I

    if-ne v1, v3, :cond_4

    move v11, v7

    goto :goto_3

    :cond_4
    move v11, v6

    :goto_3
    iget-object v3, v0, Ll1/d1;->E:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2, v1}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Ldn0/l;

    const/4 v4, 0x3

    invoke-direct {v5, v3, v1, v4}, Ldn0/l;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v12, v5

    check-cast v12, Lc93/a;

    iget-object v3, v0, Ll1/d1;->F:Ll1/n3;

    invoke-interface {v3, v1}, Ll1/n3;->isSelectableYear(I)Z

    move-result v13

    const v1, 0x7f1407d7

    invoke-static {v2, v1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v0, Ll1/d1;->G:Ll1/y;

    const/16 v17, 0x30

    move-object/from16 v16, v2

    invoke-static/range {v8 .. v17}, Ll1/f1;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLc93/a;ZLjava/lang/String;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    move-object/from16 v16, v2

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
