.class public final Lcom/whoop/navigation/AppScreen$q6;
.super Lcom/whoop/navigation/AppScreen;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/AppScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q6"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/navigation/AppScreen$q6;",
        "Lcom/whoop/navigation/AppScreen;",
        "<init>",
        "()V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "name",
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
.field public static final w:Lcom/whoop/navigation/AppScreen$q6;

.field public static final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/navigation/AppScreen$q6;

    invoke-direct {v0}, Lcom/whoop/navigation/AppScreen$q6;-><init>()V

    sput-object v0, Lcom/whoop/navigation/AppScreen$q6;->w:Lcom/whoop/navigation/AppScreen$q6;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/AppScreen$q6;->x:I

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

    const-string v0, "WHAT_TO_EXPECT"

    return-object v0
.end method
