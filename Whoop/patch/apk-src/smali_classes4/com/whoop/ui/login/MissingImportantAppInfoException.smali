.class public final Lcom/whoop/ui/login/MissingImportantAppInfoException;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/ui/login/MissingImportantAppInfoException;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "",
        "Lcom/whoop/ui/login/ImportantAppInfo;",
        "missingItems",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "w",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "metricValue",
        "core_release"
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
.field private final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/ui/login/ImportantAppInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "missingItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lan2/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lcom/whoop/ui/login/MissingImportantAppInfoException$a;

    invoke-direct {v0}, Lcom/whoop/ui/login/MissingImportantAppInfoException$a;-><init>()V

    invoke-static {p1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lp;

    const/16 p1, 0x1a

    invoke-direct {v4, p1}, Lp;-><init>(I)V

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/ui/login/MissingImportantAppInfoException;->w:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/ui/login/ImportantAppInfo;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/login/MissingImportantAppInfoException;->c(Lcom/whoop/ui/login/ImportantAppInfo;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/ui/login/ImportantAppInfo;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ui/login/ImportantAppInfo;->getShortId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/login/MissingImportantAppInfoException;->w:Ljava/lang/String;

    return-object v0
.end method
