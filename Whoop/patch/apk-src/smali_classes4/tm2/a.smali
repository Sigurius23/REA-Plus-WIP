.class public final Ltm2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltm2/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lum2/a;",
        "Lum2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Ltm2/a;",
        "Lod1/g;",
        "Lum2/a;",
        "Lum2/b;",
        "<init>",
        "()V",
        "result",
        "Lum2/a$a;",
        "action",
        "d",
        "(Lum2/b;Lum2/a$a;)Lum2/b;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
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
.field public static final a:Ltm2/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltm2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltm2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltm2/a;->a:Ltm2/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic c(Ltm2/a;Lum2/b;Lum2/a$a;)Lum2/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltm2/a;->d(Lum2/b;Lum2/a$a;)Lum2/b;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lum2/b;Lum2/a$a;)Lum2/b;
    .locals 5

    invoke-virtual {p2}, Lum2/a$a;->a()Landroid/net/Uri;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const-string v1, "code"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "scope"

    invoke-virtual {p2, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "state"

    invoke-virtual {p2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    const-string v4, "/strava_integration"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    new-instance p2, Lxm2/d;

    new-instance v4, Lxm2/c;

    invoke-direct {v4, v1, v3, v2}, Lxm2/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p2, v4, v1, v2, v0}, Lxm2/d;-><init>(Lxm2/c;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p2}, Lum2/b;->a(Lxm2/d;)Lum2/b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Lum2/b;->a(Lxm2/d;)Lum2/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lum2/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lum2/b;-><init>(Lxm2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ltm2/a$b;

    invoke-direct {v1, p0, v2}, Ltm2/a$b;-><init>(Ltm2/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
