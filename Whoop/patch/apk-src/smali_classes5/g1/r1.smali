.class public final Lg1/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/a1;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:J


# direct methods
.method public constructor <init>(JJJJJJJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/r1;->a:J

    iput-wide p3, p0, Lg1/r1;->b:J

    iput-wide p5, p0, Lg1/r1;->c:J

    iput-wide p7, p0, Lg1/r1;->d:J

    iput-wide p9, p0, Lg1/r1;->e:J

    iput-wide p11, p0, Lg1/r1;->f:J

    iput-wide p13, p0, Lg1/r1;->g:J

    move-wide p1, p15

    iput-wide p1, p0, Lg1/r1;->h:J

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lg1/r1;->i:J

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lg1/r1;->j:J

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lg1/r1;->k:J

    return-void
.end method


# virtual methods
.method public final a(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;
    .locals 7

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x5d7afd5e

    invoke-virtual {v4, p3}, Lp1/q;->e0(I)V

    const/4 p3, 0x2

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    if-eq v1, v0, :cond_1

    if-ne v1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-wide v0, p0, Lg1/r1;->i:J

    goto :goto_1

    :cond_2
    :goto_0
    iget-wide v0, p0, Lg1/r1;->h:J

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_5

    if-eq v1, v0, :cond_5

    if-ne v1, p3, :cond_4

    iget-wide v0, p0, Lg1/r1;->k:J

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, Lg1/r1;->j:J

    :goto_1
    const/4 p3, 0x0

    if-eqz p1, :cond_7

    const p1, -0x6b666454

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lk3/a;->x:Lk3/a;

    if-ne p2, p1, :cond_6

    const/16 p1, 0x64

    goto :goto_2

    :cond_6
    const/16 p1, 0x32

    :goto_2
    const/4 p2, 0x6

    const/4 v2, 0x0

    invoke-static {p1, p3, v2, p2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const p1, -0x6b63a314

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {p1, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public final b(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;
    .locals 7

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, 0x321f21a5

    invoke-virtual {v4, p3}, Lp1/q;->e0(I)V

    const/4 p3, 0x2

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    if-eq v1, v0, :cond_1

    if-ne v1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-wide v0, p0, Lg1/r1;->d:J

    goto :goto_1

    :cond_2
    :goto_0
    iget-wide v0, p0, Lg1/r1;->c:J

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_6

    if-eq v1, v0, :cond_5

    if-ne v1, p3, :cond_4

    iget-wide v0, p0, Lg1/r1;->g:J

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, Lg1/r1;->f:J

    goto :goto_1

    :cond_6
    iget-wide v0, p0, Lg1/r1;->e:J

    :goto_1
    const/4 p3, 0x0

    if-eqz p1, :cond_8

    const p1, -0x4b2738b7

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lk3/a;->x:Lk3/a;

    if-ne p2, p1, :cond_7

    const/16 p1, 0x64

    goto :goto_2

    :cond_7
    const/16 p1, 0x32

    :goto_2
    const/4 p2, 0x6

    const/4 v2, 0x0

    invoke-static {p1, p3, v2, p2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    const p1, -0x4b247777

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {p1, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v4, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public final c(Lk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;
    .locals 8

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0x2076cb8b

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lk3/a;->x:Lk3/a;

    if-ne p1, p2, :cond_0

    iget-wide v0, p0, Lg1/r1;->b:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lg1/r1;->a:J

    :goto_0
    if-ne p1, p2, :cond_1

    const/16 p1, 0x64

    goto :goto_1

    :cond_1
    const/16 p1, 0x32

    :goto_1
    const/4 p2, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v7, v2, p2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    return-object p1
.end method
