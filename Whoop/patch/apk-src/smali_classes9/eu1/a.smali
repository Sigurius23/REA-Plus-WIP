.class public final enum Leu1/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leu1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Leu1/a;",
        "",
        "",
        "action",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getAction",
        "()Ljava/lang/String;",
        "ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW",
        "ACTION_FORCE_UPLOAD_TRIGGERED",
        "ACTION_BACKGROUND_UPLOAD_TRIGGERED",
        "ACTION_FORCE_UPLOAD_COMPLETE",
        "ACTION_BACKGROUND_UPLOAD_COMPLETE",
        "ACTION_FORCE_UPLOAD_FAILURE",
        "ACTION_BACKGROUND_UPLOAD_FAILURE",
        "labrador-service_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Leu1/a;

.field public static final enum ACTION_BACKGROUND_UPLOAD_COMPLETE:Leu1/a;

.field public static final enum ACTION_BACKGROUND_UPLOAD_FAILURE:Leu1/a;

.field public static final enum ACTION_BACKGROUND_UPLOAD_TRIGGERED:Leu1/a;

.field public static final enum ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW:Leu1/a;

.field public static final enum ACTION_FORCE_UPLOAD_COMPLETE:Leu1/a;

.field public static final enum ACTION_FORCE_UPLOAD_FAILURE:Leu1/a;

.field public static final enum ACTION_FORCE_UPLOAD_TRIGGERED:Leu1/a;


# instance fields
.field private final action:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Leu1/a;
    .locals 7

    sget-object v0, Leu1/a;->ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW:Leu1/a;

    sget-object v1, Leu1/a;->ACTION_FORCE_UPLOAD_TRIGGERED:Leu1/a;

    sget-object v2, Leu1/a;->ACTION_BACKGROUND_UPLOAD_TRIGGERED:Leu1/a;

    sget-object v3, Leu1/a;->ACTION_FORCE_UPLOAD_COMPLETE:Leu1/a;

    sget-object v4, Leu1/a;->ACTION_BACKGROUND_UPLOAD_COMPLETE:Leu1/a;

    sget-object v5, Leu1/a;->ACTION_FORCE_UPLOAD_FAILURE:Leu1/a;

    sget-object v6, Leu1/a;->ACTION_BACKGROUND_UPLOAD_FAILURE:Leu1/a;

    filled-new-array/range {v0 .. v6}, [Leu1/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Leu1/a;

    const/4 v1, 0x0

    const-string v2, "Force sync & upload flow triggered"

    const-string v3, "ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x1

    const-string v2, "Force upload triggered"

    const-string v3, "ACTION_FORCE_UPLOAD_TRIGGERED"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_FORCE_UPLOAD_TRIGGERED:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x2

    const-string v2, "Background upload triggered"

    const-string v3, "ACTION_BACKGROUND_UPLOAD_TRIGGERED"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_BACKGROUND_UPLOAD_TRIGGERED:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x3

    const-string v2, "Force upload complete"

    const-string v3, "ACTION_FORCE_UPLOAD_COMPLETE"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_FORCE_UPLOAD_COMPLETE:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x4

    const-string v2, "Background upload complete"

    const-string v3, "ACTION_BACKGROUND_UPLOAD_COMPLETE"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_BACKGROUND_UPLOAD_COMPLETE:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x5

    const-string v2, "Force upload failed"

    const-string v3, "ACTION_FORCE_UPLOAD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_FORCE_UPLOAD_FAILURE:Leu1/a;

    new-instance v0, Leu1/a;

    const/4 v1, 0x6

    const-string v2, "Background Upload failed"

    const-string v3, "ACTION_BACKGROUND_UPLOAD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Leu1/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leu1/a;->ACTION_BACKGROUND_UPLOAD_FAILURE:Leu1/a;

    invoke-static {}, Leu1/a;->$values()[Leu1/a;

    move-result-object v0

    sput-object v0, Leu1/a;->$VALUES:[Leu1/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Leu1/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Leu1/a;->action:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Leu1/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leu1/a;
    .locals 1

    const-class v0, Leu1/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leu1/a;

    return-object p0
.end method

.method public static values()[Leu1/a;
    .locals 1

    sget-object v0, Leu1/a;->$VALUES:[Leu1/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leu1/a;

    return-object v0
.end method


# virtual methods
.method public final getAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leu1/a;->action:Ljava/lang/String;

    return-object v0
.end method
