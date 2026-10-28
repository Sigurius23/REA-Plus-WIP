.class public abstract Lxj0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "Ljava/nio/ByteBuffer;",
        "a",
        "Ljava/nio/ByteBuffer;",
        "()Ljava/nio/ByteBuffer;",
        "REVISION_ONE",
        "b",
        "getONE_AS_PAYLOAD",
        "ONE_AS_PAYLOAD",
        "connectivity-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/nio/ByteBuffer;

.field private static final b:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    sput-object v1, Lxj0/c;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    sput-object v1, Lxj0/c;->b:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static final a()Ljava/nio/ByteBuffer;
    .locals 1

    sget-object v0, Lxj0/c;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method
