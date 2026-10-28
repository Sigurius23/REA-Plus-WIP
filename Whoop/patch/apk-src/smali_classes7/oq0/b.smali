.class public final synthetic Loq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/whoop/community/presentation/login/InviteCodeActivity;

.field public final synthetic b:Leq0/c;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loq0/b;->a:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    iput-object p2, p0, Loq0/b;->b:Leq0/c;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Loq0/b;->a:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    iget-object v1, p0, Loq0/b;->b:Leq0/c;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Q(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
