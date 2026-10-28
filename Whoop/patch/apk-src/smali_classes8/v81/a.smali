.class public final synthetic Lv81/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILc93/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lv81/a;->w:I

    iput-object p5, p0, Lv81/a;->x:Lp1/c1;

    iput-object p2, p0, Lv81/a;->y:Lc93/m;

    iput-object p3, p0, Lv81/a;->z:Ljava/lang/Object;

    iput-object p6, p0, Lv81/a;->E:Lp1/c1;

    iput-object p4, p0, Lv81/a;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lv81/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv81/a;->E:Lp1/c1;

    iget-object v1, p0, Lv81/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv81/a;->x:Lp1/c1;

    iget-object v3, p0, Lv81/a;->y:Lc93/m;

    iget-object v4, p0, Lv81/a;->z:Ljava/lang/Object;

    invoke-static {v2, v3, v4, v0, v1}, Lv81/c;->d(Lp1/c1;Lc93/m;Ljava/lang/Object;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lv81/a;->E:Lp1/c1;

    iget-object v1, p0, Lv81/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv81/a;->x:Lp1/c1;

    iget-object v3, p0, Lv81/a;->y:Lc93/m;

    iget-object v4, p0, Lv81/a;->z:Ljava/lang/Object;

    invoke-static {v2, v3, v4, v0, v1}, Lv81/c;->f(Lp1/c1;Lc93/m;Ljava/lang/Object;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
