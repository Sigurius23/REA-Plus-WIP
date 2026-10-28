.class public final Lgh3/a;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lbh3/b;

.field public final F:Lbh3/b;

.field public final G:Lbh3/d;


# direct methods
.method public constructor <init>(Lbh3/b;Lbh3/b;)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lgh3/a;->E:Lbh3/b;

    iput-object p2, p0, Lgh3/a;->F:Lbh3/b;

    sget-object p1, Lbh3/e;->a:Lbh3/d;

    iput-object p1, p0, Lgh3/a;->G:Lbh3/d;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 1

    iget-object v0, p0, Lgh3/a;->G:Lbh3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lgh3/a;->F:Lbh3/b;

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lgh3/a;->E:Lbh3/b;

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void
.end method
