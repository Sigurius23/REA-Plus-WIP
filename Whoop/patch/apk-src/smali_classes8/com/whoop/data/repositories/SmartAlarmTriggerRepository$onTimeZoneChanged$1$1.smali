.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lqf2/d;",
        "<unused var>",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;",
        "setLwtTo",
        "<anonymous>",
        "(Lqf2/d;Lkotlin/jvm/functions/Function1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$onTimeZoneChanged$1$1"
    f = "SmartAlarmTriggerRepository.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqf2/d;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;->invoke(Lqf2/d;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lqf2/d;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqf2/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;

    invoke-direct {p1, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;-><init>(Lq83/d;)V

    iput-object p2, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;->L$0:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1$1;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
