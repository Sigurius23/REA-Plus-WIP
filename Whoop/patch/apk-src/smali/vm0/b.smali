.class public final Lvm0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lvm0/b;",
        "",
        "Lfy1/c;",
        "currentScreenProvider",
        "<init>",
        "(Lfy1/c;)V",
        "Lvm0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lvm0/a;)V",
        "Lfy1/c;",
        "Lec3/o1;",
        "Lvm0/k;",
        "b",
        "Lec3/o1;",
        "events",
        "Lec3/t1;",
        "c",
        "Lec3/t1;",
        "()Lec3/t1;",
        "stream",
        "cache_release"
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
.field private final a:Lfy1/c;

.field private final b:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final c:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfy1/c;)V
    .locals 3

    const-string v0, "currentScreenProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm0/b;->a:Lfy1/c;

    sget-object p1, Ldc3/a;->x:Ldc3/a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x40

    invoke-static {v1, v2, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lvm0/b;->b:Lec3/o1;

    iput-object p1, p0, Lvm0/b;->c:Lec3/t1;

    return-void
.end method


# virtual methods
.method public final a(Lvm0/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm0/b;->b:Lec3/o1;

    new-instance v1, Lvm0/k;

    iget-object v2, p0, Lvm0/b;->a:Lfy1/c;

    invoke-interface {v2}, Lfy1/c;->b()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfy1/b;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lfy1/b;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, p1, v2}, Lvm0/k;-><init>(Lvm0/a;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lvm0/b;->c:Lec3/t1;

    return-object v0
.end method
