.class public final Ld62/i$b;
.super Ld62/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld62/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ld62/i$b;",
        "Ld62/i;",
        "<init>",
        "()V",
        "recovery-impacts-mini-arch_release"
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
.field public static final a:Ld62/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld62/i$b;

    invoke-direct {v0}, Ld62/i$b;-><init>()V

    sput-object v0, Ld62/i$b;->a:Ld62/i$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld62/i;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
