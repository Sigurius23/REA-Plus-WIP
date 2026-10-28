.class final Lza2/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza2/d;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lza2/f;",
        "settingsBannerDomainState",
        "Lvc2/c;",
        "switchModalResult",
        "<anonymous>",
        "(Lza2/f;Lvc2/c;)Lza2/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.banner.SettingsBannerDomainCombiner$interact$base$1"
    f = "SettingsBannerDomainCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lza2/d$i;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lza2/f;Lvc2/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/f;",
            "Lvc2/c;",
            "Lq83/d<",
            "-",
            "Lza2/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lza2/d$i;

    invoke-direct {v0, p3}, Lza2/d$i;-><init>(Lq83/d;)V

    iput-object p1, v0, Lza2/d$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lza2/d$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lza2/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lza2/f;

    check-cast p2, Lvc2/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lza2/d$i;->f(Lza2/f;Lvc2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lza2/d$i;->x:Ljava/lang/Object;

    check-cast v0, Lza2/f;

    iget-object v1, p0, Lza2/d$i;->y:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lvc2/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lza2/d$i;->w:I

    if-nez v1, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lza2/f$b;->a:Lza2/f$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, v0, Lza2/f$a;

    if-eqz p1, :cond_1

    sget-object p1, Lza2/f$a;->a:Lza2/f$a;

    return-object p1

    :cond_1
    instance-of p1, v0, Lza2/f$c;

    if-eqz p1, :cond_2

    move-object v2, v0

    check-cast v2, Lza2/f$c;

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lza2/f$c;->b(Lza2/f$c;Ljava/util/List;Lvc2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;ZLcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lza2/f$c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
