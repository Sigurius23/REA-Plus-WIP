.class public final Lz63/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/o0;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwk/c;Ljava/lang/Object;Lwk/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz63/d;->w:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lz63/d;->x:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lz63/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzd3/g;)V
    .locals 13

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lz63/d;->y:Ljava/lang/Object;

    .line 7
    new-instance v0, Lzd3/e;

    .line 8
    iget-object v6, p1, Lzd3/g;->d:Lae3/g;

    .line 9
    invoke-interface {v6}, Lae3/g;->i()Lne3/o0;

    move-result-object v1

    invoke-interface {v1}, Lne3/o0;->d()Lne3/n0;

    move-result-object v2

    const-wide/16 v3, -0x1

    const/4 v5, 0x1

    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lzd3/e;-><init>(Lzd3/g;Lne3/n0;JZ)V

    iput-object v0, p0, Lz63/d;->w:Ljava/lang/Object;

    .line 11
    new-instance v7, Lzd3/f;

    .line 12
    invoke-interface {v6}, Lae3/g;->i()Lne3/o0;

    move-result-object p1

    invoke-interface {p1}, Lne3/o0;->getSource()Lne3/p0;

    move-result-object v9

    const-wide/16 v10, -0x1

    const/4 v12, 0x1

    move-object v8, v1

    .line 13
    invoke-direct/range {v7 .. v12}, Lzd3/f;-><init>(Lzd3/g;Lne3/p0;JZ)V

    iput-object v7, p0, Lz63/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzk/l;Lpl/e;Lzk/p;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz63/d;->y:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lz63/d;->x:Ljava/lang/Object;

    .line 16
    iput-object p3, p0, Lz63/d;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lz63/a;)V
    .locals 3

    iget-object v0, p0, Lz63/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    iget-object v1, p0, Lz63/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lz63/a;->b(Lz63/d;)V

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-class v0, La73/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cyclic dependency chain found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public b(Ljava/io/File;)Z
    .locals 3

    iget-object v0, p0, Lz63/d;->w:Ljava/lang/Object;

    check-cast v0, Lwk/c;

    iget-object v1, p0, Lz63/d;->x:Ljava/lang/Object;

    iget-object v2, p0, Lz63/d;->y:Ljava/lang/Object;

    check-cast v2, Lwk/h;

    invoke-interface {v0, v1, p1, v2}, Lwk/c;->c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z

    move-result p1

    return p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lz63/d;->y:Ljava/lang/Object;

    check-cast v0, Lzd3/g;

    iget-object v0, v0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0}, Lae3/g;->cancel()V

    return-void
.end method

.method public d()Lne3/n0;
    .locals 1

    iget-object v0, p0, Lz63/d;->w:Ljava/lang/Object;

    check-cast v0, Lzd3/e;

    return-object v0
.end method

.method public getSource()Lne3/p0;
    .locals 1

    iget-object v0, p0, Lz63/d;->x:Ljava/lang/Object;

    check-cast v0, Lzd3/f;

    return-object v0
.end method
