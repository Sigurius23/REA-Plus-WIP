.class Lus1/b$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lus1/b;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic a:Lus1/b;


# direct methods
.method public constructor <init>(Lus1/b;)V
    .locals 0

    iput-object p1, p0, Lus1/b$b;->a:Lus1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lvs1/a;)V
    .locals 4

    invoke-virtual {p2}, Lvs1/a;->a()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->t(DI)V

    invoke-virtual {p2}, Lvs1/a;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lus1/b$b;->a:Lus1/b;

    invoke-static {v0}, Lus1/b;->n(Lus1/b;)Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lvs1/a;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x4

    invoke-virtual {p2}, Lvs1/a;->g()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lus1/b$b;->a:Lus1/b;

    invoke-static {v0}, Lus1/b;->o(Lus1/b;)Lvs1/c;

    move-result-object v0

    invoke-virtual {p2}, Lvs1/a;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs1/c;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lvs1/a;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lvs1/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lvs1/a;->h()Z

    move-result v0

    const/4 v1, 0x7

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lvs1/a;->c()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x9

    invoke-virtual {p2}, Lvs1/a;->g()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lvs1/a;

    invoke-virtual {p0, p1, p2}, Lus1/b$b;->a(Ltb/c;Lvs1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `table_labrador_reading_result_data` SET `average_hr` = ?,`classification` = ?,`samples` = ?,`time_stamp` = ?,`symptoms_list` = ?,`notes` = ?,`uploaded` = ?,`deleted` = ? WHERE `time_stamp` = ?"

    return-object v0
.end method
