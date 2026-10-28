.class public abstract Lps2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lps2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0001\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0001\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lps2/a;",
        "",
        "<init>",
        "()V",
        "Lns2/a$a;",
        "a",
        "()Lns2/a$a;",
        "Lps2/a$a;",
        "weekly-plan_release"
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
    invoke-direct {p0}, Lps2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lns2/a$a;
    .locals 2

    instance-of v0, p0, Lps2/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lns2/a$a;

    move-object v1, p0

    check-cast v1, Lps2/a$a;

    invoke-virtual {v1}, Lps2/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lns2/a$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
