.class public final synthetic Lbs2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lzy/b;ZLp00/j;ZLt20/n;ZLp00/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbs2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs2/b;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lbs2/b;->x:Z

    iput-object p3, p0, Lbs2/b;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lbs2/b;->y:Z

    iput-object p5, p0, Lbs2/b;->G:Ljava/lang/Object;

    iput-boolean p6, p0, Lbs2/b;->z:Z

    iput-object p7, p0, Lbs2/b;->H:Ll83/e;

    return-void
.end method

.method public synthetic constructor <init>(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lbs2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbs2/b;->x:Z

    iput-object p2, p0, Lbs2/b;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbs2/b;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbs2/b;->G:Ljava/lang/Object;

    iput-boolean p5, p0, Lbs2/b;->y:Z

    iput-boolean p6, p0, Lbs2/b;->z:Z

    iput-object p7, p0, Lbs2/b;->H:Ll83/e;

    return-void
.end method

.method public synthetic constructor <init>(ZLrm/k;ZZLc93/a;Lc93/a;Lc93/a;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lbs2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbs2/b;->x:Z

    iput-object p2, p0, Lbs2/b;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lbs2/b;->y:Z

    iput-boolean p4, p0, Lbs2/b;->z:Z

    iput-object p5, p0, Lbs2/b;->F:Ljava/lang/Object;

    iput-object p6, p0, Lbs2/b;->G:Ljava/lang/Object;

    iput-object p7, p0, Lbs2/b;->H:Ll83/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbs2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbs2/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzy/b;

    iget-object v0, p0, Lbs2/b;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp00/j;

    iget-object v0, p0, Lbs2/b;->G:Ljava/lang/Object;

    check-cast v0, Lt20/n;

    iget-object v1, p0, Lbs2/b;->H:Ll83/e;

    check-cast v1, Lp00/j;

    check-cast p1, Lb30/p3;

    move-object p1, v1

    new-instance v1, Lb30/p3;

    new-instance v4, Lbm2/d0;

    const/16 v3, 0x9

    iget-boolean v6, p0, Lbs2/b;->z:Z

    invoke-direct {v4, v6, v0, p1, v3}, Lbm2/d0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    iget-boolean v7, v0, Lt20/n;->f:Z

    iget-boolean v3, p0, Lbs2/b;->x:Z

    iget-boolean v6, p0, Lbs2/b;->y:Z

    invoke-direct/range {v1 .. v7}, Lb30/p3;-><init>(Lzy/c;ZLc93/a;Lc93/a;ZZ)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Lbs2/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lorg/joda/time/LocalTime;

    iget-object v0, p0, Lbs2/b;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lbs2/b;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lbs2/b;->H:Ll83/e;

    move-object v7, v0

    check-cast v7, Lc93/m;

    move-object v8, p1

    check-cast v8, Landroid/content/Context;

    iget-boolean v1, p0, Lbs2/b;->x:Z

    iget-boolean v5, p0, Lbs2/b;->y:Z

    iget-boolean v6, p0, Lbs2/b;->z:Z

    invoke-static/range {v1 .. v8}, Ll41/d;->d(ZLorg/joda/time/LocalTime;Lp1/c1;Lp1/c1;ZZLc93/m;Landroid/content/Context;)Landroid/widget/TimePicker;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbs2/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrm/k;

    iget-object v0, p0, Lbs2/b;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lbs2/b;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    iget-object v0, p0, Lbs2/b;->H:Ll83/e;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroid/content/Context;

    iget-boolean v1, p0, Lbs2/b;->x:Z

    iget-boolean v3, p0, Lbs2/b;->y:Z

    iget-boolean v4, p0, Lbs2/b;->z:Z

    invoke-static/range {v1 .. v8}, Lbs2/f;->e(ZLrm/k;ZZLc93/a;Lc93/a;Lc93/a;Landroid/content/Context;)Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
