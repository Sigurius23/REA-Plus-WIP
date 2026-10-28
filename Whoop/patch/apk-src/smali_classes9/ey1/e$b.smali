.class public final Ley1/e$b;
.super Ley1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ley1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ley1/e$b;",
        "Ley1/e;",
        "<init>",
        "()V",
        "metrics_release"
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
.field public static final x:Ley1/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ley1/e$b;

    invoke-direct {v0}, Ley1/e$b;-><init>()V

    sput-object v0, Ley1/e$b;->x:Ley1/e$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "failed_to_sync_timezone"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ley1/e;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
