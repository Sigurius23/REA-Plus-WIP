.class public final Lql0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lql0/d;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lql0/c;",
        "a",
        "(Landroid/content/Context;)Lql0/c;",
        "bot_release"
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
.field public static final w:Lql0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lql0/d;

    invoke-direct {v0}, Lql0/d;-><init>()V

    sput-object v0, Lql0/d;->w:Lql0/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lql0/c;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lql0/a;

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v1

    iget-object v1, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v1, v1, Lwf3/a;->d:Lxf3/c;

    const-class v2, Lcom/whoop/data/repositories/LanguageChecker;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/LanguageChecker;

    invoke-direct {v0, p1, v1}, Lql0/a;-><init>(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageChecker;)V

    return-object v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
