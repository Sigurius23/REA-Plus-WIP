.class public final Lmt0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmt0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lmt0/b$a;",
        "",
        "<init>",
        "()V",
        "Llt0/i;",
        "frame",
        "Lmt0/b;",
        "a",
        "(Llt0/i;)Lmt0/b;",
        "connectivity-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmt0/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llt0/i;)Lmt0/b;
    .locals 5

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llt0/i;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Llt0/i;->c()I

    move-result v1

    invoke-static {v0}, Ltt0/d;->c(Ljava/nio/ByteBuffer;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v2

    invoke-static {v2}, Ltt0/d;->a(I)I

    move-result v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    instance-of v1, p1, Lmt0/e;

    if-eqz v1, :cond_1

    new-instance v1, Lmt0/b;

    new-instance v3, Lmt0/e;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Lmt0/e;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v1, v3}, Lmt0/b;-><init>(Llt0/i;)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lmt0/d;

    if-eqz v1, :cond_2

    new-instance v1, Lmt0/b;

    new-instance v3, Lmt0/d;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Lmt0/d;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v1, v3}, Lmt0/b;-><init>(Llt0/i;)V

    goto :goto_1

    :cond_2
    instance-of v1, p1, Lmt0/f;

    if-eqz v1, :cond_3

    new-instance v1, Lmt0/b;

    new-instance v3, Lmt0/f;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Lmt0/f;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v1, v3}, Lmt0/b;-><init>(Llt0/i;)V

    goto :goto_1

    :cond_3
    instance-of v1, p1, Lmt0/h;

    if-eqz v1, :cond_4

    new-instance v1, Lmt0/b;

    new-instance v3, Lmt0/h;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Lmt0/h;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v1, v3}, Lmt0/b;-><init>(Llt0/i;)V

    goto :goto_1

    :cond_4
    new-instance v1, Lmt0/b;

    new-instance v3, Lmt0/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, v0}, Lmt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v1, v3}, Lmt0/b;-><init>(Llt0/i;)V

    :goto_1
    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object v0

    invoke-virtual {v0}, Llt0/i;->m()V

    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object v0

    invoke-virtual {v0}, Llt0/i;->o()V

    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object v0

    sget-object v3, Lmt0/a$b;->b:Lmt0/a$b;

    invoke-virtual {v0, v3}, Llt0/i;->p(Lmt0/a;)V

    instance-of p1, p1, Lmt0/f;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object p1

    sget-object v0, Lmt0/a$a;->b:Lmt0/a$a;

    invoke-virtual {p1, v0}, Llt0/i;->l(Lmt0/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object p1

    sget-object v0, Lmt0/a$c;->b:Lmt0/a$c;

    invoke-virtual {p1, v0}, Llt0/i;->l(Lmt0/a;)V

    :goto_2
    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object p1

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p1, v0}, Llt0/i;->n(I)V

    invoke-virtual {v1}, Lmt0/b;->b()Llt0/i;

    move-result-object p1

    invoke-virtual {p1}, Llt0/i;->j()V

    invoke-virtual {v1, v2}, Lmt0/b;->g(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    sget-object p1, Ltt0/c;->a:Ltt0/c;

    invoke-virtual {p1, v2}, Ltt0/c;->c(Ljava/nio/ByteBuffer;)J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Lmt0/b;->a(Lmt0/b;J)V

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v1
.end method
