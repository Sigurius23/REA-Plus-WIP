.class public interface abstract Lpx2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpx2/g$a;,
        Lpx2/g$b;,
        Lpx2/g$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lpx2/g;",
        "",
        "Lpx2/b;",
        "a",
        "()Lpx2/b;",
        "bottomSheetContent",
        "c",
        "b",
        "Lpx2/g$a;",
        "Lpx2/g$b;",
        "Lpx2/g$c;",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public a()Lpx2/b;
    .locals 1

    instance-of v0, p0, Lpx2/g$a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lpx2/g$a;

    invoke-virtual {v0}, Lpx2/g$a;->b()Lpx2/b;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lpx2/b$c;->a:Lpx2/b$c;

    return-object v0
.end method
