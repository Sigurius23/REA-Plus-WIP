.class public abstract Ldk2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aQ\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00030\u0005H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"!\u0010\u0017\u001a\u000c\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006%\u00b2\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010!8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lbk2/g$c;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackPressed",
        "Lkotlin/Function1;",
        "Luj2/a;",
        "onAnalyticsEvent",
        "Lbk2/b;",
        "onViewEvent",
        "s",
        "(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ll0/u;",
        "content",
        "p",
        "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "a",
        "Lh91/b;",
        "getMockCalendarState",
        "()Lh91/b;",
        "mockCalendarState",
        "b",
        "Lbk2/g$c;",
        "getMockViewState",
        "()Lbk2/g$c;",
        "mockViewState",
        "",
        "showCalendar",
        "Lt81/r;",
        "tiltGraphViewState",
        "",
        "plotId",
        "Lh71/l;",
        "scrollableScrubberState",
        "tilt-graph_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lh91/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lbk2/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 29

    sget-object v0, Lh91/b;->j:Lh91/b$a;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v2

    const-string v3, "now(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v4

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0xc0

    const/4 v10, 0x0

    move-object v3, v5

    sget-object v5, Lm83/z;->w:Lm83/z;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lh91/b$a;->b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object v12

    sput-object v12, Ldk2/j;->a:Lh91/b;

    new-instance v0, Lbk2/g$c;

    new-instance v11, Lbk2/c;

    const-string v1, "TODAY"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v13, Li11/f;

    const/16 v24, 0x3c1

    const/16 v25, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    const-string v17, "2024-01-23"

    const/16 v18, 0x1

    const-string v19, "2024-01-25"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->p()I

    move-result v14

    const-string v1, "HEART RATE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v1, "Data synced to 9:40pm"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v18, 0x20

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lbk2/c;-><init>(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lf61/l;->b()Lt81/r;

    move-result-object v12

    const v1, 0x453b8000    # 3000.0f

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/high16 v3, 0x445c0000    # 880.0f

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x20

    shl-long/2addr v1, v5

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v16, v1, v3

    const/16 v27, 0x1ff7

    const/16 v28, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v12 .. v28}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v1

    new-instance v2, Lh2/c;

    const/4 v3, 0x0

    const v4, 0x3e4ccccd    # 0.2f

    invoke-direct {v2, v3, v4, v3, v3}, Lh2/c;-><init>(FFFF)V

    invoke-direct {v0, v11, v1, v2}, Lbk2/g$c;-><init>(Lbk2/c;Lm91/u;Lh2/c;)V

    sput-object v0, Ldk2/j;->b:Lbk2/g$c;

    return-void
.end method

