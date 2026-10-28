.class public final Lg40/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/k1;


# instance fields
.field public final synthetic a:I

.field public final b:Lec3/h2;

.field public final c:Lec3/r1;

.field public final d:Ln53/e;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lg40/u2;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 14
    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f1410e1

    .line 15
    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    .line 16
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->b:Lec3/h2;

    .line 17
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->e:Ljava/lang/Object;

    .line 18
    iput-object p1, p0, Lg40/u2;->f:Ljava/lang/Object;

    .line 19
    new-instance p2, Lwz/h1;

    const/16 v0, 0x14

    invoke-direct {p2, v0}, Lwz/h1;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    const/4 p2, 0x0

    .line 20
    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lg40/u2;->c:Lec3/r1;

    .line 21
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    .line 22
    new-instance v0, Lv6/q;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv6/q;-><init>(IB)V

    invoke-static {p2, p1, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->d:Ln53/e;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lg40/u2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f140fcd

    .line 4
    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lg40/u2;->c:Lec3/r1;

    .line 6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->b:Lec3/h2;

    .line 7
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->e:Ljava/lang/Object;

    .line 8
    new-instance v0, Lg40/y1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg40/y1;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lg40/u2;->f:Ljava/lang/Object;

    .line 10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    .line 11
    new-instance v0, Lg40/y1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg40/y1;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/u2;->d:Ln53/e;

    return-void
.end method

.method private final i(Z)V
    .locals 0

    return-void
.end method

.method private final u(Z)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    iget p1, p0, Lg40/u2;->a:I

    return-void
.end method

.method public c()Lec3/f2;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget v0, p0, Lg40/u2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/u2;->c:Lec3/r1;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg40/u2;->f:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget v0, p0, Lg40/u2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/u2;->d:Ln53/e;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg40/u2;->d:Ln53/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lg40/u2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iget-object v0, p0, Lg40/u2;->e:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    iget-object v0, p0, Lg40/u2;->b:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
