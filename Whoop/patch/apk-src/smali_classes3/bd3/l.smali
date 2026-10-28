.class public final Lbd3/l;
.super Lbd3/k;
.source "SourceFile"


# instance fields
.field public final d:Z


# direct methods
.method public constructor <init>(Lbd3/v;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lbd3/k;-><init>(Lbd3/v;)V

    iput-boolean p2, p0, Lbd3/l;->d:Z

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lbd3/l;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method
