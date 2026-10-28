.class public final synthetic Lbs1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lf0/r1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lf0/r1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lbs1/o;->w:I

    iput-object p1, p0, Lbs1/o;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbs1/o;->y:Lf0/r1;

    iput-object p3, p0, Lbs1/o;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbs1/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbs1/o;->z:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    iget-object v1, p0, Lbs1/o;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lbs1/o;->y:Lf0/r1;

    invoke-static {v1, v2, v0, p1}, Lbs1/c0;->J(Lkotlin/jvm/functions/Function1;Lf0/r1;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lbs1/o;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/o;->y:Lf0/r1;

    iget-object v2, p0, Lbs1/o;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lbs1/c0;->L(Lkotlin/jvm/functions/Function1;Lf0/r1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
