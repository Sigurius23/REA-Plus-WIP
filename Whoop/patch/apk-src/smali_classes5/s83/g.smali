.class public abstract Ls83/g;
.super Ls83/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    invoke-direct {p0, p1}, Ls83/a;-><init>(Lq83/d;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    sget-object v0, Lq83/k;->w:Lq83/k;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getContext()Lq83/j;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    return-object v0
.end method
