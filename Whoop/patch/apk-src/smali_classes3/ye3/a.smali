.class public final Lye3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf3/a;


# instance fields
.field public final a:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lye3/a;->a:C

    return-void
.end method


# virtual methods
.method public final a(Lxe3/d;Lxe3/d;)I
    .locals 7

    iget-object v0, p1, Lxe3/d;->a:Ljava/util/ArrayList;

    iget-object v1, p2, Lxe3/d;->a:Ljava/util/ArrayList;

    iget-boolean v2, p1, Lxe3/d;->e:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-boolean v2, p2, Lxe3/d;->d:Z

    if-eqz v2, :cond_1

    :cond_0
    iget v2, p2, Lxe3/d;->c:I

    rem-int/lit8 v4, v2, 0x3

    if-eqz v4, :cond_1

    iget v4, p1, Lxe3/d;->c:I

    add-int/2addr v4, v2

    rem-int/lit8 v4, v4, 0x3

    if-nez v4, :cond_1

    return v3

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x1

    iget-char v5, p0, Lye3/a;->a:C

    const/4 v6, 0x2

    if-lt v2, v6, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v2, v6, :cond_2

    new-instance v2, Laf3/z;

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    invoke-direct {v2}, Laf3/t;-><init>()V

    goto :goto_0

    :cond_2
    new-instance v2, Laf3/h;

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    invoke-direct {v2}, Laf3/t;-><init>()V

    move v6, v4

    :goto_0
    new-instance v5, Laa3/u0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v6}, Lxe3/d;->b(I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v5, p1}, Laa3/u0;->h(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v4

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laf3/a0;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laf3/a0;

    iget-object v1, p1, Laf3/t;->e:Laf3/t;

    new-instance v3, Laf3/u;

    invoke-direct {v3, v1, v0}, Laf3/u;-><init>(Laf3/t;Laf3/t;)V

    :goto_1
    invoke-virtual {v3}, Laf3/u;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laf3/t;

    invoke-virtual {v2, v0}, Laf3/t;->c(Laf3/t;)V

    invoke-virtual {v0}, Laf3/t;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Laa3/u0;->g(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2, v6}, Lxe3/d;->a(I)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v5, p2}, Laa3/u0;->h(Ljava/util/List;)V

    iget-object p2, v5, Laa3/u0;->a:Ljava/util/ArrayList;

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_2
    invoke-virtual {v2, p2}, Laf3/t;->h(Ljava/util/List;)V

    invoke-virtual {p1, v2}, Laf3/t;->f(Laf3/t;)V

    return v6
.end method

.method public final b()C
    .locals 1

    iget-char v0, p0, Lye3/a;->a:C

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d()C
    .locals 1

    iget-char v0, p0, Lye3/a;->a:C

    return v0
.end method
