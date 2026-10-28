.class public final Lcom/whoop/settings/DebugFragment$i$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment$i$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.DebugFragment$showLocalStorageWatermarks$collectJob$1$invokeSuspend$$inlined$combine$1$3"
    f = "DebugFragment.kt"
    l = {
        0x120
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/settings/DebugFragment;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lt83/a;


# direct methods
.method public constructor <init>(Lq83/d;Lt83/a;Lcom/whoop/settings/DebugFragment;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->z:Lt83/a;

    iput-object p3, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->E:Lcom/whoop/settings/DebugFragment;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/settings/DebugFragment$i$c$b;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->z:Lt83/a;

    iget-object v2, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->E:Lcom/whoop/settings/DebugFragment;

    invoke-direct {v0, p3, v1, v2}, Lcom/whoop/settings/DebugFragment$i$c$b;-><init>(Lq83/d;Lt83/a;Lcom/whoop/settings/DebugFragment;)V

    iput-object p1, v0, Lcom/whoop/settings/DebugFragment$i$c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/settings/DebugFragment$i$c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/settings/DebugFragment$i$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/settings/DebugFragment$i$c$b;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->z:Lt83/a;

    invoke-static {v1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v3, v1}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    new-instance v8, Lcom/whoop/settings/DebugFragment$i$a;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->E:Lcom/whoop/settings/DebugFragment;

    invoke-direct {v8, v1}, Lcom/whoop/settings/DebugFragment$i$a;-><init>(Lcom/whoop/settings/DebugFragment;)V

    const/16 v9, 0x1e

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/settings/DebugFragment$i$c$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
