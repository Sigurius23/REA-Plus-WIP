.class public final Lo92/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo92/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lo92/f$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/NotificationManager;",
        "manager",
        "Ll83/a0;",
        "b",
        "(Landroid/content/Context;Landroid/app/NotificationManager;)V",
        "",
        "CHANNEL_ID",
        "Ljava/lang/String;",
        "NOTIFICATION_TYPE",
        "CONVERSATION_SEED",
        "BODY",
        "TITLE",
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
    invoke-direct {p0}, Lo92/f$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lo92/f$a;Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo92/f$a;->b(Landroid/content/Context;Landroid/app/NotificationManager;)V

    return-void
.end method

.method private final b(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    invoke-static {}, Lo92/f;->z()Lc12/d;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    return-void
.end method
