.class public final synthetic Lre1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/education/view/EducationFragment;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lre1/c;->w:I

    iput-object p1, p0, Lre1/c;->x:Lcom/whoop/education/view/EducationFragment;

    iput-object p2, p0, Lre1/c;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lre1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lre1/c;->x:Lcom/whoop/education/view/EducationFragment;

    iget-object v1, p0, Lre1/c;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/education/view/EducationFragment;->B(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lre1/c;->x:Lcom/whoop/education/view/EducationFragment;

    iget-object v1, p0, Lre1/c;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/education/view/EducationFragment;->H(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lre1/c;->x:Lcom/whoop/education/view/EducationFragment;

    iget-object v1, p0, Lre1/c;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/education/view/EducationFragment;->I(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
