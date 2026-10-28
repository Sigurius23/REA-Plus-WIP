.class public final Lwe/g0;
.super Lb3/b;
.source "SourceFile"


# instance fields
.field public final d:Lc93/a;

.field public final e:Lgf/o;


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Lwe/f0;->w:Lwe/f0;

    sget-object v1, Lwe/e;->y:Lwe/e;

    invoke-direct {p0, v1, v0}, Lb3/b;-><init>(Lwe/e;Lc93/a;)V

    iput-object v0, p0, Lwe/g0;->d:Lc93/a;

    new-instance v0, Lgf/o;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->HOURS:Lkotlin/time/DurationUnit;

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-wide v1, v0, Lgf/o;->a:J

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v3, v0, Lgf/o;->b:Ljava/io/Serializable;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v3

    iput-object v3, v0, Lgf/o;->c:Ljava/lang/Object;

    sget-object v3, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lug/b;->d(J)Lug/b;

    move-result-object v1

    iput-object v1, v0, Lgf/o;->d:Ljava/lang/Comparable;

    iput-object v0, p0, Lwe/g0;->e:Lgf/o;

    return-void
.end method


# virtual methods
.method public final a(Lwe/g;)[B
    .locals 3

    new-instance v0, Ls40/c0;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p1, Lq83/k;->w:Lq83/k;

    invoke-static {p1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public final d(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 1

    const-string v0, "signingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringToSign"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p2, p1}, Lse/g;->u([B[B)[B

    move-result-object p1

    invoke-static {p1}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lc93/a;
    .locals 1

    iget-object v0, p0, Lwe/g0;->d:Lc93/a;

    return-object v0
.end method
