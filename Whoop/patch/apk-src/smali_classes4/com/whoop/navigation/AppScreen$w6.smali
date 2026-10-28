.class public final Lcom/whoop/navigation/AppScreen$w6;
.super Lcom/whoop/navigation/AppScreen;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/AppScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "w6"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/navigation/AppScreen$w6;",
        "Lcom/whoop/navigation/AppScreen;",
        "<init>",
        "()V",
        "",
        "x",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "",
        "y",
        "Ljava/util/Set;",
        "getOtherNames",
        "()Ljava/util/Set;",
        "otherNames",
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


# static fields
.field public static final w:Lcom/whoop/navigation/AppScreen$w6;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/navigation/AppScreen$w6;

    invoke-direct {v0}, Lcom/whoop/navigation/AppScreen$w6;-><init>()V

    sput-object v0, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    const-string v0, "YEARINREVIEW"

    sput-object v0, Lcom/whoop/navigation/AppScreen$w6;->x:Ljava/lang/String;

    const-string v0, "YEAR_IN_REVIEW"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/AppScreen$w6;->y:Ljava/util/Set;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/AppScreen$w6;->z:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/navigation/AppScreen;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AppScreen$w6;->x:Ljava/lang/String;

    return-object v0
.end method

.method public getOtherNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/navigation/AppScreen$w6;->y:Ljava/util/Set;

    return-object v0
.end method
