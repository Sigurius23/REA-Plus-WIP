.class public final Lcom/whoop/ui/views/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/views/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/ui/views/b$a;",
        "",
        "<init>",
        "()V",
        "",
        "batteryPercentage",
        "Lcom/whoop/ui/views/b;",
        "a",
        "(I)Lcom/whoop/ui/views/b;",
        "b",
        "app_prodStandardRelease"
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
    invoke-direct {p0}, Lcom/whoop/ui/views/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/whoop/ui/views/b;
    .locals 2

    const/16 v0, 0x32

    if-lt p1, v0, :cond_0

    sget-object p1, Lcom/whoop/ui/views/b;->HIGH:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_0
    const/16 v1, 0x14

    if-gt v1, p1, :cond_1

    if-ge p1, v0, :cond_1

    sget-object p1, Lcom/whoop/ui/views/b;->MEDIUM:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_1
    if-ltz p1, :cond_2

    if-ge p1, v1, :cond_2

    sget-object p1, Lcom/whoop/ui/views/b;->LOW:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_2
    sget-object p1, Lcom/whoop/ui/views/b;->EMPTY:Lcom/whoop/ui/views/b;

    return-object p1
.end method

.method public final b(I)Lcom/whoop/ui/views/b;
    .locals 2

    const/16 v0, 0x5a

    if-lt p1, v0, :cond_0

    sget-object p1, Lcom/whoop/ui/views/b;->HIGH:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_0
    const/16 v1, 0x19

    if-gt v1, p1, :cond_1

    if-ge p1, v0, :cond_1

    sget-object p1, Lcom/whoop/ui/views/b;->MEDIUM:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_1
    if-ltz p1, :cond_2

    if-ge p1, v1, :cond_2

    sget-object p1, Lcom/whoop/ui/views/b;->LOW:Lcom/whoop/ui/views/b;

    return-object p1

    :cond_2
    sget-object p1, Lcom/whoop/ui/views/b;->EMPTY:Lcom/whoop/ui/views/b;

    return-object p1
.end method
