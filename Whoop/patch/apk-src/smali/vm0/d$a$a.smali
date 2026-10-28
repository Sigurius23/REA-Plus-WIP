.class final Lvm0/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lvm0/d;


# direct methods
.method public constructor <init>(Lvm0/d;)V
    .locals 0

    iput-object p1, p0, Lvm0/d$a$a;->w:Lvm0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvm0/k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvm0/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lvm0/k;->a()Lvm0/a;

    move-result-object p2

    invoke-virtual {p1}, Lvm0/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lvm0/e;->a(Lvm0/a;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, Lvm0/d$a$a;->w:Lvm0/d;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljy1/a;

    invoke-static {p2}, Lvm0/d;->a(Lvm0/d;)Liy1/c;

    move-result-object v1

    invoke-interface {v1, v0}, Liy1/c;->b(Ljy1/a;)V

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvm0/k;

    invoke-virtual {p0, p1, p2}, Lvm0/d$a$a;->b(Lvm0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
