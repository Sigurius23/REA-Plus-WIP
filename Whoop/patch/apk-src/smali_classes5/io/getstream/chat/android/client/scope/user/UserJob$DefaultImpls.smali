.class public final Lio/getstream/chat/android/client/scope/user/UserJob$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/scope/user/UserJob;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic cancel(Lio/getstream/chat/android/client/scope/user/UserJob;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static fold(Lio/getstream/chat/android/client/scope/user/UserJob;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/getstream/chat/android/client/scope/user/UserJob;",
            "TR;",
            "Lc93/m;",
            ")TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Le93/b;->B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static get(Lio/getstream/chat/android/client/scope/user/UserJob;Lq83/i;)Lq83/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq83/h;",
            ">(",
            "Lio/getstream/chat/android/client/scope/user/UserJob;",
            "Lq83/i;",
            ")TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p0

    return-object p0
.end method

.method public static minusKey(Lio/getstream/chat/android/client/scope/user/UserJob;Lq83/i;)Lq83/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/scope/user/UserJob;",
            "Lq83/i;",
            ")",
            "Lq83/j;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static plus(Lio/getstream/chat/android/client/scope/user/UserJob;Lbc3/k1;)Lbc3/k1;
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    .line 1
    const-string p0, "other"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static plus(Lio/getstream/chat/android/client/scope/user/UserJob;Lq83/j;)Lq83/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0
.end method
