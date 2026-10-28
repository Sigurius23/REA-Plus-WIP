.class public final Lth2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lth2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lth2/b;",
        "Lth2/a;",
        "Lcom/whoop/strapauth/client/StrapUnlockApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/strapauth/client/StrapUnlockApi;Ltr2/n;)V",
        "",
        "strapSerial",
        "Lcom/whoop/strapauth/client/StrapUnlockRequest;",
        "body",
        "Lu02/a;",
        "Lcom/whoop/strapauth/client/StrapUnlockResponse;",
        "c",
        "(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;",
        "strapSignature",
        "Lth2/c;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/strapauth/client/StrapUnlockApi;",
        "b",
        "Ltr2/n;",
        "strap-auth_release"
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
.field private static final c:Lth2/b$a;

.field private static final d:[J


# instance fields
.field private final a:Lcom/whoop/strapauth/client/StrapUnlockApi;

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lth2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lth2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lth2/b;->c:Lth2/b$a;

    const/4 v0, 0x3

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lth2/b;->d:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x3e8
        0x7d0
        0xfa0
    .end array-data
.end method

.method public constructor <init>(Lcom/whoop/strapauth/client/StrapUnlockApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lth2/b;->a:Lcom/whoop/strapauth/client/StrapUnlockApi;

    .line 3
    iput-object p2, p0, Lth2/b;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/strapauth/client/StrapUnlockApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "StrapUnlockClient"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lth2/b;-><init>(Lcom/whoop/strapauth/client/StrapUnlockApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic b(Lth2/b;)Lcom/whoop/strapauth/client/StrapUnlockApi;
    .locals 0

    iget-object p0, p0, Lth2/b;->a:Lcom/whoop/strapauth/client/StrapUnlockApi;

    return-object p0
.end method

.method private final c(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/strapauth/client/StrapUnlockRequest;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/strapauth/client/StrapUnlockResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lth2/b;->b:Ltr2/n;

    new-instance v4, Lth2/b$c;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, p2, v2}, Lth2/b$c;-><init>(Lth2/b;Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Failed to fetch strap unlock token"

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lth2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lth2/b$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lth2/b$b;

    iget v3, v2, Lth2/b$b;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lth2/b$b;->K:I

    goto :goto_0

    :cond_0
    new-instance v2, Lth2/b$b;

    invoke-direct {v2, v0, v1}, Lth2/b$b;-><init>(Lth2/b;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lth2/b$b;->I:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lth2/b$b;->K:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v2, Lth2/b$b;->F:I

    iget v9, v2, Lth2/b$b;->E:I

    iget-object v10, v2, Lth2/b$b;->z:Ljava/lang/Object;

    check-cast v10, Lu02/a;

    iget-object v10, v2, Lth2/b$b;->y:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/strapauth/client/StrapUnlockRequest;

    iget-object v11, v2, Lth2/b$b;->x:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lth2/b$b;->w:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lth2/b$b;->H:I

    iget v9, v2, Lth2/b$b;->G:I

    iget v10, v2, Lth2/b$b;->F:I

    iget v11, v2, Lth2/b$b;->E:I

    iget-object v12, v2, Lth2/b$b;->y:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/strapauth/client/StrapUnlockRequest;

    iget-object v13, v2, Lth2/b$b;->x:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v2, Lth2/b$b;->w:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v9

    move v9, v4

    move v4, v10

    move/from16 v10, v16

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lcom/whoop/strapauth/client/StrapUnlockRequest;

    move-object/from16 v4, p2

    invoke-direct {v1, v4}, Lcom/whoop/strapauth/client/StrapUnlockRequest;-><init>(Ljava/lang/String;)V

    sget-object v4, Lth2/b;->d:[J

    array-length v4, v4

    add-int/2addr v4, v7

    move v9, v4

    move v10, v8

    move-object v4, v2

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_1
    if-ge v10, v9, :cond_c

    iput-object v1, v4, Lth2/b$b;->w:Ljava/lang/Object;

    iput-object v6, v4, Lth2/b$b;->x:Ljava/lang/Object;

    iput-object v2, v4, Lth2/b$b;->y:Ljava/lang/Object;

    iput-object v6, v4, Lth2/b$b;->z:Ljava/lang/Object;

    iput v9, v4, Lth2/b$b;->E:I

    iput v10, v4, Lth2/b$b;->F:I

    iput v10, v4, Lth2/b$b;->G:I

    iput v8, v4, Lth2/b$b;->H:I

    iput v7, v4, Lth2/b$b;->K:I

    invoke-direct {v0, v1, v2, v4}, Lth2/b;->c(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v13, v1

    move-object v12, v2

    move-object v2, v4

    move v4, v10

    move-object v1, v11

    move v11, v9

    move v9, v8

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v14, v1, Lu02/a$c;

    if-eqz v14, :cond_5

    new-instance v2, Lth2/c$d;

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/strapauth/client/StrapUnlockResponse;

    invoke-virtual {v1}, Lcom/whoop/strapauth/client/StrapUnlockResponse;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lth2/c$d;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_5
    instance-of v14, v1, Lu02/a$b$b;

    if-eqz v14, :cond_6

    sget-object v1, Lth2/c$c;->a:Lth2/c$c;

    return-object v1

    :cond_6
    instance-of v14, v1, Lu02/a$b$a;

    if-eqz v14, :cond_b

    check-cast v1, Lu02/a$b$a;

    invoke-virtual {v1}, Lu02/a$b$a;->d()I

    move-result v1

    const/16 v14, 0x191

    if-eq v1, v14, :cond_a

    const/16 v14, 0x193

    if-eq v1, v14, :cond_9

    sget-object v1, Lth2/b;->d:[J

    array-length v14, v1

    if-ge v10, v14, :cond_8

    aget-wide v14, v1, v10

    iput-object v13, v2, Lth2/b$b;->w:Ljava/lang/Object;

    iput-object v6, v2, Lth2/b$b;->x:Ljava/lang/Object;

    iput-object v12, v2, Lth2/b$b;->y:Ljava/lang/Object;

    iput-object v6, v2, Lth2/b$b;->z:Ljava/lang/Object;

    iput v11, v2, Lth2/b$b;->E:I

    iput v4, v2, Lth2/b$b;->F:I

    iput v10, v2, Lth2/b$b;->G:I

    iput v9, v2, Lth2/b$b;->H:I

    iput v5, v2, Lth2/b$b;->K:I

    invoke-static {v14, v15, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    move v9, v11

    move-object v10, v12

    move-object v11, v13

    :goto_4
    move-object v1, v11

    move v11, v9

    move-object v9, v2

    move-object v2, v10

    goto :goto_5

    :cond_8
    move-object v9, v2

    move-object v2, v12

    move-object v1, v13

    :goto_5
    add-int/lit8 v10, v4, 0x1

    move-object v4, v9

    move v9, v11

    goto/16 :goto_1

    :cond_9
    iget-object v1, v0, Lth2/b;->b:Ltr2/n;

    const-string v2, "Strap is blocked by the backend (403)"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Lth2/c$b;->a:Lth2/c$b;

    return-object v1

    :cond_a
    iget-object v1, v0, Lth2/b;->b:Ltr2/n;

    const-string v2, "Bad or missing bearer token (401)"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Lth2/c$a;->a:Lth2/c$a;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_c
    iget-object v1, v0, Lth2/b;->b:Ltr2/n;

    sget-object v2, Lth2/b;->d:[J

    array-length v2, v2

    const-string v3, "Strap unlock token fetch failed after "

    const-string v4, " retries"

    invoke-static {v2, v3, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Lth2/c$a;->a:Lth2/c$a;

    return-object v1
.end method
