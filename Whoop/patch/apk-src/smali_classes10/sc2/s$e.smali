.class final Lsc2/s$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc2/s;->Q0()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.strap.StrapSettingsViewModel$observeDataSyncHighWatermark$1"
    f = "StrapSettingsViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lsc2/s;


# direct methods
.method public constructor <init>(Lsc2/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsc2/s;",
            "Lq83/d<",
            "-",
            "Lsc2/s$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsc2/s$e;->x:Lsc2/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lsc2/t;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lsc2/s$e;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lsc2/s;Lsc2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsc2/s$e;->i(Lsc2/s;Lsc2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lsc2/s;Lsc2/e;)Ll83/a0;
    .locals 15

    invoke-static {p0}, Lsc2/s;->O(Lsc2/s;)Lsc2/v;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v13, 0xbff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v0 .. v14}, Lsc2/v;->b(Lsc2/v;IIZZIZLjava/lang/String;IZLcom/whoop/ui/views/a;Lsc2/e;ZILjava/lang/Object;)Lsc2/v;

    move-result-object v0

    invoke-static {p0, v0}, Lsc2/s;->b0(Lsc2/s;Lsc2/v;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lsc2/s$e;

    iget-object v0, p0, Lsc2/s$e;->x:Lsc2/s;

    invoke-direct {p1, v0, p2}, Lsc2/s$e;-><init>(Lsc2/s;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lsc2/s$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsc2/s$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsc2/s$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsc2/s$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsc2/s$e;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsc2/s$e;->x:Lsc2/s;

    invoke-static {p1}, Lsc2/s;->P(Lsc2/s;)Ldt0/d;

    move-result-object p1

    invoke-interface {p1}, Ldt0/d;->a()Lec3/f2;

    move-result-object p1

    iget-object v0, p0, Lsc2/s$e;->x:Lsc2/s;

    new-instance v1, Lsc2/s$e$a;

    invoke-direct {v1, p1, v0}, Lsc2/s$e$a;-><init>(Lec3/l;Lsc2/s;)V

    invoke-static {v1}, Lwb3/f;->g(Lec3/l;)Lw73/f;

    move-result-object p1

    sget-object v0, Lm73/b;->a:Lm73/e;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ll73/c;->a(Ll73/g;)Lw73/p;

    move-result-object p1

    iget-object v0, p0, Lsc2/s$e;->x:Lsc2/s;

    new-instance v1, Lsc2/t;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lsc2/t;-><init>(Lsc2/s;I)V

    new-instance v0, Lsc2/u;

    invoke-direct {v0, v1, v2}, Lsc2/u;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance v1, Lt73/b;

    sget-object v2, Lr73/a;->d:Ljc/a;

    invoke-direct {v1, v0, v2}, Lt73/b;-><init>(Lp73/b;Lp73/b;)V

    invoke-virtual {p1, v1}, Ll73/c;->c(Ll73/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "scheduler == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
