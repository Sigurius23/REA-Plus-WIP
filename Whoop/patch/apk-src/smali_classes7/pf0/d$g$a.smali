.class public final Lpf0/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf0/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Z

.field final synthetic z:Lpf0/d;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;ZLpf0/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpf0/d$g$a;->w:Lec3/m;

    iput-object p2, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lpf0/d$g$a;->y:Z

    iput-object p4, p0, Lpf0/d$g$a;->z:Lpf0/d;

    iput-object p5, p0, Lpf0/d$g$a;->E:Ljava/lang/String;

    iput-object p6, p0, Lpf0/d$g$a;->F:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lpf0/d$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpf0/d$g$a$a;

    iget v1, v0, Lpf0/d$g$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpf0/d$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpf0/d$g$a$a;

    invoke-direct {v0, p0, p2}, Lpf0/d$g$a$a;-><init>(Lpf0/d$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lpf0/d$g$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpf0/d$g$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lpf0/d$g$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lpf0/d$g$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lpf0/d$g$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lpf0/d$g$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    if-eqz v2, :cond_3

    new-instance v4, Lpf0/c;

    iget-object v5, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    sget-object v6, Lpf0/a$c;->a:Lpf0/a$c;

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_4

    new-instance v4, Lpf0/c;

    iget-object v5, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v8

    iget-boolean v9, p0, Lpf0/d$g$a;->y:Z

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v12}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    new-instance v4, Lpf0/c;

    iget-object v5, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x32

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_6

    new-instance v4, Lpf0/c;

    iget-object v5, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    invoke-virtual {p1}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x32

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lpm0/a$c;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lpf0/d$g$a;->z:Lpf0/d;

    check-cast p1, Lpm0/a$c;

    invoke-static {v2, p1}, Lpf0/d;->d(Lpf0/d;Lpm0/a$c;)Lpf0/c;

    move-result-object v4

    iget-object v5, p0, Lpf0/d$g$a;->x:Ljava/lang/String;

    iget-object p1, p0, Lpf0/d$g$a;->E:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_7

    iget-object p1, p0, Lpf0/d$g$a;->F:Ljava/lang/String;

    :cond_7
    move-object v8, p1

    const/16 v11, 0x36

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lpf0/c;->b(Lpf0/c;Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILjava/lang/Object;)Lpf0/c;

    move-result-object v4

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lpf0/d$g$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lpf0/d$g$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lpf0/d$g$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lpf0/d$g$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lpf0/d$g$a$a;->H:I

    iput v3, v0, Lpf0/d$g$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
