.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->D()V
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
    c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$onStrapConnectedForExistingUser$1"
    f = "ConnectStrapViewModel.kt"
    l = {
        0x59
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-direct {v0, v1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->E:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->u(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltd1/b;

    move-result-object p1

    invoke-interface {p1}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;

    move-result-object p1

    const-string v1, "Updating User Strap History Table"

    const/4 v3, 0x0

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    :try_start_1
    new-instance v1, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->u(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltd1/b;

    move-result-object v4

    invoke-interface {v4}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->u(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltd1/b;

    move-result-object v5

    invoke-interface {v5}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/whoop/domain/model/WhoopStrapInfo;->getCpuId()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->t(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object p1

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->E:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->w:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->y:I

    iput v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->z:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/data/remote/RemoteDataSource;->recordUserStrap(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    instance-of v1, p1, Ll83/m;

    if-nez v1, :cond_3

    move-object v1, p1

    check-cast v1, Lpg3/v0;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->r(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/local/prefs/PreferenceHelper;

    move-result-object v1

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->u(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltd1/b;

    move-result-object v0

    invoke-interface {v0}, Ltd1/b;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    const-string v2, "LastRecordedStrapSerial"

    invoke-virtual {v1, v2, v0}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$d;->F:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "Caught an exception recording user strap details"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
