.class public final Lzj0/p;
.super Lzj0/h;
.source "SourceFile"

# interfaces
.implements Lzj0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/p$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u000c\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0013R\u0016\u0010$\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0011\u00a8\u0006\'"
    }
    d2 = {
        "Lzj0/p;",
        "Lzj0/h;",
        "Lzj0/g;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "b0",
        "()Z",
        "",
        "message",
        "Ll83/a0;",
        "a0",
        "(Ljava/lang/String;)V",
        "Lfk2/a;",
        "Z",
        "()Lfk2/a;",
        "toString",
        "()Ljava/lang/String;",
        "Ltr2/n;",
        "f",
        "Ltr2/n;",
        "logger",
        "g",
        "Lfk2/a;",
        "timeStamp",
        "",
        "X",
        "()J",
        "seconds",
        "Y",
        "subseconds",
        "K",
        "packetName",
        "getTime",
        "time",
        "h",
        "a",
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


# static fields
.field public static final h:Lzj0/p$a;

.field private static final i:I

.field private static final j:I

.field private static final k:I

.field private static final l:I


# instance fields
.field private final f:Ltr2/n;

.field private g:Lfk2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/p;->h:Lzj0/p$a;

    const/4 v0, 0x4

    sput v0, Lzj0/p;->i:I

    sput v0, Lzj0/p;->j:I

    sget v1, Lzj0/p;->k:I

    add-int/2addr v1, v0

    sput v1, Lzj0/p;->l:I

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "GetClockResponsePacket"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lzj0/p;->f:Ltr2/n;

    return-void
.end method

.method private final a0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzj0/p;->f:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final b0()Z
    .locals 3

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    sget v1, Lzj0/p;->l:I

    sget v2, Lzj0/p;->j:I

    add-int/2addr v1, v2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    const-string v0, "GetClockResponsePacket"

    return-object v0
.end method

.method public final X()J
    .locals 2

    invoke-direct {p0}, Lzj0/p;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v1, Lzj0/p;->k:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string v0, "Can\'t query seconds, packet seems invalid"

    invoke-direct {p0, v0}, Lzj0/p;->a0(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final Y()J
    .locals 2

    invoke-direct {p0}, Lzj0/p;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v1, Lzj0/p;->l:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string v0, "Can\'t query subseconds, packet seems invalid"

    invoke-direct {p0, v0}, Lzj0/p;->a0(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final Z()Lfk2/a;
    .locals 5

    invoke-direct {p0}, Lzj0/p;->b0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzj0/p;->g:Lfk2/a;

    if-nez v0, :cond_0

    new-instance v0, Lfk2/a;

    invoke-virtual {p0}, Lzj0/p;->X()J

    move-result-wide v1

    invoke-virtual {p0}, Lzj0/p;->Y()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lfk2/a;-><init>(JJ)V

    iput-object v0, p0, Lzj0/p;->g:Lfk2/a;

    :cond_0
    iget-object v0, p0, Lzj0/p;->g:Lfk2/a;

    return-object v0

    :cond_1
    const-string v0, "Can\'t query time stamp, packet seems invalid"

    invoke-direct {p0, v0}, Lzj0/p;->a0(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTime()Lfk2/a;
    .locals 1

    invoke-virtual {p0}, Lzj0/p;->Z()Lfk2/a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-super {p0}, Lzj0/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/p;->Z()Lfk2/a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Time:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
