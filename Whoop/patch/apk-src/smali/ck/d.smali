.class public abstract Lck/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# static fields
.field public static final y:Ljava/util/Set;


# instance fields
.field public w:Lgj/d;

.field public x:Leb/k;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v5, "DEFACE"

    const-string v6, "00000000-0000-0000-0000-000000000000"

    const-string v0, ""

    const-string v1, "9774d56d682e549c"

    const-string v2, "unknown"

    const-string v3, "000000000000000"

    const-string v4, "Android"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lck/d;->y:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljk/a;)Ljk/a;
    .locals 5

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    move-result-object v0

    iget-object v0, v0, Lgj/d;->a:Lgj/g;

    iget-object v1, p1, Ljk/a;->c:Ljava/lang/Long;

    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p1, Ljk/a;->c:Ljava/lang/Long;

    :cond_0
    iget-object v1, p1, Ljk/a;->f:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ljk/a;->f:Ljava/lang/String;

    :cond_1
    iget-object v1, p1, Ljk/a;->B:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, "amplitude-analytics-android/1.21.1"

    iput-object v1, p1, Ljk/a;->B:Ljava/lang/String;

    :cond_2
    iget-object v1, p1, Ljk/a;->a:Ljava/lang/String;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    move-result-object v1

    iget-object v1, v1, Lgj/d;->b:La3/p;

    iget-object v1, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->a:Ljava/lang/String;

    :cond_3
    iget-object v1, p1, Ljk/a;->b:Ljava/lang/String;

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    move-result-object v1

    iget-object v1, v1, Lgj/d;->b:La3/p;

    iget-object v1, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->b:Ljava/lang/String;

    :cond_4
    iget-object v0, v0, Lgj/g;->i:Lgj/n;

    const-string v1, "version_name"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "contextProvider"

    if-eqz v1, :cond_6

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->c:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->j:Ljava/lang/String;

    goto :goto_0

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_0
    const-string v1, "os_name"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "android"

    iput-object v1, p1, Ljk/a;->l:Ljava/lang/String;

    goto :goto_1

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    :goto_1
    const-string v1, "os_version"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->d:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->m:Ljava/lang/String;

    goto :goto_2

    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_a
    :goto_2
    const-string v1, "device_brand"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->e:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->n:Ljava/lang/String;

    goto :goto_3

    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_c
    :goto_3
    const-string v1, "device_manufacturer"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->f:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->o:Ljava/lang/String;

    goto :goto_4

    :cond_d
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_e
    :goto_4
    const-string v1, "device_model"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->g:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->p:Ljava/lang/String;

    goto :goto_5

    :cond_f
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_10
    :goto_5
    const-string v1, "carrier"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->h:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->q:Ljava/lang/String;

    goto :goto_6

    :cond_11
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_12
    :goto_6
    const-string v1, "ip_address"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    const-string v4, "$remote"

    if-eqz v1, :cond_13

    iget-object v1, p1, Ljk/a;->C:Ljava/lang/String;

    if-nez v1, :cond_13

    iput-object v4, p1, Ljk/a;->C:Ljava/lang/String;

    :cond_13
    const-string v1, "country"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, p1, Ljk/a;->C:Ljava/lang/String;

    if-eq v1, v4, :cond_15

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->b:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->r:Ljava/lang/String;

    goto :goto_7

    :cond_14
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_15
    :goto_7
    const-string v1, "language"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->i:Ljava/lang/String;

    iput-object v1, p1, Ljk/a;->A:Ljava/lang/String;

    goto :goto_8

    :cond_16
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_17
    :goto_8
    const-string v1, "platform"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_18

    const-string v1, "Android"

    iput-object v1, p1, Ljk/a;->k:Ljava/lang/String;

    :cond_18
    const-string v1, "lat_lng"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_19

    goto :goto_9

    :cond_19
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1a
    :goto_9
    const-string v1, "adid"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-object v1, p0, Lck/d;->x:Leb/k;

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Leb/k;->e()Lgk/a;

    move-result-object v1

    iget-object v1, v1, Lgk/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_1c

    iput-object v1, p1, Ljk/a;->x:Ljava/lang/String;

    goto :goto_a

    :cond_1b
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1c
    :goto_a
    const-string v1, "app_set_id"

    invoke-virtual {v0, v1}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lck/d;->x:Leb/k;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Leb/k;->e()Lgk/a;

    move-result-object v0

    iget-object v0, v0, Lgk/a;->j:Ljava/lang/String;

    if-eqz v0, :cond_1e

    iput-object v0, p1, Ljk/a;->y:Ljava/lang/String;

    goto :goto_b

    :cond_1d
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1e
    :goto_b
    iget-object v0, p1, Ljk/a;->K:Ljava/lang/String;

    if-nez v0, :cond_1f

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    :cond_1f
    iget-object v0, p1, Ljk/a;->D:Ljk/d;

    if-nez v0, :cond_20

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    :cond_20
    iget-object v0, p1, Ljk/a;->E:Ljk/c;

    if-nez v0, :cond_21

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    :cond_21
    return-object p1
.end method

.method public final b(Lgj/d;)V
    .locals 5

    iput-object p1, p0, Lck/d;->w:Lgj/d;

    iget-object p1, p1, Lgj/d;->a:Lgj/g;

    new-instance v0, Leb/k;

    iget-object v1, p1, Lgj/g;->b:Landroid/content/Context;

    iget-object v2, p1, Lgj/g;->i:Lgj/n;

    const-string v3, "adid"

    invoke-virtual {v2, v3}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "app_set_id"

    invoke-virtual {v2, v4}, Lgj/n;->a(Ljava/lang/String;)Z

    move-result v2

    const-string v4, "context"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Leb/k;->c:Ljava/lang/Object;

    iput-boolean v3, v0, Leb/k;->a:Z

    iput-boolean v2, v0, Leb/k;->b:Z

    new-instance v1, La3/l0;

    const/16 v2, 0xb

    invoke-direct {v1, v0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Leb/k;->d:Ljava/lang/Object;

    iput-object v0, p0, Lck/d;->x:Leb/k;

    invoke-virtual {p0, p1}, Lck/d;->d(Lgj/g;)V

    return-void
.end method

.method public final c()Lgj/d;
    .locals 1

    iget-object v0, p0, Lck/d;->w:Lgj/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "amplitude"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d(Lgj/g;)V
    .locals 3

    invoke-virtual {p0}, Lck/d;->c()Lgj/d;

    move-result-object p1

    iget-object p1, p1, Lgj/d;->b:La3/p;

    iget-object p1, p1, La3/p;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lck/d;->y:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const-string v1, "S"

    invoke-static {p1, v1, v0}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "randomUUID().toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "R"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Lgj/b;

    const-string v1, "deviceId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lgj/b;->z:Lgj/d;

    invoke-virtual {v0}, Lgj/d;->c()Lqk/c;

    move-result-object v0

    iget-object v0, v0, Lqk/c;->a:Lcd3/g;

    invoke-virtual {v0}, Lcd3/g;->y()Lqk/a;

    move-result-object v1

    iget-object v1, v1, Lqk/a;->a:Ljava/lang/String;

    new-instance v2, Lqk/a;

    invoke-direct {v2, v1, p1}, Lqk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {v0, v2, p1}, Lcd3/g;->I(Lqk/a;I)V

    return-void
.end method

.method public final getType()Lkk/d;
    .locals 1

    sget-object v0, Lkk/d;->w:Lkk/d;

    return-object v0
.end method
