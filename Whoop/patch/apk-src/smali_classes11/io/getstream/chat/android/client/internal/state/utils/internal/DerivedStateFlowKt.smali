.class public final Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a?\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a]\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0007\"\u0004\u0008\u0002\u0010\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aw\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0007\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000fH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "T1",
        "R",
        "Lec3/f2;",
        "Lkotlin/Function1;",
        "transform",
        "mapState",
        "(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;",
        "T2",
        "flow",
        "flow2",
        "Lkotlin/Function2;",
        "combineStates",
        "(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;",
        "T3",
        "flow3",
        "Lkotlin/Function3;",
        "(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;",
        "stream-chat-android-client_release"
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
.method public static synthetic a(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;
    .locals 0

    invoke-static {p3, p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates$lambda$3(Lkotlin/jvm/functions/Function3;Lec3/f2;Lec3/f2;Lec3/f2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final combineStates(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lc93/m;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "flow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    .line 2
    new-instance v1, Lio/getstream/chat/android/client/internal/state/utils/internal/c;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/c;-><init>(Lc93/m;Lec3/f2;Lec3/f2;I)V

    .line 3
    new-instance v2, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$2;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$2;-><init>(Lc93/m;Lq83/d;)V

    .line 4
    new-instance p2, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {p2, p0, p1, v2, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 5
    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;-><init>(Lc93/a;Lec3/l;)V

    return-object v0
.end method

.method public static final combineStates(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lkotlin/jvm/functions/Function3;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "flow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    .line 7
    new-instance v1, Lio/getstream/chat/android/client/internal/state/utils/internal/a;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v2, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/a;-><init>(Lkotlin/jvm/functions/Function3;Lec3/f2;Lec3/f2;Lec3/f2;I)V

    .line 8
    new-instance p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;

    const/4 p1, 0x0

    invoke-direct {p0, v2, p1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-static {v3, v4, v5, p0}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p0

    .line 9
    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;-><init>(Lc93/a;Lec3/l;)V

    return-object v0
.end method

.method private static final combineStates$lambda$2(Lc93/m;Lec3/f2;Lec3/f2;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final combineStates$lambda$3(Lkotlin/jvm/functions/Function3;Lec3/f2;Lec3/f2;Lec3/f2;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/f2;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/utils/internal/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, p1}, Lio/getstream/chat/android/client/internal/state/utils/internal/b;-><init>(ILec3/f2;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$mapState$$inlined$map$1;

    invoke-direct {v2, p0, p1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$mapState$$inlined$map$1;-><init>(Lec3/l;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;-><init>(Lc93/a;Lec3/l;)V

    return-object v0
.end method

.method private static final mapState$lambda$0(Lkotlin/jvm/functions/Function1;Lec3/f2;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
