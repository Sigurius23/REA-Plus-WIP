.class public final synthetic Lp90/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lq22/e;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lq22/e;ZLc93/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p10, p0, Lp90/a;->w:I

    iput-object p1, p0, Lp90/a;->x:Lq22/e;

    iput-boolean p2, p0, Lp90/a;->y:Z

    iput-object p3, p0, Lp90/a;->z:Lc93/m;

    iput-object p4, p0, Lp90/a;->E:Ljava/lang/String;

    iput-object p5, p0, Lp90/a;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lp90/a;->G:Lp1/c1;

    iput-object p7, p0, Lp90/a;->H:Lp1/c1;

    iput-object p8, p0, Lp90/a;->I:Lp1/c1;

    iput-object p9, p0, Lp90/a;->J:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lp90/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v9, p0, Lp90/a;->J:Lp1/c1;

    move-object v10, p1

    check-cast v10, Ljava/lang/String;

    iget-object v1, p0, Lp90/a;->x:Lq22/e;

    iget-boolean v2, p0, Lp90/a;->y:Z

    iget-object v3, p0, Lp90/a;->z:Lc93/m;

    iget-object v4, p0, Lp90/a;->E:Ljava/lang/String;

    iget-object v5, p0, Lp90/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lp90/a;->G:Lp1/c1;

    iget-object v7, p0, Lp90/a;->H:Lp1/c1;

    iget-object v8, p0, Lp90/a;->I:Lp1/c1;

    invoke-static/range {v1 .. v10}, Lp90/d;->k(Lq22/e;ZLc93/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v8, p0, Lp90/a;->J:Lp1/c1;

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    iget-object v0, p0, Lp90/a;->x:Lq22/e;

    iget-boolean v1, p0, Lp90/a;->y:Z

    iget-object v2, p0, Lp90/a;->z:Lc93/m;

    iget-object v3, p0, Lp90/a;->E:Ljava/lang/String;

    iget-object v4, p0, Lp90/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lp90/a;->G:Lp1/c1;

    iget-object v6, p0, Lp90/a;->H:Lp1/c1;

    iget-object v7, p0, Lp90/a;->I:Lp1/c1;

    invoke-static/range {v0 .. v9}, Lp90/d;->p(Lq22/e;ZLc93/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v8, p0, Lp90/a;->J:Lp1/c1;

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    iget-object v0, p0, Lp90/a;->x:Lq22/e;

    iget-boolean v1, p0, Lp90/a;->y:Z

    iget-object v2, p0, Lp90/a;->z:Lc93/m;

    iget-object v3, p0, Lp90/a;->E:Ljava/lang/String;

    iget-object v4, p0, Lp90/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lp90/a;->G:Lp1/c1;

    iget-object v6, p0, Lp90/a;->H:Lp1/c1;

    iget-object v7, p0, Lp90/a;->I:Lp1/c1;

    invoke-static/range {v0 .. v9}, Lp90/d;->d(Lq22/e;ZLc93/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
