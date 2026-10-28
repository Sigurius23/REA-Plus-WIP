.class public final Lxb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lxb2/a;",
        "",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "languageRepository",
        "Lor2/r1;",
        "systemResources",
        "La6/g;",
        "Lf6/f;",
        "prefsDataStore",
        "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;",
        "languageRefresher",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/repositories/LanguageRepository;Lor2/r1;La6/g;Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Ltr2/n;)V",
        "Lb5/g;",
        "newLocales",
        "",
        "userInitiated",
        "Ll83/a0;",
        "e",
        "(Lb5/g;ZLq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "b",
        "Lor2/r1;",
        "c",
        "La6/g;",
        "d",
        "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;",
        "Ltr2/n;",
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
.field private final a:Lcom/whoop/data/repositories/LanguageRepository;

.field private final b:Lor2/r1;

.field private final c:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/LanguageRepository;Lor2/r1;La6/g;Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/LanguageRepository;",
            "Lor2/r1;",
            "La6/g;",
            "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "languageRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemResources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsDataStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageRefresher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxb2/a;->a:Lcom/whoop/data/repositories/LanguageRepository;

    .line 3
    iput-object p2, p0, Lxb2/a;->b:Lor2/r1;

    .line 4
    iput-object p3, p0, Lxb2/a;->c:La6/g;

    .line 5
    iput-object p4, p0, Lxb2/a;->d:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    .line 6
    iput-object p5, p0, Lxb2/a;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/LanguageRepository;Lor2/r1;La6/g;Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "LanguageUpdater"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lxb2/a;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lor2/r1;La6/g;Lcom/whoop/data/repositories/CachedDataLanguageRefresher;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lxb2/a;)Lcom/whoop/data/repositories/CachedDataLanguageRefresher;
    .locals 0

    iget-object p0, p0, Lxb2/a;->d:Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    return-object p0
.end method

.method public static final synthetic b(Lxb2/a;)Lcom/whoop/data/repositories/LanguageRepository;
    .locals 0

    iget-object p0, p0, Lxb2/a;->a:Lcom/whoop/data/repositories/LanguageRepository;

    return-object p0
.end method

.method public static final synthetic c(Lxb2/a;)La6/g;
    .locals 0

    iget-object p0, p0, Lxb2/a;->c:La6/g;

    return-object p0
.end method

.method public static final synthetic d(Lxb2/a;)Lor2/r1;
    .locals 0

    iget-object p0, p0, Lxb2/a;->b:Lor2/r1;

    return-object p0
.end method


# virtual methods
.method public final e(Lb5/g;ZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/g;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lxb2/a;->e:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Setting new language to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " userInitiated="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lbc3/y1;->w:Lbc3/y1;

    new-instance v1, Lxb2/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lxb2/a$a;-><init>(Lxb2/a;Lb5/g;ZLq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
