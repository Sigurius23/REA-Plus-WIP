.class public abstract Lu82/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lad3/c;",
        "Lpg3/m;",
        "a",
        "(Lad3/c;)Lpg3/m;",
        "serialization_release"
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
.method public static final a(Lad3/c;)Lpg3/m;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "application/json; charset=UTF8"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    new-instance v1, Lsg3/a;

    new-instance v2, Lad3/z;

    invoke-direct {v2, p0}, Lad3/z;-><init>(Lad3/c;)V

    invoke-direct {v1, v0, v2}, Lsg3/a;-><init>(Lud3/h0;Lad3/z;)V

    return-object v1
.end method
