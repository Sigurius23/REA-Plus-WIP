.class public abstract Lqj0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a3\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lmj0/d;",
        "id",
        "Lnj0/f;",
        "protocol",
        "Lmj0/c;",
        "initialState",
        "Lbc3/z;",
        "threadSafeDispatcher",
        "Lqj0/h;",
        "a",
        "(Ljava/lang/String;Lnj0/f;Lmj0/c;Lbc3/z;)Lqj0/h;",
        "b",
        "()Lbc3/z;",
        "whoop-ble_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Lnj0/f;Lmj0/c;Lbc3/z;)Lqj0/h;
    .locals 7

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadSafeDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnj0/f$b;

    if-eqz v0, :cond_0

    new-instance v1, Lqj0/f;

    move-object v3, p1

    check-cast v3, Lnj0/f$b;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lqj0/f;-><init>(Ljava/lang/String;Lnj0/f$b;Lmj0/c;Lbc3/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b()Lbc3/z;
    .locals 4

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2, v1}, Lbc3/z;->limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;

    move-result-object v0

    return-object v0
.end method
