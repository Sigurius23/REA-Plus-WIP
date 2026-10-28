.class public final Lj4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm4/e;

.field public b:I

.field public c:I

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:I

.field public final p:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lj4/k;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lj4/k;->a:Lm4/e;

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lj4/k;->b:I

    .line 22
    iput v0, p0, Lj4/k;->c:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 23
    iput v1, p0, Lj4/k;->d:F

    .line 24
    iput v1, p0, Lj4/k;->e:F

    .line 25
    iput v1, p0, Lj4/k;->f:F

    .line 26
    iput v1, p0, Lj4/k;->g:F

    .line 27
    iput v1, p0, Lj4/k;->h:F

    .line 28
    iput v1, p0, Lj4/k;->i:F

    .line 29
    iput v1, p0, Lj4/k;->j:F

    .line 30
    iput v1, p0, Lj4/k;->k:F

    .line 31
    iput v1, p0, Lj4/k;->l:F

    .line 32
    iput v1, p0, Lj4/k;->m:F

    .line 33
    iput v1, p0, Lj4/k;->n:F

    .line 34
    iput v0, p0, Lj4/k;->o:I

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj4/k;->p:Ljava/util/HashMap;

    .line 36
    iget-object v0, p1, Lj4/k;->a:Lm4/e;

    iput-object v0, p0, Lj4/k;->a:Lm4/e;

    .line 37
    iget v0, p1, Lj4/k;->b:I

    iput v0, p0, Lj4/k;->b:I

    .line 38
    iget v0, p1, Lj4/k;->c:I

    iput v0, p0, Lj4/k;->c:I

    .line 39
    invoke-virtual {p0, p1}, Lj4/k;->a(Lj4/k;)V

    return-void
.end method

.method public constructor <init>(Lm4/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lj4/k;->a:Lm4/e;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lj4/k;->b:I

    .line 4
    iput v0, p0, Lj4/k;->c:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 5
    iput v1, p0, Lj4/k;->d:F

    .line 6
    iput v1, p0, Lj4/k;->e:F

    .line 7
    iput v1, p0, Lj4/k;->f:F

    .line 8
    iput v1, p0, Lj4/k;->g:F

    .line 9
    iput v1, p0, Lj4/k;->h:F

    .line 10
    iput v1, p0, Lj4/k;->i:F

    .line 11
    iput v1, p0, Lj4/k;->j:F

    .line 12
    iput v1, p0, Lj4/k;->k:F

    .line 13
    iput v1, p0, Lj4/k;->l:F

    .line 14
    iput v1, p0, Lj4/k;->m:F

    .line 15
    iput v1, p0, Lj4/k;->n:F

    .line 16
    iput v0, p0, Lj4/k;->o:I

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj4/k;->p:Ljava/util/HashMap;

    .line 18
    iput-object p1, p0, Lj4/k;->a:Lm4/e;

    return-void
.end method


# virtual methods
.method public final a(Lj4/k;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p1, Lj4/k;->d:F

    iput v0, p0, Lj4/k;->d:F

    iget v0, p1, Lj4/k;->e:F

    iput v0, p0, Lj4/k;->e:F

    iget v0, p1, Lj4/k;->f:F

    iput v0, p0, Lj4/k;->f:F

    iget v0, p1, Lj4/k;->g:F

    iput v0, p0, Lj4/k;->g:F

    iget v0, p1, Lj4/k;->h:F

    iput v0, p0, Lj4/k;->h:F

    iget v0, p1, Lj4/k;->i:F

    iput v0, p0, Lj4/k;->i:F

    iget v0, p1, Lj4/k;->j:F

    iput v0, p0, Lj4/k;->j:F

    iget v0, p1, Lj4/k;->k:F

    iput v0, p0, Lj4/k;->k:F

    iget v0, p1, Lj4/k;->l:F

    iput v0, p0, Lj4/k;->l:F

    iget v0, p1, Lj4/k;->m:F

    iput v0, p0, Lj4/k;->m:F

    iget v0, p1, Lj4/k;->n:F

    iput v0, p0, Lj4/k;->n:F

    iget v0, p1, Lj4/k;->o:I

    iput v0, p0, Lj4/k;->o:I

    iget-object v0, p0, Lj4/k;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object p1, p1, Lj4/k;->p:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg4/a;

    invoke-virtual {v1}, Lg4/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lg4/a;->a()Lg4/a;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
