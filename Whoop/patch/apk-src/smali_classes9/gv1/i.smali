.class public final synthetic Lgv1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lgv1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgv1/i;->x:Ljava/lang/String;

    iput-object p2, p0, Lgv1/i;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lgv1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgv1/i;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lgv1/i;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgv1/i;->w:I

    check-cast p1, Lgv1/l;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgv1/i;->x:Ljava/lang/String;

    iget-object v1, p0, Lgv1/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lgv1/k;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lgv1/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgv1/i;->x:Ljava/lang/String;

    iget-object v1, p0, Lgv1/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lgv1/j;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lgv1/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
