.class public abstract Lcom/whoop/realtime/presentation/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\"\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lp92/e;",
        "",
        "f",
        "(Lp92/e;)Z",
        "e",
        "",
        "d",
        "(Lp92/e;)Ljava/lang/String;",
        "activityKey",
        "realtime-activity_release"
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
.method public static final synthetic a(Lp92/e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/i;->d(Lp92/e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lp92/e;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/i;->e(Lp92/e;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lp92/e;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/i;->f(Lp92/e;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lp92/e;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lp92/e;->a()Llm2/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Llm2/b;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final e(Lp92/e;)Z
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lp92/e;->a()Llm2/b;

    move-result-object p0

    instance-of v0, p0, Llm2/c;

    if-eqz v0, :cond_0

    check-cast p0, Llm2/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Llm2/c;->s()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final f(Lp92/e;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lp92/e;->a()Llm2/b;

    move-result-object p0

    instance-of p0, p0, Llm2/d;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
