.class public final Lgb/a0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lp1/t2;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Ljava/util/Map;

.field public final synthetic x:Lgb/i;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lgb/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lgb/a0;->w:Ljava/util/Map;

    iput-object p2, p0, Lgb/a0;->x:Lgb/i;

    iput-object p3, p0, Lgb/a0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lgb/a0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lgb/a0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lgb/a0;->F:Lp1/t2;

    iput-object p7, p0, Lgb/a0;->G:Lp1/c1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lc0/q;

    iget-object v0, p0, Lgb/a0;->F:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->F:Ljava/lang/String;

    iget-object v1, p0, Lgb/a0;->w:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->F:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v2

    :goto_0
    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lgb/a0;->x:Lgb/i;

    iget-object v2, v2, Lgb/i;->c:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v2, :cond_3

    iget-object v2, p0, Lgb/a0;->G:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    add-float/2addr v0, v3

    goto :goto_2

    :cond_3
    :goto_1
    sub-float/2addr v0, v3

    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lc0/l0;

    iget-object v2, p0, Lgb/a0;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/c1;

    iget-object v3, p0, Lgb/a0;->z:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc0/e1;

    iget-object v4, p0, Lgb/a0;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/r1;

    invoke-direct {v1, v2, v3, v0, p1}, Lc0/l0;-><init>(Lc0/c1;Lc0/e1;FLc0/r1;)V

    return-object v1

    :cond_4
    sget-object p1, Lc0/c1;->a:Lc0/d1;

    sget-object v0, Lc0/e1;->a:Lc0/f1;

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    return-object p1
.end method
