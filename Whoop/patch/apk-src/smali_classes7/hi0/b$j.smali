.class public Lhi0/b$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;


# direct methods
.method private constructor <init>(J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    .line 4
    const-string v1, "cycleId"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lhi0/b$j;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, Lhi0/e;->G:I

    return v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "cycleId"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "fromFab"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "isAutoPop"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "isFromJournalIntro"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1e

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_3

    :cond_1
    check-cast p1, Lhi0/b$j;

    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "cycleId"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lhi0/b$j;->b()J

    move-result-wide v2

    invoke-virtual {p1}, Lhi0/b$j;->b()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "previousCycleStartTime"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0}, Lhi0/b$j;->i()J

    move-result-wide v2

    invoke-virtual {p1}, Lhi0/b$j;->i()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "previousCycleEndTIme"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0}, Lhi0/b$j;->h()J

    move-result-wide v2

    invoke-virtual {p1}, Lhi0/b$j;->h()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "isFromJournalIntro"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    invoke-virtual {p0}, Lhi0/b$j;->e()Z

    move-result v2

    invoke-virtual {p1}, Lhi0/b$j;->e()Z

    move-result v3

    if-eq v2, v3, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "isAutoPop"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_a

    return v1

    :cond_a
    invoke-virtual {p0}, Lhi0/b$j;->d()Z

    move-result v2

    invoke-virtual {p1}, Lhi0/b$j;->d()Z

    move-result v3

    if-eq v2, v3, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "todayCycleStartTime"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_c

    return v1

    :cond_c
    invoke-virtual {p0}, Lhi0/b$j;->m()J

    move-result-wide v2

    invoke-virtual {p1}, Lhi0/b$j;->m()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_d

    return v1

    :cond_d
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "todayCycleEndTime"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_e

    return v1

    :cond_e
    invoke-virtual {p0}, Lhi0/b$j;->l()J

    move-result-wide v2

    invoke-virtual {p1}, Lhi0/b$j;->l()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_f

    return v1

    :cond_f
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "source"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_10

    return v1

    :cond_10
    invoke-virtual {p0}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {p0}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_0

    :cond_11
    invoke-virtual {p1}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_12

    :goto_0
    return v1

    :cond_12
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "label"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_13

    return v1

    :cond_13
    invoke-virtual {p0}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {p0}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_1

    :cond_14
    invoke-virtual {p1}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_15

    :goto_1
    return v1

    :cond_15
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "newHome"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_16

    return v1

    :cond_16
    invoke-virtual {p0}, Lhi0/b$j;->g()Z

    move-result v2

    invoke-virtual {p1}, Lhi0/b$j;->g()Z

    move-result v3

    if-eq v2, v3, :cond_17

    return v1

    :cond_17
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "fromFab"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_18

    return v1

    :cond_18
    invoke-virtual {p0}, Lhi0/b$j;->c()Z

    move-result v2

    invoke-virtual {p1}, Lhi0/b$j;->c()Z

    move-result v3

    if-eq v2, v3, :cond_19

    return v1

    :cond_19
    iget-object v2, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v3, "requestDate"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_1a

    return v1

    :cond_1a
    invoke-virtual {p0}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {p0}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_2

    :cond_1b
    invoke-virtual {p1}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1c

    :goto_2
    return v1

    :cond_1c
    invoke-virtual {p0}, Lhi0/b$j;->a()I

    move-result v2

    invoke-virtual {p1}, Lhi0/b$j;->a()I

    move-result p1

    if-eq v2, p1, :cond_1d

    return v1

    :cond_1d
    return v0

    :cond_1e
    :goto_3
    return v1
.end method

.method public f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "label"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "newHome"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getArguments()Landroid/os/Bundle;
    .locals 8

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "cycleId"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "previousCycleStartTime"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-wide/16 v3, -0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v2, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :goto_0
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "previousCycleEndTIme"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v2, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :goto_1
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "isFromJournalIntro"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_2
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "isAutoPop"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_3
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "todayCycleStartTime"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v0, v2, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :goto_4
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "todayCycleEndTime"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_5

    :cond_6
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :goto_5
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "source"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "label"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "newHome"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_8

    :cond_9
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_8
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "fromFab"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_9

    :cond_a
    invoke-virtual {v0, v2, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_9
    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v2, "requestDate"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_b
    const-string v1, ""

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "previousCycleEndTIme"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    invoke-virtual {p0}, Lhi0/b$j;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Lhi0/b$j;->b()J

    move-result-wide v2

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->i()J

    move-result-wide v2

    invoke-virtual {p0}, Lhi0/b$j;->i()J

    move-result-wide v5

    ushr-long/2addr v5, v4

    xor-long/2addr v2, v5

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->h()J

    move-result-wide v2

    invoke-virtual {p0}, Lhi0/b$j;->h()J

    move-result-wide v5

    ushr-long/2addr v5, v4

    xor-long/2addr v2, v5

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->e()Z

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    invoke-virtual {p0}, Lhi0/b$j;->d()Z

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->m()J

    move-result-wide v2

    invoke-virtual {p0}, Lhi0/b$j;->m()J

    move-result-wide v5

    ushr-long/2addr v5, v4

    xor-long/2addr v2, v5

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->l()J

    move-result-wide v2

    invoke-virtual {p0}, Lhi0/b$j;->l()J

    move-result-wide v5

    ushr-long v4, v5, v4

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->g()Z

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    invoke-virtual {p0}, Lhi0/b$j;->c()Z

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :cond_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    invoke-virtual {p0}, Lhi0/b$j;->a()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "previousCycleStartTime"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "requestDate"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "source"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public l()J
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "todayCycleEndTime"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public m()J
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "todayCycleStartTime"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public n(Z)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "fromFab"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public o(Z)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "isAutoPop"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Z)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "isFromJournalIntro"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "label"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public r(Z)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "newHome"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public s(J)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "previousCycleEndTIme"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public t(J)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "previousCycleStartTime"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ActionNavToJournal(actionId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lhi0/b$j;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "){cycleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", previousCycleStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", previousCycleEndTIme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->h()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isFromJournalIntro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isAutoPop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", todayCycleStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->m()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", todayCycleEndTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->l()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", newHome="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", fromFab="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requestDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhi0/b$j;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)Lhi0/b$j;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "requestDate"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"requestDate\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(Ljava/lang/String;)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "source"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public w(J)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "todayCycleEndTime"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public x(J)Lhi0/b$j;
    .locals 2

    iget-object v0, p0, Lhi0/b$j;->a:Ljava/util/HashMap;

    const-string v1, "todayCycleStartTime"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
