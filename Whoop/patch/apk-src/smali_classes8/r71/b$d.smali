.class public abstract synthetic Lr71/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr71/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->values()[Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->SNAP:Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->FREE:Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lr71/b$d;->a:[I

    return-void
.end method
