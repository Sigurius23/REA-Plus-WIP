.class public final Lla0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lla0/a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "",
        "startTimeMillis",
        "endTimeMillis",
        "location",
        "description",
        "",
        "flag",
        "",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "logger",
        "add-to-calendar-util_release"
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
.field public static final a:Lla0/a;

.field private static final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lla0/a;

    invoke-direct {v0}, Lla0/a;-><init>()V

    sput-object v0, Lla0/a;->a:Lla0/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CalendarUtils"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lla0/a;->b:Ltr2/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lla0/a;Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p8, v0

    :cond_1
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_2

    move-object p9, v0

    :cond_2
    invoke-virtual/range {p0 .. p9}, Lla0/a;->a(Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.INSERT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/provider/CalendarContract$Events;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "beginTime"

    invoke-virtual {v1, p2, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string p2, "endTime"

    invoke-virtual {v1, p2, p5, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    if-eqz p7, :cond_0

    const-string p2, "eventLocation"

    invoke-virtual {v1, p2, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    if-eqz p8, :cond_1

    const-string p2, "description"

    invoke-virtual {v1, p2, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    if-eqz p9, :cond_2

    invoke-virtual {p9}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_2
    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lla0/a;->b:Ltr2/n;

    const-string p3, "Successfully opened calendar app with event details"

    new-array p4, p2, [Lqr2/a$a;

    invoke-interface {p1, p3, p4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    sget-object p3, Lla0/a;->b:Ltr2/n;

    const-string p4, "Failed to open calendar app"

    new-array p5, p2, [Lqr2/a$a;

    invoke-interface {p3, p4, p1, p5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_2

    :goto_1
    sget-object p3, Lla0/a;->b:Ltr2/n;

    const-string p4, "No calendar app found on device"

    new-array p5, p2, [Lqr2/a$a;

    invoke-interface {p3, p4, p1, p5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_2
    return p2
.end method
