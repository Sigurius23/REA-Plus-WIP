.class public final Lnt0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnt0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lnt0/h$a;",
        "",
        "<init>",
        "()V",
        "Lst0/v;",
        "strapGen",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/b;",
        "dataPacket",
        "Lnt0/h;",
        "a",
        "(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;",
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
    invoke-direct {p0}, Lnt0/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;
    .locals 2

    const-string v0, "strapGen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Llt0/b;->U()S

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    new-instance p1, Lnt0/g;

    invoke-direct {p1, p2, p3}, Lnt0/g;-><init>(Llt0/m;Llt0/b;)V

    return-object p1

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    new-instance v0, Lnt0/a;

    invoke-direct {v0, p1, p2, p3}, Lnt0/a;-><init>(Lst0/v;Llt0/m;Llt0/b;)V

    return-object v0

    :cond_1
    const/16 v1, 0xb

    if-ne v0, v1, :cond_2

    new-instance v0, Lnt0/b;

    invoke-direct {v0, p1, p2, p3}, Lnt0/b;-><init>(Lst0/v;Llt0/m;Llt0/b;)V

    return-object v0

    :cond_2
    const/16 p1, 0x14

    if-ne v0, p1, :cond_3

    new-instance p1, Lnt0/d;

    invoke-direct {p1, p2, p3}, Lnt0/d;-><init>(Llt0/m;Llt0/b;)V

    return-object p1

    :cond_3
    const/16 p1, 0x15

    if-ne v0, p1, :cond_4

    new-instance p1, Lnt0/e;

    invoke-direct {p1, p2, p3}, Lnt0/e;-><init>(Llt0/m;Llt0/b;)V

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method
