.class final Lnm2/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm2/c;->G()V
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
    c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsViewModel$refreshViewState$1"
    f = "DebugFeatureFlagSettingsViewModel.kt"
    l = {
        0x238
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lnm2/c;


# direct methods
.method public constructor <init>(Lnm2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm2/c;",
            "Lq83/d<",
            "-",
            "Lnm2/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnm2/c$a;->x:Lnm2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lnm2/c;ZLnm2/d;)Lnm2/d;
    .locals 0

    invoke-static {p0, p1, p2}, Lnm2/c$a;->h(Lnm2/c;ZLnm2/d;)Lnm2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lnm2/c;ZLnm2/d;)Lnm2/d;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lnm2/c;->D(Lnm2/c;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move v4, p1

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lnm2/d;->b(Lnm2/d;Ljava/util/List;ZLjava/lang/String;ILjava/lang/Object;)Lnm2/d;

    move-result-object p0

    return-object p0
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

    new-instance p1, Lnm2/c$a;

    iget-object v0, p0, Lnm2/c$a;->x:Lnm2/c;

    invoke-direct {p1, v0, p2}, Lnm2/c$a;-><init>(Lnm2/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lnm2/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnm2/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnm2/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnm2/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lnm2/c$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnm2/c$a;->x:Lnm2/c;

    invoke-static {p1}, Lnm2/c;->n(Lnm2/c;)Lin2/d;

    move-result-object p1

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v1, Lnm2/c$a$a;

    iget-object v3, p0, Lnm2/c$a;->x:Lnm2/c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lnm2/c$a$a;-><init>(Lnm2/c;Lq83/d;)V

    iput v2, p0, Lnm2/c$a;->w:I

    invoke-static {p1, v1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lnm2/c$a;->x:Lnm2/c;

    new-instance v1, Lnm2/b;

    invoke-direct {v1, v0, p1}, Lnm2/b;-><init>(Lnm2/c;Z)V

    invoke-static {v0, v1}, Lnm2/c;->p(Lnm2/c;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
