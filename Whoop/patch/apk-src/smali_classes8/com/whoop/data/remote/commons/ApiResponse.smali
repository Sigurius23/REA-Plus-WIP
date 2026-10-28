.class public abstract Lcom/whoop/data/remote/commons/ApiResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/commons/ApiResponse$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u0005*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "T",
        "",
        "<init>",
        "()V",
        "Companion",
        "Lcom/whoop/data/remote/commons/ApiEmptyResponse;",
        "Lcom/whoop/data/remote/commons/ApiErrorResponse;",
        "Lcom/whoop/data/remote/commons/ApiSuccessResponse;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/data/remote/commons/ApiResponse$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/commons/ApiResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/commons/ApiResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/commons/ApiResponse;->Companion:Lcom/whoop/data/remote/commons/ApiResponse$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/data/remote/commons/ApiResponse;-><init>()V

    return-void
.end method
