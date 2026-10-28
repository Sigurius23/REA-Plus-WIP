.class public final Lbc3/o1;
.super Lbc3/m1;
.source "SourceFile"


# instance fields
.field public final E:Lbc3/t1;

.field public final F:Lbc3/p1;

.field public final G:Lbc3/q;

.field public final H:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbc3/t1;Lbc3/p1;Lbc3/q;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p1, p0, Lbc3/o1;->E:Lbc3/t1;

    iput-object p2, p0, Lbc3/o1;->F:Lbc3/p1;

    iput-object p3, p0, Lbc3/o1;->G:Lbc3/q;

    iput-object p4, p0, Lbc3/o1;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 6

    iget-object p1, p0, Lbc3/o1;->G:Lbc3/q;

    invoke-static {p1}, Lbc3/t1;->O(Lhc3/k;)Lbc3/q;

    move-result-object v0

    iget-object v1, p0, Lbc3/o1;->E:Lbc3/t1;

    iget-object v2, p0, Lbc3/o1;->F:Lbc3/p1;

    iget-object v3, p0, Lbc3/o1;->H:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v2, v0, v3}, Lbc3/t1;->Y(Lbc3/p1;Lbc3/q;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lbc3/p1;->w:Lbc3/x1;

    new-instance v4, Lhc3/h;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lhc3/h;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Lhc3/k;->c(Lhc3/k;I)Z

    invoke-static {p1}, Lbc3/t1;->O(Lhc3/k;)Lbc3/q;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1, v2, p1, v3}, Lbc3/t1;->Y(Lbc3/p1;Lbc3/q;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {v1, v2, v3}, Lbc3/t1;->z(Lbc3/p1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbc3/t1;->j(Ljava/lang/Object;)V

    return-void
.end method
