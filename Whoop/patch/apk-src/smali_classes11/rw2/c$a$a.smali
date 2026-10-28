.class public final Lrw2/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw2/c$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lrw2/c;


# direct methods
.method public constructor <init>(Lec3/m;Lrw2/c;)V
    .locals 0

    iput-object p1, p0, Lrw2/c$a$a;->w:Lec3/m;

    iput-object p2, p0, Lrw2/c$a$a;->x:Lrw2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lrw2/c$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrw2/c$a$a$a;

    iget v1, v0, Lrw2/c$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrw2/c$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrw2/c$a$a$a;

    invoke-direct {v0, p0, p2}, Lrw2/c$a$a$a;-><init>(Lrw2/c$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrw2/c$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrw2/c$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lrw2/c$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lrw2/c$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lrw2/c$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lrw2/c$a$a;->w:Lec3/m;

    check-cast p1, Lqw2/a;

    invoke-interface {p1}, Lqw2/a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    instance-of p1, v6, Lcom/whoop/whoopaction/domain/models/OSAction;

    const/4 v2, 0x0

    if-nez p1, :cond_3

    iget-object p1, p0, Lrw2/c$a$a;->x:Lrw2/c;

    invoke-static {p1}, Lrw2/c;->c(Lrw2/c;)Lrr2/c;

    move-result-object p1

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "OSActionHandler received non-OSAction: "

    invoke-static {v7, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v4}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    new-instance v4, Lqw2/b$a;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "OSActionHandler received non-OSAction"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    move-object p1, v6

    check-cast p1, Lcom/whoop/whoopaction/domain/models/OSAction;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/OSAction;->getParameters()Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    move-result-object v4

    instance-of v5, v4, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    if-eqz v5, :cond_4

    iget-object v5, p0, Lrw2/c$a$a;->x:Lrw2/c;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    invoke-static {v5, p1, v4}, Lrw2/c;->e(Lrw2/c;Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;)Lqw2/b;

    move-result-object p1

    :goto_1
    move-object v4, p1

    goto :goto_2

    :cond_4
    instance-of v5, v4, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;

    if-eqz v5, :cond_5

    iget-object v5, p0, Lrw2/c$a$a;->x:Lrw2/c;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;

    invoke-static {v5, p1, v4}, Lrw2/c;->f(Lrw2/c;Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;)Lqw2/b;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of v5, v4, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    if-eqz v5, :cond_6

    iget-object v5, p0, Lrw2/c$a$a;->x:Lrw2/c;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    invoke-static {v5, p1, v4}, Lrw2/c;->g(Lrw2/c;Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/PermissionParameters;)Lqw2/b;

    move-result-object p1

    goto :goto_1

    :cond_6
    instance-of v5, v4, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lrw2/c$a$a;->x:Lrw2/c;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    invoke-static {v5, p1, v4}, Lrw2/c;->h(Lrw2/c;Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/PickMediaParameters;)Lqw2/b;

    move-result-object p1

    goto :goto_1

    :cond_7
    instance-of p1, v4, Lcom/whoop/whoopaction/domain/models/UnknownOSActionParameters;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lrw2/c$a$a;->x:Lrw2/c;

    invoke-static {p1}, Lrw2/c;->d(Lrw2/c;)Ltr2/n;

    move-result-object p1

    const-string v4, "Ignoring OSAction with unrecognized type"

    new-array v5, v2, [Lqr2/a$a;

    invoke-interface {p1, v4, v5}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lqw2/b$a;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "Unrecognized OS action type"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, Lrw2/c$a$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lrw2/c$a$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lrw2/c$a$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lrw2/c$a$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lrw2/c$a$a$a;->H:I

    iput v3, v0, Lrw2/c$a$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
