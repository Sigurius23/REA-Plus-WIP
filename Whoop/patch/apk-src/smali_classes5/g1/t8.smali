.class public final Lg1/t8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lj0/i;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Li2/a1;

.field public final synthetic J:Lg1/y1;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lq3/g0;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/t8;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lg1/t8;->x:Z

    iput-boolean p3, p0, Lg1/t8;->y:Z

    iput-object p4, p0, Lg1/t8;->z:Lq3/g0;

    iput-object p5, p0, Lg1/t8;->E:Lj0/i;

    iput-object p6, p0, Lg1/t8;->F:Lc93/m;

    iput-object p7, p0, Lg1/t8;->G:Lc93/m;

    iput-object p8, p0, Lg1/t8;->H:Lc93/m;

    iput-object p9, p0, Lg1/t8;->I:Li2/a1;

    iput-object p10, p0, Lg1/t8;->J:Lg1/y1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    check-cast v3, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    :cond_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    and-int/lit8 v5, v2, 0x1

    move-object v14, v1

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lg1/i8;->a:Lg1/i8;

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v15, v2, 0x70

    const/16 v16, 0x6000

    const/16 v17, 0x2000

    iget-object v2, v0, Lg1/t8;->w:Ljava/lang/String;

    iget-boolean v4, v0, Lg1/t8;->x:Z

    iget-boolean v5, v0, Lg1/t8;->y:Z

    iget-object v6, v0, Lg1/t8;->z:Lq3/g0;

    iget-object v7, v0, Lg1/t8;->E:Lj0/i;

    iget-object v8, v0, Lg1/t8;->F:Lc93/m;

    iget-object v9, v0, Lg1/t8;->G:Lc93/m;

    iget-object v10, v0, Lg1/t8;->H:Lc93/m;

    iget-object v11, v0, Lg1/t8;->I:Li2/a1;

    iget-object v12, v0, Lg1/t8;->J:Lg1/y1;

    const/4 v13, 0x0

    invoke-virtual/range {v1 .. v17}, Lg1/i8;->c(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;Ll0/k1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_2

    :cond_3
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
