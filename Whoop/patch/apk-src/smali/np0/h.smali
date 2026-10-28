.class public final Lnp0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnp0/h$a;,
        Lnp0/h$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lnp0/h;",
        "",
        "<init>",
        "()V",
        "",
        "sleepCoachResponse",
        "Lnp0/k;",
        "onboardingState",
        "Lnp0/g;",
        "a",
        "(Ljava/lang/String;Lnp0/k;)Lnp0/g;",
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
.field public static final a:Lnp0/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnp0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnp0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnp0/h;->a:Lnp0/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lnp0/k;)Lnp0/g;
    .locals 1

    const-string v0, "onboardingState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnp0/h$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    const-string p2, "TO_DO"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lnp0/g;

    sget-object p2, Lnp0/f;->INCOMPLETE:Lnp0/f;

    invoke-direct {p1, p2}, Lnp0/g;-><init>(Lnp0/f;)V

    return-object p1

    :cond_0
    new-instance p1, Lnp0/g;

    sget-object p2, Lnp0/f;->COMPLETE:Lnp0/f;

    invoke-direct {p1, p2}, Lnp0/g;-><init>(Lnp0/f;)V

    return-object p1

    :cond_1
    new-instance p1, Lnp0/g;

    sget-object p2, Lnp0/f;->COMPLETE:Lnp0/f;

    invoke-direct {p1, p2}, Lnp0/g;-><init>(Lnp0/f;)V

    return-object p1
.end method
