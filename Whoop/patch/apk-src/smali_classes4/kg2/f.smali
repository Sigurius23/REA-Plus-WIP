.class public abstract Lkg2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;",
        "",
        "e",
        "(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Ljava/lang/String;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "startActivityTargetsMiniArchDesignItemReducer",
        "start-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkg2/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkg2/e;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lkg2/f;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkg2/f;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkg2/f;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Lm91/u;
    .locals 0

    invoke-static {p0}, Lkg2/f;->h(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lkg2/f;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getActivityType()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    move-object v1, v3

    :cond_2
    if-eqz v1, :cond_3

    const-string v3, "activityType="

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getGpsEnabled()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "gpsEnabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getScoreType()Lcom/whoop/startactivity/goals/TargetsScoreType;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "scoreType="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    invoke-virtual {v3}, Ln83/c;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v0

    :cond_6
    const/4 p0, 0x0

    const-string v1, "?"

    invoke-static {v0, v1, p0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string v1, "&"

    :cond_7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/16 v8, 0x3c

    const-string v4, "&"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    :goto_1
    return-object v1
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkg2/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkg2/e;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkg2/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkg2/e;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lkg2/f$a;

    invoke-direct {v2, v0}, Lkg2/f$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Lm91/u;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkg2/f;->e(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance p0, Lm91/c0;

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getActivityType()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, ":"

    invoke-static {v2, v3, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getId()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getShowLoading()Z

    move-result p0

    new-instance v2, Lwg2/a;

    invoke-direct {v2, v1, v0, p0}, Lwg2/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2
.end method
