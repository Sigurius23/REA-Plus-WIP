.class public abstract Lmk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lha0/d;",
        "",
        "fallbackInternalName",
        "Lmk2/j;",
        "b",
        "(Lha0/d;Ljava/lang/String;)Lmk2/j;",
        "internalName",
        "a",
        "(Ljava/lang/String;)Lmk2/j;",
        "track-activity_release"
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
.method private static final a(Ljava/lang/String;)Lmk2/j;
    .locals 1

    const-string v0, "nap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lmk2/j;->NAP:Lmk2/j;

    return-object p0

    :cond_0
    const-string v0, "sleep"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lmk2/j;->SLEEP:Lmk2/j;

    return-object p0

    :cond_1
    sget-object p0, Lmk2/j;->WORKOUT:Lmk2/j;

    return-object p0
.end method

.method public static final b(Lha0/d;Ljava/lang/String;)Lmk2/j;
    .locals 2

    const-string v0, "fallbackInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    invoke-static {p1}, Lmk2/b;->a(Ljava/lang/String;)Lmk2/j;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object p1

    sget-object v0, Lcom/whoop/addactivity/network/model/ScoreType;->SLEEP:Lcom/whoop/addactivity/network/model/ScoreType;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lha0/d;->f()Ljava/lang/String;

    move-result-object p1

    const-string v1, "nap"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p0, Lmk2/j;->NAP:Lmk2/j;

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object p1

    if-ne p1, v0, :cond_2

    sget-object p0, Lmk2/j;->SLEEP:Lmk2/j;

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object p0

    sget-object p1, Lcom/whoop/addactivity/network/model/ScoreType;->RECOVERY:Lcom/whoop/addactivity/network/model/ScoreType;

    if-ne p0, p1, :cond_3

    sget-object p0, Lmk2/j;->RECOVERY:Lmk2/j;

    return-object p0

    :cond_3
    sget-object p0, Lmk2/j;->WORKOUT:Lmk2/j;

    return-object p0
.end method
