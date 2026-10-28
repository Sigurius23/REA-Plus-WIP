.class public final Lf70/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf70/j0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lf70/j0;",
        "",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "activationApi",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Lf70/u;",
        "appDestinationRouter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;)V",
        "Ln70/d;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "flow",
        "Lcom/whoop/navigation/e;",
        "f",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lf70/e$b;",
        "prevDomainResult",
        "Lf70/f;",
        "g",
        "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "b",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "c",
        "Lod1/j;",
        "d",
        "Lf70/u;",
        "Ltr2/n;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:Lf70/j0$a;

.field public static final g:I


# instance fields
.field private final a:Lcom/whoop/activation/domain/ActivationApi;

.field private final b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

.field private final c:Lod1/j;

.field private final d:Lf70/u;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf70/j0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf70/j0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf70/j0;->f:Lf70/j0$a;

    const/16 v0, 0x8

    sput v0, Lf70/j0;->g:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;)V
    .locals 1

    const-string v0, "activationApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appDestinationRouter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/j0;->a:Lcom/whoop/activation/domain/ActivationApi;

    .line 3
    iput-object p2, p0, Lf70/j0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    .line 4
    iput-object p3, p0, Lf70/j0;->c:Lod1/j;

    .line 5
    iput-object p4, p0, Lf70/j0;->d:Lf70/u;

    .line 6
    iput-object p5, p0, Lf70/j0;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "IAJFSignUpHelper"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lf70/j0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/j0;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lf70/j0;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lf70/j0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf70/j0;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lf70/j0;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 0

    iget-object p0, p0, Lf70/j0;->a:Lcom/whoop/activation/domain/ActivationApi;

    return-object p0
.end method

