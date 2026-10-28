.class public final synthetic Lnv1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;I)V
    .locals 0

    iput p3, p0, Lnv1/b;->w:I

    iput-object p1, p0, Lnv1/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lnv1/b;->y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lnv1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnv1/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/b;->y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-static {v0, v1}, Lnv1/c;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lnv1/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/b;->y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-static {v0, v1}, Lnv1/c;->i(Lkotlin/jvm/functions/Function1;Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lnv1/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/b;->y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-static {v0, v1}, Lnv1/c;->e(Lkotlin/jvm/functions/Function1;Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lnv1/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/b;->y:Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-static {v0, v1}, Lnv1/c;->f(Lkotlin/jvm/functions/Function1;Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
