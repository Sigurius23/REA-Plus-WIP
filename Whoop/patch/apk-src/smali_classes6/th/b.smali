.class public final Lth/b;
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

.field public final synthetic i:Lth/e;


# direct methods
.method public constructor <init>(Lth/e;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/b;->i:Lth/e;

    iput-object p2, p0, Lth/b;->a:Ljava/lang/String;

    const/4 p1, 0x2

    new-array v0, p1, [J

    iput-object v0, p0, Lth/b;->b:[J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lth/b;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lth/b;->d:Ljava/util/ArrayList;

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

    iget-object v2, p0, Lth/b;->c:Ljava/util/ArrayList;

    iget-object v3, p0, Lth/b;->i:Lth/e;

    iget-object v3, v3, Lth/e;->w:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, ".tmp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lth/b;->d:Ljava/util/ArrayList;

    iget-object v3, p0, Lth/b;->i:Lth/e;

    iget-object v3, v3, Lth/e;->w:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lth/c;
    .locals 7

    iget-boolean v0, p0, Lth/b;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lth/b;->g:Lb9/b;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lth/b;->f:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lth/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lth/b;->i:Lth/e;

    if-ge v3, v2, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    iget-object v6, v4, Lth/e;->Q:Lth/d;

    invoke-virtual {v6, v5}, Lne3/p;->x(Lne3/e0;)Z

    move-result v5

    if-nez v5, :cond_2

    :try_start_0
    invoke-virtual {v4, p0}, Lth/e;->T(Lth/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget v0, p0, Lth/b;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lth/b;->h:I

    new-instance v0, Lth/c;

    invoke-direct {v0, v4, p0}, Lth/c;-><init>(Lth/e;Lth/b;)V

    return-object v0

    :cond_4
    :goto_1
    return-object v1
.end method
