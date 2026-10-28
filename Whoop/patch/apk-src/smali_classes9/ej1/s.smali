.class public final synthetic Lej1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lej1/s;->w:I

    iput-object p1, p0, Lej1/s;->x:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lej1/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lzr1/c;->i(Ljava/util/List;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Lt71/a;->b(Ljava/util/List;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lsq2/a;->b(Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lno0/z0;->b(Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Lio/getstream/chat/android/models/Location;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->c(Ljava/util/List;Lio/getstream/chat/android/models/Location;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lf61/i;->k(Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lej1/s;->x:Ljava/util/List;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lej1/t;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
