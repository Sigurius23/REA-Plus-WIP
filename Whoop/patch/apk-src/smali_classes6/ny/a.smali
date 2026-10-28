.class public final Lny/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lny/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lny/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lny/a;->w:Lny/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p1

    check-cast v0, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$TextButton"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v2, v2, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_2

    :cond_3
    :goto_1
    const v2, 0x7f1410d0

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->e()J

    move-result-wide v5

    sget-object v3, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v7, v3, Lg1/h9;->i:Ll3/v0;

    sget-object v12, Lp3/r;->G:Lp3/r;

    const/16 v20, 0x0

    const v21, 0xfffffb

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v7 .. v21}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v21

    sget-object v3, Lb2/t;->w:Lb2/t;

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-interface {v0, v3, v4}, Ll0/s1;->a(Landroidx/compose/ui/Modifier;Lb2/l;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v24, 0x0

    const v25, 0xfff8

    move-wide v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v1

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
