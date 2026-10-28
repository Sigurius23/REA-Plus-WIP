.class public final Lzk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/f;
.implements Lxk/d;


# instance fields
.field public E:Lwk/e;

.field public F:Ljava/util/List;

.field public G:I

.field public volatile H:Ldl/s;

.field public I:Ljava/io/File;

.field public final w:Ljava/util/List;

.field public final x:Lzk/g;

.field public final y:Lzk/e;

.field public z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lzk/g;Lzk/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lzk/c;->z:I

    iput-object p1, p0, Lzk/c;->w:Ljava/util/List;

    iput-object p2, p0, Lzk/c;->x:Lzk/g;

    iput-object p3, p0, Lzk/c;->y:Lzk/e;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 7

    :cond_0
    :goto_0
    iget-object v0, p0, Lzk/c;->F:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget v3, p0, Lzk/c;->G:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lzk/c;->H:Ldl/s;

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    iget v0, p0, Lzk/c;->G:I

    iget-object v3, p0, Lzk/c;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v0, p0, Lzk/c;->F:Ljava/util/List;

    iget v3, p0, Lzk/c;->G:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lzk/c;->G:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldl/t;

    iget-object v3, p0, Lzk/c;->I:Ljava/io/File;

    iget-object v4, p0, Lzk/c;->x:Lzk/g;

    iget v5, v4, Lzk/g;->e:I

    iget v6, v4, Lzk/g;->f:I

    iget-object v4, v4, Lzk/g;->i:Lwk/h;

    invoke-interface {v0, v3, v5, v6, v4}, Ldl/t;->b(Ljava/lang/Object;IILwk/h;)Ldl/s;

    move-result-object v0

    iput-object v0, p0, Lzk/c;->H:Ldl/s;

    iget-object v0, p0, Lzk/c;->H:Ldl/s;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/c;->x:Lzk/g;

    iget-object v3, p0, Lzk/c;->H:Ldl/s;

    iget-object v3, v3, Ldl/s;->c:Lxk/e;

    invoke-interface {v3}, Lxk/e;->b()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Lzk/g;->c(Ljava/lang/Class;)Lzk/x;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/c;->H:Ldl/s;

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    iget-object v2, p0, Lzk/c;->x:Lzk/g;

    iget-object v2, v2, Lzk/g;->o:Lcom/bumptech/glide/d;

    invoke-interface {v0, v2, p0}, Lxk/e;->e(Lcom/bumptech/glide/d;Lxk/d;)V

    move v2, v1

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    iget v0, p0, Lzk/c;->z:I

    add-int/2addr v0, v1

    iput v0, p0, Lzk/c;->z:I

    iget-object v1, p0, Lzk/c;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lzk/c;->w:Ljava/util/List;

    iget v1, p0, Lzk/c;->z:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwk/e;

    new-instance v1, Lzk/d;

    iget-object v3, p0, Lzk/c;->x:Lzk/g;

    iget-object v4, v3, Lzk/g;->n:Lwk/e;

    invoke-direct {v1, v0, v4}, Lzk/d;-><init>(Lwk/e;Lwk/e;)V

    iget-object v3, v3, Lzk/g;->h:Lio/sentry/android/core/util/a;

    invoke-virtual {v3}, Lio/sentry/android/core/util/a;->a()Lbl/a;

    move-result-object v3

    invoke-interface {v3, v1}, Lbl/a;->n(Lwk/e;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lzk/c;->I:Ljava/io/File;

    if-eqz v1, :cond_0

    iput-object v0, p0, Lzk/c;->E:Lwk/e;

    iget-object v0, p0, Lzk/c;->x:Lzk/g;

    iget-object v0, v0, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v0, v0, Lcom/bumptech/glide/c;->b:La3/l1;

    invoke-virtual {v0, v1}, La3/l1;->i(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lzk/c;->F:Ljava/util/List;

    iput v2, p0, Lzk/c;->G:I

    goto/16 :goto_0
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lzk/c;->y:Lzk/e;

    iget-object v1, p0, Lzk/c;->E:Lwk/e;

    iget-object v2, p0, Lzk/c;->H:Ldl/s;

    iget-object v2, v2, Ldl/s;->c:Lxk/e;

    sget-object v3, Lwk/a;->y:Lwk/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lzk/e;->a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lzk/c;->H:Ldl/s;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    invoke-interface {v0}, Lxk/e;->cancel()V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lzk/c;->y:Lzk/e;

    iget-object v1, p0, Lzk/c;->E:Lwk/e;

    iget-object v2, p0, Lzk/c;->H:Ldl/s;

    iget-object v3, v2, Ldl/s;->c:Lxk/e;

    sget-object v4, Lwk/a;->y:Lwk/a;

    iget-object v5, p0, Lzk/c;->E:Lwk/e;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lzk/e;->c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V

    return-void
.end method
