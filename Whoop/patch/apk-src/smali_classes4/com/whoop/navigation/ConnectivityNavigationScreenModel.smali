.class public final Lcom/whoop/navigation/ConnectivityNavigationScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/navigation/ConnectivityNavigationScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "<init>",
        "()V",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "navigation_release"
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
.field private static final synthetic $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/navigation/ConnectivityNavigationScreenModel;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    invoke-direct {v0}, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;-><init>()V

    sput-object v0, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->INSTANCE:Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lj00/u;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lj00/u;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v1, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->INSTANCE:Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "com.whoop.navigation.ConnectivityNavigationScreenModel"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final synthetic get$cachedSerializer()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->$cachedSerializer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    return-object v0
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->get$cachedSerializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method
