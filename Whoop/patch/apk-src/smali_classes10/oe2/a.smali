.class public final synthetic Loe2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/a0;

.field public final synthetic y:Lpe2/b;


# direct methods
.method public synthetic constructor <init>(Leb/a0;Lpe2/b;I)V
    .locals 0

    iput p3, p0, Loe2/a;->w:I

    iput-object p1, p0, Loe2/a;->x:Leb/a0;

    iput-object p2, p0, Loe2/a;->y:Lpe2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Loe2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loe2/a;->y:Lpe2/b;

    check-cast p1, Lje2/a$e;

    iget-object v1, p0, Loe2/a;->x:Leb/a0;

    invoke-static {v1, v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->A(Leb/a0;Lpe2/b;Lje2/a$e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loe2/a;->y:Lpe2/b;

    check-cast p1, Ltd2/f$f;

    iget-object v1, p0, Loe2/a;->x:Leb/a0;

    invoke-static {v1, v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->y(Leb/a0;Lpe2/b;Ltd2/f$f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Loe2/a;->y:Lpe2/b;

    check-cast p1, Lpd2/b$c;

    iget-object v1, p0, Loe2/a;->x:Leb/a0;

    invoke-static {v1, v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdAboutFragment;->z(Leb/a0;Lpe2/b;Lpd2/b$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
