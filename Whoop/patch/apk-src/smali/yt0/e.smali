.class public final synthetic Lyt0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lyt0/f;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;II)V
    .locals 0

    iput p8, p0, Lyt0/e;->w:I

    iput-object p1, p0, Lyt0/e;->x:Lyt0/f;

    iput-wide p2, p0, Lyt0/e;->y:J

    iput-wide p4, p0, Lyt0/e;->z:J

    iput-object p6, p0, Lyt0/e;->E:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    iput p7, p0, Lyt0/e;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lyt0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v7, p0, Lyt0/e;->F:I

    move-object v8, p1

    check-cast v8, Ltb/a;

    iget-object v1, p0, Lyt0/e;->x:Lyt0/f;

    iget-wide v2, p0, Lyt0/e;->y:J

    iget-wide v4, p0, Lyt0/e;->z:J

    iget-object v6, p0, Lyt0/e;->E:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    invoke-static/range {v1 .. v8}, Lyt0/f;->i(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v6, p0, Lyt0/e;->F:I

    move-object v7, p1

    check-cast v7, Ltb/a;

    iget-object v0, p0, Lyt0/e;->x:Lyt0/f;

    iget-wide v1, p0, Lyt0/e;->y:J

    iget-wide v3, p0, Lyt0/e;->z:J

    iget-object v5, p0, Lyt0/e;->E:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    invoke-static/range {v0 .. v7}, Lyt0/f;->k(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
