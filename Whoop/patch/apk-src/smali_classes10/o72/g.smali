.class public final synthetic Lo72/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lo72/d;

.field public final synthetic y:Lb72/e;

.field public final synthetic z:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lo72/d;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p7, p0, Lo72/g;->w:I

    iput-object p1, p0, Lo72/g;->x:Lo72/d;

    iput-object p2, p0, Lo72/g;->y:Lb72/e;

    iput-object p3, p0, Lo72/g;->z:Landroid/content/Context;

    iput-object p4, p0, Lo72/g;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lo72/g;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lo72/g;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lo72/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v6, p0, Lo72/g;->G:Lp1/c1;

    move-object v7, p1

    check-cast v7, Lo51/a;

    iget-object v1, p0, Lo72/g;->x:Lo72/d;

    iget-object v2, p0, Lo72/g;->y:Lb72/e;

    iget-object v3, p0, Lo72/g;->z:Landroid/content/Context;

    iget-object v4, p0, Lo72/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lo72/g;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v7}, Lo72/h;->c(Lo72/d;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lo51/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v5, p0, Lo72/g;->G:Lp1/c1;

    move-object v6, p1

    check-cast v6, Lo51/a;

    iget-object v0, p0, Lo72/g;->x:Lo72/d;

    iget-object v1, p0, Lo72/g;->y:Lb72/e;

    iget-object v2, p0, Lo72/g;->z:Landroid/content/Context;

    iget-object v3, p0, Lo72/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lo72/g;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lo72/h;->p(Lo72/d;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lo51/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
