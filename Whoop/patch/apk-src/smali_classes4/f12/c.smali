.class public final Lf12/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lf12/a;",
        "Lf12/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ<\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lf12/c;",
        "Lod1/g;",
        "Lf12/a;",
        "Lf12/b;",
        "Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;Ltr2/n;)V",
        "",
        "provider",
        "Landroid/net/Uri;",
        "url",
        "codeVerifier",
        "authScope",
        "Lec3/l;",
        "e",
        "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;",
        "b",
        "Ltr2/n;",
        "oauth-integration_release"
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
.field private final a:Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf12/c;->a:Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;

    .line 3
    iput-object p2, p0, Lf12/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "OAuthInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lf12/c;-><init>(Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lf12/c;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lf12/c;->e(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lf12/c;)Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;
    .locals 0

    iget-object p0, p0, Lf12/c;->a:Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    instance-of v5, v4, Lf12/c$a;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lf12/c$a;

    iget v6, v5, Lf12/c$a;->K:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lf12/c$a;->K:I

    :goto_0
    move-object v11, v5

    goto :goto_1

    :cond_0
    new-instance v5, Lf12/c$a;

    invoke-direct {v5, v0, v4}, Lf12/c$a;-><init>(Lf12/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v4, v11, Lf12/c$a;->I:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v11, Lf12/c$a;->K:I

    const-string v14, "toString(...)"

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v11, Lf12/c$a;->H:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;

    iget-object v1, v11, Lf12/c$a;->G:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v11, Lf12/c$a;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v11, Lf12/c$a;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v11, Lf12/c$a;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v11, Lf12/c$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v11, Lf12/c$a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/net/Uri;

    iget-object v2, v11, Lf12/c$a;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v22, v2

    move-object v2, v1

    move-object/from16 v1, v22

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v4, "state"

    invoke-virtual {v2, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "code"

    invoke-virtual {v2, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "scope"

    invoke-virtual {v2, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    move-object/from16 v8, p4

    :cond_3
    const-string v9, " code="

    const/4 v10, 0x0

    if-eqz v3, :cond_8

    if-eqz v4, :cond_5

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    new-instance v9, Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;

    invoke-direct {v9, v8, v4, v6, v3}, Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    :goto_2
    iget-object v3, v0, Lf12/c;->b:Ltr2/n;

    if-eqz v4, :cond_6

    move v4, v7

    goto :goto_3

    :cond_6
    move v4, v10

    :goto_3
    if-eqz v6, :cond_7

    goto :goto_4

    :cond_7
    move v7, v10

    :goto_4
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "createConnection aborting: PKCE flow missing state="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Lqr2/a$a;

    invoke-interface {v3, v4, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lf12/b$a;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1, v2}, Lf12/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :cond_8
    if-eqz v8, :cond_9

    if-eqz v4, :cond_9

    if-nez v6, :cond_a

    :cond_9
    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v16, v8

    goto :goto_7

    :cond_a
    new-instance v15, Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v16, v8

    invoke-direct/range {v15 .. v21}, Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v15

    :goto_5
    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v0, Lf12/c;->b:Ltr2/n;

    new-instance v10, Lf12/c$b;

    const/4 v4, 0x0

    invoke-direct {v10, v0, v1, v9, v4}, Lf12/c$b;-><init>(Lf12/c;Ljava/lang/String;Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;Lq83/d;)V

    iput-object v1, v11, Lf12/c$a;->w:Ljava/lang/Object;

    iput-object v2, v11, Lf12/c$a;->x:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->y:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->z:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->E:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->F:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->G:Ljava/lang/Object;

    iput-object v4, v11, Lf12/c$a;->H:Ljava/lang/Object;

    iput v7, v11, Lf12/c$a;->K:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v7, v3

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_b

    return-object v5

    :cond_b
    :goto_6
    check-cast v4, Lu02/a;

    instance-of v3, v4, Lu02/a$c;

    if-eqz v3, :cond_c

    sget-object v1, Lf12/b$b;->a:Lf12/b$b;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v2

    :cond_c
    instance-of v3, v4, Lu02/a$b;

    if-eqz v3, :cond_d

    new-instance v3, Lf12/b$a;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1, v2}, Lf12/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :goto_7
    iget-object v3, v0, Lf12/c;->b:Ltr2/n;

    if-eqz v16, :cond_e

    move v4, v7

    goto :goto_8

    :cond_e
    move v4, v10

    :goto_8
    if-eqz v17, :cond_f

    move v5, v7

    goto :goto_9

    :cond_f
    move v5, v10

    :goto_9
    if-eqz v18, :cond_10

    goto :goto_a

    :cond_10
    move v7, v10

    :goto_a
    const-string v6, "createConnection aborting: non-PKCE flow missing scope="

    const-string v8, " state="

    invoke-static {v6, v8, v9, v4, v5}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Lqr2/a$a;

    invoke-interface {v3, v4, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lf12/b$a;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1, v2}, Lf12/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lf12/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lf12/c$c;-><init>(Lq83/d;Lf12/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
