.class public final Lke0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lke0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lke0/a;)V
    .locals 0

    iput-object p1, p0, Lke0/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lke0/a$a$a;->x:Lke0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lke0/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lke0/a$a$a$a;

    iget v1, v0, Lke0/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lke0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lke0/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lke0/a$a$a$a;-><init>(Lke0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lke0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lke0/a$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lke0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lke0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lke0/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lke0/a$a$a;->w:Lec3/m;

    check-cast p1, Lhe0/b;

    instance-of v2, p1, Lhe0/b$a;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    sget-object p1, Lje0/c$a;->b:Lje0/c$a;

    goto/16 :goto_5

    :cond_3
    instance-of v2, p1, Lhe0/b$b;

    if-eqz v2, :cond_9

    check-cast p1, Lhe0/b$b;

    invoke-virtual {p1}, Lhe0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v9, p0, Lke0/a$a$a;->x:Lke0/a;

    invoke-static {v9}, Lke0/a;->a(Lke0/a;)Ljb1/a;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lke0/a$a$a;->x:Lke0/a;

    invoke-static {v2}, Lke0/a;->b(Lke0/a;)Lnd0/a;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getTextDisplay()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v4

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getProgress()Ljava/lang/Float;

    move-result-object v9

    goto :goto_3

    :cond_6
    move-object v9, v4

    :goto_3
    invoke-virtual {v2, v5, v9, v3}, Lnd0/a;->a(Ljava/lang/String;Ljava/lang/Float;Z)Lc31/k;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;->getButton()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulingButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    move-object v10, p1

    goto :goto_4

    :cond_7
    move-object v10, v4

    :goto_4
    new-instance v5, Lje0/c$c;

    invoke-direct/range {v5 .. v10}, Lje0/c$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc31/k;Lcom/whoop/navigation/e;)V

    move-object p1, v5

    :goto_5
    iput-object v4, v0, Lke0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lke0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lke0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lke0/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lke0/a$a$a$a;->H:I

    iput v3, v0, Lke0/a$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
