.class public abstract Ljx1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Li2/t;",
        "a",
        "()Li2/t;",
        "membership_release"
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
.method public static final a()Li2/t;
    .locals 8

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v1, 0xffadc2cdL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0xadc2cd

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x16

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x439d8000    # 315.0f

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object v0

    return-object v0
.end method
