.class public final Lul1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lul1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000c\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lul1/d;",
        "",
        "Lcom/whoop/data/repositories/LanguageChecker;",
        "languageRepository",
        "<init>",
        "(Lcom/whoop/data/repositories/LanguageChecker;)V",
        "a",
        "Lcom/whoop/data/repositories/LanguageChecker;",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "()Lcom/whoop/design/util/TextResource;",
        "shortDisplayLanguage",
        "fullDisplayLanguage",
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


# static fields
.field public static final b:Lul1/d$a;

.field public static final c:I

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;


# instance fields
.field private final a:Lcom/whoop/data/repositories/LanguageChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lul1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lul1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lul1/d;->b:Lul1/d$a;

    const/16 v0, 0x8

    sput v0, Lul1/d;->c:I

    sget-object v0, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lul1/d;->d:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lul1/d;->e:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->ITALIAN:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lul1/d;->f:Ljava/lang/String;

    new-instance v0, Ljava/util/Locale;

    const-string v1, "pt"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lul1/d;->g:Ljava/lang/String;

    new-instance v0, Ljava/util/Locale;

    const-string v1, "es"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lul1/d;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/LanguageChecker;)V
    .locals 1

    const-string v0, "languageRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lul1/d;->a:Lcom/whoop/data/repositories/LanguageChecker;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 2

    iget-object v0, p0, Lul1/d;->a:Lcom/whoop/data/repositories/LanguageChecker;

    invoke-interface {v0}, Lcom/whoop/data/repositories/LanguageChecker;->getAllowedLanguage()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lul1/d;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v0, Lfl1/b;->r:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, Lul1/d;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lfl1/b;->v:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lul1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 2

    iget-object v0, p0, Lul1/d;->a:Lcom/whoop/data/repositories/LanguageChecker;

    invoke-interface {v0}, Lcom/whoop/data/repositories/LanguageChecker;->getAllowedLanguage()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lul1/d;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v0, Lfl1/b;->k:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, Lul1/d;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v0, Lfl1/b;->l:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v1, Lul1/d;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget v0, Lfl1/b;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v1, Lul1/d;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget v0, Lfl1/b;->w:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v1, Lul1/d;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lfl1/b;->E:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_4
    sget v0, Lfl1/b;->g:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method
