.class public final Lqc/t;
.super Landroidx/room/i;
.source "SourceFile"


# virtual methods
.method public final bind(Ltb/c;Ljava/lang/Object;)V
    .locals 7

    check-cast p2, Lqc/q;

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/q;->a:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v2, p2, Lqc/q;->b:Lic/m0;

    invoke-static {v2}, Lj93/l0;->b0(Lic/m0;)I

    move-result v2

    const/4 v3, 0x2

    int-to-long v4, v2

    invoke-interface {p1, v3, v4, v5}, Ltb/c;->p(IJ)V

    const/4 v2, 0x3

    iget-object v3, p2, Lqc/q;->c:Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p2, Lqc/q;->d:Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    sget-object v2, Lic/g;->b:Lic/g;

    iget-object v2, p2, Lqc/q;->e:Lic/g;

    invoke-static {v2}, Lpf/c;->X(Lic/g;)[B

    move-result-object v2

    const/4 v3, 0x5

    invoke-interface {p1, v3, v2}, Ltb/c;->q(I[B)V

    iget-object v2, p2, Lqc/q;->f:Lic/g;

    invoke-static {v2}, Lpf/c;->X(Lic/g;)[B

    move-result-object v2

    const/4 v3, 0x6

    invoke-interface {p1, v3, v2}, Ltb/c;->q(I[B)V

    const/4 v2, 0x7

    iget-wide v3, p2, Lqc/q;->g:J

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    const/16 v2, 0x8

    iget-wide v3, p2, Lqc/q;->h:J

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    const/16 v2, 0x9

    iget-wide v3, p2, Lqc/q;->i:J

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget v2, p2, Lqc/q;->k:I

    int-to-long v2, v2

    const/16 v4, 0xa

    invoke-interface {p1, v4, v2, v3}, Ltb/c;->p(IJ)V

    iget-object v2, p2, Lqc/q;->l:Lic/a;

    const-string v3, "backoffPolicy"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move v2, v3

    :goto_0
    const/16 v4, 0xb

    int-to-long v5, v2

    invoke-interface {p1, v4, v5, v6}, Ltb/c;->p(IJ)V

    const/16 v2, 0xc

    iget-wide v4, p2, Lqc/q;->m:J

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v2, 0xd

    iget-wide v4, p2, Lqc/q;->n:J

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v2, 0xe

    iget-wide v4, p2, Lqc/q;->o:J

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v2, 0xf

    iget-wide v4, p2, Lqc/q;->p:J

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    iget-boolean v2, p2, Lqc/q;->q:Z

    const/16 v4, 0x10

    int-to-long v5, v2

    invoke-interface {p1, v4, v5, v6}, Ltb/c;->p(IJ)V

    iget-object v2, p2, Lqc/q;->r:Lic/i0;

    const-string v4, "policy"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_3

    if-ne v2, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    move v1, v3

    :goto_1
    const/16 v2, 0x11

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget v1, p2, Lqc/q;->s:I

    int-to-long v1, v1

    const/16 v3, 0x12

    invoke-interface {p1, v3, v1, v2}, Ltb/c;->p(IJ)V

    iget v1, p2, Lqc/q;->t:I

    int-to-long v1, v1

    const/16 v3, 0x13

    invoke-interface {p1, v3, v1, v2}, Ltb/c;->p(IJ)V

    const/16 v1, 0x14

    iget-wide v2, p2, Lqc/q;->u:J

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget v1, p2, Lqc/q;->v:I

    int-to-long v1, v1

    const/16 v3, 0x15

    invoke-interface {p1, v3, v1, v2}, Ltb/c;->p(IJ)V

    iget v1, p2, Lqc/q;->w:I

    int-to-long v1, v1

    const/16 v3, 0x16

    invoke-interface {p1, v3, v1, v2}, Ltb/c;->p(IJ)V

    iget-object v1, p2, Lqc/q;->x:Ljava/lang/String;

    const/16 v2, 0x17

    if-nez v1, :cond_4

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_4
    invoke-interface {p1, v2, v1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    iget-object v1, p2, Lqc/q;->y:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    const/16 v2, 0x18

    if-nez v1, :cond_6

    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    :goto_4
    iget-object p2, p2, Lqc/q;->j:Lic/e;

    iget-object v1, p2, Lic/e;->a:Lic/x;

    invoke-static {v1}, Lj93/l0;->Q(Lic/x;)I

    move-result v1

    const/16 v2, 0x19

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget-object v1, p2, Lic/e;->b:Lrc/e;

    invoke-static {v1}, Lj93/l0;->w(Lrc/e;)[B

    move-result-object v1

    const/16 v2, 0x1a

    invoke-interface {p1, v2, v1}, Ltb/c;->q(I[B)V

    iget-boolean v1, p2, Lic/e;->c:Z

    const/16 v2, 0x1b

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget-boolean v1, p2, Lic/e;->d:Z

    const/16 v2, 0x1c

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget-boolean v1, p2, Lic/e;->e:Z

    const/16 v2, 0x1d

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget-boolean v1, p2, Lic/e;->f:Z

    const/16 v2, 0x1e

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    const/16 v1, 0x1f

    iget-wide v2, p2, Lic/e;->g:J

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v1, 0x20

    iget-wide v2, p2, Lic/e;->h:J

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-object p2, p2, Lic/e;->i:Ljava/util/Set;

    invoke-static {p2}, Lj93/l0;->Y(Ljava/util/Set;)[B

    move-result-object p2

    const/16 v1, 0x21

    invoke-interface {p1, v1, p2}, Ltb/c;->q(I[B)V

    const/16 p2, 0x22

    invoke-interface {p1, p2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    return-object v0
.end method
