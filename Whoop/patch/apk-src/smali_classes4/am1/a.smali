.class public final Lam1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lil1/t;",
        "Lam1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\rJ#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lam1/a;",
        "Lod1/g;",
        "Lil1/t;",
        "Lam1/b;",
        "Lu92/d;",
        "sharedPreferences",
        "<init>",
        "(Lu92/d;)V",
        "",
        "j",
        "()Z",
        "Ll83/a0;",
        "h",
        "()V",
        "i",
        "g",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu92/d;",
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
.field private final a:Lu92/d;


# direct methods
.method public constructor <init>(Lu92/d;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam1/a;->a:Lu92/d;

    return-void
.end method

.method public static final synthetic c(Lam1/a;)V
    .locals 0

    invoke-direct {p0}, Lam1/a;->g()V

    return-void
.end method

.method public static final synthetic d(Lam1/a;)V
    .locals 0

    invoke-direct {p0}, Lam1/a;->h()V

    return-void
.end method

.method public static final synthetic e(Lam1/a;)Z
    .locals 0

    invoke-direct {p0}, Lam1/a;->i()Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lam1/a;)Z
    .locals 0

    invoke-direct {p0}, Lam1/a;->j()Z

    move-result p0

    return p0
.end method

.method private final g()V
    .locals 3

    iget-object v0, p0, Lam1/a;->a:Lu92/d;

    const-string v1, "HasSeenFabOnboarding"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method private final h()V
    .locals 3

    iget-object v0, p0, Lam1/a;->a:Lu92/d;

    const-string v1, "HasSeenNewHomeOnboarding"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method private final i()Z
    .locals 3

    iget-object v0, p0, Lam1/a;->a:Lu92/d;

    const-string v1, "HasSeenFabOnboarding"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 3

    iget-object v0, p0, Lam1/a;->a:Lu92/d;

    const-string v1, "HasSeenNewHomeOnboarding"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
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

    new-instance v0, Lam1/b;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v1, v2, v3}, Lam1/b;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lam1/a$a;

    invoke-direct {v1, p0, v3}, Lam1/a$a;-><init>(Lam1/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
