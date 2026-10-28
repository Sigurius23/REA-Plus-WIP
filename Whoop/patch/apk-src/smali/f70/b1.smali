.class public final Lf70/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf70/b1;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Lf70/e$b;",
        "c",
        "()Lf70/e$b;",
        "Lf70/e;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
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


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/b1;->a:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "StartScreenJoinCtaHelper"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lf70/b1;-><init>(Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/b1;)Lf70/e$b;
    .locals 0

    invoke-direct {p0}, Lf70/b1;->c()Lf70/e$b;

    move-result-object p0

    return-object p0
.end method

.method private final c()Lf70/e$b;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lf70/b1;->a:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "User pressed \'I don\'t have a whoop device\' button. Navigating to in-app join flow."

    invoke-interface {v1, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v9, Lf70/b0;->LOADING:Lf70/b0;

    new-instance v1, Ln70/e;

    sget-object v5, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->IN_APP_JOIN_FLOW:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v6, Ln70/d$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v6, v5, v2, v3, v2}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    sget-object v18, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    new-instance v4, Lf70/e$b;

    const v22, 0x1dfed

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v6, v1

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lf70/b1$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf70/b1$a;-><init>(Lf70/b1;Lq83/d;)V

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, v0, p1}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
