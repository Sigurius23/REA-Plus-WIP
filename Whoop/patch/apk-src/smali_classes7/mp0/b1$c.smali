.class final synthetic Lmp0/b1$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/b1;->W(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-string v4, "getViewState()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;"

    const/4 v5, 0x0

    const-class v2, Lcom/whoop/coaching/sleepcoach/wizard/b;

    const-string v3, "viewState"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/b;

    invoke-virtual {v0}, Lcom/whoop/coaching/sleepcoach/wizard/b;->r()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v0

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/b;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    invoke-virtual {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->B(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V

    return-void
.end method
