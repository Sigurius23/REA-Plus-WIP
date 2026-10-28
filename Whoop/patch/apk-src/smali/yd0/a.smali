.class public final Lyd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lyd0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lvd0/b$b;",
        "Lxd0/e$c;",
        "d",
        "(Lvd0/b$b;)Lxd0/e$c;",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
        "Lxd0/b;",
        "c",
        "(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;)Lxd0/b;",
        "Lec3/l;",
        "Lvd0/b;",
        "upstream",
        "Lxd0/e;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "advanced-labs_release"
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

    sput v0, Lyd0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyd0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lyd0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lyd0/a;Lvd0/b$b;)Lxd0/e$c;
    .locals 0

    invoke-direct {p0, p1}, Lyd0/a;->d(Lvd0/b$b;)Lxd0/e$c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;)Lxd0/b;
    .locals 2

    new-instance v0, Lxd0/b;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lxd0/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final d(Lvd0/b$b;)Lxd0/e$c;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getHeader()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    move-result-object v1

    invoke-direct {v0, v1}, Lyd0/a;->c(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;)Lxd0/b;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    iget-object v4, v0, Lyd0/a;->a:Ljb1/a;

    invoke-virtual {v4, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getHeader()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lxd0/a;

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getFooter()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;->getButtonTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getFooter()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-direct {v6, v1, v2}, Lxd0/a;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    invoke-virtual/range {p1 .. p1}, Lvd0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->getLabel()Ljava/lang/String;

    move-result-object v7

    new-instance v2, Lxd0/e$c;

    invoke-direct/range {v2 .. v8}, Lxd0/e$c;-><init>(Ljava/lang/String;Lkd1/o;Lxd0/b;Lxd0/a;Ljava/lang/String;Ljava/util/List;)V

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

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyd0/a$a;

    invoke-direct {v0, p1, p0}, Lyd0/a$a;-><init>(Lec3/l;Lyd0/a;)V

    return-object v0
.end method
