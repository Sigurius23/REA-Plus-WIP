.class public final Lp1/k;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:La0/q0;

.field public final x:La0/q0;

.field public final y:La0/f0;

.field public final z:I


# direct methods
.method public constructor <init>(La0/q0;La0/q0;La0/f0;ILjava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p5}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lp1/k;->w:La0/q0;

    iput-object p2, p0, Lp1/k;->x:La0/q0;

    iput-object p3, p0, Lp1/k;->y:La0/f0;

    iput p4, p0, Lp1/k;->z:I

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n            |Exception while applying pausable composition. Last 10 operations:\n            |"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Lp1/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lp1/j;-><init>(Lp1/k;Lq83/d;)V

    new-instance v2, Lm83/r;

    invoke-direct {v2, v1}, Lm83/r;-><init>(Lc93/m;)V

    invoke-static {v2}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v2, v1}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, "\n"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
