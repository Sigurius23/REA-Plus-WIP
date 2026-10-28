.class public final Lh20/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final H:Lv03/h;

.field public final I:Le10/s0;

.field public final J:Ln20/q;

.field public final K:Lv03/h;

.field public final L:Lv03/h;

.field public final M:Lay/w;

.field public final N:Lv03/h;

.field public final w:Lv03/h;

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lv03/e;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/e;Lv03/h;Le10/s0;Ln20/q;Lb20/g;Lv03/h;Lay/w;Lv03/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/l4;->w:Lv03/h;

    iput-object p2, p0, Lh20/l4;->x:Lv03/h;

    iput-object p3, p0, Lh20/l4;->y:Lv03/h;

    iput-object p4, p0, Lh20/l4;->z:Lv03/h;

    iput-object p5, p0, Lh20/l4;->E:Lv03/h;

    iput-object p6, p0, Lh20/l4;->F:Lv03/h;

    iput-object p7, p0, Lh20/l4;->G:Lv03/h;

    iput-object p8, p0, Lh20/l4;->H:Lv03/h;

    iput-object p9, p0, Lh20/l4;->I:Le10/s0;

    iput-object p10, p0, Lh20/l4;->J:Ln20/q;

    iput-object p11, p0, Lh20/l4;->K:Lv03/h;

    iput-object p12, p0, Lh20/l4;->L:Lv03/h;

    iput-object p13, p0, Lh20/l4;->M:Lay/w;

    iput-object p14, p0, Lh20/l4;->N:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lh20/l4;->w:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lh20/w3;

    iget-object v1, v0, Lh20/l4;->x:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lk20/a;

    iget-object v1, v0, Lh20/l4;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, La30/a0;

    iget-object v1, v0, Lh20/l4;->z:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lz20/g;

    iget-object v1, v0, Lh20/l4;->E:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lqy/d;

    iget-object v1, v0, Lh20/l4;->F:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lq83/j;

    iget-object v1, v0, Lh20/l4;->G:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroidx/lifecycle/k1;

    iget-object v1, v0, Lh20/l4;->H:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lh20/x;

    iget-object v1, v0, Lh20/l4;->I:Le10/s0;

    invoke-virtual {v1}, Le10/s0;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Le10/n0;

    iget-object v1, v0, Lh20/l4;->J:Ln20/q;

    invoke-virtual {v1}, Ln20/q;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lzx/o;

    iget-object v1, v0, Lh20/l4;->K:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lb20/f;

    iget-object v1, v0, Lh20/l4;->L:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll20/a;

    sget-object v15, Lw20/a0;->a:Lw20/a0;

    iget-object v1, v0, Lh20/l4;->M:Lay/w;

    invoke-virtual {v1}, Lay/w;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lny/d;

    iget-object v1, v0, Lh20/l4;->N:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    new-instance v2, Lh20/k4;

    invoke-direct/range {v2 .. v17}, Lh20/k4;-><init>(Lh20/w3;Lk20/a;La30/a0;Lz20/g;Lqy/d;Lq83/j;Landroidx/lifecycle/k1;Lh20/x;Le10/n0;Lzx/o;Lb20/f;Ll20/a;Lw20/a0;Lny/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    return-object v2
.end method
