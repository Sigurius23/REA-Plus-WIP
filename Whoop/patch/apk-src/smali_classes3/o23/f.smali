.class public abstract Lo23/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lny0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lny0/m;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lny0/m;-><init>(I)V

    sput-object v0, Lo23/f;->a:Lny0/m;

    return-void
.end method

.method public static final a(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/k;

    invoke-direct {v0, p0, p1, p2}, Lo23/k;-><init>(Lo23/d;Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method public static final b(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lo23/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/k;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Lo23/k;-><init>(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;I)V

    return-object v0
.end method

.method public static c(Lio/getstream/chat/android/client/call/RetrofitCall;)V
    .locals 2

    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-interface {p0, v0}, Lo23/d;->enqueue(Lo23/a;)V

    return-void
.end method

.method public static d(Lo23/d;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc9/c;

    const/16 v1, 0x17

    sget-object v2, Lo23/f;->a:Lny0/m;

    invoke-direct {v0, v1, v2, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lo23/d;->enqueue(Lo23/a;)V

    return-void
.end method

.method public static final e(Lo23/d;Lkotlin/jvm/functions/Function1;)Lo23/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    invoke-direct {v0, p0, p1}, Lo23/h;-><init>(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final f(Lo23/d;Lbc3/c0;)V
    .locals 3

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd/f;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x3

    invoke-static {p1, v2, v2, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lo23/d;Lkotlin/jvm/functions/Function1;)Lo23/o;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/o;

    invoke-direct {v0, p0, p1}, Lo23/o;-><init>(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final h(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/q;
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/q;

    invoke-direct {v0, p0, p1, p2}, Lo23/q;-><init>(Lo23/d;Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method public static final i(Lo23/d;Lbc3/c0;Lr23/d;)Lr23/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryPolicy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr23/c;

    new-instance v1, Lq30/w0;

    invoke-direct {v1, p2}, Lq30/w0;-><init>(Lr23/d;)V

    invoke-direct {v0, p0, p1, v1}, Lr23/c;-><init>(Lo23/d;Lbc3/c0;Lq30/w0;)V

    return-object v0
.end method

.method public static final j(Lo23/d;Lbc3/c0;Lc93/a;)Lo23/d;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lo23/r;->x:Ljc/b;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lo23/r;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, v0, Lo23/r;->w:Lac3/b;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {v1}, Lac3/b;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo23/d;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    new-instance v2, Lo23/j;

    new-instance v3, Lnr0/e;

    const/16 v4, 0x9

    invoke-direct {v3, p0, v4}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lf1/x;

    const/4 v4, 0x5

    invoke-direct {p0, v0, p2, v4}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    invoke-direct {v2, p1, v3, p0}, Lo23/j;-><init>(Lbc3/c0;Lc93/a;Lc93/a;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1}, Lac3/b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v2
.end method

.method public static final k(Lo23/d;)Lo23/o;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo23/e;->w:Lo23/e;

    invoke-static {p0, v0}, Lo23/f;->g(Lo23/d;Lkotlin/jvm/functions/Function1;)Lo23/o;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lo23/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/k;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p2, v1}, Lo23/k;-><init>(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;I)V

    return-object v0
.end method
