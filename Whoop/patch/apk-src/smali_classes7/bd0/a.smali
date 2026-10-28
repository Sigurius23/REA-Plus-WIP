.class public final Lbd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbd0/a;",
        "",
        "<init>",
        "()V",
        "Lec3/l;",
        "Lyc0/b;",
        "domainResults",
        "Lad0/c;",
        "a",
        "(Lec3/l;)Lec3/l;",
        "domainResult",
        "currentViewState",
        "b",
        "(Lyc0/b;Lad0/c;)Lad0/c;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lad0/c$b;->b:Lad0/c$b;

    const-string v1, "null cannot be cast to non-null type com.whoop.advancedlabs.mobilescheduling.presentation.MobileSchedulingFormViewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbd0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lbd0/a$a;-><init>(Lbd0/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method

.method public final b(Lyc0/b;Lad0/c;)Lad0/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentViewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p1, Lyc0/b$b;

    if-eqz p2, :cond_0

    sget-object p1, Lad0/c$b;->b:Lad0/c$b;

    return-object p1

    :cond_0
    instance-of p2, p1, Lyc0/b$a;

    if-eqz p2, :cond_1

    sget-object p1, Lad0/c$a;->b:Lad0/c$a;

    return-object p1

    :cond_1
    instance-of p1, p1, Lyc0/b$c;

    if-eqz p1, :cond_2

    sget-object p1, Lad0/c$c;->b:Lad0/c$c;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
