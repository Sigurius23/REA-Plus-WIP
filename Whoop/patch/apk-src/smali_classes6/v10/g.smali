.class public abstract Lv10/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/List;


# instance fields
.field public final a:Lk83/a;

.field public final b:Lb10/c1;

.field public final c:Lqy/d;

.field public final d:Lq83/j;

.field public final e:Lgm/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "payment_method"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lv10/g;->f:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk83/a;Lb10/c1;Lqy/d;Lq83/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv10/g;->a:Lk83/a;

    iput-object p3, p0, Lv10/g;->b:Lb10/c1;

    iput-object p4, p0, Lv10/g;->c:Lqy/d;

    iput-object p5, p0, Lv10/g;->d:Lq83/j;

    new-instance p2, Lgm/j;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lgm/j;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lv10/g;->e:Lgm/j;

    return-void
.end method

.method public static final a(Lv10/g;Ly00/c8;Ljava/lang/String;Lyy/f;JLs83/c;)Ljava/lang/Object;
    .locals 14

    move-wide/from16 v0, p4

    move-object/from16 v3, p6

    instance-of v4, v3, Lv10/e;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lv10/e;

    iget v5, v4, Lv10/e;->G:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lv10/e;->G:I

    :goto_0
    move-object v8, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lv10/e;

    invoke-direct {v4, p0, v3}, Lv10/e;-><init>(Lv10/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v3, v8, Lv10/e;->E:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v4, v8, Lv10/e;->G:I

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v11, :cond_2

    if-ne v4, v10, :cond_1

    iget-object v0, v8, Lv10/e;->x:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, v8, Lv10/e;->w:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ll83/n;

    iget-object v2, v3, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v8, Lv10/e;->z:Lkotlin/jvm/internal/g0;

    iget-object v1, v8, Lv10/e;->y:Lyy/f;

    iget-object v2, v8, Lv10/e;->x:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v8, Lv10/e;->w:Ljava/lang/Object;

    check-cast v4, Lv10/g;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v2

    move-object v2, v4

    goto :goto_3

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Lkotlin/jvm/internal/f0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-wide v0, v5, Lkotlin/jvm/internal/f0;->w:J

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, Ly00/o4;->E:Ly00/f4;

    if-eqz v0, :cond_4

    iget-object v0, v0, Ly00/f4;->F:Ly00/q3;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ly00/q3;->u()J

    move-result-wide v3

    goto :goto_2

    :cond_4
    const-wide/16 v3, 0x3a98

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v6, v6, p4

    sub-long v12, v3, v6

    new-instance v0, La30/s;

    const/4 v6, 0x0

    const/4 v7, 0x5

    move-object v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v7}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v8, Lv10/e;->w:Ljava/lang/Object;

    iput-object v3, v8, Lv10/e;->x:Ljava/io/Serializable;

    iput-object v4, v8, Lv10/e;->y:Lyy/f;

    iput-object v1, v8, Lv10/e;->z:Lkotlin/jvm/internal/g0;

    iput v11, v8, Lv10/e;->G:I

    invoke-static {v12, v13, v0, v8}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, p0

    move-object v0, v1

    move-object v1, v4

    :goto_3
    iget-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Ll83/n;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lv10/g;->h(Ll83/n;)Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v4, :cond_8

    :cond_6
    iput-object v0, v8, Lv10/e;->w:Ljava/lang/Object;

    iput-object v0, v8, Lv10/e;->x:Ljava/io/Serializable;

    const/4 v4, 0x0

    iput-object v4, v8, Lv10/e;->y:Lyy/f;

    iput-object v4, v8, Lv10/e;->z:Lkotlin/jvm/internal/g0;

    iput v10, v8, Lv10/e;->G:I

    sget-object v4, Lv10/g;->f:Ljava/util/List;

    invoke-virtual {v2, v3, v1, v4, v8}, Lv10/g;->g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_7

    :goto_4
    return-object v9

    :cond_7
    move-object v1, v0

    :goto_5
    new-instance v3, Ll83/n;

    invoke-direct {v3, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v0, v1

    :cond_8
    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(Lv10/g;Ly00/c8;I)Z
    .locals 6

    const/4 p0, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1

    sget-object v2, Ly00/d8;->a:Ljava/util/Set;

    instance-of v2, p1, Ly00/l3;

    if-eqz v2, :cond_1

    sget-object v2, Ly00/d8;->a:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    move-object v3, p1

    check-cast v3, Ly00/l3;

    iget-object v4, v3, Ly00/l3;->N:Ly00/o4;

    if-eqz v4, :cond_0

    iget-object v4, v4, Ly00/o4;->E:Ly00/f4;

    goto :goto_0

    :cond_0
    move-object v4, p0

    :goto_0
    invoke-static {v2, v4}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Ly00/l3;->z()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    const/4 v3, 0x3

    if-ne p2, v3, :cond_3

    invoke-interface {p1}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/model/StripeIntent$Status;->z:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v4, v5, :cond_3

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v4, v4, Ly00/o4;->E:Ly00/f4;

    goto :goto_2

    :cond_2
    move-object v4, p0

    :goto_2
    sget-object v5, Ly00/f4;->I:Ly00/f4;

    if-ne v4, v5, :cond_3

    move v4, v1

    goto :goto_3

    :cond_3
    move v4, v0

    :goto_3
    if-ne p2, v3, :cond_5

    invoke-interface {p1}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v3, Lcom/stripe/android/model/StripeIntent$Status;->E:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v3, :cond_5

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-object p0, p2, Ly00/o4;->E:Ly00/f4;

    :cond_4
    sget-object p2, Ly00/f4;->I:Ly00/f4;

    if-ne p0, p2, :cond_5

    invoke-interface {p1}, Ly00/c8;->O()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object p0

    sget-object p2, Lcom/stripe/android/model/StripeIntent$NextActionType;->z:Lcom/stripe/android/model/StripeIntent$NextActionType;

    if-ne p0, p2, :cond_5

    move p0, v1

    goto :goto_4

    :cond_5
    move p0, v0

    :goto_4
    invoke-interface {p1}, Ly00/c8;->z()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p1, Ly00/o4;->E:Ly00/f4;

    if-eqz p1, :cond_6

    iget-object p1, p1, Ly00/f4;->F:Ly00/q3;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ly00/q3;->I()Z

    move-result p1

    if-ne p1, v1, :cond_6

    move p1, v1

    goto :goto_5

    :cond_6
    move p1, v0

    :goto_5
    if-nez v2, :cond_8

    if-nez v4, :cond_8

    if-nez p0, :cond_8

    if-eqz p1, :cond_7

    goto :goto_6

    :cond_7
    return v0

    :cond_8
    :goto_6
    return v1
.end method

.method public static h(Ll83/n;)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_5

    iget-object p0, p0, Ll83/n;->w:Ljava/lang/Object;

    instance-of v1, p0, Ll83/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object p0, v2

    :cond_0
    check-cast p0, Ly00/c8;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Ly00/c8;->z()Z

    move-result v1

    invoke-interface {p0}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->z:Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    invoke-interface {p0}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p0

    if-eqz p0, :cond_2

    iget-object v2, p0, Ly00/o4;->E:Ly00/f4;

    :cond_2
    sget-object p0, Ly00/f4;->I:Ly00/f4;

    if-ne v2, p0, :cond_3

    move p0, v0

    goto :goto_0

    :cond_3
    move p0, v5

    :goto_0
    if-nez v1, :cond_5

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    return v5

    :cond_5
    :goto_1
    return v0
.end method


# virtual methods
.method public abstract c(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
.end method

.method public abstract d(Ly00/c8;ILjava/lang/String;)Lux/m0;
.end method

.method public final e(Lv10/b;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lv10/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv10/f;

    iget v1, v0, Lv10/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv10/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv10/f;

    invoke-direct {v0, p0, p2}, Lv10/f;-><init>(Lv10/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lv10/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv10/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lrv/a;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lrv/a;-><init>(Lv10/g;Lv10/b;Lq83/d;)V

    iput v3, v0, Lv10/f;->y:I

    iget-object p1, p0, Lv10/g;->d:Lq83/j;

    invoke-static {p1, p2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public abstract f(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
.end method

.method public abstract g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
.end method
