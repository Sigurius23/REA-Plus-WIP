.class public final Lv20/r;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Lec3/w1;

.field public final x:Lec3/q1;

.field public final y:Lec3/r1;


# direct methods
.method public constructor <init>(Lv20/p;)V
    .locals 10

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lv20/r;->w:Lec3/w1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    iput-object v0, p0, Lv20/r;->x:Lec3/q1;

    new-instance v1, Lv20/s;

    iget-object v2, p1, Lv20/p;->a:Ljava/lang/String;

    iget-object v3, p1, Lv20/p;->b:Ljava/lang/String;

    iget-object v0, p1, Lv20/p;->c:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->S(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, "-"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lv20/p;->d:Ljava/lang/String;

    const p1, 0x7f141065

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v6

    const p1, 0x7f141069

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    const v0, 0x7f14106a

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    const v7, 0x7f14106b

    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v8

    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v7

    filled-new-array {p1, v0, v8, v7}, [Ljava/lang/Object;

    move-result-object p1

    const v0, 0x7f141068

    sget-object v7, Lm83/y;->w:Lm83/y;

    invoke-static {v0, p1, v7}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    const v0, 0x7f141062

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    const v8, 0x7f141060

    invoke-static {v8}, Ls4/i;->h(I)Lzy/b;

    move-result-object v8

    filled-new-array {v0, v8}, [Ljava/lang/Object;

    move-result-object v0

    const v8, 0x7f141061

    invoke-static {v8, v0, v7}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v8

    move-object v7, p1

    invoke-direct/range {v1 .. v8}, Lv20/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/b;Lzy/b;Lzy/b;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lv20/r;->y:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final g(Lv20/o;)V
    .locals 4

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lv20/m;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lv20/q;

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v3}, Lv20/q;-><init>(Lv20/r;Lq83/d;I)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    instance-of v0, p1, Lv20/n;

    if-eqz v0, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lv20/q;

    const/4 v3, 0x2

    invoke-direct {v0, p0, v2, v3}, Lv20/q;-><init>(Lv20/r;Lq83/d;I)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    instance-of p1, p1, Lv20/l;

    if-eqz p1, :cond_2

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lv20/q;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lv20/q;-><init>(Lv20/r;Lq83/d;I)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
