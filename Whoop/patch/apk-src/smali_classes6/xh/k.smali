.class public final Lxh/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxh/h;


# instance fields
.field public final a:Lfi/i;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Lfi/i;

.field public final e:Lgi/i;

.field public final f:Lrh/f;

.field public final g:Z


# direct methods
.method public constructor <init>(Lfi/i;Ljava/util/List;ILfi/i;Lgi/i;Lrh/f;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxh/k;->a:Lfi/i;

    iput-object p2, p0, Lxh/k;->b:Ljava/util/List;

    iput p3, p0, Lxh/k;->c:I

    iput-object p4, p0, Lxh/k;->d:Lfi/i;

    iput-object p5, p0, Lxh/k;->e:Lgi/i;

    iput-object p6, p0, Lxh/k;->f:Lrh/f;

    iput-boolean p7, p0, Lxh/k;->g:Z

    return-void
.end method

.method public static b(Lxh/k;ILfi/i;I)Lxh/k;
    .locals 8

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget p1, p0, Lxh/k;->c:I

    :cond_0
    move v3, p1

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    iget-object p2, p0, Lxh/k;->d:Lfi/i;

    :cond_1
    move-object v4, p2

    iget-object v5, p0, Lxh/k;->e:Lgi/i;

    new-instance v0, Lxh/k;

    iget-object v1, p0, Lxh/k;->a:Lfi/i;

    iget-object v2, p0, Lxh/k;->b:Ljava/util/List;

    iget-object v6, p0, Lxh/k;->f:Lrh/f;

    iget-boolean v7, p0, Lxh/k;->g:Z

    invoke-direct/range {v0 .. v7}, Lxh/k;-><init>(Lfi/i;Ljava/util/List;ILfi/i;Lgi/i;Lrh/f;Z)V

    return-object v0
.end method


# virtual methods
.method public final a(Lfi/i;Lxh/i;)V
    .locals 4

    iget-object v0, p1, Lfi/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lxh/k;->a:Lfi/i;

    iget-object v2, v1, Lfi/i;->a:Landroid/content/Context;

    const-string v3, "Interceptor \'"

    if-ne v0, v2, :cond_3

    iget-object v0, p1, Lfi/i;->b:Ljava/lang/Object;

    sget-object v2, Lfi/n;->a:Lfi/n;

    if-eq v0, v2, :cond_2

    iget-object v0, p1, Lfi/i;->c:Lhi/a;

    iget-object v2, v1, Lfi/i;->c:Lhi/a;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lfi/i;->p:Lgi/j;

    iget-object v0, v1, Lfi/i;->p:Lgi/j;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s target."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot set the request\'s data to null."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s context."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lxh/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxh/j;

    iget v1, v0, Lxh/j;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxh/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxh/j;

    invoke-direct {v0, p0, p1}, Lxh/j;-><init>(Lxh/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lxh/j;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxh/j;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lxh/j;->x:Lxh/i;

    iget-object v0, v0, Lxh/j;->w:Lxh/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxh/k;->b:Ljava/util/List;

    iget v2, p0, Lxh/k;->c:I

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxh/i;

    add-int/2addr v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-static {p0, v2, v4, v5}, Lxh/k;->b(Lxh/k;ILfi/i;I)Lxh/k;

    move-result-object v2

    iput-object p0, v0, Lxh/j;->w:Lxh/k;

    iput-object p1, v0, Lxh/j;->x:Lxh/i;

    iput v3, v0, Lxh/j;->E:I

    invoke-interface {p1, v2, v0}, Lxh/i;->intercept(Lxh/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    check-cast p1, Lfi/l;

    invoke-interface {p1}, Lfi/l;->d()Lfi/i;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lxh/k;->a(Lfi/i;Lxh/i;)V

    return-object p1
.end method
