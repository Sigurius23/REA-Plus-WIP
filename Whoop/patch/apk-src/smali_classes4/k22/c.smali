.class public final Lk22/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lk22/c;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Lk22/a;",
        "action",
        "",
        "Lqt0/b;",
        "devices",
        "Lk22/b;",
        "a",
        "(Lk22/a;Ljava/util/List;)Lk22/b;",
        "Ltr2/n;",
        "pairing-ui_release"
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
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk22/c;->a:Ltr2/n;

    return-void
.end method


# virtual methods
.method public final a(Lk22/a;Ljava/util/List;)Lk22/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk22/a;",
            "Ljava/util/List<",
            "Lqt0/b;",
            ">;)",
            "Lk22/b;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lk22/a$a;

    if-eqz v0, :cond_0

    sget-object p1, Lk22/b$a;->a:Lk22/b$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lk22/a$c;

    if-eqz v0, :cond_1

    new-instance p1, Lk22/b$c;

    invoke-direct {p1, p2}, Lk22/b$c;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_1
    instance-of p1, p1, Lk22/a$b;

    if-eqz p1, :cond_2

    sget-object p1, Lk22/b$b;->a:Lk22/b$b;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
