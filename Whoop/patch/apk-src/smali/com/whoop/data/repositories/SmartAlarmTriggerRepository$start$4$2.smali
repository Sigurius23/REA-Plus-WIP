.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->emit(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0xb7cc80e

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    if-eq v0, v1, :cond_5

    const v1, 0x5ab98e6

    if-eq v0, v1, :cond_3

    const v1, 0x20236793

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SmartAlarmRefresh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object p1

    const-string v0, "Trigger Smart alarm refresh after weekly plan save"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    .line 4
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$fetchAndCacheSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v2

    .line 5
    :cond_3
    const-string p2, "cycle"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    .line 6
    :cond_4
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object p1

    const-string p2, "Trigger Smart alarm refresh after cycles fetch"

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    .line 7
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$doWorkOnCycleFetch(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V

    goto :goto_1

    .line 8
    :cond_5
    const-string v0, "DisableHighFrequency"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 9
    :goto_0
    iget-object p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const-string v0, "Event: "

    const-string v1, " shouldn\'t be received here"

    .line 10
    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 11
    invoke-static {p2, p1, v1, v0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V

    :goto_1
    return-object v2

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object p1

    const-string v0, "Disable high frequency mode on turnoff alarm"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    .line 13
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$disableHighFrequencyMode(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    return-object v2
.end method
