.class public final synthetic Lv90/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Z

.field public final synthetic I:Lc93/a;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc93/a;III)V
    .locals 0

    iput p11, p0, Lv90/m;->w:I

    iput-object p1, p0, Lv90/m;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lv90/m;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lv90/m;->z:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lv90/m;->E:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lv90/m;->F:Ljava/lang/String;

    iput-object p6, p0, Lv90/m;->G:Lcom/whoop/design/util/TextResource;

    iput-boolean p7, p0, Lv90/m;->H:Z

    iput-object p8, p0, Lv90/m;->I:Lc93/a;

    iput p9, p0, Lv90/m;->J:I

    iput p10, p0, Lv90/m;->K:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lv90/m;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lv90/m;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lv90/m;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lv90/m;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lv90/m;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lv90/m;->F:Ljava/lang/String;

    iget-object v6, p0, Lv90/m;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, p0, Lv90/m;->H:Z

    iget-object v8, p0, Lv90/m;->I:Lc93/a;

    iget v9, p0, Lv90/m;->J:I

    iget v10, p0, Lv90/m;->K:I

    invoke-static/range {v1 .. v12}, Lv90/u;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lv90/m;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lv90/m;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lv90/m;->z:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lv90/m;->E:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lv90/m;->F:Ljava/lang/String;

    iget-object v5, p0, Lv90/m;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v6, p0, Lv90/m;->H:Z

    iget-object v7, p0, Lv90/m;->I:Lc93/a;

    iget v8, p0, Lv90/m;->J:I

    iget v9, p0, Lv90/m;->K:I

    invoke-static/range {v0 .. v11}, Lv90/n;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
