.class public final Lrh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrh1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lrh1/a;",
        "",
        "Lgi1/b;",
        "gpsPermissionHelper",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lgi1/b;Lfi0/a;)V",
        "",
        "a",
        "()Ljava/lang/String;",
        "Ll83/a0;",
        "b",
        "()V",
        "Lgi1/b;",
        "Lfi0/a;",
        "",
        "c",
        "Z",
        "hasSentThisSession",
        "d",
        "gps-tracking_release"
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
.field public static final d:Lrh1/a$a;

.field public static final e:I


# instance fields
.field private final a:Lgi1/b;

.field private final b:Lfi0/a;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrh1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrh1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrh1/a;->d:Lrh1/a$a;

    const/16 v0, 0x8

    sput v0, Lrh1/a;->e:I

    return-void
.end method

.method public constructor <init>(Lgi1/b;Lfi0/a;)V
    .locals 1

    const-string v0, "gpsPermissionHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrh1/a;->a:Lgi1/b;

    iput-object p2, p0, Lrh1/a;->b:Lfi0/a;

    return-void
.end method

.method private final a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lrh1/a;->a:Lgi1/b;

    invoke-virtual {v0}, Lgi1/b;->b()Z

    move-result v0

    iget-object v1, p0, Lrh1/a;->a:Lgi1/b;

    invoke-virtual {v1}, Lgi1/b;->a()Z

    move-result v1

    if-nez v0, :cond_0

    const-string v0, "none"

    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    const-string v0, "background"

    return-object v0

    :cond_1
    const-string v0, "foreground"

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-boolean v0, p0, Lrh1/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lrh1/a;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrh1/a;->b:Lfi0/a;

    const-string v2, "State"

    const-string v3, "Location Permission - State"

    const-string v4, "Location"

    invoke-interface {v1, v4, v2, v0, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrh1/a;->c:Z

    return-void
.end method
