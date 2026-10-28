.class public final Lje2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lje2/d;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
        "response",
        "Lje2/c;",
        "c",
        "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;",
        "Lec3/l;",
        "Lie2/b;",
        "domainStateFlow",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lje2/d;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lje2/d;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lje2/e;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lje2/d;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lje2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;
    .locals 0

    invoke-direct {p0, p1}, Lje2/d;->c(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;
    .locals 8

    if-eqz p1, :cond_0

    iget-object v0, p0, Lje2/d;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getCtaTile()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getShepherdDetectionToggle()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getEnabled()Z

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v5, Lje2/f;

    invoke-direct {v5, v1, v0, v2}, Lje2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getShepherdNotificationToggle()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getEnabled()Z

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v6, Lje2/f;

    invoke-direct {v6, v1, v0, v2}, Lje2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    new-instance v2, Lje2/c$b;

    sget-object v0, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;->getPageTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct/range {v2 .. v7}, Lje2/c$b;-><init>(ILcom/whoop/design/util/TextResource;Lje2/f;Lje2/f;Lm91/u;)V

    return-object v2

    :cond_0
    sget-object p1, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {p1}, Lje2/c$a$a;->b()Lje2/c$a;

    move-result-object p1

    return-object p1
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

    new-instance v0, Lje2/d$a;

    invoke-direct {v0, p1, p0}, Lje2/d$a;-><init>(Lec3/l;Lje2/d;)V

    return-object v0
.end method
