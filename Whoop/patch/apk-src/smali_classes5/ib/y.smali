.class public final Lib/y;
.super Lib/x;
.source "SourceFile"


# instance fields
.field public final a:Lib/i;

.field public final b:I


# direct methods
.method public constructor <init>(Lib/a0;IILjava/util/concurrent/Executor;Lib/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lib/i;

    invoke-direct {v0, p1, p2, p4, p5}, Lib/i;-><init>(Lib/a0;ILjava/util/concurrent/Executor;Lib/k;)V

    iput-object v0, p0, Lib/y;->a:Lib/i;

    iput p3, p0, Lib/y;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 4

    iget-object v0, p0, Lib/y;->a:Lib/i;

    iget-object v1, v0, Lib/i;->c:Ljava/lang/Object;

    check-cast v1, Lib/a0;

    invoke-virtual {v1}, Lib/j;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lib/l;->e:Lib/l;

    invoke-virtual {v0, p1}, Lib/i;->b(Lib/l;)V

    return-void

    :cond_0
    new-instance v1, Lib/l;

    iget v2, p0, Lib/y;->b:I

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, p1}, Lib/l;-><init>(IIILjava/util/List;)V

    invoke-virtual {v0, v1}, Lib/i;->b(Lib/l;)V

    return-void
.end method
