.class public final synthetic Lev2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lev2/f;->w:I

    iput-object p1, p0, Lev2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lev2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, p1}, Lev2/u;->s(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lev2/u;->U(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lev2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, p1}, Lev2/n;->m(Lkotlin/jvm/functions/Function1;Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
