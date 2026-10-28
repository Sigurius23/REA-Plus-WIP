.class public final synthetic Lrq0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/c;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/c;I)V
    .locals 0

    iput p2, p0, Lrq0/t;->w:I

    iput-object p1, p0, Lrq0/t;->x:Lcom/whoop/community/presentation/teams/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/t;->x:Lcom/whoop/community/presentation/teams/c;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/c;->T(Lcom/whoop/community/presentation/teams/c;Landroid/graphics/Bitmap;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lrq0/t;->x:Lcom/whoop/community/presentation/teams/c;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/c;->V(Lcom/whoop/community/presentation/teams/c;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