.method private static final A(Lbk2/g$c;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "$this$TiltChartBox"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p7, 0x11

    const/16 v3, 0x10

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    and-int/lit8 v3, p7, 0x1

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual/range {p0 .. p0}, Lbk2/g$c;->a()Lh2/c;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3, v2, v10, v5, v4}, Ldk2/l;->c(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v6

    if-nez v6, :cond_1

    const v0, -0x2048b6e5

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v2, p2

    move-object/from16 v14, p4

    goto/16 :goto_6

    :cond_1
    const v2, -0x2048b6e4

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lt81/r;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lj71/b;

    instance-of v8, v8, Lj71/b$g;

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_3
    move-object v7, v3

    :goto_1
    check-cast v7, Lj71/b;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lj71/b;->c()Ljava/lang/String;

    move-result-object v3

    :cond_4
    move-object/from16 v2, p2

    invoke-static {v2, v3}, Ldk2/j;->v(Lp1/c1;Ljava/lang/String;)V

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v7, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-nez v14, :cond_6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    :cond_6
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v11, 0x3f59999a    # 0.85f

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v10, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v14, v10, v14, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_c

    if-ne v5, v13, :cond_b

    goto :goto_4

    :cond_b
    move-object/from16 v14, p4

    goto :goto_5

    :cond_c
    :goto_4
    new-instance v5, Lb90/e;

    const/4 v3, 0x1

    move-object/from16 v14, p4

    invoke-direct {v5, v3, v1, v14, v0}, Lb90/e;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_5
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v11, Lt81/r;->n:I

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_d

    if-ne v5, v13, :cond_e

    :cond_d
    new-instance v5, Ld30/r;

    const/4 v3, 0x3

    invoke-direct {v5, v6, v1, v0, v3}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lc93/a;

    const/4 v0, 0x0

    invoke-static {v6, v5, v10, v11, v0}, Ldk2/k;->d(Lt81/r;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static {v2}, Ldk2/j;->N(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {v14}, Ldk2/j;->w(Lp1/c1;)Lh71/l;

    move-result-object v0

    if-eqz v0, :cond_f

    const v0, -0x20180a96

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-static {v14}, Ldk2/j;->w(Lp1/c1;)Lh71/l;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2}, Ldk2/j;->N(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v2, Lh71/l;->f:I

    invoke-static {v0, v1, v10, v2}, Ldk2/n;->f(Lh71/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_f
    const/4 v0, 0x0

    const v1, -0x20146b5f

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "event"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v3, Lh71/l;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move-object v2, v3

    check-cast v2, Lh71/l;

    invoke-virtual {v2}, Lh71/l;->a()Ld61/a;

    move-result-object v3

    instance-of v4, v3, Ld61/a$b;

    if-eqz v4, :cond_0

    invoke-static {v1, v5}, Ldk2/j;->x(Lp1/c1;Lh71/l;)V

    goto/16 :goto_0

    :cond_0
    instance-of v3, v3, Ld61/a$c;

    if-eqz v3, :cond_1

    sget-object v3, Luj2/a$b;->a:Luj2/a$b;

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v2}, Ldk2/j;->x(Lp1/c1;Lh71/l;)V

    goto/16 :goto_0

    :cond_1
    invoke-static {v1, v2}, Ldk2/j;->x(Lp1/c1;Lh71/l;)V

    goto/16 :goto_0

    :cond_2
    instance-of v1, v3, Lt81/f$a;

    if-eqz v1, :cond_5

    move-object v1, v3

    check-cast v1, Lt81/f$a;

    invoke-virtual {v1}, Lt81/f$a;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Luj2/a$h;

    invoke-virtual {v1}, Lt81/f$a;->b()Z

    move-result v4

    sget-object v6, Luj2/d;->DOUBLE_TAP:Luj2/d;

    invoke-direct {v3, v4, v6}, Luj2/a$h;-><init>(ZLuj2/d;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {v2}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v1}, Lt81/f$a;->a()F

    move-result v14

    const/16 v22, 0x1edf

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v7 .. v23}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v5

    :cond_4
    invoke-static {v2, v5}, Ldk2/j;->M(Lp1/c1;Lt81/r;)V

    goto :goto_0

    :cond_5
    instance-of v1, v3, Lt81/f$b;

    if-eqz v1, :cond_8

    move-object v1, v3

    check-cast v1, Lt81/f$b;

    invoke-virtual {v1}, Lt81/f$b;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Luj2/a$h;

    invoke-virtual {v1}, Lt81/f$b;->c()Z

    move-result v4

    sget-object v6, Luj2/d;->PINCH:Luj2/d;

    invoke-direct {v3, v4, v6}, Luj2/a$h;-><init>(ZLuj2/d;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-static {v2}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v1}, Lt81/f$b;->a()F

    move-result v14

    const/16 v22, 0x1fdf

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v7 .. v23}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v5

    :cond_7
    invoke-static {v2, v5}, Ldk2/j;->M(Lp1/c1;Lt81/r;)V

    :cond_8
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lt81/r;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 20

    sget-object v0, Lu81/c;->a:Lu81/c;

    invoke-virtual/range {p0 .. p0}, Lt81/r;->k()F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lt81/r;->m()Lt81/e;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu81/c;->a(FLt81/e;)F

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lt81/r;->k()F

    move-result v0

    cmpl-float v0, v10, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Luj2/a$h;

    sget-object v2, Luj2/d;->BUTTON:Luj2/d;

    invoke-direct {v1, v0, v2}, Luj2/a$h;-><init>(ZLuj2/d;)V

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v3

    if-eqz v3, :cond_1

    const/16 v18, 0x1edf

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v19}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v0

    :goto_1
    move-object/from16 v1, p2

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-static {v1, v0}, Ldk2/j;->M(Lp1/c1;Lt81/r;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final E(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p6, "$this$AnimatedVisibility"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-nez p4, :cond_0

    if-ne p5, p6, :cond_1

    :cond_0
    new-instance p5, La61/a;

    const/16 p4, 0x1d

    invoke-direct {p5, p1, p4}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p4, p5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_2

    if-ne p5, p6, :cond_3

    :cond_2
    new-instance p5, Lcom/whoop/profile/view/edit/avatar/a;

    const/4 p4, 0x1

    invoke-direct {p5, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/avatar/a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p5

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p6, :cond_4

    new-instance p1, Lb01/m;

    const/16 p2, 0x17

    invoke-direct {p1, p2, p3}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p1

    check-cast v3, Lc93/a;

    sget p1, Lh91/b;->k:I

    or-int/lit16 v5, p1, 0xc00

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lek2/a;->h(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    new-instance v0, Lbk2/a$a;

    invoke-direct {v0, p1}, Lbk2/a$a;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/time/LocalDate;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbk2/d$a;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p3

    invoke-direct/range {v1 .. v6}, Lbk2/d$a;-><init>(Ljava/time/LocalDate;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Luj2/a$c;

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p3

    const-string v0, "now(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, p3}, Luj2/a$c;-><init>(Ljava/time/LocalDate;Ljava/time/LocalDate;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p2, p0}, Ldk2/j;->K(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ldk2/j;->K(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ldk2/j;->s(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final K(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final L(Lp1/c1;)Lt81/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lt81/r;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt81/r;

    return-object p0
.end method

.method private static final M(Lp1/c1;Lt81/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lt81/r;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final N(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ldk2/j;->E(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbk2/g$c;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ldk2/j;->A(Lbk2/g$c;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk2/j;->r(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Ldk2/j;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Luj2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldk2/j;->u(Luj2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ldk2/j;->F(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lt81/r;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ldk2/j;->C(Lt81/r;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk2/j;->G(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ldk2/j;->q(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldk2/j;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(I)I
    .locals 0

    invoke-static {p0}, Ldk2/j;->D(I)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldk2/j;->z(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk2/j;->B(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldk2/j;->y(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ldk2/j;->I(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    check-cast p1, Lp1/q;

    const v0, 0x7b5fa2e1

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    if-eq v2, v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    sget-object v1, Ly3/m;->w:Ly3/m;

    invoke-virtual {v0, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Lbd1/i;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Lbd1/i;-><init>(ILkotlin/jvm/functions/Function3;)V

    const v2, 0x65b8a7a1    # 1.09000955E23f

    invoke-static {v2, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p1, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lbd1/j;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lbd1/j;-><init>(Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final q(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v0, p1, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {p1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p1, v4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, p1, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0, p1, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-interface {p0, v0, p1, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ldk2/j;->p(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk2/g$c;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move/from16 v10, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v0, 0x13c2a4f7

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v10, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_9

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_6

    :cond_8
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v0, v9

    :cond_9
    and-int/lit16 v9, v0, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    if-eq v9, v11, :cond_a

    const/4 v9, 0x1

    goto :goto_7

    :cond_a
    move v9, v12

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v7, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_24

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_b

    new-instance v3, Ldf2/a;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Ldf2/a;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lc93/a;

    goto :goto_8

    :cond_c
    move-object v3, v4

    :goto_8
    if-eqz v5, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_d

    new-instance v4, Ldh0/a;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Ldh0/a;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v14, v4

    goto :goto_9

    :cond_e
    move-object v14, v8

    :goto_9
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_f

    invoke-virtual {v1}, Lbk2/g$c;->c()Lbk2/c;

    move-result-object v4

    invoke-virtual {v4}, Lbk2/c;->a()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v15, v4

    check-cast v15, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_11

    invoke-virtual {v1}, Lbk2/g$c;->b()Lm91/u;

    move-result-object v4

    instance-of v8, v4, Lt81/r;

    if-eqz v8, :cond_10

    check-cast v4, Lt81/r;

    goto :goto_a

    :cond_10
    const/4 v4, 0x0

    :goto_a
    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v16, v4

    check-cast v16, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_13

    invoke-static/range {v16 .. v16}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Lt81/r;->g()Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_12
    const/4 v4, 0x0

    :goto_b
    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v17, v4

    check-cast v17, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_15

    invoke-static/range {v16 .. v16}, Ldk2/j;->L(Lp1/c1;)Lt81/r;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual {v4}, Lt81/r;->h()Lh71/l;

    move-result-object v4

    goto :goto_c

    :cond_14
    const/4 v4, 0x0

    :goto_c
    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v18, v4

    check-cast v18, Lp1/c1;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ldk2/o;->a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    move-object/from16 p1, v14

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_d
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v7, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    invoke-static {v13, v7, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x0

    invoke-static {v8, v12, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-eqz v2, :cond_19

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v7, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    invoke-static {v12, v7, v12, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbk2/g$c;->c()Lbk2/c;

    move-result-object v2

    and-int/lit16 v1, v0, 0x380

    const/16 v4, 0x100

    if-ne v1, v4, :cond_1c

    const/4 v4, 0x1

    goto :goto_f

    :cond_1c
    const/4 v4, 0x0

    :goto_f
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1e

    if-ne v5, v11, :cond_1d

    goto :goto_10

    :cond_1d
    move-object/from16 v12, p1

    goto :goto_11

    :cond_1e
    :goto_10
    new-instance v5, Lbs1/i;

    const/16 v4, 0x8

    move-object/from16 v12, p1

    invoke-direct {v5, v12, v15, v4}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object v4, v5

    check-cast v4, Lc93/a;

    const/16 v5, 0x100

    if-ne v1, v5, :cond_1f

    const/4 v1, 0x1

    goto :goto_12

    :cond_1f
    const/4 v1, 0x0

    :goto_12
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_20

    if-ne v5, v11, :cond_21

    :cond_20
    new-instance v5, Ldk2/i;

    const/4 v1, 0x0

    invoke-direct {v5, v12, v1}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v1, Lh91/b;->k:I

    sget v6, Li11/f;->k:I

    or-int/2addr v1, v6

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v1, v6

    or-int/2addr v1, v6

    and-int/lit8 v6, v0, 0x70

    or-int/2addr v1, v6

    const v6, 0xe000

    const/4 v13, 0x3

    shl-int/2addr v0, v13

    and-int/2addr v0, v6

    or-int v8, v1, v0

    const/4 v9, 0x0

    move-object/from16 v6, p3

    const/4 v14, 0x0

    invoke-static/range {v2 .. v9}, Lek2/c;->g(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v19, v3

    new-instance v0, La81/n;

    const/4 v6, 0x3

    move-object/from16 v1, p0

    move-object v4, v12

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    invoke-direct/range {v0 .. v6}, La81/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x6ffc4901

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v7, v1}, Ldk2/j;->p(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lbk2/g$c;->c()Lbk2/c;

    move-result-object v0

    invoke-virtual {v0}, Lbk2/c;->b()Lh91/b;

    move-result-object v1

    if-nez v1, :cond_22

    const v0, -0x6e909e7e

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v0, 0x1

    goto :goto_14

    :cond_22
    const v0, -0x6e909e7d

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {v15}, Ldk2/j;->J(Lp1/c1;)Z

    move-result v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_23

    new-instance v0, Ldh0/a;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Ldh0/a;-><init>(I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-static {v14, v0, v2}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v8

    invoke-static {v13, v14}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    const/16 v2, 0xf

    invoke-static {v14, v14, v14, v2}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v0

    invoke-static {v14, v13}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v9

    new-instance v0, Lat2/r;

    const/4 v5, 0x5

    move-object/from16 v2, p3

    move-object v3, v12

    move-object v4, v15

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x441c4a0e

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    move-object v3, v8

    const v8, 0x30d80

    move-object v4, v9

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move v1, v6

    move-object v6, v0

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x0

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object v3, v12

    move-object/from16 v2, v19

    goto :goto_15

    :cond_24
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v8

    :goto_15
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, La81/f;

    const/16 v7, 0x10

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v6, p6

    move v5, v10

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Luj2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lp1/c1;)Lh71/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lh71/l;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh71/l;

    return-object p0
.end method

.method private static final x(Lp1/c1;Lh71/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lh71/l;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Luj2/a$a;->a:Luj2/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    invoke-static {p1, p0}, Ldk2/j;->K(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance v0, Luj2/a$d;

    invoke-direct {v0, p1}, Luj2/a$d;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
