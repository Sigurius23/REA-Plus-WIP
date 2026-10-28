.class public abstract Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;",
        "",
        "<init>",
        "()V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Lzc3/c;Lyc3/g;)V",
        "Companion",
        "ConfirmMetricTarget",
        "ConfirmBehaviorTarget",
        "ConfirmActivityTarget",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lcom/whoop/design/models/modal/a;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;-><init>()V

    return-void
.end method

.method private static final _init_$_anonymous_()Lwc3/c;
    .locals 8

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v5, 0x3

    move-object v6, v3

    new-array v3, v5, [Lj93/d;

    const/4 v7, 0x0

    aput-object v6, v3, v7

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/4 v4, 0x2

    aput-object v1, v3, v4

    new-array v1, v5, [Lwc3/c;

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget$$serializer;

    aput-object v5, v1, v7

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget$$serializer;

    aput-object v5, v1, v6

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget$$serializer;

    aput-object v5, v1, v4

    new-array v5, v7, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static final synthetic write$Self(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Lzc3/c;Lyc3/g;)V
    .locals 0

    return-void
.end method
