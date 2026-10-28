.class public final Lgi2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lgi2/b;",
        "Lgi2/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\t\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lgi2/c;",
        "Lod1/g;",
        "Lgi2/b;",
        "Lgi2/d;",
        "Lgi2/e;",
        "stravaInteractor",
        "<init>",
        "(Lgi2/e;)V",
        "Lgi2/b$f;",
        "domainAction",
        "Lec3/l;",
        "j",
        "(Lgi2/b$f;)Lec3/l;",
        "Lgi2/b$e;",
        "i",
        "(Lgi2/b$e;)Lec3/l;",
        "Lgi2/b$h;",
        "m",
        "(Lgi2/b$h;)Lec3/l;",
        "Lgi2/b$g;",
        "l",
        "(Lgi2/b$g;)Lec3/l;",
        "Lgi2/b$d;",
        "Lgi2/d$b;",
        "h",
        "(Lgi2/b$d;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lgi2/e;",
        "k",
        "()Lgi2/e;",
        "strava_release"
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
.field private final a:Lgi2/e;


# direct methods
.method public constructor <init>(Lgi2/e;)V
    .locals 1

    const-string v0, "stravaInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi2/c;->a:Lgi2/e;

    return-void
.end method

.method public static final synthetic c(Lgi2/c;Lgi2/b$d;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/c;->h(Lgi2/b$d;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lgi2/c;Lgi2/b$e;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/c;->i(Lgi2/b$e;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lgi2/c;Lgi2/b$f;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/c;->j(Lgi2/b$f;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lgi2/c;Lgi2/b$g;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/c;->l(Lgi2/b$g;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lgi2/c;Lgi2/b$h;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lgi2/c;->m(Lgi2/b$h;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lgi2/b$d;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgi2/d$b;

    invoke-virtual {p1}, Lgi2/b$d;->a()Lhi2/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lgi2/d$b;-><init>(Lhi2/a;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method

.method private final i(Lgi2/b$e;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$e;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgi2/d$e;

    invoke-virtual {p1}, Lgi2/b$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lgi2/d$e;-><init>(Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method

.method private final j(Lgi2/b$f;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$f;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgi2/d$f;

    invoke-virtual {p1}, Lgi2/b$f;->a()Lhi2/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lgi2/d$f;-><init>(Lhi2/b;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method

.method private final l(Lgi2/b$g;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgi2/d$i;

    invoke-virtual {p1}, Lgi2/b$g;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lgi2/d$i;-><init>(Z)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method

.method private final m(Lgi2/b$h;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/b$h;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgi2/d$j;

    invoke-virtual {p1}, Lgi2/b$h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lgi2/b$h;->a()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lgi2/d$j;-><init>(Ljava/lang/String;Z)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

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

    new-instance v0, Lgi2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lgi2/c$a;-><init>(Lq83/d;Lgi2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lgi2/a;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lgi2/a;-><init>(Ljava/util/List;Lgi2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lgi2/c$g;

    invoke-direct {v2, v1}, Lgi2/c$g;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lgi2/c$b;

    invoke-direct {p1, v1}, Lgi2/c$b;-><init>(Lec3/l;)V

    return-object p1
.end method

.method public final k()Lgi2/e;
    .locals 1

    iget-object v0, p0, Lgi2/c;->a:Lgi2/e;

    return-object v0
.end method
