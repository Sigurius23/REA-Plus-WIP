.class public final Li80/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li80/c$a;,
        Li80/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Li80/c;",
        "",
        "<init>",
        "()V",
        "Ln70/d;",
        "action",
        "Ll80/o;",
        "c",
        "(Ln70/d;)Ll80/o;",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "destination",
        "",
        "",
        "arguments",
        "b",
        "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)Ll80/o;",
        "Lec3/l;",
        "Le70/a;",
        "upstream",
        "d",
        "(Lec3/l;)Lec3/l;",
        "a",
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
.field public static final a:Li80/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li80/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li80/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li80/c;->a:Li80/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Li80/c;Ln70/d;)Ll80/o;
    .locals 0

    invoke-direct {p0, p1}, Li80/c;->c(Ln70/d;)Ll80/o;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)Ll80/o;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ll80/o;"
        }
    .end annotation

    sget-object v0, Li80/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ll80/o$g;

    invoke-direct {v0, p1, p2}, Ll80/o$g;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)V

    return-object v0

    :cond_0
    const-string p1, "strapSerial"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "strapSignature"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ll80/o$a;

    new-instance v1, Lcom/whoop/navigation/e;

    sget-object v2, Lcom/whoop/navigation/AppScreen$x3;->w:Lcom/whoop/navigation/AppScreen$x3;

    new-instance v3, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;

    const-string v4, "PAIRING_FIRST_FLOW"

    invoke-direct {v3, p1, p2, v4}, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_1
    sget-object p1, Ll80/o$i;->a:Ll80/o$i;

    return-object p1

    :cond_2
    new-instance p1, Ll80/o$a;

    new-instance v0, Lcom/whoop/navigation/e;

    sget-object v1, Lcom/whoop/navigation/AppScreen$j4;->w:Lcom/whoop/navigation/AppScreen$j4;

    new-instance v2, Lcom/whoop/navigation/OrderConfirmationScreenModel;

    const-string p2, "LogIn"

    invoke-direct {v2, p2}, Lcom/whoop/navigation/OrderConfirmationScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_3
    new-instance p1, Ll80/o$a;

    new-instance v3, Lcom/whoop/navigation/e;

    sget-object v4, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v5, Lcom/whoop/navigation/HomeScreenModel;

    const/4 p2, 0x0

    invoke-direct {v5, p2, p2, v2, p2}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1
.end method

.method private final c(Ln70/d;)Ll80/o;
    .locals 2

    instance-of v0, p1, Ln70/d$c;

    if-eqz v0, :cond_0

    new-instance p1, Ll80/o$b;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, v1}, Ll80/o$b;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Ln70/d$a;

    if-eqz v0, :cond_1

    check-cast p1, Ln70/d$a;

    invoke-virtual {p1}, Ln70/d$a;->b()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v0

    invoke-virtual {p1}, Ln70/d$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Li80/c;->b(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)Ll80/o;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Ln70/d$b;

    if-eqz v0, :cond_2

    new-instance v0, Ll80/o$a;

    check-cast p1, Ln70/d$b;

    invoke-virtual {p1}, Ln70/d$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final d(Lec3/l;)Lec3/l;
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

    new-instance v0, Li80/c$c;

    invoke-direct {v0, p1}, Li80/c$c;-><init>(Lec3/l;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lch/i;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Li80/c$d;

    invoke-direct {p1, v0, p0}, Li80/c$d;-><init>(Lec3/l;Li80/c;)V

    return-object p1
.end method
