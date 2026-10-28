.class public final Lsc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/n;


# instance fields
.field public final a:Lsc3/f;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lsc3/f;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/b;->a:Lsc3/f;

    iput-object p2, p0, Lsc3/b;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 1

    iget-object v0, p0, Lsc3/b;->a:Lsc3/f;

    invoke-virtual {v0}, Lsc3/f;->a()Ltc3/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 3

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    iget-object v1, p0, Lsc3/b;->a:Lsc3/f;

    invoke-virtual {v1}, Lsc3/f;->b()Luc3/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lsc3/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsc3/k;

    invoke-interface {v2}, Lsc3/k;->b()Luc3/l;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    new-instance v1, Luc3/l;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v1, v2, v0}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lsc3/b;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/b;

    iget-object v0, p1, Lsc3/b;->a:Lsc3/f;

    iget-object v1, p0, Lsc3/b;->a:Lsc3/f;

    invoke-virtual {v1, v0}, Lsc3/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsc3/b;->b:Ljava/util/ArrayList;

    iget-object p1, p1, Lsc3/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lsc3/b;->a:Lsc3/f;

    iget-object v0, v0, Lsc3/f;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lsc3/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AlternativesParsing("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
