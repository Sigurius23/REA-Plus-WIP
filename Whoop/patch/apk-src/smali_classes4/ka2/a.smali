.class public final Lka2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Loa2/c;",
        "Lja2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lka2/a;",
        "Lod1/g;",
        "Loa2/c;",
        "Lja2/a;",
        "Lla2/b;",
        "myAccountHeaderInteractor",
        "Lvc2/b;",
        "switchBillingPlanModalInteractor",
        "<init>",
        "(Lla2/b;Lvc2/b;)V",
        "Lec3/l;",
        "upstream",
        "Lla2/c;",
        "f",
        "(Lec3/l;)Lec3/l;",
        "Lvc2/c;",
        "h",
        "event",
        "Lla2/a;",
        "e",
        "(Loa2/c;)Lla2/a;",
        "Lvc2/a;",
        "g",
        "(Loa2/c;)Lvc2/a;",
        "interact",
        "a",
        "Lla2/b;",
        "b",
        "Lvc2/b;",
        "settings_release"
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
.field private final a:Lla2/b;

.field private final b:Lvc2/b;


# direct methods
.method public constructor <init>(Lla2/b;Lvc2/b;)V
    .locals 1

    const-string v0, "myAccountHeaderInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "switchBillingPlanModalInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka2/a;->a:Lla2/b;

    iput-object p2, p0, Lka2/a;->b:Lvc2/b;

    return-void
.end method

.method public static final synthetic c(Lka2/a;Loa2/c;)Lla2/a;
    .locals 0

    invoke-direct {p0, p1}, Lka2/a;->e(Loa2/c;)Lla2/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lka2/a;Loa2/c;)Lvc2/a;
    .locals 0

    invoke-direct {p0, p1}, Lka2/a;->g(Loa2/c;)Lvc2/a;

    move-result-object p0

    return-object p0
.end method

.method private final e(Loa2/c;)Lla2/a;
    .locals 0

    instance-of p1, p1, Loa2/c$a;

    if-eqz p1, :cond_0

    sget-object p1, Lla2/a$a;->a:Lla2/a$a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final f(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lka2/a$b;

    invoke-direct {v0, p1, p0}, Lka2/a$b;-><init>(Lec3/l;Lka2/a;)V

    iget-object p1, p0, Lka2/a;->a:Lla2/b;

    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final g(Loa2/c;)Lvc2/a;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final h(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lka2/a$c;

    invoke-direct {v0, p1, p0}, Lka2/a$c;-><init>(Lec3/l;Lka2/a;)V

    iget-object p1, p0, Lka2/a;->b:Lvc2/b;

    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    new-instance v0, Lka2/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lka2/a$d;-><init>(Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
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

    invoke-direct {p0, p1}, Lka2/a;->f(Lec3/l;)Lec3/l;

    move-result-object v0

    invoke-direct {p0, p1}, Lka2/a;->h(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lka2/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lka2/a$a;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v1, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object v2
.end method
