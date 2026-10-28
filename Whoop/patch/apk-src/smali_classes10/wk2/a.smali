.class public final Lwk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lwk2/a;",
        "",
        "<init>",
        "()V",
        "Lwk2/b;",
        "previous",
        "Lyg2/d;",
        "liveHrState",
        "a",
        "(Lwk2/b;Lyg2/d;)Lwk2/b;",
        "track-activity_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwk2/b;Lyg2/d;)Lwk2/b;
    .locals 4

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveHrState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lyg2/d$a;

    if-eqz v0, :cond_0

    check-cast p2, Lyg2/d$a;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lwk2/b;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-instance v1, Lwk2/b;

    invoke-virtual {p1}, Lwk2/b;->c()J

    move-result-wide v2

    invoke-virtual {p2}, Lyg2/d$a;->a()I

    move-result p1

    int-to-long p1, p1

    add-long/2addr v2, p1

    invoke-direct {v1, v2, v3, v0}, Lwk2/b;-><init>(JI)V

    return-object v1
.end method
