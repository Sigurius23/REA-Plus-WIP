.class public final Ln6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/o;


# instance fields
.field public final a:Ln6/o;

.field public final b:Ln6/o;


# direct methods
.method public constructor <init>(Ln6/o;Ln6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/g;->a:Ln6/o;

    iput-object p2, p0, Ln6/g;->b:Ln6/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln6/g;->a:Ln6/o;

    invoke-interface {v0, p1, p2}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ln6/g;->b:Ln6/o;

    invoke-interface {v0, p1, p2}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lov2/f;)Z
    .locals 1

    iget-object v0, p0, Ln6/g;->a:Ln6/o;

    invoke-interface {v0, p1}, Ln6/o;->b(Lov2/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln6/g;->b:Ln6/o;

    invoke-interface {v0, p1}, Ln6/o;->b(Lov2/f;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    iget-object v0, p0, Ln6/g;->a:Ln6/o;

    invoke-interface {v0, p1}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln6/g;->b:Ln6/o;

    invoke-interface {v0, p1}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ln6/g;

    if-eqz v0, :cond_0

    check-cast p1, Ln6/g;

    iget-object v0, p1, Ln6/g;->a:Ln6/o;

    iget-object v1, p0, Ln6/g;->a:Ln6/o;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln6/g;->b:Ln6/o;

    iget-object p1, p1, Ln6/g;->b:Ln6/o;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    iget-object v0, p0, Ln6/g;->a:Ln6/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ln6/g;->b:Ln6/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Lm22/b;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Ln6/g;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x5d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
