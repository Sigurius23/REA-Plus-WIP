.class public final Lvl1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lil1/k;",
        "Lvl1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lvl1/b;",
        "Lod1/g;",
        "Lil1/k;",
        "Lvl1/a;",
        "Lcom/whoop/stealthmode/api/StealthModeApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/stealthmode/api/StealthModeApi;Ltr2/n;)V",
        "Lec3/l;",
        "Lvl1/c;",
        "f",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/stealthmode/api/StealthModeApi;",
        "b",
        "Ltr2/n;",
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
.field private final a:Lcom/whoop/stealthmode/api/StealthModeApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/stealthmode/api/StealthModeApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl1/b;->a:Lcom/whoop/stealthmode/api/StealthModeApi;

    iput-object p2, p0, Lvl1/b;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lvl1/b;)Lcom/whoop/stealthmode/api/StealthModeApi;
    .locals 0

    iget-object p0, p0, Lvl1/b;->a:Lcom/whoop/stealthmode/api/StealthModeApi;

    return-object p0
.end method

.method public static final synthetic d(Lvl1/b;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lvl1/b;->f()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvl1/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvl1/b;->b:Ltr2/n;

    return-object p0
.end method

.method private final f()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lvl1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvl1/b$a;-><init>(Lvl1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 8
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

    new-instance v0, Lvl1/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvl1/b$b;-><init>(Lq83/d;Lvl1/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lvl1/a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lvl1/a;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvl1/b$c;

    invoke-direct {v0, v1}, Lvl1/b$c;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
