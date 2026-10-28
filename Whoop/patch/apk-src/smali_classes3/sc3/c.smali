.class public final Lsc3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/n;


# instance fields
.field public final a:Lsc3/j;


# direct methods
.method public constructor <init>(Lsc3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/c;->a:Lsc3/j;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 1

    iget-object v0, p0, Lsc3/c;->a:Lsc3/j;

    invoke-interface {v0}, Lsc3/j;->a()Ltc3/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 1

    iget-object v0, p0, Lsc3/c;->a:Lsc3/j;

    invoke-interface {v0}, Lsc3/j;->b()Luc3/l;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lsc3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/c;

    iget-object p1, p1, Lsc3/c;->a:Lsc3/j;

    iget-object v0, p0, Lsc3/c;->a:Lsc3/j;

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
    .locals 1

    iget-object v0, p0, Lsc3/c;->a:Lsc3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BasicFormatStructure("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/c;->a:Lsc3/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
