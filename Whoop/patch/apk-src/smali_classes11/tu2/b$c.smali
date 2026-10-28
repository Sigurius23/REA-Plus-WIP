.class final Ltu2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltu2/b;->m(Leb/a0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.weightlifting.feature.active.devicelocation.view.DeviceLocationScreenKt$DeviceLocationScreen$1$1"
    f = "DeviceLocationScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Leb/a0;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leb/a0;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Ltu2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltu2/b$c;->x:Leb/a0;

    iput-object p2, p0, Ltu2/b$c;->y:Lp1/t2;

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

    new-instance p1, Ltu2/b$c;

    iget-object v0, p0, Ltu2/b$c;->x:Leb/a0;

    iget-object v1, p0, Ltu2/b$c;->y:Lp1/t2;

    invoke-direct {p1, v0, v1, p2}, Ltu2/b$c;-><init>(Leb/a0;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ltu2/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltu2/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltu2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltu2/b$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ltu2/b$c;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltu2/b$c;->y:Lp1/t2;

    invoke-static {p1}, Ltu2/b;->B(Lp1/t2;)Lsu2/d;

    move-result-object p1

    invoke-virtual {p1}, Lsu2/d;->g()Lru2/a;

    move-result-object p1

    instance-of v0, p1, Lru2/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltu2/b$c;->x:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lru2/a$b;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

    iget-object v2, p0, Ltu2/b$c;->x:Leb/a0;

    iget-object p1, p0, Ltu2/b$c;->y:Lp1/t2;

    invoke-static {p1}, Ltu2/b;->B(Lp1/t2;)Lsu2/d;

    move-result-object p1

    invoke-virtual {p1}, Lsu2/d;->i()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v3

    iget-object p1, p0, Ltu2/b$c;->y:Lp1/t2;

    invoke-static {p1}, Ltu2/b;->B(Lp1/t2;)Lsu2/d;

    move-result-object p1

    invoke-virtual {p1}, Lsu2/d;->h()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->l(Lcom/whoop/weightlifting/StrengthTrainerDestination$a;Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
