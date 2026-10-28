.class public final Lhm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lhm2/a;",
        "",
        "Ldm2/a;",
        "analytics",
        "<init>",
        "(Ldm2/a;)V",
        "Lim2/a;",
        "event",
        "Ll83/a0;",
        "c",
        "(Lim2/a;)V",
        "Lim2/a$d;",
        "a",
        "(Lim2/a$d;)Lim2/a;",
        "actionEvent",
        "b",
        "(Lim2/a;)Lim2/a;",
        "Ldm2/a;",
        "trends-mini-arch_release"
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
.field private final a:Ldm2/a;


# direct methods
.method public constructor <init>(Ldm2/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhm2/a;->a:Ldm2/a;

    return-void
.end method

.method private final a(Lim2/a$d;)Lim2/a;
    .locals 1

    invoke-virtual {p1}, Lim2/a$d;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance v0, Lim2/a$b;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Lim2/a$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lim2/a;)V
    .locals 1

    instance-of v0, p1, Lim2/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhm2/a;->a:Ldm2/a;

    check-cast p1, Lim2/a$a;

    invoke-virtual {v0, p1}, Ldm2/a;->a(Lim2/a$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lim2/a;)Lim2/a;
    .locals 1

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhm2/a;->c(Lim2/a;)V

    instance-of v0, p1, Lim2/a$d;

    if-eqz v0, :cond_0

    check-cast p1, Lim2/a$d;

    invoke-direct {p0, p1}, Lhm2/a;->a(Lim2/a$d;)Lim2/a;

    move-result-object p1

    :cond_0
    return-object p1
.end method
