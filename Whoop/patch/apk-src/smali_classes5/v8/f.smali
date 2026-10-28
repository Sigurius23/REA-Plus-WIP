.class public abstract Lv8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/e;


# instance fields
.field public b:Lv8/d;

.field public c:Lv8/d;

.field public d:Lv8/d;

.field public e:Lv8/d;

.field public f:Ljava/nio/ByteBuffer;

.field public g:Ljava/nio/ByteBuffer;

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    sget-object v0, Lv8/d;->e:Lv8/d;

    iput-object v0, p0, Lv8/f;->d:Lv8/d;

    iput-object v0, p0, Lv8/f;->e:Lv8/d;

    iput-object v0, p0, Lv8/f;->b:Lv8/d;

    iput-object v0, p0, Lv8/f;->c:Lv8/d;

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv8/f;->h:Z

    invoke-virtual {p0}, Lv8/f;->h()V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-boolean v0, p0, Lv8/f;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lv8/e;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Lv8/d;)Lv8/d;
    .locals 0

    iput-object p1, p0, Lv8/f;->d:Lv8/d;

    invoke-virtual {p0, p1}, Lv8/f;->f(Lv8/d;)Lv8/d;

    move-result-object p1

    iput-object p1, p0, Lv8/f;->e:Lv8/d;

    invoke-virtual {p0}, Lv8/f;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv8/f;->e:Lv8/d;

    return-object p1

    :cond_0
    sget-object p1, Lv8/d;->e:Lv8/d;

    return-object p1
.end method

.method public abstract f(Lv8/d;)Lv8/d;
.end method

.method public final flush()V
    .locals 1

    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv8/f;->h:Z

    iget-object v0, p0, Lv8/f;->d:Lv8/d;

    iput-object v0, p0, Lv8/f;->b:Lv8/d;

    iget-object v0, p0, Lv8/f;->e:Lv8/d;

    iput-object v0, p0, Lv8/f;->c:Lv8/d;

    invoke-virtual {p0}, Lv8/f;->g()V

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public isActive()Z
    .locals 2

    iget-object v0, p0, Lv8/f;->e:Lv8/d;

    sget-object v1, Lv8/d;->e:Lv8/d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object p1, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lv8/f;->g:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final reset()V
    .locals 1

    invoke-virtual {p0}, Lv8/f;->flush()V

    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv8/f;->f:Ljava/nio/ByteBuffer;

    sget-object v0, Lv8/d;->e:Lv8/d;

    iput-object v0, p0, Lv8/f;->d:Lv8/d;

    iput-object v0, p0, Lv8/f;->e:Lv8/d;

    iput-object v0, p0, Lv8/f;->b:Lv8/d;

    iput-object v0, p0, Lv8/f;->c:Lv8/d;

    invoke-virtual {p0}, Lv8/f;->i()V

    return-void
.end method
