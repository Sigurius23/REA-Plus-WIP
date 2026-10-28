.class public final Lza2/o$g;
.super Lza2/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lza2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lza2/o$g;",
        "Lza2/o;",
        "<init>",
        "()V",
        "settings_release"
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
.field public static final a:Lza2/o$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lza2/o$g;

    invoke-direct {v0}, Lza2/o$g;-><init>()V

    sput-object v0, Lza2/o$g;->a:Lza2/o$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lza2/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
