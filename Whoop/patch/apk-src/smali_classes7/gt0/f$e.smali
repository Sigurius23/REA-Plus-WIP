.class public final Lgt0/f$e;
.super Lgt0/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgt0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lgt0/f$e;",
        "Lgt0/f;",
        "<init>",
        "()V",
        "connectivity-core_release"
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
.field public static final b:Lgt0/f$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgt0/f$e;

    invoke-direct {v0}, Lgt0/f$e;-><init>()V

    sput-object v0, Lgt0/f$e;->b:Lgt0/f$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "Process Firmware Command failed"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lgt0/f;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
