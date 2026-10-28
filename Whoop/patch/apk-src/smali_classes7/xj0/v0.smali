.class public final Lxj0/v0;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/v0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lxj0/v0;",
        "Lxj0/b;",
        "Lfk2/a;",
        "time",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(Lfk2/a;Lst0/v;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "i",
        "Lfk2/a;",
        "j",
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
.field public static final j:Lxj0/v0$a;


# instance fields
.field private final i:Lfk2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/v0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/v0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/v0;->j:Lxj0/v0$a;

    return-void
.end method

.method public constructor <init>(Lfk2/a;Lst0/v;)V
    .locals 2

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxj0/v0;->j:Lxj0/v0$a;

    invoke-static {v0, p2}, Lxj0/v0$a;->a(Lxj0/v0$a;Lst0/v;)Llt0/e;

    move-result-object v1

    invoke-static {v0, p1, p2}, Lxj0/v0$a;->b(Lxj0/v0$a;Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0, v1, v0, p2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    iput-object p1, p0, Lxj0/v0;->i:Lfk2/a;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lxj0/v0;->i:Lfk2/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SetClockPacket ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
