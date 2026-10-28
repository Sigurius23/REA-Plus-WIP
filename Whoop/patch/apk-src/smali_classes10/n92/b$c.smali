.class final Ln92/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln92/b;->X0(Ljava/util/List;Leb/a0;)Ln92/a;
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
    c = "com.whoop.service.push.iterable.CustomActionHandler$viewCommunity$1"
    f = "CustomActionHandler.kt"
    l = {
        0x317
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ln92/b;

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Leb/a0;


# direct methods
.method public constructor <init>(Ln92/b;Ljava/util/List;Leb/a0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln92/b;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Leb/a0;",
            "Lq83/d<",
            "-",
            "Ln92/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln92/b$c;->x:Ln92/b;

    iput-object p2, p0, Ln92/b$c;->y:Ljava/util/List;

    iput-object p3, p0, Ln92/b$c;->z:Leb/a0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Ln92/b$c;

    iget-object v0, p0, Ln92/b$c;->x:Ln92/b;

    iget-object v1, p0, Ln92/b$c;->y:Ljava/util/List;

    iget-object v2, p0, Ln92/b$c;->z:Leb/a0;

    invoke-direct {p1, v0, v1, v2, p2}, Ln92/b$c;-><init>(Ln92/b;Ljava/util/List;Leb/a0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ln92/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln92/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln92/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln92/b$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln92/b$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln92/b$c;->x:Ln92/b;

    invoke-static {p1}, Ln92/b;->e(Ln92/b;)Lcq0/g;

    move-result-object p1

    iget-object v1, p0, Ln92/b$c;->y:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "valueOf(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, p0, Ln92/b$c;->x:Ln92/b;

    invoke-static {v3}, Ln92/b;->f(Ln92/b;)Lod1/u;

    move-result-object v3

    invoke-virtual {v3}, Lod1/u;->g()I

    move-result v3

    sget-object v4, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    iput v2, p0, Ln92/b$c;->w:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lcq0/g;->w(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln92/b$c;->x:Ln92/b;

    iget-object v1, p0, Ln92/b$c;->y:Ljava/util/List;

    iget-object v2, p0, Ln92/b$c;->z:Leb/a0;

    const/4 v3, 0x2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ln92/b;->d(Ln92/b;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0}, Ln92/b;->c(Ln92/b;)Lcom/google/gson/Gson;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/communityFragment?pillarType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&timePeriod=DAILY&widgetUrl=null&teamString="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ln92/b;->g(Ln92/b;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v2, p1}, Leb/a0;->s(Leb/k0;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
