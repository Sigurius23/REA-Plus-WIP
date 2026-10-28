.class final Lv92/c$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92/c;->o(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "prefs",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.store.encrypted.EncryptedAuthStore$storeAuthMaterialDataStore$3"
    f = "EncryptedAuthStore.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:Lv92/c;

.field final synthetic H:Ljava/lang/Exception;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILv92/c;Ljava/lang/Exception;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lv92/c;",
            "Ljava/lang/Exception;",
            "Lq83/d<",
            "-",
            "Lv92/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv92/c$h;->y:Ljava/lang/String;

    iput-object p2, p0, Lv92/c$h;->z:Ljava/lang/String;

    iput p3, p0, Lv92/c$h;->E:I

    iput p4, p0, Lv92/c$h;->F:I

    iput-object p5, p0, Lv92/c$h;->G:Lv92/c;

    iput-object p6, p0, Lv92/c$h;->H:Ljava/lang/Exception;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lv92/c$h;

    iget-object v1, p0, Lv92/c$h;->y:Ljava/lang/String;

    iget-object v2, p0, Lv92/c$h;->z:Ljava/lang/String;

    iget v3, p0, Lv92/c$h;->E:I

    iget v4, p0, Lv92/c$h;->F:I

    iget-object v5, p0, Lv92/c$h;->G:Lv92/c;

    iget-object v6, p0, Lv92/c$h;->H:Ljava/lang/Exception;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lv92/c$h;-><init>(Ljava/lang/String;Ljava/lang/String;IILv92/c;Ljava/lang/Exception;Lq83/d;)V

    iput-object p1, v0, Lv92/c$h;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lv92/c$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv92/c$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv92/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv92/c$h;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv92/c$h;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lv92/c$h;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->g()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lv92/c$h;->y:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->i()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lv92/c$h;->z:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->h()Lf6/d;

    move-result-object p1

    iget v1, p0, Lv92/c$h;->E:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->j()Lf6/d;

    move-result-object p1

    iget v1, p0, Lv92/c$h;->F:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-static {}, Lv92/c;->e()Lf6/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf6/a;->f(Lf6/d;)V

    invoke-static {}, Lv92/c;->f()Lf6/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf6/a;->f(Lf6/d;)V

    iget-object p1, p0, Lv92/c$h;->G:Lv92/c;

    invoke-static {p1}, Lv92/c;->d(Lv92/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "encryption-failure-logging-android"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv92/c$h;->G:Lv92/c;

    invoke-static {p1}, Lv92/c;->c(Lv92/c;)Lrr2/c;

    move-result-object p1

    iget-object v0, p0, Lv92/c$h;->H:Ljava/lang/Exception;

    invoke-interface {p1, v0}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
