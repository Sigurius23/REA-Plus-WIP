.class public final Lza0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lza0/b;",
        "Lza0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ.\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lza0/d;",
        "Lod1/g;",
        "Lza0/b;",
        "Lza0/c;",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V",
        "action",
        "",
        "",
        "dismissedCardIds",
        "prevResult",
        "g",
        "(Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;",
        "id",
        "nextToken",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "b",
        "Ltr2/n;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lza0/d;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 3
    iput-object p2, p0, Lza0/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "BiomarkerDetailsInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lza0/d;-><init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lza0/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lza0/d;->f(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lza0/d;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lza0/d;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic e(Lza0/d;Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lza0/d;->g(Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lza0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lza0/d$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lza0/d$a;

    iget v1, v0, Lza0/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lza0/d$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lza0/d$a;

    invoke-direct {v0, p0, p3}, Lza0/d$a;-><init>(Lza0/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lza0/d$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lza0/d$a;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    iget-object p1, v6, Lza0/d$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lza0/d$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lza0/d;->b:Ltr2/n;

    new-instance v5, Lza0/d$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, p2, v3}, Lza0/d$b;-><init>(Lza0/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v6, Lza0/d$a;->w:Ljava/lang/Object;

    iput-object v3, v6, Lza0/d$a;->x:Ljava/lang/Object;

    iput p3, v6, Lza0/d$a;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_1

    return-object v0

    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance v1, Lza0/c$d;

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lza0/c$d;-><init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lza0/c$b;->a:Lza0/c$b;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/b;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lza0/c;",
            "Lq83/d<",
            "-",
            "Lza0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lza0/d$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lza0/d$c;

    iget v1, v0, Lza0/d$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lza0/d$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lza0/d$c;

    invoke-direct {v0, p0, p4}, Lza0/d$c;-><init>(Lza0/d;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lza0/d$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lza0/d$c;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lza0/d$c;->y:Ljava/lang/Object;

    check-cast p1, Lza0/c;

    iget-object p1, v0, Lza0/d$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/util/Set;

    iget-object p1, v0, Lza0/d$c;->w:Ljava/lang/Object;

    check-cast p1, Lza0/b;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v5, p2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p4, p1, Lza0/b$b;

    const/4 v2, 0x0

    if-eqz p4, :cond_5

    check-cast p1, Lza0/b$b;

    invoke-virtual {p1}, Lza0/b$b;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lza0/b$b;->b()Ljava/lang/String;

    move-result-object p1

    iput-object v2, v0, Lza0/d$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lza0/d$c;->x:Ljava/lang/Object;

    iput-object v2, v0, Lza0/d$c;->y:Ljava/lang/Object;

    iput v3, v0, Lza0/d$c;->F:I

    invoke-direct {p0, p3, p1, v0}, Lza0/d;->f(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_1

    return-object v1

    :goto_1
    check-cast p4, Lza0/c;

    instance-of p1, p4, Lza0/c$d;

    if-eqz p1, :cond_4

    move-object v2, p4

    check-cast v2, Lza0/c$d;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lza0/c$d;->b(Lza0/c$d;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;ILjava/lang/Object;)Lza0/c$d;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p4

    :cond_5
    instance-of p4, p1, Lza0/b$a;

    if-eqz p4, :cond_8

    instance-of p4, p3, Lza0/c$d;

    if-eqz p4, :cond_6

    move-object v2, p3

    check-cast v2, Lza0/c$d;

    :cond_6
    move-object v3, v2

    if-eqz v3, :cond_7

    check-cast p1, Lza0/b$a;

    invoke-virtual {p1}, Lza0/b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lza0/c$d;->b(Lza0/c$d;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;ILjava/lang/Object;)Lza0/c$d;

    move-result-object p1

    return-object p1

    :cond_7
    return-object p3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza0/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lza0/d$d;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object v0, Lza0/c$c;->a:Lza0/c$c;

    const-string v2, "null cannot be cast to non-null type com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsDomainResult"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lza0/d$f;

    invoke-direct {v2, p0, v1}, Lza0/d$f;-><init>(Lza0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
