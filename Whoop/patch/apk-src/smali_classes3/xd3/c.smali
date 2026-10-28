.class public final Lxd3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Z

.field public f:Z

.field public g:Lb9/b;

.field public h:I

.field public i:J

.field public final synthetic j:Lxd3/f;


# direct methods
.method public constructor <init>(Lxd3/f;Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxd3/c;->j:Lxd3/f;

    iput-object p2, p0, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    new-array v0, p1, [J

    iput-object v0, p0, Lxd3/c;->b:[J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxd3/c;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxd3/c;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxd3/c;->c:Ljava/util/ArrayList;

    iget-object v3, p0, Lxd3/c;->j:Lxd3/f;

    iget-object v3, v3, Lxd3/f;->w:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const-string v2, ".tmp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxd3/c;->d:Ljava/util/ArrayList;

    iget-object v3, p0, Lxd3/c;->j:Lxd3/f;

    iget-object v3, v3, Lxd3/f;->w:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lxd3/d;
    .locals 9

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-boolean v0, p0, Lxd3/c;->e:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lxd3/c;->j:Lxd3/f;

    iget-boolean v1, v0, Lxd3/f;->L:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lxd3/c;->g:Lb9/b;

    if-nez v1, :cond_5

    iget-boolean v1, p0, Lxd3/c;->f:Z

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lxd3/c;->b:[J

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, [J

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_3

    :try_start_0
    iget-object v2, v0, Lxd3/f;->x:Lxd3/e;

    iget-object v3, p0, Lxd3/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne3/e0;

    invoke-virtual {v2, v3}, Lne3/q;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v2

    iget-boolean v3, v0, Lxd3/f;->L:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget v3, p0, Lxd3/c;->h:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lxd3/c;->h:I

    new-instance v3, Lxd3/b;

    invoke-direct {v3, v2, v0, p0}, Lxd3/b;-><init>(Lne3/p0;Lxd3/f;Lxd3/c;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    new-instance v2, Lxd3/d;

    iget-object v3, p0, Lxd3/c;->j:Lxd3/f;

    iget-object v4, p0, Lxd3/c;->a:Ljava/lang/String;

    iget-wide v5, p0, Lxd3/c;->i:J

    invoke-direct/range {v2 .. v8}, Lxd3/d;-><init>(Lxd3/f;Ljava/lang/String;JLjava/util/ArrayList;[J)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lne3/p0;

    invoke-static {v2}, Lwd3/f;->b(Ljava/io/Closeable;)V

    goto :goto_2

    :cond_4
    :try_start_1
    invoke-virtual {v0, p0}, Lxd3/f;->b0(Lxd3/c;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_5
    :goto_3
    const/4 v0, 0x0

    return-object v0
.end method
