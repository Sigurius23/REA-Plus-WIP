.class public final Lx93/x;
.super Lx93/r;
.source "SourceFile"

# interfaces
.implements Lma3/b;


# instance fields
.field public final a:Lva3/e;


# direct methods
.method public constructor <init>(Lva3/e;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/x;->a:Lva3/e;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;)Lx93/d;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lx93/x;

    if-eqz v0, :cond_0

    check-cast p1, Lx93/x;

    iget-object p1, p1, Lx93/x;->a:Lva3/e;

    iget-object v0, p0, Lx93/x;->a:Lva3/e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic getAnnotations()Ljava/util/Collection;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lx93/x;->a:Lva3/e;

    invoke-virtual {v0}, Lva3/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lx93/x;

    const-string v2, ": "

    invoke-static {v1, v0, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v1, p0, Lx93/x;->a:Lva3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
