.class public final Lxj0/f;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lxj0/f;",
        "Lxj0/b;",
        "",
        "intervalSeconds",
        "durationSeconds",
        "<init>",
        "(II)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "i",
        "I",
        "j",
        "k",
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
.field public static final k:Lxj0/f$a;


# instance fields
.field private final i:I

.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/f;->k:Lxj0/f$a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 6

    sget-object v1, Llt0/e;->ENTER_HIGH_FREQ_SYNC:Llt0/e;

    sget-object v0, Lxj0/f;->k:Lxj0/f$a;

    invoke-virtual {v0, p1, p2}, Lxj0/f$a;->a(II)Ljava/nio/ByteBuffer;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, v0, Lxj0/f;->i:I

    iput p2, v0, Lxj0/f;->j:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lxj0/f;->i:I

    iget v1, p0, Lxj0/f;->j:I

    const-string v2, ", durationSeconds = "

    const-string v3, ")"

    const-string v4, "EnterHighFreqSyncPacket(intervalSeconds = "

    invoke-static {v0, v1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
