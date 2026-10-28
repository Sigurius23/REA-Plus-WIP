.class public final synthetic Lwm1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lwm1/c;

.field public final synthetic z:Lwm1/b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lwm1/c;Lwm1/b;I)V
    .locals 0

    iput p4, p0, Lwm1/j;->w:I

    iput-object p1, p0, Lwm1/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lwm1/j;->y:Lwm1/c;

    iput-object p3, p0, Lwm1/j;->z:Lwm1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lwm1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwm1/j;->y:Lwm1/c;

    iget-object v1, p0, Lwm1/j;->z:Lwm1/b;

    iget-object v2, p0, Lwm1/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lwm1/k;->b(Lkotlin/jvm/functions/Function1;Lwm1/c;Lwm1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwm1/j;->y:Lwm1/c;

    iget-object v1, p0, Lwm1/j;->z:Lwm1/b;

    iget-object v2, p0, Lwm1/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lwm1/k;->h(Lkotlin/jvm/functions/Function1;Lwm1/c;Lwm1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
