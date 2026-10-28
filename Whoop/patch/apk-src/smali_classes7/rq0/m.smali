.class public final synthetic Lrq0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lcom/whoop/community/presentation/teams/TeamCreateActivity;


# direct methods
.method public synthetic constructor <init>(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrq0/m;->w:Z

    iput-object p2, p0, Lrq0/m;->x:Lcom/whoop/community/presentation/teams/TeamCreateActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-boolean v0, p0, Lrq0/m;->w:Z

    iget-object v1, p0, Lrq0/m;->x:Lcom/whoop/community/presentation/teams/TeamCreateActivity;

    invoke-static {v0, v1, p1}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->A(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;Landroid/view/View;)V

    return-void
.end method
