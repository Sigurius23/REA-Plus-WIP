.class public final Lx82/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx82/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lx82/g$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lx82/b;",
        "navDeepLinkBuilder",
        "Landroid/app/PendingIntent;",
        "d",
        "(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;",
        "c",
        "",
        "ACTION_ACKNOWLEDGED",
        "Ljava/lang/String;",
        "ACTION_DISMISSED",
        "ACTION_SLEEP_ACKNOWLEDGED",
        "ACTION_SLEEP_DISMISSED",
        "DISMISS_ACTION_TYPE",
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
    invoke-direct {p0}, Lx82/g$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;
    .locals 0

    invoke-direct {p0, p1, p2}, Lx82/g$a;->c(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lx82/g$a;Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;
    .locals 0

    invoke-direct {p0, p1, p2}, Lx82/g$a;->d(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method private final c(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;
    .locals 0

    invoke-virtual {p2, p1}, Lx82/b;->a(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget p2, Lhi0/g;->a:I

    invoke-virtual {p1, p2}, Leb/j0;->g(I)V

    sget p2, Lhi0/e;->n3:I

    invoke-static {p1, p2}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private final d(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;
    .locals 0

    invoke-virtual {p2, p1}, Lx82/b;->a(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget p2, Lhi0/g;->a:I

    invoke-virtual {p1, p2}, Leb/j0;->g(I)V

    sget p2, Lhi0/e;->D2:I

    invoke-static {p1, p2}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
