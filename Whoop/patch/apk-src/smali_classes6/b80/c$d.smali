.class final Lb80/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb80/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.iajf.analytics.IAJFAnalyticsHelper$sendEvent$1"
    f = "IAJFAnalyticsHelper.kt"
    l = {
        0x128
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Lcom/whoop/activation/iajf/domain/SignUpSource;

.field final synthetic I:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lb80/c;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/Map;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb80/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lq83/d<",
            "-",
            "Lb80/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb80/c$d;->x:Lb80/c;

    iput-object p2, p0, Lb80/c$d;->y:Ljava/lang/String;

    iput-object p3, p0, Lb80/c$d;->z:Ljava/lang/String;

    iput-object p4, p0, Lb80/c$d;->E:Ljava/lang/String;

    iput-object p5, p0, Lb80/c$d;->F:Ljava/lang/String;

    iput-object p6, p0, Lb80/c$d;->G:Ljava/lang/String;

    iput-object p7, p0, Lb80/c$d;->H:Lcom/whoop/activation/iajf/domain/SignUpSource;

    iput-object p8, p0, Lb80/c$d;->I:Ljava/util/Map;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lb80/c$d;

    iget-object v1, p0, Lb80/c$d;->x:Lb80/c;

    iget-object v2, p0, Lb80/c$d;->y:Ljava/lang/String;

    iget-object v3, p0, Lb80/c$d;->z:Ljava/lang/String;

    iget-object v4, p0, Lb80/c$d;->E:Ljava/lang/String;

    iget-object v5, p0, Lb80/c$d;->F:Ljava/lang/String;

    iget-object v6, p0, Lb80/c$d;->G:Ljava/lang/String;

    iget-object v7, p0, Lb80/c$d;->H:Lcom/whoop/activation/iajf/domain/SignUpSource;

    iget-object v8, p0, Lb80/c$d;->I:Ljava/util/Map;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lb80/c$d;-><init>(Lb80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/Map;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lb80/c$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb80/c$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb80/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb80/c$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb80/c$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lb80/c$d;->x:Lb80/c;

    invoke-static {p1}, Lb80/c;->c(Lb80/c;)Lhf1/b;

    move-result-object p1

    iput v2, p0, Lb80/c$d;->w:I

    invoke-interface {p1, p0}, Lhf1/b;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lb80/c$d;->x:Lb80/c;

    invoke-static {v0}, Lb80/c;->b(Lb80/c;)Lfi0/a;

    move-result-object v1

    iget-object v2, p0, Lb80/c$d;->y:Ljava/lang/String;

    iget-object v3, p0, Lb80/c$d;->z:Ljava/lang/String;

    iget-object v4, p0, Lb80/c$d;->E:Ljava/lang/String;

    iget-object v6, p0, Lb80/c$d;->F:Ljava/lang/String;

    iget-object v0, p0, Lb80/c$d;->x:Lb80/c;

    iget-object v5, p0, Lb80/c$d;->G:Ljava/lang/String;

    iget-object v7, p0, Lb80/c$d;->H:Lcom/whoop/activation/iajf/domain/SignUpSource;

    invoke-static {v0, v5, v7}, Lb80/c;->a(Lb80/c;Ljava/lang/String;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object v0, p0, Lb80/c$d;->I:Ljava/util/Map;

    invoke-static {p1, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v7

    const-string v5, "In App Join Flow"

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
