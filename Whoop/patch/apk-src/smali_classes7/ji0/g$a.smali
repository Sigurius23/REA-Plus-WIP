.class final Lji0/g$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lji0/g;-><init>(Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "suppressHomeFetchNoDevice",
        "tabs",
        "",
        "Lcom/whoop/appconfiguration/TabConfiguration;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.appconfiguration.DeviceHomeDestinationSourceImpl$isAvailable$1"
    f = "DeviceHomeDestinationSourceImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Z

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lji0/g;


# direct methods
.method public constructor <init>(Lji0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lji0/g;",
            "Lq83/d<",
            "-",
            "Lji0/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lji0/g$a;->z:Lji0/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/List;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lji0/g$a;->invoke(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/whoop/appconfiguration/TabConfiguration;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lji0/g$a;

    iget-object v1, p0, Lji0/g$a;->z:Lji0/g;

    invoke-direct {v0, v1, p3}, Lji0/g$a;-><init>(Lji0/g;Lq83/d;)V

    iput-boolean p1, v0, Lji0/g$a;->x:Z

    iput-object p2, v0, Lji0/g$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lji0/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lji0/g$a;->x:Z

    iget-object v1, p0, Lji0/g$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lji0/g$a;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    iget-object p1, p0, Lji0/g$a;->z:Lji0/g;

    invoke-static {p1, v1}, Lji0/g;->a(Lji0/g;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
