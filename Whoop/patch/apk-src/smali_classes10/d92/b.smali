.class public final Ld92/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Ld92/b;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "a",
        "()Landroid/os/Bundle;",
        "Leb/j0;",
        "builder",
        "Landroid/app/PendingIntent;",
        "b",
        "(Leb/j0;)Landroid/app/PendingIntent;",
        "",
        "I",
        "destinationId",
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
.field public static final a:Ld92/b;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld92/b;

    invoke-direct {v0}, Ld92/b;-><init>()V

    sput-object v0, Ld92/b;->a:Ld92/b;

    sget v0, Lhi0/e;->g5:I

    sput v0, Ld92/b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "request"

    invoke-static {}, Lyp0/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "selectedTab"

    const-string v2, "COMMUNITY"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(Leb/j0;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Ld92/b;->b:I

    invoke-static {p1, v0}, Leb/j0;->f(Leb/j0;I)V

    invoke-direct {p0}, Ld92/b;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
