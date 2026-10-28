.class public final synthetic Loq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/login/InviteCodeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V
    .locals 0

    iput p2, p0, Loq0/c;->w:I

    iput-object p1, p0, Loq0/c;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loq0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loq0/c;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-static {v0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->J(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Loq0/c;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-static {v0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->N(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
