.class public final Lmt1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmt1/a;",
        "",
        "Leb/a0;",
        "navController",
        "Lss1/a;",
        "analytics",
        "<init>",
        "(Leb/a0;Lss1/a;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Leb/a0;",
        "b",
        "Lss1/a;",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Leb/a0;

.field private final b:Lss1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lss1/a;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt1/a;->a:Leb/a0;

    iput-object p2, p0, Lmt1/a;->b:Lss1/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lmt1/a;->b:Lss1/a;

    invoke-virtual {v0}, Lss1/a;->h()V

    const-string v0, "android-app://com.whoop/labradorDeviceLocationFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lmt1/a;->a:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    iget-object v1, p0, Lmt1/a;->a:Leb/a0;

    invoke-virtual {v1, v0}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void
.end method
