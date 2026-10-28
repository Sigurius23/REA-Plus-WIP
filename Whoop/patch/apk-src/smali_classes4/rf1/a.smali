.class public final Lrf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lrf1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lwf1/a$g;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lwf1/a$g;)V",
        "Lwf1/a$a;",
        "a",
        "(Lwf1/a$a;)V",
        "Lfi0/a;",
        "feedback-survey_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf1/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lwf1/a$g;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lwf1/a$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwf1/a$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrf1/a;->a:Lfi0/a;

    check-cast p1, Lwf1/a$e;

    invoke-virtual {p1}, Lwf1/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lrf1/b;->b(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lwf1/a$g;

    if-eqz v0, :cond_1

    check-cast p1, Lwf1/a$g;

    invoke-direct {p0, p1}, Lrf1/a;->b(Lwf1/a$g;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
