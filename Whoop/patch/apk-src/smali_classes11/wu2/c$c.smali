.class final Lwu2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c;->l(Lwu2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$fetchSharedTemplate$sharedTemplateResponse$2"
    f = "EditWorkoutInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lwu2/c;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwu2/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu2/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwu2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$c;->x:Lwu2/c;

    iput-object p2, p0, Lwu2/c$c;->y:Ljava/lang/String;

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

    new-instance p1, Lwu2/c$c;

    iget-object v0, p0, Lwu2/c$c;->x:Lwu2/c;

    iget-object v1, p0, Lwu2/c$c;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lwu2/c$c;-><init>(Lwu2/c;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final f(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lwu2/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwu2/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwu2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwu2/c$c;->f(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lwu2/c$c;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwu2/c$c;->x:Lwu2/c;

    invoke-static {p1}, Lwu2/c;->d(Lwu2/c;)Lfi0/a;

    move-result-object v0

    const-string p1, "sharedworkoutID"

    iget-object v1, p0, Lwu2/c$c;->y:Ljava/lang/String;

    invoke-static {p1, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "View"

    const-string v3, "Shared"

    const-string v4, "Workout Builder"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
