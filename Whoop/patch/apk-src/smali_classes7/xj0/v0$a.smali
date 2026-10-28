.class public final Lxj0/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxj0/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/v0$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0010\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxj0/v0$a;",
        "",
        "<init>",
        "()V",
        "Lst0/v;",
        "deviceType",
        "Llt0/e;",
        "c",
        "(Lst0/v;)Llt0/e;",
        "Lfk2/a;",
        "timeStamp",
        "Ljava/nio/ByteBuffer;",
        "d",
        "(Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;",
        "",
        "LENGTH_REVISION",
        "I",
        "LENGTH_EPOCH_SECONDS",
        "LENGTH_EPOCH_SUBSECONDS",
        "OFFSET_REVISION",
        "OFFSET_EPOCH_SECONDS",
        "OFFSET_EPOCH_SUBSECONDS",
        "LENGTH_BODY",
        "OFFSET_DEPRECATED_EPOCH_SECONDS",
        "OFFSET_DEPRECATED_SUB_SECOND",
        "LENGTH_DEPRECATED_BODY",
        "connectivity_release"
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
    invoke-direct {p0}, Lxj0/v0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lxj0/v0$a;Lst0/v;)Llt0/e;
    .locals 0

    invoke-direct {p0, p1}, Lxj0/v0$a;->c(Lst0/v;)Llt0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lxj0/v0$a;Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxj0/v0$a;->d(Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lst0/v;)Llt0/e;
    .locals 3

    sget-object v0, Lxj0/v0$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported device type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    sget-object p1, Llt0/e;->SET_CLOCK_DEPRECATED:Llt0/e;

    return-object p1

    :cond_2
    sget-object p1, Llt0/e;->SET_CLOCK:Llt0/e;

    return-object p1
.end method

.method private final d(Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;
    .locals 6

    sget-object v0, Lxj0/v0$a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v3, 0x3

    const/4 v4, 0x4

    if-eq v0, v3, :cond_1

    if-eq v0, v4, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported device type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 p2, 0x8

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p1}, Lfk2/a;->f()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Luk0/b;->c(J)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lfk2/a;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Luk0/b;->c(J)I

    move-result p1

    invoke-virtual {p2, v4, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-object p2

    :cond_2
    const/4 p2, 0x7

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    sget-object v0, Llt0/j;->REVISION_1:Llt0/j;

    invoke-virtual {v0}, Llt0/j;->getValue()B

    move-result v0

    invoke-virtual {p2, v1, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p1}, Lfk2/a;->f()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Luk0/b;->c(J)I

    move-result v0

    invoke-virtual {p2, v3, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lfk2/a;->e()J

    move-result-wide v0

    long-to-int p1, v0

    int-to-short p1, p1

    invoke-virtual {p2, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-object p2
.end method
