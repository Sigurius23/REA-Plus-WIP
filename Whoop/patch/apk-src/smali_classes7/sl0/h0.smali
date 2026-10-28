.class public final synthetic Lsl0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/bot/view/AiConversationFragment;

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/h0;->w:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p2, p0, Lsl0/h0;->x:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lxk0/a$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lsl0/h0;->w:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lsl0/h0;->x:Lp1/t2;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment;->I(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lxk0/a$a;Z)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
