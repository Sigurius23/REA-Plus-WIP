.class public final Lqs2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqs2/b;",
        "",
        "<init>",
        "()V",
        "Lns2/b;",
        "domainResult",
        "Lps2/c;",
        "a",
        "(Lns2/b;)Lps2/c;",
        "Ljb1/a;",
        "Ljb1/a;",
        "designItemReducer",
        "weekly-plan_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lqs2/b;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lqs2/a;->o()Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lqs2/b;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lns2/b;)Lps2/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lns2/b$a;

    if-eqz v0, :cond_0

    sget-object p1, Lps2/c$a;->a:Lps2/c$a;

    return-object p1

    :cond_0
    sget-object v0, Lns2/b$b;->a:Lns2/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lps2/c$b;->a:Lps2/c$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lns2/b$c;

    if-eqz v0, :cond_2

    new-instance v0, Lps2/c$c;

    iget-object v1, p0, Lqs2/b;->a:Ljb1/a;

    check-cast p1, Lns2/b$c;

    invoke-virtual {p1}, Lns2/b$c;->a()Lcom/whoop/weeklyplan/challengelanding/aiplans/domain/model/AiPlansResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/challengelanding/aiplans/domain/model/AiPlansResponse;->getCarouselItems()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lps2/c$c;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
