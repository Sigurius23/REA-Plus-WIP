.class public abstract Lcom/whoop/whooplabs/feature/navigation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/feature/navigation/a$a;,
        Lcom/whoop/whooplabs/feature/navigation/a$b;,
        Lcom/whoop/whooplabs/feature/navigation/a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0003\u0007\u0008\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/a;",
        "",
        "<init>",
        "()V",
        "",
        "a",
        "()Ljava/lang/String;",
        "b",
        "c",
        "Lcom/whoop/whooplabs/feature/navigation/a$a;",
        "Lcom/whoop/whooplabs/feature/navigation/a$b;",
        "Lcom/whoop/whooplabs/feature/navigation/a$c;",
        "whooplabs_release"
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
    invoke-direct {p0}, Lcom/whoop/whooplabs/feature/navigation/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/a$b;->a:Lcom/whoop/whooplabs/feature/navigation/a$b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/a$c;->a:Lcom/whoop/whooplabs/feature/navigation/a$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$h;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$h;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v0, p0, Lcom/whoop/whooplabs/feature/navigation/a$a;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;

    move-object v1, p0

    check-cast v1, Lcom/whoop/whooplabs/feature/navigation/a$a;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/feature/navigation/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
