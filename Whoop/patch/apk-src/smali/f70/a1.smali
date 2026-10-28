.class public final Lf70/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lf70/a1;",
        "",
        "<init>",
        "()V",
        "Lf70/e$b;",
        "c",
        "()Lf70/e$b;",
        "Lf70/e;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lf70/a1;)Lf70/e$b;
    .locals 0

    invoke-direct {p0}, Lf70/a1;->c()Lf70/e$b;

    move-result-object p0

    return-object p0
.end method

.method private final c()Lf70/e$b;
    .locals 20

    sget-object v5, Lf70/b0;->LOADING:Lf70/b0;

    new-instance v2, Ln70/e;

    sget-object v10, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ENTER_YOUR_EMAIL:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v11, Ln70/d$a;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {v11, v10, v0, v1, v0}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    new-instance v0, Lf70/e$b;

    const v18, 0x1ffed

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v19}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
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

    new-instance v0, Lf70/a1$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf70/a1$a;-><init>(Lf70/a1;Lq83/d;)V

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, v0, p1}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
