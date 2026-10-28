.class public abstract Lxj0/b;
.super Llt0/c;
.source "SourceFile"

# interfaces
.implements Lvk0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0005\n\u0002\u0008\t\u0008&\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0019\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B%\u0008\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0007\u0010\u000eB!\u0008\u0012\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\u0015R$\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lxj0/b;",
        "Llt0/c;",
        "Lvk0/g;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "Lxj0/a;",
        "codec",
        "<init>",
        "(Ljava/nio/ByteBuffer;Lxj0/a;)V",
        "Llt0/a;",
        "command",
        "dataPayload",
        "Lst0/v;",
        "whoopDeviceType",
        "(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V",
        "(Llt0/a;Ljava/nio/ByteBuffer;Lxj0/a;)V",
        "deviceType",
        "s",
        "(Lst0/v;)Llt0/a;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "c",
        "Lxj0/a;",
        "",
        "d",
        "Z",
        "p",
        "()Z",
        "dualResponse",
        "e",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "",
        "value",
        "N",
        "()B",
        "P",
        "(B)V",
        "sequenceNumber",
        "f",
        "a",
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
.field public static final f:Lxj0/b$a;

.field private static final g:Ljava/nio/ByteBuffer;

.field private static final h:Ljava/nio/ByteBuffer;


# instance fields
.field private final c:Lxj0/a;

.field private final d:Z

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxj0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/b;->f:Lxj0/b$a;

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "order(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Lxj0/b;->g:Ljava/nio/ByteBuffer;

    new-array v0, v0, [B

    aput-byte v2, v0, v2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lxj0/b;->h:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private constructor <init>(Ljava/nio/ByteBuffer;Lxj0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    iput-object p2, p0, Lxj0/b;->c:Lxj0/a;

    .line 2
    const-string p1, "CommandPacket"

    iput-object p1, p0, Lxj0/b;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopDeviceType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lxj0/a;->a:Lxj0/a$a;

    invoke-virtual {v0, p3}, Lxj0/a$a;->a(Lst0/v;)Lxj0/a;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lxj0/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 3
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    const-string p5, "order(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lst0/v;->GEN_4:Lst0/v;

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method

.method private constructor <init>(Llt0/a;Ljava/nio/ByteBuffer;Lxj0/a;)V
    .locals 0

    .line 5
    invoke-interface {p3, p1, p2}, Lxj0/a;->b(Llt0/a;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lxj0/b;-><init>(Ljava/nio/ByteBuffer;Lxj0/a;)V

    return-void
.end method

.method public static final synthetic Q()Ljava/nio/ByteBuffer;
    .locals 1

    sget-object v0, Lxj0/b;->h:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public static final synthetic R()Ljava/nio/ByteBuffer;
    .locals 1

    sget-object v0, Lxj0/b;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method


# virtual methods
.method public bridge I()J
    .locals 2

    invoke-super {p0}, Lvk0/g;->I()J

    move-result-wide v0

    return-wide v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxj0/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public N()B
    .locals 2

    iget-object v0, p0, Lxj0/b;->c:Lxj0/a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Lxj0/a;->d(Ljava/nio/ByteBuffer;)B

    move-result v0

    return v0
.end method

.method public P(B)V
    .locals 2

    iget-object v0, p0, Lxj0/b;->c:Lxj0/a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lxj0/a;->c(Ljava/nio/ByteBuffer;B)V

    return-void
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lxj0/b;->d:Z

    return v0
.end method

.method public s(Lst0/v;)Llt0/a;
    .locals 1

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxj0/b;->c:Lxj0/a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Lxj0/a;->a(Ljava/nio/ByteBuffer;)Llt0/a;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lxj0/b;->K()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lxj0/b;->c:Lxj0/a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v1, v2}, Lxj0/a;->a(Ljava/nio/ByteBuffer;)Llt0/a;

    move-result-object v1

    invoke-virtual {p0}, Lxj0/b;->N()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Cmd: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Seq#: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
