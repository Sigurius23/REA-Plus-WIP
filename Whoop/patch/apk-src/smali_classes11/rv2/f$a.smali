.class public final Lrv2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrv2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lrv2/f$a;",
        "",
        "<init>",
        "()V",
        "",
        "showPendingSessions",
        "",
        "Lrv2/f;",
        "a",
        "(Z)Ljava/util/List;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrv2/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lrv2/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    sget-object v1, Lrv2/f;->EXERCISE_PROGRESSION:Lrv2/f;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v1, Lrv2/f;->PERSONAL_WORKOUTS:Lrv2/f;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v1, Lrv2/f;->WHOOP_WORKOUTS:Lrv2/f;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_0

    sget-object p1, Lrv2/f;->PENDING_SESSIONS:Lrv2/f;

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1
.end method
