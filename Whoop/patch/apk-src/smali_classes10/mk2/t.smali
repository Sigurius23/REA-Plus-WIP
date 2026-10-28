.class public final Lmk2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lmk2/t;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/e;",
        "b",
        "()Lcom/whoop/navigation/e;",
        "Lj02/s;",
        "a",
        "()Lj02/s;",
        "track-activity_release"
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
.field public static final a:Lmk2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmk2/t;

    invoke-direct {v0}, Lmk2/t;-><init>()V

    sput-object v0, Lmk2/t;->a:Lmk2/t;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lj02/s;
    .locals 6

    new-instance v0, Lj02/s;

    sget-object v1, Lj02/v;->POP_CURRENT:Lj02/v;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/s;-><init>(Lj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/e;
    .locals 6

    new-instance v0, Lcom/whoop/navigation/e;

    sget-object v1, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v2, Lcom/whoop/navigation/HomeScreenModel;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v3, v4, v3}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
