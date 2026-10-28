.class public final Lh20/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwz/l1;

.field public final b:Lec3/h2;

.field public final c:Lec3/h2;

.field public final d:Lec3/h2;

.field public final e:Lec3/r1;


# direct methods
.method public constructor <init>(Lwz/l1;)V
    .locals 1

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/x;->a:Lwz/l1;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lh20/x;->b:Lec3/h2;

    iput-object v0, p0, Lh20/x;->c:Lec3/h2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lh20/x;->d:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lh20/x;->e:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final a(Lwz/g0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lh20/w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/w;

    iget v1, v0, Lh20/w;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/w;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/w;

    invoke-direct {v0, p0, p2}, Lh20/w;-><init>(Lh20/x;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh20/w;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/w;->y:I

    sget-object v3, Lzz/e;->a:Lzz/e;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh20/x;->a:Lwz/l1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "configuration"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object p1

    iget p2, p1, Ln20/e;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p1, p1, Ln20/e;->f:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzz/a;

    goto :goto_1

    :pswitch_0
    iget-object p1, p1, Ln20/e;->f:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzz/a;

    goto :goto_1

    :pswitch_1
    iget-object p1, p1, Ln20/e;->f:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzz/a;

    goto :goto_1

    :pswitch_2
    iget-object p1, p1, Ln20/e;->f:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzz/a;

    :goto_1
    iput v4, v0, Lh20/w;->y:I

    iget-object p2, p1, Lzz/a;->a:Lb00/a;

    invoke-virtual {p2}, Lb00/a;->a()Z

    move-result p2

    if-nez p2, :cond_3

    move-object p2, v3

    goto :goto_2

    :cond_3
    iget-object p2, p1, Lzz/a;->f:Lq83/j;

    new-instance v2, Ls40/c0;

    const/4 v5, 0x0

    const/16 v6, 0x1d

    invoke-direct {v2, p1, v5, v6}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    :goto_2
    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_3
    check-cast p2, Lzz/f;

    instance-of p1, p2, Lzz/b;

    if-nez p1, :cond_7

    instance-of p1, p2, Lzz/c;

    if-nez p1, :cond_7

    instance-of p1, p2, Lzz/d;

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_4
    const/4 v4, 0x0

    :goto_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lh20/x;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ld30/o;

    const/16 v2, 0x1d

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v3, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    sget-object v2, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v2, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final c(La30/l0;)V
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    iget-object v2, p0, Lh20/x;->b:Lec3/h2;

    invoke-static {v0, v2, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, La30/l0;->w:Lwz/g0;

    iget-object v0, p0, Lh20/x;->d:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lh20/x;->a:Lwz/l1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "configuration"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    return-void
.end method
