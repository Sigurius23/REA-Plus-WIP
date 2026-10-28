.class public final Lf22/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf22/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lf22/f;",
        "",
        "Landroidx/fragment/app/r0;",
        "activity",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltd1/b;",
        "whoopStrapProxy",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Landroidx/fragment/app/r0;Lci2/b;Ltd1/b;Lj02/o0;)V",
        "Lf22/d;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lf22/d;)V",
        "Landroidx/fragment/app/r0;",
        "b",
        "Lci2/b;",
        "c",
        "Ltd1/b;",
        "d",
        "Lj02/o0;",
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
.field private final a:Landroidx/fragment/app/r0;

.field private final b:Lci2/b;

.field private final c:Ltd1/b;

.field private final d:Lj02/o0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;Lci2/b;Ltd1/b;Lj02/o0;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProxy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf22/f;->a:Landroidx/fragment/app/r0;

    iput-object p2, p0, Lf22/f;->b:Lci2/b;

    iput-object p3, p0, Lf22/f;->c:Ltd1/b;

    iput-object p4, p0, Lf22/f;->d:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lf22/d;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf22/d$a;->a:Lf22/d$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lf22/f;->a:Landroidx/fragment/app/r0;

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/fragment/app/l1;

    const/4 v3, 0x0

    invoke-direct {v0, p1, v2, v1, v3}, Landroidx/fragment/app/l1;-><init>(Landroidx/fragment/app/o1;Ljava/lang/String;II)V

    invoke-virtual {p1, v0, v3}, Landroidx/fragment/app/o1;->x(Landroidx/fragment/app/k1;Z)V

    return-void

    :cond_0
    sget-object v0, Lf22/d$c;->a:Lf22/d$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lf22/f;->a:Landroidx/fragment/app/r0;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, Lf22/f;->a:Landroidx/fragment/app/r0;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    instance-of v0, p1, Lf22/d$b;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lf22/f;->b:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljk0/d;->G0()V

    :cond_2
    iget-object v0, p0, Lf22/f;->c:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->l()V

    check-cast p1, Lf22/d$b;

    invoke-virtual {p1}, Lf22/d$b;->a()Lc22/b;

    move-result-object p1

    sget-object v0, Lf22/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lf22/f;->d:Lj02/o0;

    new-instance v1, Lj02/m0$z1;

    invoke-direct {v1, v2, v0, v2}, Lj02/m0$z1;-><init>(Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, Lf22/f;->a:Landroidx/fragment/app/r0;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :cond_5
    instance-of v0, p1, Lf22/d$d;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lf22/f;->d:Lj02/o0;

    check-cast p1, Lf22/d$d;

    invoke-virtual {p1}, Lf22/d$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
