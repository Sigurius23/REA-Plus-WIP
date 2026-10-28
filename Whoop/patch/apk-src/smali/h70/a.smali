.class public final Lh70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J&\u0010\u0016\u001a\u00020\u000c2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lh70/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Lf70/x;",
        "emailFirstHelper",
        "Lf70/f0;",
        "iajfEmailCheckHelper",
        "Lf70/h0;",
        "iajfEnterEmailHandler",
        "<init>",
        "(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;)V",
        "Lf70/e;",
        "prevDomainResult",
        "",
        "type",
        "e",
        "(Lf70/e;Ljava/lang/String;)Lf70/e;",
        "d",
        "(Lf70/e;)Lf70/e;",
        "Lec3/m;",
        "collector",
        "c",
        "(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Ltr2/n;",
        "b",
        "Lf70/x;",
        "Lf70/f0;",
        "Lf70/h0;",
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


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lf70/x;

.field private final c:Lf70/f0;

.field private final d:Lf70/h0;


# direct methods
.method public constructor <init>(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailFirstHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iajfEmailCheckHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iajfEnterEmailHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh70/a;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lh70/a;->b:Lf70/x;

    .line 4
    iput-object p3, p0, Lh70/a;->c:Lf70/f0;

    .line 5
    iput-object p4, p0, Lh70/a;->d:Lf70/h0;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ActivationDialogHandler"

    invoke-virtual {p1, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lh70/a;-><init>(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;)V

    return-void
.end method

.method public static final synthetic a(Lh70/a;)Lf70/x;
    .locals 0

    iget-object p0, p0, Lh70/a;->b:Lf70/x;

    return-object p0
.end method

.method public static final synthetic b(Lh70/a;)Lf70/h0;
    .locals 0

    iget-object p0, p0, Lh70/a;->d:Lf70/h0;

    return-object p0
.end method


# virtual methods
.method public final c(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lf70/e;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lh70/a$a;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lh70/a$a;

    iget v5, v4, Lh70/a$a;->E:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lh70/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v4, Lh70/a$a;

    invoke-direct {v4, v0, v3}, Lh70/a$a;-><init>(Lh70/a;Lq83/d;)V

    :goto_0
    iget-object v3, v4, Lh70/a$a;->y:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lh70/a$a;->E:I

    const-wide/16 v7, 0x3e8

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v6, :cond_5

    if-eq v6, v12, :cond_4

    if-eq v6, v11, :cond_3

    if-eq v6, v10, :cond_2

    if-ne v6, v9, :cond_1

    iget-object v1, v4, Lh70/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    iget-object v1, v4, Lh70/a$a;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lh70/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    iget-object v2, v4, Lh70/a$a;->w:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v1, v4, Lh70/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    iget-object v1, v4, Lh70/a$a;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v1, v4, Lh70/a$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    iget-object v2, v4, Lh70/a$a;->w:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v34, v2

    move-object v2, v1

    move-object/from16 v1, v34

    goto :goto_1

    :cond_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Lf70/e$b;

    if-eqz v3, :cond_8

    move-object v14, v2

    check-cast v14, Lf70/e$b;

    invoke-virtual {v14}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v6

    invoke-static {v6}, Lc80/a;->a(Lcom/whoop/activation/iajf/domain/SignUpSource;)Z

    move-result v6

    if-eqz v6, :cond_8

    const v32, 0x1ff7f

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

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

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v3

    iput-object v1, v4, Lh70/a$a;->w:Ljava/lang/Object;

    iput-object v2, v4, Lh70/a$a;->x:Ljava/lang/Object;

    iput v12, v4, Lh70/a$a;->E:I

    invoke-interface {v1, v3, v4}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    new-instance v3, Lh70/a$c;

    invoke-direct {v3, v0, v1, v2, v13}, Lh70/a$c;-><init>(Lh70/a;Lec3/m;Lf70/e;Lq83/d;)V

    iput-object v13, v4, Lh70/a$a;->w:Ljava/lang/Object;

    iput-object v13, v4, Lh70/a$a;->x:Ljava/lang/Object;

    iput v11, v4, Lh70/a$a;->E:I

    invoke-static {v7, v8, v3, v4}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast v3, Lf70/f;

    invoke-virtual {v3}, Lf70/f;->e()Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_8
    if-eqz v3, :cond_9

    move-object v14, v2

    check-cast v14, Lf70/e$b;

    sget-object v19, Lf70/b0;->LOADING:Lf70/b0;

    const v32, 0x1ffef

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

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

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v3

    iput-object v13, v4, Lh70/a$a;->w:Ljava/lang/Object;

    iput-object v2, v4, Lh70/a$a;->x:Ljava/lang/Object;

    iput v10, v4, Lh70/a$a;->E:I

    invoke-interface {v1, v3, v4}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_9

    goto :goto_4

    :cond_9
    move-object v1, v2

    :goto_3
    new-instance v2, Lh70/a$b;

    invoke-direct {v2, v0, v1, v13}, Lh70/a$b;-><init>(Lh70/a;Lf70/e;Lq83/d;)V

    iput-object v13, v4, Lh70/a$a;->w:Ljava/lang/Object;

    iput-object v13, v4, Lh70/a$a;->x:Ljava/lang/Object;

    iput v9, v4, Lh70/a$a;->E:I

    invoke-static {v7, v8, v2, v4}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_a

    :goto_4
    return-object v5

    :cond_a
    return-object v1
.end method

.method public final d(Lf70/e;)Lf70/e;
    .locals 1

    const-string v0, "prevDomainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lf70/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf70/e$b;

    invoke-virtual {v0}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v0

    invoke-static {v0}, Lc80/a;->a(Lcom/whoop/activation/iajf/domain/SignUpSource;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh70/a;->c:Lf70/f0;

    invoke-virtual {v0, p1}, Lf70/f0;->c(Lf70/e;)Lf70/e;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lh70/a;->b:Lf70/x;

    invoke-virtual {v0, p1}, Lf70/x;->d(Lf70/e;)Lf70/e;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lf70/e;Ljava/lang/String;)Lf70/e;
    .locals 23

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "prevDomainResult"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    iget-object v3, v2, Lh70/a;->a:Ltr2/n;

    const-string v4, "User dismissed login error dialog of type "

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v3, v1, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of v1, v0, Lf70/e$b;

    if-eqz v1, :cond_0

    move-object v3, v0

    check-cast v3, Lf70/e$b;

    const v21, 0x1fbbf

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v22}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lf70/e$a;->a:Lf70/e$a;

    return-object v0
.end method
