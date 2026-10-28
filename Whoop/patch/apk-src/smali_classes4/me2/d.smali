.class public final Lme2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lme2/d;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;",
        "bffFeed",
        "Lme2/c$a;",
        "c",
        "(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)Lme2/c$a;",
        "Lec3/l;",
        "Lle2/b;",
        "domainStateFlow",
        "Lme2/c;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "shepherd_release"
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

.method public static final synthetic a(Lme2/d;Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)Lme2/c$a;
    .locals 0

    invoke-direct {p0, p1}, Lme2/d;->c(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)Lme2/c$a;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)Lme2/c$a;
    .locals 14

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lme2/e;

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getButton()Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getButton()Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;->getFocus()Z

    move-result v1

    invoke-direct {v6, v0, v1}, Lme2/e;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v7, Lkd1/o$c;

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;->getBackgroundImage()Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lme2/c$a;

    invoke-direct/range {v2 .. v7}, Lme2/c$a;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lme2/e;Lkd1/o;)V

    return-object v2
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lme2/d$a;

    invoke-direct {v0, p1, p0}, Lme2/d$a;-><init>(Lec3/l;Lme2/d;)V

    return-object v0
.end method
