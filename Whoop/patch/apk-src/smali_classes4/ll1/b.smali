.class public final Lll1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lll1/b;",
        "",
        "Ltr2/n;",
        "logger",
        "Lll1/c;",
        "requiredPermissionsInteractor",
        "Lhj0/d;",
        "applicationLifecycle",
        "Lbc3/c0;",
        "applicationScope",
        "",
        "sdkVersion",
        "<init>",
        "(Ltr2/n;Lll1/c;Lhj0/d;Lbc3/c0;I)V",
        "a",
        "Ltr2/n;",
        "",
        "b",
        "Z",
        "isAndroid12orHigher",
        "Lec3/l;",
        "c",
        "Lec3/l;",
        "()Lec3/l;",
        "shouldRequestPermissionFlow",
        "home_release"
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
.field private final a:Ltr2/n;

.field private final b:Z

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lll1/c;Lhj0/d;Lbc3/c0;I)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredPermissionsInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationLifecycle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll1/b;->a:Ltr2/n;

    const/16 p1, 0x1f

    const/4 v0, 0x1

    if-lt p5, p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lll1/b;->b:Z

    invoke-virtual {p3}, Lhj0/d;->d()Lec3/f2;

    move-result-object p1

    new-instance p3, Lll1/b$c;

    invoke-direct {p3, p1, p0}, Lll1/b$c;-><init>(Lec3/l;Lll1/b;)V

    new-instance p1, Lll1/b$a;

    const/4 p5, 0x0

    invoke-direct {p1, p5}, Lll1/b$a;-><init>(Lq83/d;)V

    invoke-static {p3, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    invoke-static {p1, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    const-wide/16 p2, 0x1388

    const/4 v1, 0x2

    invoke-static {v1, p2, p3}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p2

    invoke-static {p1, p4, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    new-instance p2, Lll1/b$b;

    invoke-direct {p2, p5}, Lll1/b$b;-><init>(Lq83/d;)V

    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iput-object p3, p0, Lll1/b;->c:Lec3/l;

    return-void
.end method

.method public static final synthetic a(Lll1/b;)Z
    .locals 0

    iget-boolean p0, p0, Lll1/b;->b:Z

    return p0
.end method


# virtual methods
.method public final b()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lll1/b;->c:Lec3/l;

    return-object v0
.end method
