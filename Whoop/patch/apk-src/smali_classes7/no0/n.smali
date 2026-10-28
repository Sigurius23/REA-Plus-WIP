.class public final synthetic Lno0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/e;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ll83/e;I)V
    .locals 0

    .line 1
    iput p3, p0, Lno0/n;->w:I

    iput-object p1, p0, Lno0/n;->y:Ljava/lang/Object;

    iput-object p2, p0, Lno0/n;->x:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lno0/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno0/n;->x:Ll83/e;

    iput-object p2, p0, Lno0/n;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno0/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/n;->y:Ljava/lang/Object;

    check-cast v0, Llo0/d0;

    iget-object v1, p0, Lno0/n;->x:Ll83/e;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lno0/l0;->k(Llo0/d0;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/n;->x:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/n;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, v0, p1, p2}, Lno0/g0;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lno0/n;->y:Ljava/lang/Object;

    check-cast v0, Llo0/f;

    iget-object v1, p0, Lno0/n;->x:Ll83/e;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lno0/p;->a(Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
