.class public abstract Lhb2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000e\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001f\u00b2\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClick",
        "q",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "f",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "text",
        "u",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "s",
        "",
        "a",
        "J",
        "TIME_LOWER",
        "b",
        "TIME_UPPER",
        "c",
        "TIME_INITIAL",
        "Ll11/e;",
        "d",
        "Ll11/e;",
        "debugButton",
        "",
        "answeredYes",
        "",
        "magnitude",
        "timeValue",
        "Ll11/d;",
        "buttonState",
        "app_prodStandardRelease"
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

.field private static final d:Ll11/e;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    sput-wide v0, Lhb2/b;->a:J

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v0

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->plusHours(I)Lorg/joda/time/DateTime;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    sput-wide v0, Lhb2/b;->b:J

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->plusHours(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    sput-wide v0, Lhb2/b;->c:J

    new-instance v2, Ll11/e;

    sget-object v6, Lgz0/m0;->ADD:Lgz0/m0;

    sget-object v7, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    const/16 v15, 0xde0

    const/16 v16, 0x0

    const-string v3, "ginger-shot-cta"

    const-string v4, "ADD TO JOURNAL"

    const-string v5, "ADDED"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "/journal/custom-behaviors/ginger-shot"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v16}, Ll11/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lhb2/b;->d:Ll11/e;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhb2/b;->t(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhb2/b;->r(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhb2/b;->v(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhb2/b;->j(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhb2/b;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 48

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x5883fe32

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v10, v1

    check-cast v10, Lp1/c1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    invoke-static {v8, v4}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v1

    :cond_2
    move-object v12, v1

    check-cast v12, Lp1/c1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    sget-wide v5, Lhb2/b;->c:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v13, v1

    check-cast v13, Lp1/c1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    sget-object v1, Ll11/d$e;->a:Ll11/d$e;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v1

    check-cast v11, Lp1/c1;

    invoke-static {v11}, Lhb2/b;->h(Lp1/c1;)Ll11/d;

    move-result-object v1

    instance-of v1, v1, Ll11/d$g;

    xor-int/lit8 v20, v1, 0x1

    new-instance v1, Ll21/c;

    new-instance v14, Lw71/y;

    new-instance v3, Lw71/f0$i;

    invoke-static {v10}, Lhb2/b;->g(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v3, v5}, Lw71/f0$i;-><init>(Ljava/lang/Boolean;)V

    const/16 v25, 0x39a

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "Did you have a ginger shot?"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v21, v3

    invoke-direct/range {v14 .. v26}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v14

    new-instance v14, Lhy0/e;

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v14

    new-instance v14, Lw71/y;

    new-instance v6, Lw71/f0$d;

    invoke-static {v12}, Lhb2/b;->m(Lp1/c1;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v15, 0xa

    invoke-direct {v6, v9, v8, v15}, Lw71/f0$d;-><init>(Ljava/lang/Integer;II)V

    const/4 v15, 0x1

    const-string v17, "How many shots?"

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v6

    invoke-direct/range {v14 .. v26}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v14

    new-instance v14, Lw71/y;

    new-instance v21, Lw71/f0$g;

    new-instance v9, Lorg/joda/time/DateTime;

    move/from16 v31, v8

    const/16 p0, 0x0

    invoke-static {v13}, Lhb2/b;->o(Lp1/c1;)J

    move-result-wide v7

    invoke-direct {v9, v7, v8}, Lorg/joda/time/DateTime;-><init>(J)V

    const-string v7, "h:mm a"

    invoke-virtual {v9, v7}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-wide v23, Lhb2/b;->a:J

    sget-wide v25, Lhb2/b;->b:J

    invoke-static {v13}, Lhb2/b;->o(Lp1/c1;)J

    move-result-wide v27

    invoke-direct/range {v21 .. v28}, Lw71/f0$g;-><init>(Lcom/whoop/design/util/TextResource;JJJ)V

    const/16 v25, 0x39a

    const/16 v26, 0x0

    const/4 v15, 0x2

    const-string v17, "What time?"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x4

    new-array v7, v7, [Lm91/u;

    aput-object v3, v7, p0

    aput-object v5, v7, v31

    const/4 v3, 0x2

    aput-object v6, v7, v3

    const/4 v3, 0x3

    aput-object v14, v7, v3

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v24

    sget-object v32, Lhb2/b;->d:Ll11/e;

    invoke-static {v11}, Lhb2/b;->h(Lp1/c1;)Ll11/d;

    move-result-object v40

    const/16 v45, 0xf7f

    const/16 v46, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-static/range {v32 .. v46}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v25

    const/16 v29, 0x70

    const/16 v30, 0x0

    const-string v22, "ginger-shot-debug"

    const-string v23, "Ginger Shot"

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v21, v1

    invoke-direct/range {v21 .. v30}, Ll21/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v7, v31

    int-to-float v8, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v8, v7

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v7, v8, v4, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v8, v4, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_8

    new-instance v9, Lhb2/a;

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lhb2/a;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v9

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v2, Ll21/c;->h:I

    or-int/lit16 v2, v2, 0x1b0

    const/4 v6, 0x0

    move-object/from16 v47, v5

    move v5, v2

    move-object v2, v3

    move-object/from16 v3, v47

    invoke-static/range {v1 .. v6}, Ll21/b;->e(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_9
    const/16 p0, 0x0

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lf01/c0;

    const/16 v3, 0x14

    move/from16 v4, p0

    invoke-direct {v2, v4, v0, v3}, Lf01/c0;-><init>(BII)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final h(Lp1/c1;)Ll11/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ll11/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll11/d;

    return-object p0
.end method

.method private static final i(Lp1/c1;Ll11/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ll11/d;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lw71/d$k;

    if-eqz v0, :cond_1

    check-cast p4, Lw71/d$k;

    invoke-virtual {p4}, Lw71/d$k;->a()Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p0, p2}, Lhb2/b;->l(Lp1/c1;Ljava/lang/Boolean;)V

    invoke-virtual {p4}, Lw71/d$k;->a()Ljava/lang/Boolean;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Ll11/d$e;->a:Ll11/d$e;

    goto :goto_0

    :cond_0
    sget-object p0, Ll11/d$a;->a:Ll11/d$a;

    :goto_0
    invoke-static {p1, p0}, Lhb2/b;->i(Lp1/c1;Ll11/d;)V

    goto :goto_1

    :cond_1
    instance-of p0, p4, Lw71/d$a;

    if-eqz p0, :cond_2

    check-cast p4, Lw71/d$a;

    invoke-virtual {p4}, Lw71/d$a;->a()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p2, p0}, Lhb2/b;->n(Lp1/c1;I)V

    goto :goto_1

    :cond_2
    instance-of p0, p4, Lw71/d$i;

    if-eqz p0, :cond_3

    check-cast p4, Lw71/d$i;

    invoke-virtual {p4}, Lw71/d$i;->b()Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    invoke-static {p3, p0, p1}, Lhb2/b;->p(Lp1/c1;J)V

    goto :goto_1

    :cond_3
    instance-of p0, p4, Ll11/e;

    if-eqz p0, :cond_4

    sget-object p0, Ll11/d$c;->a:Ll11/d$c;

    invoke-static {p1, p0}, Lhb2/b;->i(Lp1/c1;Ll11/d;)V

    :cond_4
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lhb2/b;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final n(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final p(Lp1/c1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move/from16 v9, p2

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v0, 0x5f0d7e7e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v10, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v10

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v1, v0, 0x3

    const/4 v11, 0x0

    if-eq v1, v10, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v11

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    const/high16 v13, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v6, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v8, v6, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v6, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v11, v6, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v6, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v4, "Journal-Entry Widget Debug"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/w;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const v33, 0xfffa

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v11, 0x3

    shl-int/2addr v4, v11

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v4

    move-object v4, v8

    const/16 v8, 0x35

    move-object v12, v7

    move v7, v0

    const/4 v0, 0x0

    move-object v13, v2

    const/4 v2, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v36, v16

    move-object/from16 v35, v17

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v6, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v1, 0xe

    invoke-static {v0, v4, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v11

    const/4 v4, 0x6

    move-object/from16 v5, v36

    invoke-static {v1, v2, v5, v6, v4}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    move-object/from16 v1, v35

    invoke-static {v5, v6, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v6, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "JOURNAL_ENTRY_WIDGET \u2014 interactive"

    invoke-static {v0, v6, v4}, Lhb2/b;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v0, "Renders the real JournalEntryWidget composable with hardcoded sample state. Tap Yes/No to enable the CTA, tap the stepper to bump the magnitude, drag the time slider. ADD TO JOURNAL fires against a nonexistent path and flips the button to its error treatment \u2014 expected, there is no backend here."

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lhb2/b;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v1}, Lhb2/b;->f(Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0xa

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v0, v2, v14, v6, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lch0/t;

    const/4 v2, 0x6

    invoke-direct {v1, v9, v2, v3}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final r(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lhb2/b;->q(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x639004f0

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    if-eq v4, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v3, v1, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    and-int/lit8 v23, v2, 0xe

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x12

    const v25, 0x2fffa

    move-object/from16 v22, v1

    const/4 v1, 0x0

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v22, v1

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcp0/a;

    const/4 v3, 0x7

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final t(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lhb2/b;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x35c756af

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    if-eq v4, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v3, v1, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->p()Lb91/a;

    move-result-object v20

    and-int/lit8 v23, v2, 0xe

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x12

    const v25, 0x2fffa

    move-object/from16 v22, v1

    const/4 v1, 0x0

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v22, v1

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcp0/a;

    const/4 v3, 0x6

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final v(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lhb2/b;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic w(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lhb2/b;->q(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
