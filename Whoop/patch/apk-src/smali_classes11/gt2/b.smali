.class public abstract Lgt2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgt2/b$a;,
        Lgt2/b$b;,
        Lgt2/b$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0007\u0008\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lgt2/b;",
        "",
        "<init>",
        "()V",
        "Lct2/a;",
        "a",
        "()Lct2/a;",
        "b",
        "c",
        "Lgt2/b$b;",
        "Lgt2/b$c;",
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
    invoke-direct {p0}, Lgt2/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lct2/a;
    .locals 2

    instance-of v0, p0, Lgt2/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lct2/a$a;

    move-object v1, p0

    check-cast v1, Lgt2/b$b;

    invoke-virtual {v1}, Lgt2/b$b;->b()Ljava/time/LocalDate;

    move-result-object v1

    invoke-direct {v0, v1}, Lct2/a$a;-><init>(Ljava/time/LocalDate;)V

    return-object v0

    :cond_0
    sget-object v0, Lgt2/b$c;->a:Lgt2/b$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lct2/a$b;->a:Lct2/a$b;

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
