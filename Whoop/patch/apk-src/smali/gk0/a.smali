.class public final Lgk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxj0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\'\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lgk0/a;",
        "Lxj0/a;",
        "Llt0/c$a;",
        "packetType",
        "Lkotlin/Function1;",
        "",
        "Llt0/a;",
        "commandNumberLookup",
        "<init>",
        "(Llt0/c$a;Lkotlin/jvm/functions/Function1;)V",
        "command",
        "Ljava/nio/ByteBuffer;",
        "commandPayload",
        "b",
        "(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;",
        "payload",
        "a",
        "(Ljava/nio/ByteBuffer;)Llt0/a;",
        "d",
        "(Ljava/nio/ByteBuffer;)B",
        "value",
        "Ll83/a0;",
        "c",
        "(Ljava/nio/ByteBuffer;B)V",
        "Llt0/c$a;",
        "Lkotlin/jvm/functions/Function1;",
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


# static fields
.field public static final d:Lgk0/a$a;

.field private static final e:Lgk0/a;

.field private static final f:Lgk0/a;


# instance fields
.field private final b:Llt0/c$a;

.field private final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgk0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgk0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgk0/a;->d:Lgk0/a$a;

    new-instance v0, Lgk0/a;

    sget-object v1, Llt0/c$a;->COMMAND:Llt0/c$a;

    new-instance v2, Lf0/q1;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lf0/q1;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lgk0/a;-><init>(Llt0/c$a;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lgk0/a;->e:Lgk0/a;

    new-instance v0, Lgk0/a;

    sget-object v1, Llt0/c$a;->PUFFIN_COMMAND:Llt0/c$a;

    new-instance v2, Lf0/q1;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lf0/q1;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lgk0/a;-><init>(Llt0/c$a;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lgk0/a;->f:Lgk0/a;

    return-void
.end method

.method private constructor <init>(Llt0/c$a;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llt0/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk0/a;->b:Llt0/c$a;

    iput-object p2, p0, Lgk0/a;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic e(B)Llt0/a;
    .locals 0

    invoke-static {p0}, Lgk0/a;->h(B)Llt0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(B)Llt0/a;
    .locals 0

    invoke-static {p0}, Lgk0/a;->g(B)Llt0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(B)Llt0/a;
    .locals 1

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    invoke-virtual {v0, p0}, Llt0/a$a;->a(B)Llt0/l;

    move-result-object p0

    return-object p0
.end method

.method private static final h(B)Llt0/a;
    .locals 1

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    invoke-virtual {v0, p0}, Llt0/a$a;->b(B)Llt0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i()Lgk0/a;
    .locals 1

    sget-object v0, Lgk0/a;->f:Lgk0/a;

    return-object v0
.end method

.method public static final synthetic j()Lgk0/a;
    .locals 1

    sget-object v0, Lgk0/a;->e:Lgk0/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)Llt0/a;
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgk0/a;->c:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llt0/a;

    return-object p1
.end method

.method public b(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 4

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/4 v1, 0x3

    add-int/2addr v0, v1

    invoke-static {v0}, Ltt0/d;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v2, p0, Lgk0/a;->b:Llt0/c$a;

    invoke-virtual {v2}, Llt0/c$a;->getByteValue()B

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    const/4 v2, 0x2

    invoke-interface {p1}, Llt0/a;->getByteValue()B

    move-result p1

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {v0, v1, p1}, Ltt0/d;->d(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public c(Ljava/nio/ByteBuffer;B)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public d(Ljava/nio/ByteBuffer;)B
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    return p1
.end method
