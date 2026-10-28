.class final Lnx1/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnx1/h;->t(Ljx1/c0$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic w:Lm91/u;

.field final synthetic x:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/u;Lcom/whoop/data/repositories/FeatureFlagChecker;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lnx1/h$b;->w:Lm91/u;

    iput-object p2, p0, Lnx1/h$b;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lnx1/h$b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lnx1/h$b;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lnx1/h$b;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnx1/h$b;->w:Lm91/u;

    instance-of v1, v0, Ly71/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ly71/o;

    invoke-virtual {v0}, Ly71/o;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnx1/h$b;->E:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lax1/a$j;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v0, v4, v2}, Lax1/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$g1;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnx1/h$b;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "use-membership-management-checkout-screen"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.navigation.CheckoutScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/navigation/CheckoutScreenModel;

    iget-object v0, p0, Lnx1/h$b;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object p1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_2

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    move-object v6, v2

    :goto_1
    if-eqz v6, :cond_1

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v3}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Llx1/d$a;

    invoke-direct {v2, v1, p1}, Llx1/d$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    iget-object v0, p0, Lnx1/h$b;->z:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/whoop/membership/management/navigation/b$d;

    invoke-direct {v1, p1}, Lcom/whoop/membership/management/navigation/b$d;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lnx1/h$b;->z:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    instance-of v0, p1, Lax1/a;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lnx1/h$b;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lnx1/h$b;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
