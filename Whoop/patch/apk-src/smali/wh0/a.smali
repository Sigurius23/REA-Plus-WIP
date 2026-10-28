.class public final Lwh0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lwh0/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
        "Lvh0/e;",
        "d",
        "(Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lvh0/e;",
        "Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
        "e",
        "(Lcom/whoop/aiinsights/domain/models/SecondaryButton;)Lvh0/e;",
        "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;",
        "response",
        "Lph0/b;",
        "screenArgs",
        "Lvh0/c$f;",
        "c",
        "(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lph0/b;)Lvh0/c$f;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "itemReducer",
        "ai-insights_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lwh0/a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwd3/b;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lwd3/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lwh0/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwh0/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lvh0/e;
    .locals 6

    new-instance v0, Lvh0/e;

    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/PrimaryButton;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/PrimaryButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lvh0/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final e(Lcom/whoop/aiinsights/domain/models/SecondaryButton;)Lvh0/e;
    .locals 3

    new-instance v0, Lvh0/e;

    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/SecondaryButton;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/SecondaryButton;->getIcon()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/SecondaryButton;->getAction()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lvh0/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lph0/b;)Lvh0/c$f;
    .locals 12

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getHeader()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v2, p0, Lwh0/a;->a:Ljb1/a;

    invoke-virtual {v2, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object v7, v0

    goto :goto_6

    :cond_5
    :goto_5
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_4

    :goto_6
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getContentActionButton()Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-direct {p0, v0}, Lwh0/a;->e(Lcom/whoop/aiinsights/domain/models/SecondaryButton;)Lvh0/e;

    move-result-object v0

    move-object v8, v0

    goto :goto_7

    :cond_6
    move-object v8, v1

    :goto_7
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getLeftButton()Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-direct {p0, v0}, Lwh0/a;->d(Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lvh0/e;

    move-result-object v0

    move-object v9, v0

    goto :goto_8

    :cond_7
    move-object v9, v1

    :goto_8
    invoke-virtual {p1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->getRightButton()Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-direct {p0, p1}, Lwh0/a;->d(Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lvh0/e;

    move-result-object v1

    :cond_8
    move-object v10, v1

    invoke-virtual {p2}, Lph0/b;->a()Ljava/lang/String;

    move-result-object v11

    new-instance v2, Lvh0/c$f;

    invoke-direct/range {v2 .. v11}, Lvh0/c$f;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lvh0/e;Lvh0/e;Lvh0/e;Ljava/lang/String;)V

    return-object v2
.end method
