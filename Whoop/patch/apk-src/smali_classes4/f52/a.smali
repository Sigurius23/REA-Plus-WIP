.class public final Lf52/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lf52/a;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Ly42/a;",
        "puffin",
        "Lcom/whoop/puffin/sync/c;",
        "batterySyncHolder",
        "Lbc3/i0;",
        "Lvk0/e;",
        "c",
        "(Ly42/a;Lcom/whoop/puffin/sync/c;)Lbc3/i0;",
        "b",
        "(Ly42/a;)Lbc3/i0;",
        "a",
        "(Ly42/a;Lq83/d;)Ljava/lang/Object;",
        "puffin_release"
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
.method public final a(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, La52/c;

    invoke-direct {v0}, La52/c;-><init>()V

    sget-object v1, Lsj2/a$a;->a:Lsj2/a$a;

    invoke-interface {p1, v0, v1}, Ly42/a;->a(Lvk0/a;Lsj2/a;)Lbc3/i0;

    move-result-object p1

    invoke-interface {p1, p2}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly42/a;)Lbc3/i0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            ")",
            "Lbc3/i0;"
        }
    .end annotation

    const-string v0, "puffin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lcom/whoop/puffin/sync/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/puffin/sync/c;

    invoke-virtual {p0, p1, v0}, Lf52/a;->c(Ly42/a;Lcom/whoop/puffin/sync/c;)Lbc3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ly42/a;Lcom/whoop/puffin/sync/c;)Lbc3/i0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lcom/whoop/puffin/sync/c;",
            ")",
            "Lbc3/i0;"
        }
    .end annotation

    const-string v0, "puffin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batterySyncHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/puffin/sync/b;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/whoop/puffin/sync/b;-><init>(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lsj2/a$b;->a:Lsj2/a$b;

    invoke-interface {p1, v1, p2}, Ly42/a;->a(Lvk0/a;Lsj2/a;)Lbc3/i0;

    move-result-object p1

    return-object p1
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
