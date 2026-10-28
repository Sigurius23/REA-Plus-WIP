.class public final Lnt0/b;
.super Lnt0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnt0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lnt0/b;",
        "Lnt0/h;",
        "Lst0/v;",
        "strapGen",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/b;",
        "dataPacket",
        "<init>",
        "(Lst0/v;Llt0/m;Llt0/b;)V",
        "",
        "v",
        "I",
        "c0",
        "()I",
        "expectedPacketLength",
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


# instance fields
.field private final v:I


# direct methods
.method public constructor <init>(Lst0/v;Llt0/m;Llt0/b;)V
    .locals 1

    const-string v0, "strapGen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Lnt0/h;-><init>(Llt0/m;Llt0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lnt0/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "R11 is not a Castle packet type; Castle uses Rev2PacketType. Check dispatch site."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x790

    goto :goto_0

    :pswitch_3
    const/16 p1, 0x78c

    :goto_0
    iput p1, p0, Lnt0/b;->v:I

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c0()I
    .locals 1

    iget v0, p0, Lnt0/b;->v:I

    return v0
.end method
