.class final Lcom/whoop/membership/management/navigation/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/management/navigation/a;->k(Ljx1/d0;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.membership.management.navigation.MembershipManagementNavHostKt$MembershipManagementNavHost$1$1$4$1$1"
    f = "MembershipManagementNavHost.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/payments/domain/models/Card;

.field w:I

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/management/navigation/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/membership/management/navigation/a$d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/membership/management/navigation/a$d;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/management/navigation/a$d;->z:Ljava/util/Map;

    iput-object p4, p0, Lcom/whoop/membership/management/navigation/a$d;->E:Lcom/whoop/payments/domain/models/Card;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcom/whoop/membership/management/navigation/a$d;

    iget-object v1, p0, Lcom/whoop/membership/management/navigation/a$d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/whoop/membership/management/navigation/a$d;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/management/navigation/a$d;->z:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/membership/management/navigation/a$d;->E:Lcom/whoop/payments/domain/models/Card;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/membership/management/navigation/a$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/membership/management/navigation/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/membership/management/navigation/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/membership/management/navigation/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/membership/management/navigation/a$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/membership/management/navigation/a$d;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/a$d;->x:Lkotlin/jvm/functions/Function1;

    new-instance v0, Llx1/a$a;

    iget-object v1, p0, Lcom/whoop/membership/management/navigation/a$d;->y:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/membership/management/navigation/a$d;->z:Ljava/util/Map;

    iget-object v3, p0, Lcom/whoop/membership/management/navigation/a$d;->E:Lcom/whoop/payments/domain/models/Card;

    invoke-direct {v0, v1, v2, v3}, Llx1/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
