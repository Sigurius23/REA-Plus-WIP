.class public final synthetic Lrq0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic w:Lrq0/i;

.field public final synthetic x:I

.field public final synthetic y:Lrq0/k;

.field public final synthetic z:Lcom/whoop/domain/model/teams/TeamUser;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lrq0/j;->w:Lrq0/i;

    iput p4, p0, Lrq0/j;->x:I

    iput-object p2, p0, Lrq0/j;->y:Lrq0/k;

    iput-object p1, p0, Lrq0/j;->z:Lcom/whoop/domain/model/teams/TeamUser;

    iput-object p5, p0, Lrq0/j;->E:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v3, p0, Lrq0/j;->z:Lcom/whoop/domain/model/teams/TeamUser;

    iget-object v4, p0, Lrq0/j;->E:Lc93/a;

    iget-object v0, p0, Lrq0/j;->w:Lrq0/i;

    iget v1, p0, Lrq0/j;->x:I

    iget-object v2, p0, Lrq0/j;->y:Lrq0/k;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lrq0/i$b;->a(Lrq0/i;ILrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lc93/a;Landroid/view/View;)V

    return-void
.end method
