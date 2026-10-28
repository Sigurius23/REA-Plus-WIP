.class public final Lxg2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxg2/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lvg2/b;",
        "state",
        "Lwg2/e;",
        "a",
        "(Lvg2/b;)Lwg2/e;",
        "Ljb1/a;",
        "start-activity_release"
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

    sput v0, Lxg2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg2/a;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lvg2/b;)Lwg2/e;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvg2/b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lwg2/e$c;->a:Lwg2/e$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lvg2/b$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lxg2/a;->a:Ljb1/a;

    check-cast p1, Lvg2/b$c;

    invoke-virtual {p1}, Lvg2/b$c;->a()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lwg2/e$d;

    invoke-direct {v0, p1}, Lwg2/e$d;-><init>(Lm91/o;)V

    return-object v0

    :cond_1
    new-instance p1, Lwg2/e$a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lwg2/e$a;-><init>(Z)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lvg2/b$a;

    if-eqz v0, :cond_3

    new-instance v0, Lwg2/e$a;

    check-cast p1, Lvg2/b$a;

    invoke-virtual {p1}, Lvg2/b$a;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lwg2/e$a;-><init>(Z)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
