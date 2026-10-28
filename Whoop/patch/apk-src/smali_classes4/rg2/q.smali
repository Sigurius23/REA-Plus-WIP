.class public abstract Lrg2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "preSessionWidgetDesignItemReducer",
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

    new-instance v0, Lqc1/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lrg2/q;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/q;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/q;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;)Lng2/c;
    .locals 0

    invoke-static {p0}, Lrg2/q;->g(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;)Lng2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lrg2/q;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc1/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc1/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lrg2/q$a;

    invoke-direct {v2, v0}, Lrg2/q$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;)Lng2/c;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lng2/c;

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getSelectedInternalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getGpsTrackingEnabled()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v6

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lng2/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
