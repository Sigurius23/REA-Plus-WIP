.class public final Lx83/c;
.super Lx83/b;
.source "SourceFile"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lx83/f;Ljava/io/File;)V
    .locals 0

    const-string p1, "rootDir"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lx83/g;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 5

    iget-boolean v0, p0, Lx83/c;->e:Z

    iget-object v1, p0, Lx83/g;->a:Ljava/io/File;

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lx83/c;->c:[Ljava/io/File;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lx83/c;->c:[Ljava/io/File;

    if-nez v0, :cond_0

    iput-boolean v2, p0, Lx83/c;->e:Z

    :cond_0
    iget-object v0, p0, Lx83/c;->c:[Ljava/io/File;

    if-eqz v0, :cond_1

    iget v3, p0, Lx83/c;->d:I

    array-length v4, v0

    if-ge v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Lx83/c;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lx83/c;->d:I

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    iget-boolean v0, p0, Lx83/c;->b:Z

    if-nez v0, :cond_2

    iput-boolean v2, p0, Lx83/c;->b:Z

    return-object v1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
