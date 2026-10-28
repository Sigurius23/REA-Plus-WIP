.class public final Lx83/f;
.super Lm83/b;
.source "SourceFile"


# instance fields
.field public final y:Ljava/util/ArrayDeque;

.field public final synthetic z:Lx83/h;


# direct methods
.method public constructor <init>(Lx83/h;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx83/f;->z:Lx83/h;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lx83/f;->y:Ljava/util/ArrayDeque;

    iget-object p1, p1, Lx83/h;->b:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lx83/f;->b(Ljava/io/File;)Lx83/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lx83/d;

    invoke-direct {v1, p1}, Lx83/d;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 p1, 0x2

    iput p1, p0, Lm83/b;->w:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    :goto_0
    iget-object v0, p0, Lx83/f;->y:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx83/g;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    :cond_0
    invoke-virtual {v1}, Lx83/g;->a()Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lx83/g;->a:Ljava/io/File;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const v3, 0x7fffffff

    if-lt v1, v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v2}, Lx83/f;->b(Ljava/io/File;)Lx83/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :goto_1
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    iput-object v0, p0, Lm83/b;->x:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lm83/b;->w:I

    return-void

    :cond_4
    const/4 v0, 0x2

    iput v0, p0, Lm83/b;->w:I

    return-void
.end method

.method public final b(Ljava/io/File;)Lx83/b;
    .locals 2

    iget-object v0, p0, Lx83/f;->z:Lx83/h;

    iget-object v0, v0, Lx83/h;->c:Ljava/lang/Object;

    check-cast v0, Lx83/i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lx83/c;

    invoke-direct {v0, p0, p1}, Lx83/c;-><init>(Lx83/f;Ljava/io/File;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lx83/e;

    const-string v1, "rootDir"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lx83/g;-><init>(Ljava/io/File;)V

    return-object v0
.end method
