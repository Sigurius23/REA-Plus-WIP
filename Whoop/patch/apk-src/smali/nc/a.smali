.class public final Lnc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lnc/b;

.field public final synthetic b:Ldc3/u;


# direct methods
.method public constructor <init>(Lnc/b;Ldc3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/a;->a:Lnc/b;

    iput-object p2, p0, Lnc/a;->b:Ldc3/u;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lnc/a;->a:Lnc/b;

    invoke-virtual {v0, p1}, Lnc/b;->d(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lmc/b;

    invoke-virtual {v0}, Lnc/b;->c()I

    move-result v0

    invoke-direct {p1, v0}, Lmc/b;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lmc/a;->a:Lmc/a;

    :goto_0
    iget-object v0, p0, Lnc/a;->b:Ldc3/u;

    check-cast v0, Ldc3/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
