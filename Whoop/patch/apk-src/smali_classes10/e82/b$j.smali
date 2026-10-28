.class final Le82/b$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le82/b;->a(Lj93/d;Z)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lrt0/b;",
        "T",
        "Lec3/m;",
        "Lrt0/a;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sdk.realtimeStream.RealTimeStreamSdkImpl$toggleRealtimeStream$4$1"
    f = "RealTimeStreamSdkImpl.kt"
    l = {
        0x53,
        0x56,
        0x57,
        0x5c,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Le82/b;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Le82/c;

.field final synthetic z:Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj93/d;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le82/c;Lj93/d;Le82/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le82/c;",
            "Lj93/d;",
            "Le82/b;",
            "Lq83/d<",
            "-",
            "Le82/b$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le82/b$j;->y:Le82/c;

    iput-object p2, p0, Le82/b$j;->z:Lj93/d;

    iput-object p3, p0, Le82/b$j;->E:Le82/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Le82/b$j;

    iget-object v1, p0, Le82/b$j;->y:Le82/c;

    iget-object v2, p0, Le82/b$j;->z:Lj93/d;

    iget-object v3, p0, Le82/b$j;->E:Le82/b;

    invoke-direct {v0, v1, v2, v3, p2}, Le82/b$j;-><init>(Le82/c;Lj93/d;Le82/b;Lq83/d;)V

    iput-object p1, v0, Le82/b$j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Le82/b$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le82/b$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le82/b$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le82/b$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Le82/b$j;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Le82/b$j;->w:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le82/b$j;->y:Le82/c;

    sget-object v2, Le82/c$b;->a:Le82/c$b;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Le82/c$a;->a:Le82/c$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    instance-of v2, p1, Le82/c$c;

    if-eqz v2, :cond_5

    new-instance p1, Lrt0/a$b;

    iget-object v2, p0, Le82/b$j;->y:Le82/c;

    check-cast v2, Le82/c$c;

    invoke-virtual {v2}, Le82/c$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lrt0/a$b;-><init>(Ljava/lang/String;)V

    iput-object v8, p0, Le82/b$j;->x:Ljava/lang/Object;

    iput v4, p0, Le82/b$j;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_3

    :cond_5
    sget-object v2, Le82/c$d;->a:Le82/c$d;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lrt0/a$c;->a:Lrt0/a$c;

    iput-object v8, p0, Le82/b$j;->x:Ljava/lang/Object;

    iput v3, p0, Le82/b$j;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_1
    iget-object p1, p0, Le82/b$j;->y:Le82/c;

    instance-of p1, p1, Le82/c$b;

    if-eqz p1, :cond_8

    sget-object p1, Lrt0/a$a;->a:Lrt0/a$a;

    iput-object v0, p0, Le82/b$j;->x:Ljava/lang/Object;

    iput v7, p0, Le82/b$j;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    iget-object p1, p0, Le82/b$j;->z:Lj93/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lrt0/b$a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.whoop.connectivityCore.sdk.RTSdkResult<T of com.whoop.sdk.realtimeStream.RealTimeStreamSdkImpl.toggleRealtimeStream>>"

    if-eqz v3, :cond_9

    iget-object p1, p0, Le82/b$j;->E:Le82/b;

    invoke-static {p1}, Le82/b;->b(Le82/b;)Lec3/l;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, p0, Le82/b$j;->x:Ljava/lang/Object;

    iput v6, p0, Le82/b$j;->w:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_3

    :cond_9
    const-class v3, Lrt0/b$b;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Le82/b$j;->E:Le82/b;

    invoke-static {p1}, Le82/b;->c(Le82/b;)Lec3/l;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, p0, Le82/b$j;->x:Ljava/lang/Object;

    iput v5, p0, Le82/b$j;->w:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalAccessException;

    const-string v0, "Not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
