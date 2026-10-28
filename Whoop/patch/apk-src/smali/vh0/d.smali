.class public final Lvh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvh0/d;",
        "",
        "Lwh0/a;",
        "mapper",
        "Lph0/b;",
        "screenArgs",
        "<init>",
        "(Lwh0/a;Lph0/b;)V",
        "Lsh0/b;",
        "domainResult",
        "Lvh0/c;",
        "a",
        "(Lsh0/b;)Lvh0/c;",
        "Lwh0/a;",
        "b",
        "Lph0/b;",
        "ai-insights_release"
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
.field public static final c:I


# instance fields
.field private final a:Lwh0/a;

.field private final b:Lph0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lvh0/d;->c:I

    return-void
.end method

.method public constructor <init>(Lwh0/a;Lph0/b;)V
    .locals 1

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh0/d;->a:Lwh0/a;

    iput-object p2, p0, Lvh0/d;->b:Lph0/b;

    return-void
.end method


# virtual methods
.method public final a(Lsh0/b;)Lvh0/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lsh0/b$e;

    if-eqz v0, :cond_0

    sget-object p1, Lvh0/c$e;->a:Lvh0/c$e;

    return-object p1

    :cond_0
    instance-of v0, p1, Lsh0/b$d;

    if-eqz v0, :cond_1

    new-instance v0, Lvh0/c$d;

    check-cast p1, Lsh0/b$d;

    invoke-virtual {p1}, Lsh0/b$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvh0/c$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lsh0/b$f;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lvh0/d;->a:Lwh0/a;

    check-cast p1, Lsh0/b$f;

    invoke-virtual {p1}, Lsh0/b$f;->a()Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;

    move-result-object p1

    iget-object v1, p0, Lvh0/d;->b:Lph0/b;

    invoke-virtual {v0, p1, v1}, Lwh0/a;->c(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lph0/b;)Lvh0/c$f;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lsh0/b$a;

    if-eqz v0, :cond_3

    new-instance v0, Lvh0/c$a;

    check-cast p1, Lsh0/b$a;

    invoke-virtual {p1}, Lsh0/b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvh0/c$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    sget-object v0, Lsh0/b$b;->a:Lsh0/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lvh0/c$b;->a:Lvh0/c$b;

    return-object p1

    :cond_4
    sget-object v0, Lsh0/b$c;->a:Lsh0/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lvh0/c$c;->a:Lvh0/c$c;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
