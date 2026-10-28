.class public final Ln10/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lv03/d;Lv03/d;Lv03/d;Lv03/h;Lv03/h;I)V
    .locals 0

    iput p6, p0, Ln10/v;->w:I

    iput-object p1, p0, Ln10/v;->x:Lv03/h;

    iput-object p2, p0, Ln10/v;->y:Lv03/h;

    iput-object p3, p0, Ln10/v;->z:Lv03/h;

    iput-object p4, p0, Ln10/v;->E:Lv03/h;

    iput-object p5, p0, Ln10/v;->F:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ln10/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/v;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Ln10/v;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Ln10/v;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lb10/c1;

    iget-object v0, p0, Ln10/v;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lqy/d;

    iget-object v0, p0, Ln10/v;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lq83/j;

    new-instance v1, Lv10/o;

    invoke-direct/range {v1 .. v6}, Lv10/o;-><init>(Landroid/content/Context;Lc93/a;Lb10/c1;Lqy/d;Lq83/j;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Ln10/v;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lb20/f;

    new-instance v1, Ln10/u;

    iget-object v2, p0, Ln10/v;->x:Lv03/h;

    iget-object v3, p0, Ln10/v;->y:Lv03/h;

    iget-object v4, p0, Ln10/v;->z:Lv03/h;

    iget-object v6, p0, Ln10/v;->F:Lv03/h;

    invoke-direct/range {v1 .. v6}, Ln10/u;-><init>(Lk83/a;Lk83/a;Lk83/a;Lb20/f;Lk83/a;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
