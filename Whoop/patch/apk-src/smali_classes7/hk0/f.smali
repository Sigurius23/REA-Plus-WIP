.class public final Lhk0/f;
.super Lhk0/b;
.source "SourceFile"

# interfaces
.implements Lot0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lhk0/f;",
        "Lhk0/b;",
        "Lot0/b;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "e",
        "Ljava/lang/String;",
        "getPacketName",
        "()Ljava/lang/String;",
        "packetName",
        "Lfk2/a;",
        "getTimestamp",
        "()Lfk2/a;",
        "timestamp",
        "",
        "Y",
        "()Ljava/lang/Integer;",
        "firmwareEventType",
        "f",
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
.field private static final f:Lhk0/f$a;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/f;->f:Lhk0/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/b;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "Rev2EventPacket"

    iput-object p1, p0, Lhk0/f;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final Y()Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p0}, Lhk0/b;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p0}, Lhk0/b;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/16 v2, 0x14

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTimestamp()Lfk2/a;
    .locals 1

    invoke-virtual {p0}, Lhk0/b;->X()Lfk2/a;

    move-result-object v0

    return-object v0
.end method
