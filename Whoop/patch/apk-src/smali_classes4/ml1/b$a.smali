.class final Lml1/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lml1/b;-><init>(Ltd1/b;Lhj0/d;Lzs0/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lzr2/a;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "appForegroundState",
        "Ltd1/e;",
        "strapStatus",
        "",
        "<anonymous>",
        "(ZLtd1/e;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.cdm.CompanionDeviceHandler$cdmDialogFlow$1"
    f = "CompanionDeviceHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Z

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lml1/b;


# direct methods
.method public constructor <init>(Lml1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lml1/b;",
            "Lq83/d<",
            "-",
            "Lml1/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lml1/b$a;->z:Lml1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lml1/b;)Lml1/c$b;
    .locals 0

    invoke-static {p0}, Lml1/b$a;->i(Lml1/b;)Lml1/c$b;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lml1/b;)Lml1/c$b;
    .locals 2

    invoke-static {p0}, Lml1/b;->b(Lml1/b;)Ltr2/n;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "CDM: Sending DoNothing Action"

    invoke-interface {p0, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Lml1/c$b;->a:Lml1/c$b;

    return-object p0
.end method


# virtual methods
.method public final h(ZLtd1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ltd1/e;",
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lml1/b$a;

    iget-object v1, p0, Lml1/b$a;->z:Lml1/b;

    invoke-direct {v0, v1, p3}, Lml1/b$a;-><init>(Lml1/b;Lq83/d;)V

    iput-boolean p1, v0, Lml1/b$a;->x:Z

    iput-object p2, v0, Lml1/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lml1/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ltd1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lml1/b$a;->h(ZLtd1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lml1/b$a;->x:Z

    iget-object v1, p0, Lml1/b$a;->y:Ljava/lang/Object;

    check-cast v1, Ltd1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lml1/b$a;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lml1/b$a;->z:Lml1/b;

    invoke-static {p1}, Lml1/b;->c(Lml1/b;)Ltd1/b;

    move-result-object p1

    invoke-interface {p1}, Ltd1/b;->m()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v2, p0, Lml1/b$a;->z:Lml1/b;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ltd1/e;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v2}, Lml1/b;->b(Lml1/b;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDM: Sending CheckCompanionDevice Action"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lml1/c$a;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getAddress(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lml1/c$a;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lml1/c$b;->a:Lml1/c$b;

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lml1/b$a;->z:Lml1/b;

    new-instance v0, Lml1/a;

    invoke-direct {v0, p1}, Lml1/a;-><init>(Lml1/b;)V

    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
