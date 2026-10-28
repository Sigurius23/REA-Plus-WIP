.class public final Lxy2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lxy2/c;",
        "",
        "Lex2/b;",
        "labsCampaignRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lex2/b;Ltr2/n;)V",
        "",
        "campaignFilter",
        "Lec3/l;",
        "Lxy2/b;",
        "e",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lxy2/a;",
        "upstream",
        "d",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lex2/b;",
        "b",
        "Ltr2/n;",
        "whooplabs_release"
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
.field private final a:Lex2/b;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lex2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "labsCampaignRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxy2/c;->a:Lex2/b;

    .line 3
    iput-object p2, p0, Lxy2/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lex2/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    const-string p2, "CompletedCampaignsInteractor"

    invoke-static {p2}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lxy2/c;-><init>(Lex2/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lxy2/c;)Lex2/b;
    .locals 0

    iget-object p0, p0, Lxy2/c;->a:Lex2/b;

    return-object p0
.end method

.method public static final synthetic b(Lxy2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lxy2/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lxy2/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxy2/c;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Lxy2/c$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, Lxy2/c$b;-><init>(Lxy2/c;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p2}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public final d(Lec3/l;)Lec3/l;
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

    new-instance v0, Lxy2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lxy2/c$a;-><init>(Lq83/d;Lxy2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
