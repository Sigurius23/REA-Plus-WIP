.class public final Lww2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR(\u0010\u0015\u001a\u00020\r8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u0014\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lww2/a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "phoneNumber",
        "",
        "flag",
        "",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "getLogger$whoop_action_release",
        "()Ltr2/n;",
        "setLogger$whoop_action_release",
        "(Ltr2/n;)V",
        "getLogger$whoop_action_release$annotations",
        "logger",
        "whoop-action_release"
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
.field public static final a:Lww2/a;

.field private static b:Ltr2/n;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lww2/a;

    invoke-direct {v0}, Lww2/a;-><init>()V

    sput-object v0, Lww2/a;->a:Lww2/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "PhoneUtils"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lww2/a;->b:Ltr2/n;

    const/16 v0, 0x8

    sput v0, Lww2/a;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object p1, Lww2/a;->b:Ltr2/n;

    const-string p2, "Cannot dial a blank phone number"

    new-array p3, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v2, "tel"

    const/4 v3, 0x0

    invoke-static {v2, p2, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    const-string v2, "android.intent.action.DIAL"

    invoke-direct {v0, v2, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_1
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lww2/a;->b:Ltr2/n;

    const-string p2, "Successfully opened dialer with phone number"

    new-array p3, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    sget-object p2, Lww2/a;->b:Ltr2/n;

    const-string p3, "Failed to dial phone number"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_1
    sget-object p2, Lww2/a;->b:Ltr2/n;

    const-string p3, "Not allowed to open dialer app"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_2
    sget-object p2, Lww2/a;->b:Ltr2/n;

    const-string p3, "No dialer app found on device"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_3
    return v1
.end method
