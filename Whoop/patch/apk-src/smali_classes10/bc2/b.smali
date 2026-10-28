.class public final Lbc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbc2/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lbc2/a;",
        "Lbc2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0001\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lbc2/b;",
        "Lod1/g;",
        "Lbc2/a;",
        "Lbc2/c;",
        "Lcom/whoop/service/network/LanguageApi;",
        "languageApi",
        "Lfi0/a;",
        "analytics",
        "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;",
        "arabicBetaOptOutStatusStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/LanguageApi;Lfi0/a;Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;Ltr2/n;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/service/network/LanguageApi;",
        "b",
        "Lfi0/a;",
        "c",
        "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;",
        "d",
        "Ltr2/n;",
        "e",
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


# static fields
.field private static final e:Lbc2/b$a;

.field public static final f:I


# instance fields
.field private final a:Lcom/whoop/service/network/LanguageApi;

.field private final b:Lfi0/a;

.field private final c:Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbc2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbc2/b;->e:Lbc2/b$a;

    const/16 v0, 0x8

    sput v0, Lbc2/b;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/service/network/LanguageApi;Lfi0/a;Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;Ltr2/n;)V
    .locals 1

    const-string v0, "languageApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arabicBetaOptOutStatusStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbc2/b;->a:Lcom/whoop/service/network/LanguageApi;

    .line 3
    iput-object p2, p0, Lbc2/b;->b:Lfi0/a;

    .line 4
    iput-object p3, p0, Lbc2/b;->c:Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    .line 5
    iput-object p4, p0, Lbc2/b;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/LanguageApi;Lfi0/a;Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "LanguageBetaOptOutInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lbc2/b;-><init>(Lcom/whoop/service/network/LanguageApi;Lfi0/a;Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lbc2/b;)Lfi0/a;
    .locals 0

    iget-object p0, p0, Lbc2/b;->b:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic d(Lbc2/b;)Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;
    .locals 0

    iget-object p0, p0, Lbc2/b;->c:Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    return-object p0
.end method

.method public static final synthetic e(Lbc2/b;)Lcom/whoop/service/network/LanguageApi;
    .locals 0

    iget-object p0, p0, Lbc2/b;->a:Lcom/whoop/service/network/LanguageApi;

    return-object p0
.end method

.method public static final synthetic f(Lbc2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lbc2/b;->d:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lbc2/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lbc2/b$b;-><init>(Lq83/d;Lbc2/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
