.class public final Lx82/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx82/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx82/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lx82/g;",
        "Lx82/f;",
        "Lx82/b;",
        "navDeepLinkBuilder",
        "<init>",
        "(Lx82/b;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/PendingIntent;",
        "a",
        "(Landroid/content/Context;)Landroid/app/PendingIntent;",
        "b",
        "f",
        "c",
        "d",
        "e",
        "Lx82/b;",
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
.field public static final b:Lx82/g$a;


# instance fields
.field private final a:Lx82/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx82/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx82/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lx82/g;->b:Lx82/g$a;

    return-void
.end method

.method public constructor <init>(Lx82/b;)V
    .locals 1

    const-string v0, "navDeepLinkBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx82/g;->a:Lx82/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx82/g;->b:Lx82/g$a;

    iget-object v1, p0, Lx82/g;->a:Lx82/b;

    invoke-static {v0, p1, v1}, Lx82/g$a;->b(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx82/g;->b:Lx82/g$a;

    iget-object v1, p0, Lx82/g;->a:Lx82/b;

    invoke-static {v0, p1, v1}, Lx82/g$a;->a(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx82/g;->b:Lx82/g$a;

    iget-object v1, p0, Lx82/g;->a:Lx82/b;

    invoke-static {v0, p1, v1}, Lx82/g$a;->b(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx82/g;->a:Lx82/b;

    const-string v1, "SleepLowBattery:Dismissed"

    invoke-virtual {v0, p1, v1}, Lx82/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx82/g;->b:Lx82/g$a;

    iget-object v1, p0, Lx82/g;->a:Lx82/b;

    invoke-static {v0, p1, v1}, Lx82/g$a;->b(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx82/g;->a:Lx82/b;

    const-string v1, "LowBattery:Dismissed"

    invoke-virtual {v0, p1, v1}, Lx82/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
