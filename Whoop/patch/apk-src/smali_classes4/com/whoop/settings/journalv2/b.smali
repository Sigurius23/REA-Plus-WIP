.class public final Lcom/whoop/settings/journalv2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/settings/journalv2/b;",
        "",
        "Lin2/d;",
        "dispatcher",
        "Lcom/whoop/data/repositories/JournalRepository;",
        "journalRepository",
        "Lcom/whoop/service/network/JournalApi;",
        "journalApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lin2/d;Lcom/whoop/data/repositories/JournalRepository;Lcom/whoop/service/network/JournalApi;Ltr2/n;)V",
        "Lcom/whoop/settings/journalv2/a;",
        "action",
        "Lcom/whoop/settings/journalv2/d;",
        "h",
        "(Lcom/whoop/settings/journalv2/a;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lin2/d;",
        "b",
        "Lcom/whoop/data/repositories/JournalRepository;",
        "c",
        "Lcom/whoop/service/network/JournalApi;",
        "d",
        "Ltr2/n;",
        "",
        "e",
        "Z",
        "isJournalEnabled",
        "f",
        "isDismissChecked",
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
.field private final a:Lin2/d;

.field private final b:Lcom/whoop/data/repositories/JournalRepository;

.field private final c:Lcom/whoop/service/network/JournalApi;

.field private final d:Ltr2/n;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lin2/d;Lcom/whoop/data/repositories/JournalRepository;Lcom/whoop/service/network/JournalApi;Ltr2/n;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/settings/journalv2/b;->a:Lin2/d;

    iput-object p2, p0, Lcom/whoop/settings/journalv2/b;->b:Lcom/whoop/data/repositories/JournalRepository;

    iput-object p3, p0, Lcom/whoop/settings/journalv2/b;->c:Lcom/whoop/service/network/JournalApi;

    iput-object p4, p0, Lcom/whoop/settings/journalv2/b;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/service/network/JournalApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/journalv2/b;->c:Lcom/whoop/service/network/JournalApi;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/data/repositories/JournalRepository;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/journalv2/b;->b:Lcom/whoop/data/repositories/JournalRepository;

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/settings/journalv2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/journalv2/b;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/settings/journalv2/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/settings/journalv2/b;->f:Z

    return p0
.end method

.method public static final synthetic e(Lcom/whoop/settings/journalv2/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/settings/journalv2/b;->e:Z

    return p0
.end method

.method public static final synthetic f(Lcom/whoop/settings/journalv2/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/settings/journalv2/b;->f:Z

    return-void
.end method

.method public static final synthetic g(Lcom/whoop/settings/journalv2/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/settings/journalv2/b;->e:Z

    return-void
.end method


# virtual methods
.method public final h(Lcom/whoop/settings/journalv2/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/journalv2/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/journalv2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b;->a:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/journalv2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/settings/journalv2/b$a;-><init>(Lcom/whoop/settings/journalv2/a;Lcom/whoop/settings/journalv2/b;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
