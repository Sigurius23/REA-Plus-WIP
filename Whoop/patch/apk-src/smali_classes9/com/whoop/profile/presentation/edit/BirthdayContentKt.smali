.class public final Lcom/whoop/profile/presentation/edit/BirthdayContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u000f\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "selectedBirthdayValue",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "Lkotlin/Function1;",
        "onDateSelected",
        "BirthdayContent",
        "(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ll1/y;",
        "birthdayDatePickerColors",
        "(Landroidx/compose/runtime/Composer;I)Ll1/y;",
        "profile_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final BirthdayContent(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v14, p4

    const-string v3, "selectedBirthdayValue"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onDismiss"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onDateSelected"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v3, -0x5b7adfed

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v14, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v14

    goto :goto_1

    :cond_1
    move v3, v14

    :goto_1
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v14, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    const/4 v10, 0x0

    const/4 v6, 0x1

    if-eq v4, v5, :cond_6

    move v4, v6

    goto :goto_4

    :cond_6
    move v4, v10

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {}, Lorg/joda/time/LocalDate;->now()Lorg/joda/time/LocalDate;

    move-result-object v4

    const/16 v5, 0xd

    invoke-virtual {v4, v5}, Lorg/joda/time/LocalDate;->minusYears(I)Lorg/joda/time/LocalDate;

    move-result-object v5

    const/16 v7, 0x78

    invoke-virtual {v4, v7}, Lorg/joda/time/LocalDate;->minusYears(I)Lorg/joda/time/LocalDate;

    move-result-object v4

    sget-object v7, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v5, v7}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-virtual {v8}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v8

    invoke-virtual {v4, v7}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v12

    new-instance v7, Li93/j;

    invoke-virtual {v4}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v4

    invoke-virtual {v5}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v5

    invoke-direct {v7, v4, v5, v6}, Li93/h;-><init>(III)V

    sget-object v4, Lcom/whoop/profile/utils/BirthdayUtils;->INSTANCE:Lcom/whoop/profile/utils/BirthdayUtils;

    invoke-virtual {v4, p0}, Lcom/whoop/profile/utils/BirthdayUtils;->parseToMillis(Ljava/lang/String;)J

    move-result-wide v4

    move-object v6, v7

    new-instance v7, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;

    invoke-direct {v7, v12, v13, v8, v9}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;-><init>(JJ)V

    move-wide v8, v4

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v9, 0x0

    move-object v8, v11

    invoke-static/range {v4 .. v9}, Ll1/f1;->p(Ljava/lang/Long;Ljava/lang/Long;Li93/j;Ll1/n3;Lp1/q;I)Ll1/h1;

    move-result-object v4

    new-instance v5, La01/d;

    const/16 v6, 0x9

    invoke-direct {v5, v4, v0, v2, v6}, La01/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v6, 0x5ec5c225

    invoke-static {v6, v11, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    invoke-static {v11, v10}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->birthdayDatePickerColors(Landroidx/compose/runtime/Composer;I)Ll1/y;

    move-result-object v8

    new-instance v6, Lcom/whoop/profile/presentation/edit/a;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v7}, Lcom/whoop/profile/presentation/edit/a;-><init>(Ll1/g1;I)V

    const v4, -0x3b9f9f04

    invoke-static {v4, v11, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    const v4, 0x6000030

    or-int v12, v3, v4

    const/16 v13, 0xbc

    const/4 v4, 0x0

    move-object v3, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Ll1/d0;->a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;FLl1/y;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Lj;

    const/16 v5, 0x1b

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/String;Lc93/a;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final BirthdayContent$lambda$0(Ll1/g1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    and-int/lit8 v3, p4, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v6, Lny0/n0;->TextMedium:Lny0/n0;

    sget v3, Lcom/whoop/profile/R$string;->profile_confirm:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_1

    sget-object v3, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$1$1$1;->INSTANCE:Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$1$1$1;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_2

    if-ne v8, v4, :cond_3

    :cond_2
    new-instance v8, Lq;

    const/16 v3, 0x14

    invoke-direct {v8, v0, v2, v1, v3}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v8

    check-cast v17, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x6

    or-int/lit8 v19, v0, 0x30

    const/16 v20, 0x0

    const/16 v21, 0xfb9

    move-object/from16 v18, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_4
    move-object/from16 v18, v5

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final BirthdayContent$lambda$0$1$0(Ll1/g1;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll1/h1;

    invoke-virtual {p0}, Ll1/h1;->b()Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    sget-object p3, Lcom/whoop/profile/utils/BirthdayUtils;->INSTANCE:Lcom/whoop/profile/utils/BirthdayUtils;

    invoke-virtual {p3, p0, p1}, Lcom/whoop/profile/utils/BirthdayUtils;->millisToIsoString(J)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final BirthdayContent$lambda$1(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "$this$DatePickerDialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/2addr p3, v2

    move-object v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v10, v1}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->birthdayDatePickerColors(Landroidx/compose/runtime/Composer;I)Ll1/y;

    move-result-object v5

    const/4 v9, 0x0

    const/high16 v11, 0x180000

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v11}, Ll1/f1;->b(Ll1/g1;Landroidx/compose/ui/Modifier;Ll1/e0;Ll1/y;Lc93/m;Lc93/m;ZLg2/s;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final BirthdayContent$lambda$2(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ll1/g1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent$lambda$0(Ll1/g1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent$lambda$1(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final birthdayDatePickerColors(Landroidx/compose/runtime/Composer;I)Ll1/y;
    .locals 39

    move-object/from16 v0, p0

    sget-object v1, Ll1/b0;->a:Ll1/b0;

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v33

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v31

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v29

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v27

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v21

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v19

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v17

    const-wide/16 v35, 0x0

    const v38, 0x1e574ff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    move-object/from16 v37, v0

    invoke-static/range {v1 .. v38}, Ll1/b0;->c(JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Ll1/y;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ll1/g1;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent$lambda$0$1$0(Ll1/g1;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent$lambda$2(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
