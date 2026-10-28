.class public abstract Lgw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public w:Lgw/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgw/g;->w:Lgw/r;

    return-void
.end method

.method public static a(Ljava/lang/String;)[Lxw/b;
    .locals 11

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v1, v3, :cond_5

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    if-eq v5, v3, :cond_4

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {p0, v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v7

    if-ne v7, v3, :cond_0

    new-instance v0, Lxw/b;

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lxw/b;

    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v2, Lxw/b;

    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Lxw/a;-><init>(Ljava/lang/String;)V

    filled-new-array {v0, v1, v2}, [Lxw/b;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v8, v7, 0x1

    invoke-virtual {p0, v0, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v9

    if-eq v9, v3, :cond_3

    if-eq v9, v3, :cond_2

    add-int/lit8 v10, v9, 0x1

    invoke-virtual {p0, v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Invalid serialized unsecured/JWS/JWE object: Too many part delimiters"

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_2
    :goto_0
    new-instance v0, Lxw/b;

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Lxw/b;

    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v2, Lxw/b;

    invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v3, Lxw/b;

    invoke-virtual {p0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lxw/a;-><init>(Ljava/lang/String;)V

    new-instance v4, Lxw/b;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {p0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0}, Lxw/a;-><init>(Ljava/lang/String;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Lxw/b;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Invalid serialized JWE object: Missing fourth delimiter"

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_4
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Invalid serialized unsecured/JWS/JWE object: Missing second delimiter"

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_5
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Invalid serialized unsecured/JWS/JWE object: Missing part delimiters"

    invoke-direct {p0, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method
