.class public final Lbc3/t;
.super Lbc3/t1;
.source "SourceFile"

# interfaces
.implements Lbc3/s;


# direct methods
.method public constructor <init>(Lbc3/k1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lbc3/t1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lbc3/t1;->H(Lbc3/k1;)V

    return-void
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final completeExceptionally(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lbc3/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
