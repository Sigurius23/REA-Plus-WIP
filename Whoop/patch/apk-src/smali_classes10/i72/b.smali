.class public final Li72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li72/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Li72/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "",
        "hasComeFromSageScreen",
        "<init>",
        "(Leb/a0;Lj02/o0;Z)V",
        "Li72/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Li72/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Z",
        "d",
        "sage_release"
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
.field public static final d:Li72/b$a;

.field public static final e:I


# instance fields
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li72/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li72/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li72/b;->d:Li72/b$a;

    const/16 v0, 0x8

    sput v0, Li72/b;->e:I

    return-void
.end method

.method public constructor <init>(Leb/a0;Lj02/o0;Z)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li72/b;->a:Leb/a0;

    iput-object p2, p0, Li72/b;->b:Lj02/o0;

    iput-boolean p3, p0, Li72/b;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Li72/a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li72/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Li72/a$d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    check-cast p1, Li72/a$d;

    invoke-virtual {p1}, Li72/a$d;->a()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Li72/a$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    check-cast p1, Li72/a$c;

    invoke-virtual {p1}, Li72/a$c;->a()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Li72/a$e;

    if-eqz v0, :cond_4

    check-cast p1, Li72/a$e;

    invoke-virtual {p1}, Li72/a$e;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    :cond_3
    iget-object v0, p0, Li72/b;->b:Lj02/o0;

    invoke-virtual {p1}, Li72/a$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_4
    sget-object v0, Li72/a$b;->a:Li72/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Li72/b;->c:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_5
    iget-object p1, p0, Li72/b;->a:Leb/a0;

    sget v0, Lz62/a;->a:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Leb/a0;->A(IZ)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Li72/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_6
    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
