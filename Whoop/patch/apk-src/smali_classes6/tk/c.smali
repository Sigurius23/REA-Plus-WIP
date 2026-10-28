.class public final Ltk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public final c:[Ljava/io/File;

.field public final d:[Ljava/io/File;

.field public e:Z

.field public f:Lb9/b;

.field public final synthetic g:Ltk/d;


# direct methods
.method public constructor <init>(Ltk/d;Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk/c;->g:Ltk/d;

    iput-object p2, p0, Ltk/c;->a:Ljava/lang/String;

    iget v0, p1, Ltk/d;->G:I

    iget-object p1, p1, Ltk/d;->w:Ljava/io/File;

    new-array v1, v0, [J

    iput-object v1, p0, Ltk/c;->b:[J

    new-array v1, v0, [Ljava/io/File;

    iput-object v1, p0, Ltk/c;->c:[Ljava/io/File;

    new-array v1, v0, [Ljava/io/File;

    iput-object v1, p0, Ltk/c;->d:[Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltk/c;->c:[Ljava/io/File;

    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v4, v3, v2

    const-string v3, ".tmp"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ltk/c;->d:[Ljava/io/File;

    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v4, v3, v2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic a(Ltk/c;)[J
    .locals 0

    iget-object p0, p0, Ltk/c;->b:[J

    return-object p0
.end method

.method public static synthetic b(Ltk/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ltk/c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Ltk/c;J)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static synthetic d(Ltk/c;)Z
    .locals 0

    iget-boolean p0, p0, Ltk/c;->e:Z

    return p0
.end method

.method public static synthetic e(Ltk/c;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltk/c;->e:Z

    return-void
.end method

.method public static synthetic f(Ltk/c;)Lb9/b;
    .locals 0

    iget-object p0, p0, Ltk/c;->f:Lb9/b;

    return-object p0
.end method

.method public static synthetic g(Ltk/c;Lb9/b;)V
    .locals 0

    iput-object p1, p0, Ltk/c;->f:Lb9/b;

    return-void
.end method

.method public static h(Ltk/c;[Ljava/lang/String;)V
    .locals 5

    array-length v0, p1

    iget-object v1, p0, Ltk/c;->g:Ltk/d;

    iget v1, v1, Ltk/d;->G:I

    const-string v2, "unexpected journal line: "

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ltk/c;->b:[J

    aget-object v3, p1, v0

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final i(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Ltk/c;->c:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final j(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Ltk/c;->d:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final k()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltk/c;->b:[J

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-wide v4, v1, v3

    const/16 v6, 0x20

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
