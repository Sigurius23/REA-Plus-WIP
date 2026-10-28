.class public final Lm00/d;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lqy/d;

.field public final F:Lh20/g;

.field public final G:Lwz/m1;

.field public final H:Lwz/n0;

.field public final I:Lkotlin/jvm/functions/Function1;

.field public final J:Lec3/h2;

.field public final K:Lec3/h2;

.field public final w:Lwz/g0;

.field public final x:Ld00/l;

.field public final y:Lxz/x;

.field public final z:La00/g;


# direct methods
.method public constructor <init>(Lwz/g0;Ld00/l;Lxz/x;La00/g;Lqy/d;Lh20/g;Lwz/m1;Lwz/n0;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    move-object/from16 v0, p8

    move-object/from16 v1, p9

    const-string v2, "configuration"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAccountManager"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "logger"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dismissalCoordinator"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkLaunchMode"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dismissWithResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lm00/d;->w:Lwz/g0;

    iput-object p2, p0, Lm00/d;->x:Ld00/l;

    iput-object p3, p0, Lm00/d;->y:Lxz/x;

    iput-object p4, p0, Lm00/d;->z:La00/g;

    iput-object p5, p0, Lm00/d;->E:Lqy/d;

    iput-object p6, p0, Lm00/d;->F:Lh20/g;

    iput-object p7, p0, Lm00/d;->G:Lwz/m1;

    iput-object v0, p0, Lm00/d;->H:Lwz/n0;

    iput-object v1, p0, Lm00/d;->I:Lkotlin/jvm/functions/Function1;

    sget-object p2, Ly00/f4;->G:Lt9/c0;

    const-string p2, "card"

    invoke-virtual {p6, p2}, Lh20/g;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p6, p2}, Lh20/g;->a(Ljava/lang/String;)Ls20/a;

    move-result-object v1

    sget-object v3, Lh00/o0;->y:Lh00/o0;

    iget-object p1, p1, Lwz/g0;->w:Ly00/c8;

    invoke-static {p1, v0}, Lh00/n0;->e(Ly00/c8;Lwz/n0;)Lzy/b;

    move-result-object v4

    new-instance v0, Lm00/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lm00/a;-><init>(Ls20/a;Ljava/util/List;Lh00/o0;Lzy/c;ZLy00/d5;Lzy/c;)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lm00/d;->J:Lec3/h2;

    iput-object p1, p0, Lm00/d;->K:Lec3/h2;

    return-void
.end method

.method public static final g(Lm00/d;Lwz/q0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p4, Lm00/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lm00/b;

    iget v1, v0, Lm00/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm00/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm00/b;

    invoke-direct {v0, p0, p4}, Lm00/b;-><init>(Lm00/d;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lm00/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm00/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lm00/b;->w:Lm00/d;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, p0, Lm00/d;->z:La00/g;

    move p4, v3

    new-instance v3, Lwz/t0;

    invoke-direct {v3, p1, p2, p3}, Lwz/t0;-><init>(Lwz/q0;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lm00/d;->x:Ld00/l;

    iput-object p0, v0, Lm00/b;->w:Lm00/d;

    iput p4, v0, Lm00/b;->z:I

    iget-object p1, v4, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Lwz/n0;

    new-instance v2, La00/f;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, p1, v2, v3, v0}, La00/g;->i(Lwz/n0;La00/f;Lwz/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, La00/d;

    instance-of p1, p4, La00/a;

    if-nez p1, :cond_7

    instance-of p1, p4, La00/c;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lm00/d;->J:Lec3/h2;

    :cond_4
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lm00/a;

    move-object p2, p4

    check-cast p2, La00/c;

    iget-object v4, p2, La00/c;->a:Lzy/c;

    const/16 v5, 0x3f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm00/a;->a(Lm00/a;Lh00/o0;ZLy00/d5;Lzy/c;I)Lm00/a;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_5
    instance-of p1, p4, La00/b;

    if-eqz p1, :cond_6

    iget-object p0, p0, Lm00/d;->I:Lkotlin/jvm/functions/Function1;

    check-cast p4, La00/b;

    iget-object p1, p4, La00/b;->a:Lwz/n;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lm00/d;Lh00/o0;)V
    .locals 7

    iget-object p0, p0, Lm00/d;->J:Lec3/h2;

    :goto_0
    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lm00/a;

    const/4 v5, 0x0

    const/16 v6, 0x7b

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lm00/a;->a(Lm00/a;Lh00/o0;ZLy00/d5;Lzy/c;I)Lm00/a;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v2

    goto :goto_0
.end method
