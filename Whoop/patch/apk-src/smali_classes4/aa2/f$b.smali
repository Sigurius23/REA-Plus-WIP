.class Laa2/f$b;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa2/f;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Laa2/f;


# direct methods
.method public constructor <init>(Laa2/f;)V
    .locals 0

    iput-object p1, p0, Laa2/f$b;->a:Laa2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Laa2/i;)V
    .locals 3

    invoke-virtual {p2}, Laa2/i;->f()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Laa2/f$b;->a:Laa2/f;

    invoke-static {v0}, Laa2/f;->q(Laa2/f;)Laa2/b;

    move-result-object v0

    invoke-virtual {p2}, Laa2/i;->d()Lcom/whoop/domain/model/Gender;

    move-result-object v1

    invoke-virtual {v0, v1}, Laa2/b;->a(Lcom/whoop/domain/model/Gender;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Laa2/i;->e()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->t(DI)V

    invoke-virtual {p2}, Laa2/i;->l()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->t(DI)V

    iget-object v0, p0, Laa2/f$b;->a:Laa2/f;

    invoke-static {v0}, Laa2/f;->r(Laa2/f;)Laa2/c;

    move-result-object v0

    invoke-virtual {p2}, Laa2/i;->a()Lorg/joda/time/LocalDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Laa2/c;->a(Lorg/joda/time/LocalDate;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Laa2/i;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Laa2/i;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p0, Laa2/f$b;->a:Laa2/f;

    invoke-static {v0}, Laa2/f;->s(Laa2/f;)Laa2/d;

    move-result-object v0

    invoke-virtual {p2}, Laa2/i;->k()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    invoke-virtual {v0, v1}, Laa2/d;->a(Lcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    iget-object v0, p0, Laa2/f$b;->a:Laa2/f;

    invoke-static {v0}, Laa2/f;->p(Laa2/f;)Laa2/a;

    move-result-object v0

    invoke-virtual {p2}, Laa2/i;->c()Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v1

    invoke-virtual {v0, v1}, Laa2/a;->a(Lcom/whoop/domain/model/FitnessLevel;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Laa2/i;->g()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Laa2/i;->h()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Laa2/i;->i()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Laa2/i;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Laa2/i;->b()Z

    move-result p2

    const/16 v0, 0xc

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laa2/i;

    invoke-virtual {p0, p1, p2}, Laa2/f$b;->a(Ltb/c;Laa2/i;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_user_profile` (`id`,`gender`,`height`,`weight`,`birthday`,`time_zone_offset`,`unit_system`,`fitness_level`,`max_heart_rate`,`min_heart_rate`,`physiological_baseline`,`can_upload_data`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
