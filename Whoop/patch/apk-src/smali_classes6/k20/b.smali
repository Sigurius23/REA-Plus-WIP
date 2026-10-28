.class public final Lk20/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/d;

.field public final H:Lv03/h;

.field public final I:Lv03/h;

.field public final J:Lv03/h;

.field public final w:Lv03/h;

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/d;Lv03/h;La30/h;Lv03/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk20/b;->w:Lv03/h;

    iput-object p2, p0, Lk20/b;->x:Lv03/h;

    iput-object p3, p0, Lk20/b;->y:Lv03/h;

    iput-object p4, p0, Lk20/b;->z:Lv03/h;

    iput-object p5, p0, Lk20/b;->E:Lv03/h;

    iput-object p6, p0, Lk20/b;->F:Lv03/h;

    iput-object p7, p0, Lk20/b;->G:Lv03/d;

    iput-object p8, p0, Lk20/b;->H:Lv03/h;

    iput-object p9, p0, Lk20/b;->I:Lv03/h;

    iput-object p10, p0, Lk20/b;->J:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lk20/b;->w:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lk20/b;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object v0, p0, Lk20/b;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lyy/j;

    iget-object v0, p0, Lk20/b;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lyy/n;

    iget-object v0, p0, Lk20/b;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb10/b;

    iget-object v0, p0, Lk20/b;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lbz/c;

    iget-object v0, p0, Lk20/b;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lq83/j;

    iget-object v0, p0, Lk20/b;->I:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lbz/i;

    new-instance v1, Lk20/a;

    iget-object v8, p0, Lk20/b;->G:Lv03/d;

    iget-object v11, p0, Lk20/b;->J:Lv03/h;

    invoke-direct/range {v1 .. v11}, Lk20/a;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lyy/j;Lyy/n;Lb10/b;Lbz/c;Lv03/d;Lq83/j;Lbz/i;Lk83/a;)V

    return-object v1
.end method
