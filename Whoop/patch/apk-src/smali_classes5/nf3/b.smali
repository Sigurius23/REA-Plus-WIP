.class public final Lnf3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lnf3/a;

.field public final b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnf3/a;

    invoke-direct {v0}, Lnf3/a;-><init>()V

    iput-object v0, p0, Lnf3/b;->a:Lnf3/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnf3/b;->b:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lnf3/b;->a:Lnf3/a;

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    const-string v2, "create eager instances ..."

    invoke-virtual {v1, v2}, Lq83/g;->C(Ljava/lang/String;)V

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lq83/g;->D(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lm5/k;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lv63/b;->f(Lc93/a;)D

    move-result-wide v1

    iget-object v0, v0, Lnf3/a;->c:Lq83/g;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "eager instances created in "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " ms"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/g;->r(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v0, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->e()V

    return-void
.end method
