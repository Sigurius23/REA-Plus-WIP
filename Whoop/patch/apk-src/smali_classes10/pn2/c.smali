.class public final synthetic Lpn2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Leb/u0;

.field public final synthetic z:Landroidx/fragment/app/r0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Leb/u0;Landroidx/fragment/app/r0;I)V
    .locals 0

    iput p4, p0, Lpn2/c;->w:I

    iput-object p1, p0, Lpn2/c;->x:Ljava/lang/String;

    iput-object p2, p0, Lpn2/c;->y:Leb/u0;

    iput-object p3, p0, Lpn2/c;->z:Landroidx/fragment/app/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lpn2/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lpn2/c;->x:Ljava/lang/String;

    iget-object v2, p0, Lpn2/c;->y:Leb/u0;

    iget-object v3, p0, Lpn2/c;->z:Landroidx/fragment/app/r0;

    invoke-static/range {v1 .. v6}, Lcom/whoop/universalcheckout/features/a;->j(Ljava/lang/String;Leb/u0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lpn2/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lpn2/c;->y:Leb/u0;

    iget-object v2, p0, Lpn2/c;->z:Landroidx/fragment/app/r0;

    invoke-static/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/a;->d(Ljava/lang/String;Leb/u0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
