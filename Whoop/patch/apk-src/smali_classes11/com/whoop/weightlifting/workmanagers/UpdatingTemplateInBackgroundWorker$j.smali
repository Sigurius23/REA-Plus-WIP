.class final Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->j(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$work$2"
    f = "UpdatingTemplateInBackgroundWorker.kt"
    l = {
        0x5c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

.field final synthetic F:Lu02/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu02/a<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic G:Ljava/lang/Long;

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;Lu02/a;Ljava/lang/Long;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;",
            "Lu02/a<",
            "*>;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->E:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->F:Lu02/a;

    iput-object p3, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->G:Ljava/lang/Long;

    iput-object p4, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->H:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;

    iget-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->E:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iget-object v2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->F:Lu02/a;

    iget-object v3, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->G:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->H:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;-><init>(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;Lu02/a;Ljava/lang/Long;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iget-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->E:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iget-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->F:Lu02/a;

    check-cast v1, Lu02/a$b;

    invoke-static {v1}, Lew2/a;->a(Lu02/a$b;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->G:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->E:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iget-object v5, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->H:Ljava/lang/String;

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$j;->z:I

    invoke-static {v4, v5, p0}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->k(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v2

    move-object v2, p1

    move-object p1, v0

    move-object v0, v3

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v2, v1, v0, p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->n(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;Ljava/lang/String;Ljava/lang/Long;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
