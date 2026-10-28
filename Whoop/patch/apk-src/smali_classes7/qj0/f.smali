.class public final Lqj0/f;
.super Lqj0/h;
.source "SourceFile"

# interfaces
.implements Lft0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lqj0/f;",
        "Lqj0/h;",
        "Lft0/a;",
        "Lmj0/d;",
        "id",
        "Lnj0/f$b;",
        "protocol",
        "Lmj0/c;",
        "initialState",
        "Lbc3/z;",
        "threadSafeDispatcher",
        "<init>",
        "(Ljava/lang/String;Lnj0/f$b;Lmj0/c;Lbc3/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "whoop-ble_release"
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
.method private constructor <init>(Ljava/lang/String;Lnj0/f$b;Lmj0/c;Lbc3/z;)V
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadSafeDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 2
    invoke-direct/range {v1 .. v6}, Lqj0/h;-><init>(Ljava/lang/String;Lnj0/f;Lmj0/c;Lbc3/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lnj0/f$b;Lmj0/c;Lbc3/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lqj0/f;-><init>(Ljava/lang/String;Lnj0/f$b;Lmj0/c;Lbc3/z;)V

    return-void
.end method
