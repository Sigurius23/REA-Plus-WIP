.class final Lxb2/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb2/a;->e(Lb5/g;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.settings.language.AppSpecificLanguageUpdater$setAppSpecificLanguage$2"
    f = "AppSpecificLanguageUpdater.kt"
    l = {
        0x1f,
        0x22,
        0x23
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lxb2/a;

.field final synthetic y:Lb5/g;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lxb2/a;Lb5/g;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxb2/a;",
            "Lb5/g;",
            "Z",
            "Lq83/d<",
            "-",
            "Lxb2/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxb2/a$a;->x:Lxb2/a;

    iput-object p2, p0, Lxb2/a$a;->y:Lb5/g;

    iput-boolean p3, p0, Lxb2/a$a;->z:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lxb2/a$a;

    iget-object v0, p0, Lxb2/a$a;->x:Lxb2/a;

    iget-object v1, p0, Lxb2/a$a;->y:Lb5/g;

    iget-boolean v2, p0, Lxb2/a$a;->z:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lxb2/a$a;-><init>(Lxb2/a;Lb5/g;ZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxb2/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxb2/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxb2/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxb2/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lxb2/a$a;->w:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxb2/a$a;->x:Lxb2/a;

    invoke-static {p1}, Lxb2/a;->d(Lxb2/a;)Lor2/r1;

    move-result-object p1

    iget-object v1, p0, Lxb2/a$a;->y:Lb5/g;

    invoke-interface {p1, v1}, Lor2/r1;->d(Lb5/g;)V

    iget-object p1, p0, Lxb2/a$a;->x:Lxb2/a;

    invoke-static {p1}, Lxb2/a;->c(Lxb2/a;)La6/g;

    move-result-object p1

    new-instance v1, Lxb2/a$a$a;

    iget-boolean v5, p0, Lxb2/a$a;->z:Z

    const/4 v6, 0x0

    invoke-direct {v1, v5, v6}, Lxb2/a$a$a;-><init>(ZLq83/d;)V

    iput v4, p0, Lxb2/a$a;->w:I

    invoke-static {p1, v1, p0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lxb2/a$a;->x:Lxb2/a;

    invoke-static {p1}, Lxb2/a;->b(Lxb2/a;)Lcom/whoop/data/repositories/LanguageRepository;

    move-result-object p1

    iput v3, p0, Lxb2/a$a;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/data/repositories/LanguageRepository;->onLanguageChanged(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lxb2/a$a;->x:Lxb2/a;

    invoke-static {p1}, Lxb2/a;->a(Lxb2/a;)Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    move-result-object p1

    iput v2, p0, Lxb2/a$a;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->refreshForLanguageChange(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
