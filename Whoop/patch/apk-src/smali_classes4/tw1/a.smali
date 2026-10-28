.class public final Ltw1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltw1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ltw1/a;",
        "",
        "Lnw1/a;",
        "analyticsHelper",
        "<init>",
        "(Lnw1/a;)V",
        "Lww1/h;",
        "event",
        "Lww1/c;",
        "a",
        "(Lww1/h;)Lww1/c;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "Luw1/c$c;",
        "hubScreenContent",
        "b",
        "(Lcom/whoop/navigation/e;Luw1/c$c;)Lww1/c;",
        "actionEvent",
        "c",
        "(Lww1/c;)Lww1/c;",
        "Lnw1/a;",
        "membership_release"
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
.field public static final b:Ltw1/a$a;

.field public static final c:I


# instance fields
.field private final a:Lnw1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltw1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltw1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltw1/a;->b:Ltw1/a$a;

    const/16 v0, 0x8

    sput v0, Ltw1/a;->c:I

    return-void
.end method

.method public constructor <init>(Lnw1/a;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltw1/a;->a:Lnw1/a;

    return-void
.end method

.method private final a(Lww1/h;)Lww1/c;
    .locals 2

    invoke-virtual {p1}, Lww1/h;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lxw1/e$b;

    if-eqz v1, :cond_0

    new-instance p1, Lww1/g$b;

    check-cast v0, Lxw1/e$b;

    invoke-virtual {v0}, Lxw1/e$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lww1/g$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    instance-of v1, v0, Lxw1/e$a;

    if-eqz v1, :cond_1

    new-instance p1, Lww1/g$d;

    check-cast v0, Lxw1/e$a;

    invoke-virtual {v0}, Lxw1/e$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lww1/g$d;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    instance-of v1, v0, Lm91/u;

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lww1/h;->a()Lm91/u;

    move-result-object v1

    instance-of v1, v1, Lny0/h;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lww1/h;->a()Lm91/u;

    move-result-object p1

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v1, "AddNewMemberButton"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p1, Lww1/e$e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lww1/e$e;-><init>(Z)V

    return-object p1

    :cond_2
    const-string v1, "AddExistingMemberButton"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lww1/e$e;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lww1/e$e;-><init>(Z)V

    return-object p1

    :cond_3
    new-instance p1, Lww1/e$a;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Lww1/e$a;-><init>(Lm91/u;)V

    return-object p1

    :cond_4
    new-instance p1, Lww1/e$a;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Lww1/e$a;-><init>(Lm91/u;)V

    return-object p1

    :cond_5
    instance-of v1, v0, Lcom/whoop/navigation/e;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lww1/h;->c()Luw1/c$c;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ltw1/a;->b(Lcom/whoop/navigation/e;Luw1/c$c;)Lww1/c;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;Luw1/c$c;)Lww1/c;
    .locals 1

    new-instance v0, Lww1/e$b;

    invoke-direct {v0, p1, p2}, Lww1/e$b;-><init>(Lcom/whoop/navigation/e;Luw1/c$c;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lww1/c;)Lww1/c;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lww1/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltw1/a;->a:Lnw1/a;

    move-object v1, p1

    check-cast v1, Lww1/a;

    invoke-virtual {v0, v1}, Lnw1/a;->a(Lww1/a;)V

    :cond_0
    instance-of v0, p1, Lww1/h;

    if-eqz v0, :cond_1

    check-cast p1, Lww1/h;

    invoke-direct {p0, p1}, Ltw1/a;->a(Lww1/h;)Lww1/c;

    move-result-object p1

    :cond_1
    return-object p1
.end method
