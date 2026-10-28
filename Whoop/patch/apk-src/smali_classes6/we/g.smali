.class public final Lwe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lug/b;

.field public e:Lkotlin/jvm/functions/Function1;

.field public f:Lwe/e;

.field public g:Lwe/c;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Lwe/b0;

.field public l:Lwe/d;

.field public m:Lve/e;

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lwe/g;->a:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lwd3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lwd3/b;-><init>(I)V

    iput-object v0, p0, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    .line 33
    sget-object v0, Lwe/e;->x:Lwe/e;

    iput-object v0, p0, Lwe/g;->f:Lwe/e;

    .line 34
    sget-object v0, Lwe/c;->w:Lwe/c;

    iput-object v0, p0, Lwe/g;->g:Lwe/c;

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lwe/g;->h:Z

    .line 36
    iput-boolean v0, p0, Lwe/g;->i:Z

    .line 37
    sget-object v0, Lwe/d;->w:Lwe/d;

    iput-object v0, p0, Lwe/g;->l:Lwe/d;

    return-void
.end method

.method public constructor <init>(Lwe/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwe/g;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lwe/g;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 3
    iput-object v0, p0, Lwe/g;->b:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lwe/g;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 5
    iput-object v0, p0, Lwe/g;->c:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Lwe/g;->d:Lug/b;

    if-nez v0, :cond_0

    .line 7
    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lwe/g;->d:Lug/b;

    .line 8
    iget-object v0, p1, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    .line 9
    iput-object v0, p0, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    iget-object v0, p1, Lwe/g;->f:Lwe/e;

    .line 11
    iput-object v0, p0, Lwe/g;->f:Lwe/e;

    .line 12
    iget-object v0, p1, Lwe/g;->g:Lwe/c;

    .line 13
    iput-object v0, p0, Lwe/g;->g:Lwe/c;

    .line 14
    iget-boolean v0, p1, Lwe/g;->h:Z

    .line 15
    iput-boolean v0, p0, Lwe/g;->h:Z

    .line 16
    iget-boolean v0, p1, Lwe/g;->i:Z

    .line 17
    iput-boolean v0, p0, Lwe/g;->i:Z

    .line 18
    iget-boolean v0, p1, Lwe/g;->j:Z

    .line 19
    iput-boolean v0, p0, Lwe/g;->j:Z

    .line 20
    iget-object v0, p1, Lwe/g;->k:Lwe/b0;

    if-nez v0, :cond_1

    .line 21
    sget-object v0, Lwe/v;->a:Lwe/v;

    :cond_1
    iput-object v0, p0, Lwe/g;->k:Lwe/b0;

    .line 22
    iget-object v0, p1, Lwe/g;->l:Lwe/d;

    .line 23
    iput-object v0, p0, Lwe/g;->l:Lwe/d;

    .line 24
    iget-object v0, p1, Lwe/g;->m:Lve/e;

    if-eqz v0, :cond_2

    .line 25
    iput-object v0, p0, Lwe/g;->m:Lve/e;

    .line 26
    iget-boolean p1, p1, Lwe/g;->n:Z

    .line 27
    iput-boolean p1, p0, Lwe/g;->n:Z

    return-void

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Signing config must specify credentials"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Signing config must specify a service"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Signing config must specify a region"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lwe/g;
    .locals 1

    new-instance v0, Lwe/g;

    invoke-direct {v0, p0}, Lwe/g;-><init>(Lwe/g;)V

    return-object v0
.end method

.method public final b()Lwe/e;
    .locals 1

    iget v0, p0, Lwe/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwe/g;->f:Lwe/e;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwe/g;->f:Lwe/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()Lve/e;
    .locals 1

    iget-object v0, p0, Lwe/g;->m:Lve/e;

    return-object v0
.end method

.method public d()Lwe/b0;
    .locals 1

    iget-object v0, p0, Lwe/g;->k:Lwe/b0;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lwe/g;->n:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lwe/g;->j:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwe/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lwe/c;
    .locals 1

    iget-object v0, p0, Lwe/g;->g:Lwe/c;

    return-object v0
.end method

.method public i()Lwe/d;
    .locals 1

    iget-object v0, p0, Lwe/g;->l:Lwe/d;

    return-object v0
.end method

.method public j()Lug/b;
    .locals 1

    iget-object v0, p0, Lwe/g;->d:Lug/b;

    return-object v0
.end method

.method public k(Lwe/e;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwe/g;->f:Lwe/e;

    return-void
.end method

.method public l(Lve/e;)V
    .locals 0

    iput-object p1, p0, Lwe/g;->m:Lve/e;

    return-void
.end method

.method public m(Lwe/b0;)V
    .locals 0

    iput-object p1, p0, Lwe/g;->k:Lwe/b0;

    return-void
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lwe/g;->n:Z

    return-void
.end method

.method public o(Z)V
    .locals 0

    iput-boolean p1, p0, Lwe/g;->i:Z

    return-void
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Lwe/g;->j:Z

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwe/g;->b:Ljava/lang/String;

    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwe/g;->c:Ljava/lang/String;

    return-void
.end method

.method public s(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public t(Lwe/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwe/g;->g:Lwe/c;

    return-void
.end method

.method public u(Lwe/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwe/g;->l:Lwe/d;

    return-void
.end method

.method public v(Lug/b;)V
    .locals 0

    iput-object p1, p0, Lwe/g;->d:Lug/b;

    return-void
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Lwe/g;->h:Z

    return-void
.end method

.method public x()Lwe/g;
    .locals 2

    new-instance v0, Lwe/g;

    invoke-direct {v0}, Lwe/g;-><init>()V

    iget-object v1, p0, Lwe/g;->b:Ljava/lang/String;

    iput-object v1, v0, Lwe/g;->b:Ljava/lang/String;

    iget-object v1, p0, Lwe/g;->c:Ljava/lang/String;

    iput-object v1, v0, Lwe/g;->c:Ljava/lang/String;

    iget-object v1, p0, Lwe/g;->d:Lug/b;

    iput-object v1, v0, Lwe/g;->d:Lug/b;

    iget-object v1, p0, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lwe/g;->s(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lwe/g;->f:Lwe/e;

    invoke-virtual {v0, v1}, Lwe/g;->k(Lwe/e;)V

    iget-object v1, p0, Lwe/g;->g:Lwe/c;

    invoke-virtual {v0, v1}, Lwe/g;->t(Lwe/c;)V

    iget-boolean v1, p0, Lwe/g;->h:Z

    iput-boolean v1, v0, Lwe/g;->h:Z

    iget-boolean v1, p0, Lwe/g;->i:Z

    iput-boolean v1, v0, Lwe/g;->i:Z

    iget-boolean v1, p0, Lwe/g;->j:Z

    iput-boolean v1, v0, Lwe/g;->j:Z

    iget-object v1, p0, Lwe/g;->k:Lwe/b0;

    iput-object v1, v0, Lwe/g;->k:Lwe/b0;

    iget-object v1, p0, Lwe/g;->l:Lwe/d;

    invoke-virtual {v0, v1}, Lwe/g;->u(Lwe/d;)V

    iget-object v1, p0, Lwe/g;->m:Lve/e;

    iput-object v1, v0, Lwe/g;->m:Lve/e;

    iget-boolean v1, p0, Lwe/g;->n:Z

    iput-boolean v1, v0, Lwe/g;->n:Z

    return-object v0
.end method
