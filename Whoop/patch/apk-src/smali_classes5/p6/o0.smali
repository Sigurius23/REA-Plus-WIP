.class public final synthetic Lp6/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp6/s0;

.field public final synthetic y:[I


# direct methods
.method public synthetic constructor <init>(Lp6/s0;[II)V
    .locals 0

    iput p3, p0, Lp6/o0;->w:I

    iput-object p1, p0, Lp6/o0;->x:Lp6/s0;

    iput-object p2, p0, Lp6/o0;->y:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp6/o0;->w:I

    check-cast p1, Lr6/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lr6/m;->s()Lr6/l;

    move-result-object v0

    iget-object v1, p0, Lp6/o0;->x:Lp6/s0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/m;

    invoke-static {v2, v1}, Lr6/m;->n(Lr6/m;Ljava/lang/String;)V

    iget-object v1, p0, Lp6/o0;->y:[I

    invoke-static {v1}, Lm83/n;->U0([I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/m;

    invoke-static {v2, v1}, Lr6/m;->o(Lr6/m;Ljava/lang/Iterable;)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/m;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->n(Lr6/n;Lr6/m;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-static {}, Lr6/c;->s()Lr6/b;

    move-result-object v0

    iget-object v1, p0, Lp6/o0;->x:Lp6/s0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/c;

    invoke-static {v2, v1}, Lr6/c;->n(Lr6/c;Ljava/lang/String;)V

    iget-object v1, p0, Lp6/o0;->y:[I

    invoke-static {v1}, Lm83/n;->U0([I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v2, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v2, Lr6/c;

    invoke-static {v2, v1}, Lr6/c;->o(Lr6/c;Ljava/lang/Iterable;)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/c;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->p(Lr6/n;Lr6/c;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
