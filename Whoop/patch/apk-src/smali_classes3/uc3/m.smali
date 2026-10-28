.class public final Luc3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc3/k;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc3/m;->a:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lrc3/b;->b(C)Z

    move-result v0

    const-string v1, "String \'"

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lrc3/b;->b(C)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "\' ends with a digit"

    invoke-static {v1, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "\' starts with a digit"

    invoke-static {v1, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Empty string is not allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Luc3/b;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 8

    iget-object p1, p0, Luc3/m;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    new-instance p1, Lsc0/c;

    const/16 p2, 0x11

    invoke-direct {p1, p0, p2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Luc3/g;

    invoke-direct {p2, p3, p1}, Luc3/g;-><init>(ILc93/a;)V

    return-object p2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v5, v1

    :goto_0
    if-ge v5, v0, :cond_2

    add-int v1, p3, v5

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v1, v2, :cond_1

    new-instance v2, Lce3/k;

    const/4 v6, 0x3

    move-object v7, p0

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v2 .. v7}, Lce3/k;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    new-instance p1, Luc3/g;

    invoke-direct {p1, v4, v2}, Luc3/g;-><init>(ILc93/a;)V

    return-object p1

    :cond_1
    move-object v3, p2

    move v4, p3

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move v4, p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc3/m;->a:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
