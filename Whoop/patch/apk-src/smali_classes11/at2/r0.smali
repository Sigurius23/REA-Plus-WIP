.class public final synthetic Lat2/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lys2/e$l;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lys2/e$l;I)V
    .locals 0

    iput p3, p0, Lat2/r0;->w:I

    iput-object p1, p0, Lat2/r0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lat2/r0;->y:Lys2/e$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lat2/r0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/r0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/r0;->y:Lys2/e$l;

    invoke-static {v0, v1, p1}, Lat2/s0;->c(Lkotlin/jvm/functions/Function1;Lys2/e$l;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/r0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/r0;->y:Lys2/e$l;

    invoke-static {v0, v1, p1}, Lat2/s0;->d(Lkotlin/jvm/functions/Function1;Lys2/e$l;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
