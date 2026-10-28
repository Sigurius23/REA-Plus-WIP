.class public final synthetic Lby1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V
    .locals 0

    iput p4, p0, Lby1/b;->w:I

    iput-object p1, p0, Lby1/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lby1/b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lby1/b;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lby1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lby1/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lby1/b;->z:Ljava/lang/String;

    iget-object v2, p0, Lby1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lek2/b;->c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lby1/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lby1/b;->z:Ljava/lang/String;

    iget-object v2, p0, Lby1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lek2/b;->f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lby1/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lby1/b;->z:Ljava/lang/String;

    iget-object v2, p0, Lby1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lby1/d;->c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
