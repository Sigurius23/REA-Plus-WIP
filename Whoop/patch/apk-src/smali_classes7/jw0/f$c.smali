.class public final Ljw0/f$c;
.super Ljw0/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljw0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ljw0/f$c;",
        "Ljw0/f;",
        "<init>",
        "()V",
        "core-details_release"
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
.field public static final a:Ljw0/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljw0/f$c;

    invoke-direct {v0}, Ljw0/f$c;-><init>()V

    sput-object v0, Ljw0/f$c;->a:Ljw0/f$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljw0/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
