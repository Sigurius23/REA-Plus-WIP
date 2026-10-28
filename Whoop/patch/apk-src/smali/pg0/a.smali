.class public final Lpg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpg0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Llg0/a$a;",
        "Log0/c;",
        "c",
        "(Llg0/a$a;)Log0/c;",
        "Llg0/c;",
        "Log0/c$a;",
        "dialog",
        "d",
        "(Llg0/c;Log0/c$a;)Log0/c;",
        "",
        "spacing",
        "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;",
        "domainResult",
        "b",
        "(Llg0/c;)Log0/c;",
        "Ljb1/a;",
        "advanced-labs-management_release"
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

    sput v0, Lpg0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpg0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lpg0/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lpg0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;->NORMAL:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    return-object p1
.end method

.method private final c(Llg0/a$a;)Log0/c;
    .locals 9

    instance-of v0, p1, Llg0/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Log0/c;

    new-instance v2, Log0/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Log0/c$c;-><init>(Lsz0/q0;Log0/a;Log0/a;Log0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Log0/c;-><init>(Log0/c$a;Log0/c$c;Log0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Llg0/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Log0/c;

    new-instance v2, Log0/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Log0/a$h;->a:Log0/a$h;

    sget-object v6, Log0/a$e;->a:Log0/a$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Log0/c$c;-><init>(Lsz0/q0;Log0/a;Log0/a;Log0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Log0/c;-><init>(Log0/c$a;Log0/c$c;Log0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Llg0/a$d;

    if-eqz p1, :cond_2

    new-instance v0, Log0/c;

    new-instance v1, Log0/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    sget-object v3, Log0/a$h;->a:Log0/a$h;

    sget-object v5, Log0/a$e;->a:Log0/a$e;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Log0/c$c;-><init>(Lsz0/q0;Log0/a;Log0/a;Log0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Log0/c;-><init>(Log0/c$a;Log0/c$c;Log0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Llg0/c;Log0/c$a;)Log0/c;
    .locals 8

    invoke-virtual {p1}, Llg0/c;->b()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;->getSections()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionModel;

    invoke-virtual {v2}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionModel;->getInsetBottom()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v3}, Lpg0/a;->a(Ljava/lang/String;)Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    sget-object v3, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    :cond_1
    new-instance v4, Log0/c$b;

    iget-object v5, p0, Lpg0/a;->a:Ljb1/a;

    invoke-virtual {v2}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v4, v2, v3}, Log0/c$b;-><init>(Ljava/util/List;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_3
    invoke-virtual {p1}, Llg0/c;->b()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_5
    new-instance v5, Log0/c$d;

    invoke-direct {v5, p1, v1}, Log0/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    new-instance v2, Log0/c;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Log0/c;-><init>(Log0/c$a;Log0/c$c;Log0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public final b(Llg0/c;)Log0/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llg0/c;->a()Llg0/a;

    move-result-object v0

    instance-of v0, v0, Llg0/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Llg0/c;->a()Llg0/a;

    move-result-object p1

    check-cast p1, Llg0/a$a;

    invoke-direct {p0, p1}, Lpg0/a;->c(Llg0/a$a;)Log0/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lpg0/a;->d(Llg0/c;Log0/c$a;)Log0/c;

    move-result-object p1

    return-object p1
.end method
