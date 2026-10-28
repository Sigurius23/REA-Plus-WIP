.class final Lvd1/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd1/a;->m(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;)V
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
    c = "com.whoop.domain.strap.strapalarm.SmartAlarmDiagnosticDbHelperImpl$saveToLocalStorage$1"
    f = "SmartAlarmDiagnosticDbHelperImpl.kt"
    l = {
        0x59
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvd1/a;

.field final synthetic y:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;


# direct methods
.method public constructor <init>(Lvd1/a;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd1/a;",
            "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;",
            "Lq83/d<",
            "-",
            "Lvd1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvd1/a$b;->x:Lvd1/a;

    iput-object p2, p0, Lvd1/a$b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lvd1/a$b;

    iget-object v0, p0, Lvd1/a$b;->x:Lvd1/a;

    iget-object v1, p0, Lvd1/a$b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    invoke-direct {p1, v0, v1, p2}, Lvd1/a$b;-><init>(Lvd1/a;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvd1/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvd1/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvd1/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvd1/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvd1/a$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvd1/a$b;->x:Lvd1/a;

    invoke-static {p1}, Lvd1/a;->e(Lvd1/a;)Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    move-result-object p1

    iget-object v1, p0, Lvd1/a$b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    iput v2, p0, Lvd1/a$b;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;->insert(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :goto_0
    iget-object v0, p0, Lvd1/a$b;->x:Lvd1/a;

    invoke-static {v0}, Lvd1/a;->c(Lvd1/a;)Lrr2/c;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/exception/ConnectivityException;

    const-string v2, "Caught a SQLiteException when trying to store Smart Alarm Diagnostic Data"

    invoke-direct {v1, v2, p1}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lvd1/a$b;->x:Lvd1/a;

    invoke-static {v0}, Lvd1/a;->d(Lvd1/a;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Caught a SQLiteFullException: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
