.class public final synthetic Le90/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Le90/d;

.field public final synthetic y:Le90/h;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Le90/d;Le90/h;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p8, p0, Le90/f;->w:I

    iput-object p1, p0, Le90/f;->x:Le90/d;

    iput-object p2, p0, Le90/f;->y:Le90/h;

    iput-object p3, p0, Le90/f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Le90/f;->E:Lp1/c1;

    iput-object p5, p0, Le90/f;->F:Lp1/c1;

    iput-object p6, p0, Le90/f;->G:Lp1/c1;

    iput-object p7, p0, Le90/f;->H:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Le90/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v7, p0, Le90/f;->H:Lp1/c1;

    move-object v8, p1

    check-cast v8, Le90/a;

    iget-object v1, p0, Le90/f;->x:Le90/d;

    iget-object v2, p0, Le90/f;->y:Le90/h;

    iget-object v3, p0, Le90/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Le90/f;->E:Lp1/c1;

    iget-object v5, p0, Le90/f;->F:Lp1/c1;

    iget-object v6, p0, Le90/f;->G:Lp1/c1;

    invoke-static/range {v1 .. v8}, Le90/g;->a(Le90/d;Le90/h;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Le90/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v6, p0, Le90/f;->H:Lp1/c1;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object v0, p0, Le90/f;->x:Le90/d;

    iget-object v1, p0, Le90/f;->y:Le90/h;

    iget-object v2, p0, Le90/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Le90/f;->E:Lp1/c1;

    iget-object v4, p0, Le90/f;->F:Lp1/c1;

    iget-object v5, p0, Le90/f;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Le90/g;->g(Le90/d;Le90/h;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
