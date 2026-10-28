.class public final synthetic Lvo1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lvo1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lvo1/m;->z:Lp1/c1;

    iput-object p4, p0, Lvo1/m;->E:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lvo1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lvo1/m;->z:Lp1/c1;

    iput-object p3, p0, Lvo1/m;->E:Lp1/c1;

    iput-object p4, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lvo1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo1/m;->z:Lp1/c1;

    iput-object p2, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lvo1/m;->E:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lvo1/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/m;->E:Lp1/c1;

    iget-object v1, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lvo1/m;->z:Lp1/c1;

    invoke-static {v2, v1, v3, v0}, Lvp1/h;->f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvo1/m;->z:Lp1/c1;

    iget-object v1, p0, Lvo1/m;->E:Lp1/c1;

    iget-object v2, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1}, Lvp1/h;->J(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvo1/m;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lvo1/m;->E:Lp1/c1;

    iget-object v2, p0, Lvo1/m;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lvo1/m;->z:Lp1/c1;

    invoke-static {v2, v0, v3, v1}, Lvo1/r;->A(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
