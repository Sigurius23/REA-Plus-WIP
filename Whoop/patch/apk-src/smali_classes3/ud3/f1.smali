.class public abstract Lud3/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onClosed(Lud3/e1;ILjava/lang/String;)V
.end method

.method public onClosing(Lud3/e1;ILjava/lang/String;)V
    .locals 0

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
.end method

.method public abstract onMessage(Lud3/e1;Ljava/lang/String;)V
.end method

.method public onMessage(Lud3/e1;Lne3/l;)V
    .locals 1

    .line 1
    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bytes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Lud3/e1;Lud3/x0;)V
    .locals 1

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
