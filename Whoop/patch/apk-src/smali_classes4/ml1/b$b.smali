.class final Lml1/b$b;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lml1/d;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Object;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.cdm.CompanionDeviceHandler$cdmDialogFlow$2"
    f = "CompanionDeviceHandler.kt"
    l = {
        0x43,
        0x46,
        0x4b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

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
            "Lml1/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lml1/b$b;->z:Lml1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lml1/b$b;

    iget-object v1, p0, Lml1/b$b;->z:Lml1/b;

    invoke-direct {v0, v1, p3}, Lml1/b$b;-><init>(Lml1/b;Lq83/d;)V

    iput-object p1, v0, Lml1/b$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lml1/b$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lml1/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lml1/b$b;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lml1/b$b;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lml1/b$b;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lml1/b$b;->w:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lml1/c$a;

    const/4 v3, 0x0

    const/4 v7, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lml1/b$b;->z:Lml1/b;

    invoke-static {p1}, Lml1/b;->a(Lml1/b;)Lzs0/a;

    move-result-object p1

    check-cast v1, Lml1/c$a;

    invoke-virtual {v1}, Lml1/c$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lzs0/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lml1/b$b;->z:Lml1/b;

    invoke-static {p1}, Lml1/b;->d(Lml1/b;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lml1/d;

    sget-object v1, Lfn0/b;->SHOW_CDM_DIALOG:Lfn0/b;

    invoke-direct {p1, v1}, Lml1/d;-><init>(Lfn0/b;)V

    iput-object v7, p0, Lml1/b$b;->x:Ljava/lang/Object;

    iput-object v7, p0, Lml1/b$b;->y:Ljava/lang/Object;

    iput v6, p0, Lml1/b$b;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lml1/b$b;->z:Lml1/b;

    invoke-static {p1}, Lml1/b;->b(Lml1/b;)Ltr2/n;

    move-result-object p1

    const-string v1, "CDM: Device is associated"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lml1/d;

    sget-object v1, Lfn0/b;->NO_CDM_DIALOG:Lfn0/b;

    invoke-direct {p1, v1}, Lml1/d;-><init>(Lfn0/b;)V

    iput-object v7, p0, Lml1/b$b;->x:Ljava/lang/Object;

    iput-object v7, p0, Lml1/b$b;->y:Ljava/lang/Object;

    iput v5, p0, Lml1/b$b;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lml1/b$b;->z:Lml1/b;

    invoke-static {p1}, Lml1/b;->b(Lml1/b;)Ltr2/n;

    move-result-object p1

    const-string v1, "CDM: Action is DoNothing"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lml1/d;

    sget-object v1, Lfn0/b;->NO_CDM_DIALOG:Lfn0/b;

    invoke-direct {p1, v1}, Lml1/d;-><init>(Lfn0/b;)V

    iput-object v7, p0, Lml1/b$b;->x:Ljava/lang/Object;

    iput-object v7, p0, Lml1/b$b;->y:Ljava/lang/Object;

    iput v4, p0, Lml1/b$b;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
