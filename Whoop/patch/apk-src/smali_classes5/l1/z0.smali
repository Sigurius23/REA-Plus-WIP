.class public final Ll1/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ljava/lang/Long;

.field public final synthetic F:Ll1/e0;

.field public final synthetic G:Ll1/n3;

.field public final synthetic H:Ll1/y;

.field public final synthetic w:Lm1/o;

.field public final synthetic x:Lm1/r;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lm1/n;


# direct methods
.method public constructor <init>(Lm1/o;Lm1/r;Lkotlin/jvm/functions/Function1;Lm1/n;Ljava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/z0;->w:Lm1/o;

    iput-object p2, p0, Ll1/z0;->x:Lm1/r;

    iput-object p3, p0, Ll1/z0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll1/z0;->z:Lm1/n;

    iput-object p5, p0, Ll1/z0;->E:Ljava/lang/Long;

    iput-object p6, p0, Ll1/z0;->F:Ll1/e0;

    iput-object p7, p0, Ll1/z0;->G:Ll1/n3;

    iput-object p8, p0, Ll1/z0;->H:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    move-object v5, v3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v4, v4, 0x30

    if-nez v4, :cond_3

    move-object v4, v3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v5, v4

    :cond_3
    and-int/lit16 v4, v5, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v4, v6, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v5, v8

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v0, Ll1/z0;->w:Lm1/o;

    move-object v5, v4

    check-cast v5, Lm1/q;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v0, Ll1/z0;->x:Lm1/r;

    if-gtz v2, :cond_5

    :goto_4
    move-object v9, v6

    goto :goto_5

    :cond_5
    iget-wide v9, v6, Lm1/r;->e:J

    invoke-static {v9, v10}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v6

    sget-object v9, Lm1/q;->e:Ljava/time/ZoneId;

    invoke-virtual {v6, v9}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v6

    invoke-virtual {v6}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v6

    int-to-long v9, v2

    invoke-virtual {v6, v9, v10}, Ljava/time/LocalDate;->plusMonths(J)Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v5, v2}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object v6

    goto :goto_4

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    check-cast v1, Landroidx/compose/foundation/lazy/b;

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-virtual {v1, v2, v5}, Landroidx/compose/foundation/lazy/b;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v3, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5, v3, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v3, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, v0, Ll1/z0;->z:Lm1/n;

    iget-wide v11, v1, Lm1/n;->z:J

    iget-object v1, v4, Lm1/o;->a:Ljava/util/Locale;

    const v19, 0x36000

    iget-object v10, v0, Ll1/z0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Ll1/z0;->E:Ljava/lang/Long;

    iget-object v14, v0, Ll1/z0;->F:Ll1/e0;

    iget-object v15, v0, Ll1/z0;->G:Ll1/n3;

    iget-object v2, v0, Ll1/z0;->H:Ll1/y;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move-object/from16 v18, v3

    invoke-static/range {v9 .. v19}, Ll1/f1;->i(Lm1/r;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
