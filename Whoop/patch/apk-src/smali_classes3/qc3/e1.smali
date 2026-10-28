.class public final Lqc3/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/j;


# instance fields
.field public final a:Lsc3/a;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Lqc3/o0;


# direct methods
.method public constructor <init>(Lqc3/o0;)V
    .locals 5

    sget-object v0, Lqc3/i1;->a:Lsc3/m;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lqc3/o0;->w:Lqc3/o0;

    if-ne p1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Lqc3/o0;->x:Lqc3/o0;

    if-ne p1, v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "field"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lqc3/e1;->a:Lsc3/a;

    iput-object v1, p0, Lqc3/e1;->b:Ljava/lang/Integer;

    iput-object v3, p0, Lqc3/e1;->c:Ljava/lang/Integer;

    iput-object v2, p0, Lqc3/e1;->d:Ljava/lang/Integer;

    iput-object p1, p0, Lqc3/e1;->e:Lqc3/o0;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 4

    new-instance v0, Ltc3/a;

    new-instance v1, Lq00/h0;

    iget-object v1, p0, Lqc3/e1;->a:Lsc3/a;

    invoke-virtual {v1}, Lsc3/a;->a()Lsc3/r;

    iget-object v1, p0, Lqc3/e1;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "The minimum number of digits ("

    if-ltz v1, :cond_3

    const/16 v3, 0x9

    if-gt v1, v3, :cond_2

    iget-object v1, p0, Lqc3/e1;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    new-instance v0, Ltc3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_1
    return-object v0

    :cond_2
    const-string v0, ") exceeds the length of an Int"

    invoke-static {v1, v2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string v0, ") is negative"

    invoke-static {v1, v2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Luc3/l;
    .locals 13

    iget-object v0, p0, Lqc3/e1;->a:Lsc3/a;

    invoke-virtual {v0}, Lsc3/a;->a()Lsc3/r;

    move-result-object v4

    invoke-virtual {v0}, Lsc3/a;->c()Ljava/lang/String;

    move-result-object v5

    const-string v0, "setter"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    iget-object v1, p0, Lqc3/e1;->b:Ljava/lang/Integer;

    const/4 v2, 0x0

    iget-object v3, p0, Lqc3/e1;->c:Ljava/lang/Integer;

    invoke-static/range {v1 .. v6}, Lsc3/l;->j(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)Luc3/l;

    move-result-object v0

    move-object v7, v2

    filled-new-array {v0}, [Luc3/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Lqc3/e1;->d:Ljava/lang/Integer;

    sget-object v8, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lsc3/l;->j(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)Luc3/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Luc3/l;

    new-instance v10, Luc3/m;

    const-string v1, "+"

    invoke-direct {v10, v1}, Luc3/m;-><init>(Ljava/lang/String;)V

    new-instance v11, Luc3/f;

    new-instance v1, Luc3/q;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v12, 0x1

    add-int/2addr v2, v12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v3, v7

    invoke-direct/range {v1 .. v6}, Luc3/q;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v11, v1}, Luc3/f;-><init>(Ljava/util/List;)V

    const/4 v1, 0x2

    new-array v1, v1, [Luc3/k;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    aput-object v11, v1, v12

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v9, v1, v8}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v2, v7

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lsc3/l;->j(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)Luc3/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance v1, Luc3/l;

    invoke-direct {v1, v8, v0}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final c()Lsc3/a;
    .locals 1

    iget-object v0, p0, Lqc3/e1;->a:Lsc3/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lqc3/e1;

    if-eqz v0, :cond_0

    check-cast p1, Lqc3/e1;

    iget-object p1, p1, Lqc3/e1;->e:Lqc3/o0;

    iget-object v0, p0, Lqc3/e1;->e:Lqc3/o0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lqc3/e1;->e:Lqc3/o0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
