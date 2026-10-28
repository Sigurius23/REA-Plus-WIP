.class public final Le00/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final H:Lv03/h;

.field public final I:Lv03/h;

.field public final J:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lng3/o;Lv03/e;Lb10/c;Lp20/i;Lb10/c;Lb10/a1;Lv03/h;Lv03/h;Lv03/h;Lb20/g;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Le00/x;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p2, p0, Le00/x;->x:Lv03/h;

    .line 13
    iput-object p3, p0, Le00/x;->y:Lv03/h;

    .line 14
    iput-object p4, p0, Le00/x;->z:Lv03/h;

    .line 15
    iput-object p5, p0, Le00/x;->E:Lv03/h;

    .line 16
    iput-object p6, p0, Le00/x;->F:Lv03/h;

    .line 17
    iput-object p7, p0, Le00/x;->G:Lv03/h;

    .line 18
    iput-object p8, p0, Le00/x;->H:Lv03/h;

    .line 19
    iput-object p9, p0, Le00/x;->I:Lv03/h;

    .line 20
    iput-object p10, p0, Le00/x;->J:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le00/x;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le00/x;->x:Lv03/h;

    .line 3
    iput-object p2, p0, Le00/x;->y:Lv03/h;

    .line 4
    iput-object p3, p0, Le00/x;->z:Lv03/h;

    .line 5
    iput-object p4, p0, Le00/x;->E:Lv03/h;

    .line 6
    iput-object p5, p0, Le00/x;->F:Lv03/h;

    .line 7
    iput-object p6, p0, Le00/x;->G:Lv03/h;

    .line 8
    iput-object p7, p0, Le00/x;->H:Lv03/h;

    .line 9
    iput-object p8, p0, Le00/x;->I:Lv03/h;

    .line 10
    iput-object p9, p0, Le00/x;->J:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Le00/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le00/x;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    iget-object v0, p0, Le00/x;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Le00/x;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Le00/x;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lb10/d;

    iget-object v0, p0, Le00/x;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb10/c1;

    iget-object v0, p0, Le00/x;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lq83/j;

    iget-object v0, p0, Le00/x;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    iget-object v1, p0, Le00/x;->I:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/util/Locale;

    iget-object v1, p0, Le00/x;->J:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lb20/f;

    const-string v1, "application"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "publishableKeyProvider"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stripeAccountIdProvider"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "requestSurface"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stripeRepository"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "logger"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/j0;->c:Ljava/lang/String;

    new-instance v7, Lab/i0;

    const/16 v11, 0xe

    invoke-direct {v7, v8, v0, v11}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    move-object v0, v7

    new-instance v7, Lg30/g;

    invoke-direct {v7, v0, v1}, Lg30/g;-><init>(Lab/i0;Ljava/lang/String;)V

    new-instance v1, Le00/w;

    invoke-direct/range {v1 .. v10}, Le00/w;-><init>(Landroid/app/Application;Lb10/d;Lc93/a;Lc93/a;Lb10/c1;Lg30/g;Lq83/j;Ljava/util/Locale;Lb20/f;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Le00/x;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    iget-object v0, p0, Le00/x;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lb10/d;

    iget-object v0, p0, Le00/x;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Le00/x;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Le00/x;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb10/c1;

    iget-object v0, p0, Le00/x;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lg30/g;

    iget-object v0, p0, Le00/x;->H:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lq83/j;

    iget-object v0, p0, Le00/x;->I:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Locale;

    iget-object v0, p0, Le00/x;->J:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lb20/f;

    new-instance v1, Le00/w;

    invoke-direct/range {v1 .. v10}, Le00/w;-><init>(Landroid/app/Application;Lb10/d;Lc93/a;Lc93/a;Lb10/c1;Lg30/g;Lq83/j;Ljava/util/Locale;Lb20/f;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
