.class public final synthetic Lx30/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lx30/h1;->w:I

    iput-object p1, p0, Lx30/h1;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lx30/h1;->w:I

    const-string v1, "it"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lx30/h1;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lzz0/b;

    check-cast p1, Li3/z;

    invoke-static {v3, p1}, Lzz0/g;->b(Lzz0/b;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v3, Lzt2/n;

    check-cast p1, Ln0/q;

    invoke-static {v3, p1}, Lzt2/m;->c(Lzt2/n;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v3, Lvm2/d;

    check-cast p1, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-static {v3, p1}, Lzm2/a;->b(Lvm2/d;Lcom/whoop/appconfiguration/TabConfiguration;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast v3, Lal1/c;

    invoke-static {v3, p1}, Lzk1/a;->d(Lal1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast v3, Lxi1/b;

    invoke-static {v3, p1}, Lzi1/h;->c(Lxi1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v3, Lwd0/b;

    check-cast p1, Lwd0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;->A(Lwd0/b;Lwd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v3, Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;->C(Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast v3, Lw72/f;

    check-cast p1, Lw72/e;

    invoke-static {v3, p1}, Lz72/g;->r(Lw72/f;Lw72/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast v3, Lv72/e;

    check-cast p1, Lv72/d;

    invoke-static {v3, p1}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->y(Lv72/e;Lv72/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v3, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;

    check-cast p1, Lr72/a;

    invoke-static {v3, p1}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->A(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Lr72/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v3, Lv72/c;

    check-cast p1, Lv72/b;

    invoke-static {v3, p1}, Lcom/whoop/sanguine/view/SanguineWaitlistBiomarkerListFragment;->y(Lv72/c;Lv72/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v3, Landroid/graphics/drawable/Drawable;

    check-cast p1, Lk2/e;

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object v0

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v4

    const/16 v1, 0x20

    shr-long/2addr v4, v1

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    float-to-int v1, v1

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int p1, v4

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-int p1, p1

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-static {v0}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v2

    :pswitch_b
    check-cast v3, Lyb3/m;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v3, p1}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v3, Lvb0/b;

    check-cast p1, Lvb0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->B(Lvb0/b;Lvb0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast v3, Lxd3/f;

    check-cast p1, Ljava/io/IOException;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lwd3/h;->a:Ljava/util/TimeZone;

    const/4 p1, 0x1

    iput-boolean p1, v3, Lxd3/f;->K:Z

    return-object v2

    :pswitch_e
    check-cast v3, Luc0/b;

    check-cast p1, Luc0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->A(Luc0/b;Luc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v3, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->B(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v3, Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;

    check-cast p1, Lva0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;->z(Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;Lva0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v3, Lua0/b;

    check-cast p1, Lua0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;->y(Lua0/b;Lua0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v3, Lx90/b;

    check-cast p1, Ltb/a;

    invoke-static {v3, p1}, Lx90/b;->d(Lx90/b;Ltb/a;)Lx90/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v3, Lbc3/k1;

    check-cast p1, Ljava/lang/Throwable;

    const/4 p1, 0x0

    invoke-interface {v3, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-object v2

    :pswitch_14
    check-cast v3, Lx30/i1;

    check-cast p1, Ll40/a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lx30/i1;->d:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
