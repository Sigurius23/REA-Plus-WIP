.class public abstract Lfc3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc3/q;


# instance fields
.field public final w:Lq83/j;

.field public final x:I

.field public final y:Ldc3/a;


# direct methods
.method public constructor <init>(Lq83/j;ILdc3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc3/d;->w:Lq83/j;

    iput p2, p0, Lfc3/d;->x:I

    iput-object p3, p0, Lfc3/d;->y:Ldc3/a;

    return-void
.end method


# virtual methods
.method public final b(Lq83/j;ILdc3/a;)Lec3/l;
    .locals 4

    iget-object v0, p0, Lfc3/d;->w:Lq83/j;

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    sget-object v1, Ldc3/a;->w:Ldc3/a;

    iget-object v2, p0, Lfc3/d;->y:Ldc3/a;

    iget v3, p0, Lfc3/d;->x:I

    if-eq p3, v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 p3, -0x3

    if-ne v3, p3, :cond_1

    goto :goto_1

    :cond_1
    if-ne p2, p3, :cond_2

    :goto_0
    move p2, v3

    goto :goto_1

    :cond_2
    const/4 p3, -0x2

    if-ne v3, p3, :cond_3

    goto :goto_1

    :cond_3
    if-ne p2, p3, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr p2, v3

    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7fffffff

    :goto_1
    move-object p3, v2

    :goto_2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne p2, v3, :cond_6

    if-ne p3, v2, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lfc3/d;->f(Lq83/j;ILdc3/a;)Lfc3/d;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, La6/v;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-direct {v0, p1, p0, v1, v2}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public abstract e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
.end method

.method public abstract f(Lq83/j;ILdc3/a;)Lfc3/d;
.end method

.method public g()Lec3/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Lbc3/c0;)Ldc3/w;
    .locals 5

    const/4 v0, -0x3

    iget v1, p0, Lfc3/d;->x:I

    if-ne v1, v0, :cond_0

    const/4 v1, -0x2

    :cond_0
    sget-object v0, Lbc3/d0;->y:Lbc3/d0;

    new-instance v2, La6/c;

    const/4 v3, 0x0

    const/16 v4, 0xf

    invoke-direct {v2, p0, v3, v4}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x4

    iget-object v4, p0, Lfc3/d;->y:Ldc3/a;

    invoke-static {v1, v3, v4}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v1

    iget-object v3, p0, Lfc3/d;->w:Lq83/j;

    invoke-static {p1, v3}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance v3, Ldc3/t;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v1, v4, v4}, Ldc3/t;-><init>(Lq83/j;Ldc3/h;ZZ)V

    invoke-virtual {v3, v0, v3, v2}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lfc3/d;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v1, Lq83/k;->w:Lq83/k;

    iget-object v2, p0, Lfc3/d;->w:Lq83/j;

    if-eq v2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "context="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, -0x3

    iget v2, p0, Lfc3/d;->x:I

    if-eq v2, v1, :cond_2

    const-string v1, "capacity="

    invoke-static {v2, v1, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_2
    sget-object v1, Ldc3/a;->w:Ldc3/a;

    iget-object v2, p0, Lfc3/d;->y:Ldc3/a;

    if-eq v2, v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "onBufferOverflow="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, ", "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-static {v6, v0, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
