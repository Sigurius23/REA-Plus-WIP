.class public final Lfk0/d;
.super Lfk0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lfk0/d;",
        "Lfk0/g;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "R",
        "()Z",
        "",
        "J",
        "()Ljava/lang/Long;",
        "numPackets",
        "",
        "e",
        "()[B",
        "trimPage",
        "w",
        "wrapCount",
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
.field public static final e:Lfk0/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfk0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfk0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfk0/d;->e:Lfk0/d$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfk0/g;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final J()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lfk0/d;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()Z
    .locals 2

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()[B
    .locals 4

    invoke-virtual {p0}, Lfk0/d;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final w()[B
    .locals 4

    invoke-virtual {p0}, Lfk0/d;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x4

    new-array v2, v1, [B

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
