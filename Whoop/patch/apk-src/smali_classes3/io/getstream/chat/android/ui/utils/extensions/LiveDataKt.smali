.class public final Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a]\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00032\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aM\u0010\u0012\u001a\u00020\u0011\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00000\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "K",
        "R",
        "Landroidx/lifecycle/p0;",
        "liveData",
        "Lkotlin/Function2;",
        "block",
        "combineWith",
        "(Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Lc93/m;)Landroidx/lifecycle/p0;",
        "S",
        "Landroidx/lifecycle/t0;",
        "Lq83/j;",
        "context",
        "Lec3/l;",
        "source",
        "Landroidx/lifecycle/v0;",
        "onChanged",
        "Ll83/a0;",
        "addFlow",
        "(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->combineWith$lambda$1(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)Ll83/a0;

    return-void
.end method

.method public static final addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/t0;",
            "Lq83/j;",
            "Lec3/l;",
            "Landroidx/lifecycle/v0;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onChanged"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {p2, p1, v0}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    invoke-virtual {p0, p2, p3}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    sget-object p3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, p3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_0

    new-instance p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v0, 0x14

    invoke-direct {p3, v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_0
    return-void
.end method

.method public static synthetic addFlow$default(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final addFlow$lambda$3$lambda$2(Landroidx/lifecycle/t0;Landroidx/lifecycle/p0;Ljava/lang/Throwable;)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t0;->c(Landroidx/lifecycle/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->combineWith$lambda$0(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)Ll83/a0;

    return-void
.end method

.method public static final combineWith(Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Lc93/m;)Landroidx/lifecycle/p0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/p0;",
            "Landroidx/lifecycle/p0;",
            "Lc93/m;",
            ")",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroidx/lifecycle/t0;

    invoke-direct {v2}, Landroidx/lifecycle/t0;-><init>()V

    new-instance v1, Lio/getstream/chat/android/ui/utils/extensions/a;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/utils/extensions/a;-><init>(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;I)V

    new-instance p0, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4, p0}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    new-instance v1, Lio/getstream/chat/android/ui/utils/extensions/a;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/utils/extensions/a;-><init>(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;I)V

    new-instance p0, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v5, p0}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    return-object v2
.end method

.method private static final combineWith$lambda$0(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-virtual {p2}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p3}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final combineWith$lambda$1(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-virtual {p2}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p3}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
