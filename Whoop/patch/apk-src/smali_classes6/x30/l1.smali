.class public final Lx30/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/k1;


# instance fields
.field public final a:Lec3/h2;

.field public final b:Lec3/h2;

.field public final c:Lec3/h2;

.field public final d:Ln53/e;

.field public final e:Lec3/r1;

.field public final f:Ln53/e;


# direct methods
.method public constructor <init>(ZLec3/f2;Z)V
    .locals 3

    const-string v0, "saveForFutureUseCheckedFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f1410e5

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lx30/l1;->a:Lec3/h2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/l1;->b:Lec3/h2;

    iput-object p1, p0, Lx30/l1;->c:Lec3/h2;

    new-instance v0, Lc30/b;

    const/4 v1, 0x5

    invoke-direct {v0, p3, v1}, Lc30/b;-><init>(ZI)V

    invoke-static {p2, p1, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lx30/l1;->d:Ln53/e;

    new-instance p2, Lwz/h1;

    const/16 p3, 0x15

    invoke-direct {p2, p3}, Lwz/h1;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lx30/l1;->e:Lec3/r1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    new-instance p3, Lv6/q;

    const/16 v0, 0x1d

    const/4 v1, 0x0

    invoke-direct {p3, v0, v1}, Lv6/q;-><init>(IB)V

    invoke-static {p2, p1, p3}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lx30/l1;->f:Ln53/e;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    return-void
.end method

.method public final c()Lec3/f2;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/l1;->e:Lec3/r1;

    return-object v0
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/l1;->f:Ln53/e;

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iget-object v0, p0, Lx30/l1;->b:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method
