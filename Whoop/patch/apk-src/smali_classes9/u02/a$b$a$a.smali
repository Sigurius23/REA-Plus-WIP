.class public final Lu02/a$b$a$a;
.super Lu02/a$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu02/a$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lu02/a$b$a<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u0000*\u0006\u0008\u0003\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00030\u0002B-\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lu02/a$b$a$a;",
        "T",
        "Lu02/a$b$a;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "",
        "errorMessage",
        "",
        "errorCode",
        "",
        "handled",
        "<init>",
        "(Ljava/lang/Exception;Ljava/lang/String;IZ)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "f",
        "Ljava/lang/Exception;",
        "b",
        "()Ljava/lang/Exception;",
        "g",
        "Ljava/lang/String;",
        "a",
        "h",
        "I",
        "d",
        "i",
        "Z",
        "c",
        "()Z",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final f:Ljava/lang/Exception;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lu02/a$b$a;-><init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V

    .line 2
    iput-object p1, p0, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    .line 3
    iput-object p2, p0, Lu02/a$b$a$a;->g:Ljava/lang/String;

    .line 4
    iput p3, p0, Lu02/a$b$a$a;->h:I

    .line 5
    iput-boolean p4, p0, Lu02/a$b$a$a;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Exception;Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/16 p3, 0x3e7

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lu02/a$b$a$a;-><init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu02/a$b$a$a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lu02/a$b$a$a;->i:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu02/a$b$a$a;->h:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu02/a$b$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu02/a$b$a$a;

    iget-object v1, p0, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    iget-object v3, p1, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lu02/a$b$a$a;->g:Ljava/lang/String;

    iget-object v3, p1, Lu02/a$b$a$a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lu02/a$b$a$a;->h:I

    iget v3, p1, Lu02/a$b$a$a;->h:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lu02/a$b$a$a;->i:Z

    iget-boolean p1, p1, Lu02/a$b$a$a;->i:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lu02/a$b$a$a;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lu02/a$b$a$a;->h:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lu02/a$b$a$a;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lu02/a$b$a$a;->f:Ljava/lang/Exception;

    iget-object v1, p0, Lu02/a$b$a$a;->g:Ljava/lang/String;

    iget v2, p0, Lu02/a$b$a$a;->h:I

    iget-boolean v3, p0, Lu02/a$b$a$a;->i:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Deserialization(exception="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorCode="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", handled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