.method public static final synthetic d(Lf70/j0;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/j0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln70/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lf70/j0$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf70/j0$b;

    iget v1, v0, Lf70/j0$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/j0$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/j0$b;

    invoke-direct {v0, p0, p1}, Lf70/j0$b;-><init>(Lf70/j0;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lf70/j0$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/j0$b;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lf70/j0$b;->x:Ljava/lang/Object;

    check-cast v1, Lf70/t;

    iget-object v0, v0, Lf70/j0$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lf70/j0$b;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf70/j0;->d:Lf70/u;

    sget-object v2, Lf70/s;->POST_SIGN_IN:Lf70/s;

    const-string v6, "iajf-prepaids"

    iput-object v6, v0, Lf70/j0$b;->w:Ljava/lang/Object;

    iput v4, v0, Lf70/j0$b;->E:I

    invoke-virtual {p1, v2, v6, v0}, Lf70/u;->d(Lf70/s;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v6

    :goto_1
    check-cast p1, Lf70/t;

    instance-of v4, p1, Lf70/t$b;

    if-eqz v4, :cond_5

    new-instance v0, Ln70/d$b;

    check-cast p1, Lf70/t$b;

    invoke-virtual {p1}, Lf70/t$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ln70/d$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_5
    instance-of v4, p1, Lf70/t$a;

    if-eqz v4, :cond_6

    check-cast p1, Lf70/t$a;

    invoke-static {p1}, Lf70/v;->b(Lf70/t$a;)Ln70/d$a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, p1, Lf70/t$c;

    if-eqz p1, :cond_9

    iput-object v5, v0, Lf70/j0$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Lf70/j0$b;->x:Ljava/lang/Object;

    iput v3, v0, Lf70/j0$b;->E:I

    invoke-direct {p0, v2, v0}, Lf70/j0;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p1, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_8

    new-instance v0, Ln70/d$b;

    invoke-direct {v0, p1}, Ln70/d$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_8
    return-object v5

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/j0$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/j0$c;

    iget v1, v0, Lf70/j0$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/j0$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lf70/j0$c;

    invoke-direct {v0, p0, p2}, Lf70/j0$c;-><init>(Lf70/j0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lf70/j0$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lf70/j0$c;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lf70/j0$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lf70/j0;->e:Ltr2/n;

    new-instance v5, Lf70/j0$d;

    invoke-direct {v5, p0, p1, v9}, Lf70/j0$d;-><init>(Lf70/j0;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v6, Lf70/j0$c;->w:Ljava/lang/Object;

    iput p2, v6, Lf70/j0$c;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch post-signin destination"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/navigation/e;

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    return-object v9

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final g(Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lf70/j0$e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/j0$e;

    iget v3, v2, Lf70/j0$e;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/j0$e;->H:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/j0$e;

    invoke-direct {v2, v0, v1}, Lf70/j0$e;-><init>(Lf70/j0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/j0$e;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/j0$e;->H:I

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v12, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Lf70/j0$e;->z:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v3, v8, Lf70/j0$e;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;

    iget-object v3, v8, Lf70/j0$e;->x:Ljava/lang/Object;

    check-cast v3, Lf70/q0;

    iget-object v3, v8, Lf70/j0$e;->w:Ljava/lang/Object;

    check-cast v3, Lf70/e$b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v3

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v3, v8, Lf70/j0$e;->E:I

    iget-object v4, v8, Lf70/j0$e;->y:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;

    iget-object v4, v8, Lf70/j0$e;->x:Ljava/lang/Object;

    check-cast v4, Lf70/q0;

    iget-object v4, v8, Lf70/j0$e;->w:Ljava/lang/Object;

    check-cast v4, Lf70/e$b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v15, v3

    move-object v3, v1

    move-object v1, v4

    goto/16 :goto_4

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v1

    invoke-virtual {v1}, Lf70/q0;->j()Ld70/c;

    move-result-object v3

    invoke-virtual {v3}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lf70/q0;->s()Ld70/e;

    move-result-object v3

    invoke-virtual {v3}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lf70/q0;->l()Ld70/d;

    move-result-object v3

    invoke-virtual {v3}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lf70/q0;->q()Ld70/d;

    move-result-object v3

    invoke-virtual {v3}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v15, v14

    goto :goto_3

    :cond_5
    :goto_2
    move v15, v12

    :goto_3
    if-eqz v15, :cond_6

    iget-object v1, v0, Lf70/j0;->e:Ltr2/n;

    const-string v2, "IAJF sign up skipped due to missing required fields"

    new-array v3, v14, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lf70/f;

    const v33, 0x1ffdf

    const/16 v34, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v15 .. v34}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v14}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_6
    new-instance v16, Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;

    invoke-virtual {v1}, Lf70/q0;->j()Ld70/c;

    move-result-object v3

    invoke-virtual {v3}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lf70/q0;->s()Ld70/e;

    move-result-object v3

    invoke-virtual {v3}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lf70/q0;->l()Ld70/d;

    move-result-object v3

    invoke-virtual {v3}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lf70/q0;->q()Ld70/d;

    move-result-object v3

    invoke-virtual {v3}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lf70/q0;->z()Ljava/lang/String;

    move-result-object v22

    invoke-direct/range {v16 .. v22}, Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v4, v0, Lf70/j0;->e:Ltr2/n;

    new-instance v7, Lf70/j0$f;

    invoke-direct {v7, v0, v1, v13}, Lf70/j0$f;-><init>(Lf70/j0;Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;Lq83/d;)V

    move-object/from16 v1, p1

    iput-object v1, v8, Lf70/j0$e;->w:Ljava/lang/Object;

    iput-object v13, v8, Lf70/j0$e;->x:Ljava/lang/Object;

    iput-object v13, v8, Lf70/j0$e;->y:Ljava/lang/Object;

    iput v15, v8, Lf70/j0$e;->E:I

    iput v12, v8, Lf70/j0$e;->H:I

    const/4 v5, 0x0

    const-string v6, "Failed to sign up IAJF user"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    check-cast v3, Lu02/a;

    instance-of v4, v3, Lu02/a$c;

    if-eqz v4, :cond_a

    iget-object v4, v0, Lf70/j0;->c:Lod1/j;

    move-object v5, v3

    check-cast v5, Lu02/a$c;

    invoke-virtual {v5}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/domain/model/AuthMaterial;

    invoke-virtual {v6}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lod1/j;->e(Ljava/lang/String;)V

    iget-object v4, v0, Lf70/j0;->c:Lod1/j;

    invoke-virtual {v5}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/domain/model/AuthMaterial;

    invoke-virtual {v4, v5}, Lod1/j;->f(Lcom/whoop/domain/model/AuthMaterial;)V

    iput-object v1, v8, Lf70/j0$e;->w:Ljava/lang/Object;

    iput-object v13, v8, Lf70/j0$e;->x:Ljava/lang/Object;

    iput-object v13, v8, Lf70/j0$e;->y:Ljava/lang/Object;

    iput-object v3, v8, Lf70/j0$e;->z:Ljava/lang/Object;

    iput v15, v8, Lf70/j0$e;->E:I

    iput v11, v8, Lf70/j0$e;->H:I

    invoke-direct {v0, v8}, Lf70/j0;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_8

    :goto_5
    return-object v2

    :cond_8
    move-object v15, v1

    move-object v2, v3

    move-object v1, v4

    :goto_6
    move-object v8, v1

    check-cast v8, Ln70/d;

    invoke-virtual {v15}, Lf70/e$b;->l()Ln70/e;

    move-result-object v3

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Ln70/e;->b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;

    move-result-object v17

    new-instance v1, Lf70/f;

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lcom/whoop/domain/model/AuthMaterial;

    const v33, 0x1fefd

    const/16 v34, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v15 .. v34}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    if-nez v8, :cond_9

    goto :goto_7

    :cond_9
    move v12, v14

    :goto_7
    invoke-direct {v1, v2, v12}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_a
    instance-of v2, v3, Lu02/a$b;

    if-eqz v2, :cond_c

    check-cast v3, Lu02/a$b;

    invoke-static {v3}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v1, Lf70/f;

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v14}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_b
    new-instance v2, Lf70/f;

    const v34, 0x1ffdf

    const/16 v35, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v16 .. v35}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    invoke-direct {v2, v1, v14}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v2

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
