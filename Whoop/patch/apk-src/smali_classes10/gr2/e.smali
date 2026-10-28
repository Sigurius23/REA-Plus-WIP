.class public abstract Lgr2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0011\"\u001a\u0010\u001b\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lgr2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "i",
        "(Lgr2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "g",
        "(Lgr2/b;Landroidx/compose/runtime/Composer;I)V",
        "Lgr2/a;",
        "dayState",
        "Lgr2/c;",
        "type",
        "e",
        "(Lgr2/a;Lgr2/c;Landroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "a",
        "J",
        "selectedColor",
        "b",
        "notSelectedColor",
        "c",
        "rowBackgroundColor",
        "d",
        "Lgr2/b;",
        "getSampleViewState",
        "()Lgr2/b;",
        "sampleViewState",
        "user-journey_release"
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
.field private static final a:J

.field private static final b:J

.field private static final c:J

.field private static final d:Lgr2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-wide v0, 0xffb126ffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lgr2/e;->a:J

    const v0, 0x4dffffff    # 5.3687088E8f

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    sput-wide v0, Lgr2/e;->b:J

    const-wide v0, 0xff000000L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lgr2/e;->c:J

    new-instance v3, Lkd1/o$a;

    sget v0, Lgy0/a;->O4:I

    invoke-direct {v3, v0}, Lkd1/o$a;-><init>(I)V

    new-instance v4, Lgr2/a;

    const-string v0, "SUN"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v4, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v5, Lgr2/a;

    const-string v0, "MON"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v5, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v6, Lgr2/a;

    const-string v0, "TUE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v6, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v7, Lgr2/a;

    const-string v0, "WED"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v7, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v8, Lgr2/a;

    const-string v0, "THU"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v8, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v9, Lgr2/a;

    const-string v0, "FRI"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v9, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v10, Lgr2/a;

    const-string v0, "SAT"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v10, v0, v1}, Lgr2/a;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    filled-new-array/range {v4 .. v10}, [Lgr2/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v0, "You wore your WHOOP for the last 5 out of 7 nights."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v0, "Unlock the best personalized insights by regularly wearing your WHOOP! Some members create regular routines to remember to charge their WHOOP. "

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v8, Lcom/whoop/user/journey/model/UserJourneyFooterStyle;->STEP_PROGRESS:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    sget-object v7, Lgr2/c;->INTRO:Lgr2/c;

    new-instance v9, Llq2/t$a;

    sget-object v0, Llq2/f;->SECONDARY:Llq2/f;

    invoke-direct {v9, v0}, Llq2/t$a;-><init>(Llq2/f;)V

    new-instance v2, Lgr2/b;

    const-string v10, "PAST_SEVEN_DAYS_STEP"

    invoke-direct/range {v2 .. v10}, Lgr2/b;-><init>(Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgr2/c;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V

    sput-object v2, Lgr2/e;->d:Lgr2/b;

    return-void
.end method

.method public static synthetic a(Lgr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgr2/e;->k(Lgr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgr2/e;->j(Lgr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgr2/a;Lgr2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgr2/e;->f(Lgr2/a;Lgr2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgr2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgr2/e;->h(Lgr2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lgr2/a;Lgr2/c;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "dayState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v3, -0x695968f5

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v9, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v12, 0x12

    const/4 v13, 0x1

    const/4 v6, 0x0

    if-eq v5, v12, :cond_5

    move v5, v13

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    and-int/2addr v3, v13

    invoke-virtual {v9, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v5, v3, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-nez v15, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 p2, v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    goto :goto_6

    :cond_7
    move/from16 p2, v12

    :goto_6
    invoke-static {v5, v9, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgr2/a;->b()Z

    move-result v8

    move-object v15, v14

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    if-eqz v8, :cond_a

    const v8, -0x706c007

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lgr2/c;->INTRO:Lgr2/c;

    if-ne v1, v8, :cond_9

    const v8, -0x705e916

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    double-to-float v8, v13

    int-to-float v13, v4

    mul-float/2addr v8, v13

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v13

    sget-object v14, Lt0/j;->a:Lt0/i;

    invoke-static {v8, v15, v13, v14}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    goto :goto_7

    :cond_9
    const v8, -0x7019951

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    double-to-float v8, v13

    int-to-float v13, v4

    mul-float/2addr v8, v13

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v9, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->X()J

    move-result-wide v13

    sget-object v12, Lt0/j;->a:Lt0/i;

    invoke-static {v15, v8, v13, v14, v12}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    const v8, -0x6fd0b2f

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    double-to-float v8, v13

    int-to-float v12, v4

    mul-float/2addr v8, v12

    sget-wide v12, Lgr2/e;->b:J

    sget-object v14, Lt0/j;->a:Lt0/i;

    invoke-static {v15, v8, v12, v13, v14}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    :goto_8
    const/4 v12, 0x6

    int-to-float v13, v12

    int-to-float v4, v4

    mul-float/2addr v13, v4

    invoke-static {v13, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Lb2/e;->E:Lb2/m;

    invoke-static {v13, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v17, v7

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    move-object/from16 v3, v17

    invoke-static {v6, v9, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v3, v5

    mul-float/2addr v3, v4

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lgr2/a;->b()Z

    move-result v3

    if-eqz v3, :cond_e

    sget v3, Lgy0/a;->e4:I

    goto :goto_a

    :cond_e
    sget v3, Lgy0/a;->g4:I

    :goto_a
    invoke-static {v3, v9, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    invoke-virtual {v0}, Lgr2/a;->b()Z

    move-result v3

    if-eqz v3, :cond_10

    const v3, 0x1f5e931d

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lgr2/c;->INTRO:Lgr2/c;

    if-ne v1, v3, :cond_f

    const v3, 0x94524f4

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    sget-wide v7, Lgr2/e;->a:J

    goto :goto_b

    :cond_f
    const/4 v14, 0x0

    const v3, 0x945298f

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v7

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    const/4 v14, 0x0

    const v3, 0x1f608a23

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    sget-wide v7, Lgr2/e;->b:J

    :goto_c
    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    int-to-float v3, v12

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v16, v3, v4

    const/16 v18, 0x0

    const/16 v19, 0xd

    move-object v14, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lgr2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->t()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v6

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v28, v3, 0x12

    const v29, 0x2fff8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v3, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_11
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, Lf01/b;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final f(Lgr2/a;Lgr2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lgr2/e;->e(Lgr2/a;Lgr2/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lgr2/b;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x3a570a52

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v3, v2, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/2addr v0, v5

    invoke-virtual {p1, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-wide v6, Lgr2/e;->c:J

    const/4 v3, 0x3

    int-to-float v3, v3

    int-to-float v1, v1

    invoke-static {v0, v3, v1, v6, v7}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v1, v6

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    int-to-float v2, v2

    mul-float/2addr v2, v3

    invoke-static {v0, v1, v1, v1, v2}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->g:Ll0/h;

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v3, 0x6

    invoke-static {v1, v2, p1, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, p1, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, p1, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v2, p1, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x6481d2a5

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lgr2/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgr2/a;

    invoke-virtual {p0}, Lgr2/b;->i()Lgr2/c;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v2, p1, v3}, Lgr2/e;->e(Lgr2/a;Lgr2/c;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Ld71/c;

    const/16 v1, 0xc

    invoke-direct {v0, p0, p2, v1}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final h(Lgr2/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lgr2/e;->g(Lgr2/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lgr2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x3404d751

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lb30/a1;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, -0x4da24525

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lgr2/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lgr2/d;-><init>(Lgr2/b;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final j(Lgr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v3, p2

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lb2/e;->N:Lb2/k;

    sget-object v12, Ll0/m;->c:Ll0/g;

    const/16 v13, 0x30

    invoke-static {v12, v11, v3, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v14, v3

    check-cast v14, Lp1/q;

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    iget-object v6, v14, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_0

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v4, v14, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v1, v0

    const-wide/16 v4, 0x0

    cmpl-double v1, v1, v4

    if-lez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v4, 0x4029000000000000L    # 12.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v13, 0x0

    invoke-static {v1, v13, v4, v2}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x56

    int-to-float v1, v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v1, v4

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lgr2/b;->e()Lkd1/o;

    move-result-object v0

    move v1, v4

    sget v4, Lkd1/o;->a:I

    move/from16 v17, v5

    const/4 v5, 0x3

    move/from16 v18, v1

    const/4 v1, 0x0

    move/from16 v19, v2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    move-object v1, v8

    const/16 v8, 0x61b0

    move-object v2, v9

    const/16 v9, 0x68

    move-object v3, v1

    const/4 v1, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    sget-object v4, Ly2/j;->d:Ly2/b1;

    move-object/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v29, v2

    move-object/from16 v27, v7

    move-object/from16 v2, v16

    move-object/from16 v28, v19

    move-object/from16 v26, v20

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    mul-float v0, v0, v17

    const/4 v1, 0x2

    invoke-static {v10, v0, v13, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v12, v11, v7, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v14, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_4

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v4, v26

    goto :goto_3

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v7, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v27

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    move-object/from16 v1, v28

    goto :goto_5

    :cond_6
    :goto_4
    move-object/from16 v2, v29

    goto :goto_6

    :goto_5
    invoke-static {v2, v14, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object/from16 v8, p0

    invoke-static {v8, v7, v0}, Lgr2/e;->g(Lgr2/b;Landroidx/compose/runtime/Composer;I)V

    mul-float v4, v18, v17

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    mul-float v5, v0, v17

    const/4 v6, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lgr2/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->N()Lb91/a;

    move-result-object v20

    invoke-virtual {v3, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v24, v9, 0x12

    const v25, 0x2fff8

    move v9, v2

    move-object v10, v3

    move-wide v2, v5

    move v6, v4

    const-wide/16 v4, 0x0

    move v11, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v12, v9

    move-object v13, v10

    const-wide/16 v9, 0x0

    move v15, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    move-object/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x30

    move-object/from16 v30, v22

    move/from16 v33, v26

    move/from16 v31, v27

    move-object/from16 v32, v28

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v22

    invoke-virtual/range {p0 .. p0}, Lgr2/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v12, v31

    invoke-static {v0, v3, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, v32

    move/from16 v15, v33

    invoke-virtual {v13, v3, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v13, v3, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v1

    const/16 v23, 0x0

    const v25, 0x2fffa

    move-wide v2, v1

    const/4 v1, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v30

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lgr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lgr2/e;->i(Lgr2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
