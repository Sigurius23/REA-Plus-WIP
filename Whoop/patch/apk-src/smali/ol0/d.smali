.class public final Lol0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lol0/d;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Ldl0/a$b;",
        "Lol0/c;",
        "b",
        "(Ldl0/a$b;)Lol0/c;",
        "Ldl0/c;",
        "domainState",
        "a",
        "(Ldl0/c;)Lol0/c;",
        "Ljb1/a;",
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lol0/d;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lol0/d;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lpl0/c;->U()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lol0/d;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Ldl0/a$b;)Lol0/c;
    .locals 6

    instance-of v0, p1, Ldl0/a$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lol0/c;

    new-instance v0, Lol0/c$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v3

    invoke-direct {v0, v3, v2, v1, v2}, Lol0/c$a;-><init>(Le31/c;Lol0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0, v2, v1, v2}, Lol0/c;-><init>(Lol0/c$a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Ldl0/a$c;

    if-eqz v0, :cond_1

    new-instance p1, Lol0/c;

    new-instance v0, Lol0/c$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->b()Le31/c;

    move-result-object v3

    invoke-direct {v0, v3, v2, v1, v2}, Lol0/c$a;-><init>(Le31/c;Lol0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0, v2, v1, v2}, Lol0/c;-><init>(Lol0/c$a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Ldl0/a$d;

    if-eqz v0, :cond_2

    new-instance v0, Lol0/c;

    new-instance v3, Lol0/c$a;

    sget-object v4, Le31/d;->a:Le31/d;

    invoke-virtual {v4}, Le31/d;->c()Le31/c;

    move-result-object v4

    new-instance v5, Lol0/a$a;

    check-cast p1, Ldl0/a$d;

    invoke-virtual {p1}, Ldl0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v5, p1}, Lol0/a$a;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v5}, Lol0/c$a;-><init>(Le31/c;Lol0/a;)V

    invoke-direct {v0, v3, v2, v1, v2}, Lol0/c;-><init>(Lol0/c$a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Ldl0/c;)Lol0/c;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldl0/c;->a()Ldl0/a;

    move-result-object v0

    instance-of v0, v0, Ldl0/a$b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ldl0/c;->a()Ldl0/a;

    move-result-object p1

    check-cast p1, Ldl0/a$b;

    invoke-direct {p0, p1}, Lol0/d;->b(Ldl0/a$b;)Lol0/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ldl0/c;->b()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lol0/d;->a:Ljb1/a;

    invoke-virtual {v1, p1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    new-instance v1, Lol0/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2, v0}, Lol0/c;-><init>(Lol0/c$a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
