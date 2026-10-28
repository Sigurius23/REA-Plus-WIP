.class public final Lsx1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lsx1/c;",
        "",
        "Lbc3/c0;",
        "scope",
        "Lrv1/a;",
        "membershipRepository",
        "<init>",
        "(Lbc3/c0;Lrv1/a;)V",
        "Ll83/a0;",
        "e",
        "()V",
        "Lsx1/b;",
        "screen",
        "",
        "showOnScreen",
        "f",
        "(Lsx1/b;Z)V",
        "d",
        "a",
        "Lbc3/c0;",
        "b",
        "Lrv1/a;",
        "Lec3/p1;",
        "Lsx1/e;",
        "c",
        "Lec3/p1;",
        "_reactivationModalFlow",
        "Lec3/f2;",
        "Lec3/f2;",
        "()Lec3/f2;",
        "reactivationModalFlow",
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


# instance fields
.field private final a:Lbc3/c0;

.field private final b:Lrv1/a;

.field private final c:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final d:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lrv1/a;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsx1/c;->a:Lbc3/c0;

    iput-object p2, p0, Lsx1/c;->b:Lrv1/a;

    new-instance p2, Lsx1/e;

    sget-object v0, Lm83/y;->w:Lm83/y;

    const/4 v1, 0x0

    invoke-direct {p2, v1, v0}, Lsx1/e;-><init>(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Ljava/util/List;)V

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lsx1/c;->c:Lec3/p1;

    new-instance v0, Lsx1/c$c;

    invoke-direct {v0, p0, v1}, Lsx1/c$c;-><init>(Lsx1/c;Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p1, v0, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lsx1/c;->d:Lec3/f2;

    return-void
.end method

.method public static final synthetic a(Lsx1/c;)Lrv1/a;
    .locals 0

    iget-object p0, p0, Lsx1/c;->b:Lrv1/a;

    return-object p0
.end method

.method public static final synthetic b(Lsx1/c;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lsx1/c;->c:Lec3/p1;

    return-object p0
.end method


# virtual methods
.method public final c()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lsx1/c;->d:Lec3/f2;

    return-object v0
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lsx1/c;->a:Lbc3/c0;

    new-instance v1, Lsx1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lsx1/c$a;-><init>(Lsx1/c;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lsx1/c;->a:Lbc3/c0;

    new-instance v1, Lsx1/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lsx1/c$b;-><init>(Lsx1/c;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f(Lsx1/b;Z)V
    .locals 3

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsx1/c;->a:Lbc3/c0;

    new-instance v1, Lsx1/c$e;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lsx1/c$e;-><init>(ZLsx1/c;Lsx1/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
