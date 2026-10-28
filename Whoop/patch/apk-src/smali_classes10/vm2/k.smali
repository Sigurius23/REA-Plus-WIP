.class public final Lvm2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lvm2/k;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/AppScreen;",
        "screen",
        "",
        "a",
        "(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;",
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


# static fields
.field public static final a:Lvm2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvm2/k;

    invoke-direct {v0}, Lvm2/k;-><init>()V

    sput-object v0, Lvm2/k;->a:Lvm2/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "home"

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "health"

    return-object p1

    :cond_1
    sget-object v0, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "community"

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "menu"

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
