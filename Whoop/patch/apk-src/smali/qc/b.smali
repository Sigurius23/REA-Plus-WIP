.class public final Lqc/b;
.super Landroidx/room/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqc/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lqc/b;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "statement"

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lqc/v;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/v;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object p2, p2, Lqc/v;->b:Ljava/lang/String;

    invoke-interface {p1, v2, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    :pswitch_0
    check-cast p2, Lqc/q;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/q;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v0, p2, Lqc/q;->b:Lic/m0;

    invoke-static {v0}, Lj93/l0;->b0(Lic/m0;)I

    move-result v0

    int-to-long v4, v0

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    iget-object v0, p2, Lqc/q;->c:Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p2, Lqc/q;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    sget-object v0, Lic/g;->b:Lic/g;

    iget-object v0, p2, Lqc/q;->e:Lic/g;

    invoke-static {v0}, Lpf/c;->X(Lic/g;)[B

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    iget-object v0, p2, Lqc/q;->f:Lic/g;

    invoke-static {v0}, Lpf/c;->X(Lic/g;)[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    const/4 v0, 0x7

    iget-wide v1, p2, Lqc/q;->g:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, Lqc/q;->h:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, Lqc/q;->i:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget v0, p2, Lqc/q;->k:I

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p2, Lqc/q;->l:Lic/a;

    const-string v1, "backoffPolicy"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move v0, v1

    :goto_0
    const/16 v2, 0xb

    int-to-long v4, v0

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v0, 0xc

    iget-wide v4, p2, Lqc/q;->m:J

    invoke-interface {p1, v0, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v0, 0xd

    iget-wide v4, p2, Lqc/q;->n:J

    invoke-interface {p1, v0, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v0, 0xe

    iget-wide v4, p2, Lqc/q;->o:J

    invoke-interface {p1, v0, v4, v5}, Ltb/c;->p(IJ)V

    const/16 v0, 0xf

    iget-wide v4, p2, Lqc/q;->p:J

    invoke-interface {p1, v0, v4, v5}, Ltb/c;->p(IJ)V

    iget-boolean v0, p2, Lqc/q;->q:Z

    const/16 v2, 0x10

    int-to-long v4, v0

    invoke-interface {p1, v2, v4, v5}, Ltb/c;->p(IJ)V

    iget-object v0, p2, Lqc/q;->r:Lic/i0;

    const-string v2, "policy"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    move v3, v1

    :goto_1
    const/16 v0, 0x11

    int-to-long v1, v3

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget v0, p2, Lqc/q;->s:I

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget v0, p2, Lqc/q;->t:I

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/16 v0, 0x14

    iget-wide v1, p2, Lqc/q;->u:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget v0, p2, Lqc/q;->v:I

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget v0, p2, Lqc/q;->w:I

    int-to-long v0, v0

    const/16 v2, 0x16

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p2, Lqc/q;->x:Ljava/lang/String;

    const/16 v1, 0x17

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p2, Lqc/q;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    const/16 v1, 0x18

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_4
    iget-object p2, p2, Lqc/q;->j:Lic/e;

    iget-object v0, p2, Lic/e;->a:Lic/x;

    invoke-static {v0}, Lj93/l0;->Q(Lic/x;)I

    move-result v0

    const/16 v1, 0x19

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-object v0, p2, Lic/e;->b:Lrc/e;

    invoke-static {v0}, Lj93/l0;->w(Lrc/e;)[B

    move-result-object v0

    const/16 v1, 0x1a

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    iget-boolean v0, p2, Lic/e;->c:Z

    const/16 v1, 0x1b

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-boolean v0, p2, Lic/e;->d:Z

    const/16 v1, 0x1c

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-boolean v0, p2, Lic/e;->e:Z

    const/16 v1, 0x1d

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-boolean v0, p2, Lic/e;->f:Z

    const/16 v1, 0x1e

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x1f

    iget-wide v1, p2, Lic/e;->g:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/16 v0, 0x20

    iget-wide v1, p2, Lic/e;->h:J

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget-object p2, p2, Lic/e;->i:Ljava/util/Set;

    invoke-static {p2}, Lj93/l0;->Y(Ljava/util/Set;)[B

    move-result-object p2

    const/16 v0, 0x21

    invoke-interface {p1, v0, p2}, Ltb/c;->q(I[B)V

    return-void

    :pswitch_1
    check-cast p2, Lqc/m;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lqc/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    sget-object v0, Lic/g;->b:Lic/g;

    invoke-virtual {p2}, Lqc/m;->a()Lic/g;

    move-result-object p2

    invoke-static {p2}, Lpf/c;->X(Lic/g;)[B

    move-result-object p2

    invoke-interface {p1, v2, p2}, Ltb/c;->q(I[B)V

    return-void

    :pswitch_2
    check-cast p2, Lqc/k;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/k;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object p2, p2, Lqc/k;->b:Ljava/lang/String;

    invoke-interface {p1, v2, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    :pswitch_3
    check-cast p2, Lqc/h;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/h;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget v0, p2, Lqc/h;->b:I

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    iget p2, p2, Lqc/h;->c:I

    int-to-long v2, p2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    return-void

    :pswitch_4
    check-cast p2, Lqc/d;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lqc/d;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object p2, p2, Lqc/d;->b:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    return-void

    :pswitch_5
    check-cast p2, Lqc/a;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lqc/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-virtual {p2}, Lqc/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lqc/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    return-object v0

    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0

    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0

    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    return-object v0

    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    return-object v0

    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0

    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
