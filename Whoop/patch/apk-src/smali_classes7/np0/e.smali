.class public final Lnp0/e;
.super Lnp0/n;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lnp0/e;",
        "Lnp0/n;",
        "<init>",
        "()V",
        "sleep-coach_release"
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
.field public static final b:Lnp0/e;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnp0/e;

    invoke-direct {v0}, Lnp0/e;-><init>()V

    sput-object v0, Lnp0/e;->b:Lnp0/e;

    const/16 v0, 0x8

    sput v0, Lnp0/e;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    sget-object v0, Lnp0/o;->TIME_PICKER:Lnp0/o;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnp0/n;-><init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
